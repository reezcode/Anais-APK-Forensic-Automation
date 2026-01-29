.class public final Le4/e;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# instance fields
.field public final synthetic a:Le4/d;

.field public final synthetic b:Ls3/y;


# direct methods
.method public constructor <init>(Le4/d;Ls3/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/y;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Le4/e;->a:Le4/d;

    iput-object p2, p0, Le4/e;->b:Ls3/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    const-string v0, "call"

    move-object/from16 v3, p1

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Ls3/b0;->n:Lw3/c;

    const/4 v4, 0x0

    const/4 v5, 0x1

    :try_start_0
    iget-object v0, v1, Le4/e;->a:Le4/d;

    invoke-virtual {v0, v2, v3}, Le4/d;->h(Ls3/b0;Lw3/c;)V

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lw3/c;->c()Le4/d$c;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v2, v2, Ls3/b0;->g:Ls3/r;

    const-string v3, "responseHeaders"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Ls3/r;->b:[Ljava/lang/String;

    array-length v3, v3

    div-int/lit8 v3, v3, 0x2

    const/4 v6, 0x0

    move-object v15, v4

    move-object/from16 v16, v15

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_0
    if-ge v7, v3, :cond_12

    invoke-virtual {v2, v7}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v8

    const-string v10, "Sec-WebSocket-Extensions"

    invoke-static {v8, v10}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_0

    goto/16 :goto_7

    :cond_0
    invoke-virtual {v2, v7}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v12

    if-ge v10, v12, :cond_11

    const/16 v12, 0x2c

    const/4 v14, 0x4

    invoke-static {v8, v12, v10, v6, v14}, Lt3/c;->h(Ljava/lang/String;CIII)I

    move-result v12

    const/16 v14, 0x3b

    invoke-static {v8, v14, v10, v12}, Lt3/c;->f(Ljava/lang/String;CII)I

    move-result v6

    invoke-static {v8, v10, v6}, Lt3/c;->B(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v10

    add-int/2addr v6, v5

    const-string v5, "permessage-deflate"

    invoke-static {v10, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    move v10, v6

    if-eqz v5, :cond_10

    if-eqz v9, :cond_2

    :cond_1
    :goto_2
    const/16 v17, 0x1

    :cond_2
    :goto_3
    if-ge v10, v12, :cond_f

    invoke-static {v8, v14, v10, v12}, Lt3/c;->f(Ljava/lang/String;CII)I

    move-result v5

    const/16 v6, 0x3d

    invoke-static {v8, v6, v10, v5}, Lt3/c;->f(Ljava/lang/String;CII)I

    move-result v6

    invoke-static {v8, v10, v6}, Lt3/c;->B(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v9

    if-ge v6, v5, :cond_3

    add-int/lit8 v6, v6, 0x1

    invoke-static {v8, v6, v5}, Lt3/c;->B(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/text/StringsKt;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_3
    move-object v6, v4

    :goto_4
    add-int/lit8 v10, v5, 0x1

    const-string v5, "client_max_window_bits"

    invoke-static {v9, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    if-eqz v15, :cond_4

    const/16 v17, 0x1

    :cond_4
    if-eqz v6, :cond_5

    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    move-object v15, v5

    goto :goto_5

    :cond_5
    move-object v15, v4

    :goto_5
    if-nez v15, :cond_2

    goto :goto_2

    :cond_6
    const-string v5, "client_no_context_takeover"

    invoke-static {v9, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    if-eqz v11, :cond_7

    const/16 v17, 0x1

    :cond_7
    if-eqz v6, :cond_8

    const/16 v17, 0x1

    :cond_8
    const/4 v11, 0x1

    goto :goto_3

    :cond_9
    const-string v5, "server_max_window_bits"

    invoke-static {v9, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    if-eqz v16, :cond_a

    const/16 v17, 0x1

    :cond_a
    if-eqz v6, :cond_b

    invoke-static {v6}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v16, v5

    goto :goto_6

    :cond_b
    move-object/from16 v16, v4

    :goto_6
    if-nez v16, :cond_2

    goto :goto_2

    :cond_c
    const-string v5, "server_no_context_takeover"

    invoke-static {v9, v5}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    if-eqz v13, :cond_d

    const/16 v17, 0x1

    :cond_d
    if-eqz v6, :cond_e

    const/16 v17, 0x1

    :cond_e
    const/4 v13, 0x1

    goto :goto_3

    :cond_f
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v9, 0x1

    goto/16 :goto_1

    :cond_10
    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v17, 0x1

    goto/16 :goto_1

    :cond_11
    :goto_7
    add-int/lit8 v7, v7, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    goto/16 :goto_0

    :cond_12
    new-instance v2, Le4/f;

    move-object v8, v2

    move-object v10, v15

    move-object/from16 v12, v16

    move/from16 v14, v17

    invoke-direct/range {v8 .. v14}, Le4/f;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    iget-object v3, v1, Le4/e;->a:Le4/d;

    iput-object v2, v3, Le4/d;->v:Le4/f;

    if-eqz v17, :cond_13

    goto :goto_8

    :cond_13
    if-eqz v15, :cond_14

    goto :goto_8

    :cond_14
    if-eqz v16, :cond_16

    const/16 v2, 0xf

    const/16 v3, 0x8

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-gt v3, v5, :cond_15

    if-ge v2, v5, :cond_16

    :cond_15
    :goto_8
    const/4 v5, 0x0

    goto :goto_9

    :cond_16
    const/4 v5, 0x1

    :goto_9
    if-nez v5, :cond_17

    iget-object v2, v1, Le4/e;->a:Le4/d;

    monitor-enter v2

    :try_start_1
    iget-object v3, v1, Le4/e;->a:Le4/d;

    iget-object v3, v3, Le4/d;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->clear()V

    iget-object v3, v1, Le4/e;->a:Le4/d;

    const/16 v5, 0x3f2

    const-string v6, "unexpected Sec-WebSocket-Extensions in response header"

    invoke-virtual {v3, v5, v6}, Le4/d;->a(ILjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v2

    goto :goto_a

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_17
    :goto_a
    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lt3/c;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " WebSocket "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Le4/e;->b:Ls3/y;

    iget-object v3, v3, Ls3/y;->b:Ls3/s;

    invoke-virtual {v3}, Ls3/s;->g()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Le4/e;->a:Le4/d;

    invoke-virtual {v3, v2, v0}, Le4/d;->j(Ljava/lang/String;Le4/d$c;)V

    iget-object v0, v1, Le4/e;->a:Le4/d;

    iget-object v2, v0, Le4/d;->s:Ld1/f;

    invoke-virtual {v2, v0}, Ld1/f;->I(Ls3/g0;)V

    iget-object v0, v1, Le4/e;->a:Le4/d;

    invoke-virtual {v0}, Le4/d;->k()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    iget-object v2, v1, Le4/e;->a:Le4/d;

    invoke-virtual {v2, v0, v4}, Le4/d;->i(Ljava/lang/Exception;Ls3/b0;)V

    :goto_b
    return-void

    :catch_1
    move-exception v0

    if-eqz v3, :cond_18

    const/4 v5, 0x1

    invoke-virtual {v3, v5, v5, v4}, Lw3/c;->a(ZZLjava/io/IOException;)Ljava/io/IOException;

    :cond_18
    iget-object v3, v1, Le4/e;->a:Le4/d;

    invoke-virtual {v3, v0, v2}, Le4/d;->i(Ljava/lang/Exception;Ls3/b0;)V

    invoke-static/range {p2 .. p2}, Lt3/c;->d(Ljava/io/Closeable;)V

    return-void
.end method

.method public final b(Ls3/d;Ljava/io/IOException;)V
    .locals 1

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le4/e;->a:Le4/d;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Le4/d;->i(Ljava/lang/Exception;Ls3/b0;)V

    return-void
.end method
