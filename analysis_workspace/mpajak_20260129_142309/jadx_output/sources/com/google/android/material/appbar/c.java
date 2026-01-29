package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.accessibility.AccessibilityViewCommand;

/* loaded from: classes22.dex */
public final class c implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f739a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f740b;

    public c(AppBarLayout appBarLayout, boolean z4) {
        this.f739a = appBarLayout;
        this.f740b = z4;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f739a.setExpanded(this.f740b);
        return true;
    }
}
