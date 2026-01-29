.class public final Lg3/h;
.super Ljava/lang/Object;


# static fields
.field public static b:Lg3/h;


# instance fields
.field public a:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "Lcom/superbock/bean/GInfo;",
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

    const-class v1, Lcom/superbock/bean/GInfo;

    invoke-virtual {v0, v1}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    iput-object v0, p0, Lg3/h;->a:Lt2/g;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b()Lg3/h;
    .locals 2

    sget-object v0, Lg3/h;->b:Lg3/h;

    if-nez v0, :cond_1

    const-class v0, Lg3/h;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/h;->b:Lg3/h;

    if-nez v1, :cond_0

    new-instance v1, Lg3/h;

    invoke-direct {v1}, Lg3/h;-><init>()V

    sput-object v1, Lg3/h;->b:Lg3/h;

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
    sget-object v0, Lg3/h;->b:Lg3/h;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/superbock/bean/GInfo;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lg3/h;->a:Lt2/g;

    invoke-interface {v0, p1}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final finalize()V
    .locals 0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-static {}, Lr2/a;->e()V

    return-void
.end method
