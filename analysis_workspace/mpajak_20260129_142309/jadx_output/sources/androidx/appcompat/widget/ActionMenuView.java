package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes20.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {
    public static final int GENERATED_ITEM_PADDING = 4;
    public static final int MIN_CELL_SIZE = 56;
    private static final String TAG = "ActionMenuView";
    private MenuPresenter.Callback mActionMenuPresenterCallback;
    private boolean mFormatItems;
    private int mFormatItemsWidth;
    private int mGeneratedItemPadding;
    private MenuBuilder mMenu;
    public MenuBuilder.Callback mMenuBuilderCallback;
    private int mMinCellSize;
    public OnMenuItemClickListener mOnMenuItemClickListener;
    private Context mPopupContext;
    private int mPopupTheme;
    private ActionMenuPresenter mPresenter;
    private boolean mReserveOverflow;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes3.dex */
    public interface ActionMenuChildView {
        boolean needsDividerAfter();

        boolean needsDividerBefore();
    }

    /* loaded from: classes24.dex */
    public static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z4) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            return false;
        }
    }

    /* loaded from: classes13.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        @ViewDebug.ExportedProperty
        public int cellsUsed;

        @ViewDebug.ExportedProperty
        public boolean expandable;
        public boolean expanded;

        @ViewDebug.ExportedProperty
        public int extraPixels;

        @ViewDebug.ExportedProperty
        public boolean isOverflowButton;

        @ViewDebug.ExportedProperty
        public boolean preventEdgeOffset;

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
            this.isOverflowButton = false;
        }

        public LayoutParams(int i5, int i6, boolean z4) {
            super(i5, i6);
            this.isOverflowButton = z4;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.isOverflowButton = layoutParams.isOverflowButton;
        }
    }

    /* loaded from: classes19.dex */
    public class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean onMenuItemSelected(@NonNull MenuBuilder menuBuilder, @NonNull MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.mOnMenuItemClickListener;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void onMenuModeChange(@NonNull MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.mMenuBuilderCallback;
            if (callback != null) {
                callback.onMenuModeChange(menuBuilder);
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@NonNull Context context) {
        this(context, null);
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.mMinCellSize = (int) (56.0f * f5);
        this.mGeneratedItemPadding = (int) (f5 * 4.0f);
        this.mPopupContext = context;
        this.mPopupTheme = 0;
    }

    public static int measureChildForCells(View view, int i5, int i6, int i7, int i8) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - i8, View.MeasureSpec.getMode(i7));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z4 = actionMenuItemView != null && actionMenuItemView.hasText();
        int i9 = 2;
        if (i6 <= 0 || (z4 && i6 < 2)) {
            i9 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i5, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i10 = measuredWidth / i5;
            if (measuredWidth % i5 != 0) {
                i10++;
            }
            if (!z4 || i10 >= 2) {
                i9 = i10;
            }
        }
        layoutParams.expandable = !layoutParams.isOverflowButton && z4;
        layoutParams.cellsUsed = i9;
        view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i9, 1073741824), makeMeasureSpec);
        return i9;
    }

    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [boolean, int] */
    private void onMeasureExactFormat(int i5, int i6) {
        int i7;
        int i8;
        boolean z4;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        ?? r14;
        int i11;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int i12 = size - paddingRight;
        int i13 = this.mMinCellSize;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        boolean z7 = false;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long j5 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            int i22 = size2;
            if (childAt.getVisibility() == 8) {
                i11 = paddingBottom;
            } else {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i23 = i19 + 1;
                if (z8) {
                    int i24 = this.mGeneratedItemPadding;
                    i10 = i23;
                    r14 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    i10 = i23;
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.expanded = r14;
                layoutParams.extraPixels = r14;
                layoutParams.cellsUsed = r14;
                layoutParams.expandable = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.preventEdgeOffset = z8 && ((ActionMenuItemView) childAt).hasText();
                int measureChildForCells = measureChildForCells(childAt, i16, layoutParams.isOverflowButton ? 1 : i14, childMeasureSpec, paddingBottom);
                i20 = Math.max(i20, measureChildForCells);
                if (layoutParams.expandable) {
                    i21++;
                }
                if (layoutParams.isOverflowButton) {
                    z7 = true;
                }
                i14 -= measureChildForCells;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (measureChildForCells == 1) {
                    i11 = paddingBottom;
                    j5 |= 1 << i18;
                    i14 = i14;
                } else {
                    i11 = paddingBottom;
                }
                i19 = i10;
            }
            i18++;
            paddingBottom = i11;
            size2 = i22;
        }
        int i25 = size2;
        boolean z9 = z7 && i19 == 2;
        boolean z10 = false;
        while (i21 > 0 && i14 > 0) {
            int i26 = 0;
            int i27 = 0;
            int i28 = Integer.MAX_VALUE;
            long j6 = 0;
            while (i27 < childCount) {
                boolean z11 = z10;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i27).getLayoutParams();
                int i29 = i17;
                if (layoutParams2.expandable) {
                    int i30 = layoutParams2.cellsUsed;
                    if (i30 < i28) {
                        j6 = 1 << i27;
                        i28 = i30;
                        i26 = 1;
                    } else if (i30 == i28) {
                        i26++;
                        j6 |= 1 << i27;
                    }
                }
                i27++;
                i17 = i29;
                z10 = z11;
            }
            z4 = z10;
            i9 = i17;
            j5 |= j6;
            if (i26 > i14) {
                i7 = mode;
                i8 = i12;
                break;
            }
            int i31 = i28 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i33 = i12;
                int i34 = mode;
                long j7 = 1 << i32;
                if ((j6 & j7) == 0) {
                    if (layoutParams3.cellsUsed == i31) {
                        j5 |= j7;
                    }
                    z6 = z9;
                } else {
                    if (z9 && layoutParams3.preventEdgeOffset && i14 == 1) {
                        int i35 = this.mGeneratedItemPadding;
                        z6 = z9;
                        childAt2.setPadding(i35 + i16, 0, i35, 0);
                    } else {
                        z6 = z9;
                    }
                    layoutParams3.cellsUsed++;
                    layoutParams3.expanded = true;
                    i14--;
                }
                i32++;
                mode = i34;
                i12 = i33;
                z9 = z6;
            }
            i17 = i9;
            z10 = true;
        }
        i7 = mode;
        i8 = i12;
        z4 = z10;
        i9 = i17;
        boolean z12 = !z7 && i19 == 1;
        if (i14 <= 0 || j5 == 0 || (i14 >= i19 - 1 && !z12 && i20 <= 1)) {
            z5 = z4;
        } else {
            float bitCount = Long.bitCount(j5);
            if (!z12) {
                if ((j5 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j5 & (1 << i36)) != 0 && !((LayoutParams) getChildAt(i36).getLayoutParams()).preventEdgeOffset) {
                    bitCount -= 0.5f;
                }
            }
            int i37 = bitCount > 0.0f ? (int) ((i14 * i16) / bitCount) : 0;
            z5 = z4;
            for (int i38 = 0; i38 < childCount; i38++) {
                if ((j5 & (1 << i38)) != 0) {
                    View childAt3 = getChildAt(i38);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.extraPixels = i37;
                        layoutParams4.expanded = true;
                        if (i38 == 0 && !layoutParams4.preventEdgeOffset) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i37) / 2;
                        }
                    } else if (layoutParams4.isOverflowButton) {
                        layoutParams4.extraPixels = i37;
                        layoutParams4.expanded = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i37) / 2;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i37 / 2;
                        }
                    }
                    z5 = true;
                }
            }
        }
        if (z5) {
            for (int i39 = 0; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.expanded) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.cellsUsed * i16) + layoutParams5.extraPixels, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, i7 != 1073741824 ? i9 : i25);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dismissPopupMenus() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams generateOverflowButtonLayoutParams() {
        LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.isOverflowButton = true;
        return generateDefaultLayoutParams;
    }

    public Menu getMenu() {
        if (this.mMenu == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.mMenu = menuBuilder;
            menuBuilder.setCallback(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.mPresenter = actionMenuPresenter;
            actionMenuPresenter.setReserveOverflow(true);
            ActionMenuPresenter actionMenuPresenter2 = this.mPresenter;
            MenuPresenter.Callback callback = this.mActionMenuPresenterCallback;
            if (callback == null) {
                callback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.setCallback(callback);
            this.mMenu.addMenuPresenter(this.mPresenter, this.mPopupContext);
            this.mPresenter.setMenuView(this);
        }
        return this.mMenu;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.mPresenter.getOverflowIcon();
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean hasSupportDividerBeforeChildAt(int i5) {
        boolean z4 = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            z4 = false | ((ActionMenuChildView) childAt).needsDividerAfter();
        }
        return (i5 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? z4 : z4 | ((ActionMenuChildView) childAt2).needsDividerBefore();
    }

    public boolean hideOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.hideOverflowMenu();
    }

    @Override // androidx.appcompat.view.menu.MenuView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowMenuShowPending() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.isOverflowMenuShowing();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isOverflowReserved() {
        return this.mReserveOverflow;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.updateMenuView(false);
            if (this.mPresenter.isOverflowMenuShowing()) {
                this.mPresenter.hideOverflowMenu();
                this.mPresenter.showOverflowMenu();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismissPopupMenus();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int width;
        int i9;
        if (!this.mFormatItems) {
            super.onLayout(z4, i5, i6, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i8 - i6) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i7 - i5;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.isOverflowButton) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (hasSupportDividerBeforeChildAt(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (isLayoutRtl) {
                        i9 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    hasSupportDividerBeforeChildAt(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int max = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (isLayoutRtl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.isOverflowButton) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.isOverflowButton) {
                int i23 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i23;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i5, int i6) {
        MenuBuilder menuBuilder;
        boolean z4 = this.mFormatItems;
        boolean z5 = View.MeasureSpec.getMode(i5) == 1073741824;
        this.mFormatItems = z5;
        if (z4 != z5) {
            this.mFormatItemsWidth = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.mFormatItems && (menuBuilder = this.mMenu) != null && size != this.mFormatItemsWidth) {
            this.mFormatItemsWidth = size;
            menuBuilder.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.mFormatItems && childCount > 0) {
            onMeasureExactFormat(i5, i6);
            return;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i7).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i5, i6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public MenuBuilder peekMenu() {
        return this.mMenu;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z4) {
        this.mPresenter.setExpandedActionViewsExclusive(z4);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mActionMenuPresenterCallback = callback;
        this.mMenuBuilderCallback = callback2;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.mPresenter.setOverflowIcon(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z4) {
        this.mReserveOverflow = z4;
    }

    public void setPopupTheme(@StyleRes int i5) {
        if (this.mPopupTheme != i5) {
            this.mPopupTheme = i5;
            if (i5 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.mPresenter = actionMenuPresenter;
        actionMenuPresenter.setMenuView(this);
    }

    public boolean showOverflowMenu() {
        ActionMenuPresenter actionMenuPresenter = this.mPresenter;
        return actionMenuPresenter != null && actionMenuPresenter.showOverflowMenu();
    }
}
