package s3;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes19.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final a f5265a = new a();

    /* loaded from: classes3.dex */
    public static final class a extends o {
    }

    /* loaded from: classes11.dex */
    public interface b {
        o a(d dVar);
    }

    public final void a(d call, i connection) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public final void b(d call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }

    public final void c(d call, IOException ioe) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(ioe, "ioe");
    }
}
