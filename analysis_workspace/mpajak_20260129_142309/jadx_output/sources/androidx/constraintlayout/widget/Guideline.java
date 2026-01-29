package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes10.dex */
public class Guideline extends View {
    private boolean mFilterRedundantCalls;

    public Guideline(Context context) {
        super(context);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5);
        this.mFilterRedundantCalls = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i6) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z4) {
        this.mFilterRedundantCalls = z4;
    }

    public void setGuidelineBegin(int i5) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guideBegin == i5) {
            return;
        }
        layoutParams.guideBegin = i5;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i5) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guideEnd == i5) {
            return;
        }
        layoutParams.guideEnd = i5;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f5) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.mFilterRedundantCalls && layoutParams.guidePercent == f5) {
            return;
        }
        layoutParams.guidePercent = f5;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
    }
}
