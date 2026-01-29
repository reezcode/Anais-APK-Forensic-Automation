package com.tencent.smtt.export.external;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.activity.d;
import androidx.appcompat.widget.a;
import androidx.multidex.MultiDexExtractor;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes11.dex */
public class DexClassLoaderProvider extends DexClassLoader {
    private static final String IS_FIRST_LOAD_DEX_FLAG_FILE = "is_first_load_dex_flag_file";
    private static final String LAST_DEX_NAME = "tbs_jars_fusion_dex.jar";
    private static final long LOAD_DEX_DELAY = 3000;
    private static final String LOGTAG = "dexloader";
    public static DexClassLoader mClassLoaderOriginal;
    private static Context mContext;
    private static boolean mForceLoadDexFlag;
    private static DexClassLoaderProvider mInstance;
    private static String mRealDexPath;
    public static Service mService;
    private SpeedyDexClassLoader mClassLoader;

    /* loaded from: classes12.dex */
    public static class SpeedyDexClassLoader extends BaseDexClassLoader {
        public SpeedyDexClassLoader(String str, File file, String str2, ClassLoader classLoader) {
            super(str, null, str2, classLoader);
        }

        @Override // java.lang.ClassLoader
        public Package definePackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
            return super.definePackage(str, str2, str3, str4, str5, str6, str7, url);
        }

        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public Class<?> findClass(String str) {
            return super.findClass(str);
        }

        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public URL findResource(String str) {
            return super.findResource(str);
        }

        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public Enumeration<URL> findResources(String str) {
            return super.findResources(str);
        }

        @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
        public synchronized Package getPackage(String str) {
            return super.getPackage(str);
        }

        @Override // java.lang.ClassLoader
        public Package[] getPackages() {
            return super.getPackages();
        }

        @Override // java.lang.ClassLoader
        public Class<?> loadClass(String str, boolean z4) {
            return super.loadClass(str, z4);
        }
    }

    private DexClassLoaderProvider(String str, String str2, String str3, ClassLoader classLoader, boolean z4) {
        super(str, str2, str3, classLoader);
        this.mClassLoader = null;
        if (z4) {
            StringBuilder g5 = d.g("SpeedyDexClassLoader: ");
            g5.append(mRealDexPath);
            Log.e(LOGTAG, g5.toString());
            this.mClassLoader = new SpeedyDexClassLoader(mRealDexPath, null, str3, classLoader);
            return;
        }
        StringBuilder g6 = d.g("DexClassLoader: ");
        g6.append(mRealDexPath);
        Log.e(LOGTAG, g6.toString());
        this.mClassLoader = null;
    }

    public static DexClassLoader createDexClassLoader(String str, String str2, String str3, ClassLoader classLoader, Context context) {
        Log.i(LOGTAG, "new DexClassLoaderDelegate: " + str + ", context: " + context);
        mContext = context.getApplicationContext();
        mRealDexPath = str;
        int lastIndexOf = str.lastIndexOf("/") + 1;
        String f5 = d.f(str.substring(0, lastIndexOf), "fake_dex.jar");
        String substring = str.substring(lastIndexOf);
        if (supportSpeedyClassLoader() && is_first_load_tbs_dex(str2, substring)) {
            Log.d(LOGTAG, "new DexClassLoaderDelegate -- fake: " + f5);
            set_first_load_tbs_dex(str2, substring);
            mInstance = new DexClassLoaderProvider(f5, str2, str3, classLoader, true);
            doAsyncDexLoad(substring, str, str2, str3, classLoader);
        } else {
            Log.d(LOGTAG, "new DexClassLoaderDelegate -- real: " + str);
            mInstance = new DexClassLoaderProvider(str, str2, str3, classLoader, false);
        }
        return mInstance;
    }

    private static void doAsyncDexLoad(final String str, final String str2, final String str3, final String str4, final ClassLoader classLoader) {
        if (shouldUseDexLoaderService()) {
            new Timer().schedule(new TimerTask() { // from class: com.tencent.smtt.export.external.DexClassLoaderProvider.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    try {
                        ArrayList<String> arrayList = new ArrayList<>(4);
                        arrayList.add(0, str);
                        arrayList.add(1, str2);
                        arrayList.add(2, str3);
                        arrayList.add(3, str4);
                        Intent intent = new Intent(DexClassLoaderProvider.mContext, (Class<?>) DexClassLoaderProviderService.class);
                        intent.putStringArrayListExtra("dex2oat", arrayList);
                        DexClassLoaderProvider.mContext.startService(intent);
                        Log.d(DexClassLoaderProvider.LOGTAG, "shouldUseDexLoaderService(" + str + ", " + intent + ")");
                    } catch (SecurityException e5) {
                        Log.e(DexClassLoaderProvider.LOGTAG, "start DexLoaderService exception", e5);
                    } catch (Throwable th) {
                        Log.e(DexClassLoaderProvider.LOGTAG, "after shouldUseDexLoaderService exception: " + th);
                    }
                }
            }, LOAD_DEX_DELAY);
            return;
        }
        Log.d(LOGTAG, "Background real dex loading(" + str + ")");
        new Timer().schedule(new TimerTask() { // from class: com.tencent.smtt.export.external.DexClassLoaderProvider.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean z4;
                try {
                    File file = new File(str2.replace(".jar", MultiDexExtractor.DEX_SUFFIX));
                    if (!file.exists() || file.length() == 0) {
                        Log.d(DexClassLoaderProvider.LOGTAG, "" + file + " does not existed!");
                        z4 = false;
                    } else {
                        Log.d(DexClassLoaderProvider.LOGTAG, "" + file + " existed!");
                        z4 = true;
                    }
                    File file2 = new File(str3);
                    File file3 = new File(str2);
                    boolean exists = file2.exists();
                    boolean isDirectory = file2.isDirectory();
                    boolean exists2 = file3.exists();
                    if (exists && isDirectory && exists2) {
                        long currentTimeMillis = System.currentTimeMillis();
                        new DexClassLoader(str2, str3, str4, classLoader);
                        Log.d(DexClassLoaderProvider.LOGTAG, "" + String.format("load_dex completed -- cl_cost: %d, existed: %b", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), Boolean.valueOf(z4)));
                        if (DexClassLoaderProvider.mForceLoadDexFlag && DexClassLoaderProvider.LAST_DEX_NAME.equals(str)) {
                            Log.d(DexClassLoaderProvider.LOGTAG, "Stop provider service after loading " + str);
                            if (DexClassLoaderProvider.mService != null) {
                                Log.d(DexClassLoaderProvider.LOGTAG, "##Stop service##... ");
                                DexClassLoaderProvider.mService.stopSelf();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Log.d(DexClassLoaderProvider.LOGTAG, "dex loading exception(" + exists + ", " + isDirectory + ", " + exists2 + ")");
                } catch (Throwable th) {
                    Log.e(DexClassLoaderProvider.LOGTAG, "@AsyncDexLoad task exception: " + th);
                }
            }
        }, LOAD_DEX_DELAY);
    }

    private static boolean is_first_load_tbs_dex(String str, String str2) {
        return mForceLoadDexFlag || !new File(str, a.j(str2, "_", IS_FIRST_LOAD_DEX_FLAG_FILE)).exists();
    }

    public static void setForceLoadDexFlag(boolean z4, Service service) {
        mForceLoadDexFlag = z4;
        mService = service;
    }

    private static void set_first_load_tbs_dex(String str, String str2) {
        File file = new File(str, a.j(str2, "_", IS_FIRST_LOAD_DEX_FLAG_FILE));
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static boolean shouldUseDexLoaderService() {
        return !mForceLoadDexFlag && DexLoader.mCanUseDexLoaderProviderService;
    }

    private static boolean supportSpeedyClassLoader() {
        return Build.VERSION.SDK_INT != 21 || DexLoader.mCanUseDexLoaderProviderService;
    }

    private boolean useSelfClassloader() {
        return this.mClassLoader == null;
    }

    @Override // java.lang.ClassLoader
    public void clearAssertionStatus() {
        if (useSelfClassloader()) {
            super.clearAssertionStatus();
        } else {
            this.mClassLoader.clearAssertionStatus();
        }
    }

    @Override // java.lang.ClassLoader
    public Package definePackage(String str, String str2, String str3, String str4, String str5, String str6, String str7, URL url) {
        return useSelfClassloader() ? super.definePackage(str, str2, str3, str4, str5, str6, str7, url) : this.mClassLoader.definePackage(str, str2, str3, str4, str5, str6, str7, url);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Class<?> findClass(String str) {
        return useSelfClassloader() ? super.findClass(str) : this.mClassLoader.findClass(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public String findLibrary(String str) {
        return useSelfClassloader() ? super.findLibrary(str) : this.mClassLoader.findLibrary(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public URL findResource(String str) {
        return useSelfClassloader() ? super.findResource(str) : this.mClassLoader.findResource(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public Enumeration<URL> findResources(String str) {
        return useSelfClassloader() ? super.findResources(str) : this.mClassLoader.findResources(str);
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public synchronized Package getPackage(String str) {
        if (useSelfClassloader()) {
            return super.getPackage(str);
        }
        return this.mClassLoader.getPackage(str);
    }

    @Override // java.lang.ClassLoader
    public Package[] getPackages() {
        return useSelfClassloader() ? super.getPackages() : this.mClassLoader.getPackages();
    }

    @Override // java.lang.ClassLoader
    public URL getResource(String str) {
        return useSelfClassloader() ? super.getResource(str) : this.mClassLoader.getResource(str);
    }

    @Override // java.lang.ClassLoader
    public InputStream getResourceAsStream(String str) {
        return useSelfClassloader() ? getResourceAsStream(str) : this.mClassLoader.getResourceAsStream(str);
    }

    @Override // java.lang.ClassLoader
    public Enumeration<URL> getResources(String str) {
        return useSelfClassloader() ? super.getResources(str) : this.mClassLoader.getResources(str);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str) {
        return useSelfClassloader() ? super.loadClass(str) : this.mClassLoader.loadClass(str);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z4) {
        return useSelfClassloader() ? super.loadClass(str, z4) : this.mClassLoader.loadClass(str, z4);
    }

    @Override // java.lang.ClassLoader
    public void setClassAssertionStatus(String str, boolean z4) {
        if (useSelfClassloader()) {
            super.setClassAssertionStatus(str, z4);
        } else {
            this.mClassLoader.setClassAssertionStatus(str, z4);
        }
    }

    @Override // java.lang.ClassLoader
    public void setDefaultAssertionStatus(boolean z4) {
        if (useSelfClassloader()) {
            super.setDefaultAssertionStatus(z4);
        } else {
            this.mClassLoader.setDefaultAssertionStatus(z4);
        }
    }

    @Override // java.lang.ClassLoader
    public void setPackageAssertionStatus(String str, boolean z4) {
        if (useSelfClassloader()) {
            super.setPackageAssertionStatus(str, z4);
        } else {
            this.mClassLoader.setPackageAssertionStatus(str, z4);
        }
    }

    @Override // dalvik.system.BaseDexClassLoader
    public String toString() {
        return useSelfClassloader() ? super.toString() : this.mClassLoader.toString();
    }
}
