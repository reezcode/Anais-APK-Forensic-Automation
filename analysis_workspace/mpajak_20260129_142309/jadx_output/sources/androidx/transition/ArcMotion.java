package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.graphics.drawable.a;
import androidx.core.content.res.TypedArrayUtils;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes17.dex */
public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = (float) Math.tan(Math.toRadians(35.0d));
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private float mMaximumAngle;
    private float mMaximumTangent;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public ArcMotion() {
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMinimumHorizontalAngle = 0.0f;
        this.mMinimumVerticalAngle = 0.0f;
        this.mMaximumAngle = DEFAULT_MAX_ANGLE_DEGREES;
        this.mMinimumHorizontalTangent = 0.0f;
        this.mMinimumVerticalTangent = 0.0f;
        this.mMaximumTangent = DEFAULT_MAX_TANGENT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.ARC_MOTION);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, DEFAULT_MAX_ANGLE_DEGREES));
        obtainStyledAttributes.recycle();
    }

    private static float toTangent(float f5) {
        if (f5 < 0.0f || f5 > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f5 / 2.0f));
    }

    public float getMaximumAngle() {
        return this.mMaximumAngle;
    }

    public float getMinimumHorizontalAngle() {
        return this.mMinimumHorizontalAngle;
    }

    public float getMinimumVerticalAngle() {
        return this.mMinimumVerticalAngle;
    }

    @Override // androidx.transition.PathMotion
    public Path getPath(float f5, float f6, float f7, float f8) {
        float f9;
        float f10;
        float f11;
        Path path = new Path();
        path.moveTo(f5, f6);
        float f12 = f7 - f5;
        float f13 = f8 - f6;
        float f14 = (f13 * f13) + (f12 * f12);
        float f15 = (f5 + f7) / 2.0f;
        float f16 = (f6 + f8) / 2.0f;
        float f17 = 0.25f * f14;
        boolean z4 = f6 > f8;
        if (Math.abs(f12) < Math.abs(f13)) {
            float abs = Math.abs(f14 / (f13 * 2.0f));
            if (z4) {
                f10 = abs + f8;
                f9 = f7;
            } else {
                f10 = abs + f6;
                f9 = f5;
            }
            f11 = this.mMinimumVerticalTangent;
        } else {
            float f18 = f14 / (f12 * 2.0f);
            if (z4) {
                f10 = f6;
                f9 = f18 + f5;
            } else {
                f9 = f7 - f18;
                f10 = f8;
            }
            f11 = this.mMinimumHorizontalTangent;
        }
        float f19 = f17 * f11 * f11;
        float f20 = f15 - f9;
        float f21 = f16 - f10;
        float f22 = (f21 * f21) + (f20 * f20);
        float f23 = this.mMaximumTangent;
        float f24 = f17 * f23 * f23;
        if (f22 >= f19) {
            f19 = f22 > f24 ? f24 : 0.0f;
        }
        if (f19 != 0.0f) {
            float sqrt = (float) Math.sqrt(f19 / f22);
            f9 = a.a(f9, f15, sqrt, f15);
            f10 = a.a(f10, f16, sqrt, f16);
        }
        path.cubicTo((f5 + f9) / 2.0f, (f6 + f10) / 2.0f, (f9 + f7) / 2.0f, (f10 + f8) / 2.0f, f7, f8);
        return path;
    }

    public void setMaximumAngle(float f5) {
        this.mMaximumAngle = f5;
        this.mMaximumTangent = toTangent(f5);
    }

    public void setMinimumHorizontalAngle(float f5) {
        this.mMinimumHorizontalAngle = f5;
        this.mMinimumHorizontalTangent = toTangent(f5);
    }

    public void setMinimumVerticalAngle(float f5) {
        this.mMinimumVerticalAngle = f5;
        this.mMinimumVerticalTangent = toTangent(f5);
    }
}
