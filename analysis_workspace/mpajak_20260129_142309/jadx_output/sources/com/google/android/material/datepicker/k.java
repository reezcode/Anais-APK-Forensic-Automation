package com.google.android.material.datepicker;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f978c;

    public k(h hVar, x xVar, MaterialButton materialButton) {
        this.f978c = hVar;
        this.f976a = xVar;
        this.f977b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i5) {
        if (i5 == 0) {
            recyclerView.announceForAccessibility(this.f977b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i5, int i6) {
        LinearLayoutManager b5 = this.f978c.b();
        int findFirstVisibleItemPosition = i5 < 0 ? b5.findFirstVisibleItemPosition() : b5.findLastVisibleItemPosition();
        this.f978c.f960f = this.f976a.a(findFirstVisibleItemPosition);
        this.f977b.setText(this.f976a.a(findFirstVisibleItemPosition).n());
    }
}
