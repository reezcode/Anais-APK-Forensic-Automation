package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin(version = "1.1")
/* loaded from: classes21.dex */
public abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E> {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean setEquals$kotlin_stdlib(Set<?> c5, Set<?> other) {
            Intrinsics.checkNotNullParameter(c5, "c");
            Intrinsics.checkNotNullParameter(other, "other");
            if (c5.size() != other.size()) {
                return false;
            }
            return c5.containsAll(other);
        }

        public final int unorderedHashCode$kotlin_stdlib(Collection<?> c5) {
            Intrinsics.checkNotNullParameter(c5, "c");
            Iterator<?> it = c5.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i5 += next != null ? next.hashCode() : 0;
            }
            return i5;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return Companion.setEquals$kotlin_stdlib(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.unorderedHashCode$kotlin_stdlib(this);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
