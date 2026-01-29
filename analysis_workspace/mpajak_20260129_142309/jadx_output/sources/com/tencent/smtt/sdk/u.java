package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.nio.channels.FileLock;

/* loaded from: classes15.dex */
class u {

    /* renamed from: a, reason: collision with root package name */
    private static u f2248a;

    /* renamed from: f, reason: collision with root package name */
    private static FileLock f2249f;

    /* renamed from: b, reason: collision with root package name */
    private v f2250b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2251c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2252d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2253e;

    private u() {
    }

    public static u a() {
        if (f2248a == null) {
            synchronized (u.class) {
                if (f2248a == null) {
                    f2248a = new u();
                }
            }
        }
        return f2248a;
    }

    public v a(boolean z4) {
        return z4 ? this.f2250b : c();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[Catch: all -> 0x022f, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:11:0x0025, B:14:0x0050, B:16:0x0054, B:23:0x008c, B:25:0x009a, B:26:0x00a1, B:27:0x00b3, B:29:0x00cf, B:44:0x0130, B:46:0x013c, B:47:0x0176, B:48:0x022b, B:51:0x017b, B:53:0x0127, B:54:0x01b6, B:56:0x01bc, B:57:0x01f8, B:58:0x020c, B:60:0x0228, B:63:0x0075, B:61:0x0084, B:65:0x00a4, B:34:0x00e0, B:36:0x00e6, B:37:0x00f2, B:39:0x00f6, B:40:0x0119, B:42:0x011d, B:18:0x0066, B:20:0x006e), top: B:2:0x0001, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x020c A[Catch: all -> 0x022f, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x0005, B:7:0x000b, B:11:0x0025, B:14:0x0050, B:16:0x0054, B:23:0x008c, B:25:0x009a, B:26:0x00a1, B:27:0x00b3, B:29:0x00cf, B:44:0x0130, B:46:0x013c, B:47:0x0176, B:48:0x022b, B:51:0x017b, B:53:0x0127, B:54:0x01b6, B:56:0x01bc, B:57:0x01f8, B:58:0x020c, B:60:0x0228, B:63:0x0075, B:61:0x0084, B:65:0x00a4, B:34:0x00e0, B:36:0x00e6, B:37:0x00f2, B:39:0x00f6, B:40:0x0119, B:42:0x011d, B:18:0x0066, B:20:0x006e), top: B:2:0x0001, inners: #1, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.u.a(android.content.Context):void");
    }

    public FileLock b(Context context) {
        String str;
        String str2;
        TbsLog.i("X5CoreEngine", "tryTbsCoreLoadFileLock ##");
        FileLock fileLock = f2249f;
        if (fileLock != null) {
            return fileLock;
        }
        synchronized (u.class) {
            if (f2249f == null) {
                FileLock d5 = FileUtil.d(context);
                f2249f = d5;
                if (d5 == null) {
                    str = "X5CoreEngine";
                    str2 = "init -- sTbsCoreLoadFileLock failed!";
                } else {
                    str = "X5CoreEngine";
                    str2 = "init -- sTbsCoreLoadFileLock succeeded: " + f2249f;
                }
                TbsLog.i(str, str2);
            }
        }
        return f2249f;
    }

    public boolean b() {
        if (QbSdk.f1808a || QbSdk.getIsSysWebViewForcedByOuter()) {
            return false;
        }
        return this.f2251c;
    }

    public v c() {
        if (QbSdk.f1808a) {
            return null;
        }
        return this.f2250b;
    }

    public boolean d() {
        return this.f2252d;
    }
}
