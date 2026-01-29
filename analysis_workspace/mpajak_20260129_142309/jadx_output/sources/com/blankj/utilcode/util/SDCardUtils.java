package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.format.Formatter;
import androidx.activity.d;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes22.dex */
public final class SDCardUtils {

    /* loaded from: classes12.dex */
    public static class SDCardInfo {
        private long availableSize;
        private boolean isRemovable;
        private String path;
        private String state;
        private long totalSize;

        public SDCardInfo(String str, String str2, boolean z4) {
            this.path = str;
            this.state = str2;
            this.isRemovable = z4;
            this.totalSize = UtilsBridge.getFsTotalSize(str);
            this.availableSize = UtilsBridge.getFsAvailableSize(str);
        }

        public long getAvailableSize() {
            return this.availableSize;
        }

        public String getPath() {
            return this.path;
        }

        public String getState() {
            return this.state;
        }

        public long getTotalSize() {
            return this.totalSize;
        }

        public boolean isRemovable() {
            return this.isRemovable;
        }

        public String toString() {
            StringBuilder g5 = d.g("SDCardInfo {path = ");
            g5.append(this.path);
            g5.append(", state = ");
            g5.append(this.state);
            g5.append(", isRemovable = ");
            g5.append(this.isRemovable);
            g5.append(", totalSize = ");
            g5.append(Formatter.formatFileSize(Utils.getApp(), this.totalSize));
            g5.append(", availableSize = ");
            g5.append(Formatter.formatFileSize(Utils.getApp(), this.availableSize));
            g5.append('}');
            return g5.toString();
        }
    }

    private SDCardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static long getExternalAvailableSize() {
        return UtilsBridge.getFsAvailableSize(getSDCardPathByEnvironment());
    }

    public static long getExternalTotalSize() {
        return UtilsBridge.getFsTotalSize(getSDCardPathByEnvironment());
    }

    public static long getInternalAvailableSize() {
        return UtilsBridge.getFsAvailableSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static long getInternalTotalSize() {
        return UtilsBridge.getFsTotalSize(Environment.getDataDirectory().getAbsolutePath());
    }

    public static List<String> getMountedSDCardPath() {
        ArrayList arrayList = new ArrayList();
        List<SDCardInfo> sDCardInfo = getSDCardInfo();
        if (sDCardInfo != null && !sDCardInfo.isEmpty()) {
            for (SDCardInfo sDCardInfo2 : sDCardInfo) {
                String str = sDCardInfo2.state;
                if (str != null && "mounted".equals(str.toLowerCase())) {
                    arrayList.add(sDCardInfo2.path);
                }
            }
        }
        return arrayList;
    }

    public static List<SDCardInfo> getSDCardInfo() {
        ArrayList arrayList = new ArrayList();
        StorageManager storageManager = (StorageManager) Utils.getApp().getSystemService("storage");
        if (storageManager == null) {
            return arrayList;
        }
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                List<StorageVolume> storageVolumes = storageManager.getStorageVolumes();
                Method method = StorageVolume.class.getMethod("getPath", new Class[0]);
                for (StorageVolume storageVolume : storageVolumes) {
                    arrayList.add(new SDCardInfo((String) method.invoke(storageVolume, new Object[0]), storageVolume.getState(), storageVolume.isRemovable()));
                }
            } else {
                try {
                    Class<?> cls = Class.forName("android.os.storage.StorageVolume");
                    Method method2 = cls.getMethod("getPath", new Class[0]);
                    Method method3 = cls.getMethod("isRemovable", new Class[0]);
                    Method method4 = StorageManager.class.getMethod("getVolumeState", String.class);
                    Object invoke = StorageManager.class.getMethod("getVolumeList", new Class[0]).invoke(storageManager, new Object[0]);
                    int length = Array.getLength(invoke);
                    for (int i5 = 0; i5 < length; i5++) {
                        Object obj = Array.get(invoke, i5);
                        String str = (String) method2.invoke(obj, new Object[0]);
                        arrayList.add(new SDCardInfo(str, (String) method4.invoke(storageManager, str), ((Boolean) method3.invoke(obj, new Object[0])).booleanValue()));
                    }
                } catch (ClassNotFoundException e5) {
                    e = e5;
                    e.printStackTrace();
                    return arrayList;
                }
            }
        } catch (IllegalAccessException e6) {
            e = e6;
        } catch (NoSuchMethodException e7) {
            e = e7;
        } catch (InvocationTargetException e8) {
            e = e8;
        }
        return arrayList;
    }

    public static String getSDCardPathByEnvironment() {
        return isSDCardEnableByEnvironment() ? Environment.getExternalStorageDirectory().getAbsolutePath() : "";
    }

    public static boolean isSDCardEnableByEnvironment() {
        return "mounted".equals(Environment.getExternalStorageState());
    }
}
