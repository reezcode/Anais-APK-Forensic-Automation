package v1;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

/* loaded from: classes24.dex */
public final class q implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NonNull View view) {
        view.removeOnAttachStateChangeListener(this);
        ViewCompat.requestApplyInsets(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
