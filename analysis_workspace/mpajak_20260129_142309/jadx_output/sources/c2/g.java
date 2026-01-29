package c2;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* loaded from: classes9.dex */
public final class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Snackbar f521c;

    public g(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f521c = snackbar;
        this.f520b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f520b.onClick(view);
        this.f521c.b(1);
    }
}
