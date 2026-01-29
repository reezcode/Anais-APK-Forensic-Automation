package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.snackbar.e;
import com.google.android.material.snackbar.g;

/* loaded from: classes13.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    public ViewDragHelper f746a;

    /* renamed from: b, reason: collision with root package name */
    public b f747b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f748c;

    /* renamed from: d, reason: collision with root package name */
    public int f749d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f750e = 0.5f;

    /* renamed from: f, reason: collision with root package name */
    public float f751f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public float f752g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public final a f753h = new a();

    /* loaded from: classes20.dex */
    public class a extends ViewDragHelper.Callback {

        /* renamed from: a, reason: collision with root package name */
        public int f754a;

        /* renamed from: b, reason: collision with root package name */
        public int f755b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        
            r5 = r2.f754a - r3.getWidth();
            r3 = r2.f754a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0015, code lost:
        
            if (r5 != false) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        
            if (r5 != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            r5 = r2.f754a;
            r3 = r3.getWidth() + r5;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int clampViewPositionHorizontal(@androidx.annotation.NonNull android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = 1
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f749d
                if (r1 != 0) goto L13
                if (r5 == 0) goto L17
                goto L1f
            L13:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L1f
            L17:
                int r5 = r2.f754a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L1f:
                int r5 = r2.f754a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f754a
                goto L37
            L29:
                int r5 = r2.f754a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f754a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(@NonNull View view, int i5, int i6) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(@NonNull View view, int i5) {
            this.f755b = i5;
            this.f754a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i5) {
            b bVar = SwipeDismissBehavior.this.f747b;
            if (bVar != null) {
                e eVar = (e) bVar;
                if (i5 == 0) {
                    g.b().f(eVar.f1172a.f1144m);
                } else if (i5 == 1 || i5 == 2) {
                    g.b().e(eVar.f1172a.f1144m);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(@NonNull View view, int i5, int i6, int i7, int i8) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f751f) + this.f754a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f752g) + this.f754a;
            float f5 = i5;
            if (f5 <= width) {
                view.setAlpha(1.0f);
            } else if (f5 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.b(1.0f - ((f5 - width) / (width2 - width))));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0051, code lost:
        
            if (java.lang.Math.abs(r8.getLeft() - r7.f754a) >= java.lang.Math.round(r8.getWidth() * r7.f756c.f750e)) goto L27;
         */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onViewReleased(@androidx.annotation.NonNull android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f755b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 1
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r3 == 0) goto L37
                int r4 = androidx.core.view.ViewCompat.getLayoutDirection(r8)
                if (r4 != r1) goto L16
                r4 = 1
                goto L17
            L16:
                r4 = 0
            L17:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f749d
                r6 = 2
                if (r5 != r6) goto L1f
                goto L53
            L1f:
                if (r5 != 0) goto L2b
                if (r4 == 0) goto L28
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L55
                goto L53
            L28:
                if (r3 <= 0) goto L55
                goto L53
            L2b:
                if (r5 != r1) goto L55
                if (r4 == 0) goto L32
                if (r3 <= 0) goto L55
                goto L53
            L32:
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L55
                goto L53
            L37:
                int r9 = r8.getLeft()
                int r2 = r7.f754a
                int r9 = r9 - r2
                int r2 = r8.getWidth()
                float r2 = (float) r2
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f750e
                float r2 = r2 * r3
                int r2 = java.lang.Math.round(r2)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r2) goto L55
            L53:
                r9 = 1
                goto L56
            L55:
                r9 = 0
            L56:
                if (r9 == 0) goto L64
                int r9 = r8.getLeft()
                int r0 = r7.f754a
                if (r9 >= r0) goto L62
                int r0 = r0 - r10
                goto L68
            L62:
                int r0 = r0 + r10
                goto L68
            L64:
                int r9 = r7.f754a
                r0 = r9
                r1 = 0
            L68:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                androidx.customview.widget.ViewDragHelper r9 = r9.f746a
                int r10 = r8.getTop()
                boolean r9 = r9.settleCapturedViewAt(r0, r10)
                if (r9 == 0) goto L81
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                androidx.core.view.ViewCompat.postOnAnimation(r8, r9)
                goto L8e
            L81:
                if (r1 == 0) goto L8e
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f747b
                if (r9 == 0) goto L8e
                com.google.android.material.snackbar.e r9 = (com.google.android.material.snackbar.e) r9
                r9.a(r8)
            L8e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i5) {
            int i6 = this.f755b;
            return (i6 == -1 || i6 == i5) && SwipeDismissBehavior.this.a(view);
        }
    }

    /* loaded from: classes19.dex */
    public interface b {
    }

    /* loaded from: classes15.dex */
    public class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final View f757b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f758c;

        public c(View view, boolean z4) {
            this.f757b = view;
            this.f758c = z4;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f746a;
            if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                ViewCompat.postOnAnimation(this.f757b, this);
            } else {
                if (!this.f758c || (bVar = SwipeDismissBehavior.this.f747b) == null) {
                    return;
                }
                ((e) bVar).a(this.f757b);
            }
        }
    }

    public static float b(float f5) {
        return Math.min(Math.max(0.0f, f5), 1.0f);
    }

    public boolean a(@NonNull View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, @NonNull MotionEvent motionEvent) {
        boolean z4 = this.f748c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z4 = coordinatorLayout.isPointInChildBounds(v4, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f748c = z4;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f748c = false;
        }
        if (!z4) {
            return false;
        }
        if (this.f746a == null) {
            this.f746a = ViewDragHelper.create(coordinatorLayout, this.f753h);
        }
        return this.f746a.shouldInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v4, int i5) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v4, i5);
        if (ViewCompat.getImportantForAccessibility(v4) == 0) {
            ViewCompat.setImportantForAccessibility(v4, 1);
            ViewCompat.removeAccessibilityAction(v4, 1048576);
            if (a(v4)) {
                ViewCompat.replaceAccessibilityAction(v4, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new com.google.android.material.behavior.a(this));
            }
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v4, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f746a;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.processTouchEvent(motionEvent);
        return true;
    }
}
