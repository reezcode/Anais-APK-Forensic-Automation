package androidx.tracing;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* loaded from: classes5.dex */
final class TraceApi29Impl {
    private TraceApi29Impl() {
    }

    public static void beginAsyncSection(@NonNull String str, int i5) {
        android.os.Trace.beginAsyncSection(str, i5);
    }

    public static void endAsyncSection(@NonNull String str, int i5) {
        android.os.Trace.endAsyncSection(str, i5);
    }

    public static void setCounter(@NonNull String str, int i5) {
        android.os.Trace.setCounter(str, i5);
    }
}
