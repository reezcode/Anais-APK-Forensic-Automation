package com.tencent.smtt.sdk.stat;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.activity.d;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsConfig;
import com.tencent.smtt.sdk.TbsCoreLoadStat;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsLogReport;
import com.tencent.smtt.sdk.TbsPVConfig;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.smtt.utils.h;
import com.tencent.smtt.utils.o;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static byte[] f2244a;

    /* renamed from: b, reason: collision with root package name */
    private static a.a f2245b;

    /* renamed from: c, reason: collision with root package name */
    private static Map<String, String> f2246c;

    static {
        try {
            f2244a = "65dRa93L".getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(android.content.Context r2) {
        /*
            r2 = 0
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L18
            r0.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r2 = "cpuabi"
            boolean r1 = com.tencent.smtt.utils.b.c()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L11
            java.lang.String r1 = "64"
            goto L13
        L11:
            java.lang.String r1 = "32"
        L13:
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r2 = r0
        L18:
            r0 = r2
        L19:
            if (r0 != 0) goto L1e
            java.lang.String r2 = ""
            goto L22
        L1e:
            java.lang.String r2 = r0.toString()
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.b.a(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:2|(2:3|4))|(15:(1:71)|10|11|12|13|14|(2:15|(1:17)(1:18))|19|(1:21)(1:(1:35)(2:36|37))|22|23|24|25|26|27)(1:8)|9|10|11|12|13|14|(3:15|(0)(0)|17)|19|(0)(0)|22|23|24|25|26|27|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|2|3|4|(15:(1:71)|10|11|12|13|14|(2:15|(1:17)(1:18))|19|(1:21)(1:(1:35)(2:36|37))|22|23|24|25|26|27)(1:8)|9|10|11|12|13|14|(3:15|(0)(0)|17)|19|(0)(0)|22|23|24|25|26|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0086, code lost:
    
        com.tencent.smtt.utils.TbsLog.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        r2 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        com.tencent.smtt.utils.TbsLog.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        if (r2 != null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ae, code lost:
    
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        r3.close();
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
    
        com.tencent.smtt.utils.TbsLog.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0092, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0093, code lost:
    
        r2 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d1, code lost:
    
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00db, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00dd, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        com.tencent.smtt.utils.TbsLog.i(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e5, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
    
        com.tencent.smtt.utils.TbsLog.i(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x009a, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[Catch: all -> 0x0092, Exception -> 0x0096, LOOP:0: B:15:0x003d->B:17:0x0044, LOOP_END, TryCatch #10 {Exception -> 0x0096, all -> 0x0092, blocks: (B:14:0x003b, B:15:0x003d, B:17:0x0044, B:19:0x005d, B:35:0x0068, B:36:0x0077), top: B:13:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[EDGE_INSN: B:18:0x005d->B:19:0x005d BREAK  A[LOOP:0: B:15:0x003d->B:17:0x0044], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x008e -> B:24:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.net.HttpURLConnection r7, java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.b.a(java.net.HttpURLConnection, java.lang.String, boolean):java.lang.String");
    }

    public static void a(a.a aVar, Context context) {
        String str;
        String str2;
        StringBuilder sb;
        String str3;
        String sb2;
        String str4;
        com.tencent.smtt.utils.b.b(context, aVar.f7f);
        aVar.f13l = com.tencent.smtt.utils.b.a();
        JSONObject jSONObject = null;
        if (f2244a == null) {
            try {
                f2244a = "65dRa93L".getBytes("utf-8");
            } catch (UnsupportedEncodingException unused) {
                f2244a = null;
                TbsLog.e("sdkreport", "Post failed -- get POST_DATA_KEY failed!");
            }
        }
        if (f2244a == null) {
            sb2 = "Post failed -- POST_DATA_KEY is null!";
        } else {
            String string = TbsDownloadConfig.getInstance(context).mPreferences.getString(TbsDownloadConfig.TbsConfigKey.KEY_DESkEY_TOKEN, "");
            if (TextUtils.isEmpty(string)) {
                str = "";
                str2 = str;
            } else {
                str2 = string.substring(0, string.indexOf("&"));
                str = string.substring(string.indexOf("&") + 1, string.length());
            }
            boolean z4 = TextUtils.isEmpty(str2) || str2.length() != 96 || TextUtils.isEmpty(str) || str.length() != 24;
            try {
                o a5 = o.a();
                if (z4) {
                    str4 = a5.b() + h.a().b();
                } else {
                    str4 = a5.e() + str2;
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str4).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setRequestProperty("Connection", "close");
                try {
                    jSONObject = b(aVar, context);
                } catch (Exception e5) {
                    TbsLog.i(e5);
                }
                if (jSONObject != null) {
                    try {
                        TbsLog.i("sdkreport", "Post jsonData.toString() is " + jSONObject.toString());
                        byte[] bytes = jSONObject.toString().getBytes("utf-8");
                        byte[] a6 = z4 ? h.a().a(bytes) : h.a(bytes, str);
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(a6.length));
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            outputStream.write(a6);
                            outputStream.flush();
                            if (httpURLConnection.getResponseCode() == 200) {
                                TbsLog.i("SDKPVReport", "Post successful!");
                                a(context, a(httpURLConnection, str, z4));
                            } else {
                                TbsLog.e("SDKPVReport", "Post failed -- not 200 code is " + httpURLConnection.getResponseCode());
                                TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
                                tbsLogInfo.setErrorCode(126);
                                tbsLogInfo.setFailDetail("" + httpURLConnection.getResponseCode());
                                TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_PV_UPLOAD_STAT, tbsLogInfo);
                            }
                            return;
                        } catch (Throwable th) {
                            StringBuilder g5 = d.g("Post failed -- exceptions:");
                            g5.append(th.getMessage());
                            TbsLog.e("SDKPVReport", g5.toString());
                            TbsLogReport.TbsLogInfo tbsLogInfo2 = TbsLogReport.getInstance(context).tbsLogInfo();
                            tbsLogInfo2.setErrorCode(126);
                            tbsLogInfo2.setFailDetail(th);
                            TbsLogReport.getInstance(context).eventReport(TbsLogReport.EventType.TYPE_PV_UPLOAD_STAT, tbsLogInfo2);
                            return;
                        }
                    } catch (Throwable unused2) {
                        return;
                    }
                }
                sb2 = "post -- jsonData is null!";
            } catch (IOException e6) {
                e = e6;
                sb = new StringBuilder();
                str3 = "Post failed -- IOException:";
                sb.append(str3);
                sb.append(e);
                sb2 = sb.toString();
                TbsLog.e("sdkreport", sb2);
            } catch (AssertionError e7) {
                e = e7;
                sb = new StringBuilder();
                str3 = "Post failed -- AssertionError:";
                sb.append(str3);
                sb.append(e);
                sb2 = sb.toString();
                TbsLog.e("sdkreport", sb2);
            } catch (Exception e8) {
                e = e8;
                sb = new StringBuilder();
                str3 = "Post failed -- Exception:";
                sb.append(str3);
                sb.append(e);
                sb2 = sb.toString();
                TbsLog.e("sdkreport", sb2);
            } catch (NoClassDefFoundError e9) {
                e = e9;
                sb = new StringBuilder();
                str3 = "Post failed -- NoClassDefFoundError:";
                sb.append(str3);
                sb.append(e);
                sb2 = sb.toString();
                TbsLog.e("sdkreport", sb2);
            }
        }
        TbsLog.e("sdkreport", sb2);
    }

    private static void a(Context context, int i5) {
        TbsLog.i("HttpUtils", "updatePVConfig command is " + i5);
        if (i5 == 1) {
            TbsPVConfig.getInstance(context).clear();
        }
        if (i5 == 2) {
            TbsPVConfig.getInstance(context).update(f2246c);
        }
    }

    private static void a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                a(context, 1);
                return;
            }
            f2246c = new HashMap();
            for (String str2 : str.split("\\|")) {
                try {
                    String[] split = str2.split("=");
                    if (split.length == 2) {
                        a(context, split[0], split[1]);
                    }
                } catch (Exception e5) {
                    TbsLog.i(e5);
                }
            }
            int c5 = c(context);
            TbsLog.i("HttpUtils", "readResponse, after processSwitchKeyValue mMapFromResponse is " + f2246c.toString() + " commandForUpdatePVC is " + c5);
            a(context, c5);
        } catch (Exception e6) {
            TbsLog.i(e6);
        }
    }

    private static void a(Context context, String str, String str2) {
        TbsLog.i("HttpUtils", "PV Config Receive. Key: " + str + ", value: " + str2);
        if ("reset".equals(str) && "true".equals(str2)) {
            QbSdk.reset(context);
        } else if ("resetCfg24".equals(str) && "true".equals(str2)) {
            d(context);
        } else {
            f2246c.put(str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010d, code lost:
    
        if (r14 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7 A[Catch: all -> 0x013b, TryCatch #2 {all -> 0x013b, blocks: (B:22:0x0073, B:24:0x00b7, B:25:0x00b9, B:27:0x00bd, B:28:0x00c6, B:30:0x00da, B:32:0x00e0, B:34:0x00e4, B:36:0x00ea, B:37:0x00ec, B:39:0x00f2, B:41:0x00f6, B:43:0x00fc, B:44:0x00fe, B:47:0x010b, B:49:0x010f, B:50:0x011f, B:52:0x0129, B:53:0x0131, B:56:0x0112, B:59:0x0118, B:63:0x00c0), top: B:21:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[Catch: all -> 0x013b, TryCatch #2 {all -> 0x013b, blocks: (B:22:0x0073, B:24:0x00b7, B:25:0x00b9, B:27:0x00bd, B:28:0x00c6, B:30:0x00da, B:32:0x00e0, B:34:0x00e4, B:36:0x00ea, B:37:0x00ec, B:39:0x00f2, B:41:0x00f6, B:43:0x00fc, B:44:0x00fe, B:47:0x010b, B:49:0x010f, B:50:0x011f, B:52:0x0129, B:53:0x0131, B:56:0x0112, B:59:0x0118, B:63:0x00c0), top: B:21:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2 A[Catch: all -> 0x013b, TryCatch #2 {all -> 0x013b, blocks: (B:22:0x0073, B:24:0x00b7, B:25:0x00b9, B:27:0x00bd, B:28:0x00c6, B:30:0x00da, B:32:0x00e0, B:34:0x00e4, B:36:0x00ea, B:37:0x00ec, B:39:0x00f2, B:41:0x00f6, B:43:0x00fc, B:44:0x00fe, B:47:0x010b, B:49:0x010f, B:50:0x011f, B:52:0x0129, B:53:0x0131, B:56:0x0112, B:59:0x0118, B:63:0x00c0), top: B:21:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0129 A[Catch: all -> 0x013b, TryCatch #2 {all -> 0x013b, blocks: (B:22:0x0073, B:24:0x00b7, B:25:0x00b9, B:27:0x00bd, B:28:0x00c6, B:30:0x00da, B:32:0x00e0, B:34:0x00e4, B:36:0x00ea, B:37:0x00ec, B:39:0x00f2, B:41:0x00f6, B:43:0x00fc, B:44:0x00fe, B:47:0x010b, B:49:0x010f, B:50:0x011f, B:52:0x0129, B:53:0x0131, B:56:0x0112, B:59:0x0118, B:63:0x00c0), top: B:21:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c0 A[Catch: all -> 0x013b, TryCatch #2 {all -> 0x013b, blocks: (B:22:0x0073, B:24:0x00b7, B:25:0x00b9, B:27:0x00bd, B:28:0x00c6, B:30:0x00da, B:32:0x00e0, B:34:0x00e4, B:36:0x00ea, B:37:0x00ec, B:39:0x00f2, B:41:0x00f6, B:43:0x00fc, B:44:0x00fe, B:47:0x010b, B:49:0x010f, B:50:0x011f, B:52:0x0129, B:53:0x0131, B:56:0x0112, B:59:0x0118, B:63:0x00c0), top: B:21:0x0073 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, boolean r11, long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.stat.b.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, int, boolean, long, boolean):void");
    }

    private static boolean a(Map<String, String> map, Map<String, String> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!(entry.getValue() == null ? "" : entry.getValue()).equals(map2.get(entry.getKey()) != null ? map2.get(entry.getKey()) : "")) {
                return false;
            }
        }
        return true;
    }

    private static String b(Context context) {
        try {
            byte[] byteArray = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray();
            if (byteArray != null) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                messageDigest.update(byteArray);
                byte[] digest = messageDigest.digest();
                if (digest != null) {
                    StringBuilder sb = new StringBuilder("");
                    if (digest.length <= 0) {
                        return null;
                    }
                    for (int i5 = 0; i5 < digest.length; i5++) {
                        String upperCase = Integer.toHexString(digest[i5] & 255).toUpperCase();
                        if (i5 > 0) {
                            sb.append(":");
                        }
                        if (upperCase.length() < 2) {
                            sb.append(0);
                        }
                        sb.append(upperCase);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e5) {
            TbsLog.i(e5);
        }
        return null;
    }

    private static JSONObject b(a.a aVar, Context context) {
        String tid;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("APPNAME", aVar.f3b);
            jSONObject.put("TIME", aVar.f4c);
            jSONObject.put("QUA2", aVar.f5d);
            jSONObject.put("LC", aVar.f6e);
            jSONObject.put("GUID", aVar.f7f);
            jSONObject.put("IMEI", aVar.f8g);
            jSONObject.put("IMSI", aVar.f9h);
            jSONObject.put("MAC", aVar.f10i);
            jSONObject.put("PV", aVar.f14m);
            jSONObject.put("CORETYPE", aVar.f15n);
            jSONObject.put("APPVN", aVar.f16o);
            jSONObject.put("APPMETADATA", aVar.f11j);
            jSONObject.put("VERSION_CODE", aVar.f12k);
            jSONObject.put("CPU", aVar.f13l);
            String str = aVar.f17p;
            if (str == null) {
                str = "0";
            }
            jSONObject.put("SIGNATURE", str);
            String a5 = a(context);
            TbsLog.i("sdkreport", "addInfo is " + a5);
            if (!TextUtils.isEmpty(a5)) {
                jSONObject.put("EXT_INFO", a5);
            }
            jSONObject.put("PROTOCOL_VERSION", 3);
            jSONObject.put("ANDROID_ID", aVar.f18q);
            jSONObject.put("HOST_COREVERSION", 0);
            jSONObject.put("DECOUPLE_COREVERSION", 0);
            jSONObject.put("WIFICONNECTEDTIME", aVar.f19r);
            jSONObject.put("CORE_EXIST", aVar.f20s);
            int loadErrorCode = TbsCoreLoadStat.getLoadErrorCode();
            if (aVar.f20s <= 0) {
                jSONObject.put("TBS_ERROR_CODE", TbsDownloadConfig.getInstance(context).getDownloadInterruptCode());
            } else {
                jSONObject.put("TBS_ERROR_CODE", loadErrorCode);
            }
            if (loadErrorCode == -1) {
                TbsLog.e("sdkreport", "ATTENTION: Load errorCode missed!");
            }
            try {
                if (QbSdk.getTID() != null) {
                    if (aVar.f3b.equals(TbsConfig.APP_QQ)) {
                        tid = QbSdk.getTID();
                    } else if (aVar.f3b.equals(TbsConfig.APP_WX)) {
                        tid = QbSdk.getTID();
                    }
                    jSONObject.put("TID", tid);
                    jSONObject.put("TIDTYPE", 0);
                }
            } catch (Exception unused) {
            }
            return jSONObject;
        } catch (Exception unused2) {
            TbsLog.e("sdkreport", "getPostData exception!");
            return null;
        }
    }

    private static int c(Context context) {
        Map<String, String> map = f2246c;
        if (map == null || map.size() == 0) {
            return 1;
        }
        Map<String, String> pVCLocal = TbsPVConfig.getInstance(context).getPVCLocal();
        StringBuilder g5 = d.g("getCommandForUpdatePVC, mMapPVCLocal is ");
        g5.append(pVCLocal.toString());
        TbsLog.i("HttpUtils", g5.toString());
        return (pVCLocal.size() != 0 && a(f2246c, pVCLocal)) ? 0 : 2;
    }

    private static void d(Context context) {
        SharedPreferences.Editor edit = TbsDownloadConfig.getInstance(context).mPreferences.edit();
        edit.putLong(TbsDownloadConfig.TbsConfigKey.KEY_LAST_CHECK, 0L);
        edit.apply();
    }
}
