package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import com.google.android.material.textfield.TextInputLayout;
import comeliest.metempsychosis.pokelogan.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2549a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f2550b;

    /* renamed from: c, reason: collision with root package name */
    public LinearLayout f2551c;

    /* renamed from: d, reason: collision with root package name */
    public int f2552d;

    /* renamed from: e, reason: collision with root package name */
    public FrameLayout f2553e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Animator f2554f;

    /* renamed from: g, reason: collision with root package name */
    public final float f2555g;

    /* renamed from: h, reason: collision with root package name */
    public int f2556h;

    /* renamed from: i, reason: collision with root package name */
    public int f2557i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public CharSequence f2558j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2559k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f2560l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public CharSequence f2561m;

    /* renamed from: n, reason: collision with root package name */
    public int f2562n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public ColorStateList f2563o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2564p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2565q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public AppCompatTextView f2566r;

    /* renamed from: s, reason: collision with root package name */
    public int f2567s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public ColorStateList f2568t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f2569u;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f2570a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f2571b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f2572c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f2573d;

        public a(int i5, TextView textView, int i6, TextView textView2) {
            this.f2570a = i5;
            this.f2571b = textView;
            this.f2572c = i6;
            this.f2573d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            k kVar = k.this;
            kVar.f2556h = this.f2570a;
            kVar.f2554f = null;
            TextView textView = this.f2571b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f2572c == 1 && (appCompatTextView = k.this.f2560l) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f2573d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f2573d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f2573d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public k(@NonNull TextInputLayout textInputLayout) {
        this.f2549a = textInputLayout.getContext();
        this.f2550b = textInputLayout;
        this.f2555g = r0.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void a(TextView textView, int i5) {
        if (this.f2551c == null && this.f2553e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f2549a);
            this.f2551c = linearLayout;
            linearLayout.setOrientation(0);
            this.f2550b.addView(this.f2551c, -1, -2);
            this.f2553e = new FrameLayout(this.f2549a);
            this.f2551c.addView(this.f2553e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f2550b.getEditText() != null) {
                b();
            }
        }
        if (i5 == 0 || i5 == 1) {
            this.f2553e.setVisibility(0);
            this.f2553e.addView(textView);
        } else {
            this.f2551c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2551c.setVisibility(0);
        this.f2552d++;
    }

    public final void b() {
        if ((this.f2551c == null || this.f2550b.getEditText() == null) ? false : true) {
            EditText editText = this.f2550b.getEditText();
            boolean d5 = y1.c.d(this.f2549a);
            ViewCompat.setPaddingRelative(this.f2551c, h(d5, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingStart(editText)), h(d5, R.dimen.material_helper_text_font_1_3_padding_top, this.f2549a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(d5, R.dimen.material_helper_text_font_1_3_padding_horizontal, ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    public final void c() {
        Animator animator = this.f2554f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(@NonNull List<Animator> list, boolean z4, @Nullable TextView textView, int i5, int i6, int i7) {
        if (textView == null || !z4) {
            return;
        }
        if (i5 == i7 || i5 == i6) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, i7 == i5 ? 1.0f : 0.0f);
            ofFloat.setDuration(167L);
            ofFloat.setInterpolator(f1.a.f2767a);
            list.add(ofFloat);
            if (i7 == i5) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f2555g, 0.0f);
                ofFloat2.setDuration(217L);
                ofFloat2.setInterpolator(f1.a.f2770d);
                list.add(ofFloat2);
            }
        }
    }

    public final boolean e() {
        return (this.f2557i != 1 || this.f2560l == null || TextUtils.isEmpty(this.f2558j)) ? false : true;
    }

    @Nullable
    public final TextView f(int i5) {
        if (i5 == 1) {
            return this.f2560l;
        }
        if (i5 != 2) {
            return null;
        }
        return this.f2566r;
    }

    @ColorInt
    public final int g() {
        AppCompatTextView appCompatTextView = this.f2560l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z4, @DimenRes int i5, int i6) {
        return z4 ? this.f2549a.getResources().getDimensionPixelSize(i5) : i6;
    }

    public final void i() {
        this.f2558j = null;
        c();
        if (this.f2556h == 1) {
            this.f2557i = (!this.f2565q || TextUtils.isEmpty(this.f2564p)) ? 0 : 2;
        }
        l(this.f2556h, this.f2557i, k(this.f2560l, ""));
    }

    public final void j(TextView textView, int i5) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2551c;
        if (linearLayout == null) {
            return;
        }
        if (!(i5 == 0 || i5 == 1) || (frameLayout = this.f2553e) == null) {
            linearLayout.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i6 = this.f2552d - 1;
        this.f2552d = i6;
        LinearLayout linearLayout2 = this.f2551c;
        if (i6 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean k(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        return ViewCompat.isLaidOut(this.f2550b) && this.f2550b.isEnabled() && !(this.f2557i == this.f2556h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i5, int i6, boolean z4) {
        TextView f5;
        TextView f6;
        if (i5 == i6) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2554f = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f2565q, this.f2566r, 2, i5, i6);
            d(arrayList, this.f2559k, this.f2560l, 1, i5, i6);
            f1.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i6, f(i5), i5, f(i6)));
            animatorSet.start();
        } else if (i5 != i6) {
            if (i6 != 0 && (f6 = f(i6)) != null) {
                f6.setVisibility(0);
                f6.setAlpha(1.0f);
            }
            if (i5 != 0 && (f5 = f(i5)) != null) {
                f5.setVisibility(4);
                if (i5 == 1) {
                    f5.setText((CharSequence) null);
                }
            }
            this.f2556h = i6;
        }
        this.f2550b.w();
        this.f2550b.A(z4, false);
        this.f2550b.F();
    }
}
