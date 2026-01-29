.class public Landroidx/work/multiprocess/ListenableWorkerImpl;
.super Landroidx/work/multiprocess/IListenableWorkerImpl$Stub;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String;

.field public static sEMPTY:[B

.field public static final sLock:Ljava/lang/Object;


# instance fields
.field public final mConfiguration:Landroidx/work/Configuration;

.field public final mContext:Landroid/content/Context;

.field public final mForegroundUpdater:Landroidx/work/ForegroundUpdater;

.field public final mFutureMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lh2/a<",
            "Landroidx/work/ListenableWorker$Result;",
            ">;>;"
        }
    .end annotation
.end field

.field public final mProgressUpdater:Landroidx/work/ProgressUpdater;

.field public final mTaskExecutor:Landroidx/work/impl/utils/taskexecutor/TaskExecutor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "ListenableWorkerImpl"

    invoke-static {v0}, Landroidx/work/Logger;->tagWithPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/multiprocess/ListenableWorkerImpl;->TAG:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Landroidx/work/multiprocess/ListenableWorkerImpl;->sEMPTY:[B

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/work/multiprocess/ListenableWorkerImpl;->sLock:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroidx/work/multiprocess/IListenableWorkerImpl$Stub;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mContext:Landroid/content/Context;

    invoke-static {p1}, Landroidx/work/multiprocess/RemoteWorkManagerInfo;->getInstance(Landroid/content/Context;)Landroidx/work/multiprocess/RemoteWorkManagerInfo;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/work/multiprocess/RemoteWorkManagerInfo;->getConfiguration()Landroidx/work/Configuration;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mConfiguration:Landroidx/work/Configuration;

    invoke-virtual {p1}, Landroidx/work/multiprocess/RemoteWorkManagerInfo;->getTaskExecutor()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mTaskExecutor:Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    invoke-virtual {p1}, Landroidx/work/multiprocess/RemoteWorkManagerInfo;->getProgressUpdater()Landroidx/work/ProgressUpdater;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mProgressUpdater:Landroidx/work/ProgressUpdater;

    invoke-virtual {p1}, Landroidx/work/multiprocess/RemoteWorkManagerInfo;->getForegroundUpdater()Landroidx/work/ForegroundUpdater;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mForegroundUpdater:Landroidx/work/ForegroundUpdater;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mFutureMap:Ljava/util/Map;

    return-void
.end method

.method public static synthetic d(Landroidx/work/multiprocess/ListenableWorkerImpl;Ljava/lang/String;Landroidx/work/WorkerParameters;Landroidx/work/impl/utils/futures/SettableFuture;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/work/multiprocess/ListenableWorkerImpl;->lambda$executeWorkRequest$0(Ljava/lang/String;Landroidx/work/WorkerParameters;Landroidx/work/impl/utils/futures/SettableFuture;)V

    return-void
.end method

.method private executeWorkRequest(Ljava/lang/String;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lh2/a;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroidx/work/WorkerParameters;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/work/WorkerParameters;",
            ")",
            "Lh2/a<",
            "Landroidx/work/ListenableWorker$Result;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/work/impl/utils/futures/SettableFuture;->create()Landroidx/work/impl/utils/futures/SettableFuture;

    move-result-object v0

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v1

    sget-object v2, Landroidx/work/multiprocess/ListenableWorkerImpl;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Tracking execution of "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Landroidx/work/multiprocess/ListenableWorkerImpl;->sLock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mFutureMap:Ljava/util/Map;

    invoke-interface {v2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mTaskExecutor:Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    invoke-interface {p1}, Landroidx/work/impl/utils/taskexecutor/TaskExecutor;->getMainThreadExecutor()Ljava/util/concurrent/Executor;

    move-result-object p1

    new-instance v1, Landroidx/work/multiprocess/a;

    invoke-direct {v1, p0, p2, p3, v0}, Landroidx/work/multiprocess/a;-><init>(Landroidx/work/multiprocess/ListenableWorkerImpl;Ljava/lang/String;Landroidx/work/WorkerParameters;Landroidx/work/impl/utils/futures/SettableFuture;)V

    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private synthetic lambda$executeWorkRequest$0(Ljava/lang/String;Landroidx/work/WorkerParameters;Landroidx/work/impl/utils/futures/SettableFuture;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mConfiguration:Landroidx/work/Configuration;

    invoke-virtual {v0}, Landroidx/work/Configuration;->getWorkerFactory()Landroidx/work/WorkerFactory;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p2}, Landroidx/work/WorkerFactory;->createWorkerWithDefaultFallback(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;

    move-result-object p2

    if-nez p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Unable to create an instance of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object p2

    sget-object v0, Landroidx/work/multiprocess/ListenableWorkerImpl;->TAG:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Landroidx/work/Logger;->error(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Landroidx/work/impl/utils/futures/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    return-void

    :cond_0
    instance-of v0, p2, Landroidx/work/multiprocess/RemoteListenableWorker;

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " does not extend "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-class p1, Landroidx/work/multiprocess/RemoteListenableWorker;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object p2

    sget-object v0, Landroidx/work/multiprocess/ListenableWorkerImpl;->TAG:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Landroidx/work/Logger;->error(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Landroidx/work/impl/utils/futures/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    return-void

    :cond_1
    check-cast p2, Landroidx/work/multiprocess/RemoteListenableWorker;

    invoke-virtual {p2}, Landroidx/work/multiprocess/RemoteListenableWorker;->startRemoteWork()Lh2/a;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroidx/work/impl/utils/futures/SettableFuture;->setFuture(Lh2/a;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p3, p1}, Landroidx/work/impl/utils/futures/SettableFuture;->setException(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method


# virtual methods
.method public interrupt([BLandroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 4
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/multiprocess/IWorkManagerImplCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    sget-object v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkerParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Landroidx/work/multiprocess/parcelable/ParcelConverters;->unmarshall([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/work/multiprocess/parcelable/ParcelableWorkerParameters;

    invoke-virtual {p1}, Landroidx/work/multiprocess/parcelable/ParcelableWorkerParameters;->getId()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v0

    sget-object v1, Landroidx/work/multiprocess/ListenableWorkerImpl;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Interrupting work with id ("

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Landroidx/work/multiprocess/ListenableWorkerImpl;->sLock:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mFutureMap:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh2/a;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_0

    :try_start_2
    iget-object v0, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mTaskExecutor:Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    invoke-interface {v0}, Landroidx/work/impl/utils/taskexecutor/TaskExecutor;->getSerialTaskExecutor()Landroidx/work/impl/utils/taskexecutor/SerialExecutor;

    move-result-object v0

    new-instance v1, Landroidx/work/multiprocess/ListenableWorkerImpl$2;

    invoke-direct {v1, p0, p1, p2}, Landroidx/work/multiprocess/ListenableWorkerImpl$2;-><init>(Landroidx/work/multiprocess/ListenableWorkerImpl;Lh2/a;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    sget-object p1, Landroidx/work/multiprocess/ListenableWorkerImpl;->sEMPTY:[B

    invoke-static {p2, p1}, Landroidx/work/multiprocess/ListenableCallback$ListenableCallbackRunnable;->reportSuccess(Landroidx/work/multiprocess/IWorkManagerImplCallback;[B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    invoke-static {p2, p1}, Landroidx/work/multiprocess/ListenableCallback$ListenableCallbackRunnable;->reportFailure(Landroidx/work/multiprocess/IWorkManagerImplCallback;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public startWork([BLandroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 6
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/multiprocess/IWorkManagerImplCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    sget-object v0, Landroidx/work/multiprocess/parcelable/ParcelableRemoteWorkRequest;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p1, v0}, Landroidx/work/multiprocess/parcelable/ParcelConverters;->unmarshall([BLandroid/os/Parcelable$Creator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/work/multiprocess/parcelable/ParcelableRemoteWorkRequest;

    invoke-virtual {p1}, Landroidx/work/multiprocess/parcelable/ParcelableRemoteWorkRequest;->getParcelableWorkerParameters()Landroidx/work/multiprocess/parcelable/ParcelableWorkerParameters;

    move-result-object v0

    iget-object v1, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mConfiguration:Landroidx/work/Configuration;

    iget-object v2, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mTaskExecutor:Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    iget-object v3, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mProgressUpdater:Landroidx/work/ProgressUpdater;

    iget-object v4, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mForegroundUpdater:Landroidx/work/ForegroundUpdater;

    invoke-virtual {v0, v1, v2, v3, v4}, Landroidx/work/multiprocess/parcelable/ParcelableWorkerParameters;->toWorkerParameters(Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/ProgressUpdater;Landroidx/work/ForegroundUpdater;)Landroidx/work/WorkerParameters;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/WorkerParameters;->getId()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/work/multiprocess/parcelable/ParcelableRemoteWorkRequest;->getWorkerClassName()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v2

    sget-object v3, Landroidx/work/multiprocess/ListenableWorkerImpl;->TAG:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Executing work request ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ", "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1, p1, v0}, Landroidx/work/multiprocess/ListenableWorkerImpl;->executeWorkRequest(Ljava/lang/String;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lh2/a;

    move-result-object p1

    new-instance v0, Landroidx/work/multiprocess/ListenableWorkerImpl$1;

    invoke-direct {v0, p0, p1, p2, v1}, Landroidx/work/multiprocess/ListenableWorkerImpl$1;-><init>(Landroidx/work/multiprocess/ListenableWorkerImpl;Lh2/a;Landroidx/work/multiprocess/IWorkManagerImplCallback;Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/work/multiprocess/ListenableWorkerImpl;->mTaskExecutor:Landroidx/work/impl/utils/taskexecutor/TaskExecutor;

    invoke-interface {v1}, Landroidx/work/impl/utils/taskexecutor/TaskExecutor;->getSerialTaskExecutor()Landroidx/work/impl/utils/taskexecutor/SerialExecutor;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lh2/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p2, p1}, Landroidx/work/multiprocess/ListenableCallback$ListenableCallbackRunnable;->reportFailure(Landroidx/work/multiprocess/IWorkManagerImplCallback;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
