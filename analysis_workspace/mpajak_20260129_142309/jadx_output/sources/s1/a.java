package s1;

import android.content.Context;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import comeliest.metempsychosis.pokelogan.R;
import y1.b;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f5130f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5131a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5132b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5133c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5134d;

    /* renamed from: e, reason: collision with root package name */
    public final float f5135e;

    public a(@NonNull Context context) {
        TypedValue a5 = b.a(context, R.attr.elevationOverlayEnabled);
        boolean z4 = (a5 == null || a5.type != 18 || a5.data == 0) ? false : true;
        int a6 = p1.a.a(context, R.attr.elevationOverlayColor, 0);
        int a7 = p1.a.a(context, R.attr.elevationOverlayAccentColor, 0);
        int a8 = p1.a.a(context, R.attr.colorSurface, 0);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f5131a = z4;
        this.f5132b = a6;
        this.f5133c = a7;
        this.f5134d = a8;
        this.f5135e = f5;
    }
}
