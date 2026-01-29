.class public final La1/h;
.super Landroid/os/Binder;


# instance fields
.field public final a:Lcom/google/android/gms/iid/zze;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/iid/zze;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    iput-object p1, p0, La1/h;->a:Lcom/google/android/gms/iid/zze;

    return-void
.end method


# virtual methods
.method public final a(La1/f;)V
    .locals 3

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    if-ne v0, v1, :cond_2

    const-string v0, "EnhancedIntentService"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "service received new intent via bind strategy"

    invoke-static {v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "intent being queued for bg execution"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, La1/h;->a:Lcom/google/android/gms/iid/zze;

    iget-object v0, v0, Lcom/google/android/gms/iid/zze;->b:Ljava/util/concurrent/ExecutorService;

    new-instance v1, La1/i;

    invoke-direct {v1, p0, p1}, La1/i;-><init>(La1/h;La1/f;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/SecurityException;

    const-string v0, "Binding only allowed within app"

    invoke-direct {p1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
