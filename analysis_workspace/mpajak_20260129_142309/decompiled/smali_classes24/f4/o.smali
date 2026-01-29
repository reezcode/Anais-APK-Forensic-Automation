.class public final Lf4/o;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/a0;


# instance fields
.field public b:I

.field public c:Z

.field public final d:Lf4/h;

.field public final e:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>(Lf4/a0;Ljava/util/zip/Inflater;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "inflater"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ld1/d;->e(Lf4/a0;)Lf4/h;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/o;->d:Lf4/h;

    iput-object p2, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    return-void
.end method

.method public constructor <init>(Lf4/h;Ljava/util/zip/Inflater;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflater"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/o;->d:Lf4/h;

    iput-object p2, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    return-void
.end method


# virtual methods
.method public final a(Lf4/f;J)J
    .locals 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const-wide/16 v1, 0x0

    cmp-long v3, p2, v1

    if-ltz v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_8

    iget-boolean v4, p0, Lf4/o;->c:Z

    xor-int/2addr v4, v0

    if-eqz v4, :cond_7

    if-nez v3, :cond_1

    return-wide v1

    :cond_1
    :try_start_0
    invoke-virtual {p1, v0}, Lf4/f;->w(I)Lf4/v;

    move-result-object v0

    iget v3, v0, Lf4/v;->c:I

    rsub-int v3, v3, 0x2000

    int-to-long v3, v3

    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p3, p2

    iget-object p2, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    invoke-virtual {p2}, Ljava/util/zip/Inflater;->needsInput()Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lf4/o;->d:Lf4/h;

    invoke-interface {p2}, Lf4/h;->B()Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lf4/o;->d:Lf4/h;

    invoke-interface {p2}, Lf4/h;->h()Lf4/f;

    move-result-object p2

    iget-object p2, p2, Lf4/f;->b:Lf4/v;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v3, p2, Lf4/v;->c:I

    iget v4, p2, Lf4/v;->b:I

    sub-int/2addr v3, v4

    iput v3, p0, Lf4/o;->b:I

    iget-object v5, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    iget-object p2, p2, Lf4/v;->a:[B

    invoke-virtual {v5, p2, v4, v3}, Ljava/util/zip/Inflater;->setInput([BII)V

    :goto_1
    iget-object p2, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    iget-object v3, v0, Lf4/v;->a:[B

    iget v4, v0, Lf4/v;->c:I

    invoke-virtual {p2, v3, v4, p3}, Ljava/util/zip/Inflater;->inflate([BII)I

    move-result p2

    iget p3, p0, Lf4/o;->b:I

    if-nez p3, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    invoke-virtual {v3}, Ljava/util/zip/Inflater;->getRemaining()I

    move-result v3

    sub-int/2addr p3, v3

    iget v3, p0, Lf4/o;->b:I

    sub-int/2addr v3, p3

    iput v3, p0, Lf4/o;->b:I

    iget-object v3, p0, Lf4/o;->d:Lf4/h;

    int-to-long v4, p3

    invoke-interface {v3, v4, v5}, Lf4/h;->skip(J)V

    :goto_2
    if-lez p2, :cond_5

    iget p3, v0, Lf4/v;->c:I

    add-int/2addr p3, p2

    iput p3, v0, Lf4/v;->c:I

    iget-wide v0, p1, Lf4/f;->c:J

    int-to-long p2, p2

    add-long/2addr v0, p2

    iput-wide v0, p1, Lf4/f;->c:J

    return-wide p2

    :cond_5
    iget p2, v0, Lf4/v;->b:I

    iget p3, v0, Lf4/v;->c:I

    if-ne p2, p3, :cond_6

    invoke-virtual {v0}, Lf4/v;->a()Lf4/v;

    move-result-object p2

    iput-object p2, p1, Lf4/f;->b:Lf4/v;

    invoke-static {v0}, Lf4/w;->b(Lf4/v;)V
    :try_end_0
    .catch Ljava/util/zip/DataFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    return-wide v1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    const-string p1, "byteCount < 0: "

    invoke-static {p1, p2, p3}, Landroidx/activity/result/a;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lf4/o;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf4/o;->c:Z

    iget-object v0, p0, Lf4/o;->d:Lf4/h;

    invoke-interface {v0}, Lf4/a0;->close()V

    return-void
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lf4/o;->d:Lf4/h;

    invoke-interface {v0}, Lf4/a0;->i()Lf4/b0;

    move-result-object v0

    return-object v0
.end method

.method public final u(Lf4/f;J)J
    .locals 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lf4/o;->a(Lf4/f;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lf4/o;->e:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->needsDictionary()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lf4/o;->d:Lf4/h;

    invoke-interface {v0}, Lf4/h;->B()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/EOFException;

    const-string p2, "source exhausted prematurely"

    invoke-direct {p1, p2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    const-wide/16 p1, -0x1

    return-wide p1
.end method
