package androidx.constraintlayout.core;

/* loaded from: classes9.dex */
final class Pools {
    private static final boolean DEBUG = false;

    /* loaded from: classes25.dex */
    public interface Pool<T> {
        T acquire();

        boolean release(T t4);

        void releaseAll(T[] tArr, int i5);
    }

    /* loaded from: classes12.dex */
    public static class SimplePool<T> implements Pool<T> {
        private final Object[] mPool;
        private int mPoolSize;

        public SimplePool(int i5) {
            if (i5 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.mPool = new Object[i5];
        }

        private boolean isInPool(T t4) {
            for (int i5 = 0; i5 < this.mPoolSize; i5++) {
                if (this.mPool[i5] == t4) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
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

        @Override // androidx.constraintlayout.core.Pools.Pool
        public boolean release(T t4) {
            int i5 = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i5 >= objArr.length) {
                return false;
            }
            objArr[i5] = t4;
            this.mPoolSize = i5 + 1;
            return true;
        }

        @Override // androidx.constraintlayout.core.Pools.Pool
        public void releaseAll(T[] tArr, int i5) {
            if (i5 > tArr.length) {
                i5 = tArr.length;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                T t4 = tArr[i6];
                int i7 = this.mPoolSize;
                Object[] objArr = this.mPool;
                if (i7 < objArr.length) {
                    objArr[i7] = t4;
                    this.mPoolSize = i7 + 1;
                }
            }
        }
    }

    private Pools() {
    }
}
