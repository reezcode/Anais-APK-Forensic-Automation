package i2;

import i2.b;
import i2.v;
import i2.w;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l2.d;

/* loaded from: classes22.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public k2.m f3285a = k2.m.f3823d;

    /* renamed from: b, reason: collision with root package name */
    public v.a f3286b = v.f3303b;

    /* renamed from: c, reason: collision with root package name */
    public b.a f3287c = b.f3262b;

    /* renamed from: d, reason: collision with root package name */
    public final Map<Type, k<?>> f3288d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final List<a0> f3289e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final List<a0> f3290f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f3291g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f3292h;

    /* renamed from: i, reason: collision with root package name */
    public int f3293i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3294j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3295k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3296l;

    /* renamed from: m, reason: collision with root package name */
    public w.a f3297m;

    /* renamed from: n, reason: collision with root package name */
    public w.b f3298n;

    public j() {
        o2.a<?> aVar = i.f3272l;
        this.f3292h = 2;
        this.f3293i = 2;
        this.f3294j = true;
        this.f3295k = false;
        this.f3296l = true;
        this.f3297m = w.f3306b;
        this.f3298n = w.f3307c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<i2.a0>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<i2.a0>] */
    public final i a() {
        a0 a0Var;
        ArrayList arrayList = new ArrayList(this.f3290f.size() + this.f3289e.size() + 3);
        arrayList.addAll(this.f3289e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f3290f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i5 = this.f3292h;
        int i6 = this.f3293i;
        boolean z4 = n2.d.f4512a;
        if (i5 != 2 && i6 != 2) {
            a0 a5 = d.b.f3960b.a(i5, i6);
            a0 a0Var2 = null;
            if (z4) {
                a0Var2 = n2.d.f4514c.a(i5, i6);
                a0Var = n2.d.f4513b.a(i5, i6);
            } else {
                a0Var = null;
            }
            arrayList.add(a5);
            if (z4) {
                arrayList.add(a0Var2);
                arrayList.add(a0Var);
            }
        }
        return new i(this.f3285a, this.f3287c, this.f3288d, this.f3291g, this.f3294j, this.f3295k, this.f3296l, this.f3286b, arrayList, this.f3297m, this.f3298n);
    }
}
