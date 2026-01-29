package kotlin.collections;

import kotlin.jvm.JvmField;

/* loaded from: classes14.dex */
public final class CollectionSystemProperties {
    public static final CollectionSystemProperties INSTANCE = new CollectionSystemProperties();

    @JvmField
    public static final boolean brittleContainsOptimizationEnabled;

    static {
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        brittleContainsOptimizationEnabled = property != null ? Boolean.parseBoolean(property) : false;
    }

    private CollectionSystemProperties() {
    }
}
