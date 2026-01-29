package l1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import i.g;
import v1.m;
import v1.r;
import y1.c;

/* loaded from: classes7.dex */
public final class a extends AppCompatCheckBox {

    /* renamed from: e, reason: collision with root package name */
    public static final int[][] f3946e = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public ColorStateList f3947b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3948c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3949d;

    public a(Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(f2.a.a(context, attributeSet, comeliest.metempsychosis.pokelogan.R.attr.checkboxStyle, comeliest.metempsychosis.pokelogan.R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, comeliest.metempsychosis.pokelogan.R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d5 = m.d(context2, attributeSet, g.f3214t, comeliest.metempsychosis.pokelogan.R.attr.checkboxStyle, comeliest.metempsychosis.pokelogan.R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (d5.hasValue(0)) {
            CompoundButtonCompat.setButtonTintList(this, c.a(context2, d5, 0));
        }
        this.f3948c = d5.getBoolean(2, false);
        this.f3949d = d5.getBoolean(1, true);
        d5.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3947b == null) {
            int[][] iArr = f3946e;
            int b5 = p1.a.b(this, comeliest.metempsychosis.pokelogan.R.attr.colorControlActivated);
            int b6 = p1.a.b(this, comeliest.metempsychosis.pokelogan.R.attr.colorSurface);
            int b7 = p1.a.b(this, comeliest.metempsychosis.pokelogan.R.attr.colorOnSurface);
            this.f3947b = new ColorStateList(iArr, new int[]{p1.a.d(b6, b5, 1.0f), p1.a.d(b6, b7, 0.54f), p1.a.d(b6, b7, 0.38f), p1.a.d(b6, b7, 0.38f)});
        }
        return this.f3947b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3948c && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f3949d || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (r.a(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z4) {
        this.f3949d = z4;
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f3948c = z4;
        CompoundButtonCompat.setButtonTintList(this, z4 ? getMaterialThemeColorsTintList() : null);
    }
}
