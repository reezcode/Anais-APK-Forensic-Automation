.class public Landroidx/work/multiprocess/RemoteCallback$DeathRecipient;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/multiprocess/RemoteCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DeathRecipient"
.end annotation


# instance fields
.field private final mCallback:Landroidx/work/multiprocess/RemoteCallback;


# direct methods
.method public constructor <init>(Landroidx/work/multiprocess/RemoteCallback;)V
    .locals 0
    .param p1    # Landroidx/work/multiprocess/RemoteCallback;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteCallback$DeathRecipient;->mCallback:Landroidx/work/multiprocess/RemoteCallback;

    return-void
.end method


# virtual methods
.method public binderDied()V
    .locals 2

    iget-object v0, p0, Landroidx/work/multiprocess/RemoteCallback$DeathRecipient;->mCallback:Landroidx/work/multiprocess/RemoteCallback;

    const-string v1, "Binder died"

    invoke-virtual {v0, v1}, Landroidx/work/multiprocess/RemoteCallback;->onFailure(Ljava/lang/String;)V

    return-void
.end method
