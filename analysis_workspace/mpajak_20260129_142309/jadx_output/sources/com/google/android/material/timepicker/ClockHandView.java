package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import comeliest.metempsychosis.pokelogan.R;
import i.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes18.dex */
class ClockHandView extends View {

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f1315b;

    /* renamed from: c, reason: collision with root package name */
    public float f1316c;

    /* renamed from: d, reason: collision with root package name */
    public float f1317d;

    /* renamed from: e, reason: collision with root package name */
    public int f1318e;

    /* renamed from: f, reason: collision with root package name */
    public final List<a> f1319f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1320g;

    /* renamed from: h, reason: collision with root package name */
    public final float f1321h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f1322i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f1323j;

    /* renamed from: k, reason: collision with root package name */
    @Px
    public final int f1324k;

    /* renamed from: l, reason: collision with root package name */
    public float f1325l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1326m;

    /* renamed from: n, reason: collision with root package name */
    public double f1327n;

    /* renamed from: o, reason: collision with root package name */
    public int f1328o;

    /* loaded from: classes15.dex */
    public interface a {
        void a(@FloatRange(from = 0.0d, to = 360.0d) float f5);
    }

    public ClockHandView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f1319f = new ArrayList();
        Paint paint = new Paint();
        this.f1322i = paint;
        this.f1323j = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3204j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f1328o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f1320g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f1324k = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f1321h = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        this.f1318e = ViewConfiguration.get(context).getScaledTouchSlop();
        ViewCompat.setImportantForAccessibility(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f5, float f6) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f6 - (getHeight() / 2), f5 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public final void b(@FloatRange(from = 0.0d, to = 360.0d) float f5) {
        ValueAnimator valueAnimator = this.f1315b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f5, false);
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList, java.util.List<com.google.android.material.timepicker.ClockHandView$a>] */
    public final void c(@FloatRange(from = 0.0d, to = 360.0d) float f5, boolean z4) {
        float f6 = f5 % 360.0f;
        this.f1325l = f6;
        this.f1327n = Math.toRadians(f6 - 90.0f);
        int height = getHeight() / 2;
        float cos = (this.f1328o * ((float) Math.cos(this.f1327n))) + (getWidth() / 2);
        float sin = (this.f1328o * ((float) Math.sin(this.f1327n))) + height;
        RectF rectF = this.f1323j;
        float f7 = this.f1320g;
        rectF.set(cos - f7, sin - f7, cos + f7, sin + f7);
        Iterator it = this.f1319f.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f6);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f1328o * ((float) Math.cos(this.f1327n))) + width;
        float f5 = height;
        float sin = (this.f1328o * ((float) Math.sin(this.f1327n))) + f5;
        this.f1322i.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f1320g, this.f1322i);
        double sin2 = Math.sin(this.f1327n);
        double cos2 = Math.cos(this.f1327n);
        this.f1322i.setStrokeWidth(this.f1324k);
        canvas.drawLine(width, f5, r1 + ((int) (cos2 * r6)), height + ((int) (r6 * sin2)), this.f1322i);
        canvas.drawCircle(width, f5, this.f1321h, this.f1322i);
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        b(this.f1325l);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        boolean z6 = false;
        if (actionMasked != 0) {
            z4 = (actionMasked == 1 || actionMasked == 2) ? this.f1326m : false;
            z5 = false;
        } else {
            this.f1316c = x4;
            this.f1317d = y4;
            this.f1326m = false;
            z4 = false;
            z5 = true;
        }
        boolean z7 = this.f1326m;
        float a5 = a(x4, y4);
        boolean z8 = this.f1325l != a5;
        if (!z5 || !z8) {
            if (z8 || z4) {
                b(a5);
            }
            this.f1326m = z7 | z6;
            return true;
        }
        z6 = true;
        this.f1326m = z7 | z6;
        return true;
    }
}
