package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes7.dex */
public final class CollectionsKt__IterablesKt$Iterable$1<T> implements Iterable<T>, KMappedMarker {
    public final /* synthetic */ Function0<Iterator<T>> $iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionsKt__IterablesKt$Iterable$1(Function0<? extends Iterator<? extends T>> function0) {
        this.$iterator = function0;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.$iterator.invoke();
    }
}
