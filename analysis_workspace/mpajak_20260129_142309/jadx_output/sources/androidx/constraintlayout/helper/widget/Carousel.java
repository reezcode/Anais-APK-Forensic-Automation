package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.b;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public class Carousel extends MotionHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private int backwardTransition;
    private float dampening;
    private int emptyViewBehavior;
    private int firstViewReference;
    private int forwardTransition;
    private boolean infiniteCarousel;
    private Adapter mAdapter;
    private int mAnimateTargetDelay;
    private int mIndex;
    public int mLastStartId;
    private final ArrayList<View> mList;
    private MotionLayout mMotionLayout;
    private int mPreviousIndex;
    private int mTargetIndex;
    public Runnable mUpdateRunnable;
    private int nextState;
    private int previousState;
    private int startIndex;
    private int touchUpMode;
    private float velocityThreshold;

    /* loaded from: classes12.dex */
    public interface Adapter {
        int count();

        void onNewItem(int i5);

        void populate(View view, int i5);
    }

    public Carousel(Context context) {
        super(context);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.firstViewReference = -1;
        this.infiniteCarousel = false;
        this.backwardTransition = -1;
        this.forwardTransition = -1;
        this.previousState = -1;
        this.nextState = -1;
        this.dampening = 0.9f;
        this.startIndex = 0;
        this.emptyViewBehavior = 4;
        this.touchUpMode = 1;
        this.velocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.touchUpMode != 2 || velocity <= Carousel.this.velocityThreshold || Carousel.this.mIndex >= Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f5 = Carousel.this.dampening * velocity;
                if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                    if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                        Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f5);
                            }
                        });
                    }
                }
            }
        };
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.firstViewReference = -1;
        this.infiniteCarousel = false;
        this.backwardTransition = -1;
        this.forwardTransition = -1;
        this.previousState = -1;
        this.nextState = -1;
        this.dampening = 0.9f;
        this.startIndex = 0;
        this.emptyViewBehavior = 4;
        this.touchUpMode = 1;
        this.velocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.touchUpMode != 2 || velocity <= Carousel.this.velocityThreshold || Carousel.this.mIndex >= Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f5 = Carousel.this.dampening * velocity;
                if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                    if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                        Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f5);
                            }
                        });
                    }
                }
            }
        };
        init(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mAdapter = null;
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.firstViewReference = -1;
        this.infiniteCarousel = false;
        this.backwardTransition = -1;
        this.forwardTransition = -1;
        this.previousState = -1;
        this.nextState = -1;
        this.dampening = 0.9f;
        this.startIndex = 0;
        this.emptyViewBehavior = 4;
        this.touchUpMode = 1;
        this.velocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1
            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.mMotionLayout.setProgress(0.0f);
                Carousel.this.updateItems();
                Carousel.this.mAdapter.onNewItem(Carousel.this.mIndex);
                float velocity = Carousel.this.mMotionLayout.getVelocity();
                if (Carousel.this.touchUpMode != 2 || velocity <= Carousel.this.velocityThreshold || Carousel.this.mIndex >= Carousel.this.mAdapter.count() - 1) {
                    return;
                }
                final float f5 = Carousel.this.dampening * velocity;
                if (Carousel.this.mIndex != 0 || Carousel.this.mPreviousIndex <= Carousel.this.mIndex) {
                    if (Carousel.this.mIndex != Carousel.this.mAdapter.count() - 1 || Carousel.this.mPreviousIndex >= Carousel.this.mIndex) {
                        Carousel.this.mMotionLayout.post(new Runnable() { // from class: androidx.constraintlayout.helper.widget.Carousel.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Carousel.this.mMotionLayout.touchAnimateTo(5, 1.0f, f5);
                            }
                        });
                    }
                }
            }
        };
        init(context, attributeSet);
    }

    private void enableAllTransitions(boolean z4) {
        Iterator<MotionScene.Transition> it = this.mMotionLayout.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().setEnabled(z4);
        }
    }

    private boolean enableTransition(int i5, boolean z4) {
        MotionLayout motionLayout;
        MotionScene.Transition transition;
        if (i5 == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(i5)) == null || z4 == transition.isEnabled()) {
            return false;
        }
        transition.setEnabled(z4);
        return true;
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == R.styleable.Carousel_carousel_firstView) {
                    this.firstViewReference = obtainStyledAttributes.getResourceId(index, this.firstViewReference);
                } else if (index == R.styleable.Carousel_carousel_backwardTransition) {
                    this.backwardTransition = obtainStyledAttributes.getResourceId(index, this.backwardTransition);
                } else if (index == R.styleable.Carousel_carousel_forwardTransition) {
                    this.forwardTransition = obtainStyledAttributes.getResourceId(index, this.forwardTransition);
                } else if (index == R.styleable.Carousel_carousel_emptyViewsBehavior) {
                    this.emptyViewBehavior = obtainStyledAttributes.getInt(index, this.emptyViewBehavior);
                } else if (index == R.styleable.Carousel_carousel_previousState) {
                    this.previousState = obtainStyledAttributes.getResourceId(index, this.previousState);
                } else if (index == R.styleable.Carousel_carousel_nextState) {
                    this.nextState = obtainStyledAttributes.getResourceId(index, this.nextState);
                } else if (index == R.styleable.Carousel_carousel_touchUp_dampeningFactor) {
                    this.dampening = obtainStyledAttributes.getFloat(index, this.dampening);
                } else if (index == R.styleable.Carousel_carousel_touchUpMode) {
                    this.touchUpMode = obtainStyledAttributes.getInt(index, this.touchUpMode);
                } else if (index == R.styleable.Carousel_carousel_touchUp_velocityThreshold) {
                    this.velocityThreshold = obtainStyledAttributes.getFloat(index, this.velocityThreshold);
                } else if (index == R.styleable.Carousel_carousel_infinite) {
                    this.infiniteCarousel = obtainStyledAttributes.getBoolean(index, this.infiniteCarousel);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateItems$0() {
        MotionLayout motionLayout;
        int i5;
        this.mMotionLayout.setTransitionDuration(this.mAnimateTargetDelay);
        if (this.mTargetIndex < this.mIndex) {
            motionLayout = this.mMotionLayout;
            i5 = this.previousState;
        } else {
            motionLayout = this.mMotionLayout;
            i5 = this.nextState;
        }
        motionLayout.transitionToState(i5, this.mAnimateTargetDelay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateItems() {
        Adapter adapter;
        Adapter adapter2 = this.mAdapter;
        if (adapter2 == null || this.mMotionLayout == null || adapter2.count() == 0) {
            return;
        }
        int size = this.mList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mList.get(i5);
            int i6 = (this.mIndex + i5) - this.startIndex;
            if (!this.infiniteCarousel) {
                if (i6 < 0 || i6 >= this.mAdapter.count()) {
                    updateViewVisibility(view, this.emptyViewBehavior);
                }
                updateViewVisibility(view, 0);
            } else if (i6 < 0) {
                int i7 = this.emptyViewBehavior;
                if (i7 != 4) {
                    updateViewVisibility(view, i7);
                } else {
                    updateViewVisibility(view, 0);
                }
                if (i6 % this.mAdapter.count() == 0) {
                    this.mAdapter.populate(view, 0);
                } else {
                    adapter = this.mAdapter;
                    i6 = (i6 % this.mAdapter.count()) + adapter.count();
                    adapter.populate(view, i6);
                }
            } else {
                if (i6 >= this.mAdapter.count()) {
                    if (i6 == this.mAdapter.count()) {
                        i6 = 0;
                    } else if (i6 > this.mAdapter.count()) {
                        i6 %= this.mAdapter.count();
                    }
                    int i8 = this.emptyViewBehavior;
                    if (i8 != 4) {
                        updateViewVisibility(view, i8);
                    }
                }
                updateViewVisibility(view, 0);
            }
            adapter = this.mAdapter;
            adapter.populate(view, i6);
        }
        int i9 = this.mTargetIndex;
        int i10 = 1;
        if (i9 != -1 && i9 != this.mIndex) {
            this.mMotionLayout.post(new b(this, i10));
        } else if (i9 == this.mIndex) {
            this.mTargetIndex = -1;
        }
        if (this.backwardTransition == -1 || this.forwardTransition == -1) {
            Log.w(TAG, "No backward or forward transitions defined for Carousel!");
            return;
        }
        if (this.infiniteCarousel) {
            return;
        }
        int count = this.mAdapter.count();
        if (this.mIndex == 0) {
            enableTransition(this.backwardTransition, false);
        } else {
            enableTransition(this.backwardTransition, true);
            this.mMotionLayout.setTransition(this.backwardTransition);
        }
        if (this.mIndex == count - 1) {
            enableTransition(this.forwardTransition, false);
        } else {
            enableTransition(this.forwardTransition, true);
            this.mMotionLayout.setTransition(this.forwardTransition);
        }
    }

    private boolean updateViewVisibility(int i5, View view, int i6) {
        ConstraintSet.Constraint constraint;
        ConstraintSet constraintSet = this.mMotionLayout.getConstraintSet(i5);
        if (constraintSet == null || (constraint = constraintSet.getConstraint(view.getId())) == null) {
            return false;
        }
        constraint.propertySet.mVisibilityMode = 1;
        view.setVisibility(i6);
        return true;
    }

    private boolean updateViewVisibility(View view, int i5) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        boolean z4 = false;
        for (int i6 : motionLayout.getConstraintSetIds()) {
            z4 |= updateViewVisibility(i6, view, i5);
        }
        return z4;
    }

    public int getCount() {
        Adapter adapter = this.mAdapter;
        if (adapter != null) {
            return adapter.count();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.mIndex;
    }

    public void jumpToIndex(int i5) {
        this.mIndex = Math.max(0, Math.min(getCount() - 1, i5));
        refresh();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @RequiresApi(api = 17)
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i5 = 0; i5 < this.mCount; i5++) {
                int i6 = this.mIds[i5];
                View viewById = motionLayout.getViewById(i6);
                if (this.firstViewReference == i6) {
                    this.startIndex = i5;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.touchUpMode == 2) {
                MotionScene.Transition transition = motionLayout.getTransition(this.forwardTransition);
                if (transition != null) {
                    transition.setOnTouchUp(5);
                }
                MotionScene.Transition transition2 = this.mMotionLayout.getTransition(this.backwardTransition);
                if (transition2 != null) {
                    transition2.setOnTouchUp(5);
                }
            }
            updateItems();
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i5, int i6, float f5) {
        this.mLastStartId = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout r2, int r3) {
        /*
            r1 = this;
            int r2 = r1.mIndex
            r1.mPreviousIndex = r2
            int r0 = r1.nextState
            if (r3 != r0) goto Ld
            int r2 = r2 + 1
        La:
            r1.mIndex = r2
            goto L14
        Ld:
            int r0 = r1.previousState
            if (r3 != r0) goto L14
            int r2 = r2 + (-1)
            goto La
        L14:
            boolean r2 = r1.infiniteCarousel
            r3 = 0
            if (r2 == 0) goto L34
            int r2 = r1.mIndex
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r1.mAdapter
            int r0 = r0.count()
            if (r2 < r0) goto L25
            r1.mIndex = r3
        L25:
            int r2 = r1.mIndex
            if (r2 >= 0) goto L4e
            androidx.constraintlayout.helper.widget.Carousel$Adapter r2 = r1.mAdapter
            int r2 = r2.count()
            int r2 = r2 + (-1)
            r1.mIndex = r2
            goto L4e
        L34:
            int r2 = r1.mIndex
            androidx.constraintlayout.helper.widget.Carousel$Adapter r0 = r1.mAdapter
            int r0 = r0.count()
            if (r2 < r0) goto L48
            androidx.constraintlayout.helper.widget.Carousel$Adapter r2 = r1.mAdapter
            int r2 = r2.count()
            int r2 = r2 + (-1)
            r1.mIndex = r2
        L48:
            int r2 = r1.mIndex
            if (r2 >= 0) goto L4e
            r1.mIndex = r3
        L4e:
            int r2 = r1.mPreviousIndex
            int r3 = r1.mIndex
            if (r2 == r3) goto L5b
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r1.mMotionLayout
            java.lang.Runnable r3 = r1.mUpdateRunnable
            r2.post(r3)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Carousel.onTransitionCompleted(androidx.constraintlayout.motion.widget.MotionLayout, int):void");
    }

    public void refresh() {
        int size = this.mList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.mList.get(i5);
            if (this.mAdapter.count() == 0) {
                updateViewVisibility(view, this.emptyViewBehavior);
            } else {
                updateViewVisibility(view, 0);
            }
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    public void setAdapter(Adapter adapter) {
        this.mAdapter = adapter;
    }

    public void transitionToIndex(int i5, int i6) {
        MotionLayout motionLayout;
        int i7;
        this.mTargetIndex = Math.max(0, Math.min(getCount() - 1, i5));
        int max = Math.max(0, i6);
        this.mAnimateTargetDelay = max;
        this.mMotionLayout.setTransitionDuration(max);
        if (i5 < this.mIndex) {
            motionLayout = this.mMotionLayout;
            i7 = this.previousState;
        } else {
            motionLayout = this.mMotionLayout;
            i7 = this.nextState;
        }
        motionLayout.transitionToState(i7, this.mAnimateTargetDelay);
    }
}
