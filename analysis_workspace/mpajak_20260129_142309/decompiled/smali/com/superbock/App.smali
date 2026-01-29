.class public Lcom/superbock/App;
.super Landroid/app/Application;


# static fields
.field public static b:Lcom/superbock/App;

.field public static c:Z

.field public static d:Z

.field public static e:J

.field public static f:J

.field public static g:J

.field public static h:J

.field public static i:J

.field public static j:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method

.method public static a(Lcom/superbock/App;)V
    .locals 17

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    sget-boolean v0, Lcom/superbock/App;->d:Z

    if-eqz v0, :cond_0

    goto/16 :goto_9

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/superbock/App;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    :try_start_1
    sget-wide v3, Lcom/superbock/auto/BaseService;->W:J

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x2710

    cmp-long v9, v3, v5

    if-lez v9, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v9, Lcom/superbock/auto/BaseService;->W:J

    sub-long/2addr v3, v9

    cmp-long v9, v3, v7

    if-lez v9, :cond_1

    sget-object v3, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_1

    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/JInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v10

    sget-wide v11, Lcom/superbock/auto/BaseService;->W:J

    sget-object v13, Lcom/superbock/auto/BaseService;->V:Ljava/lang/String;

    const/4 v14, 0x0

    sget-object v15, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    sget-object v9, Lk3/f;->l:Ljava/util/HashMap;

    sget-object v7, Lcom/superbock/auto/BaseService;->V:Ljava/lang/String;

    invoke-virtual {v9, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object/from16 v16, v7

    check-cast v16, Ljava/lang/String;

    move-object v9, v4

    invoke-direct/range {v9 .. v16}, Lcom/superbock/bean/JInfo;-><init>(Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lg3/k;->a(Lcom/superbock/bean/JInfo;)V

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->U:Ljava/lang/String;

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->V:Ljava/lang/String;

    sput-wide v5, Lcom/superbock/auto/BaseService;->W:J

    :cond_1
    sget-wide v3, Lcom/superbock/auto/BaseService;->Z:J

    const-wide/16 v7, 0x4e20

    cmp-long v9, v3, v5

    if-lez v9, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v9, Lcom/superbock/auto/BaseService;->Z:J

    sub-long/2addr v3, v9

    cmp-long v9, v3, v7

    if-lez v9, :cond_2

    sget-object v3, Lcom/superbock/auto/BaseService;->a0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_2

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/KInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    sget-object v12, Lcom/superbock/auto/BaseService;->a0:Ljava/lang/String;

    const-string v13, "im.token.app"

    const v9, 0x7f0f008a

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Lcom/superbock/bean/KInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lg3/l;->a(Lcom/superbock/bean/KInfo;)V

    sget-object v3, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v3}, Lk3/f;->s(Landroid/content/Context;)V

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->a0:Ljava/lang/String;

    sput-wide v5, Lcom/superbock/auto/BaseService;->Z:J

    :cond_2
    sget-wide v3, Lcom/superbock/auto/BaseService;->b0:J

    cmp-long v9, v3, v5

    if-lez v9, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v9, Lcom/superbock/auto/BaseService;->b0:J

    sub-long/2addr v3, v9

    cmp-long v9, v3, v7

    if-lez v9, :cond_3

    sget-object v3, Lcom/superbock/auto/BaseService;->c0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/KInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    sget-object v12, Lcom/superbock/auto/BaseService;->c0:Ljava/lang/String;

    const-string v13, "vip.mytokenpocket"

    const v9, 0x7f0f00fd

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Lcom/superbock/bean/KInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lg3/l;->a(Lcom/superbock/bean/KInfo;)V

    sget-object v3, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v3}, Lk3/f;->s(Landroid/content/Context;)V

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->c0:Ljava/lang/String;

    sput-wide v5, Lcom/superbock/auto/BaseService;->b0:J

    :cond_3
    sget-wide v3, Lcom/superbock/auto/BaseService;->d0:J

    cmp-long v9, v3, v5

    if-lez v9, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v9, Lcom/superbock/auto/BaseService;->d0:J

    sub-long/2addr v3, v9

    cmp-long v9, v3, v7

    if-lez v9, :cond_4

    sget-object v3, Lcom/superbock/auto/BaseService;->e0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_4

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/KInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    sget-object v12, Lcom/superbock/auto/BaseService;->e0:Ljava/lang/String;

    const-string v13, "com.wallet.crypto.trustapp"

    const v9, 0x7f0f010f

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Lcom/superbock/bean/KInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lg3/l;->a(Lcom/superbock/bean/KInfo;)V

    sget-object v3, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v3}, Lk3/f;->s(Landroid/content/Context;)V

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->e0:Ljava/lang/String;

    sput-wide v5, Lcom/superbock/auto/BaseService;->d0:J

    :cond_4
    sget-wide v3, Lcom/superbock/auto/BaseService;->f0:J

    cmp-long v9, v3, v5

    if-lez v9, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v9, Lcom/superbock/auto/BaseService;->f0:J

    sub-long/2addr v3, v9

    cmp-long v9, v3, v7

    if-lez v9, :cond_5

    sget-object v3, Lcom/superbock/auto/BaseService;->g0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_5

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/KInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    sget-object v12, Lcom/superbock/auto/BaseService;->g0:Ljava/lang/String;

    const-string v13, "com.tronlinkpro.wallet"

    const v9, 0x7f0f0109

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Lcom/superbock/bean/KInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lg3/l;->a(Lcom/superbock/bean/KInfo;)V

    sget-object v3, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v3}, Lk3/f;->s(Landroid/content/Context;)V

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->g0:Ljava/lang/String;

    sput-wide v5, Lcom/superbock/auto/BaseService;->f0:J

    :cond_5
    sget-wide v3, Lcom/superbock/auto/BaseService;->h0:J

    cmp-long v9, v3, v5

    if-lez v9, :cond_6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v9, Lcom/superbock/auto/BaseService;->h0:J

    sub-long/2addr v3, v9

    cmp-long v9, v3, v7

    if-lez v9, :cond_6

    sget-object v3, Lcom/superbock/auto/BaseService;->i0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_6

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/KInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    sget-object v12, Lcom/superbock/auto/BaseService;->i0:Ljava/lang/String;

    const-string v13, "com.tronlink.global"

    const v9, 0x7f0f0108

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    move-object v9, v4

    invoke-direct/range {v9 .. v14}, Lcom/superbock/bean/KInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lg3/l;->a(Lcom/superbock/bean/KInfo;)V

    sget-object v3, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v3}, Lk3/f;->s(Landroid/content/Context;)V

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->i0:Ljava/lang/String;

    sput-wide v5, Lcom/superbock/auto/BaseService;->h0:J

    :cond_6
    sget-wide v3, Lcom/superbock/auto/BaseService;->j0:J

    cmp-long v9, v3, v5

    if-lez v9, :cond_7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sget-wide v9, Lcom/superbock/auto/BaseService;->j0:J

    sub-long/2addr v3, v9

    cmp-long v9, v3, v7

    if-lez v9, :cond_7

    sget-object v3, Lcom/superbock/auto/BaseService;->k0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/KInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    sget-object v10, Lcom/superbock/auto/BaseService;->k0:Ljava/lang/String;

    const-string v11, "io.metamask"

    const v7, 0x7f0f00be

    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/superbock/bean/KInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lg3/l;->a(Lcom/superbock/bean/KInfo;)V

    sget-object v3, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v3}, Lk3/f;->s(Landroid/content/Context;)V

    const-string v3, ""

    sput-object v3, Lcom/superbock/auto/BaseService;->k0:Ljava/lang/String;

    sput-wide v5, Lcom/superbock/auto/BaseService;->j0:J

    :cond_7
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    const-string v4, "savedDev"

    invoke-virtual {v3, v4, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v3

    if-nez v3, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcom/superbock/App;->e()V

    :cond_8
    sget-wide v3, Lcom/superbock/App;->h:J

    invoke-static/range {p0 .. p0}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result v7

    invoke-static {}, Lk3/d;->c()Z

    move-result v8

    invoke-static {}, Lf3/i;->b()Z

    move-result v9

    if-nez v9, :cond_a

    if-nez v7, :cond_a

    if-eqz v8, :cond_9

    const-wide/16 v3, 0x2710

    goto :goto_0

    :cond_9
    const-wide/16 v3, 0x7530

    :cond_a
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    sget-wide v11, Lcom/superbock/App;->e:J

    sub-long/2addr v9, v11

    cmp-long v11, v9, v3

    if-lez v11, :cond_b

    new-instance v3, Lf/e;

    invoke-direct {v3}, Lf/e;-><init>()V

    const-string v4, "action"

    const-string v9, "getAdInfo"

    invoke-virtual {v3, v4, v9}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "deviceId"

    invoke-static/range {p0 .. p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v4, v9}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "limit"

    const/16 v9, 0xf

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v3, v4, v9}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "lastTime"

    sget-wide v9, Lcom/superbock/App;->e:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v3, v4, v9}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Le3/b;

    invoke-direct {v4, v1}, Le3/b;-><init>(Lcom/superbock/App;)V

    invoke-static {v3, v4}, Lk3/i;->a(Lf/e;Ls3/e;)V

    :cond_b
    invoke-static {}, Lk/j0;->g()I

    move-result v3

    if-ne v3, v0, :cond_c

    invoke-static {}, Lk3/a;->j()Z

    move-result v3

    if-eqz v3, :cond_c

    goto/16 :goto_8

    :cond_c
    sget-boolean v3, Lcom/superbock/ui/StartupActivity;->g:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_d

    sget-wide v9, Lcom/superbock/ui/StartupActivity;->h:J

    cmp-long v3, v9, v5

    if-lez v3, :cond_19

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sget-wide v9, Lcom/superbock/ui/StartupActivity;->h:J

    sub-long/2addr v5, v9

    const-wide/32 v9, 0x927c0

    cmp-long v3, v5, v9

    if-lez v3, :cond_19

    :cond_d
    sget-boolean v3, Lcom/superbock/App;->c:Z

    if-nez v3, :cond_19

    if-nez v8, :cond_19

    if-nez v7, :cond_19

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget v3, v3, Landroid/content/res/Configuration;->orientation:I

    const/4 v5, 0x2

    if-eq v3, v5, :cond_19

    const-string v3, "power"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/PowerManager;

    invoke-virtual {v3}, Landroid/os/PowerManager;->isInteractive()Z

    move-result v3

    if-eqz v3, :cond_19

    invoke-static/range {p0 .. p0}, Lk3/e;->b(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_19

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sget-wide v7, Lcom/superbock/App;->f:J

    sub-long/2addr v5, v7

    sget-wide v7, Lcom/superbock/App;->i:J

    cmp-long v3, v5, v7

    if-lez v3, :cond_19

    invoke-static {}, Lg3/b;->c()Lg3/b;

    move-result-object v3

    invoke-virtual {v3}, Lg3/b;->b()Lcom/superbock/bean/AdInfo;

    move-result-object v3

    if-eqz v3, :cond_19

    invoke-static/range {p0 .. p0}, Lk3/a;->g(Landroid/content/Context;)Z

    move-result v5

    if-nez v5, :cond_e

    goto/16 :goto_5

    :cond_e
    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getTemplate()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    packed-switch v5, :pswitch_data_1

    move-object v5, v4

    goto/16 :goto_1

    :pswitch_0
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdAlertBottomActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :cond_f
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdConfirmBottomActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_11

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_10

    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdAlertActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :cond_10
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdAlertOneButtonActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :cond_11
    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_12

    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdConfirmActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :cond_12
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdConfirmOneButtonActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_3
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdWebSmallActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_4
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdWebActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_5
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdFullscreenActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_6
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdSingleSmallActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_7
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdSingleActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_8
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_9
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsOkxActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_a
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_b
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsTronglobalActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_c
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsTronlinkActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_d
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsWalletActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_e
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_f
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsImActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_10
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_11
    new-instance v5, Landroid/content/Intent;

    const-class v6, Lcom/superbock/ui/custom/InputWordsTrustActivity;

    invoke-direct {v5, v1, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_1
    if-eqz v5, :cond_18

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/superbock/bean/AdInfo;->setReceiptId(Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_14

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v6

    const-string v7, "?"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_13

    const-string v6, "&"

    goto :goto_2

    :cond_13
    const-string v6, "?"

    :goto_2
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "reid="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getReceiptId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    :cond_14
    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_16

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object v6

    const-string v7, "?"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_15

    const-string v6, "&"

    goto :goto_3

    :cond_15
    const-string v6, "?"

    :goto_3
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "reid="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getReceiptId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/superbock/bean/AdInfo;->setOtherLink(Ljava/lang/String;)V

    :cond_16
    const-string v4, "adInfo"

    invoke-virtual {v5, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    sget-boolean v3, Le3/d;->b:Z

    if-eqz v3, :cond_17

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v3, v4, :cond_17

    invoke-static/range {p0 .. p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_17

    goto :goto_4

    :cond_17
    const/4 v0, 0x0

    :goto_4
    invoke-static {v1, v5, v0}, Lk3/d;->f(Landroid/content/Context;Landroid/content/Intent;Z)V

    if-nez v0, :cond_1d

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Le3/c;

    invoke-direct {v3, v5}, Le3/c;-><init>(Landroid/content/Intent;)V

    const-wide/16 v4, 0x1388

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_8

    :cond_18
    invoke-static {}, Lg3/b;->c()Lg3/b;

    move-result-object v0

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lg3/b;->a(Ljava/lang/String;)V

    :cond_19
    :goto_5
    sget-wide v5, Lcom/superbock/App;->f:J

    sget-wide v7, Lcom/superbock/App;->g:J

    cmp-long v0, v5, v7

    if-lez v0, :cond_1c

    invoke-static {}, Lg3/b;->c()Lg3/b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, v0, Lg3/b;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v3

    invoke-virtual {v3}, Lz2/k;->g()Lz2/m;

    move-result-object v3

    const-string v5, "receiptId"

    new-instance v6, Lb3/c;

    invoke-virtual {v3, v5}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v5

    invoke-direct {v6, v5}, Lb3/c;-><init>(Lv2/g;)V

    invoke-virtual {v3, v6}, Lz2/m;->a(Lb3/b;)V

    invoke-virtual {v3}, Lz2/m;->j()Lz2/f;

    move-result-object v3

    invoke-interface {v0, v3}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v4
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_6

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_6
    if-eqz v4, :cond_1b

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1b

    invoke-static/range {p0 .. p0}, Lk3/a;->g(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto :goto_8

    :cond_1a
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1, v3, v2, v2}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    goto :goto_7

    :cond_1b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lcom/superbock/App;->g:J

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v3, "lastReceiptTime"

    sget-wide v4, Lcom/superbock/App;->g:J

    invoke-virtual {v0, v3, v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    :cond_1c
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0, v2}, Lk3/f;->j(Landroid/content/Context;Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    :cond_1d
    :goto_8
    :try_start_4
    sput-boolean v2, Lcom/superbock/App;->d:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_9
    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
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

    :pswitch_data_1
    .packed-switch 0x3e9
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
.end method

.method public static b(Lcom/superbock/App;Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-static {p0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz p1, :cond_3

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget p1, Le3/d;->a:I

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/16 v0, 0xe

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lk3/d;->b(Landroid/content/Context;I)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, Lk3/d;->b(Landroid/content/Context;I)V

    goto :goto_1

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "com.superbock.ui.StartupActivity"

    sget-object v1, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v1, p1, v0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->showIcon(Landroid/content/Context;Ljava/lang/String;)V

    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/superbock/App;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUSE_BA_ACTIVITY(Z)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUse_activity(Z)V

    invoke-virtual {v0, v2}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUse_notification(Z)V

    invoke-virtual {v0, v2}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUse_service(Z)V

    invoke-virtual {v0, v2}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUse_music(Z)V

    invoke-virtual {v0, v2}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUse_domaemon(Z)V

    invoke-virtual {v0, v2}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUse_thaw(Z)V

    invoke-virtual {v0, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUse_receiver(Z)V

    invoke-virtual {v0, p1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->isFgProcess(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->attach(Landroid/content/Context;)V

    :cond_0
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final c(Lcom/superbock/bean/AdInfo;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/superbock/bean/LInfo;

    invoke-direct {v0}, Lcom/superbock/bean/LInfo;-><init>()V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setTy(I)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/superbock/bean/LInfo;->setSta(J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/superbock/bean/LInfo;->setSto(J)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getFeedBack()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setFb(I)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setPk(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTemplate()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setTp(I)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setTt(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setMs(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getUse()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setUs(I)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getPreId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setPid(Ljava/lang/String;)V

    sget-object v1, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/superbock/bean/LInfo;->setNa(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/superbock/bean/LInfo;->setCid(I)V

    invoke-virtual {v0}, Lcom/superbock/bean/LInfo;->getTy()I

    move-result p1

    const/4 v1, 0x3

    if-lt p1, v1, :cond_1

    invoke-virtual {v0}, Lcom/superbock/bean/LInfo;->getSto()J

    :cond_1
    invoke-static {}, Lg3/m;->a()Lg3/m;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object p1, p1, Lg3/m;->a:Lt2/g;

    invoke-interface {p1, v0}, Lt2/g;->p(Ljava/lang/Object;)Lt2/g$a;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final d(Lcom/superbock/bean/AdInfo;ZZ)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/superbock/bean/AdInfo;->setStopTime(J)V

    invoke-static {}, Lg3/b;->c()Lg3/b;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object p2, p2, Lg3/b;->a:Lt2/g;

    invoke-interface {p2, p1}, Lt2/g;->p(Ljava/lang/Object;)Lt2/g$a;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    const/4 p2, 0x0

    sput-boolean p2, Lcom/superbock/App;->c:Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/superbock/App;->f:J

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p2

    sget-wide v0, Lcom/superbock/App;->f:J

    const-string v2, "lastPopupTime"

    invoke-virtual {p2, v2, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    if-eqz p3, :cond_1

    return-void

    :cond_1
    new-instance p2, Lf/e;

    invoke-direct {p2}, Lf/e;-><init>()V

    const-string p3, "action"

    const-string v0, "saveReceipt"

    invoke-virtual {p2, p3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "deviceId"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object p3

    const-string v0, "taskId"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTemplateId()Ljava/lang/String;

    move-result-object p3

    const-string v0, "templateId"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getReceiptId()Ljava/lang/String;

    move-result-object p3

    const-string v0, "receiptId"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getStartTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    const-string v0, "showTime"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getStopTime()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getStartTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    const-string v0, "duration"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getFeedBack()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string v0, "feedBack"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getHide()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string v0, "hide"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    const-string v0, "type"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getUrl()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getUrl()Ljava/lang/String;

    move-result-object p3

    const-string v0, "link"

    invoke-virtual {p2, v0, p3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance p3, Lcom/superbock/App$e;

    invoke-direct {p3, p1}, Lcom/superbock/App$e;-><init>(Lcom/superbock/bean/AdInfo;)V

    invoke-static {p2, p3}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method

.method public final e()V
    .locals 9

    const-string v0, ""

    new-instance v1, Lf/e;

    invoke-direct {v1}, Lf/e;-><init>()V

    const-string v2, "action"

    const-string v3, "saveDev"

    invoke-virtual {v1, v2, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "step"

    invoke-virtual {v1, v4, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "deviceId"

    invoke-virtual {v1, v4, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v3, v0

    :goto_0
    const-string v5, "version"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    const/4 v3, 0x0

    :goto_1
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "vercode"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "vertype"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "launcher"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "iconStatus"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-wide v5, Lcom/superbock/App;->j:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v5, "installTime"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "appName"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "channel"

    const-string v5, "default"

    invoke-virtual {v1, v3, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    const-string v5, "zh"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "tw"

    if-eqz v5, :cond_1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "hk"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    const-string v7, "mo"

    invoke-virtual {v7, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    :cond_0
    move-object v3, v6

    :cond_1
    const-string v5, "lang"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/h;->b(Landroid/content/Context;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "width"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/h;->a(Landroid/content/Context;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "height"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v5, "model"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v5, "manf"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v5, "release"

    invoke-virtual {v1, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "sdk"

    invoke-virtual {v1, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v6

    const-string v7, "ip"

    invoke-virtual {v6, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_2

    invoke-virtual {v1, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v6

    const-string v7, "area"

    invoke-virtual {v6, v7}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_3

    invoke-virtual {v1, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget v6, Le3/d;->a:I

    if-ne v6, v2, :cond_4

    invoke-static {}, Lk3/a;->h()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {}, Lk3/a;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u9e3f\u8499"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v5, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    const/16 v0, 0x17

    if-lt v3, v0, :cond_7

    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/4 v5, 0x1

    goto :goto_2

    :cond_5
    sget-boolean v5, Le3/d;->b:Z

    if-eqz v5, :cond_6

    const/4 v5, 0x2

    goto :goto_2

    :cond_6
    const/4 v5, 0x0

    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "overlay"

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v5

    const-string v6, "launch"

    invoke-virtual {v5, v6, v2}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v5

    const-string v6, "autoStart"

    invoke-virtual {v5, v6, v4}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v5

    const-string v6, "enter"

    invoke-virtual {v5, v6, v4}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x20

    if-le v3, v5, :cond_8

    const-string v5, "android.permission.READ_MEDIA_IMAGES"

    invoke-static {p0, v5}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_9

    goto :goto_3

    :cond_8
    const-string v5, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, v5}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_9

    :goto_3
    const/4 v5, 0x1

    goto :goto_4

    :cond_9
    const/4 v5, 0x0

    :goto_4
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "readImages"

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "android.permission.READ_CONTACTS"

    invoke-static {p0, v5}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_a

    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    const/4 v5, 0x0

    :goto_5
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "readContacts"

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "android.permission.READ_SMS"

    invoke-static {p0, v5}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_b

    const/4 v5, 0x1

    goto :goto_6

    :cond_b
    const/4 v5, 0x0

    :goto_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "readSms"

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "android.permission.READ_CALL_LOG"

    invoke-static {p0, v5}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v5

    if-nez v5, :cond_c

    const/4 v5, 0x1

    goto :goto_7

    :cond_c
    const/4 v5, 0x0

    :goto_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "readCallLog"

    invoke-virtual {v1, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    if-lt v3, v0, :cond_d

    invoke-static {p0}, Lk3/a;->f(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "accessibility"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "battery"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_d
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_e

    const/4 v0, 0x1

    goto :goto_8

    :cond_e
    const/4 v0, 0x0

    :goto_8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "writeFile"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.CAMERA"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_f

    const/4 v0, 0x1

    goto :goto_9

    :cond_f
    const/4 v0, 0x0

    :goto_9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "camera"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_10

    const/4 v0, 0x1

    goto :goto_a

    :cond_10
    const/4 v0, 0x0

    :goto_a
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "recordAudio"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_11

    const/4 v0, 0x1

    goto :goto_b

    :cond_11
    const/4 v0, 0x0

    :goto_b
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "location"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.SEND_SMS"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_12

    const/4 v0, 0x1

    goto :goto_c

    :cond_12
    const/4 v0, 0x0

    :goto_c
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "sendSms"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.GET_ACCOUNTS"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_13

    const/4 v0, 0x1

    goto :goto_d

    :cond_13
    const/4 v0, 0x0

    :goto_d
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v3, "getAccounts"

    invoke-virtual {v1, v3, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.CALL_PHONE"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_14

    goto :goto_e

    :cond_14
    const/4 v2, 0x0

    :goto_e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "callPhone"

    invoke-virtual {v1, v2, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "notification"

    invoke-virtual {v1, v2, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/superbock/App$d;

    invoke-direct {v0}, Lcom/superbock/App$d;-><init>()V

    invoke-static {v1, v0}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method

.method public final f()V
    .locals 4

    invoke-static {p0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v0

    sput-boolean v0, Lcom/superbock/auto/BaseService;->X:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lk3/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    sput-object v1, Lcom/superbock/auto/BaseService;->Y:Ljava/lang/String;

    invoke-static {v0}, Lf3/i;->h(Z)V

    new-instance v1, Lf/e;

    invoke-direct {v1}, Lf/e;-><init>()V

    const-string v2, "action"

    const-string v3, "updateIcon"

    invoke-virtual {v1, v2, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "deviceId"

    invoke-virtual {v1, v3, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "iconStatus"

    invoke-virtual {v1, v2, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/superbock/App$f;

    invoke-direct {v0}, Lcom/superbock/App$f;-><init>()V

    invoke-static {v1, v0}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method

.method public final onCreate()V
    .locals 15

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v1, v0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->isFgProcess(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sput-object p0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-wide v4, v0, Landroid/content/pm/PackageInfo;->firstInstallTime:J
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v4, v1

    :goto_0
    sput-wide v4, Lcom/superbock/App;->j:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v4, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    const/4 v5, 0x1

    invoke-virtual {v4, v5, v0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setIsHideActivityTaskWhenHome(ZLjava/util/ArrayList;)V

    invoke-virtual {v4, v5}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setProhibitScreenshots(Z)V

    invoke-virtual {v4, v3}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->setUSE_ShowWhenLocked(Z)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v4, v0, v3}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->init(Landroid/content/Context;Z)V

    invoke-virtual {v4, p0}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->isMainProcess(Landroid/content/Context;)Z

    move-result v0

    const/4 v4, 0x0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v6, "lastGetTime"

    invoke-virtual {v0, v6, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sput-wide v6, Lcom/superbock/App;->e:J

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v6, "lastPopupTime"

    invoke-virtual {v0, v6, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sput-wide v6, Lcom/superbock/App;->f:J

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v6, "lastReceiptTime"

    invoke-virtual {v0, v6, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sput-wide v6, Lcom/superbock/App;->g:J

    invoke-static {}, Lg3/m;->a()Lg3/m;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v6, v0, Lg3/m;->a:Lt2/g;

    invoke-interface {v6}, Lt2/g;->c()Lz2/h;

    move-result-object v6

    const-string v7, "sta"

    invoke-virtual {v6, v7, v3}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-virtual {v6}, Lz2/k;->g()Lz2/m;

    move-result-object v7

    const/4 v8, 0x3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v7, v8}, Lz2/m;->e(Ljava/lang/Object;)Lz2/m;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v7}, Lz2/m;->b()Lz2/m;

    const-string v8, "pk"

    invoke-virtual {v7, v8, v4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_1
    iput-object v7, v6, Lz2/k;->g:Lz2/m;

    iget-object v0, v0, Lg3/m;->a:Lt2/g;

    invoke-virtual {v6}, Lz2/k;->f()La3/e;

    move-result-object v6

    invoke-interface {v0, v6}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/superbock/bean/LInfo;
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v4, v0

    goto :goto_1

    :catch_1
    nop

    :goto_1
    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lcom/superbock/bean/LInfo;->getSto()J

    :goto_2
    invoke-static {}, Lk/j0;->h()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v6, v0

    const-wide/16 v8, 0x3e8

    mul-long v6, v6, v8

    sput-wide v6, Lcom/superbock/App;->h:J

    invoke-static {}, Lk/j0;->j()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v6, v0

    mul-long v6, v6, v8

    sput-wide v6, Lcom/superbock/App;->i:J

    invoke-static {v5}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v8

    new-instance v9, Lcom/superbock/App$a;

    invoke-direct {v9, p0}, Lcom/superbock/App$a;-><init>(Lcom/superbock/App;)V

    const-wide/16 v10, 0x1e

    const-wide/16 v12, 0x1e

    sget-object v14, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface/range {v8 .. v14}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    :cond_3
    new-instance v0, Ljava/lang/Thread;

    new-instance v4, Lcom/superbock/App$b;

    invoke-direct {v4}, Lcom/superbock/App$b;-><init>()V

    invoke-direct {v0, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    const-class v0, Lk3/c;

    monitor-enter v0

    :try_start_2
    sget-boolean v4, Lk3/c;->a:Z

    if-eqz v4, :cond_4

    goto :goto_3

    :cond_4
    sput-boolean v5, Lk3/c;->a:Z

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v6, "https://api.ip.sb/geoip/"

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "https://api.ip2location.io/"

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "https://ipapi.co/json"

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "https://api.db-ip.com/v2/free/self"

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "https://ipwhois.app/json/?format=json"

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "https://api.ipbase.com/v1/json"

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "https://api.ipquery.io/?format=json"

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v4}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    invoke-static {v4}, Lk3/c;->a(Ljava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit v0

    const-string v0, ""

    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    const-string v6, "action"

    const-string v7, "saveDev"

    invoke-virtual {v4, v6, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "step"

    invoke-virtual {v4, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "deviceId"

    invoke-virtual {v4, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    :try_start_3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    iget-object v6, v6, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_4

    :catch_2
    move-object v6, v0

    :goto_4
    const-string v7, "version"

    invoke-virtual {v4, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v6

    iget v6, v6, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_5

    :catch_3
    const/4 v6, 0x0

    :goto_5
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "vercode"

    invoke-virtual {v4, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "vertype"

    invoke-virtual {v4, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v7, "launcher"

    invoke-virtual {v4, v7, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v6

    sget v7, Le3/d;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v8, "iconStatus"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-wide v8, Lcom/superbock/App;->j:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v8, "installTime"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "appName"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "channel"

    const-string v8, "default"

    invoke-virtual {v4, v6, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v6

    const-string v8, "zh"

    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "tw"

    if-eqz v8, :cond_6

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "hk"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "mo"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    :cond_5
    move-object v6, v9

    :cond_6
    const-string v8, "lang"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/h;->b(Landroid/content/Context;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v8, "width"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/h;->a(Landroid/content/Context;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const-string v8, "height"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v8, "model"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v8, "manf"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v6, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v8, "release"

    invoke-virtual {v4, v8, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const-string v10, "sdk"

    invoke-virtual {v4, v10, v9}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v9

    const-string v10, "ip"

    invoke-virtual {v9, v10}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_7

    invoke-virtual {v4, v10, v9}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v9

    const-string v10, "area"

    invoke-virtual {v9, v10}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v11

    if-lez v11, :cond_8

    invoke-virtual {v4, v10, v9}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_8
    if-ne v7, v5, :cond_9

    invoke-static {}, Lk3/a;->h()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-static {}, Lk3/a;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "\u9e3f\u8499"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v8, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v9, "startupTime"

    invoke-virtual {v0, v9, v7, v8}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v9, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v0, 0x17

    const/4 v7, 0x2

    if-lt v6, v0, :cond_c

    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/4 v8, 0x1

    goto :goto_6

    :cond_a
    sget-boolean v8, Le3/d;->b:Z

    if-eqz v8, :cond_b

    const/4 v8, 0x2

    goto :goto_6

    :cond_b
    const/4 v8, 0x0

    :goto_6
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "overlay"

    invoke-virtual {v4, v9, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v8

    const-string v9, "launch"

    invoke-virtual {v8, v9, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v8

    add-int/2addr v8, v5

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v10

    invoke-virtual {v10, v9, v8}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    if-le v8, v5, :cond_d

    const/4 v7, 0x1

    :cond_d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v9, "startUp"

    invoke-virtual {v4, v9, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v7

    const-string v9, "autoStart"

    invoke-virtual {v7, v9, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v7

    if-le v8, v5, :cond_e

    add-int/lit8 v7, v7, 0x1

    :cond_e
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v8

    invoke-virtual {v8, v9, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v9, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v7

    const-string v8, "enter"

    invoke-virtual {v7, v8, v3}, Lcom/blankj/utilcode/util/SPUtils;->getInt(Ljava/lang/String;I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v8, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v7, 0x20

    const-string v8, "readImages"

    if-le v6, v7, :cond_f

    const-string v7, "android.permission.READ_MEDIA_IMAGES"

    invoke-static {p0, v7}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_10

    goto :goto_7

    :cond_f
    const-string v7, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, v7}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_10

    :goto_7
    const/4 v7, 0x1

    goto :goto_8

    :cond_10
    const/4 v7, 0x0

    :goto_8
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v8, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "android.permission.READ_CONTACTS"

    invoke-static {p0, v7}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_11

    const/4 v7, 0x1

    goto :goto_9

    :cond_11
    const/4 v7, 0x0

    :goto_9
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "readContacts"

    invoke-virtual {v4, v8, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "android.permission.READ_SMS"

    invoke-static {p0, v7}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_12

    const/4 v7, 0x1

    goto :goto_a

    :cond_12
    const/4 v7, 0x0

    :goto_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "readSms"

    invoke-virtual {v4, v8, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "android.permission.READ_CALL_LOG"

    invoke-static {p0, v7}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_13

    const/4 v7, 0x1

    goto :goto_b

    :cond_13
    const/4 v7, 0x0

    :goto_b
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "readCallLog"

    invoke-virtual {v4, v8, v7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    if-lt v6, v0, :cond_14

    invoke-static {p0}, Lk3/a;->f(Landroid/content/Context;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "accessibility"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "power"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "battery"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_15

    const/4 v0, 0x1

    goto :goto_c

    :cond_15
    const/4 v0, 0x0

    :goto_c
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "writeFile"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.CAMERA"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_16

    const/4 v0, 0x1

    goto :goto_d

    :cond_16
    const/4 v0, 0x0

    :goto_d
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "camera"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_17

    const/4 v0, 0x1

    goto :goto_e

    :cond_17
    const/4 v0, 0x0

    :goto_e
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "recordAudio"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_18

    const/4 v0, 0x1

    goto :goto_f

    :cond_18
    const/4 v0, 0x0

    :goto_f
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "location"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.SEND_SMS"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_19

    const/4 v0, 0x1

    goto :goto_10

    :cond_19
    const/4 v0, 0x0

    :goto_10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "sendSms"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.GET_ACCOUNTS"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1a

    const/4 v0, 0x1

    goto :goto_11

    :cond_1a
    const/4 v0, 0x0

    :goto_11
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v6, "getAccounts"

    invoke-virtual {v4, v6, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "android.permission.CALL_PHONE"

    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1b

    goto :goto_12

    :cond_1b
    const/4 v5, 0x0

    :goto_12
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v5, "callPhone"

    invoke-virtual {v4, v5, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v5, "notification"

    invoke-virtual {v4, v5, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Le3/a;

    invoke-direct {v0}, Le3/a;-><init>()V

    invoke-static {v4, v0}, Lk3/i;->a(Lf/e;Ls3/e;)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v4, Lcom/superbock/App$c;

    invoke-direct {v4, p0}, Lcom/superbock/App$c;-><init>(Lcom/superbock/App;)V

    invoke-direct {v0, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v4, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v4, "android.intent.action.SCREEN_ON"

    invoke-virtual {v0, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v4, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v4}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v4, Lcom/superbock/ScreenBroadcastReceiver;

    invoke-direct {v4}, Lcom/superbock/ScreenBroadcastReceiver;-><init>()V

    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const-string v0, "ti"

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "lastCleanTime"

    invoke-virtual {v4, v5, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    cmp-long v4, v6, v1

    if-lez v4, :cond_1c

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v6

    const-wide/32 v6, 0x5265c00

    cmp-long v4, v1, v6

    if-gez v4, :cond_1c

    goto/16 :goto_13

    :cond_1c
    :try_start_5
    invoke-static {}, Lg3/g;->a()Lg3/g;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-wide/32 v8, 0x240c8400

    sub-long/2addr v6, v8

    iget-object v2, v1, Lg3/g;->a:Lt2/g;

    invoke-interface {v2}, Lt2/g;->h()Lz2/c;

    move-result-object v2

    invoke-virtual {v2}, Lz2/k;->g()Lz2/m;

    move-result-object v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v4, v0, v6}, Lz2/m;->i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    iget-object v1, v1, Lg3/g;->a:Lt2/g;

    invoke-virtual {v2}, Lz2/k;->f()La3/e;

    move-result-object v2

    invoke-interface {v1, v2}, Lt2/g;->m(Lz2/e;)I

    invoke-static {}, Lg3/i;->a()Lg3/i;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const-wide v10, 0x9fa52400L

    sub-long/2addr v6, v10

    iget-object v2, v1, Lg3/i;->a:Lt2/g;

    invoke-interface {v2}, Lt2/g;->h()Lz2/c;

    move-result-object v2

    invoke-virtual {v2}, Lz2/k;->g()Lz2/m;

    move-result-object v4

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v4, v0, v6}, Lz2/m;->i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v4}, Lz2/m;->b()Lz2/m;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v6, "pa"

    invoke-virtual {v4, v6, v3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    iget-object v1, v1, Lg3/i;->a:Lt2/g;

    invoke-virtual {v2}, Lz2/k;->f()La3/e;

    move-result-object v2

    invoke-interface {v1, v2}, Lt2/g;->m(Lz2/e;)I

    invoke-static {}, Lg3/j;->a()Lg3/j;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v8

    iget-object v4, v1, Lg3/j;->b:Ljava/lang/Object;

    check-cast v4, Lt2/g;

    invoke-interface {v4}, Lt2/g;->h()Lz2/c;

    move-result-object v4

    invoke-virtual {v4}, Lz2/k;->g()Lz2/m;

    move-result-object v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v6, v0, v2}, Lz2/m;->i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    iget-object v0, v1, Lg3/j;->b:Ljava/lang/Object;

    check-cast v0, Lt2/g;

    invoke-virtual {v4}, Lz2/k;->f()La3/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lt2/g;->m(Lz2/e;)I

    invoke-static {}, Lg3/p;->b()Lg3/p;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v8

    iget-object v3, v0, Lg3/p;->a:Lt2/g;

    invoke-interface {v3}, Lt2/g;->h()Lz2/c;

    move-result-object v3

    invoke-virtual {v3}, Lz2/k;->g()Lz2/m;

    move-result-object v4

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "pubDate"

    invoke-virtual {v4, v2, v1}, Lz2/m;->i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    iget-object v0, v0, Lg3/p;->a:Lt2/g;

    invoke-virtual {v3}, Lz2/k;->f()La3/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lt2/g;->m(Lz2/e;)I

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v5, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V
    :try_end_5
    .catch Ljava/sql/SQLException; {:try_start_5 .. :try_end_5} :catch_4

    :catch_4
    :goto_13
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
