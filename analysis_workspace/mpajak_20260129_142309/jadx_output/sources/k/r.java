package k;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.sql.Clob;
import java.sql.SQLException;

/* loaded from: classes4.dex */
public final class r implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3740a = new r();

    @Override // k.q0
    public final void d(g0 g0Var, Object obj, Object obj2, Type type, int i5) {
        try {
            if (obj == null) {
                g0Var.s();
                return;
            }
            Reader characterStream = ((Clob) obj).getCharacterStream();
            StringBuilder sb = new StringBuilder();
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int read = characterStream.read(cArr, 0, 2048);
                    if (read < 0) {
                        String sb2 = sb.toString();
                        characterStream.close();
                        g0Var.r(sb2);
                        return;
                    }
                    sb.append(cArr, 0, read);
                }
            } catch (Exception e5) {
                throw new f.d("read string from reader error", e5);
            }
        } catch (SQLException e6) {
            throw new IOException("write clob error", e6);
        }
    }
}
