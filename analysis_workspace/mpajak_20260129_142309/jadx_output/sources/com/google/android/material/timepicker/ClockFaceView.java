package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.timepicker.ClockHandView;
import comeliest.metempsychosis.pokelogan.R;
import i.g;
import java.util.Arrays;

/* loaded from: classes2.dex */
class ClockFaceView extends com.google.android.material.timepicker.a implements ClockHandView.a {

    /* renamed from: e, reason: collision with root package name */
    public final ClockHandView f1299e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1300f;

    /* renamed from: g, reason: collision with root package name */
    public final RectF f1301g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray<TextView> f1302h;

    /* renamed from: i, reason: collision with root package name */
    public final b f1303i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f1304j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1305k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1306l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1307m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1308n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1309o;

    /* renamed from: p, reason: collision with root package name */
    public String[] f1310p;

    /* renamed from: q, reason: collision with root package name */
    public float f1311q;

    /* renamed from: r, reason: collision with root package name */
    public final ColorStateList f1312r;

    /* loaded from: classes19.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            int height = ClockFaceView.this.getHeight() / 2;
            ClockFaceView clockFaceView = ClockFaceView.this;
            int i5 = (height - clockFaceView.f1299e.f1320g) - clockFaceView.f1306l;
            if (i5 != clockFaceView.f1335c) {
                clockFaceView.f1335c = i5;
                clockFaceView.b();
                ClockHandView clockHandView = clockFaceView.f1299e;
                clockHandView.f1328o = clockFaceView.f1335c;
                clockHandView.invalidate();
            }
            return true;
        }
    }

    /* loaded from: classes7.dex */
    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                accessibilityNodeInfoCompat.setTraversalAfter(ClockFaceView.this.f1302h.get(intValue - 1));
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, intValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            if (i5 != 16) {
                return super.performAccessibilityAction(view, i5, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            float x4 = view.getX() + (view.getWidth() / 2.0f);
            float height = (view.getHeight() / 2.0f) + view.getY();
            ClockFaceView.this.f1299e.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x4, height, 0));
            ClockFaceView.this.f1299e.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x4, height, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<com.google.android.material.timepicker.ClockHandView$a>] */
    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i5) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f1300f = new Rect();
        this.f1301g = new RectF();
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f1302h = sparseArray;
        this.f1305k = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3203i, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a5 = y1.c.a(context, obtainStyledAttributes, 1);
        this.f1312r = a5;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f1299e = clockHandView;
        this.f1306l = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a5.getColorForState(new int[]{android.R.attr.state_selected}, a5.getDefaultColor());
        this.f1304j = new int[]{colorForState, colorForState, a5.getDefaultColor()};
        clockHandView.f1319f.add(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a6 = y1.c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a6 != null ? a6.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f1303i = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f1310p = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i6 = 0; i6 < Math.max(this.f1310p.length, size); i6++) {
            TextView textView = this.f1302h.get(i6);
            if (i6 >= this.f1310p.length) {
                removeView(textView);
                this.f1302h.remove(i6);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.f1302h.put(i6, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f1310p[i6]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i6));
                ViewCompat.setAccessibilityDelegate(textView, this.f1303i);
                textView.setTextColor(this.f1312r);
            }
        }
        this.f1307m = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f1308n = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f1309o = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.a
    public final void a(float f5) {
        if (Math.abs(this.f1311q - f5) > 0.001f) {
            this.f1311q = f5;
            c();
        }
    }

    public final void c() {
        RectF rectF = this.f1299e.f1323j;
        for (int i5 = 0; i5 < this.f1302h.size(); i5++) {
            TextView textView = this.f1302h.get(i5);
            if (textView != null) {
                textView.getDrawingRect(this.f1300f);
                offsetDescendantRectToMyCoords(textView, this.f1300f);
                textView.setSelected(rectF.contains(this.f1300f.centerX(), this.f1300f.centerY()));
                this.f1301g.set(this.f1300f);
                this.f1301g.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f1301g) ? null : new RadialGradient(rectF.centerX() - this.f1301g.left, rectF.centerY() - this.f1301g.top, 0.5f * rectF.width(), this.f1304j, this.f1305k, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f1310p.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        super.onLayout(z4, i5, i6, i7, i8);
        c();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i5, int i6) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f1309o / Math.max(Math.max(this.f1307m / displayMetrics.heightPixels, this.f1308n / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
