.class public abstract Lt2/d;
.super Ljava/lang/Object;

# interfaces
.implements Lt2/k;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt2/k<",
        "TT;>;",
        "Ljava/io/Serializable;"
    }
.end annotation


# instance fields
.field public final transient b:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final transient c:Lv2/g;

.field public final transient d:Ljava/lang/Object;

.field public transient e:La3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final transient f:Ljava/lang/String;

.field public final transient g:Z

.field public final transient h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lt2/g;Ljava/lang/Object;Ljava/lang/Object;Lv2/g;Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt2/g<",
            "TT;TID;>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Lv2/g;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt2/d;->b:Lt2/g;

    iput-object p4, p0, Lt2/d;->c:Lv2/g;

    iput-object p3, p0, Lt2/d;->d:Ljava/lang/Object;

    iput-object p5, p0, Lt2/d;->f:Ljava/lang/String;

    iput-boolean p6, p0, Lt2/d;->g:Z

    iput-object p2, p0, Lt2/d;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p1}, Lt2/d;->l(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not create data element in dao"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+TT;>;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    invoke-virtual {p0, v1}, Lt2/d;->l(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not create data elements in dao"

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    return v0
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, Lt2/d;->b:Lt2/g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lt2/e;->b()Lt2/f;

    move-result-object v0

    :goto_0
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    :try_start_1
    invoke-interface {v0}, Lt2/f;->close()V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-interface {v0}, Lt2/f;->close()V
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    throw v1
.end method

.method public final l(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lt2/d;->b:Lt2/g;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lt2/d;->h:Ljava/lang/Object;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    iget-object v0, p0, Lt2/d;->c:Lv2/g;

    invoke-virtual {v0, p1}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lv2/g;->l(Ljava/lang/Object;)Z

    move-result v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    move-object v2, v3

    :cond_1
    if-nez v2, :cond_2

    iget-object v0, p0, Lt2/d;->c:Lv2/g;

    iget-object v2, p0, Lt2/d;->h:Ljava/lang/Object;

    invoke-virtual {v0, p1, v2, v1, v3}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    :cond_2
    iget-object v0, p0, Lt2/d;->b:Lt2/g;

    invoke-interface {v0, p1}, Lt2/g;->n(Ljava/lang/Object;)I

    return v1
.end method

.method public final r()Lz2/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz2/f<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lt2/d;->b:Lt2/g;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v1, p0, Lt2/d;->e:La3/e;

    if-nez v1, :cond_2

    new-instance v1, Lz2/i;

    invoke-direct {v1}, Lz2/i;-><init>()V

    iget-object v2, p0, Lt2/d;->d:Ljava/lang/Object;

    const/4 v3, 0x1

    iput-boolean v3, v1, Lz2/i;->c:Z

    iput-object v2, v1, Lz2/i;->d:Ljava/lang/Object;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    iget-object v2, p0, Lt2/d;->f:Ljava/lang/String;

    if-eqz v2, :cond_1

    iget-boolean v3, p0, Lt2/d;->g:Z

    invoke-virtual {v0, v2, v3}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    :cond_1
    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v0

    iget-object v2, p0, Lt2/d;->c:Lv2/g;

    iget-object v2, v2, Lv2/g;->d:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v0}, Lz2/m;->j()Lz2/f;

    move-result-object v0

    move-object v1, v0

    check-cast v1, La3/e;

    iput-object v1, p0, Lt2/d;->e:La3/e;

    check-cast v0, La3/e;

    iget-object v1, p0, Lt2/d;->h:Ljava/lang/Object;

    iget-object v2, p0, Lt2/d;->d:Ljava/lang/Object;

    iput-object v1, v0, La3/a;->i:Ljava/lang/Object;

    iput-object v2, v0, La3/a;->j:Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Lt2/d;->e:La3/e;

    return-object v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    iget-object v0, p0, Lt2/d;->b:Lt2/g;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Lt2/e;->b()Lt2/f;

    move-result-object v0

    :cond_1
    :goto_0
    :try_start_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    :try_start_1
    invoke-interface {v0}, Lt2/f;->close()V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return v1

    :catchall_0
    move-exception p1

    :try_start_2
    invoke-interface {v0}, Lt2/f;->close()V
    :try_end_2
    .catch Ljava/sql/SQLException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    throw p1
.end method
