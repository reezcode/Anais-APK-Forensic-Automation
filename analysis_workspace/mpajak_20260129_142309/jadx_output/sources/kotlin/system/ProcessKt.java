package kotlin.system;

import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;

@JvmName(name = "ProcessKt")
/* loaded from: classes3.dex */
public final class ProcessKt {
    @InlineOnly
    private static final Void exitProcess(int i5) {
        System.exit(i5);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}
