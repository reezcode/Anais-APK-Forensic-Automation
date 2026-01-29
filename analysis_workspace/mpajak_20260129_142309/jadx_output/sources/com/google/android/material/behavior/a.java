package com.google.android.material.behavior;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.e;

/* loaded from: classes25.dex */
public final class a implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f760a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f760a = swipeDismissBehavior;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        boolean z4 = false;
        if (!this.f760a.a(view)) {
            return false;
        }
        boolean z5 = ViewCompat.getLayoutDirection(view) == 1;
        int i5 = this.f760a.f749d;
        if ((i5 == 0 && z5) || (i5 == 1 && !z5)) {
            z4 = true;
        }
        int width = view.getWidth();
        if (z4) {
            width = -width;
        }
        ViewCompat.offsetLeftAndRight(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.f760a.f747b;
        if (bVar != null) {
            ((e) bVar).a(view);
        }
        return true;
    }
}
