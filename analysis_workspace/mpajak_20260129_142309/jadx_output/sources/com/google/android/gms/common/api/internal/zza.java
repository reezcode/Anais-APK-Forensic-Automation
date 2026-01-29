package com.google.android.gms.common.api.internal;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import r0.d;

/* loaded from: classes5.dex */
public final class zza extends Fragment implements d {

    /* renamed from: b, reason: collision with root package name */
    public Map<String, LifecycleCallback> f648b = new ArrayMap();

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator<LifecycleCallback> it = this.f648b.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i5, int i6, Intent intent) {
        super.onActivityResult(i5, i6, intent);
        Iterator<LifecycleCallback> it = this.f648b.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry<String, LifecycleCallback> entry : this.f648b.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle.getBundle(entry.getKey());
            }
            Objects.requireNonNull(value);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Iterator<LifecycleCallback> it = this.f648b.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Iterator<LifecycleCallback> it = this.f648b.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f648b.entrySet()) {
            Bundle bundle2 = new Bundle();
            Objects.requireNonNull(entry.getValue());
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Iterator<LifecycleCallback> it = this.f648b.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Iterator<LifecycleCallback> it = this.f648b.values().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }
}
