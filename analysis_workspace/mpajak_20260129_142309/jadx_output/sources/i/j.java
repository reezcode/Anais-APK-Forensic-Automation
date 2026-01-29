package i;

/* loaded from: classes14.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public final int f3243b = 4095;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3242a = new String[4096];

    public j() {
        a("$ref", 0, 4, 1185263);
        String str = f.a.f2680d;
        a(str, 0, str.length(), f.a.f2680d.hashCode());
    }

    public final String a(String str, int i5, int i6, int i7) {
        int i8 = this.f3243b & i7;
        String str2 = this.f3242a[i8];
        if (str2 != null) {
            if (i7 == str2.hashCode() && i6 == str2.length() && str.startsWith(str2, i5)) {
                return str2;
            }
            char[] cArr = new char[i6];
            str.getChars(i5, i6 + i5, cArr, 0);
            return new String(cArr);
        }
        if (i6 != str.length()) {
            char[] cArr2 = new char[i6];
            str.getChars(i5, i6 + i5, cArr2, 0);
            str = new String(cArr2);
        }
        String intern = str.intern();
        this.f3242a[i8] = intern;
        return intern;
    }

    public final String b(char[] cArr, int i5, int i6, int i7) {
        int i8 = this.f3243b & i7;
        String str = this.f3242a[i8];
        if (str == null) {
            String intern = new String(cArr, i5, i6).intern();
            this.f3242a[i8] = intern;
            return intern;
        }
        boolean z4 = false;
        if (i7 == str.hashCode() && i6 == str.length()) {
            int i9 = 0;
            while (true) {
                if (i9 >= i6) {
                    z4 = true;
                    break;
                }
                if (cArr[i5 + i9] != str.charAt(i9)) {
                    break;
                }
                i9++;
            }
        }
        return z4 ? str : new String(cArr, i5, i6);
    }
}
