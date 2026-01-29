package kotlin.reflect;

import kotlin.SinceKotlin;

/* loaded from: classes21.dex */
public interface KProperty<V> extends KCallable<V> {

    /* loaded from: classes3.dex */
    public interface Accessor<V> {
        KProperty<V> getProperty();
    }

    /* loaded from: classes24.dex */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isConst$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isLateinit$annotations() {
        }
    }

    public interface Getter<V> extends Accessor<V>, KFunction<V> {
    }

    Getter<V> getGetter();

    boolean isConst();

    boolean isLateinit();
}
