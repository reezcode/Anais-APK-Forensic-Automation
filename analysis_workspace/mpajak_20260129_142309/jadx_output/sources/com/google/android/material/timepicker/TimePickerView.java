package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import comeliest.metempsychosis.pokelogan.R;
import java.util.Objects;

/* loaded from: classes17.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1329d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final MaterialButtonToggleGroup f1330b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1331c;

    /* loaded from: classes13.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i5 = TimePickerView.f1329d;
            Objects.requireNonNull(timePickerView);
        }
    }

    /* loaded from: classes9.dex */
    public class b implements MaterialButtonToggleGroup.d {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public final void a() {
            TimePickerView timePickerView = TimePickerView.this;
            int i5 = TimePickerView.f1329d;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f1331c = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f1330b = materialButtonToggleGroup;
        materialButtonToggleGroup.f838d.add(new b());
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        c cVar = new c(new GestureDetector(getContext(), new com.google.android.material.timepicker.b(this)));
        chip.setOnTouchListener(cVar);
        chip2.setOnTouchListener(cVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void b() {
        if (this.f1330b.getVisibility() == 0) {
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(this);
            constraintSet.clear(R.id.material_clock_display, ViewCompat.getLayoutDirection(this) == 0 ? 2 : 1);
            constraintSet.applyTo(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i5) {
        super.onVisibilityChanged(view, i5);
        if (view == this && i5 == 0) {
            b();
        }
    }
}
