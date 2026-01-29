package e2;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class n extends i {
    public n(@NonNull TextInputLayout textInputLayout) {
        super(textInputLayout, 0);
    }

    @Override // e2.i
    public final void a() {
        this.f2545a.setEndIconOnClickListener(null);
        this.f2545a.setEndIconDrawable((Drawable) null);
        this.f2545a.setEndIconContentDescription((CharSequence) null);
    }
}
