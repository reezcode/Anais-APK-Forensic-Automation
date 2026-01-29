package l0;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3942a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f3943b = new char[64];

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public static volatile Handler f3944c;

    /* loaded from: classes14.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3945a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f3945a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3945a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3945a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3945a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3945a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static void a() {
        if (!i()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean b(@Nullable Object obj, @Nullable Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int c(int i5, int i6, @Nullable Bitmap.Config config) {
        int i7 = i5 * i6;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i8 = a.f3945a[config.ordinal()];
        int i9 = 4;
        if (i8 == 1) {
            i9 = 1;
        } else if (i8 == 2 || i8 == 3) {
            i9 = 2;
        } else if (i8 == 4) {
            i9 = 8;
        }
        return i7 * i9;
    }

    @TargetApi(19)
    public static int d(@NonNull Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    @NonNull
    public static <T> List<T> e(@NonNull Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t4 : collection) {
            if (t4 != null) {
                arrayList.add(t4);
            }
        }
        return arrayList;
    }

    public static Handler f() {
        if (f3944c == null) {
            synchronized (k.class) {
                if (f3944c == null) {
                    f3944c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f3944c;
    }

    public static int g(@Nullable Object obj, int i5) {
        return (i5 * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public static boolean h() {
        return !i();
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean j(int i5, int i6) {
        if (i5 > 0 || i5 == Integer.MIN_VALUE) {
            return i6 > 0 || i6 == Integer.MIN_VALUE;
        }
        return false;
    }
}
