package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes18.dex */
public final class g extends FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f614d = {-1, ExifInterface.MARKER_APP1, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final int f615e = 31;

    /* renamed from: b, reason: collision with root package name */
    public final byte f616b;

    /* renamed from: c, reason: collision with root package name */
    public int f617c;

    public g(InputStream inputStream, int i5) {
        super(inputStream);
        if (i5 < -1 || i5 > 8) {
            throw new IllegalArgumentException(androidx.appcompat.widget.a.g("Cannot add invalid orientation: ", i5));
        }
        this.f616b = (byte) i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i5;
        int i6 = this.f617c;
        int read = (i6 < 2 || i6 > (i5 = f615e)) ? super.read() : i6 == i5 ? this.f616b : f614d[i6 - 2] & 255;
        if (read != -1) {
            this.f617c++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i5, int i6) {
        int i7;
        int i8 = this.f617c;
        int i9 = f615e;
        if (i8 > i9) {
            i7 = super.read(bArr, i5, i6);
        } else if (i8 == i9) {
            bArr[i5] = this.f616b;
            i7 = 1;
        } else if (i8 < 2) {
            i7 = super.read(bArr, i5, 2 - i8);
        } else {
            int min = Math.min(i9 - i8, i6);
            System.arraycopy(f614d, this.f617c - 2, bArr, i5, min);
            i7 = min;
        }
        if (i7 > 0) {
            this.f617c += i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) {
        long skip = super.skip(j5);
        if (skip > 0) {
            this.f617c = (int) (this.f617c + skip);
        }
        return skip;
    }
}
