.class public final Le3/a;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 17
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ls3/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "customInstallTimes"

    const-string v1, "customSingleTimes"

    const-string v2, "customGlobalTimes"

    const-string v3, "customMaxTimes"

    const-string v4, "customMode"

    const-string v5, "customAuto"

    const-string v6, "cnDisable"

    const-string v7, "popupTimes"

    const-string v8, "heartTimes"

    const-string v9, "installHide"

    const-string v10, "topbar"

    const-string v11, "md5Key"

    const-string v12, "thumbSnap "

    const-string v13, "uploadImages"

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ls3/b0;->b()Z

    move-result v14

    if-eqz v14, :cond_12

    move-object/from16 v14, p2

    iget-object v14, v14, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {v14}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object v14

    sget-object v15, Lk3/i;->a:[B

    invoke-static {v14, v15}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object v14

    if-eqz v14, :cond_12

    const-string v15, "code"

    invoke-virtual {v14, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v15

    move-object/from16 p1, v0

    const/4 v0, 0x1

    if-ne v15, v0, :cond_12

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v15

    move-object/from16 v16, v1

    const-string v1, "savedDev"

    invoke-virtual {v15, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    const-string v1, "data"

    invoke-virtual {v14, v1}, Lf/e;->A(Ljava/lang/String;)Lf/e;

    move-result-object v1

    const-string v14, "appDomain"

    invoke-virtual {v1, v14}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lk/j0;->p(Ljava/lang/String;)V

    const-string v14, "webSite"

    invoke-virtual {v1, v14}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lk/j0;->C(Ljava/lang/String;)V

    invoke-virtual {v1, v10}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    invoke-virtual {v1, v10}, Lf/e;->z(Ljava/lang/String;)I

    move-result v10

    invoke-static {v10}, Lk/j0;->B(I)V

    :cond_0
    invoke-virtual {v1, v9}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Lf/e;->z(Ljava/lang/String;)I

    move-result v9

    invoke-static {v9}, Lk/j0;->z(I)V

    :cond_1
    invoke-virtual {v1, v8}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    const-wide/16 v14, 0x3e8

    if-eqz v9, :cond_2

    invoke-virtual {v1, v8}, Lf/e;->z(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Lk/j0;->x(I)V

    invoke-static {}, Lk/j0;->h()I

    move-result v8

    mul-int/lit8 v8, v8, 0x3c

    int-to-long v8, v8

    mul-long v8, v8, v14

    sput-wide v8, Lcom/superbock/App;->h:J

    :cond_2
    invoke-virtual {v1, v7}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v1, v7}, Lf/e;->z(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Lk/j0;->A(I)V

    invoke-static {}, Lk/j0;->j()I

    move-result v7

    mul-int/lit8 v7, v7, 0x3c

    int-to-long v7, v7

    mul-long v7, v7, v14

    sput-wide v7, Lcom/superbock/App;->i:J

    :cond_3
    invoke-virtual {v1, v13}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v1, v13}, Lf/e;->z(Ljava/lang/String;)I

    move-result v7

    const/4 v8, -0x1

    if-le v7, v8, :cond_4

    sput v7, Lk/j0;->n:I

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v7

    sget v8, Lk/j0;->n:I

    invoke-virtual {v7, v13, v8}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    :cond_4
    invoke-virtual {v1, v12}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v1, v12}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_5

    sput-object v7, Lk/j0;->i:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v7

    sget-object v8, Lk/j0;->i:Ljava/lang/String;

    invoke-virtual {v7, v12, v8}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v1, v11}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v7

    invoke-virtual {v1, v11}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v11, v8}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v1, v6}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v1, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v6

    invoke-static {v6}, Lk/j0;->q(I)V

    :cond_7
    invoke-virtual {v1, v5}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v1, v5}, Lf/e;->z(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Lk/j0;->r(I)V

    :cond_8
    invoke-virtual {v1, v4}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v1, v4}, Lf/e;->z(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Lk/j0;->v(I)V

    :cond_9
    invoke-virtual {v1, v3}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v1, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Lk/j0;->u(I)V

    :cond_a
    invoke-virtual {v1, v2}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lk/j0;->s(I)V

    :cond_b
    move-object/from16 v2, v16

    invoke-virtual {v1, v2}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lk/j0;->w(I)V

    :cond_c
    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lk/j0;->t(I)V

    :cond_d
    const-string v2, "isInsert"

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    if-ne v2, v0, :cond_10

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v2

    invoke-virtual {v2}, Lg3/a;->c()V

    invoke-static {}, Lg3/c;->a()Lg3/c;

    move-result-object v2

    iget-object v3, v2, Lg3/c;->a:Lt2/g;

    invoke-interface {v3}, Lt2/g;->c()Lz2/h;

    move-result-object v4

    invoke-virtual {v4}, Lz2/k;->f()La3/e;

    move-result-object v4

    invoke-interface {v3, v4}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_e

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_e

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/superbock/bean/BInfo;

    invoke-virtual {v5, v4}, Lcom/superbock/bean/BInfo;->setUp(I)V

    iget-object v6, v2, Lg3/c;->a:Lt2/g;

    invoke-interface {v6, v5}, Lt2/g;->d(Ljava/lang/Object;)I

    goto :goto_0

    :cond_e
    invoke-static {}, Lg3/d;->a()Lg3/d;

    move-result-object v2

    invoke-virtual {v2}, Lg3/d;->b()V

    invoke-static {}, Lg3/e;->a()Lg3/e;

    move-result-object v2

    iget-object v3, v2, Lg3/e;->a:Lt2/g;

    invoke-interface {v3}, Lt2/g;->c()Lz2/h;

    move-result-object v5

    invoke-virtual {v5}, Lz2/k;->f()La3/e;

    move-result-object v5

    invoke-interface {v3, v5}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/superbock/bean/DInfo;

    invoke-virtual {v5, v4}, Lcom/superbock/bean/DInfo;->setUp(I)V

    iget-object v6, v2, Lg3/e;->a:Lt2/g;

    invoke-interface {v6, v5}, Lt2/g;->d(Ljava/lang/Object;)I

    goto :goto_1

    :cond_f
    invoke-static {}, Lg3/f;->a()Lg3/f;

    move-result-object v2

    invoke-virtual {v2}, Lg3/f;->c()V

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v2

    iget-object v3, v2, Lg3/l;->a:Lt2/g;

    invoke-interface {v3}, Lt2/g;->c()Lz2/h;

    move-result-object v5

    invoke-virtual {v5}, Lz2/k;->f()La3/e;

    move-result-object v5

    invoke-interface {v3, v5}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_10

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/superbock/bean/KInfo;

    invoke-virtual {v5, v4}, Lcom/superbock/bean/KInfo;->setUp(I)V

    iget-object v6, v2, Lg3/l;->a:Lt2/g;

    invoke-interface {v6, v5}, Lt2/g;->d(Ljava/lang/Object;)I

    goto :goto_2

    :cond_10
    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Le3/a$b;

    invoke-direct {v3}, Le3/a$b;-><init>()V

    const-wide/16 v4, 0x5dc

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "lastCtrlTime"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    const-string v6, "ctrlCmd"

    invoke-virtual {v1, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    if-eq v1, v0, :cond_11

    cmp-long v0, v2, v4

    if-lez v0, :cond_12

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x1d4c0

    cmp-long v4, v0, v2

    if-gez v4, :cond_12

    :cond_11
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Le3/a$c;

    invoke-direct {v1}, Le3/a$c;-><init>()V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_12
    return-void
.end method

.method public final b(Ls3/d;Ljava/io/IOException;)V
    .locals 2
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object p1, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {p1}, Lk3/a;->g(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lk/j0;->o()V

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance p2, Le3/a$a;

    invoke-direct {p2}, Le3/a$a;-><init>()V

    const-wide/16 v0, 0x5dc

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
