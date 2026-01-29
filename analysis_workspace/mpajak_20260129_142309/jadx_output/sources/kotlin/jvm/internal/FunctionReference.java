package kotlin.jvm.internal;

import androidx.activity.d;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* loaded from: classes4.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {
    private final int arity;

    @SinceKotlin(version = "1.4")
    private final int flags;

    public FunctionReference(int i5) {
        this(i5, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @SinceKotlin(version = "1.1")
    public FunctionReference(int i5, Object obj) {
        this(i5, obj, null, null, null, 0);
    }

    @SinceKotlin(version = "1.4")
    public FunctionReference(int i5, Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.arity = i5;
        this.flags = i6 >> 1;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KCallable computeReflected() {
        return Reflection.function(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && Intrinsics.areEqual(getBoundReceiver(), functionReference.getBoundReceiver()) && Intrinsics.areEqual(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin(version = "1.1")
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @SinceKotlin(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder g5 = d.g("function ");
        g5.append(getName());
        g5.append(Reflection.REFLECTION_NOT_AVAILABLE);
        return g5.toString();
    }
}
