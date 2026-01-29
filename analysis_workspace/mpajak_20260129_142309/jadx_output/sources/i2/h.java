package i2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes2.dex */
public final class h extends z<AtomicLongArray> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f3271a;

    public h(z zVar) {
        this.f3271a = zVar;
    }

    @Override // i2.z
    public final AtomicLongArray a(p2.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.r()) {
            arrayList.add(Long.valueOf(((Number) this.f3271a.a(aVar)).longValue()));
        }
        aVar.f();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i5 = 0; i5 < size; i5++) {
            atomicLongArray.set(i5, ((Long) arrayList.get(i5)).longValue());
        }
        return atomicLongArray;
    }

    @Override // i2.z
    public final void b(p2.b bVar, AtomicLongArray atomicLongArray) {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        bVar.b();
        int length = atomicLongArray2.length();
        for (int i5 = 0; i5 < length; i5++) {
            this.f3271a.b(bVar, Long.valueOf(atomicLongArray2.get(i5)));
        }
        bVar.f();
    }
}
