package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.os.Build;
import android.system.Os;
import androidx.annotation.IntRange;
import java.io.FileDescriptor;
import java.io.IOException;

/* loaded from: classes4.dex */
final class GifInfoHandle {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4678b = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile long f4679a;

    static {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            if (k4.e.f3910a == null) {
                try {
                    k4.e.f3910a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                } catch (Exception e5) {
                    throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e5);
                }
            }
            new l4.f().b(k4.e.f3910a);
        }
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        int createTempNativeFileDescriptor;
        try {
            FileDescriptor fileDescriptor = assetFileDescriptor.getFileDescriptor();
            long startOffset = assetFileDescriptor.getStartOffset();
            if (Build.VERSION.SDK_INT > 27) {
                try {
                    createTempNativeFileDescriptor = createTempNativeFileDescriptor();
                    Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
                } finally {
                }
            } else {
                createTempNativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, false);
            }
            this.f4679a = openNativeFileDescriptor(createTempNativeFileDescriptor, startOffset);
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public GifInfoHandle(String str) {
        this.f4679a = openFile(str);
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z4);

    private static native void free(long j5);

    private static native int getCurrentFrameIndex(long j5);

    private static native int getCurrentLoop(long j5);

    private static native int getCurrentPosition(long j5);

    private static native int getDuration(long j5);

    private static native int getHeight(long j5);

    private static native int getLoopCount(long j5);

    private static native int getNativeErrorCode(long j5);

    private static native int getNumberOfFrames(long j5);

    private static native long[] getSavedState(long j5);

    private static native int getWidth(long j5);

    private static native boolean isOpaque(long j5);

    public static native long openFile(String str);

    public static native long openNativeFileDescriptor(int i5, long j5);

    private static native long renderFrame(long j5, Bitmap bitmap);

    private static native boolean reset(long j5);

    private static native long restoreRemainder(long j5);

    private static native int restoreSavedState(long j5, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j5);

    private static native void seekToTime(long j5, int i5, Bitmap bitmap);

    private static native void setLoopCount(long j5, char c5);

    public final synchronized int a() {
        return getCurrentFrameIndex(this.f4679a);
    }

    public final synchronized int b() {
        return getCurrentLoop(this.f4679a);
    }

    public final synchronized int c() {
        return getCurrentPosition(this.f4679a);
    }

    public final synchronized int d() {
        return getDuration(this.f4679a);
    }

    public final synchronized int e() {
        return getHeight(this.f4679a);
    }

    public final synchronized int f() {
        return getLoopCount(this.f4679a);
    }

    public final void finalize() {
        try {
            synchronized (this) {
                free(this.f4679a);
                this.f4679a = 0L;
            }
        } finally {
            super.finalize();
        }
    }

    public final synchronized int g() {
        return getNativeErrorCode(this.f4679a);
    }

    public final synchronized int h() {
        return getNumberOfFrames(this.f4679a);
    }

    public final synchronized long[] i() {
        return getSavedState(this.f4679a);
    }

    public final synchronized int j() {
        return getWidth(this.f4679a);
    }

    public final synchronized boolean k() {
        return isOpaque(this.f4679a);
    }

    public final synchronized long l(Bitmap bitmap) {
        return renderFrame(this.f4679a, bitmap);
    }

    public final synchronized boolean m() {
        return reset(this.f4679a);
    }

    public final synchronized long n() {
        return restoreRemainder(this.f4679a);
    }

    public final synchronized int o(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f4679a, jArr, bitmap);
    }

    public final synchronized void p() {
        saveRemainder(this.f4679a);
    }

    public final synchronized void q(@IntRange(from = 0, to = 2147483647L) int i5, Bitmap bitmap) {
        seekToTime(this.f4679a, i5, bitmap);
    }

    public final void r(@IntRange(from = 0, to = 65535) int i5) {
        if (i5 < 0 || i5 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f4679a, (char) i5);
        }
    }
}
