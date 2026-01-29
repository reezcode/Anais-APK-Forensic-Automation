package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes9.dex */
public final class d0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f948c;

    public d0(e0 e0Var, int i5) {
        this.f948c = e0Var;
        this.f947b = i5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        u k5 = u.k(this.f947b, this.f948c.f949a.f960f.f1018c);
        a aVar = this.f948c.f949a.f959e;
        if (k5.compareTo(aVar.f917b) < 0) {
            k5 = aVar.f917b;
        } else if (k5.compareTo(aVar.f918c) > 0) {
            k5 = aVar.f918c;
        }
        this.f948c.f949a.d(k5);
        this.f948c.f949a.e(1);
    }
}
