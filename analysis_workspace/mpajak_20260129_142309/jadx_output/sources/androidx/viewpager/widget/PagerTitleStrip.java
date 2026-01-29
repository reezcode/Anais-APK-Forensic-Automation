package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.DecorView
/* loaded from: classes18.dex */
public class PagerTitleStrip extends ViewGroup {
    private static final float SIDE_ALPHA = 0.6f;
    private static final int TEXT_SPACING = 16;
    public TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    public float mLastKnownPositionOffset;
    public TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    public ViewPager mPager;
    public TextView mPrevText;
    private int mScaledTextSpacing;
    public int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference<PagerAdapter> mWatchingAdapter;
    private static final int[] ATTRS = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    private static final int[] TEXT_ATTRS = {R.attr.textAllCaps};

    /* loaded from: classes16.dex */
    public class PageListener extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
        private int mScrollState;

        public PageListener() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f5 = pagerTitleStrip2.mLastKnownPositionOffset;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f5, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i5) {
            this.mScrollState = i5;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i5, float f5, int i6) {
            if (f5 > 0.5f) {
                i5++;
            }
            PagerTitleStrip.this.updateTextPositions(i5, f5, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i5) {
            if (this.mScrollState == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.updateText(pagerTitleStrip.mPager.getCurrentItem(), PagerTitleStrip.this.mPager.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f5 = pagerTitleStrip2.mLastKnownPositionOffset;
                if (f5 < 0.0f) {
                    f5 = 0.0f;
                }
                pagerTitleStrip2.updateTextPositions(pagerTitleStrip2.mPager.getCurrentItem(), f5, true);
            }
        }
    }

    public static class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        public SingleLineAllCapsTransform(Context context) {
            this.mLocale = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.mLocale);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastKnownCurrentPage = -1;
        this.mLastKnownPositionOffset = -1.0f;
        this.mPageListener = new PageListener();
        TextView textView = new TextView(context);
        this.mPrevText = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.mCurrText = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.mNextText = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ATTRS);
        boolean z4 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setTextAppearance(this.mPrevText, resourceId);
            TextViewCompat.setTextAppearance(this.mCurrText, resourceId);
            TextViewCompat.setTextAppearance(this.mNextText, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.mPrevText.setTextColor(color);
            this.mCurrText.setTextColor(color);
            this.mNextText.setTextColor(color);
        }
        this.mGravity = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.mTextColor = this.mCurrText.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(SIDE_ALPHA);
        this.mPrevText.setEllipsize(TextUtils.TruncateAt.END);
        this.mCurrText.setEllipsize(TextUtils.TruncateAt.END);
        this.mNextText.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, TEXT_ATTRS);
            z4 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.mPrevText;
        if (z4) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.mCurrText);
            setSingleLineAllCaps(this.mNextText);
        } else {
            textView4.setSingleLine();
            this.mCurrText.setSingleLine();
            this.mNextText.setSingleLine();
        }
        this.mScaledTextSpacing = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        viewPager.setInternalPageChangeListener(this.mPageListener);
        viewPager.addOnAdapterChangeListener(this.mPageListener);
        this.mPager = viewPager;
        WeakReference<PagerAdapter> weakReference = this.mWatchingAdapter;
        updateAdapter(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            updateAdapter(viewPager.getAdapter(), null);
            this.mPager.setInternalPageChangeListener(null);
            this.mPager.removeOnAdapterChangeListener(this.mPageListener);
            this.mPager = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        if (this.mPager != null) {
            float f5 = this.mLastKnownPositionOffset;
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            updateTextPositions(this.mLastKnownCurrentPage, f5, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i6) {
        int max;
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i5);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, (int) (size * 0.2f), -2);
        this.mPrevText.measure(childMeasureSpec2, childMeasureSpec);
        this.mCurrText.measure(childMeasureSpec2, childMeasureSpec);
        this.mNextText.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i6) == 1073741824) {
            max = View.MeasureSpec.getSize(i6);
        } else {
            max = Math.max(getMinHeight(), this.mCurrText.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(max, i6, this.mCurrText.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mUpdatingText) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i5) {
        this.mGravity = i5;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f5) {
        int i5 = ((int) (f5 * 255.0f)) & 255;
        this.mNonPrimaryAlpha = i5;
        int i6 = (i5 << 24) | (this.mTextColor & ViewCompat.MEASURED_SIZE_MASK);
        this.mPrevText.setTextColor(i6);
        this.mNextText.setTextColor(i6);
    }

    public void setTextColor(@ColorInt int i5) {
        this.mTextColor = i5;
        this.mCurrText.setTextColor(i5);
        int i6 = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & ViewCompat.MEASURED_SIZE_MASK);
        this.mPrevText.setTextColor(i6);
        this.mNextText.setTextColor(i6);
    }

    public void setTextSize(int i5, float f5) {
        this.mPrevText.setTextSize(i5, f5);
        this.mCurrText.setTextSize(i5, f5);
        this.mNextText.setTextSize(i5, f5);
    }

    public void setTextSpacing(int i5) {
        this.mScaledTextSpacing = i5;
        requestLayout();
    }

    public void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(this.mPageListener);
            this.mWatchingAdapter = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.mPager;
        if (viewPager != null) {
            this.mLastKnownCurrentPage = -1;
            this.mLastKnownPositionOffset = -1.0f;
            updateText(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    public void updateText(int i5, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.mUpdatingText = true;
        CharSequence charSequence = null;
        this.mPrevText.setText((i5 < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i5 - 1));
        this.mCurrText.setText((pagerAdapter == null || i5 >= count) ? null : pagerAdapter.getPageTitle(i5));
        int i6 = i5 + 1;
        if (i6 < count && pagerAdapter != null) {
            charSequence = pagerAdapter.getPageTitle(i6);
        }
        this.mNextText.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.mPrevText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mCurrText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mNextText.measure(makeMeasureSpec, makeMeasureSpec2);
        this.mLastKnownCurrentPage = i5;
        if (!this.mUpdatingPositions) {
            updateTextPositions(i5, this.mLastKnownPositionOffset, false);
        }
        this.mUpdatingText = false;
    }

    public void updateTextPositions(int i5, float f5, boolean z4) {
        int i6;
        int i7;
        int i8;
        int i9;
        if (i5 != this.mLastKnownCurrentPage) {
            updateText(i5, this.mPager.getAdapter());
        } else if (!z4 && f5 == this.mLastKnownPositionOffset) {
            return;
        }
        this.mUpdatingPositions = true;
        int measuredWidth = this.mPrevText.getMeasuredWidth();
        int measuredWidth2 = this.mCurrText.getMeasuredWidth();
        int measuredWidth3 = this.mNextText.getMeasuredWidth();
        int i10 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i11 = paddingRight + i10;
        int i12 = (width - (paddingLeft + i10)) - i11;
        float f6 = 0.5f + f5;
        if (f6 > 1.0f) {
            f6 -= 1.0f;
        }
        int i13 = ((width - i11) - ((int) (i12 * f6))) - i10;
        int i14 = measuredWidth2 + i13;
        int baseline = this.mPrevText.getBaseline();
        int baseline2 = this.mCurrText.getBaseline();
        int baseline3 = this.mNextText.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i15 = max - baseline;
        int i16 = max - baseline2;
        int i17 = max - baseline3;
        int max2 = Math.max(Math.max(this.mPrevText.getMeasuredHeight() + i15, this.mCurrText.getMeasuredHeight() + i16), this.mNextText.getMeasuredHeight() + i17);
        int i18 = this.mGravity & 112;
        if (i18 == 16) {
            i6 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else {
            if (i18 != 80) {
                i7 = i15 + paddingTop;
                i8 = i16 + paddingTop;
                i9 = paddingTop + i17;
                TextView textView = this.mCurrText;
                textView.layout(i13, i8, i14, textView.getMeasuredHeight() + i8);
                int min = Math.min(paddingLeft, (i13 - this.mScaledTextSpacing) - measuredWidth);
                TextView textView2 = this.mPrevText;
                textView2.layout(min, i7, measuredWidth + min, textView2.getMeasuredHeight() + i7);
                int max3 = Math.max((width - paddingRight) - measuredWidth3, i14 + this.mScaledTextSpacing);
                TextView textView3 = this.mNextText;
                textView3.layout(max3, i9, max3 + measuredWidth3, textView3.getMeasuredHeight() + i9);
                this.mLastKnownPositionOffset = f5;
                this.mUpdatingPositions = false;
            }
            i6 = (height - paddingBottom) - max2;
        }
        i7 = i15 + i6;
        i8 = i16 + i6;
        i9 = i6 + i17;
        TextView textView4 = this.mCurrText;
        textView4.layout(i13, i8, i14, textView4.getMeasuredHeight() + i8);
        int min2 = Math.min(paddingLeft, (i13 - this.mScaledTextSpacing) - measuredWidth);
        TextView textView22 = this.mPrevText;
        textView22.layout(min2, i7, measuredWidth + min2, textView22.getMeasuredHeight() + i7);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i14 + this.mScaledTextSpacing);
        TextView textView32 = this.mNextText;
        textView32.layout(max32, i9, max32 + measuredWidth3, textView32.getMeasuredHeight() + i9);
        this.mLastKnownPositionOffset = f5;
        this.mUpdatingPositions = false;
    }
}
