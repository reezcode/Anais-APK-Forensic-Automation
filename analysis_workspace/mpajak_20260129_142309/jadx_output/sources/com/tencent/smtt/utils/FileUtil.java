package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloader;
import com.tencent.smtt.sdk.TbsLogReport;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;

@SuppressLint({"NewApi"})
/* loaded from: classes18.dex */
public class FileUtil {

    /* renamed from: a, reason: collision with root package name */
    public static String f2287a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final a f2288b = new a() { // from class: com.tencent.smtt.utils.FileUtil.2
        @Override // com.tencent.smtt.utils.FileUtil.a
        public boolean a(File file, File file2) {
            return file.length() == file2.length() && file.lastModified() == file2.lastModified();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final int f2289c = 4;

    /* renamed from: d, reason: collision with root package name */
    private static RandomAccessFile f2290d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f2291e = true;

    /* loaded from: classes20.dex */
    public interface a {
        boolean a(File file, File file2);
    }

    /* loaded from: classes23.dex */
    public interface b {
        boolean a(InputStream inputStream, ZipEntry zipEntry, String str);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null) {
            return -1L;
        }
        byte[] bArr = new byte[4096];
        long j5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j5;
            }
            outputStream.write(bArr, 0, read);
            j5 += read;
        }
    }

    public static File a(Context context, String str) {
        String str2;
        File file = new File(context.getFilesDir(), "tbs");
        if (!file.exists()) {
            file.mkdirs();
        }
        if (file.canWrite()) {
            File file2 = new File(file, str);
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (IOException e5) {
                    str2 = "getPermanentTbsFile -- exception: " + e5;
                }
            }
            return file2;
        }
        str2 = "getPermanentTbsFile -- no permission!";
        TbsLog.e("FileHelper", str2);
        return null;
    }

    public static File a(Context context, boolean z4, String str) {
        String c5 = c(context);
        if (c5 == null) {
            return null;
        }
        File file = new File(c5);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.canWrite()) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e5) {
                e5.printStackTrace();
                return null;
            }
        }
        return file2;
    }

    public static String a(Context context, int i5) {
        return a(context, context.getApplicationInfo().packageName, i5, true);
    }

    public static String a(Context context, String str, int i5, boolean z4) {
        if (context == null || !a(context)) {
            return "";
        }
        if (i5 != 6) {
            return i5 != 8 ? i5 != 9 ? "" : b(context, "Download") : b(context, "env");
        }
        String str2 = f2287a;
        if (str2 != null) {
            return str2;
        }
        String b5 = b(context, "tbslog");
        f2287a = b5;
        return b5;
    }

    public static FileLock a(Context context, FileOutputStream fileOutputStream) {
        FileLock tryLock;
        if (fileOutputStream == null) {
            return null;
        }
        try {
            tryLock = fileOutputStream.getChannel().tryLock();
        } catch (OverlappingFileLockException | Exception e5) {
            e5.printStackTrace();
        }
        if (tryLock.isValid()) {
            return tryLock;
        }
        return null;
    }

    public static synchronized void a(Context context, FileLock fileLock) {
        synchronized (FileUtil.class) {
            TbsLog.i("FileHelper", "releaseTbsCoreRenameFileLock -- lock: " + fileLock);
            FileChannel channel = fileLock.channel();
            if (channel != null && channel.isOpen()) {
                try {
                    fileLock.release();
                    channel.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static void a(File file, boolean z4) {
        a(file, z4, false);
    }

    public static void a(File file, boolean z4, String str) {
        TbsLog.i("FileUtils", "delete file,ignore=" + z4 + "except" + str + file + Log.getStackTraceString(new Throwable()));
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (!file2.getName().equals(str)) {
                a(file2, z4);
            }
        }
        if (z4) {
            return;
        }
        file.delete();
    }

    public static void a(File file, boolean z4, boolean z5) {
        TbsLog.i("FileUtils", "delete file,ignore=" + z4 + "isSoftLink=" + z5);
        if (file == null) {
            return;
        }
        if (z5 || file.exists()) {
            if ((z5 && !file.isDirectory()) || file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                a(file2, z4, z5);
            }
            if (z4) {
                return;
            }
            file.delete();
        }
    }

    public static void a(FileLock fileLock, FileOutputStream fileOutputStream) {
        if (fileLock != null) {
            try {
                FileChannel channel = fileLock.channel();
                if (channel != null && channel.isOpen()) {
                    fileLock.release();
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    public static void a(boolean z4) {
        f2291e = z4;
    }

    public static boolean a(Context context) {
        return f2291e;
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        b(file);
        return file.mkdirs();
    }

    public static boolean a(File file, File file2) {
        return a(file.getPath(), file2.getPath());
    }

    public static boolean a(File file, File file2, FileFilter fileFilter) {
        return a(file, file2, fileFilter, f2288b);
    }

    public static boolean a(File file, File file2, FileFilter fileFilter, a aVar) {
        boolean z4 = false;
        if (file != null && file2 != null) {
            StringBuilder g5 = androidx.activity.d.g("copyFiles src is ");
            g5.append(file.getAbsolutePath());
            g5.append(" dst is ");
            g5.append(file2.getAbsolutePath());
            TbsLog.e("FileHelper", g5.toString());
            if (!file.exists()) {
                return false;
            }
            if (file.isFile()) {
                return b(file, file2, fileFilter, aVar);
            }
            File[] listFiles = file.listFiles(fileFilter);
            if (listFiles == null) {
                return false;
            }
            z4 = true;
            for (File file3 : listFiles) {
                if (!a(file3, new File(file2, file3.getName()), fileFilter)) {
                    z4 = false;
                }
            }
        }
        return z4;
    }

    private static boolean a(String str, long j5, long j6, long j7) {
        File file = new File(str);
        if (file.length() != j5) {
            StringBuilder g5 = androidx.activity.d.g("file size doesn't match: ");
            g5.append(file.length());
            g5.append(" vs ");
            g5.append(j5);
            TbsLog.e("FileHelper", g5.toString());
            return true;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                CRC32 crc32 = new CRC32();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    crc32.update(bArr, 0, read);
                }
                long value = crc32.getValue();
                TbsLog.i("FileHelper", "" + file.getName() + ": crc = " + value + ", zipCrc = " + j7);
                fileInputStream2.close();
                return value != j7;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static boolean a(String str, String str2) {
        return a(str, str2, Build.CPU_ABI, Build.CPU_ABI2, PropertyUtils.getQuickly("ro.product.cpu.upgradeabi", "armeabi"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x008b, code lost:
    
        if (r6.regionMatches(r9, r14, 0, r14.length()) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0096, code lost:
    
        if (r6.charAt(r9 + r14.length()) != '/') goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0098, code lost:
    
        if (r3 != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009a, code lost:
    
        if (r4 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x000e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x000e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.tencent.smtt.utils.FileUtil.b r15) {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Lca
            r1.<init>(r11)     // Catch: java.lang.Throwable -> Lca
            java.util.Enumeration r11 = r1.entries()     // Catch: java.lang.Throwable -> Lc7
            r0 = 1
            r2 = 0
            r3 = 0
            r4 = 0
        Le:
            boolean r5 = r11.hasMoreElements()     // Catch: java.lang.Throwable -> Lc7
            if (r5 == 0) goto Lc3
            java.lang.Object r5 = r11.nextElement()     // Catch: java.lang.Throwable -> Lc7
            java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> Lc7
            if (r6 != 0) goto L21
            goto Le
        L21:
            java.lang.String r7 = "../"
            boolean r7 = r6.contains(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r7 == 0) goto L2a
            goto Le
        L2a:
            java.lang.String r7 = "lib/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r7 != 0) goto L3b
            java.lang.String r7 = "assets/"
            boolean r7 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r7 != 0) goto L3b
            goto Le
        L3b:
            r7 = 47
            int r8 = r6.lastIndexOf(r7)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r8 = r6.substring(r8)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r9 = ".so"
            boolean r9 = r8.endsWith(r9)     // Catch: java.lang.Throwable -> Lc7
            if (r9 == 0) goto L9e
            int r9 = com.tencent.smtt.utils.FileUtil.f2289c     // Catch: java.lang.Throwable -> Lc7
            int r10 = r12.length()     // Catch: java.lang.Throwable -> Lc7
            boolean r10 = r6.regionMatches(r9, r12, r2, r10)     // Catch: java.lang.Throwable -> Lc7
            if (r10 == 0) goto L66
            int r10 = r12.length()     // Catch: java.lang.Throwable -> Lc7
            int r10 = r10 + r9
            char r10 = r6.charAt(r10)     // Catch: java.lang.Throwable -> Lc7
            if (r10 != r7) goto L66
            r3 = 1
            goto L9e
        L66:
            if (r13 == 0) goto L81
            int r10 = r13.length()     // Catch: java.lang.Throwable -> Lc7
            boolean r10 = r6.regionMatches(r9, r13, r2, r10)     // Catch: java.lang.Throwable -> Lc7
            if (r10 == 0) goto L81
            int r10 = r13.length()     // Catch: java.lang.Throwable -> Lc7
            int r10 = r10 + r9
            char r10 = r6.charAt(r10)     // Catch: java.lang.Throwable -> Lc7
            if (r10 != r7) goto L81
            r4 = 1
            if (r3 == 0) goto L9e
            goto Le
        L81:
            if (r14 == 0) goto Le
            int r10 = r14.length()     // Catch: java.lang.Throwable -> Lc7
            boolean r10 = r6.regionMatches(r9, r14, r2, r10)     // Catch: java.lang.Throwable -> Lc7
            if (r10 == 0) goto Le
            int r10 = r14.length()     // Catch: java.lang.Throwable -> Lc7
            int r9 = r9 + r10
            char r6 = r6.charAt(r9)     // Catch: java.lang.Throwable -> Lc7
            if (r6 != r7) goto Le
            if (r3 != 0) goto Le
            if (r4 == 0) goto L9e
            goto Le
        L9e:
            java.io.InputStream r6 = r1.getInputStream(r5)     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = r8.substring(r0)     // Catch: java.lang.Throwable -> Lbc
            boolean r5 = r15.a(r6, r5, r7)     // Catch: java.lang.Throwable -> Lbc
            if (r5 != 0) goto Lb5
            if (r6 == 0) goto Lb1
            r6.close()     // Catch: java.lang.Throwable -> Lc7
        Lb1:
            r1.close()
            return r2
        Lb5:
            if (r6 == 0) goto Le
            r6.close()     // Catch: java.lang.Throwable -> Lc7
            goto Le
        Lbc:
            r11 = move-exception
            if (r6 == 0) goto Lc2
            r6.close()     // Catch: java.lang.Throwable -> Lc7
        Lc2:
            throw r11     // Catch: java.lang.Throwable -> Lc7
        Lc3:
            r1.close()
            return r0
        Lc7:
            r11 = move-exception
            r0 = r1
            goto Lcb
        Lca:
            r11 = move-exception
        Lcb:
            if (r0 == 0) goto Ld0
            r0.close()
        Ld0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.FileUtil.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.tencent.smtt.utils.FileUtil$b):boolean");
    }

    private static boolean a(String str, final String str2, String str3, String str4, String str5) {
        return a(str, str3, str4, str5, new b() { // from class: com.tencent.smtt.utils.FileUtil.1
            @Override // com.tencent.smtt.utils.FileUtil.b
            public boolean a(InputStream inputStream, ZipEntry zipEntry, String str6) {
                try {
                    return FileUtil.b(inputStream, zipEntry, str2, str6);
                } catch (Exception e5) {
                    throw new Exception("copyFileIfChanged Exception", e5);
                }
            }
        });
    }

    public static FileOutputStream b(Context context, boolean z4, String str) {
        File a5 = a(context, z4, str);
        if (a5 == null) {
            return null;
        }
        try {
            return new FileOutputStream(a5);
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static String b(Context context, String str) {
        if (context != null && str != null && a(context)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            try {
                return context.getExternalFilesDir(str).getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return "";
    }

    public static void b(File file) {
        a(file, false);
    }

    public static boolean b(Context context) {
        long a5 = s.a();
        boolean z4 = a5 >= TbsDownloadConfig.getInstance(context).getDownloadMinFreeSpace();
        if (!z4) {
            TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDwonloader.hasEnoughFreeSpace] freeSpace too small,  freeSpace = " + a5);
        }
        return z4;
    }

    private static boolean b(File file, File file2, FileFilter fileFilter, a aVar) {
        FileChannel fileChannel;
        if (file == null || file2 == null) {
            return false;
        }
        if (fileFilter != null && !fileFilter.accept(file)) {
            return false;
        }
        FileChannel fileChannel2 = null;
        try {
            if (file.exists() && file.isFile()) {
                if (file2.exists()) {
                    if (aVar != null && aVar.a(file, file2)) {
                        return true;
                    }
                    b(file2);
                }
                File parentFile = file2.getParentFile();
                if (parentFile.isFile()) {
                    b(parentFile);
                }
                if (!parentFile.exists() && !parentFile.mkdirs()) {
                    return false;
                }
                FileChannel channel = new FileInputStream(file).getChannel();
                try {
                    fileChannel2 = new FileOutputStream(file2).getChannel();
                    long size = channel.size();
                    if (fileChannel2.transferFrom(channel, 0L, size) == size) {
                        channel.close();
                        fileChannel2.close();
                        return true;
                    }
                    b(file2);
                    channel.close();
                    fileChannel2.close();
                    return false;
                } catch (Throwable th) {
                    FileChannel fileChannel3 = fileChannel2;
                    fileChannel2 = channel;
                    th = th;
                    fileChannel = fileChannel3;
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    throw th;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileChannel = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public static boolean b(InputStream inputStream, ZipEntry zipEntry, String str, String str2) {
        FileOutputStream fileOutputStream;
        a(new File(str));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String c5 = androidx.appcompat.graphics.drawable.a.c(sb, File.separator, str2);
        File file = new File(c5);
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = null;
            }
        } catch (IOException e5) {
            e = e5;
        }
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
            if (a(c5, zipEntry.getSize(), zipEntry.getTime(), zipEntry.getCrc())) {
                TbsLog.e("FileHelper", "file is different: " + c5);
                return false;
            }
            if (file.setLastModified(zipEntry.getTime())) {
                return true;
            }
            TbsLog.e("FileHelper", "Couldn't set time for dst file " + file);
            return true;
        } catch (IOException e6) {
            e = e6;
            b(file);
            throw new IOException("Couldn't write dst file " + file, e);
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    public static String c(Context context) {
        File file = new File(QbSdk.getTbsFolderDir(context), "core_private");
        if (file.isDirectory() || file.mkdir()) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public static boolean c(File file) {
        return file != null && file.exists() && file.isFile() && file.length() > 0;
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        long a5 = a(inputStream, outputStream);
        if (a5 > 2147483647L) {
            return -1;
        }
        return (int) a5;
    }

    public static FileOutputStream d(File file) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("File '" + file + "' could not be created");
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException("File '" + file + "' exists but is a directory");
            }
            if (!file.canWrite()) {
                throw new IOException("File '" + file + "' cannot be written to");
            }
        }
        return new FileOutputStream(file);
    }

    public static FileLock d(Context context) {
        FileLock fileLock;
        TbsLog.i("FileHelper", "getTbsCoreLoadFileLock #1");
        File a5 = a(context, "tbs_rename_lock");
        TbsLog.i("FileHelper", "getTbsCoreLoadFileLock #4 " + a5);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(a5.getAbsolutePath(), "r");
            f2290d = randomAccessFile;
            fileLock = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, true);
        } catch (Throwable th) {
            TbsLog.e("FileHelper", "getTbsCoreLoadFileLock -- exception: " + th);
            fileLock = null;
        }
        if (fileLock == null) {
            fileLock = f(context);
        }
        TbsLog.i("FileHelper", fileLock == null ? "getTbsCoreLoadFileLock -- failed: tbs_rename_lock" : "getTbsCoreLoadFileLock -- success: tbs_rename_lock");
        return fileLock;
    }

    public static FileLock e(Context context) {
        FileLock fileLock;
        File a5 = a(context, "tbs_rename_lock");
        TbsLog.i("FileHelper", "getTbsCoreRenameFileLock #1 " + a5);
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(a5.getAbsolutePath(), "rw");
            f2290d = randomAccessFile;
            fileLock = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, false);
        } catch (Throwable unused) {
            TbsLog.e("FileHelper", "getTbsCoreRenameFileLock -- excpetion: tbs_rename_lock");
            fileLock = null;
        }
        TbsLog.i("FileHelper", fileLock == null ? "getTbsCoreRenameFileLock -- failed: tbs_rename_lock" : "getTbsCoreRenameFileLock -- success: tbs_rename_lock");
        return fileLock;
    }

    private static FileLock f(Context context) {
        FileLock fileLock = null;
        try {
            TbsLogReport.TbsLogInfo tbsLogInfo = TbsLogReport.getInstance(context).tbsLogInfo();
            tbsLogInfo.setErrorCode(803);
            File a5 = a(context, "tbs_rename_lock");
            if (TbsDownloadConfig.getInstance(context).getTbsCoreLoadRenameFileLockWaitEnable()) {
                int i5 = 0;
                while (i5 < 20 && fileLock == null) {
                    try {
                        try {
                            Thread.sleep(100L);
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(a5.getAbsolutePath(), "r");
                        f2290d = randomAccessFile;
                        fileLock = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                    } catch (Throwable unused) {
                    }
                    i5++;
                }
                if (fileLock != null) {
                    tbsLogInfo.setErrorCode(802);
                } else {
                    tbsLogInfo.setErrorCode(801);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("getTbsCoreLoadFileLock,retry num=");
                sb.append(i5);
                sb.append("success=");
                sb.append(fileLock == null);
                TbsLog.i("FileHelper", sb.toString());
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return fileLock;
    }
}
