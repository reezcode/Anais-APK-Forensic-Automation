package androidx.work.impl.constraints;

import androidx.annotation.MainThread;

/* loaded from: classes5.dex */
public interface ConstraintListener<T> {
    @MainThread
    void onConstraintChanged(T t4);
}
