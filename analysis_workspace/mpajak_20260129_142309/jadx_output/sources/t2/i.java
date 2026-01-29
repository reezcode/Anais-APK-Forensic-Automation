package t2;

import java.sql.SQLException;

/* loaded from: classes16.dex */
public final class i implements f<Object> {

    /* renamed from: b, reason: collision with root package name */
    public int f5443b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f5444c;

    public i(j jVar) {
        this.f5444c = jVar;
    }

    @Override // t2.f
    public final void close() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5443b + 1 < this.f5444c.f5445i.size();
    }

    @Override // t2.f
    public final void moveToNext() {
        this.f5443b++;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i5 = this.f5443b + 1;
        this.f5443b = i5;
        return this.f5444c.f5445i.get(i5);
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i5 = this.f5443b;
        if (i5 < 0) {
            throw new IllegalStateException("next() must be called before remove()");
        }
        if (i5 >= this.f5444c.f5445i.size()) {
            throw new IllegalStateException(androidx.appcompat.view.a.h(androidx.activity.d.g("current results position ("), this.f5443b, ") is out of bounds"));
        }
        Object remove = this.f5444c.f5445i.remove(this.f5443b);
        this.f5443b--;
        g<T, ID> gVar = this.f5444c.f5431b;
        if (gVar != 0) {
            try {
                gVar.o(remove);
            } catch (SQLException e5) {
                throw new RuntimeException(e5);
            }
        }
    }
}
