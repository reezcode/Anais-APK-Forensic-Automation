package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* loaded from: classes16.dex */
public abstract class z<S> extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<y<S>> f1038b = new LinkedHashSet<>();

    public boolean a(y<S> yVar) {
        return this.f1038b.add(yVar);
    }
}
