.class public final Lf4/t;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/g;


# instance fields
.field public final b:Lf4/f;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public c:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final d:Lf4/y;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf4/y;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/t;->d:Lf4/y;

    new-instance p1, Lf4/f;

    invoke-direct {p1}, Lf4/f;-><init>()V

    iput-object p1, p0, Lf4/t;->b:Lf4/f;

    return-void
.end method


# virtual methods
.method public final C(I)Lf4/g;
    .locals 1

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1}, Lf4/f;->A(I)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final G([B)Lf4/g;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1}, Lf4/f;->y([B)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final L()Lf4/g;
    .locals 7

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    iget-wide v1, v0, Lf4/f;->c:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    move-wide v1, v3

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lf4/f;->b:Lf4/v;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v0, v0, Lf4/v;->g:Lf4/v;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v5, v0, Lf4/v;->c:I

    const/16 v6, 0x2000

    if-ge v5, v6, :cond_1

    iget-boolean v6, v0, Lf4/v;->e:Z

    if-eqz v6, :cond_1

    iget v0, v0, Lf4/v;->b:I

    sub-int/2addr v5, v0

    int-to-long v5, v5

    sub-long/2addr v1, v5

    :cond_1
    :goto_0
    cmp-long v0, v1, v3

    if-lez v0, :cond_2

    iget-object v0, p0, Lf4/t;->d:Lf4/y;

    iget-object v3, p0, Lf4/t;->b:Lf4/f;

    invoke-interface {v0, v3, v1, v2}, Lf4/y;->T(Lf4/f;J)V

    :cond_2
    return-object p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final T(Lf4/f;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1, p2, p3}, Lf4/f;->T(Lf4/f;J)V

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final X(Lf4/i;)Lf4/g;
    .locals 1

    const-string v0, "byteString"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1}, Lf4/f;->x(Lf4/i;)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b0(Lf4/a0;)J
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, Lf4/t;->b:Lf4/f;

    const/16 v3, 0x2000

    int-to-long v3, v3

    move-object v5, p1

    check-cast v5, Lf4/p;

    invoke-virtual {v5, v2, v3, v4}, Lf4/p;->u(Lf4/f;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    return-wide v0

    :cond_0
    add-long/2addr v0, v2

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    goto :goto_0
.end method

.method public final close()V
    .locals 7

    iget-boolean v0, p0, Lf4/t;->c:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lf4/t;->b:Lf4/f;

    iget-wide v2, v1, Lf4/f;->c:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    iget-object v4, p0, Lf4/t;->d:Lf4/y;

    invoke-interface {v4, v1, v2, v3}, Lf4/y;->T(Lf4/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Lf4/t;->d:Lf4/y;

    invoke-interface {v1}, Lf4/y;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lf4/t;->c:Z

    if-nez v0, :cond_3

    :goto_2
    return-void

    :cond_3
    throw v0
.end method

.method public final d0(Ljava/lang/String;)Lf4/g;
    .locals 1

    const-string v0, "string"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1}, Lf4/f;->K(Ljava/lang/String;)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e0(J)Lf4/g;
    .locals 1

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1, p2}, Lf4/f;->E(J)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final flush()V
    .locals 6

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    iget-wide v1, v0, Lf4/f;->c:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    iget-object v3, p0, Lf4/t;->d:Lf4/y;

    invoke-interface {v3, v0, v1, v2}, Lf4/y;->T(Lf4/f;J)V

    :cond_0
    iget-object v0, p0, Lf4/t;->d:Lf4/y;

    invoke-interface {v0}, Lf4/y;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h()Lf4/f;
    .locals 1

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    return-object v0
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lf4/t;->d:Lf4/y;

    invoke-interface {v0}, Lf4/y;->i()Lf4/b0;

    move-result-object v0

    return-object v0
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final j([BII)Lf4/g;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1, p2, p3}, Lf4/f;->z([BII)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(J)Lf4/g;
    .locals 1

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1, p2}, Lf4/f;->H(J)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final m()Lf4/g;
    .locals 6

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    iget-wide v1, v0, Lf4/f;->c:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    iget-object v3, p0, Lf4/t;->d:Lf4/y;

    invoke-interface {v3, v0, v1, v2}, Lf4/y;->T(Lf4/f;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o(I)Lf4/g;
    .locals 1

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1}, Lf4/f;->J(I)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final t(I)Lf4/g;
    .locals 1

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1}, Lf4/f;->I(I)Lf4/f;

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "buffer("

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lf4/t;->d:Lf4/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lf4/t;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lf4/t;->b:Lf4/f;

    invoke-virtual {v0, p1}, Lf4/f;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lf4/t;->L()Lf4/g;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
