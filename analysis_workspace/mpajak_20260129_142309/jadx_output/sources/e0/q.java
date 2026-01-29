package e0;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes13.dex */
public class q extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final e0.a f2529b;

    /* renamed from: c, reason: collision with root package name */
    public final a f2530c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<q> f2531d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public q f2532e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public com.bumptech.glide.i f2533f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public Fragment f2534g;

    /* loaded from: classes15.dex */
    public class a implements o {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + q.this + "}";
        }
    }

    public q() {
        e0.a aVar = new e0.a();
        this.f2530c = new a();
        this.f2531d = new HashSet();
        this.f2529b = aVar;
    }

    @Nullable
    public final Fragment a() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f2534g;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.HashSet, java.util.Set<e0.q>] */
    public final void b(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        c();
        q i5 = com.bumptech.glide.b.b(context).f534g.i(fragmentManager, null);
        this.f2532e = i5;
        if (equals(i5)) {
            return;
        }
        this.f2532e.f2531d.add(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<e0.q>] */
    public final void c() {
        q qVar = this.f2532e;
        if (qVar != null) {
            qVar.f2531d.remove(this);
            this.f2532e = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                b(getContext(), fragmentManager);
            } catch (IllegalStateException e5) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e5);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f2529b.c();
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f2534g = null;
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f2529b.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f2529b.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        return super.toString() + "{parent=" + a() + "}";
    }
}
