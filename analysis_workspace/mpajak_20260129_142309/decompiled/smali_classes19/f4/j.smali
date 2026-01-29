.class public final Lf4/j;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/y;


# instance fields
.field public b:Z

.field public final c:Lf4/g;

.field public final d:Ljava/util/zip/Deflater;


# direct methods
.method public constructor <init>(Lf4/y;Ljava/util/zip/Deflater;)V
    .locals 2

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "deflater"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ld1/d;->d(Lf4/y;)Lf4/g;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/j;->c:Lf4/g;

    iput-object p2, p0, Lf4/j;->d:Ljava/util/zip/Deflater;

    return-void
.end method


# virtual methods
.method public final T(Lf4/f;J)V
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v1, p1, Lf4/f;->c:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lf4/b;->b(JJJ)V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    iget-object v0, p1, Lf4/f;->b:Lf4/v;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lf4/v;->c:I

    iget v2, v0, Lf4/v;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iget-object v1, p0, Lf4/j;->d:Ljava/util/zip/Deflater;

    iget-object v3, v0, Lf4/v;->a:[B

    iget v4, v0, Lf4/v;->b:I

    invoke-virtual {v1, v3, v4, v2}, Ljava/util/zip/Deflater;->setInput([BII)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lf4/j;->a(Z)V

    iget-wide v3, p1, Lf4/f;->c:J

    int-to-long v5, v2

    sub-long/2addr v3, v5

    iput-wide v3, p1, Lf4/f;->c:J

    iget v1, v0, Lf4/v;->b:I

    add-int/2addr v1, v2

    iput v1, v0, Lf4/v;->b:I

    iget v2, v0, Lf4/v;->c:I

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lf4/v;->a()Lf4/v;

    move-result-object v1

    iput-object v1, p1, Lf4/f;->b:Lf4/v;

    invoke-static {v0}, Lf4/w;->b(Lf4/v;)V

    :cond_0
    sub-long/2addr p2, v5

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final a(Z)V
    .locals 7
    .annotation build Lorg/codehaus/mojo/animal_sniffer/IgnoreJRERequirement;
    .end annotation

    iget-object v0, p0, Lf4/j;->c:Lf4/g;

    invoke-interface {v0}, Lf4/g;->h()Lf4/f;

    move-result-object v0

    :cond_0
    :goto_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lf4/f;->w(I)Lf4/v;

    move-result-object v1

    iget-object v2, p0, Lf4/j;->d:Ljava/util/zip/Deflater;

    iget-object v3, v1, Lf4/v;->a:[B

    iget v4, v1, Lf4/v;->c:I

    rsub-int v5, v4, 0x2000

    if-eqz p1, :cond_1

    const/4 v6, 0x2

    invoke-virtual {v2, v3, v4, v5, v6}, Ljava/util/zip/Deflater;->deflate([BIII)I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v3, v4, v5}, Ljava/util/zip/Deflater;->deflate([BII)I

    move-result v2

    :goto_1
    if-lez v2, :cond_2

    iget v3, v1, Lf4/v;->c:I

    add-int/2addr v3, v2

    iput v3, v1, Lf4/v;->c:I

    iget-wide v3, v0, Lf4/f;->c:J

    int-to-long v1, v2

    add-long/2addr v3, v1

    iput-wide v3, v0, Lf4/f;->c:J

    iget-object v1, p0, Lf4/j;->c:Lf4/g;

    invoke-interface {v1}, Lf4/g;->L()Lf4/g;

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lf4/j;->d:Ljava/util/zip/Deflater;

    invoke-virtual {v2}, Ljava/util/zip/Deflater;->needsInput()Z

    move-result v2

    if-eqz v2, :cond_0

    iget p1, v1, Lf4/v;->b:I

    iget v2, v1, Lf4/v;->c:I

    if-ne p1, v2, :cond_3

    invoke-virtual {v1}, Lf4/v;->a()Lf4/v;

    move-result-object p1

    iput-object p1, v0, Lf4/f;->b:Lf4/v;

    invoke-static {v1}, Lf4/w;->b(Lf4/v;)V

    :cond_3
    return-void
.end method

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Lf4/j;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lf4/j;->d:Ljava/util/zip/Deflater;

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->finish()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lf4/j;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :goto_0
    :try_start_1
    iget-object v1, p0, Lf4/j;->d:Ljava/util/zip/Deflater;

    invoke-virtual {v1}, Ljava/util/zip/Deflater;->end()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_1

    move-object v0, v1

    :cond_1
    :goto_1
    :try_start_2
    iget-object v1, p0, Lf4/j;->c:Lf4/g;

    invoke-interface {v1}, Lf4/y;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_2
    const/4 v1, 0x1

    iput-boolean v1, p0, Lf4/j;->b:Z

    if-nez v0, :cond_3

    return-void

    :cond_3
    throw v0
.end method

.method public final flush()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lf4/j;->a(Z)V

    iget-object v0, p0, Lf4/j;->c:Lf4/g;

    invoke-interface {v0}, Lf4/g;->flush()V

    return-void
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lf4/j;->c:Lf4/g;

    invoke-interface {v0}, Lf4/y;->i()Lf4/b0;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "DeflaterSink("

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lf4/j;->c:Lf4/g;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
