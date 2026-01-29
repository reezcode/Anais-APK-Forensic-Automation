package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.b;
import com.bumptech.glide.i;
import e0.n;
import e0.o;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Deprecated
/* loaded from: classes11.dex */
public class RequestManagerFragment extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final e0.a f630b;

    /* renamed from: c, reason: collision with root package name */
    public final a f631c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<RequestManagerFragment> f632d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public i f633e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public RequestManagerFragment f634f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public Fragment f635g;

    /* loaded from: classes25.dex */
    public class a implements o {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        e0.a aVar = new e0.a();
        this.f631c = new a();
        this.f632d = new HashSet();
        this.f630b = aVar;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.HashSet, java.util.Set<com.bumptech.glide.manager.RequestManagerFragment>] */
    public final void a(@NonNull Activity activity) {
        b();
        n nVar = b.b(activity).f534g;
        Objects.requireNonNull(nVar);
        RequestManagerFragment h5 = nVar.h(activity.getFragmentManager(), null);
        this.f634f = h5;
        if (equals(h5)) {
            return;
        }
        this.f634f.f632d.add(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<com.bumptech.glide.manager.RequestManagerFragment>] */
    public final void b() {
        RequestManagerFragment requestManagerFragment = this.f634f;
        if (requestManagerFragment != null) {
            requestManagerFragment.f632d.remove(this);
            this.f634f = null;
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e5) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e5);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f630b.c();
        b();
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        b();
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f630b.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f630b.e();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f635g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
