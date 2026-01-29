package w3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import s3.e0;
import s3.s;
import w3.o;
import z3.v;

/* loaded from: classes23.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public o.a f5818a;

    /* renamed from: b, reason: collision with root package name */
    public o f5819b;

    /* renamed from: c, reason: collision with root package name */
    public int f5820c;

    /* renamed from: d, reason: collision with root package name */
    public int f5821d;

    /* renamed from: e, reason: collision with root package name */
    public int f5822e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f5823f;

    /* renamed from: g, reason: collision with root package name */
    public final l f5824g;

    /* renamed from: h, reason: collision with root package name */
    public final s3.a f5825h;

    /* renamed from: i, reason: collision with root package name */
    public final e f5826i;

    /* renamed from: j, reason: collision with root package name */
    public final s3.o f5827j;

    public d(l connectionPool, s3.a address, e call, s3.o eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f5824g = connectionPool;
        this.f5825h = address;
        this.f5826i = call;
        this.f5827j = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList, java.util.List<s3.e0>] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList, java.util.List<s3.e0>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w3.j a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.d.a(int, int, int, int, boolean, boolean):w3.j");
    }

    public final boolean b(s url) {
        Intrinsics.checkNotNullParameter(url, "url");
        s sVar = this.f5825h.f5138a;
        return url.f5289f == sVar.f5289f && Intrinsics.areEqual(url.f5288e, sVar.f5288e);
    }

    public final void c(IOException e5) {
        Intrinsics.checkNotNullParameter(e5, "e");
        this.f5823f = null;
        if ((e5 instanceof v) && ((v) e5).f6337b == z3.b.REFUSED_STREAM) {
            this.f5820c++;
        } else if (e5 instanceof z3.a) {
            this.f5821d++;
        } else {
            this.f5822e++;
        }
    }
}
