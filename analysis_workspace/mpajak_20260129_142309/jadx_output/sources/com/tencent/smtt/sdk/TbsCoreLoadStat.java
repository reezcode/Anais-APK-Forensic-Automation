package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;

/* loaded from: classes14.dex */
public class TbsCoreLoadStat {
    public static final int ERROR_CODE_INIT = -1;

    /* renamed from: a, reason: collision with root package name */
    private static TbsCoreLoadStat f1899a = null;
    public static String mErrorMessage = "";
    public static volatile int mLoadErrorCode = -1;

    private TbsCoreLoadStat() {
    }

    public static TbsCoreLoadStat getInstance() {
        if (f1899a == null) {
            f1899a = new TbsCoreLoadStat();
        }
        return f1899a;
    }

    public static int getLoadErrorCode() {
        return mLoadErrorCode;
    }

    public static String getLoadErrorMessage() {
        return mErrorMessage;
    }

    public void a(Context context, int i5) {
        TbsLog.e(TbsListener.tag_load_error, "" + i5);
    }

    public synchronized void a(Context context, int i5, Throwable th) {
        String str;
        String str2;
        TbsLog.e("TbsCoreLoadStat", "[loadError] errorCode: " + i5 + ", details:" + String.valueOf(th));
        if (th != null) {
            if (mLoadErrorCode == -1) {
                mLoadErrorCode = i5;
                mErrorMessage = String.valueOf(th);
                TbsLogReport.getInstance(context).setLoadErrorCode(i5, th);
                str = "TbsCoreLoadStat";
                str2 = mLoadErrorCode + " report success!";
            } else {
                str = "TbsCoreLoadStat";
                str2 = mLoadErrorCode + " is reported, others will be saved in local TbsLog!";
            }
            TbsLog.i(str, str2);
        }
    }
}
