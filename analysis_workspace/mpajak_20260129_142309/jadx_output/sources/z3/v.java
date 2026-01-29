package z3;

import java.io.IOException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class v extends IOException {

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final b f6337b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f6337b = errorCode;
    }
}
