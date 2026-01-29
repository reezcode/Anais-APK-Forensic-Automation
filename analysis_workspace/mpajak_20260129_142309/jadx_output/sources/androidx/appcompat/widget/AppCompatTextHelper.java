package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.AutoSizeableTextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* loaded from: classes6.dex */
class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int TEXT_FONT_WEIGHT_UNSPECIFIED = -1;
    private boolean mAsyncFontPending;

    @NonNull
    private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;

    @NonNull
    private final TextView mView;
    private int mStyle = 0;
    private int mFontWeight = -1;

    @RequiresApi(17)
    /* loaded from: classes2.dex */
    public static class Api17Impl {
        private Api17Impl() {
        }

        @DoNotInline
        public static Drawable[] getCompoundDrawablesRelative(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        public static void setCompoundDrawablesRelativeWithIntrinsicBounds(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        public static void setTextLocale(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @RequiresApi(21)
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        public static Locale forLanguageTag(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi(24)
    /* loaded from: classes25.dex */
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static LocaleList forLanguageTags(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        public static void setTextLocales(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        @DoNotInline
        public static int getAutoSizeStepGranularity(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithConfiguration(TextView textView, int i5, int i6, int i7, int i8) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
        }

        @DoNotInline
        public static void setAutoSizeTextTypeUniformWithPresetSizes(TextView textView, int[] iArr, int i5) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
        }

        @DoNotInline
        public static boolean setFontVariationSettings(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    @RequiresApi(28)
    /* loaded from: classes5.dex */
    public static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        public static Typeface create(Typeface typeface, int i5, boolean z4) {
            return Typeface.create(typeface, i5, z4);
        }
    }

    public AppCompatTextHelper(@NonNull TextView textView) {
        this.mView = textView;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private void applyCompoundDrawableTint(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.tintDrawable(drawable, tintInfo, this.mView.getDrawableState());
    }

    private static TintInfo createTintInfo(Context context, AppCompatDrawableManager appCompatDrawableManager, int i5) {
        ColorStateList tintList = appCompatDrawableManager.getTintList(context, i5);
        if (tintList == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.mHasTintList = true;
        tintInfo.mTintList = tintList;
        return tintInfo;
    }

    private void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
            TextView textView = this.mView;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = Api17Impl.getCompoundDrawablesRelative(this.mView);
        if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.mView;
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            Api17Impl.setCompoundDrawablesRelativeWithIntrinsicBounds(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
        TextView textView3 = this.mView;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void setCompoundTints() {
        TintInfo tintInfo = this.mDrawableTint;
        this.mDrawableLeftTint = tintInfo;
        this.mDrawableTopTint = tintInfo;
        this.mDrawableRightTint = tintInfo;
        this.mDrawableBottomTint = tintInfo;
        this.mDrawableStartTint = tintInfo;
        this.mDrawableEndTint = tintInfo;
    }

    private void setTextSizeInternal(int i5, float f5) {
        this.mAutoSizeTextHelper.setTextSizeInternal(i5, f5);
    }

    private void updateTypefaceAndStyle(Context context, TintTypedArray tintTypedArray) {
        String string;
        Typeface create;
        Typeface typeface;
        this.mStyle = tintTypedArray.getInt(R.styleable.TextAppearance_android_textStyle, this.mStyle);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = tintTypedArray.getInt(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.mFontWeight = i6;
            if (i6 != -1) {
                this.mStyle = (this.mStyle & 2) | 0;
            }
        }
        int i7 = R.styleable.TextAppearance_android_fontFamily;
        if (!tintTypedArray.hasValue(i7) && !tintTypedArray.hasValue(R.styleable.TextAppearance_fontFamily)) {
            int i8 = R.styleable.TextAppearance_android_typeface;
            if (tintTypedArray.hasValue(i8)) {
                this.mAsyncFontPending = false;
                int i9 = tintTypedArray.getInt(i8, 1);
                if (i9 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (i9 == 2) {
                    typeface = Typeface.SERIF;
                } else if (i9 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.mFontTypeface = typeface;
                return;
            }
            return;
        }
        this.mFontTypeface = null;
        int i10 = R.styleable.TextAppearance_fontFamily;
        if (tintTypedArray.hasValue(i10)) {
            i7 = i10;
        }
        final int i11 = this.mFontWeight;
        final int i12 = this.mStyle;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.mView);
            try {
                Typeface font = tintTypedArray.getFont(i7, this.mStyle, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrievalFailed */
                    public void lambda$callbackFailAsync$1(int i13) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    /* renamed from: onFontRetrieved */
                    public void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface2) {
                        int i13;
                        if (Build.VERSION.SDK_INT >= 28 && (i13 = i11) != -1) {
                            typeface2 = Api28Impl.create(typeface2, i13, (i12 & 2) != 0);
                        }
                        AppCompatTextHelper.this.onAsyncTypefaceReceived(weakReference, typeface2);
                    }
                });
                if (font != null) {
                    if (i5 >= 28 && this.mFontWeight != -1) {
                        font = Api28Impl.create(Typeface.create(font, 0), this.mFontWeight, (this.mStyle & 2) != 0);
                    }
                    this.mFontTypeface = font;
                }
                this.mAsyncFontPending = this.mFontTypeface == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.mFontTypeface != null || (string = tintTypedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.mFontWeight == -1) {
            create = Typeface.create(string, this.mStyle);
        } else {
            create = Api28Impl.create(Typeface.create(string, 0), this.mFontWeight, (this.mStyle & 2) != 0);
        }
        this.mFontTypeface = create;
    }

    public void applyCompoundDrawablesTints() {
        if (this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            Drawable[] compoundDrawables = this.mView.getCompoundDrawables();
            applyCompoundDrawableTint(compoundDrawables[0], this.mDrawableLeftTint);
            applyCompoundDrawableTint(compoundDrawables[1], this.mDrawableTopTint);
            applyCompoundDrawableTint(compoundDrawables[2], this.mDrawableRightTint);
            applyCompoundDrawableTint(compoundDrawables[3], this.mDrawableBottomTint);
        }
        if (this.mDrawableStartTint == null && this.mDrawableEndTint == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = Api17Impl.getCompoundDrawablesRelative(this.mView);
        applyCompoundDrawableTint(compoundDrawablesRelative[0], this.mDrawableStartTint);
        applyCompoundDrawableTint(compoundDrawablesRelative[2], this.mDrawableEndTint);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    public int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    public int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    public int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    public int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    public int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @Nullable
    public ColorStateList getCompoundDrawableTintList() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintList;
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getCompoundDrawableTintMode() {
        TintInfo tintInfo = this.mDrawableTint;
        if (tintInfo != null) {
            return tintInfo.mTintMode;
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void loadFromAttributes(@androidx.annotation.Nullable android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 784
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.loadFromAttributes(android.util.AttributeSet, int):void");
    }

    public void onAsyncTypefaceReceived(WeakReference<TextView> weakReference, final Typeface typeface) {
        if (this.mAsyncFontPending) {
            this.mFontTypeface = typeface;
            final TextView textView = weakReference.get();
            if (textView != null) {
                if (!ViewCompat.isAttachedToWindow(textView)) {
                    textView.setTypeface(typeface, this.mStyle);
                } else {
                    final int i5 = this.mStyle;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i5);
                        }
                    });
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            return;
        }
        autoSizeText();
    }

    public void onSetCompoundDrawables() {
        applyCompoundDrawablesTints();
    }

    public void onSetTextAppearance(Context context, int i5) {
        String string;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, i5, R.styleable.TextAppearance);
        int i6 = R.styleable.TextAppearance_textAllCaps;
        if (obtainStyledAttributes.hasValue(i6)) {
            setAllCaps(obtainStyledAttributes.getBoolean(i6, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 23) {
            int i8 = R.styleable.TextAppearance_android_textColor;
            if (obtainStyledAttributes.hasValue(i8) && (colorStateList3 = obtainStyledAttributes.getColorStateList(i8)) != null) {
                this.mView.setTextColor(colorStateList3);
            }
            int i9 = R.styleable.TextAppearance_android_textColorLink;
            if (obtainStyledAttributes.hasValue(i9) && (colorStateList2 = obtainStyledAttributes.getColorStateList(i9)) != null) {
                this.mView.setLinkTextColor(colorStateList2);
            }
            int i10 = R.styleable.TextAppearance_android_textColorHint;
            if (obtainStyledAttributes.hasValue(i10) && (colorStateList = obtainStyledAttributes.getColorStateList(i10)) != null) {
                this.mView.setHintTextColor(colorStateList);
            }
        }
        int i11 = R.styleable.TextAppearance_android_textSize;
        if (obtainStyledAttributes.hasValue(i11) && obtainStyledAttributes.getDimensionPixelSize(i11, -1) == 0) {
            this.mView.setTextSize(0, 0.0f);
        }
        updateTypefaceAndStyle(context, obtainStyledAttributes);
        if (i7 >= 26) {
            int i12 = R.styleable.TextAppearance_fontVariationSettings;
            if (obtainStyledAttributes.hasValue(i12) && (string = obtainStyledAttributes.getString(i12)) != null) {
                Api26Impl.setFontVariationSettings(this.mView, string);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.mFontTypeface;
        if (typeface != null) {
            this.mView.setTypeface(typeface, this.mStyle);
        }
    }

    public void populateSurroundingTextIfNeeded(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
    }

    public void setAllCaps(boolean z4) {
        this.mView.setAllCaps(z4);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i6, int i7, int i8) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i5) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
    }

    public void setAutoSizeTextTypeWithDefaults(int i5) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(i5);
    }

    public void setCompoundDrawableTintList(@Nullable ColorStateList colorStateList) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintList = colorStateList;
        tintInfo.mHasTintList = colorStateList != null;
        setCompoundTints();
    }

    public void setCompoundDrawableTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.mDrawableTint == null) {
            this.mDrawableTint = new TintInfo();
        }
        TintInfo tintInfo = this.mDrawableTint;
        tintInfo.mTintMode = mode;
        tintInfo.mHasTintMode = mode != null;
        setCompoundTints();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setTextSize(int i5, float f5) {
        if (AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE || isAutoSizeEnabled()) {
            return;
        }
        setTextSizeInternal(i5, f5);
    }
}
