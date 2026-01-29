package kotlin;

import java.util.Objects;
import kotlin.jvm.JvmField;

@PublishedApi
/* loaded from: classes11.dex */
public final class _Assertions {

    @JvmField
    public static final boolean ENABLED = false;
    public static final _Assertions INSTANCE;

    static {
        _Assertions _assertions = new _Assertions();
        INSTANCE = _assertions;
        Objects.requireNonNull(_assertions);
    }

    private _Assertions() {
    }

    @PublishedApi
    public static /* synthetic */ void getENABLED$annotations() {
    }
}
