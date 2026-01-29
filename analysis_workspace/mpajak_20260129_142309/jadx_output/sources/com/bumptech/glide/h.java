package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l0.k;
import r.m;

/* loaded from: classes19.dex */
public final class h<TranscodeType> extends h0.a<h<TranscodeType>> {
    public final Context B;
    public final i C;
    public final Class<TranscodeType> D;
    public final d E;

    @NonNull
    public j<?, ? super TranscodeType> F;

    @Nullable
    public Object G;

    @Nullable
    public List<h0.e<TranscodeType>> H;

    @Nullable
    public h<TranscodeType> I;

    @Nullable
    public h<TranscodeType> J;
    public boolean K = true;
    public boolean L;
    public boolean M;

    /* loaded from: classes12.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f581a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f582b;

        static {
            int[] iArr = new int[f.values().length];
            f582b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f582b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f582b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f582b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f581a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f581a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f581a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f581a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f581a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f581a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f581a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f581a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
    }

    @SuppressLint({"CheckResult"})
    public h(@NonNull b bVar, i iVar, Class<TranscodeType> cls, Context context) {
        h0.f fVar;
        this.C = iVar;
        this.D = cls;
        this.B = context;
        d dVar = iVar.f584b.f531d;
        j jVar = dVar.f559f.get(cls);
        if (jVar == null) {
            for (Map.Entry<Class<?>, j<?, ?>> entry : dVar.f559f.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    jVar = (j) entry.getValue();
                }
            }
        }
        this.F = jVar == null ? d.f553k : jVar;
        this.E = bVar.f531d;
        Iterator<h0.e<Object>> it = iVar.f592j.iterator();
        while (it.hasNext()) {
            p((h0.e) it.next());
        }
        synchronized (iVar) {
            fVar = iVar.f593k;
        }
        a(fVar);
    }

    @NonNull
    @CheckResult
    public final h<TranscodeType> p(@Nullable h0.e<TranscodeType> eVar) {
        if (this.f3075w) {
            return clone().p(eVar);
        }
        if (eVar != null) {
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(eVar);
        }
        i();
        return this;
    }

    @Override // h0.a
    @NonNull
    @CheckResult
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final h<TranscodeType> a(@NonNull h0.a<?> aVar) {
        Objects.requireNonNull(aVar, "Argument must not be null");
        return (h) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final h0.c r(Object obj, i0.h hVar, @Nullable h0.d dVar, j jVar, f fVar, int i5, int i6, h0.a aVar) {
        h0.b bVar;
        h0.d dVar2;
        h0.c x4;
        int i7;
        int i8;
        int i9;
        int i10;
        if (this.J != null) {
            dVar2 = new h0.b(obj, dVar);
            bVar = dVar2;
        } else {
            bVar = 0;
            dVar2 = dVar;
        }
        h<TranscodeType> hVar2 = this.I;
        if (hVar2 == null) {
            x4 = x(obj, hVar, aVar, dVar2, jVar, fVar, i5, i6);
        } else {
            if (this.M) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            j jVar2 = hVar2.K ? jVar : hVar2.F;
            f t4 = h0.a.e(hVar2.f3054b, 8) ? this.I.f3057e : t(fVar);
            h<TranscodeType> hVar3 = this.I;
            int i11 = hVar3.f3064l;
            int i12 = hVar3.f3063k;
            if (k.j(i5, i6)) {
                h<TranscodeType> hVar4 = this.I;
                if (!k.j(hVar4.f3064l, hVar4.f3063k)) {
                    i10 = aVar.f3064l;
                    i9 = aVar.f3063k;
                    h0.i iVar = new h0.i(obj, dVar2);
                    h0.c x5 = x(obj, hVar, aVar, iVar, jVar, fVar, i5, i6);
                    this.M = true;
                    h<TranscodeType> hVar5 = this.I;
                    h0.c r4 = hVar5.r(obj, hVar, iVar, jVar2, t4, i10, i9, hVar5);
                    this.M = false;
                    iVar.f3113c = x5;
                    iVar.f3114d = r4;
                    x4 = iVar;
                }
            }
            i9 = i12;
            i10 = i11;
            h0.i iVar2 = new h0.i(obj, dVar2);
            h0.c x52 = x(obj, hVar, aVar, iVar2, jVar, fVar, i5, i6);
            this.M = true;
            h<TranscodeType> hVar52 = this.I;
            h0.c r42 = hVar52.r(obj, hVar, iVar2, jVar2, t4, i10, i9, hVar52);
            this.M = false;
            iVar2.f3113c = x52;
            iVar2.f3114d = r42;
            x4 = iVar2;
        }
        if (bVar == 0) {
            return x4;
        }
        h<TranscodeType> hVar6 = this.J;
        int i13 = hVar6.f3064l;
        int i14 = hVar6.f3063k;
        if (k.j(i5, i6)) {
            h<TranscodeType> hVar7 = this.J;
            if (!k.j(hVar7.f3064l, hVar7.f3063k)) {
                i8 = aVar.f3064l;
                i7 = aVar.f3063k;
                h<TranscodeType> hVar8 = this.J;
                h0.c r5 = hVar8.r(obj, hVar, bVar, hVar8.F, hVar8.f3057e, i8, i7, hVar8);
                bVar.f3081c = x4;
                bVar.f3082d = r5;
                return bVar;
            }
        }
        i7 = i14;
        i8 = i13;
        h<TranscodeType> hVar82 = this.J;
        h0.c r52 = hVar82.r(obj, hVar, bVar, hVar82.F, hVar82.f3057e, i8, i7, hVar82);
        bVar.f3081c = x4;
        bVar.f3082d = r52;
        return bVar;
    }

    @Override // h0.a
    @CheckResult
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final h<TranscodeType> clone() {
        h<TranscodeType> hVar = (h) super.clone();
        hVar.F = (j<?, ? super TranscodeType>) hVar.F.a();
        if (hVar.H != null) {
            hVar.H = new ArrayList(hVar.H);
        }
        h<TranscodeType> hVar2 = hVar.I;
        if (hVar2 != null) {
            hVar.I = hVar2.clone();
        }
        h<TranscodeType> hVar3 = hVar.J;
        if (hVar3 != null) {
            hVar.J = hVar3.clone();
        }
        return hVar;
    }

    @NonNull
    public final f t(@NonNull f fVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return f.IMMEDIATE;
        }
        if (ordinal == 2) {
            return f.HIGH;
        }
        if (ordinal == 3) {
            return f.NORMAL;
        }
        StringBuilder g5 = androidx.activity.d.g("unknown priority: ");
        g5.append(this.f3057e);
        throw new IllegalArgumentException(g5.toString());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<h0.c>] */
    public final i0.h u(@NonNull i0.h hVar, h0.a aVar) {
        Objects.requireNonNull(hVar, "Argument must not be null");
        if (!this.L) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        h0.c r4 = r(new Object(), hVar, null, this.F, aVar.f3057e, aVar.f3064l, aVar.f3063k, aVar);
        h0.c g5 = hVar.g();
        if (r4.c(g5)) {
            if (!(!aVar.f3062j && g5.j())) {
                Objects.requireNonNull(g5, "Argument must not be null");
                if (!g5.isRunning()) {
                    g5.i();
                }
                return hVar;
            }
        }
        this.C.k(hVar);
        hVar.e(r4);
        i iVar = this.C;
        synchronized (iVar) {
            iVar.f589g.f2536b.add(hVar);
            p pVar = iVar.f587e;
            pVar.f2526a.add(r4);
            if (pVar.f2528c) {
                r4.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                pVar.f2527b.add(r4);
            } else {
                r4.i();
            }
        }
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.i<android.widget.ImageView, TranscodeType> v(@androidx.annotation.NonNull android.widget.ImageView r5) {
        /*
            r4 = this;
            l0.k.a()
            java.lang.String r0 = "Argument must not be null"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r4.f3054b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = h0.a.e(r0, r1)
            if (r0 != 0) goto L6d
            boolean r0 = r4.f3067o
            if (r0 == 0) goto L6d
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L6d
            int[] r0 = com.bumptech.glide.h.a.f581a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L5d;
                case 2: goto L4b;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L39;
                case 6: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L6d
        L2d:
            com.bumptech.glide.h r0 = r4.clone()
            y.l$a r2 = y.l.f5990b
            y.j r3 = new y.j
            r3.<init>()
            goto L56
        L39:
            com.bumptech.glide.h r0 = r4.clone()
            y.l$c r2 = y.l.f5989a
            y.q r3 = new y.q
            r3.<init>()
            h0.a r0 = r0.f(r2, r3)
            r0.f3078z = r1
            goto L6e
        L4b:
            com.bumptech.glide.h r0 = r4.clone()
            y.l$a r2 = y.l.f5990b
            y.j r3 = new y.j
            r3.<init>()
        L56:
            h0.a r0 = r0.f(r2, r3)
            r0.f3078z = r1
            goto L6e
        L5d:
            com.bumptech.glide.h r0 = r4.clone()
            y.l$b r1 = y.l.f5991c
            y.i r2 = new y.i
            r2.<init>()
            h0.a r0 = r0.f(r1, r2)
            goto L6e
        L6d:
            r0 = r4
        L6e:
            com.bumptech.glide.d r1 = r4.E
            java.lang.Class<TranscodeType> r2 = r4.D
            i.g r1 = r1.f556c
            java.util.Objects.requireNonNull(r1)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L85
            i0.b r1 = new i0.b
            r1.<init>(r5)
            goto L92
        L85:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L96
            i0.d r1 = new i0.d
            r1.<init>(r5)
        L92:
            r4.u(r1, r0)
            return r1
        L96:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unhandled class: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.h.v(android.widget.ImageView):i0.i");
    }

    @NonNull
    public final h<TranscodeType> w(@Nullable Object obj) {
        if (this.f3075w) {
            return clone().w(obj);
        }
        this.G = obj;
        this.L = true;
        i();
        return this;
    }

    public final h0.c x(Object obj, i0.h hVar, h0.a aVar, h0.d dVar, j jVar, f fVar, int i5, int i6) {
        Context context = this.B;
        d dVar2 = this.E;
        Object obj2 = this.G;
        Class<TranscodeType> cls = this.D;
        List<h0.e<TranscodeType>> list = this.H;
        m mVar = dVar2.f560g;
        Objects.requireNonNull(jVar);
        return new h0.h(context, dVar2, obj, obj2, cls, aVar, i5, i6, fVar, hVar, list, dVar, mVar);
    }
}
