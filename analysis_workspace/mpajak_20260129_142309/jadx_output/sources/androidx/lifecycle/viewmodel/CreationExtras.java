package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public abstract class CreationExtras {
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    /* loaded from: classes13.dex */
    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(Key<T> key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* loaded from: classes2.dex */
    public interface Key<T> {
    }

    public abstract <T> T get(Key<T> key);

    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
