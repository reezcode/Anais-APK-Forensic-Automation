.class Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/work/impl/ExecutionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WorkSpecExecutionListener"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final mGenerationalId:Landroidx/work/impl/model/WorkGenerationalId;

.field private final mLatch:Ljava/util/concurrent/CountDownLatch;

.field private mNeedsReschedule:Z

.field private final mStartStopTokens:Landroidx/work/impl/StartStopTokens;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkSpecExecutionListener"

    invoke-static {v0}, Landroidx/work/Logger;->tagWithPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/model/WorkGenerationalId;Landroidx/work/impl/StartStopTokens;)V
    .locals 0
    .param p1    # Landroidx/work/impl/model/WorkGenerationalId;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/impl/StartStopTokens;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mGenerationalId:Landroidx/work/impl/model/WorkGenerationalId;

    iput-object p2, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mStartStopTokens:Landroidx/work/impl/StartStopTokens;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mLatch:Ljava/util/concurrent/CountDownLatch;

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mNeedsReschedule:Z

    return-void
.end method


# virtual methods
.method public getLatch()Ljava/util/concurrent/CountDownLatch;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mLatch:Ljava/util/concurrent/CountDownLatch;

    return-object v0
.end method

.method public needsReschedule()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mNeedsReschedule:Z

    return v0
.end method

.method public onExecuted(Landroidx/work/impl/model/WorkGenerationalId;Z)V
    .locals 3
    .param p1    # Landroidx/work/impl/model/WorkGenerationalId;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mGenerationalId:Landroidx/work/impl/model/WorkGenerationalId;

    invoke-virtual {v0, p1}, Landroidx/work/impl/model/WorkGenerationalId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object p2

    sget-object v0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Notified for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but was looking for "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mGenerationalId:Landroidx/work/impl/model/WorkGenerationalId;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Landroidx/work/Logger;->warning(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mStartStopTokens:Landroidx/work/impl/StartStopTokens;

    invoke-virtual {v0, p1}, Landroidx/work/impl/StartStopTokens;->remove(Landroidx/work/impl/model/WorkGenerationalId;)Landroidx/work/impl/StartStopToken;

    iput-boolean p2, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mNeedsReschedule:Z

    iget-object p1, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecExecutionListener;->mLatch:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :goto_0
    return-void
.end method
