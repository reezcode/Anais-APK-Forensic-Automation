package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final OutputStream f607b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f608c;

    /* renamed from: d, reason: collision with root package name */
    public s.b f609d;

    /* renamed from: e, reason: collision with root package name */
    public int f610e;

    public c(@NonNull OutputStream outputStream, @NonNull s.b bVar) {
        this.f607b = outputStream;
        this.f609d = bVar;
        this.f608c = (byte[]) bVar.b(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            flush();
            this.f607b.close();
            byte[] bArr = this.f608c;
            if (bArr != null) {
                this.f609d.put(bArr);
                this.f608c = null;
            }
        } catch (Throwable th) {
            this.f607b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i5 = this.f610e;
        if (i5 > 0) {
            this.f607b.write(this.f608c, 0, i5);
            this.f610e = 0;
        }
        this.f607b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i5) {
        byte[] bArr = this.f608c;
        int i6 = this.f610e;
        int i7 = i6 + 1;
        this.f610e = i7;
        bArr[i6] = (byte) i5;
        if (i7 != bArr.length || i7 <= 0) {
            return;
        }
        this.f607b.write(bArr, 0, i7);
        this.f610e = 0;
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(@NonNull byte[] bArr, int i5, int i6) {
        int i7 = 0;
        do {
            int i8 = i6 - i7;
            int i9 = i5 + i7;
            int i10 = this.f610e;
            if (i10 == 0 && i8 >= this.f608c.length) {
                this.f607b.write(bArr, i9, i8);
                return;
            }
            int min = Math.min(i8, this.f608c.length - i10);
            System.arraycopy(bArr, i9, this.f608c, this.f610e, min);
            int i11 = this.f610e + min;
            this.f610e = i11;
            i7 += min;
            byte[] bArr2 = this.f608c;
            if (i11 == bArr2.length && i11 > 0) {
                this.f607b.write(bArr2, 0, i11);
                this.f610e = 0;
            }
        } while (i7 < i6);
    }
}
