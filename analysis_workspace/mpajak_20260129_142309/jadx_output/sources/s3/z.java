package s3;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class z extends d1.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f5391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f5392c;

    public z(File file, u uVar) {
        this.f5391b = file;
        this.f5392c = uVar;
    }

    @Override // d1.f
    public final long A() {
        return this.f5391b.length();
    }

    @Override // d1.f
    public final u B() {
        return this.f5392c;
    }

    @Override // d1.f
    public final void K(f4.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        File source = this.f5391b;
        Logger logger = f4.q.f2882a;
        Intrinsics.checkNotNullParameter(source, "$this$source");
        FileInputStream source2 = new FileInputStream(source);
        Intrinsics.checkNotNullParameter(source2, "$this$source");
        f4.p pVar = new f4.p(source2, new f4.b0());
        try {
            sink.b0(pVar);
            CloseableKt.closeFinally(pVar, null);
        } finally {
        }
    }
}
