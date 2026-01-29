package a2;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes23.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f52i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f53j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f54k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f55l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f57b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Paint f58c;

    /* renamed from: d, reason: collision with root package name */
    public int f59d;

    /* renamed from: e, reason: collision with root package name */
    public int f60e;

    /* renamed from: f, reason: collision with root package name */
    public int f61f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f62g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public Paint f63h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f56a = new Paint();

    public a() {
        a(-16777216);
        this.f63h.setColor(0);
        Paint paint = new Paint(4);
        this.f57b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f58c = new Paint(paint);
    }

    public final void a(int i5) {
        this.f59d = ColorUtils.setAlphaComponent(i5, 68);
        this.f60e = ColorUtils.setAlphaComponent(i5, 20);
        this.f61f = ColorUtils.setAlphaComponent(i5, 0);
        this.f56a.setColor(this.f59d);
    }
}
