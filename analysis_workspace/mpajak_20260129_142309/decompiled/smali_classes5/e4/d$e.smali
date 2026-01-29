.class public final Le4/d$e;
.super Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le4/d;->j(Ljava/lang/String;Le4/d$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:J

.field public final synthetic f:Le4/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLe4/d;)V
    .locals 0

    iput-wide p2, p0, Le4/d$e;->e:J

    iput-object p4, p0, Le4/d$e;->f:Le4/d;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 8

    iget-object v0, p0, Le4/d$e;->f:Le4/d;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Le4/d;->o:Z

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v1, v0, Le4/d;->e:Le4/h;

    if-eqz v1, :cond_3

    iget-boolean v2, v0, Le4/d;->q:Z

    const/4 v3, -0x1

    if-eqz v2, :cond_1

    iget v2, v0, Le4/d;->p:I

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_0
    iget v4, v0, Le4/d;->p:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v0, Le4/d;->p:I

    iput-boolean v5, v0, Le4/d;->q:Z

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const/4 v4, 0x0

    if-eq v2, v3, :cond_2

    new-instance v1, Ljava/net/SocketTimeoutException;

    const-string v3, "sent ping but didn\'t receive pong within "

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-wide v6, v0, Le4/d;->u:J

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, "ms (after "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-int/2addr v2, v5

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " successful ping/pongs)"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    :try_start_1
    sget-object v2, Lf4/i;->e:Lf4/i;

    const-string v3, "payload"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x9

    invoke-virtual {v1, v3, v2}, Le4/h;->a(ILf4/i;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v1

    :goto_1
    invoke-virtual {v0, v1, v4}, Le4/d;->i(Ljava/lang/Exception;Ls3/b0;)V

    goto :goto_3

    :cond_3
    :goto_2
    monitor-exit v0

    :goto_3
    iget-wide v0, p0, Le4/d$e;->e:J

    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
