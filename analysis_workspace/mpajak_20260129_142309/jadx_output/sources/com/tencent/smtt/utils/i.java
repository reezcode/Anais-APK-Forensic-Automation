package com.tencent.smtt.utils;

import java.security.KeyFactory;
import java.security.Provider;
import java.security.Security;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f2412a = "0123456789abcdef".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static i f2413b;

    /* renamed from: c, reason: collision with root package name */
    private String f2414c;

    /* renamed from: d, reason: collision with root package name */
    private String f2415d;

    /* renamed from: e, reason: collision with root package name */
    private String f2416e;

    private i() {
        int nextInt = new Random().nextInt(89999999) + 10000000;
        int nextInt2 = new Random().nextInt(89999999) + 10000000;
        this.f2416e = String.valueOf(nextInt);
        this.f2414c = this.f2416e + String.valueOf(nextInt2);
    }

    public static synchronized i a() {
        i iVar;
        synchronized (i.class) {
            if (f2413b == null) {
                f2413b = new i();
            }
            iVar = f2413b;
        }
        return iVar;
    }

    private String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = i5 * 2;
            char[] cArr2 = f2412a;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }

    public byte[] a(byte[] bArr) {
        return com.tencent.smtt.sdk.stat.a.a(this.f2416e.getBytes(), bArr, 1);
    }

    public void b() {
        Security.addProvider((Provider) Class.forName("com.android.org.bouncycastle.jce.provider.BouncyCastleProvider", true, ClassLoader.getSystemClassLoader()).newInstance());
    }

    public String c() {
        if (this.f2415d == null) {
            byte[] bytes = this.f2414c.getBytes();
            Cipher cipher = null;
            try {
                try {
                    cipher = Cipher.getInstance("RSA/ECB/NoPadding");
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } catch (Exception unused) {
                b();
                cipher = Cipher.getInstance("RSA/ECB/NoPadding");
            }
            cipher.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(android.util.Base64.decode("MCwwDQYJKoZIhvcNAQEBBQADGwAwGAIRAMRB/Q0hTCD+XtnQhpQJefUCAwEAAQ==".getBytes(), 0))));
            this.f2415d = b(cipher.doFinal(bytes));
        }
        return this.f2415d;
    }
}
