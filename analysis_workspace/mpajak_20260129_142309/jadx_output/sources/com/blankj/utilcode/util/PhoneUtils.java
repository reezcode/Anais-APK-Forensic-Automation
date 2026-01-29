package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* loaded from: classes24.dex */
public final class PhoneUtils {
    private PhoneUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    @RequiresPermission("android.permission.CALL_PHONE")
    public static void call(@NonNull String str) {
        Utils.getApp().startActivity(UtilsBridge.getCallIntent(str));
    }

    public static void dial(@NonNull String str) {
        Utils.getApp().startActivity(UtilsBridge.getDialIntent(str));
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getDeviceId() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            return "";
        }
        TelephonyManager telephonyManager = getTelephonyManager();
        String deviceId = telephonyManager.getDeviceId();
        if (!TextUtils.isEmpty(deviceId)) {
            return deviceId;
        }
        if (i5 < 26) {
            return "";
        }
        String imei = telephonyManager.getImei();
        if (!TextUtils.isEmpty(imei)) {
            return imei;
        }
        String meid = telephonyManager.getMeid();
        return TextUtils.isEmpty(meid) ? "" : meid;
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getIMEI() {
        return getImeiOrMeid(true);
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    @SuppressLint({"HardwareIds"})
    public static String getIMSI() {
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                getTelephonyManager().getSubscriberId();
            } catch (SecurityException e5) {
                e5.printStackTrace();
                return "";
            }
        }
        return getTelephonyManager().getSubscriberId();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
    
        if (r2.length() < 15) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ad, code lost:
    
        if (r2.length() == 14) goto L56;
     */
    @androidx.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint({"HardwareIds"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getImeiOrMeid(boolean r10) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = ""
            r2 = 29
            if (r0 < r2) goto L9
            return r1
        L9:
            android.telephony.TelephonyManager r2 = getTelephonyManager()
            r3 = 26
            r4 = 1
            r5 = 0
            if (r0 < r3) goto L2f
            if (r10 == 0) goto L22
            java.lang.String r10 = r2.getImei(r5)
            java.lang.String r0 = r2.getImei(r4)
            java.lang.String r10 = getMinOne(r10, r0)
            return r10
        L22:
            java.lang.String r10 = r2.getMeid(r5)
            java.lang.String r0 = r2.getMeid(r4)
            java.lang.String r10 = getMinOne(r10, r0)
            return r10
        L2f:
            if (r10 == 0) goto L34
            java.lang.String r0 = "ril.gsm.imei"
            goto L36
        L34:
            java.lang.String r0 = "ril.cdma.meid"
        L36:
            java.lang.String r0 = getSystemPropertyByReflect(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r6 = 2
            if (r3 != 0) goto L56
            java.lang.String r10 = ","
            java.lang.String[] r10 = r0.split(r10)
            int r0 = r10.length
            if (r0 != r6) goto L53
            r0 = r10[r5]
            r10 = r10[r4]
            java.lang.String r10 = getMinOne(r0, r10)
            return r10
        L53:
            r10 = r10[r5]
            return r10
        L56:
            java.lang.String r0 = r2.getDeviceId()
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.String r7 = "getDeviceId"
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            r8[r5] = r9     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.reflect.Method r3 = r3.getMethod(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            if (r10 == 0) goto L6f
            goto L70
        L6f:
            r4 = 2
        L70:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            r7[r5] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.Object r2 = r3.invoke(r2, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.reflect.InvocationTargetException -> L7d java.lang.IllegalAccessException -> L7f java.lang.NoSuchMethodException -> L81
            goto L86
        L7d:
            r2 = move-exception
            goto L82
        L7f:
            r2 = move-exception
            goto L82
        L81:
            r2 = move-exception
        L82:
            r2.printStackTrace()
            r2 = r1
        L86:
            if (r10 == 0) goto L9c
            r10 = 15
            if (r0 == 0) goto L93
            int r3 = r0.length()
            if (r3 >= r10) goto L93
            r0 = r1
        L93:
            if (r2 == 0) goto Lb0
            int r3 = r2.length()
            if (r3 >= r10) goto Lb0
            goto Lb1
        L9c:
            r10 = 14
            if (r0 == 0) goto La7
            int r3 = r0.length()
            if (r3 != r10) goto La7
            r0 = r1
        La7:
            if (r2 == 0) goto Lb0
            int r3 = r2.length()
            if (r3 != r10) goto Lb0
            goto Lb1
        Lb0:
            r1 = r2
        Lb1:
            java.lang.String r10 = getMinOne(r0, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.PhoneUtils.getImeiOrMeid(boolean):java.lang.String");
    }

    @RequiresPermission("android.permission.READ_PHONE_STATE")
    public static String getMEID() {
        return getImeiOrMeid(false);
    }

    private static String getMinOne(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        return (isEmpty && isEmpty2) ? "" : (isEmpty || isEmpty2) ? !isEmpty ? str : str2 : str.compareTo(str2) <= 0 ? str : str2;
    }

    public static int getPhoneType() {
        return getTelephonyManager().getPhoneType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x000b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x000c, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0011, code lost:
    
        return "";
     */
    @androidx.annotation.RequiresPermission("android.permission.READ_PHONE_STATE")
    @android.annotation.SuppressLint({"HardwareIds"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getSerial() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L12
            java.lang.String r0 = android.os.Build.getSerial()     // Catch: java.lang.SecurityException -> Lb
            return r0
        Lb:
            r0 = move-exception
            r0.printStackTrace()
            java.lang.String r0 = ""
            return r0
        L12:
            r1 = 26
            if (r0 < r1) goto L1b
            java.lang.String r0 = android.os.Build.getSerial()
            goto L1d
        L1b:
            java.lang.String r0 = android.os.Build.SERIAL
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blankj.utilcode.util.PhoneUtils.getSerial():java.lang.String");
    }

    public static String getSimOperatorByMnc() {
        String simOperator = getTelephonyManager().getSimOperator();
        if (simOperator == null) {
            return "";
        }
        switch (simOperator) {
            case "46000":
            case "46002":
            case "46007":
            case "46020":
                return "中国移动";
            case "46001":
            case "46006":
            case "46009":
                return "中国联通";
            case "46003":
            case "46005":
            case "46011":
                return "中国电信";
            default:
                return simOperator;
        }
    }

    public static String getSimOperatorName() {
        return getTelephonyManager().getSimOperatorName();
    }

    private static String getSystemPropertyByReflect(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static TelephonyManager getTelephonyManager() {
        return (TelephonyManager) Utils.getApp().getSystemService("phone");
    }

    public static boolean isPhone() {
        return getTelephonyManager().getPhoneType() != 0;
    }

    public static boolean isSimCardReady() {
        return getTelephonyManager().getSimState() == 5;
    }

    public static void sendSms(@NonNull String str, String str2) {
        Utils.getApp().startActivity(UtilsBridge.getSendSmsIntent(str, str2));
    }
}
