package com.google.android.material.datepicker;

import android.os.Parcelable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Pair;
import java.util.Collection;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes24.dex */
public interface d<S> extends Parcelable {
    void a();

    @NonNull
    String b();

    @StyleRes
    int c();

    @NonNull
    Collection<Pair<Long, Long>> d();

    boolean f();

    @NonNull
    Collection<Long> g();

    @Nullable
    S h();

    @NonNull
    View i();
}
