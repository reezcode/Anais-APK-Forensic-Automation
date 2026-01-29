package com.tencent.smtt.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* loaded from: classes15.dex */
public abstract class TbsBaseConfig {
    public static final String TAG = "TbsBaseConfig";

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f1897a;

    /* renamed from: b, reason: collision with root package name */
    private Context f1898b;

    private static File a(Context context, String str) {
        m.a();
        File o4 = m.o(context);
        if (o4 == null) {
            return null;
        }
        File file = new File(o4, str);
        if (file.exists()) {
            return file;
        }
        try {
            file.createNewFile();
            return file;
        } catch (IOException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void clear() {
        this.f1897a.clear();
        commit();
    }

    public synchronized void commit() {
        writeTbsDownloadInfo();
    }

    public abstract String getConfigFileName();

    public Map<String, String> getPVCLocal() {
        return this.f1897a;
    }

    public void init(Context context) {
        this.f1897a = new HashMap();
        Context applicationContext = context.getApplicationContext();
        this.f1898b = applicationContext;
        if (applicationContext == null) {
            this.f1898b = context;
        }
        refreshSyncMap(context);
    }

    public synchronized void refreshSyncMap(Context context) {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        String str;
        String str2;
        File a5;
        try {
            a5 = a(this.f1898b, getConfigFileName());
            TbsLog.i(TAG, "refreshSyncMap propFile is " + a5);
        } catch (Throwable th2) {
            bufferedInputStream = null;
            th = th2;
        }
        if (a5 == null) {
            return;
        }
        this.f1897a.clear();
        bufferedInputStream = new BufferedInputStream(new FileInputStream(a5));
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            for (String str3 : properties.stringPropertyNames()) {
                this.f1897a.put(str3, properties.getProperty(str3));
            }
            TbsLog.i(TAG, "refreshSyncMap pv mSyncMap is " + this.f1897a.toString());
            try {
                bufferedInputStream.close();
            } catch (Exception e5) {
                str = TAG;
                str2 = "refreshSyncMap stack is " + Log.getStackTraceString(e5);
                TbsLog.i(str, str2);
            }
        } catch (Throwable th3) {
            th = th3;
            try {
                TbsLog.i(TAG, "refreshSyncMap stack is " + Log.getStackTraceString(th));
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception e6) {
                        str = TAG;
                        str2 = "refreshSyncMap stack is " + Log.getStackTraceString(e6);
                        TbsLog.i(str, str2);
                    }
                }
            } finally {
            }
        }
    }

    public void update(Map<String, String> map) {
        this.f1897a.clear();
        this.f1897a.putAll(map);
        commit();
    }

    public synchronized void writeTbsDownloadInfo() {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        String str;
        String str2;
        File a5;
        TbsLog.i(TAG, "writeTbsDownloadInfo #1");
        BufferedInputStream bufferedInputStream = null;
        try {
            a5 = a(this.f1898b, getConfigFileName());
            TbsLog.i(TAG, "writeTbsDownloadInfo propFile is " + a5);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        if (a5 == null) {
            return;
        }
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(a5));
        try {
            Properties properties = new Properties();
            properties.load(bufferedInputStream2);
            properties.clear();
            Set<String> keySet = this.f1897a.keySet();
            TbsLog.i(TAG, "writeTbsDownloadInfo mSyncMap.size() is " + this.f1897a.size());
            for (String str3 : keySet) {
                String str4 = this.f1897a.get(str3);
                properties.setProperty(str3, "" + ((Object) str4));
                TbsLog.i(TAG, "writeTbsDownloadInfo key is " + str3 + " value is " + ((Object) str4));
            }
            this.f1897a.clear();
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(a5));
            try {
                properties.store(bufferedOutputStream, (String) null);
                TbsLog.i(TAG, "writeTbsDownloadInfo end ");
                try {
                    bufferedInputStream2.close();
                } catch (Exception e5) {
                    TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e5));
                }
                try {
                    bufferedOutputStream.close();
                } catch (Exception e6) {
                    str = TAG;
                    str2 = "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e6);
                    TbsLog.i(str, str2);
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedInputStream = bufferedInputStream2;
                try {
                    TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(th));
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (Exception e7) {
                            TbsLog.i(TAG, "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e7));
                        }
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Exception e8) {
                            str = TAG;
                            str2 = "writeTbsDownloadInfo stack is " + Log.getStackTraceString(e8);
                            TbsLog.i(str, str2);
                        }
                    }
                } finally {
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }
}
