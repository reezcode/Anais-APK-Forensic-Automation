package j;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes20.dex */
public final class w extends k {

    /* renamed from: c, reason: collision with root package name */
    public final int f3412c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3413d;

    /* renamed from: e, reason: collision with root package name */
    public final i.a f3414e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3415f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f3416g;

    /* renamed from: h, reason: collision with root package name */
    public final Collection f3417h;

    public w(i.a aVar, List list, int i5) {
        super(null, null);
        this.f3414e = aVar;
        this.f3412c = i5;
        this.f3413d = list;
        this.f3415f = null;
        this.f3416g = null;
        this.f3417h = null;
    }

    public w(Collection collection) {
        super(null, null);
        this.f3414e = null;
        this.f3412c = -1;
        this.f3413d = null;
        this.f3415f = null;
        this.f3416g = null;
        this.f3417h = collection;
    }

    public w(Map map, Object obj) {
        super(null, null);
        this.f3414e = null;
        this.f3412c = -1;
        this.f3413d = null;
        this.f3415f = obj;
        this.f3416g = map;
        this.f3417h = null;
    }

    @Override // j.k
    public final void b(i.a aVar, Object obj, Type type, Map<String, Object> map) {
    }

    @Override // j.k
    public final void c(Object obj, Object obj2) {
        f.b bVar;
        Object obj3;
        Map map = this.f3416g;
        if (map != null) {
            map.put(this.f3415f, obj2);
            return;
        }
        Collection collection = this.f3417h;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        this.f3413d.set(this.f3412c, obj2);
        List list = this.f3413d;
        if (!(list instanceof f.b) || (obj3 = (bVar = (f.b) list).f2686j) == null || Array.getLength(obj3) <= this.f3412c) {
            return;
        }
        Type type = bVar.f2687k;
        if (type != null) {
            obj2 = m.j.c(obj2, type, this.f3414e.f3143d);
        }
        Array.set(obj3, this.f3412c, obj2);
    }
}
