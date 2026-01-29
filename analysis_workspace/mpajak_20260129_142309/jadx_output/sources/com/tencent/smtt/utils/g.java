package com.tencent.smtt.utils;

import java.io.Closeable;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class g {

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i5);
    }

    public static String a(String str, byte[] bArr, a aVar, boolean z4) {
        String str2;
        String str3;
        try {
            str3 = str + (z4 ? i.a().c() : h.a().b());
            try {
                bArr = z4 ? i.a().a(bArr) : h.a().a(bArr);
            } catch (Exception e5) {
                e5.printStackTrace();
                TbsLog.e("HttpUtils", "rsaKey exception #2: " + e5);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
            str2 = "rsaKey exception #1: " + e6;
        }
        if (bArr == null) {
            str2 = "postData is null";
            TbsLog.e("HttpUtils", str2);
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Content-Length", String.valueOf(bArr.length));
        HttpURLConnection a5 = a(str3, hashMap);
        if (a5 == null) {
            return null;
        }
        a(a5, bArr);
        return a(a5, aVar, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[Catch: all -> 0x0075, LOOP:0: B:19:0x0046->B:21:0x004d, LOOP_END, TryCatch #1 {all -> 0x0075, blocks: (B:18:0x0044, B:19:0x0046, B:21:0x004d, B:24:0x0054, B:29:0x0063), top: B:17:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052 A[EDGE_INSN: B:22:0x0052->B:23:0x0052 BREAK  A[LOOP:0: B:19:0x0046->B:21:0x004d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[Catch: all -> 0x0075, TryCatch #1 {all -> 0x0075, blocks: (B:18:0x0044, B:19:0x0046, B:21:0x004d, B:24:0x0054, B:29:0x0063), top: B:17:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:18:0x0044, B:19:0x0046, B:21:0x004d, B:24:0x0054, B:29:0x0063), top: B:17:0x0044 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.net.HttpURLConnection r4, com.tencent.smtt.utils.g.a r5, boolean r6) {
        /*
            r0 = 0
            int r1 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto La
            r5.a(r1)     // Catch: java.lang.Throwable -> L88
        La:
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 != r5) goto L7f
            java.io.InputStream r5 = r4.getInputStream()     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = r4.getContentEncoding()     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L27
            java.lang.String r1 = "gzip"
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L27
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L88
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L88
        L25:
            r5 = r4
            goto L3d
        L27:
            if (r4 == 0) goto L3d
            java.lang.String r1 = "deflate"
            boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L88
            if (r4 == 0) goto L3d
            java.util.zip.InflaterInputStream r4 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> L88
            java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch: java.lang.Throwable -> L88
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L88
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L88
            goto L25
        L3d:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L7a
            r4.<init>()     // Catch: java.lang.Throwable -> L7a
            r0 = 128(0x80, float:1.8E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L75
        L46:
            int r1 = r5.read(r0)     // Catch: java.lang.Throwable -> L75
            r2 = -1
            if (r1 == r2) goto L52
            r2 = 0
            r4.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L75
            goto L46
        L52:
            if (r6 == 0) goto L63
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L75
            byte[] r6 = r4.toByteArray()     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = "utf-8"
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L75
        L5f:
            r3 = r0
            r0 = r5
            r5 = r3
            goto L81
        L63:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L75
            com.tencent.smtt.utils.h r6 = com.tencent.smtt.utils.h.a()     // Catch: java.lang.Throwable -> L75
            byte[] r1 = r4.toByteArray()     // Catch: java.lang.Throwable -> L75
            byte[] r6 = r6.c(r1)     // Catch: java.lang.Throwable -> L75
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L75
            goto L5f
        L75:
            r6 = move-exception
            r0 = r5
            r5 = r4
            r4 = r6
            goto L8a
        L7a:
            r4 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L8a
        L7f:
            r4 = r0
            r5 = r4
        L81:
            a(r0)
            a(r4)
            goto Lbf
        L88:
            r4 = move-exception
            r5 = r0
        L8a:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r6 = "HttpUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r1.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "httpPost exception: "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lc0
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc0
            com.tencent.smtt.utils.TbsLog.e(r6, r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc0
            r6.<init>()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "[HttpError] "
            r6.append(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lc0
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lc0
            a(r0)
            a(r5)
            r5 = r4
        Lbf:
            return r5
        Lc0:
            r4 = move-exception
            a(r0)
            a(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.g.a(java.net.HttpURLConnection, com.tencent.smtt.utils.g$a, boolean):java.lang.String");
    }

    private static HttpURLConnection a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        } catch (Exception e5) {
            e = e5;
        }
        try {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setRequestProperty("Connection", "close");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            return httpURLConnection;
        } catch (Exception e6) {
            e = e6;
            httpURLConnection2 = httpURLConnection;
            TbsLog.e("HttpUtil", "initHttpPostURLConnection exception: " + e);
            return httpURLConnection2;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
            } catch (Exception e5) {
                TbsLog.e("HttpUtil", "writePostData exception: " + e5);
            }
        } finally {
            a(outputStream);
        }
    }
}
