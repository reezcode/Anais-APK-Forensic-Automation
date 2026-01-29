package s3;

import java.io.IOException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public enum x {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* renamed from: j, reason: collision with root package name */
    public static final a f5378j = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f5379b;

    /* loaded from: classes12.dex */
    public static final class a {
        @JvmStatic
        public final x a(String protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            x xVar = x.HTTP_1_0;
            if (!Intrinsics.areEqual(protocol, "http/1.0")) {
                xVar = x.HTTP_1_1;
                if (!Intrinsics.areEqual(protocol, "http/1.1")) {
                    xVar = x.H2_PRIOR_KNOWLEDGE;
                    if (!Intrinsics.areEqual(protocol, "h2_prior_knowledge")) {
                        xVar = x.HTTP_2;
                        if (!Intrinsics.areEqual(protocol, "h2")) {
                            xVar = x.SPDY_3;
                            if (!Intrinsics.areEqual(protocol, "spdy/3.1")) {
                                xVar = x.QUIC;
                                if (!Intrinsics.areEqual(protocol, "quic")) {
                                    throw new IOException(androidx.activity.d.f("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return xVar;
        }
    }

    x(String str) {
        this.f5379b = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f5379b;
    }
}
