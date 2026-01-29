package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
class PreconditionsKt__AssertionsJVMKt {
    @InlineOnly
    /* renamed from: assert, reason: not valid java name */
    private static final void m13assert(boolean z4) {
    }

    @InlineOnly
    /* renamed from: assert, reason: not valid java name */
    private static final void m14assert(boolean z4, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
    }
}
