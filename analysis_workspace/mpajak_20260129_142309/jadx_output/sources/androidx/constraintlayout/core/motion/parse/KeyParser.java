package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.io.PrintStream;

/* loaded from: classes14.dex */
public class KeyParser {

    /* loaded from: classes4.dex */
    public interface DataType {
        int get(int i5);
    }

    /* loaded from: classes17.dex */
    public interface Ids {
        int get(String str);
    }

    public static void main(String[] strArr) {
        parseAttributes("{frame:22,\ntarget:'widget1',\neasing:'easeIn',\ncurveFit:'spline',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:'32',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static TypedBundle parse(String str, Ids ids, DataType dataType) {
        PrintStream printStream;
        String str2;
        TypedBundle typedBundle = new TypedBundle();
        try {
            CLObject parse = CLParser.parse(str);
            int size = parse.size();
            for (int i5 = 0; i5 < size; i5++) {
                CLKey cLKey = (CLKey) parse.get(i5);
                String content = cLKey.content();
                CLElement value = cLKey.getValue();
                int i6 = ids.get(content);
                if (i6 == -1) {
                    System.err.println("unknown type " + content);
                } else {
                    int i7 = dataType.get(i6);
                    if (i7 != 1) {
                        if (i7 == 2) {
                            typedBundle.add(i6, value.getInt());
                            printStream = System.out;
                            str2 = "parse " + content + " INT_MASK > " + value.getInt();
                        } else if (i7 == 4) {
                            typedBundle.add(i6, value.getFloat());
                            printStream = System.out;
                            str2 = "parse " + content + " FLOAT_MASK > " + value.getFloat();
                        } else if (i7 == 8) {
                            typedBundle.add(i6, value.content());
                            printStream = System.out;
                            str2 = "parse " + content + " STRING_MASK > " + value.content();
                        }
                        printStream.println(str2);
                    } else {
                        typedBundle.add(i6, parse.getBoolean(i5));
                    }
                }
            }
        } catch (CLParsingException e5) {
            e5.printStackTrace();
        }
        return typedBundle;
    }

    public static TypedBundle parseAttributes(String str) {
        return parse(str, new Ids() { // from class: androidx.constraintlayout.core.motion.parse.b
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
            public final int get(String str2) {
                return androidx.constraintlayout.core.motion.utils.a.a(str2);
            }
        }, new DataType() { // from class: androidx.constraintlayout.core.motion.parse.a
            @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
            public final int get(int i5) {
                return androidx.constraintlayout.core.motion.utils.a.b(i5);
            }
        });
    }
}
