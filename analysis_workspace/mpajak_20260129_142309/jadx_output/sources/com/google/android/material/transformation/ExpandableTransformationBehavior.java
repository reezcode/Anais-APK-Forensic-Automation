package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes5.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public AnimatorSet f1345b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public void a(View view, View view2, boolean z4, boolean z5) {
        AnimatorSet animatorSet = this.f1345b;
        boolean z6 = animatorSet != null;
        if (z6) {
            animatorSet.cancel();
        }
        AnimatorSet b5 = b(view, view2, z4, z6);
        this.f1345b = b5;
        b5.addListener(new g2.a(this));
        this.f1345b.start();
        if (z5) {
            return;
        }
        this.f1345b.end();
    }

    @NonNull
    public abstract AnimatorSet b(View view, View view2, boolean z4, boolean z5);
}
