.class public final Lg3/f;
.super Ljava/lang/Object;


# static fields
.field public static b:Lg3/f;


# instance fields
.field public a:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "Lcom/superbock/bean/EInfo;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    new-instance v0, Lg3/o;

    sget-object v1, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-direct {v0, v1}, Lg3/o;-><init>(Landroid/content/Context;)V

    const-class v1, Lcom/superbock/bean/EInfo;

    invoke-virtual {v0, v1}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    iput-object v0, p0, Lg3/f;->a:Lt2/g;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static a()Lg3/f;
    .locals 2

    sget-object v0, Lg3/f;->b:Lg3/f;

    if-nez v0, :cond_1

    const-class v0, Lg3/f;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/f;->b:Lg3/f;

    if-nez v1, :cond_0

    new-instance v1, Lg3/f;

    invoke-direct {v1}, Lg3/f;-><init>()V

    sput-object v1, Lg3/f;->b:Lg3/f;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lg3/f;->b:Lg3/f;

    return-object v0
.end method


# virtual methods
.method public final b()Lcom/superbock/bean/EInfo;
    .locals 4

    iget-object v0, p0, Lg3/f;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v1

    const-string v2, "mo"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-virtual {v1}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "up2"

    invoke-virtual {v1, v3, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->b()Lz2/m;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "co"

    invoke-virtual {v1, v3, v2}, Lz2/m;->i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->j()Lz2/f;

    move-result-object v1

    invoke-interface {v0, v1}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/superbock/bean/EInfo;

    return-object v0
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Lg3/f;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v1

    invoke-virtual {v1}, Lz2/h;->m()Lz2/f;

    move-result-object v1

    invoke-interface {v0, v1}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/superbock/bean/EInfo;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/superbock/bean/EInfo;->setUp(I)V

    invoke-virtual {v1, v2}, Lcom/superbock/bean/EInfo;->setUp2(I)V

    invoke-virtual {v1}, Lcom/superbock/bean/EInfo;->getPa()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v4, ".gif"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Lcom/superbock/bean/EInfo;->getPa()Ljava/lang/String;

    move-result-object v3

    const-string v4, "/luban_disk_cache/"

    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1, v2}, Lcom/superbock/bean/EInfo;->setCo(I)V

    :cond_0
    iget-object v2, p0, Lg3/f;->a:Lt2/g;

    invoke-interface {v2, v1}, Lt2/g;->d(Ljava/lang/Object;)I

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final d(Lcom/superbock/bean/EInfo;)V
    .locals 1

    iget-object v0, p0, Lg3/f;->a:Lt2/g;

    invoke-interface {v0, p1}, Lt2/g;->d(Ljava/lang/Object;)I

    return-void
.end method

.method public final finalize()V
    .locals 0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-static {}, Lr2/a;->e()V

    return-void
.end method
