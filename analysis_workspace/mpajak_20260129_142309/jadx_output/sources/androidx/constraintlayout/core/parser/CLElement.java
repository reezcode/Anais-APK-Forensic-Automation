package androidx.constraintlayout.core.parser;

import androidx.activity.d;
import java.io.PrintStream;

/* loaded from: classes12.dex */
public class CLElement {
    public static int BASE_INDENT = 2;
    public static int MAX_LINE = 80;
    private int line;
    public CLContainer mContainer;
    private final char[] mContent;
    public long start = -1;
    public long end = Long.MAX_VALUE;

    public CLElement(char[] cArr) {
        this.mContent = cArr;
    }

    public void addIndent(StringBuilder sb, int i5) {
        for (int i6 = 0; i6 < i5; i6++) {
            sb.append(' ');
        }
    }

    public String content() {
        String str = new String(this.mContent);
        long j5 = this.end;
        if (j5 != Long.MAX_VALUE) {
            long j6 = this.start;
            if (j5 >= j6) {
                return str.substring((int) j6, ((int) j5) + 1);
            }
        }
        long j7 = this.start;
        return str.substring((int) j7, ((int) j7) + 1);
    }

    public CLElement getContainer() {
        return this.mContainer;
    }

    public String getDebugName() {
        if (!CLParser.DEBUG) {
            return "";
        }
        return getStrClass() + " -> ";
    }

    public long getEnd() {
        return this.end;
    }

    public float getFloat() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getFloat();
        }
        return Float.NaN;
    }

    public int getInt() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).getInt();
        }
        return 0;
    }

    public int getLine() {
        return this.line;
    }

    public long getStart() {
        return this.start;
    }

    public String getStrClass() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean isDone() {
        return this.end != Long.MAX_VALUE;
    }

    public boolean isStarted() {
        return this.start > -1;
    }

    public boolean notStarted() {
        return this.start == -1;
    }

    public void setContainer(CLContainer cLContainer) {
        this.mContainer = cLContainer;
    }

    public void setEnd(long j5) {
        if (this.end != Long.MAX_VALUE) {
            return;
        }
        this.end = j5;
        if (CLParser.DEBUG) {
            PrintStream printStream = System.out;
            StringBuilder g5 = d.g("closing ");
            g5.append(hashCode());
            g5.append(" -> ");
            g5.append(this);
            printStream.println(g5.toString());
        }
        CLContainer cLContainer = this.mContainer;
        if (cLContainer != null) {
            cLContainer.add(this);
        }
    }

    public void setLine(int i5) {
        this.line = i5;
    }

    public void setStart(long j5) {
        this.start = j5;
    }

    public String toFormattedJSON(int i5, int i6) {
        return "";
    }

    public String toJSON() {
        return "";
    }

    public String toString() {
        long j5 = this.start;
        long j6 = this.end;
        if (j5 > j6 || j6 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.start + "-" + this.end + ")";
        }
        return getStrClass() + " (" + this.start + " : " + this.end + ") <<" + new String(this.mContent).substring((int) this.start, ((int) this.end) + 1) + ">>";
    }
}
