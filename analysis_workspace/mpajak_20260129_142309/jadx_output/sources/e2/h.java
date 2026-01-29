package e2;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;

/* loaded from: classes15.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f2543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.b f2544c;

    public h(com.google.android.material.textfield.b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f2544c = bVar;
        this.f2543b = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f2544c.m()) {
                this.f2544c.f1265l = false;
            }
            com.google.android.material.textfield.b.g(this.f2544c, this.f2543b);
            com.google.android.material.textfield.b.h(this.f2544c);
        }
        return false;
    }
}
