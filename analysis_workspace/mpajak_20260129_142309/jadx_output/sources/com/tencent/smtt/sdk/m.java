package com.tencent.smtt.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.multidex.MultiDexExtractor;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes13.dex */
class m {

    /* renamed from: c, reason: collision with root package name */
    private static m f2187c;

    /* renamed from: e, reason: collision with root package name */
    private FileLock f2195e;

    /* renamed from: f, reason: collision with root package name */
    private FileOutputStream f2196f;

    /* renamed from: o, reason: collision with root package name */
    private QbSdk.a f2199o;

    /* renamed from: h, reason: collision with root package name */
    private static final ReentrantLock f2188h = new ReentrantLock();

    /* renamed from: i, reason: collision with root package name */
    private static final Lock f2189i = new ReentrantLock();

    /* renamed from: k, reason: collision with root package name */
    private static FileLock f2190k = null;

    /* renamed from: l, reason: collision with root package name */
    private static final ThreadLocal<Integer> f2191l = new ThreadLocal<Integer>() { // from class: com.tencent.smtt.sdk.m.1
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer initialValue() {
            return 0;
        }
    };

    /* renamed from: m, reason: collision with root package name */
    private static Handler f2192m = null;

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2185a = false;

    /* renamed from: b, reason: collision with root package name */
    public static final FileFilter f2186b = new FileFilter() { // from class: com.tencent.smtt.sdk.m.2
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            String name = file.getName();
            if (name == null || name.endsWith(".jar_is_first_load_dex_flag_file")) {
                return false;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (name.endsWith(MultiDexExtractor.DEX_SUFFIX)) {
                return false;
            }
            if (i5 < 26 || !name.endsWith(".prof")) {
                return i5 < 26 || !name.equals("oat");
            }
            return false;
        }
    };

    /* renamed from: n, reason: collision with root package name */
    private static int f2193n = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f2194d = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2197g = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2198j = false;

    /* renamed from: p, reason: collision with root package name */
    private int f2200p = -1;

    private m() {
        if (f2192m == null) {
            f2192m = new Handler(TbsHandlerThread.getInstance().getLooper()) { // from class: com.tencent.smtt.sdk.m.3
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    QbSdk.setTBSInstallingStatus(true);
                    int i5 = message.what;
                    if (i5 == 1) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE");
                        Object[] objArr = (Object[]) message.obj;
                        m.this.b((Context) objArr[0], (String) objArr[1], ((Integer) objArr[2]).intValue());
                        return;
                    }
                    if (i5 == 2) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_COPY_TBS_CORE");
                        Object[] objArr2 = (Object[]) message.obj;
                        m.this.a((Context) objArr2[0], (Context) objArr2[1], ((Integer) objArr2[2]).intValue());
                    } else if (i5 == 3) {
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_INSTALL_TBS_CORE_EX");
                        Object[] objArr3 = (Object[]) message.obj;
                        m.this.b((Context) objArr3[0], (Bundle) objArr3[1]);
                    } else {
                        if (i5 != 4) {
                            return;
                        }
                        TbsLog.i("TbsInstaller", "TbsInstaller--handleMessage--MSG_UNZIP_TBS_CORE");
                        Object[] objArr4 = (Object[]) message.obj;
                        m.this.a((Context) objArr4[0], (File) objArr4[1], ((Integer) objArr4[2]).intValue());
                        QbSdk.setTBSInstallingStatus(false);
                        super.handleMessage(message);
                    }
                }
            };
        }
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            if (f2187c == null) {
                synchronized (m.class) {
                    if (f2187c == null) {
                        f2187c = new m();
                    }
                }
            }
            mVar = f2187c;
        }
        return mVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x008f -> B:15:0x00a9). Please report as a decompilation issue!!! */
    private void a(int i5, String str, Context context) {
        BufferedInputStream bufferedInputStream;
        new File(str).delete();
        TbsLog.i("TbsInstaller", "Local tbs apk(" + str + ") is deleted!", true);
        File file = new File(QbSdk.getTbsFolderDir(context), "core_unzip_tmp");
        if (file.canRead()) {
            File file2 = new File(file, "tbs.conf");
            Properties properties = new Properties();
            BufferedOutputStream bufferedOutputStream = null;
            try {
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                    try {
                        properties.load(bufferedInputStream);
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                        try {
                            properties.setProperty("tbs_local_installation", "true");
                            properties.store(bufferedOutputStream2, (String) null);
                            TbsLog.i("TbsInstaller", "TBS_LOCAL_INSTALLATION is set!", true);
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                            bufferedInputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            try {
                                th.printStackTrace();
                                if (bufferedOutputStream != null) {
                                    try {
                                        bufferedOutputStream.close();
                                    } catch (IOException e6) {
                                        e6.printStackTrace();
                                    }
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                            } finally {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                }
            } catch (IOException e7) {
                e7.printStackTrace();
            }
        }
    }

    public static void a(Context context) {
        String str;
        if (r(context)) {
            return;
        }
        if (a(context, "core_unzip_tmp")) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_UNZIP_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_UNZIP_FOLDER_NAME";
        } else if (a(context, "core_share_backup_tmp")) {
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_BACKUP_TBSCORE_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_BACKUP_TBSCORE_FOLDER_NAME";
        } else {
            if (!a(context, "core_copy_tmp")) {
                return;
            }
            TbsCoreLoadStat.getInstance().a(context, TbsListener.ErrorCode.INFO_TEMP_CORE_EXIST_CONF_ERROR, new Throwable("TMP_TBS_COPY_FOLDER_NAME"));
            str = "TbsInstaller-UploadIfTempCoreExistConfError INFO_TEMP_CORE_EXIST_CONF_ERROR TMP_TBS_COPY_FOLDER_NAME";
        }
        TbsLog.e("TbsInstaller", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0372 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ba A[Catch: Exception -> 0x0484, all -> 0x049d, TryCatch #14 {Exception -> 0x0484, blocks: (B:59:0x01df, B:114:0x03ac, B:116:0x03ba, B:117:0x03c2, B:118:0x03cf, B:125:0x040b, B:126:0x03c6, B:158:0x042d, B:164:0x0436, B:163:0x0433, B:176:0x0437, B:191:0x046f, B:193:0x0488), top: B:56:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c6 A[Catch: Exception -> 0x0484, all -> 0x049d, TryCatch #14 {Exception -> 0x0484, blocks: (B:59:0x01df, B:114:0x03ac, B:116:0x03ba, B:117:0x03c2, B:118:0x03cf, B:125:0x040b, B:126:0x03c6, B:158:0x042d, B:164:0x0436, B:163:0x0433, B:176:0x0437, B:191:0x046f, B:193:0x0488), top: B:56:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x042d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[Catch: Exception -> 0x0484, all -> 0x049d, SYNTHETIC, TryCatch #14 {Exception -> 0x0484, blocks: (B:59:0x01df, B:114:0x03ac, B:116:0x03ba, B:117:0x03c2, B:118:0x03cf, B:125:0x040b, B:126:0x03c6, B:158:0x042d, B:164:0x0436, B:163:0x0433, B:176:0x0437, B:191:0x046f, B:193:0x0488), top: B:56:0x01db }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ac A[Catch: all -> 0x0462, Exception -> 0x0467, TryCatch #16 {Exception -> 0x0467, all -> 0x0462, blocks: (B:62:0x0212, B:64:0x021e, B:66:0x0227, B:135:0x0281, B:81:0x02ac, B:82:0x02ba, B:84:0x02bd, B:86:0x02c9, B:88:0x02d5, B:90:0x02e1, B:92:0x02e7, B:97:0x02f4, B:100:0x0308, B:102:0x030e, B:105:0x032a, B:106:0x035c, B:109:0x0374, B:112:0x039e, B:96:0x0357, B:139:0x0287, B:148:0x02a0, B:152:0x02a6), top: B:61:0x0212, inners: #10, #11 }] */
    @android.annotation.TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r22, android.content.Context r23, int r24) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.a(android.content.Context, android.content.Context, int):void");
    }

    private boolean a(Context context, File file, boolean z4) {
        TbsDownloadConfig tbsDownloadConfig;
        int i5;
        TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs start isDecoupleCore is " + z4);
        if (FileUtil.c(file)) {
            try {
                File tbsFolderDir = QbSdk.getTbsFolderDir(context);
                File file2 = z4 ? new File(tbsFolderDir, "core_share_decouple") : new File(tbsFolderDir, "core_unzip_tmp");
                if (file2.exists() && !TbsDownloader.a(context)) {
                    FileUtil.b(file2);
                }
            } catch (Throwable th) {
                StringBuilder g5 = androidx.activity.d.g("TbsInstaller-unzipTbs -- delete unzip folder if exists exception");
                g5.append(Log.getStackTraceString(th));
                TbsLog.e("TbsInstaller", g5.toString());
            }
            File e5 = z4 ? e(context, 2) : e(context, 0);
            if (e5 != null) {
                try {
                    FileUtil.a(e5);
                    if (z4) {
                        FileUtil.a(e5, true);
                    }
                    boolean a5 = FileUtil.a(file, e5);
                    if (a5) {
                        a5 = a(e5, context);
                    }
                    if (z4) {
                        for (String str : e5.list()) {
                            File file3 = new File(e5, str);
                            if (file3.getName().endsWith(MultiDexExtractor.DEX_SUFFIX)) {
                                file3.delete();
                            }
                        }
                        try {
                            new File(o(context), "x5.tbs").delete();
                        } catch (Exception unused) {
                        }
                    }
                    if (a5) {
                        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #05");
                        e(context, true);
                    } else {
                        FileUtil.b(e5);
                        TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-522);
                        TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#1! exist:" + e5.exists());
                    }
                    return a5;
                } catch (IOException e6) {
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
                    TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_IO_ERROR, e6);
                    if (e5.exists()) {
                        try {
                            FileUtil.b(e5);
                            TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + e5.exists());
                        } catch (Throwable th2) {
                            StringBuilder g6 = androidx.activity.d.g("copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:");
                            g6.append(Log.getStackTraceString(th2));
                            TbsLog.e("TbsInstaller", g6.toString());
                        }
                    }
                    return false;
                } catch (Exception e7) {
                    TbsDownloadConfig.getInstance(context).setInstallInterruptCode(-523);
                    TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_OTHER_ERROR, e7);
                    if (e5.exists()) {
                        try {
                            FileUtil.b(e5);
                            TbsLog.e("TbsInstaller", "copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exist:" + e5.exists());
                        } catch (Throwable th3) {
                            StringBuilder g7 = androidx.activity.d.g("copyFileIfChanged -- delete tmpTbsCoreUnzipDir#2! exception:");
                            g7.append(Log.getStackTraceString(th3));
                            TbsLog.e("TbsInstaller", g7.toString());
                        }
                    }
                    return false;
                } finally {
                    TbsLog.i("TbsInstaller", "TbsInstaller-unzipTbs done");
                }
            }
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.UNZIP_DIR_ERROR, "tmp unzip dir is null!");
            tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            i5 = -521;
        } else {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.APK_INVALID, "apk is invalid!");
            tbsDownloadConfig = TbsDownloadConfig.getInstance(context);
            i5 = -520;
        }
        tbsDownloadConfig.setInstallInterruptCode(i5);
        return false;
    }

    public static boolean a(Context context, String str) {
        StringBuilder sb;
        String str2;
        File file = new File(QbSdk.getTbsFolderDir(context), str);
        if (!file.exists()) {
            sb = new StringBuilder();
            str2 = "#1# ";
        } else {
            if (new File(file, "tbs.conf").exists()) {
                TbsLog.i("TbsInstaller", "isPrepareTbsCore", "#3# " + str);
                return true;
            }
            sb = new StringBuilder();
            str2 = "#2# ";
        }
        sb.append(str2);
        sb.append(str);
        TbsLog.i("TbsInstaller", "isPrepareTbsCore", sb.toString());
        return false;
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0148: MOVE (r14 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:84:0x0148 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(java.io.File r13, android.content.Context r14) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.a(java.io.File, android.content.Context):boolean");
    }

    public static void b() {
        f2191l.set(0);
    }

    private boolean b(Context context, File file) {
        return a(context, file, false);
    }

    private int c(Context context, Bundle bundle) {
        try {
            Bundle a5 = QbSdk.a(context, bundle);
            TbsLog.i("TbsInstaller", "tpatch finished,ret is" + a5);
            int i5 = a5.getInt("patch_result");
            if (i5 != 0) {
                String string = bundle.getString("new_apk_location");
                if (!TextUtils.isEmpty(string)) {
                    FileUtil.b(new File(string));
                }
                TbsLogReport.getInstance(context).setInstallErrorCode(i5, "tpatch fail,patch error_code=" + i5);
                return 1;
            }
            String string2 = bundle.getString("new_apk_location");
            int i6 = bundle.getInt("new_core_ver");
            int a6 = a(new File(string2));
            TbsLog.i("TbsInstaller", "doTpatch version is " + i6 + " patchVersion is " + a6);
            if (i6 == a6) {
                TbsLog.i("TbsInstaller", "Tpatch success!");
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.TPATCH_INSTALL_SUCCESS, "");
                return 0;
            }
            TbsLog.i("TbsInstaller", "version not equals!!!" + i6 + "patchVersion:" + a6);
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.TPATCH_VERSION_FAILED, "version=" + i6 + ",patchVersion=" + a6);
            return 1;
        } catch (Exception e5) {
            e5.printStackTrace();
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            StringBuilder g5 = androidx.activity.d.g("patch exception");
            g5.append(Log.getStackTraceString(e5));
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.DECOUPLE_TPATCH_FAIL, g5.toString());
            return 1;
        }
    }

    private boolean c(Context context, File file) {
        try {
            File[] listFiles = file.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.6
                @Override // java.io.FileFilter
                public boolean accept(File file2) {
                    return file2.getName().endsWith(".jar");
                }
            });
            int length = listFiles.length;
            ClassLoader classLoader = context.getClassLoader();
            for (int i5 = 0; i5 < length; i5++) {
                TbsLog.i("TbsInstaller", "jarFile: " + listFiles[i5].getAbsolutePath());
                new DexClassLoader(listFiles[i5].getAbsolutePath(), file.getAbsolutePath(), null, classLoader);
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOPT_EXCEPTION, e5.toString());
            TbsLog.i("TbsInstaller", "TbsInstaller-doTbsDexOpt done");
            return false;
        }
    }

    private synchronized boolean c(Context context, boolean z4) {
        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch");
        boolean z5 = false;
        try {
        } catch (Throwable th) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.COPY_EXCEPTION, th.toString());
            QbSdk.a(context, "TbsInstaller::enableTbsCoreFromTpatch exception:" + Log.getStackTraceString(th));
        }
        if (!p(context)) {
            return false;
        }
        ReentrantLock reentrantLock = f2188h;
        boolean tryLock = reentrantLock.tryLock();
        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch Locked =" + tryLock);
        if (tryLock) {
            try {
                int b5 = l.a(context).b("tpatch_status");
                int a5 = a(false, context);
                TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch copyStatus =" + b5);
                TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer =" + a5);
                if (b5 == 1) {
                    if (a5 == 0) {
                        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer = 0", true);
                    } else if (z4) {
                        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromTpatch tbsCoreInstalledVer != 0", true);
                    }
                    u(context);
                    z5 = true;
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                f2188h.unlock();
                throw th2;
            }
        }
        c();
        return z5;
    }

    private boolean d(Context context, File file) {
        try {
            File file2 = new File(file, "tbs_sdk_extension_dex.jar");
            File file3 = new File(file, "tbs_sdk_extension_dex.dex");
            new DexClassLoader(file2.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
            String a5 = d.a(context, file3.getAbsolutePath());
            if (TextUtils.isEmpty(a5)) {
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOAT_EXCEPTION, "can not find oat command");
                return false;
            }
            for (File file4 : file.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.7
                @Override // java.io.FileFilter
                public boolean accept(File file5) {
                    return file5.getName().endsWith(".jar");
                }
            })) {
                String substring = file4.getName().substring(0, r5.getName().length() - 4);
                Runtime.getRuntime().exec("/system/bin/dex2oat " + a5.replaceAll("tbs_sdk_extension_dex", substring) + " --dex-location=" + a().n(context) + File.separator + substring + ".jar").waitFor();
            }
            return true;
        } catch (Exception e5) {
            e5.printStackTrace();
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.DEXOAT_EXCEPTION, e5);
            return false;
        }
    }

    private synchronized boolean d(Context context, boolean z4) {
        if (context != null) {
            if (TbsConfig.APP_WX.equals(context.getApplicationContext().getApplicationInfo().packageName)) {
                TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.INSTALL_FROM_UNZIP, " ");
            }
        }
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "canRenameTmpDir =" + z4);
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#1#");
        boolean z5 = false;
        try {
        } catch (Exception e5) {
            QbSdk.a(context, "TbsInstaller::enableTbsCoreFromUnzip Exception: " + e5);
            e5.printStackTrace();
        }
        if (!p(context)) {
            return false;
        }
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#2# getInstallFileLock Success!!");
        ReentrantLock reentrantLock = f2188h;
        boolean tryLock = reentrantLock.tryLock();
        TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "locked=" + tryLock);
        if (tryLock) {
            try {
                int c5 = l.a(context).c();
                TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip installStatus=" + c5);
                int a5 = a(false, context);
                if (c5 == 2) {
                    TbsLog.i("TbsInstaller", "enableTbsCoreFromUnzip", "#4# In Rename Logic");
                    if (a5 == 0) {
                        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer = 0", false);
                    } else if (z4) {
                        TbsLog.i("TbsInstaller", "TbsInstaller-enableTbsCoreFromUnzip tbsCoreInstalledVer != 0", false);
                    }
                    t(context);
                    z5 = true;
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                f2188h.unlock();
                throw th;
            }
        }
        c();
        return z5;
    }

    private void e(Context context, boolean z4) {
        if (context == null) {
            TbsLogReport.getInstance(context).setInstallErrorCode(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, "setTmpFolderCoreToRead context is null");
            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner return #01");
            return;
        }
        try {
            File file = new File(QbSdk.getTbsFolderDir(context), "tmp_folder_core_to_read.conf");
            if (!z4) {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file delete #01");
                FileUtil.b(file);
            } else if (file.exists()) {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file already exist #01");
            } else {
                TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner tmp file create #01");
                file.createNewFile();
            }
        } catch (Exception e5) {
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            StringBuilder g5 = androidx.activity.d.g("setTmpFolderCoreToRead Exception message is ");
            g5.append(e5.getMessage());
            g5.append(" Exception cause is ");
            g5.append(e5.getCause());
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, g5.toString());
            TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead inner exception #01");
        }
    }

    private void f(Context context, int i5) {
        TbsLog.i("TbsInstaller", "proceedTpatchStatus,result=" + i5);
        if (i5 != 0) {
            return;
        }
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #03");
        e(context, true);
        l.a(context).b(TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_TBS_DOWNLOAD_V, 0), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092 A[Catch: Exception -> 0x00a2, TryCatch #1 {Exception -> 0x00a2, blocks: (B:7:0x001f, B:10:0x0034, B:17:0x0066, B:20:0x006f, B:26:0x0084, B:28:0x008a, B:31:0x0092, B:34:0x0098, B:40:0x005c, B:41:0x0039, B:42:0x003e, B:45:0x0045, B:12:0x0049, B:14:0x0051), top: B:2:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00a2, blocks: (B:7:0x001f, B:10:0x0034, B:17:0x0066, B:20:0x006f, B:26:0x0084, B:28:0x008a, B:31:0x0092, B:34:0x0098, B:40:0x005c, B:41:0x0039, B:42:0x003e, B:45:0x0045, B:12:0x0049, B:14:0x0051), top: B:2:0x0018, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean g(android.content.Context r8, int r9) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TbsInstaller-doTbsDexOpt start - dirMode: "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TbsInstaller"
            com.tencent.smtt.utils.TbsLog.i(r1, r0)
            r0 = 0
            r2 = 1
            if (r9 == 0) goto L3e
            if (r9 == r2) goto L39
            r3 = 2
            if (r9 == r3) goto L34
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La2
            r3.<init>()     // Catch: java.lang.Exception -> La2
            java.lang.String r4 = "doDexoptOrDexoat mode error: "
            r3.append(r4)     // Catch: java.lang.Exception -> La2
            r3.append(r9)     // Catch: java.lang.Exception -> La2
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Exception -> La2
            com.tencent.smtt.utils.TbsLog.e(r1, r9)     // Catch: java.lang.Exception -> La2
            return r0
        L34:
            java.io.File r9 = r7.n(r8)     // Catch: java.lang.Exception -> La2
            goto L49
        L39:
            java.io.File r9 = r7.e(r8, r2)     // Catch: java.lang.Exception -> La2
            goto L49
        L3e:
            boolean r9 = com.tencent.smtt.sdk.TbsDownloader.a(r8)     // Catch: java.lang.Exception -> La2
            if (r9 == 0) goto L45
            return r2
        L45:
            java.io.File r9 = r7.e(r8, r0)     // Catch: java.lang.Exception -> La2
        L49:
            java.lang.String r3 = "java.vm.version"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L65
            java.lang.String r4 = "2"
            boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L65
            r3 = 1
            goto L66
        L5b:
            r3 = move-exception
            com.tencent.smtt.sdk.TbsLogReport r4 = com.tencent.smtt.sdk.TbsLogReport.getInstance(r8)     // Catch: java.lang.Exception -> La2
            r5 = 226(0xe2, float:3.17E-43)
            r4.setInstallErrorCode(r5, r3)     // Catch: java.lang.Exception -> La2
        L65:
            r3 = 0
        L66:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> La2
            r5 = 23
            if (r4 != r5) goto L6e
            r4 = 1
            goto L6f
        L6e:
            r4 = 0
        L6f:
            com.tencent.smtt.sdk.TbsDownloadConfig r5 = com.tencent.smtt.sdk.TbsDownloadConfig.getInstance(r8)     // Catch: java.lang.Exception -> La2
            android.content.SharedPreferences r5 = r5.mPreferences     // Catch: java.lang.Exception -> La2
            java.lang.String r6 = "tbs_stop_preoat"
            boolean r5 = r5.getBoolean(r6, r0)     // Catch: java.lang.Exception -> La2
            if (r3 == 0) goto L82
            if (r4 == 0) goto L82
            if (r5 != 0) goto L82
            r0 = 1
        L82:
            if (r0 == 0) goto L90
            boolean r0 = r7.d(r8, r9)     // Catch: java.lang.Exception -> La2
            if (r0 == 0) goto L90
            java.lang.String r9 = "doTbsDexOpt -- doDexoatForArtVm"
            com.tencent.smtt.utils.TbsLog.i(r1, r9)     // Catch: java.lang.Exception -> La2
            return r2
        L90:
            if (r3 == 0) goto L98
            java.lang.String r9 = "doTbsDexOpt -- is ART mode, skip!"
            com.tencent.smtt.utils.TbsLog.i(r1, r9)     // Catch: java.lang.Exception -> La2
            goto Lb3
        L98:
            java.lang.String r0 = "doTbsDexOpt -- doDexoptForDavlikVM"
            com.tencent.smtt.utils.TbsLog.i(r1, r0)     // Catch: java.lang.Exception -> La2
            boolean r8 = r7.c(r8, r9)     // Catch: java.lang.Exception -> La2
            return r8
        La2:
            r9 = move-exception
            r9.printStackTrace()
            com.tencent.smtt.sdk.TbsLogReport r8 = com.tencent.smtt.sdk.TbsLogReport.getInstance(r8)
            r0 = 209(0xd1, float:2.93E-43)
            java.lang.String r9 = r9.toString()
            r8.setInstallErrorCode(r0, r9)
        Lb3:
            java.lang.String r8 = "TbsInstaller-doTbsDexOpt done"
            com.tencent.smtt.utils.TbsLog.i(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.g(android.content.Context, int):boolean");
    }

    public static File o(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_private");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    private int q(Context context) {
        boolean z4 = l.a(context).d() == 1;
        boolean a5 = TbsDownloader.a(context);
        if (z4) {
            return a5 ? TbsListener.ErrorCode.DECOUPLE_INCURUPDATE_SUCCESS : TbsListener.ErrorCode.INCRUPDATE_INSTALL_SUCCESS;
        }
        if (a5) {
            return TbsListener.ErrorCode.DECOUPLE_INSTLL_SUCCESS;
        }
        return 200;
    }

    private static boolean r(Context context) {
        String str;
        if (context == null) {
            str = "#1#";
        } else {
            try {
                if (new File(QbSdk.getTbsFolderDir(context), "tmp_folder_core_to_read.conf").exists()) {
                    TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", "#2#");
                    return true;
                }
                TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", "#3#");
                return false;
            } catch (Exception unused) {
                str = "#4#";
            }
        }
        TbsLog.i("TbsInstaller", "getTmpFolderCoreToRead", str);
        return true;
    }

    private boolean s(Context context) {
        TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock #1 ");
        FileLock e5 = FileUtil.e(context);
        f2190k = e5;
        if (e5 == null) {
            TbsLog.i("TbsInstaller", "getTbsCoreRenameFileLock## failed!");
            return false;
        }
        TbsLog.i("TbsInstaller", "Tbsinstaller getTbsCoreRenameFileLock true ");
        return true;
    }

    private void t(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip");
        if (!s(context)) {
            TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
            return;
        }
        try {
            v(context);
            w(context);
            TbsLog.i("TbsInstaller", "after renameTbsCoreShareDir");
            TbsLog.i("TbsInstaller", "is thirdapp and not chmod");
            l.a(context).a(0);
            l.a(context).b(0);
            l.a(context).d(0);
            l.a(context).a("incrupdate_retry_num", 0);
            l.a(context).c(0, 3);
            l.a(context).a("");
            l.a(context).a("tpatch_num", 0);
            l.a(context).c(-1);
            f2191l.set(0);
            f2193n = 0;
        } catch (Throwable th) {
            th.printStackTrace();
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            StringBuilder g5 = androidx.activity.d.g("exception when renameing from unzip:");
            g5.append(th.toString());
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.RENAME_EXCEPTION, g5.toString());
            TbsLog.e("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromUnzip Exception", true);
        }
        e(context);
    }

    private void u(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--generateNewTbsCoreFromTpatch");
        if (!s(context)) {
            TbsLog.i("TbsInstaller", "get rename fileLock#4 ## failed!");
            return;
        }
        try {
            v(context);
            x(context);
            l.a(context).b(0, -1);
            l.a(context).a("tpatch_num", 0);
            f2191l.set(0);
        } catch (Exception e5) {
            e5.printStackTrace();
            TbsLogReport tbsLogReport = TbsLogReport.getInstance(context);
            StringBuilder g5 = androidx.activity.d.g("exception when renameing from tpatch:");
            g5.append(e5.toString());
            tbsLogReport.setInstallErrorCode(TbsListener.ErrorCode.TPATCH_ENABLE_EXCEPTION, g5.toString());
        }
        e(context);
    }

    private void v(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--deleteOldCore");
        FileUtil.a(n(context), false, true);
    }

    private void w(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--renameShareDir");
        File e5 = e(context, 0);
        File n4 = n(context);
        if (e5 == null || n4 == null) {
            TbsLog.i("TbsInstaller", "renameTbsCoreShareDir return,tmpTbsCoreUnzipDir=" + e5 + "tbsSharePath=" + n4);
            return;
        }
        boolean renameTo = e5.renameTo(n4);
        if (renameTo && this.f2199o != null) {
            this.f2199o.a(n4.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.4
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file.getName().contains(".so");
                }
            }));
        }
        TbsLog.i("TbsInstaller", "renameTbsCoreShareDir rename success=" + renameTo);
        e(context, false);
    }

    private void x(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--renameTbsTpatchCoreDir");
        File e5 = e(context, 5);
        File n4 = n(context);
        if (e5 == null || n4 == null) {
            return;
        }
        if (e5.renameTo(n4) && this.f2199o != null) {
            this.f2199o.a(n4.listFiles(new FileFilter() { // from class: com.tencent.smtt.sdk.m.5
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file.getName().contains(".so");
                }
            }));
        }
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #09");
        e(context, false);
    }

    private void y(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--clearNewTbsCore");
        File e5 = e(context, 0);
        if (e5 != null) {
            FileUtil.a(e5, false);
        }
        l.a(context).c(0, 5);
        l.a(context).c(-1);
        QbSdk.a(context, "TbsInstaller::clearNewTbsCore forceSysWebViewInner!");
    }

    public int a(File file) {
        BufferedInputStream bufferedInputStream = null;
        try {
            TbsLog.i("TbsInstaller", "TbsInstaller--getTbsVersion  tbsShareDir is " + file);
            File file2 = new File(file, "tbs.conf");
            if (!file2.exists()) {
                return 0;
            }
            Properties properties = new Properties();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
            try {
                properties.load(bufferedInputStream2);
                bufferedInputStream2.close();
                String property = properties.getProperty("tbs_core_version");
                if (property == null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return 0;
                }
                int parseInt = Integer.parseInt(property);
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
                return parseInt;
            } catch (Exception unused3) {
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int a(boolean z4, Context context) {
        if (z4 || f2191l.get().intValue() <= 0) {
            f2191l.set(Integer.valueOf(g(context)));
        }
        return f2191l.get().intValue();
    }

    public File a(Context context, int i5, boolean z4) {
        String str;
        String str2;
        File tbsFolderDir = QbSdk.getTbsFolderDir(context);
        switch (i5) {
            case 0:
                str = "core_unzip_tmp";
                break;
            case 1:
                str = "core_copy_tmp";
                break;
            case 2:
                str = "core_unzip_tmp_decouple";
                break;
            case 3:
                str = "core_share_backup";
                break;
            case 4:
                str = "core_share_backup_tmp";
                break;
            case 5:
                str = "tpatch_tmp";
                break;
            case 6:
                str = "tpatch_decouple_tmp";
                break;
            default:
                str = "";
                break;
        }
        TbsLog.i("TbsInstaller", "type=" + i5 + "needMakeDir=" + z4 + "folder=" + str);
        File file = new File(tbsFolderDir, str);
        if (!file.isDirectory()) {
            if (z4) {
                str2 = file.mkdir() ? "getCoreDir,no need mkdir" : "getCoreDir,mkdir false";
            }
            TbsLog.i("TbsInstaller", str2);
            return null;
        }
        return file;
    }

    public File a(Context context, File file) {
        File file2 = new File(file, "core_share_decouple");
        if (file2.isDirectory() || file2.mkdir()) {
            return file2;
        }
        return null;
    }

    public void a(Context context, int i5) {
        TbsLog.i("TbsInstaller", "setTmpFolderCoreToRead call #01 ");
        e(context, true);
        l.a(context).c(i5, 2);
    }

    public void a(Context context, Bundle bundle) {
        if (bundle == null || context == null) {
            return;
        }
        Object[] objArr = {context, bundle};
        Message message = new Message();
        message.what = 3;
        message.obj = objArr;
        f2192m.sendMessage(message);
    }

    public void a(Context context, File file, int i5) {
        FileOutputStream b5 = FileUtil.b(context, true, "core_unzip.lock");
        FileLock a5 = FileUtil.a(context, b5);
        if (a5 == null) {
            TbsLog.i("TbsInstaller", "can not get Core unzip FileLock,skip!!!");
            return;
        }
        TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread #1");
        boolean a6 = a(context, file, false);
        TbsLog.i("TbsInstaller", "unzipTbsCoreToThirdAppTmpInThread result is " + a6);
        if (a6) {
            a().a(context, i5);
        }
        FileUtil.a(a5, b5);
    }

    public void a(Context context, String str, int i5) {
        TbsLog.i("TbsInstaller", "installTbsCore Path: " + str + ";Ver: " + i5 + "\npn: " + context.getApplicationInfo().processName + "\npid: " + Process.myPid() + "\ntn: " + Thread.currentThread().getName());
        Object[] objArr = {context, str, Integer.valueOf(i5)};
        Message message = new Message();
        message.what = 1;
        message.obj = objArr;
        f2192m.sendMessage(message);
    }

    public void a(Context context, boolean z4) {
        int c5;
        int b5;
        String d5;
        int c6;
        int b6;
        boolean z5 = true;
        if (z4) {
            this.f2198j = true;
        }
        StringBuilder g5 = androidx.activity.d.g("TbsInstaller-continueInstallTbsCore currentProcessName=");
        g5.append(context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", g5.toString());
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentThreadName=" + Thread.currentThread().getName());
        if (p(context)) {
            ReentrantLock reentrantLock = f2188h;
            if (reentrantLock.tryLock()) {
                try {
                    c5 = l.a(context).c();
                    b5 = l.a(context).b();
                    d5 = l.a(context).d("install_apk_path");
                    c6 = l.a(context).c("copy_core_ver");
                    b6 = l.a(context).b("copy_status");
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    f2188h.unlock();
                    throw th;
                }
            } else {
                b5 = 0;
                c6 = 0;
                b6 = -1;
                d5 = null;
                c5 = -1;
            }
            c();
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore installStatus=" + c5);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreInstallVer=" + b5);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsApkPath=" + d5);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore tbsCoreCopyVer=" + c6);
            TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore copyStatus=" + b6);
            int i5 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_RESPONSECODE, 0);
            if (i5 != 1 && i5 != 2 && i5 != 4) {
                z5 = false;
            }
            if (!z5 && i5 != 0 && i5 != 5) {
                Bundle bundle = new Bundle();
                bundle.putInt("operation", 10001);
                a(context, bundle);
            }
            if (c5 > -1 && c5 < 2) {
                a(context, d5, b5);
            }
            if (b6 == 0) {
                b(context, c6);
            }
        }
    }

    public final void a(QbSdk.a aVar) {
        this.f2199o = aVar;
    }

    public int b(Context context) {
        if (!r(context)) {
            return 0;
        }
        if (a(context, "core_unzip_tmp")) {
            return -1;
        }
        if (a(context, "core_share_backup_tmp")) {
            return -2;
        }
        if (a(context, "core_copy_tmp")) {
            return -3;
        }
        return a(context, "tpatch_tmp") ? -4 : 1;
    }

    public int b(Context context, String str) {
        PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str, 0);
        if (packageArchiveInfo != null) {
            return packageArchiveInfo.versionCode;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ee A[Catch: all -> 0x0232, Exception -> 0x0234, TryCatch #0 {all -> 0x0232, blocks: (B:21:0x00b9, B:26:0x00c3, B:28:0x00c9, B:39:0x00e4, B:41:0x00ee, B:43:0x010b, B:44:0x0113, B:46:0x0119, B:47:0x0121, B:49:0x0127, B:50:0x012f, B:56:0x015d, B:58:0x016b, B:60:0x0178, B:63:0x01ae, B:65:0x01b6, B:72:0x0235, B:83:0x01e7, B:89:0x01f9, B:91:0x0213), top: B:20:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015d A[Catch: all -> 0x0232, Exception -> 0x0234, TRY_ENTER, TryCatch #0 {all -> 0x0232, blocks: (B:21:0x00b9, B:26:0x00c3, B:28:0x00c9, B:39:0x00e4, B:41:0x00ee, B:43:0x010b, B:44:0x0113, B:46:0x0119, B:47:0x0121, B:49:0x0127, B:50:0x012f, B:56:0x015d, B:58:0x016b, B:60:0x0178, B:63:0x01ae, B:65:0x01b6, B:72:0x0235, B:83:0x01e7, B:89:0x01f9, B:91:0x0213), top: B:20:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Context r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.b(android.content.Context, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x046a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @android.annotation.TargetApi(11)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.content.Context r17, java.lang.String r18, int r19) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.m.b(android.content.Context, java.lang.String, int):void");
    }

    public void b(Context context, boolean z4) {
        if (QbSdk.f1809b) {
            return;
        }
        TbsLog.i("TbsInstaller", "installTbsCoreIfNeeded", "#1# check local x5core prepared to install");
        if (r(context)) {
            TbsLog.i("TbsInstaller", "installTbsCoreIfNeeded", "#2# try to install tbs core from tmp dir");
            TbsLog.i("TbsInstaller", (a(context, "core_unzip_tmp") && d(context, z4)) ? "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromUnzip !!" : (a(context, "tpatch_tmp") && c(context, z4)) ? "TbsInstaller-installTbsCoreIfNeeded, enableTbsCoreFromTpatch !!" : "TbsInstaller-installTbsCoreIfNeeded, error !!");
        }
    }

    public boolean b(Context context, int i5) {
        if (TbsDownloader.getOverSea(context)) {
            return false;
        }
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore targetTbsCoreVer=" + i5);
        TbsLog.i("TbsInstaller", "TbsInstaller-continueInstallTbsCore currentProcessName=" + context.getApplicationInfo().processName);
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentProcessId=" + Process.myPid());
        TbsLog.i("TbsInstaller", "TbsInstaller-installLocalTbsCore currentThreadName=" + Thread.currentThread().getName());
        Context c5 = c(context, i5);
        if (c5 == null) {
            TbsLog.i("TbsInstaller", "TbsInstaller--installLocalTbsCore copy from null");
            return false;
        }
        Object[] objArr = {c5, context, Integer.valueOf(i5)};
        Message message = new Message();
        message.what = 2;
        message.obj = objArr;
        f2192m.sendMessage(message);
        return true;
    }

    @Deprecated
    public Context c(Context context, int i5) {
        return null;
    }

    public synchronized void c() {
        int i5 = this.f2194d;
        if (i5 <= 0) {
            TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock currentTbsFileLockStackCount=" + this.f2194d + "call stack:" + Log.getStackTraceString(new Throwable()));
            return;
        }
        if (i5 > 1) {
            TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock with skip");
            this.f2194d--;
        } else {
            if (i5 == 1) {
                TbsLog.i("TbsInstaller", "releaseTbsInstallingFileLock without skip");
                FileUtil.a(this.f2195e, this.f2196f);
                this.f2194d = 0;
            }
        }
    }

    public boolean c(Context context) {
        File file = new File(n(context), "tbs.conf");
        boolean z4 = false;
        if (!file.exists()) {
            return false;
        }
        Properties properties = new Properties();
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                boolean booleanValue = Boolean.valueOf(properties.getProperty("tbs_local_installation", "false")).booleanValue();
                if (booleanValue) {
                    try {
                        if (System.currentTimeMillis() - file.lastModified() > 259200000) {
                            z4 = true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        z4 = booleanValue;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            th.printStackTrace();
                            return z4;
                        } finally {
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                        }
                    }
                }
                TbsLog.i("TbsInstaller", "TBS_LOCAL_INSTALLATION is:" + booleanValue + " expired=" + z4);
                boolean z5 = booleanValue & (!z4);
                try {
                    bufferedInputStream2.close();
                    return z5;
                } catch (IOException e6) {
                    e6.printStackTrace();
                    return z5;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public int d(Context context, int i5) {
        return a(e(context, i5));
    }

    public void d(Context context) {
        BufferedInputStream bufferedInputStream;
        try {
            File file = new File(n(context), "tbs.conf");
            Properties properties = new Properties();
            BufferedOutputStream bufferedOutputStream = null;
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream);
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                    try {
                        properties.setProperty("tbs_local_installation", "false");
                        properties.store(bufferedOutputStream2, (String) null);
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException unused) {
                        }
                    } catch (Throwable unused2) {
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (bufferedInputStream == null) {
                            return;
                        }
                        bufferedInputStream.close();
                    }
                } catch (Throwable unused4) {
                }
            } catch (Throwable unused5) {
                bufferedInputStream = null;
            }
            bufferedInputStream.close();
        } catch (Throwable unused6) {
        }
    }

    public File e(Context context, int i5) {
        return a(context, i5, true);
    }

    public void e(Context context) {
        FileLock fileLock = f2190k;
        if (fileLock != null) {
            FileUtil.a(context, fileLock);
        }
    }

    public int f(Context context) {
        BufferedInputStream bufferedInputStream = null;
        try {
            File file = new File(m(context), "tbs.conf");
            if (!file.exists()) {
                return 0;
            }
            Properties properties = new Properties();
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                properties.load(bufferedInputStream2);
                bufferedInputStream2.close();
                String property = properties.getProperty("tbs_core_version");
                if (property == null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return 0;
                }
                int parseInt = Integer.parseInt(property);
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused2) {
                }
                return parseInt;
            } catch (Exception unused3) {
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public int g(Context context) {
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                File file = new File(n(context), "tbs.conf");
                if (!file.exists()) {
                    return 0;
                }
                TbsLog.i("TbsInstaller", "getTbsCoreInstalledVerInNolock tbsPropFile is " + file.getAbsolutePath());
                Properties properties = new Properties();
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e5) {
                            StringBuilder g5 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerInNolock IOException=");
                            g5.append(e5.toString());
                            TbsLog.i("TbsInstaller", g5.toString());
                        }
                        return 0;
                    }
                    int parseInt = Integer.parseInt(property);
                    if (f2193n == 0) {
                        f2193n = parseInt;
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e6) {
                        StringBuilder g6 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerInNolock IOException=");
                        g6.append(e6.toString());
                        TbsLog.i("TbsInstaller", g6.toString());
                    }
                    return parseInt;
                } catch (Exception e7) {
                    e = e7;
                    bufferedInputStream2 = bufferedInputStream;
                    TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerInNolock Exception=" + e.toString());
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e8) {
                            StringBuilder g7 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerInNolock IOException=");
                            g7.append(e8.toString());
                            TbsLog.i("TbsInstaller", g7.toString());
                        }
                    }
                    return 0;
                } catch (Throwable th) {
                    th = th;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e9) {
                            StringBuilder g8 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerInNolock IOException=");
                            g8.append(e9.toString());
                            TbsLog.i("TbsInstaller", g8.toString());
                        }
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    public int h(Context context) {
        int i5 = f2193n;
        return i5 != 0 ? i5 : g(context);
    }

    public void i(Context context) {
        if (f2193n != 0) {
            return;
        }
        f2193n = g(context);
    }

    public boolean j(Context context) {
        return new File(n(context), "tbs.conf").exists();
    }

    public int k(Context context) {
        BufferedInputStream bufferedInputStream;
        if (!p(context)) {
            return -1;
        }
        ReentrantLock reentrantLock = f2188h;
        boolean tryLock = reentrantLock.tryLock();
        TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock locked=" + tryLock);
        if (!tryLock) {
            c();
            return 0;
        }
        BufferedInputStream bufferedInputStream2 = null;
        try {
            try {
                File file = new File(n(context), "tbs.conf");
                if (!file.exists()) {
                    try {
                        if (reentrantLock.isHeldByCurrentThread()) {
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th);
                    }
                    c();
                    return 0;
                }
                Properties properties = new Properties();
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    String property = properties.getProperty("tbs_core_version");
                    if (property == null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e5) {
                            StringBuilder g5 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerWithLock IOException=");
                            g5.append(e5.toString());
                            TbsLog.i("TbsInstaller", g5.toString());
                        }
                        try {
                            ReentrantLock reentrantLock2 = f2188h;
                            if (reentrantLock2.isHeldByCurrentThread()) {
                                reentrantLock2.unlock();
                            }
                        } catch (Throwable th2) {
                            TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th2);
                        }
                        c();
                        return 0;
                    }
                    ThreadLocal<Integer> threadLocal = f2191l;
                    threadLocal.set(Integer.valueOf(Integer.parseInt(property)));
                    int intValue = threadLocal.get().intValue();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e6) {
                        StringBuilder g6 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerWithLock IOException=");
                        g6.append(e6.toString());
                        TbsLog.i("TbsInstaller", g6.toString());
                    }
                    try {
                        ReentrantLock reentrantLock3 = f2188h;
                        if (reentrantLock3.isHeldByCurrentThread()) {
                            reentrantLock3.unlock();
                        }
                    } catch (Throwable th3) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th3);
                    }
                    c();
                    return intValue;
                } catch (Exception e7) {
                    e = e7;
                    bufferedInputStream2 = bufferedInputStream;
                    TbsLog.i("TbsInstaller", "TbsInstaller--getTbsCoreInstalledVerWithLock Exception=" + e.toString());
                    if (bufferedInputStream2 != null) {
                        try {
                            bufferedInputStream2.close();
                        } catch (IOException e8) {
                            StringBuilder g7 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerWithLock IOException=");
                            g7.append(e8.toString());
                            TbsLog.i("TbsInstaller", g7.toString());
                        }
                    }
                    try {
                        ReentrantLock reentrantLock4 = f2188h;
                        if (reentrantLock4.isHeldByCurrentThread()) {
                            reentrantLock4.unlock();
                        }
                    } catch (Throwable th4) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th4);
                    }
                    c();
                    return 0;
                } catch (Throwable th5) {
                    th = th5;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException e9) {
                            StringBuilder g8 = androidx.activity.d.g("TbsInstaller--getTbsCoreInstalledVerWithLock IOException=");
                            g8.append(e9.toString());
                            TbsLog.i("TbsInstaller", g8.toString());
                        }
                    }
                    try {
                        ReentrantLock reentrantLock5 = f2188h;
                        if (reentrantLock5.isHeldByCurrentThread()) {
                            reentrantLock5.unlock();
                        }
                    } catch (Throwable th6) {
                        TbsLog.e("TbsInstaller", "TbsRenameLock.unlock exception: " + th6);
                    }
                    c();
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th7) {
            th = th7;
            bufferedInputStream = bufferedInputStream2;
        }
    }

    public void l(Context context) {
        TbsLog.i("TbsInstaller", "TbsInstaller--cleanStatusAndTmpDir");
        l.a(context).a(0);
        l.a(context).b(0);
        l.a(context).d(0);
        l.a(context).a("incrupdate_retry_num", 0);
        if (TbsDownloader.a(context)) {
            return;
        }
        l.a(context).c(0, -1);
        l.a(context).a("");
        l.a(context).a("copy_retry_num", 0);
        l.a(context).c(-1);
        l.a(context).a(0, -1);
        FileUtil.a(e(context, 0), true);
        FileUtil.a(e(context, 1), true);
    }

    public File m(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_share_decouple");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        return null;
    }

    public File n(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_share");
        if (file.isDirectory() || file.mkdir()) {
            return file;
        }
        TbsLog.i("TbsInstaller", "getTbsCoreShareDir,mkdir false");
        return null;
    }

    public synchronized boolean p(Context context) {
        if (this.f2194d > 0) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= true");
            this.f2194d++;
            return true;
        }
        FileOutputStream b5 = FileUtil.b(context, true, "tbslock.txt");
        this.f2196f = b5;
        if (b5 == null) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock get install fos failed");
            return false;
        }
        FileLock a5 = FileUtil.a(context, b5);
        this.f2195e = a5;
        if (a5 == null) {
            TbsLog.i("TbsInstaller", "getTbsInstallingFileLock tbsFileLockFileLock == null");
            return false;
        }
        TbsLog.i("TbsInstaller", "getTbsInstallingFileLock success,is cached= false");
        this.f2194d++;
        return true;
    }
}
