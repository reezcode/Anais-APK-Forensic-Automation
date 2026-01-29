package m3;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final q3.r f4156a = new q3.r("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final q3.r f4157b = new q3.r("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    public static final q3.r f4158c = new q3.r("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    public static final q3.r f4159d = new q3.r("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    public static final q3.r f4160e = new q3.r("SEALED");

    /* renamed from: f, reason: collision with root package name */
    public static final j0 f4161f = new j0(false);

    /* renamed from: g, reason: collision with root package name */
    public static final j0 f4162g = new j0(true);

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(Continuation continuation) {
        Object m16constructorimpl;
        if (continuation instanceof q3.e) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(continuation + '@' + b(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m19exceptionOrNullimpl(m16constructorimpl) != null) {
            m16constructorimpl = continuation.getClass().getName() + '@' + b(continuation);
        }
        return (String) m16constructorimpl;
    }
}
