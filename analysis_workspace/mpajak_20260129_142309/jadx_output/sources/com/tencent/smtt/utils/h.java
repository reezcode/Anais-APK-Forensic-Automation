package com.tencent.smtt.utils;

import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

/* loaded from: classes17.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static String f2406b = "";

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f2407c;

    /* renamed from: g, reason: collision with root package name */
    private static String f2409g;

    /* renamed from: d, reason: collision with root package name */
    private Cipher f2410d;

    /* renamed from: e, reason: collision with root package name */
    private Cipher f2411e;

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2405a = "0123456789abcdef".toCharArray();

    /* renamed from: f, reason: collision with root package name */
    private static h f2408f = null;

    private h() {
        this.f2410d = null;
        this.f2411e = null;
        f2409g = String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000) + String.valueOf(new Random().nextInt(89999999) + 10000000);
        String str = "00000000";
        for (int i5 = 0; i5 < 12; i5++) {
            StringBuilder g5 = androidx.activity.d.g(str);
            g5.append(String.valueOf(new Random().nextInt(89999999) + 10000000));
            str = g5.toString();
        }
        StringBuilder g6 = androidx.activity.d.g(str);
        g6.append(f2409g);
        f2407c = g6.toString().getBytes();
        this.f2410d = Cipher.getInstance("RSA/ECB/NoPadding");
        this.f2410d.init(1, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(android.util.Base64.decode((d() + e()).getBytes(), 0))));
        f2406b = b(this.f2410d.doFinal(f2407c));
        SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(f2409g.getBytes()));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        this.f2411e = cipher;
        cipher.init(1, generateSecret);
    }

    public static h a() {
        try {
            if (f2408f == null) {
                f2408f = new h();
            }
            return f2408f;
        } catch (Exception e5) {
            f2408f = null;
            e5.printStackTrace();
            return null;
        }
    }

    public static byte[] a(byte[] bArr, String str) {
        SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(str.getBytes()));
        Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
        cipher.init(1, generateSecret);
        return cipher.doFinal(bArr);
    }

    public static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = i5 * 2;
            char[] cArr2 = f2405a;
            cArr[i7] = cArr2[i6 >>> 4];
            cArr[i7 + 1] = cArr2[i6 & 15];
        }
        return new String(cArr);
    }

    public static byte[] b(byte[] bArr, String str) {
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(str.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, generateSecret);
            return cipher.doFinal(bArr);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String c() {
        return f2409g;
    }

    private String d() {
        return "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDcEQ3TCNWPBqgIiY7WQ/IqTOTTV2w8aZ/GPm68FK0";
    }

    private String e() {
        return "fAJBemZKtYR3Li46VJ+Hwnor7ZpQnblGWPFaLv5JoPqvavgB0GInuhm+T+syPs1mw0uPLWaqwvZsCfoaIvUuxy5xHJgmWARrK4/9pHyDxRlZte0PCIoR1ko5B8lVVH1X1dQIDAQAB";
    }

    public byte[] a(byte[] bArr) {
        return this.f2411e.doFinal(bArr);
    }

    public String b() {
        return f2406b;
    }

    public byte[] c(byte[] bArr) {
        StringBuilder g5 = androidx.activity.d.g("DesDecrypt deskeys is ");
        g5.append(f2409g);
        TbsLog.i("Post3DESEncryption", g5.toString());
        try {
            SecretKey generateSecret = SecretKeyFactory.getInstance("DESede").generateSecret(new DESedeKeySpec(f2409g.getBytes()));
            Cipher cipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
            cipher.init(2, generateSecret);
            return cipher.doFinal(bArr);
        } catch (Exception e5) {
            try {
                TbsLog.i("Post3DESEncryption", "DesDecrypt exception,  content is " + d(bArr));
            } catch (Throwable unused) {
            }
            TbsLog.i(e5);
            return null;
        }
    }

    public String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (int i5 = 0; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & 255;
            sb.append("0x");
            String hexString = Integer.toHexString(i6);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
            if (i5 != bArr.length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}
