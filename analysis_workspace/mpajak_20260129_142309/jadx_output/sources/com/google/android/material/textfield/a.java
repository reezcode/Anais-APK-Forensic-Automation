package com.google.android.material.textfield;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import comeliest.metempsychosis.pokelogan.R;
import e2.i;

/* loaded from: classes4.dex */
public final class a extends i {

    /* renamed from: e, reason: collision with root package name */
    public final C0019a f1244e;

    /* renamed from: f, reason: collision with root package name */
    public final b f1245f;

    /* renamed from: g, reason: collision with root package name */
    public final c f1246g;

    /* renamed from: h, reason: collision with root package name */
    public final d f1247h;

    /* renamed from: i, reason: collision with root package name */
    public AnimatorSet f1248i;

    /* renamed from: j, reason: collision with root package name */
    public ValueAnimator f1249j;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0019a implements TextWatcher {
        public C0019a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@NonNull Editable editable) {
            if (a.this.f2545a.getSuffixText() != null) {
                return;
            }
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    /* loaded from: classes12.dex */
    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public final void onFocusChange(View view, boolean z4) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    /* loaded from: classes10.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            editText.setOnFocusChangeListener(a.this.f1245f);
            a aVar = a.this;
            aVar.f2547c.setOnFocusChangeListener(aVar.f1245f);
            editText.removeTextChangedListener(a.this.f1244e);
            editText.addTextChangedListener(a.this.f1244e);
        }
    }

    /* loaded from: classes19.dex */
    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0020a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditText f1254b;

            public RunnableC0020a(EditText editText) {
                this.f1254b = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1254b.removeTextChangedListener(a.this.f1244e);
                a.this.e(true);
            }
        }

        public d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(@NonNull TextInputLayout textInputLayout, int i5) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i5 != 2) {
                return;
            }
            editText.post(new RunnableC0020a(editText));
            if (editText.getOnFocusChangeListener() == a.this.f1245f) {
                editText.setOnFocusChangeListener(null);
            }
            View.OnFocusChangeListener onFocusChangeListener = a.this.f2547c.getOnFocusChangeListener();
            a aVar = a.this;
            if (onFocusChangeListener == aVar.f1245f) {
                aVar.f2547c.setOnFocusChangeListener(null);
            }
        }
    }

    /* loaded from: classes23.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Editable text = a.this.f2545a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f2545a.p();
        }
    }

    /* loaded from: classes24.dex */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            a.this.f2547c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public a(@NonNull TextInputLayout textInputLayout, @DrawableRes int i5) {
        super(textInputLayout, i5);
        this.f1244e = new C0019a();
        this.f1245f = new b();
        this.f1246g = new c();
        this.f1247h = new d();
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.f2545a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f2547c.hasFocus()) && editText.getText().length() > 0;
    }

    @Override // e2.i
    public final void a() {
        TextInputLayout textInputLayout = this.f2545a;
        int i5 = this.f2548d;
        if (i5 == 0) {
            i5 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i5);
        TextInputLayout textInputLayout2 = this.f2545a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f2545a.setEndIconCheckable(false);
        this.f2545a.setEndIconOnClickListener(new e());
        this.f2545a.a(this.f1246g);
        this.f2545a.b(this.f1247h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(f1.a.f2770d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new e2.c(this));
        ValueAnimator f5 = f(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1248i = animatorSet;
        animatorSet.playTogether(ofFloat, f5);
        this.f1248i.addListener(new e2.a(this));
        ValueAnimator f6 = f(1.0f, 0.0f);
        this.f1249j = f6;
        f6.addListener(new e2.b(this));
    }

    @Override // e2.i
    public final void c(boolean z4) {
        if (this.f2545a.getSuffixText() == null) {
            return;
        }
        e(z4);
    }

    public final void e(boolean z4) {
        boolean z5 = this.f2545a.k() == z4;
        if (z4 && !this.f1248i.isRunning()) {
            this.f1249j.cancel();
            this.f1248i.start();
            if (z5) {
                this.f1248i.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f1248i.cancel();
        this.f1249j.start();
        if (z5) {
            this.f1249j.end();
        }
    }

    public final ValueAnimator f(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(f1.a.f2767a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new f());
        return ofFloat;
    }
}
