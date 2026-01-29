package kotlin.collections;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableList;

@SinceKotlin(version = "1.1")
/* loaded from: classes8.dex */
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> implements KMutableList {
    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i5, E e5);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int i5) {
        return removeAt(i5);
    }

    public abstract E removeAt(int i5);

    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i5, E e5);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }
}
