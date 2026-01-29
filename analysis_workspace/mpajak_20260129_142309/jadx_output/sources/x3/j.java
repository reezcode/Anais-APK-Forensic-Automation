package x3;

import java.net.ProtocolException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import s3.x;

/* loaded from: classes22.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final a f5953d = new a();

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public final x f5954a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public final int f5955b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public final String f5956c;

    /* loaded from: classes9.dex */
    public static final class a {
        public final j a(String statusLine) {
            String str;
            x xVar = x.HTTP_1_0;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            int i5 = 9;
            if (StringsKt.u(statusLine, "HTTP/1.")) {
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(androidx.activity.d.f("Unexpected status line: ", statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt != 1) {
                        throw new ProtocolException(androidx.activity.d.f("Unexpected status line: ", statusLine));
                    }
                    xVar = x.HTTP_1_1;
                }
            } else {
                if (!StringsKt.u(statusLine, "ICY ")) {
                    throw new ProtocolException(androidx.activity.d.f("Unexpected status line: ", statusLine));
                }
                i5 = 4;
            }
            int i6 = i5 + 3;
            if (statusLine.length() < i6) {
                throw new ProtocolException(androidx.activity.d.f("Unexpected status line: ", statusLine));
            }
            try {
                String substring = statusLine.substring(i5, i6);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i6) {
                    str = "";
                } else {
                    if (statusLine.charAt(i6) != ' ') {
                        throw new ProtocolException(androidx.activity.d.f("Unexpected status line: ", statusLine));
                    }
                    str = statusLine.substring(i5 + 4);
                    Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.String).substring(startIndex)");
                }
                return new j(xVar, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(androidx.activity.d.f("Unexpected status line: ", statusLine));
            }
        }
    }

    public j(x protocol, int i5, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f5954a = protocol;
        this.f5955b = i5;
        this.f5956c = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5954a == x.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f5955b);
        sb.append(' ');
        sb.append(this.f5956c);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
