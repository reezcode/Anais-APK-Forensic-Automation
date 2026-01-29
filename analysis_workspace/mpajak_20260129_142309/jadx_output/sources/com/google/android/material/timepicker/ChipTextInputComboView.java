package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import comeliest.metempsychosis.pokelogan.R;
import v1.l;
import v1.o;

/* loaded from: classes8.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b, reason: collision with root package name */
    public final Chip f1295b;

    /* renamed from: c, reason: collision with root package name */
    public final EditText f1296c;

    /* renamed from: d, reason: collision with root package name */
    public a f1297d;

    /* loaded from: classes16.dex */
    public class a extends l {
        public a() {
        }

        @Override // v1.l, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f1295b.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            } else {
                ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
                chipTextInputComboView2.f1295b.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
            }
        }
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f1295b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f1296c = editText;
        editText.setVisibility(4);
        a aVar = new a();
        this.f1297d = aVar;
        editText.addTextChangedListener(aVar);
        b();
        addView(chip);
        addView(textInputLayout);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1296c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f1295b.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z4) {
        this.f1295b.setChecked(z4);
        this.f1296c.setVisibility(z4 ? 0 : 4);
        this.f1295b.setVisibility(z4 ? 8 : 0);
        if (isChecked()) {
            EditText editText = this.f1296c;
            editText.requestFocus();
            editText.post(new o(editText));
            if (TextUtils.isEmpty(this.f1296c.getText())) {
                return;
            }
            EditText editText2 = this.f1296c;
            editText2.setSelection(editText2.getText().length());
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f1295b.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i5, Object obj) {
        this.f1295b.setTag(i5, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f1295b.toggle();
    }
}
