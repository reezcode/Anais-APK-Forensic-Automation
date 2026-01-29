package com.superbock;

import android.content.BroadcastReceiver;

/* loaded from: classes.dex */
public class ScreenBroadcastReceiver extends BroadcastReceiver {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        if (r0 <= 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        r0 = r10.getTi();
        com.blankj.utilcode.util.SPUtils.getInstance().put("lockTime", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cb, code lost:
    
        if (r0 <= 0) goto L31;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            java.lang.String r10 = r10.getAction()
            java.lang.String r0 = "android.intent.action.SCREEN_OFF"
            boolean r0 = r10.equals(r0)
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1f
            com.superbock.bean.FInfo r10 = new com.superbock.bean.FInfo
            r10.<init>()
            java.lang.String r0 = e3.d.a()
            r10.setId(r0)
            r10.setAc(r2)
            goto L63
        L1f:
            java.lang.String r0 = "android.intent.action.SCREEN_ON"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L37
            com.superbock.bean.FInfo r10 = new com.superbock.bean.FInfo
            r10.<init>()
            java.lang.String r0 = e3.d.a()
            r10.setId(r0)
            r10.setAc(r3)
            goto L63
        L37:
            java.lang.String r0 = "android.intent.action.USER_PRESENT"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L62
            com.superbock.bean.FInfo r10 = new com.superbock.bean.FInfo
            r10.<init>()
            java.lang.String r0 = e3.d.a()
            r10.setId(r0)
            r10.setAc(r1)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            e3.e r4 = new e3.e
            r4.<init>()
            r5 = 2000(0x7d0, double:9.88E-321)
            r0.postDelayed(r4, r5)
            goto L63
        L62:
            r10 = 0
        L63:
            if (r10 == 0) goto Ldb
            long r4 = java.lang.System.currentTimeMillis()
            r10.setTi(r4)
            g3.g r0 = g3.g.a()
            java.util.Objects.requireNonNull(r0)
            t2.g<com.superbock.bean.FInfo, java.lang.String> r0 = r0.f2964a     // Catch: java.sql.SQLException -> L79
            r0.n(r10)     // Catch: java.sql.SQLException -> L79
            goto L7d
        L79:
            r0 = move-exception
            r0.printStackTrace()
        L7d:
            int r0 = r10.getAc()
            java.lang.String r4 = "lock"
            r5 = 0
            java.lang.String r7 = "lockTime"
            if (r0 == 0) goto Lba
            if (r0 == r3) goto L8e
            if (r0 == r1) goto La8
            goto Ldb
        L8e:
            boolean r9 = k3.a.i(r9)
            if (r9 == 0) goto La8
            com.blankj.utilcode.util.SPUtils r9 = com.blankj.utilcode.util.SPUtils.getInstance()
            r9.put(r4, r3)
            com.blankj.utilcode.util.SPUtils r9 = com.blankj.utilcode.util.SPUtils.getInstance()
            long r0 = r9.getLong(r7)
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 > 0) goto Ld8
            goto Lcd
        La8:
            com.blankj.utilcode.util.SPUtils r9 = com.blankj.utilcode.util.SPUtils.getInstance()
            r9.put(r4, r2)
            com.blankj.utilcode.util.SPUtils r9 = com.blankj.utilcode.util.SPUtils.getInstance()
            r9.put(r7, r5)
            f3.i.j(r2, r5)
            goto Ldb
        Lba:
            com.blankj.utilcode.util.SPUtils r9 = com.blankj.utilcode.util.SPUtils.getInstance()
            r9.put(r4, r3)
            com.blankj.utilcode.util.SPUtils r9 = com.blankj.utilcode.util.SPUtils.getInstance()
            long r0 = r9.getLong(r7)
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 > 0) goto Ld8
        Lcd:
            long r0 = r10.getTi()
            com.blankj.utilcode.util.SPUtils r9 = com.blankj.utilcode.util.SPUtils.getInstance()
            r9.put(r7, r0)
        Ld8:
            f3.i.j(r3, r0)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.superbock.ScreenBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
