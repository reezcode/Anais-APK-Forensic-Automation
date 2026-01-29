package k;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes17.dex */
public final class p implements j.s {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // j.s
    public final <T> T c(i.a aVar, Type type, Object obj) {
        String x4;
        boolean z4;
        i.c cVar = aVar.f3146g;
        if (cVar.q() == 4) {
            x4 = cVar.k0();
            cVar.Q(16);
        } else if (cVar.q() == 2) {
            Number f5 = cVar.f();
            cVar.Q(16);
            x4 = f5.toString();
        } else {
            Object w4 = aVar.w(null);
            if (w4 instanceof String) {
                x4 = (String) w4;
            } else {
                if (w4 instanceof Collection) {
                    Collection collection = (Collection) w4;
                    Iterator it = collection.iterator();
                    while (true) {
                        z4 = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if ((next instanceof String) && ((String) next).length() != 1) {
                            z4 = false;
                            break;
                        }
                    }
                    if (!z4) {
                        throw new f.d("can not cast to char[]");
                    }
                    char[] cArr = new char[collection.size()];
                    Iterator it2 = collection.iterator();
                    int i5 = 0;
                    while (it2.hasNext()) {
                        cArr[i5] = ((String) it2.next()).charAt(0);
                        i5++;
                    }
                    return cArr;
                }
                if (w4 == null) {
                    return null;
                }
                x4 = f.a.x(w4);
            }
        }
        return (T) x4.toCharArray();
    }

    @Override // j.s
    public final int e() {
        return 4;
    }
}
