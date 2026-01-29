package y1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6067a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f6068b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f6069c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f6070d;

    public e(d dVar, Context context, TextPaint textPaint, f fVar) {
        this.f6070d = dVar;
        this.f6067a = context;
        this.f6068b = textPaint;
        this.f6069c = fVar;
    }

    @Override // y1.f
    public final void a(int i5) {
        this.f6069c.a(i5);
    }

    @Override // y1.f
    public final void b(@NonNull Typeface typeface, boolean z4) {
        this.f6070d.f(this.f6067a, this.f6068b, typeface);
        this.f6069c.b(typeface, z4);
    }
}
