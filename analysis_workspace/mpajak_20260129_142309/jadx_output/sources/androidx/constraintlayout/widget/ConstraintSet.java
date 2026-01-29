package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d;
import androidx.appcompat.graphics.drawable.a;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.core.os.EnvironmentCompat;
import androidx.exifinterface.media.ExifInterface;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes18.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_MARGIN = 93;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 92;
    private static final int BASELINE_TO_TOP = 91;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    public static final int CIRCLE_REFERENCE = 8;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BASELINE_MARGIN = 94;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDELINE_USE_RTL = 99;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 4;
    private static final String KEY_PERCENT_PARENT = "parent";
    private static final String KEY_RATIO = "ratio";
    private static final String KEY_WEIGHT = "weight";
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    private static final int LAYOUT_WRAP_BEHAVIOR = 97;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int MOTION_TARGET = 98;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
    private static final int QUANTIZE_MOTION_PHASE = 85;
    private static final int QUANTIZE_MOTION_STEPS = 84;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_TARGET = 83;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 87;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    public String mIdString;
    private boolean mValidate;
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static SparseIntArray mapToConstant = new SparseIntArray();
    private static SparseIntArray overrideMapToConstant = new SparseIntArray();
    public String derivedState = "";
    public int mRotate = 0;
    private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap<>();
    private boolean mForceId = true;
    private HashMap<Integer, Constraint> mConstraints = new HashMap<>();

    /* loaded from: classes19.dex */
    public static class Constraint {
        public Delta mDelta;
        public String mTargetString;
        public int mViewId;
        public final PropertySet propertySet = new PropertySet();
        public final Motion motion = new Motion();
        public final Layout layout = new Layout();
        public final Transform transform = new Transform();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        /* loaded from: classes6.dex */
        public static class Delta {
            private static final int INITIAL_BOOLEAN = 4;
            private static final int INITIAL_FLOAT = 10;
            private static final int INITIAL_INT = 10;
            private static final int INITIAL_STRING = 5;
            public int[] mTypeInt = new int[10];
            public int[] mValueInt = new int[10];
            public int mCountInt = 0;
            public int[] mTypeFloat = new int[10];
            public float[] mValueFloat = new float[10];
            public int mCountFloat = 0;
            public int[] mTypeString = new int[5];
            public String[] mValueString = new String[5];
            public int mCountString = 0;
            public int[] mTypeBoolean = new int[4];
            public boolean[] mValueBoolean = new boolean[4];
            public int mCountBoolean = 0;

            public void add(int i5, float f5) {
                int i6 = this.mCountFloat;
                int[] iArr = this.mTypeFloat;
                if (i6 >= iArr.length) {
                    this.mTypeFloat = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.mValueFloat;
                    this.mValueFloat = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.mTypeFloat;
                int i7 = this.mCountFloat;
                iArr2[i7] = i5;
                float[] fArr2 = this.mValueFloat;
                this.mCountFloat = i7 + 1;
                fArr2[i7] = f5;
            }

            public void add(int i5, int i6) {
                int i7 = this.mCountInt;
                int[] iArr = this.mTypeInt;
                if (i7 >= iArr.length) {
                    this.mTypeInt = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.mValueInt;
                    this.mValueInt = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.mTypeInt;
                int i8 = this.mCountInt;
                iArr3[i8] = i5;
                int[] iArr4 = this.mValueInt;
                this.mCountInt = i8 + 1;
                iArr4[i8] = i6;
            }

            public void add(int i5, String str) {
                int i6 = this.mCountString;
                int[] iArr = this.mTypeString;
                if (i6 >= iArr.length) {
                    this.mTypeString = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.mValueString;
                    this.mValueString = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.mTypeString;
                int i7 = this.mCountString;
                iArr2[i7] = i5;
                String[] strArr2 = this.mValueString;
                this.mCountString = i7 + 1;
                strArr2[i7] = str;
            }

            public void add(int i5, boolean z4) {
                int i6 = this.mCountBoolean;
                int[] iArr = this.mTypeBoolean;
                if (i6 >= iArr.length) {
                    this.mTypeBoolean = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.mValueBoolean;
                    this.mValueBoolean = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.mTypeBoolean;
                int i7 = this.mCountBoolean;
                iArr2[i7] = i5;
                boolean[] zArr2 = this.mValueBoolean;
                this.mCountBoolean = i7 + 1;
                zArr2[i7] = z4;
            }

            public void applyDelta(Constraint constraint) {
                for (int i5 = 0; i5 < this.mCountInt; i5++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeInt[i5], this.mValueInt[i5]);
                }
                for (int i6 = 0; i6 < this.mCountFloat; i6++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeFloat[i6], this.mValueFloat[i6]);
                }
                for (int i7 = 0; i7 < this.mCountString; i7++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeString[i7], this.mValueString[i7]);
                }
                for (int i8 = 0; i8 < this.mCountBoolean; i8++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeBoolean[i8], this.mValueBoolean[i8]);
                }
            }

            @SuppressLint({"LogConditional"})
            public void printDelta(String str) {
                Log.v(str, "int");
                for (int i5 = 0; i5 < this.mCountInt; i5++) {
                    Log.v(str, this.mTypeInt[i5] + " = " + this.mValueInt[i5]);
                }
                Log.v(str, TypedValues.Custom.S_FLOAT);
                for (int i6 = 0; i6 < this.mCountFloat; i6++) {
                    Log.v(str, this.mTypeFloat[i6] + " = " + this.mValueFloat[i6]);
                }
                Log.v(str, "strings");
                for (int i7 = 0; i7 < this.mCountString; i7++) {
                    Log.v(str, this.mTypeString[i7] + " = " + this.mValueString[i7]);
                }
                Log.v(str, TypedValues.Custom.S_BOOLEAN);
                for (int i8 = 0; i8 < this.mCountBoolean; i8++) {
                    Log.v(str, this.mTypeBoolean[i8] + " = " + this.mValueBoolean[i8]);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFrom(int i5, ConstraintLayout.LayoutParams layoutParams) {
            this.mViewId = i5;
            Layout layout = this.layout;
            layout.leftToLeft = layoutParams.leftToLeft;
            layout.leftToRight = layoutParams.leftToRight;
            layout.rightToLeft = layoutParams.rightToLeft;
            layout.rightToRight = layoutParams.rightToRight;
            layout.topToTop = layoutParams.topToTop;
            layout.topToBottom = layoutParams.topToBottom;
            layout.bottomToTop = layoutParams.bottomToTop;
            layout.bottomToBottom = layoutParams.bottomToBottom;
            layout.baselineToBaseline = layoutParams.baselineToBaseline;
            layout.baselineToTop = layoutParams.baselineToTop;
            layout.baselineToBottom = layoutParams.baselineToBottom;
            layout.startToEnd = layoutParams.startToEnd;
            layout.startToStart = layoutParams.startToStart;
            layout.endToStart = layoutParams.endToStart;
            layout.endToEnd = layoutParams.endToEnd;
            layout.horizontalBias = layoutParams.horizontalBias;
            layout.verticalBias = layoutParams.verticalBias;
            layout.dimensionRatio = layoutParams.dimensionRatio;
            layout.circleConstraint = layoutParams.circleConstraint;
            layout.circleRadius = layoutParams.circleRadius;
            layout.circleAngle = layoutParams.circleAngle;
            layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout.orientation = layoutParams.orientation;
            layout.guidePercent = layoutParams.guidePercent;
            layout.guideBegin = layoutParams.guideBegin;
            layout.guideEnd = layoutParams.guideEnd;
            layout.mWidth = ((ViewGroup.MarginLayoutParams) layoutParams).width;
            layout.mHeight = ((ViewGroup.MarginLayoutParams) layoutParams).height;
            layout.leftMargin = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            layout.rightMargin = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            layout.topMargin = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            layout.bottomMargin = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layout.baselineMargin = layoutParams.baselineMargin;
            layout.verticalWeight = layoutParams.verticalWeight;
            layout.horizontalWeight = layoutParams.horizontalWeight;
            layout.verticalChainStyle = layoutParams.verticalChainStyle;
            layout.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout.constrainedWidth = layoutParams.constrainedWidth;
            layout.constrainedHeight = layoutParams.constrainedHeight;
            layout.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout.widthMax = layoutParams.matchConstraintMaxWidth;
            layout.heightMax = layoutParams.matchConstraintMaxHeight;
            layout.widthMin = layoutParams.matchConstraintMinWidth;
            layout.heightMin = layoutParams.matchConstraintMinHeight;
            layout.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout.mConstraintTag = layoutParams.constraintTag;
            layout.goneTopMargin = layoutParams.goneTopMargin;
            layout.goneBottomMargin = layoutParams.goneBottomMargin;
            layout.goneLeftMargin = layoutParams.goneLeftMargin;
            layout.goneRightMargin = layoutParams.goneRightMargin;
            layout.goneStartMargin = layoutParams.goneStartMargin;
            layout.goneEndMargin = layoutParams.goneEndMargin;
            layout.goneBaselineMargin = layoutParams.goneBaselineMargin;
            layout.mWrapBehavior = layoutParams.wrapBehaviorInParent;
            layout.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(int i5, Constraints.LayoutParams layoutParams) {
            fillFrom(i5, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform = this.transform;
            transform.rotation = layoutParams.rotation;
            transform.rotationX = layoutParams.rotationX;
            transform.rotationY = layoutParams.rotationY;
            transform.scaleX = layoutParams.scaleX;
            transform.scaleY = layoutParams.scaleY;
            transform.transformPivotX = layoutParams.transformPivotX;
            transform.transformPivotY = layoutParams.transformPivotY;
            transform.translationX = layoutParams.translationX;
            transform.translationY = layoutParams.translationY;
            transform.translationZ = layoutParams.translationZ;
            transform.elevation = layoutParams.elevation;
            transform.applyElevation = layoutParams.applyElevation;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(ConstraintHelper constraintHelper, int i5, Constraints.LayoutParams layoutParams) {
            fillFromConstraints(i5, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout = this.layout;
                layout.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            if (!this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(str, attributeType);
                this.mCustomConstraints.put(str, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.mCustomConstraints.get(str);
            if (constraintAttribute2.getType() == attributeType) {
                return constraintAttribute2;
            }
            StringBuilder g5 = d.g("ConstraintAttribute is already a ");
            g5.append(constraintAttribute2.getType().name());
            throw new IllegalArgumentException(g5.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorValue(String str, int i5) {
            get(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(String str, float f5) {
            get(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(String str, int i5) {
            get(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str, String str2) {
            get(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        public void applyDelta(Constraint constraint) {
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.applyDelta(constraint);
            }
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.layout;
            layoutParams.leftToLeft = layout.leftToLeft;
            layoutParams.leftToRight = layout.leftToRight;
            layoutParams.rightToLeft = layout.rightToLeft;
            layoutParams.rightToRight = layout.rightToRight;
            layoutParams.topToTop = layout.topToTop;
            layoutParams.topToBottom = layout.topToBottom;
            layoutParams.bottomToTop = layout.bottomToTop;
            layoutParams.bottomToBottom = layout.bottomToBottom;
            layoutParams.baselineToBaseline = layout.baselineToBaseline;
            layoutParams.baselineToTop = layout.baselineToTop;
            layoutParams.baselineToBottom = layout.baselineToBottom;
            layoutParams.startToEnd = layout.startToEnd;
            layoutParams.startToStart = layout.startToStart;
            layoutParams.endToStart = layout.endToStart;
            layoutParams.endToEnd = layout.endToEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = layout.leftMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = layout.rightMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = layout.topMargin;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = layout.bottomMargin;
            layoutParams.goneStartMargin = layout.goneStartMargin;
            layoutParams.goneEndMargin = layout.goneEndMargin;
            layoutParams.goneTopMargin = layout.goneTopMargin;
            layoutParams.goneBottomMargin = layout.goneBottomMargin;
            layoutParams.horizontalBias = layout.horizontalBias;
            layoutParams.verticalBias = layout.verticalBias;
            layoutParams.circleConstraint = layout.circleConstraint;
            layoutParams.circleRadius = layout.circleRadius;
            layoutParams.circleAngle = layout.circleAngle;
            layoutParams.dimensionRatio = layout.dimensionRatio;
            layoutParams.editorAbsoluteX = layout.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout.editorAbsoluteY;
            layoutParams.verticalWeight = layout.verticalWeight;
            layoutParams.horizontalWeight = layout.horizontalWeight;
            layoutParams.verticalChainStyle = layout.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout.horizontalChainStyle;
            layoutParams.constrainedWidth = layout.constrainedWidth;
            layoutParams.constrainedHeight = layout.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout.widthMax;
            layoutParams.matchConstraintMaxHeight = layout.heightMax;
            layoutParams.matchConstraintMinWidth = layout.widthMin;
            layoutParams.matchConstraintMinHeight = layout.heightMin;
            layoutParams.matchConstraintPercentWidth = layout.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout.heightPercent;
            layoutParams.orientation = layout.orientation;
            layoutParams.guidePercent = layout.guidePercent;
            layoutParams.guideBegin = layout.guideBegin;
            layoutParams.guideEnd = layout.guideEnd;
            ((ViewGroup.MarginLayoutParams) layoutParams).width = layout.mWidth;
            ((ViewGroup.MarginLayoutParams) layoutParams).height = layout.mHeight;
            String str = layout.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.wrapBehaviorInParent = layout.mWrapBehavior;
            layoutParams.setMarginStart(layout.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Constraint m5clone() {
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            constraint.mDelta = this.mDelta;
            return constraint;
        }

        public void printDelta(String str) {
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.printDelta(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_MARGIN = 80;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BASELINE_TO_BOTTOM = 78;
        private static final int BASELINE_TO_TOP = 77;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINED_HEIGHT = 88;
        private static final int CONSTRAINED_WIDTH = 87;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int CONSTRAINT_TAG = 89;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BASELINE_MARGIN = 79;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int GUIDE_USE_RTL = 90;
        private static final int HEIGHT_DEFAULT = 82;
        private static final int HEIGHT_MAX = 83;
        private static final int HEIGHT_MIN = 85;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
        private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LAYOUT_WRAP_BEHAVIOR = 76;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        private static final int UNUSED = 91;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_DEFAULT = 81;
        private static final int WIDTH_MAX = 84;
        private static final int WIDTH_MIN = 86;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray mapToConstant;
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            mapToConstant.append(R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            mapToConstant.append(R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            mapToConstant.append(R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            mapToConstant.append(R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            mapToConstant.append(R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            mapToConstant.append(R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            mapToConstant.append(R.styleable.Layout_layout_editor_absoluteX, 6);
            mapToConstant.append(R.styleable.Layout_layout_editor_absoluteY, 7);
            mapToConstant.append(R.styleable.Layout_layout_constraintGuide_begin, 17);
            mapToConstant.append(R.styleable.Layout_layout_constraintGuide_end, 18);
            mapToConstant.append(R.styleable.Layout_layout_constraintGuide_percent, 19);
            mapToConstant.append(R.styleable.Layout_guidelineUseRtl, 90);
            mapToConstant.append(R.styleable.Layout_android_orientation, 26);
            mapToConstant.append(R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            mapToConstant.append(R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            mapToConstant.append(R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginLeft, 13);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginTop, 16);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginRight, 14);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginBottom, 11);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginStart, 15);
            mapToConstant.append(R.styleable.Layout_layout_goneMarginEnd, 12);
            mapToConstant.append(R.styleable.Layout_layout_constraintVertical_weight, 38);
            mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            mapToConstant.append(R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            mapToConstant.append(R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            mapToConstant.append(R.styleable.Layout_layout_constraintVertical_bias, 36);
            mapToConstant.append(R.styleable.Layout_layout_constraintDimensionRatio, 5);
            mapToConstant.append(R.styleable.Layout_layout_constraintLeft_creator, 91);
            mapToConstant.append(R.styleable.Layout_layout_constraintTop_creator, 91);
            mapToConstant.append(R.styleable.Layout_layout_constraintRight_creator, 91);
            mapToConstant.append(R.styleable.Layout_layout_constraintBottom_creator, 91);
            mapToConstant.append(R.styleable.Layout_layout_constraintBaseline_creator, 91);
            mapToConstant.append(R.styleable.Layout_android_layout_marginLeft, 23);
            mapToConstant.append(R.styleable.Layout_android_layout_marginRight, 27);
            mapToConstant.append(R.styleable.Layout_android_layout_marginStart, 30);
            mapToConstant.append(R.styleable.Layout_android_layout_marginEnd, 8);
            mapToConstant.append(R.styleable.Layout_android_layout_marginTop, 33);
            mapToConstant.append(R.styleable.Layout_android_layout_marginBottom, 2);
            mapToConstant.append(R.styleable.Layout_android_layout_width, 22);
            mapToConstant.append(R.styleable.Layout_android_layout_height, 21);
            mapToConstant.append(R.styleable.Layout_layout_constraintWidth, 41);
            mapToConstant.append(R.styleable.Layout_layout_constraintHeight, 42);
            mapToConstant.append(R.styleable.Layout_layout_constrainedWidth, 41);
            mapToConstant.append(R.styleable.Layout_layout_constrainedHeight, 42);
            mapToConstant.append(R.styleable.Layout_layout_wrapBehaviorInParent, 76);
            mapToConstant.append(R.styleable.Layout_layout_constraintCircle, 61);
            mapToConstant.append(R.styleable.Layout_layout_constraintCircleRadius, 62);
            mapToConstant.append(R.styleable.Layout_layout_constraintCircleAngle, 63);
            mapToConstant.append(R.styleable.Layout_layout_constraintWidth_percent, 69);
            mapToConstant.append(R.styleable.Layout_layout_constraintHeight_percent, 70);
            mapToConstant.append(R.styleable.Layout_chainUseRtl, 71);
            mapToConstant.append(R.styleable.Layout_barrierDirection, 72);
            mapToConstant.append(R.styleable.Layout_barrierMargin, 73);
            mapToConstant.append(R.styleable.Layout_constraint_referenced_ids, 74);
            mapToConstant.append(R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void copyFrom(Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.guidelineUseRtl = layout.guidelineUseRtl;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.baselineToTop = layout.baselineToTop;
            this.baselineToBottom = layout.baselineToBottom;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.baselineMargin = layout.baselineMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.goneBaselineMargin = layout.goneBaselineMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr == null || layout.mReferenceIdString != null) {
                this.mReferenceIds = null;
            } else {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = layout.mWrapBehavior;
        }

        public void dump(MotionScene motionScene, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object lookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(lookUpConstraintName == null ? num : lookUpConstraintName);
                            }
                        } else if (type == Float.TYPE) {
                            Float f5 = (Float) obj;
                            if (f5.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f5);
                            }
                        }
                        sb.append("\"\n");
                    } catch (IllegalAccessException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = mapToConstant.get(index);
                switch (i6) {
                    case 1:
                        this.baselineToBaseline = ConstraintSet.lookupID(obtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = ConstraintSet.lookupID(obtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = ConstraintSet.lookupID(obtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = obtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = obtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = ConstraintSet.lookupID(obtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = ConstraintSet.lookupID(obtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = ConstraintSet.lookupID(obtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = ConstraintSet.lookupID(obtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = ConstraintSet.lookupID(obtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = ConstraintSet.lookupID(obtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = obtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = obtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    case 41:
                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.parseDimensionConstraints(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i6) {
                            case 61:
                                this.circleConstraint = ConstraintSet.lookupID(obtainStyledAttributes, index, this.circleConstraint);
                                break;
                            case 62:
                                this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                break;
                            case 63:
                                this.circleAngle = obtainStyledAttributes.getFloat(index, this.circleAngle);
                                break;
                            default:
                                switch (i6) {
                                    case 69:
                                        this.widthPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.heightPercent = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e(ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.mBarrierDirection = obtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                        continue;
                                    case 73:
                                        this.mBarrierMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                        continue;
                                    case 74:
                                        this.mReferenceIdString = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.mBarrierAllowsGoneWidgets = obtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                        continue;
                                    case 76:
                                        this.mWrapBehavior = obtainStyledAttributes.getInt(index, this.mWrapBehavior);
                                        continue;
                                    case 77:
                                        this.baselineToTop = ConstraintSet.lookupID(obtainStyledAttributes, index, this.baselineToTop);
                                        continue;
                                    case 78:
                                        this.baselineToBottom = ConstraintSet.lookupID(obtainStyledAttributes, index, this.baselineToBottom);
                                        continue;
                                    case 79:
                                        this.goneBaselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                        continue;
                                    case 80:
                                        this.baselineMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                        continue;
                                    case 81:
                                        this.widthDefault = obtainStyledAttributes.getInt(index, this.widthDefault);
                                        continue;
                                    case 82:
                                        this.heightDefault = obtainStyledAttributes.getInt(index, this.heightDefault);
                                        continue;
                                    case 83:
                                        this.heightMax = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                        continue;
                                    case 84:
                                        this.widthMax = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                        continue;
                                    case 85:
                                        this.heightMin = obtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                        continue;
                                    case 86:
                                        this.widthMin = obtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                        continue;
                                    case 87:
                                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                                        continue;
                                    case 88:
                                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                                        continue;
                                    case 89:
                                        this.mConstraintTag = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.guidelineUseRtl = obtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        continue;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb.append(str);
                                sb.append(Integer.toHexString(index));
                                sb.append("   ");
                                sb.append(mapToConstant.get(index));
                                Log.w(ConstraintSet.TAG, sb.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes16.dex */
    public static class Motion {
        private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 7;
        private static final int PATH_MOTION_ARC = 2;
        private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
        private static final int QUANTIZE_MOTION_PHASE = 9;
        private static final int QUANTIZE_MOTION_STEPS = 8;
        private static final int SPLINE_STRING = -1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray mapToConstant;
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Motion_motionPathRotate, 1);
            mapToConstant.append(R.styleable.Motion_pathMotionArc, 2);
            mapToConstant.append(R.styleable.Motion_transitionEasing, 3);
            mapToConstant.append(R.styleable.Motion_drawPath, 4);
            mapToConstant.append(R.styleable.Motion_animateRelativeTo, 5);
            mapToConstant.append(R.styleable.Motion_animateCircleAngleTo, 6);
            mapToConstant.append(R.styleable.Motion_motionStagger, 7);
            mapToConstant.append(R.styleable.Motion_quantizeMotionSteps, 8);
            mapToConstant.append(R.styleable.Motion_quantizeMotionPhase, 9);
            mapToConstant.append(R.styleable.Motion_quantizeMotionInterpolator, 10);
        }

        public void copyFrom(Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
            this.mPolarRelativeTo = motion.mPolarRelativeTo;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = obtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = obtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        this.mTransitionEasing = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : Easing.NAMED_EASING[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.mDrawPath = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.lookupID(obtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = obtainStyledAttributes.getInteger(index, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = obtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = obtainStyledAttributes.getInteger(index, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = obtainStyledAttributes.getFloat(index, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        int i6 = obtainStyledAttributes.peekValue(index).type;
                        if (i6 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.mQuantizeInterpolatorID = resourceId;
                            if (resourceId == -1) {
                                break;
                            }
                            this.mQuantizeInterpolatorType = -2;
                            break;
                        } else if (i6 != 3) {
                            this.mQuantizeInterpolatorType = obtainStyledAttributes.getInteger(index, this.mQuantizeInterpolatorID);
                            break;
                        } else {
                            String string = obtainStyledAttributes.getString(index);
                            this.mQuantizeInterpolatorString = string;
                            if (string.indexOf("/") <= 0) {
                                this.mQuantizeInterpolatorType = -1;
                                break;
                            } else {
                                this.mQuantizeInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                                this.mQuantizeInterpolatorType = -2;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes8.dex */
    public static class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.PropertySet_android_alpha) {
                    this.alpha = obtainStyledAttributes.getFloat(index, this.alpha);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.visibility = obtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (index == R.styleable.PropertySet_visibilityMode) {
                    this.mVisibilityMode = obtainStyledAttributes.getInt(index, this.mVisibilityMode);
                } else if (index == R.styleable.PropertySet_motionProgress) {
                    this.mProgress = obtainStyledAttributes.getFloat(index, this.mProgress);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes3.dex */
    public static class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_TARGET = 12;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray mapToConstant;
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            mapToConstant = sparseIntArray;
            sparseIntArray.append(R.styleable.Transform_android_rotation, 1);
            mapToConstant.append(R.styleable.Transform_android_rotationX, 2);
            mapToConstant.append(R.styleable.Transform_android_rotationY, 3);
            mapToConstant.append(R.styleable.Transform_android_scaleX, 4);
            mapToConstant.append(R.styleable.Transform_android_scaleY, 5);
            mapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
            mapToConstant.append(R.styleable.Transform_android_transformPivotY, 7);
            mapToConstant.append(R.styleable.Transform_android_translationX, 8);
            mapToConstant.append(R.styleable.Transform_android_translationY, 9);
            mapToConstant.append(R.styleable.Transform_android_translationZ, 10);
            mapToConstant.append(R.styleable.Transform_android_elevation, 11);
            mapToConstant.append(R.styleable.Transform_transformPivotTarget, 12);
        }

        public void copyFrom(Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.transformPivotTarget = transform.transformPivotTarget;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        public void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.mApply = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                switch (mapToConstant.get(index)) {
                    case 1:
                        this.rotation = obtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = obtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = obtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = obtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = obtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = obtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = obtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = obtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = obtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = obtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = obtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = ConstraintSet.lookupID(obtainStyledAttributes, index, this.transformPivotTarget);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes20.dex */
    public class WriteJsonEngine {
        private static final String SPACE = "       ";
        public Context context;
        public int flags;
        public ConstraintLayout layout;
        public Writer writer;
        public int unknownCount = 0;
        public final String LEFT = "'left'";
        public final String RIGHT = "'right'";
        public final String BASELINE = "'baseline'";
        public final String BOTTOM = "'bottom'";
        public final String TOP = "'top'";
        public final String START = "'start'";
        public final String END = "'end'";
        public HashMap<Integer, String> idMap = new HashMap<>();

        public WriteJsonEngine(Writer writer, ConstraintLayout constraintLayout, int i5) {
            this.writer = writer;
            this.layout = constraintLayout;
            this.context = constraintLayout.getContext();
            this.flags = i5;
        }

        private void writeDimension(String str, int i5, int i6, float f5, int i7, int i8, boolean z4) {
            Writer writer;
            StringBuilder sb;
            String str2;
            Writer writer2;
            StringBuilder sb2;
            String str3;
            String str4;
            if (i5 != 0) {
                if (i5 == -2) {
                    writer = this.writer;
                    sb = new StringBuilder();
                    sb.append(SPACE);
                    sb.append(str);
                    str2 = ": 'wrap'\n";
                } else {
                    if (i5 != -1) {
                        this.writer.write(SPACE + str + ": " + i5 + ",\n");
                        return;
                    }
                    writer = this.writer;
                    sb = new StringBuilder();
                    sb.append(SPACE);
                    sb.append(str);
                    str2 = ": 'parent'\n";
                }
                sb.append(str2);
                writer.write(sb.toString());
                return;
            }
            if (i8 == -1 && i7 == -1) {
                if (i6 == 1) {
                    writer2 = this.writer;
                    sb2 = new StringBuilder();
                    sb2.append(SPACE);
                    sb2.append(str);
                    str4 = ": '???????????',\n";
                } else {
                    if (i6 != 2) {
                        return;
                    }
                    writer2 = this.writer;
                    sb2 = new StringBuilder();
                    sb2.append(SPACE);
                    sb2.append(str);
                    sb2.append(": '");
                    sb2.append(f5);
                    str4 = "%',\n";
                }
                sb2.append(str4);
            } else {
                if (i6 == 0) {
                    this.writer.write(SPACE + str + ": {'spread' ," + i7 + ", " + i8 + "}\n");
                    return;
                }
                if (i6 == 1) {
                    writer2 = this.writer;
                    sb2 = new StringBuilder();
                    sb2.append(SPACE);
                    sb2.append(str);
                    str3 = ": {'wrap' ,";
                } else {
                    if (i6 != 2) {
                        return;
                    }
                    writer2 = this.writer;
                    sb2 = new StringBuilder();
                    sb2.append(SPACE);
                    sb2.append(str);
                    sb2.append(": {'");
                    sb2.append(f5);
                    str3 = "'% ,";
                }
                sb2.append(str3);
                sb2.append(i7);
                sb2.append(", ");
                sb2.append(i8);
                sb2.append("}\n");
            }
            writer2.write(sb2.toString());
        }

        private void writeGuideline(int i5, int i6, int i7, float f5) {
        }

        public String getName(int i5) {
            if (this.idMap.containsKey(Integer.valueOf(i5))) {
                return a.c(d.g("'"), this.idMap.get(Integer.valueOf(i5)), "'");
            }
            if (i5 == 0) {
                return "'parent'";
            }
            String lookup = lookup(i5);
            this.idMap.put(Integer.valueOf(i5), lookup);
            return "'" + lookup + "'";
        }

        public String lookup(int i5) {
            try {
                if (i5 != -1) {
                    return this.context.getResources().getResourceEntryName(i5);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i6 = this.unknownCount + 1;
                this.unknownCount = i6;
                sb.append(i6);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder g5 = d.g(EnvironmentCompat.MEDIA_UNKNOWN);
                int i7 = this.unknownCount + 1;
                this.unknownCount = i7;
                g5.append(i7);
                return g5.toString();
            }
        }

        public void writeCircle(int i5, float f5, int i6) {
            if (i5 == -1) {
                return;
            }
            this.writer.write("       circle");
            this.writer.write(":[");
            this.writer.write(getName(i5));
            this.writer.write(", " + f5);
            this.writer.write(i6 + "]");
        }

        public void writeConstraint(String str, int i5, String str2, int i6, int i7) {
            if (i5 == -1) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(":[");
            this.writer.write(getName(i5));
            this.writer.write(" , ");
            this.writer.write(str2);
            if (i6 != 0) {
                this.writer.write(" , " + i6);
            }
            this.writer.write("],\n");
        }

        public void writeLayout() {
            this.writer.write("\n'ConstraintSet':{\n");
            for (Integer num : ConstraintSet.this.mConstraints.keySet()) {
                Constraint constraint = (Constraint) ConstraintSet.this.mConstraints.get(num);
                String name = getName(num.intValue());
                this.writer.write(name + ":{\n");
                Layout layout = constraint.layout;
                writeDimension("height", layout.mHeight, layout.heightDefault, layout.heightPercent, layout.heightMin, layout.heightMax, layout.constrainedHeight);
                writeDimension("width", layout.mWidth, layout.widthDefault, layout.widthPercent, layout.widthMin, layout.widthMax, layout.constrainedWidth);
                writeConstraint("'left'", layout.leftToLeft, "'left'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'left'", layout.leftToRight, "'right'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'right'", layout.rightToLeft, "'left'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'right'", layout.rightToRight, "'right'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'baseline'", layout.baselineToBaseline, "'baseline'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToTop, "'top'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToBottom, "'bottom'", -1, layout.goneBaselineMargin);
                writeConstraint("'top'", layout.topToBottom, "'bottom'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'top'", layout.topToTop, "'top'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'bottom'", layout.bottomToBottom, "'bottom'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'bottom'", layout.bottomToTop, "'top'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'start'", layout.startToStart, "'start'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'start'", layout.startToEnd, "'end'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'end'", layout.endToStart, "'start'", layout.endMargin, layout.goneEndMargin);
                writeConstraint("'end'", layout.endToEnd, "'end'", layout.endMargin, layout.goneEndMargin);
                writeVariable("'horizontalBias'", layout.horizontalBias, 0.5f);
                writeVariable("'verticalBias'", layout.verticalBias, 0.5f);
                writeCircle(layout.circleConstraint, layout.circleAngle, layout.circleRadius);
                writeGuideline(layout.orientation, layout.guideBegin, layout.guideEnd, layout.guidePercent);
                writeVariable("'dimensionRatio'", layout.dimensionRatio);
                writeVariable("'barrierMargin'", layout.mBarrierMargin);
                writeVariable("'type'", layout.mHelperType);
                writeVariable("'ReferenceId'", layout.mReferenceIdString);
                writeVariable("'mBarrierAllowsGoneWidgets'", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("'WrapBehavior'", layout.mWrapBehavior);
                writeVariable("'verticalWeight'", layout.verticalWeight);
                writeVariable("'horizontalWeight'", layout.horizontalWeight);
                writeVariable("'horizontalChainStyle'", layout.horizontalChainStyle);
                writeVariable("'verticalChainStyle'", layout.verticalChainStyle);
                writeVariable("'barrierDirection'", layout.mBarrierDirection);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.writer.write("}\n");
            }
            this.writer.write("}\n");
        }

        public void writeVariable(String str, float f5) {
            if (f5 == -1.0f) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(": " + f5);
            this.writer.write(",\n");
        }

        public void writeVariable(String str, float f5, float f6) {
            if (f5 == f6) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(": " + f5);
            this.writer.write(",\n");
        }

        public void writeVariable(String str, int i5) {
            if (i5 == 0 || i5 == -1) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(":");
            this.writer.write(", " + i5);
            this.writer.write("\n");
        }

        public void writeVariable(String str, String str2) {
            if (str2 == null) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(":");
            this.writer.write(", " + str2);
            this.writer.write("\n");
        }

        public void writeVariable(String str, boolean z4) {
            if (z4) {
                this.writer.write(SPACE + str);
                this.writer.write(": " + z4);
                this.writer.write(",\n");
            }
        }

        public void writeVariable(String str, boolean z4, boolean z5) {
            if (z4 == z5) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(": " + z4);
            this.writer.write(",\n");
        }

        public void writeVariable(String str, int[] iArr) {
            if (iArr == null) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(": ");
            int i5 = 0;
            while (i5 < iArr.length) {
                Writer writer = this.writer;
                StringBuilder sb = new StringBuilder();
                sb.append(i5 == 0 ? "[" : ", ");
                sb.append(getName(iArr[i5]));
                writer.write(sb.toString());
                i5++;
            }
            this.writer.write("],\n");
        }
    }

    /* loaded from: classes22.dex */
    public class WriteXmlEngine {
        private static final String SPACE = "\n       ";
        public Context context;
        public int flags;
        public ConstraintLayout layout;
        public Writer writer;
        public int unknownCount = 0;
        public final String LEFT = "'left'";
        public final String RIGHT = "'right'";
        public final String BASELINE = "'baseline'";
        public final String BOTTOM = "'bottom'";
        public final String TOP = "'top'";
        public final String START = "'start'";
        public final String END = "'end'";
        public HashMap<Integer, String> idMap = new HashMap<>();

        public WriteXmlEngine(Writer writer, ConstraintLayout constraintLayout, int i5) {
            this.writer = writer;
            this.layout = constraintLayout;
            this.context = constraintLayout.getContext();
            this.flags = i5;
        }

        private void writeBaseDimension(String str, int i5, int i6) {
            Writer writer;
            StringBuilder sb;
            String str2;
            if (i5 != i6) {
                if (i5 == -2) {
                    writer = this.writer;
                    sb = new StringBuilder();
                    sb.append(SPACE);
                    sb.append(str);
                    str2 = "=\"wrap_content\"";
                } else {
                    if (i5 != -1) {
                        this.writer.write(SPACE + str + "=\"" + i5 + "dp\"");
                        return;
                    }
                    writer = this.writer;
                    sb = new StringBuilder();
                    sb.append(SPACE);
                    sb.append(str);
                    str2 = "=\"match_parent\"";
                }
                sb.append(str2);
                writer.write(sb.toString());
            }
        }

        private void writeBoolen(String str, boolean z4, boolean z5) {
            if (z4 != z5) {
                this.writer.write(SPACE + str + "=\"" + z4 + "dp\"");
            }
        }

        private void writeDimension(String str, int i5, int i6) {
            if (i5 != i6) {
                this.writer.write(SPACE + str + "=\"" + i5 + "dp\"");
            }
        }

        private void writeEnum(String str, int i5, String[] strArr, int i6) {
            if (i5 != i6) {
                Writer writer = this.writer;
                StringBuilder f5 = androidx.activity.result.a.f(SPACE, str, "=\"");
                f5.append(strArr[i5]);
                f5.append("\"");
                writer.write(f5.toString());
            }
        }

        public String getName(int i5) {
            if (this.idMap.containsKey(Integer.valueOf(i5))) {
                return a.c(d.g("@+id/"), this.idMap.get(Integer.valueOf(i5)), "");
            }
            if (i5 == 0) {
                return ConstraintSet.KEY_PERCENT_PARENT;
            }
            String lookup = lookup(i5);
            this.idMap.put(Integer.valueOf(i5), lookup);
            return "@+id/" + lookup + "";
        }

        public String lookup(int i5) {
            try {
                if (i5 != -1) {
                    return this.context.getResources().getResourceEntryName(i5);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(EnvironmentCompat.MEDIA_UNKNOWN);
                int i6 = this.unknownCount + 1;
                this.unknownCount = i6;
                sb.append(i6);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder g5 = d.g(EnvironmentCompat.MEDIA_UNKNOWN);
                int i7 = this.unknownCount + 1;
                this.unknownCount = i7;
                g5.append(i7);
                return g5.toString();
            }
        }

        public void writeCircle(int i5, float f5, int i6) {
            if (i5 == -1) {
                return;
            }
            this.writer.write("circle");
            this.writer.write(":[");
            this.writer.write(getName(i5));
            this.writer.write(", " + f5);
            this.writer.write(i6 + "]");
        }

        public void writeConstraint(String str, int i5, String str2, int i6, int i7) {
            if (i5 == -1) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(":[");
            this.writer.write(getName(i5));
            this.writer.write(" , ");
            this.writer.write(str2);
            if (i6 != 0) {
                this.writer.write(" , " + i6);
            }
            this.writer.write("],\n");
        }

        public void writeLayout() {
            this.writer.write("\n<ConstraintSet>\n");
            for (Integer num : ConstraintSet.this.mConstraints.keySet()) {
                Constraint constraint = (Constraint) ConstraintSet.this.mConstraints.get(num);
                String name = getName(num.intValue());
                this.writer.write("  <Constraint");
                this.writer.write("\n       android:id=\"" + name + "\"");
                Layout layout = constraint.layout;
                writeBaseDimension("android:layout_width", layout.mWidth, -5);
                writeBaseDimension("android:layout_height", layout.mHeight, -5);
                writeVariable("app:layout_constraintGuide_begin", (float) layout.guideBegin, -1.0f);
                writeVariable("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                writeVariable("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                writeVariable("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                writeVariable("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                writeVariable("app:layout_constraintDimensionRatio", layout.dimensionRatio, (String) null);
                writeXmlConstraint("app:layout_constraintCircle", layout.circleConstraint);
                writeVariable("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                writeVariable("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                writeVariable("android:orientation", layout.orientation, -1.0f);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                writeVariable("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                writeVariable("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                writeDimension("app:layout_marginLeft", layout.leftMargin, 0);
                writeDimension("app:layout_goneMarginLeft", layout.goneLeftMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginRight", layout.rightMargin, 0);
                writeDimension("app:layout_goneMarginRight", layout.goneRightMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginStart", layout.startMargin, 0);
                writeDimension("app:layout_goneMarginStart", layout.goneStartMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginEnd", layout.endMargin, 0);
                writeDimension("app:layout_goneMarginEnd", layout.goneEndMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginTop", layout.topMargin, 0);
                writeDimension("app:layout_goneMarginTop", layout.goneTopMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginBottom", layout.bottomMargin, 0);
                writeDimension("app:layout_goneMarginBottom", layout.goneBottomMargin, Integer.MIN_VALUE);
                writeDimension("app:goneBaselineMargin", layout.goneBaselineMargin, Integer.MIN_VALUE);
                writeDimension("app:baselineMargin", layout.baselineMargin, 0);
                writeBoolen("app:layout_constrainedWidth", layout.constrainedWidth, false);
                writeBoolen("app:layout_constrainedHeight", layout.constrainedHeight, false);
                writeBoolen("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                writeXmlConstraint("app:baselineToBaseline", layout.baselineToBaseline);
                writeXmlConstraint("app:baselineToBottom", layout.baselineToBottom);
                writeXmlConstraint("app:baselineToTop", layout.baselineToTop);
                writeXmlConstraint("app:layout_constraintBottom_toBottomOf", layout.bottomToBottom);
                writeXmlConstraint("app:layout_constraintBottom_toTopOf", layout.bottomToTop);
                writeXmlConstraint("app:layout_constraintEnd_toEndOf", layout.endToEnd);
                writeXmlConstraint("app:layout_constraintEnd_toStartOf", layout.endToStart);
                writeXmlConstraint("app:layout_constraintLeft_toLeftOf", layout.leftToLeft);
                writeXmlConstraint("app:layout_constraintLeft_toRightOf", layout.leftToRight);
                writeXmlConstraint("app:layout_constraintRight_toLeftOf", layout.rightToLeft);
                writeXmlConstraint("app:layout_constraintRight_toRightOf", layout.rightToRight);
                writeXmlConstraint("app:layout_constraintStart_toEndOf", layout.startToEnd);
                writeXmlConstraint("app:layout_constraintStart_toStartOf", layout.startToStart);
                writeXmlConstraint("app:layout_constraintTop_toBottomOf", layout.topToBottom);
                writeXmlConstraint("app:layout_constraintTop_toTopOf", layout.topToTop);
                String[] strArr = {"spread", "wrap", "percent"};
                writeEnum("app:layout_constraintHeight_default", layout.heightDefault, strArr, 0);
                writeVariable("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                writeDimension("app:layout_constraintHeight_min", layout.heightMin, 0);
                writeDimension("app:layout_constraintHeight_max", layout.heightMax, 0);
                writeBoolen("android:layout_constrainedHeight", layout.constrainedHeight, false);
                writeEnum("app:layout_constraintWidth_default", layout.widthDefault, strArr, 0);
                writeVariable("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                writeDimension("app:layout_constraintWidth_min", layout.widthMin, 0);
                writeDimension("app:layout_constraintWidth_max", layout.widthMax, 0);
                writeBoolen("android:layout_constrainedWidth", layout.constrainedWidth, false);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle);
                writeEnum("app:barrierDirection", layout.mBarrierDirection, new String[]{"left", "right", "top", "bottom", "start", "end"}, -1);
                writeVariable("app:layout_constraintTag", layout.mConstraintTag, (String) null);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.writer.write(" />\n");
            }
            this.writer.write("</ConstraintSet>\n");
        }

        public void writeVariable(String str, float f5, float f6) {
            if (f5 == f6) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write("=\"" + f5 + "\"");
        }

        public void writeVariable(String str, int i5) {
            if (i5 == 0 || i5 == -1) {
                return;
            }
            this.writer.write(SPACE + str + "=\"" + i5 + "\"\n");
        }

        public void writeVariable(String str, String str2) {
            if (str2 == null) {
                return;
            }
            this.writer.write(str);
            this.writer.write(":");
            this.writer.write(", " + str2);
            this.writer.write("\n");
        }

        public void writeVariable(String str, String str2, String str3) {
            if (str2 == null || str2.equals(str3)) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write("=\"" + str2 + "\"");
        }

        public void writeVariable(String str, int[] iArr) {
            if (iArr == null) {
                return;
            }
            this.writer.write(SPACE + str);
            this.writer.write(":");
            int i5 = 0;
            while (i5 < iArr.length) {
                Writer writer = this.writer;
                StringBuilder sb = new StringBuilder();
                sb.append(i5 == 0 ? "[" : ", ");
                sb.append(getName(iArr[i5]));
                writer.write(sb.toString());
                i5++;
            }
            this.writer.write("],\n");
        }

        public void writeXmlConstraint(String str, int i5) {
            if (i5 == -1) {
                return;
            }
            this.writer.write(SPACE + str);
            Writer writer = this.writer;
            StringBuilder g5 = d.g("=\"");
            g5.append(getName(i5));
            g5.append("\"");
            writer.write(g5.toString());
        }
    }

    static {
        mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        mapToConstant.append(R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        mapToConstant.append(R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        mapToConstant.append(R.styleable.Constraint_layout_editor_absoluteX, 6);
        mapToConstant.append(R.styleable.Constraint_layout_editor_absoluteY, 7);
        mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_begin, 17);
        mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_end, 18);
        mapToConstant.append(R.styleable.Constraint_layout_constraintGuide_percent, 19);
        mapToConstant.append(R.styleable.Constraint_guidelineUseRtl, 99);
        mapToConstant.append(R.styleable.Constraint_android_orientation, 27);
        mapToConstant.append(R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        mapToConstant.append(R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        mapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        mapToConstant.append(R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginLeft, 13);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginTop, 16);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginRight, 14);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginBottom, 11);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginStart, 15);
        mapToConstant.append(R.styleable.Constraint_layout_goneMarginEnd, 12);
        mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_weight, 40);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        mapToConstant.append(R.styleable.Constraint_layout_constraintVertical_bias, 37);
        mapToConstant.append(R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        mapToConstant.append(R.styleable.Constraint_layout_constraintLeft_creator, 87);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTop_creator, 87);
        mapToConstant.append(R.styleable.Constraint_layout_constraintRight_creator, 87);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBottom_creator, 87);
        mapToConstant.append(R.styleable.Constraint_layout_constraintBaseline_creator, 87);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginLeft, 24);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginRight, 28);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginStart, 31);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginEnd, 8);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginTop, 34);
        mapToConstant.append(R.styleable.Constraint_android_layout_marginBottom, 2);
        mapToConstant.append(R.styleable.Constraint_android_layout_width, 23);
        mapToConstant.append(R.styleable.Constraint_android_layout_height, 21);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth, 95);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight, 96);
        mapToConstant.append(R.styleable.Constraint_android_visibility, 22);
        mapToConstant.append(R.styleable.Constraint_android_alpha, 43);
        mapToConstant.append(R.styleable.Constraint_android_elevation, 44);
        mapToConstant.append(R.styleable.Constraint_android_rotationX, 45);
        mapToConstant.append(R.styleable.Constraint_android_rotationY, 46);
        mapToConstant.append(R.styleable.Constraint_android_rotation, 60);
        mapToConstant.append(R.styleable.Constraint_android_scaleX, 47);
        mapToConstant.append(R.styleable.Constraint_android_scaleY, 48);
        mapToConstant.append(R.styleable.Constraint_android_transformPivotX, 49);
        mapToConstant.append(R.styleable.Constraint_android_transformPivotY, 50);
        mapToConstant.append(R.styleable.Constraint_android_translationX, 51);
        mapToConstant.append(R.styleable.Constraint_android_translationY, 52);
        mapToConstant.append(R.styleable.Constraint_android_translationZ, 53);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_default, 54);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_default, 55);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_max, 56);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_max, 57);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_min, 58);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_min, 59);
        mapToConstant.append(R.styleable.Constraint_layout_constraintCircle, 61);
        mapToConstant.append(R.styleable.Constraint_layout_constraintCircleRadius, 62);
        mapToConstant.append(R.styleable.Constraint_layout_constraintCircleAngle, 63);
        mapToConstant.append(R.styleable.Constraint_animateRelativeTo, 64);
        mapToConstant.append(R.styleable.Constraint_transitionEasing, 65);
        mapToConstant.append(R.styleable.Constraint_drawPath, 66);
        mapToConstant.append(R.styleable.Constraint_transitionPathRotate, 67);
        mapToConstant.append(R.styleable.Constraint_motionStagger, 79);
        mapToConstant.append(R.styleable.Constraint_android_id, 38);
        mapToConstant.append(R.styleable.Constraint_motionProgress, 68);
        mapToConstant.append(R.styleable.Constraint_layout_constraintWidth_percent, 69);
        mapToConstant.append(R.styleable.Constraint_layout_constraintHeight_percent, 70);
        mapToConstant.append(R.styleable.Constraint_layout_wrapBehaviorInParent, 97);
        mapToConstant.append(R.styleable.Constraint_chainUseRtl, 71);
        mapToConstant.append(R.styleable.Constraint_barrierDirection, 72);
        mapToConstant.append(R.styleable.Constraint_barrierMargin, 73);
        mapToConstant.append(R.styleable.Constraint_constraint_referenced_ids, 74);
        mapToConstant.append(R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        mapToConstant.append(R.styleable.Constraint_pathMotionArc, 76);
        mapToConstant.append(R.styleable.Constraint_layout_constraintTag, 77);
        mapToConstant.append(R.styleable.Constraint_visibilityMode, 78);
        mapToConstant.append(R.styleable.Constraint_layout_constrainedWidth, 80);
        mapToConstant.append(R.styleable.Constraint_layout_constrainedHeight, 81);
        mapToConstant.append(R.styleable.Constraint_polarRelativeTo, 82);
        mapToConstant.append(R.styleable.Constraint_transformPivotTarget, 83);
        mapToConstant.append(R.styleable.Constraint_quantizeMotionSteps, 84);
        mapToConstant.append(R.styleable.Constraint_quantizeMotionPhase, 85);
        mapToConstant.append(R.styleable.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = overrideMapToConstant;
        int i5 = R.styleable.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i5, 6);
        overrideMapToConstant.append(i5, 7);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_orientation, 27);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginTop, 16);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginRight, 14);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginStart, 15);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginLeft, 24);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginRight, 28);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginStart, 31);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginEnd, 8);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginTop, 34);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_marginBottom, 2);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_width, 23);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_layout_height, 21);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth, 95);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight, 96);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_visibility, 22);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_alpha, 43);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_elevation, 44);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationX, 45);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotationY, 46);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_rotation, 60);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleX, 47);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_scaleY, 48);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotX, 49);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_transformPivotY, 50);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationX, 51);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationY, 52);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_translationZ, 53);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_animateRelativeTo, 64);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_transitionEasing, 65);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_drawPath, 66);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_transitionPathRotate, 67);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_motionStagger, 79);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_android_id, 38);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_motionTarget, 98);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_motionProgress, 68);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_chainUseRtl, 71);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_barrierDirection, 72);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_barrierMargin, 73);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_constraint_referenced_ids, 74);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_pathMotionArc, 76);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constraintTag, 77);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_visibilityMode, 78);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedWidth, 80);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_constrainedHeight, 81);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_polarRelativeTo, 82);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_transformPivotTarget, 83);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionSteps, 84);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionPhase, 85);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        overrideMapToConstant.append(R.styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i5 = 0; i5 < strArr.length; i5++) {
            if (this.mSavedAttributes.containsKey(strArr[i5])) {
                ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(strArr[i5]);
                if (constraintAttribute != null && constraintAttribute.getType() != attributeType) {
                    StringBuilder g5 = d.g("ConstraintAttribute is already a ");
                    g5.append(constraintAttribute.getType().name());
                    throw new IllegalArgumentException(g5.toString());
                }
            } else {
                this.mSavedAttributes.put(strArr[i5], new ConstraintAttribute(strArr[i5], attributeType));
            }
        }
    }

    public static Constraint buildDelta(Context context, XmlPullParser xmlPullParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, R.styleable.ConstraintOverride);
        populateOverride(context, constraint, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private int[] convertReferenceString(View view, String str) {
        int i5;
        Object designInformation;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i6 = 0;
        int i7 = 0;
        while (i6 < split.length) {
            String trim = split[i6].trim();
            try {
                i5 = R.id.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i5 = 0;
            }
            if (i5 == 0) {
                i5 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i5 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i5 = ((Integer) designInformation).intValue();
            }
            iArr[i7] = i5;
            i6++;
            i7++;
        }
        return i7 != split.length ? Arrays.copyOf(iArr, i7) : iArr;
    }

    private void createHorizontalChain(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9, int i10, int i11) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        get(iArr[0]).layout.horizontalChainStyle = i9;
        connect(iArr[0], i10, i5, i6, -1);
        for (int i12 = 1; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            int i14 = i12 - 1;
            connect(iArr[i12], i10, iArr[i14], i11, -1);
            connect(iArr[i14], i11, iArr[i12], i10, -1);
            if (fArr != null) {
                get(iArr[i12]).layout.horizontalWeight = fArr[i12];
            }
        }
        connect(iArr[iArr.length - 1], i11, i7, i8, -1);
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet, boolean z4) {
        Constraint constraint = new Constraint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z4 ? R.styleable.ConstraintOverride : R.styleable.Constraint);
        populateConstraint(context, constraint, obtainStyledAttributes, z4);
        obtainStyledAttributes.recycle();
        return constraint;
    }

    private Constraint get(int i5) {
        if (!this.mConstraints.containsKey(Integer.valueOf(i5))) {
            this.mConstraints.put(Integer.valueOf(i5), new Constraint());
        }
        return this.mConstraints.get(Integer.valueOf(i5));
    }

    public static String getDebugName(int i5) {
        for (Field field : ConstraintSet.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i5) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    public static String getLine(Context context, int i5, XmlPullParser xmlPullParser) {
        StringBuilder g5 = d.g(".(");
        g5.append(Debug.getName(context, i5));
        g5.append(".xml:");
        g5.append(xmlPullParser.getLineNumber());
        g5.append(") \"");
        g5.append(xmlPullParser.getName());
        g5.append("\"");
        return g5.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lookupID(TypedArray typedArray, int i5, int i6) {
        int resourceId = typedArray.getResourceId(i5, i6);
        return resourceId == -1 ? typedArray.getInt(i5, -1) : resourceId;
    }

    public static void parseDimensionConstraints(Object obj, TypedArray typedArray, int i5, int i6) {
        int i7;
        if (obj == null) {
            return;
        }
        int i8 = typedArray.peekValue(i5).type;
        if (i8 == 3) {
            parseDimensionConstraintsString(obj, typedArray.getString(i5), i6);
            return;
        }
        int i9 = -2;
        boolean z4 = false;
        if (i8 != 5) {
            int i10 = typedArray.getInt(i5, 0);
            if (i10 != -4) {
                i9 = (i10 == -3 || !(i10 == -2 || i10 == -1)) ? 0 : i10;
            } else {
                z4 = true;
            }
        } else {
            i9 = typedArray.getDimensionPixelSize(i5, 0);
        }
        if (obj instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
            if (i6 == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).width = i9;
                layoutParams.constrainedWidth = z4;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = i9;
                layoutParams.constrainedHeight = z4;
                return;
            }
        }
        if (obj instanceof Layout) {
            Layout layout = (Layout) obj;
            if (i6 == 0) {
                layout.mWidth = i9;
                layout.constrainedWidth = z4;
                return;
            } else {
                layout.mHeight = i9;
                layout.constrainedHeight = z4;
                return;
            }
        }
        if (obj instanceof Constraint.Delta) {
            Constraint.Delta delta = (Constraint.Delta) obj;
            if (i6 == 0) {
                delta.add(23, i9);
                i7 = 80;
            } else {
                delta.add(21, i9);
                i7 = 81;
            }
            delta.add(i7, z4);
        }
    }

    public static void parseDimensionConstraintsString(Object obj, String str, int i5) {
        int i6;
        int i7;
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if (KEY_RATIO.equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i5 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = 0;
                    }
                    parseDimensionRatioString(layoutParams, trim2);
                    return;
                }
                if (obj instanceof Layout) {
                    ((Layout) obj).dimensionRatio = trim2;
                    return;
                } else {
                    if (obj instanceof Constraint.Delta) {
                        ((Constraint.Delta) obj).add(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                            layoutParams2.horizontalWeight = parseFloat;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                            layoutParams2.verticalWeight = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout = (Layout) obj;
                        if (i5 == 0) {
                            layout.mWidth = 0;
                            layout.horizontalWeight = parseFloat;
                            return;
                        } else {
                            layout.mHeight = 0;
                            layout.verticalWeight = parseFloat;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta = (Constraint.Delta) obj;
                        if (i5 == 0) {
                            delta.add(23, 0);
                            i7 = 39;
                        } else {
                            delta.add(21, 0);
                            i7 = 40;
                        }
                        delta.add(i7, parseFloat);
                        return;
                    }
                    return;
                }
                if (KEY_PERCENT_PARENT.equalsIgnoreCase(trim)) {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i5 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.matchConstraintPercentWidth = max;
                            layoutParams3.matchConstraintDefaultWidth = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.matchConstraintPercentHeight = max;
                            layoutParams3.matchConstraintDefaultHeight = 2;
                            return;
                        }
                    }
                    if (obj instanceof Layout) {
                        Layout layout2 = (Layout) obj;
                        if (i5 == 0) {
                            layout2.mWidth = 0;
                            layout2.widthPercent = max;
                            layout2.widthDefault = 2;
                            return;
                        } else {
                            layout2.mHeight = 0;
                            layout2.heightPercent = max;
                            layout2.heightDefault = 2;
                            return;
                        }
                    }
                    if (obj instanceof Constraint.Delta) {
                        Constraint.Delta delta2 = (Constraint.Delta) obj;
                        if (i5 == 0) {
                            delta2.add(23, 0);
                            i6 = 54;
                        } else {
                            delta2.add(21, 0);
                            i6 = 55;
                        }
                        delta2.add(i6, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void parseDimensionRatioString(ConstraintLayout.LayoutParams layoutParams, String str) {
        float f5 = Float.NaN;
        int i5 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i6 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST)) {
                    i5 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i5 = 1;
                }
                i6 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i6);
                    if (substring2.length() > 0) {
                        f5 = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i6, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f5 = i5 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.dimensionRatio = str;
        layoutParams.dimensionRatioValue = f5;
        layoutParams.dimensionRatioSide = i5;
    }

    private void populateConstraint(Context context, Constraint constraint, TypedArray typedArray, boolean z4) {
        Motion motion;
        String str;
        Motion motion2;
        StringBuilder sb;
        String str2;
        if (z4) {
            populateOverride(context, constraint, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArray.getIndex(i5);
            if (index != R.styleable.Constraint_android_id && R.styleable.Constraint_android_layout_marginStart != index && R.styleable.Constraint_android_layout_marginEnd != index) {
                constraint.motion.mApply = true;
                constraint.layout.mApply = true;
                constraint.propertySet.mApply = true;
                constraint.transform.mApply = true;
            }
            switch (mapToConstant.get(index)) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.baselineToBaseline = lookupID(typedArray, index, layout.baselineToBaseline);
                    continue;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.bottomMargin = typedArray.getDimensionPixelSize(index, layout2.bottomMargin);
                    continue;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.bottomToBottom = lookupID(typedArray, index, layout3.bottomToBottom);
                    continue;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = lookupID(typedArray, index, layout4.bottomToTop);
                    continue;
                case 5:
                    constraint.layout.dimensionRatio = typedArray.getString(index);
                    continue;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                    continue;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                    continue;
                case 8:
                    Layout layout7 = constraint.layout;
                    layout7.endMargin = typedArray.getDimensionPixelSize(index, layout7.endMargin);
                    continue;
                case 9:
                    Layout layout8 = constraint.layout;
                    layout8.endToEnd = lookupID(typedArray, index, layout8.endToEnd);
                    continue;
                case 10:
                    Layout layout9 = constraint.layout;
                    layout9.endToStart = lookupID(typedArray, index, layout9.endToStart);
                    continue;
                case 11:
                    Layout layout10 = constraint.layout;
                    layout10.goneBottomMargin = typedArray.getDimensionPixelSize(index, layout10.goneBottomMargin);
                    continue;
                case 12:
                    Layout layout11 = constraint.layout;
                    layout11.goneEndMargin = typedArray.getDimensionPixelSize(index, layout11.goneEndMargin);
                    continue;
                case 13:
                    Layout layout12 = constraint.layout;
                    layout12.goneLeftMargin = typedArray.getDimensionPixelSize(index, layout12.goneLeftMargin);
                    continue;
                case 14:
                    Layout layout13 = constraint.layout;
                    layout13.goneRightMargin = typedArray.getDimensionPixelSize(index, layout13.goneRightMargin);
                    continue;
                case 15:
                    Layout layout14 = constraint.layout;
                    layout14.goneStartMargin = typedArray.getDimensionPixelSize(index, layout14.goneStartMargin);
                    continue;
                case 16:
                    Layout layout15 = constraint.layout;
                    layout15.goneTopMargin = typedArray.getDimensionPixelSize(index, layout15.goneTopMargin);
                    continue;
                case 17:
                    Layout layout16 = constraint.layout;
                    layout16.guideBegin = typedArray.getDimensionPixelOffset(index, layout16.guideBegin);
                    continue;
                case 18:
                    Layout layout17 = constraint.layout;
                    layout17.guideEnd = typedArray.getDimensionPixelOffset(index, layout17.guideEnd);
                    continue;
                case 19:
                    Layout layout18 = constraint.layout;
                    layout18.guidePercent = typedArray.getFloat(index, layout18.guidePercent);
                    continue;
                case 20:
                    Layout layout19 = constraint.layout;
                    layout19.horizontalBias = typedArray.getFloat(index, layout19.horizontalBias);
                    continue;
                case 21:
                    Layout layout20 = constraint.layout;
                    layout20.mHeight = typedArray.getLayoutDimension(index, layout20.mHeight);
                    continue;
                case 22:
                    PropertySet propertySet = constraint.propertySet;
                    propertySet.visibility = typedArray.getInt(index, propertySet.visibility);
                    PropertySet propertySet2 = constraint.propertySet;
                    propertySet2.visibility = VISIBILITY_FLAGS[propertySet2.visibility];
                    continue;
                case 23:
                    Layout layout21 = constraint.layout;
                    layout21.mWidth = typedArray.getLayoutDimension(index, layout21.mWidth);
                    continue;
                case 24:
                    Layout layout22 = constraint.layout;
                    layout22.leftMargin = typedArray.getDimensionPixelSize(index, layout22.leftMargin);
                    continue;
                case 25:
                    Layout layout23 = constraint.layout;
                    layout23.leftToLeft = lookupID(typedArray, index, layout23.leftToLeft);
                    continue;
                case 26:
                    Layout layout24 = constraint.layout;
                    layout24.leftToRight = lookupID(typedArray, index, layout24.leftToRight);
                    continue;
                case 27:
                    Layout layout25 = constraint.layout;
                    layout25.orientation = typedArray.getInt(index, layout25.orientation);
                    continue;
                case 28:
                    Layout layout26 = constraint.layout;
                    layout26.rightMargin = typedArray.getDimensionPixelSize(index, layout26.rightMargin);
                    continue;
                case 29:
                    Layout layout27 = constraint.layout;
                    layout27.rightToLeft = lookupID(typedArray, index, layout27.rightToLeft);
                    continue;
                case 30:
                    Layout layout28 = constraint.layout;
                    layout28.rightToRight = lookupID(typedArray, index, layout28.rightToRight);
                    continue;
                case 31:
                    Layout layout29 = constraint.layout;
                    layout29.startMargin = typedArray.getDimensionPixelSize(index, layout29.startMargin);
                    continue;
                case 32:
                    Layout layout30 = constraint.layout;
                    layout30.startToEnd = lookupID(typedArray, index, layout30.startToEnd);
                    continue;
                case 33:
                    Layout layout31 = constraint.layout;
                    layout31.startToStart = lookupID(typedArray, index, layout31.startToStart);
                    continue;
                case 34:
                    Layout layout32 = constraint.layout;
                    layout32.topMargin = typedArray.getDimensionPixelSize(index, layout32.topMargin);
                    continue;
                case 35:
                    Layout layout33 = constraint.layout;
                    layout33.topToBottom = lookupID(typedArray, index, layout33.topToBottom);
                    continue;
                case 36:
                    Layout layout34 = constraint.layout;
                    layout34.topToTop = lookupID(typedArray, index, layout34.topToTop);
                    continue;
                case 37:
                    Layout layout35 = constraint.layout;
                    layout35.verticalBias = typedArray.getFloat(index, layout35.verticalBias);
                    continue;
                case 38:
                    constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                    continue;
                case 39:
                    Layout layout36 = constraint.layout;
                    layout36.horizontalWeight = typedArray.getFloat(index, layout36.horizontalWeight);
                    continue;
                case 40:
                    Layout layout37 = constraint.layout;
                    layout37.verticalWeight = typedArray.getFloat(index, layout37.verticalWeight);
                    continue;
                case 41:
                    Layout layout38 = constraint.layout;
                    layout38.horizontalChainStyle = typedArray.getInt(index, layout38.horizontalChainStyle);
                    continue;
                case 42:
                    Layout layout39 = constraint.layout;
                    layout39.verticalChainStyle = typedArray.getInt(index, layout39.verticalChainStyle);
                    continue;
                case 43:
                    PropertySet propertySet3 = constraint.propertySet;
                    propertySet3.alpha = typedArray.getFloat(index, propertySet3.alpha);
                    continue;
                case 44:
                    Transform transform = constraint.transform;
                    transform.applyElevation = true;
                    transform.elevation = typedArray.getDimension(index, transform.elevation);
                    continue;
                case 45:
                    Transform transform2 = constraint.transform;
                    transform2.rotationX = typedArray.getFloat(index, transform2.rotationX);
                    continue;
                case 46:
                    Transform transform3 = constraint.transform;
                    transform3.rotationY = typedArray.getFloat(index, transform3.rotationY);
                    continue;
                case 47:
                    Transform transform4 = constraint.transform;
                    transform4.scaleX = typedArray.getFloat(index, transform4.scaleX);
                    continue;
                case 48:
                    Transform transform5 = constraint.transform;
                    transform5.scaleY = typedArray.getFloat(index, transform5.scaleY);
                    continue;
                case 49:
                    Transform transform6 = constraint.transform;
                    transform6.transformPivotX = typedArray.getDimension(index, transform6.transformPivotX);
                    continue;
                case 50:
                    Transform transform7 = constraint.transform;
                    transform7.transformPivotY = typedArray.getDimension(index, transform7.transformPivotY);
                    continue;
                case 51:
                    Transform transform8 = constraint.transform;
                    transform8.translationX = typedArray.getDimension(index, transform8.translationX);
                    continue;
                case 52:
                    Transform transform9 = constraint.transform;
                    transform9.translationY = typedArray.getDimension(index, transform9.translationY);
                    continue;
                case 53:
                    Transform transform10 = constraint.transform;
                    transform10.translationZ = typedArray.getDimension(index, transform10.translationZ);
                    continue;
                case 54:
                    Layout layout40 = constraint.layout;
                    layout40.widthDefault = typedArray.getInt(index, layout40.widthDefault);
                    continue;
                case 55:
                    Layout layout41 = constraint.layout;
                    layout41.heightDefault = typedArray.getInt(index, layout41.heightDefault);
                    continue;
                case 56:
                    Layout layout42 = constraint.layout;
                    layout42.widthMax = typedArray.getDimensionPixelSize(index, layout42.widthMax);
                    continue;
                case 57:
                    Layout layout43 = constraint.layout;
                    layout43.heightMax = typedArray.getDimensionPixelSize(index, layout43.heightMax);
                    continue;
                case 58:
                    Layout layout44 = constraint.layout;
                    layout44.widthMin = typedArray.getDimensionPixelSize(index, layout44.widthMin);
                    continue;
                case 59:
                    Layout layout45 = constraint.layout;
                    layout45.heightMin = typedArray.getDimensionPixelSize(index, layout45.heightMin);
                    continue;
                case 60:
                    Transform transform11 = constraint.transform;
                    transform11.rotation = typedArray.getFloat(index, transform11.rotation);
                    continue;
                case 61:
                    Layout layout46 = constraint.layout;
                    layout46.circleConstraint = lookupID(typedArray, index, layout46.circleConstraint);
                    continue;
                case 62:
                    Layout layout47 = constraint.layout;
                    layout47.circleRadius = typedArray.getDimensionPixelSize(index, layout47.circleRadius);
                    continue;
                case 63:
                    Layout layout48 = constraint.layout;
                    layout48.circleAngle = typedArray.getFloat(index, layout48.circleAngle);
                    continue;
                case 64:
                    Motion motion3 = constraint.motion;
                    motion3.mAnimateRelativeTo = lookupID(typedArray, index, motion3.mAnimateRelativeTo);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        motion = constraint.motion;
                        str = typedArray.getString(index);
                    } else {
                        motion = constraint.motion;
                        str = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                    }
                    motion.mTransitionEasing = str;
                    continue;
                case 66:
                    constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    Motion motion4 = constraint.motion;
                    motion4.mPathRotate = typedArray.getFloat(index, motion4.mPathRotate);
                    continue;
                case 68:
                    PropertySet propertySet4 = constraint.propertySet;
                    propertySet4.mProgress = typedArray.getFloat(index, propertySet4.mProgress);
                    continue;
                case 69:
                    constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    Layout layout49 = constraint.layout;
                    layout49.mBarrierDirection = typedArray.getInt(index, layout49.mBarrierDirection);
                    continue;
                case 73:
                    Layout layout50 = constraint.layout;
                    layout50.mBarrierMargin = typedArray.getDimensionPixelSize(index, layout50.mBarrierMargin);
                    continue;
                case 74:
                    constraint.layout.mReferenceIdString = typedArray.getString(index);
                    continue;
                case 75:
                    Layout layout51 = constraint.layout;
                    layout51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                    continue;
                case 76:
                    Motion motion5 = constraint.motion;
                    motion5.mPathMotionArc = typedArray.getInt(index, motion5.mPathMotionArc);
                    continue;
                case 77:
                    constraint.layout.mConstraintTag = typedArray.getString(index);
                    continue;
                case 78:
                    PropertySet propertySet5 = constraint.propertySet;
                    propertySet5.mVisibilityMode = typedArray.getInt(index, propertySet5.mVisibilityMode);
                    continue;
                case 79:
                    Motion motion6 = constraint.motion;
                    motion6.mMotionStagger = typedArray.getFloat(index, motion6.mMotionStagger);
                    continue;
                case 80:
                    Layout layout52 = constraint.layout;
                    layout52.constrainedWidth = typedArray.getBoolean(index, layout52.constrainedWidth);
                    continue;
                case 81:
                    Layout layout53 = constraint.layout;
                    layout53.constrainedHeight = typedArray.getBoolean(index, layout53.constrainedHeight);
                    continue;
                case 82:
                    Motion motion7 = constraint.motion;
                    motion7.mAnimateCircleAngleTo = typedArray.getInteger(index, motion7.mAnimateCircleAngleTo);
                    continue;
                case 83:
                    Transform transform12 = constraint.transform;
                    transform12.transformPivotTarget = lookupID(typedArray, index, transform12.transformPivotTarget);
                    continue;
                case 84:
                    Motion motion8 = constraint.motion;
                    motion8.mQuantizeMotionSteps = typedArray.getInteger(index, motion8.mQuantizeMotionSteps);
                    continue;
                case 85:
                    Motion motion9 = constraint.motion;
                    motion9.mQuantizeMotionPhase = typedArray.getFloat(index, motion9.mQuantizeMotionPhase);
                    continue;
                case 86:
                    int i6 = typedArray.peekValue(index).type;
                    if (i6 == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        motion2 = constraint.motion;
                        if (motion2.mQuantizeInterpolatorID == -1) {
                            continue;
                        }
                        motion2.mQuantizeInterpolatorType = -2;
                        break;
                    } else if (i6 != 3) {
                        Motion motion10 = constraint.motion;
                        motion10.mQuantizeInterpolatorType = typedArray.getInteger(index, motion10.mQuantizeInterpolatorID);
                        break;
                    } else {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") <= 0) {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            motion2 = constraint.motion;
                            motion2.mQuantizeInterpolatorType = -2;
                        }
                    }
                case 87:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
                case 91:
                    Layout layout54 = constraint.layout;
                    layout54.baselineToTop = lookupID(typedArray, index, layout54.baselineToTop);
                    continue;
                case 92:
                    Layout layout55 = constraint.layout;
                    layout55.baselineToBottom = lookupID(typedArray, index, layout55.baselineToBottom);
                    continue;
                case 93:
                    Layout layout56 = constraint.layout;
                    layout56.baselineMargin = typedArray.getDimensionPixelSize(index, layout56.baselineMargin);
                    continue;
                case 94:
                    Layout layout57 = constraint.layout;
                    layout57.goneBaselineMargin = typedArray.getDimensionPixelSize(index, layout57.goneBaselineMargin);
                    continue;
                case 95:
                    parseDimensionConstraints(constraint.layout, typedArray, index, 0);
                    continue;
                case 96:
                    parseDimensionConstraints(constraint.layout, typedArray, index, 1);
                    continue;
                case 97:
                    Layout layout58 = constraint.layout;
                    layout58.mWrapBehavior = typedArray.getInt(index, layout58.mWrapBehavior);
                    continue;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(mapToConstant.get(index));
            Log.w(TAG, sb.toString());
        }
        Layout layout59 = constraint.layout;
        if (layout59.mReferenceIdString != null) {
            layout59.mReferenceIds = null;
        }
    }

    private static void populateOverride(Context context, Constraint constraint, TypedArray typedArray) {
        int i5;
        int i6;
        int i7;
        int i8;
        int dimensionPixelOffset;
        int i9;
        int i10;
        int i11;
        float f5;
        float dimension;
        int i12;
        int i13;
        boolean z4;
        int i14;
        Motion motion;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        constraint.mDelta = delta;
        constraint.motion.mApply = false;
        constraint.layout.mApply = false;
        constraint.propertySet.mApply = false;
        constraint.transform.mApply = false;
        for (int i15 = 0; i15 < indexCount; i15++) {
            int index = typedArray.getIndex(i15);
            float f6 = 1.0f;
            switch (overrideMapToConstant.get(index)) {
                case 2:
                    i5 = 2;
                    i6 = constraint.layout.bottomMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    sb.append(str);
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(mapToConstant.get(index));
                    Log.w(TAG, sb.toString());
                    break;
                case 5:
                    i7 = 5;
                    delta.add(i7, typedArray.getString(index));
                    break;
                case 6:
                    i5 = 6;
                    i8 = constraint.layout.editorAbsoluteX;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i8);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 7:
                    i5 = 7;
                    i8 = constraint.layout.editorAbsoluteY;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i8);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 8:
                    i5 = 8;
                    i6 = constraint.layout.endMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 11:
                    i5 = 11;
                    i6 = constraint.layout.goneBottomMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 12:
                    i5 = 12;
                    i6 = constraint.layout.goneEndMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 13:
                    i5 = 13;
                    i6 = constraint.layout.goneLeftMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 14:
                    i5 = 14;
                    i6 = constraint.layout.goneRightMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 15:
                    i5 = 15;
                    i6 = constraint.layout.goneStartMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 16:
                    i5 = 16;
                    i6 = constraint.layout.goneTopMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 17:
                    i5 = 17;
                    i8 = constraint.layout.guideBegin;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i8);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 18:
                    i5 = 18;
                    i8 = constraint.layout.guideEnd;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i8);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 19:
                    i9 = 19;
                    f6 = constraint.layout.guidePercent;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 20:
                    i9 = 20;
                    f6 = constraint.layout.horizontalBias;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 21:
                    i5 = 21;
                    i10 = constraint.layout.mHeight;
                    dimensionPixelOffset = typedArray.getLayoutDimension(index, i10);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 22:
                    i5 = 22;
                    dimensionPixelOffset = VISIBILITY_FLAGS[typedArray.getInt(index, constraint.propertySet.visibility)];
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 23:
                    i5 = 23;
                    i10 = constraint.layout.mWidth;
                    dimensionPixelOffset = typedArray.getLayoutDimension(index, i10);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 24:
                    i5 = 24;
                    i6 = constraint.layout.leftMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 27:
                    i5 = 27;
                    i11 = constraint.layout.orientation;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 28:
                    i5 = 28;
                    i6 = constraint.layout.rightMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 31:
                    i5 = 31;
                    i6 = constraint.layout.startMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 34:
                    i5 = 34;
                    i6 = constraint.layout.topMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 37:
                    i9 = 37;
                    f6 = constraint.layout.verticalBias;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 38:
                    dimensionPixelOffset = typedArray.getResourceId(index, constraint.mViewId);
                    constraint.mViewId = dimensionPixelOffset;
                    i5 = 38;
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 39:
                    i9 = 39;
                    f6 = constraint.layout.horizontalWeight;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 40:
                    i9 = 40;
                    f6 = constraint.layout.verticalWeight;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 41:
                    i5 = 41;
                    i11 = constraint.layout.horizontalChainStyle;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 42:
                    i5 = 42;
                    i11 = constraint.layout.verticalChainStyle;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 43:
                    i9 = 43;
                    f6 = constraint.propertySet.alpha;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 44:
                    i9 = 44;
                    delta.add(44, true);
                    f5 = constraint.transform.elevation;
                    dimension = typedArray.getDimension(index, f5);
                    delta.add(i9, dimension);
                    break;
                case 45:
                    i9 = 45;
                    f6 = constraint.transform.rotationX;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 46:
                    i9 = 46;
                    f6 = constraint.transform.rotationY;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 47:
                    i9 = 47;
                    f6 = constraint.transform.scaleX;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 48:
                    i9 = 48;
                    f6 = constraint.transform.scaleY;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 49:
                    i9 = 49;
                    f5 = constraint.transform.transformPivotX;
                    dimension = typedArray.getDimension(index, f5);
                    delta.add(i9, dimension);
                    break;
                case 50:
                    i9 = 50;
                    f5 = constraint.transform.transformPivotY;
                    dimension = typedArray.getDimension(index, f5);
                    delta.add(i9, dimension);
                    break;
                case 51:
                    i9 = 51;
                    f5 = constraint.transform.translationX;
                    dimension = typedArray.getDimension(index, f5);
                    delta.add(i9, dimension);
                    break;
                case 52:
                    i9 = 52;
                    f5 = constraint.transform.translationY;
                    dimension = typedArray.getDimension(index, f5);
                    delta.add(i9, dimension);
                    break;
                case 53:
                    i9 = 53;
                    f5 = constraint.transform.translationZ;
                    dimension = typedArray.getDimension(index, f5);
                    delta.add(i9, dimension);
                    break;
                case 54:
                    i5 = 54;
                    i11 = constraint.layout.widthDefault;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 55:
                    i5 = 55;
                    i11 = constraint.layout.heightDefault;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 56:
                    i5 = 56;
                    i6 = constraint.layout.widthMax;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 57:
                    i5 = 57;
                    i6 = constraint.layout.heightMax;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 58:
                    i5 = 58;
                    i6 = constraint.layout.widthMin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 59:
                    i5 = 59;
                    i6 = constraint.layout.heightMin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 60:
                    i9 = 60;
                    f6 = constraint.transform.rotation;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 62:
                    i5 = 62;
                    i6 = constraint.layout.circleRadius;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 63:
                    i9 = 63;
                    f6 = constraint.layout.circleAngle;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 64:
                    i5 = 64;
                    i12 = constraint.motion.mAnimateRelativeTo;
                    dimensionPixelOffset = lookupID(typedArray, index, i12);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 65:
                    delta.add(65, typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : Easing.NAMED_EASING[typedArray.getInteger(index, 0)]);
                    break;
                case 66:
                    i5 = 66;
                    dimensionPixelOffset = typedArray.getInt(index, 0);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 67:
                    i9 = 67;
                    f6 = constraint.motion.mPathRotate;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 68:
                    i9 = 68;
                    f6 = constraint.propertySet.mProgress;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 69:
                    i9 = 69;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 70:
                    i9 = 70;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    i5 = 72;
                    i11 = constraint.layout.mBarrierDirection;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 73:
                    i5 = 73;
                    i6 = constraint.layout.mBarrierMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 74:
                    i7 = 74;
                    delta.add(i7, typedArray.getString(index));
                    break;
                case 75:
                    i13 = 75;
                    z4 = constraint.layout.mBarrierAllowsGoneWidgets;
                    delta.add(i13, typedArray.getBoolean(index, z4));
                    break;
                case 76:
                    i5 = 76;
                    i11 = constraint.motion.mPathMotionArc;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 77:
                    i7 = 77;
                    delta.add(i7, typedArray.getString(index));
                    break;
                case 78:
                    i5 = 78;
                    i11 = constraint.propertySet.mVisibilityMode;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 79:
                    i9 = 79;
                    f6 = constraint.motion.mMotionStagger;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 80:
                    i13 = 80;
                    z4 = constraint.layout.constrainedWidth;
                    delta.add(i13, typedArray.getBoolean(index, z4));
                    break;
                case 81:
                    i13 = 81;
                    z4 = constraint.layout.constrainedHeight;
                    delta.add(i13, typedArray.getBoolean(index, z4));
                    break;
                case 82:
                    i5 = 82;
                    i14 = constraint.motion.mAnimateCircleAngleTo;
                    dimensionPixelOffset = typedArray.getInteger(index, i14);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 83:
                    i5 = 83;
                    i12 = constraint.transform.transformPivotTarget;
                    dimensionPixelOffset = lookupID(typedArray, index, i12);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 84:
                    i5 = 84;
                    i14 = constraint.motion.mQuantizeMotionSteps;
                    dimensionPixelOffset = typedArray.getInteger(index, i14);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 85:
                    i9 = 85;
                    f6 = constraint.motion.mQuantizeMotionPhase;
                    dimension = typedArray.getFloat(index, f6);
                    delta.add(i9, dimension);
                    break;
                case 86:
                    int i16 = typedArray.peekValue(index).type;
                    if (i16 == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                        motion = constraint.motion;
                        if (motion.mQuantizeInterpolatorID == -1) {
                            break;
                        }
                        motion.mQuantizeInterpolatorType = -2;
                        delta.add(88, -2);
                        break;
                    } else if (i16 != 3) {
                        Motion motion2 = constraint.motion;
                        motion2.mQuantizeInterpolatorType = typedArray.getInteger(index, motion2.mQuantizeInterpolatorID);
                        delta.add(88, constraint.motion.mQuantizeInterpolatorType);
                        break;
                    } else {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        delta.add(90, constraint.motion.mQuantizeInterpolatorString);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf("/") <= 0) {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            delta.add(88, -1);
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                            motion = constraint.motion;
                            motion.mQuantizeInterpolatorType = -2;
                            delta.add(88, -2);
                        }
                    }
                case 87:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    sb.append(str);
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(mapToConstant.get(index));
                    Log.w(TAG, sb.toString());
                    break;
                case 93:
                    i5 = 93;
                    i6 = constraint.layout.baselineMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 94:
                    i5 = 94;
                    i6 = constraint.layout.goneBaselineMargin;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i6);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 95:
                    parseDimensionConstraints(delta, typedArray, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(delta, typedArray, index, 1);
                    break;
                case 97:
                    i5 = 97;
                    i11 = constraint.layout.mWrapBehavior;
                    dimensionPixelOffset = typedArray.getInt(index, i11);
                    delta.add(i5, dimensionPixelOffset);
                    break;
                case 98:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId = typedArray.getResourceId(index, constraint.mViewId);
                        constraint.mViewId = resourceId;
                        if (resourceId != -1) {
                            break;
                        }
                        constraint.mTargetString = typedArray.getString(index);
                        break;
                    } else {
                        if (typedArray.peekValue(index).type != 3) {
                            constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                            break;
                        }
                        constraint.mTargetString = typedArray.getString(index);
                    }
                case 99:
                    i13 = 99;
                    z4 = constraint.layout.guidelineUseRtl;
                    delta.add(i13, typedArray.getBoolean(index, z4));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i5, float f5) {
        if (i5 == 19) {
            constraint.layout.guidePercent = f5;
        }
        if (i5 == 20) {
            constraint.layout.horizontalBias = f5;
            return;
        }
        if (i5 == 37) {
            constraint.layout.verticalBias = f5;
            return;
        }
        if (i5 == 60) {
            constraint.transform.rotation = f5;
            return;
        }
        if (i5 == 63) {
            constraint.layout.circleAngle = f5;
            return;
        }
        if (i5 == 79) {
            constraint.motion.mMotionStagger = f5;
            return;
        }
        if (i5 == 85) {
            constraint.motion.mQuantizeMotionPhase = f5;
            return;
        }
        if (i5 != 87) {
            if (i5 == 39) {
                constraint.layout.horizontalWeight = f5;
                return;
            }
            if (i5 == 40) {
                constraint.layout.verticalWeight = f5;
                return;
            }
            switch (i5) {
                case 43:
                    constraint.propertySet.alpha = f5;
                    break;
                case 44:
                    Transform transform = constraint.transform;
                    transform.elevation = f5;
                    transform.applyElevation = true;
                    break;
                case 45:
                    constraint.transform.rotationX = f5;
                    break;
                case 46:
                    constraint.transform.rotationY = f5;
                    break;
                case 47:
                    constraint.transform.scaleX = f5;
                    break;
                case 48:
                    constraint.transform.scaleY = f5;
                    break;
                case 49:
                    constraint.transform.transformPivotX = f5;
                    break;
                case 50:
                    constraint.transform.transformPivotY = f5;
                    break;
                case 51:
                    constraint.transform.translationX = f5;
                    break;
                case 52:
                    constraint.transform.translationY = f5;
                    break;
                case 53:
                    constraint.transform.translationZ = f5;
                    break;
                default:
                    switch (i5) {
                        case 67:
                            constraint.motion.mPathRotate = f5;
                            break;
                        case 68:
                            constraint.propertySet.mProgress = f5;
                            break;
                        case 69:
                            constraint.layout.widthPercent = f5;
                            break;
                        case 70:
                            constraint.layout.heightPercent = f5;
                            break;
                        default:
                            Log.w(TAG, "Unknown attribute 0x");
                            break;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i5, int i6) {
        if (i5 == 6) {
            constraint.layout.editorAbsoluteX = i6;
        }
        if (i5 == 7) {
            constraint.layout.editorAbsoluteY = i6;
            return;
        }
        if (i5 == 8) {
            constraint.layout.endMargin = i6;
            return;
        }
        if (i5 == 27) {
            constraint.layout.orientation = i6;
            return;
        }
        if (i5 == 28) {
            constraint.layout.rightMargin = i6;
            return;
        }
        if (i5 == 41) {
            constraint.layout.horizontalChainStyle = i6;
            return;
        }
        if (i5 == 42) {
            constraint.layout.verticalChainStyle = i6;
            return;
        }
        if (i5 == 61) {
            constraint.layout.circleConstraint = i6;
            return;
        }
        if (i5 == 62) {
            constraint.layout.circleRadius = i6;
            return;
        }
        if (i5 == 72) {
            constraint.layout.mBarrierDirection = i6;
            return;
        }
        if (i5 == 73) {
            constraint.layout.mBarrierMargin = i6;
            return;
        }
        switch (i5) {
            case 2:
                constraint.layout.bottomMargin = i6;
                break;
            case 11:
                constraint.layout.goneBottomMargin = i6;
                break;
            case 12:
                constraint.layout.goneEndMargin = i6;
                break;
            case 13:
                constraint.layout.goneLeftMargin = i6;
                break;
            case 14:
                constraint.layout.goneRightMargin = i6;
                break;
            case 15:
                constraint.layout.goneStartMargin = i6;
                break;
            case 16:
                constraint.layout.goneTopMargin = i6;
                break;
            case 17:
                constraint.layout.guideBegin = i6;
                break;
            case 18:
                constraint.layout.guideEnd = i6;
                break;
            case 31:
                constraint.layout.startMargin = i6;
                break;
            case 34:
                constraint.layout.topMargin = i6;
                break;
            case 38:
                constraint.mViewId = i6;
                break;
            case 64:
                constraint.motion.mAnimateRelativeTo = i6;
                break;
            case 66:
                constraint.motion.mDrawPath = i6;
                break;
            case 76:
                constraint.motion.mPathMotionArc = i6;
                break;
            case 78:
                constraint.propertySet.mVisibilityMode = i6;
                break;
            case 93:
                constraint.layout.baselineMargin = i6;
                break;
            case 94:
                constraint.layout.goneBaselineMargin = i6;
                break;
            case 97:
                constraint.layout.mWrapBehavior = i6;
                break;
            default:
                switch (i5) {
                    case 21:
                        constraint.layout.mHeight = i6;
                        break;
                    case 22:
                        constraint.propertySet.visibility = i6;
                        break;
                    case 23:
                        constraint.layout.mWidth = i6;
                        break;
                    case 24:
                        constraint.layout.leftMargin = i6;
                        break;
                    default:
                        switch (i5) {
                            case 54:
                                constraint.layout.widthDefault = i6;
                                break;
                            case 55:
                                constraint.layout.heightDefault = i6;
                                break;
                            case 56:
                                constraint.layout.widthMax = i6;
                                break;
                            case 57:
                                constraint.layout.heightMax = i6;
                                break;
                            case 58:
                                constraint.layout.widthMin = i6;
                                break;
                            case 59:
                                constraint.layout.heightMin = i6;
                                break;
                            default:
                                switch (i5) {
                                    case 82:
                                        constraint.motion.mAnimateCircleAngleTo = i6;
                                        break;
                                    case 83:
                                        constraint.transform.transformPivotTarget = i6;
                                        break;
                                    case 84:
                                        constraint.motion.mQuantizeMotionSteps = i6;
                                        break;
                                    default:
                                        switch (i5) {
                                            case 87:
                                                break;
                                            case 88:
                                                constraint.motion.mQuantizeInterpolatorType = i6;
                                                break;
                                            case 89:
                                                constraint.motion.mQuantizeInterpolatorID = i6;
                                                break;
                                            default:
                                                Log.w(TAG, "Unknown attribute 0x");
                                                break;
                                        }
                                }
                        }
                }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i5, String str) {
        if (i5 == 5) {
            constraint.layout.dimensionRatio = str;
            return;
        }
        if (i5 == 65) {
            constraint.motion.mTransitionEasing = str;
            return;
        }
        if (i5 == 74) {
            Layout layout = constraint.layout;
            layout.mReferenceIdString = str;
            layout.mReferenceIds = null;
        } else if (i5 == 77) {
            constraint.layout.mConstraintTag = str;
        } else if (i5 != 87) {
            if (i5 != 90) {
                Log.w(TAG, "Unknown attribute 0x");
            } else {
                constraint.motion.mQuantizeInterpolatorString = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i5, boolean z4) {
        if (i5 == 44) {
            constraint.transform.applyElevation = z4;
            return;
        }
        if (i5 == 75) {
            constraint.layout.mBarrierAllowsGoneWidgets = z4;
            return;
        }
        if (i5 != 87) {
            if (i5 == 80) {
                constraint.layout.constrainedWidth = z4;
            } else if (i5 != 81) {
                Log.w(TAG, "Unknown attribute 0x");
            } else {
                constraint.layout.constrainedHeight = z4;
            }
        }
    }

    private String sideToString(int i5) {
        switch (i5) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    private static String[] splitString(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        boolean z4 = false;
        for (int i6 = 0; i6 < charArray.length; i6++) {
            if (charArray[i6] == ',' && !z4) {
                arrayList.add(new String(charArray, i5, i6 - i5));
                i5 = i6 + 1;
            } else if (charArray[i6] == '\"') {
                z4 = !z4;
            }
        }
        arrayList.add(new String(charArray, i5, charArray.length - i5));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public void addColorAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i5, int i6, int i7) {
        connect(i5, 1, i6, i6 == 0 ? 1 : 2, 0);
        connect(i5, 2, i7, i7 == 0 ? 2 : 1, 0);
        if (i6 != 0) {
            connect(i6, 2, i5, 1, 0);
        }
        if (i7 != 0) {
            connect(i7, 1, i5, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i5, int i6, int i7) {
        connect(i5, 6, i6, i6 == 0 ? 6 : 7, 0);
        connect(i5, 7, i7, i7 == 0 ? 7 : 6, 0);
        if (i6 != 0) {
            connect(i6, 7, i5, 6, 0);
        }
        if (i7 != 0) {
            connect(i7, 6, i5, 7, 0);
        }
    }

    public void addToVerticalChain(int i5, int i6, int i7) {
        connect(i5, 3, i6, i6 == 0 ? 3 : 4, 0);
        connect(i5, 4, i7, i7 == 0 ? 4 : 3, 0);
        if (i6 != 0) {
            connect(i6, 4, i5, 3, 0);
        }
        if (i7 != 0) {
            connect(i7, 3, i5, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                StringBuilder g5 = d.g("id unknown ");
                g5.append(Debug.getName(childAt));
                Log.w(TAG, g5.toString());
            } else {
                if (this.mForceId && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.mConstraints.containsKey(Integer.valueOf(id)) && (constraint = this.mConstraints.get(Integer.valueOf(id))) != null) {
                    ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                }
            }
        }
    }

    public void applyDeltaFrom(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.mConstraints.values()) {
            if (constraint.mDelta != null) {
                if (constraint.mTargetString != null) {
                    Iterator<Integer> it = this.mConstraints.keySet().iterator();
                    while (it.hasNext()) {
                        Constraint constraint2 = getConstraint(it.next().intValue());
                        String str = constraint2.layout.mConstraintTag;
                        if (str != null && constraint.mTargetString.matches(str)) {
                            constraint.mDelta.applyDelta(constraint2);
                            constraint2.mCustomConstraints.putAll((HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                } else {
                    constraint.mDelta.applyDelta(getConstraint(constraint.mViewId));
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        Constraint constraint;
        int id = constraintHelper.getId();
        if (this.mConstraints.containsKey(Integer.valueOf(id)) && (constraint = this.mConstraints.get(Integer.valueOf(id))) != null && (constraintWidget instanceof HelperWidget)) {
            constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    public void applyToInternal(ConstraintLayout constraintLayout, boolean z4) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.mConstraints.keySet());
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                StringBuilder g5 = d.g("id unknown ");
                g5.append(Debug.getName(childAt));
                Log.w(TAG, g5.toString());
            } else {
                if (this.mForceId && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.mConstraints.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
                        if (constraint != null) {
                            if (childAt instanceof Barrier) {
                                constraint.layout.mHelperType = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(constraint.layout.mBarrierDirection);
                                barrier.setMargin(constraint.layout.mBarrierMargin);
                                barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                                Layout layout = constraint.layout;
                                int[] iArr = layout.mReferenceIds;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.mReferenceIdString;
                                    if (str != null) {
                                        layout.mReferenceIds = convertReferenceString(barrier, str);
                                        barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.validate();
                            constraint.applyTo(layoutParams);
                            if (z4) {
                                ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                            }
                            childAt.setLayoutParams(layoutParams);
                            PropertySet propertySet = constraint.propertySet;
                            if (propertySet.mVisibilityMode == 0) {
                                childAt.setVisibility(propertySet.visibility);
                            }
                            childAt.setAlpha(constraint.propertySet.alpha);
                            childAt.setRotation(constraint.transform.rotation);
                            childAt.setRotationX(constraint.transform.rotationX);
                            childAt.setRotationY(constraint.transform.rotationY);
                            childAt.setScaleX(constraint.transform.scaleX);
                            childAt.setScaleY(constraint.transform.scaleY);
                            Transform transform = constraint.transform;
                            if (transform.transformPivotTarget != -1) {
                                if (((View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget) != null) {
                                    float bottom = (r4.getBottom() + r4.getTop()) / 2.0f;
                                    float right = (r4.getRight() + r4.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.transformPivotX)) {
                                    childAt.setPivotX(constraint.transform.transformPivotX);
                                }
                                if (!Float.isNaN(constraint.transform.transformPivotY)) {
                                    childAt.setPivotY(constraint.transform.transformPivotY);
                                }
                            }
                            childAt.setTranslationX(constraint.transform.translationX);
                            childAt.setTranslationY(constraint.transform.translationY);
                            childAt.setTranslationZ(constraint.transform.translationZ);
                            Transform transform2 = constraint.transform;
                            if (transform2.applyElevation) {
                                childAt.setElevation(transform2.elevation);
                            }
                        }
                    } else {
                        Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.layout;
                    int[] iArr2 = layout2.mReferenceIds;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.mReferenceIdString;
                        if (str2 != null) {
                            layout2.mReferenceIds = convertReferenceString(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                        }
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void applyToLayoutParams(int i5, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        if (!this.mConstraints.containsKey(Integer.valueOf(i5)) || (constraint = this.mConstraints.get(Integer.valueOf(i5))) == null) {
            return;
        }
        constraint.applyTo(layoutParams);
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void center(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f5) {
        Constraint constraint;
        if (i8 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f5 <= 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i7 == 1 || i7 == 2) {
            connect(i5, 1, i6, i7, i8);
            connect(i5, 2, i9, i10, i11);
            constraint = this.mConstraints.get(Integer.valueOf(i5));
            if (constraint == null) {
                return;
            }
        } else {
            if (i7 != 6 && i7 != 7) {
                connect(i5, 3, i6, i7, i8);
                connect(i5, 4, i9, i10, i11);
                Constraint constraint2 = this.mConstraints.get(Integer.valueOf(i5));
                if (constraint2 != null) {
                    constraint2.layout.verticalBias = f5;
                    return;
                }
                return;
            }
            connect(i5, 6, i6, i7, i8);
            connect(i5, 7, i9, i10, i11);
            constraint = this.mConstraints.get(Integer.valueOf(i5));
            if (constraint == null) {
                return;
            }
        }
        constraint.layout.horizontalBias = f5;
    }

    public void centerHorizontally(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        float f5;
        ConstraintSet constraintSet;
        int i11;
        int i12;
        int i13;
        if (i6 == 0) {
            i12 = 0;
            i7 = 1;
            i8 = 0;
            i13 = 0;
            i9 = 2;
            i10 = 0;
            f5 = 0.5f;
            constraintSet = this;
            i11 = i5;
        } else {
            i7 = 2;
            i8 = 0;
            i9 = 1;
            i10 = 0;
            f5 = 0.5f;
            constraintSet = this;
            i11 = i5;
            i12 = i6;
            i13 = i6;
        }
        constraintSet.center(i11, i12, i7, i8, i13, i9, i10, f5);
    }

    public void centerHorizontally(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f5) {
        connect(i5, 1, i6, i7, i8);
        connect(i5, 2, i9, i10, i11);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i5));
        if (constraint != null) {
            constraint.layout.horizontalBias = f5;
        }
    }

    public void centerHorizontallyRtl(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        float f5;
        ConstraintSet constraintSet;
        int i11;
        int i12;
        int i13;
        if (i6 == 0) {
            i12 = 0;
            i7 = 6;
            i8 = 0;
            i13 = 0;
            i9 = 7;
            i10 = 0;
            f5 = 0.5f;
            constraintSet = this;
            i11 = i5;
        } else {
            i7 = 7;
            i8 = 0;
            i9 = 6;
            i10 = 0;
            f5 = 0.5f;
            constraintSet = this;
            i11 = i5;
            i12 = i6;
            i13 = i6;
        }
        constraintSet.center(i11, i12, i7, i8, i13, i9, i10, f5);
    }

    public void centerHorizontallyRtl(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f5) {
        connect(i5, 6, i6, i7, i8);
        connect(i5, 7, i9, i10, i11);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i5));
        if (constraint != null) {
            constraint.layout.horizontalBias = f5;
        }
    }

    public void centerVertically(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        float f5;
        ConstraintSet constraintSet;
        int i11;
        int i12;
        int i13;
        if (i6 == 0) {
            i12 = 0;
            i7 = 3;
            i8 = 0;
            i13 = 0;
            i9 = 4;
            i10 = 0;
            f5 = 0.5f;
            constraintSet = this;
            i11 = i5;
        } else {
            i7 = 4;
            i8 = 0;
            i9 = 3;
            i10 = 0;
            f5 = 0.5f;
            constraintSet = this;
            i11 = i5;
            i12 = i6;
            i13 = i6;
        }
        constraintSet.center(i11, i12, i7, i8, i13, i9, i10, f5);
    }

    public void centerVertically(int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f5) {
        connect(i5, 3, i6, i7, i8);
        connect(i5, 4, i9, i10, i11);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i5));
        if (constraint != null) {
            constraint.layout.verticalBias = f5;
        }
    }

    public void clear(int i5) {
        this.mConstraints.remove(Integer.valueOf(i5));
    }

    public void clear(int i5, int i6) {
        Constraint constraint;
        if (!this.mConstraints.containsKey(Integer.valueOf(i5)) || (constraint = this.mConstraints.get(Integer.valueOf(i5))) == null) {
            return;
        }
        switch (i6) {
            case 1:
                Layout layout = constraint.layout;
                layout.leftToRight = -1;
                layout.leftToLeft = -1;
                layout.leftMargin = -1;
                layout.goneLeftMargin = Integer.MIN_VALUE;
                return;
            case 2:
                Layout layout2 = constraint.layout;
                layout2.rightToRight = -1;
                layout2.rightToLeft = -1;
                layout2.rightMargin = -1;
                layout2.goneRightMargin = Integer.MIN_VALUE;
                return;
            case 3:
                Layout layout3 = constraint.layout;
                layout3.topToBottom = -1;
                layout3.topToTop = -1;
                layout3.topMargin = 0;
                layout3.goneTopMargin = Integer.MIN_VALUE;
                return;
            case 4:
                Layout layout4 = constraint.layout;
                layout4.bottomToTop = -1;
                layout4.bottomToBottom = -1;
                layout4.bottomMargin = 0;
                layout4.goneBottomMargin = Integer.MIN_VALUE;
                return;
            case 5:
                Layout layout5 = constraint.layout;
                layout5.baselineToBaseline = -1;
                layout5.baselineToTop = -1;
                layout5.baselineToBottom = -1;
                layout5.baselineMargin = 0;
                layout5.goneBaselineMargin = Integer.MIN_VALUE;
                return;
            case 6:
                Layout layout6 = constraint.layout;
                layout6.startToEnd = -1;
                layout6.startToStart = -1;
                layout6.startMargin = 0;
                layout6.goneStartMargin = Integer.MIN_VALUE;
                return;
            case 7:
                Layout layout7 = constraint.layout;
                layout7.endToStart = -1;
                layout7.endToEnd = -1;
                layout7.endMargin = 0;
                layout7.goneEndMargin = Integer.MIN_VALUE;
                return;
            case 8:
                Layout layout8 = constraint.layout;
                layout8.circleAngle = -1.0f;
                layout8.circleRadius = -1;
                layout8.circleConstraint = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void clone(Context context, int i5) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i5, (ViewGroup) null));
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                this.mConstraints.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (constraint != null) {
                constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
                constraint.fillFrom(id, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    Transform transform = constraint.transform;
                    transform.transformPivotX = pivotX;
                    transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                Transform transform2 = constraint.transform;
                if (transform2.applyElevation) {
                    transform2.elevation = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
            }
        }
    }

    public void clone(ConstraintSet constraintSet) {
        this.mConstraints.clear();
        for (Integer num : constraintSet.mConstraints.keySet()) {
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (constraint != null) {
                this.mConstraints.put(num, constraint.m5clone());
            }
        }
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraints.getChildAt(i5);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                this.mConstraints.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    constraint.fillFromConstraints((ConstraintHelper) childAt, id, layoutParams);
                }
                constraint.fillFromConstraints(id, layoutParams);
            }
        }
    }

    public void connect(int i5, int i6, int i7, int i8) {
        Layout layout;
        Layout layout2;
        if (!this.mConstraints.containsKey(Integer.valueOf(i5))) {
            this.mConstraints.put(Integer.valueOf(i5), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i5));
        if (constraint == null) {
            return;
        }
        switch (i6) {
            case 1:
                if (i8 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.leftToLeft = i7;
                    layout3.leftToRight = -1;
                    return;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(a.c(d.g("left to "), sideToString(i8), " undefined"));
                    }
                    Layout layout4 = constraint.layout;
                    layout4.leftToRight = i7;
                    layout4.leftToLeft = -1;
                    return;
                }
            case 2:
                if (i8 == 1) {
                    Layout layout5 = constraint.layout;
                    layout5.rightToLeft = i7;
                    layout5.rightToRight = -1;
                    return;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    Layout layout6 = constraint.layout;
                    layout6.rightToRight = i7;
                    layout6.rightToLeft = -1;
                    return;
                }
            case 3:
                if (i8 == 3) {
                    layout = constraint.layout;
                    layout.topToTop = i7;
                    layout.topToBottom = -1;
                    break;
                } else {
                    if (i8 != 4) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    layout = constraint.layout;
                    layout.topToBottom = i7;
                    layout.topToTop = -1;
                    break;
                }
            case 4:
                if (i8 == 4) {
                    layout = constraint.layout;
                    layout.bottomToBottom = i7;
                    layout.bottomToTop = -1;
                    break;
                } else {
                    if (i8 != 3) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    layout = constraint.layout;
                    layout.bottomToTop = i7;
                    layout.bottomToBottom = -1;
                    break;
                }
            case 5:
                if (i8 == 5) {
                    layout2 = constraint.layout;
                    layout2.baselineToBaseline = i7;
                } else if (i8 == 3) {
                    layout2 = constraint.layout;
                    layout2.baselineToTop = i7;
                } else {
                    if (i8 != 4) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    layout2 = constraint.layout;
                    layout2.baselineToBottom = i7;
                }
                layout2.bottomToBottom = -1;
                layout2.bottomToTop = -1;
                layout2.topToTop = -1;
                layout2.topToBottom = -1;
                return;
            case 6:
                if (i8 == 6) {
                    Layout layout7 = constraint.layout;
                    layout7.startToStart = i7;
                    layout7.startToEnd = -1;
                    return;
                } else {
                    if (i8 != 7) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    Layout layout8 = constraint.layout;
                    layout8.startToEnd = i7;
                    layout8.startToStart = -1;
                    return;
                }
            case 7:
                if (i8 == 7) {
                    Layout layout9 = constraint.layout;
                    layout9.endToEnd = i7;
                    layout9.endToStart = -1;
                    return;
                } else {
                    if (i8 != 6) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    Layout layout10 = constraint.layout;
                    layout10.endToStart = i7;
                    layout10.endToEnd = -1;
                    return;
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(sideToString(i6));
                sb.append(" to ");
                throw new IllegalArgumentException(a.c(sb, sideToString(i8), " unknown"));
        }
        layout.baselineToBaseline = -1;
        layout.baselineToTop = -1;
        layout.baselineToBottom = -1;
    }

    public void connect(int i5, int i6, int i7, int i8, int i9) {
        Layout layout;
        Layout layout2;
        Layout layout3;
        if (!this.mConstraints.containsKey(Integer.valueOf(i5))) {
            this.mConstraints.put(Integer.valueOf(i5), new Constraint());
        }
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i5));
        if (constraint == null) {
            return;
        }
        switch (i6) {
            case 1:
                if (i8 == 1) {
                    Layout layout4 = constraint.layout;
                    layout4.leftToLeft = i7;
                    layout4.leftToRight = -1;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(a.c(d.g("Left to "), sideToString(i8), " undefined"));
                    }
                    Layout layout5 = constraint.layout;
                    layout5.leftToRight = i7;
                    layout5.leftToLeft = -1;
                }
                constraint.layout.leftMargin = i9;
                return;
            case 2:
                if (i8 == 1) {
                    Layout layout6 = constraint.layout;
                    layout6.rightToLeft = i7;
                    layout6.rightToRight = -1;
                } else {
                    if (i8 != 2) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    Layout layout7 = constraint.layout;
                    layout7.rightToRight = i7;
                    layout7.rightToLeft = -1;
                }
                constraint.layout.rightMargin = i9;
                return;
            case 3:
                if (i8 == 3) {
                    layout = constraint.layout;
                    layout.topToTop = i7;
                    layout.topToBottom = -1;
                } else {
                    if (i8 != 4) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    layout = constraint.layout;
                    layout.topToBottom = i7;
                    layout.topToTop = -1;
                }
                layout.baselineToBaseline = -1;
                layout.baselineToTop = -1;
                layout.baselineToBottom = -1;
                constraint.layout.topMargin = i9;
                return;
            case 4:
                if (i8 == 4) {
                    layout2 = constraint.layout;
                    layout2.bottomToBottom = i7;
                    layout2.bottomToTop = -1;
                } else {
                    if (i8 != 3) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    layout2 = constraint.layout;
                    layout2.bottomToTop = i7;
                    layout2.bottomToBottom = -1;
                }
                layout2.baselineToBaseline = -1;
                layout2.baselineToTop = -1;
                layout2.baselineToBottom = -1;
                constraint.layout.bottomMargin = i9;
                return;
            case 5:
                if (i8 == 5) {
                    layout3 = constraint.layout;
                    layout3.baselineToBaseline = i7;
                } else if (i8 == 3) {
                    layout3 = constraint.layout;
                    layout3.baselineToTop = i7;
                } else {
                    if (i8 != 4) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    layout3 = constraint.layout;
                    layout3.baselineToBottom = i7;
                }
                layout3.bottomToBottom = -1;
                layout3.bottomToTop = -1;
                layout3.topToTop = -1;
                layout3.topToBottom = -1;
                return;
            case 6:
                if (i8 == 6) {
                    Layout layout8 = constraint.layout;
                    layout8.startToStart = i7;
                    layout8.startToEnd = -1;
                } else {
                    if (i8 != 7) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    Layout layout9 = constraint.layout;
                    layout9.startToEnd = i7;
                    layout9.startToStart = -1;
                }
                constraint.layout.startMargin = i9;
                return;
            case 7:
                if (i8 == 7) {
                    Layout layout10 = constraint.layout;
                    layout10.endToEnd = i7;
                    layout10.endToStart = -1;
                } else {
                    if (i8 != 6) {
                        throw new IllegalArgumentException(a.c(d.g("right to "), sideToString(i8), " undefined"));
                    }
                    Layout layout11 = constraint.layout;
                    layout11.endToStart = i7;
                    layout11.endToEnd = -1;
                }
                constraint.layout.endMargin = i9;
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(sideToString(i6));
                sb.append(" to ");
                throw new IllegalArgumentException(a.c(sb, sideToString(i8), " unknown"));
        }
    }

    public void constrainCircle(int i5, int i6, int i7, float f5) {
        Layout layout = get(i5).layout;
        layout.circleConstraint = i6;
        layout.circleRadius = i7;
        layout.circleAngle = f5;
    }

    public void constrainDefaultHeight(int i5, int i6) {
        get(i5).layout.heightDefault = i6;
    }

    public void constrainDefaultWidth(int i5, int i6) {
        get(i5).layout.widthDefault = i6;
    }

    public void constrainHeight(int i5, int i6) {
        get(i5).layout.mHeight = i6;
    }

    public void constrainMaxHeight(int i5, int i6) {
        get(i5).layout.heightMax = i6;
    }

    public void constrainMaxWidth(int i5, int i6) {
        get(i5).layout.widthMax = i6;
    }

    public void constrainMinHeight(int i5, int i6) {
        get(i5).layout.heightMin = i6;
    }

    public void constrainMinWidth(int i5, int i6) {
        get(i5).layout.widthMin = i6;
    }

    public void constrainPercentHeight(int i5, float f5) {
        get(i5).layout.heightPercent = f5;
    }

    public void constrainPercentWidth(int i5, float f5) {
        get(i5).layout.widthPercent = f5;
    }

    public void constrainWidth(int i5, int i6) {
        get(i5).layout.mWidth = i6;
    }

    public void constrainedHeight(int i5, boolean z4) {
        get(i5).layout.constrainedHeight = z4;
    }

    public void constrainedWidth(int i5, boolean z4) {
        get(i5).layout.constrainedWidth = z4;
    }

    public void create(int i5, int i6) {
        Layout layout = get(i5).layout;
        layout.mIsGuideline = true;
        layout.orientation = i6;
    }

    public void createBarrier(int i5, int i6, int i7, int... iArr) {
        Layout layout = get(i5).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i6;
        layout.mBarrierMargin = i7;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void createHorizontalChain(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9) {
        createHorizontalChain(i5, i6, i7, i8, iArr, fArr, i9, 1, 2);
    }

    public void createHorizontalChainRtl(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9) {
        createHorizontalChain(i5, i6, i7, i8, iArr, fArr, i9, 6, 7);
    }

    public void createVerticalChain(int i5, int i6, int i7, int i8, int[] iArr, float[] fArr, int i9) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.verticalWeight = fArr[0];
        }
        get(iArr[0]).layout.verticalChainStyle = i9;
        connect(iArr[0], 3, i5, i6, 0);
        for (int i10 = 1; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            int i12 = i10 - 1;
            connect(iArr[i10], 3, iArr[i12], 4, 0);
            connect(iArr[i12], 4, iArr[i10], 3, 0);
            if (fArr != null) {
                get(iArr[i10]).layout.verticalWeight = fArr[i10];
            }
        }
        connect(iArr[iArr.length - 1], 4, i7, i8, 0);
    }

    public void dump(MotionScene motionScene, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.mConstraints.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i5 : iArr) {
                hashSet.add(Integer.valueOf(i5));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            Constraint constraint = this.mConstraints.get(num);
            if (constraint != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                constraint.layout.dump(motionScene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public boolean getApplyElevation(int i5) {
        return get(i5).transform.applyElevation;
    }

    public Constraint getConstraint(int i5) {
        if (this.mConstraints.containsKey(Integer.valueOf(i5))) {
            return this.mConstraints.get(Integer.valueOf(i5));
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public int getHeight(int i5) {
        return get(i5).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.mConstraints.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i5 = 0; i5 < length; i5++) {
            iArr[i5] = numArr[i5].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i5) {
        return get(i5);
    }

    public int[] getReferencedIds(int i5) {
        int[] iArr = get(i5).layout.mReferenceIds;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public int getVisibility(int i5) {
        return get(i5).propertySet.visibility;
    }

    public int getVisibilityMode(int i5) {
        return get(i5).propertySet.mVisibilityMode;
    }

    public int getWidth(int i5) {
        return get(i5).layout.mWidth;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public void load(Context context, int i5) {
        XmlResourceParser xml = context.getResources().getXml(i5);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    Constraint fillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        fillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(Integer.valueOf(fillFromAttributeList.mViewId), fillFromAttributeList);
                }
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x01cb, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i5 = 0; i5 < split.length; i5++) {
            String[] split2 = split[i5].split("=");
            if (split2.length != 2) {
                StringBuilder g5 = d.g(" Unable to parse ");
                g5.append(split[i5]);
                Log.w(TAG, g5.toString());
            } else {
                constraint.setColorValue(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i5 = 0; i5 < split.length; i5++) {
            String[] split2 = split[i5].split("=");
            if (split2.length != 2) {
                StringBuilder g5 = d.g(" Unable to parse ");
                g5.append(split[i5]);
                Log.w(TAG, g5.toString());
            } else {
                constraint.setFloatValue(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        String[] split = str.split(",");
        for (int i5 = 0; i5 < split.length; i5++) {
            String[] split2 = split[i5].split("=");
            if (split2.length != 2) {
                StringBuilder g5 = d.g(" Unable to parse ");
                g5.append(split[i5]);
                Log.w(TAG, g5.toString());
            } else {
                constraint.setFloatValue(split2[0], Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        String[] splitString = splitString(str);
        for (int i5 = 0; i5 < splitString.length; i5++) {
            String[] split = splitString[i5].split("=");
            StringBuilder g5 = d.g(" Unable to parse ");
            g5.append(splitString[i5]);
            Log.w(TAG, g5.toString());
            constraint.setStringValue(split[0], split[1]);
        }
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.mConstraints.containsKey(Integer.valueOf(id))) {
                this.mConstraints.put(Integer.valueOf(id), new Constraint());
            }
            Constraint constraint = this.mConstraints.get(Integer.valueOf(id));
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.fillFrom(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                PropertySet propertySet = constraint.propertySet;
                if (!propertySet.mApply) {
                    propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                Transform transform = constraint.transform;
                if (!transform.mApply) {
                    transform.mApply = true;
                    transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        Transform transform2 = constraint.transform;
                        transform2.transformPivotX = pivotX;
                        transform2.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    Transform transform3 = constraint.transform;
                    if (transform3.applyElevation) {
                        transform3.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        for (Integer num : constraintSet.mConstraints.keySet()) {
            int intValue = num.intValue();
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (!this.mConstraints.containsKey(Integer.valueOf(intValue))) {
                this.mConstraints.put(Integer.valueOf(intValue), new Constraint());
            }
            Constraint constraint2 = this.mConstraints.get(Integer.valueOf(intValue));
            if (constraint2 != null) {
                Layout layout = constraint2.layout;
                if (!layout.mApply) {
                    layout.copyFrom(constraint.layout);
                }
                PropertySet propertySet = constraint2.propertySet;
                if (!propertySet.mApply) {
                    propertySet.copyFrom(constraint.propertySet);
                }
                Transform transform = constraint2.transform;
                if (!transform.mApply) {
                    transform.copyFrom(constraint.transform);
                }
                Motion motion = constraint2.motion;
                if (!motion.mApply) {
                    motion.copyFrom(constraint.motion);
                }
                for (String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.mSavedAttributes.remove(str);
    }

    public void removeFromHorizontalChain(int i5) {
        Constraint constraint;
        int i6;
        int i7;
        int i8;
        int i9;
        ConstraintSet constraintSet;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        ConstraintSet constraintSet2;
        int i16;
        if (!this.mConstraints.containsKey(Integer.valueOf(i5)) || (constraint = this.mConstraints.get(Integer.valueOf(i5))) == null) {
            return;
        }
        Layout layout = constraint.layout;
        int i17 = layout.leftToRight;
        int i18 = layout.rightToLeft;
        if (i17 == -1 && i18 == -1) {
            int i19 = layout.startToEnd;
            int i20 = layout.endToStart;
            if (i19 != -1 || i20 != -1) {
                if (i19 != -1 && i20 != -1) {
                    i15 = 0;
                    constraintSet2 = this;
                    constraintSet2.connect(i19, 7, i20, 6, 0);
                    i13 = 6;
                    i14 = 7;
                    i16 = i20;
                    i12 = i17;
                } else if (i20 != -1) {
                    i12 = layout.rightToRight;
                    if (i12 != -1) {
                        i13 = 7;
                        i14 = 7;
                        i15 = 0;
                        constraintSet2 = this;
                        i16 = i17;
                    } else {
                        i12 = layout.leftToLeft;
                        if (i12 != -1) {
                            i13 = 6;
                            i14 = 6;
                            i15 = 0;
                            constraintSet2 = this;
                            i16 = i20;
                        }
                    }
                }
                constraintSet2.connect(i16, i13, i12, i14, i15);
            }
            clear(i5, 6);
            i11 = 7;
        } else {
            if (i17 == -1 || i18 == -1) {
                i6 = layout.rightToRight;
                if (i6 != -1) {
                    i7 = 2;
                    i8 = 2;
                    i9 = 0;
                    constraintSet = this;
                    i10 = i17;
                } else {
                    i6 = layout.leftToLeft;
                    if (i6 != -1) {
                        i7 = 1;
                        i8 = 1;
                        i9 = 0;
                        constraintSet = this;
                        i10 = i18;
                    }
                    clear(i5, 1);
                    i11 = 2;
                }
            } else {
                i9 = 0;
                constraintSet = this;
                constraintSet.connect(i17, 2, i18, 1, 0);
                i7 = 1;
                i8 = 2;
                i10 = i18;
                i6 = i17;
            }
            constraintSet.connect(i10, i7, i6, i8, i9);
            clear(i5, 1);
            i11 = 2;
        }
        clear(i5, i11);
    }

    public void removeFromVerticalChain(int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        ConstraintSet constraintSet;
        int i10;
        if (this.mConstraints.containsKey(Integer.valueOf(i5))) {
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i5));
            if (constraint == null) {
                return;
            }
            Layout layout = constraint.layout;
            int i11 = layout.topToBottom;
            int i12 = layout.bottomToTop;
            if (i11 != -1 || i12 != -1) {
                if (i11 == -1 || i12 == -1) {
                    i6 = layout.bottomToBottom;
                    if (i6 != -1) {
                        i7 = 4;
                        i8 = 4;
                        i9 = 0;
                        constraintSet = this;
                        i10 = i11;
                    } else {
                        i6 = layout.topToTop;
                        if (i6 != -1) {
                            i7 = 3;
                            i8 = 3;
                            i9 = 0;
                            constraintSet = this;
                            i10 = i12;
                        }
                    }
                } else {
                    i9 = 0;
                    constraintSet = this;
                    constraintSet.connect(i11, 4, i12, 3, 0);
                    i7 = 3;
                    i8 = 4;
                    i10 = i12;
                    i6 = i11;
                }
                constraintSet.connect(i10, i7, i6, i8, i9);
            }
        }
        clear(i5, 3);
        clear(i5, 4);
    }

    public void setAlpha(int i5, float f5) {
        get(i5).propertySet.alpha = f5;
    }

    public void setApplyElevation(int i5, boolean z4) {
        get(i5).transform.applyElevation = z4;
    }

    public void setBarrierType(int i5, int i6) {
        get(i5).layout.mHelperType = i6;
    }

    public void setColorValue(int i5, String str, int i6) {
        get(i5).setColorValue(str, i6);
    }

    public void setDimensionRatio(int i5, String str) {
        get(i5).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i5, int i6) {
        get(i5).layout.editorAbsoluteX = i6;
    }

    public void setEditorAbsoluteY(int i5, int i6) {
        get(i5).layout.editorAbsoluteY = i6;
    }

    public void setElevation(int i5, float f5) {
        get(i5).transform.elevation = f5;
        get(i5).transform.applyElevation = true;
    }

    public void setFloatValue(int i5, String str, float f5) {
        get(i5).setFloatValue(str, f5);
    }

    public void setForceId(boolean z4) {
        this.mForceId = z4;
    }

    public void setGoneMargin(int i5, int i6, int i7) {
        Constraint constraint = get(i5);
        switch (i6) {
            case 1:
                constraint.layout.goneLeftMargin = i7;
                return;
            case 2:
                constraint.layout.goneRightMargin = i7;
                return;
            case 3:
                constraint.layout.goneTopMargin = i7;
                return;
            case 4:
                constraint.layout.goneBottomMargin = i7;
                return;
            case 5:
                constraint.layout.goneBaselineMargin = i7;
                return;
            case 6:
                constraint.layout.goneStartMargin = i7;
                return;
            case 7:
                constraint.layout.goneEndMargin = i7;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i5, int i6) {
        get(i5).layout.guideBegin = i6;
        get(i5).layout.guideEnd = -1;
        get(i5).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i5, int i6) {
        get(i5).layout.guideEnd = i6;
        get(i5).layout.guideBegin = -1;
        get(i5).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i5, float f5) {
        get(i5).layout.guidePercent = f5;
        get(i5).layout.guideEnd = -1;
        get(i5).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i5, float f5) {
        get(i5).layout.horizontalBias = f5;
    }

    public void setHorizontalChainStyle(int i5, int i6) {
        get(i5).layout.horizontalChainStyle = i6;
    }

    public void setHorizontalWeight(int i5, float f5) {
        get(i5).layout.horizontalWeight = f5;
    }

    public void setIntValue(int i5, String str, int i6) {
        get(i5).setIntValue(str, i6);
    }

    public void setLayoutWrapBehavior(int i5, int i6) {
        if (i6 < 0 || i6 > 3) {
            return;
        }
        get(i5).layout.mWrapBehavior = i6;
    }

    public void setMargin(int i5, int i6, int i7) {
        Constraint constraint = get(i5);
        switch (i6) {
            case 1:
                constraint.layout.leftMargin = i7;
                return;
            case 2:
                constraint.layout.rightMargin = i7;
                return;
            case 3:
                constraint.layout.topMargin = i7;
                return;
            case 4:
                constraint.layout.bottomMargin = i7;
                return;
            case 5:
                constraint.layout.baselineMargin = i7;
                return;
            case 6:
                constraint.layout.startMargin = i7;
                return;
            case 7:
                constraint.layout.endMargin = i7;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i5, int... iArr) {
        get(i5).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i5, float f5) {
        get(i5).transform.rotation = f5;
    }

    public void setRotationX(int i5, float f5) {
        get(i5).transform.rotationX = f5;
    }

    public void setRotationY(int i5, float f5) {
        get(i5).transform.rotationY = f5;
    }

    public void setScaleX(int i5, float f5) {
        get(i5).transform.scaleX = f5;
    }

    public void setScaleY(int i5, float f5) {
        get(i5).transform.scaleY = f5;
    }

    public void setStringValue(int i5, String str, String str2) {
        get(i5).setStringValue(str, str2);
    }

    public void setTransformPivot(int i5, float f5, float f6) {
        Transform transform = get(i5).transform;
        transform.transformPivotY = f6;
        transform.transformPivotX = f5;
    }

    public void setTransformPivotX(int i5, float f5) {
        get(i5).transform.transformPivotX = f5;
    }

    public void setTransformPivotY(int i5, float f5) {
        get(i5).transform.transformPivotY = f5;
    }

    public void setTranslation(int i5, float f5, float f6) {
        Transform transform = get(i5).transform;
        transform.translationX = f5;
        transform.translationY = f6;
    }

    public void setTranslationX(int i5, float f5) {
        get(i5).transform.translationX = f5;
    }

    public void setTranslationY(int i5, float f5) {
        get(i5).transform.translationY = f5;
    }

    public void setTranslationZ(int i5, float f5) {
        get(i5).transform.translationZ = f5;
    }

    public void setValidateOnParse(boolean z4) {
        this.mValidate = z4;
    }

    public void setVerticalBias(int i5, float f5) {
        get(i5).layout.verticalBias = f5;
    }

    public void setVerticalChainStyle(int i5, int i6) {
        get(i5).layout.verticalChainStyle = i6;
    }

    public void setVerticalWeight(int i5, float f5) {
        get(i5).layout.verticalWeight = f5;
    }

    public void setVisibility(int i5, int i6) {
        get(i5).propertySet.visibility = i6;
    }

    public void setVisibilityMode(int i5, int i6) {
        get(i5).propertySet.mVisibilityMode = i6;
    }

    public void writeState(Writer writer, ConstraintLayout constraintLayout, int i5) {
        writer.write("\n---------------------------------------------\n");
        if ((i5 & 1) == 1) {
            new WriteXmlEngine(writer, constraintLayout, i5).writeLayout();
        } else {
            new WriteJsonEngine(writer, constraintLayout, i5).writeLayout();
        }
        writer.write("\n---------------------------------------------\n");
    }
}
