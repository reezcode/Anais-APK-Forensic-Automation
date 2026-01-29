package com.tencent.smtt.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.HashMap;

/* loaded from: classes11.dex */
public class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static String f2428a = "TBSFileLock";

    /* renamed from: f, reason: collision with root package name */
    private static Object f2429f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static Object f2430g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private static HashMap<m, Object> f2431h;

    /* renamed from: i, reason: collision with root package name */
    private static Handler f2432i;

    /* renamed from: b, reason: collision with root package name */
    public File f2433b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f2434c = null;

    /* renamed from: d, reason: collision with root package name */
    public FileLock f2435d = null;

    /* renamed from: e, reason: collision with root package name */
    public long f2436e = 0;

    public m(File file, String str) {
        this.f2433b = null;
        this.f2433b = new File(file, androidx.appcompat.widget.a.j(".", str, ".lock"));
    }

    public Handler a() {
        if (f2432i == null) {
            synchronized (m.class) {
                if (f2432i == null) {
                    HandlerThread handlerThread = new HandlerThread("QBFileLock.Thread");
                    handlerThread.start();
                    f2432i = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f2432i;
    }

    public synchronized void a(boolean z4) {
        Log.d(f2428a, ">>> release lock: " + this.f2433b.getName());
        FileLock fileLock = this.f2435d;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            this.f2435d = null;
        }
        RandomAccessFile randomAccessFile = this.f2434c;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            this.f2434c = null;
        }
        Handler handler = f2432i;
        if (handler != null && this.f2436e > 0) {
            handler.removeCallbacks(this);
        }
        if (z4) {
            d();
        }
    }

    public synchronized void b() {
        FileChannel channel;
        try {
            this.f2434c = new RandomAccessFile(this.f2433b, "rw");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        RandomAccessFile randomAccessFile = this.f2434c;
        if (randomAccessFile != null && (channel = randomAccessFile.getChannel()) != null) {
            if (this.f2436e > 0) {
                a().postDelayed(this, this.f2436e);
            }
            FileLock fileLock = null;
            long currentTimeMillis = System.currentTimeMillis();
            while (true) {
                try {
                    fileLock = channel.lock();
                    if (fileLock != null) {
                        break;
                    }
                } catch (Exception e6) {
                    e6.printStackTrace();
                    Log.d(f2428a, ">>> lock failed, sleep...");
                }
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException e7) {
                    e7.printStackTrace();
                }
                if (Math.abs(System.currentTimeMillis() - currentTimeMillis) >= 1000) {
                    Log.d(f2428a, ">>> lock timeout, quit...");
                    break;
                }
            }
            this.f2435d = fileLock;
            Log.d(f2428a, ">>> lock [" + this.f2433b.getName() + "] cost: " + (System.currentTimeMillis() - currentTimeMillis));
        }
        if (this.f2435d != null) {
            c();
        }
    }

    public void c() {
        synchronized (f2430g) {
            if (f2431h == null) {
                f2431h = new HashMap<>();
            }
            f2431h.put(this, f2429f);
        }
    }

    public void d() {
        synchronized (f2430g) {
            HashMap<m, Object> hashMap = f2431h;
            if (hashMap == null) {
                return;
            }
            hashMap.remove(this);
        }
    }

    public void e() {
        a(true);
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.d(f2428a, ">>> releaseLock on TimeOut");
        e();
    }
}
