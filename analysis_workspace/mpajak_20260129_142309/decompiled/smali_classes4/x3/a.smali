.class public final Lx3/a;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/t;


# instance fields
.field public final a:Ls3/l;


# direct methods
.method public constructor <init>(Ls3/l;)V
    .locals 1

    const-string v0, "cookieJar"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/a;->a:Ls3/l;

    return-void
.end method


# virtual methods
.method public final a(Ls3/t$a;)Ls3/b0;
    .locals 13

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lx3/g;

    iget-object v0, p1, Lx3/g;->f:Ls3/y;

    new-instance v1, Ls3/y$a;

    invoke-direct {v1, v0}, Ls3/y$a;-><init>(Ls3/y;)V

    iget-object v2, v0, Ls3/y;->e:Ld1/f;

    const-string v3, "Content-Type"

    const-wide/16 v4, -0x1

    const-string v6, "Content-Length"

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ld1/f;->B()Ls3/u;

    move-result-object v7

    if-eqz v7, :cond_0

    iget-object v7, v7, Ls3/u;->a:Ljava/lang/String;

    invoke-virtual {v1, v3, v7}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    :cond_0
    invoke-virtual {v2}, Ld1/f;->A()J

    move-result-wide v7

    const-string v2, "Transfer-Encoding"

    cmp-long v9, v7, v4

    if-eqz v9, :cond_1

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v1, v2}, Ls3/y$a;->d(Ljava/lang/String;)Ls3/y$a;

    goto :goto_0

    :cond_1
    const-string v7, "chunked"

    invoke-virtual {v1, v2, v7}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v1, v6}, Ls3/y$a;->d(Ljava/lang/String;)Ls3/y$a;

    :cond_2
    :goto_0
    const-string v2, "Host"

    invoke-virtual {v0, v2}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    if-nez v7, :cond_3

    iget-object v7, v0, Ls3/y;->b:Ls3/s;

    invoke-static {v7, v8}, Lt3/c;->y(Ls3/s;Z)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v2, v7}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    :cond_3
    const-string v2, "Connection"

    invoke-virtual {v0, v2}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    const-string v7, "Keep-Alive"

    invoke-virtual {v1, v2, v7}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    :cond_4
    const-string v2, "Accept-Encoding"

    invoke-virtual {v0, v2}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "gzip"

    const/4 v10, 0x1

    if-nez v7, :cond_5

    const-string v7, "Range"

    invoke-virtual {v0, v7}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_5

    invoke-virtual {v1, v2, v9}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    const/4 v2, 0x1

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    :goto_1
    iget-object v7, p0, Lx3/a;->a:Ls3/l;

    iget-object v11, v0, Ls3/y;->b:Ls3/s;

    invoke-interface {v7, v11}, Ls3/l;->a(Ls3/s;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    xor-int/2addr v10, v11

    if-eqz v10, :cond_9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v8, 0x1

    if-gez v8, :cond_6

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_6
    check-cast v11, Ls3/k;

    if-lez v8, :cond_7

    const-string v8, "; "

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_7
    iget-object v8, v11, Ls3/k;->a:Ljava/lang/String;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x3d

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v8, v11, Ls3/k;->b:Ljava/lang/String;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v8, v12

    goto :goto_2

    :cond_8
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "Cookie"

    invoke-virtual {v1, v8, v7}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    :cond_9
    const-string v7, "User-Agent"

    invoke-virtual {v0, v7}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_a

    const-string v8, "okhttp/4.9.3"

    invoke-virtual {v1, v7, v8}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    :cond_a
    invoke-virtual {v1}, Ls3/y$a;->a()Ls3/y;

    move-result-object v1

    invoke-virtual {p1, v1}, Lx3/g;->b(Ls3/y;)Ls3/b0;

    move-result-object p1

    iget-object v1, p0, Lx3/a;->a:Ls3/l;

    iget-object v7, v0, Ls3/y;->b:Ls3/s;

    iget-object v8, p1, Ls3/b0;->g:Ls3/r;

    invoke-static {v1, v7, v8}, Lx3/e;->b(Ls3/l;Ls3/s;Ls3/r;)V

    new-instance v1, Ls3/b0$a;

    invoke-direct {v1, p1}, Ls3/b0$a;-><init>(Ls3/b0;)V

    const-string v7, "request"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Ls3/b0$a;->a:Ls3/y;

    if-eqz v2, :cond_b

    const-string v0, "Content-Encoding"

    invoke-static {p1, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-static {p1}, Lx3/e;->a(Ls3/b0;)Z

    move-result v2

    if-eqz v2, :cond_b

    iget-object v2, p1, Ls3/b0;->h:Ls3/d0;

    if-eqz v2, :cond_b

    new-instance v7, Lf4/n;

    invoke-virtual {v2}, Ls3/d0;->c()Lf4/h;

    move-result-object v2

    invoke-direct {v7, v2}, Lf4/n;-><init>(Lf4/a0;)V

    iget-object v2, p1, Ls3/b0;->g:Ls3/r;

    invoke-virtual {v2}, Ls3/r;->s()Ls3/r$a;

    move-result-object v2

    invoke-virtual {v2, v0}, Ls3/r$a;->c(Ljava/lang/String;)Ls3/r$a;

    invoke-virtual {v2, v6}, Ls3/r$a;->c(Ljava/lang/String;)Ls3/r$a;

    invoke-virtual {v2}, Ls3/r$a;->b()Ls3/r;

    move-result-object v0

    invoke-virtual {v1, v0}, Ls3/b0$a;->d(Ls3/r;)Ls3/b0$a;

    invoke-static {p1, v3}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lx3/h;

    invoke-static {v7}, Ld1/d;->e(Lf4/a0;)Lf4/h;

    move-result-object v2

    invoke-direct {v0, p1, v4, v5, v2}, Lx3/h;-><init>(Ljava/lang/String;JLf4/h;)V

    iput-object v0, v1, Ls3/b0$a;->g:Ls3/d0;

    :cond_b
    invoke-virtual {v1}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object p1

    return-object p1
.end method
