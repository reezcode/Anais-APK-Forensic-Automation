package u1;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

/* loaded from: classes25.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f5466b;

    public b(d dVar) {
        this.f5466b = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar = this.f5466b;
        float rotation = dVar.f1088r.getRotation();
        if (dVar.f1081k == rotation) {
            return true;
        }
        dVar.f1081k = rotation;
        dVar.r();
        return true;
    }
}
