.class public final Ly3/b;
.super Ljava/lang/Object;

# interfaces
.implements Lx3/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly3/b$e;,
        Ly3/b$b;,
        Ly3/b$a;,
        Ly3/b$d;,
        Ly3/b$c;,
        Ly3/b$f;
    }
.end annotation


# instance fields
.field public a:I

.field public final b:Ly3/a;

.field public c:Ls3/r;

.field public final d:Ls3/w;

.field public final e:Lw3/j;

.field public final f:Lf4/h;

.field public final g:Lf4/g;


# direct methods
.method public constructor <init>(Ls3/w;Lw3/j;Lf4/h;Lf4/g;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sink"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/b;->d:Ls3/w;

    iput-object p2, p0, Ly3/b;->e:Lw3/j;

    iput-object p3, p0, Ly3/b;->f:Lf4/h;

    iput-object p4, p0, Ly3/b;->g:Lf4/g;

    new-instance p1, Ly3/a;

    invoke-direct {p1, p3}, Ly3/a;-><init>(Lf4/h;)V

    iput-object p1, p0, Ly3/b;->b:Ly3/a;

    return-void
.end method

.method public static final i(Ly3/b;Lf4/m;)V
    .locals 2

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, p1, Lf4/m;->e:Lf4/b0;

    sget-object v0, Lf4/b0;->d:Lf4/b0$a;

    const-string v1, "delegate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p1, Lf4/m;->e:Lf4/b0;

    invoke-virtual {p0}, Lf4/b0;->a()Lf4/b0;

    invoke-virtual {p0}, Lf4/b0;->b()Lf4/b0;

    return-void
.end method


# virtual methods
.method public final a(Ls3/y;)V
    .locals 4

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Ly3/b;->e:Lw3/j;

    iget-object v1, v1, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    const-string v2, "connection.route().proxy.type()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proxyType"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Ls3/y;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p1, Ls3/y;->b:Ls3/s;

    iget-boolean v3, v2, Ls3/s;->a:Z

    if-nez v3, :cond_0

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v1, "url"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ls3/s;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Ls3/s;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3f

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    const-string v1, " HTTP/1.1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Ls3/y;->d:Ls3/r;

    invoke-virtual {p0, p1, v0}, Ly3/b;->k(Ls3/r;Ljava/lang/String;)V

    return-void
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0}, Lf4/g;->flush()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0}, Lf4/g;->flush()V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Ly3/b;->e:Lw3/j;

    iget-object v0, v0, Lw3/j;->b:Ljava/net/Socket;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lt3/c;->e(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public final d(Ls3/y;J)Lf4/y;
    .locals 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x1

    const-string v1, "chunked"

    invoke-static {v1, p1}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    const/4 v1, 0x2

    const-string v2, "state: "

    if-eqz p1, :cond_2

    iget p1, p0, Ly3/b;->a:I

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iput v1, p0, Ly3/b;->a:I

    new-instance p1, Ly3/b$b;

    invoke-direct {p1, p0}, Ly3/b$b;-><init>(Ly3/b;)V

    goto :goto_2

    :cond_1
    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget p2, p0, Ly3/b;->a:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    const-wide/16 v3, -0x1

    cmp-long p1, p2, v3

    if-eqz p1, :cond_5

    iget p1, p0, Ly3/b;->a:I

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_4

    iput v1, p0, Ly3/b;->a:I

    new-instance p1, Ly3/b$e;

    invoke-direct {p1, p0}, Ly3/b$e;-><init>(Ly3/b;)V

    :goto_2
    return-object p1

    :cond_4
    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget p2, p0, Ly3/b;->a:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ls3/b0;)J
    .locals 2

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lx3/e;->a(Ls3/b0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {p1, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lt3/c;->l(Ls3/b0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final f(Ls3/b0;)Lf4/a0;
    .locals 9

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lx3/e;->a(Ls3/b0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ly3/b;->j(J)Lf4/a0;

    move-result-object p1

    goto :goto_2

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {p1, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "chunked"

    invoke-static {v2, v0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x5

    const-string v3, "state: "

    const/4 v4, 0x4

    if-eqz v0, :cond_3

    iget-object p1, p1, Ls3/b0;->b:Ls3/y;

    iget-object p1, p1, Ls3/y;->b:Ls3/s;

    iget v0, p0, Ly3/b;->a:I

    if-ne v0, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iput v2, p0, Ly3/b;->a:I

    new-instance v0, Ly3/b$c;

    invoke-direct {v0, p0, p1}, Ly3/b$c;-><init>(Ly3/b;Ls3/s;)V

    move-object p1, v0

    goto :goto_2

    :cond_2
    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v0, p0, Ly3/b;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {p1}, Lt3/c;->l(Ls3/b0;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long p1, v5, v7

    if-eqz p1, :cond_4

    invoke-virtual {p0, v5, v6}, Ly3/b;->j(J)Lf4/a0;

    move-result-object p1

    goto :goto_2

    :cond_4
    iget p1, p0, Ly3/b;->a:I

    if-ne p1, v4, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_6

    iput v2, p0, Ly3/b;->a:I

    iget-object p1, p0, Ly3/b;->e:Lw3/j;

    invoke-virtual {p1}, Lw3/j;->l()V

    new-instance p1, Ly3/b$f;

    invoke-direct {p1, p0}, Ly3/b$f;-><init>(Ly3/b;)V

    :goto_2
    return-object p1

    :cond_6
    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v0, p0, Ly3/b;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Z)Ls3/b0$a;
    .locals 8

    iget v0, p0, Ly3/b;->a:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :cond_1
    :goto_0
    if-eqz v2, :cond_4

    :try_start_0
    sget-object v0, Lx3/j;->d:Lx3/j$a;

    iget-object v2, p0, Ly3/b;->b:Ly3/a;

    iget-object v3, v2, Ly3/a;->b:Lf4/h;

    iget-wide v4, v2, Ly3/a;->a:J

    invoke-interface {v3, v4, v5}, Lf4/h;->O(J)Ljava/lang/String;

    move-result-object v3

    iget-wide v4, v2, Ly3/a;->a:J

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    int-to-long v6, v6

    sub-long/2addr v4, v6

    iput-wide v4, v2, Ly3/a;->a:J

    invoke-virtual {v0, v3}, Lx3/j$a;->a(Ljava/lang/String;)Lx3/j;

    move-result-object v0

    new-instance v2, Ls3/b0$a;

    invoke-direct {v2}, Ls3/b0$a;-><init>()V

    iget-object v3, v0, Lx3/j;->a:Ls3/x;

    invoke-virtual {v2, v3}, Ls3/b0$a;->f(Ls3/x;)Ls3/b0$a;

    iget v3, v0, Lx3/j;->b:I

    iput v3, v2, Ls3/b0$a;->c:I

    iget-object v3, v0, Lx3/j;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ls3/b0$a;->e(Ljava/lang/String;)Ls3/b0$a;

    iget-object v3, p0, Ly3/b;->b:Ly3/a;

    invoke-virtual {v3}, Ly3/a;->a()Ls3/r;

    move-result-object v3

    invoke-virtual {v2, v3}, Ls3/b0$a;->d(Ls3/r;)Ls3/b0$a;

    const/16 v3, 0x64

    if-eqz p1, :cond_2

    iget p1, v0, Lx3/j;->b:I

    if-ne p1, v3, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget p1, v0, Lx3/j;->b:I

    if-ne p1, v3, :cond_3

    iput v1, p0, Ly3/b;->a:I

    goto :goto_1

    :cond_3
    const/4 p1, 0x4

    iput p1, p0, Ly3/b;->a:I
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v2

    :catch_0
    move-exception p1

    iget-object v0, p0, Ly3/b;->e:Lw3/j;

    iget-object v0, v0, Lw3/j;->q:Ls3/e0;

    iget-object v0, v0, Ls3/e0;->a:Ls3/a;

    iget-object v0, v0, Ls3/a;->a:Ls3/s;

    invoke-virtual {v0}, Ls3/s;->g()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "unexpected end of stream on "

    invoke-static {v2, v0}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_4
    const-string p1, "state: "

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v0, p0, Ly3/b;->a:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Lw3/j;
    .locals 1

    iget-object v0, p0, Ly3/b;->e:Lw3/j;

    return-object v0
.end method

.method public final j(J)Lf4/a0;
    .locals 2

    iget v0, p0, Ly3/b;->a:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x5

    iput v0, p0, Ly3/b;->a:I

    new-instance v0, Ly3/b$d;

    invoke-direct {v0, p0, p1, p2}, Ly3/b$d;-><init>(Ly3/b;J)V

    return-object v0

    :cond_1
    const-string p1, "state: "

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget p2, p0, Ly3/b;->a:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final k(Ls3/r;Ljava/lang/String;)V
    .locals 5

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Ly3/b;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, p0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0, p2}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    move-result-object p2

    const-string v0, "\r\n"

    invoke-interface {p2, v0}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    iget-object p2, p1, Ls3/r;->b:[Ljava/lang/String;

    array-length p2, p2

    div-int/lit8 p2, p2, 0x2

    :goto_1
    if-ge v1, p2, :cond_1

    iget-object v3, p0, Ly3/b;->g:Lf4/g;

    invoke-virtual {p1, v1}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    move-result-object v3

    const-string v4, ": "

    invoke-interface {v3, v4}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    move-result-object v3

    invoke-virtual {p1, v1}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    move-result-object v3

    invoke-interface {v3, v0}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Ly3/b;->g:Lf4/g;

    invoke-interface {p1, v0}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    iput v2, p0, Ly3/b;->a:I

    return-void

    :cond_2
    const-string p1, "state: "

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget p2, p0, Ly3/b;->a:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
