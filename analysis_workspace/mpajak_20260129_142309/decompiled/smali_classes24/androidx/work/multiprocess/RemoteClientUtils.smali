.class public final Landroidx/work/multiprocess/RemoteClientUtils;
.super Ljava/lang/Object;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final sVoidMapper:Landroidx/arch/core/util/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/arch/core/util/Function<",
            "[B",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/work/multiprocess/RemoteClientUtils$1;

    invoke-direct {v0}, Landroidx/work/multiprocess/RemoteClientUtils$1;-><init>()V

    sput-object v0, Landroidx/work/multiprocess/RemoteClientUtils;->sVoidMapper:Landroidx/arch/core/util/Function;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static map(Lh2/a;Landroidx/arch/core/util/Function;Ljava/util/concurrent/Executor;)Lh2/a;
    .locals 2
    .param p0    # Lh2/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/arch/core/util/Function;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lh2/a<",
            "TI;>;",
            "Landroidx/arch/core/util/Function<",
            "TI;TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lh2/a<",
            "TO;>;"
        }
    .end annotation

    invoke-static {}, Landroidx/work/impl/utils/futures/SettableFuture;->create()Landroidx/work/impl/utils/futures/SettableFuture;

    move-result-object v0

    new-instance v1, Landroidx/work/multiprocess/RemoteClientUtils$2;

    invoke-direct {v1, p0, p1, v0}, Landroidx/work/multiprocess/RemoteClientUtils$2;-><init>(Lh2/a;Landroidx/arch/core/util/Function;Landroidx/work/impl/utils/futures/SettableFuture;)V

    invoke-interface {p0, v1, p2}, Lh2/a;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method
