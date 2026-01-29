package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import comeliest.metempsychosis.pokelogan.R;
import e2.i;
import v1.l;

/* loaded from: classes20.dex */
public final class c extends i {

    /* renamed from: e, reason: collision with root package name */
    public final a f1286e;

    /* renamed from: f, reason: collision with root package name */
    public final b f1287f;

    /* renamed from: g, reason: collision with root package name */
    public final C0023c f1288g;

    /* loaded from: classes18.dex */
    public class a extends l {
        public a() {
        }

        @Override // v1.l, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            c.this.f2547c.setChecked(!c.d(r1));
        }
    }

    /* loaded from: classes19.dex */
    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(@NonNull TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c.this.f2547c.setChecked(!c.d(r0));
            editText.removeTextChangedListener(c.this.f1286e);
            editText.addTextChangedListener(c.this.f1286e);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c, reason: collision with other inner class name */
    /* loaded from: classes16.dex */
    public class C0023c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        /* loaded from: classes5.dex */
        public class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditText f1292b;

            public a(EditText editText) {
                this.f1292b = editText;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f1292b.removeTextChangedListener(c.this.f1286e);
            }
        }

        public C0023c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(@NonNull TextInputLayout textInputLayout, int i5) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i5 != 1) {
                return;
            }
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            editText.post(new a(editText));
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EditText editText = c.this.f2545a.getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            editText.setTransformationMethod(c.d(c.this) ? null : PasswordTransformationMethod.getInstance());
            if (selectionEnd >= 0) {
                editText.setSelection(selectionEnd);
            }
            c.this.f2545a.p();
        }
    }

    public c(@NonNull TextInputLayout textInputLayout, @DrawableRes int i5) {
        super(textInputLayout, i5);
        this.f1286e = new a();
        this.f1287f = new b();
        this.f1288g = new C0023c();
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f2545a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // e2.i
    public final void a() {
        TextInputLayout textInputLayout = this.f2545a;
        int i5 = this.f2548d;
        if (i5 == 0) {
            i5 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i5);
        TextInputLayout textInputLayout2 = this.f2545a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z4 = true;
        this.f2545a.setEndIconVisible(true);
        this.f2545a.setEndIconCheckable(true);
        this.f2545a.setEndIconOnClickListener(new d());
        this.f2545a.a(this.f1287f);
        this.f2545a.b(this.f1288g);
        EditText editText = this.f2545a.getEditText();
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            z4 = false;
        }
        if (z4) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
