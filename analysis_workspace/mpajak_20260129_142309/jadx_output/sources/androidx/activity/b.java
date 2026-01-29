package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f119b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f118a = i5;
        this.f119b = obj;
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle saveState() {
        Bundle m8savedStateProvider$lambda0;
        Bundle lambda$new$0;
        switch (this.f118a) {
            case 0:
                lambda$new$0 = ((ComponentActivity) this.f119b).lambda$new$0();
                return lambda$new$0;
            default:
                m8savedStateProvider$lambda0 = SavedStateHandle.m8savedStateProvider$lambda0((SavedStateHandle) this.f119b);
                return m8savedStateProvider$lambda0;
        }
    }
}
