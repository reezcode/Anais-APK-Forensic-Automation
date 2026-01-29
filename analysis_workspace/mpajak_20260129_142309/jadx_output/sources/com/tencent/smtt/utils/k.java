package com.tencent.smtt.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.tencent.smtt.sdk.TbsPrivacyAccess;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

/* loaded from: classes14.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static SharedPreferences f2417a;

    /* renamed from: b, reason: collision with root package name */
    private static SharedPreferences.Editor f2418b;

    private static String a() {
        return Build.FINGERPRINT + new Random().nextInt(2147483646);
    }

    public static String a(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("tsui", 0);
        f2417a = sharedPreferences;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("tsui", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        StringBuilder sb = new StringBuilder();
        String a5 = a();
        String g5 = b.g(context);
        String c5 = c(context);
        String replace = b(context).replace("-", "");
        if (a5 != null && a5.length() > 0) {
            sb.append(a5);
            sb.append("|");
        }
        if (g5 != null && g5.length() > 0) {
            sb.append(g5);
            sb.append("|");
        }
        if (c5 != null && c5.length() > 0) {
            sb.append(c5);
            sb.append("|");
        }
        if (replace != null && replace.length() > 0) {
            sb.append(replace);
        }
        if (sb.length() > 0) {
            String a6 = a(sb.toString());
            if (!TextUtils.isEmpty(a6)) {
                a(context, "tsui", a6);
                return a6;
            }
        }
        String replace2 = UUID.randomUUID().toString().replace("-", "");
        a(context, "tsui", replace2);
        return replace2;
    }

    public static String a(String str) {
        try {
            String a5 = a(b(str));
            return a5.length() > 0 ? a5 : "";
        } catch (Exception e5) {
            TbsLog.w("SDKUID", "encrypt sdkuid failed, origin is " + str + "reason: " + e5);
            return "";
        }
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b5 : bArr) {
            String hexString = Integer.toHexString(b5 & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase(Locale.CHINA);
    }

    private static void a(Context context, String str, String str2) {
        if (f2417a == null) {
            f2417a = context.getApplicationContext().getSharedPreferences("tsui", 0);
        }
        SharedPreferences.Editor edit = f2417a.edit();
        f2418b = edit;
        edit.putString(str, str2);
        f2418b.commit();
    }

    private static String b(Context context) {
        try {
            String a5 = s.a(context);
            int nextInt = new Random().nextInt(2147483646);
            return new UUID(("" + nextInt + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.DEVICE.length() % 10) + (Build.HARDWARE.length() % 10) + (Build.ID.length() % 10) + (a5.length() % 10) + (Build.PRODUCT.length() % 10) + (c(context).length() % 10)).hashCode(), c(context).hashCode()).toString();
        } catch (Exception e5) {
            e5.printStackTrace();
            return "";
        }
    }

    private static byte[] b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return messageDigest.digest();
        } catch (Exception unused) {
            return "".getBytes();
        }
    }

    private static String c(Context context) {
        try {
            String configurePrivacy = TbsPrivacyAccess.getConfigurePrivacy(context, TbsPrivacyAccess.ConfigurablePrivacy.SERIAL, "");
            if (!TextUtils.isEmpty(configurePrivacy) && !configurePrivacy.contains(EnvironmentCompat.MEDIA_UNKNOWN)) {
                return configurePrivacy;
            }
            return a();
        } catch (Exception unused) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
    }
}
