package com.blankj.utilcode.util;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c2.g;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.android.material.snackbar.g;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final class SnackbarUtils {
    private static final int COLOR_DEFAULT = -16777217;
    private static final int COLOR_ERROR = -65536;
    private static final int COLOR_MESSAGE = -1;
    private static final int COLOR_SUCCESS = -13912576;
    private static final int COLOR_WARNING = -16128;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    private static WeakReference<Snackbar> sWeakSnackbar;
    private View.OnClickListener actionListener;
    private CharSequence actionText;
    private int actionTextColor;
    private int bgColor;
    private int bgResource;
    private int bottomMargin;
    private int duration;
    private CharSequence message;
    private int messageColor;
    private View view;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes14.dex */
    public @interface Duration {
    }

    private SnackbarUtils(View view) {
        setDefault();
        this.view = view;
    }

    public static void addView(@LayoutRes int i5, @NonNull ViewGroup.LayoutParams layoutParams) {
        View view = getView();
        if (view != null) {
            view.setPadding(0, 0, 0, 0);
            ((Snackbar.SnackbarLayout) view).addView(LayoutInflater.from(view.getContext()).inflate(i5, (ViewGroup) null), -1, layoutParams);
        }
    }

    public static void addView(@NonNull View view, @NonNull ViewGroup.LayoutParams layoutParams) {
        View view2 = getView();
        if (view2 != null) {
            view2.setPadding(0, 0, 0, 0);
            ((Snackbar.SnackbarLayout) view2).addView(view, layoutParams);
        }
    }

    public static void dismiss() {
        WeakReference<Snackbar> weakReference = sWeakSnackbar;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        sWeakSnackbar.get().b(3);
        sWeakSnackbar = null;
    }

    private static ViewGroup findSuitableParentCopyFromSnackbar(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static View getView() {
        Snackbar snackbar = sWeakSnackbar.get();
        if (snackbar == null) {
            return null;
        }
        return snackbar.f1134c;
    }

    private void setDefault() {
        this.message = "";
        this.messageColor = COLOR_DEFAULT;
        this.bgColor = COLOR_DEFAULT;
        this.bgResource = -1;
        this.duration = -1;
        this.actionText = "";
        this.actionTextColor = COLOR_DEFAULT;
        this.bottomMargin = 0;
    }

    public static SnackbarUtils with(@NonNull View view) {
        return new SnackbarUtils(view);
    }

    public SnackbarUtils setAction(@NonNull CharSequence charSequence, @ColorInt int i5, @NonNull View.OnClickListener onClickListener) {
        this.actionText = charSequence;
        this.actionTextColor = i5;
        this.actionListener = onClickListener;
        return this;
    }

    public SnackbarUtils setAction(@NonNull CharSequence charSequence, @NonNull View.OnClickListener onClickListener) {
        return setAction(charSequence, COLOR_DEFAULT, onClickListener);
    }

    public SnackbarUtils setBgColor(@ColorInt int i5) {
        this.bgColor = i5;
        return this;
    }

    public SnackbarUtils setBgResource(@DrawableRes int i5) {
        this.bgResource = i5;
        return this;
    }

    public SnackbarUtils setBottomMargin(@IntRange(from = 1) int i5) {
        this.bottomMargin = i5;
        return this;
    }

    public SnackbarUtils setDuration(int i5) {
        this.duration = i5;
        return this;
    }

    public SnackbarUtils setMessage(@NonNull CharSequence charSequence) {
        this.message = charSequence;
        return this;
    }

    public SnackbarUtils setMessageColor(@ColorInt int i5) {
        this.messageColor = i5;
        return this;
    }

    public Snackbar show() {
        return show(false);
    }

    public Snackbar show(boolean z4) {
        View view = this.view;
        if (view == null) {
            return null;
        }
        if (z4) {
            ViewGroup findSuitableParentCopyFromSnackbar = findSuitableParentCopyFromSnackbar(view);
            View findViewWithTag = findSuitableParentCopyFromSnackbar.findViewWithTag("topSnackBarCoordinatorLayout");
            if (findViewWithTag == null) {
                findViewWithTag = new CoordinatorLayout(view.getContext());
                findViewWithTag.setTag("topSnackBarCoordinatorLayout");
                findViewWithTag.setRotation(180.0f);
                findViewWithTag.setElevation(100.0f);
                findSuitableParentCopyFromSnackbar.addView(findViewWithTag, -1, -1);
            }
            view = findViewWithTag;
        }
        if (this.messageColor != COLOR_DEFAULT) {
            SpannableString spannableString = new SpannableString(this.message);
            spannableString.setSpan(new ForegroundColorSpan(this.messageColor), 0, spannableString.length(), 33);
            sWeakSnackbar = new WeakReference<>(Snackbar.k(view, spannableString, this.duration));
        } else {
            sWeakSnackbar = new WeakReference<>(Snackbar.k(view, this.message, this.duration));
        }
        Snackbar snackbar = sWeakSnackbar.get();
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.f1134c;
        if (z4) {
            for (int i5 = 0; i5 < snackbarLayout.getChildCount(); i5++) {
                snackbarLayout.getChildAt(i5).setRotation(180.0f);
            }
        }
        int i6 = this.bgResource;
        if (i6 != -1) {
            snackbarLayout.setBackgroundResource(i6);
        } else {
            int i7 = this.bgColor;
            if (i7 != COLOR_DEFAULT) {
                snackbarLayout.setBackgroundColor(i7);
            }
        }
        if (this.bottomMargin != 0) {
            ((ViewGroup.MarginLayoutParams) snackbarLayout.getLayoutParams()).bottomMargin = this.bottomMargin;
        }
        if (this.actionText.length() > 0 && this.actionListener != null) {
            int i8 = this.actionTextColor;
            if (i8 != COLOR_DEFAULT) {
                ((SnackbarContentLayout) snackbar.f1134c.getChildAt(0)).getActionView().setTextColor(i8);
            }
            CharSequence charSequence = this.actionText;
            View.OnClickListener onClickListener = this.actionListener;
            Button actionView = ((SnackbarContentLayout) snackbar.f1134c.getChildAt(0)).getActionView();
            if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
                actionView.setVisibility(8);
                actionView.setOnClickListener(null);
                snackbar.f1164r = false;
            } else {
                snackbar.f1164r = true;
                actionView.setVisibility(0);
                actionView.setText(charSequence);
                actionView.setOnClickListener(new g(snackbar, onClickListener));
            }
        }
        com.google.android.material.snackbar.g b5 = com.google.android.material.snackbar.g.b();
        int j5 = snackbar.j();
        BaseTransientBottomBar.e eVar = snackbar.f1144m;
        synchronized (b5.f1175a) {
            if (b5.c(eVar)) {
                g.c cVar = b5.f1177c;
                cVar.f1181b = j5;
                b5.f1176b.removeCallbacksAndMessages(cVar);
                b5.g(b5.f1177c);
            } else {
                if (b5.d(eVar)) {
                    b5.f1178d.f1181b = j5;
                } else {
                    b5.f1178d = new g.c(j5, eVar);
                }
                g.c cVar2 = b5.f1177c;
                if (cVar2 == null || !b5.a(cVar2, 4)) {
                    b5.f1177c = null;
                    b5.h();
                }
            }
        }
        return snackbar;
    }

    public void showError() {
        showError(false);
    }

    public void showError(boolean z4) {
        this.bgColor = -65536;
        this.messageColor = -1;
        this.actionTextColor = -1;
        show(z4);
    }

    public void showSuccess() {
        showSuccess(false);
    }

    public void showSuccess(boolean z4) {
        this.bgColor = COLOR_SUCCESS;
        this.messageColor = -1;
        this.actionTextColor = -1;
        show(z4);
    }

    public void showWarning() {
        showWarning(false);
    }

    public void showWarning(boolean z4) {
        this.bgColor = COLOR_WARNING;
        this.messageColor = -1;
        this.actionTextColor = -1;
        show(z4);
    }
}
