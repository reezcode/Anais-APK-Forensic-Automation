.class Landroidx/work/multiprocess/RemoteWorkManagerClient$10;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/work/multiprocess/RemoteDispatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/multiprocess/RemoteWorkManagerClient;->setForegroundAsync(Ljava/lang/String;Landroidx/work/ForegroundInfo;)Lh2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroidx/work/multiprocess/RemoteDispatcher<",
        "Landroidx/work/multiprocess/IWorkManagerImpl;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic this$0:Landroidx/work/multiprocess/RemoteWorkManagerClient;

.field public final synthetic val$foregroundInfo:Landroidx/work/ForegroundInfo;

.field public final synthetic val$id:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroidx/work/multiprocess/RemoteWorkManagerClient;Ljava/lang/String;Landroidx/work/ForegroundInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;->this$0:Landroidx/work/multiprocess/RemoteWorkManagerClient;

    iput-object p2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;->val$id:Ljava/lang/String;

    iput-object p3, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;->val$foregroundInfo:Landroidx/work/ForegroundInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Landroidx/work/multiprocess/IWorkManagerImpl;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 3
    .param p1    # Landroidx/work/multiprocess/IWorkManagerImpl;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/multiprocess/IWorkManagerImplCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Landroidx/work/multiprocess/parcelable/ParcelableForegroundRequestInfo;

    iget-object v1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;->val$id:Ljava/lang/String;

    iget-object v2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;->val$foregroundInfo:Landroidx/work/ForegroundInfo;

    invoke-direct {v0, v1, v2}, Landroidx/work/multiprocess/parcelable/ParcelableForegroundRequestInfo;-><init>(Ljava/lang/String;Landroidx/work/ForegroundInfo;)V

    invoke-static {v0}, Landroidx/work/multiprocess/parcelable/ParcelConverters;->marshall(Landroid/os/Parcelable;)[B

    move-result-object v0

    invoke-interface {p1, v0, p2}, Landroidx/work/multiprocess/IWorkManagerImpl;->setForegroundAsync([BLandroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method

.method public bridge synthetic execute(Ljava/lang/Object;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/multiprocess/IWorkManagerImplCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Landroidx/work/multiprocess/IWorkManagerImpl;

    invoke-virtual {p0, p1, p2}, Landroidx/work/multiprocess/RemoteWorkManagerClient$10;->execute(Landroidx/work/multiprocess/IWorkManagerImpl;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method
