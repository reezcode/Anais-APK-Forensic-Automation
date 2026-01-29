.class public final Lw3/j;
.super Lz3/f$d;

# interfaces
.implements Ls3/i;


# instance fields
.field public b:Ljava/net/Socket;

.field public c:Ljava/net/Socket;

.field public d:Ls3/q;

.field public e:Ls3/x;

.field public f:Lz3/f;

.field public g:Lf4/u;

.field public h:Lf4/t;

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public final o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lw3/e;",
            ">;>;"
        }
    .end annotation
.end field

.field public p:J

.field public final q:Ls3/e0;


# direct methods
.method public constructor <init>(Lw3/l;Ls3/e0;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "route"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lz3/f$d;-><init>()V

    iput-object p2, p0, Lw3/j;->q:Ls3/e0;

    const/4 p1, 0x1

    iput p1, p0, Lw3/j;->n:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lw3/j;->o:Ljava/util/ArrayList;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lw3/j;->p:J

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lz3/f;Lz3/u;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p1, p2, Lz3/u;->a:I

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_0

    iget-object p1, p2, Lz3/u;->b:[I

    const/4 p2, 0x4

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    :goto_0
    iput p1, p0, Lw3/j;->n:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(Lz3/q;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lz3/b;->g:Lz3/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lz3/q;->c(Lz3/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final c(IIIIZLs3/d;Ls3/o;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    const-string v10, "proxy"

    const-string v11, "inetSocketAddress"

    const-string v12, "call"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lw3/j;->e:Ls3/x;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_15

    iget-object v0, v7, Lw3/j;->q:Ls3/e0;

    iget-object v0, v0, Ls3/e0;->a:Ls3/a;

    iget-object v0, v0, Ls3/a;->c:Ljava/util/List;

    new-instance v13, Lw3/b;

    invoke-direct {v13, v0}, Lw3/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->a:Ls3/a;

    iget-object v2, v1, Ls3/a;->f:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v2, :cond_3

    sget-object v1, Ls3/j;->f:Ls3/j;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v7, Lw3/j;->q:Ls3/e0;

    iget-object v0, v0, Ls3/e0;->a:Ls3/a;

    iget-object v0, v0, Ls3/a;->a:Ls3/s;

    iget-object v0, v0, Ls3/s;->e:Ljava/lang/String;

    sget-object v1, La4/h;->c:La4/h$a;

    sget-object v1, La4/h;->a:La4/h;

    invoke-virtual {v1, v0}, La4/h;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lw3/n;

    new-instance v2, Ljava/net/UnknownServiceException;

    const-string v3, "CLEARTEXT communication to "

    const-string v4, " not permitted by network security policy"

    invoke-static {v3, v0, v4}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lw3/n;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_2
    new-instance v0, Lw3/n;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lw3/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_3
    iget-object v0, v1, Ls3/a;->b:Ljava/util/List;

    sget-object v1, Ls3/x;->g:Ls3/x;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :goto_1
    const/4 v14, 0x0

    move-object v15, v14

    :goto_2
    :try_start_0
    iget-object v0, v7, Lw3/j;->q:Ls3/e0;

    iget-object v1, v0, Ls3/e0;->a:Ls3/a;

    iget-object v1, v1, Ls3/a;->f:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_4

    iget-object v0, v0, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_6

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-virtual/range {v1 .. v6}, Lw3/j;->f(IIILs3/d;Ls3/o;)V

    iget-object v0, v7, Lw3/j;->b:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_5

    goto :goto_6

    :cond_5
    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_5

    :goto_4
    move/from16 v1, p1

    move/from16 v2, p2

    goto :goto_9

    :cond_6
    move/from16 v1, p1

    move/from16 v2, p2

    :try_start_1
    invoke-virtual {v7, v1, v2, v8, v9}, Lw3/j;->e(IILs3/d;Ls3/o;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_5
    move/from16 v3, p4

    :try_start_2
    invoke-virtual {v7, v13, v3, v8, v9}, Lw3/j;->g(Lw3/b;ILs3/d;Ls3/o;)V

    iget-object v0, v7, Lw3/j;->q:Ls3/e0;

    iget-object v4, v0, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    iget-object v0, v0, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-static/range {p7 .. p7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_6
    iget-object v0, v7, Lw3/j;->q:Ls3/e0;

    iget-object v1, v0, Ls3/e0;->a:Ls3/a;

    iget-object v1, v1, Ls3/a;->f:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_7

    iget-object v0, v0, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_7

    const/4 v0, 0x1

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    :goto_7
    if-eqz v0, :cond_9

    iget-object v0, v7, Lw3/j;->b:Ljava/net/Socket;

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    new-instance v0, Lw3/n;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lw3/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_9
    :goto_8
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, Lw3/j;->p:J

    return-void

    :catch_0
    move-exception v0

    goto :goto_a

    :catch_1
    move-exception v0

    :goto_9
    move/from16 v3, p4

    goto :goto_a

    :catch_2
    move-exception v0

    goto :goto_4

    :goto_a
    iget-object v4, v7, Lw3/j;->c:Ljava/net/Socket;

    if-eqz v4, :cond_a

    invoke-static {v4}, Lt3/c;->e(Ljava/net/Socket;)V

    :cond_a
    iget-object v4, v7, Lw3/j;->b:Ljava/net/Socket;

    if-eqz v4, :cond_b

    invoke-static {v4}, Lt3/c;->e(Ljava/net/Socket;)V

    :cond_b
    iput-object v14, v7, Lw3/j;->c:Ljava/net/Socket;

    iput-object v14, v7, Lw3/j;->b:Ljava/net/Socket;

    iput-object v14, v7, Lw3/j;->g:Lf4/u;

    iput-object v14, v7, Lw3/j;->h:Lf4/t;

    iput-object v14, v7, Lw3/j;->d:Ls3/q;

    iput-object v14, v7, Lw3/j;->e:Ls3/x;

    iput-object v14, v7, Lw3/j;->f:Lz3/f;

    const/4 v4, 0x1

    iput v4, v7, Lw3/j;->n:I

    iget-object v4, v7, Lw3/j;->q:Ls3/e0;

    iget-object v5, v4, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    iget-object v4, v4, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-static/range {p7 .. p7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "ioe"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "e"

    if-nez v15, :cond_c

    new-instance v15, Lw3/n;

    invoke-direct {v15, v0}, Lw3/n;-><init>(Ljava/io/IOException;)V

    goto :goto_b

    :cond_c
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v15, Lw3/n;->c:Ljava/io/IOException;

    invoke-static {v5, v0}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object v0, v15, Lw3/n;->b:Ljava/io/IOException;

    :goto_b
    if-eqz p5, :cond_13

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x1

    iput-boolean v4, v13, Lw3/b;->c:Z

    iget-boolean v4, v13, Lw3/b;->b:Z

    if-nez v4, :cond_d

    goto :goto_c

    :cond_d
    instance-of v4, v0, Ljava/net/ProtocolException;

    if-eqz v4, :cond_e

    goto :goto_c

    :cond_e
    instance-of v4, v0, Ljava/io/InterruptedIOException;

    if-eqz v4, :cond_f

    goto :goto_c

    :cond_f
    instance-of v4, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v4, :cond_10

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v4

    instance-of v4, v4, Ljava/security/cert/CertificateException;

    if-eqz v4, :cond_10

    goto :goto_c

    :cond_10
    instance-of v4, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz v4, :cond_11

    goto :goto_c

    :cond_11
    instance-of v0, v0, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_d

    :cond_12
    :goto_c
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_13

    goto/16 :goto_2

    :cond_13
    throw v15

    :cond_14
    new-instance v0, Lw3/n;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lw3/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d(Ls3/w;Ls3/e0;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failedRoute"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    iget-object v0, p2, Ls3/e0;->a:Ls3/a;

    iget-object v1, v0, Ls3/a;->k:Ljava/net/ProxySelector;

    iget-object v0, v0, Ls3/a;->a:Ls3/s;

    invoke-virtual {v0}, Ls3/s;->h()Ljava/net/URI;

    move-result-object v0

    iget-object v2, p2, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p3}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    iget-object p1, p1, Ls3/w;->D:Lw3/m;

    monitor-enter p1

    :try_start_0
    const-string p3, "failedRoute"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p1, Lw3/m;->a:Ljava/util/LinkedHashSet;

    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final e(IILs3/d;Ls3/o;)V
    .locals 4

    iget-object v0, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v0, Ls3/e0;->b:Ljava/net/Proxy;

    iget-object v0, v0, Ls3/e0;->a:Ls3/a;

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Lw3/f;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    :goto_0
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    iget-object v0, v0, Ls3/a;->e:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_1
    iput-object v0, p0, Lw3/j;->b:Ljava/net/Socket;

    iget-object v2, p0, Lw3/j;->q:Ls3/e0;

    iget-object v2, v2, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "call"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "inetSocketAddress"

    invoke-static {v2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "proxy"

    invoke-static {v1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, La4/h;->c:La4/h$a;

    sget-object p2, La4/h;->a:La4/h;

    iget-object p3, p0, Lw3/j;->q:Ls3/e0;

    iget-object p3, p3, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p2, v0, p3, p1}, La4/h;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v0}, Ld1/d;->n(Ljava/net/Socket;)Lf4/a0;

    move-result-object p1

    invoke-static {p1}, Ld1/d;->e(Lf4/a0;)Lf4/h;

    move-result-object p1

    check-cast p1, Lf4/u;

    iput-object p1, p0, Lw3/j;->g:Lf4/u;

    invoke-static {v0}, Ld1/d;->m(Ljava/net/Socket;)Lf4/y;

    move-result-object p1

    invoke-static {p1}, Ld1/d;->d(Lf4/y;)Lf4/g;

    move-result-object p1

    check-cast p1, Lf4/t;

    iput-object p1, p0, Lw3/j;->h:Lf4/t;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    const-string p3, "Failed to connect to "

    invoke-static {p3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    iget-object p4, p0, Lw3/j;->q:Ls3/e0;

    iget-object p4, p4, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final f(IIILs3/d;Ls3/o;)V
    .locals 14

    move-object v0, p0

    move/from16 v1, p2

    new-instance v2, Ls3/y$a;

    invoke-direct {v2}, Ls3/y$a;-><init>()V

    iget-object v3, v0, Lw3/j;->q:Ls3/e0;

    iget-object v3, v3, Ls3/e0;->a:Ls3/a;

    iget-object v3, v3, Ls3/a;->a:Ls3/s;

    invoke-virtual {v2, v3}, Ls3/y$a;->f(Ls3/s;)Ls3/y$a;

    const-string v3, "CONNECT"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ls3/y$a;->c(Ljava/lang/String;Ld1/f;)Ls3/y$a;

    iget-object v3, v0, Lw3/j;->q:Ls3/e0;

    iget-object v3, v3, Ls3/e0;->a:Ls3/a;

    iget-object v3, v3, Ls3/a;->a:Ls3/s;

    const/4 v5, 0x1

    invoke-static {v3, v5}, Lt3/c;->y(Ls3/s;Z)Ljava/lang/String;

    move-result-object v3

    const-string v6, "Host"

    invoke-virtual {v2, v6, v3}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    const-string v3, "Proxy-Connection"

    const-string v6, "Keep-Alive"

    invoke-virtual {v2, v3, v6}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    const-string v3, "User-Agent"

    const-string v6, "okhttp/4.9.3"

    invoke-virtual {v2, v3, v6}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v2}, Ls3/y$a;->a()Ls3/y;

    move-result-object v2

    new-instance v3, Ls3/b0$a;

    invoke-direct {v3}, Ls3/b0$a;-><init>()V

    const-string v6, "request"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v3, Ls3/b0$a;->a:Ls3/y;

    sget-object v7, Ls3/x;->d:Ls3/x;

    const-string v8, "protocol"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v3, Ls3/b0$a;->b:Ls3/x;

    const/16 v7, 0x197

    iput v7, v3, Ls3/b0$a;->c:I

    const-string v8, "Preemptive Authenticate"

    const-string v9, "message"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v8, v3, Ls3/b0$a;->d:Ljava/lang/String;

    sget-object v8, Lt3/c;->c:Ls3/c0;

    iput-object v8, v3, Ls3/b0$a;->g:Ls3/d0;

    const-wide/16 v8, -0x1

    iput-wide v8, v3, Ls3/b0$a;->k:J

    iput-wide v8, v3, Ls3/b0$a;->l:J

    const-string v10, "Proxy-Authenticate"

    const-string v11, "name"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "OkHttp-Preemptive"

    const-string v12, "value"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v3, Ls3/b0$a;->f:Ls3/r$a;

    invoke-virtual {v12, v10, v11}, Ls3/r$a;->d(Ljava/lang/String;Ljava/lang/String;)Ls3/r$a;

    invoke-virtual {v3}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object v3

    iget-object v10, v0, Lw3/j;->q:Ls3/e0;

    iget-object v11, v10, Ls3/e0;->a:Ls3/a;

    iget-object v11, v11, Ls3/a;->i:Ls3/b;

    invoke-interface {v11, v10, v3}, Ls3/b;->a(Ls3/e0;Ls3/b0;)V

    iget-object v3, v2, Ls3/y;->b:Ls3/s;

    move v10, p1

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    invoke-virtual {p0, p1, v1, v11, v12}, Lw3/j;->e(IILs3/d;Ls3/o;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "CONNECT "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v5}, Lt3/c;->y(Ls3/s;Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " HTTP/1.1"

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, Lw3/j;->g:Lf4/u;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v10, v0, Lw3/j;->h:Lf4/t;

    invoke-static {v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v11, Ly3/b;

    invoke-direct {v11, v4, p0, v5, v10}, Ly3/b;-><init>(Ls3/w;Lw3/j;Lf4/h;Lf4/g;)V

    invoke-virtual {v5}, Lf4/u;->i()Lf4/b0;

    move-result-object v4

    int-to-long v12, v1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v12, v13, v1}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    invoke-virtual {v10}, Lf4/t;->i()Lf4/b0;

    move-result-object v4

    move/from16 v12, p3

    int-to-long v12, v12

    invoke-virtual {v4, v12, v13, v1}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    iget-object v1, v2, Ls3/y;->d:Ls3/r;

    invoke-virtual {v11, v1, v3}, Ly3/b;->k(Ls3/r;Ljava/lang/String;)V

    iget-object v1, v11, Ly3/b;->g:Lf4/g;

    invoke-interface {v1}, Lf4/g;->flush()V

    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Ly3/b;->g(Z)Ls3/b0$a;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v1, Ls3/b0$a;->a:Ls3/y;

    invoke-virtual {v1}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object v1

    const-string v2, "response"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lt3/c;->l(Ls3/b0;)J

    move-result-wide v2

    cmp-long v4, v2, v8

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v2, v3}, Ly3/b;->j(J)Lf4/a0;

    move-result-object v2

    const v3, 0x7fffffff

    invoke-static {v2, v3}, Lt3/c;->v(Lf4/a0;I)Z

    check-cast v2, Ly3/b$d;

    invoke-virtual {v2}, Ly3/b$d;->close()V

    :goto_0
    iget v2, v1, Ls3/b0;->e:I

    const/16 v3, 0xc8

    if-eq v2, v3, :cond_2

    if-ne v2, v7, :cond_1

    iget-object v2, v0, Lw3/j;->q:Ls3/e0;

    iget-object v3, v2, Ls3/e0;->a:Ls3/a;

    iget-object v3, v3, Ls3/a;->i:Ls3/b;

    invoke-interface {v3, v2, v1}, Ls3/b;->a(Ls3/e0;Ls3/b0;)V

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to authenticate with proxy"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v2, Ljava/io/IOException;

    const-string v3, "Unexpected response code for CONNECT: "

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v1, v1, Ls3/b0;->e:I

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_2
    iget-object v1, v5, Lf4/u;->b:Lf4/f;

    invoke-virtual {v1}, Lf4/f;->B()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v10, Lf4/t;->b:Lf4/f;

    invoke-virtual {v1}, Lf4/f;->B()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TLS tunnel buffered too many bytes!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final g(Lw3/b;ILs3/d;Ls3/o;)V
    .locals 11

    sget-object v0, Ls3/x;->d:Ls3/x;

    iget-object v1, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->a:Ls3/a;

    iget-object v2, v1, Ls3/a;->f:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v2, :cond_1

    iget-object p1, v1, Ls3/a;->b:Ljava/util/List;

    sget-object p3, Ls3/x;->g:Ls3/x;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lw3/j;->b:Ljava/net/Socket;

    iput-object p1, p0, Lw3/j;->c:Ljava/net/Socket;

    iput-object p3, p0, Lw3/j;->e:Ls3/x;

    invoke-virtual {p0, p2}, Lw3/j;->m(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lw3/j;->b:Ljava/net/Socket;

    iput-object p1, p0, Lw3/j;->c:Ljava/net/Socket;

    iput-object v0, p0, Lw3/j;->e:Ls3/x;

    return-void

    :cond_1
    invoke-static {p4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "call"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->a:Ls3/a;

    iget-object v2, v1, Ls3/a;->f:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, p0, Lw3/j;->b:Ljava/net/Socket;

    iget-object v5, v1, Ls3/a;->a:Ls3/s;

    iget-object v6, v5, Ls3/s;->e:Ljava/lang/String;

    iget v5, v5, Ls3/s;->f:I

    const/4 v7, 0x1

    invoke-virtual {v2, v4, v6, v5, v7}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v2

    if-eqz v2, :cond_9

    check-cast v2, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v2}, Lw3/b;->a(Ljavax/net/ssl/SSLSocket;)Ls3/j;

    move-result-object p1

    iget-boolean v4, p1, Ls3/j;->b:Z

    if-eqz v4, :cond_2

    sget-object v4, La4/h;->c:La4/h$a;

    sget-object v4, La4/h;->a:La4/h;

    iget-object v5, v1, Ls3/a;->a:Ls3/s;

    iget-object v5, v5, Ls3/s;->e:Ljava/lang/String;

    iget-object v6, v1, Ls3/a;->b:Ljava/util/List;

    invoke-virtual {v4, v2, v5, v6}, La4/h;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_2
    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v2}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v4

    sget-object v5, Ls3/q;->e:Ls3/q$a;

    const-string v6, "sslSocketSession"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ls3/q$a;->a(Ljavax/net/ssl/SSLSession;)Ls3/q;

    move-result-object v5

    iget-object v6, v1, Ls3/a;->g:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v8, v1, Ls3/a;->a:Ls3/s;

    iget-object v8, v8, Ls3/s;->e:Ljava/lang/String;

    invoke-interface {v6, v8, v4}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v5}, Ls3/q;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    xor-int/2addr p2, v7

    if-eqz p2, :cond_4

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "\n              |Hostname "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, v1, Ls3/a;->a:Ls3/s;

    iget-object p4, p4, Ls3/s;->e:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " not verified:\n              |    certificate: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p4, Ls3/f;->d:Ls3/f$a;

    invoke-virtual {p4, p1}, Ls3/f$a;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "\n              |    DN: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p4

    const-string v0, "cert.subjectDN"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p4}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "\n              |    subjectAltNames: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p4, Ld4/c;->a:Ld4/c;

    const-string v0, "certificate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x7

    invoke-virtual {p4, p1, v0}, Ld4/c;->b(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {p4, p1, v1}, Ld4/c;->b(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt;->C(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Hostname "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, v1, Ls3/a;->a:Ls3/s;

    iget-object p3, p3, Ls3/s;->e:Ljava/lang/String;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not verified (no certificates)"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object v4, v1, Ls3/a;->h:Ls3/f;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v6, Ls3/q;

    iget-object v7, v5, Ls3/q;->b:Ls3/f0;

    iget-object v8, v5, Ls3/q;->c:Ls3/h;

    iget-object v9, v5, Ls3/q;->d:Ljava/util/List;

    new-instance v10, Lw3/g;

    invoke-direct {v10, v4, v5, v1}, Lw3/g;-><init>(Ls3/f;Ls3/q;Ls3/a;)V

    invoke-direct {v6, v7, v8, v9, v10}, Ls3/q;-><init>(Ls3/f0;Ls3/h;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V

    iput-object v6, p0, Lw3/j;->d:Ls3/q;

    iget-object v1, v1, Ls3/a;->a:Ls3/s;

    iget-object v1, v1, Ls3/s;->e:Ljava/lang/String;

    new-instance v5, Lw3/h;

    invoke-direct {v5, p0}, Lw3/h;-><init>(Lw3/j;)V

    invoke-virtual {v4, v1, v5}, Ls3/f;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    iget-boolean p1, p1, Ls3/j;->b:Z

    if-eqz p1, :cond_6

    sget-object p1, La4/h;->c:La4/h$a;

    sget-object p1, La4/h;->a:La4/h;

    invoke-virtual {p1, v2}, La4/h;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v3

    :cond_6
    iput-object v2, p0, Lw3/j;->c:Ljava/net/Socket;

    invoke-static {v2}, Ld1/d;->n(Ljava/net/Socket;)Lf4/a0;

    move-result-object p1

    invoke-static {p1}, Ld1/d;->e(Lf4/a0;)Lf4/h;

    move-result-object p1

    check-cast p1, Lf4/u;

    iput-object p1, p0, Lw3/j;->g:Lf4/u;

    invoke-static {v2}, Ld1/d;->m(Ljava/net/Socket;)Lf4/y;

    move-result-object p1

    invoke-static {p1}, Ld1/d;->d(Lf4/y;)Lf4/g;

    move-result-object p1

    check-cast p1, Lf4/t;

    iput-object p1, p0, Lw3/j;->h:Lf4/t;

    if-eqz v3, :cond_7

    sget-object p1, Ls3/x;->j:Ls3/x$a;

    invoke-virtual {p1, v3}, Ls3/x$a;->a(Ljava/lang/String;)Ls3/x;

    move-result-object v0

    :cond_7
    iput-object v0, p0, Lw3/j;->e:Ls3/x;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, La4/h;->c:La4/h$a;

    sget-object p1, La4/h;->a:La4/h;

    invoke-virtual {p1, v2}, La4/h;->a(Ljavax/net/ssl/SSLSocket;)V

    invoke-static {p3, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lw3/j;->e:Ls3/x;

    sget-object p3, Ls3/x;->f:Ls3/x;

    if-ne p1, p3, :cond_8

    invoke-virtual {p0, p2}, Lw3/j;->m(I)V

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    move-object v3, v2

    goto :goto_0

    :cond_9
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v3, :cond_a

    sget-object p2, La4/h;->c:La4/h$a;

    sget-object p2, La4/h;->a:La4/h;

    invoke-virtual {p2, v3}, La4/h;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_a
    if-eqz v3, :cond_b

    invoke-static {v3}, Lt3/c;->e(Ljava/net/Socket;)V

    :cond_b
    throw p1
.end method

.method public final h(Ls3/a;Ljava/util/List;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/a;",
            "Ljava/util/List<",
            "Ls3/e0;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt3/c;->a:[B

    iget-object v0, p0, Lw3/j;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lw3/j;->n:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_f

    iget-boolean v0, p0, Lw3/j;->i:Z

    if-eqz v0, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Lw3/j;->q:Ls3/e0;

    iget-object v0, v0, Ls3/e0;->a:Ls3/a;

    invoke-virtual {v0, p1}, Ls3/a;->a(Ls3/a;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p1, Ls3/a;->a:Ls3/s;

    iget-object v0, v0, Ls3/s;->e:Ljava/lang/String;

    iget-object v1, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->a:Ls3/a;

    iget-object v1, v1, Ls3/a;->a:Ls3/s;

    iget-object v1, v1, Ls3/s;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    return v1

    :cond_2
    iget-object v0, p0, Lw3/j;->f:Lz3/f;

    if-nez v0, :cond_3

    return v2

    :cond_3
    if-eqz p2, :cond_f

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ls3/e0;

    iget-object v3, v0, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v3, v4, :cond_6

    iget-object v3, p0, Lw3/j;->q:Ls3/e0;

    iget-object v3, v3, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v3}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v3

    sget-object v4, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v3, v4, :cond_6

    iget-object v3, p0, Lw3/j;->q:Ls3/e0;

    iget-object v3, v3, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    iget-object v0, v0, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_5

    const/4 p2, 0x1

    goto :goto_2

    :cond_7
    :goto_1
    const/4 p2, 0x0

    :goto_2
    if-nez p2, :cond_8

    goto/16 :goto_7

    :cond_8
    iget-object p2, p1, Ls3/a;->g:Ljavax/net/ssl/HostnameVerifier;

    sget-object v0, Ld4/c;->a:Ld4/c;

    if-eq p2, v0, :cond_9

    return v2

    :cond_9
    iget-object p2, p1, Ls3/a;->a:Ls3/s;

    sget-object v3, Lt3/c;->a:[B

    iget-object v3, p0, Lw3/j;->q:Ls3/e0;

    iget-object v3, v3, Ls3/e0;->a:Ls3/a;

    iget-object v3, v3, Ls3/a;->a:Ls3/s;

    iget v4, p2, Ls3/s;->f:I

    iget v5, v3, Ls3/s;->f:I

    if-eq v4, v5, :cond_a

    goto :goto_5

    :cond_a
    iget-object v4, p2, Ls3/s;->e:Ljava/lang/String;

    iget-object v3, v3, Ls3/s;->e:Ljava/lang/String;

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    iget-boolean v3, p0, Lw3/j;->j:Z

    if-nez v3, :cond_d

    iget-object v3, p0, Lw3/j;->d:Ls3/q;

    if-eqz v3, :cond_d

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ls3/q;->b()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v1

    if-eqz v4, :cond_c

    iget-object p2, p2, Ls3/s;->e:Ljava/lang/String;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-static {v3, v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v3, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p2, v3}, Ld4/c;->d(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p2

    if-eqz p2, :cond_c

    const/4 p2, 0x1

    goto :goto_3

    :cond_c
    const/4 p2, 0x0

    :goto_3
    if-eqz p2, :cond_d

    :goto_4
    const/4 p2, 0x1

    goto :goto_6

    :cond_d
    :goto_5
    const/4 p2, 0x0

    :goto_6
    if-nez p2, :cond_e

    return v2

    :cond_e
    :try_start_0
    iget-object p2, p1, Ls3/a;->h:Ls3/f;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p1, p1, Ls3/a;->a:Ls3/s;

    iget-object p1, p1, Ls3/s;->e:Ljava/lang/String;

    iget-object v0, p0, Lw3/j;->d:Ls3/q;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ls3/q;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "hostname"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "peerCertificates"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ls3/g;

    invoke-direct {v3, p2, v0, p1}, Ls3/g;-><init>(Ls3/f;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p2, p1, v3}, Ls3/f;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_f
    :goto_7
    return v2
.end method

.method public final i(Z)Z
    .locals 9

    sget-object v0, Lt3/c;->a:[B

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lw3/j;->b:Ljava/net/Socket;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lw3/j;->c:Ljava/net/Socket;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, p0, Lw3/j;->g:Lf4/u;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    iget-object v2, p0, Lw3/j;->f:Lz3/f;

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    monitor-enter v2

    :try_start_0
    iget-boolean p1, v2, Lz3/f;->h:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iget-wide v3, v2, Lz3/f;->q:J

    iget-wide v7, v2, Lz3/f;->p:J

    cmp-long p1, v3, v7

    if-gez p1, :cond_2

    iget-wide v3, v2, Lz3/f;->r:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long p1, v0, v3

    if-ltz p1, :cond_2

    :goto_0
    monitor-exit v2

    goto :goto_1

    :cond_2
    monitor-exit v2

    const/4 v5, 0x1

    :goto_1
    return v5

    :catchall_0
    move-exception p1

    monitor-exit v2

    throw p1

    :cond_3
    monitor-enter p0

    :try_start_1
    iget-wide v7, p0, Lw3/j;->p:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    sub-long/2addr v0, v7

    monitor-exit p0

    const-wide v7, 0x2540be400L

    cmp-long v2, v0, v7

    if-ltz v2, :cond_4

    if-eqz p1, :cond_4

    const-string p1, "$this$isHealthy"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "source"

    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_2
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_2
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v4}, Lf4/u;->B()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    xor-int/2addr v0, v6

    :try_start_4
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    move v5, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v0
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_0
    const/4 v5, 0x1

    :catch_1
    :goto_2
    return v5

    :cond_4
    return v6

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_3
    return v5
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, Lw3/j;->f:Lz3/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k(Ls3/w;Lx3/g;)Lx3/d;
    .locals 6

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw3/j;->c:Ljava/net/Socket;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lw3/j;->g:Lf4/u;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lw3/j;->h:Lf4/t;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lw3/j;->f:Lz3/f;

    if-eqz v3, :cond_0

    new-instance v0, Lz3/o;

    invoke-direct {v0, p1, p0, p2, v3}, Lz3/o;-><init>(Ls3/w;Lw3/j;Lx3/g;Lz3/f;)V

    goto :goto_0

    :cond_0
    iget v3, p2, Lx3/g;->h:I

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v1}, Lf4/u;->i()Lf4/b0;

    move-result-object v0

    iget v3, p2, Lx3/g;->h:I

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    invoke-virtual {v2}, Lf4/t;->i()Lf4/b0;

    move-result-object v0

    iget p2, p2, Lx3/g;->i:I

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    new-instance v0, Ly3/b;

    invoke-direct {v0, p1, p0, v1, v2}, Ly3/b;-><init>(Ls3/w;Lw3/j;Lf4/h;Lf4/g;)V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized l()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lw3/j;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final m(I)V
    .locals 10

    iget-object v0, p0, Lw3/j;->c:Ljava/net/Socket;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lw3/j;->g:Lf4/u;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, Lw3/j;->h:Lf4/t;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, Lz3/f$b;

    sget-object v5, Lv3/d;->h:Lv3/d;

    invoke-direct {v4, v5}, Lz3/f$b;-><init>(Lv3/d;)V

    iget-object v6, p0, Lw3/j;->q:Ls3/e0;

    iget-object v6, v6, Ls3/e0;->a:Ls3/a;

    iget-object v6, v6, Ls3/a;->a:Ls3/s;

    iget-object v6, v6, Ls3/s;->e:Ljava/lang/String;

    const-string v7, "socket"

    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "peerName"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "source"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "sink"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, v4, Lz3/f$b;->a:Ljava/net/Socket;

    iget-boolean v0, v4, Lz3/f$b;->h:Z

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lt3/c;->g:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v0, "MockWebServer "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lz3/f$b;->b:Ljava/lang/String;

    iput-object v1, v4, Lz3/f$b;->c:Lf4/h;

    iput-object v2, v4, Lz3/f$b;->d:Lf4/g;

    const-string v0, "listener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, v4, Lz3/f$b;->e:Lz3/f$d;

    iput p1, v4, Lz3/f$b;->g:I

    new-instance p1, Lz3/f;

    invoke-direct {p1, v4}, Lz3/f;-><init>(Lz3/f$b;)V

    iput-object p1, p0, Lw3/j;->f:Lz3/f;

    sget-object v0, Lz3/f;->D:Lz3/f$c;

    sget-object v0, Lz3/f;->C:Lz3/u;

    iget v1, v0, Lz3/u;->a:I

    and-int/lit8 v1, v1, 0x10

    const/4 v2, 0x4

    if-eqz v1, :cond_1

    iget-object v0, v0, Lz3/u;->b:[I

    aget v0, v0, v2

    goto :goto_1

    :cond_1
    const v0, 0x7fffffff

    :goto_1
    iput v0, p0, Lw3/j;->n:I

    const-string v0, "taskRunner"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz3/f;->z:Lz3/r;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lz3/r;->d:Z

    if-nez v1, :cond_b

    iget-boolean v1, v0, Lz3/r;->g:Z

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    sget-object v1, Lz3/r;->h:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v1, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ">> CONNECTION "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Lz3/e;->a:Lf4/i;

    invoke-virtual {v6}, Lf4/i;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v6, v3, [Ljava/lang/Object;

    invoke-static {v4, v6}, Lt3/c;->j(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_3
    iget-object v1, v0, Lz3/r;->f:Lf4/g;

    sget-object v4, Lz3/e;->a:Lf4/i;

    invoke-interface {v1, v4}, Lf4/g;->X(Lf4/i;)Lf4/g;

    iget-object v1, v0, Lz3/r;->f:Lf4/g;

    invoke-interface {v1}, Lf4/g;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_2
    monitor-exit v0

    iget-object v0, p1, Lz3/f;->z:Lz3/r;

    iget-object v1, p1, Lz3/f;->s:Lz3/u;

    monitor-enter v0

    :try_start_1
    const-string v4, "settings"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v4, v0, Lz3/r;->d:Z

    if-nez v4, :cond_a

    iget v4, v1, Lz3/u;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->bitCount(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x6

    invoke-virtual {v0, v3, v4, v2, v3}, Lz3/r;->c(IIII)V

    const/16 v4, 0xa

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v4, :cond_8

    const/4 v7, 0x1

    shl-int v8, v7, v6

    iget v9, v1, Lz3/u;->a:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_4

    goto :goto_4

    :cond_4
    const/4 v7, 0x0

    :goto_4
    if-nez v7, :cond_5

    goto :goto_6

    :cond_5
    if-eq v6, v2, :cond_7

    const/4 v7, 0x7

    if-eq v6, v7, :cond_6

    move v7, v6

    goto :goto_5

    :cond_6
    const/4 v7, 0x4

    goto :goto_5

    :cond_7
    const/4 v7, 0x3

    :goto_5
    iget-object v8, v0, Lz3/r;->f:Lf4/g;

    invoke-interface {v8, v7}, Lf4/g;->o(I)Lf4/g;

    iget-object v7, v0, Lz3/r;->f:Lf4/g;

    iget-object v8, v1, Lz3/u;->b:[I

    aget v8, v8, v6

    invoke-interface {v7, v8}, Lf4/g;->t(I)Lf4/g;

    :goto_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_8
    iget-object v1, v0, Lz3/r;->f:Lf4/g;

    invoke-interface {v1}, Lf4/g;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v0, p1, Lz3/f;->s:Lz3/u;

    invoke-virtual {v0}, Lz3/u;->a()I

    move-result v0

    const v1, 0xffff

    if-eq v0, v1, :cond_9

    iget-object v2, p1, Lz3/f;->z:Lz3/r;

    sub-int/2addr v0, v1

    int-to-long v0, v0

    invoke-virtual {v2, v3, v0, v1}, Lz3/r;->p(IJ)V

    :cond_9
    invoke-virtual {v5}, Lv3/d;->f()Lv3/c;

    move-result-object v0

    iget-object v1, p1, Lz3/f;->e:Ljava/lang/String;

    iget-object p1, p1, Lz3/f;->A:Lz3/f$e;

    const-wide/16 v2, 0x0

    new-instance v4, Lv3/b;

    invoke-direct {v4, p1, v1}, Lv3/b;-><init>(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V

    invoke-virtual {v0, v4, v2, v3}, Lv3/c;->c(Lv3/a;J)V

    return-void

    :cond_a
    :try_start_2
    new-instance p1, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_b
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {p1, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "Connection{"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->a:Ls3/a;

    iget-object v1, v1, Ls3/a;->a:Ls3/s;

    iget-object v1, v1, Ls3/s;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->a:Ls3/a;

    iget-object v1, v1, Ls3/a;->a:Ls3/s;

    iget v1, v1, Ls3/s;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, " proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw3/j;->q:Ls3/e0;

    iget-object v1, v1, Ls3/e0;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw3/j;->d:Ls3/q;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ls3/q;->c:Ls3/h;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lw3/j;->e:Ls3/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
