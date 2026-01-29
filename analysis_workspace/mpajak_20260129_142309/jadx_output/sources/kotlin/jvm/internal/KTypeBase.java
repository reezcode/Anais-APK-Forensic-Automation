package kotlin.jvm.internal;

import java.lang.reflect.Type;
import kotlin.SinceKotlin;
import kotlin.reflect.KType;

@SinceKotlin(version = "1.4")
/* loaded from: classes14.dex */
public interface KTypeBase extends KType {
    Type getJavaType();
}
