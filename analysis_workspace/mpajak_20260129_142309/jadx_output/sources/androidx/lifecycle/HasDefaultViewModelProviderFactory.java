package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;

/* loaded from: classes10.dex */
public interface HasDefaultViewModelProviderFactory {
    @NonNull
    CreationExtras getDefaultViewModelCreationExtras();

    @NonNull
    ViewModelProvider.Factory getDefaultViewModelProviderFactory();
}
