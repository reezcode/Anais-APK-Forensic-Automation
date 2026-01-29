package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@SuppressLint({"LambdaLast"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes18.dex */
public interface RemoteDispatcher<T> {
    void execute(@NonNull T t4, @NonNull IWorkManagerImplCallback iWorkManagerImplCallback);
}
