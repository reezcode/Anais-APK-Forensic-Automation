package w3;

import java.net.Socket;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k extends v3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f5875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, String str) {
        super(str, true);
        this.f5875e = lVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<java.lang.ref.Reference<w3.e>>] */
    @Override // v3.a
    public final long a() {
        l lVar = this.f5875e;
        long nanoTime = System.nanoTime();
        Iterator<j> it = lVar.f5879d.iterator();
        int i5 = 0;
        long j5 = Long.MIN_VALUE;
        j jVar = null;
        int i6 = 0;
        while (it.hasNext()) {
            j connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (lVar.b(connection, nanoTime) > 0) {
                    i6++;
                } else {
                    i5++;
                    long j6 = nanoTime - connection.f5873p;
                    if (j6 > j5) {
                        Unit unit = Unit.INSTANCE;
                        jVar = connection;
                        j5 = j6;
                    } else {
                        Unit unit2 = Unit.INSTANCE;
                    }
                }
            }
        }
        long j7 = lVar.f5876a;
        if (j5 < j7 && i5 <= lVar.f5880e) {
            if (i5 > 0) {
                return j7 - j5;
            }
            if (i6 > 0) {
                return j7;
            }
            return -1L;
        }
        Intrinsics.checkNotNull(jVar);
        synchronized (jVar) {
            if (!(!jVar.f5872o.isEmpty()) && jVar.f5873p + j5 == nanoTime) {
                jVar.f5866i = true;
                lVar.f5879d.remove(jVar);
                Socket socket = jVar.f5860c;
                Intrinsics.checkNotNull(socket);
                t3.c.e(socket);
                if (!lVar.f5879d.isEmpty()) {
                    return 0L;
                }
                lVar.f5877b.a();
                return 0L;
            }
            return 0L;
        }
    }
}
