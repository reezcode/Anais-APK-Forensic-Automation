package x1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import i.g;
import v1.m;
import y1.c;

/* loaded from: classes15.dex */
public final class a extends AppCompatRadioButton {

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f5909d = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public ColorStateList f5910b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5911c;

    public a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(f2.a.a(context, attributeSet, comeliest.metempsychosis.pokelogan.R.attr.radioButtonStyle, comeliest.metempsychosis.pokelogan.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, comeliest.metempsychosis.pokelogan.R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d5 = m.d(context2, attributeSet, g.f3215u, comeliest.metempsychosis.pokelogan.R.attr.radioButtonStyle, comeliest.metempsychosis.pokelogan.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (d5.hasValue(0)) {
            CompoundButtonCompat.setButtonTintList(this, c.a(context2, d5, 0));
        }
        this.f5911c = d5.getBoolean(1, false);
        d5.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f5910b == null) {
            int b5 = p1.a.b(this, comeliest.metempsychosis.pokelogan.R.attr.colorControlActivated);
            int b6 = p1.a.b(this, comeliest.metempsychosis.pokelogan.R.attr.colorOnSurface);
            int b7 = p1.a.b(this, comeliest.metempsychosis.pokelogan.R.attr.colorSurface);
            this.f5910b = new ColorStateList(f5909d, new int[]{p1.a.d(b7, b5, 1.0f), p1.a.d(b7, b6, 0.54f), p1.a.d(b7, b6, 0.38f), p1.a.d(b7, b6, 0.38f)});
        }
        return this.f5910b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f5911c && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z4) {
        this.f5911c = z4;
        CompoundButtonCompat.setButtonTintList(this, z4 ? getMaterialThemeColorsTintList() : null);
    }
}
