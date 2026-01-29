.class public final Le3/b;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# instance fields
.field public final synthetic a:Lcom/superbock/App;


# direct methods
.method public constructor <init>(Lcom/superbock/App;)V
    .locals 0

    iput-object p1, p0, Le3/b;->a:Lcom/superbock/App;

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

    move-object/from16 v1, p0

    const-string v0, "adInfo"

    const-string v2, "customInstallTimes"

    const-string v3, "customSingleTimes"

    const-string v4, "customGlobalTimes"

    const-string v5, "customMaxTimes"

    const-string v6, "customMode"

    const-string v7, "customAuto"

    const-string v8, "cnDisable"

    const-string v9, "popupTimes"

    const-string v10, "heartTimes"

    const-string v11, "md5Key"

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ls3/b0;->b()Z

    move-result v12

    if-eqz v12, :cond_e

    move-object/from16 v12, p2

    iget-object v12, v12, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {v12}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object v12

    sget-object v13, Lk3/i;->a:[B

    invoke-static {v12, v13}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object v12

    if-eqz v12, :cond_e

    const-string v13, "code"

    invoke-virtual {v12, v13}, Lf/e;->z(Ljava/lang/String;)I

    move-result v13

    const/4 v14, 0x1

    if-ne v13, v14, :cond_e

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v15

    sput-wide v15, Lcom/superbock/App;->e:J

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v13

    const-string v15, "lastGetTime"

    move-object/from16 p2, v15

    sget-wide v14, Lcom/superbock/App;->e:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object/from16 v1, p2

    :try_start_1
    invoke-virtual {v13, v1, v14, v15}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-virtual {v12, v10}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-wide/16 v13, 0x3e8

    if-eqz v1, :cond_0

    invoke-virtual {v12, v10}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->x(I)V

    invoke-static {}, Lk/j0;->h()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    move-object v10, v0

    int-to-long v0, v1

    mul-long v0, v0, v13

    sput-wide v0, Lcom/superbock/App;->h:J

    goto :goto_0

    :cond_0
    move-object v10, v0

    :goto_0
    invoke-virtual {v12, v9}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v12, v9}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->A(I)V

    invoke-static {}, Lk/j0;->j()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3c

    int-to-long v0, v0

    mul-long v0, v0, v13

    sput-wide v0, Lcom/superbock/App;->i:J

    :cond_1
    invoke-virtual {v12, v8}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v12, v8}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->q(I)V

    :cond_2
    invoke-virtual {v12, v7}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v12, v7}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->r(I)V

    :cond_3
    invoke-virtual {v12, v6}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v12, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->v(I)V

    :cond_4
    invoke-virtual {v12, v5}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {v12, v5}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->u(I)V

    :cond_5
    invoke-virtual {v12, v4}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v12, v4}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->s(I)V

    :cond_6
    invoke-virtual {v12, v3}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v12, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->w(I)V

    :cond_7
    invoke-virtual {v12, v2}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v12, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->t(I)V

    :cond_8
    invoke-virtual {v12, v11}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-virtual {v12, v11}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v11, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    invoke-virtual {v12, v10}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual {v12, v10}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-class v1, Lcom/superbock/bean/AdInfo;

    invoke-static {v0, v1}, Lf/a;->t(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Lg3/b;->c()Lg3/b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, 0x0

    :try_start_2
    iget-object v3, v0, Lg3/b;->a:Lt2/g;

    invoke-interface {v3}, Lt2/g;->h()Lz2/c;

    move-result-object v3

    invoke-virtual {v3}, Lz2/k;->g()Lz2/m;

    move-result-object v4

    const-string v5, "receiptId"

    new-instance v6, Lb3/d;

    invoke-virtual {v4, v5}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v5

    invoke-direct {v6, v5}, Lb3/d;-><init>(Lv2/g;)V

    invoke-virtual {v4, v6}, Lz2/m;->a(Lb3/b;)V

    iget-object v0, v0, Lg3/b;->a:Lt2/g;

    invoke-virtual {v3}, Lz2/k;->f()La3/e;

    move-result-object v3

    invoke-interface {v0, v3}, Lt2/g;->m(Lz2/e;)I
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_1
    if-eqz v1, :cond_b

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_b

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_a
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/superbock/bean/AdInfo;

    invoke-static {}, Lg3/b;->c()Lg3/b;

    move-result-object v0

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v0, v0, Lg3/b;->a:Lt2/g;

    invoke-interface {v0, v4}, Lt2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/superbock/bean/AdInfo;
    :try_end_4
    .catch Ljava/sql/SQLException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_3

    :catch_1
    move-exception v0

    :try_start_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    move-object v0, v2

    :goto_3
    if-nez v0, :cond_a

    invoke-static {}, Lg3/b;->c()Lg3/b;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iget-object v0, v0, Lg3/b;->a:Lt2/g;

    invoke-interface {v0, v3}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_6
    .catch Ljava/sql/SQLException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_4

    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_4
    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lcom/bumptech/glide/b;->f(Landroid/content/Context;)Lcom/bumptech/glide/i;

    move-result-object v0

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/bumptech/glide/i;->n(Ljava/lang/String;)Lcom/bumptech/glide/h;

    move-result-object v0

    sget-object v3, Lr/l;->c:Lr/l$c;

    invoke-virtual {v0, v3}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/h;

    iget-object v3, v0, Lcom/bumptech/glide/h;->C:Lcom/bumptech/glide/i;

    new-instance v4, Li0/f;

    invoke-direct {v4, v3}, Li0/f;-><init>(Lcom/bumptech/glide/i;)V

    invoke-virtual {v0, v4, v0}, Lcom/bumptech/glide/h;->u(Li0/h;Lh0/a;)Li0/h;

    goto :goto_2

    :cond_b
    const-string v0, "iconCmd"

    invoke-virtual {v12, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const/4 v1, 0x1

    move-object/from16 v2, p0

    if-ne v0, v1, :cond_c

    :try_start_8
    iget-object v0, v2, Le3/b;->a:Lcom/superbock/App;

    invoke-static {v0, v1}, Lcom/superbock/App;->b(Lcom/superbock/App;Z)V

    goto :goto_5

    :cond_c
    const/4 v1, 0x2

    if-ne v0, v1, :cond_d

    iget-object v0, v2, Le3/b;->a:Lcom/superbock/App;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/superbock/App;->b(Lcom/superbock/App;Z)V

    :cond_d
    :goto_5
    const-string v0, "ctrlCmd"

    invoke-virtual {v12, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_f

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lf3/i;->c(Landroid/content/Context;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_6

    :catchall_0
    move-object/from16 v2, p0

    goto :goto_6

    :catchall_1
    :cond_e
    move-object v2, v1

    :catchall_2
    :cond_f
    :goto_6
    return-void
.end method

.method public final b(Ls3/d;Ljava/io/IOException;)V
    .locals 0
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
    return-void
.end method
