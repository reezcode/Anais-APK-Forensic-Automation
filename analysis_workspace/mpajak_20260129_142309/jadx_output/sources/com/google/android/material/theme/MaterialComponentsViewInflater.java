package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import comeliest.metempsychosis.pokelogan.R;
import e2.m;
import l1.a;

/* loaded from: classes14.dex */
public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatAutoCompleteTextView createAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return new m(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatButton createButton(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new x1.a(context, attributeSet, R.attr.radioButtonStyle);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    @NonNull
    public final AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
