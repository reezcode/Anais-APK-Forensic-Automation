package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes21.dex */
public final class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f979b;

    public l(h hVar) {
        this.f979b = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h hVar = this.f979b;
        int i5 = hVar.f961g;
        if (i5 == 2) {
            hVar.e(1);
        } else if (i5 == 1) {
            hVar.e(2);
        }
    }
}
