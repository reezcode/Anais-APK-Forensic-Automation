.class public final Lz3/f$a;
.super Lv3/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz3/f;-><init>(Lz3/f$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic e:Lz3/f;

.field public final synthetic f:J


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f;J)V
    .locals 0

    iput-object p2, p0, Lz3/f$a;->e:Lz3/f;

    iput-wide p3, p0, Lz3/f$a;->f:J

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 9

    iget-object v0, p0, Lz3/f$a;->e:Lz3/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz3/f$a;->e:Lz3/f;

    iget-wide v2, v1, Lz3/f;->o:J

    iget-wide v4, v1, Lz3/f;->n:J

    const/4 v6, 0x1

    const/4 v7, 0x0

    cmp-long v8, v2, v4

    if-gez v8, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    add-long/2addr v4, v2

    iput-wide v4, v1, Lz3/f;->n:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    if-eqz v2, :cond_1

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lz3/f;->a(Lz3/f;Ljava/io/IOException;)V

    const-wide/16 v0, -0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, v7, v6, v7}, Lz3/f;->q(ZII)V

    iget-wide v0, p0, Lz3/f$a;->f:J

    :goto_1
    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
