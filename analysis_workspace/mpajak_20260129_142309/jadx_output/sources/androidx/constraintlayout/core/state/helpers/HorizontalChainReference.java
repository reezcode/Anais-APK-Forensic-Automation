package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class HorizontalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.HorizontalChainReference$1, reason: invalid class name */
    /* loaded from: classes3.dex */
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

    public HorizontalChainReference(State state) {
        super(state, State.Helper.HORIZONTAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ConstraintReference endToEnd;
        ConstraintReference margin;
        int i5;
        ConstraintReference endToEnd2;
        ConstraintReference startToEnd;
        ConstraintReference margin2;
        int i6;
        ConstraintReference startToEnd2;
        Iterator<Object> it = this.mReferences.iterator();
        while (it.hasNext()) {
            ((HelperReference) this).mState.constraints(it.next()).clearHorizontal();
        }
        Iterator<Object> it2 = this.mReferences.iterator();
        ConstraintReference constraintReference = null;
        ConstraintReference constraintReference2 = null;
        while (it2.hasNext()) {
            ConstraintReference constraints = ((HelperReference) this).mState.constraints(it2.next());
            if (constraintReference2 == null) {
                Object obj = this.mStartToStart;
                if (obj != null) {
                    startToEnd2 = constraints.startToStart(obj);
                } else {
                    Object obj2 = this.mStartToEnd;
                    if (obj2 != null) {
                        startToEnd2 = constraints.startToEnd(obj2);
                    } else {
                        Object obj3 = this.mLeftToLeft;
                        if (obj3 != null) {
                            startToEnd = constraints.startToStart(obj3);
                        } else {
                            Object obj4 = this.mLeftToRight;
                            if (obj4 != null) {
                                startToEnd = constraints.startToEnd(obj4);
                            } else {
                                constraints.startToStart(State.PARENT);
                                constraintReference2 = constraints;
                            }
                        }
                        margin2 = startToEnd.margin(this.mMarginLeft);
                        i6 = this.mMarginLeftGone;
                        margin2.marginGone(i6);
                        constraintReference2 = constraints;
                    }
                }
                margin2 = startToEnd2.margin(this.mMarginStart);
                i6 = this.mMarginStartGone;
                margin2.marginGone(i6);
                constraintReference2 = constraints;
            }
            if (constraintReference != null) {
                constraintReference.endToStart(constraints.getKey());
                constraints.startToEnd(constraintReference.getKey());
            }
            constraintReference = constraints;
        }
        if (constraintReference != null) {
            Object obj5 = this.mEndToStart;
            if (obj5 != null) {
                endToEnd2 = constraintReference.endToStart(obj5);
            } else {
                Object obj6 = this.mEndToEnd;
                if (obj6 != null) {
                    endToEnd2 = constraintReference.endToEnd(obj6);
                } else {
                    Object obj7 = this.mRightToLeft;
                    if (obj7 != null) {
                        endToEnd = constraintReference.endToStart(obj7);
                    } else {
                        Object obj8 = this.mRightToRight;
                        if (obj8 != null) {
                            endToEnd = constraintReference.endToEnd(obj8);
                        } else {
                            constraintReference.endToEnd(State.PARENT);
                        }
                    }
                    margin = endToEnd.margin(this.mMarginRight);
                    i5 = this.mMarginRightGone;
                    margin.marginGone(i5);
                }
            }
            margin = endToEnd2.margin(this.mMarginEnd);
            i5 = this.mMarginEndGone;
            margin.marginGone(i5);
        }
        if (constraintReference2 == null) {
            return;
        }
        float f5 = this.mBias;
        if (f5 != 0.5f) {
            constraintReference2.horizontalBias(f5);
        }
        int i7 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i7 == 1) {
            constraintReference2.setHorizontalChainStyle(0);
        } else if (i7 == 2) {
            constraintReference2.setHorizontalChainStyle(1);
        } else {
            if (i7 != 3) {
                return;
            }
            constraintReference2.setHorizontalChainStyle(2);
        }
    }
}
