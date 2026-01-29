.class public final Lt2/i;
.super Ljava/lang/Object;

# interfaces
.implements Lt2/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lt2/f<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public b:I

.field public final synthetic c:Lt2/j;


# direct methods
.method public constructor <init>(Lt2/j;)V
    .locals 0

    iput-object p1, p0, Lt2/i;->c:Lt2/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lt2/i;->b:I

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final hasNext()Z
    .locals 3

    iget v0, p0, Lt2/i;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lt2/i;->c:Lt2/j;

    iget-object v2, v2, Lt2/j;->i:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final moveToNext()V
    .locals 1

    iget v0, p0, Lt2/i;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lt2/i;->b:I

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget v0, p0, Lt2/i;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lt2/i;->b:I

    iget-object v1, p0, Lt2/i;->c:Lt2/j;

    iget-object v1, v1, Lt2/j;->i:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final remove()V
    .locals 4

    iget v0, p0, Lt2/i;->b:I

    if-ltz v0, :cond_2

    iget-object v1, p0, Lt2/i;->c:Lt2/j;

    iget-object v1, v1, Lt2/j;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v0, p0, Lt2/i;->c:Lt2/j;

    iget-object v0, v0, Lt2/j;->i:Ljava/util/List;

    iget v1, p0, Lt2/i;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt2/i;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lt2/i;->b:I

    iget-object v1, p0, Lt2/i;->c:Lt2/j;

    iget-object v1, v1, Lt2/d;->b:Lt2/g;

    if-eqz v1, :cond_0

    :try_start_0
    invoke-interface {v1, v0}, Lt2/g;->o(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "current results position ("

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lt2/i;->b:I

    const-string v3, ") is out of bounds"

    invoke-static {v1, v2, v3}, Landroidx/appcompat/view/a;->h(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "next() must be called before remove()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
