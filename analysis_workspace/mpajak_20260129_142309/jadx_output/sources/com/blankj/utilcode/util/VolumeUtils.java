package com.blankj.utilcode.util;

import android.media.AudioManager;
import android.os.Build;

/* loaded from: classes17.dex */
public class VolumeUtils {
    public static int getMaxVolume(int i5) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamMaxVolume(i5);
    }

    public static int getMinVolume(int i5) {
        AudioManager audioManager = (AudioManager) Utils.getApp().getSystemService("audio");
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i5);
        }
        return 0;
    }

    public static int getVolume(int i5) {
        return ((AudioManager) Utils.getApp().getSystemService("audio")).getStreamVolume(i5);
    }

    public static void setVolume(int i5, int i6, int i7) {
        try {
            ((AudioManager) Utils.getApp().getSystemService("audio")).setStreamVolume(i5, i6, i7);
        } catch (SecurityException unused) {
        }
    }
}
