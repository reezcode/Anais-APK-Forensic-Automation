package com.google.android.material.datepicker;

import android.view.View;

/* loaded from: classes7.dex */
public final class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f981c;

    public m(h hVar, x xVar) {
        this.f981c = hVar;
        this.f980b = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int findFirstVisibleItemPosition = this.f981c.b().findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < this.f981c.f964j.getAdapter().getItemCount()) {
            this.f981c.d(this.f980b.a(findFirstVisibleItemPosition));
        }
    }
}
