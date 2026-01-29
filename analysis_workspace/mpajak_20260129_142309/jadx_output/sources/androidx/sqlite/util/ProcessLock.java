package androidx.sqlite.util;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.activity.d;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes11.dex */
public final class ProcessLock {
    private static final String TAG = "SupportSQLiteLock";
    private FileChannel lockChannel;
    private final File lockFile;
    private final boolean processLock;

    @SuppressLint({"SyntheticAccessor"})
    private final Lock threadLock;
    public static final Companion Companion = new Companion(null);
    private static final Map<String, Lock> threadLocksMap = new HashMap();

    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock getThreadLock(String str) {
            Lock lock;
            synchronized (ProcessLock.threadLocksMap) {
                Map map = ProcessLock.threadLocksMap;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    map.put(str, obj);
                }
                lock = (Lock) obj;
            }
            return lock;
        }
    }

    public ProcessLock(String name, File lockDir, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(lockDir, "lockDir");
        this.processLock = z4;
        File file = new File(lockDir, d.f(name, ".lck"));
        this.lockFile = file;
        Companion companion = Companion;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "lockFile.absolutePath");
        this.threadLock = companion.getThreadLock(absolutePath);
    }

    public static /* synthetic */ void lock$default(ProcessLock processLock, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = processLock.processLock;
        }
        processLock.lock(z4);
    }

    public final void lock(boolean z4) {
        this.threadLock.lock();
        if (z4) {
            try {
                File parentFile = this.lockFile.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.lockFile).getChannel();
                channel.lock();
                this.lockChannel = channel;
            } catch (IOException e5) {
                this.lockChannel = null;
                Log.w(TAG, "Unable to grab file lock.", e5);
            }
        }
    }

    public final void unlock() {
        try {
            FileChannel fileChannel = this.lockChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.threadLock.unlock();
    }
}
