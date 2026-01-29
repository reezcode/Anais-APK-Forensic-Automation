package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes17.dex */
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3 implements Iterable<Short>, KMappedMarker {
    public final /* synthetic */ short[] $this_asIterable$inlined;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$3(short[] sArr) {
        this.$this_asIterable$inlined = sArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Short> iterator() {
        return ArrayIteratorsKt.iterator(this.$this_asIterable$inlined);
    }
}
