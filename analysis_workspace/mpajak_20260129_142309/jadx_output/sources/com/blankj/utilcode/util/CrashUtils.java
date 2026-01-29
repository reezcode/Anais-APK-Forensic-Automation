package com.blankj.utilcode.util;

import androidx.activity.d;
import androidx.annotation.NonNull;
import com.blankj.utilcode.util.UtilsBridge;
import java.io.File;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: classes25.dex */
public final class CrashUtils {
    private static final String FILE_SEP = System.getProperty("file.separator");
    private static final Thread.UncaughtExceptionHandler DEFAULT_UNCAUGHT_EXCEPTION_HANDLER = Thread.getDefaultUncaughtExceptionHandler();

    public static final class CrashInfo {
        private UtilsBridge.FileHead mFileHeadProvider;
        private Throwable mThrowable;

        private CrashInfo(String str, Throwable th) {
            this.mThrowable = th;
            UtilsBridge.FileHead fileHead = new UtilsBridge.FileHead("Crash");
            this.mFileHeadProvider = fileHead;
            fileHead.addFirst("Time Of Crash", str);
        }

        public final void addExtraHead(String str, String str2) {
            this.mFileHeadProvider.append(str, str2);
        }

        public final void addExtraHead(Map<String, String> map) {
            this.mFileHeadProvider.append(map);
        }

        public final Throwable getThrowable() {
            return this.mThrowable;
        }

        public String toString() {
            return this.mFileHeadProvider.toString() + UtilsBridge.getFullStackTrace(this.mThrowable);
        }
    }

    /* loaded from: classes16.dex */
    public interface OnCrashListener {
        void onCrash(CrashInfo crashInfo);
    }

    private CrashUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static Thread.UncaughtExceptionHandler getUncaughtExceptionHandler(final String str, final OnCrashListener onCrashListener) {
        return new Thread.UncaughtExceptionHandler() { // from class: com.blankj.utilcode.util.CrashUtils.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
                String format = new SimpleDateFormat("yyyy_MM_dd-HH_mm_ss").format(new Date());
                CrashInfo crashInfo = new CrashInfo(format, th);
                UtilsBridge.writeFileFromString(str + format + ".txt", crashInfo.toString(), true);
                if (CrashUtils.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER != null) {
                    CrashUtils.DEFAULT_UNCAUGHT_EXCEPTION_HANDLER.uncaughtException(thread, th);
                }
                OnCrashListener onCrashListener2 = onCrashListener;
                if (onCrashListener2 != null) {
                    onCrashListener2.onCrash(crashInfo);
                }
            }
        };
    }

    public static void init() {
        init("");
    }

    public static void init(OnCrashListener onCrashListener) {
        init("", onCrashListener);
    }

    public static void init(@NonNull File file) {
        init(file.getAbsolutePath(), (OnCrashListener) null);
    }

    public static void init(@NonNull File file, OnCrashListener onCrashListener) {
        init(file.getAbsolutePath(), onCrashListener);
    }

    public static void init(String str) {
        init(str, (OnCrashListener) null);
    }

    public static void init(String str, OnCrashListener onCrashListener) {
        StringBuilder sb;
        File filesDir;
        if (UtilsBridge.isSpace(str)) {
            if (!UtilsBridge.isSDCardEnableByEnvironment() || Utils.getApp().getExternalFilesDir(null) == null) {
                sb = new StringBuilder();
                filesDir = Utils.getApp().getFilesDir();
            } else {
                sb = new StringBuilder();
                filesDir = Utils.getApp().getExternalFilesDir(null);
            }
            sb.append(filesDir);
            String str2 = FILE_SEP;
            sb.append(str2);
            sb.append("crash");
            sb.append(str2);
            str = sb.toString();
        } else {
            String str3 = FILE_SEP;
            if (!str.endsWith(str3)) {
                str = d.f(str, str3);
            }
        }
        Thread.setDefaultUncaughtExceptionHandler(getUncaughtExceptionHandler(str, onCrashListener));
    }
}
