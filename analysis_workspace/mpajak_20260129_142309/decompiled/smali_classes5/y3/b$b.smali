.class public final Ly3/b$b;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final b:Lf4/m;

.field public c:Z

.field public final synthetic d:Ly3/b;


# direct methods
.method public constructor <init>(Ly3/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly3/b$b;->d:Ly3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf4/m;

    iget-object p1, p1, Ly3/b;->g:Lf4/g;

    invoke-interface {p1}, Lf4/y;->i()Lf4/b0;

    move-result-object p1

    invoke-direct {v0, p1}, Lf4/m;-><init>(Lf4/b0;)V

    iput-object v0, p0, Ly3/b$b;->b:Lf4/m;

    return-void
.end method


# virtual methods
.method public final T(Lf4/f;J)V
    .locals 3

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ly3/b$b;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ly3/b$b;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0, p2, p3}, Lf4/g;->k(J)Lf4/g;

    iget-object v0, p0, Ly3/b$b;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->g:Lf4/g;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    iget-object v0, p0, Ly3/b$b;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0, p1, p2, p3}, Lf4/y;->T(Lf4/f;J)V

    iget-object p1, p0, Ly3/b$b;->d:Ly3/b;

    iget-object p1, p1, Ly3/b;->g:Lf4/g;

    invoke-interface {p1, v1}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized close()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ly3/b$b;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Ly3/b$b;->c:Z

    iget-object v0, p0, Ly3/b$b;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->g:Lf4/g;

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, Lf4/g;->d0(Ljava/lang/String;)Lf4/g;

    iget-object v0, p0, Ly3/b$b;->d:Ly3/b;

    iget-object v1, p0, Ly3/b$b;->b:Lf4/m;

    invoke-static {v0, v1}, Ly3/b;->i(Ly3/b;Lf4/m;)V

    iget-object v0, p0, Ly3/b$b;->d:Ly3/b;

    const/4 v1, 0x3

    iput v1, v0, Ly3/b;->a:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Ly3/b$b;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Ly3/b$b;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0}, Lf4/g;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Ly3/b$b;->b:Lf4/m;

    return-object v0
.end method
