.class public final synthetic Landroidx/work/multiprocess/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/work/multiprocess/RemoteDispatcher;
.implements Lorg/apache/commons/io/function/IOSupplier;
.implements Lorg/apache/commons/io/function/IOConsumer;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/multiprocess/b;->a:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/work/multiprocess/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Landroidx/work/multiprocess/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/apache/commons/io/function/IOFunction;

    iget-object v1, p0, Landroidx/work/multiprocess/b;->b:Ljava/lang/Object;

    check-cast v1, Lorg/apache/commons/io/function/IOConsumer;

    invoke-static {v0, v1, p1}, Li4/h;->k(Lorg/apache/commons/io/function/IOFunction;Lorg/apache/commons/io/function/IOConsumer;Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic andThen(Lorg/apache/commons/io/function/IOConsumer;)Lorg/apache/commons/io/function/IOConsumer;
    .locals 0

    invoke-static {p0, p1}, Li4/b;->a(Lorg/apache/commons/io/function/IOConsumer;Lorg/apache/commons/io/function/IOConsumer;)Lorg/apache/commons/io/function/IOConsumer;

    move-result-object p1

    return-object p1
.end method

.method public final execute(Ljava/lang/Object;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V
    .locals 2

    iget-object v0, p0, Landroidx/work/multiprocess/b;->a:Ljava/lang/Object;

    check-cast v0, Landroidx/work/PeriodicWorkRequest;

    iget-object v1, p0, Landroidx/work/multiprocess/b;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    check-cast p1, Landroidx/work/multiprocess/IWorkManagerImpl;

    invoke-static {v0, v1, p1, p2}, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a(Landroidx/work/PeriodicWorkRequest;Ljava/lang/String;Landroidx/work/multiprocess/IWorkManagerImpl;Landroidx/work/multiprocess/IWorkManagerImplCallback;)V

    return-void
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/work/multiprocess/b;->a:Ljava/lang/Object;

    check-cast v0, Lorg/apache/commons/io/function/IOFunction;

    iget-object v1, p0, Landroidx/work/multiprocess/b;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/function/Supplier;

    invoke-static {v0, v1}, Li4/h;->p(Lorg/apache/commons/io/function/IOFunction;Ljava/util/function/Supplier;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
