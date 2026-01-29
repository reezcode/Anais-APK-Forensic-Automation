.class public final Lcom/superbock/App$d;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/App;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


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

    if-eqz v14, :cond_d

    move-object/from16 v14, p2

    iget-object v14, v14, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {v14}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object v14

    sget-object v15, Lk3/i;->a:[B

    invoke-static {v14, v15}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object v14

    if-eqz v14, :cond_d

    const-string v15, "code"

    invoke-virtual {v14, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v15

    move-object/from16 p1, v0

    const/4 v0, 0x1

    if-ne v15, v0, :cond_d

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v15

    move-object/from16 v16, v1

    const-string v1, "savedDev"

    invoke-virtual {v15, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    const-string v0, "data"

    invoke-virtual {v14, v0}, Lf/e;->A(Ljava/lang/String;)Lf/e;

    move-result-object v0

    const-string v1, "appDomain"

    invoke-virtual {v0, v1}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lk/j0;->p(Ljava/lang/String;)V

    const-string v1, "webSite"

    invoke-virtual {v0, v1}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lk/j0;->C(Ljava/lang/String;)V

    invoke-virtual {v0, v10}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v10}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->B(I)V

    :cond_0
    invoke-virtual {v0, v9}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v9}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->z(I)V

    :cond_1
    invoke-virtual {v0, v8}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-wide/16 v9, 0x3e8

    if-eqz v1, :cond_2

    invoke-virtual {v0, v8}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->x(I)V

    invoke-static {}, Lk/j0;->h()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    int-to-long v14, v1

    mul-long v14, v14, v9

    sput-wide v14, Lcom/superbock/App;->h:J

    :cond_2
    invoke-virtual {v0, v7}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0, v7}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->A(I)V

    invoke-static {}, Lk/j0;->j()I

    move-result v1

    mul-int/lit8 v1, v1, 0x3c

    int-to-long v7, v1

    mul-long v7, v7, v9

    sput-wide v7, Lcom/superbock/App;->i:J

    :cond_3
    invoke-virtual {v0, v13}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0, v13}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    const/4 v7, -0x1

    if-le v1, v7, :cond_4

    sput v1, Lk/j0;->n:I

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    sget v7, Lk/j0;->n:I

    invoke-virtual {v1, v13, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    :cond_4
    invoke-virtual {v0, v12}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v12}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_5

    sput-object v1, Lk/j0;->i:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    sget-object v7, Lk/j0;->i:Ljava/lang/String;

    invoke-virtual {v1, v12, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v0, v11}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v0, v11}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v11, v7}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {v0, v6}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->q(I)V

    :cond_7
    invoke-virtual {v0, v5}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0, v5}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->r(I)V

    :cond_8
    invoke-virtual {v0, v4}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-virtual {v0, v4}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->v(I)V

    :cond_9
    invoke-virtual {v0, v3}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v0, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->u(I)V

    :cond_a
    invoke-virtual {v0, v2}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->s(I)V

    :cond_b
    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v0, v1}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lk/j0;->w(I)V

    :cond_c
    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v0, v1}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->t(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_d
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

    return-void
.end method
