.class public final Lw3/d;
.super Ljava/lang/Object;


# instance fields
.field public a:Lw3/o$a;

.field public b:Lw3/o;

.field public c:I

.field public d:I

.field public e:I

.field public f:Ls3/e0;

.field public final g:Lw3/l;

.field public final h:Ls3/a;

.field public final i:Lw3/e;

.field public final j:Ls3/o;


# direct methods
.method public constructor <init>(Lw3/l;Ls3/a;Lw3/e;Ls3/o;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/d;->g:Lw3/l;

    iput-object p2, p0, Lw3/d;->h:Ls3/a;

    iput-object p3, p0, Lw3/d;->i:Lw3/e;

    iput-object p4, p0, Lw3/d;->j:Ls3/o;

    return-void
.end method


# virtual methods
.method public final a(IIIIZZ)Lw3/j;
    .locals 15

    move-object v1, p0

    :goto_0
    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    iget-boolean v0, v0, Lw3/e;->n:Z

    if-nez v0, :cond_23

    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    iget-object v2, v0, Lw3/e;->h:Lw3/j;

    const/4 v3, 0x0

    const/4 v0, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_6

    monitor-enter v2

    :try_start_0
    iget-boolean v5, v2, Lw3/j;->i:Z

    if-nez v5, :cond_1

    iget-object v5, v2, Lw3/j;->q:Ls3/e0;

    iget-object v5, v5, Ls3/e0;->a:Ls3/a;

    iget-object v5, v5, Ls3/a;->a:Ls3/s;

    invoke-virtual {p0, v5}, Lw3/d;->b(Ls3/s;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    move-object v5, v3

    goto :goto_2

    :cond_1
    :goto_1
    iget-object v5, v1, Lw3/d;->i:Lw3/e;

    invoke-virtual {v5}, Lw3/e;->j()Ljava/net/Socket;

    move-result-object v5

    :goto_2
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iget-object v6, v1, Lw3/d;->i:Lw3/e;

    iget-object v6, v6, Lw3/e;->h:Lw3/j;

    if-eqz v6, :cond_4

    if-nez v5, :cond_2

    const/4 v0, 0x1

    :cond_2
    if-eqz v0, :cond_3

    goto/16 :goto_10

    :cond_3
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    if-eqz v5, :cond_5

    invoke-static {v5}, Lt3/c;->e(Ljava/net/Socket;)V

    :cond_5
    iget-object v5, v1, Lw3/d;->j:Ls3/o;

    iget-object v6, v1, Lw3/d;->i:Lw3/e;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "call"

    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "connection"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_6
    :goto_3
    iput v0, v1, Lw3/d;->c:I

    iput v0, v1, Lw3/d;->d:I

    iput v0, v1, Lw3/d;->e:I

    iget-object v2, v1, Lw3/d;->g:Lw3/l;

    iget-object v5, v1, Lw3/d;->h:Ls3/a;

    iget-object v6, v1, Lw3/d;->i:Lw3/e;

    invoke-virtual {v2, v5, v6, v3, v0}, Lw3/l;->a(Ls3/a;Lw3/e;Ljava/util/List;Z)Z

    move-result v2

    if-eqz v2, :cond_7

    goto/16 :goto_c

    :cond_7
    iget-object v2, v1, Lw3/d;->f:Ls3/e0;

    if-eqz v2, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v3, v1, Lw3/d;->f:Ls3/e0;

    goto :goto_4

    :cond_8
    iget-object v2, v1, Lw3/d;->a:Lw3/o$a;

    if-eqz v2, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lw3/o$a;->a()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v0, v1, Lw3/d;->a:Lw3/o$a;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lw3/o$a;->b()Ls3/e0;

    move-result-object v2

    :goto_4
    move-object v5, v3

    goto/16 :goto_e

    :cond_9
    iget-object v2, v1, Lw3/d;->b:Lw3/o;

    if-nez v2, :cond_a

    new-instance v2, Lw3/o;

    iget-object v5, v1, Lw3/d;->h:Ls3/a;

    iget-object v6, v1, Lw3/d;->i:Lw3/e;

    iget-object v7, v6, Lw3/e;->q:Ls3/w;

    iget-object v7, v7, Ls3/w;->D:Lw3/m;

    iget-object v8, v1, Lw3/d;->j:Ls3/o;

    invoke-direct {v2, v5, v7, v6, v8}, Lw3/o;-><init>(Ls3/a;Lw3/m;Ls3/d;Ls3/o;)V

    iput-object v2, v1, Lw3/d;->b:Lw3/o;

    :cond_a
    invoke-virtual {v2}, Lw3/o;->a()Z

    move-result v5

    if-eqz v5, :cond_22

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    invoke-virtual {v2}, Lw3/o;->b()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual {v2}, Lw3/o;->b()Z

    move-result v6

    const-string v7, "No route to "

    if-eqz v6, :cond_16

    iget-object v6, v2, Lw3/o;->a:Ljava/util/List;

    iget v8, v2, Lw3/o;->b:I

    add-int/lit8 v9, v8, 0x1

    iput v9, v2, Lw3/o;->b:I

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/net/Proxy;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v2, Lw3/o;->c:Ljava/util/List;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v9

    sget-object v10, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v9, v10, :cond_f

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v9

    sget-object v10, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v9, v10, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {v6}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v9

    instance-of v10, v9, Ljava/net/InetSocketAddress;

    if-eqz v10, :cond_e

    check-cast v9, Ljava/net/InetSocketAddress;

    const-string v10, "$this$socketHost"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v10

    if-eqz v10, :cond_d

    invoke-virtual {v10}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v10

    const-string v11, "address.hostAddress"

    goto :goto_5

    :cond_d
    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v10

    const-string v11, "hostName"

    :goto_5
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v9

    goto :goto_7

    :cond_e
    const-string v0, "Proxy.address() is not an InetSocketAddress: "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_f
    :goto_6
    iget-object v9, v2, Lw3/o;->e:Ls3/a;

    iget-object v9, v9, Ls3/a;->a:Ls3/s;

    iget-object v10, v9, Ls3/s;->e:Ljava/lang/String;

    iget v9, v9, Ls3/s;->f:I

    :goto_7
    const v11, 0xffff

    if-gt v4, v9, :cond_15

    if-lt v11, v9, :cond_15

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v7

    sget-object v11, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v7, v11, :cond_10

    invoke-static {v10, v9}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_10
    iget-object v7, v2, Lw3/o;->h:Ls3/o;

    iget-object v11, v2, Lw3/o;->g:Ls3/d;

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "call"

    invoke-static {v11, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "domainName"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v12, v2, Lw3/o;->e:Ls3/a;

    iget-object v12, v12, Ls3/a;->d:Ls3/n;

    invoke-interface {v12, v10}, Ls3/n;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_14

    iget-object v13, v2, Lw3/o;->h:Ls3/o;

    iget-object v14, v2, Lw3/o;->g:Ls3/d;

    invoke-static {v13}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "inetAddressList"

    invoke-static {v12, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/net/InetAddress;

    new-instance v11, Ljava/net/InetSocketAddress;

    invoke-direct {v11, v10, v9}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_11
    :goto_9
    iget-object v7, v2, Lw3/o;->c:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_13

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/InetSocketAddress;

    new-instance v9, Ls3/e0;

    iget-object v10, v2, Lw3/o;->e:Ls3/a;

    invoke-direct {v9, v10, v6, v8}, Ls3/e0;-><init>(Ls3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    iget-object v8, v2, Lw3/o;->f:Lw3/m;

    monitor-enter v8

    :try_start_1
    const-string v10, "route"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v8, Lw3/m;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v8

    if-eqz v10, :cond_12

    iget-object v8, v2, Lw3/o;->d:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_12
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :catchall_1
    move-exception v0

    monitor-exit v8

    throw v0

    :cond_13
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v4

    if-eqz v6, :cond_b

    goto :goto_b

    :cond_14
    new-instance v0, Ljava/net/UnknownHostException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v2, Lw3/o;->e:Ls3/a;

    iget-object v2, v2, Ls3/a;->d:Ls3/n;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " returned no addresses for "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    new-instance v0, Ljava/net/SocketException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3a

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "; port is out of range"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/net/SocketException;

    invoke-static {v7}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, v2, Lw3/o;->e:Ls3/a;

    iget-object v4, v4, Ls3/a;->a:Ls3/s;

    iget-object v4, v4, Ls3/s;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; exhausted proxy configurations: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lw3/o;->a:Ljava/util/List;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    :goto_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_18

    iget-object v6, v2, Lw3/o;->d:Ljava/util/ArrayList;

    invoke-static {v5, v6}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    iget-object v2, v2, Lw3/o;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    :cond_18
    new-instance v2, Lw3/o$a;

    invoke-direct {v2, v5}, Lw3/o$a;-><init>(Ljava/util/List;)V

    iput-object v2, v1, Lw3/d;->a:Lw3/o$a;

    iget-object v5, v2, Lw3/o$a;->b:Ljava/util/List;

    iget-object v6, v1, Lw3/d;->i:Lw3/e;

    iget-boolean v6, v6, Lw3/e;->n:Z

    if-nez v6, :cond_21

    iget-object v6, v1, Lw3/d;->g:Lw3/l;

    iget-object v7, v1, Lw3/d;->h:Ls3/a;

    iget-object v8, v1, Lw3/d;->i:Lw3/e;

    invoke-virtual {v6, v7, v8, v5, v0}, Lw3/l;->a(Ls3/a;Lw3/e;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_19

    :goto_c
    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    iget-object v0, v0, Lw3/e;->h:Lw3/j;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_d
    move-object v2, v0

    goto :goto_f

    :cond_19
    invoke-virtual {v2}, Lw3/o$a;->b()Ls3/e0;

    move-result-object v2

    :goto_e
    new-instance v14, Lw3/j;

    iget-object v0, v1, Lw3/d;->g:Lw3/l;

    invoke-direct {v14, v0, v2}, Lw3/j;-><init>(Lw3/l;Ls3/e0;)V

    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    iput-object v14, v0, Lw3/e;->p:Lw3/j;

    :try_start_2
    iget-object v12, v1, Lw3/d;->i:Lw3/e;

    iget-object v13, v1, Lw3/d;->j:Ls3/o;

    move-object v6, v14

    move/from16 v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    invoke-virtual/range {v6 .. v13}, Lw3/j;->c(IIIIZLs3/d;Ls3/o;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    iput-object v3, v0, Lw3/e;->p:Lw3/j;

    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    iget-object v0, v0, Lw3/e;->q:Ls3/w;

    iget-object v3, v0, Ls3/w;->D:Lw3/m;

    iget-object v0, v14, Lw3/j;->q:Ls3/e0;

    monitor-enter v3

    :try_start_3
    const-string v6, "route"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v3, Lw3/m;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v6, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    monitor-exit v3

    iget-object v0, v1, Lw3/d;->g:Lw3/l;

    iget-object v3, v1, Lw3/d;->h:Ls3/a;

    iget-object v6, v1, Lw3/d;->i:Lw3/e;

    invoke-virtual {v0, v3, v6, v5, v4}, Lw3/l;->a(Ls3/a;Lw3/e;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    iget-object v0, v0, Lw3/e;->h:Lw3/j;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v2, v1, Lw3/d;->f:Ls3/e0;

    iget-object v2, v14, Lw3/j;->c:Ljava/net/Socket;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v2}, Lt3/c;->e(Ljava/net/Socket;)V

    goto :goto_d

    :goto_f
    iget-object v0, v1, Lw3/d;->j:Ls3/o;

    iget-object v3, v1, Lw3/d;->i:Lw3/e;

    invoke-virtual {v0, v3, v2}, Ls3/o;->a(Ls3/d;Ls3/i;)V

    :goto_10
    move/from16 v0, p6

    move-object v14, v2

    goto :goto_11

    :cond_1a
    monitor-enter v14

    :try_start_4
    iget-object v0, v1, Lw3/d;->g:Lw3/l;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "connection"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lt3/c;->a:[B

    iget-object v2, v0, Lw3/l;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2, v14}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lw3/l;->b:Lv3/c;

    iget-object v0, v0, Lw3/l;->c:Lw3/k;

    invoke-static {v2, v0}, Lv3/c;->d(Lv3/c;Lv3/a;)V

    iget-object v0, v1, Lw3/d;->i:Lw3/e;

    invoke-virtual {v0, v14}, Lw3/e;->b(Lw3/j;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v14

    iget-object v0, v1, Lw3/d;->j:Ls3/o;

    iget-object v2, v1, Lw3/d;->i:Lw3/e;

    invoke-virtual {v0, v2, v14}, Ls3/o;->a(Ls3/d;Ls3/i;)V

    move/from16 v0, p6

    :goto_11
    invoke-virtual {v14, v0}, Lw3/j;->i(Z)Z

    move-result v2

    if-eqz v2, :cond_1b

    return-object v14

    :cond_1b
    invoke-virtual {v14}, Lw3/j;->l()V

    iget-object v2, v1, Lw3/d;->f:Ls3/e0;

    if-eqz v2, :cond_1c

    goto/16 :goto_0

    :cond_1c
    iget-object v2, v1, Lw3/d;->a:Lw3/o$a;

    if-eqz v2, :cond_1d

    invoke-virtual {v2}, Lw3/o$a;->a()Z

    move-result v2

    goto :goto_12

    :cond_1d
    const/4 v2, 0x1

    :goto_12
    if-eqz v2, :cond_1e

    goto/16 :goto_0

    :cond_1e
    iget-object v2, v1, Lw3/d;->b:Lw3/o;

    if-eqz v2, :cond_1f

    invoke-virtual {v2}, Lw3/o;->a()Z

    move-result v4

    :cond_1f
    if-eqz v4, :cond_20

    goto/16 :goto_0

    :cond_20
    new-instance v0, Ljava/io/IOException;

    const-string v2, "exhausted all routes"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v14

    throw v0

    :catchall_3
    move-exception v0

    monitor-exit v3

    throw v0

    :catchall_4
    move-exception v0

    iget-object v2, v1, Lw3/d;->i:Lw3/e;

    iput-object v3, v2, Lw3/e;->p:Lw3/j;

    throw v0

    :cond_21
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Ls3/s;)Z
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lw3/d;->h:Ls3/a;

    iget-object v0, v0, Ls3/a;->a:Ls3/s;

    iget v1, p1, Ls3/s;->f:I

    iget v2, v0, Ls3/s;->f:I

    if-ne v1, v2, :cond_0

    iget-object p1, p1, Ls3/s;->e:Ljava/lang/String;

    iget-object v0, v0, Ls3/s;->e:Ljava/lang/String;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lw3/d;->f:Ls3/e0;

    instance-of v0, p1, Lz3/v;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lz3/v;

    iget-object v0, v0, Lz3/v;->b:Lz3/b;

    sget-object v1, Lz3/b;->g:Lz3/b;

    if-ne v0, v1, :cond_0

    iget p1, p0, Lw3/d;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lw3/d;->c:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lz3/a;

    if-eqz p1, :cond_1

    iget p1, p0, Lw3/d;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lw3/d;->d:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lw3/d;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lw3/d;->e:I

    :goto_0
    return-void
.end method
