package w3;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes16.dex */
public final class n extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public IOException f5882b;

    /* renamed from: c, reason: collision with root package name */
    public final IOException f5883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f5883c = firstConnectException;
        this.f5882b = firstConnectException;
    }
}
