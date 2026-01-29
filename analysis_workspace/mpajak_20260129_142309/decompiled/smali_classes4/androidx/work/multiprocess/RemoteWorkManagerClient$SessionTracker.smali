.class public Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/multiprocess/RemoteWorkManagerClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SessionTracker"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final mClient:Landroidx/work/multiprocess/RemoteWorkManagerClient;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "SessionHandler"

    invoke-static {v0}, Landroidx/work/Logger;->tagWithPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V
    .locals 0
    .param p1    # Landroidx/work/multiprocess/RemoteWorkManagerClient;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->mClient:Landroidx/work/multiprocess/RemoteWorkManagerClient;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->mClient:Landroidx/work/multiprocess/RemoteWorkManagerClient;

    invoke-virtual {v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->getSessionIndex()J

    move-result-wide v0

    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->mClient:Landroidx/work/multiprocess/RemoteWorkManagerClient;

    invoke-virtual {v2}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->getSessionLock()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    :try_start_0
    iget-object v3, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->mClient:Landroidx/work/multiprocess/RemoteWorkManagerClient;

    invoke-virtual {v3}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->getSessionIndex()J

    move-result-wide v3

    iget-object v5, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->mClient:Landroidx/work/multiprocess/RemoteWorkManagerClient;

    invoke-virtual {v5}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->getCurrentSession()Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    move-result-object v5

    if-eqz v5, :cond_1

    cmp-long v6, v0, v3

    if-nez v6, :cond_0

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v0

    sget-object v1, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->TAG:Ljava/lang/String;

    const-string v3, "Unbinding service"

    invoke-virtual {v0, v1, v3}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->mClient:Landroidx/work/multiprocess/RemoteWorkManagerClient;

    invoke-virtual {v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    invoke-virtual {v5}, Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;->onBindingDied()V

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v0

    sget-object v1, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;->TAG:Ljava/lang/String;

    const-string v3, "Ignoring request to unbind."

    invoke-virtual {v0, v1, v3}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
