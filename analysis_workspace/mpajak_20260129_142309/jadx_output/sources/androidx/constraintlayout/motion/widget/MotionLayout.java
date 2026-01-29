package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.NestedScrollingParent3;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes20.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    public static final int MAX_KEY_FRAMES = 50;
    public static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    public boolean firstDown;
    private float lastPos;
    private float lastY;
    private long mAnimationStartTime;
    private int mBeginState;
    private RectF mBoundsCheck;
    public int mCurrentState;
    public int mDebugPath;
    private DecelerateInterpolator mDecelerateLogic;
    private ArrayList<MotionHelper> mDecoratorsHelpers;
    private boolean mDelayedApply;
    private DesignTool mDesignTool;
    public DevModeDraw mDevModeDraw;
    private int mEndState;
    public int mEndWrapHeight;
    public int mEndWrapWidth;
    public HashMap<View, MotionController> mFrameArrayList;
    private int mFrames;
    public int mHeightMeasureMode;
    private boolean mInLayout;
    private boolean mInRotation;
    public boolean mInTransition;
    public boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    public Interpolator mInterpolator;
    private Matrix mInverseMatrix;
    public boolean mIsAnimating;
    private boolean mKeepAnimating;
    private KeyCache mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    public int mLastLayoutHeight;
    public int mLastLayoutWidth;
    public float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mListenerPosition;
    private int mListenerState;
    public boolean mMeasureDuringTransition;
    public Model mModel;
    private boolean mNeedsFireTransitionCompleted;
    public int mOldHeight;
    public int mOldWidth;
    private Runnable mOnComplete;
    private ArrayList<MotionHelper> mOnHideHelpers;
    private ArrayList<MotionHelper> mOnShowHelpers;
    public float mPostInterpolationPosition;
    public HashMap<View, ViewState> mPreRotate;
    private int mPreRotateHeight;
    private int mPreRotateWidth;
    private int mPreviouseRotation;
    public Interpolator mProgressInterpolator;
    private View mRegionView;
    public int mRotatMode;
    public MotionScene mScene;
    private int[] mScheduledTransitionTo;
    public int mScheduledTransitions;
    public float mScrollTargetDT;
    public float mScrollTargetDX;
    public float mScrollTargetDY;
    public long mScrollTargetTime;
    public int mStartWrapHeight;
    public int mStartWrapWidth;
    private StateCache mStateCache;
    private StopLogic mStopLogic;
    public Rect mTempRect;
    private boolean mTemporalInterpolator;
    public ArrayList<Integer> mTransitionCompleted;
    private float mTransitionDuration;
    public float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    public float mTransitionLastPosition;
    private long mTransitionLastTime;
    private TransitionListener mTransitionListener;
    private CopyOnWriteArrayList<TransitionListener> mTransitionListeners;
    public float mTransitionPosition;
    public TransitionState mTransitionState;
    public boolean mUndergoingMotion;
    public int mWidthMeasureMode;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$5, reason: invalid class name */
    /* loaded from: classes24.dex */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState;

        static {
            int[] iArr = new int[TransitionState.values().length];
            $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState = iArr;
            try {
                iArr[TransitionState.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[TransitionState.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes21.dex */
    public class DecelerateInterpolator extends MotionInterpolator {
        public float maxA;
        public float initalV = 0.0f;
        public float currentP = 0.0f;

        public DecelerateInterpolator() {
        }

        public void config(float f5, float f6, float f7) {
            this.initalV = f5;
            this.currentP = f6;
            this.maxA = f7;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f6 = this.initalV;
            if (f6 > 0.0f) {
                float f7 = this.maxA;
                if (f6 / f7 < f5) {
                    f5 = f6 / f7;
                }
                MotionLayout.this.mLastVelocity = f6 - (f7 * f5);
                return ((f6 * f5) - (((f7 * f5) * f5) / 2.0f)) + this.currentP;
            }
            float f8 = this.maxA;
            if ((-f6) / f8 < f5) {
                f5 = (-f6) / f8;
            }
            MotionLayout.this.mLastVelocity = (f8 * f5) + f6;
            return (((f8 * f5) * f5) / 2.0f) + (f6 * f5) + this.currentP;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    /* loaded from: classes14.dex */
    public class DevModeDraw {
        private static final int DEBUG_PATH_TICKS_PER_MS = 16;
        public DashPathEffect mDashPathEffect;
        public Paint mFillPaint;
        public int mKeyFrameCount;
        public float[] mKeyFramePoints;
        public Paint mPaint;
        public Paint mPaintGraph;
        public Paint mPaintKeyframes;
        public Path mPath;
        public int[] mPathMode;
        public float[] mPoints;
        private float[] mRectangle;
        public int mShadowTranslate;
        public Paint mTextPaint;
        public final int RED_COLOR = -21965;
        public final int KEYFRAME_COLOR = -2067046;
        public final int GRAPH_COLOR = -13391360;
        public final int SHADOW_COLOR = 1996488704;
        public final int DIAMOND_SIZE = 10;
        public Rect mBounds = new Rect();
        public boolean mPresentationMode = false;

        public DevModeDraw() {
            this.mShadowTranslate = 1;
            Paint paint = new Paint();
            this.mPaint = paint;
            paint.setAntiAlias(true);
            this.mPaint.setColor(-21965);
            this.mPaint.setStrokeWidth(2.0f);
            this.mPaint.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.mPaintKeyframes = paint2;
            paint2.setAntiAlias(true);
            this.mPaintKeyframes.setColor(-2067046);
            this.mPaintKeyframes.setStrokeWidth(2.0f);
            this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.mPaintGraph = paint3;
            paint3.setAntiAlias(true);
            this.mPaintGraph.setColor(-13391360);
            this.mPaintGraph.setStrokeWidth(2.0f);
            this.mPaintGraph.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.mTextPaint = paint4;
            paint4.setAntiAlias(true);
            this.mTextPaint.setColor(-13391360);
            this.mTextPaint.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.mRectangle = new float[8];
            Paint paint5 = new Paint();
            this.mFillPaint = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.mDashPathEffect = dashPathEffect;
            this.mPaintGraph.setPathEffect(dashPathEffect);
            this.mKeyFramePoints = new float[100];
            this.mPathMode = new int[50];
            if (this.mPresentationMode) {
                this.mPaint.setStrokeWidth(8.0f);
                this.mFillPaint.setStrokeWidth(8.0f);
                this.mPaintKeyframes.setStrokeWidth(8.0f);
                this.mShadowTranslate = 4;
            }
        }

        private void drawBasicPath(Canvas canvas) {
            canvas.drawLines(this.mPoints, this.mPaint);
        }

        private void drawPathAsConfigured(Canvas canvas) {
            boolean z4 = false;
            boolean z5 = false;
            for (int i5 = 0; i5 < this.mKeyFrameCount; i5++) {
                int[] iArr = this.mPathMode;
                if (iArr[i5] == 1) {
                    z4 = true;
                }
                if (iArr[i5] == 0) {
                    z5 = true;
                }
            }
            if (z4) {
                drawPathRelative(canvas);
            }
            if (z5) {
                drawPathCartesian(canvas);
            }
        }

        private void drawPathCartesian(Canvas canvas) {
            float[] fArr = this.mPoints;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[fArr.length - 2];
            float f8 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f5, f7), Math.max(f6, f8), Math.max(f5, f7), Math.max(f6, f8), this.mPaintGraph);
            canvas.drawLine(Math.min(f5, f7), Math.min(f6, f8), Math.min(f5, f7), Math.max(f6, f8), this.mPaintGraph);
        }

        private void drawPathCartesianTicks(Canvas canvas, float f5, float f6) {
            float[] fArr = this.mPoints;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            float min = Math.min(f7, f9);
            float max = Math.max(f8, f10);
            float min2 = f5 - Math.min(f7, f9);
            float max2 = Math.max(f8, f10) - f6;
            StringBuilder g5 = d.g("");
            g5.append(((int) (((min2 * 100.0f) / Math.abs(f9 - f7)) + 0.5d)) / 100.0f);
            String sb = g5.toString();
            getTextBounds(sb, this.mTextPaint);
            canvas.drawText(sb, ((min2 / 2.0f) - (this.mBounds.width() / 2)) + min, f6 - 20.0f, this.mTextPaint);
            canvas.drawLine(f5, f6, Math.min(f7, f9), f6, this.mPaintGraph);
            StringBuilder g6 = d.g("");
            g6.append(((int) (((max2 * 100.0f) / Math.abs(f10 - f8)) + 0.5d)) / 100.0f);
            String sb2 = g6.toString();
            getTextBounds(sb2, this.mTextPaint);
            canvas.drawText(sb2, f5 + 5.0f, max - ((max2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f5, f6, f5, Math.max(f8, f10), this.mPaintGraph);
        }

        private void drawPathRelative(Canvas canvas) {
            float[] fArr = this.mPoints;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
        }

        private void drawPathRelativeTicks(Canvas canvas, float f5, float f6) {
            float[] fArr = this.mPoints;
            float f7 = fArr[0];
            float f8 = fArr[1];
            float f9 = fArr[fArr.length - 2];
            float f10 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f7 - f9, f8 - f10);
            float f11 = f9 - f7;
            float f12 = f10 - f8;
            float f13 = (((f6 - f8) * f12) + ((f5 - f7) * f11)) / (hypot * hypot);
            float f14 = f7 + (f11 * f13);
            float f15 = f8 + (f13 * f12);
            Path path = new Path();
            path.moveTo(f5, f6);
            path.lineTo(f14, f15);
            float hypot2 = (float) Math.hypot(f14 - f5, f15 - f6);
            StringBuilder g5 = d.g("");
            g5.append(((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            String sb = g5.toString();
            getTextBounds(sb, this.mTextPaint);
            canvas.drawTextOnPath(sb, path, (hypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
            canvas.drawLine(f5, f6, f14, f15, this.mPaintGraph);
        }

        private void drawPathScreenTicks(Canvas canvas, float f5, float f6, int i5, int i6) {
            StringBuilder g5 = d.g("");
            g5.append(((int) ((((f5 - (i5 / 2)) * 100.0f) / (MotionLayout.this.getWidth() - i5)) + 0.5d)) / 100.0f);
            String sb = g5.toString();
            getTextBounds(sb, this.mTextPaint);
            canvas.drawText(sb, ((f5 / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, f6 - 20.0f, this.mTextPaint);
            canvas.drawLine(f5, f6, Math.min(0.0f, 1.0f), f6, this.mPaintGraph);
            StringBuilder g6 = d.g("");
            g6.append(((int) ((((f6 - (i6 / 2)) * 100.0f) / (MotionLayout.this.getHeight() - i6)) + 0.5d)) / 100.0f);
            String sb2 = g6.toString();
            getTextBounds(sb2, this.mTextPaint);
            canvas.drawText(sb2, f5 + 5.0f, 0.0f - ((f6 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
            canvas.drawLine(f5, f6, f5, Math.max(0.0f, 1.0f), this.mPaintGraph);
        }

        private void drawRectangle(Canvas canvas, MotionController motionController) {
            this.mPath.reset();
            for (int i5 = 0; i5 <= 50; i5++) {
                motionController.buildRect(i5 / 50, this.mRectangle, 0);
                Path path = this.mPath;
                float[] fArr = this.mRectangle;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.mPath;
                float[] fArr2 = this.mRectangle;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.mPath;
                float[] fArr3 = this.mRectangle;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.mPath;
                float[] fArr4 = this.mRectangle;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.mPath.close();
            }
            this.mPaint.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.mPath, this.mPaint);
            canvas.translate(-2.0f, -2.0f);
            this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
            canvas.drawPath(this.mPath, this.mPaint);
        }

        private void drawTicks(Canvas canvas, int i5, int i6, MotionController motionController) {
            int i7;
            int i8;
            float f5;
            float f6;
            View view = motionController.mView;
            if (view != null) {
                i7 = view.getWidth();
                i8 = motionController.mView.getHeight();
            } else {
                i7 = 0;
                i8 = 0;
            }
            for (int i9 = 1; i9 < i6 - 1; i9++) {
                if (i5 != 4 || this.mPathMode[i9 - 1] != 0) {
                    float[] fArr = this.mKeyFramePoints;
                    int i10 = i9 * 2;
                    float f7 = fArr[i10];
                    float f8 = fArr[i10 + 1];
                    this.mPath.reset();
                    this.mPath.moveTo(f7, f8 + 10.0f);
                    this.mPath.lineTo(f7 + 10.0f, f8);
                    this.mPath.lineTo(f7, f8 - 10.0f);
                    this.mPath.lineTo(f7 - 10.0f, f8);
                    this.mPath.close();
                    int i11 = i9 - 1;
                    motionController.getKeyFrame(i11);
                    if (i5 == 4) {
                        int[] iArr = this.mPathMode;
                        if (iArr[i11] == 1) {
                            drawPathRelativeTicks(canvas, f7 - 0.0f, f8 - 0.0f);
                        } else if (iArr[i11] == 0) {
                            drawPathCartesianTicks(canvas, f7 - 0.0f, f8 - 0.0f);
                        } else if (iArr[i11] == 2) {
                            f5 = f8;
                            f6 = f7;
                            drawPathScreenTicks(canvas, f7 - 0.0f, f8 - 0.0f, i7, i8);
                            canvas.drawPath(this.mPath, this.mFillPaint);
                        }
                        f5 = f8;
                        f6 = f7;
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    } else {
                        f5 = f8;
                        f6 = f7;
                    }
                    if (i5 == 2) {
                        drawPathRelativeTicks(canvas, f6 - 0.0f, f5 - 0.0f);
                    }
                    if (i5 == 3) {
                        drawPathCartesianTicks(canvas, f6 - 0.0f, f5 - 0.0f);
                    }
                    if (i5 == 6) {
                        drawPathScreenTicks(canvas, f6 - 0.0f, f5 - 0.0f, i7, i8);
                    }
                    canvas.drawPath(this.mPath, this.mFillPaint);
                }
            }
            float[] fArr2 = this.mPoints;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
                float[] fArr3 = this.mPoints;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
            }
        }

        private void drawTranslation(Canvas canvas, float f5, float f6, float f7, float f8) {
            canvas.drawRect(f5, f6, f7, f8, this.mPaintGraph);
            canvas.drawLine(f5, f6, f7, f8, this.mPaintGraph);
        }

        public void draw(Canvas canvas, HashMap<View, MotionController> hashMap, int i5, int i6) {
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!MotionLayout.this.isInEditMode() && (i6 & 1) == 2) {
                String str = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.mEndState) + ":" + MotionLayout.this.getProgress();
                canvas.drawText(str, 10.0f, MotionLayout.this.getHeight() - 30, this.mTextPaint);
                canvas.drawText(str, 11.0f, MotionLayout.this.getHeight() - 29, this.mPaint);
            }
            for (MotionController motionController : hashMap.values()) {
                int drawPath = motionController.getDrawPath();
                if (i6 > 0 && drawPath == 0) {
                    drawPath = 1;
                }
                if (drawPath != 0) {
                    this.mKeyFrameCount = motionController.buildKeyFrames(this.mKeyFramePoints, this.mPathMode);
                    if (drawPath >= 1) {
                        int i7 = i5 / 16;
                        float[] fArr = this.mPoints;
                        if (fArr == null || fArr.length != i7 * 2) {
                            this.mPoints = new float[i7 * 2];
                            this.mPath = new Path();
                        }
                        int i8 = this.mShadowTranslate;
                        canvas.translate(i8, i8);
                        this.mPaint.setColor(1996488704);
                        this.mFillPaint.setColor(1996488704);
                        this.mPaintKeyframes.setColor(1996488704);
                        this.mPaintGraph.setColor(1996488704);
                        motionController.buildPath(this.mPoints, i7);
                        drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                        this.mPaint.setColor(-21965);
                        this.mPaintKeyframes.setColor(-2067046);
                        this.mFillPaint.setColor(-2067046);
                        this.mPaintGraph.setColor(-13391360);
                        int i9 = this.mShadowTranslate;
                        canvas.translate(-i9, -i9);
                        drawAll(canvas, drawPath, this.mKeyFrameCount, motionController);
                        if (drawPath == 5) {
                            drawRectangle(canvas, motionController);
                        }
                    }
                }
            }
            canvas.restore();
        }

        public void drawAll(Canvas canvas, int i5, int i6, MotionController motionController) {
            if (i5 == 4) {
                drawPathAsConfigured(canvas);
            }
            if (i5 == 2) {
                drawPathRelative(canvas);
            }
            if (i5 == 3) {
                drawPathCartesian(canvas);
            }
            drawBasicPath(canvas);
            drawTicks(canvas, i5, i6, motionController);
        }

        public void getTextBounds(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.mBounds);
        }
    }

    /* loaded from: classes16.dex */
    public class Model {
        public int mEndId;
        public int mStartId;
        public ConstraintWidgetContainer mLayoutStart = new ConstraintWidgetContainer();
        public ConstraintWidgetContainer mLayoutEnd = new ConstraintWidgetContainer();
        public ConstraintSet mStart = null;
        public ConstraintSet mEnd = null;

        public Model() {
        }

        private void computeStartEndSize(int i5, int i6) {
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.mCurrentState == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer = this.mLayoutEnd;
                ConstraintSet constraintSet = this.mEnd;
                motionLayout2.resolveSystem(constraintWidgetContainer, optimizationLevel, (constraintSet == null || constraintSet.mRotate == 0) ? i5 : i6, (constraintSet == null || constraintSet.mRotate == 0) ? i6 : i5);
                ConstraintSet constraintSet2 = this.mStart;
                if (constraintSet2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    int i7 = constraintSet2.mRotate;
                    int i8 = i7 == 0 ? i5 : i6;
                    if (i7 == 0) {
                        i5 = i6;
                    }
                    motionLayout3.resolveSystem(constraintWidgetContainer2, optimizationLevel, i8, i5);
                    return;
                }
                return;
            }
            ConstraintSet constraintSet3 = this.mStart;
            if (constraintSet3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                int i9 = constraintSet3.mRotate;
                motionLayout4.resolveSystem(constraintWidgetContainer3, optimizationLevel, i9 == 0 ? i5 : i6, i9 == 0 ? i6 : i5);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            ConstraintWidgetContainer constraintWidgetContainer4 = this.mLayoutEnd;
            ConstraintSet constraintSet4 = this.mEnd;
            int i10 = (constraintSet4 == null || constraintSet4.mRotate == 0) ? i5 : i6;
            if (constraintSet4 == null || constraintSet4.mRotate == 0) {
                i5 = i6;
            }
            motionLayout5.resolveSystem(constraintWidgetContainer4, optimizationLevel, i10, i5);
        }

        @SuppressLint({"LogConditional"})
        private void debugLayout(String str, ConstraintWidgetContainer constraintWidgetContainer) {
            View view = (View) constraintWidgetContainer.getCompanionWidget();
            StringBuilder e5 = androidx.activity.result.a.e(str, " ");
            e5.append(Debug.getName(view));
            String sb = e5.toString();
            Log.v(MotionLayout.TAG, sb + "  ========= " + constraintWidgetContainer);
            int size = constraintWidgetContainer.getChildren().size();
            for (int i5 = 0; i5 < size; i5++) {
                String str2 = sb + "[" + i5 + "] ";
                ConstraintWidget constraintWidget = constraintWidgetContainer.getChildren().get(i5);
                StringBuilder g5 = d.g("");
                g5.append(constraintWidget.mTop.mTarget != null ? ExifInterface.GPS_DIRECTION_TRUE : "_");
                StringBuilder g6 = d.g(g5.toString());
                g6.append(constraintWidget.mBottom.mTarget != null ? "B" : "_");
                StringBuilder g7 = d.g(g6.toString());
                g7.append(constraintWidget.mLeft.mTarget != null ? "L" : "_");
                StringBuilder g8 = d.g(g7.toString());
                g8.append(constraintWidget.mRight.mTarget != null ? "R" : "_");
                String sb2 = g8.toString();
                View view2 = (View) constraintWidget.getCompanionWidget();
                String name = Debug.getName(view2);
                if (view2 instanceof TextView) {
                    StringBuilder e6 = androidx.activity.result.a.e(name, "(");
                    e6.append((Object) ((TextView) view2).getText());
                    e6.append(")");
                    name = e6.toString();
                }
                Log.v(MotionLayout.TAG, str2 + "  " + name + " " + constraintWidget + " " + sb2);
            }
            Log.v(MotionLayout.TAG, sb + " done. ");
        }

        @SuppressLint({"LogConditional"})
        private void debugLayoutParam(String str, ConstraintLayout.LayoutParams layoutParams) {
            StringBuilder g5 = d.g(" ");
            g5.append(layoutParams.startToStart != -1 ? "SS" : "__");
            StringBuilder g6 = d.g(g5.toString());
            g6.append(layoutParams.startToEnd != -1 ? "|SE" : "|__");
            StringBuilder g7 = d.g(g6.toString());
            g7.append(layoutParams.endToStart != -1 ? "|ES" : "|__");
            StringBuilder g8 = d.g(g7.toString());
            g8.append(layoutParams.endToEnd != -1 ? "|EE" : "|__");
            StringBuilder g9 = d.g(g8.toString());
            g9.append(layoutParams.leftToLeft != -1 ? "|LL" : "|__");
            StringBuilder g10 = d.g(g9.toString());
            g10.append(layoutParams.leftToRight != -1 ? "|LR" : "|__");
            StringBuilder g11 = d.g(g10.toString());
            g11.append(layoutParams.rightToLeft != -1 ? "|RL" : "|__");
            StringBuilder g12 = d.g(g11.toString());
            g12.append(layoutParams.rightToRight != -1 ? "|RR" : "|__");
            StringBuilder g13 = d.g(g12.toString());
            g13.append(layoutParams.topToTop != -1 ? "|TT" : "|__");
            StringBuilder g14 = d.g(g13.toString());
            g14.append(layoutParams.topToBottom != -1 ? "|TB" : "|__");
            StringBuilder g15 = d.g(g14.toString());
            g15.append(layoutParams.bottomToTop != -1 ? "|BT" : "|__");
            StringBuilder g16 = d.g(g15.toString());
            g16.append(layoutParams.bottomToBottom != -1 ? "|BB" : "|__");
            Log.v(MotionLayout.TAG, str + g16.toString());
        }

        @SuppressLint({"LogConditional"})
        private void debugWidget(String str, ConstraintWidget constraintWidget) {
            String str2;
            String str3;
            String str4;
            StringBuilder g5 = d.g(" ");
            String str5 = "__";
            if (constraintWidget.mTop.mTarget != null) {
                StringBuilder g6 = d.g(ExifInterface.GPS_DIRECTION_TRUE);
                g6.append(constraintWidget.mTop.mTarget.mType == ConstraintAnchor.Type.TOP ? ExifInterface.GPS_DIRECTION_TRUE : "B");
                str2 = g6.toString();
            } else {
                str2 = "__";
            }
            g5.append(str2);
            StringBuilder g7 = d.g(g5.toString());
            if (constraintWidget.mBottom.mTarget != null) {
                StringBuilder g8 = d.g("B");
                g8.append(constraintWidget.mBottom.mTarget.mType == ConstraintAnchor.Type.TOP ? ExifInterface.GPS_DIRECTION_TRUE : "B");
                str3 = g8.toString();
            } else {
                str3 = "__";
            }
            g7.append(str3);
            StringBuilder g9 = d.g(g7.toString());
            if (constraintWidget.mLeft.mTarget != null) {
                StringBuilder g10 = d.g("L");
                g10.append(constraintWidget.mLeft.mTarget.mType == ConstraintAnchor.Type.LEFT ? "L" : "R");
                str4 = g10.toString();
            } else {
                str4 = "__";
            }
            g9.append(str4);
            StringBuilder g11 = d.g(g9.toString());
            if (constraintWidget.mRight.mTarget != null) {
                StringBuilder g12 = d.g("R");
                g12.append(constraintWidget.mRight.mTarget.mType == ConstraintAnchor.Type.LEFT ? "L" : "R");
                str5 = g12.toString();
            }
            g11.append(str5);
            Log.v(MotionLayout.TAG, str + g11.toString() + " ---  " + constraintWidget);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void setupConstraintWidget(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, constraintWidgetContainer);
            sparseArray.put(MotionLayout.this.getId(), constraintWidgetContainer);
            if (constraintSet != null && constraintSet.mRotate != 0) {
                MotionLayout motionLayout = MotionLayout.this;
                motionLayout.resolveSystem(this.mLayoutEnd, motionLayout.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824));
            }
            Iterator<ConstraintWidget> it = constraintWidgetContainer.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.setAnimated(true);
                sparseArray.put(((View) next.getCompanionWidget()).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = constraintWidgetContainer.getChildren().iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.getCompanionWidget();
                constraintSet.applyToLayoutParams(view.getId(), layoutParams);
                next2.setWidth(constraintSet.getWidth(view.getId()));
                next2.setHeight(constraintSet.getHeight(view.getId()));
                if (view instanceof ConstraintHelper) {
                    constraintSet.applyToHelper((ConstraintHelper) view, next2, layoutParams, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).validateParams();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view, next2, layoutParams, sparseArray);
                next2.setVisibility(constraintSet.getVisibilityMode(view.getId()) == 1 ? view.getVisibility() : constraintSet.getVisibility(view.getId()));
            }
            Iterator<ConstraintWidget> it3 = constraintWidgetContainer.getChildren().iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof VirtualLayout) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) next3.getCompanionWidget();
                    Helper helper = (Helper) next3;
                    constraintHelper.updatePreLayout(constraintWidgetContainer, helper, sparseArray);
                    ((VirtualLayout) helper).captureWidgets();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00e9  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void build() {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.Model.build():void");
        }

        public void copy(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(constraintWidgetContainer, constraintWidgetContainer2);
            constraintWidgetContainer2.getChildren().clear();
            constraintWidgetContainer2.copy(constraintWidgetContainer, hashMap);
            Iterator<ConstraintWidget> it = children.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                ConstraintWidget barrier = next instanceof androidx.constraintlayout.core.widgets.Barrier ? new androidx.constraintlayout.core.widgets.Barrier() : next instanceof Guideline ? new Guideline() : next instanceof Flow ? new Flow() : next instanceof Placeholder ? new Placeholder() : next instanceof Helper ? new HelperWidget() : new ConstraintWidget();
                constraintWidgetContainer2.add(barrier);
                hashMap.put(next, barrier);
            }
            Iterator<ConstraintWidget> it2 = children.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).copy(next2, hashMap);
            }
        }

        public ConstraintWidget getWidget(ConstraintWidgetContainer constraintWidgetContainer, View view) {
            if (constraintWidgetContainer.getCompanionWidget() == view) {
                return constraintWidgetContainer;
            }
            ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
            int size = children.size();
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget = children.get(i5);
                if (constraintWidget.getCompanionWidget() == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public void initFrom(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet, ConstraintSet constraintSet2) {
            this.mStart = constraintSet;
            this.mEnd = constraintSet2;
            this.mLayoutStart = new ConstraintWidgetContainer();
            this.mLayoutEnd = new ConstraintWidgetContainer();
            this.mLayoutStart.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutEnd.setMeasurer(MotionLayout.this.mLayoutWidget.getMeasurer());
            this.mLayoutStart.removeAllChildren();
            this.mLayoutEnd.removeAllChildren();
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutStart);
            copy(MotionLayout.this.mLayoutWidget, this.mLayoutEnd);
            if (MotionLayout.this.mTransitionLastPosition > 0.5d) {
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
            } else {
                setupConstraintWidget(this.mLayoutEnd, constraintSet2);
                if (constraintSet != null) {
                    setupConstraintWidget(this.mLayoutStart, constraintSet);
                }
            }
            this.mLayoutStart.setRtl(MotionLayout.this.isRtl());
            this.mLayoutStart.updateHierarchy();
            this.mLayoutEnd.setRtl(MotionLayout.this.isRtl());
            this.mLayoutEnd.updateHierarchy();
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer2 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer2.setHorizontalDimensionBehaviour(dimensionBehaviour);
                    this.mLayoutEnd.setHorizontalDimensionBehaviour(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    ConstraintWidgetContainer constraintWidgetContainer3 = this.mLayoutStart;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    constraintWidgetContainer3.setVerticalDimensionBehaviour(dimensionBehaviour2);
                    this.mLayoutEnd.setVerticalDimensionBehaviour(dimensionBehaviour2);
                }
            }
        }

        public boolean isNotConfiguredWith(int i5, int i6) {
            return (i5 == this.mStartId && i6 == this.mEndId) ? false : true;
        }

        public void measure(int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            MotionLayout motionLayout = MotionLayout.this;
            motionLayout.mWidthMeasureMode = mode;
            motionLayout.mHeightMeasureMode = mode2;
            motionLayout.getOptimizationLevel();
            computeStartEndSize(i5, i6);
            if (((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) ? false : true) {
                computeStartEndSize(i5, i6);
                MotionLayout.this.mStartWrapWidth = this.mLayoutStart.getWidth();
                MotionLayout.this.mStartWrapHeight = this.mLayoutStart.getHeight();
                MotionLayout.this.mEndWrapWidth = this.mLayoutEnd.getWidth();
                MotionLayout.this.mEndWrapHeight = this.mLayoutEnd.getHeight();
                MotionLayout motionLayout2 = MotionLayout.this;
                motionLayout2.mMeasureDuringTransition = (motionLayout2.mStartWrapWidth == motionLayout2.mEndWrapWidth && motionLayout2.mStartWrapHeight == motionLayout2.mEndWrapHeight) ? false : true;
            }
            MotionLayout motionLayout3 = MotionLayout.this;
            int i7 = motionLayout3.mStartWrapWidth;
            int i8 = motionLayout3.mStartWrapHeight;
            int i9 = motionLayout3.mWidthMeasureMode;
            if (i9 == Integer.MIN_VALUE || i9 == 0) {
                i7 = (int) ((motionLayout3.mPostInterpolationPosition * (motionLayout3.mEndWrapWidth - i7)) + i7);
            }
            int i10 = i7;
            int i11 = motionLayout3.mHeightMeasureMode;
            if (i11 == Integer.MIN_VALUE || i11 == 0) {
                i8 = (int) ((motionLayout3.mPostInterpolationPosition * (motionLayout3.mEndWrapHeight - i8)) + i8);
            }
            MotionLayout.this.resolveMeasuredDimension(i5, i6, i10, i8, this.mLayoutStart.isWidthMeasuredTooSmall() || this.mLayoutEnd.isWidthMeasuredTooSmall(), this.mLayoutStart.isHeightMeasuredTooSmall() || this.mLayoutEnd.isHeightMeasuredTooSmall());
        }

        public void reEvaluateState() {
            measure(MotionLayout.this.mLastWidthMeasureSpec, MotionLayout.this.mLastHeightMeasureSpec);
            MotionLayout.this.setupMotionViews();
        }

        public void setMeasuredId(int i5, int i6) {
            this.mStartId = i5;
            this.mEndId = i6;
        }
    }

    /* loaded from: classes9.dex */
    public interface MotionTracker {
        void addMovement(MotionEvent motionEvent);

        void clear();

        void computeCurrentVelocity(int i5);

        void computeCurrentVelocity(int i5, float f5);

        float getXVelocity();

        float getXVelocity(int i5);

        float getYVelocity();

        float getYVelocity(int i5);

        void recycle();
    }

    /* loaded from: classes8.dex */
    public static class MyTracker implements MotionTracker {
        private static MyTracker me = new MyTracker();
        public VelocityTracker tracker;

        private MyTracker() {
        }

        public static MyTracker obtain() {
            me.tracker = VelocityTracker.obtain();
            return me;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void addMovement(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void clear() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i5) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i5);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void computeCurrentVelocity(int i5, float f5) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i5, f5);
            }
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getXVelocity(int i5) {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i5);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public float getYVelocity(int i5) {
            if (this.tracker != null) {
                return getYVelocity(i5);
            }
            return 0.0f;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionLayout.MotionTracker
        public void recycle() {
            VelocityTracker velocityTracker = this.tracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.tracker = null;
            }
        }
    }

    /* loaded from: classes24.dex */
    public class StateCache {
        public float mProgress = Float.NaN;
        public float mVelocity = Float.NaN;
        public int startState = -1;
        public int endState = -1;
        public final String KeyProgress = "motion.progress";
        public final String KeyVelocity = "motion.velocity";
        public final String KeyStartState = "motion.StartState";
        public final String KeyEndState = "motion.EndState";

        public StateCache() {
        }

        public void apply() {
            int i5 = this.startState;
            if (i5 != -1 || this.endState != -1) {
                if (i5 == -1) {
                    MotionLayout.this.transitionToState(this.endState);
                } else {
                    int i6 = this.endState;
                    if (i6 == -1) {
                        MotionLayout.this.setState(i5, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i5, i6);
                    }
                }
                MotionLayout.this.setState(TransitionState.SETUP);
            }
            if (Float.isNaN(this.mVelocity)) {
                if (Float.isNaN(this.mProgress)) {
                    return;
                }
                MotionLayout.this.setProgress(this.mProgress);
            } else {
                MotionLayout.this.setProgress(this.mProgress, this.mVelocity);
                this.mProgress = Float.NaN;
                this.mVelocity = Float.NaN;
                this.startState = -1;
                this.endState = -1;
            }
        }

        public Bundle getTransitionState() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.mProgress);
            bundle.putFloat("motion.velocity", this.mVelocity);
            bundle.putInt("motion.StartState", this.startState);
            bundle.putInt("motion.EndState", this.endState);
            return bundle;
        }

        public void recordState() {
            this.endState = MotionLayout.this.mEndState;
            this.startState = MotionLayout.this.mBeginState;
            this.mVelocity = MotionLayout.this.getVelocity();
            this.mProgress = MotionLayout.this.getProgress();
        }

        public void setEndState(int i5) {
            this.endState = i5;
        }

        public void setProgress(float f5) {
            this.mProgress = f5;
        }

        public void setStartState(int i5) {
            this.startState = i5;
        }

        public void setTransitionState(Bundle bundle) {
            this.mProgress = bundle.getFloat("motion.progress");
            this.mVelocity = bundle.getFloat("motion.velocity");
            this.startState = bundle.getInt("motion.StartState");
            this.endState = bundle.getInt("motion.EndState");
        }

        public void setVelocity(float f5) {
            this.mVelocity = f5;
        }
    }

    /* loaded from: classes23.dex */
    public interface TransitionListener {
        void onTransitionChange(MotionLayout motionLayout, int i5, int i6, float f5);

        void onTransitionCompleted(MotionLayout motionLayout, int i5);

        void onTransitionStarted(MotionLayout motionLayout, int i5, int i6);

        void onTransitionTrigger(MotionLayout motionLayout, int i5, boolean z4, float f5);
    }

    /* loaded from: classes19.dex */
    public enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(@NonNull Context context) {
        super(context);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(null);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.firstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new KeyCache();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new Model();
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    private boolean callTransformedTouchEvent(View view, MotionEvent motionEvent, float f5, float f6) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f5, f6);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f5, -f6);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f5, f6);
        if (this.mInverseMatrix == null) {
            this.mInverseMatrix = new Matrix();
        }
        matrix.invert(this.mInverseMatrix);
        obtain.transform(this.mInverseMatrix);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void checkStructure() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int startId = motionScene.getStartId();
        MotionScene motionScene2 = this.mScene;
        checkStructure(startId, motionScene2.getConstraintSet(motionScene2.getStartId()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<MotionScene.Transition> it = this.mScene.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            MotionScene.Transition next = it.next();
            if (next == this.mScene.mCurrentTransition) {
                Log.v(TAG, "CHECK: CURRENT");
            }
            checkStructure(next);
            int startConstraintSetId = next.getStartConstraintSetId();
            int endConstraintSetId = next.getEndConstraintSetId();
            String name = Debug.getName(getContext(), startConstraintSetId);
            String name2 = Debug.getName(getContext(), endConstraintSetId);
            if (sparseIntArray.get(startConstraintSetId) == endConstraintSetId) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + name + "->" + name2);
            }
            if (sparseIntArray2.get(endConstraintSetId) == startConstraintSetId) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + name + "->" + name2);
            }
            sparseIntArray.put(startConstraintSetId, endConstraintSetId);
            sparseIntArray2.put(endConstraintSetId, startConstraintSetId);
            if (this.mScene.getConstraintSet(startConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetStart " + name);
            }
            if (this.mScene.getConstraintSet(endConstraintSetId) == null) {
                Log.e(TAG, " no such constraintSetEnd " + name);
            }
        }
    }

    private void checkStructure(int i5, ConstraintSet constraintSet) {
        String name = Debug.getName(getContext(), i5);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int id = childAt.getId();
            if (id == -1) {
                StringBuilder f5 = androidx.activity.result.a.f("CHECK: ", name, " ALL VIEWS SHOULD HAVE ID's ");
                f5.append(childAt.getClass().getName());
                f5.append(" does not!");
                Log.w(TAG, f5.toString());
            }
            if (constraintSet.getConstraint(id) == null) {
                StringBuilder f6 = androidx.activity.result.a.f("CHECK: ", name, " NO CONSTRAINTS for ");
                f6.append(Debug.getName(childAt));
                Log.w(TAG, f6.toString());
            }
        }
        int[] knownIds = constraintSet.getKnownIds();
        for (int i7 = 0; i7 < knownIds.length; i7++) {
            int i8 = knownIds[i7];
            String name2 = Debug.getName(getContext(), i8);
            if (findViewById(knownIds[i7]) == null) {
                Log.w(TAG, "CHECK: " + name + " NO View matches id " + name2);
            }
            if (constraintSet.getHeight(i8) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
            if (constraintSet.getWidth(i8) == -1) {
                Log.w(TAG, "CHECK: " + name + "(" + name2 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    private void checkStructure(MotionScene.Transition transition) {
        if (transition.getStartConstraintSetId() == transition.getEndConstraintSetId()) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.setStartCurrentState(childAt);
            }
        }
    }

    @SuppressLint({"LogConditional"})
    private void debugPos() {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            StringBuilder g5 = d.g(" ");
            g5.append(Debug.getLocation());
            g5.append(" ");
            g5.append(Debug.getName(this));
            g5.append(" ");
            g5.append(Debug.getName(getContext(), this.mCurrentState));
            g5.append(" ");
            g5.append(Debug.getName(childAt));
            g5.append(childAt.getLeft());
            g5.append(" ");
            g5.append(childAt.getTop());
            Log.v(TAG, g5.toString());
        }
    }

    private void evaluateLayout() {
        boolean z4;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        float f5 = this.mTransitionLastPosition + (!(interpolator instanceof StopLogic) ? (((nanoTime - this.mTransitionLastTime) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f5 = this.mTransitionGoalPosition;
        }
        if ((signum <= 0.0f || f5 < this.mTransitionGoalPosition) && (signum > 0.0f || f5 > this.mTransitionGoalPosition)) {
            z4 = false;
        } else {
            f5 = this.mTransitionGoalPosition;
            z4 = true;
        }
        if (interpolator != null && !z4) {
            f5 = this.mTemporalInterpolator ? interpolator.getInterpolation((nanoTime - this.mAnimationStartTime) * 1.0E-9f) : interpolator.getInterpolation(f5);
        }
        if ((signum > 0.0f && f5 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f5 <= this.mTransitionGoalPosition)) {
            f5 = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f5;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.mProgressInterpolator;
        if (interpolator2 != null) {
            f5 = interpolator2.getInterpolation(f5);
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            MotionController motionController = this.mFrameArrayList.get(childAt);
            if (motionController != null) {
                motionController.interpolate(childAt, f5, nanoTime2, this.mKeyCache);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) || this.mListenerPosition == this.mTransitionPosition) {
            return;
        }
        if (this.mListenerState != -1) {
            TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionStarted(this, this.mBeginState, this.mEndState);
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                Iterator<TransitionListener> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
                }
            }
            this.mIsAnimating = true;
        }
        this.mListenerState = -1;
        float f5 = this.mTransitionPosition;
        this.mListenerPosition = f5;
        TransitionListener transitionListener2 = this.mTransitionListener;
        if (transitionListener2 != null) {
            transitionListener2.onTransitionChange(this, this.mBeginState, this.mEndState, f5);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList3 = this.mTransitionListeners;
        if (copyOnWriteArrayList3 != null) {
            Iterator<TransitionListener> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
            }
        }
        this.mIsAnimating = true;
    }

    private void fireTransitionStarted(MotionLayout motionLayout, int i5, int i6) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(this, i5, i6);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(motionLayout, i5, i6);
            }
        }
    }

    private boolean handlesTouchEvent(float f5, float f6, View view, MotionEvent motionEvent) {
        boolean z4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (handlesTouchEvent((r3.getLeft() + f5) - view.getScrollX(), (r3.getTop() + f6) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        if (!z4) {
            this.mBoundsCheck.set(f5, f6, (view.getRight() + f5) - view.getLeft(), (view.getBottom() + f6) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY())) && callTransformedTouchEvent(view, motionEvent, -f5, -f6)) {
                return true;
            }
        }
        return z4;
    }

    private void init(AttributeSet attributeSet) {
        MotionScene motionScene;
        int i5;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z4 = true;
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == R.styleable.MotionLayout_layoutDescription) {
                    this.mScene = new MotionScene(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R.styleable.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R.styleable.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == R.styleable.MotionLayout_applyMotionScene) {
                    z4 = obtainStyledAttributes.getBoolean(index, z4);
                } else if (index == R.styleable.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        i5 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                        this.mDebugPath = i5;
                    }
                } else if (index == R.styleable.MotionLayout_motionDebug) {
                    i5 = obtainStyledAttributes.getInt(index, 0);
                    this.mDebugPath = i5;
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z4) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState != -1 || (motionScene = this.mScene) == null) {
            return;
        }
        this.mCurrentState = motionScene.getStartId();
        this.mBeginState = this.mScene.getStartId();
        this.mEndState = this.mScene.getEndId();
    }

    private void processTransitionCompleted() {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if (this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.mIsAnimating = false;
        Iterator<Integer> it = this.mTransitionCompleted.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            TransitionListener transitionListener = this.mTransitionListener;
            if (transitionListener != null) {
                transitionListener.onTransitionCompleted(this, next.intValue());
            }
            CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                Iterator<TransitionListener> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionCompleted(this, next.intValue());
                }
            }
        }
        this.mTransitionCompleted.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.build();
        boolean z4 = true;
        this.mInTransition = true;
        SparseArray sparseArray = new SparseArray();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int gatPathMotionArc = this.mScene.gatPathMotionArc();
        if (gatPathMotionArc != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                MotionController motionController = this.mFrameArrayList.get(getChildAt(i7));
                if (motionController != null) {
                    motionController.setPathMotionArc(gatPathMotionArc);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.mFrameArrayList.size()];
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            MotionController motionController2 = this.mFrameArrayList.get(getChildAt(i9));
            if (motionController2.getAnimateRelativeTo() != -1) {
                sparseBooleanArray.put(motionController2.getAnimateRelativeTo(), true);
                iArr[i8] = motionController2.getAnimateRelativeTo();
                i8++;
            }
        }
        if (this.mDecoratorsHelpers != null) {
            for (int i10 = 0; i10 < i8; i10++) {
                MotionController motionController3 = this.mFrameArrayList.get(findViewById(iArr[i10]));
                if (motionController3 != null) {
                    this.mScene.getKeyFrames(motionController3);
                }
            }
            Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i11 = 0; i11 < i8; i11++) {
                MotionController motionController4 = this.mFrameArrayList.get(findViewById(iArr[i11]));
                if (motionController4 != null) {
                    motionController4.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        } else {
            for (int i12 = 0; i12 < i8; i12++) {
                MotionController motionController5 = this.mFrameArrayList.get(findViewById(iArr[i12]));
                if (motionController5 != null) {
                    this.mScene.getKeyFrames(motionController5);
                    motionController5.setup(width, height, this.mTransitionDuration, getNanoTime());
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            MotionController motionController6 = this.mFrameArrayList.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && motionController6 != null) {
                this.mScene.getKeyFrames(motionController6);
                motionController6.setup(width, height, this.mTransitionDuration, getNanoTime());
            }
        }
        float staggered = this.mScene.getStaggered();
        if (staggered != 0.0f) {
            boolean z5 = ((double) staggered) < 0.0d;
            float abs = Math.abs(staggered);
            float f5 = -3.4028235E38f;
            float f6 = Float.MAX_VALUE;
            int i14 = 0;
            float f7 = Float.MAX_VALUE;
            float f8 = -3.4028235E38f;
            while (true) {
                if (i14 >= childCount) {
                    z4 = false;
                    break;
                }
                MotionController motionController7 = this.mFrameArrayList.get(getChildAt(i14));
                if (!Float.isNaN(motionController7.mMotionStagger)) {
                    break;
                }
                float finalX = motionController7.getFinalX();
                float finalY = motionController7.getFinalY();
                float f9 = z5 ? finalY - finalX : finalY + finalX;
                f7 = Math.min(f7, f9);
                f8 = Math.max(f8, f9);
                i14++;
            }
            if (!z4) {
                while (i5 < childCount) {
                    MotionController motionController8 = this.mFrameArrayList.get(getChildAt(i5));
                    float finalX2 = motionController8.getFinalX();
                    float finalY2 = motionController8.getFinalY();
                    float f10 = z5 ? finalY2 - finalX2 : finalY2 + finalX2;
                    motionController8.mStaggerScale = 1.0f / (1.0f - abs);
                    motionController8.mStaggerOffset = abs - (((f10 - f7) * abs) / (f8 - f7));
                    i5++;
                }
                return;
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                MotionController motionController9 = this.mFrameArrayList.get(getChildAt(i15));
                if (!Float.isNaN(motionController9.mMotionStagger)) {
                    f6 = Math.min(f6, motionController9.mMotionStagger);
                    f5 = Math.max(f5, motionController9.mMotionStagger);
                }
            }
            while (i5 < childCount) {
                MotionController motionController10 = this.mFrameArrayList.get(getChildAt(i5));
                if (!Float.isNaN(motionController10.mMotionStagger)) {
                    motionController10.mStaggerScale = 1.0f / (1.0f - abs);
                    float f11 = motionController10.mMotionStagger;
                    motionController10.mStaggerOffset = abs - (z5 ? ((f5 - f11) / (f5 - f6)) * abs : ((f11 - f6) * abs) / (f5 - f6));
                }
                i5++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect toRect(ConstraintWidget constraintWidget) {
        this.mTempRect.top = constraintWidget.getY();
        this.mTempRect.left = constraintWidget.getX();
        Rect rect = this.mTempRect;
        int width = constraintWidget.getWidth();
        Rect rect2 = this.mTempRect;
        rect.right = width + rect2.left;
        int height = constraintWidget.getHeight();
        Rect rect3 = this.mTempRect;
        rect2.bottom = height + rect3.top;
        return rect3;
    }

    private static boolean willJump(float f5, float f6, float f7) {
        if (f5 > 0.0f) {
            float f8 = f5 / f7;
            return ((f5 * f8) - (((f7 * f8) * f8) / 2.0f)) + f6 > 1.0f;
        }
        float f9 = (-f5) / f7;
        return ((((f7 * f9) * f9) / 2.0f) + (f5 * f9)) + f6 < 0.0f;
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new CopyOnWriteArrayList<>();
        }
        this.mTransitionListeners.add(transitionListener);
    }

    public void animateTo(float f5) {
        if (this.mScene == null) {
            return;
        }
        float f6 = this.mTransitionLastPosition;
        float f7 = this.mTransitionPosition;
        if (f6 != f7 && this.mTransitionInstantly) {
            this.mTransitionLastPosition = f7;
        }
        float f8 = this.mTransitionLastPosition;
        if (f8 == f5) {
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = f5;
        this.mTransitionDuration = r0.getDuration() / 1000.0f;
        setProgress(this.mTransitionGoalPosition);
        this.mInterpolator = null;
        this.mProgressInterpolator = this.mScene.getInterpolator();
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        this.mInTransition = true;
        this.mTransitionPosition = f8;
        this.mTransitionLastPosition = f8;
        invalidate();
    }

    public boolean applyViewTransition(int i5, MotionController motionController) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.applyViewTransition(i5, motionController);
        }
        return false;
    }

    public ConstraintSet cloneConstraintSet(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        ConstraintSet constraintSet = motionScene.getConstraintSet(i5);
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.clone(constraintSet);
        return constraintSet2;
    }

    public void disableAutoTransition(boolean z4) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        motionScene.disableAutoTransition(z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r10) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public void enableTransition(int i5, boolean z4) {
        boolean z5;
        MotionScene.Transition transition = getTransition(i5);
        if (z4) {
            z5 = true;
        } else {
            MotionScene motionScene = this.mScene;
            if (transition == motionScene.mCurrentTransition) {
                Iterator<MotionScene.Transition> it = motionScene.getTransitionsWithState(this.mCurrentState).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MotionScene.Transition next = it.next();
                    if (next.isEnabled()) {
                        this.mScene.mCurrentTransition = next;
                        break;
                    }
                }
            }
            z5 = false;
        }
        transition.setEnabled(z5);
    }

    public void enableViewTransition(int i5, boolean z4) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.enableViewTransition(i5, z4);
        }
    }

    public void endTrigger(boolean z4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            MotionController motionController = this.mFrameArrayList.get(getChildAt(i5));
            if (motionController != null) {
                motionController.endTrigger(z4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x024e, code lost:
    
        if (r1 != r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0251, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0252, code lost:
    
        r23.mCurrentState = r2;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x025e, code lost:
    
        if (r1 != r2) goto L162;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void evaluate(boolean r24) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.evaluate(boolean):void");
    }

    public void fireTransitionCompleted() {
        int i5;
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            if (this.mTransitionCompleted.isEmpty()) {
                i5 = -1;
            } else {
                ArrayList<Integer> arrayList = this.mTransitionCompleted;
                i5 = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i6 = this.mCurrentState;
            if (i5 != i6 && i6 != -1) {
                this.mTransitionCompleted.add(Integer.valueOf(i6));
            }
        }
        processTransitionCompleted();
        Runnable runnable = this.mOnComplete;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null || this.mScheduledTransitions <= 0) {
            return;
        }
        transitionToState(iArr[0]);
        int[] iArr2 = this.mScheduledTransitionTo;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.mScheduledTransitions--;
    }

    public void fireTrigger(int i5, boolean z4, float f5) {
        TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(this, i5, z4, f5);
        }
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<TransitionListener> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i5, z4, f5);
            }
        }
    }

    public void getAnchorDpDt(int i5, float f5, float f6, float f7, float[] fArr) {
        HashMap<View, MotionController> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i5);
        MotionController motionController = hashMap.get(viewById);
        if (motionController != null) {
            motionController.getDpDt(f5, f6, f7, fArr);
            float y4 = viewById.getY();
            this.lastPos = f5;
            this.lastY = y4;
            return;
        }
        Log.w(TAG, "WARNING could not find view id " + (viewById == null ? androidx.appcompat.widget.a.g("", i5) : viewById.getContext().getResources().getResourceName(i5)));
    }

    public ConstraintSet getConstraintSet(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSet(i5);
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getConstraintSetIds();
    }

    public String getConstraintSetNames(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.lookUpConstraintName(i5);
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public void getDebugMode(boolean z4) {
        this.mDebugPath = z4 ? 2 : 1;
        invalidate();
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return null;
        }
        return motionScene.getDefinedTransitions();
    }

    public DesignTool getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new DesignTool(this);
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    public MotionController getMotionController(int i5) {
        return this.mFrameArrayList.get(findViewById(i5));
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public MotionScene getScene() {
        return this.mScene;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public MotionScene.Transition getTransition(int i5) {
        return this.mScene.getTransitionById(i5);
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.recordState();
        return this.mStateCache.getTransitionState();
    }

    public long getTransitionTimeMs() {
        if (this.mScene != null) {
            this.mTransitionDuration = r0.getDuration() / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f5, float f6, float[] fArr, int i5) {
        float f7;
        float f8 = this.mLastVelocity;
        float f9 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f9);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f8 = (((interpolation - interpolation2) / EPSILON) * signum) / this.mTransitionDuration;
            f7 = interpolation2;
        } else {
            f7 = f9;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f8 = ((MotionInterpolator) interpolator).getVelocity();
        }
        MotionController motionController = this.mFrameArrayList.get(view);
        if ((i5 & 1) == 0) {
            motionController.getPostLayoutDvDp(f7, view.getWidth(), view.getHeight(), f5, f6, fArr);
        } else {
            motionController.getDpDt(f7, f5, f6, fArr);
        }
        if (i5 < 2) {
            fArr[0] = fArr[0] * f8;
            fArr[1] = fArr[1] * f8;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.mDelayedApply;
    }

    public boolean isInRotation() {
        return this.mInRotation;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    public boolean isViewTransitionEnabled(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            return motionScene.isViewTransitionEnabled(i5);
        }
        return false;
    }

    public void jumpToState(int i5) {
        float f5;
        if (!isAttachedToWindow()) {
            this.mCurrentState = i5;
        }
        if (this.mBeginState == i5) {
            f5 = 0.0f;
        } else {
            if (this.mEndState != i5) {
                setTransition(i5, i5);
                return;
            }
            f5 = 1.0f;
        }
        setProgress(f5);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i5) {
        MotionScene.Transition transition;
        if (i5 == 0) {
            this.mScene = null;
            return;
        }
        try {
            MotionScene motionScene = new MotionScene(getContext(), this, i5);
            this.mScene = motionScene;
            if (this.mCurrentState == -1) {
                this.mCurrentState = motionScene.getStartId();
                this.mBeginState = this.mScene.getStartId();
                this.mEndState = this.mScene.getEndId();
            }
            if (!isAttachedToWindow()) {
                this.mScene = null;
                return;
            }
            try {
                Display display = getDisplay();
                this.mPreviouseRotation = display == null ? 0 : display.getRotation();
                MotionScene motionScene2 = this.mScene;
                if (motionScene2 != null) {
                    ConstraintSet constraintSet = motionScene2.getConstraintSet(this.mCurrentState);
                    this.mScene.readFallback(this);
                    ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().onFinishedMotionScene(this);
                        }
                    }
                    if (constraintSet != null) {
                        constraintSet.applyTo(this);
                    }
                    this.mBeginState = this.mCurrentState;
                }
                onNewStateAttachHandlers();
                StateCache stateCache = this.mStateCache;
                if (stateCache != null) {
                    if (this.mDelayedApply) {
                        post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MotionLayout.this.mStateCache.apply();
                            }
                        });
                        return;
                    } else {
                        stateCache.apply();
                        return;
                    }
                }
                MotionScene motionScene3 = this.mScene;
                if (motionScene3 == null || (transition = motionScene3.mCurrentTransition) == null || transition.getAutoTransition() != 4) {
                    return;
                }
                transitionToEnd();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            } catch (Exception e5) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e5);
            }
        } catch (Exception e6) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e6);
        }
    }

    public int lookUpConstraintId(String str) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return 0;
        }
        return motionScene.lookUpConstraintId(str);
    }

    public MotionTracker obtainVelocityTracker() {
        return MyTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        MotionScene.Transition transition;
        int i5;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.mPreviouseRotation = display.getRotation();
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null && (i5 = this.mCurrentState) != -1) {
            ConstraintSet constraintSet = motionScene.getConstraintSet(i5);
            this.mScene.readFallback(this);
            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (constraintSet != null) {
                constraintSet.applyTo(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        StateCache stateCache = this.mStateCache;
        if (stateCache != null) {
            if (this.mDelayedApply) {
                post(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MotionLayout.this.mStateCache.apply();
                    }
                });
                return;
            } else {
                stateCache.apply();
                return;
            }
        }
        MotionScene motionScene2 = this.mScene;
        if (motionScene2 == null || (transition = motionScene2.mCurrentTransition) == null || transition.getAutoTransition() != 4) {
            return;
        }
        transitionToEnd();
        setState(TransitionState.SETUP);
        setState(TransitionState.MOVING);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        TouchResponse touchResponse;
        int touchRegionId;
        RectF touchRegion;
        MotionScene motionScene = this.mScene;
        if (motionScene != null && this.mInteractionEnabled) {
            ViewTransitionController viewTransitionController = motionScene.mViewTransitionController;
            if (viewTransitionController != null) {
                viewTransitionController.touchEvent(motionEvent);
            }
            MotionScene.Transition transition = this.mScene.mCurrentTransition;
            if (transition != null && transition.isEnabled() && (touchResponse = transition.getTouchResponse()) != null && ((motionEvent.getAction() != 0 || (touchRegion = touchResponse.getTouchRegion(this, new RectF())) == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && (touchRegionId = touchResponse.getTouchRegionId()) != -1)) {
                View view = this.mRegionView;
                if (view == null || view.getId() != touchRegionId) {
                    this.mRegionView = findViewById(touchRegionId);
                }
                if (this.mRegionView != null) {
                    this.mBoundsCheck.set(r0.getLeft(), this.mRegionView.getTop(), this.mRegionView.getRight(), this.mRegionView.getBottom());
                    if (this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) && !handlesTouchEvent(this.mRegionView.getLeft(), this.mRegionView.getTop(), this.mRegionView, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z4, i5, i6, i7, i8);
                return;
            }
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (this.mLastLayoutWidth != i9 || this.mLastLayoutHeight != i10) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i9;
            this.mLastLayoutHeight = i10;
            this.mOldWidth = i9;
            this.mOldHeight = i10;
        } finally {
            this.mInLayout = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i5, int i6) {
        if (this.mScene == null) {
            super.onMeasure(i5, i6);
            return;
        }
        boolean z4 = false;
        boolean z5 = (this.mLastWidthMeasureSpec == i5 && this.mLastHeightMeasureSpec == i6) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z5 = true;
        }
        if (this.mDirtyHierarchy) {
            z5 = true;
        }
        this.mLastWidthMeasureSpec = i5;
        this.mLastHeightMeasureSpec = i6;
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if ((z5 || this.mModel.isNotConfiguredWith(startId, endId)) && this.mBeginState != -1) {
            super.onMeasure(i5, i6);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(startId), this.mScene.getConstraintSet(endId));
            this.mModel.reEvaluateState();
            this.mModel.setMeasuredId(startId, endId);
        } else {
            if (z5) {
                super.onMeasure(i5, i6);
            }
            z4 = true;
        }
        if (this.mMeasureDuringTransition || z4) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int width = this.mLayoutWidget.getWidth() + getPaddingRight() + getPaddingLeft();
            int height = this.mLayoutWidget.getHeight() + paddingBottom;
            int i7 = this.mWidthMeasureMode;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                width = (int) ((this.mPostInterpolationPosition * (this.mEndWrapWidth - r8)) + this.mStartWrapWidth);
                requestLayout();
            }
            int i8 = this.mHeightMeasureMode;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                height = (int) ((this.mPostInterpolationPosition * (this.mEndWrapHeight - r9)) + this.mStartWrapHeight);
                requestLayout();
            }
            setMeasuredDimension(width, height);
        }
        evaluateLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f5, float f6, boolean z4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f5, float f6) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull final View view, int i5, int i6, @NonNull int[] iArr, int i7) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int touchRegionId;
        MotionScene motionScene = this.mScene;
        if (motionScene == null || (transition = motionScene.mCurrentTransition) == null || !transition.isEnabled()) {
            return;
        }
        int i8 = -1;
        if (!transition.isEnabled() || (touchResponse = transition.getTouchResponse()) == null || (touchRegionId = touchResponse.getTouchRegionId()) == -1 || view.getId() == touchRegionId) {
            if (motionScene.getMoveWhenScrollAtTop()) {
                TouchResponse touchResponse2 = transition.getTouchResponse();
                if (touchResponse2 != null && (touchResponse2.getFlags() & 4) != 0) {
                    i8 = i6;
                }
                float f5 = this.mTransitionPosition;
                if ((f5 == 1.0f || f5 == 0.0f) && view.canScrollVertically(i8)) {
                    return;
                }
            }
            if (transition.getTouchResponse() != null && (transition.getTouchResponse().getFlags() & 1) != 0) {
                float progressDirection = motionScene.getProgressDirection(i5, i6);
                float f6 = this.mTransitionLastPosition;
                if ((f6 <= 0.0f && progressDirection < 0.0f) || (f6 >= 1.0f && progressDirection > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new Runnable(this) { // from class: androidx.constraintlayout.motion.widget.MotionLayout.3
                        @Override // java.lang.Runnable
                        public void run() {
                            view.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f7 = this.mTransitionPosition;
            long nanoTime = getNanoTime();
            float f8 = i5;
            this.mScrollTargetDX = f8;
            float f9 = i6;
            this.mScrollTargetDY = f9;
            this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
            this.mScrollTargetTime = nanoTime;
            motionScene.processScrollMove(f8, f9);
            if (f7 != this.mTransitionPosition) {
                iArr[0] = i5;
                iArr[1] = i6;
            }
            evaluate(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.mUndergoingMotion = true;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i5, int i6, int i7, int i8, int i9) {
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        if (this.mUndergoingMotion || i5 != 0 || i6 != 0) {
            iArr[0] = iArr[0] + i7;
            iArr[1] = iArr[1] + i8;
        }
        this.mUndergoingMotion = false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i5, int i6) {
        this.mScrollTargetTime = getNanoTime();
        this.mScrollTargetDT = 0.0f;
        this.mScrollTargetDX = 0.0f;
        this.mScrollTargetDY = 0.0f;
    }

    public void onNewStateAttachHandlers() {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            return;
        }
        if (motionScene.autoTransition(this, this.mCurrentState)) {
            requestLayout();
            return;
        }
        int i5 = this.mCurrentState;
        if (i5 != -1) {
            this.mScene.addOnClickListeners(this, i5);
        }
        if (this.mScene.supportTouch()) {
            this.mScene.setupTouch();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setRtl(isRtl());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i5, int i6) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.mScene;
        return (motionScene == null || (transition = motionScene.mCurrentTransition) == null || transition.getTouchResponse() == null || (this.mScene.mCurrentTransition.getTouchResponse().getFlags() & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            float f5 = this.mScrollTargetDT;
            if (f5 == 0.0f) {
                return;
            }
            motionScene.processScrollUp(this.mScrollTargetDX / f5, this.mScrollTargetDY / f5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null || !this.mInteractionEnabled || !motionScene.supportTouch()) {
            return super.onTouchEvent(motionEvent);
        }
        MotionScene.Transition transition = this.mScene.mCurrentTransition;
        if (transition != null && !transition.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        this.mScene.processTouchEvent(motionEvent, getCurrentState(), this);
        if (this.mScene.mCurrentTransition.isTransitionFlag(4)) {
            return this.mScene.mCurrentTransition.getTouchResponse().isDragStarted();
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new CopyOnWriteArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.mDecoratorsHelpers == null) {
                    this.mDecoratorsHelpers = new ArrayList<>();
                }
                this.mDecoratorsHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i5) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.reEvaluateState();
        invalidate();
    }

    public boolean removeTransitionListener(TransitionListener transitionListener) {
        CopyOnWriteArrayList<TransitionListener> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(transitionListener);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (motionScene = this.mScene) != null && (transition = motionScene.mCurrentTransition) != null) {
            int layoutDuringTransition = transition.getLayoutDuringTransition();
            if (layoutDuringTransition == 0) {
                return;
            }
            if (layoutDuringTransition == 2) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    this.mFrameArrayList.get(getChildAt(i5)).remeasure();
                }
                return;
            }
        }
        super.requestLayout();
    }

    @RequiresApi(api = 17)
    public void rotateTo(int i5, int i6) {
        this.mInRotation = true;
        this.mPreRotateWidth = getWidth();
        this.mPreRotateHeight = getHeight();
        int rotation = getDisplay().getRotation();
        this.mRotatMode = (rotation + 1) % 4 <= (this.mPreviouseRotation + 1) % 4 ? 2 : 1;
        this.mPreviouseRotation = rotation;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            ViewState viewState = this.mPreRotate.get(childAt);
            if (viewState == null) {
                viewState = new ViewState();
                this.mPreRotate.put(childAt, viewState);
            }
            viewState.getState(childAt);
        }
        this.mBeginState = -1;
        this.mEndState = i5;
        this.mScene.setTransition(-1, i5);
        this.mModel.initFrom(this.mLayoutWidget, null, this.mScene.getConstraintSet(this.mEndState));
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        invalidate();
        transitionToEnd(new Runnable() { // from class: androidx.constraintlayout.motion.widget.MotionLayout.2
            @Override // java.lang.Runnable
            public void run() {
                MotionLayout.this.mInRotation = false;
            }
        });
        if (i6 > 0) {
            this.mTransitionDuration = i6 / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i5) {
        if (getCurrentState() == -1) {
            transitionToState(i5);
            return;
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null) {
            this.mScheduledTransitionTo = new int[4];
        } else if (iArr.length <= this.mScheduledTransitions) {
            this.mScheduledTransitionTo = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mScheduledTransitionTo;
        int i6 = this.mScheduledTransitions;
        this.mScheduledTransitions = i6 + 1;
        iArr2[i6] = i5;
    }

    public void setDebugMode(int i5) {
        this.mDebugPath = i5;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z4) {
        this.mDelayedApply = z4;
    }

    public void setInteractionEnabled(boolean z4) {
        this.mInteractionEnabled = z4;
    }

    public void setInterpolatedProgress(float f5) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator interpolator = this.mScene.getInterpolator();
            if (interpolator != null) {
                setProgress(interpolator.getInterpolation(f5));
                return;
            }
        }
        setProgress(f5);
    }

    public void setOnHide(float f5) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.mOnHideHelpers.get(i5).setProgress(f5);
            }
        }
    }

    public void setOnShow(float f5) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.mOnShowHelpers.get(i5).setProgress(f5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r5.mTransitionLastPosition == 0.0f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0066, code lost:
    
        if (r5.mTransitionLastPosition == 1.0f) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L12
        Lb:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L12:
            boolean r3 = r5.isAttachedToWindow()
            if (r3 != 0) goto L29
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r5.mStateCache
            if (r0 != 0) goto L23
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>()
            r5.mStateCache = r0
        L23:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r5.mStateCache
            r0.setProgress(r6)
            return
        L29:
            if (r2 > 0) goto L49
            float r2 = r5.mTransitionLastPosition
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r1 = r5.mCurrentState
            int r2 = r5.mEndState
            if (r1 != r2) goto L3c
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r1 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r5.setState(r1)
        L3c:
            int r1 = r5.mBeginState
            r5.mCurrentState = r1
            float r1 = r5.mTransitionLastPosition
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L71
        L46:
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.FINISHED
            goto L6e
        L49:
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 < 0) goto L69
            float r2 = r5.mTransitionLastPosition
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L5e
            int r0 = r5.mCurrentState
            int r2 = r5.mBeginState
            if (r0 != r2) goto L5e
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r5.setState(r0)
        L5e:
            int r0 = r5.mEndState
            r5.mCurrentState = r0
            float r0 = r5.mTransitionLastPosition
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L71
            goto L46
        L69:
            r0 = -1
            r5.mCurrentState = r0
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
        L6e:
            r5.setState(r0)
        L71:
            androidx.constraintlayout.motion.widget.MotionScene r0 = r5.mScene
            if (r0 != 0) goto L76
            return
        L76:
            r0 = 1
            r5.mTransitionInstantly = r0
            r5.mTransitionGoalPosition = r6
            r5.mTransitionPosition = r6
            r1 = -1
            r5.mTransitionLastTime = r1
            r5.mAnimationStartTime = r1
            r6 = 0
            r5.mInterpolator = r6
            r5.mInTransition = r0
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r4 > 0.0f) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        animateTo(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r3 > 0.5f) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r3, float r4) {
        /*
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r2.mStateCache
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = new androidx.constraintlayout.motion.widget.MotionLayout$StateCache
            r0.<init>()
            r2.mStateCache = r0
        L11:
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r0 = r2.mStateCache
            r0.setProgress(r3)
            androidx.constraintlayout.motion.widget.MotionLayout$StateCache r3 = r2.mStateCache
            r3.setVelocity(r4)
            return
        L1c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.MotionLayout$TransitionState r0 = androidx.constraintlayout.motion.widget.MotionLayout.TransitionState.MOVING
            r2.setState(r0)
            r2.mLastVelocity = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 == 0) goto L35
            if (r4 <= 0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            r2.animateTo(r0)
            goto L44
        L35:
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L44
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L44
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L30
            goto L31
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.setProgress(float, float):void");
    }

    public void setScene(MotionScene motionScene) {
        this.mScene = motionScene;
        motionScene.setRtl(isRtl());
        rebuildScene();
    }

    public void setStartState(int i5) {
        if (isAttachedToWindow()) {
            this.mCurrentState = i5;
            return;
        }
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setStartState(i5);
        this.mStateCache.setEndState(i5);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i5, int i6, int i7) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i5;
        this.mBeginState = -1;
        this.mEndState = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.updateConstraints(i5, i6, i7);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.getConstraintSet(i5).applyTo(this);
        }
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.mCurrentState == -1) {
            return;
        }
        TransitionState transitionState3 = this.mTransitionState;
        this.mTransitionState = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            fireTransitionChange();
        }
        int i5 = AnonymousClass5.$SwitchMap$androidx$constraintlayout$motion$widget$MotionLayout$TransitionState[transitionState3.ordinal()];
        if (i5 == 1 || i5 == 2) {
            if (transitionState == transitionState4) {
                fireTransitionChange();
            }
            if (transitionState != transitionState2) {
                return;
            }
        } else if (i5 != 3 || transitionState != transitionState2) {
            return;
        }
        fireTransitionCompleted();
    }

    public void setTransition(int i5) {
        MotionScene motionScene;
        int i6;
        if (this.mScene != null) {
            MotionScene.Transition transition = getTransition(i5);
            this.mBeginState = transition.getStartConstraintSetId();
            this.mEndState = transition.getEndConstraintSetId();
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new StateCache();
                }
                this.mStateCache.setStartState(this.mBeginState);
                this.mStateCache.setEndState(this.mEndState);
                return;
            }
            float f5 = Float.NaN;
            int i7 = this.mCurrentState;
            if (i7 == this.mBeginState) {
                f5 = 0.0f;
            } else if (i7 == this.mEndState) {
                f5 = 1.0f;
            }
            this.mScene.setTransition(transition);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f5) {
                if (f5 == 0.0f) {
                    endTrigger(true);
                    motionScene = this.mScene;
                    i6 = this.mBeginState;
                } else if (f5 == 1.0f) {
                    endTrigger(false);
                    motionScene = this.mScene;
                    i6 = this.mEndState;
                }
                motionScene.getConstraintSet(i6).applyTo(this);
            }
            this.mTransitionLastPosition = Float.isNaN(f5) ? 0.0f : f5;
            if (!Float.isNaN(f5)) {
                setProgress(f5);
                return;
            }
            Log.v(TAG, Debug.getLocation() + " transitionToStart ");
            transitionToStart();
        }
    }

    public void setTransition(int i5, int i6) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new StateCache();
            }
            this.mStateCache.setStartState(i5);
            this.mStateCache.setEndState(i6);
            return;
        }
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            this.mBeginState = i5;
            this.mEndState = i6;
            motionScene.setTransition(i5, i6);
            this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(i5), this.mScene.getConstraintSet(i6));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        this.mScene.setTransition(transition);
        setState(TransitionState.SETUP);
        float f5 = this.mCurrentState == this.mScene.getEndId() ? 1.0f : 0.0f;
        this.mTransitionLastPosition = f5;
        this.mTransitionPosition = f5;
        this.mTransitionGoalPosition = f5;
        this.mTransitionLastTime = transition.isTransitionFlag(1) ? -1L : getNanoTime();
        int startId = this.mScene.getStartId();
        int endId = this.mScene.getEndId();
        if (startId == this.mBeginState && endId == this.mEndState) {
            return;
        }
        this.mBeginState = startId;
        this.mEndState = endId;
        this.mScene.setTransition(startId, endId);
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        this.mModel.setMeasuredId(this.mBeginState, this.mEndState);
        this.mModel.reEvaluateState();
        rebuildScene();
    }

    public void setTransitionDuration(int i5) {
        MotionScene motionScene = this.mScene;
        if (motionScene == null) {
            Log.e(TAG, "MotionScene not defined");
        } else {
            motionScene.setDuration(i5);
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setTransitionState(bundle);
        if (isAttachedToWindow()) {
            this.mStateCache.apply();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return Debug.getName(context, this.mBeginState) + "->" + Debug.getName(context, this.mEndState) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r10 != 7) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void touchAnimateTo(int r10, float r11, float r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.touchAnimateTo(int, float, float):void");
    }

    public void touchSpringTo(float f5, float f6) {
        if (this.mScene == null || this.mTransitionLastPosition == f5) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionDuration = this.mScene.getDuration() / 1000.0f;
        this.mTransitionGoalPosition = f5;
        this.mInTransition = true;
        this.mStopLogic.springConfig(this.mTransitionLastPosition, f5, f6, this.mScene.getSpringMass(), this.mScene.getSpringStiffiness(), this.mScene.getSpringDamping(), this.mScene.getSpringStopThreshold(), this.mScene.getSpringBoundary());
        int i5 = this.mCurrentState;
        this.mTransitionGoalPosition = f5;
        this.mCurrentState = i5;
        this.mInterpolator = this.mStopLogic;
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public void transitionToEnd(Runnable runnable) {
        animateTo(1.0f);
        this.mOnComplete = runnable;
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToState(int i5) {
        if (isAttachedToWindow()) {
            transitionToState(i5, -1, -1);
            return;
        }
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setEndState(i5);
    }

    public void transitionToState(int i5, int i6) {
        if (isAttachedToWindow()) {
            transitionToState(i5, -1, -1, i6);
            return;
        }
        if (this.mStateCache == null) {
            this.mStateCache = new StateCache();
        }
        this.mStateCache.setEndState(i5);
    }

    public void transitionToState(int i5, int i6, int i7) {
        transitionToState(i5, i6, i7, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0091, code lost:
    
        if (r14 > 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transitionToState(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.transitionToState(int, int, int, int):void");
    }

    public void updateState() {
        this.mModel.initFrom(this.mLayoutWidget, this.mScene.getConstraintSet(this.mBeginState), this.mScene.getConstraintSet(this.mEndState));
        rebuildScene();
    }

    public void updateState(int i5, ConstraintSet constraintSet) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.setConstraintSet(i5, constraintSet);
        }
        updateState();
        if (this.mCurrentState == i5) {
            constraintSet.applyTo(this);
        }
    }

    public void updateStateAnimate(int i5, ConstraintSet constraintSet, int i6) {
        if (this.mScene != null && this.mCurrentState == i5) {
            int i7 = R.id.view_transition;
            updateState(i7, getConstraintSet(i5));
            setState(i7, -1, -1);
            updateState(i5, constraintSet);
            MotionScene.Transition transition = new MotionScene.Transition(-1, this.mScene, i7, i5);
            transition.setDuration(i6);
            setTransition(transition);
            transitionToEnd();
        }
    }

    public void viewTransition(int i5, View... viewArr) {
        MotionScene motionScene = this.mScene;
        if (motionScene != null) {
            motionScene.viewTransition(i5, viewArr);
        } else {
            Log.e(TAG, " no motionScene");
        }
    }
}
