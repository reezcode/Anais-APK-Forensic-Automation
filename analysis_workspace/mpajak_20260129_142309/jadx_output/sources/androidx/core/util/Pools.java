package androidx.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class Pools {

    /* loaded from: classes8.dex */
    public interface Pool<T> {
        @Nullable
        T acquire();

        boolean release(@NonNull T t4);
    }

    /* loaded from: classes14.dex */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i5) {
            if (i5 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[i5];
        }

        private boolean isInPool(@NonNull T t4) {
            for (int i5 = 0; i5 < this.mPoolSize; i5++) {
                if (this.mPool[i5] == t4) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        public T acquire() {
            int i5 = this.mPoolSize;
            if (i5 <= 0) {
                return null;
            }
            int i6 = i5 - 1;
            Object[] objArr = this.mPool;
            T t4 = (T) objArr[i6];
            objArr[i6] = null;
            this.mPoolSize = i5 - 1;
            return t4;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t4) {
            if (isInPool(t4)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i5 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i5 >= objArr.length) {
                return false;
            }
            objArr[i5] = t4;
            this.mPoolSize = i5 + 1;
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public static class SynchronizedPool<T> extends SimplePool<T> {
        private final Object mLock;

        public SynchronizedPool(int i5) {
            super(i5);
            this.mLock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public T acquire() {
            T t4;
            synchronized (this.mLock) {
                t4 = (T) super.acquire();
            }
            return t4;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(@NonNull T t4) {
            boolean release;
            synchronized (this.mLock) {
                release = super.release(t4);
            }
            return release;
        }
    }

    private Pools() {
    }
}
