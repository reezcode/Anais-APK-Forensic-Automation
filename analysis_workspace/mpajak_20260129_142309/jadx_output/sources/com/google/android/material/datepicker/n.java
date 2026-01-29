package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes14.dex */
public final class n implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f983c;

    public n(h hVar, x xVar) {
        this.f983c = hVar;
        this.f982b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int findLastVisibleItemPosition = this.f983c.b().findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            this.f983c.d(this.f982b.a(findLastVisibleItemPosition));
        }
    }
}
