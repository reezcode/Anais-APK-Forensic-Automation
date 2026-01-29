package kotlin.reflect;

import kotlin.SinceKotlin;

/* loaded from: classes10.dex */
public interface KParameter extends KAnnotatedElement {

    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isVararg$annotations() {
        }
    }

    /* loaded from: classes19.dex */
    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE
    }

    int getIndex();

    Kind getKind();

    String getName();

    KType getType();

    boolean isOptional();

    boolean isVararg();
}
