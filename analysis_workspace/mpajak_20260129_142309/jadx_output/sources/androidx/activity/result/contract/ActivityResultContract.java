package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes15.dex */
public abstract class ActivityResultContract<I, O> {

    /* loaded from: classes22.dex */
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t4) {
            this.value = t4;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public abstract Intent createIntent(Context context, I i5);

    public SynchronousResult<O> getSynchronousResult(Context context, I i5) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O parseResult(int i5, Intent intent);
}
