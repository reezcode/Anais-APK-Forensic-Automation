package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.activity.d;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.a;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes9.dex */
public class PathInterpolatorCompat implements Interpolator {
    public static final double EPSILON = 1.0E-5d;
    public static final int MAX_NUM_POINTS = 3000;
    private static final float PRECISION = 0.002f;
    private float[] mX;
    private float[] mY;

    public PathInterpolatorCompat(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public PathInterpolatorCompat(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_PATH_INTERPOLATOR);
        parseInterpolatorFromTypeArray(obtainAttributes, xmlPullParser);
        obtainAttributes.recycle();
    }

    private void initCubic(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f5, f6, f7, f8, 1.0f, 1.0f);
        initPath(path);
    }

    private void initPath(Path path) {
        int i5 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(MAX_NUM_POINTS, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.mX = new float[min];
        this.mY = new float[min];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < min; i6++) {
            pathMeasure.getPosTan((i6 * length) / (min - 1), fArr, null);
            this.mX[i6] = fArr[0];
            this.mY[i6] = fArr[1];
        }
        if (Math.abs(this.mX[0]) <= 1.0E-5d && Math.abs(this.mY[0]) <= 1.0E-5d) {
            int i7 = min - 1;
            if (Math.abs(this.mX[i7] - 1.0f) <= 1.0E-5d && Math.abs(this.mY[i7] - 1.0f) <= 1.0E-5d) {
                float f5 = 0.0f;
                int i8 = 0;
                while (i5 < min) {
                    float[] fArr2 = this.mX;
                    int i9 = i8 + 1;
                    float f6 = fArr2[i8];
                    if (f6 < f5) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f6);
                    }
                    fArr2[i5] = f6;
                    i5++;
                    f5 = f6;
                    i8 = i9;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder g5 = d.g("The Path must start at (0,0) and end at (1,1) start: ");
        g5.append(this.mX[0]);
        g5.append(",");
        g5.append(this.mY[0]);
        g5.append(" end:");
        int i10 = min - 1;
        g5.append(this.mX[i10]);
        g5.append(",");
        g5.append(this.mY[i10]);
        throw new IllegalArgumentException(g5.toString());
    }

    private void initQuad(float f5, float f6) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f5, f6, 1.0f, 1.0f);
        initPath(path);
    }

    private void parseInterpolatorFromTypeArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
            String namedString = TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 4);
            Path createPathFromPathData = PathParser.createPathFromPathData(namedString);
            if (createPathFromPathData == null) {
                throw new InflateException(d.f("The path is null, which is created from ", namedString));
            }
            initPath(createPathFromPathData);
            return;
        }
        if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!TypedArrayUtils.hasAttribute(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float namedFloat2 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean hasAttribute = TypedArrayUtils.hasAttribute(xmlPullParser, "controlX2");
        if (hasAttribute != TypedArrayUtils.hasAttribute(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (hasAttribute) {
            initCubic(namedFloat, namedFloat2, TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlX2", 2, 0.0f), TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            initQuad(namedFloat, namedFloat2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        int i5 = 0;
        int length = this.mX.length - 1;
        while (length - i5 > 1) {
            int i6 = (i5 + length) / 2;
            if (f5 < this.mX[i6]) {
                length = i6;
            } else {
                i5 = i6;
            }
        }
        float[] fArr = this.mX;
        float f6 = fArr[length] - fArr[i5];
        if (f6 == 0.0f) {
            return this.mY[i5];
        }
        float f7 = (f5 - fArr[i5]) / f6;
        float[] fArr2 = this.mY;
        float f8 = fArr2[i5];
        return a.a(fArr2[length], f8, f7, f8);
    }
}
