package kotlin.text;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class SystemProperties {
    public static final SystemProperties INSTANCE = new SystemProperties();

    @JvmField
    public static final String LINE_SEPARATOR;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.checkNotNull(property);
        LINE_SEPARATOR = property;
    }

    private SystemProperties() {
    }
}
