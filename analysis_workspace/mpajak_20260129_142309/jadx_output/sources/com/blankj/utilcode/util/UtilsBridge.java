package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import androidx.activity.d;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationCompat;
import com.blankj.utilcode.util.NotificationUtils;
import com.blankj.utilcode.util.ShellUtils;
import com.blankj.utilcode.util.Utils;
import i2.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
class UtilsBridge {

    /* loaded from: classes18.dex */
    public static final class FileHead {
        private LinkedHashMap<String, String> mFirst = new LinkedHashMap<>();
        private LinkedHashMap<String, String> mLast = new LinkedHashMap<>();
        private String mName;

        public FileHead(String str) {
            this.mName = str;
        }

        private void append2Host(Map<String, String> map, String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            int length = 19 - str.length();
            if (length > 0) {
                StringBuilder g5 = d.g(str);
                g5.append("                   ".substring(0, length));
                str = g5.toString();
            }
            map.put(str, str2);
        }

        private void append2Host(Map<String, String> map, Map<String, String> map2) {
            if (map2 == null || map2.isEmpty()) {
                return;
            }
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                append2Host(map, entry.getKey(), entry.getValue());
            }
        }

        public void addFirst(String str, String str2) {
            append2Host(this.mFirst, str, str2);
        }

        public void append(String str, String str2) {
            append2Host(this.mLast, str, str2);
        }

        public void append(Map<String, String> map) {
            append2Host(this.mLast, map);
        }

        public String getAppended() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : this.mLast.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            return sb.toString();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            StringBuilder g5 = d.g("************* ");
            g5.append(this.mName);
            g5.append(" Head ****************\n");
            String sb2 = g5.toString();
            sb.append(sb2);
            for (Map.Entry<String, String> entry : this.mFirst.entrySet()) {
                sb.append(entry.getKey());
                sb.append(": ");
                sb.append(entry.getValue());
                sb.append("\n");
            }
            sb.append("Rom Info           : ");
            sb.append(RomUtils.getRomInfo());
            sb.append("\n");
            sb.append("Device Manufacturer: ");
            sb.append(Build.MANUFACTURER);
            sb.append("\n");
            sb.append("Device Model       : ");
            sb.append(Build.MODEL);
            sb.append("\n");
            sb.append("Android Version    : ");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\n");
            sb.append("Android SDK        : ");
            sb.append(Build.VERSION.SDK_INT);
            sb.append("\n");
            sb.append("App VersionName    : ");
            sb.append(AppUtils.getAppVersionName());
            sb.append("\n");
            sb.append("App VersionCode    : ");
            sb.append(AppUtils.getAppVersionCode());
            sb.append("\n");
            sb.append(getAppended());
            sb.append(sb2);
            sb.append("\n");
            return sb.toString();
        }
    }

    public static void addActivityLifecycleCallbacks(Activity activity, Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        UtilsActivityLifecycleImpl.INSTANCE.addActivityLifecycleCallbacks(activity, activityLifecycleCallbacks);
    }

    public static void addActivityLifecycleCallbacks(Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        UtilsActivityLifecycleImpl.INSTANCE.addActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static void addOnAppStatusChangedListener(Utils.OnAppStatusChangedListener onAppStatusChangedListener) {
        UtilsActivityLifecycleImpl.INSTANCE.addOnAppStatusChangedListener(onAppStatusChangedListener);
    }

    public static byte[] base64Decode(byte[] bArr) {
        return EncodeUtils.base64Decode(bArr);
    }

    public static byte[] base64Encode(byte[] bArr) {
        return EncodeUtils.base64Encode(bArr);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap) {
        return ImageUtils.bitmap2Bytes(bitmap);
    }

    public static byte[] bitmap2Bytes(Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i5) {
        return ImageUtils.bitmap2Bytes(bitmap, compressFormat, i5);
    }

    public static Drawable bitmap2Drawable(Bitmap bitmap) {
        return ImageUtils.bitmap2Drawable(bitmap);
    }

    public static String byte2FitMemorySize(long j5) {
        return ConvertUtils.byte2FitMemorySize(j5);
    }

    public static Bitmap bytes2Bitmap(byte[] bArr) {
        return ImageUtils.bytes2Bitmap(bArr);
    }

    public static Drawable bytes2Drawable(byte[] bArr) {
        return ImageUtils.bytes2Drawable(bArr);
    }

    public static String bytes2HexString(byte[] bArr) {
        return ConvertUtils.bytes2HexString(bArr);
    }

    public static JSONArray bytes2JSONArray(byte[] bArr) {
        return ConvertUtils.bytes2JSONArray(bArr);
    }

    public static JSONObject bytes2JSONObject(byte[] bArr) {
        return ConvertUtils.bytes2JSONObject(bArr);
    }

    public static Object bytes2Object(byte[] bArr) {
        return ConvertUtils.bytes2Object(bArr);
    }

    public static <T> T bytes2Parcelable(byte[] bArr, Parcelable.Creator<T> creator) {
        return (T) ConvertUtils.bytes2Parcelable(bArr, creator);
    }

    public static String bytes2String(byte[] bArr) {
        return ConvertUtils.bytes2String(bArr);
    }

    public static boolean createFileByDeleteOldFile(File file) {
        return FileUtils.createFileByDeleteOldFile(file);
    }

    public static boolean createOrExistsDir(File file) {
        return FileUtils.createOrExistsDir(file);
    }

    public static boolean createOrExistsFile(File file) {
        return FileUtils.createOrExistsFile(file);
    }

    public static boolean deleteAllInDir(File file) {
        return FileUtils.deleteAllInDir(file);
    }

    public static <T> Utils.Task<T> doAsync(Utils.Task<T> task) {
        ThreadUtils.getCachedPool().execute(task);
        return task;
    }

    public static int dp2px(float f5) {
        return SizeUtils.dp2px(f5);
    }

    public static Bitmap drawable2Bitmap(Drawable drawable) {
        return ImageUtils.drawable2Bitmap(drawable);
    }

    public static byte[] drawable2Bytes(Drawable drawable) {
        return ImageUtils.drawable2Bytes(drawable);
    }

    public static byte[] drawable2Bytes(Drawable drawable, Bitmap.CompressFormat compressFormat, int i5) {
        return ImageUtils.drawable2Bytes(drawable, compressFormat, i5);
    }

    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return StringUtils.equals(charSequence, charSequence2);
    }

    public static ShellUtils.CommandResult execCmd(String str, boolean z4) {
        return ShellUtils.execCmd(str, z4);
    }

    public static Uri file2Uri(File file) {
        return UriUtils.file2Uri(file);
    }

    public static void finishAllActivities() {
        ActivityUtils.finishAllActivities();
    }

    public static void fixSoftInputLeaks(Activity activity) {
        KeyboardUtils.fixSoftInputLeaks(activity);
    }

    public static String format(@Nullable String str, Object... objArr) {
        return StringUtils.format(str, objArr);
    }

    public static String formatJson(String str) {
        return JsonUtils.formatJson(str);
    }

    public static <T> T fromJson(String str, Type type) {
        return (T) GsonUtils.fromJson(str, type);
    }

    public static Activity getActivityByContext(Context context) {
        return ActivityUtils.getActivityByContext(context);
    }

    public static List<Activity> getActivityList() {
        return UtilsActivityLifecycleImpl.INSTANCE.getActivityList();
    }

    public static int getAppScreenWidth() {
        return ScreenUtils.getAppScreenWidth();
    }

    public static Application getApplicationByReflect() {
        return UtilsActivityLifecycleImpl.INSTANCE.getApplicationByReflect();
    }

    @RequiresPermission("android.permission.CALL_PHONE")
    public static Intent getCallIntent(String str) {
        return IntentUtils.getCallIntent(str);
    }

    public static String getCurrentProcessName() {
        return ProcessUtils.getCurrentProcessName();
    }

    public static Intent getDialIntent(String str) {
        return IntentUtils.getDialIntent(str);
    }

    public static File getFileByPath(String str) {
        return FileUtils.getFileByPath(str);
    }

    public static String getForegroundProcessName() {
        return ProcessUtils.getForegroundProcessName();
    }

    public static long getFsAvailableSize(String str) {
        return FileUtils.getFsAvailableSize(str);
    }

    public static long getFsTotalSize(String str) {
        return FileUtils.getFsTotalSize(str);
    }

    public static String getFullStackTrace(Throwable th) {
        return ThrowableUtils.getFullStackTrace(th);
    }

    public static i getGson4LogUtils() {
        return GsonUtils.getGson4LogUtils();
    }

    public static Intent getInstallAppIntent(Uri uri) {
        return IntentUtils.getInstallAppIntent(uri);
    }

    public static Intent getInstallAppIntent(File file) {
        return IntentUtils.getInstallAppIntent(file);
    }

    public static Intent getLaunchAppDetailsSettingsIntent(String str, boolean z4) {
        return IntentUtils.getLaunchAppDetailsSettingsIntent(str, z4);
    }

    public static Intent getLaunchAppIntent(String str) {
        return IntentUtils.getLaunchAppIntent(str);
    }

    public static String getLauncherActivity(String str) {
        return ActivityUtils.getLauncherActivity(str);
    }

    public static int getNavBarHeight() {
        return BarUtils.getNavBarHeight();
    }

    public static Notification getNotification(NotificationUtils.ChannelConfig channelConfig, Utils.Consumer<NotificationCompat.Builder> consumer) {
        return NotificationUtils.getNotification(channelConfig, consumer);
    }

    public static Intent getSendSmsIntent(String str, String str2) {
        return IntentUtils.getSendSmsIntent(str, str2);
    }

    public static SPUtils getSpUtils4Utils() {
        return SPUtils.getInstance("Utils");
    }

    public static int getStatusBarHeight() {
        return BarUtils.getStatusBarHeight();
    }

    public static String getString(@StringRes int i5) {
        return StringUtils.getString(i5);
    }

    public static String getString(@StringRes int i5, Object... objArr) {
        return StringUtils.getString(i5, objArr);
    }

    public static Activity getTopActivity() {
        return UtilsActivityLifecycleImpl.INSTANCE.getTopActivity();
    }

    public static Intent getUninstallAppIntent(String str) {
        return IntentUtils.getUninstallAppIntent(str);
    }

    public static byte[] hashTemplate(byte[] bArr, String str) {
        return EncryptUtils.hashTemplate(bArr, str);
    }

    public static byte[] hexString2Bytes(String str) {
        return ConvertUtils.hexString2Bytes(str);
    }

    public static void init(Application application) {
        UtilsActivityLifecycleImpl.INSTANCE.init(application);
    }

    public static ByteArrayOutputStream input2OutputStream(InputStream inputStream) {
        return ConvertUtils.input2OutputStream(inputStream);
    }

    public static byte[] inputStream2Bytes(InputStream inputStream) {
        return ConvertUtils.inputStream2Bytes(inputStream);
    }

    public static List<String> inputStream2Lines(InputStream inputStream, String str) {
        return ConvertUtils.inputStream2Lines(inputStream, str);
    }

    public static boolean isActivityAlive(Activity activity) {
        return ActivityUtils.isActivityAlive(activity);
    }

    public static boolean isAppDebug() {
        return AppUtils.isAppDebug();
    }

    public static boolean isAppForeground() {
        return UtilsActivityLifecycleImpl.INSTANCE.isAppForeground();
    }

    public static boolean isAppInstalled(String str) {
        return AppUtils.isAppInstalled(str);
    }

    public static boolean isAppRunning(@NonNull String str) {
        return AppUtils.isAppRunning(str);
    }

    public static boolean isFileExists(File file) {
        return FileUtils.isFileExists(file);
    }

    public static boolean isGranted(String... strArr) {
        return PermissionUtils.isGranted(strArr);
    }

    @RequiresApi(api = 23)
    public static boolean isGrantedDrawOverlays() {
        return PermissionUtils.isGrantedDrawOverlays();
    }

    public static boolean isIntentAvailable(Intent intent) {
        return IntentUtils.isIntentAvailable(intent);
    }

    public static boolean isLayoutRtl() {
        return ViewUtils.isLayoutRtl();
    }

    public static boolean isMainProcess() {
        return ProcessUtils.isMainProcess();
    }

    public static boolean isSDCardEnableByEnvironment() {
        return SDCardUtils.isSDCardEnableByEnvironment();
    }

    public static boolean isSamsung() {
        return RomUtils.isSamsung();
    }

    public static boolean isServiceRunning(String str) {
        return ServiceUtils.isServiceRunning(str);
    }

    public static boolean isSpace(String str) {
        return StringUtils.isSpace(str);
    }

    public static boolean isValid(@NonNull View view, long j5) {
        return DebouncingUtils.isValid(view, j5);
    }

    public static byte[] jsonArray2Bytes(JSONArray jSONArray) {
        return ConvertUtils.jsonArray2Bytes(jSONArray);
    }

    public static byte[] jsonObject2Bytes(JSONObject jSONObject) {
        return ConvertUtils.jsonObject2Bytes(jSONObject);
    }

    public static View layoutId2View(@LayoutRes int i5) {
        return ViewUtils.layoutId2View(i5);
    }

    public static String millis2FitTimeSpan(long j5, int i5) {
        return TimeUtils.millis2FitTimeSpan(j5, i5);
    }

    public static void notifySystemToScan(File file) {
        FileUtils.notifySystemToScan(file);
    }

    public static byte[] parcelable2Bytes(Parcelable parcelable) {
        return ConvertUtils.parcelable2Bytes(parcelable);
    }

    public static void preLoad() {
        preLoad(AdaptScreenUtils.getPreLoadRunnable());
    }

    private static void preLoad(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            ThreadUtils.getCachedPool().execute(runnable);
        }
    }

    public static int px2dp(float f5) {
        return SizeUtils.px2dp(f5);
    }

    public static int px2sp(float f5) {
        return SizeUtils.px2sp(f5);
    }

    public static byte[] readFile2Bytes(File file) {
        return FileIOUtils.readFile2BytesByChannel(file);
    }

    public static void relaunchApp() {
        AppUtils.relaunchApp();
    }

    public static void removeActivityLifecycleCallbacks(Activity activity) {
        UtilsActivityLifecycleImpl.INSTANCE.removeActivityLifecycleCallbacks(activity);
    }

    public static void removeActivityLifecycleCallbacks(Activity activity, Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        UtilsActivityLifecycleImpl.INSTANCE.removeActivityLifecycleCallbacks(activity, activityLifecycleCallbacks);
    }

    public static void removeActivityLifecycleCallbacks(Utils.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        UtilsActivityLifecycleImpl.INSTANCE.removeActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    public static void removeOnAppStatusChangedListener(Utils.OnAppStatusChangedListener onAppStatusChangedListener) {
        UtilsActivityLifecycleImpl.INSTANCE.removeOnAppStatusChangedListener(onAppStatusChangedListener);
    }

    public static void runOnUiThread(Runnable runnable) {
        ThreadUtils.runOnUiThread(runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j5) {
        ThreadUtils.runOnUiThreadDelayed(runnable, j5);
    }

    public static byte[] serializable2Bytes(Serializable serializable) {
        return ConvertUtils.serializable2Bytes(serializable);
    }

    public static int sp2px(float f5) {
        return SizeUtils.sp2px(f5);
    }

    public static void startHomeActivity() {
        ActivityUtils.startHomeActivity();
    }

    public static byte[] string2Bytes(String str) {
        return ConvertUtils.string2Bytes(str);
    }

    public static String toJson(Object obj) {
        return GsonUtils.toJson(obj);
    }

    public static void toastCancel() {
        ToastUtils.cancel();
    }

    public static void toastShowShort(CharSequence charSequence) {
        ToastUtils.showShort(charSequence);
    }

    public static void unInit(Application application) {
        UtilsActivityLifecycleImpl.INSTANCE.unInit(application);
    }

    public static File uri2File(Uri uri) {
        return UriUtils.uri2File(uri);
    }

    public static Bitmap view2Bitmap(View view) {
        return ImageUtils.view2Bitmap(view);
    }

    public static boolean writeFileFromBytes(File file, byte[] bArr) {
        return FileIOUtils.writeFileFromBytesByChannel(file, bArr, true);
    }

    public static boolean writeFileFromIS(String str, InputStream inputStream) {
        return FileIOUtils.writeFileFromIS(str, inputStream);
    }

    public static boolean writeFileFromString(String str, String str2, boolean z4) {
        return FileIOUtils.writeFileFromString(str, str2, z4);
    }
}
