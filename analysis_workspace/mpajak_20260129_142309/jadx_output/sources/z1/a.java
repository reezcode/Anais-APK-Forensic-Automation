package z1;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import b2.g;
import b2.k;
import b2.n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public final class a extends Drawable implements n, TintAwareDrawable {

    /* renamed from: b, reason: collision with root package name */
    public b f6111b;

    /* loaded from: classes6.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public g f6112a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f6113b;

        public b(g gVar) {
            this.f6112a = gVar;
            this.f6113b = false;
        }

        public b(@NonNull b bVar) {
            this.f6112a = (g) bVar.f6112a.f324b.newDrawable();
            this.f6113b = bVar.f6113b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new a(new b(this), null);
        }
    }

    public a(k kVar) {
        this.f6111b = new b(new g(kVar));
    }

    public a(b bVar, C0089a c0089a) {
        this.f6111b = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        b bVar = this.f6111b;
        if (bVar.f6113b) {
            bVar.f6112a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f6111b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f6111b.f6112a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.f6111b = new b(this.f6111b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f6111b.f6112a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f6111b.f6112a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b5 = z1.b.b(iArr);
        b bVar = this.f6111b;
        if (bVar.f6113b == b5) {
            return onStateChange;
        }
        bVar.f6113b = b5;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i5) {
        this.f6111b.f6112a.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f6111b.f6112a.setColorFilter(colorFilter);
    }

    @Override // b2.n
    public final void setShapeAppearanceModel(@NonNull k kVar) {
        this.f6111b.f6112a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(@ColorInt int i5) {
        this.f6111b.f6112a.setTint(i5);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        this.f6111b.f6112a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f6111b.f6112a.setTintMode(mode);
    }
}
