.class public final Lz2/j;
.super Ljava/lang/Object;

# interfaces
.implements Lt2/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt2/f<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final n:Lx2/c;


# instance fields
.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final d:Lc3/c;

.field public final e:Lc3/b;

.field public final f:Lq2/d;

.field public final g:Lz2/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/d<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final h:Ljava/lang/String;

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field public m:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lz2/j;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, Lz2/j;->n:Lx2/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lt2/g;Lz2/d;Lc3/c;Lc3/d;Lc3/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lt2/g<",
            "TT;TID;>;",
            "Lz2/d<",
            "TT;>;",
            "Lc3/c;",
            "Lc3/d;",
            "Lc3/b;",
            "Ljava/lang/String;",
            "Lt2/m;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p5, 0x1

    iput-boolean p5, p0, Lz2/j;->i:Z

    iput-object p1, p0, Lz2/j;->b:Ljava/lang/Class;

    iput-object p2, p0, Lz2/j;->c:Lt2/g;

    iput-object p3, p0, Lz2/j;->g:Lz2/d;

    iput-object p4, p0, Lz2/j;->d:Lc3/c;

    iput-object p6, p0, Lz2/j;->e:Lc3/b;

    check-cast p6, Lq2/a;

    invoke-virtual {p6}, Lq2/a;->e()Lc3/e;

    move-result-object p1

    check-cast p1, Lq2/d;

    iput-object p1, p0, Lz2/j;->f:Lq2/d;

    iput-object p7, p0, Lz2/j;->h:Ljava/lang/String;

    if-eqz p7, :cond_0

    sget-object p1, Lz2/j;->n:Lx2/c;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "starting iterator @{} for \'{}\'"

    invoke-virtual {p1, p3, p2, p7}, Lx2/c;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-boolean v0, p0, Lz2/j;->j:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lz2/j;->k:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-boolean v0, p0, Lz2/j;->i:Z

    if-eqz v0, :cond_2

    iput-boolean v1, p0, Lz2/j;->i:Z

    iget-object v0, p0, Lz2/j;->f:Lq2/d;

    invoke-virtual {v0}, Lq2/d;->b()Z

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lz2/j;->f:Lq2/d;

    invoke-virtual {v0}, Lq2/d;->g()Z

    move-result v0

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lz2/j;->close()V

    :cond_3
    iput-boolean v2, p0, Lz2/j;->k:Z

    return v0
.end method

.method public final b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lz2/j;->j:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-boolean v0, p0, Lz2/j;->k:Z

    const/4 v2, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lz2/j;->i:Z

    if-eqz v0, :cond_1

    iput-boolean v2, p0, Lz2/j;->i:Z

    iget-object v0, p0, Lz2/j;->f:Lq2/d;

    invoke-virtual {v0}, Lq2/d;->b()Z

    move-result v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lz2/j;->f:Lq2/d;

    invoke-virtual {v0}, Lq2/d;->g()Z

    move-result v0

    :goto_0
    if-nez v0, :cond_2

    iput-boolean v2, p0, Lz2/j;->i:Z

    return-object v1

    :cond_2
    iput-boolean v2, p0, Lz2/j;->i:Z

    iget-object v0, p0, Lz2/j;->g:Lz2/d;

    iget-object v1, p0, Lz2/j;->f:Lq2/d;

    invoke-interface {v0, v1}, Lz2/d;->a(Lc3/e;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lz2/j;->l:Ljava/lang/Object;

    iput-boolean v2, p0, Lz2/j;->k:Z

    iget v1, p0, Lz2/j;->m:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lz2/j;->m:I

    return-object v0
.end method

.method public final c()V
    .locals 3

    iget-object v0, p0, Lz2/j;->l:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lz2/j;->c:Lt2/g;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    :try_start_0
    invoke-interface {v1, v0}, Lt2/g;->o(Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v2, p0, Lz2/j;->l:Ljava/lang/Object;

    return-void

    :catchall_0
    move-exception v0

    iput-object v2, p0, Lz2/j;->l:Ljava/lang/Object;

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot remove "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lz2/j;->b:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " object because classDao not initialized"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No last "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lz2/j;->b:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " object to remove. Must be called after a call to next."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lz2/j;->j:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lz2/j;->e:Lc3/b;

    check-cast v0, Lq2/a;

    invoke-virtual {v0}, Lq2/a;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lz2/j;->j:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lz2/j;->l:Ljava/lang/Object;

    iget-object v0, p0, Lz2/j;->h:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v0, Lz2/j;->n:Lx2/c;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p0, Lz2/j;->m:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "closed iterator @{} after {} rows"

    invoke-virtual {v0, v3, v1, v2}, Lx2/c;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lz2/j;->d:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final hasNext()Z
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lz2/j;->a()Z

    move-result v0
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    const/4 v1, 0x0

    iput-object v1, p0, Lz2/j;->l:Ljava/lang/Object;

    :try_start_1
    invoke-virtual {p0}, Lz2/j;->close()V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Errors getting more results of "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lz2/j;->b:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final moveToNext()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lz2/j;->l:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/j;->i:Z

    iput-boolean v0, p0, Lz2/j;->k:Z

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lz2/j;->b()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception v1

    :goto_0
    iput-object v0, p0, Lz2/j;->l:Ljava/lang/Object;

    :try_start_1
    invoke-virtual {p0}, Lz2/j;->close()V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Could not get next result for "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lz2/j;->b:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final remove()V
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Lz2/j;->c()V
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    :try_start_1
    invoke-virtual {p0}, Lz2/j;->close()V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Could not delete "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lz2/j;->b:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " object "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lz2/j;->l:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
