package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.LineHeightSpan;
import android.text.style.MaskFilterSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ReplacementSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.activity.d;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class SpanUtils {
    public static final int ALIGN_BASELINE = 1;
    public static final int ALIGN_BOTTOM = 0;
    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_TOP = 3;
    private static final int COLOR_DEFAULT = -16777217;
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    private int alignImage;
    private int alignLine;
    private Layout.Alignment alignment;
    private int backgroundColor;
    private float blurRadius;
    private int bulletColor;
    private int bulletGapWidth;
    private int bulletRadius;
    private ClickableSpan clickSpan;
    private int first;
    private int flag;
    private String fontFamily;
    private int fontSize;
    private int foregroundColor;
    private Bitmap imageBitmap;
    private Drawable imageDrawable;
    private int imageResourceId;
    private Uri imageUri;
    private boolean isBold;
    private boolean isBoldItalic;
    private boolean isCreated;
    private boolean isItalic;
    private boolean isStrikethrough;
    private boolean isSubscript;
    private boolean isSuperscript;
    private boolean isUnderline;
    private int lineHeight;
    private SerializableSpannableStringBuilder mBuilder;
    private CharSequence mText;
    private TextView mTextView;
    private int mType;
    private final int mTypeCharSequence;
    private final int mTypeImage;
    private final int mTypeSpace;
    private float proportion;
    private int quoteColor;
    private int quoteGapWidth;
    private int rest;
    private Shader shader;
    private int shadowColor;
    private float shadowDx;
    private float shadowDy;
    private float shadowRadius;
    private int spaceColor;
    private int spaceSize;
    private Object[] spans;
    private int stripeWidth;
    private BlurMaskFilter.Blur style;
    private Typeface typeface;
    private String url;
    private int verticalAlign;
    private float xProportion;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes21.dex */
    public @interface Align {
    }

    public static class CustomBulletSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int radius;
        private Path sBulletPath;

        private CustomBulletSpan(int i5, int i6, int i7) {
            this.sBulletPath = null;
            this.color = i5;
            this.radius = i6;
            this.gapWidth = i7;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
            if (((Spanned) charSequence).getSpanStart(this) == i10) {
                Paint.Style style = paint.getStyle();
                int color = paint.getColor();
                paint.setColor(this.color);
                paint.setStyle(Paint.Style.FILL);
                if (canvas.isHardwareAccelerated()) {
                    if (this.sBulletPath == null) {
                        Path path = new Path();
                        this.sBulletPath = path;
                        path.addCircle(0.0f, 0.0f, this.radius, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.translate((i6 * this.radius) + i5, (i7 + i9) / 2.0f);
                    canvas.drawPath(this.sBulletPath, paint);
                    canvas.restore();
                } else {
                    canvas.drawCircle((i6 * r10) + i5, (i7 + i9) / 2.0f, this.radius, paint);
                }
                paint.setColor(color);
                paint.setStyle(style);
            }
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z4) {
            return (this.radius * 2) + this.gapWidth;
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class CustomDynamicDrawableSpan extends ReplacementSpan {
        public static final int ALIGN_BASELINE = 1;
        public static final int ALIGN_BOTTOM = 0;
        public static final int ALIGN_CENTER = 2;
        public static final int ALIGN_TOP = 3;
        private WeakReference<Drawable> mDrawableRef;
        public final int mVerticalAlignment;

        private CustomDynamicDrawableSpan() {
            this.mVerticalAlignment = 0;
        }

        private CustomDynamicDrawableSpan(int i5) {
            this.mVerticalAlignment = i5;
        }

        private Drawable getCachedDrawable() {
            WeakReference<Drawable> weakReference = this.mDrawableRef;
            Drawable drawable = weakReference != null ? weakReference.get() : null;
            if (drawable != null) {
                return drawable;
            }
            Drawable drawable2 = getDrawable();
            this.mDrawableRef = new WeakReference<>(drawable2);
            return drawable2;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, @NonNull Paint paint) {
            float f6;
            int i10;
            int i11;
            Drawable cachedDrawable = getCachedDrawable();
            Rect bounds = cachedDrawable.getBounds();
            canvas.save();
            if (bounds.height() >= i9 - i7 || (i10 = this.mVerticalAlignment) == 3) {
                f6 = i7;
            } else {
                if (i10 == 2) {
                    i11 = ((i9 + i7) - bounds.height()) / 2;
                } else {
                    int height = bounds.height();
                    if (i10 == 1) {
                        f6 = i8 - height;
                    } else {
                        i11 = i9 - height;
                    }
                }
                f6 = i11;
            }
            canvas.translate(f5, f6);
            cachedDrawable.draw(canvas);
            canvas.restore();
        }

        public abstract Drawable getDrawable();

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
            int i7;
            int i8;
            Rect bounds = getCachedDrawable().getBounds();
            if (fontMetricsInt != null && (i7 = fontMetricsInt.bottom - fontMetricsInt.top) < bounds.height()) {
                int i9 = this.mVerticalAlignment;
                if (i9 == 3) {
                    fontMetricsInt.top = fontMetricsInt.top;
                    fontMetricsInt.bottom = bounds.height() + fontMetricsInt.top;
                } else {
                    if (i9 == 2) {
                        int i10 = i7 / 4;
                        fontMetricsInt.top = ((-bounds.height()) / 2) - i10;
                        i8 = (bounds.height() / 2) - i10;
                    } else {
                        int i11 = -bounds.height();
                        i8 = fontMetricsInt.bottom;
                        fontMetricsInt.top = i11 + i8;
                    }
                    fontMetricsInt.bottom = i8;
                }
                fontMetricsInt.ascent = fontMetricsInt.top;
                fontMetricsInt.descent = fontMetricsInt.bottom;
            }
            return bounds.right;
        }
    }

    /* loaded from: classes9.dex */
    public static class CustomImageSpan extends CustomDynamicDrawableSpan {
        private Uri mContentUri;
        private Drawable mDrawable;
        private int mResourceId;

        private CustomImageSpan(@DrawableRes int i5, int i6) {
            super(i6);
            this.mResourceId = i5;
        }

        private CustomImageSpan(Bitmap bitmap, int i5) {
            super(i5);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(Utils.getApp().getResources(), bitmap);
            this.mDrawable = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Drawable drawable, int i5) {
            super(i5);
            this.mDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.mDrawable.getIntrinsicHeight());
        }

        private CustomImageSpan(Uri uri, int i5) {
            super(i5);
            this.mContentUri = uri;
        }

        @Override // com.blankj.utilcode.util.SpanUtils.CustomDynamicDrawableSpan
        public Drawable getDrawable() {
            Drawable drawable;
            Drawable drawable2 = this.mDrawable;
            if (drawable2 != null) {
                return drawable2;
            }
            BitmapDrawable bitmapDrawable = null;
            if (this.mContentUri != null) {
                try {
                    InputStream openInputStream = Utils.getApp().getContentResolver().openInputStream(this.mContentUri);
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(Utils.getApp().getResources(), BitmapFactory.decodeStream(openInputStream));
                    try {
                        bitmapDrawable2.setBounds(0, 0, bitmapDrawable2.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicHeight());
                        if (openInputStream != null) {
                            openInputStream.close();
                        }
                        return bitmapDrawable2;
                    } catch (Exception e5) {
                        e = e5;
                        bitmapDrawable = bitmapDrawable2;
                        StringBuilder g5 = d.g("Failed to loaded content ");
                        g5.append(this.mContentUri);
                        Log.e("sms", g5.toString(), e);
                        return bitmapDrawable;
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } else {
                try {
                    drawable = ContextCompat.getDrawable(Utils.getApp(), this.mResourceId);
                    try {
                        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                        return drawable;
                    } catch (Exception unused) {
                        StringBuilder g6 = d.g("Unable to find resource: ");
                        g6.append(this.mResourceId);
                        Log.e("sms", g6.toString());
                        return drawable;
                    }
                } catch (Exception unused2) {
                    drawable = null;
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class CustomLineHeightSpan implements LineHeightSpan {
        public static final int ALIGN_CENTER = 2;
        public static final int ALIGN_TOP = 3;
        public static Paint.FontMetricsInt sfm;
        private final int height;
        public final int mVerticalAlignment;

        public CustomLineHeightSpan(int i5, int i6) {
            this.height = i5;
            this.mVerticalAlignment = i6;
        }

        @Override // android.text.style.LineHeightSpan
        public void chooseHeight(CharSequence charSequence, int i5, int i6, int i7, int i8, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = sfm;
            if (fontMetricsInt2 == null) {
                Paint.FontMetricsInt fontMetricsInt3 = new Paint.FontMetricsInt();
                sfm = fontMetricsInt3;
                fontMetricsInt3.top = fontMetricsInt.top;
                fontMetricsInt3.ascent = fontMetricsInt.ascent;
                fontMetricsInt3.descent = fontMetricsInt.descent;
                fontMetricsInt3.bottom = fontMetricsInt.bottom;
                fontMetricsInt3.leading = fontMetricsInt.leading;
            } else {
                fontMetricsInt.top = fontMetricsInt2.top;
                fontMetricsInt.ascent = fontMetricsInt2.ascent;
                fontMetricsInt.descent = fontMetricsInt2.descent;
                fontMetricsInt.bottom = fontMetricsInt2.bottom;
                fontMetricsInt.leading = fontMetricsInt2.leading;
            }
            int i9 = this.height;
            int i10 = fontMetricsInt.descent;
            int i11 = fontMetricsInt.ascent;
            int i12 = i9 - (((i8 + i10) - i11) - i7);
            if (i12 > 0) {
                int i13 = this.mVerticalAlignment;
                if (i13 == 3) {
                    fontMetricsInt.descent = i10 + i12;
                } else {
                    if (i13 == 2) {
                        i12 /= 2;
                        fontMetricsInt.descent = i10 + i12;
                    }
                    fontMetricsInt.ascent = i11 - i12;
                }
            }
            int i14 = fontMetricsInt.bottom;
            int i15 = fontMetricsInt.top;
            int i16 = i9 - (((i8 + i14) - i15) - i7);
            if (i16 > 0) {
                int i17 = this.mVerticalAlignment;
                if (i17 == 3) {
                    fontMetricsInt.bottom = i14 + i16;
                } else {
                    if (i17 == 2) {
                        i16 /= 2;
                        fontMetricsInt.bottom = i14 + i16;
                    }
                    fontMetricsInt.top = i15 - i16;
                }
            }
            if (i6 == ((Spanned) charSequence).getSpanEnd(this)) {
                sfm = null;
            }
        }
    }

    /* loaded from: classes18.dex */
    public static class CustomQuoteSpan implements LeadingMarginSpan {
        private final int color;
        private final int gapWidth;
        private final int stripeWidth;

        private CustomQuoteSpan(int i5, int i6, int i7) {
            this.color = i5;
            this.stripeWidth = i6;
            this.gapWidth = i7;
        }

        @Override // android.text.style.LeadingMarginSpan
        public void drawLeadingMargin(Canvas canvas, Paint paint, int i5, int i6, int i7, int i8, int i9, CharSequence charSequence, int i10, int i11, boolean z4, Layout layout) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.color);
            canvas.drawRect(i5, i7, (this.stripeWidth * i6) + i5, i9, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }

        @Override // android.text.style.LeadingMarginSpan
        public int getLeadingMargin(boolean z4) {
            return this.stripeWidth + this.gapWidth;
        }
    }

    @SuppressLint({"ParcelCreator"})
    /* loaded from: classes10.dex */
    public static class CustomTypefaceSpan extends TypefaceSpan {
        private final Typeface newType;

        private CustomTypefaceSpan(Typeface typeface) {
            super("");
            this.newType = typeface;
        }

        private void apply(Paint paint, Typeface typeface) {
            Typeface typeface2 = paint.getTypeface();
            int style = (typeface2 == null ? 0 : typeface2.getStyle()) & (~typeface.getStyle());
            if ((style & 1) != 0) {
                paint.setFakeBoldText(true);
            }
            if ((style & 2) != 0) {
                paint.setTextSkewX(-0.25f);
            }
            paint.getShader();
            paint.setTypeface(typeface);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }

        @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
        public void updateMeasureState(TextPaint textPaint) {
            apply(textPaint, this.newType);
        }
    }

    /* loaded from: classes5.dex */
    public static class SerializableSpannableStringBuilder extends SpannableStringBuilder implements Serializable {
        private static final long serialVersionUID = 4909567650765875771L;

        private SerializableSpannableStringBuilder() {
        }
    }

    public static class ShaderSpan extends CharacterStyle implements UpdateAppearance {
        private Shader mShader;

        private ShaderSpan(Shader shader) {
            this.mShader = shader;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShader(this.mShader);
        }
    }

    /* loaded from: classes16.dex */
    public static class ShadowSpan extends CharacterStyle implements UpdateAppearance {
        private float dx;
        private float dy;
        private float radius;
        private int shadowColor;

        private ShadowSpan(float f5, float f6, float f7, int i5) {
            this.radius = f5;
            this.dx = f6;
            this.dy = f7;
            this.shadowColor = i5;
        }

        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setShadowLayer(this.radius, this.dx, this.dy, this.shadowColor);
        }
    }

    /* loaded from: classes4.dex */
    public static class SpaceSpan extends ReplacementSpan {
        private final Paint paint;
        private final int width;

        private SpaceSpan(int i5) {
            this(i5, 0);
        }

        private SpaceSpan(int i5, int i6) {
            Paint paint = new Paint();
            this.paint = paint;
            this.width = i5;
            paint.setColor(i6);
            paint.setStyle(Paint.Style.FILL);
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, @IntRange(from = 0) int i5, @IntRange(from = 0) int i6, float f5, int i7, int i8, int i9, @NonNull Paint paint) {
            canvas.drawRect(f5, i7, f5 + this.width, i9, this.paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, @IntRange(from = 0) int i5, @IntRange(from = 0) int i6, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            return this.width;
        }
    }

    /* loaded from: classes23.dex */
    public static class VerticalAlignSpan extends ReplacementSpan {
        public static final int ALIGN_CENTER = 2;
        public static final int ALIGN_TOP = 3;
        public final int mVerticalAlignment;

        public VerticalAlignSpan(int i5) {
            this.mVerticalAlignment = i5;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(@NonNull Canvas canvas, CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, @NonNull Paint paint) {
            CharSequence subSequence = charSequence.subSequence(i5, i6);
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f5, i8 - (((((fontMetricsInt.descent + i8) + i8) + fontMetricsInt.ascent) / 2) - ((i9 + i7) / 2)), paint);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(@NonNull Paint paint, CharSequence charSequence, int i5, int i6, @Nullable Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence.subSequence(i5, i6).toString());
        }
    }

    public SpanUtils() {
        this.mTypeCharSequence = 0;
        this.mTypeImage = 1;
        this.mTypeSpace = 2;
        this.mBuilder = new SerializableSpannableStringBuilder();
        this.mText = "";
        this.mType = -1;
        setDefault();
    }

    private SpanUtils(TextView textView) {
        this();
        this.mTextView = textView;
    }

    private void apply(int i5) {
        applyLast();
        this.mType = i5;
    }

    private void applyLast() {
        if (this.isCreated) {
            return;
        }
        int i5 = this.mType;
        if (i5 == 0) {
            updateCharCharSequence();
        } else if (i5 == 1) {
            updateImage();
        } else if (i5 == 2) {
            updateSpace();
        }
        setDefault();
    }

    private void setDefault() {
        this.flag = 33;
        this.foregroundColor = COLOR_DEFAULT;
        this.backgroundColor = COLOR_DEFAULT;
        this.lineHeight = -1;
        this.quoteColor = COLOR_DEFAULT;
        this.first = -1;
        this.bulletColor = COLOR_DEFAULT;
        this.fontSize = -1;
        this.proportion = -1.0f;
        this.xProportion = -1.0f;
        this.isStrikethrough = false;
        this.isUnderline = false;
        this.isSuperscript = false;
        this.isSubscript = false;
        this.isBold = false;
        this.isItalic = false;
        this.isBoldItalic = false;
        this.fontFamily = null;
        this.typeface = null;
        this.alignment = null;
        this.verticalAlign = -1;
        this.clickSpan = null;
        this.url = null;
        this.blurRadius = -1.0f;
        this.shader = null;
        this.shadowRadius = -1.0f;
        this.spans = null;
        this.imageBitmap = null;
        this.imageDrawable = null;
        this.imageUri = null;
        this.imageResourceId = -1;
        this.spaceSize = -1;
    }

    private void setMovementMethodIfNeed() {
        TextView textView = this.mTextView;
        if (textView == null || textView.getMovementMethod() != null) {
            return;
        }
        this.mTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void updateCharCharSequence() {
        if (this.mText.length() == 0) {
            return;
        }
        int length = this.mBuilder.length();
        if (length == 0 && this.lineHeight != -1) {
            this.mBuilder.append((CharSequence) Character.toString((char) 2)).append((CharSequence) "\n").setSpan(new AbsoluteSizeSpan(0), 0, 2, 33);
            length = 2;
        }
        this.mBuilder.append(this.mText);
        int length2 = this.mBuilder.length();
        if (this.verticalAlign != -1) {
            this.mBuilder.setSpan(new VerticalAlignSpan(this.verticalAlign), length, length2, this.flag);
        }
        if (this.foregroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new ForegroundColorSpan(this.foregroundColor), length, length2, this.flag);
        }
        if (this.backgroundColor != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new BackgroundColorSpan(this.backgroundColor), length, length2, this.flag);
        }
        if (this.first != -1) {
            this.mBuilder.setSpan(new LeadingMarginSpan.Standard(this.first, this.rest), length, length2, this.flag);
        }
        int i5 = this.quoteColor;
        if (i5 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomQuoteSpan(i5, this.stripeWidth, this.quoteGapWidth), length, length2, this.flag);
        }
        int i6 = this.bulletColor;
        if (i6 != COLOR_DEFAULT) {
            this.mBuilder.setSpan(new CustomBulletSpan(i6, this.bulletRadius, this.bulletGapWidth), length, length2, this.flag);
        }
        if (this.fontSize != -1) {
            this.mBuilder.setSpan(new AbsoluteSizeSpan(this.fontSize, false), length, length2, this.flag);
        }
        if (this.proportion != -1.0f) {
            this.mBuilder.setSpan(new RelativeSizeSpan(this.proportion), length, length2, this.flag);
        }
        if (this.xProportion != -1.0f) {
            this.mBuilder.setSpan(new ScaleXSpan(this.xProportion), length, length2, this.flag);
        }
        int i7 = this.lineHeight;
        if (i7 != -1) {
            this.mBuilder.setSpan(new CustomLineHeightSpan(i7, this.alignLine), length, length2, this.flag);
        }
        if (this.isStrikethrough) {
            this.mBuilder.setSpan(new StrikethroughSpan(), length, length2, this.flag);
        }
        if (this.isUnderline) {
            this.mBuilder.setSpan(new UnderlineSpan(), length, length2, this.flag);
        }
        if (this.isSuperscript) {
            this.mBuilder.setSpan(new SuperscriptSpan(), length, length2, this.flag);
        }
        if (this.isSubscript) {
            this.mBuilder.setSpan(new SubscriptSpan(), length, length2, this.flag);
        }
        if (this.isBold) {
            this.mBuilder.setSpan(new StyleSpan(1), length, length2, this.flag);
        }
        if (this.isItalic) {
            this.mBuilder.setSpan(new StyleSpan(2), length, length2, this.flag);
        }
        if (this.isBoldItalic) {
            this.mBuilder.setSpan(new StyleSpan(3), length, length2, this.flag);
        }
        if (this.fontFamily != null) {
            this.mBuilder.setSpan(new TypefaceSpan(this.fontFamily), length, length2, this.flag);
        }
        if (this.typeface != null) {
            this.mBuilder.setSpan(new CustomTypefaceSpan(this.typeface), length, length2, this.flag);
        }
        if (this.alignment != null) {
            this.mBuilder.setSpan(new AlignmentSpan.Standard(this.alignment), length, length2, this.flag);
        }
        ClickableSpan clickableSpan = this.clickSpan;
        if (clickableSpan != null) {
            this.mBuilder.setSpan(clickableSpan, length, length2, this.flag);
        }
        if (this.url != null) {
            this.mBuilder.setSpan(new URLSpan(this.url), length, length2, this.flag);
        }
        if (this.blurRadius != -1.0f) {
            this.mBuilder.setSpan(new MaskFilterSpan(new BlurMaskFilter(this.blurRadius, this.style)), length, length2, this.flag);
        }
        if (this.shader != null) {
            this.mBuilder.setSpan(new ShaderSpan(this.shader), length, length2, this.flag);
        }
        if (this.shadowRadius != -1.0f) {
            this.mBuilder.setSpan(new ShadowSpan(this.shadowRadius, this.shadowDx, this.shadowDy, this.shadowColor), length, length2, this.flag);
        }
        Object[] objArr = this.spans;
        if (objArr != null) {
            for (Object obj : objArr) {
                this.mBuilder.setSpan(obj, length, length2, this.flag);
            }
        }
    }

    private void updateImage() {
        SerializableSpannableStringBuilder serializableSpannableStringBuilder;
        CustomImageSpan customImageSpan;
        int length = this.mBuilder.length();
        this.mText = "<img>";
        updateCharCharSequence();
        int length2 = this.mBuilder.length();
        if (this.imageBitmap != null) {
            serializableSpannableStringBuilder = this.mBuilder;
            customImageSpan = new CustomImageSpan(this.imageBitmap, this.alignImage);
        } else if (this.imageDrawable != null) {
            serializableSpannableStringBuilder = this.mBuilder;
            customImageSpan = new CustomImageSpan(this.imageDrawable, this.alignImage);
        } else if (this.imageUri != null) {
            serializableSpannableStringBuilder = this.mBuilder;
            customImageSpan = new CustomImageSpan(this.imageUri, this.alignImage);
        } else {
            if (this.imageResourceId == -1) {
                return;
            }
            serializableSpannableStringBuilder = this.mBuilder;
            customImageSpan = new CustomImageSpan(this.imageResourceId, this.alignImage);
        }
        serializableSpannableStringBuilder.setSpan(customImageSpan, length, length2, this.flag);
    }

    private void updateSpace() {
        int length = this.mBuilder.length();
        this.mText = "< >";
        updateCharCharSequence();
        this.mBuilder.setSpan(new SpaceSpan(this.spaceSize, this.spaceColor), length, this.mBuilder.length(), this.flag);
    }

    public static SpanUtils with(TextView textView) {
        return new SpanUtils(textView);
    }

    public SpanUtils append(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = charSequence;
        return this;
    }

    public SpanUtils appendImage(@DrawableRes int i5) {
        return appendImage(i5, 0);
    }

    public SpanUtils appendImage(@DrawableRes int i5, int i6) {
        apply(1);
        this.imageResourceId = i5;
        this.alignImage = i6;
        return this;
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap) {
        return appendImage(bitmap, 0);
    }

    public SpanUtils appendImage(@NonNull Bitmap bitmap, int i5) {
        apply(1);
        this.imageBitmap = bitmap;
        this.alignImage = i5;
        return this;
    }

    public SpanUtils appendImage(@NonNull Drawable drawable) {
        return appendImage(drawable, 0);
    }

    public SpanUtils appendImage(@NonNull Drawable drawable, int i5) {
        apply(1);
        this.imageDrawable = drawable;
        this.alignImage = i5;
        return this;
    }

    public SpanUtils appendImage(@NonNull Uri uri) {
        return appendImage(uri, 0);
    }

    public SpanUtils appendImage(@NonNull Uri uri, int i5) {
        apply(1);
        this.imageUri = uri;
        this.alignImage = i5;
        return this;
    }

    public SpanUtils appendLine() {
        apply(0);
        this.mText = LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendLine(@NonNull CharSequence charSequence) {
        apply(0);
        this.mText = ((Object) charSequence) + LINE_SEPARATOR;
        return this;
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i5) {
        return appendSpace(i5, 0);
    }

    public SpanUtils appendSpace(@IntRange(from = 0) int i5, @ColorInt int i6) {
        apply(2);
        this.spaceSize = i5;
        this.spaceColor = i6;
        return this;
    }

    public SpannableStringBuilder create() {
        applyLast();
        TextView textView = this.mTextView;
        if (textView != null) {
            textView.setText(this.mBuilder);
        }
        this.isCreated = true;
        return this.mBuilder;
    }

    public SpannableStringBuilder get() {
        return this.mBuilder;
    }

    public SpanUtils setBackgroundColor(@ColorInt int i5) {
        this.backgroundColor = i5;
        return this;
    }

    public SpanUtils setBlur(@FloatRange(from = 0.0d, fromInclusive = false) float f5, BlurMaskFilter.Blur blur) {
        this.blurRadius = f5;
        this.style = blur;
        return this;
    }

    public SpanUtils setBold() {
        this.isBold = true;
        return this;
    }

    public SpanUtils setBoldItalic() {
        this.isBoldItalic = true;
        return this;
    }

    public SpanUtils setBullet(@IntRange(from = 0) int i5) {
        return setBullet(0, 3, i5);
    }

    public SpanUtils setBullet(@ColorInt int i5, @IntRange(from = 0) int i6, @IntRange(from = 0) int i7) {
        this.bulletColor = i5;
        this.bulletRadius = i6;
        this.bulletGapWidth = i7;
        return this;
    }

    public SpanUtils setClickSpan(@ColorInt final int i5, final boolean z4, final View.OnClickListener onClickListener) {
        setMovementMethodIfNeed();
        this.clickSpan = new ClickableSpan() { // from class: com.blankj.utilcode.util.SpanUtils.1
            @Override // android.text.style.ClickableSpan
            public void onClick(@NonNull View view) {
                View.OnClickListener onClickListener2 = onClickListener;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(@NonNull TextPaint textPaint) {
                textPaint.setColor(i5);
                textPaint.setUnderlineText(z4);
            }
        };
        return this;
    }

    public SpanUtils setClickSpan(@NonNull ClickableSpan clickableSpan) {
        setMovementMethodIfNeed();
        this.clickSpan = clickableSpan;
        return this;
    }

    public SpanUtils setFlag(int i5) {
        this.flag = i5;
        return this;
    }

    public SpanUtils setFontFamily(@NonNull String str) {
        this.fontFamily = str;
        return this;
    }

    public SpanUtils setFontProportion(float f5) {
        this.proportion = f5;
        return this;
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i5) {
        return setFontSize(i5, false);
    }

    public SpanUtils setFontSize(@IntRange(from = 0) int i5, boolean z4) {
        if (z4) {
            i5 = (int) ((i5 * Resources.getSystem().getDisplayMetrics().scaledDensity) + 0.5f);
        }
        this.fontSize = i5;
        return this;
    }

    public SpanUtils setFontXProportion(float f5) {
        this.xProportion = f5;
        return this;
    }

    public SpanUtils setForegroundColor(@ColorInt int i5) {
        this.foregroundColor = i5;
        return this;
    }

    public SpanUtils setHorizontalAlign(@NonNull Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public SpanUtils setItalic() {
        this.isItalic = true;
        return this;
    }

    public SpanUtils setLeadingMargin(@IntRange(from = 0) int i5, @IntRange(from = 0) int i6) {
        this.first = i5;
        this.rest = i6;
        return this;
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i5) {
        return setLineHeight(i5, 2);
    }

    public SpanUtils setLineHeight(@IntRange(from = 0) int i5, int i6) {
        this.lineHeight = i5;
        this.alignLine = i6;
        return this;
    }

    public SpanUtils setQuoteColor(@ColorInt int i5) {
        return setQuoteColor(i5, 2, 2);
    }

    public SpanUtils setQuoteColor(@ColorInt int i5, @IntRange(from = 1) int i6, @IntRange(from = 0) int i7) {
        this.quoteColor = i5;
        this.stripeWidth = i6;
        this.quoteGapWidth = i7;
        return this;
    }

    public SpanUtils setShader(@NonNull Shader shader) {
        this.shader = shader;
        return this;
    }

    public SpanUtils setShadow(@FloatRange(from = 0.0d, fromInclusive = false) float f5, float f6, float f7, int i5) {
        this.shadowRadius = f5;
        this.shadowDx = f6;
        this.shadowDy = f7;
        this.shadowColor = i5;
        return this;
    }

    public SpanUtils setSpans(@NonNull Object... objArr) {
        if (objArr.length > 0) {
            this.spans = objArr;
        }
        return this;
    }

    public SpanUtils setStrikethrough() {
        this.isStrikethrough = true;
        return this;
    }

    public SpanUtils setSubscript() {
        this.isSubscript = true;
        return this;
    }

    public SpanUtils setSuperscript() {
        this.isSuperscript = true;
        return this;
    }

    public SpanUtils setTypeface(@NonNull Typeface typeface) {
        this.typeface = typeface;
        return this;
    }

    public SpanUtils setUnderline() {
        this.isUnderline = true;
        return this;
    }

    public SpanUtils setUrl(@NonNull String str) {
        setMovementMethodIfNeed();
        this.url = str;
        return this;
    }

    public SpanUtils setVerticalAlign(int i5) {
        this.verticalAlign = i5;
        return this;
    }
}
