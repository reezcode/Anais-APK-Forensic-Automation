package b2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes19.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f406a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f407b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f408c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f409d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f410e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f411f;

    /* renamed from: g, reason: collision with root package name */
    public final List<f> f412g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final List<g> f413h = new ArrayList();

    /* loaded from: classes21.dex */
    public class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f414b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f415c;

        public a(List list, Matrix matrix) {
            this.f414b = list;
            this.f415c = matrix;
        }

        @Override // b2.m.g
        public final void a(Matrix matrix, a2.a aVar, int i5, Canvas canvas) {
            Iterator it = this.f414b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f415c, aVar, i5, canvas);
            }
        }
    }

    /* loaded from: classes18.dex */
    public static class b extends g {

        /* renamed from: b, reason: collision with root package name */
        public final d f416b;

        public b(d dVar) {
            this.f416b = dVar;
        }

        @Override // b2.m.g
        public final void a(Matrix matrix, @NonNull a2.a aVar, int i5, @NonNull Canvas canvas) {
            d dVar = this.f416b;
            float f5 = dVar.f425f;
            float f6 = dVar.f426g;
            d dVar2 = this.f416b;
            RectF rectF = new RectF(dVar2.f421b, dVar2.f422c, dVar2.f423d, dVar2.f424e);
            boolean z4 = f6 < 0.0f;
            Path path = aVar.f62g;
            if (z4) {
                int[] iArr = a2.a.f54k;
                iArr[0] = 0;
                iArr[1] = aVar.f61f;
                iArr[2] = aVar.f60e;
                iArr[3] = aVar.f59d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f5, f6);
                path.close();
                float f7 = -i5;
                rectF.inset(f7, f7);
                int[] iArr2 = a2.a.f54k;
                iArr2[0] = 0;
                iArr2[1] = aVar.f59d;
                iArr2[2] = aVar.f60e;
                iArr2[3] = aVar.f61f;
            }
            float width = rectF.width() / 2.0f;
            if (width <= 0.0f) {
                return;
            }
            float f8 = 1.0f - (i5 / width);
            float[] fArr = a2.a.f55l;
            fArr[1] = f8;
            fArr[2] = ((1.0f - f8) / 2.0f) + f8;
            aVar.f57b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, a2.a.f54k, fArr, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z4) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aVar.f63h);
            }
            canvas.drawArc(rectF, f5, f6, true, aVar.f57b);
            canvas.restore();
        }
    }

    /* loaded from: classes17.dex */
    public static class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public final e f417b;

        /* renamed from: c, reason: collision with root package name */
        public final float f418c;

        /* renamed from: d, reason: collision with root package name */
        public final float f419d;

        public c(e eVar, float f5, float f6) {
            this.f417b = eVar;
            this.f418c = f5;
            this.f419d = f6;
        }

        @Override // b2.m.g
        public final void a(Matrix matrix, @NonNull a2.a aVar, int i5, @NonNull Canvas canvas) {
            e eVar = this.f417b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(eVar.f428c - this.f419d, eVar.f427b - this.f418c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f418c, this.f419d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += i5;
            rectF.offset(0.0f, -i5);
            int[] iArr = a2.a.f52i;
            iArr[0] = aVar.f61f;
            iArr[1] = aVar.f60e;
            iArr[2] = aVar.f59d;
            Paint paint = aVar.f58c;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, a2.a.f53j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f58c);
            canvas.restore();
        }

        public final float b() {
            e eVar = this.f417b;
            return (float) Math.toDegrees(Math.atan((eVar.f428c - this.f419d) / (eVar.f427b - this.f418c)));
        }
    }

    /* loaded from: classes23.dex */
    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f420h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public float f421b;

        /* renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f422c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f423d;

        /* renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f424e;

        /* renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f425f;

        /* renamed from: g, reason: collision with root package name */
        @Deprecated
        public float f426g;

        public d(float f5, float f6, float f7, float f8) {
            this.f421b = f5;
            this.f422c = f6;
            this.f423d = f7;
            this.f424e = f8;
        }

        @Override // b2.m.f
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f429a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f420h;
            rectF.set(this.f421b, this.f422c, this.f423d, this.f424e);
            path.arcTo(rectF, this.f425f, this.f426g, false);
            path.transform(matrix);
        }
    }

    /* loaded from: classes6.dex */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        public float f427b;

        /* renamed from: c, reason: collision with root package name */
        public float f428c;

        @Override // b2.m.f
        public final void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.f429a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f427b, this.f428c);
            path.transform(matrix);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f429a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* loaded from: classes12.dex */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        public static final Matrix f430a = new Matrix();

        public abstract void a(Matrix matrix, a2.a aVar, int i5, Canvas canvas);
    }

    public m() {
        f(0.0f, 270.0f, 0.0f);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<b2.m$f>] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList, java.util.List<b2.m$g>] */
    public final void a(float f5, float f6, float f7, float f8, float f9, float f10) {
        d dVar = new d(f5, f6, f7, f8);
        dVar.f425f = f9;
        dVar.f426g = f10;
        this.f412g.add(dVar);
        b bVar = new b(dVar);
        float f11 = f9 + f10;
        boolean z4 = f10 < 0.0f;
        if (z4) {
            f9 = (f9 + 180.0f) % 360.0f;
        }
        float f12 = z4 ? (180.0f + f11) % 360.0f : f11;
        b(f9);
        this.f413h.add(bVar);
        this.f410e = f12;
        double d5 = f11;
        this.f408c = (((f7 - f5) / 2.0f) * ((float) Math.cos(Math.toRadians(d5)))) + ((f5 + f7) * 0.5f);
        this.f409d = (((f8 - f6) / 2.0f) * ((float) Math.sin(Math.toRadians(d5)))) + ((f6 + f8) * 0.5f);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<b2.m$g>] */
    public final void b(float f5) {
        float f6 = this.f410e;
        if (f6 == f5) {
            return;
        }
        float f7 = ((f5 - f6) + 360.0f) % 360.0f;
        if (f7 > 180.0f) {
            return;
        }
        float f8 = this.f408c;
        float f9 = this.f409d;
        d dVar = new d(f8, f9, f8, f9);
        dVar.f425f = this.f410e;
        dVar.f426g = f7;
        this.f413h.add(new b(dVar));
        this.f410e = f5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<b2.m$f>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<b2.m$f>] */
    public final void c(Matrix matrix, Path path) {
        int size = this.f412g.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((f) this.f412g.get(i5)).a(matrix, path);
        }
    }

    @NonNull
    public final g d(Matrix matrix) {
        b(this.f411f);
        return new a(new ArrayList(this.f413h), new Matrix(matrix));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<b2.m$g>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<b2.m$f>] */
    public final void e(float f5, float f6) {
        e eVar = new e();
        eVar.f427b = f5;
        eVar.f428c = f6;
        this.f412g.add(eVar);
        c cVar = new c(eVar, this.f408c, this.f409d);
        float b5 = cVar.b() + 270.0f;
        float b6 = cVar.b() + 270.0f;
        b(b5);
        this.f413h.add(cVar);
        this.f410e = b6;
        this.f408c = f5;
        this.f409d = f6;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<b2.m$f>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<b2.m$g>] */
    public final void f(float f5, float f6, float f7) {
        this.f406a = 0.0f;
        this.f407b = f5;
        this.f408c = 0.0f;
        this.f409d = f5;
        this.f410e = f6;
        this.f411f = (f6 + f7) % 360.0f;
        this.f412g.clear();
        this.f413h.clear();
    }
}
