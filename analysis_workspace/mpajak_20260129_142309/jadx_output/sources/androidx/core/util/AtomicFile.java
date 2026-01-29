package androidx.core.util;

import android.util.Log;
import androidx.activity.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes22.dex */
public class AtomicFile {
    private static final String LOG_TAG = "AtomicFile";
    private final File mBaseName;
    private final File mLegacyBackupName;
    private final File mNewName;

    public AtomicFile(@NonNull File file) {
        this.mBaseName = file;
        this.mNewName = new File(file.getPath() + ".new");
        this.mLegacyBackupName = new File(file.getPath() + ".bak");
    }

    private static void rename(@NonNull File file, @NonNull File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(LOG_TAG, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e(LOG_TAG, "Failed to rename " + file + " to " + file2);
    }

    private static boolean sync(@NonNull FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void delete() {
        this.mBaseName.delete();
        this.mNewName.delete();
        this.mLegacyBackupName.delete();
    }

    public void failWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!sync(fileOutputStream)) {
            Log.e(LOG_TAG, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e5) {
            Log.e(LOG_TAG, "Failed to close file output stream", e5);
        }
        if (this.mNewName.delete()) {
            return;
        }
        StringBuilder g5 = d.g("Failed to delete new file ");
        g5.append(this.mNewName);
        Log.e(LOG_TAG, g5.toString());
    }

    public void finishWrite(@Nullable FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!sync(fileOutputStream)) {
            Log.e(LOG_TAG, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e5) {
            Log.e(LOG_TAG, "Failed to close file output stream", e5);
        }
        rename(this.mNewName, this.mBaseName);
    }

    @NonNull
    public File getBaseFile() {
        return this.mBaseName;
    }

    @NonNull
    public FileInputStream openRead() {
        if (this.mLegacyBackupName.exists()) {
            rename(this.mLegacyBackupName, this.mBaseName);
        }
        if (this.mNewName.exists() && this.mBaseName.exists() && !this.mNewName.delete()) {
            StringBuilder g5 = d.g("Failed to delete outdated new file ");
            g5.append(this.mNewName);
            Log.e(LOG_TAG, g5.toString());
        }
        return new FileInputStream(this.mBaseName);
    }

    @NonNull
    public byte[] readFully() {
        FileInputStream openRead = openRead();
        try {
            byte[] bArr = new byte[openRead.available()];
            int i5 = 0;
            while (true) {
                int read = openRead.read(bArr, i5, bArr.length - i5);
                if (read <= 0) {
                    return bArr;
                }
                i5 += read;
                int available = openRead.available();
                if (available > bArr.length - i5) {
                    byte[] bArr2 = new byte[available + i5];
                    System.arraycopy(bArr, 0, bArr2, 0, i5);
                    bArr = bArr2;
                }
            }
        } finally {
            openRead.close();
        }
    }

    @NonNull
    public FileOutputStream startWrite() {
        if (this.mLegacyBackupName.exists()) {
            rename(this.mLegacyBackupName, this.mBaseName);
        }
        try {
            return new FileOutputStream(this.mNewName);
        } catch (FileNotFoundException unused) {
            if (!this.mNewName.getParentFile().mkdirs()) {
                StringBuilder g5 = d.g("Failed to create directory for ");
                g5.append(this.mNewName);
                throw new IOException(g5.toString());
            }
            try {
                return new FileOutputStream(this.mNewName);
            } catch (FileNotFoundException e5) {
                StringBuilder g6 = d.g("Failed to create new file ");
                g6.append(this.mNewName);
                throw new IOException(g6.toString(), e5);
            }
        }
    }
}
