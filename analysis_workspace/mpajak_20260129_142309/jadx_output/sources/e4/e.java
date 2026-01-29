package e4;

import androidx.core.view.PointerIconCompat;
import e4.d;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import s3.b0;
import s3.r;
import s3.y;

/* loaded from: classes10.dex */
public final class e implements s3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f2642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f2643b;

    public e(d dVar, y yVar) {
        this.f2642a = dVar;
        this.f2643b = yVar;
    }

    @Override // s3.e
    public final void a(s3.d call, b0 response) {
        int intValue;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        w3.c cVar = response.f5166n;
        int i5 = 1;
        try {
            this.f2642a.h(response, cVar);
            Intrinsics.checkNotNull(cVar);
            d.c c5 = cVar.c();
            r responseHeaders = response.f5159g;
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            int length = responseHeaders.f5280b.length / 2;
            int i6 = 0;
            Integer num = null;
            Integer num2 = null;
            int i7 = 0;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while (i7 < length) {
                if (StringsKt.g(responseHeaders.r(i7), "Sec-WebSocket-Extensions")) {
                    String t4 = responseHeaders.t(i7);
                    int i8 = 0;
                    while (i8 < t4.length()) {
                        int h5 = t3.c.h(t4, ',', i8, i6, 4);
                        int f5 = t3.c.f(t4, ';', i8, h5);
                        String B = t3.c.B(t4, i8, f5);
                        int i9 = f5 + i5;
                        boolean g5 = StringsKt.g(B, "permessage-deflate");
                        i8 = i9;
                        if (g5) {
                            if (z4) {
                                z7 = true;
                            }
                            while (i8 < h5) {
                                int f6 = t3.c.f(t4, ';', i8, h5);
                                int f7 = t3.c.f(t4, '=', i8, f6);
                                String B2 = t3.c.B(t4, i8, f7);
                                String removeSurrounding = f7 < f6 ? StringsKt__StringsKt.removeSurrounding(t3.c.B(t4, f7 + 1, f6), (CharSequence) "\"") : null;
                                i8 = f6 + 1;
                                if (StringsKt.g(B2, "client_max_window_bits")) {
                                    if (num != null) {
                                        z7 = true;
                                    }
                                    num = removeSurrounding != null ? StringsKt.toIntOrNull(removeSurrounding) : null;
                                    if (num == null) {
                                        z7 = true;
                                    }
                                } else if (StringsKt.g(B2, "client_no_context_takeover")) {
                                    if (z5) {
                                        z7 = true;
                                    }
                                    if (removeSurrounding != null) {
                                        z7 = true;
                                    }
                                    z5 = true;
                                } else if (StringsKt.g(B2, "server_max_window_bits")) {
                                    if (num2 != null) {
                                        z7 = true;
                                    }
                                    num2 = removeSurrounding != null ? StringsKt.toIntOrNull(removeSurrounding) : null;
                                    if (num2 == null) {
                                        z7 = true;
                                    }
                                } else if (StringsKt.g(B2, "server_no_context_takeover")) {
                                    if (z6) {
                                        z7 = true;
                                    }
                                    if (removeSurrounding != null) {
                                        z7 = true;
                                    }
                                    z6 = true;
                                } else {
                                    z7 = true;
                                }
                            }
                            i5 = 1;
                            i6 = 0;
                            z4 = true;
                        } else {
                            i5 = 1;
                            i6 = 0;
                            z7 = true;
                        }
                    }
                }
                i7++;
                i5 = 1;
                i6 = 0;
            }
            this.f2642a.f2628v = new f(z4, num, z5, num2, z6, z7);
            if (!(!z7 && num == null && (num2 == null || (8 <= (intValue = num2.intValue()) && 15 >= intValue)))) {
                synchronized (this.f2642a) {
                    this.f2642a.f2616j.clear();
                    this.f2642a.a(PointerIconCompat.TYPE_ALIAS, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.f2642a.j(t3.c.f5455g + " WebSocket " + this.f2643b.f5381b.g(), c5);
                d dVar = this.f2642a;
                dVar.f2625s.I(dVar);
                this.f2642a.k();
            } catch (Exception e5) {
                this.f2642a.i(e5, null);
            }
        } catch (IOException e6) {
            if (cVar != null) {
                cVar.a(true, true, null);
            }
            this.f2642a.i(e6, response);
            t3.c.d(response);
        }
    }

    @Override // s3.e
    public final void b(s3.d call, IOException e5) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e5, "e");
        this.f2642a.i(e5, null);
    }
}
