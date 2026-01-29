package androidx.constraintlayout.core.parser;

import androidx.activity.d;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;

/* loaded from: classes22.dex */
public class CLKey extends CLContainer {
    private static ArrayList<String> sections;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        sections = arrayList;
        arrayList.add("ConstraintSets");
        sections.add("Variables");
        sections.add("Generate");
        sections.add(TypedValues.TransitionType.NAME);
        sections.add("KeyFrames");
        sections.add(TypedValues.AttributesType.NAME);
        sections.add("KeyPositions");
        sections.add("KeyCycles");
    }

    public CLKey(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(String str, CLElement cLElement) {
        CLKey cLKey = new CLKey(str.toCharArray());
        cLKey.setStart(0L);
        cLKey.setEnd(str.length() - 1);
        cLKey.set(cLElement);
        return cLKey;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLKey(cArr);
    }

    public String getName() {
        return content();
    }

    public CLElement getValue() {
        if (this.mElements.size() > 0) {
            return this.mElements.get(0);
        }
        return null;
    }

    public void set(CLElement cLElement) {
        if (this.mElements.size() > 0) {
            this.mElements.set(0, cLElement);
        } else {
            this.mElements.add(cLElement);
        }
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i5, int i6) {
        StringBuilder sb = new StringBuilder(getDebugName());
        addIndent(sb, i5);
        String content = content();
        if (this.mElements.size() <= 0) {
            return d.f(content, ": <> ");
        }
        sb.append(content);
        sb.append(": ");
        if (sections.contains(content)) {
            i6 = 3;
        }
        if (i6 <= 0) {
            String json = this.mElements.get(0).toJSON();
            if (json.length() + i5 < CLElement.MAX_LINE) {
                sb.append(json);
                return sb.toString();
            }
        }
        sb.append(this.mElements.get(0).toFormattedJSON(i5, i6 - 1));
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb;
        String str;
        if (this.mElements.size() > 0) {
            sb = new StringBuilder();
            sb.append(getDebugName());
            sb.append(content());
            sb.append(": ");
            str = this.mElements.get(0).toJSON();
        } else {
            sb = new StringBuilder();
            sb.append(getDebugName());
            sb.append(content());
            str = ": <> ";
        }
        sb.append(str);
        return sb.toString();
    }
}
