package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes9.dex */
public final class r implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1013b;

    public r(p pVar) {
        this.f1013b = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        p pVar = this.f1013b;
        pVar.f1005v.setEnabled(pVar.a().f());
        this.f1013b.f1003t.toggle();
        p pVar2 = this.f1013b;
        pVar2.g(pVar2.f1003t);
        this.f1013b.e();
    }
}
