.class public final Ly3/b$c;
.super Ly3/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public e:J

.field public f:Z

.field public final g:Ls3/s;

.field public final synthetic h:Ly3/b;


# direct methods
.method public constructor <init>(Ly3/b;Ls3/s;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/s;",
            ")V"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ly3/b$c;->h:Ly3/b;

    invoke-direct {p0, p1}, Ly3/b$a;-><init>(Ly3/b;)V

    iput-object p2, p0, Ly3/b$c;->g:Ls3/s;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Ly3/b$c;->e:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Ly3/b$c;->f:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-boolean v0, p0, Ly3/b$a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, Ly3/b$c;->f:Z

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0}, Lt3/c;->i(Lf4/a0;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ly3/b$c;->h:Ly3/b;

    iget-object v0, v0, Ly3/b;->e:Lw3/j;

    invoke-virtual {v0}, Lw3/j;->l()V

    invoke-virtual {p0}, Ly3/b$a;->a()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ly3/b$a;->c:Z

    return-void
.end method

.method public final u(Lf4/f;J)J
    .locals 10

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    cmp-long v4, p2, v2

    if-ltz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_c

    iget-boolean v4, p0, Ly3/b$a;->c:Z

    xor-int/2addr v4, v0

    if-eqz v4, :cond_b

    iget-boolean v4, p0, Ly3/b$c;->f:Z

    const-wide/16 v5, -0x1

    if-nez v4, :cond_1

    return-wide v5

    :cond_1
    iget-wide v7, p0, Ly3/b$c;->e:J

    cmp-long v4, v7, v2

    if-eqz v4, :cond_2

    cmp-long v4, v7, v5

    if-nez v4, :cond_7

    :cond_2
    cmp-long v4, v7, v5

    if-eqz v4, :cond_3

    iget-object v4, p0, Ly3/b$c;->h:Ly3/b;

    iget-object v4, v4, Ly3/b;->f:Lf4/h;

    invoke-interface {v4}, Lf4/h;->v()Ljava/lang/String;

    :cond_3
    :try_start_0
    iget-object v4, p0, Ly3/b$c;->h:Ly3/b;

    iget-object v4, v4, Ly3/b;->f:Lf4/h;

    invoke-interface {v4}, Lf4/h;->h0()J

    move-result-wide v7

    iput-wide v7, p0, Ly3/b$c;->e:J

    iget-object v4, p0, Ly3/b$c;->h:Ly3/b;

    iget-object v4, v4, Ly3/b;->f:Lf4/h;

    invoke-interface {v4}, Lf4/h;->v()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-static {v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    iget-wide v7, p0, Ly3/b$c;->e:J

    cmp-long v9, v7, v2

    if-ltz v9, :cond_9

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_4

    goto :goto_1

    :cond_4
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_5

    const-string v0, ";"

    invoke-static {v4, v0}, Lkotlin/text/StringsKt;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v0, :cond_9

    :cond_5
    iget-wide v7, p0, Ly3/b$c;->e:J

    cmp-long v0, v7, v2

    if-nez v0, :cond_6

    iput-boolean v1, p0, Ly3/b$c;->f:Z

    iget-object v0, p0, Ly3/b$c;->h:Ly3/b;

    iget-object v1, v0, Ly3/b;->b:Ly3/a;

    invoke-virtual {v1}, Ly3/a;->a()Ls3/r;

    move-result-object v1

    iput-object v1, v0, Ly3/b;->c:Ls3/r;

    iget-object v0, p0, Ly3/b$c;->h:Ly3/b;

    iget-object v0, v0, Ly3/b;->d:Ls3/w;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, v0, Ls3/w;->k:Ls3/l;

    iget-object v1, p0, Ly3/b$c;->g:Ls3/s;

    iget-object v2, p0, Ly3/b$c;->h:Ly3/b;

    iget-object v2, v2, Ly3/b;->c:Ls3/r;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Lx3/e;->b(Ls3/l;Ls3/s;Ls3/r;)V

    invoke-virtual {p0}, Ly3/b$a;->a()V

    :cond_6
    iget-boolean v0, p0, Ly3/b$c;->f:Z

    if-nez v0, :cond_7

    return-wide v5

    :cond_7
    iget-wide v0, p0, Ly3/b$c;->e:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Ly3/b$a;->u(Lf4/f;J)J

    move-result-wide p1

    cmp-long p3, p1, v5

    if-eqz p3, :cond_8

    iget-wide v0, p0, Ly3/b$c;->e:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, Ly3/b$c;->e:J

    return-wide p1

    :cond_8
    iget-object p1, p0, Ly3/b$c;->h:Ly3/b;

    iget-object p1, p1, Ly3/b;->e:Lw3/j;

    invoke-virtual {p1}, Lw3/j;->l()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ly3/b$a;->a()V

    throw p1

    :cond_9
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "expected chunk size and optional extensions"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " but was \""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Ly3/b$c;->e:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x22

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/net/ProtocolException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    const-string p1, "byteCount < 0: "

    invoke-static {p1, p2, p3}, Landroidx/activity/result/a;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
