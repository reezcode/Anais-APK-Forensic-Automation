package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* loaded from: classes20.dex */
class MatrixUtils {
    public static final Matrix IDENTITY_MATRIX = new Matrix() { // from class: androidx.transition.MatrixUtils.1
        public void oops() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        public boolean postConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f5) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postRotate(float f5, float f6, float f7) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f5, float f6) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postScale(float f5, float f6, float f7, float f8) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f5, float f6) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postSkew(float f5, float f6, float f7, float f8) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean postTranslate(float f5, float f6) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preConcat(Matrix matrix) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f5) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preRotate(float f5, float f6, float f7) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f5, float f6) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preScale(float f5, float f6, float f7, float f8) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f5, float f6) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preSkew(float f5, float f6, float f7, float f8) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean preTranslate(float f5, float f6) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void reset() {
            oops();
        }

        @Override // android.graphics.Matrix
        public void set(Matrix matrix) {
            oops();
        }

        @Override // android.graphics.Matrix
        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setPolyToPoly(float[] fArr, int i5, float[] fArr2, int i6, int i7) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            oops();
            return false;
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f5) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setRotate(float f5, float f6, float f7) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f5, float f6) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setScale(float f5, float f6, float f7, float f8) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f5, float f6) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSinCos(float f5, float f6, float f7, float f8) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f5, float f6) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setSkew(float f5, float f6, float f7, float f8) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setTranslate(float f5, float f6) {
            oops();
        }

        @Override // android.graphics.Matrix
        public void setValues(float[] fArr) {
            oops();
        }
    };

    private MatrixUtils() {
    }
}
