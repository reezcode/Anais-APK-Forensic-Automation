.class public final Lg3/d;
.super Ljava/lang/Object;


# static fields
.field public static c:Lg3/d;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x1

    iput v1, p0, Lg3/d;->a:I

    const-string v1, "timeUnit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lw3/l;

    sget-object v1, Lv3/d;->h:Lv3/d;

    invoke-direct {v0, v1}, Lw3/l;-><init>(Lv3/d;)V

    invoke-direct {p0, v0}, Lg3/d;-><init>(Lw3/l;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lg3/d;->a:I

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    new-instance p1, Lg3/o;

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-direct {p1, v0}, Lg3/o;-><init>(Landroid/content/Context;)V

    const-class v0, Lcom/superbock/bean/CInfo;

    invoke-virtual {p1, v0}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object p1

    iput-object p1, p0, Lg3/d;->b:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void

    :cond_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0}, Lg3/d;-><init>()V

    return-void
.end method

.method public constructor <init>(Lw3/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg3/d;->a:I

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg3/d;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a()Lg3/d;
    .locals 3

    sget-object v0, Lg3/d;->c:Lg3/d;

    if-nez v0, :cond_1

    const-class v0, Lg3/d;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/d;->c:Lg3/d;

    if-nez v1, :cond_0

    new-instance v1, Lg3/d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lg3/d;-><init>(I)V

    sput-object v1, Lg3/d;->c:Lg3/d;

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
    sget-object v0, Lg3/d;->c:Lg3/d;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lg3/d;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt2/g;

    check-cast v0, Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    invoke-virtual {v0}, Lz2/h;->m()Lz2/f;

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

    check-cast v1, Lcom/superbock/bean/CInfo;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/superbock/bean/CInfo;->setUp(I)V

    iget-object v2, p0, Lg3/d;->b:Ljava/lang/Object;

    check-cast v2, Lt2/g;

    invoke-interface {v2, v1}, Lt2/g;->d(Ljava/lang/Object;)I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final finalize()V
    .locals 1

    iget v0, p0, Lg3/d;->a:I

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
