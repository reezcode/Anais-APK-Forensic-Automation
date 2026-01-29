package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes25.dex */
public class VerticalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1, reason: invalid class name */
    /* loaded from: classes23.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] iArr = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ConstraintReference bottomToBottom;
        ConstraintReference constraintReference;
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            ((HelperReference) this).mState.constraints(it.next()).clearVertical();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference2 = null;
        ConstraintReference constraintReference3 = null;
        while (it2.hasNext()) {
            ConstraintReference constraints = ((HelperReference) this).mState.constraints(it2.next());
            if (constraintReference3 == null) {
                Object obj = this.mTopToTop;
                if (obj != null) {
                    constraintReference = constraints.topToTop(obj);
                } else {
                    Object obj2 = this.mTopToBottom;
                    if (obj2 != null) {
                        constraintReference = constraints.topToBottom(obj2);
                    } else {
                        constraints.topToTop(State.PARENT);
                        constraintReference3 = constraints;
                    }
                }
                constraintReference.margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                constraintReference3 = constraints;
            }
            if (constraintReference2 != null) {
                constraintReference2.bottomToTop(constraints.getKey());
                constraints.topToBottom(constraintReference2.getKey());
            }
            constraintReference2 = constraints;
        }
        if (constraintReference2 != null) {
            Object obj3 = this.mBottomToTop;
            if (obj3 != null) {
                bottomToBottom = constraintReference2.bottomToTop(obj3);
            } else {
                Object obj4 = this.mBottomToBottom;
                if (obj4 != null) {
                    bottomToBottom = constraintReference2.bottomToBottom(obj4);
                } else {
                    constraintReference2.bottomToBottom(State.PARENT);
                }
            }
            bottomToBottom.margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
        }
        if (constraintReference3 == null) {
            return;
        }
        float f5 = this.mBias;
        if (f5 != 0.5f) {
            constraintReference3.verticalBias(f5);
        }
        int i5 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i5 == 1) {
            constraintReference3.setVerticalChainStyle(0);
        } else if (i5 == 2) {
            constraintReference3.setVerticalChainStyle(1);
        } else {
            if (i5 != 3) {
                return;
            }
            constraintReference3.setVerticalChainStyle(2);
        }
    }
}
