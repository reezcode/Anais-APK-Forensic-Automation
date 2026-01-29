package z2;

/* loaded from: classes18.dex */
public final class m<T, ID> {

    /* renamed from: a, reason: collision with root package name */
    public final d3.c<T, ID> f6158a;

    /* renamed from: b, reason: collision with root package name */
    public final k<T, ID> f6159b;

    /* renamed from: c, reason: collision with root package name */
    public final u2.c f6160c;

    /* renamed from: e, reason: collision with root package name */
    public int f6162e;

    /* renamed from: d, reason: collision with root package name */
    public b3.b[] f6161d = new b3.b[4];

    /* renamed from: f, reason: collision with root package name */
    public b3.e f6163f = null;

    public m(d3.c<T, ID> cVar, k<T, ID> kVar, u2.c cVar2) {
        this.f6158a = cVar;
        this.f6159b = kVar;
        v2.g gVar = cVar.f2498f;
        this.f6160c = cVar2;
    }

    public final void a(b3.b bVar) {
        b3.e eVar = this.f6163f;
        if (eVar == null) {
            k(bVar);
        } else {
            eVar.f435b = bVar;
            this.f6163f = null;
        }
    }

    public final m<T, ID> b() {
        int i5 = this.f6162e;
        if (i5 == 0) {
            throw new IllegalStateException("Expecting there to be a clause already defined for 'AND' operation");
        }
        b3.b[] bVarArr = this.f6161d;
        int i6 = i5 - 1;
        this.f6162e = i6;
        b3.b bVar = bVarArr[i6];
        bVarArr[i6] = null;
        b3.e eVar = new b3.e(bVar);
        k(eVar);
        if (this.f6163f == null) {
            this.f6163f = eVar;
            return this;
        }
        throw new IllegalStateException(this.f6163f + " is already waiting for a future clause, can't add: " + eVar);
    }

    public final m<T, ID> c(String str, Object obj) {
        a(new b3.g(str, d(str), obj, "="));
        return this;
    }

    public final v2.g d(String str) {
        return this.f6158a.b(str);
    }

    public final m e(Object obj) {
        a(new b3.g("ty", d("ty"), obj, ">="));
        return this;
    }

    public final m<T, ID> f(String str, Object obj) {
        a(new b3.g(str, d(str), obj, ">"));
        return this;
    }

    public final m<T, ID> g(String str, Object obj) {
        a(new b3.g(str, d(str), obj, "<="));
        return this;
    }

    public final m<T, ID> h(String str, Object obj) {
        a(new b3.g(str, d(str), obj, "LIKE"));
        return this;
    }

    public final m<T, ID> i(String str, Object obj) {
        a(new b3.g(str, d(str), obj, "<"));
        return this;
    }

    public final f<T> j() {
        return this.f6159b.f();
    }

    public final void k(b3.b bVar) {
        int i5 = this.f6162e;
        if (i5 == this.f6161d.length) {
            b3.b[] bVarArr = new b3.b[i5 * 2];
            for (int i6 = 0; i6 < this.f6162e; i6++) {
                b3.b[] bVarArr2 = this.f6161d;
                bVarArr[i6] = bVarArr2[i6];
                bVarArr2[i6] = null;
            }
            this.f6161d = bVarArr;
        }
        b3.b[] bVarArr3 = this.f6161d;
        int i7 = this.f6162e;
        this.f6162e = i7 + 1;
        bVarArr3[i7] = bVar;
    }

    public final String toString() {
        int i5 = this.f6162e;
        if (i5 == 0) {
            return "empty where clause";
        }
        return "where clause: " + this.f6161d[i5 - 1];
    }
}
