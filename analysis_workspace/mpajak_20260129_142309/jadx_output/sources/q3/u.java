package q3;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import m3.l0;
import q3.v;

/* loaded from: classes18.dex */
public class u<T extends v & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;

    /* renamed from: a, reason: collision with root package name */
    public T[] f4798a;

    @PublishedApi
    public final void a(T t4) {
        l0.a aVar = (l0.a) t4;
        aVar.a(this);
        T[] tArr = this.f4798a;
        if (tArr == null) {
            tArr = (T[]) new v[4];
            this.f4798a = tArr;
        } else if (this._size >= tArr.length) {
            Object[] copyOf = Arrays.copyOf(tArr, this._size * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            tArr = (T[]) ((v[]) copyOf);
            this.f4798a = tArr;
        }
        int i5 = this._size;
        this._size = i5 + 1;
        tArr[i5] = aVar;
        aVar.f4193c = i5;
        f(i5);
    }

    @PublishedApi
    public final T b() {
        T[] tArr = this.f4798a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final boolean c() {
        return this._size == 0;
    }

    @PublishedApi
    public final T d(int i5) {
        T[] tArr = this.f4798a;
        Intrinsics.checkNotNull(tArr);
        this._size--;
        if (i5 < this._size) {
            g(i5, this._size);
            int i6 = (i5 - 1) / 2;
            if (i5 > 0) {
                T t4 = tArr[i5];
                Intrinsics.checkNotNull(t4);
                T t5 = tArr[i6];
                Intrinsics.checkNotNull(t5);
                if (((Comparable) t4).compareTo(t5) < 0) {
                    g(i5, i6);
                    f(i6);
                }
            }
            while (true) {
                int i7 = (i5 * 2) + 1;
                if (i7 >= this._size) {
                    break;
                }
                T[] tArr2 = this.f4798a;
                Intrinsics.checkNotNull(tArr2);
                int i8 = i7 + 1;
                if (i8 < this._size) {
                    T t6 = tArr2[i8];
                    Intrinsics.checkNotNull(t6);
                    T t7 = tArr2[i7];
                    Intrinsics.checkNotNull(t7);
                    if (((Comparable) t6).compareTo(t7) < 0) {
                        i7 = i8;
                    }
                }
                T t8 = tArr2[i5];
                Intrinsics.checkNotNull(t8);
                T t9 = tArr2[i7];
                Intrinsics.checkNotNull(t9);
                if (((Comparable) t8).compareTo(t9) <= 0) {
                    break;
                }
                g(i5, i7);
                i5 = i7;
            }
        }
        T t10 = tArr[this._size];
        Intrinsics.checkNotNull(t10);
        t10.a(null);
        t10.b(-1);
        tArr[this._size] = null;
        return t10;
    }

    public final T e() {
        T d5;
        synchronized (this) {
            d5 = this._size > 0 ? d(0) : null;
        }
        return d5;
    }

    public final void f(int i5) {
        while (i5 > 0) {
            T[] tArr = this.f4798a;
            Intrinsics.checkNotNull(tArr);
            int i6 = (i5 - 1) / 2;
            T t4 = tArr[i6];
            Intrinsics.checkNotNull(t4);
            T t5 = tArr[i5];
            Intrinsics.checkNotNull(t5);
            if (((Comparable) t4).compareTo(t5) <= 0) {
                return;
            }
            g(i5, i6);
            i5 = i6;
        }
    }

    public final void g(int i5, int i6) {
        T[] tArr = this.f4798a;
        Intrinsics.checkNotNull(tArr);
        T t4 = tArr[i6];
        Intrinsics.checkNotNull(t4);
        T t5 = tArr[i5];
        Intrinsics.checkNotNull(t5);
        tArr[i5] = t4;
        tArr[i6] = t5;
        t4.b(i5);
        t5.b(i6);
    }
}
