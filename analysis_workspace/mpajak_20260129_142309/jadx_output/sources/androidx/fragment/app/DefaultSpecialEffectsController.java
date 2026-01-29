package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes16.dex */
class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10, reason: invalid class name */
    /* loaded from: classes14.dex */
    public static /* synthetic */ class AnonymousClass10 {
        public static final /* synthetic */ int[] $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes17.dex */
    public static class AnimationInfo extends SpecialEffectsInfo {

        @Nullable
        private FragmentAnim.AnimationOrAnimator mAnimation;
        private boolean mIsPop;
        private boolean mLoadedAnim;

        public AnimationInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z4) {
            super(operation, cancellationSignal);
            this.mLoadedAnim = false;
            this.mIsPop = z4;
        }

        @Nullable
        public FragmentAnim.AnimationOrAnimator getAnimation(@NonNull Context context) {
            if (this.mLoadedAnim) {
                return this.mAnimation;
            }
            FragmentAnim.AnimationOrAnimator loadAnimation = FragmentAnim.loadAnimation(context, getOperation().getFragment(), getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE, this.mIsPop);
            this.mAnimation = loadAnimation;
            this.mLoadedAnim = true;
            return loadAnimation;
        }
    }

    /* loaded from: classes7.dex */
    public static class SpecialEffectsInfo {

        @NonNull
        private final SpecialEffectsController.Operation mOperation;

        @NonNull
        private final CancellationSignal mSignal;

        public SpecialEffectsInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal) {
            this.mOperation = operation;
            this.mSignal = cancellationSignal;
        }

        public void completeSpecialEffect() {
            this.mOperation.completeSpecialEffect(this.mSignal);
        }

        @NonNull
        public SpecialEffectsController.Operation getOperation() {
            return this.mOperation;
        }

        @NonNull
        public CancellationSignal getSignal() {
            return this.mSignal;
        }

        public boolean isVisibilityUnchanged() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.mOperation.getFragment().mView);
            SpecialEffectsController.Operation.State finalState = this.mOperation.getFinalState();
            return from == finalState || !(from == (state = SpecialEffectsController.Operation.State.VISIBLE) || finalState == state);
        }
    }

    /* loaded from: classes8.dex */
    public static class TransitionInfo extends SpecialEffectsInfo {
        private final boolean mOverlapAllowed;

        @Nullable
        private final Object mSharedElementTransition;

        @Nullable
        private final Object mTransition;

        public TransitionInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z4, boolean z5) {
            super(operation, cancellationSignal);
            boolean z6;
            Object obj;
            if (operation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                Fragment fragment = operation.getFragment();
                this.mTransition = z4 ? fragment.getReenterTransition() : fragment.getEnterTransition();
                Fragment fragment2 = operation.getFragment();
                z6 = z4 ? fragment2.getAllowReturnTransitionOverlap() : fragment2.getAllowEnterTransitionOverlap();
            } else {
                Fragment fragment3 = operation.getFragment();
                this.mTransition = z4 ? fragment3.getReturnTransition() : fragment3.getExitTransition();
                z6 = true;
            }
            this.mOverlapAllowed = z6;
            if (z5) {
                Fragment fragment4 = operation.getFragment();
                obj = z4 ? fragment4.getSharedElementReturnTransition() : fragment4.getSharedElementEnterTransition();
            } else {
                obj = null;
            }
            this.mSharedElementTransition = obj;
        }

        @Nullable
        private FragmentTransitionImpl getHandlingImpl(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.PLATFORM_IMPL;
            if (fragmentTransitionImpl != null && fragmentTransitionImpl.canHandle(obj)) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.SUPPORT_IMPL;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.canHandle(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + getOperation().getFragment() + " is not a valid framework Transition or AndroidX Transition");
        }

        @Nullable
        public FragmentTransitionImpl getHandlingImpl() {
            FragmentTransitionImpl handlingImpl = getHandlingImpl(this.mTransition);
            FragmentTransitionImpl handlingImpl2 = getHandlingImpl(this.mSharedElementTransition);
            if (handlingImpl == null || handlingImpl2 == null || handlingImpl == handlingImpl2) {
                return handlingImpl != null ? handlingImpl : handlingImpl2;
            }
            StringBuilder g5 = d.g("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            g5.append(getOperation().getFragment());
            g5.append(" returned Transition ");
            g5.append(this.mTransition);
            g5.append(" which uses a different Transition  type than its shared element transition ");
            g5.append(this.mSharedElementTransition);
            throw new IllegalArgumentException(g5.toString());
        }

        @Nullable
        public Object getSharedElementTransition() {
            return this.mSharedElementTransition;
        }

        @Nullable
        public Object getTransition() {
            return this.mTransition;
        }

        public boolean hasSharedElementTransition() {
            return this.mSharedElementTransition != null;
        }

        public boolean isOverlapAllowed() {
            return this.mOverlapAllowed;
        }
    }

    public DefaultSpecialEffectsController(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void startAnimations(@NonNull List<AnimationInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, boolean z4, @NonNull Map<SpecialEffectsController.Operation, Boolean> map) {
        StringBuilder sb;
        String str;
        FragmentAnim.AnimationOrAnimator animation;
        final ViewGroup container = getContainer();
        Context context = container.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z5 = false;
        for (final AnimationInfo animationInfo : list) {
            if (animationInfo.isVisibilityUnchanged() || (animation = animationInfo.getAnimation(context)) == null) {
                animationInfo.completeSpecialEffect();
            } else {
                final Animator animator = animation.animator;
                if (animator == null) {
                    arrayList.add(animationInfo);
                } else {
                    final SpecialEffectsController.Operation operation = animationInfo.getOperation();
                    Fragment fragment = operation.getFragment();
                    if (Boolean.TRUE.equals(map.get(operation))) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Log.v(FragmentManager.TAG, "Ignoring Animator set on " + fragment + " as this Fragment was involved in a Transition.");
                        }
                        animationInfo.completeSpecialEffect();
                    } else {
                        final boolean z6 = operation.getFinalState() == SpecialEffectsController.Operation.State.GONE;
                        if (z6) {
                            list2.remove(operation);
                        }
                        final View view = fragment.mView;
                        container.startViewTransition(view);
                        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator2) {
                                container.endViewTransition(view);
                                if (z6) {
                                    operation.getFinalState().applyState(view);
                                }
                                animationInfo.completeSpecialEffect();
                            }
                        });
                        animator.setTarget(view);
                        animator.start();
                        animationInfo.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.3
                            @Override // androidx.core.os.CancellationSignal.OnCancelListener
                            public void onCancel() {
                                animator.end();
                            }
                        });
                        z5 = true;
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final AnimationInfo animationInfo2 = (AnimationInfo) it.next();
            SpecialEffectsController.Operation operation2 = animationInfo2.getOperation();
            Fragment fragment2 = operation2.getFragment();
            if (z4) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v(FragmentManager.TAG, sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else if (z5) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragment2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v(FragmentManager.TAG, sb.toString());
                }
                animationInfo2.completeSpecialEffect();
            } else {
                final View view2 = fragment2.mView;
                Animation animation2 = (Animation) Preconditions.checkNotNull(((FragmentAnim.AnimationOrAnimator) Preconditions.checkNotNull(animationInfo2.getAnimation(context))).animation);
                if (operation2.getFinalState() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation2);
                    animationInfo2.completeSpecialEffect();
                } else {
                    container.startViewTransition(view2);
                    FragmentAnim.EndViewTransitionAnimation endViewTransitionAnimation = new FragmentAnim.EndViewTransitionAnimation(animation2, container, view2);
                    endViewTransitionAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4
                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationEnd(Animation animation3) {
                            container.post(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.4.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                    container.endViewTransition(view2);
                                    animationInfo2.completeSpecialEffect();
                                }
                            });
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationRepeat(Animation animation3) {
                        }

                        @Override // android.view.animation.Animation.AnimationListener
                        public void onAnimationStart(Animation animation3) {
                        }
                    });
                    view2.startAnimation(endViewTransitionAnimation);
                }
                animationInfo2.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.5
                    @Override // androidx.core.os.CancellationSignal.OnCancelListener
                    public void onCancel() {
                        view2.clearAnimation();
                        container.endViewTransition(view2);
                        animationInfo2.completeSpecialEffect();
                    }
                });
            }
        }
    }

    @NonNull
    private Map<SpecialEffectsController.Operation, Boolean> startTransitions(@NonNull List<TransitionInfo> list, @NonNull List<SpecialEffectsController.Operation> list2, final boolean z4, @Nullable final SpecialEffectsController.Operation operation, @Nullable final SpecialEffectsController.Operation operation2) {
        View view;
        Object obj;
        Object obj2;
        ArrayList arrayList;
        ArrayList<View> arrayList2;
        Rect rect;
        View view2;
        ArrayMap arrayMap;
        final ArrayList<View> arrayList3;
        HashMap hashMap;
        SpecialEffectsController.Operation operation3;
        Object obj3;
        View view3;
        ArrayList arrayList4;
        Rect rect2;
        Object obj4;
        View view4;
        ArrayMap arrayMap2;
        View view5;
        FragmentTransitionImpl fragmentTransitionImpl;
        HashMap hashMap2;
        ArrayList<View> arrayList5;
        Rect rect3;
        ArrayList<View> arrayList6;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList7;
        int i5;
        View view6;
        final View view7;
        String findKeyForValue;
        ArrayList<String> arrayList8;
        boolean z5 = z4;
        HashMap hashMap3 = new HashMap();
        final FragmentTransitionImpl fragmentTransitionImpl2 = null;
        for (TransitionInfo transitionInfo : list) {
            if (!transitionInfo.isVisibilityUnchanged()) {
                FragmentTransitionImpl handlingImpl = transitionInfo.getHandlingImpl();
                if (fragmentTransitionImpl2 == null) {
                    fragmentTransitionImpl2 = handlingImpl;
                } else if (handlingImpl != null && fragmentTransitionImpl2 != handlingImpl) {
                    StringBuilder g5 = d.g("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    g5.append(transitionInfo.getOperation().getFragment());
                    g5.append(" returned Transition ");
                    g5.append(transitionInfo.getTransition());
                    g5.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(g5.toString());
                }
            }
        }
        if (fragmentTransitionImpl2 == null) {
            for (TransitionInfo transitionInfo2 : list) {
                hashMap3.put(transitionInfo2.getOperation(), Boolean.FALSE);
                transitionInfo2.completeSpecialEffect();
            }
            return hashMap3;
        }
        View view8 = new View(getContainer().getContext());
        final Rect rect4 = new Rect();
        ArrayList<View> arrayList9 = new ArrayList<>();
        ArrayList<View> arrayList10 = new ArrayList<>();
        ArrayMap arrayMap3 = new ArrayMap();
        Object obj5 = null;
        SpecialEffectsController.Operation operation4 = operation;
        SpecialEffectsController.Operation operation5 = operation2;
        View view9 = null;
        boolean z6 = false;
        DefaultSpecialEffectsController defaultSpecialEffectsController = this;
        for (TransitionInfo transitionInfo3 : list) {
            if (!transitionInfo3.hasSharedElementTransition() || operation4 == null || operation5 == null) {
                view4 = view9;
                arrayMap2 = arrayMap3;
                view5 = view8;
                fragmentTransitionImpl = fragmentTransitionImpl2;
                hashMap2 = hashMap3;
                arrayList5 = arrayList10;
            } else {
                Object wrapTransitionInSet = fragmentTransitionImpl2.wrapTransitionInSet(fragmentTransitionImpl2.cloneTransition(transitionInfo3.getSharedElementTransition()));
                ArrayList<String> sharedElementSourceNames = operation2.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = operation.getFragment().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = operation.getFragment().getSharedElementTargetNames();
                int i6 = 0;
                while (i6 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i6));
                    ArrayList<String> arrayList11 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i6));
                    }
                    i6++;
                    sharedElementTargetNames = arrayList11;
                }
                ArrayList<String> sharedElementTargetNames2 = operation2.getFragment().getSharedElementTargetNames();
                Fragment fragment = operation.getFragment();
                if (z5) {
                    enterTransitionCallback = fragment.getEnterTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getExitTransitionCallback();
                } else {
                    enterTransitionCallback = fragment.getExitTransitionCallback();
                    exitTransitionCallback = operation2.getFragment().getEnterTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                view4 = view9;
                int i7 = 0;
                while (i7 < size) {
                    arrayMap3.put(sharedElementSourceNames.get(i7), sharedElementTargetNames2.get(i7));
                    i7++;
                    size = size;
                    hashMap3 = hashMap3;
                }
                HashMap hashMap4 = hashMap3;
                ArrayMap<String, View> arrayMap4 = new ArrayMap<>();
                defaultSpecialEffectsController.findNamedViews(arrayMap4, operation.getFragment().mView);
                arrayMap4.retainAll(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.onMapSharedElements(sharedElementSourceNames, arrayMap4);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view10 = arrayMap4.get(str);
                        if (view10 == null) {
                            arrayMap3.remove(str);
                            arrayList8 = sharedElementSourceNames;
                        } else {
                            arrayList8 = sharedElementSourceNames;
                            if (!str.equals(ViewCompat.getTransitionName(view10))) {
                                arrayMap3.put(ViewCompat.getTransitionName(view10), (String) arrayMap3.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList8;
                    }
                    arrayList7 = sharedElementSourceNames;
                } else {
                    arrayList7 = sharedElementSourceNames;
                    arrayMap3.retainAll(arrayMap4.keySet());
                }
                final ArrayMap<String, View> arrayMap5 = new ArrayMap<>();
                defaultSpecialEffectsController.findNamedViews(arrayMap5, operation2.getFragment().mView);
                arrayMap5.retainAll(sharedElementTargetNames2);
                arrayMap5.retainAll(arrayMap3.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.onMapSharedElements(sharedElementTargetNames2, arrayMap5);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view11 = arrayMap5.get(str2);
                        if (view11 == null) {
                            String findKeyForValue2 = FragmentTransition.findKeyForValue(arrayMap3, str2);
                            if (findKeyForValue2 != null) {
                                arrayMap3.remove(findKeyForValue2);
                            }
                        } else if (!str2.equals(ViewCompat.getTransitionName(view11)) && (findKeyForValue = FragmentTransition.findKeyForValue(arrayMap3, str2)) != null) {
                            arrayMap3.put(findKeyForValue, ViewCompat.getTransitionName(view11));
                        }
                    }
                } else {
                    FragmentTransition.retainValues(arrayMap3, arrayMap5);
                }
                defaultSpecialEffectsController.retainMatchingViews(arrayMap4, arrayMap3.keySet());
                defaultSpecialEffectsController.retainMatchingViews(arrayMap5, arrayMap3.values());
                if (arrayMap3.isEmpty()) {
                    arrayList9.clear();
                    arrayList10.clear();
                    obj5 = null;
                    operation4 = operation;
                    operation5 = operation2;
                    arrayMap2 = arrayMap3;
                    arrayList5 = arrayList10;
                    view5 = view8;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    hashMap2 = hashMap4;
                } else {
                    FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z5, arrayMap4, true);
                    ArrayList<String> arrayList12 = arrayList7;
                    ArrayMap arrayMap6 = arrayMap3;
                    OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.6
                        @Override // java.lang.Runnable
                        public void run() {
                            FragmentTransition.callSharedElementStartEnd(operation2.getFragment(), operation.getFragment(), z4, arrayMap5, false);
                        }
                    });
                    arrayList9.addAll(arrayMap4.values());
                    if (arrayList12.isEmpty()) {
                        i5 = 0;
                        view6 = view4;
                    } else {
                        i5 = 0;
                        view6 = arrayMap4.get(arrayList12.get(0));
                        fragmentTransitionImpl2.setEpicenter(wrapTransitionInSet, view6);
                    }
                    arrayList10.addAll(arrayMap5.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view7 = arrayMap5.get(sharedElementTargetNames2.get(i5))) != null) {
                        OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.7
                            @Override // java.lang.Runnable
                            public void run() {
                                fragmentTransitionImpl2.getBoundsOnScreen(view7, rect4);
                            }
                        });
                        z6 = true;
                    }
                    fragmentTransitionImpl2.setSharedElementTargets(wrapTransitionInSet, view8, arrayList9);
                    arrayMap2 = arrayMap6;
                    arrayList5 = arrayList10;
                    Rect rect5 = rect4;
                    View view12 = view8;
                    fragmentTransitionImpl = fragmentTransitionImpl2;
                    fragmentTransitionImpl2.scheduleRemoveTargets(wrapTransitionInSet, null, null, null, null, wrapTransitionInSet, arrayList5);
                    Boolean bool = Boolean.TRUE;
                    hashMap2 = hashMap4;
                    hashMap2.put(operation, bool);
                    hashMap2.put(operation2, bool);
                    view4 = view6;
                    arrayList6 = arrayList9;
                    rect3 = rect5;
                    obj5 = wrapTransitionInSet;
                    operation4 = operation;
                    defaultSpecialEffectsController = this;
                    view5 = view12;
                    operation5 = operation2;
                    arrayMap3 = arrayMap2;
                    arrayList10 = arrayList5;
                    arrayList9 = arrayList6;
                    rect4 = rect3;
                    hashMap3 = hashMap2;
                    view9 = view4;
                    z5 = z4;
                    fragmentTransitionImpl2 = fragmentTransitionImpl;
                    view8 = view5;
                }
            }
            rect3 = rect4;
            arrayList6 = arrayList9;
            arrayMap3 = arrayMap2;
            arrayList10 = arrayList5;
            arrayList9 = arrayList6;
            rect4 = rect3;
            hashMap3 = hashMap2;
            view9 = view4;
            z5 = z4;
            fragmentTransitionImpl2 = fragmentTransitionImpl;
            view8 = view5;
        }
        View view13 = view9;
        ArrayMap arrayMap7 = arrayMap3;
        View view14 = view8;
        FragmentTransitionImpl fragmentTransitionImpl3 = fragmentTransitionImpl2;
        HashMap hashMap5 = hashMap3;
        ArrayList<View> arrayList13 = arrayList10;
        Rect rect6 = rect4;
        ArrayList<View> arrayList14 = arrayList9;
        ArrayList arrayList15 = new ArrayList();
        Object obj6 = null;
        Object obj7 = null;
        for (TransitionInfo transitionInfo4 : list) {
            if (transitionInfo4.isVisibilityUnchanged()) {
                hashMap5.put(transitionInfo4.getOperation(), Boolean.FALSE);
                transitionInfo4.completeSpecialEffect();
            } else {
                Object cloneTransition = fragmentTransitionImpl3.cloneTransition(transitionInfo4.getTransition());
                SpecialEffectsController.Operation operation6 = transitionInfo4.getOperation();
                boolean z7 = obj5 != null && (operation6 == operation4 || operation6 == operation5);
                if (cloneTransition == null) {
                    if (!z7) {
                        hashMap5.put(operation6, Boolean.FALSE);
                        transitionInfo4.completeSpecialEffect();
                    }
                    arrayMap = arrayMap7;
                    obj2 = obj6;
                    arrayList2 = arrayList14;
                    rect2 = rect6;
                    obj4 = obj7;
                    arrayList4 = arrayList15;
                    view3 = view13;
                    view2 = view14;
                    hashMap = hashMap5;
                } else {
                    HashMap hashMap6 = hashMap5;
                    ArrayList<View> arrayList16 = new ArrayList<>();
                    Object obj8 = obj7;
                    defaultSpecialEffectsController.captureTransitioningViews(arrayList16, operation6.getFragment().mView);
                    if (z7) {
                        if (operation6 == operation4) {
                            arrayList16.removeAll(arrayList14);
                        } else {
                            arrayList16.removeAll(arrayList13);
                        }
                    }
                    if (arrayList16.isEmpty()) {
                        fragmentTransitionImpl3.addTarget(cloneTransition, view14);
                        obj = obj8;
                        arrayMap = arrayMap7;
                        obj2 = obj6;
                        arrayList = arrayList15;
                        arrayList2 = arrayList14;
                        rect = rect6;
                        arrayList3 = arrayList16;
                        view = view13;
                        view2 = view14;
                        obj3 = cloneTransition;
                        hashMap = hashMap6;
                        operation3 = operation6;
                    } else {
                        fragmentTransitionImpl3.addTargets(cloneTransition, arrayList16);
                        view = view13;
                        obj = obj8;
                        obj2 = obj6;
                        arrayList = arrayList15;
                        arrayList2 = arrayList14;
                        rect = rect6;
                        view2 = view14;
                        arrayMap = arrayMap7;
                        arrayList3 = arrayList16;
                        hashMap = hashMap6;
                        fragmentTransitionImpl3.scheduleRemoveTargets(cloneTransition, cloneTransition, arrayList16, null, null, null, null);
                        if (operation6.getFinalState() == SpecialEffectsController.Operation.State.GONE) {
                            operation3 = operation6;
                            list2.remove(operation3);
                            ArrayList<View> arrayList17 = new ArrayList<>(arrayList3);
                            arrayList17.remove(operation3.getFragment().mView);
                            obj3 = cloneTransition;
                            fragmentTransitionImpl3.scheduleHideFragmentView(obj3, operation3.getFragment().mView, arrayList17);
                            OneShotPreDrawListener.add(getContainer(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.8
                                @Override // java.lang.Runnable
                                public void run() {
                                    FragmentTransition.setViewVisibility(arrayList3, 4);
                                }
                            });
                        } else {
                            operation3 = operation6;
                            obj3 = cloneTransition;
                        }
                    }
                    if (operation3.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
                        arrayList4 = arrayList;
                        arrayList4.addAll(arrayList3);
                        rect2 = rect;
                        if (z6) {
                            fragmentTransitionImpl3.setEpicenter(obj3, rect2);
                        }
                        view3 = view;
                    } else {
                        view3 = view;
                        arrayList4 = arrayList;
                        rect2 = rect;
                        fragmentTransitionImpl3.setEpicenter(obj3, view3);
                    }
                    hashMap.put(operation3, Boolean.TRUE);
                    if (transitionInfo4.isOverlapAllowed()) {
                        obj4 = fragmentTransitionImpl3.mergeTransitionsTogether(obj, obj3, null);
                    } else {
                        obj4 = obj;
                        obj2 = fragmentTransitionImpl3.mergeTransitionsTogether(obj2, obj3, null);
                    }
                }
                arrayList14 = arrayList2;
                hashMap5 = hashMap;
                arrayList15 = arrayList4;
                view14 = view2;
                rect6 = rect2;
                view13 = view3;
                obj7 = obj4;
                arrayMap7 = arrayMap;
                obj6 = obj2;
            }
        }
        ArrayMap arrayMap8 = arrayMap7;
        ArrayList arrayList18 = arrayList15;
        ArrayList<View> arrayList19 = arrayList14;
        HashMap hashMap7 = hashMap5;
        Object mergeTransitionsInSequence = fragmentTransitionImpl3.mergeTransitionsInSequence(obj7, obj6, obj5);
        for (final TransitionInfo transitionInfo5 : list) {
            if (!transitionInfo5.isVisibilityUnchanged()) {
                Object transition = transitionInfo5.getTransition();
                SpecialEffectsController.Operation operation7 = transitionInfo5.getOperation();
                boolean z8 = obj5 != null && (operation7 == operation4 || operation7 == operation5);
                if (transition != null || z8) {
                    if (ViewCompat.isLaidOut(getContainer())) {
                        fragmentTransitionImpl3.setListenerForTransitionEnd(transitionInfo5.getOperation().getFragment(), mergeTransitionsInSequence, transitionInfo5.getSignal(), new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.9
                            @Override // java.lang.Runnable
                            public void run() {
                                transitionInfo5.completeSpecialEffect();
                            }
                        });
                    } else {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            StringBuilder g6 = d.g("SpecialEffectsController: Container ");
                            g6.append(getContainer());
                            g6.append(" has not been laid out. Completing operation ");
                            g6.append(operation7);
                            Log.v(FragmentManager.TAG, g6.toString());
                        }
                        transitionInfo5.completeSpecialEffect();
                    }
                }
            }
        }
        if (!ViewCompat.isLaidOut(getContainer())) {
            return hashMap7;
        }
        FragmentTransition.setViewVisibility(arrayList18, 4);
        ArrayList<String> prepareSetNameOverridesReordered = fragmentTransitionImpl3.prepareSetNameOverridesReordered(arrayList13);
        fragmentTransitionImpl3.beginDelayedTransition(getContainer(), mergeTransitionsInSequence);
        fragmentTransitionImpl3.setNameOverridesReordered(getContainer(), arrayList19, arrayList13, prepareSetNameOverridesReordered, arrayMap8);
        FragmentTransition.setViewVisibility(arrayList18, 0);
        fragmentTransitionImpl3.swapSharedElementTargets(obj5, arrayList19, arrayList13);
        return hashMap7;
    }

    public void applyContainerChanges(@NonNull SpecialEffectsController.Operation operation) {
        operation.getFinalState().applyState(operation.getFragment().mView);
    }

    public void captureTransitioningViews(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.isTransitionGroup(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                captureTransitioningViews(arrayList, childAt);
            }
        }
    }

    @Override // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(@NonNull List<SpecialEffectsController.Operation> list, boolean z4) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation operation3 : list) {
            SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(operation3.getFragment().mView);
            int i5 = AnonymousClass10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[operation3.getFinalState().ordinal()];
            if (i5 == 1 || i5 == 2 || i5 == 3) {
                if (from == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i5 == 4 && from != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList(list);
        for (final SpecialEffectsController.Operation operation4 : list) {
            CancellationSignal cancellationSignal = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal);
            arrayList.add(new AnimationInfo(operation4, cancellationSignal, z4));
            CancellationSignal cancellationSignal2 = new CancellationSignal();
            operation4.markStartedSpecialEffect(cancellationSignal2);
            boolean z5 = false;
            if (z4) {
                if (operation4 != operation) {
                    arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z4, z5));
                    operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (arrayList3.contains(operation4)) {
                                arrayList3.remove(operation4);
                                DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                            }
                        }
                    });
                }
                z5 = true;
                arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z4, z5));
                operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (arrayList3.contains(operation4)) {
                            arrayList3.remove(operation4);
                            DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                        }
                    }
                });
            } else {
                if (operation4 != operation2) {
                    arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z4, z5));
                    operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (arrayList3.contains(operation4)) {
                                arrayList3.remove(operation4);
                                DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                            }
                        }
                    });
                }
                z5 = true;
                arrayList2.add(new TransitionInfo(operation4, cancellationSignal2, z4, z5));
                operation4.addCompletionListener(new Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (arrayList3.contains(operation4)) {
                            arrayList3.remove(operation4);
                            DefaultSpecialEffectsController.this.applyContainerChanges(operation4);
                        }
                    }
                });
            }
        }
        Map<SpecialEffectsController.Operation, Boolean> startTransitions = startTransitions(arrayList2, arrayList3, z4, operation, operation2);
        startAnimations(arrayList, arrayList3, startTransitions.containsValue(Boolean.TRUE), startTransitions);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            applyContainerChanges((SpecialEffectsController.Operation) it.next());
        }
        arrayList3.clear();
    }

    public void findNamedViews(Map<String, View> map, @NonNull View view) {
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    findNamedViews(map, childAt);
                }
            }
        }
    }

    public void retainMatchingViews(@NonNull ArrayMap<String, View> arrayMap, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.getTransitionName(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
