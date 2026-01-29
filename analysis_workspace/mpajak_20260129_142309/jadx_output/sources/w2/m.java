package w2;

import java.sql.SQLException;

/* loaded from: classes18.dex */
public class m extends a {

    /* renamed from: d, reason: collision with root package name */
    public static final m f5778d = new m();

    public m() {
        super(5, new Class[]{Character.class});
    }

    public m(Class[] clsArr) {
        super(5, clsArr);
    }

    @Override // v2.f
    public final Object d(c3.e eVar, int i5) {
        String string = ((q2.d) eVar).f4744a.getString(i5);
        char c5 = 0;
        if (string != null && string.length() != 0) {
            if (string.length() != 1) {
                throw new SQLException(androidx.appcompat.widget.a.g("More than 1 character stored in database column: ", i5));
            }
            c5 = string.charAt(0);
        }
        return Character.valueOf(c5);
    }

    @Override // v2.f
    public final Object x(v2.g gVar, String str) {
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new SQLException("Problems with field " + gVar + ", default string to long for Character: '" + str + "'");
    }
}
