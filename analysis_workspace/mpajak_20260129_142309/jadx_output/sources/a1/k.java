package a1;

import android.content.Context;
import android.util.Log;
import androidx.core.content.ContextCompat;
import java.io.File;

/* loaded from: classes3.dex */
public final class k {
    public static File a(Context context) {
        File noBackupFilesDir = ContextCompat.getNoBackupFilesDir(context);
        if (noBackupFilesDir != null && noBackupFilesDir.isDirectory()) {
            return noBackupFilesDir;
        }
        Log.w("InstanceID", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }
}
