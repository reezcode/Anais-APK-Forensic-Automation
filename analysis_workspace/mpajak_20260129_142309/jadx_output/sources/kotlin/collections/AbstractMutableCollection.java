package kotlin.collections;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableCollection;

@SinceKotlin(version = "1.1")
/* loaded from: classes16.dex */
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements KMutableCollection {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e5);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
