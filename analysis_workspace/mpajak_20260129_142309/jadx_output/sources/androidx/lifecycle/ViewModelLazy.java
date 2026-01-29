package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes24.dex */
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {
    private VM cached;
    private final Function0<CreationExtras> extrasProducer;
    private final Function0<ViewModelProvider.Factory> factoryProducer;
    private final Function0<ViewModelStore> storeProducer;
    private final KClass<VM> viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ViewModelLazy(KClass<VM> viewModelClass, Function0<? extends ViewModelStore> storeProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public ViewModelLazy(KClass<VM> viewModelClass, Function0<? extends ViewModelStore> storeProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer, Function0<? extends CreationExtras> extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    public /* synthetic */ ViewModelLazy(KClass kClass, Function0 function0, Function0 function02, Function0 function03, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(kClass, function0, function02, (i5 & 8) != 0 ? new Function0<CreationExtras.Empty>() { // from class: androidx.lifecycle.ViewModelLazy.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras.Empty invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : function03);
    }

    @Override // kotlin.Lazy
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(JvmClassMappingKt.getJavaClass((KClass) this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }
}
