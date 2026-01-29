package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes22.dex */
public class Flow extends VirtualLayout {
    public static final int HORIZONTAL_ALIGN_CENTER = 2;
    public static final int HORIZONTAL_ALIGN_END = 1;
    public static final int HORIZONTAL_ALIGN_START = 0;
    public static final int VERTICAL_ALIGN_BASELINE = 3;
    public static final int VERTICAL_ALIGN_BOTTOM = 1;
    public static final int VERTICAL_ALIGN_CENTER = 2;
    public static final int VERTICAL_ALIGN_TOP = 0;
    public static final int WRAP_ALIGNED = 2;
    public static final int WRAP_CHAIN = 1;
    public static final int WRAP_CHAIN_NEW = 3;
    public static final int WRAP_NONE = 0;
    private ConstraintWidget[] mDisplayedWidgets;
    private int mHorizontalStyle = -1;
    private int mVerticalStyle = -1;
    private int mFirstHorizontalStyle = -1;
    private int mFirstVerticalStyle = -1;
    private int mLastHorizontalStyle = -1;
    private int mLastVerticalStyle = -1;
    private float mHorizontalBias = 0.5f;
    private float mVerticalBias = 0.5f;
    private float mFirstHorizontalBias = 0.5f;
    private float mFirstVerticalBias = 0.5f;
    private float mLastHorizontalBias = 0.5f;
    private float mLastVerticalBias = 0.5f;
    private int mHorizontalGap = 0;
    private int mVerticalGap = 0;
    private int mHorizontalAlign = 2;
    private int mVerticalAlign = 2;
    private int mWrapMode = 0;
    private int mMaxElementsWrap = -1;
    private int mOrientation = 0;
    private ArrayList<WidgetsList> mChainList = new ArrayList<>();
    private ConstraintWidget[] mAlignedBiggestElementsInRows = null;
    private ConstraintWidget[] mAlignedBiggestElementsInCols = null;
    private int[] mAlignedDimensions = null;
    private int mDisplayedWidgetsCount = 0;

    /* loaded from: classes13.dex */
    public class WidgetsList {
        private ConstraintAnchor mBottom;
        private ConstraintAnchor mLeft;
        private int mMax;
        private int mOrientation;
        private int mPaddingBottom;
        private int mPaddingLeft;
        private int mPaddingRight;
        private int mPaddingTop;
        private ConstraintAnchor mRight;
        private ConstraintAnchor mTop;
        private ConstraintWidget biggest = null;
        public int biggestDimension = 0;
        private int mWidth = 0;
        private int mHeight = 0;
        private int mStartIndex = 0;
        private int mCount = 0;
        private int mNbMatchConstraintsWidgets = 0;

        public WidgetsList(int i5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i6) {
            this.mPaddingLeft = 0;
            this.mPaddingTop = 0;
            this.mPaddingRight = 0;
            this.mPaddingBottom = 0;
            this.mMax = 0;
            this.mOrientation = i5;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = Flow.this.getPaddingLeft();
            this.mPaddingTop = Flow.this.getPaddingTop();
            this.mPaddingRight = Flow.this.getPaddingRight();
            this.mPaddingBottom = Flow.this.getPaddingBottom();
            this.mMax = i6;
        }

        private void recomputeDimensions() {
            this.mWidth = 0;
            this.mHeight = 0;
            this.biggest = null;
            this.biggestDimension = 0;
            int i5 = this.mCount;
            for (int i6 = 0; i6 < i5 && this.mStartIndex + i6 < Flow.this.mDisplayedWidgetsCount; i6++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i6];
                if (this.mOrientation == 0) {
                    int width = constraintWidget.getWidth();
                    int i7 = Flow.this.mHorizontalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i7 = 0;
                    }
                    this.mWidth = width + i7 + this.mWidth;
                    int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    if (this.biggest == null || this.biggestDimension < widgetHeight) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetHeight;
                        this.mHeight = widgetHeight;
                    }
                } else {
                    int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                    int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                    int i8 = Flow.this.mVerticalGap;
                    if (constraintWidget.getVisibility() == 8) {
                        i8 = 0;
                    }
                    this.mHeight = widgetHeight2 + i8 + this.mHeight;
                    if (this.biggest == null || this.biggestDimension < widgetWidth) {
                        this.biggest = constraintWidget;
                        this.biggestDimension = widgetWidth;
                        this.mWidth = widgetWidth;
                    }
                }
            }
        }

        public void add(ConstraintWidget constraintWidget) {
            if (this.mOrientation == 0) {
                int widgetWidth = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetWidth = 0;
                }
                this.mWidth = widgetWidth + (constraintWidget.getVisibility() != 8 ? Flow.this.mHorizontalGap : 0) + this.mWidth;
                int widgetHeight = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (this.biggest == null || this.biggestDimension < widgetHeight) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetHeight;
                    this.mHeight = widgetHeight;
                }
            } else {
                int widgetWidth2 = Flow.this.getWidgetWidth(constraintWidget, this.mMax);
                int widgetHeight2 = Flow.this.getWidgetHeight(constraintWidget, this.mMax);
                if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.mNbMatchConstraintsWidgets++;
                    widgetHeight2 = 0;
                }
                this.mHeight = widgetHeight2 + (constraintWidget.getVisibility() != 8 ? Flow.this.mVerticalGap : 0) + this.mHeight;
                if (this.biggest == null || this.biggestDimension < widgetWidth2) {
                    this.biggest = constraintWidget;
                    this.biggestDimension = widgetWidth2;
                    this.mWidth = widgetWidth2;
                }
            }
            this.mCount++;
        }

        public void clear() {
            this.biggestDimension = 0;
            this.biggest = null;
            this.mWidth = 0;
            this.mHeight = 0;
            this.mStartIndex = 0;
            this.mCount = 0;
            this.mNbMatchConstraintsWidgets = 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:154:0x026d  */
        /* JADX WARN: Removed duplicated region for block: B:157:0x0270  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void createConstraints(boolean r17, int r18, boolean r19) {
            /*
                Method dump skipped, instructions count: 850
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.WidgetsList.createConstraints(boolean, int, boolean):void");
        }

        public int getHeight() {
            return this.mOrientation == 1 ? this.mHeight - Flow.this.mVerticalGap : this.mHeight;
        }

        public int getWidth() {
            return this.mOrientation == 0 ? this.mWidth - Flow.this.mHorizontalGap : this.mWidth;
        }

        public void measureMatchConstraints(int i5) {
            Flow flow;
            ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour;
            int width;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            int i6;
            int i7 = this.mNbMatchConstraintsWidgets;
            if (i7 == 0) {
                return;
            }
            int i8 = this.mCount;
            int i9 = i5 / i7;
            for (int i10 = 0; i10 < i8 && this.mStartIndex + i10 < Flow.this.mDisplayedWidgetsCount; i10++) {
                ConstraintWidget constraintWidget = Flow.this.mDisplayedWidgets[this.mStartIndex + i10];
                if (this.mOrientation == 0) {
                    if (constraintWidget != null && constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultWidth == 0) {
                        flow = Flow.this;
                        horizontalDimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                        dimensionBehaviour = constraintWidget.getVerticalDimensionBehaviour();
                        i6 = constraintWidget.getHeight();
                        width = i9;
                        flow.measure(constraintWidget, horizontalDimensionBehaviour, width, dimensionBehaviour, i6);
                    }
                } else {
                    if (constraintWidget != null && constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.mMatchConstraintDefaultHeight == 0) {
                        flow = Flow.this;
                        horizontalDimensionBehaviour = constraintWidget.getHorizontalDimensionBehaviour();
                        width = constraintWidget.getWidth();
                        dimensionBehaviour = ConstraintWidget.DimensionBehaviour.FIXED;
                        i6 = i9;
                        flow.measure(constraintWidget, horizontalDimensionBehaviour, width, dimensionBehaviour, i6);
                    }
                }
            }
            recomputeDimensions();
        }

        public void setStartIndex(int i5) {
            this.mStartIndex = i5;
        }

        public void setup(int i5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i6, int i7, int i8, int i9, int i10) {
            this.mOrientation = i5;
            this.mLeft = constraintAnchor;
            this.mTop = constraintAnchor2;
            this.mRight = constraintAnchor3;
            this.mBottom = constraintAnchor4;
            this.mPaddingLeft = i6;
            this.mPaddingTop = i7;
            this.mPaddingRight = i8;
            this.mPaddingBottom = i9;
            this.mMax = i10;
        }
    }

    private void createAlignedConstraints(boolean z4) {
        ConstraintWidget constraintWidget;
        float f5;
        int i5;
        if (this.mAlignedDimensions == null || this.mAlignedBiggestElementsInCols == null || this.mAlignedBiggestElementsInRows == null) {
            return;
        }
        for (int i6 = 0; i6 < this.mDisplayedWidgetsCount; i6++) {
            this.mDisplayedWidgets[i6].resetAnchors();
        }
        int[] iArr = this.mAlignedDimensions;
        int i7 = iArr[0];
        int i8 = iArr[1];
        ConstraintWidget constraintWidget2 = null;
        float f6 = this.mHorizontalBias;
        int i9 = 0;
        while (i9 < i7) {
            if (z4) {
                i5 = (i7 - i9) - 1;
                f5 = 1.0f - this.mHorizontalBias;
            } else {
                f5 = f6;
                i5 = i9;
            }
            ConstraintWidget constraintWidget3 = this.mAlignedBiggestElementsInCols[i5];
            if (constraintWidget3 != null && constraintWidget3.getVisibility() != 8) {
                if (i9 == 0) {
                    constraintWidget3.connect(constraintWidget3.mLeft, this.mLeft, getPaddingLeft());
                    constraintWidget3.setHorizontalChainStyle(this.mHorizontalStyle);
                    constraintWidget3.setHorizontalBiasPercent(f5);
                }
                if (i9 == i7 - 1) {
                    constraintWidget3.connect(constraintWidget3.mRight, this.mRight, getPaddingRight());
                }
                if (i9 > 0 && constraintWidget2 != null) {
                    constraintWidget3.connect(constraintWidget3.mLeft, constraintWidget2.mRight, this.mHorizontalGap);
                    constraintWidget2.connect(constraintWidget2.mRight, constraintWidget3.mLeft, 0);
                }
                constraintWidget2 = constraintWidget3;
            }
            i9++;
            f6 = f5;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            ConstraintWidget constraintWidget4 = this.mAlignedBiggestElementsInRows[i10];
            if (constraintWidget4 != null && constraintWidget4.getVisibility() != 8) {
                if (i10 == 0) {
                    constraintWidget4.connect(constraintWidget4.mTop, this.mTop, getPaddingTop());
                    constraintWidget4.setVerticalChainStyle(this.mVerticalStyle);
                    constraintWidget4.setVerticalBiasPercent(this.mVerticalBias);
                }
                if (i10 == i8 - 1) {
                    constraintWidget4.connect(constraintWidget4.mBottom, this.mBottom, getPaddingBottom());
                }
                if (i10 > 0 && constraintWidget2 != null) {
                    constraintWidget4.connect(constraintWidget4.mTop, constraintWidget2.mBottom, this.mVerticalGap);
                    constraintWidget2.connect(constraintWidget2.mBottom, constraintWidget4.mTop, 0);
                }
                constraintWidget2 = constraintWidget4;
            }
        }
        for (int i11 = 0; i11 < i7; i11++) {
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = (i12 * i7) + i11;
                if (this.mOrientation == 1) {
                    i13 = (i11 * i8) + i12;
                }
                ConstraintWidget[] constraintWidgetArr = this.mDisplayedWidgets;
                if (i13 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i13]) != null && constraintWidget.getVisibility() != 8) {
                    ConstraintWidget constraintWidget5 = this.mAlignedBiggestElementsInCols[i11];
                    ConstraintWidget constraintWidget6 = this.mAlignedBiggestElementsInRows[i12];
                    if (constraintWidget != constraintWidget5) {
                        constraintWidget.connect(constraintWidget.mLeft, constraintWidget5.mLeft, 0);
                        constraintWidget.connect(constraintWidget.mRight, constraintWidget5.mRight, 0);
                    }
                    if (constraintWidget != constraintWidget6) {
                        constraintWidget.connect(constraintWidget.mTop, constraintWidget6.mTop, 0);
                        constraintWidget.connect(constraintWidget.mBottom, constraintWidget6.mBottom, 0);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetHeight(ConstraintWidget constraintWidget, int i5) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i6 = constraintWidget.mMatchConstraintDefaultHeight;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (constraintWidget.mMatchConstraintPercentHeight * i5);
                if (i7 != constraintWidget.getHeight()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, constraintWidget.getHorizontalDimensionBehaviour(), constraintWidget.getWidth(), ConstraintWidget.DimensionBehaviour.FIXED, i7);
                }
                return i7;
            }
            if (i6 == 1) {
                return constraintWidget.getHeight();
            }
            if (i6 == 3) {
                return (int) ((constraintWidget.getWidth() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getWidgetWidth(ConstraintWidget constraintWidget, int i5) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i6 = constraintWidget.mMatchConstraintDefaultWidth;
            if (i6 == 0) {
                return 0;
            }
            if (i6 == 2) {
                int i7 = (int) (constraintWidget.mMatchConstraintPercentWidth * i5);
                if (i7 != constraintWidget.getWidth()) {
                    constraintWidget.setMeasureRequested(true);
                    measure(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i7, constraintWidget.getVerticalDimensionBehaviour(), constraintWidget.getHeight());
                }
                return i7;
            }
            if (i6 == 1) {
                return constraintWidget.getWidth();
            }
            if (i6 == 3) {
                return (int) ((constraintWidget.getHeight() * constraintWidget.mDimensionRatio) + 0.5f);
            }
        }
        return constraintWidget.getWidth();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0119 -> B:21:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x011b -> B:21:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0121 -> B:21:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0123 -> B:21:0x0061). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[] r17, int r18, int r19, int r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measureAligned(androidx.constraintlayout.core.widgets.ConstraintWidget[], int, int, int, int[]):void");
    }

    private void measureChainWrap(ConstraintWidget[] constraintWidgetArr, int i5, int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i10;
        if (i5 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
        this.mChainList.add(widgetsList);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        if (i6 == 0) {
            while (i13 < i5) {
                ConstraintWidget constraintWidget = constraintWidgetArr[i13];
                int widgetWidth = getWidgetWidth(constraintWidget, i7);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i14 = i11;
                boolean z4 = (i12 == i7 || (this.mHorizontalGap + i12) + widgetWidth > i7) && widgetsList.biggest != null;
                if (!z4 && i13 > 0 && (i10 = this.mMaxElementsWrap) > 0 && i13 % i10 == 0) {
                    z4 = true;
                }
                if (z4) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i13);
                    this.mChainList.add(widgetsList);
                } else if (i13 > 0) {
                    i12 = this.mHorizontalGap + widgetWidth + i12;
                    widgetsList.add(constraintWidget);
                    i13++;
                    i11 = i14;
                }
                i12 = widgetWidth;
                widgetsList.add(constraintWidget);
                i13++;
                i11 = i14;
            }
        } else {
            while (i13 < i5) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i13];
                int widgetHeight = getWidgetHeight(constraintWidget2, i7);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i11++;
                }
                int i15 = i11;
                boolean z5 = (i12 == i7 || (this.mVerticalGap + i12) + widgetHeight > i7) && widgetsList.biggest != null;
                if (!z5 && i13 > 0 && (i8 = this.mMaxElementsWrap) > 0 && i13 % i8 == 0) {
                    z5 = true;
                }
                if (z5) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i13);
                    this.mChainList.add(widgetsList);
                } else if (i13 > 0) {
                    i12 = this.mVerticalGap + widgetHeight + i12;
                    widgetsList.add(constraintWidget2);
                    i13++;
                    i11 = i15;
                }
                i12 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i13++;
                i11 = i15;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z6 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i11 > 0 && z6) {
            for (int i16 = 0; i16 < size; i16++) {
                WidgetsList widgetsList2 = this.mChainList.get(i16);
                widgetsList2.measureMatchConstraints(i7 - (i6 == 0 ? widgetsList2.getWidth() : widgetsList2.getHeight()));
            }
        }
        int i17 = paddingTop;
        int i18 = paddingRight2;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i23 = paddingBottom2;
        while (i21 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i21);
            if (i6 == 0) {
                if (i21 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i21 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i24 = i19;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i25 = i20;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i9 = i21;
                widgetsList3.setup(i6, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i22, i17, i18, paddingBottom, i7);
                int max = Math.max(i25, widgetsList3.getWidth());
                i19 = i24 + widgetsList3.getHeight();
                if (i9 > 0) {
                    i19 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i20 = max;
                constraintAnchor7 = constraintAnchor9;
                i17 = 0;
                constraintAnchor = constraintAnchor14;
                int i26 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i23 = i26;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i27 = i19;
                int i28 = i20;
                i9 = i21;
                if (i9 < size - 1) {
                    constraintAnchor = this.mChainList.get(i9 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i6, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i22, i17, paddingRight, i23, i7);
                i20 = i28 + widgetsList3.getWidth();
                int max2 = Math.max(i27, widgetsList3.getHeight());
                if (i9 > 0) {
                    i20 += this.mHorizontalGap;
                }
                i19 = max2;
                i18 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i22 = 0;
            }
            i21 = i9 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i20;
        iArr[1] = i19;
    }

    private void measureChainWrap_new(ConstraintWidget[] constraintWidgetArr, int i5, int i6, int i7, int[] iArr) {
        int i8;
        int i9;
        ConstraintAnchor constraintAnchor;
        int paddingRight;
        ConstraintAnchor constraintAnchor2;
        int paddingBottom;
        int i10;
        if (i5 == 0) {
            return;
        }
        this.mChainList.clear();
        WidgetsList widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
        this.mChainList.add(widgetsList);
        int i11 = 0;
        int i12 = 0;
        if (i6 == 0) {
            int i13 = 0;
            int i14 = 0;
            while (i14 < i5) {
                int i15 = i11 + 1;
                ConstraintWidget constraintWidget = constraintWidgetArr[i14];
                int widgetWidth = getWidgetWidth(constraintWidget, i7);
                if (constraintWidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i16 = i12;
                boolean z4 = (i13 == i7 || (this.mHorizontalGap + i13) + widgetWidth > i7) && widgetsList.biggest != null;
                if (!z4 && i14 > 0 && (i10 = this.mMaxElementsWrap) > 0 && i15 > i10) {
                    z4 = true;
                }
                if (z4) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i14);
                    this.mChainList.add(widgetsList);
                    i11 = i15;
                    i13 = widgetWidth;
                } else {
                    i13 = i14 > 0 ? this.mHorizontalGap + widgetWidth + i13 : widgetWidth;
                    i11 = 0;
                }
                widgetsList.add(constraintWidget);
                i14++;
                i12 = i16;
            }
        } else {
            int i17 = 0;
            while (i17 < i5) {
                ConstraintWidget constraintWidget2 = constraintWidgetArr[i17];
                int widgetHeight = getWidgetHeight(constraintWidget2, i7);
                if (constraintWidget2.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    i12++;
                }
                int i18 = i12;
                boolean z5 = (i11 == i7 || (this.mVerticalGap + i11) + widgetHeight > i7) && widgetsList.biggest != null;
                if (!z5 && i17 > 0 && (i8 = this.mMaxElementsWrap) > 0 && i8 < 0) {
                    z5 = true;
                }
                if (z5) {
                    widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
                    widgetsList.setStartIndex(i17);
                    this.mChainList.add(widgetsList);
                } else if (i17 > 0) {
                    i11 = this.mVerticalGap + widgetHeight + i11;
                    widgetsList.add(constraintWidget2);
                    i17++;
                    i12 = i18;
                }
                i11 = widgetHeight;
                widgetsList.add(constraintWidget2);
                i17++;
                i12 = i18;
            }
        }
        int size = this.mChainList.size();
        ConstraintAnchor constraintAnchor3 = this.mLeft;
        ConstraintAnchor constraintAnchor4 = this.mTop;
        ConstraintAnchor constraintAnchor5 = this.mRight;
        ConstraintAnchor constraintAnchor6 = this.mBottom;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight2 = getPaddingRight();
        int paddingBottom2 = getPaddingBottom();
        ConstraintWidget.DimensionBehaviour horizontalDimensionBehaviour = getHorizontalDimensionBehaviour();
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z6 = horizontalDimensionBehaviour == dimensionBehaviour || getVerticalDimensionBehaviour() == dimensionBehaviour;
        if (i12 > 0 && z6) {
            for (int i19 = 0; i19 < size; i19++) {
                WidgetsList widgetsList2 = this.mChainList.get(i19);
                widgetsList2.measureMatchConstraints(i7 - (i6 == 0 ? widgetsList2.getWidth() : widgetsList2.getHeight()));
            }
        }
        int i20 = paddingTop;
        int i21 = paddingRight2;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = paddingLeft;
        ConstraintAnchor constraintAnchor7 = constraintAnchor4;
        ConstraintAnchor constraintAnchor8 = constraintAnchor3;
        int i26 = paddingBottom2;
        while (i24 < size) {
            WidgetsList widgetsList3 = this.mChainList.get(i24);
            if (i6 == 0) {
                if (i24 < size - 1) {
                    constraintAnchor2 = this.mChainList.get(i24 + 1).biggest.mTop;
                    paddingBottom = 0;
                } else {
                    constraintAnchor2 = this.mBottom;
                    paddingBottom = getPaddingBottom();
                }
                ConstraintAnchor constraintAnchor9 = widgetsList3.biggest.mBottom;
                ConstraintAnchor constraintAnchor10 = constraintAnchor8;
                ConstraintAnchor constraintAnchor11 = constraintAnchor8;
                int i27 = i22;
                ConstraintAnchor constraintAnchor12 = constraintAnchor7;
                int i28 = i23;
                ConstraintAnchor constraintAnchor13 = constraintAnchor5;
                ConstraintAnchor constraintAnchor14 = constraintAnchor5;
                i9 = i24;
                widgetsList3.setup(i6, constraintAnchor10, constraintAnchor12, constraintAnchor13, constraintAnchor2, i25, i20, i21, paddingBottom, i7);
                int max = Math.max(i28, widgetsList3.getWidth());
                i22 = i27 + widgetsList3.getHeight();
                if (i9 > 0) {
                    i22 += this.mVerticalGap;
                }
                constraintAnchor8 = constraintAnchor11;
                i23 = max;
                constraintAnchor7 = constraintAnchor9;
                i20 = 0;
                constraintAnchor = constraintAnchor14;
                int i29 = paddingBottom;
                constraintAnchor6 = constraintAnchor2;
                i26 = i29;
            } else {
                ConstraintAnchor constraintAnchor15 = constraintAnchor8;
                int i30 = i22;
                int i31 = i23;
                i9 = i24;
                if (i9 < size - 1) {
                    constraintAnchor = this.mChainList.get(i9 + 1).biggest.mLeft;
                    paddingRight = 0;
                } else {
                    constraintAnchor = this.mRight;
                    paddingRight = getPaddingRight();
                }
                ConstraintAnchor constraintAnchor16 = widgetsList3.biggest.mRight;
                widgetsList3.setup(i6, constraintAnchor15, constraintAnchor7, constraintAnchor, constraintAnchor6, i25, i20, paddingRight, i26, i7);
                i23 = i31 + widgetsList3.getWidth();
                int max2 = Math.max(i30, widgetsList3.getHeight());
                if (i9 > 0) {
                    i23 += this.mHorizontalGap;
                }
                i22 = max2;
                i21 = paddingRight;
                constraintAnchor8 = constraintAnchor16;
                i25 = 0;
            }
            i24 = i9 + 1;
            constraintAnchor5 = constraintAnchor;
        }
        iArr[0] = i23;
        iArr[1] = i22;
    }

    private void measureNoWrap(ConstraintWidget[] constraintWidgetArr, int i5, int i6, int i7, int[] iArr) {
        WidgetsList widgetsList;
        if (i5 == 0) {
            return;
        }
        if (this.mChainList.size() == 0) {
            widgetsList = new WidgetsList(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, i7);
            this.mChainList.add(widgetsList);
        } else {
            WidgetsList widgetsList2 = this.mChainList.get(0);
            widgetsList2.clear();
            widgetsList = widgetsList2;
            widgetsList.setup(i6, this.mLeft, this.mTop, this.mRight, this.mBottom, getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom(), i7);
        }
        for (int i8 = 0; i8 < i5; i8++) {
            widgetsList.add(constraintWidgetArr[i8]);
        }
        iArr[0] = widgetsList.getWidth();
        iArr[1] = widgetsList.getHeight();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(LinearSystem linearSystem, boolean z4) {
        super.addToSolver(linearSystem, z4);
        boolean z5 = getParent() != null && ((ConstraintWidgetContainer) getParent()).isRtl();
        int i5 = this.mWrapMode;
        if (i5 != 0) {
            if (i5 == 1) {
                int size = this.mChainList.size();
                int i6 = 0;
                while (i6 < size) {
                    this.mChainList.get(i6).createConstraints(z5, i6, i6 == size + (-1));
                    i6++;
                }
            } else if (i5 == 2) {
                createAlignedConstraints(z5);
            } else if (i5 == 3) {
                int size2 = this.mChainList.size();
                int i7 = 0;
                while (i7 < size2) {
                    this.mChainList.get(i7).createConstraints(z5, i7, i7 == size2 + (-1));
                    i7++;
                }
            }
        } else if (this.mChainList.size() > 0) {
            this.mChainList.get(0).createConstraints(z5, 0, true);
        }
        needsCallbackFromSolver(false);
    }

    @Override // androidx.constraintlayout.core.widgets.HelperWidget, androidx.constraintlayout.core.widgets.ConstraintWidget
    public void copy(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.copy(constraintWidget, hashMap);
        Flow flow = (Flow) constraintWidget;
        this.mHorizontalStyle = flow.mHorizontalStyle;
        this.mVerticalStyle = flow.mVerticalStyle;
        this.mFirstHorizontalStyle = flow.mFirstHorizontalStyle;
        this.mFirstVerticalStyle = flow.mFirstVerticalStyle;
        this.mLastHorizontalStyle = flow.mLastHorizontalStyle;
        this.mLastVerticalStyle = flow.mLastVerticalStyle;
        this.mHorizontalBias = flow.mHorizontalBias;
        this.mVerticalBias = flow.mVerticalBias;
        this.mFirstHorizontalBias = flow.mFirstHorizontalBias;
        this.mFirstVerticalBias = flow.mFirstVerticalBias;
        this.mLastHorizontalBias = flow.mLastHorizontalBias;
        this.mLastVerticalBias = flow.mLastVerticalBias;
        this.mHorizontalGap = flow.mHorizontalGap;
        this.mVerticalGap = flow.mVerticalGap;
        this.mHorizontalAlign = flow.mHorizontalAlign;
        this.mVerticalAlign = flow.mVerticalAlign;
        this.mWrapMode = flow.mWrapMode;
        this.mMaxElementsWrap = flow.mMaxElementsWrap;
        this.mOrientation = flow.mOrientation;
    }

    public float getMaxElementsWrap() {
        return this.mMaxElementsWrap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r18.mVerticalStyle == (-1)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0054, code lost:
    
        r18.mVerticalStyle = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0052, code lost:
    
        if (r18.mVerticalStyle == (-1)) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void measure(int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Flow.measure(int, int, int, int):void");
    }

    public void setFirstHorizontalBias(float f5) {
        this.mFirstHorizontalBias = f5;
    }

    public void setFirstHorizontalStyle(int i5) {
        this.mFirstHorizontalStyle = i5;
    }

    public void setFirstVerticalBias(float f5) {
        this.mFirstVerticalBias = f5;
    }

    public void setFirstVerticalStyle(int i5) {
        this.mFirstVerticalStyle = i5;
    }

    public void setHorizontalAlign(int i5) {
        this.mHorizontalAlign = i5;
    }

    public void setHorizontalBias(float f5) {
        this.mHorizontalBias = f5;
    }

    public void setHorizontalGap(int i5) {
        this.mHorizontalGap = i5;
    }

    public void setHorizontalStyle(int i5) {
        this.mHorizontalStyle = i5;
    }

    public void setLastHorizontalBias(float f5) {
        this.mLastHorizontalBias = f5;
    }

    public void setLastHorizontalStyle(int i5) {
        this.mLastHorizontalStyle = i5;
    }

    public void setLastVerticalBias(float f5) {
        this.mLastVerticalBias = f5;
    }

    public void setLastVerticalStyle(int i5) {
        this.mLastVerticalStyle = i5;
    }

    public void setMaxElementsWrap(int i5) {
        this.mMaxElementsWrap = i5;
    }

    public void setOrientation(int i5) {
        this.mOrientation = i5;
    }

    public void setVerticalAlign(int i5) {
        this.mVerticalAlign = i5;
    }

    public void setVerticalBias(float f5) {
        this.mVerticalBias = f5;
    }

    public void setVerticalGap(int i5) {
        this.mVerticalGap = i5;
    }

    public void setVerticalStyle(int i5) {
        this.mVerticalStyle = i5;
    }

    public void setWrapMode(int i5) {
        this.mWrapMode = i5;
    }
}
