package v1;

import android.widget.Checkable;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import v1.h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes8.dex */
public interface h<T extends h<T>> extends Checkable {

    /* loaded from: classes25.dex */
    public interface a<C> {
    }

    @IdRes
    int getId();

    void setInternalOnCheckedChangeListener(@Nullable a<T> aVar);
}
