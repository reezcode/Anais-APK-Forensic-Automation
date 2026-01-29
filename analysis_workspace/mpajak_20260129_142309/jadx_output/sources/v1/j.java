package v1;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import java.lang.reflect.Constructor;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: m, reason: collision with root package name */
    public static final int f5610m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f5611n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public static Constructor<StaticLayout> f5612o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public static TextDirectionHeuristic f5613p;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f5614a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f5615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5616c;

    /* renamed from: d, reason: collision with root package name */
    public int f5617d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5624k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f5618e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f5619f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f5620g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f5621h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f5622i = f5610m;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5623j = true;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public TextUtils.TruncateAt f5625l = null;

    /* loaded from: classes4.dex */
    public static class a extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = androidx.activity.d.g(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v1.j.a.<init>(java.lang.Throwable):void");
        }
    }

    static {
        f5610m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public j(CharSequence charSequence, TextPaint textPaint, int i5) {
        this.f5614a = charSequence;
        this.f5615b = textPaint;
        this.f5616c = i5;
        this.f5617d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f5614a == null) {
            this.f5614a = "";
        }
        int max = Math.max(0, this.f5616c);
        CharSequence charSequence = this.f5614a;
        if (this.f5619f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f5615b, max, this.f5625l);
        }
        int min = Math.min(charSequence.length(), this.f5617d);
        this.f5617d = min;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 23) {
            if (!f5611n) {
                try {
                    f5613p = this.f5624k && i5 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f5612o = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    f5611n = true;
                } catch (Exception e5) {
                    throw new a(e5);
                }
            }
            try {
                return (StaticLayout) ((Constructor) Preconditions.checkNotNull(f5612o)).newInstance(charSequence, 0, Integer.valueOf(this.f5617d), this.f5615b, Integer.valueOf(max), this.f5618e, Preconditions.checkNotNull(f5613p), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f5623j), null, Integer.valueOf(max), Integer.valueOf(this.f5619f));
            } catch (Exception e6) {
                throw new a(e6);
            }
        }
        if (this.f5624k && this.f5619f == 1) {
            this.f5618e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f5615b, max);
        obtain.setAlignment(this.f5618e);
        obtain.setIncludePad(this.f5623j);
        obtain.setTextDirection(this.f5624k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5625l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f5619f);
        float f5 = this.f5620g;
        if (f5 != 0.0f || this.f5621h != 1.0f) {
            obtain.setLineSpacing(f5, this.f5621h);
        }
        if (this.f5619f > 1) {
            obtain.setHyphenationFrequency(this.f5622i);
        }
        return obtain.build();
    }
}
