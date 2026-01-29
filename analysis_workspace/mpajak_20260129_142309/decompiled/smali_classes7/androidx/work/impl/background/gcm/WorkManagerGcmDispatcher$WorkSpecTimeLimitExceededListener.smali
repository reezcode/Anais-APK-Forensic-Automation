.class Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecTimeLimitExceededListener;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/work/impl/utils/WorkTimer$TimeLimitExceededListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WorkSpecTimeLimitExceededListener"
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String;


# instance fields
.field private final mStartStopToken:Landroidx/work/impl/StartStopToken;

.field private final mWorkManager:Landroidx/work/impl/WorkManagerImpl;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "WrkTimeLimitExceededLstnr"

    invoke-static {v0}, Landroidx/work/Logger;->tagWithPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecTimeLimitExceededListener;->TAG:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkManagerImpl;Landroidx/work/impl/StartStopToken;)V
    .locals 0
    .param p1    # Landroidx/work/impl/WorkManagerImpl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/impl/StartStopToken;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecTimeLimitExceededListener;->mWorkManager:Landroidx/work/impl/WorkManagerImpl;

    iput-object p2, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecTimeLimitExceededListener;->mStartStopToken:Landroidx/work/impl/StartStopToken;

    return-void
.end method


# virtual methods
.method public onTimeLimitExceeded(Landroidx/work/impl/model/WorkGenerationalId;)V
    .locals 4
    .param p1    # Landroidx/work/impl/model/WorkGenerationalId;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {}, Landroidx/work/Logger;->get()Landroidx/work/Logger;

    move-result-object v0

    sget-object v1, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecTimeLimitExceededListener;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WorkSpec time limit exceeded "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/work/Logger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecTimeLimitExceededListener;->mWorkManager:Landroidx/work/impl/WorkManagerImpl;

    iget-object v0, p0, Landroidx/work/impl/background/gcm/WorkManagerGcmDispatcher$WorkSpecTimeLimitExceededListener;->mStartStopToken:Landroidx/work/impl/StartStopToken;

    invoke-virtual {p1, v0}, Landroidx/work/impl/WorkManagerImpl;->stopWork(Landroidx/work/impl/StartStopToken;)V

    return-void
.end method
