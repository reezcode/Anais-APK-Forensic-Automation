.class Lcom/blankj/utilcode/util/UtilsBridge;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/blankj/utilcode/util/UtilsBridge$FileHead;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static addActivityLifecycleCallbacks(Landroid/app/Activity;Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0, p1}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->addActivityLifecycleCallbacks(Landroid/app/Activity;Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static addActivityLifecycleCallbacks(Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->addActivityLifecycleCallbacks(Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static addOnAppStatusChangedListener(Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->addOnAppStatusChangedListener(Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;)V

    return-void
.end method

.method public static base64Decode([B)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/EncodeUtils;->base64Decode([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static base64Encode([B)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/EncodeUtils;->base64Encode([B)[B

    move-result-object p0

    return-object p0
.end method

.method public static bitmap2Bytes(Landroid/graphics/Bitmap;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->bitmap2Bytes(Landroid/graphics/Bitmap;)[B

    move-result-object p0

    return-object p0
.end method

.method public static bitmap2Bytes(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/ImageUtils;->bitmap2Bytes(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static bitmap2Drawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->bitmap2Drawable(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static byte2FitMemorySize(J)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ConvertUtils;->byte2FitMemorySize(J)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2Bitmap([B)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->bytes2Bitmap([B)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2Drawable([B)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->bytes2Drawable([B)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2HexString([B)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->bytes2HexString([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2JSONArray([B)Lorg/json/JSONArray;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->bytes2JSONArray([B)Lorg/json/JSONArray;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2JSONObject([B)Lorg/json/JSONObject;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->bytes2JSONObject([B)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2Object([B)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->bytes2Object([B)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2Parcelable([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([B",
            "Landroid/os/Parcelable$Creator<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ConvertUtils;->bytes2Parcelable([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bytes2String([B)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->bytes2String([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static createFileByDeleteOldFile(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->createFileByDeleteOldFile(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static createOrExistsDir(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static createOrExistsFile(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsFile(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static deleteAllInDir(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->deleteAllInDir(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static doAsync(Lcom/blankj/utilcode/util/Utils$Task;)Lcom/blankj/utilcode/util/Utils$Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/blankj/utilcode/util/Utils$Task<",
            "TT;>;)",
            "Lcom/blankj/utilcode/util/Utils$Task<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Lcom/blankj/utilcode/util/ThreadUtils;->getCachedPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object p0
.end method

.method public static dp2px(F)I
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p0

    return p0
.end method

.method public static drawable2Bitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->drawable2Bitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static drawable2Bytes(Landroid/graphics/drawable/Drawable;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->drawable2Bytes(Landroid/graphics/drawable/Drawable;)[B

    move-result-object p0

    return-object p0
.end method

.method public static drawable2Bytes(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$CompressFormat;I)[B
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/ImageUtils;->drawable2Bytes(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$CompressFormat;I)[B

    move-result-object p0

    return-object p0
.end method

.method public static equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/StringUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static execCmd(Ljava/lang/String;Z)Lcom/blankj/utilcode/util/ShellUtils$CommandResult;
    .locals 0

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ShellUtils;->execCmd(Ljava/lang/String;Z)Lcom/blankj/utilcode/util/ShellUtils$CommandResult;

    move-result-object p0

    return-object p0
.end method

.method public static file2Uri(Ljava/io/File;)Landroid/net/Uri;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/UriUtils;->file2Uri(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static finishAllActivities()V
    .locals 0

    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->finishAllActivities()V

    return-void
.end method

.method public static fixSoftInputLeaks(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/KeyboardUtils;->fixSoftInputLeaks(Landroid/app/Activity;)V

    return-void
.end method

.method public static varargs format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/StringUtils;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static formatJson(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/JsonUtils;->formatJson(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getActivityByContext(Landroid/content/Context;)Landroid/app/Activity;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ActivityUtils;->getActivityByContext(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static getActivityList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->getActivityList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static getAppScreenWidth()I
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/ScreenUtils;->getAppScreenWidth()I

    move-result v0

    return v0
.end method

.method public static getApplicationByReflect()Landroid/app/Application;
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->getApplicationByReflect()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method public static getCallIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 0
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.CALL_PHONE"
    .end annotation

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->getCallIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getCurrentProcessName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/ProcessUtils;->getCurrentProcessName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getDialIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->getDialIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getFileByPath(Ljava/lang/String;)Ljava/io/File;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->getFileByPath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static getForegroundProcessName()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/ProcessUtils;->getForegroundProcessName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getFsAvailableSize(Ljava/lang/String;)J
    .locals 2

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->getFsAvailableSize(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFsTotalSize(Ljava/lang/String;)J
    .locals 2

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->getFsTotalSize(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static getFullStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ThrowableUtils;->getFullStackTrace(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getGson4LogUtils()Li2/i;
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/GsonUtils;->getGson4LogUtils()Li2/i;

    move-result-object v0

    return-object v0
.end method

.method public static getInstallAppIntent(Landroid/net/Uri;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->getInstallAppIntent(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getInstallAppIntent(Ljava/io/File;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->getInstallAppIntent(Ljava/io/File;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getLaunchAppDetailsSettingsIntent(Ljava/lang/String;Z)Landroid/content/Intent;
    .locals 0

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/IntentUtils;->getLaunchAppDetailsSettingsIntent(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getLaunchAppIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->getLaunchAppIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getLauncherActivity(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ActivityUtils;->getLauncherActivity(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getNavBarHeight()I
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/BarUtils;->getNavBarHeight()I

    move-result v0

    return v0
.end method

.method public static getNotification(Lcom/blankj/utilcode/util/NotificationUtils$ChannelConfig;Lcom/blankj/utilcode/util/Utils$Consumer;)Landroid/app/Notification;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/blankj/utilcode/util/NotificationUtils$ChannelConfig;",
            "Lcom/blankj/utilcode/util/Utils$Consumer<",
            "Landroidx/core/app/NotificationCompat$Builder;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/NotificationUtils;->getNotification(Lcom/blankj/utilcode/util/NotificationUtils$ChannelConfig;Lcom/blankj/utilcode/util/Utils$Consumer;)Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method public static getSendSmsIntent(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/IntentUtils;->getSendSmsIntent(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static getSpUtils4Utils()Lcom/blankj/utilcode/util/SPUtils;
    .locals 1

    const-string v0, "Utils"

    invoke-static {v0}, Lcom/blankj/utilcode/util/SPUtils;->getInstance(Ljava/lang/String;)Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    return-object v0
.end method

.method public static getStatusBarHeight()I
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/BarUtils;->getStatusBarHeight()I

    move-result v0

    return v0
.end method

.method public static getString(I)Ljava/lang/String;
    .locals 0
    .param p0    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/blankj/utilcode/util/StringUtils;->getString(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs getString(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0
    .param p0    # I
        .annotation build Landroidx/annotation/StringRes;
        .end annotation
    .end param

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/StringUtils;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static getTopActivity()Landroid/app/Activity;
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->getTopActivity()Landroid/app/Activity;

    move-result-object v0

    return-object v0
.end method

.method public static getUninstallAppIntent(Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->getUninstallAppIntent(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static hashTemplate([BLjava/lang/String;)[B
    .locals 0

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/EncryptUtils;->hashTemplate([BLjava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static hexString2Bytes(Ljava/lang/String;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->hexString2Bytes(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static init(Landroid/app/Application;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->init(Landroid/app/Application;)V

    return-void
.end method

.method public static input2OutputStream(Ljava/io/InputStream;)Ljava/io/ByteArrayOutputStream;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->input2OutputStream(Ljava/io/InputStream;)Ljava/io/ByteArrayOutputStream;

    move-result-object p0

    return-object p0
.end method

.method public static inputStream2Bytes(Ljava/io/InputStream;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->inputStream2Bytes(Ljava/io/InputStream;)[B

    move-result-object p0

    return-object p0
.end method

.method public static inputStream2Lines(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ConvertUtils;->inputStream2Lines(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static isActivityAlive(Landroid/app/Activity;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ActivityUtils;->isActivityAlive(Landroid/app/Activity;)Z

    move-result p0

    return p0
.end method

.method public static isAppDebug()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->isAppDebug()Z

    move-result v0

    return v0
.end method

.method public static isAppForeground()Z
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->isAppForeground()Z

    move-result v0

    return v0
.end method

.method public static isAppInstalled(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/AppUtils;->isAppInstalled(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isAppRunning(Ljava/lang/String;)Z
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/blankj/utilcode/util/AppUtils;->isAppRunning(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isFileExists(Ljava/io/File;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method public static varargs isGranted([Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/PermissionUtils;->isGranted([Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isGrantedDrawOverlays()Z
    .locals 1
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x17
    .end annotation

    invoke-static {}, Lcom/blankj/utilcode/util/PermissionUtils;->isGrantedDrawOverlays()Z

    move-result v0

    return v0
.end method

.method public static isIntentAvailable(Landroid/content/Intent;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/IntentUtils;->isIntentAvailable(Landroid/content/Intent;)Z

    move-result p0

    return p0
.end method

.method public static isLayoutRtl()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/ViewUtils;->isLayoutRtl()Z

    move-result v0

    return v0
.end method

.method public static isMainProcess()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/ProcessUtils;->isMainProcess()Z

    move-result v0

    return v0
.end method

.method public static isSDCardEnableByEnvironment()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/SDCardUtils;->isSDCardEnableByEnvironment()Z

    move-result v0

    return v0
.end method

.method public static isSamsung()Z
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/RomUtils;->isSamsung()Z

    move-result v0

    return v0
.end method

.method public static isServiceRunning(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ServiceUtils;->isServiceRunning(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isSpace(Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/StringUtils;->isSpace(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static isValid(Landroid/view/View;J)Z
    .locals 0
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/DebouncingUtils;->isValid(Landroid/view/View;J)Z

    move-result p0

    return p0
.end method

.method public static jsonArray2Bytes(Lorg/json/JSONArray;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->jsonArray2Bytes(Lorg/json/JSONArray;)[B

    move-result-object p0

    return-object p0
.end method

.method public static jsonObject2Bytes(Lorg/json/JSONObject;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->jsonObject2Bytes(Lorg/json/JSONObject;)[B

    move-result-object p0

    return-object p0
.end method

.method public static layoutId2View(I)Landroid/view/View;
    .locals 0
    .param p0    # I
        .annotation build Landroidx/annotation/LayoutRes;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/blankj/utilcode/util/ViewUtils;->layoutId2View(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static millis2FitTimeSpan(JI)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/TimeUtils;->millis2FitTimeSpan(JI)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static notifySystemToScan(Ljava/io/File;)V
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileUtils;->notifySystemToScan(Ljava/io/File;)V

    return-void
.end method

.method public static parcelable2Bytes(Landroid/os/Parcelable;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->parcelable2Bytes(Landroid/os/Parcelable;)[B

    move-result-object p0

    return-object p0
.end method

.method public static preLoad()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Runnable;

    invoke-static {}, Lcom/blankj/utilcode/util/AdaptScreenUtils;->getPreLoadRunnable()Ljava/lang/Runnable;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/blankj/utilcode/util/UtilsBridge;->preLoad([Ljava/lang/Runnable;)V

    return-void
.end method

.method private static varargs preLoad([Ljava/lang/Runnable;)V
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    invoke-static {}, Lcom/blankj/utilcode/util/ThreadUtils;->getCachedPool()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static px2dp(F)I
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/SizeUtils;->px2dp(F)I

    move-result p0

    return p0
.end method

.method public static px2sp(F)I
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/SizeUtils;->px2sp(F)I

    move-result p0

    return p0
.end method

.method public static readFile2Bytes(Ljava/io/File;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/FileIOUtils;->readFile2BytesByChannel(Ljava/io/File;)[B

    move-result-object p0

    return-object p0
.end method

.method public static relaunchApp()V
    .locals 0

    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->relaunchApp()V

    return-void
.end method

.method public static removeActivityLifecycleCallbacks(Landroid/app/Activity;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->removeActivityLifecycleCallbacks(Landroid/app/Activity;)V

    return-void
.end method

.method public static removeActivityLifecycleCallbacks(Landroid/app/Activity;Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0, p1}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->removeActivityLifecycleCallbacks(Landroid/app/Activity;Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static removeActivityLifecycleCallbacks(Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->removeActivityLifecycleCallbacks(Lcom/blankj/utilcode/util/Utils$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public static removeOnAppStatusChangedListener(Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->removeOnAppStatusChangedListener(Lcom/blankj/utilcode/util/Utils$OnAppStatusChangedListener;)V

    return-void
.end method

.method public static runOnUiThread(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static runOnUiThreadDelayed(Ljava/lang/Runnable;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThreadDelayed(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static serializable2Bytes(Ljava/io/Serializable;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->serializable2Bytes(Ljava/io/Serializable;)[B

    move-result-object p0

    return-object p0
.end method

.method public static sp2px(F)I
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/SizeUtils;->sp2px(F)I

    move-result p0

    return p0
.end method

.method public static startHomeActivity()V
    .locals 0

    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->startHomeActivity()V

    return-void
.end method

.method public static string2Bytes(Ljava/lang/String;)[B
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ConvertUtils;->string2Bytes(Ljava/lang/String;)[B

    move-result-object p0

    return-object p0
.end method

.method public static toJson(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/GsonUtils;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static toastCancel()V
    .locals 0

    invoke-static {}, Lcom/blankj/utilcode/util/ToastUtils;->cancel()V

    return-void
.end method

.method public static toastShowShort(Ljava/lang/CharSequence;)V
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static unInit(Landroid/app/Application;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->INSTANCE:Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/UtilsActivityLifecycleImpl;->unInit(Landroid/app/Application;)V

    return-void
.end method

.method public static uri2File(Landroid/net/Uri;)Ljava/io/File;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/UriUtils;->uri2File(Landroid/net/Uri;)Ljava/io/File;

    move-result-object p0

    return-object p0
.end method

.method public static view2Bitmap(Landroid/view/View;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/ImageUtils;->view2Bitmap(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static writeFileFromBytes(Ljava/io/File;[B)Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByChannel(Ljava/io/File;[BZ)Z

    move-result p0

    return p0
.end method

.method public static writeFileFromIS(Ljava/lang/String;Ljava/io/InputStream;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromIS(Ljava/lang/String;Ljava/io/InputStream;)Z

    move-result p0

    return p0
.end method

.method public static writeFileFromString(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromString(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0
.end method
