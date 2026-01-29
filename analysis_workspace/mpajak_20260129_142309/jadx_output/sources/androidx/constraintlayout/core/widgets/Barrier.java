package androidx.constraintlayout.core.widgets;

import androidx.activity.d;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class Barrier extends HelperWidget {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private static final boolean USE_RELAX_GONE = false;
    private static final boolean USE_RESOLUTION = true;
    private int mBarrierType = 0;
    private boolean mAllowsGoneWidget = true;
    private int mMargin = 0;
    public boolean resolved = false;

    public Barrier() {
    }

    public Barrier(String str) {
        setDebugName(str);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z4) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z5;
        SolverVariable solverVariable;
        ConstraintAnchor constraintAnchor;
        int i5;
        int i6;
        int i7;
        SolverVariable solverVariable2;
        int i8;
        ConstraintAnchor[] constraintAnchorArr2 = this.mListAnchors;
        constraintAnchorArr2[0] = this.mLeft;
        constraintAnchorArr2[2] = this.mTop;
        constraintAnchorArr2[1] = this.mRight;
        constraintAnchorArr2[3] = this.mBottom;
        int i9 = 0;
        while (true) {
            constraintAnchorArr = this.mListAnchors;
            if (i9 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i9].mSolverVariable = linearSystem.createObjectVariable(constraintAnchorArr[i9]);
            i9++;
        }
        int i10 = this.mBarrierType;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor2 = constraintAnchorArr[i10];
        if (!this.resolved) {
            allSolved();
        }
        if (this.resolved) {
            this.resolved = false;
            int i11 = this.mBarrierType;
            if (i11 == 0 || i11 == 1) {
                linearSystem.addEquality(this.mLeft.mSolverVariable, this.mX);
                solverVariable2 = this.mRight.mSolverVariable;
                i8 = this.mX;
            } else {
                if (i11 != 2 && i11 != 3) {
                    return;
                }
                linearSystem.addEquality(this.mTop.mSolverVariable, this.mY);
                solverVariable2 = this.mBottom.mSolverVariable;
                i8 = this.mY;
            }
            linearSystem.addEquality(solverVariable2, i8);
            return;
        }
        for (int i12 = 0; i12 < this.mWidgetsCount; i12++) {
            ConstraintWidget constraintWidget = this.mWidgets[i12];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i6 = this.mBarrierType) == 0 || i6 == 1) && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mLeft.mTarget != null && constraintWidget.mRight.mTarget != null) || (((i7 = this.mBarrierType) == 2 || i7 == 3) && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mTop.mTarget != null && constraintWidget.mBottom.mTarget != null))) {
                z5 = true;
                break;
            }
        }
        z5 = false;
        boolean z6 = this.mLeft.hasCenteredDependents() || this.mRight.hasCenteredDependents();
        boolean z7 = this.mTop.hasCenteredDependents() || this.mBottom.hasCenteredDependents();
        int i13 = !z5 && (((i5 = this.mBarrierType) == 0 && z6) || ((i5 == 2 && z7) || ((i5 == 1 && z6) || (i5 == 3 && z7)))) ? 5 : 4;
        for (int i14 = 0; i14 < this.mWidgetsCount; i14++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i14];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                SolverVariable createObjectVariable = linearSystem.createObjectVariable(constraintWidget2.mListAnchors[this.mBarrierType]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.mListAnchors;
                int i15 = this.mBarrierType;
                constraintAnchorArr3[i15].mSolverVariable = createObjectVariable;
                int i16 = (constraintAnchorArr3[i15].mTarget == null || constraintAnchorArr3[i15].mTarget.mOwner != this) ? 0 : constraintAnchorArr3[i15].mMargin + 0;
                if (i15 == 0 || i15 == 2) {
                    linearSystem.addLowerBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin - i16, z5);
                } else {
                    linearSystem.addGreaterBarrier(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i16, z5);
                }
                linearSystem.addEquality(constraintAnchor2.mSolverVariable, createObjectVariable, this.mMargin + i16, i13);
            }
        }
        int i17 = this.mBarrierType;
        if (i17 == 0) {
            linearSystem.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, 4);
            solverVariable = this.mLeft.mSolverVariable;
            constraintAnchor = this.mParent.mLeft;
        } else if (i17 == 1) {
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, 4);
            solverVariable = this.mLeft.mSolverVariable;
            constraintAnchor = this.mParent.mRight;
        } else if (i17 == 2) {
            linearSystem.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, 4);
            solverVariable = this.mTop.mSolverVariable;
            constraintAnchor = this.mParent.mTop;
        } else {
            if (i17 != 3) {
                return;
            }
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, 8);
            linearSystem.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, 4);
            solverVariable = this.mTop.mSolverVariable;
            constraintAnchor = this.mParent.mBottom;
        }
        linearSystem.addEquality(solverVariable, constraintAnchor.mSolverVariable, 0, 0);
    }

    public boolean allSolved() {
        int i5;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ConstraintAnchor.Type type3;
        int i6;
        int i7;
        int i8 = 0;
        boolean z4 = true;
        while (true) {
            i5 = this.mWidgetsCount;
            if (i8 >= i5) {
                break;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i8];
            if ((this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) && ((((i6 = this.mBarrierType) == 0 || i6 == 1) && !constraintWidget.isResolvedHorizontally()) || (((i7 = this.mBarrierType) == 2 || i7 == 3) && !constraintWidget.isResolvedVertically()))) {
                z4 = false;
            }
            i8++;
        }
        if (!z4 || i5 <= 0) {
            return false;
        }
        int i9 = 0;
        boolean z5 = false;
        for (int i10 = 0; i10 < this.mWidgetsCount; i10++) {
            ConstraintWidget constraintWidget2 = this.mWidgets[i10];
            if (this.mAllowsGoneWidget || constraintWidget2.allowedInBarrier()) {
                if (!z5) {
                    int i11 = this.mBarrierType;
                    if (i11 == 0) {
                        type3 = ConstraintAnchor.Type.LEFT;
                    } else if (i11 == 1) {
                        type3 = ConstraintAnchor.Type.RIGHT;
                    } else if (i11 == 2) {
                        type3 = ConstraintAnchor.Type.TOP;
                    } else {
                        if (i11 == 3) {
                            type3 = ConstraintAnchor.Type.BOTTOM;
                        }
                        z5 = true;
                    }
                    i9 = constraintWidget2.getAnchor(type3).getFinalValue();
                    z5 = true;
                }
                int i12 = this.mBarrierType;
                if (i12 == 0) {
                    type2 = ConstraintAnchor.Type.LEFT;
                } else {
                    if (i12 == 1) {
                        type = ConstraintAnchor.Type.RIGHT;
                    } else if (i12 == 2) {
                        type2 = ConstraintAnchor.Type.TOP;
                    } else if (i12 == 3) {
                        type = ConstraintAnchor.Type.BOTTOM;
                    }
                    i9 = Math.max(i9, constraintWidget2.getAnchor(type).getFinalValue());
                }
                i9 = Math.min(i9, constraintWidget2.getAnchor(type2).getFinalValue());
            }
        }
        int i13 = i9 + this.mMargin;
        int i14 = this.mBarrierType;
        if (i14 == 0 || i14 == 1) {
            setFinalHorizontal(i13, i13);
        } else {
            setFinalVertical(i13, i13);
        }
        this.resolved = true;
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean allowedInBarrier() {
        return true;
    }

    @Deprecated
    public boolean allowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Barrier barrier = (Barrier) constraintWidget;
        this.mBarrierType = barrier.mBarrierType;
        this.mAllowsGoneWidget = barrier.mAllowsGoneWidget;
        this.mMargin = barrier.mMargin;
    }

    public boolean getAllowsGoneWidget() {
        return this.mAllowsGoneWidget;
    }

    public int getBarrierType() {
        return this.mBarrierType;
    }

    public int getMargin() {
        return this.mMargin;
    }

    public int getOrientation() {
        int i5 = this.mBarrierType;
        if (i5 == 0 || i5 == 1) {
            return 0;
        }
        return (i5 == 2 || i5 == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedHorizontally() {
        return this.resolved;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public boolean isResolvedVertically() {
        return this.resolved;
    }

    public void markWidgets() {
        for (int i5 = 0; i5 < this.mWidgetsCount; i5++) {
            ConstraintWidget constraintWidget = this.mWidgets[i5];
            if (this.mAllowsGoneWidget || constraintWidget.allowedInBarrier()) {
                int i6 = this.mBarrierType;
                if (i6 == 0 || i6 == 1) {
                    constraintWidget.setInBarrier(0, true);
                } else if (i6 == 2 || i6 == 3) {
                    constraintWidget.setInBarrier(1, true);
                }
            }
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.mAllowsGoneWidget = z4;
    }

    public void setBarrierType(int i5) {
        this.mBarrierType = i5;
    }

    public void setMargin(int i5) {
        this.mMargin = i5;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public String toString() {
        StringBuilder g5 = d.g("[Barrier] ");
        g5.append(getDebugName());
        g5.append(" {");
        String sb = g5.toString();
        for (int i5 = 0; i5 < this.mWidgetsCount; i5++) {
            ConstraintWidget constraintWidget = this.mWidgets[i5];
            if (i5 > 0) {
                sb = d.f(sb, ", ");
            }
            StringBuilder g6 = d.g(sb);
            g6.append(constraintWidget.getDebugName());
            sb = g6.toString();
        }
        return d.f(sb, "}");
    }
}
