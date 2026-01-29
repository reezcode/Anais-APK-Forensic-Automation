.class public final Lf3/g;
.super Ljava/util/TimerTask;


# instance fields
.field public final synthetic b:Ls3/g0;

.field public final synthetic c:Lf3/i$a;


# direct methods
.method public constructor <init>(Lf3/i$a;Ls3/g0;)V
    .locals 0

    iput-object p1, p0, Lf3/g;->c:Lf3/i$a;

    iput-object p2, p0, Lf3/g;->b:Ls3/g0;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    iget-object v0, p0, Lf3/g;->c:Lf3/i$a;

    iget-object v1, p0, Lf3/g;->b:Ls3/g0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "pong"

    invoke-interface {v1, v2}, Ls3/g0;->b(Ljava/lang/String;)Z

    iget-wide v2, v0, Lf3/i$a;->d:J

    const-wide/32 v4, 0xea60

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-nez v8, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v8, v0, Lf3/i$a;->c:J

    sub-long/2addr v2, v8

    cmp-long v8, v2, v4

    if-gtz v8, :cond_1

    :cond_0
    iget-wide v2, v0, Lf3/i$a;->d:J

    cmp-long v8, v2, v6

    if-lez v8, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v8, v0, Lf3/i$a;->d:J

    sub-long/2addr v2, v8

    cmp-long v8, v2, v4

    if-lez v8, :cond_2

    :cond_1
    const/16 v2, 0x3e8

    const-string v3, "NORMAL_CLOSURE"

    invoke-interface {v1, v2, v3}, Ls3/g0;->a(ILjava/lang/String;)Z

    :cond_2
    sget-object v1, Lcom/superbock/auto/BaseService;->M:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    iget-wide v1, v0, Lf3/i$a;->e:J

    cmp-long v3, v1, v6

    if-lez v3, :cond_3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v8, v0, Lf3/i$a;->e:J

    sub-long/2addr v1, v8

    cmp-long v3, v1, v4

    if-lez v3, :cond_3

    const/4 v1, 0x0

    sput-object v1, Lcom/superbock/auto/BaseService;->M:Ljava/lang/Integer;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object v1, Lcom/superbock/auto/BaseService;->L:Ljava/lang/Boolean;

    iput-wide v6, v0, Lf3/i$a;->e:J

    :cond_3
    return-void
.end method
