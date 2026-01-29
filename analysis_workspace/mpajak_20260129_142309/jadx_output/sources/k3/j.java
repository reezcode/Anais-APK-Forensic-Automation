package k3;

import android.content.Context;
import com.superbock.bean.KInfo;
import g3.l;
import g3.n;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import z2.m;

/* loaded from: classes12.dex */
public final class j {
    public static void a(String str, String str2, String str3, Context context) {
        KInfo kInfo;
        l c5 = l.c();
        Objects.requireNonNull(c5);
        try {
            t2.g<KInfo, String> gVar = c5.f2975a;
            m<KInfo, String> g5 = gVar.c().g();
            g5.c("ty", 2);
            g5.b();
            g5.c("pk", str2);
            g5.b();
            g5.c("js", str);
            kInfo = gVar.j(g5.j());
        } catch (SQLException unused) {
            kInfo = null;
        }
        if (kInfo == null) {
            l.c().a(new KInfo(e3.d.a(), 2, str, str2, str3));
            f.s(context);
        }
    }

    public static boolean b(String str) {
        String[] split = str.split("\\s+");
        int length = split.length;
        if (!(length == 12 || length == 15 || length == 18 || length == 21 || length == 24)) {
            return false;
        }
        int length2 = split.length / 3;
        ArrayList arrayList = new ArrayList();
        for (String str2 : split) {
            int b5 = n.c().b(str2);
            if (b5 == -1) {
                return false;
            }
            arrayList.add(Integer.valueOf(b5));
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(String.format("%11s", Integer.toBinaryString(((Integer) it.next()).intValue())).replace(' ', '0'));
        }
        int length3 = sb.length() - length2;
        String substring = sb.substring(0, length3);
        String substring2 = sb.substring(length3);
        int length4 = substring.length() / 8;
        byte[] bArr = new byte[length4];
        int i5 = 0;
        while (i5 < length4) {
            int i6 = i5 + 1;
            String substring3 = substring.substring(i5 * 8, i6 * 8);
            if (substring3.length() > 1 && substring3.charAt(0) == '+') {
                substring3 = substring3.substring(1);
            }
            long parseLong = Long.parseLong(substring3, 2);
            if ((4294967295L & parseLong) != parseLong) {
                throw new NumberFormatException("Input " + substring3 + " in base 2 is not in the range of an unsigned integer");
            }
            bArr[i5] = (byte) parseLong;
            i5 = i6;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
            return ((digest == null || digest.length == 0) ? "" : String.format("%8s", Integer.toBinaryString(digest[0] & 255)).replace(' ', '0').substring(0, length2)).equals(substring2);
        } catch (NoSuchAlgorithmException e5) {
            throw new RuntimeException("SHA-256 algorithm not found", e5);
        }
    }
}
