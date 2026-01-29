package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.activity.d;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes19.dex */
public class ViewTransition {
    public static final int ANTICIPATE = 6;
    public static final int BOUNCE = 4;
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    public static final int EASE_IN = 1;
    public static final int EASE_IN_OUT = 0;
    public static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    public static final int LINEAR = 3;
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    public static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static String TAG = "ViewTransition";
    private static final int UNSET = -1;
    public static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
    public static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
    public static final int VIEWTRANSITIONMODE_NOSTATE = 2;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";
    public ConstraintSet.Constraint mConstraintDelta;
    public Context mContext;
    private int mId;
    public KeyFrames mKeyFrames;
    private int mTargetId;
    private String mTargetString;
    public int mViewTransitionMode;
    public ConstraintSet set;
    private int mOnStateTransition = -1;
    private boolean mDisabled = false;
    private int mPathMotionArc = 0;
    private int mDuration = -1;
    private int mUpDuration = -1;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mSetsTag = -1;
    private int mClearsTag = -1;
    private int mIfTagSet = -1;
    private int mIfTagNotSet = -1;
    private int mSharedValueTarget = -1;
    private int mSharedValueID = -1;
    private int mSharedValueCurrent = -1;

    /* loaded from: classes13.dex */
    public static class Animate {
        public boolean hold_at_100;
        private final int mClearsTag;
        public float mDpositionDt;
        public int mDuration;
        public Interpolator mInterpolator;
        public long mLastRender;
        public MotionController mMC;
        public float mPosition;
        private final int mSetsTag;
        public long mStart;
        public int mUpDuration;
        public ViewTransitionController mVtController;
        public KeyCache mCache = new KeyCache();
        public boolean reverse = false;
        public Rect mTempRec = new Rect();

        public Animate(ViewTransitionController viewTransitionController, MotionController motionController, int i5, int i6, int i7, Interpolator interpolator, int i8, int i9) {
            this.hold_at_100 = false;
            this.mVtController = viewTransitionController;
            this.mMC = motionController;
            this.mDuration = i5;
            this.mUpDuration = i6;
            long nanoTime = System.nanoTime();
            this.mStart = nanoTime;
            this.mLastRender = nanoTime;
            this.mVtController.addAnimation(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = i8;
            this.mClearsTag = i9;
            if (i7 == 3) {
                this.hold_at_100 = true;
            }
            this.mDpositionDt = i5 == 0 ? Float.MAX_VALUE : 1.0f / i5;
            mutate();
        }

        public void mutate() {
            if (this.reverse) {
                mutateReverse();
            } else {
                mutateForward();
            }
        }

        public void mutateForward() {
            long nanoTime = System.nanoTime();
            long j5 = nanoTime - this.mLastRender;
            this.mLastRender = nanoTime;
            float f5 = (((float) (j5 * 1.0E-6d)) * this.mDpositionDt) + this.mPosition;
            this.mPosition = f5;
            if (f5 >= 1.0f) {
                this.mPosition = 1.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            MotionController motionController = this.mMC;
            boolean interpolate = motionController.interpolate(motionController.mView, interpolation, nanoTime, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                if (!this.hold_at_100) {
                    this.mVtController.removeAnimation(this);
                }
            }
            if (this.mPosition < 1.0f || interpolate) {
                this.mVtController.invalidate();
            }
        }

        public void mutateReverse() {
            long nanoTime = System.nanoTime();
            long j5 = nanoTime - this.mLastRender;
            this.mLastRender = nanoTime;
            float f5 = this.mPosition - (((float) (j5 * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f5;
            if (f5 < 0.0f) {
                this.mPosition = 0.0f;
            }
            Interpolator interpolator = this.mInterpolator;
            float interpolation = interpolator == null ? this.mPosition : interpolator.getInterpolation(this.mPosition);
            MotionController motionController = this.mMC;
            boolean interpolate = motionController.interpolate(motionController.mView, interpolation, nanoTime, this.mCache);
            if (this.mPosition <= 0.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                this.mVtController.removeAnimation(this);
            }
            if (this.mPosition > 0.0f || interpolate) {
                this.mVtController.invalidate();
            }
        }

        public void reactTo(int i5, float f5, float f6) {
            if (i5 == 1) {
                if (this.reverse) {
                    return;
                }
                reverse(true);
            } else {
                if (i5 != 2) {
                    return;
                }
                this.mMC.getView().getHitRect(this.mTempRec);
                if (this.mTempRec.contains((int) f5, (int) f6) || this.reverse) {
                    return;
                }
                reverse(true);
            }
        }

        public void reverse(boolean z4) {
            int i5;
            this.reverse = z4;
            if (z4 && (i5 = this.mUpDuration) != -1) {
                this.mDpositionDt = i5 == 0 ? Float.MAX_VALUE : 1.0f / i5;
            }
            this.mVtController.invalidate();
            this.mLastRender = System.nanoTime();
        }
    }

    public ViewTransition(Context context, XmlPullParser xmlPullParser) {
        char c5;
        this.mContext = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals(CONSTRAINT_OVERRIDE)) {
                                c5 = 2;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals(KEY_FRAME_SET_TAG)) {
                                c5 = 1;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 61998586:
                            if (name.equals(VIEW_TRANSITION_TAG)) {
                                c5 = 0;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 366511058:
                            if (name.equals(CUSTOM_METHOD)) {
                                c5 = 4;
                                break;
                            }
                            c5 = 65535;
                            break;
                        case 1791837707:
                            if (name.equals(CUSTOM_ATTRIBUTE)) {
                                c5 = 3;
                                break;
                            }
                            c5 = 65535;
                            break;
                        default:
                            c5 = 65535;
                            break;
                    }
                    if (c5 == 0) {
                        parseViewTransitionTags(context, xmlPullParser);
                    } else if (c5 == 1) {
                        this.mKeyFrames = new KeyFrames(context, xmlPullParser);
                    } else if (c5 == 2) {
                        this.mConstraintDelta = ConstraintSet.buildDelta(context, xmlPullParser);
                    } else if (c5 == 3 || c5 == 4) {
                        ConstraintAttribute.parse(context, xmlPullParser, this.mConstraintDelta.mCustomConstraints);
                    } else {
                        Log.e(TAG, Debug.getLoc() + " unknown tag " + name);
                        Log.e(TAG, ".xml:" + xmlPullParser.getLineNumber());
                    }
                } else if (eventType != 3) {
                    continue;
                } else if (VIEW_TRANSITION_TAG.equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        } catch (XmlPullParserException e6) {
            e6.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyTransition$0(View[] viewArr) {
        if (this.mSetsTag != -1) {
            for (View view : viewArr) {
                view.setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.mClearsTag != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.mClearsTag, null);
            }
        }
    }

    private void parseViewTransitionTags(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.ViewTransition);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = obtainStyledAttributes.getIndex(i5);
            if (index == R.styleable.ViewTransition_android_id) {
                this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
            } else if (index == R.styleable.ViewTransition_motionTarget) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                    this.mTargetId = resourceId;
                    if (resourceId != -1) {
                    }
                    this.mTargetString = obtainStyledAttributes.getString(index);
                } else {
                    if (obtainStyledAttributes.peekValue(index).type != 3) {
                        this.mTargetId = obtainStyledAttributes.getResourceId(index, this.mTargetId);
                    }
                    this.mTargetString = obtainStyledAttributes.getString(index);
                }
            } else if (index == R.styleable.ViewTransition_onStateTransition) {
                this.mOnStateTransition = obtainStyledAttributes.getInt(index, this.mOnStateTransition);
            } else if (index == R.styleable.ViewTransition_transitionDisable) {
                this.mDisabled = obtainStyledAttributes.getBoolean(index, this.mDisabled);
            } else if (index == R.styleable.ViewTransition_pathMotionArc) {
                this.mPathMotionArc = obtainStyledAttributes.getInt(index, this.mPathMotionArc);
            } else if (index == R.styleable.ViewTransition_duration) {
                this.mDuration = obtainStyledAttributes.getInt(index, this.mDuration);
            } else if (index == R.styleable.ViewTransition_upDuration) {
                this.mUpDuration = obtainStyledAttributes.getInt(index, this.mUpDuration);
            } else if (index == R.styleable.ViewTransition_viewTransitionMode) {
                this.mViewTransitionMode = obtainStyledAttributes.getInt(index, this.mViewTransitionMode);
            } else if (index == R.styleable.ViewTransition_motionInterpolator) {
                int i6 = obtainStyledAttributes.peekValue(index).type;
                if (i6 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.mDefaultInterpolatorID = resourceId2;
                    if (resourceId2 == -1) {
                    }
                    this.mDefaultInterpolator = -2;
                } else if (i6 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.mDefaultInterpolatorString = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.mDefaultInterpolator = -1;
                    } else {
                        this.mDefaultInterpolatorID = obtainStyledAttributes.getResourceId(index, -1);
                        this.mDefaultInterpolator = -2;
                    }
                } else {
                    this.mDefaultInterpolator = obtainStyledAttributes.getInteger(index, this.mDefaultInterpolator);
                }
            } else if (index == R.styleable.ViewTransition_setsTag) {
                this.mSetsTag = obtainStyledAttributes.getResourceId(index, this.mSetsTag);
            } else if (index == R.styleable.ViewTransition_clearsTag) {
                this.mClearsTag = obtainStyledAttributes.getResourceId(index, this.mClearsTag);
            } else if (index == R.styleable.ViewTransition_ifTagSet) {
                this.mIfTagSet = obtainStyledAttributes.getResourceId(index, this.mIfTagSet);
            } else if (index == R.styleable.ViewTransition_ifTagNotSet) {
                this.mIfTagNotSet = obtainStyledAttributes.getResourceId(index, this.mIfTagNotSet);
            } else if (index == R.styleable.ViewTransition_SharedValueId) {
                this.mSharedValueID = obtainStyledAttributes.getResourceId(index, this.mSharedValueID);
            } else if (index == R.styleable.ViewTransition_SharedValue) {
                this.mSharedValueTarget = obtainStyledAttributes.getInteger(index, this.mSharedValueTarget);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void updateTransition(MotionScene.Transition transition, View view) {
        int i5 = this.mDuration;
        if (i5 != -1) {
            transition.setDuration(i5);
        }
        transition.setPathMotionArc(this.mPathMotionArc);
        transition.setInterpolatorInfo(this.mDefaultInterpolator, this.mDefaultInterpolatorString, this.mDefaultInterpolatorID);
        int id = view.getId();
        KeyFrames keyFrames = this.mKeyFrames;
        if (keyFrames != null) {
            ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            Iterator<Key> it = keyFramesForView.iterator();
            while (it.hasNext()) {
                keyFrames2.addKey(it.next().mo4clone().setViewId(id));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    public void applyIndependentTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.setBothStates(view);
        this.mKeyFrames.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.mDuration, System.nanoTime());
        new Animate(viewTransitionController, motionController, this.mDuration, this.mUpDuration, this.mOnStateTransition, getInterpolator(motionLayout.getContext()), this.mSetsTag, this.mClearsTag);
    }

    public void applyTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i5, ConstraintSet constraintSet, View... viewArr) {
        if (this.mDisabled) {
            return;
        }
        int i6 = this.mViewTransitionMode;
        int i7 = 0;
        if (i6 == 2) {
            applyIndependentTransition(viewTransitionController, motionLayout, viewArr[0]);
            return;
        }
        if (i6 == 1) {
            for (int i8 : motionLayout.getConstraintSetIds()) {
                if (i8 != i5) {
                    ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i8);
                    for (View view : viewArr) {
                        ConstraintSet.Constraint constraint = constraintSet2.getConstraint(view.getId());
                        ConstraintSet.Constraint constraint2 = this.mConstraintDelta;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(constraintSet);
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(view2.getId());
            ConstraintSet.Constraint constraint4 = this.mConstraintDelta;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
            }
        }
        motionLayout.updateState(i5, constraintSet3);
        int i9 = R.id.view_transition;
        motionLayout.updateState(i9, constraintSet);
        motionLayout.setState(i9, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.mScene, i9, i5);
        for (View view3 : viewArr) {
            updateTransition(transition, view3);
        }
        motionLayout.setTransition(transition);
        motionLayout.transitionToEnd(new a(this, viewArr, i7));
    }

    public boolean checkTags(View view) {
        int i5 = this.mIfTagSet;
        boolean z4 = i5 == -1 || view.getTag(i5) != null;
        int i6 = this.mIfTagNotSet;
        return z4 && (i6 == -1 || view.getTag(i6) == null);
    }

    public int getId() {
        return this.mId;
    }

    public Interpolator getInterpolator(Context context) {
        int i5 = this.mDefaultInterpolator;
        if (i5 == -2) {
            return AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
        }
        if (i5 == -1) {
            final Easing interpolator = Easing.getInterpolator(this.mDefaultInterpolatorString);
            return new Interpolator(this) { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f5) {
                    return (float) interpolator.get(f5);
                }
            };
        }
        if (i5 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i5 == 1) {
            return new AccelerateInterpolator();
        }
        if (i5 == 2) {
            return new DecelerateInterpolator();
        }
        if (i5 == 4) {
            return new BounceInterpolator();
        }
        if (i5 == 5) {
            return new OvershootInterpolator();
        }
        if (i5 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int getSharedValue() {
        return this.mSharedValueTarget;
    }

    public int getSharedValueCurrent() {
        return this.mSharedValueCurrent;
    }

    public int getSharedValueID() {
        return this.mSharedValueID;
    }

    public int getStateTransition() {
        return this.mOnStateTransition;
    }

    public boolean isEnabled() {
        return !this.mDisabled;
    }

    public boolean matchesView(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        return this.mTargetString != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.mTargetString);
    }

    public void setEnabled(boolean z4) {
        this.mDisabled = !z4;
    }

    public void setId(int i5) {
        this.mId = i5;
    }

    public void setSharedValue(int i5) {
        this.mSharedValueTarget = i5;
    }

    public void setSharedValueCurrent(int i5) {
        this.mSharedValueCurrent = i5;
    }

    public void setSharedValueID(int i5) {
        this.mSharedValueID = i5;
    }

    public void setStateTransition(int i5) {
        this.mOnStateTransition = i5;
    }

    public boolean supports(int i5) {
        int i6 = this.mOnStateTransition;
        return i6 == 1 ? i5 == 0 : i6 == 2 ? i5 == 1 : i6 == 3 && i5 == 0;
    }

    public String toString() {
        StringBuilder g5 = d.g("ViewTransition(");
        g5.append(Debug.getName(this.mContext, this.mId));
        g5.append(")");
        return g5.toString();
    }
}
