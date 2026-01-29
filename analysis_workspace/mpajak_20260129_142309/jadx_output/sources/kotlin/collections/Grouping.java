package kotlin.collections;

import java.util.Iterator;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.1")
/* loaded from: classes25.dex */
public interface Grouping<T, K> {
    K keyOf(T t4);

    Iterator<T> sourceIterator();
}
