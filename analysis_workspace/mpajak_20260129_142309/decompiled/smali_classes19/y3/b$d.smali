.class public final Ly3/b$d;
.super Ly3/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation


# instance fields
.field public e:J

.field public final synthetic f:Ly3/b;


# direct methods
.method public constructor <init>(Ly3/b;J)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)V"
        }
    .end annotation

    iput-object p1, p0, Ly3/b$d;->f:Ly3/b;

    invoke-direct {p0, p1}, Ly3/b$a;-><init>(Ly3/b;)V

    iput-wide p2, p0, Ly3/b$d;->e:J

    const-wide/16 v0, 0x0

    cmp-long p1, p2, v0

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ly3/b$a;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 5

    iget-boolean v0, p0, Ly3/b$a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Ly3/b$d;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0}, Lt3/c;->i(Lf4/a0;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ly3/b$d;->f:Ly3/b;

    iget-object v0, v0, Ly3/b;->e:Lw3/j;

    invoke-virtual {v0}, Lw3/j;->l()V

    invoke-virtual {p0}, Ly3/b$a;->a()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ly3/b$a;->c:Z

    return-void
.end method

.method public final u(Lf4/f;J)J
    .locals 7

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_5

    iget-boolean v2, p0, Ly3/b$a;->c:Z

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_4

    iget-wide v2, p0, Ly3/b$d;->e:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v0

    if-nez v6, :cond_1

    return-wide v4

    :cond_1
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Ly3/b$a;->u(Lf4/f;J)J

    move-result-wide p1

    cmp-long p3, p1, v4

    if-eqz p3, :cond_3

    iget-wide v2, p0, Ly3/b$d;->e:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, Ly3/b$d;->e:J

    cmp-long p3, v2, v0

    if-nez p3, :cond_2

    invoke-virtual {p0}, Ly3/b$a;->a()V

    :cond_2
    return-wide p1

    :cond_3
    iget-object p1, p0, Ly3/b$d;->f:Ly3/b;

    iget-object p1, p1, Ly3/b;->e:Lw3/j;

    invoke-virtual {p1}, Lw3/j;->l()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ly3/b$a;->a()V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const-string p1, "byteCount < 0: "

    invoke-static {p1, p2, p3}, Landroidx/activity/result/a;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
