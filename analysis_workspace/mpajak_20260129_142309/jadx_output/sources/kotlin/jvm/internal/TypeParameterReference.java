package kotlin.jvm.internal;

import java.util.List;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;

@SinceKotlin(version = "1.4")
/* loaded from: classes15.dex */
public final class TypeParameterReference implements KTypeParameter {
    public static final Companion Companion = new Companion(null);
    private volatile List<? extends KType> bounds;
    private final Object container;
    private final boolean isReified;
    private final String name;
    private final KVariance variance;

    /* loaded from: classes21.dex */
    public static final class Companion {

        /* loaded from: classes17.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[KVariance.values().length];
                try {
                    iArr[KVariance.INVARIANT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[KVariance.IN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[KVariance.OUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String toString(KTypeParameter typeParameter) {
            String str;
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i5 = WhenMappings.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i5 != 2) {
                str = i5 == 3 ? "out " : "in ";
                sb.append(typeParameter.getName());
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            sb.append(str);
            sb.append(typeParameter.getName());
            String sb22 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb22, "StringBuilder().apply(builderAction).toString()");
            return sb22;
        }
    }

    public TypeParameterReference(Object obj, String name, KVariance variance, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variance, "variance");
        this.container = obj;
        this.name = name;
        this.variance = variance;
        this.isReified = z4;
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeParameterReference) {
            TypeParameterReference typeParameterReference = (TypeParameterReference) obj;
            if (Intrinsics.areEqual(this.container, typeParameterReference.container) && Intrinsics.areEqual(getName(), typeParameterReference.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        return this.name;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        List list = this.bounds;
        if (list != null) {
            return list;
        }
        List<KType> listOf = CollectionsKt.listOf(Reflection.nullableTypeOf(Object.class));
        this.bounds = listOf;
        return listOf;
    }

    @Override // kotlin.reflect.KTypeParameter
    public KVariance getVariance() {
        return this.variance;
    }

    public int hashCode() {
        Object obj = this.container;
        return getName().hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return this.isReified;
    }

    public final void setUpperBounds(List<? extends KType> upperBounds) {
        Intrinsics.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.bounds == null) {
            this.bounds = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public String toString() {
        return Companion.toString(this);
    }
}
