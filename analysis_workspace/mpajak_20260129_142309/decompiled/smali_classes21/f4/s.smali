.class public final Lf4/s;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/y;


# instance fields
.field public final b:Ljava/io/OutputStream;

.field public final c:Lf4/b0;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lf4/b0;)V
    .locals 1

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/s;->b:Ljava/io/OutputStream;

    iput-object p2, p0, Lf4/s;->c:Lf4/b0;

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

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    iget-object v0, p0, Lf4/s;->c:Lf4/b0;

    invoke-virtual {v0}, Lf4/b0;->f()V

    iget-object v0, p1, Lf4/f;->b:Lf4/v;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v1, v0, Lf4/v;->c:I

    iget v2, v0, Lf4/v;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iget-object v1, p0, Lf4/s;->b:Ljava/io/OutputStream;

    iget-object v3, v0, Lf4/v;->a:[B

    iget v4, v0, Lf4/v;->b:I

    invoke-virtual {v1, v3, v4, v2}, Ljava/io/OutputStream;->write([BII)V

    iget v1, v0, Lf4/v;->b:I

    add-int/2addr v1, v2

    iput v1, v0, Lf4/v;->b:I

    int-to-long v2, v2

    sub-long/2addr p2, v2

    iget-wide v4, p1, Lf4/f;->c:J

    sub-long/2addr v4, v2

    iput-wide v4, p1, Lf4/f;->c:J

    iget v2, v0, Lf4/v;->c:I

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lf4/v;->a()Lf4/v;

    move-result-object v1

    iput-object v1, p1, Lf4/f;->b:Lf4/v;

    invoke-static {v0}, Lf4/w;->b(Lf4/v;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lf4/s;->b:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lf4/s;->b:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lf4/s;->c:Lf4/b0;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "sink("

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lf4/s;->b:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
