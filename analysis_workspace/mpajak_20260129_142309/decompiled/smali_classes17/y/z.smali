.class public final Ly/z;
.super Ljava/lang/Object;

# interfaces
.implements Lp/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/z$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp/j<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ly/m;

.field public final b:Ls/b;


# direct methods
.method public constructor <init>(Ly/m;Ls/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/z;->a:Ly/m;

    iput-object p2, p0, Ly/z;->b:Ls/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lp/h;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/io/InputStream;

    iget-object p1, p0, Ly/z;->a:Ly/m;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljava/lang/Object;IILp/h;)Lr/w;
    .locals 11
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/io/InputStream;

    instance-of v0, p1, Ly/w;

    if-eqz v0, :cond_0

    check-cast p1, Ly/w;

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ly/w;

    iget-object v1, p0, Ly/z;->b:Ls/b;

    invoke-direct {v0, p1, v1}, Ly/w;-><init>(Ljava/io/InputStream;Ls/b;)V

    const/4 p1, 0x1

    move-object p1, v0

    const/4 v0, 0x1

    :goto_0
    sget-object v1, Ll0/d;->d:Ljava/util/ArrayDeque;

    monitor-enter v1

    :try_start_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll0/d;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v2, :cond_1

    new-instance v2, Ll0/d;

    invoke-direct {v2}, Ll0/d;-><init>()V

    :cond_1
    iput-object p1, v2, Ll0/d;->b:Ljava/io/InputStream;

    new-instance v3, Ll0/h;

    invoke-direct {v3, v2}, Ll0/h;-><init>(Ljava/io/InputStream;)V

    new-instance v9, Ly/z$a;

    invoke-direct {v9, p1, v2}, Ly/z$a;-><init>(Ly/w;Ll0/d;)V

    const/4 v10, 0x0

    :try_start_1
    iget-object v4, p0, Ly/z;->a:Ly/m;

    new-instance v5, Ly/s$a;

    iget-object v6, v4, Ly/m;->d:Ljava/util/List;

    iget-object v7, v4, Ly/m;->c:Ls/b;

    invoke-direct {v5, v3, v6, v7}, Ly/s$a;-><init>(Ljava/io/InputStream;Ljava/util/List;Ls/b;)V

    move v6, p2

    move v7, p3

    move-object v8, p4

    invoke-virtual/range {v4 .. v9}, Ly/m;->a(Ly/s;IILp/h;Ly/m$b;)Lr/w;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iput-object v10, v2, Ll0/d;->c:Ljava/io/IOException;

    iput-object v10, v2, Ll0/d;->b:Ljava/io/InputStream;

    monitor-enter v1

    :try_start_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ly/w;->b()V

    :cond_2
    return-object p2

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception p2

    iput-object v10, v2, Ll0/d;->c:Ljava/io/IOException;

    iput-object v10, v2, Ll0/d;->b:Ljava/io/InputStream;

    sget-object p3, Ll0/d;->d:Ljava/util/ArrayDeque;

    monitor-enter p3

    :try_start_4
    invoke-virtual {p3, v2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    monitor-exit p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ly/w;->b()V

    :cond_3
    throw p2

    :catchall_2
    move-exception p1

    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    :try_start_6
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw p1
.end method
