package y1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public final ColorStateList f6051a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f6052b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6053c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6054d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6055e;

    /* renamed from: f, reason: collision with root package name */
    public final float f6056f;

    /* renamed from: g, reason: collision with root package name */
    public final float f6057g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f6058h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6059i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public ColorStateList f6060j;

    /* renamed from: k, reason: collision with root package name */
    public float f6061k;

    /* renamed from: l, reason: collision with root package name */
    @FontRes
    public final int f6062l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6063m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f6064n;

    /* loaded from: classes19.dex */
    public class a extends ResourcesCompat.FontCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f6065a;

        public a(f fVar) {
            this.f6065a = fVar;
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* renamed from: onFontRetrievalFailed */
        public final void lambda$callbackFailAsync$1(int i5) {
            d.this.f6063m = true;
            this.f6065a.a(i5);
        }

        @Override // androidx.core.content.res.ResourcesCompat.FontCallback
        /* renamed from: onFontRetrieved */
        public final void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface) {
            d dVar = d.this;
            dVar.f6064n = Typeface.create(typeface, dVar.f6053c);
            d dVar2 = d.this;
            dVar2.f6063m = true;
            this.f6065a.b(dVar2.f6064n, false);
        }
    }

    public d(@NonNull Context context, @StyleRes int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, i.g.D);
        this.f6061k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f6060j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f6053c = obtainStyledAttributes.getInt(2, 0);
        this.f6054d = obtainStyledAttributes.getInt(1, 1);
        int i6 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f6062l = obtainStyledAttributes.getResourceId(i6, 0);
        this.f6052b = obtainStyledAttributes.getString(i6);
        obtainStyledAttributes.getBoolean(14, false);
        this.f6051a = c.a(context, obtainStyledAttributes, 6);
        this.f6055e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f6056f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f6057g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i5, i.g.f3217w);
        this.f6058h = obtainStyledAttributes2.hasValue(0);
        this.f6059i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f6064n == null && (str = this.f6052b) != null) {
            this.f6064n = Typeface.create(str, this.f6053c);
        }
        if (this.f6064n == null) {
            int i5 = this.f6054d;
            this.f6064n = i5 != 1 ? i5 != 2 ? i5 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f6064n = Typeface.create(this.f6064n, this.f6053c);
        }
    }

    @NonNull
    @VisibleForTesting
    public final Typeface b(@NonNull Context context) {
        if (this.f6063m) {
            return this.f6064n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = ResourcesCompat.getFont(context, this.f6062l);
                this.f6064n = font;
                if (font != null) {
                    this.f6064n = Typeface.create(font, this.f6053c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e5) {
                StringBuilder g5 = androidx.activity.d.g("Error loading font ");
                g5.append(this.f6052b);
                Log.d("TextAppearance", g5.toString(), e5);
            }
        }
        a();
        this.f6063m = true;
        return this.f6064n;
    }

    public final void c(@NonNull Context context, @NonNull f fVar) {
        int i5 = this.f6062l;
        if ((i5 != 0 ? ResourcesCompat.getCachedFont(context, i5) : null) != null) {
            b(context);
        } else {
            a();
        }
        int i6 = this.f6062l;
        if (i6 == 0) {
            this.f6063m = true;
        }
        if (this.f6063m) {
            fVar.b(this.f6064n, true);
            return;
        }
        try {
            ResourcesCompat.getFont(context, i6, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f6063m = true;
            fVar.a(1);
        } catch (Exception e5) {
            StringBuilder g5 = androidx.activity.d.g("Error loading font ");
            g5.append(this.f6052b);
            Log.d("TextAppearance", g5.toString(), e5);
            this.f6063m = true;
            fVar.a(-3);
        }
    }

    public final void d(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        e(context, textPaint, fVar);
        ColorStateList colorStateList = this.f6060j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f5 = this.f6057g;
        float f6 = this.f6055e;
        float f7 = this.f6056f;
        ColorStateList colorStateList2 = this.f6051a;
        textPaint.setShadowLayer(f5, f6, f7, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void e(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull f fVar) {
        int i5 = this.f6062l;
        if ((i5 != 0 ? ResourcesCompat.getCachedFont(context, i5) : null) != null) {
            f(context, textPaint, b(context));
            return;
        }
        a();
        f(context, textPaint, this.f6064n);
        c(context, new e(this, context, textPaint, fVar));
    }

    public final void f(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        Typeface a5 = g.a(context.getResources().getConfiguration(), typeface);
        if (a5 != null) {
            typeface = a5;
        }
        textPaint.setTypeface(typeface);
        int i5 = this.f6053c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i5 & 1) != 0);
        textPaint.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f6061k);
        if (this.f6058h) {
            textPaint.setLetterSpacing(this.f6059i);
        }
    }
}
