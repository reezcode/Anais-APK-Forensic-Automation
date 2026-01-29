package kotlin.reflect;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class KClassesImplKt {
    public static final String getQualifiedOrSimpleName(KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return kClass.getQualifiedName();
    }
}
