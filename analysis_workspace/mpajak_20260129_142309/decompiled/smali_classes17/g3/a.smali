.class public final Lg3/a;
.super Ljava/lang/Object;


# static fields
.field public static c:Lg3/a;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lg3/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    new-instance v0, Lg3/o;

    sget-object v1, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-direct {v0, v1}, Lg3/o;-><init>(Landroid/content/Context;)V

    const-class v1, Lcom/superbock/bean/AInfo;

    invoke-virtual {v0, v1}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    iput-object v0, p0, Lg3/a;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v0, 0x1

    iput v0, p0, Lg3/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/a;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Li/g;)V
    .locals 0

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 p2, 0x1

    iput p2, p0, Lg3/a;->a:I

    invoke-direct {p0, p1}, Lg3/a;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public static b()Lg3/a;
    .locals 2

    sget-object v0, Lg3/a;->c:Lg3/a;

    if-nez v0, :cond_1

    const-class v0, Lg3/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/a;->c:Lg3/a;

    if-nez v1, :cond_0

    new-instance v1, Lg3/a;

    invoke-direct {v1}, Lg3/a;-><init>()V

    sput-object v1, Lg3/a;->c:Lg3/a;

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
    sget-object v0, Lg3/a;->c:Lg3/a;

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 4

    iget-object v0, p0, Lg3/a;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt2/g;

    check-cast v0, Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "up"

    invoke-virtual {v0, v3, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v0}, Lz2/m;->b()Lz2/m;

    const-string v3, "ni"

    invoke-virtual {v0, v3, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v0}, Lz2/m;->b()Lz2/m;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "up2"

    invoke-virtual {v0, v3, v2}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v0}, Lz2/m;->b()Lz2/m;

    const/4 v2, 0x3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "co"

    invoke-virtual {v0, v3, v2}, Lz2/m;->i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v0}, Lz2/m;->j()Lz2/f;

    move-result-object v0

    invoke-interface {v1, v0}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 5

    iget-object v0, p0, Lg3/a;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt2/g;

    check-cast v0, Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "ty"

    invoke-virtual {v0, v4, v3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v0}, Lz2/m;->j()Lz2/f;

    move-result-object v0

    invoke-interface {v1, v0}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/superbock/bean/AInfo;

    invoke-virtual {v1, v2}, Lcom/superbock/bean/AInfo;->setUp(I)V

    iget-object v3, p0, Lg3/a;->b:Ljava/lang/Object;

    check-cast v3, Lt2/g;

    invoke-interface {v3, v1}, Lt2/g;->d(Ljava/lang/Object;)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lcom/superbock/bean/AInfo;)V
    .locals 1

    iget-object v0, p0, Lg3/a;->b:Ljava/lang/Object;

    check-cast v0, Lt2/g;

    invoke-interface {v0, p1}, Lt2/g;->d(Ljava/lang/Object;)I

    return-void
.end method

.method public final finalize()V
    .locals 1

    iget v0, p0, Lg3/a;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-static {}, Lr2/a;->e()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
