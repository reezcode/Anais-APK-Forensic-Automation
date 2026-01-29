package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;

/* loaded from: classes10.dex */
public final class q implements OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1010a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1011b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1012c;

    public q(int i5, View view, int i6) {
        this.f1010a = i5;
        this.f1011b = view;
        this.f1012c = i6;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i5 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
        if (this.f1010a >= 0) {
            this.f1011b.getLayoutParams().height = this.f1010a + i5;
            View view2 = this.f1011b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f1011b;
        view3.setPadding(view3.getPaddingLeft(), this.f1012c + i5, this.f1011b.getPaddingRight(), this.f1011b.getPaddingBottom());
        return windowInsetsCompat;
    }
}
