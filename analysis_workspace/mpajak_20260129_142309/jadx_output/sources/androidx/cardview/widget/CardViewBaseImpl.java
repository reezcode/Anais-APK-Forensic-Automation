package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import androidx.cardview.widget.RoundRectDrawableWithShadow;

/* loaded from: classes2.dex */
class CardViewBaseImpl implements CardViewImpl {
    public final RectF mCornerRect = new RectF();

    private RoundRectDrawableWithShadow createBackground(Context context, ColorStateList colorStateList, float f5, float f6, float f7) {
        return new RoundRectDrawableWithShadow(context.getResources(), colorStateList, f5, f6, f7);
    }

    private RoundRectDrawableWithShadow getShadowBackground(CardViewDelegate cardViewDelegate) {
        return (RoundRectDrawableWithShadow) cardViewDelegate.getCardBackground();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public ColorStateList getBackgroundColor(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getColor();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getShadowSize();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMaxElevation(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMaxShadowSize();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinHeight(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinHeight();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinWidth(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinWidth();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getRadius(CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getCornerRadius();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
        RoundRectDrawableWithShadow.sRoundRectHelper = new RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewBaseImpl.1
            @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(Canvas canvas, RectF rectF, float f5, Paint paint) {
                float f6 = 2.0f * f5;
                float width = (rectF.width() - f6) - 1.0f;
                float height = (rectF.height() - f6) - 1.0f;
                if (f5 >= 1.0f) {
                    float f7 = f5 + 0.5f;
                    float f8 = -f7;
                    CardViewBaseImpl.this.mCornerRect.set(f8, f8, f7, f7);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f7, rectF.top + f7);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    float f9 = (rectF.left + f7) - 1.0f;
                    float f10 = rectF.top;
                    canvas.drawRect(f9, f10, (rectF.right - f7) + 1.0f, f10 + f7, paint);
                    float f11 = (rectF.left + f7) - 1.0f;
                    float f12 = rectF.bottom;
                    canvas.drawRect(f11, f12 - f7, (rectF.right - f7) + 1.0f, f12, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f5, rectF.right, rectF.bottom - f5, paint);
            }
        };
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initialize(CardViewDelegate cardViewDelegate, Context context, ColorStateList colorStateList, float f5, float f6, float f7) {
        RoundRectDrawableWithShadow createBackground = createBackground(context, colorStateList, f5, f6, f7);
        createBackground.setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        cardViewDelegate.setCardBackground(createBackground);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onCompatPaddingChanged(CardViewDelegate cardViewDelegate) {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onPreventCornerOverlapChanged(CardViewDelegate cardViewDelegate) {
        getShadowBackground(cardViewDelegate).setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setBackgroundColor(CardViewDelegate cardViewDelegate, @Nullable ColorStateList colorStateList) {
        getShadowBackground(cardViewDelegate).setColor(colorStateList);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setElevation(CardViewDelegate cardViewDelegate, float f5) {
        getShadowBackground(cardViewDelegate).setShadowSize(f5);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setMaxElevation(CardViewDelegate cardViewDelegate, float f5) {
        getShadowBackground(cardViewDelegate).setMaxShadowSize(f5);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setRadius(CardViewDelegate cardViewDelegate, float f5) {
        getShadowBackground(cardViewDelegate).setCornerRadius(f5);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void updatePadding(CardViewDelegate cardViewDelegate) {
        Rect rect = new Rect();
        getShadowBackground(cardViewDelegate).getMaxShadowAndCornerPadding(rect);
        cardViewDelegate.setMinWidthHeightInternal((int) Math.ceil(getMinWidth(cardViewDelegate)), (int) Math.ceil(getMinHeight(cardViewDelegate)));
        cardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
