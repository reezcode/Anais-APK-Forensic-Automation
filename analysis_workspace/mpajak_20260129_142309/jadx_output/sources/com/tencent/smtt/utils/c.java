package com.tencent.smtt.utils;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes7.dex */
public class c implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f2319a;

    /* renamed from: b, reason: collision with root package name */
    private final File f2320b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f2321c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2322d;

    public c(File file) {
        this.f2321c = new byte[8];
        this.f2320b = file;
        this.f2319a = new RandomAccessFile(file, "r");
    }

    public c(String str) {
        this(new File(str));
    }

    public final int a(byte[] bArr) {
        return this.f2319a.read(bArr);
    }

    public final int a(char[] cArr) {
        byte[] bArr = new byte[cArr.length];
        int read = this.f2319a.read(bArr);
        for (int i5 = 0; i5 < cArr.length; i5++) {
            cArr[i5] = (char) bArr[i5];
        }
        return read;
    }

    public final short a() {
        short readShort = this.f2319a.readShort();
        if (!this.f2322d) {
            return readShort;
        }
        return (short) (((readShort & 65280) >>> 8) | ((readShort & 255) << 8));
    }

    public void a(long j5) {
        this.f2319a.seek(j5);
    }

    public void a(boolean z4) {
        this.f2322d = z4;
    }

    public final int b() {
        int readInt = this.f2319a.readInt();
        if (!this.f2322d) {
            return readInt;
        }
        return ((readInt & (-16777216)) >>> 24) | ((readInt & 255) << 24) | ((65280 & readInt) << 8) | ((16711680 & readInt) >>> 8);
    }

    public final long c() {
        if (!this.f2322d) {
            return this.f2319a.readLong();
        }
        this.f2319a.readFully(this.f2321c, 0, 8);
        byte[] bArr = this.f2321c;
        return (bArr[0] & 255) | (bArr[7] << 56) | ((bArr[6] & 255) << 48) | ((bArr[5] & 255) << 40) | ((bArr[4] & 255) << 32) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.f2319a.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }
}
