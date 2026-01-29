package com.tencent.smtt.sdk.ui.dialog.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.smtt.sdk.ui.dialog.a;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class RoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Paint f2257a;

    /* renamed from: b, reason: collision with root package name */
    private Xfermode f2258b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f2259c;

    /* renamed from: d, reason: collision with root package name */
    private float[] f2260d;

    /* renamed from: e, reason: collision with root package name */
    private RectF f2261e;

    /* renamed from: f, reason: collision with root package name */
    private int f2262f;

    /* renamed from: g, reason: collision with root package name */
    private WeakReference<Bitmap> f2263g;

    /* renamed from: h, reason: collision with root package name */
    private float f2264h;

    /* renamed from: i, reason: collision with root package name */
    private Path f2265i;

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2258b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        this.f2262f = Color.parseColor("#eaeaea");
        Paint paint = new Paint();
        this.f2257a = paint;
        paint.setAntiAlias(true);
        this.f2265i = new Path();
        this.f2260d = new float[8];
        this.f2261e = new RectF();
        this.f2264h = a.a(context, 16.46f);
        int i5 = 0;
        while (true) {
            float[] fArr = this.f2260d;
            if (i5 >= fArr.length) {
                return;
            }
            fArr[i5] = this.f2264h;
            i5++;
        }
    }

    private Bitmap a() {
        Bitmap bitmap = null;
        try {
            bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint(1);
            paint.setColor(-16777216);
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f5 = this.f2264h;
            canvas.drawRoundRect(rectF, f5, f5, paint);
            return bitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return bitmap;
        }
    }

    private void a(int i5, int i6) {
        this.f2265i.reset();
        this.f2257a.setStrokeWidth(i5);
        this.f2257a.setColor(i6);
        this.f2257a.setStyle(Paint.Style.STROKE);
    }

    private void a(Canvas canvas, int i5, int i6, RectF rectF, float[] fArr) {
        a(i5, i6);
        this.f2265i.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.f2265i, this.f2257a);
    }

    @Override // android.view.View
    public void invalidate() {
        this.f2263g = null;
        Bitmap bitmap = this.f2259c;
        if (bitmap != null) {
            bitmap.recycle();
            this.f2259c = null;
        }
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        WeakReference<Bitmap> weakReference = this.f2263g;
        Bitmap bitmap = weakReference == null ? null : weakReference.get();
        if (bitmap == null || bitmap.isRecycled()) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f5 = intrinsicWidth;
                float f6 = intrinsicHeight;
                float max = Math.max((getWidth() * 1.0f) / f5, (getHeight() * 1.0f) / f6);
                drawable.setBounds(0, 0, (int) (f5 * max), (int) (max * f6));
                drawable.draw(canvas2);
                Bitmap bitmap2 = this.f2259c;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    this.f2259c = a();
                }
                this.f2257a.reset();
                this.f2257a.setFilterBitmap(false);
                this.f2257a.setXfermode(this.f2258b);
                Bitmap bitmap3 = this.f2259c;
                if (bitmap3 != null) {
                    canvas2.drawBitmap(bitmap3, 0.0f, 0.0f, this.f2257a);
                }
                this.f2257a.setXfermode(null);
                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                this.f2263g = new WeakReference<>(createBitmap);
            }
        } else {
            this.f2257a.setXfermode(null);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f2257a);
        }
        a(canvas, 1, this.f2262f, this.f2261e, this.f2260d);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
    }

    @Override // android.view.View
    public void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        this.f2261e.set(0.5f, 0.5f, i5 - 0.5f, i6 - 0.5f);
    }
}
