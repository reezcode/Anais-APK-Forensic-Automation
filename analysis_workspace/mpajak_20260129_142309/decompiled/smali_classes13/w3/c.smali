.class public final Lw3/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw3/c$a;,
        Lw3/c$b;
    }
.end annotation


# instance fields
.field public a:Z

.field public final b:Lw3/j;

.field public final c:Lw3/e;

.field public final d:Ls3/o;

.field public final e:Lw3/d;

.field public final f:Lx3/d;


# direct methods
.method public constructor <init>(Lw3/e;Ls3/o;Lw3/d;Lx3/d;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "codec"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/c;->c:Lw3/e;

    iput-object p2, p0, Lw3/c;->d:Ls3/o;

    iput-object p3, p0, Lw3/c;->e:Lw3/d;

    iput-object p4, p0, Lw3/c;->f:Lx3/d;

    invoke-interface {p4}, Lx3/d;->h()Lw3/j;

    move-result-object p1

    iput-object p1, p0, Lw3/c;->b:Lw3/j;

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(JZZTE;)TE;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3}, Lw3/c;->f(Ljava/io/IOException;)V

    :cond_0
    const-string v0, "call"

    if-eqz p2, :cond_2

    iget-object v1, p0, Lw3/c;->d:Ls3/o;

    iget-object v2, p0, Lw3/c;->c:Lw3/e;

    if-eqz p3, :cond_1

    invoke-virtual {v1, v2, p3}, Ls3/o;->b(Ls3/d;Ljava/io/IOException;)V

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_4

    if-eqz p3, :cond_3

    iget-object v0, p0, Lw3/c;->d:Ls3/o;

    iget-object v1, p0, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0, v1, p3}, Ls3/o;->c(Ls3/d;Ljava/io/IOException;)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lw3/c;->d:Ls3/o;

    iget-object v2, p0, Lw3/c;->c:Lw3/e;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_1
    iget-object v0, p0, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0, p0, p2, p1, p3}, Lw3/e;->h(Lw3/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ls3/y;)Lf4/y;
    .locals 4

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lw3/c;->a:Z

    iget-object v0, p1, Ls3/y;->e:Ld1/f;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ld1/f;->A()J

    move-result-wide v0

    iget-object v2, p0, Lw3/c;->d:Ls3/o;

    iget-object v3, p0, Lw3/c;->c:Lw3/e;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "call"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lw3/c;->f:Lx3/d;

    invoke-interface {v2, p1, v0, v1}, Lx3/d;->d(Ls3/y;J)Lf4/y;

    move-result-object p1

    new-instance v2, Lw3/c$a;

    invoke-direct {v2, p0, p1, v0, v1}, Lw3/c$a;-><init>(Lw3/c;Lf4/y;J)V

    return-object v2
.end method

.method public final c()Le4/d$c;
    .locals 8

    iget-object v0, p0, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0}, Lw3/e;->k()V

    iget-object v0, p0, Lw3/c;->f:Lx3/d;

    invoke-interface {v0}, Lx3/d;->h()Lw3/j;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "exchange"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lw3/j;->c:Ljava/net/Socket;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v6, v0, Lw3/j;->g:Lf4/u;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v7, v0, Lw3/j;->h:Lf4/t;

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v0}, Lw3/j;->l()V

    new-instance v0, Lw3/i;

    move-object v2, v0

    move-object v3, p0

    move-object v4, v6

    move-object v5, v7

    invoke-direct/range {v2 .. v7}, Lw3/i;-><init>(Lw3/c;Lf4/h;Lf4/g;Lf4/h;Lf4/g;)V

    return-object v0
.end method

.method public final d(Z)Ls3/b0$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lw3/c;->f:Lx3/d;

    invoke-interface {v0, p1}, Lx3/d;->g(Z)Ls3/b0$a;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "deferredTrailers"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Ls3/b0$a;->m:Lw3/c;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lw3/c;->d:Ls3/o;

    iget-object v1, p0, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0, v1, p1}, Ls3/o;->c(Ls3/d;Ljava/io/IOException;)V

    invoke-virtual {p0, p1}, Lw3/c;->f(Ljava/io/IOException;)V

    throw p1
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lw3/c;->d:Ls3/o;

    iget-object v1, p0, Lw3/c;->c:Lw3/e;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "call"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final f(Ljava/io/IOException;)V
    .locals 5

    iget-object v0, p0, Lw3/c;->e:Lw3/d;

    invoke-virtual {v0, p1}, Lw3/d;->c(Ljava/io/IOException;)V

    iget-object v0, p0, Lw3/c;->f:Lx3/d;

    invoke-interface {v0}, Lx3/d;->h()Lw3/j;

    move-result-object v0

    iget-object v1, p0, Lw3/c;->c:Lw3/e;

    monitor-enter v0

    :try_start_0
    const-string v2, "call"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, p1, Lz3/v;

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    move-object v2, p1

    check-cast v2, Lz3/v;

    iget-object v2, v2, Lz3/v;->b:Lz3/b;

    sget-object v4, Lz3/b;->g:Lz3/b;

    if-ne v2, v4, :cond_0

    iget p1, v0, Lw3/j;->m:I

    add-int/2addr p1, v3

    iput p1, v0, Lw3/j;->m:I

    if-le p1, v3, :cond_4

    iput-boolean v3, v0, Lw3/j;->i:Z

    :goto_0
    iget p1, v0, Lw3/j;->k:I

    goto :goto_1

    :cond_0
    check-cast p1, Lz3/v;

    iget-object p1, p1, Lz3/v;->b:Lz3/b;

    sget-object v2, Lz3/b;->h:Lz3/b;

    if-ne p1, v2, :cond_1

    iget-boolean p1, v1, Lw3/e;->n:Z

    if-eqz p1, :cond_1

    goto :goto_2

    :cond_1
    iput-boolean v3, v0, Lw3/j;->i:Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lw3/j;->j()Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, p1, Lz3/a;

    if-eqz v2, :cond_4

    :cond_3
    iput-boolean v3, v0, Lw3/j;->i:Z

    iget v2, v0, Lw3/j;->l:I

    if-nez v2, :cond_4

    iget-object v1, v1, Lw3/e;->q:Ls3/w;

    iget-object v2, v0, Lw3/j;->q:Ls3/e0;

    invoke-virtual {v0, v1, v2, p1}, Lw3/j;->d(Ls3/w;Ls3/e0;Ljava/io/IOException;)V

    goto :goto_0

    :goto_1
    add-int/2addr p1, v3

    iput p1, v0, Lw3/j;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method
