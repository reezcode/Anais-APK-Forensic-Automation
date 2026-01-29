package kotlin;

import androidx.activity.d;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes25.dex */
class StandardKt__StandardKt {
    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final Void TODO() {
        throw new NotImplementedError(null, 1, 0 == true ? 1 : 0);
    }

    @InlineOnly
    private static final Void TODO(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new NotImplementedError(d.f("An operation is not implemented: ", reason));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T also(T t4, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t4);
        return t4;
    }

    @InlineOnly
    private static final <T> T apply(T t4, Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        block.invoke(t4);
        return t4;
    }

    @InlineOnly
    private static final <T, R> R let(T t4, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t4);
    }

    @InlineOnly
    private static final void repeat(int i5, Function1<? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        for (int i6 = 0; i6 < i5; i6++) {
            action.invoke(Integer.valueOf(i6));
        }
    }

    @InlineOnly
    private static final <T, R> R run(T t4, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t4);
    }

    @InlineOnly
    private static final <R> R run(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke();
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T takeIf(T t4, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t4).booleanValue()) {
            return t4;
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final <T> T takeUnless(T t4, Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (predicate.invoke(t4).booleanValue()) {
            return null;
        }
        return t4;
    }

    @InlineOnly
    private static final <T, R> R with(T t4, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return block.invoke(t4);
    }
}
