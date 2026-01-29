package com.tencent.smtt.sdk;

import android.os.HandlerThread;

/* loaded from: classes22.dex */
public class TbsHandlerThread extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    private static TbsHandlerThread f1934a;

    public TbsHandlerThread(String str) {
        super(str);
    }

    public static synchronized TbsHandlerThread getInstance() {
        TbsHandlerThread tbsHandlerThread;
        synchronized (TbsHandlerThread.class) {
            if (f1934a == null) {
                TbsHandlerThread tbsHandlerThread2 = new TbsHandlerThread("TbsHandlerThread");
                f1934a = tbsHandlerThread2;
                tbsHandlerThread2.start();
            }
            tbsHandlerThread = f1934a;
        }
        return tbsHandlerThread;
    }
}
