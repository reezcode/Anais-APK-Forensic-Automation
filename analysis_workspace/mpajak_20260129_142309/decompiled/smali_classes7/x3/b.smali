.class public final Lx3/b;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/t;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lx3/b;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Ls3/t$a;)Ls3/b0;
    .locals 12

    const-string v0, "call"

    const-string v1, "chain"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lx3/g;

    iget-object v1, p1, Lx3/g;->e:Lw3/c;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p1, Lx3/g;->f:Ls3/y;

    iget-object v2, p1, Ls3/y;->e:Ld1/f;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "request"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v6, v1, Lw3/c;->d:Ls3/o;

    iget-object v7, v1, Lw3/c;->c:Lw3/e;

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v1, Lw3/c;->f:Lx3/d;

    invoke-interface {v6, p1}, Lx3/d;->a(Ls3/y;)V

    iget-object v6, v1, Lw3/c;->d:Ls3/o;

    iget-object v7, v1, Lw3/c;->c:Lw3/e;

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    iget-object v6, p1, Ls3/y;->c:Ljava/lang/String;

    invoke-static {v6}, Lx3/f;->a(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v6, :cond_3

    if-eqz v2, :cond_3

    const-string v6, "Expect"

    invoke-virtual {p1, v6}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v10, "100-continue"

    invoke-static {v10, v6}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    :try_start_1
    iget-object v6, v1, Lw3/c;->f:Lx3/d;

    invoke-interface {v6}, Lx3/d;->c()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v1, v8}, Lw3/c;->d(Z)Ls3/b0$a;

    move-result-object v6

    invoke-virtual {v1}, Lw3/c;->e()V

    const/4 v10, 0x0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, v1, Lw3/c;->d:Ls3/o;

    iget-object v2, v1, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0, v2, p1}, Ls3/o;->b(Ls3/d;Ljava/io/IOException;)V

    invoke-virtual {v1, p1}, Lw3/c;->f(Ljava/io/IOException;)V

    throw p1

    :cond_0
    const/4 v10, 0x1

    move-object v6, v7

    :goto_0
    if-nez v6, :cond_1

    invoke-virtual {v1, p1}, Lw3/c;->b(Ls3/y;)Lf4/y;

    move-result-object v8

    invoke-static {v8}, Ld1/d;->d(Lf4/y;)Lf4/g;

    move-result-object v8

    invoke-virtual {v2, v8}, Ld1/f;->K(Lf4/g;)V

    check-cast v8, Lf4/t;

    invoke-virtual {v8}, Lf4/t;->close()V

    goto :goto_1

    :cond_1
    iget-object v2, v1, Lw3/c;->c:Lw3/e;

    invoke-virtual {v2, v1, v8, v9, v7}, Lw3/e;->h(Lw3/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    iget-object v2, v1, Lw3/c;->b:Lw3/j;

    invoke-virtual {v2}, Lw3/j;->j()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, v1, Lw3/c;->f:Lx3/d;

    invoke-interface {v2}, Lx3/d;->h()Lw3/j;

    move-result-object v2

    invoke-virtual {v2}, Lw3/j;->l()V

    :cond_2
    :goto_1
    move v8, v10

    goto :goto_2

    :cond_3
    iget-object v2, v1, Lw3/c;->c:Lw3/e;

    invoke-virtual {v2, v1, v8, v9, v7}, Lw3/e;->h(Lw3/c;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-object v6, v7

    :goto_2
    :try_start_2
    iget-object v2, v1, Lw3/c;->f:Lx3/d;

    invoke-interface {v2}, Lx3/d;->b()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v6, :cond_4

    invoke-virtual {v1, v9}, Lw3/c;->d(Z)Ls3/b0$a;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz v8, :cond_4

    invoke-virtual {v1}, Lw3/c;->e()V

    const/4 v8, 0x0

    :cond_4
    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v6, Ls3/b0$a;->a:Ls3/y;

    iget-object v2, v1, Lw3/c;->b:Lw3/j;

    iget-object v2, v2, Lw3/j;->d:Ls3/q;

    iput-object v2, v6, Ls3/b0$a;->e:Ls3/q;

    iput-wide v3, v6, Ls3/b0$a;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    iput-wide v10, v6, Ls3/b0$a;->l:J

    invoke-virtual {v6}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object v2

    iget v6, v2, Ls3/b0;->e:I

    const/16 v10, 0x64

    if-ne v6, v10, :cond_6

    invoke-virtual {v1, v9}, Lw3/c;->d(Z)Ls3/b0$a;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    if-eqz v8, :cond_5

    invoke-virtual {v1}, Lw3/c;->e()V

    :cond_5
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, v2, Ls3/b0$a;->a:Ls3/y;

    iget-object p1, v1, Lw3/c;->b:Lw3/j;

    iget-object p1, p1, Lw3/j;->d:Ls3/q;

    iput-object p1, v2, Ls3/b0$a;->e:Ls3/q;

    iput-wide v3, v2, Ls3/b0$a;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, v2, Ls3/b0$a;->l:J

    invoke-virtual {v2}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object v2

    iget v6, v2, Ls3/b0;->e:I

    :cond_6
    const-string p1, "response"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lw3/c;->d:Ls3/o;

    iget-object v4, v1, Lw3/c;->c:Lw3/e;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lx3/b;->a:Z

    if-eqz v0, :cond_7

    const/16 v0, 0x65

    if-ne v6, v0, :cond_7

    new-instance p1, Ls3/b0$a;

    invoke-direct {p1, v2}, Ls3/b0$a;-><init>(Ls3/b0;)V

    sget-object v0, Lt3/c;->c:Ls3/c0;

    iput-object v0, p1, Ls3/b0$a;->g:Ls3/d0;

    invoke-virtual {p1}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object p1

    goto :goto_3

    :cond_7
    new-instance v0, Ls3/b0$a;

    invoke-direct {v0, v2}, Ls3/b0$a;-><init>(Ls3/b0;)V

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_3
    const-string p1, "Content-Type"

    invoke-static {v2, p1}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v3, v1, Lw3/c;->f:Lx3/d;

    invoke-interface {v3, v2}, Lx3/d;->e(Ls3/b0;)J

    move-result-wide v3

    iget-object v5, v1, Lw3/c;->f:Lx3/d;

    invoke-interface {v5, v2}, Lx3/d;->f(Ls3/b0;)Lf4/a0;

    move-result-object v2

    new-instance v5, Lw3/c$b;

    invoke-direct {v5, v1, v2, v3, v4}, Lw3/c$b;-><init>(Lw3/c;Lf4/a0;J)V

    new-instance v2, Lx3/h;

    invoke-static {v5}, Ld1/d;->e(Lf4/a0;)Lf4/h;

    move-result-object v5

    invoke-direct {v2, p1, v3, v4, v5}, Lx3/h;-><init>(Ljava/lang/String;JLf4/h;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    iput-object v2, v0, Ls3/b0$a;->g:Ls3/d0;

    invoke-virtual {v0}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object p1

    :goto_3
    iget-object v0, p1, Ls3/b0;->b:Ls3/y;

    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "close"

    invoke-static {v3, v0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_8

    invoke-static {p1, v2}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    iget-object v0, v1, Lw3/c;->f:Lx3/d;

    invoke-interface {v0}, Lx3/d;->h()Lw3/j;

    move-result-object v0

    invoke-virtual {v0}, Lw3/j;->l()V

    :cond_9
    const/16 v0, 0xcc

    if-eq v6, v0, :cond_a

    const/16 v0, 0xcd

    if-ne v6, v0, :cond_d

    :cond_a
    iget-object v0, p1, Ls3/b0;->h:Ls3/d0;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Ls3/d0;->a()J

    move-result-wide v0

    goto :goto_4

    :cond_b
    const-wide/16 v0, -0x1

    :goto_4
    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_d

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "HTTP "

    const-string v2, " had non-zero Content-Length: "

    invoke-static {v1, v6, v2}, Landroidx/appcompat/graphics/drawable/a;->e(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object p1, p1, Ls3/b0;->h:Ls3/d0;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Ls3/d0;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    :cond_c
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    return-object p1

    :catch_1
    move-exception p1

    iget-object v0, v1, Lw3/c;->d:Ls3/o;

    iget-object v2, v1, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0, v2, p1}, Ls3/o;->c(Ls3/d;Ljava/io/IOException;)V

    invoke-virtual {v1, p1}, Lw3/c;->f(Ljava/io/IOException;)V

    throw p1

    :catch_2
    move-exception p1

    iget-object v0, v1, Lw3/c;->d:Ls3/o;

    iget-object v2, v1, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0, v2, p1}, Ls3/o;->b(Ls3/d;Ljava/io/IOException;)V

    invoke-virtual {v1, p1}, Lw3/c;->f(Ljava/io/IOException;)V

    throw p1

    :catch_3
    move-exception p1

    iget-object v0, v1, Lw3/c;->d:Ls3/o;

    iget-object v2, v1, Lw3/c;->c:Lw3/e;

    invoke-virtual {v0, v2, p1}, Ls3/o;->b(Ls3/d;Ljava/io/IOException;)V

    invoke-virtual {v1, p1}, Lw3/c;->f(Ljava/io/IOException;)V

    throw p1
.end method
