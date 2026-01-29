package androidx.core.os;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes21.dex */
public final class HandlerKt {
    public static final Runnable postAtTime(Handler handler, long j5, Object obj, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(action);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j5);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j5, Object obj, Function0 action, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(action);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j5);
        return handlerKt$postAtTime$runnable$1;
    }

    public static final Runnable postDelayed(Handler handler, long j5, Object obj, Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(action);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j5);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j5);
        }
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j5, Object obj, Function0 action, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            obj = null;
        }
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(action);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j5);
        } else {
            HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j5);
        }
        return handlerKt$postDelayed$runnable$1;
    }
}
