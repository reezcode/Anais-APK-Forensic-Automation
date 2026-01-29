package kotlin.reflect;

import java.util.List;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.1")
/* loaded from: classes10.dex */
public interface KTypeParameter extends KClassifier {
    String getName();

    List<KType> getUpperBounds();

    KVariance getVariance();

    boolean isReified();
}
