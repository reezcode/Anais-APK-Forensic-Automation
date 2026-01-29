.class public Lcom/superbock/ScreenBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 8

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    new-instance p2, Lcom/superbock/bean/FInfo;

    invoke-direct {p2}, Lcom/superbock/bean/FInfo;-><init>()V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/superbock/bean/FInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {p2, v2}, Lcom/superbock/bean/FInfo;->setAc(I)V

    goto :goto_0

    :cond_0
    const-string v0, "android.intent.action.SCREEN_ON"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Lcom/superbock/bean/FInfo;

    invoke-direct {p2}, Lcom/superbock/bean/FInfo;-><init>()V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/superbock/bean/FInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Lcom/superbock/bean/FInfo;->setAc(I)V

    goto :goto_0

    :cond_1
    const-string v0, "android.intent.action.USER_PRESENT"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/superbock/bean/FInfo;

    invoke-direct {p2}, Lcom/superbock/bean/FInfo;-><init>()V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/superbock/bean/FInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Lcom/superbock/bean/FInfo;->setAc(I)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v4, Le3/e;

    invoke-direct {v4}, Le3/e;-><init>()V

    const-wide/16 v5, 0x7d0

    invoke-virtual {v0, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p2, v4, v5}, Lcom/superbock/bean/FInfo;->setTi(J)V

    invoke-static {}, Lg3/g;->a()Lg3/g;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, v0, Lg3/g;->a:Lt2/g;

    invoke-interface {v0, p2}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    invoke-virtual {p2}, Lcom/superbock/bean/FInfo;->getAc()I

    move-result v0

    const-string v4, "lock"

    const-wide/16 v5, 0x0

    const-string v7, "lockTime"

    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_3

    if-eq v0, v1, :cond_4

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v4, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v7}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long p1, v0, v5

    if-gtz p1, :cond_6

    goto :goto_2

    :cond_4
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v4, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v7, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-static {v2, v5, v6}, Lf3/i;->j(IJ)V

    goto :goto_3

    :cond_5
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v4, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v7}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    cmp-long p1, v0, v5

    if-gtz p1, :cond_6

    :goto_2
    invoke-virtual {p2}, Lcom/superbock/bean/FInfo;->getTi()J

    move-result-wide v0

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    invoke-virtual {p1, v7, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    :cond_6
    invoke-static {v3, v0, v1}, Lf3/i;->j(IJ)V

    :cond_7
    :goto_3
    return-void
.end method
