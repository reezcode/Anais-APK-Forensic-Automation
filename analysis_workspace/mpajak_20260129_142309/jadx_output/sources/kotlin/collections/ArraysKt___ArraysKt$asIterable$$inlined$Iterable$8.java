package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes12.dex */
public final class ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8 implements Iterable<Boolean>, KMappedMarker {
    public final /* synthetic */ boolean[] $this_asIterable$inlined;

    public ArraysKt___ArraysKt$asIterable$$inlined$Iterable$8(boolean[] zArr) {
        this.$this_asIterable$inlined = zArr;
    }

    @Override // java.lang.Iterable
    public Iterator<Boolean> iterator() {
        return ArrayIteratorsKt.iterator(this.$this_asIterable$inlined);
    }
}
