.class public final Lx3/i;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/t;


# instance fields
.field public final a:Ls3/w;


# direct methods
.method public constructor <init>(Ls3/w;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/i;->a:Ls3/w;

    return-void
.end method


# virtual methods
.method public final a(Ls3/t$a;)Ls3/b0;
    .locals 28

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "chain"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lx3/g;

    iget-object v0, v2, Lx3/g;->f:Ls3/y;

    iget-object v3, v2, Lx3/g;->b:Lw3/e;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    const/4 v7, 0x1

    move-object v8, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, v0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "request"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v11, v3, Lw3/e;->j:Lw3/c;

    if-nez v11, :cond_0

    const/4 v11, 0x1

    goto :goto_1

    :cond_0
    const/4 v11, 0x0

    :goto_1
    if-eqz v11, :cond_11

    monitor-enter v3

    :try_start_0
    iget-boolean v11, v3, Lw3/e;->l:Z

    xor-int/2addr v11, v7

    if-eqz v11, :cond_10

    iget-boolean v11, v3, Lw3/e;->k:Z

    xor-int/2addr v11, v7

    if-eqz v11, :cond_f

    sget-object v11, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v3

    if-eqz v0, :cond_3

    new-instance v0, Lw3/d;

    iget-object v11, v3, Lw3/e;->b:Lw3/l;

    iget-object v12, v4, Ls3/y;->b:Ls3/s;

    iget-boolean v13, v12, Ls3/s;->a:Z

    if-eqz v13, :cond_2

    iget-object v13, v3, Lw3/e;->q:Ls3/w;

    iget-object v14, v13, Ls3/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v14, :cond_1

    iget-object v15, v13, Ls3/w;->u:Ljavax/net/ssl/HostnameVerifier;

    iget-object v13, v13, Ls3/w;->v:Ls3/f;

    move-object/from16 v19, v13

    move-object/from16 v17, v14

    move-object/from16 v18, v15

    goto :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "CLEARTEXT-only client"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_2
    new-instance v15, Ls3/a;

    iget-object v13, v12, Ls3/s;->e:Ljava/lang/String;

    iget v14, v12, Ls3/s;->f:I

    iget-object v12, v3, Lw3/e;->q:Ls3/w;

    iget-object v7, v12, Ls3/w;->l:Ls3/n;

    iget-object v6, v12, Ls3/w;->p:Ljavax/net/SocketFactory;

    iget-object v5, v12, Ls3/w;->o:Ls3/b;

    move-object/from16 v25, v8

    iget-object v8, v12, Ls3/w;->m:Ljava/net/Proxy;

    move/from16 v26, v10

    iget-object v10, v12, Ls3/w;->t:Ljava/util/List;

    iget-object v1, v12, Ls3/w;->s:Ljava/util/List;

    iget-object v12, v12, Ls3/w;->n:Ljava/net/ProxySelector;

    move-object/from16 v24, v12

    move-object v12, v15

    move-object/from16 v27, v9

    move-object v9, v15

    move-object v15, v7

    move-object/from16 v16, v6

    move-object/from16 v20, v5

    move-object/from16 v21, v8

    move-object/from16 v22, v10

    move-object/from16 v23, v1

    invoke-direct/range {v12 .. v24}, Ls3/a;-><init>(Ljava/lang/String;ILs3/n;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ls3/f;Ls3/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    iget-object v1, v3, Lw3/e;->c:Ls3/o;

    invoke-direct {v0, v11, v9, v3, v1}, Lw3/d;-><init>(Lw3/l;Ls3/a;Lw3/e;Ls3/o;)V

    iput-object v0, v3, Lw3/e;->g:Lw3/d;

    goto :goto_3

    :cond_3
    move-object/from16 v25, v8

    move-object/from16 v27, v9

    move/from16 v26, v10

    :goto_3
    :try_start_1
    iget-boolean v0, v3, Lw3/e;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_e

    :try_start_2
    invoke-virtual {v2, v4}, Lx3/g;->b(Ls3/y;)Ls3/b0;

    move-result-object v0
    :try_end_2
    .catch Lw3/n; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v27, :cond_6

    :try_start_3
    new-instance v1, Ls3/b0$a;

    invoke-direct {v1, v0}, Ls3/b0$a;-><init>(Ls3/b0;)V

    new-instance v0, Ls3/b0$a;

    move-object/from16 v5, v27

    invoke-direct {v0, v5}, Ls3/b0$a;-><init>(Ls3/b0;)V

    const/4 v6, 0x0

    iput-object v6, v0, Ls3/b0$a;->g:Ls3/d0;

    invoke-virtual {v0}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object v0

    iget-object v4, v0, Ls3/b0;->h:Ls3/d0;

    if-nez v4, :cond_4

    const/4 v4, 0x1

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_5

    iput-object v0, v1, Ls3/b0$a;->j:Ls3/b0;

    invoke-virtual {v1}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object v0

    goto :goto_5

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "priorResponse.body != null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/4 v6, 0x0

    :goto_5
    move-object v9, v0

    iget-object v0, v3, Lw3/e;->j:Lw3/c;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v1, p0

    :try_start_4
    invoke-virtual {v1, v9, v0}, Lx3/i;->b(Ls3/b0;Lw3/c;)Ls3/y;

    move-result-object v4

    if-nez v4, :cond_8

    if-eqz v0, :cond_7

    iget-boolean v0, v0, Lw3/c;->a:Z

    if-eqz v0, :cond_7

    invoke-virtual {v3}, Lw3/e;->k()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_7
    const/4 v2, 0x0

    invoke-virtual {v3, v2}, Lw3/e;->f(Z)V

    return-object v9

    :cond_8
    :try_start_5
    iget-object v0, v9, Ls3/b0;->h:Ls3/d0;

    if-eqz v0, :cond_9

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_9
    add-int/lit8 v10, v26, 0x1

    const/16 v0, 0x14

    if-gt v10, v0, :cond_a

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lw3/e;->f(Z)V

    move-object v5, v9

    move-object/from16 v8, v25

    const/4 v0, 0x1

    const/4 v9, 0x0

    goto :goto_8

    :cond_a
    :try_start_6
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Too many follow-up requests: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_9

    :catch_0
    move-exception v0

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v5, v27

    move-object v7, v0

    nop

    instance-of v0, v7, Lz3/a;

    if-nez v0, :cond_b

    const/4 v0, 0x1

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {v1, v7, v3, v4, v0}, Lx3/i;->c(Ljava/io/IOException;Lw3/e;Ls3/y;Z)Z

    move-result v0

    move-object/from16 v8, v25

    if-eqz v0, :cond_c

    invoke-static {v8, v7}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v7, 0x1

    const/4 v9, 0x0

    goto :goto_7

    :cond_c
    invoke-static {v7, v8}, Lt3/c;->C(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    throw v7

    :catch_1
    move-exception v0

    move-object/from16 v1, p0

    move-object/from16 v8, v25

    move-object/from16 v5, v27

    const/4 v6, 0x0

    move-object v7, v0

    iget-object v0, v7, Lw3/n;->b:Ljava/io/IOException;

    const/4 v9, 0x0

    invoke-virtual {v1, v0, v3, v4, v9}, Lx3/i;->c(Ljava/io/IOException;Lw3/e;Ls3/y;Z)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, v7, Lw3/n;->c:Ljava/io/IOException;

    invoke-static {v8, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    const/4 v7, 0x1

    :goto_7
    invoke-virtual {v3, v7}, Lw3/e;->f(Z)V

    move-object v8, v0

    move/from16 v10, v26

    const/4 v0, 0x0

    :goto_8
    move-object v9, v5

    const/4 v7, 0x1

    goto/16 :goto_0

    :cond_d
    :try_start_7
    iget-object v0, v7, Lw3/n;->c:Ljava/io/IOException;

    invoke-static {v0, v8}, Lt3/c;->C(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    throw v0

    :cond_e
    move-object/from16 v1, p0

    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    :goto_9
    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Lw3/e;->f(Z)V

    throw v0

    :cond_f
    :try_start_8
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_10
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_11
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final b(Ls3/b0;Lw3/c;)Ls3/y;
    .locals 11

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object v1, p2, Lw3/c;->b:Lw3/j;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lw3/j;->q:Ls3/e0;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget v2, p1, Ls3/b0;->e:I

    iget-object v3, p1, Ls3/b0;->b:Ls3/y;

    iget-object v3, v3, Ls3/y;->c:Ljava/lang/String;

    const/4 v4, 0x0

    const/16 v5, 0x134

    const/16 v6, 0x133

    const/4 v7, 0x1

    if-eq v2, v6, :cond_e

    if-eq v2, v5, :cond_e

    const/16 v8, 0x191

    if-eq v2, v8, :cond_d

    const/16 v8, 0x1a5

    if-eq v2, v8, :cond_a

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_7

    const/16 p2, 0x197

    if-eq v2, p2, :cond_5

    const/16 p2, 0x198

    if-eq v2, p2, :cond_1

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_1
    iget-object v1, p0, Lx3/i;->a:Ls3/w;

    iget-boolean v1, v1, Ls3/w;->g:Z

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    iget-object v1, p1, Ls3/b0;->k:Ls3/b0;

    if-eqz v1, :cond_3

    iget v1, v1, Ls3/b0;->e:I

    if-ne v1, p2, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p0, p1, v4}, Lx3/i;->d(Ls3/b0;I)I

    move-result p2

    if-lez p2, :cond_4

    return-object v0

    :cond_4
    iget-object p1, p1, Ls3/b0;->b:Ls3/y;

    return-object p1

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object p2, v1, Ls3/e0;->b:Ljava/net/Proxy;

    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v2, :cond_6

    iget-object p2, p0, Lx3/i;->a:Ls3/w;

    iget-object p2, p2, Ls3/w;->o:Ls3/b;

    :goto_1
    invoke-interface {p2, v1, p1}, Ls3/b;->a(Ls3/e0;Ls3/b0;)V

    return-object v0

    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v1, p1, Ls3/b0;->k:Ls3/b0;

    if-eqz v1, :cond_8

    iget v1, v1, Ls3/b0;->e:I

    if-ne v1, p2, :cond_8

    return-object v0

    :cond_8
    const p2, 0x7fffffff

    invoke-virtual {p0, p1, p2}, Lx3/i;->d(Ls3/b0;I)I

    move-result p2

    if-nez p2, :cond_9

    iget-object p1, p1, Ls3/b0;->b:Ls3/y;

    return-object p1

    :cond_9
    return-object v0

    :cond_a
    if-eqz p2, :cond_c

    iget-object v1, p2, Lw3/c;->e:Lw3/d;

    iget-object v1, v1, Lw3/d;->h:Ls3/a;

    iget-object v1, v1, Ls3/a;->a:Ls3/s;

    iget-object v1, v1, Ls3/s;->e:Ljava/lang/String;

    iget-object v2, p2, Lw3/c;->b:Lw3/j;

    iget-object v2, v2, Lw3/j;->q:Ls3/e0;

    iget-object v2, v2, Ls3/e0;->a:Ls3/a;

    iget-object v2, v2, Ls3/a;->a:Ls3/s;

    iget-object v2, v2, Ls3/s;->e:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v7

    if-nez v1, :cond_b

    goto :goto_2

    :cond_b
    iget-object p2, p2, Lw3/c;->b:Lw3/j;

    monitor-enter p2

    :try_start_0
    iput-boolean v7, p2, Lw3/j;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    iget-object p1, p1, Ls3/b0;->b:Ls3/y;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_c
    :goto_2
    return-object v0

    :cond_d
    iget-object p2, p0, Lx3/i;->a:Ls3/w;

    iget-object p2, p2, Ls3/w;->h:Ls3/b;

    goto :goto_1

    :cond_e
    :pswitch_0
    iget-object p2, p0, Lx3/i;->a:Ls3/w;

    iget-boolean p2, p2, Ls3/w;->i:Z

    if-nez p2, :cond_f

    goto/16 :goto_6

    :cond_f
    const-string p2, "Location"

    invoke-static {p1, p2}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_18

    iget-object v1, p1, Ls3/b0;->b:Ls3/y;

    iget-object v1, v1, Ls3/y;->b:Ls3/s;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "link"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    new-instance v2, Ls3/s$a;

    invoke-direct {v2}, Ls3/s$a;-><init>()V

    invoke-virtual {v2, v1, p2}, Ls3/s$a;->d(Ls3/s;Ljava/lang/String;)Ls3/s$a;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-object v2, v0

    :goto_3
    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ls3/s$a;->a()Ls3/s;

    move-result-object p2

    goto :goto_4

    :cond_10
    move-object p2, v0

    :goto_4
    if-eqz p2, :cond_18

    iget-object v1, p2, Ls3/s;->b:Ljava/lang/String;

    iget-object v2, p1, Ls3/b0;->b:Ls3/y;

    iget-object v2, v2, Ls3/y;->b:Ls3/s;

    iget-object v2, v2, Ls3/s;->b:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    iget-object v1, p0, Lx3/i;->a:Ls3/w;

    iget-boolean v1, v1, Ls3/w;->j:Z

    if-nez v1, :cond_11

    goto :goto_6

    :cond_11
    iget-object v1, p1, Ls3/b0;->b:Ls3/y;

    new-instance v2, Ls3/y$a;

    invoke-direct {v2, v1}, Ls3/y$a;-><init>(Ls3/y;)V

    invoke-static {v3}, Lx3/f;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_16

    iget v1, p1, Ls3/b0;->e:I

    const-string v8, "method"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "PROPFIND"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    if-eq v1, v5, :cond_12

    if-ne v1, v6, :cond_13

    :cond_12
    const/4 v4, 0x1

    :cond_13
    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v7, v8

    if-eqz v7, :cond_14

    if-eq v1, v5, :cond_14

    if-eq v1, v6, :cond_14

    const-string v3, "GET"

    goto :goto_5

    :cond_14
    if-eqz v4, :cond_15

    iget-object v0, p1, Ls3/b0;->b:Ls3/y;

    iget-object v0, v0, Ls3/y;->e:Ld1/f;

    :cond_15
    :goto_5
    invoke-virtual {v2, v3, v0}, Ls3/y$a;->c(Ljava/lang/String;Ld1/f;)Ls3/y$a;

    if-nez v4, :cond_16

    const-string v0, "Transfer-Encoding"

    invoke-virtual {v2, v0}, Ls3/y$a;->d(Ljava/lang/String;)Ls3/y$a;

    const-string v0, "Content-Length"

    invoke-virtual {v2, v0}, Ls3/y$a;->d(Ljava/lang/String;)Ls3/y$a;

    const-string v0, "Content-Type"

    invoke-virtual {v2, v0}, Ls3/y$a;->d(Ljava/lang/String;)Ls3/y$a;

    :cond_16
    iget-object p1, p1, Ls3/b0;->b:Ls3/y;

    iget-object p1, p1, Ls3/y;->b:Ls3/s;

    invoke-static {p1, p2}, Lt3/c;->a(Ls3/s;Ls3/s;)Z

    move-result p1

    if-nez p1, :cond_17

    const-string p1, "Authorization"

    invoke-virtual {v2, p1}, Ls3/y$a;->d(Ljava/lang/String;)Ls3/y$a;

    :cond_17
    const-string p1, "url"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, v2, Ls3/y$a;->a:Ls3/s;

    invoke-virtual {v2}, Ls3/y$a;->a()Ls3/y;

    move-result-object v0

    :cond_18
    :goto_6
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/io/IOException;Lw3/e;Ls3/y;Z)Z
    .locals 3

    iget-object p3, p0, Lx3/i;->a:Ls3/w;

    iget-boolean p3, p3, Ls3/w;->g:Z

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    if-eqz p4, :cond_1

    instance-of p3, p1, Ljava/io/FileNotFoundException;

    if-eqz p3, :cond_1

    return v0

    :cond_1
    instance-of p3, p1, Ljava/net/ProtocolException;

    const/4 v1, 0x1

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    if-eqz p3, :cond_3

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_5

    if-nez p4, :cond_5

    goto :goto_1

    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_4

    goto :goto_0

    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_6

    :cond_5
    :goto_0
    const/4 p1, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 p1, 0x1

    :goto_2
    if-nez p1, :cond_7

    return v0

    :cond_7
    iget-object p1, p2, Lw3/e;->g:Lw3/d;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget p2, p1, Lw3/d;->c:I

    if-nez p2, :cond_8

    iget p3, p1, Lw3/d;->d:I

    if-nez p3, :cond_8

    iget p3, p1, Lw3/d;->e:I

    if-nez p3, :cond_8

    const/4 p1, 0x0

    goto :goto_6

    :cond_8
    iget-object p3, p1, Lw3/d;->f:Ls3/e0;

    if-eqz p3, :cond_9

    goto :goto_5

    :cond_9
    const/4 p3, 0x0

    if-gt p2, v1, :cond_d

    iget p2, p1, Lw3/d;->d:I

    if-gt p2, v1, :cond_d

    iget p2, p1, Lw3/d;->e:I

    if-lez p2, :cond_a

    goto :goto_4

    :cond_a
    iget-object p2, p1, Lw3/d;->i:Lw3/e;

    iget-object p2, p2, Lw3/e;->h:Lw3/j;

    if-eqz p2, :cond_d

    monitor-enter p2

    :try_start_0
    iget p4, p2, Lw3/j;->k:I

    if-eqz p4, :cond_b

    goto :goto_3

    :cond_b
    iget-object p4, p2, Lw3/j;->q:Ls3/e0;

    iget-object p4, p4, Ls3/e0;->a:Ls3/a;

    iget-object p4, p4, Ls3/a;->a:Ls3/s;

    iget-object v2, p1, Lw3/d;->h:Ls3/a;

    iget-object v2, v2, Ls3/a;->a:Ls3/s;

    invoke-static {p4, v2}, Lt3/c;->a(Ls3/s;Ls3/s;)Z

    move-result p4

    if-nez p4, :cond_c

    goto :goto_3

    :cond_c
    iget-object p3, p2, Lw3/j;->q:Ls3/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    monitor-exit p2

    goto :goto_4

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_d
    :goto_4
    if-eqz p3, :cond_e

    iput-object p3, p1, Lw3/d;->f:Ls3/e0;

    goto :goto_5

    :cond_e
    iget-object p2, p1, Lw3/d;->a:Lw3/o$a;

    if-eqz p2, :cond_f

    invoke-virtual {p2}, Lw3/o$a;->a()Z

    move-result p2

    if-ne p2, v1, :cond_f

    goto :goto_5

    :cond_f
    iget-object p1, p1, Lw3/d;->b:Lw3/o;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Lw3/o;->a()Z

    move-result p1

    goto :goto_6

    :cond_10
    :goto_5
    const/4 p1, 0x1

    :goto_6
    if-nez p1, :cond_11

    return v0

    :cond_11
    return v1
.end method

.method public final d(Ls3/b0;I)I
    .locals 1

    const-string v0, "Retry-After"

    invoke-static {p1, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lkotlin/text/Regex;

    const-string v0, "\\d+"

    invoke-direct {p2, v0}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "Integer.valueOf(header)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    :cond_0
    const p1, 0x7fffffff

    return p1

    :cond_1
    return p2
.end method
