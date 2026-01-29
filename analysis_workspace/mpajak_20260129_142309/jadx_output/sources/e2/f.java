package e2;

import android.widget.AutoCompleteTextView;

/* loaded from: classes21.dex */
public final class f implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.b f2541a;

    public f(com.google.android.material.textfield.b bVar) {
        this.f2541a = bVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        com.google.android.material.textfield.b.h(this.f2541a);
        com.google.android.material.textfield.b.f(this.f2541a, false);
    }
}
