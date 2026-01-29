package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes12.dex */
public final class b implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f738e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i5) {
        this.f738e = baseBehavior;
        this.f734a = coordinatorLayout;
        this.f735b = appBarLayout;
        this.f736c = view;
        this.f737d = i5;
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(@NonNull View view, @Nullable AccessibilityViewCommand.CommandArguments commandArguments) {
        this.f738e.o(this.f734a, this.f735b, this.f736c, this.f737d, new int[]{0, 0});
        return true;
    }
}
