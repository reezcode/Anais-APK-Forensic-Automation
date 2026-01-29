package q3;

import java.util.Iterator;
import kotlin.jvm.JvmField;
import kotlin.sequences.SequencesKt;
import m3.a1;

/* loaded from: classes24.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final a1 f4787a;

    static {
        Object next;
        i.g.B("kotlinx.coroutines.fast.service.loader", true);
        Iterator it = SequencesKt.toList(SequencesKt.asSequence(androidx.activity.result.a.g())).iterator();
        a1 a1Var = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                ((l) next).c();
                do {
                    ((l) it.next()).c();
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        l lVar = (l) next;
        if (lVar != null) {
            try {
                a1Var = lVar.a();
            } catch (Throwable unused) {
                lVar.b();
            }
            if (a1Var != null) {
                f4787a = a1Var;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
