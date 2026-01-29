package k2;

/* loaded from: classes9.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3832a;

    static {
        int i5;
        String property = System.getProperty("java.version");
        try {
            String[] split = property.split("[._]");
            i5 = Integer.parseInt(split[0]);
            if (i5 == 1 && split.length > 1) {
                i5 = Integer.parseInt(split[1]);
            }
        } catch (NumberFormatException unused) {
            i5 = -1;
        }
        if (i5 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i6 = 0; i6 < property.length(); i6++) {
                    char charAt = property.charAt(i6);
                    if (!Character.isDigit(charAt)) {
                        break;
                    }
                    sb.append(charAt);
                }
                i5 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i5 = -1;
            }
        }
        if (i5 == -1) {
            i5 = 6;
        }
        f3832a = i5;
    }
}
