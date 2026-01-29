.class public Landroidx/work/multiprocess/RemoteWorkManagerClient;
.super Landroidx/work/multiprocess/RemoteWorkManager;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanKeepAnnotation"
    }
.end annotation

.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;,
        Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;,
        Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionRemoteCallback;
    }
.end annotation


# static fields
.field private static final SESSION_TIMEOUT_MILLIS:J = 0xea60L

.field public static final TAG:Ljava/lang/String;


# instance fields
.field public final mContext:Landroid/content/Context;

.field public final mExecutor:Ljava/util/concurrent/Executor;

.field private final mHandler:Landroid/os/Handler;

.field public final mLock:Ljava/lang/Object;

.field public mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

.field private volatile mSessionIndex:J

.field private final mSessionTimeout:J

.field private final mSessionTracker:Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;

.field public final mWorkManager:Landroidx/work/impl/WorkManagerImpl;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "RemoteWorkManagerClient"

    invoke-static {v0}, Landroidx/work/Logger;->tagWithPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkManagerImpl;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/impl/WorkManagerImpl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-wide/32 v0, 0xea60

    invoke-direct {p0, p1, p2, v0, v1}, Landroidx/work/multiprocess/RemoteWorkManagerClient;-><init>(Landroid/content/Context;Landroidx/work/impl/WorkManagerImpl;J)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/impl/WorkManagerImpl;J)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/impl/WorkManagerImpl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/work/multiprocess/RemoteWorkManager;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mContext:Landroid/content/Context;

    iput-object p2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mWorkManager:Landroidx/work/impl/WorkManagerImpl;

    invoke-virtual {p2}, Landroidx/work/impl/WorkManagerImpl;->getWorkTaskExecutor()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    move-result-object p1

    invoke-interface {p1}, Landroidx/work/impl/utils/taskexecutor/TaskExecutor;->getSerialTaskExecutor()Landroidx/work/impl/utils/taskexecutor/SerialExecutor;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mLock:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    new-instance p1, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;

    invoke-direct {p1, p0}, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionTracker:Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;

    iput-wide p3, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionTimeout:J

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-static {p1}, Landroidx/core/os/HandlerCompat;->createAsync(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method public static synthetic a(Landroidx/work/PeriodicWorkRequest;Ljava/lang/String;Landroidx/work/multiprocess/IWorkManagerImpl;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->lambda$enqueueUniquePeriodicWork$0(Landroidx/work/PeriodicWorkRequest;Ljava/lang/String;Landroidx/work/multiprocess/IWorkManagerImpl;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method

.method private static synthetic lambda$enqueueUniquePeriodicWork$0(Landroidx/work/PeriodicWorkRequest;Ljava/lang/String;Landroidx/work/multiprocess/IWorkManagerImpl;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 1

    new-instance v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkRequest;

    invoke-direct {v0, p0}, Landroidx/work/multiprocess/parcelable/ParcelableWorkRequest;-><init>(Landroidx/work/WorkRequest;)V

    invoke-static {v0}, Landroidx/work/multiprocess/parcelable/ParcelConverters;->marshall(Landroid/os/Parcelable;)[B

    move-result-object p0

    invoke-interface {p2, p1, p0, p3}, Landroidx/work/multiprocess/IWorkManagerImpl;->updateUniquePeriodicWorkRequest(Ljava/lang/String;[BLandroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method

.method private static newIntent(Landroid/content/Context;)Landroid/content/Intent;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Landroid/content/Intent;

    const-class v1, Landroidx/work/multiprocess/RemoteWorkManagerService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    return-object v0
.end method

.method private unableToBind(Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;Ljava/lang/Throwable;)V
    .locals 3
    .param p1    # Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v0

    sget-object v1, Landroidx/work/multiprocess/RemoteWorkManagerClient;->TAG:Ljava/lang/String;

    const-string v2, "Unable to bind to service"

    invoke-virtual {v0, v1, v2, p2}, Landroidx/work/Logger;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p1, Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;->mFuture:Landroidx/work/impl/utils/futures/SettableFuture;

    invoke-virtual {p1, p2}, Landroidx/work/impl/utils/futures/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    return-void
.end method


# virtual methods
.method public beginUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/multiprocess/RemoteWorkContinuation;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/ExistingWorkPolicy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/work/ExistingWorkPolicy;",
            "Ljava/util/List<",
            "Landroidx/work/OneTimeWorkRequest;",
            ">;)",
            "Landroidx/work/multiprocess/RemoteWorkContinuation;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkContinuationImpl;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mWorkManager:Landroidx/work/impl/WorkManagerImpl;

    invoke-virtual {v1, p1, p2, p3}, Landroidx/work/impl/WorkManagerImpl;->beginUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/WorkContinuation;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkContinuationImpl;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Landroidx/work/WorkContinuation;)V

    return-object v0
.end method

.method public beginWith(Ljava/util/List;)Landroidx/work/multiprocess/RemoteWorkContinuation;
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/work/OneTimeWorkRequest;",
            ">;)",
            "Landroidx/work/multiprocess/RemoteWorkContinuation;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkContinuationImpl;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mWorkManager:Landroidx/work/impl/WorkManagerImpl;

    invoke-virtual {v1, p1}, Landroidx/work/impl/WorkManagerImpl;->beginWith(Ljava/util/List;)Landroidx/work/WorkContinuation;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkContinuationImpl;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Landroidx/work/WorkContinuation;)V

    return-object v0
.end method

.method public cancelAllWork()Lh2/a;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$6;

    invoke-direct {v0, p0}, Landroidx/work/multiprocess/RemoteWorkManagerClient$6;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object v0

    sget-object v1, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object v0

    return-object v0
.end method

.method public cancelAllWorkByTag(Ljava/lang/String;)Lh2/a;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$4;

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient$4;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object v0, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public cancelUniqueWork(Ljava/lang/String;)Lh2/a;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$5;

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient$5;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object v0, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public cancelWorkById(Ljava/util/UUID;)Lh2/a;
    .locals 2
    .param p1    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$3;

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient$3;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Ljava/util/UUID;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object v0, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public cleanUp()V
    .locals 4

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v1

    sget-object v2, Landroidx/work/multiprocess/RemoteWorkManagerClient;->TAG:Ljava/lang/String;

    const-string v3, "Cleaning up."

    invoke-virtual {v1, v2, v3}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public enqueue(Landroidx/work/WorkContinuation;)Lh2/a;
    .locals 2
    .param p1    # Landroidx/work/WorkContinuation;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/WorkContinuation;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$2;

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient$2;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Landroidx/work/WorkContinuation;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object v0, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public enqueue(Landroidx/work/WorkRequest;)Lh2/a;
    .locals 0
    .param p1    # Landroidx/work/WorkRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/WorkRequest;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->enqueue(Ljava/util/List;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public enqueue(Ljava/util/List;)Lh2/a;
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/work/WorkRequest;",
            ">;)",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$1;

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient$1;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Ljava/util/List;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object v0, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public enqueueUniquePeriodicWork(Ljava/lang/String;Landroidx/work/ExistingPeriodicWorkPolicy;Landroidx/work/PeriodicWorkRequest;)Lh2/a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/ExistingPeriodicWorkPolicy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/work/PeriodicWorkRequest;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/work/ExistingPeriodicWorkPolicy;",
            "Landroidx/work/PeriodicWorkRequest;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    sget-object v0, Landroidx/work/ExistingPeriodicWorkPolicy;->UPDATE:Landroidx/work/ExistingPeriodicWorkPolicy;

    if-ne p2, v0, :cond_0

    new-instance p2, Landroidx/work/multiprocess/b;

    invoke-direct {p2, p3, p1}, Landroidx/work/multiprocess/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object p2, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object p3, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, p3}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mWorkManager:Landroidx/work/impl/WorkManagerImpl;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/work/impl/WorkManagerImpl;->createWorkContinuationForUniquePeriodicWork(Ljava/lang/String;Landroidx/work/ExistingPeriodicWorkPolicy;Landroidx/work/PeriodicWorkRequest;)Landroidx/work/impl/WorkContinuationImpl;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->enqueue(Landroidx/work/WorkContinuation;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Lh2/a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/ExistingWorkPolicy;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/work/ExistingWorkPolicy;",
            "Ljava/util/List<",
            "Landroidx/work/OneTimeWorkRequest;",
            ">;)",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->beginUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/multiprocess/RemoteWorkContinuation;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/multiprocess/RemoteWorkContinuation;->enqueue()Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;
    .locals 2
    .param p1    # Landroidx/work/multiprocess/RemoteDispatcher;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/multiprocess/RemoteDispatcher<",
            "Landroidx/work/multiprocess/IWorkManagerImpl;",
            ">;)",
            "Lh2/a<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->getSession()Lh2/a;

    move-result-object v0

    new-instance v1, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionRemoteCallback;

    invoke-direct {v1, p0}, Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionRemoteCallback;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V

    invoke-virtual {p0, v0, p1, v1}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Lh2/a;Landroidx/work/multiprocess/RemoteDispatcher;Landroidx/work/multiprocess/RemoteCallback;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public execute(Lh2/a;Landroidx/work/multiprocess/RemoteDispatcher;Landroidx/work/multiprocess/RemoteCallback;)Lh2/a;
    .locals 1
    .param p1    # Lh2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/multiprocess/RemoteDispatcher;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/work/multiprocess/RemoteCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh2/a<",
            "Landroidx/work/multiprocess/IWorkManagerImpl;",
            ">;",
            "Landroidx/work/multiprocess/RemoteDispatcher<",
            "Landroidx/work/multiprocess/IWorkManagerImpl;",
            ">;",
            "Landroidx/work/multiprocess/RemoteCallback;",
            ")",
            "Lh2/a<",
            "[B>;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$11;

    invoke-direct {v0, p0, p1, p3, p2}, Landroidx/work/multiprocess/RemoteWorkManagerClient$11;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Lh2/a;Landroidx/work/multiprocess/RemoteCallback;Landroidx/work/multiprocess/RemoteDispatcher;)V

    iget-object p2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0, p2}, Lh2/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p3}, Landroidx/work/multiprocess/RemoteCallback;->getFuture()Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public getContext()Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method public getCurrentSession()Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    return-object v0
.end method

.method public getExecutor()Ljava/util/concurrent/Executor;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public getSession()Lh2/a;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lh2/a<",
            "Landroidx/work/multiprocess/IWorkManagerImpl;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->newIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->getSession(Landroid/content/Intent;)Lh2/a;

    move-result-object v0

    return-object v0
.end method

.method public getSession(Landroid/content/Intent;)Lh2/a;
    .locals 5
    .param p1    # Landroid/content/Intent;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Lh2/a<",
            "Landroidx/work/multiprocess/IWorkManagerImpl;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-wide v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionIndex:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iput-wide v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionIndex:J

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    if-nez v1, :cond_0

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v1

    sget-object v2, Landroidx/work/multiprocess/RemoteWorkManagerClient;->TAG:Ljava/lang/String;

    const-string v3, "Creating a new session"

    invoke-virtual {v1, v2, v3}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    invoke-direct {v1, p0}, Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V

    iput-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mContext:Landroid/content/Context;

    const/4 v3, 0x1

    invoke-virtual {v2, p1, v1, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to bind to service"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v1}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->unableToBind(Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_2
    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    invoke-direct {p0, v1, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->unableToBind(Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionTracker:Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;

    invoke-virtual {p1, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSession:Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;

    iget-object p1, p1, Landroidx/work/multiprocess/RemoteWorkManagerClient$Session;->mFuture:Landroidx/work/impl/utils/futures/SettableFuture;

    monitor-exit v0

    return-object p1

    :catchall_1
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public getSessionHandler()Landroid/os/Handler;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method public getSessionIndex()J
    .locals 2

    iget-wide v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionIndex:J

    return-wide v0
.end method

.method public getSessionLock()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mLock:Ljava/lang/Object;

    return-object v0
.end method

.method public getSessionTimeout()J
    .locals 2

    iget-wide v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionTimeout:J

    return-wide v0
.end method

.method public getSessionTracker()Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mSessionTracker:Landroidx/work/multiprocess/RemoteWorkManagerClient$SessionTracker;

    return-object v0
.end method

.method public getWorkInfos(Landroidx/work/WorkQuery;)Lh2/a;
    .locals 2
    .param p1    # Landroidx/work/WorkQuery;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/WorkQuery;",
            ")",
            "Lh2/a<",
            "Ljava/util/List<",
            "Landroidx/work/WorkInfo;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$7;

    invoke-direct {v0, p0, p1}, Landroidx/work/multiprocess/RemoteWorkManagerClient$7;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Landroidx/work/WorkQuery;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$8;

    invoke-direct {v0, p0}, Landroidx/work/multiprocess/RemoteWorkManagerClient$8;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;)V

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, v0, v1}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public setForegroundAsync(Ljava/lang/String;Landroidx/work/ForegroundInfo;)Lh2/a;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/ForegroundInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/work/ForegroundInfo;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;

    invoke-direct {v0, p0, p1, p2}, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Ljava/lang/String;Landroidx/work/ForegroundInfo;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object p2, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v0}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method

.method public setProgress(Ljava/util/UUID;Landroidx/work/Data;)Lh2/a;
    .locals 1
    .param p1    # Ljava/util/UUID;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/Data;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Landroidx/work/Data;",
            ")",
            "Lh2/a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$9;

    invoke-direct {v0, p0, p1, p2}, Landroidx/work/multiprocess/RemoteWorkManagerClient$9;-><init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Ljava/util/UUID;Landroidx/work/Data;)V

    invoke-virtual {p0, v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->execute(Landroidx/work/multiprocess/RemoteDispatcher;)Lh2/a;

    move-result-object p1

    sget-object p2, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->mExecutor:Ljava/util/concurrent/Executor;

    invoke-static {p1, p2, v0}, Landroidx/work/multiprocess/RemoteClientUtils;->map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;

    move-result-object p1

    return-object p1
.end method
