package org.apache.commons.io.output;

import java.io.OutputStream;
import java.lang.Appendable;

/* loaded from: classes14.dex */
public class AppendableOutputStream<T extends Appendable> extends OutputStream {
    private final T appendable;

    public AppendableOutputStream(T t4) {
        this.appendable = t4;
    }

    public T getAppendable() {
        return this.appendable;
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        this.appendable.append((char) i5);
    }
}
