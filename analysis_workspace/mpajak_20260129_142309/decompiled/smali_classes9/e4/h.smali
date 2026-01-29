.class public final Le4/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Lf4/f;

.field public final c:Lf4/f;

.field public d:Z

.field public e:Le4/a;

.field public final f:[B

.field public final g:Lf4/f$a;

.field public final h:Z

.field public final i:Lf4/g;

.field public final j:Ljava/util/Random;

.field public final k:Z

.field public final l:Z

.field public final m:J


# direct methods
.method public constructor <init>(ZLf4/g;Ljava/util/Random;ZZJ)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Le4/h;->h:Z

    iput-object p2, p0, Le4/h;->i:Lf4/g;

    iput-object p3, p0, Le4/h;->j:Ljava/util/Random;

    iput-boolean p4, p0, Le4/h;->k:Z

    iput-boolean p5, p0, Le4/h;->l:Z

    iput-wide p6, p0, Le4/h;->m:J

    new-instance p3, Lf4/f;

    invoke-direct {p3}, Lf4/f;-><init>()V

    iput-object p3, p0, Le4/h;->b:Lf4/f;

    invoke-interface {p2}, Lf4/g;->h()Lf4/f;

    move-result-object p2

    iput-object p2, p0, Le4/h;->c:Lf4/f;

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p3, 0x4

    new-array p3, p3, [B

    goto :goto_0

    :cond_0
    move-object p3, p2

    :goto_0
    iput-object p3, p0, Le4/h;->f:[B

    if-eqz p1, :cond_1

    new-instance p2, Lf4/f$a;

    invoke-direct {p2}, Lf4/f$a;-><init>()V

    :cond_1
    iput-object p2, p0, Le4/h;->g:Lf4/f$a;

    return-void
.end method


# virtual methods
.method public final a(ILf4/i;)V
    .locals 6

    iget-boolean v0, p0, Le4/h;->d:Z

    if-nez v0, :cond_4

    invoke-virtual {p2}, Lf4/i;->c()I

    move-result v0

    int-to-long v1, v0

    const-wide/16 v3, 0x7d

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    or-int/lit16 p1, p1, 0x80

    iget-object v1, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {v1, p1}, Lf4/f;->A(I)Lf4/f;

    iget-boolean p1, p0, Le4/h;->h:Z

    if-eqz p1, :cond_1

    or-int/lit16 p1, v0, 0x80

    iget-object v1, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {v1, p1}, Lf4/f;->A(I)Lf4/f;

    iget-object p1, p0, Le4/h;->j:Ljava/util/Random;

    iget-object v1, p0, Le4/h;->f:[B

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    iget-object p1, p0, Le4/h;->c:Lf4/f;

    iget-object v1, p0, Le4/h;->f:[B

    invoke-virtual {p1, v1}, Lf4/f;->y([B)Lf4/f;

    if-lez v0, :cond_2

    iget-object p1, p0, Le4/h;->c:Lf4/f;

    iget-wide v0, p1, Lf4/f;->c:J

    invoke-virtual {p1, p2}, Lf4/f;->x(Lf4/i;)Lf4/f;

    iget-object p1, p0, Le4/h;->c:Lf4/f;

    iget-object p2, p0, Le4/h;->g:Lf4/f$a;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lf4/f;->f(Lf4/f$a;)Lf4/f$a;

    iget-object p1, p0, Le4/h;->g:Lf4/f$a;

    invoke-virtual {p1, v0, v1}, Lf4/f$a;->b(J)I

    iget-object p1, p0, Le4/h;->g:Lf4/f$a;

    iget-object p2, p0, Le4/h;->f:[B

    invoke-static {p1, p2}, Li/g;->I(Lf4/f$a;[B)V

    iget-object p1, p0, Le4/h;->g:Lf4/f$a;

    invoke-virtual {p1}, Lf4/f$a;->close()V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {p1, v0}, Lf4/f;->A(I)Lf4/f;

    iget-object p1, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {p1, p2}, Lf4/f;->x(Lf4/i;)Lf4/f;

    :cond_2
    :goto_1
    iget-object p1, p0, Le4/h;->i:Lf4/g;

    invoke-interface {p1}, Lf4/g;->flush()V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Payload size must be less than or equal to 125"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(ILf4/i;)V
    .locals 13

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le4/h;->d:Z

    if-nez v0, :cond_e

    iget-object v0, p0, Le4/h;->b:Lf4/f;

    invoke-virtual {v0, p2}, Lf4/f;->x(Lf4/i;)Lf4/f;

    or-int/lit16 p1, p1, 0x80

    iget-boolean v0, p0, Le4/h;->k:Z

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {p2}, Lf4/i;->c()I

    move-result p2

    int-to-long v4, p2

    iget-wide v6, p0, Le4/h;->m:J

    cmp-long p2, v4, v6

    if-ltz p2, :cond_9

    iget-object p2, p0, Le4/h;->e:Le4/a;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p2, Le4/a;

    iget-boolean v0, p0, Le4/h;->l:Z

    invoke-direct {p2, v0}, Le4/a;-><init>(Z)V

    iput-object p2, p0, Le4/h;->e:Le4/a;

    :goto_0
    iget-object v0, p0, Le4/h;->b:Lf4/f;

    const-string v4, "buffer"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p2, Le4/a;->b:Lf4/f;

    iget-wide v4, v4, Lf4/f;->c:J

    const/4 v6, 0x1

    cmp-long v7, v4, v1

    if-nez v7, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_8

    iget-boolean v4, p2, Le4/a;->e:Z

    if-eqz v4, :cond_2

    iget-object v4, p2, Le4/a;->c:Ljava/util/zip/Deflater;

    invoke-virtual {v4}, Ljava/util/zip/Deflater;->reset()V

    :cond_2
    iget-object v4, p2, Le4/a;->d:Lf4/j;

    iget-wide v7, v0, Lf4/f;->c:J

    invoke-virtual {v4, v0, v7, v8}, Lf4/j;->T(Lf4/f;J)V

    iget-object v4, p2, Le4/a;->d:Lf4/j;

    invoke-virtual {v4}, Lf4/j;->flush()V

    iget-object v4, p2, Le4/a;->b:Lf4/f;

    sget-object v5, Le4/b;->a:Lf4/i;

    iget-wide v7, v4, Lf4/f;->c:J

    invoke-virtual {v5}, Lf4/i;->c()I

    move-result v9

    int-to-long v9, v9

    sub-long/2addr v7, v9

    const-string v9, "bytes"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lf4/i;->c()I

    move-result v10

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    cmp-long v9, v7, v1

    if-ltz v9, :cond_5

    if-ltz v10, :cond_5

    iget-wide v1, v4, Lf4/f;->c:J

    sub-long/2addr v1, v7

    int-to-long v11, v10

    cmp-long v9, v1, v11

    if-ltz v9, :cond_5

    invoke-virtual {v5}, Lf4/i;->c()I

    move-result v1

    sub-int/2addr v1, v3

    if-ge v1, v10, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v10, :cond_6

    int-to-long v11, v1

    add-long/2addr v11, v7

    invoke-virtual {v4, v11, v12}, Lf4/f;->c(J)B

    move-result v2

    add-int v9, v3, v1

    invoke-virtual {v5, v9}, Lf4/i;->f(I)B

    move-result v9

    if-eq v2, v9, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    :goto_3
    const/4 v6, 0x0

    :cond_6
    iget-object v1, p2, Le4/a;->b:Lf4/f;

    if-eqz v6, :cond_7

    iget-wide v2, v1, Lf4/f;->c:J

    const/4 v4, 0x4

    int-to-long v4, v4

    sub-long/2addr v2, v4

    new-instance v4, Lf4/f$a;

    invoke-direct {v4}, Lf4/f$a;-><init>()V

    invoke-virtual {v1, v4}, Lf4/f;->f(Lf4/f$a;)Lf4/f$a;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v4, v2, v3}, Lf4/f$a;->a(J)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v4, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_4

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v4, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2

    :cond_7
    invoke-virtual {v1, v3}, Lf4/f;->A(I)Lf4/f;

    :goto_4
    iget-object p2, p2, Le4/a;->b:Lf4/f;

    iget-wide v1, p2, Lf4/f;->c:J

    invoke-virtual {v0, p2, v1, v2}, Lf4/f;->T(Lf4/f;J)V

    or-int/lit8 p1, p1, 0x40

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_5
    iget-object p2, p0, Le4/h;->b:Lf4/f;

    iget-wide v0, p2, Lf4/f;->c:J

    iget-object p2, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {p2, p1}, Lf4/f;->A(I)Lf4/f;

    iget-boolean p1, p0, Le4/h;->h:Z

    if-eqz p1, :cond_a

    const/16 p1, 0x80

    goto :goto_6

    :cond_a
    const/4 p1, 0x0

    :goto_6
    const-wide/16 v2, 0x7d

    cmp-long p2, v0, v2

    if-gtz p2, :cond_b

    long-to-int p2, v0

    or-int/2addr p1, p2

    iget-object p2, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {p2, p1}, Lf4/f;->A(I)Lf4/f;

    goto/16 :goto_7

    :cond_b
    const-wide/32 v2, 0xffff

    cmp-long p2, v0, v2

    if-gtz p2, :cond_c

    or-int/lit8 p1, p1, 0x7e

    iget-object p2, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {p2, p1}, Lf4/f;->A(I)Lf4/f;

    iget-object p1, p0, Le4/h;->c:Lf4/f;

    long-to-int p2, v0

    invoke-virtual {p1, p2}, Lf4/f;->J(I)Lf4/f;

    goto :goto_7

    :cond_c
    or-int/lit8 p1, p1, 0x7f

    iget-object p2, p0, Le4/h;->c:Lf4/f;

    invoke-virtual {p2, p1}, Lf4/f;->A(I)Lf4/f;

    iget-object p1, p0, Le4/h;->c:Lf4/f;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Lf4/f;->w(I)Lf4/v;

    move-result-object v2

    iget-object v3, v2, Lf4/v;->a:[B

    iget v4, v2, Lf4/v;->c:I

    add-int/lit8 v5, v4, 0x1

    const/16 v6, 0x38

    ushr-long v6, v0, v6

    const-wide/16 v8, 0xff

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v3, v4

    add-int/lit8 v4, v5, 0x1

    const/16 v6, 0x30

    ushr-long v6, v0, v6

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v3, v5

    add-int/lit8 v5, v4, 0x1

    const/16 v6, 0x28

    ushr-long v6, v0, v6

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v3, v4

    add-int/lit8 v4, v5, 0x1

    const/16 v6, 0x20

    ushr-long v6, v0, v6

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v3, v5

    add-int/lit8 v5, v4, 0x1

    const/16 v6, 0x18

    ushr-long v6, v0, v6

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v3, v4

    add-int/lit8 v4, v5, 0x1

    const/16 v6, 0x10

    ushr-long v6, v0, v6

    and-long/2addr v6, v8

    long-to-int v7, v6

    int-to-byte v6, v7

    aput-byte v6, v3, v5

    add-int/lit8 v5, v4, 0x1

    ushr-long v6, v0, p2

    and-long/2addr v6, v8

    long-to-int p2, v6

    int-to-byte p2, p2

    aput-byte p2, v3, v4

    add-int/lit8 p2, v5, 0x1

    and-long v6, v0, v8

    long-to-int v4, v6

    int-to-byte v4, v4

    aput-byte v4, v3, v5

    iput p2, v2, Lf4/v;->c:I

    iget-wide v2, p1, Lf4/f;->c:J

    const-wide/16 v4, 0x8

    add-long/2addr v2, v4

    iput-wide v2, p1, Lf4/f;->c:J

    :goto_7
    iget-boolean p1, p0, Le4/h;->h:Z

    if-eqz p1, :cond_d

    iget-object p1, p0, Le4/h;->j:Ljava/util/Random;

    iget-object p2, p0, Le4/h;->f:[B

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Ljava/util/Random;->nextBytes([B)V

    iget-object p1, p0, Le4/h;->c:Lf4/f;

    iget-object p2, p0, Le4/h;->f:[B

    invoke-virtual {p1, p2}, Lf4/f;->y([B)Lf4/f;

    const-wide/16 p1, 0x0

    cmp-long v2, v0, p1

    if-lez v2, :cond_d

    iget-object v2, p0, Le4/h;->b:Lf4/f;

    iget-object v3, p0, Le4/h;->g:Lf4/f$a;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lf4/f;->f(Lf4/f$a;)Lf4/f$a;

    iget-object v2, p0, Le4/h;->g:Lf4/f$a;

    invoke-virtual {v2, p1, p2}, Lf4/f$a;->b(J)I

    iget-object p1, p0, Le4/h;->g:Lf4/f$a;

    iget-object p2, p0, Le4/h;->f:[B

    invoke-static {p1, p2}, Li/g;->I(Lf4/f$a;[B)V

    iget-object p1, p0, Le4/h;->g:Lf4/f$a;

    invoke-virtual {p1}, Lf4/f$a;->close()V

    :cond_d
    iget-object p1, p0, Le4/h;->c:Lf4/f;

    iget-object p2, p0, Le4/h;->b:Lf4/f;

    invoke-virtual {p1, p2, v0, v1}, Lf4/f;->T(Lf4/f;J)V

    iget-object p1, p0, Le4/h;->i:Lf4/g;

    invoke-interface {p1}, Lf4/g;->m()Lf4/g;

    return-void

    :cond_e
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Le4/h;->e:Le4/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Le4/a;->close()V

    :cond_0
    return-void
.end method
