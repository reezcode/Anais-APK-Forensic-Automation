package e2;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import comeliest.metempsychosis.pokelogan.R;
import v1.r;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class o extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public final TextInputLayout f2581b;

    /* renamed from: c, reason: collision with root package name */
    public final AppCompatTextView f2582c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public CharSequence f2583d;

    /* renamed from: e, reason: collision with root package name */
    public final CheckableImageButton f2584e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f2585f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2586g;

    /* renamed from: h, reason: collision with root package name */
    public View.OnLongClickListener f2587h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2588i;

    public o(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f2581b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f2584e = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f2582c = appCompatTextView;
        if (y1.c.d(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        c(null);
        d(null);
        if (tintTypedArray.hasValue(62)) {
            this.f2585f = y1.c.b(getContext(), tintTypedArray, 62);
        }
        if (tintTypedArray.hasValue(63)) {
            this.f2586g = r.b(tintTypedArray.getInt(63, -1), null);
        }
        if (tintTypedArray.hasValue(61)) {
            b(tintTypedArray.getDrawable(61));
            if (tintTypedArray.hasValue(60)) {
                a(tintTypedArray.getText(60));
            }
            checkableImageButton.setCheckable(tintTypedArray.getBoolean(59, true));
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(appCompatTextView, 1);
        TextViewCompat.setTextAppearance(appCompatTextView, tintTypedArray.getResourceId(55, 0));
        if (tintTypedArray.hasValue(56)) {
            appCompatTextView.setTextColor(tintTypedArray.getColorStateList(56));
        }
        CharSequence text = tintTypedArray.getText(54);
        this.f2583d = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        g();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public final void a(@Nullable CharSequence charSequence) {
        if (this.f2584e.getContentDescription() != charSequence) {
            this.f2584e.setContentDescription(charSequence);
        }
    }

    public final void b(@Nullable Drawable drawable) {
        this.f2584e.setImageDrawable(drawable);
        if (drawable != null) {
            j.a(this.f2581b, this.f2584e, this.f2585f, this.f2586g);
            e(true);
            j.c(this.f2581b, this.f2584e, this.f2585f);
        } else {
            e(false);
            c(null);
            d(null);
            a(null);
        }
    }

    public final void c(@Nullable View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f2584e;
        View.OnLongClickListener onLongClickListener = this.f2587h;
        checkableImageButton.setOnClickListener(onClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public final void d(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f2587h = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2584e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        j.d(checkableImageButton, onLongClickListener);
    }

    public final void e(boolean z4) {
        if ((this.f2584e.getVisibility() == 0) != z4) {
            this.f2584e.setVisibility(z4 ? 0 : 8);
            f();
            g();
        }
    }

    public final void f() {
        EditText editText = this.f2581b.f1194f;
        if (editText == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.f2582c, this.f2584e.getVisibility() == 0 ? 0 : ViewCompat.getPaddingStart(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void g() {
        int i5 = (this.f2583d == null || this.f2588i) ? 8 : 0;
        setVisibility(this.f2584e.getVisibility() == 0 || i5 == 0 ? 0 : 8);
        this.f2582c.setVisibility(i5);
        this.f2581b.v();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        f();
    }
}
