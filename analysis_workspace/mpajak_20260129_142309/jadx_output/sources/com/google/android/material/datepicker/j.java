package com.google.android.material.datepicker;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import comeliest.metempsychosis.pokelogan.R;

/* loaded from: classes14.dex */
public final class j extends AccessibilityDelegateCompat {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f975a;

    public j(h hVar) {
        this.f975a = hVar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        h hVar;
        int i5;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (this.f975a.f966l.getVisibility() == 0) {
            hVar = this.f975a;
            i5 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            hVar = this.f975a;
            i5 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        accessibilityNodeInfoCompat.setHintText(hVar.getString(i5));
    }
}
