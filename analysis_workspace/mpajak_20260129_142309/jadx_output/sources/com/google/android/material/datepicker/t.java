package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public final class t<S> extends z<S> {

    /* renamed from: c, reason: collision with root package name */
    @StyleRes
    public int f1014c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public d<S> f1015d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public a f1016e;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f1014c = bundle.getInt("THEME_RES_ID_KEY");
        this.f1015d = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f1016e = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f1014c));
        return this.f1015d.i();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f1014c);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f1015d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f1016e);
    }
}
