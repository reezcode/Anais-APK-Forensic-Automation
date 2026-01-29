package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import androidx.appcompat.graphics.drawable.a;

/* loaded from: classes10.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;
    private final float[] mX;
    private final float[] mY;

    public PathInterpolatorApi14(float f5, float f6) {
        this(createQuad(f5, f6));
    }

    public PathInterpolatorApi14(float f5, float f6, float f7, float f8) {
        this(createCubic(f5, f6, f7, f8));
    }

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i5 = ((int) (length / 0.002f)) + 1;
        this.mX = new float[i5];
        this.mY = new float[i5];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < i5; i6++) {
            pathMeasure.getPosTan((i6 * length) / (i5 - 1), fArr, null);
            this.mX[i6] = fArr[0];
            this.mY[i6] = fArr[1];
        }
    }

    private static Path createCubic(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f5, f6, f7, f8, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f5, float f6) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f5, f6, 1.0f, 1.0f);
        return path;
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
