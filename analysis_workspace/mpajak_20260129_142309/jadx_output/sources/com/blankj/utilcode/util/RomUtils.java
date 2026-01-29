package com.blankj.utilcode.util;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import androidx.activity.d;
import androidx.appcompat.graphics.drawable.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/* loaded from: classes23.dex */
public final class RomUtils {
    private static final String UNKNOWN = "unknown";
    private static final String VERSION_PROPERTY_360 = "ro.build.uiversion";
    private static final String VERSION_PROPERTY_HUAWEI = "ro.build.version.emui";
    private static final String VERSION_PROPERTY_LEECO = "ro.letv.release.version";
    private static final String VERSION_PROPERTY_NUBIA = "ro.build.rom.id";
    private static final String VERSION_PROPERTY_ONEPLUS = "ro.rom.version";
    private static final String VERSION_PROPERTY_OPPO = "ro.build.version.opporom";
    private static final String VERSION_PROPERTY_VIVO = "ro.vivo.os.build.display.id";
    private static final String VERSION_PROPERTY_XIAOMI = "ro.build.version.incremental";
    private static final String VERSION_PROPERTY_ZTE = "ro.build.MiFavor_version";
    private static final String[] ROM_HUAWEI = {"huawei"};
    private static final String[] ROM_VIVO = {"vivo"};
    private static final String[] ROM_XIAOMI = {"xiaomi"};
    private static final String[] ROM_OPPO = {"oppo"};
    private static final String[] ROM_LEECO = {"leeco", "letv"};
    private static final String[] ROM_360 = {"360", "qiku"};
    private static final String[] ROM_ZTE = {"zte"};
    private static final String[] ROM_ONEPLUS = {"oneplus"};
    private static final String[] ROM_NUBIA = {"nubia"};
    private static final String[] ROM_COOLPAD = {"coolpad", "yulong"};
    private static final String[] ROM_LG = {"lg", "lge"};
    private static final String[] ROM_GOOGLE = {"google"};
    private static final String[] ROM_SAMSUNG = {"samsung"};
    private static final String[] ROM_MEIZU = {"meizu"};
    private static final String[] ROM_LENOVO = {"lenovo"};
    private static final String[] ROM_SMARTISAN = {"smartisan", "deltainno"};
    private static final String[] ROM_HTC = {"htc"};
    private static final String[] ROM_SONY = {"sony"};
    private static final String[] ROM_GIONEE = {"gionee", "amigo"};
    private static final String[] ROM_MOTOROLA = {"motorola"};
    private static RomInfo bean = null;

    /* loaded from: classes13.dex */
    public static class RomInfo {
        private String name;
        private String version;

        public String getName() {
            return this.name;
        }

        public String getVersion() {
            return this.version;
        }

        public String toString() {
            StringBuilder g5 = d.g("RomInfo{name=");
            g5.append(this.name);
            g5.append(", version=");
            return a.c(g5, this.version, "}");
        }
    }

    private RomUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static String getBrand() {
        try {
            String str = Build.BRAND;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    private static String getManufacturer() {
        try {
            String str = Build.MANUFACTURER;
            return !TextUtils.isEmpty(str) ? str.toLowerCase() : "unknown";
        } catch (Throwable unused) {
            return "unknown";
        }
    }

    public static RomInfo getRomInfo() {
        RomInfo romInfo;
        RomInfo romInfo2;
        String str;
        RomInfo romInfo3 = bean;
        if (romInfo3 != null) {
            return romInfo3;
        }
        bean = new RomInfo();
        String brand = getBrand();
        String manufacturer = getManufacturer();
        String[] strArr = ROM_HUAWEI;
        if (isRightRom(brand, manufacturer, strArr)) {
            bean.name = strArr[0];
            String romVersion = getRomVersion(VERSION_PROPERTY_HUAWEI);
            String[] split = romVersion.split("_");
            if (split.length > 1) {
                bean.version = split[1];
            } else {
                bean.version = romVersion;
            }
            return bean;
        }
        String[] strArr2 = ROM_VIVO;
        if (isRightRom(brand, manufacturer, strArr2)) {
            bean.name = strArr2[0];
            romInfo2 = bean;
            str = VERSION_PROPERTY_VIVO;
        } else {
            String[] strArr3 = ROM_XIAOMI;
            if (isRightRom(brand, manufacturer, strArr3)) {
                bean.name = strArr3[0];
                romInfo2 = bean;
                str = VERSION_PROPERTY_XIAOMI;
            } else {
                String[] strArr4 = ROM_OPPO;
                if (isRightRom(brand, manufacturer, strArr4)) {
                    bean.name = strArr4[0];
                    romInfo2 = bean;
                    str = VERSION_PROPERTY_OPPO;
                } else {
                    String[] strArr5 = ROM_LEECO;
                    if (isRightRom(brand, manufacturer, strArr5)) {
                        bean.name = strArr5[0];
                        romInfo2 = bean;
                        str = VERSION_PROPERTY_LEECO;
                    } else {
                        String[] strArr6 = ROM_360;
                        if (isRightRom(brand, manufacturer, strArr6)) {
                            bean.name = strArr6[0];
                            romInfo2 = bean;
                            str = VERSION_PROPERTY_360;
                        } else {
                            String[] strArr7 = ROM_ZTE;
                            if (isRightRom(brand, manufacturer, strArr7)) {
                                bean.name = strArr7[0];
                                romInfo2 = bean;
                                str = VERSION_PROPERTY_ZTE;
                            } else {
                                String[] strArr8 = ROM_ONEPLUS;
                                if (isRightRom(brand, manufacturer, strArr8)) {
                                    bean.name = strArr8[0];
                                    romInfo2 = bean;
                                    str = VERSION_PROPERTY_ONEPLUS;
                                } else {
                                    String[] strArr9 = ROM_NUBIA;
                                    if (isRightRom(brand, manufacturer, strArr9)) {
                                        bean.name = strArr9[0];
                                        romInfo2 = bean;
                                        str = VERSION_PROPERTY_NUBIA;
                                    } else {
                                        String[] strArr10 = ROM_COOLPAD;
                                        if (isRightRom(brand, manufacturer, strArr10)) {
                                            romInfo = bean;
                                            manufacturer = strArr10[0];
                                        } else {
                                            String[] strArr11 = ROM_LG;
                                            if (isRightRom(brand, manufacturer, strArr11)) {
                                                romInfo = bean;
                                                manufacturer = strArr11[0];
                                            } else {
                                                String[] strArr12 = ROM_GOOGLE;
                                                if (isRightRom(brand, manufacturer, strArr12)) {
                                                    romInfo = bean;
                                                    manufacturer = strArr12[0];
                                                } else {
                                                    String[] strArr13 = ROM_SAMSUNG;
                                                    if (isRightRom(brand, manufacturer, strArr13)) {
                                                        romInfo = bean;
                                                        manufacturer = strArr13[0];
                                                    } else {
                                                        String[] strArr14 = ROM_MEIZU;
                                                        if (isRightRom(brand, manufacturer, strArr14)) {
                                                            romInfo = bean;
                                                            manufacturer = strArr14[0];
                                                        } else {
                                                            String[] strArr15 = ROM_LENOVO;
                                                            if (isRightRom(brand, manufacturer, strArr15)) {
                                                                romInfo = bean;
                                                                manufacturer = strArr15[0];
                                                            } else {
                                                                String[] strArr16 = ROM_SMARTISAN;
                                                                if (isRightRom(brand, manufacturer, strArr16)) {
                                                                    romInfo = bean;
                                                                    manufacturer = strArr16[0];
                                                                } else {
                                                                    String[] strArr17 = ROM_HTC;
                                                                    if (isRightRom(brand, manufacturer, strArr17)) {
                                                                        romInfo = bean;
                                                                        manufacturer = strArr17[0];
                                                                    } else {
                                                                        String[] strArr18 = ROM_SONY;
                                                                        if (isRightRom(brand, manufacturer, strArr18)) {
                                                                            romInfo = bean;
                                                                            manufacturer = strArr18[0];
                                                                        } else {
                                                                            String[] strArr19 = ROM_GIONEE;
                                                                            if (isRightRom(brand, manufacturer, strArr19)) {
                                                                                romInfo = bean;
                                                                                manufacturer = strArr19[0];
                                                                            } else {
                                                                                String[] strArr20 = ROM_MOTOROLA;
                                                                                if (isRightRom(brand, manufacturer, strArr20)) {
                                                                                    romInfo = bean;
                                                                                    manufacturer = strArr20[0];
                                                                                } else {
                                                                                    romInfo = bean;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        romInfo.name = manufacturer;
                                        romInfo2 = bean;
                                        str = "";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        romInfo2.version = getRomVersion(str);
        return bean;
    }

    private static String getRomVersion(String str) {
        String systemProperty = !TextUtils.isEmpty(str) ? getSystemProperty(str) : "";
        if (TextUtils.isEmpty(systemProperty) || systemProperty.equals("unknown")) {
            try {
                String str2 = Build.DISPLAY;
                if (!TextUtils.isEmpty(str2)) {
                    systemProperty = str2.toLowerCase();
                }
            } catch (Throwable unused) {
            }
        }
        return TextUtils.isEmpty(systemProperty) ? "unknown" : systemProperty;
    }

    private static String getSystemProperty(String str) {
        String systemPropertyByShell = getSystemPropertyByShell(str);
        if (!TextUtils.isEmpty(systemPropertyByShell)) {
            return systemPropertyByShell;
        }
        String systemPropertyByStream = getSystemPropertyByStream(str);
        return (TextUtils.isEmpty(systemPropertyByStream) && Build.VERSION.SDK_INT < 28) ? getSystemPropertyByReflect(str) : systemPropertyByStream;
    }

    private static String getSystemPropertyByReflect(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    private static String getSystemPropertyByShell(String str) {
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            } catch (IOException unused) {
                return "";
            }
        } catch (IOException unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            readLine = bufferedReader.readLine();
        } catch (IOException unused3) {
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 == null) {
                return "";
            }
            bufferedReader2.close();
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (readLine != null) {
            try {
                bufferedReader.close();
            } catch (IOException unused5) {
            }
            return readLine;
        }
        bufferedReader.close();
        return "";
    }

    private static String getSystemPropertyByStream(String str) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File(Environment.getRootDirectory(), "build.prop")));
            return properties.getProperty(str, "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean is360() {
        return androidx.activity.result.a.i(ROM_360[0]);
    }

    public static boolean isCoolpad() {
        return androidx.activity.result.a.i(ROM_COOLPAD[0]);
    }

    public static boolean isGionee() {
        return androidx.activity.result.a.i(ROM_GIONEE[0]);
    }

    public static boolean isGoogle() {
        return androidx.activity.result.a.i(ROM_GOOGLE[0]);
    }

    public static boolean isHtc() {
        return androidx.activity.result.a.i(ROM_HTC[0]);
    }

    public static boolean isHuawei() {
        return androidx.activity.result.a.i(ROM_HUAWEI[0]);
    }

    public static boolean isLeeco() {
        return androidx.activity.result.a.i(ROM_LEECO[0]);
    }

    public static boolean isLenovo() {
        return androidx.activity.result.a.i(ROM_LENOVO[0]);
    }

    public static boolean isLg() {
        return androidx.activity.result.a.i(ROM_LG[0]);
    }

    public static boolean isMeizu() {
        return androidx.activity.result.a.i(ROM_MEIZU[0]);
    }

    public static boolean isMotorola() {
        return androidx.activity.result.a.i(ROM_MOTOROLA[0]);
    }

    public static boolean isNubia() {
        return androidx.activity.result.a.i(ROM_NUBIA[0]);
    }

    public static boolean isOneplus() {
        return androidx.activity.result.a.i(ROM_ONEPLUS[0]);
    }

    public static boolean isOppo() {
        return androidx.activity.result.a.i(ROM_OPPO[0]);
    }

    private static boolean isRightRom(String str, String str2, String... strArr) {
        for (String str3 : strArr) {
            if (str.contains(str3) || str2.contains(str3)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSamsung() {
        return androidx.activity.result.a.i(ROM_SAMSUNG[0]);
    }

    public static boolean isSmartisan() {
        return androidx.activity.result.a.i(ROM_SMARTISAN[0]);
    }

    public static boolean isSony() {
        return androidx.activity.result.a.i(ROM_SONY[0]);
    }

    public static boolean isVivo() {
        return androidx.activity.result.a.i(ROM_VIVO[0]);
    }

    public static boolean isXiaomi() {
        return androidx.activity.result.a.i(ROM_XIAOMI[0]);
    }

    public static boolean isZte() {
        return androidx.activity.result.a.i(ROM_ZTE[0]);
    }
}
