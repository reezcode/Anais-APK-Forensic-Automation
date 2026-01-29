package e2;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes14.dex */
public final class d extends i {
    public d(@NonNull TextInputLayout textInputLayout, @DrawableRes int i5) {
        super(textInputLayout, i5);
    }

    @Override // e2.i
    public final void a() {
        this.f2545a.setEndIconDrawable(this.f2548d);
        this.f2545a.setEndIconOnClickListener(null);
        this.f2545a.setEndIconOnLongClickListener(null);
    }
}
