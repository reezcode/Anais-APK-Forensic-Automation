package k2;

import i2.a0;
import i2.z;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class m implements a0, Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public static final m f3823d = new m();

    /* renamed from: b, reason: collision with root package name */
    public List<i2.a> f3824b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public List<i2.a> f3825c = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes11.dex */
    public class a<T> extends z<T> {

        /* renamed from: a, reason: collision with root package name */
        public z<T> f3826a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f3827b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f3828c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i2.i f3829d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ o2.a f3830e;

        public a(boolean z4, boolean z5, i2.i iVar, o2.a aVar) {
            this.f3827b = z4;
            this.f3828c = z5;
            this.f3829d = iVar;
            this.f3830e = aVar;
        }

        @Override // i2.z
        public final T a(p2.a aVar) {
            if (this.f3827b) {
                aVar.U();
                return null;
            }
            z<T> zVar = this.f3826a;
            if (zVar == null) {
                zVar = this.f3829d.f(m.this, this.f3830e);
                this.f3826a = zVar;
            }
            return zVar.a(aVar);
        }

        @Override // i2.z
        public final void b(p2.b bVar, T t4) {
            if (this.f3828c) {
                bVar.q();
                return;
            }
            z<T> zVar = this.f3826a;
            if (zVar == null) {
                zVar = this.f3829d.f(m.this, this.f3830e);
                this.f3826a = zVar;
            }
            zVar.b(bVar, t4);
        }
    }

    @Override // i2.a0
    public final <T> z<T> a(i2.i iVar, o2.a<T> aVar) {
        Class<? super T> cls = aVar.f4568a;
        boolean c5 = c(cls);
        boolean z4 = c5 || b(cls, true);
        boolean z5 = c5 || b(cls, false);
        if (z4 || z5) {
            return new a(z5, z4, iVar, aVar);
        }
        return null;
    }

    public final boolean b(Class<?> cls, boolean z4) {
        Iterator<i2.a> it = (z4 ? this.f3824b : this.f3825c).iterator();
        while (it.hasNext()) {
            if (it.next().a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            if (!((cls.getModifiers() & 8) != 0) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (m) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }
}
