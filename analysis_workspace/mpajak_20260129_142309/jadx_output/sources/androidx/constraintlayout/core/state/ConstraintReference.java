package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import androidx.constraintlayout.core.state.helpers.Facade;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes19.dex */
public class ConstraintReference implements Reference {
    private Object key;
    private float mCircularAngle;
    private float mCircularDistance;
    private ConstraintWidget mConstraintWidget;
    private HashMap<String, Integer> mCustomColors;
    private HashMap<String, Float> mCustomFloats;
    public Dimension mHorizontalDimension;
    public final State mState;
    public Dimension mVerticalDimension;
    private Object mView;
    public String mTag = null;
    public Facade mFacade = null;
    public int mHorizontalChainStyle = 0;
    public int mVerticalChainStyle = 0;
    public float mHorizontalChainWeight = -1.0f;
    public float mVerticalChainWeight = -1.0f;
    public float mHorizontalBias = 0.5f;
    public float mVerticalBias = 0.5f;
    public int mMarginLeft = 0;
    public int mMarginRight = 0;
    public int mMarginStart = 0;
    public int mMarginEnd = 0;
    public int mMarginTop = 0;
    public int mMarginBottom = 0;
    public int mMarginLeftGone = 0;
    public int mMarginRightGone = 0;
    public int mMarginStartGone = 0;
    public int mMarginEndGone = 0;
    public int mMarginTopGone = 0;
    public int mMarginBottomGone = 0;
    public int mMarginBaseline = 0;
    public int mMarginBaselineGone = 0;
    public float mPivotX = Float.NaN;
    public float mPivotY = Float.NaN;
    public float mRotationX = Float.NaN;
    public float mRotationY = Float.NaN;
    public float mRotationZ = Float.NaN;
    public float mTranslationX = Float.NaN;
    public float mTranslationY = Float.NaN;
    public float mTranslationZ = Float.NaN;
    public float mAlpha = Float.NaN;
    public float mScaleX = Float.NaN;
    public float mScaleY = Float.NaN;
    public int mVisibility = 0;
    public Object mLeftToLeft = null;
    public Object mLeftToRight = null;
    public Object mRightToLeft = null;
    public Object mRightToRight = null;
    public Object mStartToStart = null;
    public Object mStartToEnd = null;
    public Object mEndToStart = null;
    public Object mEndToEnd = null;
    public Object mTopToTop = null;
    public Object mTopToBottom = null;
    public Object mBottomToTop = null;
    public Object mBottomToBottom = null;
    public Object mBaselineToBaseline = null;
    public Object mBaselineToTop = null;
    public Object mBaselineToBottom = null;
    public Object mCircularConstraint = null;
    public State.Constraint mLast = null;

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1, reason: invalid class name */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Constraint;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Constraint = iArr;
            try {
                iArr[State.Constraint.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Constraint[State.Constraint.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes21.dex */
    public interface ConstraintReferenceFactory {
        ConstraintReference create(State state);
    }

    /* loaded from: classes9.dex */
    public static class IncorrectConstraintException extends Exception {
        private final ArrayList<String> mErrors;

        public IncorrectConstraintException(ArrayList<String> arrayList) {
            this.mErrors = arrayList;
        }

        public ArrayList<String> getErrors() {
            return this.mErrors;
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder g5 = androidx.activity.d.g("IncorrectConstraintException: ");
            g5.append(this.mErrors.toString());
            return g5.toString();
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.WRAP_DIMENSION;
        this.mHorizontalDimension = Dimension.Fixed(obj);
        this.mVerticalDimension = Dimension.Fixed(obj);
        this.mCustomColors = new HashMap<>();
        this.mCustomFloats = new HashMap<>();
        this.mState = state;
    }

    private void applyConnection(ConstraintWidget constraintWidget, Object obj, State.Constraint constraint) {
        ConstraintAnchor.Type type;
        ConstraintAnchor anchor;
        ConstraintAnchor anchor2;
        int i5;
        int i6;
        ConstraintAnchor.Type type2;
        ConstraintAnchor.Type type3;
        ConstraintAnchor.Type type4;
        ConstraintAnchor.Type type5;
        ConstraintAnchor.Type type6;
        ConstraintAnchor.Type type7;
        ConstraintAnchor.Type type8;
        int i7;
        int i8;
        ConstraintWidget constraintWidget2;
        ConstraintWidget target = getTarget(obj);
        if (target == null) {
        }
        int[] iArr = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint;
        int i9 = iArr[constraint.ordinal()];
        switch (iArr[constraint.ordinal()]) {
            case 1:
                type = ConstraintAnchor.Type.LEFT;
                anchor = constraintWidget.getAnchor(type);
                anchor2 = target.getAnchor(type);
                i5 = this.mMarginLeft;
                i6 = this.mMarginLeftGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 2:
                anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
                type = ConstraintAnchor.Type.RIGHT;
                anchor2 = target.getAnchor(type);
                i5 = this.mMarginLeft;
                i6 = this.mMarginLeftGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 3:
                anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT);
                type2 = ConstraintAnchor.Type.LEFT;
                anchor2 = target.getAnchor(type2);
                i5 = this.mMarginRight;
                i6 = this.mMarginRightGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 4:
                type2 = ConstraintAnchor.Type.RIGHT;
                anchor = constraintWidget.getAnchor(type2);
                anchor2 = target.getAnchor(type2);
                i5 = this.mMarginRight;
                i6 = this.mMarginRightGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 5:
                type3 = ConstraintAnchor.Type.LEFT;
                anchor = constraintWidget.getAnchor(type3);
                anchor2 = target.getAnchor(type3);
                i5 = this.mMarginStart;
                i6 = this.mMarginStartGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 6:
                anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.LEFT);
                type3 = ConstraintAnchor.Type.RIGHT;
                anchor2 = target.getAnchor(type3);
                i5 = this.mMarginStart;
                i6 = this.mMarginStartGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 7:
                anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.RIGHT);
                type4 = ConstraintAnchor.Type.LEFT;
                anchor2 = target.getAnchor(type4);
                i5 = this.mMarginEnd;
                i6 = this.mMarginEndGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 8:
                type4 = ConstraintAnchor.Type.RIGHT;
                anchor = constraintWidget.getAnchor(type4);
                anchor2 = target.getAnchor(type4);
                i5 = this.mMarginEnd;
                i6 = this.mMarginEndGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 9:
                type5 = ConstraintAnchor.Type.TOP;
                anchor = constraintWidget.getAnchor(type5);
                anchor2 = target.getAnchor(type5);
                i5 = this.mMarginTop;
                i6 = this.mMarginTopGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 10:
                anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.TOP);
                type5 = ConstraintAnchor.Type.BOTTOM;
                anchor2 = target.getAnchor(type5);
                i5 = this.mMarginTop;
                i6 = this.mMarginTopGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 11:
                anchor = constraintWidget.getAnchor(ConstraintAnchor.Type.BOTTOM);
                type6 = ConstraintAnchor.Type.TOP;
                anchor2 = target.getAnchor(type6);
                i5 = this.mMarginBottom;
                i6 = this.mMarginBottomGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 12:
                type6 = ConstraintAnchor.Type.BOTTOM;
                anchor = constraintWidget.getAnchor(type6);
                anchor2 = target.getAnchor(type6);
                i5 = this.mMarginBottom;
                i6 = this.mMarginBottomGone;
                anchor.connect(anchor2, i5, i6, false);
                break;
            case 13:
                type7 = ConstraintAnchor.Type.BASELINE;
                type8 = ConstraintAnchor.Type.BOTTOM;
                i7 = this.mMarginBaseline;
                i8 = this.mMarginBaselineGone;
                constraintWidget2 = constraintWidget;
                constraintWidget2.immediateConnect(type7, target, type8, i7, i8);
                break;
            case 14:
                type7 = ConstraintAnchor.Type.BASELINE;
                type8 = ConstraintAnchor.Type.TOP;
                i7 = this.mMarginBaseline;
                i8 = this.mMarginBaselineGone;
                constraintWidget2 = constraintWidget;
                constraintWidget2.immediateConnect(type7, target, type8, i7, i8);
                break;
            case 15:
                type8 = ConstraintAnchor.Type.BASELINE;
                i7 = this.mMarginBaseline;
                i8 = this.mMarginBaselineGone;
                constraintWidget2 = constraintWidget;
                type7 = type8;
                constraintWidget2.immediateConnect(type7, target, type8, i7, i8);
                break;
            case 16:
                constraintWidget.connectCircularConstraint(target, this.mCircularAngle, (int) this.mCircularDistance);
                break;
        }
    }

    private void dereference() {
        this.mLeftToLeft = get(this.mLeftToLeft);
        this.mLeftToRight = get(this.mLeftToRight);
        this.mRightToLeft = get(this.mRightToLeft);
        this.mRightToRight = get(this.mRightToRight);
        this.mStartToStart = get(this.mStartToStart);
        this.mStartToEnd = get(this.mStartToEnd);
        this.mEndToStart = get(this.mEndToStart);
        this.mEndToEnd = get(this.mEndToEnd);
        this.mTopToTop = get(this.mTopToTop);
        this.mTopToBottom = get(this.mTopToBottom);
        this.mBottomToTop = get(this.mBottomToTop);
        this.mBottomToBottom = get(this.mBottomToBottom);
        this.mBaselineToBaseline = get(this.mBaselineToBaseline);
        this.mBaselineToTop = get(this.mBaselineToTop);
        this.mBaselineToBottom = get(this.mBaselineToBottom);
    }

    private Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof ConstraintReference) ? this.mState.reference(obj) : obj;
    }

    private ConstraintWidget getTarget(Object obj) {
        if (obj instanceof Reference) {
            return ((Reference) obj).getConstraintWidget();
        }
        return null;
    }

    public void addCustomColor(String str, int i5) {
        this.mCustomColors.put(str, Integer.valueOf(i5));
    }

    public void addCustomFloat(String str, float f5) {
        if (this.mCustomFloats == null) {
            this.mCustomFloats = new HashMap<>();
        }
        this.mCustomFloats.put(str, Float.valueOf(f5));
    }

    public ConstraintReference alpha(float f5) {
        this.mAlpha = f5;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void apply() {
        if (this.mConstraintWidget == null) {
            return;
        }
        Facade facade = this.mFacade;
        if (facade != null) {
            facade.apply();
        }
        this.mHorizontalDimension.apply(this.mState, this.mConstraintWidget, 0);
        this.mVerticalDimension.apply(this.mState, this.mConstraintWidget, 1);
        dereference();
        applyConnection(this.mConstraintWidget, this.mLeftToLeft, State.Constraint.LEFT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mLeftToRight, State.Constraint.LEFT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mRightToLeft, State.Constraint.RIGHT_TO_LEFT);
        applyConnection(this.mConstraintWidget, this.mRightToRight, State.Constraint.RIGHT_TO_RIGHT);
        applyConnection(this.mConstraintWidget, this.mStartToStart, State.Constraint.START_TO_START);
        applyConnection(this.mConstraintWidget, this.mStartToEnd, State.Constraint.START_TO_END);
        applyConnection(this.mConstraintWidget, this.mEndToStart, State.Constraint.END_TO_START);
        applyConnection(this.mConstraintWidget, this.mEndToEnd, State.Constraint.END_TO_END);
        applyConnection(this.mConstraintWidget, this.mTopToTop, State.Constraint.TOP_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mTopToBottom, State.Constraint.TOP_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBottomToTop, State.Constraint.BOTTOM_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBottomToBottom, State.Constraint.BOTTOM_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mBaselineToBaseline, State.Constraint.BASELINE_TO_BASELINE);
        applyConnection(this.mConstraintWidget, this.mBaselineToTop, State.Constraint.BASELINE_TO_TOP);
        applyConnection(this.mConstraintWidget, this.mBaselineToBottom, State.Constraint.BASELINE_TO_BOTTOM);
        applyConnection(this.mConstraintWidget, this.mCircularConstraint, State.Constraint.CIRCULAR_CONSTRAINT);
        int i5 = this.mHorizontalChainStyle;
        if (i5 != 0) {
            this.mConstraintWidget.setHorizontalChainStyle(i5);
        }
        int i6 = this.mVerticalChainStyle;
        if (i6 != 0) {
            this.mConstraintWidget.setVerticalChainStyle(i6);
        }
        float f5 = this.mHorizontalChainWeight;
        if (f5 != -1.0f) {
            this.mConstraintWidget.setHorizontalWeight(f5);
        }
        float f6 = this.mVerticalChainWeight;
        if (f6 != -1.0f) {
            this.mConstraintWidget.setVerticalWeight(f6);
        }
        this.mConstraintWidget.setHorizontalBiasPercent(this.mHorizontalBias);
        this.mConstraintWidget.setVerticalBiasPercent(this.mVerticalBias);
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        WidgetFrame widgetFrame = constraintWidget.frame;
        widgetFrame.pivotX = this.mPivotX;
        widgetFrame.pivotY = this.mPivotY;
        widgetFrame.rotationX = this.mRotationX;
        widgetFrame.rotationY = this.mRotationY;
        widgetFrame.rotationZ = this.mRotationZ;
        widgetFrame.translationX = this.mTranslationX;
        widgetFrame.translationY = this.mTranslationY;
        widgetFrame.translationZ = this.mTranslationZ;
        widgetFrame.scaleX = this.mScaleX;
        widgetFrame.scaleY = this.mScaleY;
        widgetFrame.alpha = this.mAlpha;
        int i7 = this.mVisibility;
        widgetFrame.visibility = i7;
        constraintWidget.setVisibility(i7);
        HashMap<String, Integer> hashMap = this.mCustomColors;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.mConstraintWidget.frame.setCustomAttribute(str, 902, this.mCustomColors.get(str).intValue());
            }
        }
        HashMap<String, Float> hashMap2 = this.mCustomFloats;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.mConstraintWidget.frame.setCustomAttribute(str2, 901, this.mCustomFloats.get(str2).floatValue());
            }
        }
    }

    public ConstraintReference baseline() {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        return this;
    }

    public ConstraintReference baselineToBaseline(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_BASELINE;
        this.mBaselineToBaseline = obj;
        return this;
    }

    public ConstraintReference baselineToBottom(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_BOTTOM;
        this.mBaselineToBottom = obj;
        return this;
    }

    public ConstraintReference baselineToTop(Object obj) {
        this.mLast = State.Constraint.BASELINE_TO_TOP;
        this.mBaselineToTop = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference bias(float f5) {
        State.Constraint constraint = this.mLast;
        if (constraint == null) {
            return this;
        }
        int i5 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()];
        if (i5 != 17) {
            if (i5 != 18) {
                switch (i5) {
                }
            }
            this.mVerticalBias = f5;
            return this;
        }
        this.mHorizontalBias = f5;
        return this;
    }

    public ConstraintReference bottom() {
        this.mLast = this.mBottomToTop != null ? State.Constraint.BOTTOM_TO_TOP : State.Constraint.BOTTOM_TO_BOTTOM;
        return this;
    }

    public ConstraintReference bottomToBottom(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_BOTTOM;
        this.mBottomToBottom = obj;
        return this;
    }

    public ConstraintReference bottomToTop(Object obj) {
        this.mLast = State.Constraint.BOTTOM_TO_TOP;
        this.mBottomToTop = obj;
        return this;
    }

    public ConstraintReference centerHorizontally(Object obj) {
        Object obj2 = get(obj);
        this.mStartToStart = obj2;
        this.mEndToEnd = obj2;
        this.mLast = State.Constraint.CENTER_HORIZONTALLY;
        this.mHorizontalBias = 0.5f;
        return this;
    }

    public ConstraintReference centerVertically(Object obj) {
        Object obj2 = get(obj);
        this.mTopToTop = obj2;
        this.mBottomToBottom = obj2;
        this.mLast = State.Constraint.CENTER_VERTICALLY;
        this.mVerticalBias = 0.5f;
        return this;
    }

    public ConstraintReference circularConstraint(Object obj, float f5, float f6) {
        this.mCircularConstraint = get(obj);
        this.mCircularAngle = f5;
        this.mCircularDistance = f6;
        this.mLast = State.Constraint.CIRCULAR_CONSTRAINT;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference clear() {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mLeftToLeft = null;
                    this.mLeftToRight = null;
                    this.mMarginLeft = 0;
                    this.mMarginLeftGone = 0;
                    break;
                case 3:
                case 4:
                    this.mRightToLeft = null;
                    this.mRightToRight = null;
                    this.mMarginRight = 0;
                    this.mMarginRightGone = 0;
                    break;
                case 5:
                case 6:
                    this.mStartToStart = null;
                    this.mStartToEnd = null;
                    this.mMarginStart = 0;
                    this.mMarginStartGone = 0;
                    break;
                case 7:
                case 8:
                    this.mEndToStart = null;
                    this.mEndToEnd = null;
                    this.mMarginEnd = 0;
                    this.mMarginEndGone = 0;
                    break;
                case 9:
                case 10:
                    this.mTopToTop = null;
                    this.mTopToBottom = null;
                    this.mMarginTop = 0;
                    this.mMarginTopGone = 0;
                    break;
                case 11:
                case 12:
                    this.mBottomToTop = null;
                    this.mBottomToBottom = null;
                    this.mMarginBottom = 0;
                    break;
                case 15:
                    this.mBaselineToBaseline = null;
                    break;
                case 16:
                    this.mCircularConstraint = null;
                    break;
            }
        } else {
            this.mLeftToLeft = null;
            this.mLeftToRight = null;
            this.mMarginLeft = 0;
            this.mRightToLeft = null;
            this.mRightToRight = null;
            this.mMarginRight = 0;
            this.mStartToStart = null;
            this.mStartToEnd = null;
            this.mMarginStart = 0;
            this.mEndToStart = null;
            this.mEndToEnd = null;
            this.mMarginEnd = 0;
            this.mTopToTop = null;
            this.mTopToBottom = null;
            this.mMarginTop = 0;
            this.mBottomToTop = null;
            this.mBottomToBottom = null;
            this.mMarginBottom = 0;
            this.mBaselineToBaseline = null;
            this.mCircularConstraint = null;
            this.mHorizontalBias = 0.5f;
            this.mVerticalBias = 0.5f;
            this.mMarginLeftGone = 0;
            this.mMarginRightGone = 0;
            this.mMarginStartGone = 0;
            this.mMarginEndGone = 0;
            this.mMarginTopGone = 0;
        }
        this.mMarginBottomGone = 0;
        return this;
    }

    public ConstraintReference clearHorizontal() {
        start().clear();
        end().clear();
        left().clear();
        right().clear();
        return this;
    }

    public ConstraintReference clearVertical() {
        top().clear();
        baseline().clear();
        bottom().clear();
        return this;
    }

    public ConstraintWidget createConstraintWidget() {
        return new ConstraintWidget(getWidth().getValue(), getHeight().getValue());
    }

    public ConstraintReference end() {
        this.mLast = this.mEndToStart != null ? State.Constraint.END_TO_START : State.Constraint.END_TO_END;
        return this;
    }

    public ConstraintReference endToEnd(Object obj) {
        this.mLast = State.Constraint.END_TO_END;
        this.mEndToEnd = obj;
        return this;
    }

    public ConstraintReference endToStart(Object obj) {
        this.mLast = State.Constraint.END_TO_START;
        this.mEndToStart = obj;
        return this;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public ConstraintWidget getConstraintWidget() {
        if (this.mConstraintWidget == null) {
            ConstraintWidget createConstraintWidget = createConstraintWidget();
            this.mConstraintWidget = createConstraintWidget;
            createConstraintWidget.setCompanionWidget(this.mView);
        }
        return this.mConstraintWidget;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Facade getFacade() {
        return this.mFacade;
    }

    public Dimension getHeight() {
        return this.mVerticalDimension;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public float getHorizontalChainWeight() {
        return this.mHorizontalChainWeight;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public Object getKey() {
        return this.key;
    }

    public float getPivotX() {
        return this.mPivotX;
    }

    public float getPivotY() {
        return this.mPivotY;
    }

    public float getRotationX() {
        return this.mRotationX;
    }

    public float getRotationY() {
        return this.mRotationY;
    }

    public float getRotationZ() {
        return this.mRotationZ;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public String getTag() {
        return this.mTag;
    }

    public float getTranslationX() {
        return this.mTranslationX;
    }

    public float getTranslationY() {
        return this.mTranslationY;
    }

    public float getTranslationZ() {
        return this.mTranslationZ;
    }

    public int getVerticalChainStyle(int i5) {
        return this.mVerticalChainStyle;
    }

    public float getVerticalChainWeight() {
        return this.mVerticalChainWeight;
    }

    public Object getView() {
        return this.mView;
    }

    public Dimension getWidth() {
        return this.mHorizontalDimension;
    }

    public ConstraintReference height(Dimension dimension) {
        return setHeight(dimension);
    }

    public ConstraintReference horizontalBias(float f5) {
        this.mHorizontalBias = f5;
        return this;
    }

    public ConstraintReference left() {
        this.mLast = this.mLeftToLeft != null ? State.Constraint.LEFT_TO_LEFT : State.Constraint.LEFT_TO_RIGHT;
        return this;
    }

    public ConstraintReference leftToLeft(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_LEFT;
        this.mLeftToLeft = obj;
        return this;
    }

    public ConstraintReference leftToRight(Object obj) {
        this.mLast = State.Constraint.LEFT_TO_RIGHT;
        this.mLeftToRight = obj;
        return this;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference margin(int i5) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeft = i5;
                    break;
                case 3:
                case 4:
                    this.mMarginRight = i5;
                    break;
                case 5:
                case 6:
                    this.mMarginStart = i5;
                    break;
                case 7:
                case 8:
                    this.mMarginEnd = i5;
                    break;
                case 9:
                case 10:
                    this.mMarginTop = i5;
                    break;
                case 13:
                case 14:
                case 15:
                    this.mMarginBaseline = i5;
                    break;
                case 16:
                    this.mCircularDistance = i5;
                    break;
            }
        } else {
            this.mMarginLeft = i5;
            this.mMarginRight = i5;
            this.mMarginStart = i5;
            this.mMarginEnd = i5;
            this.mMarginTop = i5;
        }
        this.mMarginBottom = i5;
        return this;
    }

    public ConstraintReference margin(Object obj) {
        return margin(this.mState.convertDimension(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public ConstraintReference marginGone(int i5) {
        State.Constraint constraint = this.mLast;
        if (constraint != null) {
            switch (AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$state$State$Constraint[constraint.ordinal()]) {
                case 1:
                case 2:
                    this.mMarginLeftGone = i5;
                    break;
                case 3:
                case 4:
                    this.mMarginRightGone = i5;
                    break;
                case 5:
                case 6:
                    this.mMarginStartGone = i5;
                    break;
                case 7:
                case 8:
                    this.mMarginEndGone = i5;
                    break;
                case 9:
                case 10:
                    this.mMarginTopGone = i5;
                    break;
                case 13:
                case 14:
                case 15:
                    this.mMarginBaselineGone = i5;
                    break;
            }
        } else {
            this.mMarginLeftGone = i5;
            this.mMarginRightGone = i5;
            this.mMarginStartGone = i5;
            this.mMarginEndGone = i5;
            this.mMarginTopGone = i5;
        }
        this.mMarginBottomGone = i5;
        return this;
    }

    public ConstraintReference marginGone(Object obj) {
        return marginGone(this.mState.convertDimension(obj));
    }

    public ConstraintReference pivotX(float f5) {
        this.mPivotX = f5;
        return this;
    }

    public ConstraintReference pivotY(float f5) {
        this.mPivotY = f5;
        return this;
    }

    public ConstraintReference right() {
        this.mLast = this.mRightToLeft != null ? State.Constraint.RIGHT_TO_LEFT : State.Constraint.RIGHT_TO_RIGHT;
        return this;
    }

    public ConstraintReference rightToLeft(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_LEFT;
        this.mRightToLeft = obj;
        return this;
    }

    public ConstraintReference rightToRight(Object obj) {
        this.mLast = State.Constraint.RIGHT_TO_RIGHT;
        this.mRightToRight = obj;
        return this;
    }

    public ConstraintReference rotationX(float f5) {
        this.mRotationX = f5;
        return this;
    }

    public ConstraintReference rotationY(float f5) {
        this.mRotationY = f5;
        return this;
    }

    public ConstraintReference rotationZ(float f5) {
        this.mRotationZ = f5;
        return this;
    }

    public ConstraintReference scaleX(float f5) {
        this.mScaleX = f5;
        return this;
    }

    public ConstraintReference scaleY(float f5) {
        this.mScaleY = f5;
        return this;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setConstraintWidget(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return;
        }
        this.mConstraintWidget = constraintWidget;
        constraintWidget.setCompanionWidget(this.mView);
    }

    public void setFacade(Facade facade) {
        this.mFacade = facade;
        if (facade != null) {
            setConstraintWidget(facade.getConstraintWidget());
        }
    }

    public ConstraintReference setHeight(Dimension dimension) {
        this.mVerticalDimension = dimension;
        return this;
    }

    public void setHorizontalChainStyle(int i5) {
        this.mHorizontalChainStyle = i5;
    }

    public void setHorizontalChainWeight(float f5) {
        this.mHorizontalChainWeight = f5;
    }

    @Override // androidx.constraintlayout.core.state.Reference
    public void setKey(Object obj) {
        this.key = obj;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void setVerticalChainStyle(int i5) {
        this.mVerticalChainStyle = i5;
    }

    public void setVerticalChainWeight(float f5) {
        this.mVerticalChainWeight = f5;
    }

    public void setView(Object obj) {
        this.mView = obj;
        ConstraintWidget constraintWidget = this.mConstraintWidget;
        if (constraintWidget != null) {
            constraintWidget.setCompanionWidget(obj);
        }
    }

    public ConstraintReference setWidth(Dimension dimension) {
        this.mHorizontalDimension = dimension;
        return this;
    }

    public ConstraintReference start() {
        this.mLast = this.mStartToStart != null ? State.Constraint.START_TO_START : State.Constraint.START_TO_END;
        return this;
    }

    public ConstraintReference startToEnd(Object obj) {
        this.mLast = State.Constraint.START_TO_END;
        this.mStartToEnd = obj;
        return this;
    }

    public ConstraintReference startToStart(Object obj) {
        this.mLast = State.Constraint.START_TO_START;
        this.mStartToStart = obj;
        return this;
    }

    public ConstraintReference top() {
        this.mLast = this.mTopToTop != null ? State.Constraint.TOP_TO_TOP : State.Constraint.TOP_TO_BOTTOM;
        return this;
    }

    public ConstraintReference topToBottom(Object obj) {
        this.mLast = State.Constraint.TOP_TO_BOTTOM;
        this.mTopToBottom = obj;
        return this;
    }

    public ConstraintReference topToTop(Object obj) {
        this.mLast = State.Constraint.TOP_TO_TOP;
        this.mTopToTop = obj;
        return this;
    }

    public ConstraintReference translationX(float f5) {
        this.mTranslationX = f5;
        return this;
    }

    public ConstraintReference translationY(float f5) {
        this.mTranslationY = f5;
        return this;
    }

    public ConstraintReference translationZ(float f5) {
        this.mTranslationZ = f5;
        return this;
    }

    public void validate() {
        ArrayList arrayList = new ArrayList();
        if (this.mLeftToLeft != null && this.mLeftToRight != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.mRightToLeft != null && this.mRightToRight != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.mStartToStart != null && this.mStartToEnd != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.mEndToStart != null && this.mEndToEnd != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.mLeftToLeft != null || this.mLeftToRight != null || this.mRightToLeft != null || this.mRightToRight != null) && (this.mStartToStart != null || this.mStartToEnd != null || this.mEndToStart != null || this.mEndToEnd != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new IncorrectConstraintException(arrayList);
        }
    }

    public ConstraintReference verticalBias(float f5) {
        this.mVerticalBias = f5;
        return this;
    }

    public ConstraintReference visibility(int i5) {
        this.mVisibility = i5;
        return this;
    }

    public ConstraintReference width(Dimension dimension) {
        return setWidth(dimension);
    }
}
