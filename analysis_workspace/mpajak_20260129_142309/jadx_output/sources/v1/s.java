package v1;

import android.annotation.SuppressLint;
import android.widget.ImageButton;
import androidx.annotation.RestrictTo;

@SuppressLint({"AppCompatCustomView"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes25.dex */
public class s extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public int f5642b;

    public final void b(int i5, boolean z4) {
        super.setVisibility(i5);
        if (z4) {
            this.f5642b = i5;
        }
    }

    public final int getUserSetVisibility() {
        return this.f5642b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i5) {
        b(i5, true);
    }
}
