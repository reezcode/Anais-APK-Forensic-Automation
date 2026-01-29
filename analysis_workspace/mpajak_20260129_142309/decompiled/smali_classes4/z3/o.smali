.class public final Lz3/o;
.super Ljava/lang/Object;

# interfaces
.implements Lx3/d;


# static fields
.field public static final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public volatile a:Lz3/q;

.field public final b:Ls3/x;

.field public volatile c:Z

.field public final d:Lw3/j;

.field public final e:Lx3/g;

.field public final f:Lz3/f;


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt3/c;->m([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lz3/o;->g:Ljava/util/List;

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lt3/c;->m([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lz3/o;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ls3/w;Lw3/j;Lx3/g;Lz3/f;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connection"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "http2Connection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz3/o;->d:Lw3/j;

    iput-object p3, p0, Lz3/o;->e:Lx3/g;

    iput-object p4, p0, Lz3/o;->f:Lz3/f;

    iget-object p1, p1, Ls3/w;->t:Ljava/util/List;

    sget-object p2, Ls3/x;->g:Ls3/x;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Ls3/x;->f:Ls3/x;

    :goto_0
    iput-object p2, p0, Lz3/o;->b:Ls3/x;

    return-void
.end method


# virtual methods
.method public final a(Ls3/y;)V
    .locals 14

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/o;->a:Lz3/q;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Ls3/y;->e:Ld1/f;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v3, "request"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p1, Ls3/y;->d:Ls3/r;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, v3, Ls3/r;->b:[Ljava/lang/String;

    array-length v5, v5

    div-int/lit8 v5, v5, 0x2

    add-int/lit8 v5, v5, 0x4

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v5, Lz3/c;

    sget-object v6, Lz3/c;->f:Lf4/i;

    iget-object v7, p1, Ls3/y;->c:Ljava/lang/String;

    invoke-direct {v5, v6, v7}, Lz3/c;-><init>(Lf4/i;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lz3/c;

    sget-object v6, Lz3/c;->g:Lf4/i;

    iget-object v7, p1, Ls3/y;->b:Ls3/s;

    const-string v8, "url"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Ls3/s;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Ls3/s;->d()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v8, 0x3f

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    :cond_2
    invoke-direct {v5, v6, v8}, Lz3/c;-><init>(Lf4/i;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v5, "Host"

    invoke-virtual {p1, v5}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    new-instance v6, Lz3/c;

    sget-object v7, Lz3/c;->i:Lf4/i;

    invoke-direct {v6, v7, v5}, Lz3/c;-><init>(Lf4/i;Ljava/lang/String;)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v5, Lz3/c;

    sget-object v6, Lz3/c;->h:Lf4/i;

    iget-object p1, p1, Ls3/y;->b:Ls3/s;

    iget-object p1, p1, Ls3/s;->b:Ljava/lang/String;

    invoke-direct {v5, v6, p1}, Lz3/c;-><init>(Lf4/i;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, v3, Ls3/r;->b:[Ljava/lang/String;

    array-length p1, p1

    div-int/lit8 p1, p1, 0x2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, p1, :cond_6

    invoke-virtual {v3, v5}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v8, "Locale.US"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v6, v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "(this as java.lang.String).toLowerCase(locale)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lz3/o;->g:Ljava/util/List;

    invoke-interface {v7, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const-string v7, "te"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-virtual {v3, v5}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v7

    const-string v8, "trailers"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    :cond_4
    new-instance v7, Lz3/c;

    invoke-virtual {v3, v5}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v6, v8}, Lz3/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lz3/o;->f:Lz3/f;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "requestHeaders"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v3, v0, 0x1

    const/4 v10, 0x0

    iget-object v5, p1, Lz3/f;->z:Lz3/r;

    monitor-enter v5

    :try_start_0
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget v6, p1, Lz3/f;->g:I

    const v7, 0x3fffffff    # 1.9999999f

    if-le v6, v7, :cond_7

    sget-object v6, Lz3/b;->g:Lz3/b;

    invoke-virtual {p1, v6}, Lz3/f;->l(Lz3/b;)V

    :cond_7
    iget-boolean v6, p1, Lz3/f;->h:Z

    if-nez v6, :cond_d

    iget v12, p1, Lz3/f;->g:I

    add-int/lit8 v6, v12, 0x2

    iput v6, p1, Lz3/f;->g:I

    new-instance v13, Lz3/q;

    const/4 v11, 0x0

    move-object v6, v13

    move v7, v12

    move-object v8, p1

    move v9, v3

    invoke-direct/range {v6 .. v11}, Lz3/q;-><init>(ILz3/f;ZZLs3/r;)V

    if-eqz v0, :cond_8

    iget-wide v6, p1, Lz3/f;->w:J

    iget-wide v8, p1, Lz3/f;->x:J

    cmp-long v0, v6, v8

    if-gez v0, :cond_8

    iget-wide v6, v13, Lz3/q;->c:J

    iget-wide v8, v13, Lz3/q;->d:J

    cmp-long v0, v6, v8

    if-ltz v0, :cond_9

    :cond_8
    const/4 v1, 0x1

    :cond_9
    invoke-virtual {v13}, Lz3/q;->i()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p1, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p1

    iget-object v0, p1, Lz3/f;->z:Lz3/r;

    invoke-virtual {v0, v3, v12, v4}, Lz3/r;->f(ZILjava/util/List;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v5

    if-eqz v1, :cond_b

    iget-object p1, p1, Lz3/f;->z:Lz3/r;

    invoke-virtual {p1}, Lz3/r;->flush()V

    :cond_b
    iput-object v13, p0, Lz3/o;->a:Lz3/q;

    iget-boolean p1, p0, Lz3/o;->c:Z

    if-nez p1, :cond_c

    iget-object p1, p0, Lz3/o;->a:Lz3/q;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p1, Lz3/q;->i:Lz3/q$c;

    iget-object v0, p0, Lz3/o;->e:Lx3/g;

    iget v0, v0, Lx3/g;->h:I

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    iget-object p1, p0, Lz3/o;->a:Lz3/q;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p1, Lz3/q;->j:Lz3/q$c;

    iget-object v0, p0, Lz3/o;->e:Lx3/g;

    iget v0, v0, Lx3/g;->i:I

    int-to-long v0, v0

    invoke-virtual {p1, v0, v1, v2}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    return-void

    :cond_c
    iget-object p1, p0, Lz3/o;->a:Lz3/q;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    sget-object v0, Lz3/b;->h:Lz3/b;

    invoke-virtual {p1, v0}, Lz3/q;->e(Lz3/b;)V

    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    :try_start_3
    new-instance v0, Lz3/a;

    invoke-direct {v0}, Lz3/a;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit p1

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v5

    throw p1
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Lz3/o;->a:Lz3/q;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lz3/q;->g()Lf4/y;

    move-result-object v0

    check-cast v0, Lz3/q$a;

    invoke-virtual {v0}, Lz3/q$a;->close()V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lz3/o;->f:Lz3/f;

    invoke-virtual {v0}, Lz3/f;->flush()V

    return-void
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz3/o;->c:Z

    iget-object v0, p0, Lz3/o;->a:Lz3/q;

    if-eqz v0, :cond_0

    sget-object v1, Lz3/b;->h:Lz3/b;

    invoke-virtual {v0, v1}, Lz3/q;->e(Lz3/b;)V

    :cond_0
    return-void
.end method

.method public final d(Ls3/y;J)Lf4/y;
    .locals 0

    const-string p2, "request"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz3/o;->a:Lz3/q;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lz3/q;->g()Lf4/y;

    move-result-object p1

    return-object p1
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
    invoke-static {p1}, Lt3/c;->l(Ls3/b0;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final f(Ls3/b0;)Lf4/a0;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lz3/o;->a:Lz3/q;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p1, Lz3/q;->g:Lz3/q$b;

    return-object p1
.end method

.method public final g(Z)Ls3/b0$a;
    .locals 12

    iget-object v0, p0, Lz3/o;->a:Lz3/q;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lz3/q;->i:Lz3/q$c;

    invoke-virtual {v1}, Lf4/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v1, v0, Lz3/q;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lz3/q;->k:Lz3/b;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lz3/q;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    :try_start_2
    iget-object v1, v0, Lz3/q;->i:Lz3/q$c;

    invoke-virtual {v1}, Lz3/q$c;->m()V

    iget-object v1, v0, Lz3/q;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_6

    iget-object v1, v0, Lz3/q;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "headersQueue.removeFirst()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ls3/r;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object v0, p0, Lz3/o;->b:Ls3/x;

    const-string v2, "headerBlock"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "protocol"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0x14

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v4, v1, Ls3/r;->b:[Ljava/lang/String;

    array-length v4, v4

    div-int/lit8 v4, v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, v5

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v4, :cond_3

    invoke-virtual {v1, v7}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v7}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, ":status"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    sget-object v8, Lx3/j;->d:Lx3/j$a;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "HTTP/1.1 "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Lx3/j$a;->a(Ljava/lang/String;)Lx3/j;

    move-result-object v8

    goto :goto_2

    :cond_1
    sget-object v11, Lz3/o;->h:Ljava/util/List;

    invoke-interface {v11, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    const-string v11, "name"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "value"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    if-eqz v8, :cond_5

    new-instance v1, Ls3/b0$a;

    invoke-direct {v1}, Ls3/b0$a;-><init>()V

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v1, Ls3/b0$a;->b:Ls3/x;

    iget v0, v8, Lx3/j;->b:I

    iput v0, v1, Ls3/b0$a;->c:I

    iget-object v0, v8, Lx3/j;->c:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ls3/b0$a;->e(Ljava/lang/String;)Ls3/b0$a;

    new-instance v0, Ls3/r;

    new-array v2, v6, [Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-static {v2, v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v2, [Ljava/lang/String;

    invoke-direct {v0, v2}, Ls3/r;-><init>([Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ls3/b0$a;->d(Ls3/r;)Ls3/b0$a;

    if-eqz p1, :cond_4

    iget p1, v1, Ls3/b0$a;->c:I

    const/16 v0, 0x64

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v5, v1

    :goto_3
    return-object v5

    :cond_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :try_start_3
    iget-object p1, v0, Lz3/q;->l:Ljava/io/IOException;

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    new-instance p1, Lz3/v;

    iget-object v1, v0, Lz3/q;->k:Lz3/b;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {p1, v1}, Lz3/v;-><init>(Lz3/b;)V

    :goto_4
    throw p1

    :catchall_0
    move-exception p1

    iget-object v1, v0, Lz3/q;->i:Lz3/q$c;

    invoke-virtual {v1}, Lz3/q$c;->m()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final h()Lw3/j;
    .locals 1

    iget-object v0, p0, Lz3/o;->d:Lw3/j;

    return-object v0
.end method
