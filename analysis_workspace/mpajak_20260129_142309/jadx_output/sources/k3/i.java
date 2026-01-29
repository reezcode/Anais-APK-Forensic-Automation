package k3;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import k.j0;
import kotlin.jvm.internal.Intrinsics;
import s3.p;
import s3.w;
import s3.y;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f3901a = h3.a.a(d1.c.f("+3YHfs7VdJGzxblNMt4BzvHoTyGsBJyf43f9JQAFOWJIOY6RIwDqyq+4kJSfGnMG", h3.a.a("a41c3402eb0b4983a325a12cde17fc96m2p6")));

    public static void a(f.e eVar, s3.e eVar2) {
        String i5 = j0.i();
        String l5 = eVar.l();
        byte[] bArr = f3901a;
        byte[] bytes = l5.getBytes();
        try {
            if (bArr.length != 16) {
                bArr = Arrays.copyOfRange(bArr, 0, 16);
            }
            KeyGenerator.getInstance("AES");
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(d1.c.f2475g));
            byte[] data = cipher.doFinal(bytes);
            f4.i iVar = f4.i.f2860e;
            Intrinsics.checkNotNullParameter(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
            String a5 = new f4.i(copyOf).a();
            w wVar = b.f3862a;
            p.a aVar = new p.a();
            aVar.a("data", a5);
            aVar.a("deptId", "a41c3402eb0b4983a325a12cde17fc96");
            w a6 = b.a();
            y.a aVar2 = new y.a();
            aVar2.e(i5);
            p body = new p(aVar.f5269a, aVar.f5270b);
            Intrinsics.checkNotNullParameter(body, "body");
            aVar2.c("POST", body);
            aVar2.b("User-Agent", "WebCtrl/Android");
            ((w3.e) a6.a(aVar2.a())).e(eVar2);
        } catch (Exception e5) {
            throw new RuntimeException(e5);
        }
    }
}
