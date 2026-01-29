package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes7.dex */
public class FunctionReferenceImpl extends FunctionReference {
    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i5, Class cls, String str, String str2, int i6) {
        super(i5, CallableReference.NO_RECEIVER, cls, str, str2, i6);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReferenceImpl(int i5, Object obj, Class cls, String str, String str2, int i6) {
        super(i5, obj, cls, str, str2, i6);
    }

    public FunctionReferenceImpl(int i5, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i5, CallableReference.NO_RECEIVER, ((ClassBasedDeclarationContainer) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }
}
