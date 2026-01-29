package org.apache.commons.io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* loaded from: classes13.dex */
public class ObservableInputStream extends ProxyInputStream {
    private final List<Observer> observers;

    /* loaded from: classes24.dex */
    public static abstract class Observer {
        public void closed() {
        }

        public void data(int i5) {
        }

        public void data(byte[] bArr, int i5, int i6) {
        }

        public void error(IOException iOException) {
            throw iOException;
        }

        public void finished() {
        }
    }

    public ObservableInputStream(InputStream inputStream) {
        this(inputStream, new ArrayList());
    }

    private ObservableInputStream(InputStream inputStream, List<Observer> list) {
        super(inputStream);
        this.observers = list;
    }

    public ObservableInputStream(InputStream inputStream, Observer... observerArr) {
        this(inputStream, (List<Observer>) Arrays.asList(observerArr));
    }

    private void notify(byte[] bArr, int i5, int i6, IOException iOException) {
        if (iOException != null) {
            noteError(iOException);
            throw iOException;
        }
        if (i6 == -1) {
            noteFinished();
        } else if (i6 > 0) {
            noteDataBytes(bArr, i5, i6);
        }
    }

    public void add(Observer observer) {
        this.observers.add(observer);
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
            e = null;
        } catch (IOException e5) {
            e = e5;
        }
        if (e == null) {
            noteClosed();
        } else {
            noteError(e);
        }
    }

    public void consume() {
        while (read(IOUtils.byteArray()) != -1) {
        }
    }

    public List<Observer> getObservers() {
        return this.observers;
    }

    public void noteClosed() {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().closed();
        }
    }

    public void noteDataByte(int i5) {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(i5);
        }
    }

    public void noteDataBytes(byte[] bArr, int i5, int i6) {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().data(bArr, i5, i6);
        }
    }

    public void noteError(IOException iOException) {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().error(iOException);
        }
    }

    public void noteFinished() {
        Iterator<Observer> it = getObservers().iterator();
        while (it.hasNext()) {
            it.next().finished();
        }
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i5;
        try {
            i5 = super.read();
            e = null;
        } catch (IOException e5) {
            e = e5;
            i5 = 0;
        }
        if (e != null) {
            noteError(e);
            throw e;
        }
        if (i5 == -1) {
            noteFinished();
        } else {
            noteDataByte(i5);
        }
        return i5;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        int i5;
        try {
            i5 = super.read(bArr);
            e = null;
        } catch (IOException e5) {
            e = e5;
            i5 = 0;
        }
        notify(bArr, 0, i5, e);
        return i5;
    }

    @Override // org.apache.commons.io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) {
        int i7;
        try {
            i7 = super.read(bArr, i5, i6);
            e = null;
        } catch (IOException e5) {
            e = e5;
            i7 = 0;
        }
        notify(bArr, i5, i7, e);
        return i7;
    }

    public void remove(Observer observer) {
        this.observers.remove(observer);
    }

    public void removeAllObservers() {
        this.observers.clear();
    }
}
