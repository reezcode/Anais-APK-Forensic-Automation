package b4;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* loaded from: classes17.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f444a = new d();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int min;
        Intrinsics.checkNotNullParameter(record, "record");
        c cVar = c.f443c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        int i5 = record.getLevel().intValue() > Level.INFO.intValue() ? 5 : record.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        Throwable thrown = record.getThrown();
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = c.f442b.get(loggerName);
        if (str == null) {
            str = StringsKt___StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(str, i5)) {
            if (thrown != null) {
                StringBuilder e5 = androidx.activity.result.a.e(message, "\n");
                e5.append(Log.getStackTraceString(thrown));
                message = e5.toString();
            }
            int i6 = 0;
            int length = message.length();
            while (i6 < length) {
                int h5 = StringsKt.h(message, '\n', i6, 4);
                if (h5 == -1) {
                    h5 = length;
                }
                while (true) {
                    min = Math.min(h5, i6 + 4000);
                    String substring = message.substring(i6, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i5, str, substring);
                    if (min >= h5) {
                        break;
                    } else {
                        i6 = min;
                    }
                }
                i6 = min + 1;
            }
        }
    }
}
