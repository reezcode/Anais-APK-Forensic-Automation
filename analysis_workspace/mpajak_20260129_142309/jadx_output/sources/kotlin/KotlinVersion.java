package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.apache.commons.io.FilenameUtils;

@SinceKotlin(version = "1.1")
/* loaded from: classes2.dex */
public final class KotlinVersion implements Comparable<KotlinVersion> {
    public static final int MAX_COMPONENT_VALUE = 255;
    private final int major;
    private final int minor;
    private final int patch;
    private final int version;
    public static final Companion Companion = new Companion(null);

    @JvmField
    public static final KotlinVersion CURRENT = KotlinVersionCurrentValue.get();

    /* loaded from: classes18.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KotlinVersion(int i5, int i6) {
        this(i5, i6, 0);
    }

    public KotlinVersion(int i5, int i6, int i7) {
        this.major = i5;
        this.minor = i6;
        this.patch = i7;
        this.version = versionOf(i5, i6, i7);
    }

    private final int versionOf(int i5, int i6, int i7) {
        boolean z4 = false;
        if (new IntRange(0, 255).contains(i5) && new IntRange(0, 255).contains(i6) && new IntRange(0, 255).contains(i7)) {
            z4 = true;
        }
        if (z4) {
            return (i5 << 16) + (i6 << 8) + i7;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i5 + FilenameUtils.EXTENSION_SEPARATOR + i6 + FilenameUtils.EXTENSION_SEPARATOR + i7).toString());
    }

    @Override // java.lang.Comparable
    public int compareTo(KotlinVersion other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.version - other.version;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        KotlinVersion kotlinVersion = obj instanceof KotlinVersion ? (KotlinVersion) obj : null;
        return kotlinVersion != null && this.version == kotlinVersion.version;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return this.version;
    }

    public final boolean isAtLeast(int i5, int i6) {
        int i7 = this.major;
        return i7 > i5 || (i7 == i5 && this.minor >= i6);
    }

    public final boolean isAtLeast(int i5, int i6, int i7) {
        int i8;
        int i9 = this.major;
        return i9 > i5 || (i9 == i5 && ((i8 = this.minor) > i6 || (i8 == i6 && this.patch >= i7)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.major);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.minor);
        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        sb.append(this.patch);
        return sb.toString();
    }
}
