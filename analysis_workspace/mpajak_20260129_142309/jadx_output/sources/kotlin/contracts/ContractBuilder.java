package kotlin.contracts;

import kotlin.Function;
import kotlin.SinceKotlin;
import kotlin.internal.ContractsDsl;

@SinceKotlin(version = "1.3")
@ContractsDsl
@ExperimentalContracts
/* loaded from: classes8.dex */
public interface ContractBuilder {

    /* loaded from: classes19.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ CallsInPlace callsInPlace$default(ContractBuilder contractBuilder, Function function, InvocationKind invocationKind, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: callsInPlace");
            }
            if ((i5 & 2) != 0) {
                invocationKind = InvocationKind.UNKNOWN;
            }
            return contractBuilder.callsInPlace(function, invocationKind);
        }
    }

    @ContractsDsl
    <R> CallsInPlace callsInPlace(Function<? extends R> function, InvocationKind invocationKind);

    @ContractsDsl
    Returns returns();

    @ContractsDsl
    Returns returns(Object obj);

    @ContractsDsl
    ReturnsNotNull returnsNotNull();
}
