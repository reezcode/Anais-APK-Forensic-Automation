package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressLint({"ApplySharedPref"})
/* loaded from: classes7.dex */
public final class SPUtils {
    private static final Map<String, SPUtils> SP_UTILS_MAP = new HashMap();
    private SharedPreferences sp;

    private SPUtils(String str) {
        this.sp = Utils.getApp().getSharedPreferences(str, 0);
    }

    private SPUtils(String str, int i5) {
        this.sp = Utils.getApp().getSharedPreferences(str, i5);
    }

    public static SPUtils getInstance() {
        return getInstance("", 0);
    }

    public static SPUtils getInstance(int i5) {
        return getInstance("", i5);
    }

    public static SPUtils getInstance(String str) {
        return getInstance(str, 0);
    }

    public static SPUtils getInstance(String str, int i5) {
        if (isSpace(str)) {
            str = "spUtils";
        }
        Map<String, SPUtils> map = SP_UTILS_MAP;
        SPUtils sPUtils = map.get(str);
        if (sPUtils == null) {
            synchronized (SPUtils.class) {
                sPUtils = map.get(str);
                if (sPUtils == null) {
                    sPUtils = new SPUtils(str, i5);
                    map.put(str, sPUtils);
                }
            }
        }
        return sPUtils;
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!Character.isWhitespace(str.charAt(i5))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public void clear(boolean z4) {
        if (z4) {
            this.sp.edit().clear().commit();
        } else {
            this.sp.edit().clear().apply();
        }
    }

    public boolean contains(@NonNull String str) {
        return this.sp.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.sp.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public boolean getBoolean(@NonNull String str, boolean z4) {
        return this.sp.getBoolean(str, z4);
    }

    public float getFloat(@NonNull String str) {
        return getFloat(str, -1.0f);
    }

    public float getFloat(@NonNull String str, float f5) {
        return this.sp.getFloat(str, f5);
    }

    public int getInt(@NonNull String str) {
        return getInt(str, -1);
    }

    public int getInt(@NonNull String str, int i5) {
        return this.sp.getInt(str, i5);
    }

    public long getLong(@NonNull String str) {
        return getLong(str, -1L);
    }

    public long getLong(@NonNull String str, long j5) {
        return this.sp.getLong(str, j5);
    }

    public String getString(@NonNull String str) {
        return getString(str, "");
    }

    public String getString(@NonNull String str, String str2) {
        return this.sp.getString(str, str2);
    }

    public Set<String> getStringSet(@NonNull String str) {
        return getStringSet(str, Collections.emptySet());
    }

    public Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return this.sp.getStringSet(str, set);
    }

    public void put(@NonNull String str, float f5) {
        put(str, f5, false);
    }

    public void put(@NonNull String str, float f5, boolean z4) {
        if (z4) {
            this.sp.edit().putFloat(str, f5).commit();
        } else {
            this.sp.edit().putFloat(str, f5).apply();
        }
    }

    public void put(@NonNull String str, int i5) {
        put(str, i5, false);
    }

    public void put(@NonNull String str, int i5, boolean z4) {
        if (z4) {
            this.sp.edit().putInt(str, i5).commit();
        } else {
            this.sp.edit().putInt(str, i5).apply();
        }
    }

    public void put(@NonNull String str, long j5) {
        put(str, j5, false);
    }

    public void put(@NonNull String str, long j5, boolean z4) {
        if (z4) {
            this.sp.edit().putLong(str, j5).commit();
        } else {
            this.sp.edit().putLong(str, j5).apply();
        }
    }

    public void put(@NonNull String str, String str2) {
        put(str, str2, false);
    }

    public void put(@NonNull String str, String str2, boolean z4) {
        if (z4) {
            this.sp.edit().putString(str, str2).commit();
        } else {
            this.sp.edit().putString(str, str2).apply();
        }
    }

    public void put(@NonNull String str, Set<String> set) {
        put(str, set, false);
    }

    public void put(@NonNull String str, Set<String> set, boolean z4) {
        if (z4) {
            this.sp.edit().putStringSet(str, set).commit();
        } else {
            this.sp.edit().putStringSet(str, set).apply();
        }
    }

    public void put(@NonNull String str, boolean z4) {
        put(str, z4, false);
    }

    public void put(@NonNull String str, boolean z4, boolean z5) {
        if (z5) {
            this.sp.edit().putBoolean(str, z4).commit();
        } else {
            this.sp.edit().putBoolean(str, z4).apply();
        }
    }

    public void remove(@NonNull String str) {
        remove(str, false);
    }

    public void remove(@NonNull String str, boolean z4) {
        if (z4) {
            this.sp.edit().remove(str).commit();
        } else {
            this.sp.edit().remove(str).apply();
        }
    }
}
