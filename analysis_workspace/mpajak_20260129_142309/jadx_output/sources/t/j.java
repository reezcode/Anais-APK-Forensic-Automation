package t;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f5408a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5409b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f5410c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5411d;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final int f5412e;

        /* renamed from: a, reason: collision with root package name */
        public final Context f5413a;

        /* renamed from: b, reason: collision with root package name */
        public ActivityManager f5414b;

        /* renamed from: c, reason: collision with root package name */
        public b f5415c;

        /* renamed from: d, reason: collision with root package name */
        public float f5416d;

        static {
            f5412e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f5416d = f5412e;
            this.f5413a = context;
            this.f5414b = (ActivityManager) context.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            this.f5415c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !this.f5414b.isLowRamDevice()) {
                return;
            }
            this.f5416d = 0.0f;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayMetrics f5417a;

        public b(DisplayMetrics displayMetrics) {
            this.f5417a = displayMetrics;
        }
    }

    public j(a aVar) {
        this.f5410c = aVar.f5413a;
        int i5 = aVar.f5414b.isLowRamDevice() ? 2097152 : 4194304;
        this.f5411d = i5;
        int round = Math.round(r1.getMemoryClass() * 1024 * 1024 * (aVar.f5414b.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f5415c.f5417a;
        float f5 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int round2 = Math.round(aVar.f5416d * f5);
        int round3 = Math.round(f5 * 2.0f);
        int i6 = round - i5;
        int i7 = round3 + round2;
        if (i7 <= i6) {
            this.f5409b = round3;
            this.f5408a = round2;
        } else {
            float f6 = i6 / (aVar.f5416d + 2.0f);
            this.f5409b = Math.round(2.0f * f6);
            this.f5408a = Math.round(f6 * aVar.f5416d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder g5 = androidx.activity.d.g("Calculation complete, Calculated memory cache size: ");
            g5.append(a(this.f5409b));
            g5.append(", pool size: ");
            g5.append(a(this.f5408a));
            g5.append(", byte array size: ");
            g5.append(a(i5));
            g5.append(", memory class limited? ");
            g5.append(i7 > round);
            g5.append(", max size: ");
            g5.append(a(round));
            g5.append(", memoryClass: ");
            g5.append(aVar.f5414b.getMemoryClass());
            g5.append(", isLowMemoryDevice: ");
            g5.append(aVar.f5414b.isLowRamDevice());
            Log.d("MemorySizeCalculator", g5.toString());
        }
    }

    public final String a(int i5) {
        return Formatter.formatFileSize(this.f5410c, i5);
    }
}
