package org.apache.commons.io.input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* loaded from: classes11.dex */
public class Tailer implements Runnable {
    private static final Charset DEFAULT_CHARSET = Charset.defaultCharset();
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final Charset charset;
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file, Charset charset, TailerListener tailerListener, long j5, boolean z4, boolean z5, int i5) {
        this.run = true;
        this.file = file;
        this.delayMillis = j5;
        this.end = z4;
        this.inbuf = IOUtils.byteArray(i5);
        this.listener = tailerListener;
        tailerListener.init(this);
        this.reOpen = z5;
        this.charset = charset;
    }

    public Tailer(File file, TailerListener tailerListener) {
        this(file, tailerListener, 1000L);
    }

    public Tailer(File file, TailerListener tailerListener, long j5) {
        this(file, tailerListener, j5, false);
    }

    public Tailer(File file, TailerListener tailerListener, long j5, boolean z4) {
        this(file, tailerListener, j5, z4, 8192);
    }

    public Tailer(File file, TailerListener tailerListener, long j5, boolean z4, int i5) {
        this(file, tailerListener, j5, z4, false, i5);
    }

    public Tailer(File file, TailerListener tailerListener, long j5, boolean z4, boolean z5) {
        this(file, tailerListener, j5, z4, z5, 8192);
    }

    public Tailer(File file, TailerListener tailerListener, long j5, boolean z4, boolean z5, int i5) {
        this(file, DEFAULT_CHARSET, tailerListener, j5, z4, z5, i5);
    }

    public static Tailer create(File file, Charset charset, TailerListener tailerListener, long j5, boolean z4, boolean z5, int i5) {
        Tailer tailer = new Tailer(file, charset, tailerListener, j5, z4, z5, i5);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    public static Tailer create(File file, TailerListener tailerListener) {
        return create(file, tailerListener, 1000L, false);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j5) {
        return create(file, tailerListener, j5, false);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j5, boolean z4) {
        return create(file, tailerListener, j5, z4, 8192);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j5, boolean z4, int i5) {
        return create(file, tailerListener, j5, z4, false, i5);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j5, boolean z4, boolean z5) {
        return create(file, tailerListener, j5, z4, z5, 8192);
    }

    public static Tailer create(File file, TailerListener tailerListener, long j5, boolean z4, boolean z5, int i5) {
        return create(file, DEFAULT_CHARSET, tailerListener, j5, z4, z5, i5);
    }

    private long readLines(RandomAccessFile randomAccessFile) {
        int read;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(64);
        try {
            long filePointer = randomAccessFile.getFilePointer();
            long j5 = filePointer;
            boolean z4 = false;
            while (getRun() && (read = randomAccessFile.read(this.inbuf)) != -1) {
                for (int i5 = 0; i5 < read; i5++) {
                    byte b5 = this.inbuf[i5];
                    if (b5 == 10) {
                        this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                        byteArrayOutputStream.reset();
                        filePointer = i5 + j5 + 1;
                        z4 = false;
                    } else if (b5 != 13) {
                        if (z4) {
                            this.listener.handle(new String(byteArrayOutputStream.toByteArray(), this.charset));
                            byteArrayOutputStream.reset();
                            filePointer = i5 + j5 + 1;
                            z4 = false;
                        }
                        byteArrayOutputStream.write(b5);
                    } else {
                        if (z4) {
                            byteArrayOutputStream.write(13);
                        }
                        z4 = true;
                    }
                }
                j5 = randomAccessFile.getFilePointer();
            }
            randomAccessFile.seek(filePointer);
            TailerListener tailerListener = this.listener;
            if (tailerListener instanceof TailerListenerAdapter) {
                ((TailerListenerAdapter) tailerListener).endOfFileReached();
            }
            byteArrayOutputStream.close();
            return filePointer;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public long getDelay() {
        return this.delayMillis;
    }

    public File getFile() {
        return this.file;
    }

    public boolean getRun() {
        return this.run;
    }

    @Override // java.lang.Runnable
    public void run() {
        RandomAccessFile randomAccessFile;
        long readLines;
        File file;
        RandomAccessFile randomAccessFile2 = null;
        long j5 = 0;
        long j6 = 0;
        while (getRun() && randomAccessFile2 == null) {
            try {
                try {
                    try {
                        randomAccessFile2 = new RandomAccessFile(this.file, RAF_MODE);
                    } catch (FileNotFoundException unused) {
                        this.listener.fileNotFound();
                    }
                    if (randomAccessFile2 == null) {
                        Thread.sleep(this.delayMillis);
                    } else {
                        j6 = this.end ? this.file.length() : 0L;
                        j5 = FileUtils.lastModified(this.file);
                        randomAccessFile2.seek(j6);
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (InterruptedException e5) {
                e = e5;
            } catch (Exception e6) {
                e = e6;
            }
        }
        while (getRun()) {
            boolean isFileNewer = FileUtils.isFileNewer(this.file, j5);
            long length = this.file.length();
            if (length < j6) {
                this.listener.fileRotated();
                try {
                    randomAccessFile = new RandomAccessFile(this.file, RAF_MODE);
                    try {
                        try {
                            readLines(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                if (randomAccessFile2 != null) {
                                    try {
                                        randomAccessFile2.close();
                                    } catch (Throwable th4) {
                                        try {
                                            th.addSuppressed(th4);
                                        } catch (FileNotFoundException unused2) {
                                            randomAccessFile2 = randomAccessFile;
                                            this.listener.fileNotFound();
                                            Thread.sleep(this.delayMillis);
                                        }
                                    }
                                }
                                throw th3;
                            }
                        }
                    } catch (IOException e7) {
                        this.listener.handle(e7);
                    }
                    if (randomAccessFile2 != null) {
                        try {
                            try {
                                randomAccessFile2.close();
                            } catch (FileNotFoundException unused3) {
                                j6 = 0;
                                randomAccessFile2 = randomAccessFile;
                                this.listener.fileNotFound();
                                Thread.sleep(this.delayMillis);
                            }
                        } catch (InterruptedException e8) {
                            e = e8;
                            randomAccessFile2 = randomAccessFile;
                            Thread.currentThread().interrupt();
                            this.listener.handle(e);
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e9) {
                                    e = e9;
                                    this.listener.handle(e);
                                    stop();
                                }
                            }
                            stop();
                        } catch (Exception e10) {
                            e = e10;
                            randomAccessFile2 = randomAccessFile;
                            this.listener.handle(e);
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e11) {
                                    e = e11;
                                    this.listener.handle(e);
                                    stop();
                                }
                            }
                            stop();
                        } catch (Throwable th5) {
                            th = th5;
                            randomAccessFile2 = randomAccessFile;
                            if (randomAccessFile2 != null) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e12) {
                                    this.listener.handle(e12);
                                }
                            }
                            stop();
                            throw th;
                        }
                    }
                    j6 = 0;
                    randomAccessFile2 = randomAccessFile;
                } catch (Throwable th6) {
                    th = th6;
                    randomAccessFile = randomAccessFile2;
                }
            } else {
                if (length > j6) {
                    readLines = readLines(randomAccessFile2);
                    file = this.file;
                } else {
                    if (isFileNewer) {
                        randomAccessFile2.seek(0L);
                        readLines = readLines(randomAccessFile2);
                        file = this.file;
                    }
                    if (this.reOpen && randomAccessFile2 != null) {
                        randomAccessFile2.close();
                    }
                    Thread.sleep(this.delayMillis);
                    if (getRun() && this.reOpen) {
                        randomAccessFile = new RandomAccessFile(this.file, RAF_MODE);
                        randomAccessFile.seek(j6);
                        randomAccessFile2 = randomAccessFile;
                    }
                }
                long j7 = readLines;
                j5 = FileUtils.lastModified(file);
                j6 = j7;
                if (this.reOpen) {
                    randomAccessFile2.close();
                }
                Thread.sleep(this.delayMillis);
                if (getRun()) {
                    randomAccessFile = new RandomAccessFile(this.file, RAF_MODE);
                    randomAccessFile.seek(j6);
                    randomAccessFile2 = randomAccessFile;
                }
            }
        }
        if (randomAccessFile2 != null) {
            try {
                randomAccessFile2.close();
            } catch (IOException e13) {
                e = e13;
                this.listener.handle(e);
                stop();
            }
        }
        stop();
    }

    public void stop() {
        this.run = false;
    }
}
