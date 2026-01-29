.class public final Lf3/i;
.super Ljava/lang/Object;


# static fields
.field public static a:Ls3/g0; = null

.field public static b:Z = false

.field public static c:J = 0x0L

.field public static d:J = 0x0L

.field public static e:J = 0x0L

.field public static f:I = 0x0

.field public static g:J = 0x1f4L

.field public static h:J = 0x0L

.field public static i:J = 0x1f4L

.field public static j:J


# direct methods
.method public static a()Z
    .locals 5

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-eqz v0, :cond_0

    sget-wide v0, Lf3/i;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lf3/i;->d:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3a98

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b()Z
    .locals 1

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 26

    invoke-static/range {p0 .. p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    invoke-static {}, Lf3/i;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {v13}, Lf3/i;->p(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "md5Key"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    invoke-static/range {p0 .. p0}, Lk3/h;->b(Landroid/content/Context;)I

    move-result v11

    invoke-static/range {p0 .. p0}, Lk3/h;->a(Landroid/content/Context;)I

    move-result v12

    const v0, 0x3e570a3d    # 0.21f

    int-to-float v1, v11

    mul-float v5, v1, v0

    int-to-float v0, v12

    const v2, 0x3efae148    # 0.49f

    mul-float v6, v0, v2

    const v3, 0x3f4a3d71    # 0.79f

    mul-float v3, v3, v1

    const v4, 0x3f028f5c    # 0.51f

    mul-float v7, v0, v4

    mul-float v9, v1, v4

    const v4, 0x3e428f5c    # 0.19f

    mul-float v10, v0, v4

    mul-float v8, v1, v2

    const v1, 0x3f47ae14    # 0.78f

    mul-float v15, v0, v1

    new-instance v4, Lf3/i$a;

    move-object v0, v4

    move-object v1, v13

    move-object/from16 v2, p0

    move-object/from16 v25, v4

    move v4, v7

    move v7, v8

    move v8, v15

    invoke-direct/range {v0 .. v12}, Lf3/i$a;-><init>(Ljava/lang/String;Landroid/content/Context;FFFFFFFFII)V

    sget-object v0, Lk3/i;->a:[B

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lh3/a;->a(Ljava/lang/String;)[B

    move-result-object v2

    array-length v3, v2

    mul-int/lit8 v3, v3, 0x2

    new-array v3, v3, [C

    array-length v4, v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v4, :cond_2

    aget-byte v8, v2, v6

    add-int/lit8 v9, v7, 0x1

    sget-object v10, Ld1/d;->e:[C

    shr-int/lit8 v11, v8, 0x4

    and-int/lit8 v11, v11, 0xf

    aget-char v11, v10, v11

    aput-char v11, v3, v7

    add-int/lit8 v7, v9, 0x1

    and-int/lit8 v8, v8, 0xf

    aget-char v8, v10, v8

    aput-char v8, v3, v9

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([C)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "?timeStamp="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "&sign="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lk/j0;->f:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    const-string v3, "wsUrl"

    invoke-virtual {v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lk/j0;->f:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "wss://"

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lk/j0;->f()Ljava/lang/String;

    move-result-object v4

    const-string v6, "\\|"

    invoke-virtual {v4, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v5

    const-string v6, "/websocket/message/DEVICE_"

    invoke-static {v2, v4, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lk/j0;->f:Ljava/lang/String;

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v2

    sget-object v4, Lk/j0;->f:Ljava/lang/String;

    invoke-virtual {v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    sget-object v2, Lk/j0;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lk3/b;->a()Ls3/w;

    move-result-object v1

    new-instance v2, Ls3/y$a;

    invoke-direct {v2}, Ls3/y$a;-><init>()V

    invoke-virtual {v2, v0}, Ls3/y$a;->e(Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v2}, Ls3/y$a;->a()Ls3/y;

    move-result-object v0

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "request"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "listener"

    move-object/from16 v3, v25

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Le4/d;

    sget-object v17, Lv3/d;->h:Lv3/d;

    new-instance v20, Ljava/util/Random;

    invoke-direct/range {v20 .. v20}, Ljava/util/Random;-><init>()V

    iget v4, v1, Ls3/w;->B:I

    int-to-long v6, v4

    iget-wide v8, v1, Ls3/w;->C:J

    move-object/from16 v16, v2

    move-object/from16 v18, v0

    move-object/from16 v19, v3

    move-wide/from16 v21, v6

    move-wide/from16 v23, v8

    invoke-direct/range {v16 .. v24}, Le4/d;-><init>(Lv3/d;Ls3/y;Ld1/f;Ljava/util/Random;JJ)V

    const-string v0, "client"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v2, Le4/d;->r:Ls3/y;

    const-string v3, "Sec-WebSocket-Extensions"

    invoke-virtual {v0, v3}, Ls3/y;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0, v4}, Le4/d;->i(Ljava/lang/Exception;Ls3/b0;)V

    goto/16 :goto_3

    :cond_4
    new-instance v0, Ls3/w$a;

    const-string v6, "okHttpClient"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Ls3/w$a;-><init>()V

    iget-object v6, v1, Ls3/w;->b:Ls3/m;

    iput-object v6, v0, Ls3/w$a;->a:Ls3/m;

    iget-object v6, v1, Ls3/w;->c:Lg3/d;

    iput-object v6, v0, Ls3/w$a;->b:Lg3/d;

    iget-object v6, v0, Ls3/w$a;->c:Ljava/util/ArrayList;

    iget-object v7, v1, Ls3/w;->d:Ljava/util/List;

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    iget-object v6, v0, Ls3/w$a;->d:Ljava/util/ArrayList;

    iget-object v7, v1, Ls3/w;->e:Ljava/util/List;

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    iget-object v6, v1, Ls3/w;->f:Ls3/o$b;

    iput-object v6, v0, Ls3/w$a;->e:Ls3/o$b;

    iget-boolean v6, v1, Ls3/w;->g:Z

    iput-boolean v6, v0, Ls3/w$a;->f:Z

    iget-object v6, v1, Ls3/w;->h:Ls3/b;

    iput-object v6, v0, Ls3/w$a;->g:Ls3/b;

    iget-boolean v6, v1, Ls3/w;->i:Z

    iput-boolean v6, v0, Ls3/w$a;->h:Z

    iget-boolean v6, v1, Ls3/w;->j:Z

    iput-boolean v6, v0, Ls3/w$a;->i:Z

    iget-object v6, v1, Ls3/w;->k:Ls3/l;

    iput-object v6, v0, Ls3/w$a;->j:Ls3/l;

    iget-object v6, v1, Ls3/w;->l:Ls3/n;

    iput-object v6, v0, Ls3/w$a;->k:Ls3/n;

    iget-object v6, v1, Ls3/w;->m:Ljava/net/Proxy;

    iput-object v6, v0, Ls3/w$a;->l:Ljava/net/Proxy;

    iget-object v6, v1, Ls3/w;->n:Ljava/net/ProxySelector;

    iput-object v6, v0, Ls3/w$a;->m:Ljava/net/ProxySelector;

    iget-object v6, v1, Ls3/w;->o:Ls3/b;

    iput-object v6, v0, Ls3/w$a;->n:Ls3/b;

    iget-object v6, v1, Ls3/w;->p:Ljavax/net/SocketFactory;

    iput-object v6, v0, Ls3/w$a;->o:Ljavax/net/SocketFactory;

    iget-object v6, v1, Ls3/w;->q:Ljavax/net/ssl/SSLSocketFactory;

    iput-object v6, v0, Ls3/w$a;->p:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v6, v1, Ls3/w;->r:Ljavax/net/ssl/X509TrustManager;

    iput-object v6, v0, Ls3/w$a;->q:Ljavax/net/ssl/X509TrustManager;

    iget-object v6, v1, Ls3/w;->s:Ljava/util/List;

    iput-object v6, v0, Ls3/w$a;->r:Ljava/util/List;

    iget-object v6, v1, Ls3/w;->t:Ljava/util/List;

    iput-object v6, v0, Ls3/w$a;->s:Ljava/util/List;

    iget-object v6, v1, Ls3/w;->u:Ljavax/net/ssl/HostnameVerifier;

    iput-object v6, v0, Ls3/w$a;->t:Ljavax/net/ssl/HostnameVerifier;

    iget-object v6, v1, Ls3/w;->v:Ls3/f;

    iput-object v6, v0, Ls3/w$a;->u:Ls3/f;

    iget-object v6, v1, Ls3/w;->w:Ld1/f;

    iput-object v6, v0, Ls3/w$a;->v:Ld1/f;

    iget v6, v1, Ls3/w;->x:I

    iput v6, v0, Ls3/w$a;->w:I

    iget v6, v1, Ls3/w;->y:I

    iput v6, v0, Ls3/w$a;->x:I

    iget v6, v1, Ls3/w;->z:I

    iput v6, v0, Ls3/w$a;->y:I

    iget v6, v1, Ls3/w;->A:I

    iput v6, v0, Ls3/w$a;->z:I

    iget v6, v1, Ls3/w;->B:I

    iput v6, v0, Ls3/w$a;->A:I

    iget-wide v6, v1, Ls3/w;->C:J

    iput-wide v6, v0, Ls3/w$a;->B:J

    iget-object v1, v1, Ls3/w;->D:Lw3/m;

    iput-object v1, v0, Ls3/w$a;->C:Lw3/m;

    sget-object v1, Ls3/o;->a:Ls3/o$a;

    const-string v6, "eventListener"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lt3/c;->a:[B

    const-string v6, "$this$asFactory"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lt3/a;

    invoke-direct {v1}, Lt3/a;-><init>()V

    iput-object v1, v0, Ls3/w$a;->e:Ls3/o$b;

    sget-object v1, Le4/d;->x:Ljava/util/List;

    const-string v6, "protocols"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v1

    sget-object v6, Ls3/x;->g:Ls3/x;

    invoke-interface {v1, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-nez v7, :cond_6

    sget-object v7, Ls3/x;->d:Ls3/x;

    invoke-interface {v1, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_1

    :cond_5
    const/4 v7, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 v7, 0x1

    :goto_2
    if-eqz v7, :cond_d

    invoke-interface {v1, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v6

    if-gt v6, v8, :cond_8

    :cond_7
    const/4 v5, 0x1

    :cond_8
    if-eqz v5, :cond_c

    sget-object v5, Ls3/x;->c:Ls3/x;

    invoke-interface {v1, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v8

    if-eqz v5, :cond_b

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v8

    if-eqz v5, :cond_a

    sget-object v5, Ls3/x;->e:Ls3/x;

    invoke-interface {v1, v5}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v5, v0, Ls3/w$a;->s:Ljava/util/List;

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v8

    if-eqz v5, :cond_9

    iput-object v4, v0, Ls3/w$a;->C:Lw3/m;

    :cond_9
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    const-string v4, "Collections.unmodifiableList(protocolsCopy)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Ls3/w$a;->s:Ljava/util/List;

    new-instance v1, Ls3/w;

    invoke-direct {v1, v0}, Ls3/w;-><init>(Ls3/w$a;)V

    iget-object v0, v2, Le4/d;->r:Ls3/y;

    new-instance v4, Ls3/y$a;

    invoke-direct {v4, v0}, Ls3/y$a;-><init>(Ls3/y;)V

    const-string v0, "Upgrade"

    const-string v5, "websocket"

    invoke-virtual {v4, v0, v5}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    const-string v5, "Connection"

    invoke-virtual {v4, v5, v0}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    iget-object v0, v2, Le4/d;->a:Ljava/lang/String;

    const-string v5, "Sec-WebSocket-Key"

    invoke-virtual {v4, v5, v0}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    const-string v0, "Sec-WebSocket-Version"

    const-string v5, "13"

    invoke-virtual {v4, v0, v5}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    const-string v0, "permessage-deflate"

    invoke-virtual {v4, v3, v0}, Ls3/y$a;->b(Ljava/lang/String;Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v4}, Ls3/y$a;->a()Ls3/y;

    move-result-object v0

    new-instance v3, Lw3/e;

    invoke-direct {v3, v1, v0, v8}, Lw3/e;-><init>(Ls3/w;Ls3/y;Z)V

    iput-object v3, v2, Le4/d;->b:Lw3/e;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v1, Le4/e;

    invoke-direct {v1, v2, v0}, Le4/e;-><init>(Le4/d;Ls3/y;)V

    invoke-virtual {v3, v1}, Lw3/e;->e(Ls3/e;)V

    :goto_3
    sput-object v2, Lf3/i;->a:Ls3/g0;

    return-void

    :cond_a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "protocols must not contain null"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "protocols must not contain http/1.0: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "protocols containing h2_prior_knowledge cannot use other protocols: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "protocols must contain h2_prior_knowledge or http/1.1: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static d(Z)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x4b1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "black"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static e([BII)V
    .locals 5

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-wide v0, Lf3/i;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-wide v2, Lf3/i;->j:J

    sub-long/2addr v0, v2

    sget-wide v2, Lf3/i;->i:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p0

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x14

    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    new-instance p0, Lf/e;

    invoke-direct {p0}, Lf/e;-><init>()V

    const/16 v1, 0x515

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {p0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const-string v1, "data"

    invoke-virtual {p0, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {p0, v1, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v0, "width"

    invoke-virtual {p0, v0, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "height"

    invoke-virtual {p0, p2, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sput-wide p1, Lf3/i;->j:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "t"

    invoke-virtual {p0, p2, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lf3/i;->a:Ls3/g0;

    invoke-virtual {p0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static f([BLjava/lang/String;)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x517

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "type"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "name"

    invoke-virtual {v0, v1, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "data"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static g(Z)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x4b2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "forbid"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static h(Z)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x4b9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "iconStatus"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static i(IIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x51f

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "et"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "pa"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string p1, "ti"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "te"

    invoke-virtual {v0, p0, p4}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "pk"

    invoke-virtual {v0, p0, p5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p7, :cond_1

    const-string p0, "na"

    invoke-virtual {v0, p0, p7}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p6, :cond_2

    const-string p0, "de"

    invoke-virtual {v0, p0, p6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static j(IJ)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x3ea

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "lock"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    if-ne p0, v1, :cond_1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    const-string p1, "lockTime"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static k(Z)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x4b3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "media"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static l(Ljava/lang/String;III)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x528

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "packageName"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "customId"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "installed"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "done"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static declared-synchronized m([B)V
    .locals 6

    const-class v0, Lf3/i;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lf3/i;->a:Ls3/g0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    sget-wide v1, Lf3/i;->h:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sget-wide v3, Lf3/i;->h:J

    sub-long/2addr v1, v3

    sget-wide v3, Lf3/i;->g:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v5, v1, v3

    if-gez v5, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    :try_start_2
    new-instance v1, Lf/e;

    invoke-direct {v1}, Lf/e;-><init>()V

    const-string v2, "code"

    const/16 v3, 0x3ec

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "data"

    invoke-virtual {v1, v2, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sput-wide v2, Lf3/i;->h:J

    const-string p0, "t"

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, p0, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v1}, Lf/a;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p0, v1}, Ls3/g0;->b(Ljava/lang/String;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static n(ILjava/lang/String;Ljava/lang/String;)V
    .locals 3

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v1, 0x3ed

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "code"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "mcode"

    invoke-virtual {v0, v1, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "level"

    invoke-virtual {v0, p1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    const-string p0, "msg"

    invoke-virtual {v0, p0, p2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ls3/g0;->b(Ljava/lang/String;)Z

    return-void
.end method

.method public static o()V
    .locals 2

    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    const-wide/16 v0, 0xc8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    return-void
.end method

.method public static p(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const-string v1, "action"

    const-string v2, "updateCtrl"

    invoke-virtual {v0, v1, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "deviceId"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v1, "ctrlCmd"

    invoke-virtual {v0, v1, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lf3/i$b;

    invoke-direct {p0}, Lf3/i$b;-><init>()V

    invoke-static {v0, p0}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method
