.class public final Lu3/a;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/t;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu3/a$a;
    }
.end annotation


# static fields
.field public static final a:Lu3/a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu3/a$a;

    invoke-direct {v0}, Lu3/a$a;-><init>()V

    sput-object v0, Lu3/a;->a:Lu3/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/t$a;)Ls3/b0;
    .locals 14

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, Lx3/g;

    iget-object v1, v0, Lx3/g;->b:Lw3/e;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v2, v0, Lx3/g;->f:Ls3/y;

    const-string v3, "request"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lu3/b;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lu3/b;-><init>(Ls3/y;Ls3/b0;)V

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ls3/y;->a()Ls3/c;

    move-result-object v2

    iget-boolean v2, v2, Ls3/c;->j:Z

    if-eqz v2, :cond_0

    new-instance v3, Lu3/b;

    invoke-direct {v3, v4, v4}, Lu3/b;-><init>(Ls3/y;Ls3/b0;)V

    :cond_0
    iget-object v2, v3, Lu3/b;->a:Ls3/y;

    iget-object v3, v3, Lu3/b;->b:Ls3/b0;

    instance-of v5, v1, Lw3/e;

    const-string v5, "response"

    const-string v6, "call"

    if-nez v2, :cond_1

    if-nez v3, :cond_1

    new-instance p1, Ls3/b0$a;

    invoke-direct {p1}, Ls3/b0$a;-><init>()V

    iget-object v0, v0, Lx3/g;->f:Ls3/y;

    invoke-virtual {p1, v0}, Ls3/b0$a;->g(Ls3/y;)Ls3/b0$a;

    sget-object v0, Ls3/x;->d:Ls3/x;

    const-string v2, "protocol"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p1, Ls3/b0$a;->b:Ls3/x;

    const/16 v0, 0x1f8

    iput v0, p1, Ls3/b0$a;->c:I

    const-string v0, "Unsatisfiable Request (only-if-cached)"

    const-string v2, "message"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p1, Ls3/b0$a;->d:Ljava/lang/String;

    sget-object v0, Lt3/c;->c:Ls3/c0;

    iput-object v0, p1, Ls3/b0$a;->g:Ls3/d0;

    const-wide/16 v2, -0x1

    iput-wide v2, p1, Ls3/b0$a;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p1, Ls3/b0$a;->l:J

    invoke-virtual {p1}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object p1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    if-nez v2, :cond_2

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance p1, Ls3/b0$a;

    invoke-direct {p1, v3}, Ls3/b0$a;-><init>(Ls3/b0;)V

    invoke-static {v3}, Lu3/a$a;->a(Ls3/b0;)Ls3/b0;

    move-result-object v0

    invoke-virtual {p1, v0}, Ls3/b0$a;->b(Ls3/b0;)Ls3/b0$a;

    invoke-virtual {p1}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object p1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    if-eqz v3, :cond_3

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedResponse"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    :try_start_0
    check-cast p1, Lx3/g;

    invoke-virtual {p1, v2}, Lx3/g;->b(Ls3/y;)Ls3/b0;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "networkResponse"

    if-eqz v3, :cond_b

    iget v1, p1, Ls3/b0;->e:I

    const/16 v2, 0x130

    if-ne v1, v2, :cond_a

    new-instance v1, Ls3/b0$a;

    invoke-direct {v1, v3}, Ls3/b0$a;-><init>(Ls3/b0;)V

    sget-object v2, Lu3/a;->a:Lu3/a$a;

    iget-object v5, v3, Ls3/b0;->g:Ls3/r;

    iget-object v6, p1, Ls3/b0;->g:Ls3/r;

    new-instance v7, Ls3/r$a;

    invoke-direct {v7}, Ls3/r$a;-><init>()V

    iget-object v8, v5, Ls3/r;->b:[Ljava/lang/String;

    array-length v8, v8

    div-int/lit8 v8, v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    if-ge v10, v8, :cond_7

    invoke-virtual {v5, v10}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v5, v10}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v12

    const-string v13, "Warning"

    invoke-static {v13, v11}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_4

    const-string v13, "1"

    invoke-static {v12, v13}, Lkotlin/text/StringsKt;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v2, v11}, Lu3/a$a;->b(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_5

    invoke-virtual {v2, v11}, Lu3/a$a;->c(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_5

    invoke-virtual {v6, v11}, Ls3/r;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_6

    :cond_5
    invoke-virtual {v7, v11, v12}, Ls3/r$a;->a(Ljava/lang/String;Ljava/lang/String;)Ls3/r$a;

    :cond_6
    :goto_1
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_7
    iget-object v5, v6, Ls3/r;->b:[Ljava/lang/String;

    array-length v5, v5

    div-int/lit8 v5, v5, 0x2

    :goto_2
    if-ge v9, v5, :cond_9

    invoke-virtual {v6, v9}, Ls3/r;->r(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Lu3/a$a;->b(Ljava/lang/String;)Z

    move-result v10

    if-nez v10, :cond_8

    invoke-virtual {v2, v8}, Lu3/a$a;->c(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-virtual {v6, v9}, Ls3/r;->t(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v8, v10}, Ls3/r$a;->a(Ljava/lang/String;Ljava/lang/String;)Ls3/r$a;

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_2

    :cond_9
    invoke-virtual {v7}, Ls3/r$a;->b()Ls3/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls3/b0$a;->d(Ls3/r;)Ls3/b0$a;

    iget-wide v5, p1, Ls3/b0;->l:J

    iput-wide v5, v1, Ls3/b0$a;->k:J

    iget-wide v5, p1, Ls3/b0;->m:J

    iput-wide v5, v1, Ls3/b0$a;->l:J

    invoke-static {v3}, Lu3/a$a;->a(Ls3/b0;)Ls3/b0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls3/b0$a;->b(Ls3/b0;)Ls3/b0$a;

    invoke-static {p1}, Lu3/a$a;->a(Ls3/b0;)Ls3/b0;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ls3/b0$a;->c(Ljava/lang/String;Ls3/b0;)V

    iput-object v2, v1, Ls3/b0$a;->h:Ls3/b0;

    invoke-virtual {v1}, Ls3/b0$a;->a()Ls3/b0;

    iget-object p1, p1, Ls3/b0;->h:Ls3/d0;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ls3/d0;->close()V

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    throw v4

    :cond_a
    iget-object v1, v3, Ls3/b0;->h:Ls3/d0;

    if-eqz v1, :cond_b

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_b
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v1, Ls3/b0$a;

    invoke-direct {v1, p1}, Ls3/b0$a;-><init>(Ls3/b0;)V

    invoke-static {v3}, Lu3/a$a;->a(Ls3/b0;)Ls3/b0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ls3/b0$a;->b(Ls3/b0;)Ls3/b0$a;

    invoke-static {p1}, Lu3/a$a;->a(Ls3/b0;)Ls3/b0;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ls3/b0$a;->c(Ljava/lang/String;Ls3/b0;)V

    iput-object p1, v1, Ls3/b0$a;->h:Ls3/b0;

    invoke-virtual {v1}, Ls3/b0$a;->a()Ls3/b0;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    throw p1
.end method
