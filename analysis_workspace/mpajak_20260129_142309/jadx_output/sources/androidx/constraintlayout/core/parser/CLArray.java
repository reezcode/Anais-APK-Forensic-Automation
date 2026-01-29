package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* loaded from: classes11.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i5, int i6) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i6 > 0 || json.length() + i5 >= CLElement.MAX_LINE) {
            sb.append("[\n");
            Iterator<CLElement> it = this.mElements.iterator();
            boolean z4 = true;
            while (it.hasNext()) {
                CLElement next = it.next();
                if (z4) {
                    z4 = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.BASE_INDENT + i5);
                sb.append(next.toFormattedJSON(CLElement.BASE_INDENT + i5, i6 - 1));
            }
            sb.append("\n");
            addIndent(sb, i5);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z4 = true;
        for (int i5 = 0; i5 < this.mElements.size(); i5++) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i5).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
