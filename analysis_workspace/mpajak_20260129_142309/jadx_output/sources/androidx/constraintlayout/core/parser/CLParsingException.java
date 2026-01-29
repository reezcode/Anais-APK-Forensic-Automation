package androidx.constraintlayout.core.parser;

import androidx.activity.d;
import androidx.appcompat.view.a;
import androidx.core.os.EnvironmentCompat;

/* loaded from: classes2.dex */
public class CLParsingException extends Exception {
    private final String mElementClass;
    private final int mLineNumber;
    private final String mReason;

    public CLParsingException(String str, CLElement cLElement) {
        int i5;
        this.mReason = str;
        if (cLElement != null) {
            this.mElementClass = cLElement.getStrClass();
            i5 = cLElement.getLine();
        } else {
            this.mElementClass = EnvironmentCompat.MEDIA_UNKNOWN;
            i5 = 0;
        }
        this.mLineNumber = i5;
    }

    public String reason() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mReason);
        sb.append(" (");
        sb.append(this.mElementClass);
        sb.append(" at line ");
        return a.h(sb, this.mLineNumber, ")");
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder g5 = d.g("CLParsingException (");
        g5.append(hashCode());
        g5.append(") : ");
        g5.append(reason());
        return g5.toString();
    }
}
