package v1;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v1.h;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UiThread
/* loaded from: classes19.dex */
public final class b<T extends h<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<Integer, T> f5559a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Set<Integer> f5560b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public a f5561c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5562d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5563e;

    /* loaded from: classes15.dex */
    public interface a {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean a(@NonNull h<T> hVar) {
        int id = hVar.getId();
        if (this.f5560b.contains(Integer.valueOf(id))) {
            return false;
        }
        h<T> hVar2 = (h) this.f5559a.get(Integer.valueOf(c()));
        if (hVar2 != null) {
            e(hVar2, false);
        }
        boolean add = this.f5560b.add(Integer.valueOf(id));
        if (!hVar.isChecked()) {
            hVar.setChecked(true);
        }
        return add;
    }

    @NonNull
    public final List<Integer> b(@NonNull ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f5560b);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if ((childAt instanceof h) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    @IdRes
    public final int c() {
        if (!this.f5562d || this.f5560b.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f5560b.iterator().next()).intValue();
    }

    public final void d() {
        a aVar = this.f5561c;
        if (aVar != null) {
            new HashSet(this.f5560b);
            ChipGroup chipGroup = ((com.google.android.material.chip.b) aVar).f914a;
            ChipGroup.d dVar = chipGroup.f881h;
            if (dVar != null) {
                chipGroup.f882i.b(chipGroup);
                ChipGroup.a aVar2 = (ChipGroup.a) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f882i.f5562d) {
                    ChipGroup.c cVar = aVar2.f885a;
                    chipGroup2.getCheckedChipId();
                    cVar.a();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashSet, java.util.Set<java.lang.Integer>] */
    public final boolean e(@NonNull h<T> hVar, boolean z4) {
        int id = hVar.getId();
        if (!this.f5560b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z4 && this.f5560b.size() == 1 && this.f5560b.contains(Integer.valueOf(id))) {
            hVar.setChecked(true);
            return false;
        }
        boolean remove = this.f5560b.remove(Integer.valueOf(id));
        if (hVar.isChecked()) {
            hVar.setChecked(false);
        }
        return remove;
    }
}
