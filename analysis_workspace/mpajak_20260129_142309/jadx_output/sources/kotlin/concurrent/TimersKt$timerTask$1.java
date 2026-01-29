package kotlin.concurrent;

import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes19.dex */
public final class TimersKt$timerTask$1 extends TimerTask {
    public final /* synthetic */ Function1<TimerTask, Unit> $action;

    /* JADX WARN: Multi-variable type inference failed */
    public TimersKt$timerTask$1(Function1<? super TimerTask, Unit> function1) {
        this.$action = function1;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.$action.invoke(this);
    }
}
