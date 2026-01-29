.class public final Lk3/e;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lk3/e;->a:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 9

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    const/16 v4, 0x14

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v3, 0x3f0

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const-string v4, "com.binance.dev"

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "2131492869"

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v6, 0x7f0f0057

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v7

    invoke-static {p0, v7}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "openapp:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v7, Lcom/superbock/bean/AdInfo;

    invoke-direct {v7}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v4, :cond_1

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_1
    const/16 v4, 0x9

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v4, 0x7f0f0058

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v4, 0x7f0f000d

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    const-string v4, "0,0,0"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const-string v4, "240,185,11"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    if-ne v4, v2, :cond_2

    const v2, 0x7f0f0001

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    const-string v2, "128,128,128"

    invoke-virtual {v7, v2}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    const-wide/16 v4, 0x1388

    invoke-virtual {v1, v4, v5}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v2, Lcom/superbock/bean/AdInfo;

    invoke-direct {v2}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v7, v2}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "adInfo"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {p0, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 6

    invoke-static {p0}, Lk3/a;->a(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v0, v2, :cond_2

    invoke-static {p0}, Lk3/a;->e(Landroid/content/Context;)Landroid/app/ActivityManager$AppTask;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {}, Lg3/m;->a()Lg3/m;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, v0, Lg3/m;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v2

    const-string v3, "sta"

    invoke-virtual {v2, v3, v1}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-virtual {v2}, Lz2/k;->f()La3/e;

    move-result-object v2

    invoke-interface {v0, v2}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/superbock/bean/LInfo;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/superbock/bean/LInfo;->getTp()I

    move-result v2

    const/16 v3, 0x3e8

    if-le v2, v3, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0}, Lcom/superbock/bean/LInfo;->getSto()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/32 v4, 0x927c0

    cmp-long v0, v2, v4

    if-gez v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p0}, Landroid/app/ActivityManager$AppTask;->finishAndRemoveTask()V

    :cond_2
    return v1
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    const-string v0, ".png"

    const-string v1, "/"

    const-string v2, "/appicon"

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, p1, v5}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    if-eqz v4, :cond_3

    instance-of v6, v4, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x1a

    if-lt v6, v7, :cond_2

    instance-of v6, v4, Landroid/graphics/drawable/AdaptiveIconDrawable;

    if-eqz v6, :cond_2

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v6

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v7

    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v6, v7, v8}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v6

    new-instance v7, Landroid/graphics/Canvas;

    invoke-direct {v7, v6}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v7}, Landroid/graphics/Canvas;->getWidth()I

    move-result v8

    invoke-virtual {v7}, Landroid/graphics/Canvas;->getHeight()I

    move-result v9

    invoke-virtual {v4, v5, v5, v8, v9}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v4, v7}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_2
    check-cast v4, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v6

    :goto_0
    new-instance v4, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->createNewFile()Z

    new-instance p0, Ljava/io/FileOutputStream;

    invoke-direct {p0, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v0, 0x1e

    invoke-virtual {v6, p1, v0, p0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {p0}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {p0}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    :cond_3
    :goto_1
    return-object v3
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "zh"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "cn"

    goto :goto_0

    :cond_0
    sget-object v1, Le3/d;->e:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v0, "en"

    :cond_1
    :goto_0
    invoke-static {}, Lg3/p;->b()Lg3/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lg3/p;->a(Ljava/lang/String;)Lcom/superbock/bean/SysNews;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/superbock/bean/SysNews;->getTotal()I

    move-result p0

    add-int/2addr p0, v1

    invoke-virtual {v0, p0}, Lcom/superbock/bean/SysNews;->setTotal(I)V

    invoke-static {}, Lg3/p;->b()Lg3/p;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object p0, p0, Lg3/p;->a:Lt2/g;

    invoke-interface {p0, v0}, Lt2/g;->d(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Lcom/superbock/bean/SysNews;->getTitle()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0, v1}, Lk3/f;->j(Landroid/content/Context;Z)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "im.token.app"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v1, 0x8

    goto/16 :goto_2

    :sswitch_1
    const-string v0, "com.tronlinkpro.wallet"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x7

    goto :goto_2

    :sswitch_2
    const-string v0, "com.binance.dev"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x6

    goto :goto_2

    :sswitch_3
    const-string v0, "com.okinc.okex.gp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    :cond_6
    const/4 v1, 0x5

    goto :goto_2

    :sswitch_4
    const-string v0, "org.toshi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    const/4 v1, 0x4

    goto :goto_2

    :sswitch_5
    const-string v0, "com.tronlink.global"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_1

    :cond_8
    const/4 v1, 0x3

    goto :goto_2

    :sswitch_6
    const-string v0, "com.wallet.crypto.trustapp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_1

    :cond_9
    const/4 v1, 0x2

    goto :goto_2

    :sswitch_7
    const-string v0, "vip.mytokenpocket"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_1

    :sswitch_8
    const-string v0, "io.metamask"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto :goto_1

    :cond_a
    const/4 v1, 0x0

    goto :goto_2

    :goto_1
    const/4 v1, -0x1

    :cond_b
    :goto_2
    packed-switch v1, :pswitch_data_0

    const-string p0, ""

    goto :goto_4

    :pswitch_0
    const p1, 0x7f0f0088

    goto :goto_3

    :pswitch_1
    const p1, 0x7f0f0059

    goto :goto_3

    :pswitch_2
    const p1, 0x7f0f00e7

    goto :goto_3

    :pswitch_3
    const p1, 0x7f0f0117

    goto :goto_3

    :pswitch_4
    const p1, 0x7f0f0107

    goto :goto_3

    :pswitch_5
    const p1, 0x7f0f010e

    goto :goto_3

    :pswitch_6
    const p1, 0x7f0f0103

    goto :goto_3

    :pswitch_7
    const p1, 0x7f0f00bd

    :goto_3
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    :goto_4
    const-string p1, "\n"

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    array-length v0, p0

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    aget-object p0, p0, p1

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x78dd1dc7 -> :sswitch_8
        -0x5e04d46e -> :sswitch_7
        -0x4a33192 -> :sswitch_6
        0x46af8ad -> :sswitch_5
        0x29a9b8cf -> :sswitch_4
        0x30c0288f -> :sswitch_3
        0x4ba27410 -> :sswitch_2
        0x63467d7e -> :sswitch_1
        0x7accbc62 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method public static e(Landroid/content/Context;)V
    .locals 9

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    const/16 v4, 0x14

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v3, 0x3f1

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const-string v4, "com.okinc.okex.gp"

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "2131492882"

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v6, 0x7f0f00e5

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v7

    invoke-static {p0, v7}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "openapp:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v7, Lcom/superbock/bean/AdInfo;

    invoke-direct {v7}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v4, :cond_1

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_1
    const/16 v4, 0x9

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v4, 0x7f0f00e6

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v4, 0x7f0f0003

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    const-string v4, "0,0,0"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Lcom/superbock/bean/AdInfo;->setAlign(I)V

    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    if-ne v4, v2, :cond_2

    const v2, 0x7f0f0001

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    const-string v2, "128,128,128"

    invoke-virtual {v7, v2}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    const-wide/16 v4, 0x1388

    invoke-virtual {v1, v4, v5}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v2, Lcom/superbock/bean/AdInfo;

    invoke-direct {v2}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v4

    invoke-virtual {v2, v4}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v7, v2}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "adInfo"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {p0, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public static f(Landroid/content/Context;Lcom/superbock/bean/AdInfo;J)V
    .locals 4

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTemplate()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    const/4 v0, 0x0

    goto/16 :goto_0

    :pswitch_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsOkxActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsTronglobalActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsTronlinkActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_4
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsWalletActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_5
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_6
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsImActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_7
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_8
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/custom/InputWordsTrustActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_9
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_a
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdAlertBottomActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdConfirmBottomActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_0

    :pswitch_b
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdAlertActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdAlertOneButtonActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdConfirmActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :cond_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdConfirmOneButtonActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :pswitch_c
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdWebSmallActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :pswitch_d
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdWebActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :pswitch_e
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdFullscreenActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :pswitch_f
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdSingleSmallActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :pswitch_10
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdSingleActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_0

    :pswitch_11
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_0
    if-eqz v0, :cond_5

    const-string v1, "adInfo"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lk3/e$a;

    invoke-direct {v1, p0, v0}, Lk3/e$a;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    const-wide/16 v2, 0x0

    cmp-long p0, p2, v2

    if-lez p0, :cond_4

    goto :goto_1

    :cond_4
    const-wide/16 p2, 0x3e8

    :goto_1
    invoke-virtual {p1, v1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x3e9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static g(Landroid/content/Context;)V
    .locals 9

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    const/16 v4, 0x14

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v3, 0x3ef

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const-string v4, "com.tronlink.global"

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "2131165377"

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v6, 0x7f0f0108

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v7

    invoke-static {p0, v7}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "openapp:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v7, Lcom/superbock/bean/AdInfo;

    invoke-direct {v7}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v4, :cond_1

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_1
    const/16 v4, 0x9

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v4, 0x7f0f0086

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v4, 0x7f0f0010

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    const-string v4, "255,255,255"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const-string v4, "2,28,49"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    if-ne v4, v2, :cond_2

    const v4, 0x7f0f0001

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    const-string v4, "128,128,128"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    const-wide/16 v4, 0x1388

    invoke-virtual {v1, v4, v5}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v4, Lcom/superbock/bean/AdInfo;

    invoke-direct {v4}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v4, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    if-lt v0, v2, :cond_3

    invoke-virtual {v4, v2}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_3
    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "adInfo"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {p0, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method

.method public static h(Landroid/content/Context;)V
    .locals 9

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v3, Ljava/util/Random;

    invoke-direct {v3}, Ljava/util/Random;-><init>()V

    const/16 v4, 0x14

    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v3, 0x3ee

    invoke-virtual {v1, v3}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const-string v4, "com.tronlinkpro.wallet"

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "2131165378"

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v6, 0x7f0f0109

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v7

    invoke-static {p0, v7}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "openapp:"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v7, Lcom/superbock/bean/AdInfo;

    invoke-direct {v7}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v4, :cond_1

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_1
    const/16 v4, 0x9

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v4, 0x7f0f0086

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v4, 0x7f0f0010

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    const-string v4, "255,255,255"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const-string v4, "2,28,49"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v4, Ljava/util/Random;

    invoke-direct {v4}, Ljava/util/Random;-><init>()V

    invoke-virtual {v4, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    if-ne v4, v2, :cond_2

    const v4, 0x7f0f0001

    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    const-string v4, "128,128,128"

    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    const-wide/16 v4, 0x1388

    invoke-virtual {v1, v4, v5}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v4, Lcom/superbock/bean/AdInfo;

    invoke-direct {v4}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v4, v0}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v3, 0x3

    invoke-virtual {v0, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    if-lt v0, v2, :cond_3

    invoke-virtual {v4, v2}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_3
    invoke-virtual {v7, v4}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "adInfo"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {p0, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
