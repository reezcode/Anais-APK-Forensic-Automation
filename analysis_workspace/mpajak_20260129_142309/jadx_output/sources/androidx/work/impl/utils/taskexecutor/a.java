package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final /* synthetic */ class a {
    public static void a(TaskExecutor taskExecutor, @NonNull Runnable runnable) {
        taskExecutor.getSerialTaskExecutor().execute(runnable);
    }
}
