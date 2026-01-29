package com.google.android.material.snackbar;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes24.dex */
public final class e implements SwipeDismissBehavior.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f1172a;

    public e(BaseTransientBottomBar baseTransientBottomBar) {
        this.f1172a = baseTransientBottomBar;
    }

    public final void a(@NonNull View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f1172a.b(0);
    }
}
