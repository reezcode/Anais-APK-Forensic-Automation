.class public final Le0/e$a;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Le0/e;


# direct methods
.method public constructor <init>(Le0/e;)V
    .locals 0

    iput-object p1, p0, Le0/e$a;->a:Le0/e;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object p2, p0, Le0/e$a;->a:Le0/e;

    iget-boolean v0, p2, Le0/e;->d:Z

    invoke-virtual {p2, p1}, Le0/e;->j(Landroid/content/Context;)Z

    move-result p1

    iput-boolean p1, p2, Le0/e;->d:Z

    iget-object p1, p0, Le0/e$a;->a:Le0/e;

    iget-boolean p1, p1, Le0/e;->d:Z

    if-eq v0, p1, :cond_1

    const-string p1, "ConnectivityMonitor"

    const/4 p2, 0x3

    invoke-static {p1, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "ConnectivityMonitor"

    const-string p2, "connectivity changed, isConnected: "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p0, Le0/e$a;->a:Le0/e;

    iget-boolean v0, v0, Le0/e;->d:Z

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p1, p0, Le0/e$a;->a:Le0/e;

    iget-object p2, p1, Le0/e;->c:Le0/c$a;

    iget-boolean p1, p1, Le0/e;->d:Z

    check-cast p2, Lcom/bumptech/glide/i$b;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/bumptech/glide/i$b;->b:Lcom/bumptech/glide/i;

    monitor-enter p1

    :try_start_0
    iget-object p2, p2, Lcom/bumptech/glide/i$b;->a:Le0/p;

    invoke-virtual {p2}, Le0/p;->b()V

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_1
    :goto_0
    return-void
.end method
