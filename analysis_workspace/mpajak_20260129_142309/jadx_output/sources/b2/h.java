package b2;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import b2.g;

/* loaded from: classes3.dex */
public final class h {
    @NonNull
    public static d a(int i5) {
        if (i5 != 0 && i5 == 1) {
            return new e();
        }
        return new j();
    }

    public static void b(@NonNull View view, @NonNull g gVar) {
        s1.a aVar = gVar.f324b.f348b;
        if (aVar != null && aVar.f5131a) {
            float f5 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f5 += ViewCompat.getElevation((View) parent);
            }
            g.b bVar = gVar.f324b;
            if (bVar.f359m != f5) {
                bVar.f359m = f5;
                gVar.w();
            }
        }
    }
}
