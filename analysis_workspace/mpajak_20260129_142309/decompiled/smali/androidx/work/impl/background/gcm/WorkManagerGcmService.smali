.class public Landroidx/work/impl/background/gcm/WorkManagerGcmService;
.super Lcom/google/android/gms/gcm/GcmTaskService;


# static fields
.field private static final TAG:Ljava/lang/String; = "WorkManagerGcmService"


# instance fields
.field private mGcmDispatcher:Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;

.field private mIsShutdown:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/gcm/GcmTaskService;-><init>()V

    return-void
.end method

.method private checkDispatcher()V
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    iget-boolean v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->mIsShutdown:Z

    if-eqz v0, :cond_0

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v0

    const-string v1, "WorkManagerGcmService"

    const-string v2, "Re-initializing dispatcher after a request to shutdown"

    invoke-virtual {v0, v1, v2}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0}, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->initializeDispatcher()V

    :cond_0
    return-void
.end method

.method private initializeDispatcher()V
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->mIsShutdown:Z

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/work/impl/WorkManagerImpl;->getInstance(Landroid/content/Context;)Landroidx/work/impl/WorkManagerImpl;

    move-result-object v0

    new-instance v1, Landroidx/work/impl/utils/WorkTimer;

    invoke-virtual {v0}, Landroidx/work/impl/WorkManagerImpl;->getConfiguration()Landroidx/work/Configuration;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/work/Configuration;->getRunnableScheduler()Landroidx/work/RunnableScheduler;

    move-result-object v2

    invoke-direct {v1, v2}, Landroidx/work/impl/utils/WorkTimer;-><init>(Landroidx/work/RunnableScheduler;)V

    new-instance v2, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;

    invoke-direct {v2, v0, v1}, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;-><init>(Landroidx/work/impl/WorkManagerImpl;Landroidx/work/impl/utils/WorkTimer;)V

    iput-object v2, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->mGcmDispatcher:Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/gcm/GcmTaskService;->onCreate()V

    invoke-direct {p0}, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->initializeDispatcher()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/gcm/GcmTaskService;->onDestroy()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->mIsShutdown:Z

    return-void
.end method

.method public onInitializeTasks()V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    invoke-direct {p0}, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->checkDispatcher()V

    iget-object v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->mGcmDispatcher:Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;

    invoke-virtual {v0}, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;->onInitializeTasks()V

    return-void
.end method

.method public onRunTask(Lz0/b;)I
    .locals 1
    .param p1    # Lz0/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->checkDispatcher()V

    iget-object v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmService;->mGcmDispatcher:Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;

    invoke-virtual {v0, p1}, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;->onRunTask(Lz0/b;)I

    move-result p1

    return p1
.end method
