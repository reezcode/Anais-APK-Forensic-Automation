package f;

/* loaded from: classes11.dex */
public enum m {
    CamelCase,
    /* JADX INFO: Fake field, exist only in values array */
    PascalCase,
    /* JADX INFO: Fake field, exist only in values array */
    SnakeCase,
    /* JADX INFO: Fake field, exist only in values array */
    KebabCase;

    public final String a(String str) {
        int ordinal = ordinal();
        int i5 = 0;
        if (ordinal == 0) {
            char charAt = str.charAt(0);
            if (charAt < 'A' || charAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        }
        if (ordinal == 1) {
            char charAt2 = str.charAt(0);
            if (charAt2 < 'a' || charAt2 > 'z') {
                return str;
            }
            char[] charArray2 = str.toCharArray();
            charArray2[0] = (char) (charArray2[0] - ' ');
            return new String(charArray2);
        }
        if (ordinal == 2) {
            StringBuilder sb = new StringBuilder();
            while (i5 < str.length()) {
                char charAt3 = str.charAt(i5);
                if (charAt3 >= 'A' && charAt3 <= 'Z') {
                    charAt3 = (char) (charAt3 + ' ');
                    if (i5 > 0) {
                        sb.append('_');
                    }
                }
                sb.append(charAt3);
                i5++;
            }
            return sb.toString();
        }
        if (ordinal != 3) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i5 < str.length()) {
            char charAt4 = str.charAt(i5);
            if (charAt4 >= 'A' && charAt4 <= 'Z') {
                charAt4 = (char) (charAt4 + ' ');
                if (i5 > 0) {
                    sb2.append('-');
                }
            }
            sb2.append(charAt4);
            i5++;
        }
        return sb2.toString();
    }
}
