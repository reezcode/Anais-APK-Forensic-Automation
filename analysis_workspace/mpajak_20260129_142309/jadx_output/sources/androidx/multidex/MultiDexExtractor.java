package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.activity.d;
import androidx.appcompat.graphics.drawable.a;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes2.dex */
final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    public static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    public static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    /* loaded from: classes8.dex */
    public static class ExtractedDex extends File {
        public long crc;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.crc = -1L;
        }
    }

    public MultiDexExtractor(File file, File file2) {
        StringBuilder g5 = d.g("MultiDexExtractor(");
        g5.append(file.getPath());
        g5.append(", ");
        g5.append(file2.getPath());
        g5.append(")");
        Log.i("MultiDex", g5.toString());
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, LOCK_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.lockChannel = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.cacheLock = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e5) {
                e = e5;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (Error e6) {
                e = e6;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (RuntimeException e7) {
                e = e7;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e8) {
            closeQuietly(this.lockRaf);
            throw e8;
        }
    }

    private void clearDexDir() {
        File[] listFiles = this.dexDir.listFiles(new FileFilter() { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (listFiles == null) {
            StringBuilder g5 = d.g("Failed to list secondary dex dir content (");
            g5.append(this.dexDir.getPath());
            g5.append(").");
            Log.w("MultiDex", g5.toString());
            return;
        }
        for (File file : listFiles) {
            StringBuilder g6 = d.g("Trying to delete old file ");
            g6.append(file.getPath());
            g6.append(" of size ");
            g6.append(file.length());
            Log.i("MultiDex", g6.toString());
            if (file.delete()) {
                StringBuilder g7 = d.g("Deleted old file ");
                g7.append(file.getPath());
                Log.i("MultiDex", g7.toString());
            } else {
                StringBuilder g8 = d.g("Failed to delete old file ");
                g8.append(file.getPath());
                Log.w("MultiDex", g8.toString());
            }
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e5) {
            Log.w("MultiDex", "Failed to close resource", e5);
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(d.f("tmp-", str), EXTRACTED_SUFFIX, file.getParentFile());
        StringBuilder g5 = d.g("Extracting ");
        g5.append(createTempFile.getPath());
        Log.i("MultiDex", g5.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, read);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            closeQuietly(inputStream);
            createTempFile.delete();
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, 4);
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long getZipCrc(File file) {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private static boolean isModified(Context context, File file, long j5, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + KEY_TIME_STAMP, -1L) == getTimeStamp(file)) {
            if (multiDexPreferences.getLong(str + KEY_CRC, -1L) == j5) {
                return false;
            }
        }
        return true;
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i5 = multiDexPreferences.getInt(str + KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i5 + (-1));
        int i6 = 2;
        while (i6 <= i5) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, d.c(str2, i6, EXTRACTED_SUFFIX));
            if (!extractedDex.isFile()) {
                StringBuilder g5 = d.g("Missing extracted secondary dex file '");
                g5.append(extractedDex.getPath());
                g5.append("'");
                throw new IOException(g5.toString());
            }
            extractedDex.crc = getZipCrc(extractedDex);
            long j5 = multiDexPreferences.getLong(str + KEY_DEX_CRC + i6, -1L);
            long j6 = multiDexPreferences.getLong(str + KEY_DEX_TIME + i6, -1L);
            long lastModified = extractedDex.lastModified();
            if (j6 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = multiDexPreferences;
                if (j5 == extractedDex.crc) {
                    arrayList.add(extractedDex);
                    i6++;
                    multiDexPreferences = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j6 + ", modification time: " + lastModified + ", expected crc: " + j5 + ", file crc: " + extractedDex.crc);
        }
        return arrayList;
    }

    private List<ExtractedDex> performExtractions() {
        String str = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        clearDexDir();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.sourceApk);
        int i5 = 2;
        String str2 = "classes2.dex";
        while (true) {
            try {
                ZipEntry entry = zipFile.getEntry(str2);
                if (entry == null) {
                    return arrayList;
                }
                ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str + i5 + EXTRACTED_SUFFIX);
                arrayList.add(extractedDex);
                Log.i("MultiDex", "Extraction is needed for file " + extractedDex);
                int i6 = 0;
                boolean z4 = false;
                while (i6 < 3 && !z4) {
                    i6++;
                    extract(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.crc = getZipCrc(extractedDex);
                        z4 = true;
                    } catch (IOException e5) {
                        Log.w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e5);
                        z4 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z4 ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(extractedDex.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(extractedDex.length());
                    sb.append(" - crc: ");
                    sb.append(extractedDex.crc);
                    Log.i("MultiDex", sb.toString());
                    if (!z4) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                }
                if (!z4) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i5 + ")");
                }
                i5++;
                str2 = DEX_PREFIX + i5 + DEX_SUFFIX;
            } finally {
                try {
                    zipFile.close();
                } catch (IOException e6) {
                    Log.w("MultiDex", "Failed to close resource", e6);
                }
            }
        }
    }

    private static void putStoredApkInfo(Context context, String str, long j5, long j6, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + KEY_TIME_STAMP, j5);
        edit.putLong(a.c(new StringBuilder(), str, KEY_CRC), j6);
        edit.putInt(str + KEY_DEX_NUMBER, list.size() + 1);
        int i5 = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + KEY_DEX_CRC + i5, extractedDex.crc);
            edit.putLong(str + KEY_DEX_TIME + i5, extractedDex.lastModified());
            i5++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    public List<? extends File> load(Context context, String str, boolean z4) {
        List<ExtractedDex> list;
        StringBuilder g5 = d.g("MultiDexExtractor.load(");
        g5.append(this.sourceApk.getPath());
        g5.append(", ");
        g5.append(z4);
        g5.append(", ");
        g5.append(str);
        g5.append(")");
        Log.i("MultiDex", g5.toString());
        if (!this.cacheLock.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z4 && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
            try {
                list = loadExistingExtractions(context, str);
            } catch (IOException e5) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e5);
            }
            StringBuilder g6 = d.g("load found ");
            g6.append(list.size());
            g6.append(" secondary dex files");
            Log.i("MultiDex", g6.toString());
            return list;
        }
        Log.i("MultiDex", z4 ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
        List<ExtractedDex> performExtractions = performExtractions();
        putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
        list = performExtractions;
        StringBuilder g62 = d.g("load found ");
        g62.append(list.size());
        g62.append(" secondary dex files");
        Log.i("MultiDex", g62.toString());
        return list;
    }
}
