package kotlin.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlin.KotlinVersion;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.io.FilenameUtils;

/* loaded from: classes15.dex */
public final class PlatformImplementationsKt {

    @JvmField
    public static final PlatformImplementations IMPLEMENTATIONS;

    static {
        PlatformImplementations platformImplementations;
        Object newInstance;
        Object newInstance2;
        int javaVersion = getJavaVersion();
        if (javaVersion >= 65544 || javaVersion < 65536) {
            try {
                newInstance = JDK8PlatformImplementations.class.newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                    } catch (ClassCastException e5) {
                        ClassLoader classLoader = newInstance.getClass().getClassLoader();
                        ClassLoader classLoader2 = PlatformImplementations.class.getClassLoader();
                        if (Intrinsics.areEqual(classLoader, classLoader2)) {
                            throw e5;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e5);
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                Intrinsics.checkNotNullExpressionValue(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    if (newInstance3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    platformImplementations = (PlatformImplementations) newInstance3;
                } catch (ClassCastException e6) {
                    ClassLoader classLoader3 = newInstance3.getClass().getClassLoader();
                    ClassLoader classLoader4 = PlatformImplementations.class.getClassLoader();
                    if (Intrinsics.areEqual(classLoader3, classLoader4)) {
                        throw e6;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e6);
                }
            }
            if (newInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            platformImplementations = (PlatformImplementations) newInstance;
            IMPLEMENTATIONS = platformImplementations;
        }
        if (javaVersion >= 65543 || javaVersion < 65536) {
            try {
                try {
                    newInstance2 = JDK7PlatformImplementations.class.newInstance();
                    Intrinsics.checkNotNullExpressionValue(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                    } catch (ClassCastException e7) {
                        ClassLoader classLoader5 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader6 = PlatformImplementations.class.getClassLoader();
                        if (Intrinsics.areEqual(classLoader5, classLoader6)) {
                            throw e7;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e7);
                    }
                } catch (ClassNotFoundException unused3) {
                    Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    Intrinsics.checkNotNullExpressionValue(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        if (newInstance4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        platformImplementations = (PlatformImplementations) newInstance4;
                    } catch (ClassCastException e8) {
                        ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                        ClassLoader classLoader8 = PlatformImplementations.class.getClassLoader();
                        if (Intrinsics.areEqual(classLoader7, classLoader8)) {
                            throw e8;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e8);
                    }
                }
            } catch (ClassNotFoundException unused4) {
            }
            if (newInstance2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
            }
            platformImplementations = (PlatformImplementations) newInstance2;
            IMPLEMENTATIONS = platformImplementations;
        }
        platformImplementations = new PlatformImplementations();
        IMPLEMENTATIONS = platformImplementations;
    }

    @SinceKotlin(version = "1.2")
    @PublishedApi
    public static final boolean apiVersionIsAtLeast(int i5, int i6, int i7) {
        return KotlinVersion.CURRENT.isAtLeast(i5, i6, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    private static final /* synthetic */ <T> T castToBaseType(Object obj) {
        try {
            Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
            return obj;
        } catch (ClassCastException e5) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (Intrinsics.areEqual(classLoader, classLoader2)) {
                throw e5;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e5);
        }
    }

    private static final int getJavaVersion() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int h5 = StringsKt.h(property, FilenameUtils.EXTENSION_SEPARATOR, 0, 6);
        if (h5 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i5 = h5 + 1;
        int h6 = StringsKt.h(property, FilenameUtils.EXTENSION_SEPARATOR, i5, 4);
        if (h6 < 0) {
            h6 = property.length();
        }
        String substring = property.substring(0, h5);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(i5, h6);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
