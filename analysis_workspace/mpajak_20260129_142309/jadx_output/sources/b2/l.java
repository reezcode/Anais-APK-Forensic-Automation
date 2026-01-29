package b2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import b2.g;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final m[] f393a = new m[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f394b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f395c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f396d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f397e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f398f = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final m f399g = new m();

    /* renamed from: h, reason: collision with root package name */
    public final float[] f400h = new float[2];

    /* renamed from: i, reason: collision with root package name */
    public final float[] f401i = new float[2];

    /* renamed from: j, reason: collision with root package name */
    public final Path f402j = new Path();

    /* renamed from: k, reason: collision with root package name */
    public final Path f403k = new Path();

    /* renamed from: l, reason: collision with root package name */
    public boolean f404l = true;

    /* loaded from: classes16.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f405a = new l();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes8.dex */
    public interface b {
    }

    public l() {
        for (int i5 = 0; i5 < 4; i5++) {
            this.f393a[i5] = new m();
            this.f394b[i5] = new Matrix();
            this.f395c[i5] = new Matrix();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void a(k kVar, float f5, RectF rectF, b bVar, @NonNull Path path) {
        int i5;
        float centerX;
        float f6;
        m mVar;
        Matrix matrix;
        Path path2;
        float f7;
        float f8;
        path.rewind();
        this.f397e.rewind();
        this.f398f.rewind();
        this.f398f.addRect(rectF, Path.Direction.CW);
        int i6 = 0;
        while (true) {
            if (i6 >= 4) {
                break;
            }
            c cVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar.f374f : kVar.f373e : kVar.f376h : kVar.f375g;
            d dVar = i6 != 1 ? i6 != 2 ? i6 != 3 ? kVar.f370b : kVar.f369a : kVar.f372d : kVar.f371c;
            m mVar2 = this.f393a[i6];
            Objects.requireNonNull(dVar);
            dVar.a(mVar2, f5, cVar.a(rectF));
            int i7 = i6 + 1;
            float f9 = i7 * 90;
            this.f394b[i6].reset();
            PointF pointF = this.f396d;
            if (i6 == 1) {
                f7 = rectF.right;
            } else if (i6 != 2) {
                f7 = i6 != 3 ? rectF.right : rectF.left;
                f8 = rectF.top;
                pointF.set(f7, f8);
                Matrix matrix2 = this.f394b[i6];
                PointF pointF2 = this.f396d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f394b[i6].preRotate(f9);
                float[] fArr = this.f400h;
                m[] mVarArr = this.f393a;
                fArr[0] = mVarArr[i6].f408c;
                fArr[1] = mVarArr[i6].f409d;
                this.f394b[i6].mapPoints(fArr);
                this.f395c[i6].reset();
                Matrix matrix3 = this.f395c[i6];
                float[] fArr2 = this.f400h;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f395c[i6].preRotate(f9);
                i6 = i7;
            } else {
                f7 = rectF.left;
            }
            f8 = rectF.bottom;
            pointF.set(f7, f8);
            Matrix matrix22 = this.f394b[i6];
            PointF pointF22 = this.f396d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f394b[i6].preRotate(f9);
            float[] fArr3 = this.f400h;
            m[] mVarArr2 = this.f393a;
            fArr3[0] = mVarArr2[i6].f408c;
            fArr3[1] = mVarArr2[i6].f409d;
            this.f394b[i6].mapPoints(fArr3);
            this.f395c[i6].reset();
            Matrix matrix32 = this.f395c[i6];
            float[] fArr22 = this.f400h;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f395c[i6].preRotate(f9);
            i6 = i7;
        }
        int i8 = 0;
        for (i5 = 4; i8 < i5; i5 = 4) {
            float[] fArr4 = this.f400h;
            m[] mVarArr3 = this.f393a;
            fArr4[0] = mVarArr3[i8].f406a;
            fArr4[1] = mVarArr3[i8].f407b;
            this.f394b[i8].mapPoints(fArr4);
            float[] fArr5 = this.f400h;
            if (i8 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f393a[i8].c(this.f394b[i8], path);
            if (bVar != null) {
                m mVar3 = this.f393a[i8];
                Matrix matrix4 = this.f394b[i8];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.f327e;
                Objects.requireNonNull(mVar3);
                bitSet.set(i8, false);
                g.this.f325c[i8] = mVar3.d(matrix4);
            }
            int i9 = i8 + 1;
            int i10 = i9 % 4;
            float[] fArr6 = this.f400h;
            m[] mVarArr4 = this.f393a;
            fArr6[0] = mVarArr4[i8].f408c;
            fArr6[1] = mVarArr4[i8].f409d;
            this.f394b[i8].mapPoints(fArr6);
            float[] fArr7 = this.f401i;
            m[] mVarArr5 = this.f393a;
            fArr7[0] = mVarArr5[i10].f406a;
            fArr7[1] = mVarArr5[i10].f407b;
            this.f394b[i10].mapPoints(fArr7);
            float f10 = this.f400h[0];
            float[] fArr8 = this.f401i;
            float max = Math.max(((float) Math.hypot(f10 - fArr8[0], r13[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.f400h;
            m[] mVarArr6 = this.f393a;
            fArr9[0] = mVarArr6[i8].f408c;
            fArr9[1] = mVarArr6[i8].f409d;
            this.f394b[i8].mapPoints(fArr9);
            if (i8 == 1 || i8 == 3) {
                centerX = rectF.centerX();
                f6 = this.f400h[0];
            } else {
                centerX = rectF.centerY();
                f6 = this.f400h[1];
            }
            float abs = Math.abs(centerX - f6);
            this.f399g.f(0.0f, 270.0f, 0.0f);
            (i8 != 1 ? i8 != 2 ? i8 != 3 ? kVar.f378j : kVar.f377i : kVar.f380l : kVar.f379k).a(max, abs, f5, this.f399g);
            this.f402j.reset();
            this.f399g.c(this.f395c[i8], this.f402j);
            if (this.f404l && (b(this.f402j, i8) || b(this.f402j, i10))) {
                Path path3 = this.f402j;
                path3.op(path3, this.f398f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.f400h;
                m mVar4 = this.f399g;
                fArr10[0] = mVar4.f406a;
                fArr10[1] = mVar4.f407b;
                this.f395c[i8].mapPoints(fArr10);
                Path path4 = this.f397e;
                float[] fArr11 = this.f400h;
                path4.moveTo(fArr11[0], fArr11[1]);
                mVar = this.f399g;
                matrix = this.f395c[i8];
                path2 = this.f397e;
            } else {
                mVar = this.f399g;
                matrix = this.f395c[i8];
                path2 = path;
            }
            mVar.c(matrix, path2);
            if (bVar != null) {
                m mVar5 = this.f399g;
                Matrix matrix5 = this.f395c[i8];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(mVar5);
                g.this.f327e.set(i8 + 4, false);
                g.this.f326d[i8] = mVar5.d(matrix5);
            }
            i8 = i9;
        }
        path.close();
        this.f397e.close();
        if (this.f397e.isEmpty()) {
            return;
        }
        path.op(this.f397e, Path.Op.UNION);
    }

    @RequiresApi(19)
    public final boolean b(Path path, int i5) {
        this.f403k.reset();
        this.f393a[i5].c(this.f394b[i5], this.f403k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f403k.computeBounds(rectF, true);
        path.op(this.f403k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
