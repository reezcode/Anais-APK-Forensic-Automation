package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes11.dex */
public final class ViewKt {
    public static final void doOnAttach(final View view, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            action.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view.removeOnAttachStateChangeListener(this);
                    action.invoke(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                }
            });
        }
    }

    public static final void doOnDetach(final View view, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.core.view.ViewKt$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view.removeOnAttachStateChangeListener(this);
                    action.invoke(view2);
                }
            });
        } else {
            action.invoke(view);
        }
    }

    public static final void doOnLayout(View view, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnLayout$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                    Intrinsics.checkNotNullParameter(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    Function1.this.invoke(view2);
                }
            });
        } else {
            action.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.core.view.ViewKt$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                Intrinsics.checkNotNullParameter(view2, "view");
                view2.removeOnLayoutChangeListener(this);
                action.invoke(view2);
            }
        });
    }

    public static final OneShotPreDrawListener doOnPreDraw(final View view, final Function1<? super View, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        OneShotPreDrawListener add = OneShotPreDrawListener.add(view, new Runnable() { // from class: androidx.core.view.ViewKt$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke(view);
            }
        });
        Intrinsics.checkNotNullExpressionValue(add, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return add;
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!ViewCompat.isLaidOut(view)) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final Sequence<View> getAllViews(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return SequencesKt.sequence(new ViewKt$allViews$1(view, null));
    }

    public static final Sequence<ViewParent> getAncestors(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return SequencesKt.generateSequence(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginBottom(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final Runnable postDelayed(View view, long j5, final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke();
            }
        };
        view.postDelayed(runnable, j5);
        return runnable;
    }

    @RequiresApi(16)
    public static final Runnable postOnAnimationDelayed(View view, long j5, final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        Runnable runnable = new Runnable() { // from class: androidx.core.view.ViewKt$postOnAnimationDelayed$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                action.invoke();
            }
        };
        view.postOnAnimationDelayed(runnable, j5);
        return runnable;
    }

    public static final void setGone(View view, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z4 ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z4 ? 4 : 0);
    }

    public static final void setPadding(View view, @Px int i5) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i5, i5, i5, i5);
    }

    public static final void setVisible(View view, boolean z4) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(z4 ? 0 : 8);
    }

    public static final void updateLayoutParams(View view, Function1<? super ViewGroup.LayoutParams, Unit> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        block.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    @JvmName(name = "updateLayoutParamsTyped")
    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        block.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(View view, @Px int i5, @Px int i6, @Px int i7, @Px int i8) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i5, i6, i7, i8);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = view.getPaddingLeft();
        }
        if ((i9 & 2) != 0) {
            i6 = view.getPaddingTop();
        }
        if ((i9 & 4) != 0) {
            i7 = view.getPaddingRight();
        }
        if ((i9 & 8) != 0) {
            i8 = view.getPaddingBottom();
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i5, i6, i7, i8);
    }

    @RequiresApi(17)
    public static final void updatePaddingRelative(View view, @Px int i5, @Px int i6, @Px int i7, @Px int i8) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i5, i6, i7, i8);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = view.getPaddingStart();
        }
        if ((i9 & 2) != 0) {
            i6 = view.getPaddingTop();
        }
        if ((i9 & 4) != 0) {
            i7 = view.getPaddingEnd();
        }
        if ((i9 & 8) != 0) {
            i8 = view.getPaddingBottom();
        }
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPaddingRelative(i5, i6, i7, i8);
    }
}
