.class public final Lr0/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/b$b;,
        Lr0/b$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/google/android/gms/common/api/Status;

.field public static final j:Lcom/google/android/gms/common/api/Status;

.field public static final k:Ljava/lang/Object;

.field public static l:Lr0/b;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field


# instance fields
.field public a:J

.field public final b:Landroid/content/Context;

.field public final c:Lp0/c;

.field public final d:Ls0/c;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lr0/j<",
            "*>;",
            "Lr0/b$a<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final f:Landroidx/collection/ArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lr0/j<",
            "*>;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "lock"
    .end annotation
.end field

.field public final g:Landroidx/collection/ArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lr0/j<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final h:Lb1/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/4 v1, 0x4

    const-string v2, "Sign-out occurred while this API call was in progress."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lr0/b;->i:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v2, "The user must be signed in to make this API call."

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    sput-object v0, Lr0/b;->j:Lcom/google/android/gms/common/api/Status;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lr0/b;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 5

    sget-object v0, Lp0/c;->c:Lp0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x2710

    iput-wide v1, p0, Lr0/b;->a:J

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x0

    invoke-direct {v1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v3, 0x5

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-direct {v1, v3, v4, v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iput-object v1, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Landroidx/collection/ArraySet;

    invoke-direct {v1}, Landroidx/collection/ArraySet;-><init>()V

    iput-object v1, p0, Lr0/b;->f:Landroidx/collection/ArraySet;

    new-instance v1, Landroidx/collection/ArraySet;

    invoke-direct {v1}, Landroidx/collection/ArraySet;-><init>()V

    iput-object v1, p0, Lr0/b;->g:Landroidx/collection/ArraySet;

    iput-object p1, p0, Lr0/b;->b:Landroid/content/Context;

    new-instance p1, Lb1/a;

    invoke-direct {p1, p2, p0}, Lb1/a;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lr0/b;->h:Lb1/a;

    iput-object v0, p0, Lr0/b;->c:Lp0/c;

    new-instance p2, Ls0/c;

    invoke-direct {p2}, Ls0/c;-><init>()V

    iput-object p2, p0, Lr0/b;->d:Ls0/c;

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method


# virtual methods
.method public final a(Lq0/a;)V
    .locals 2
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq0/a<",
            "*>;)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/b$a;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p0, Lr0/b;->h:Lb1/a;

    invoke-virtual {p1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p1

    new-instance v1, Landroidx/collection/ArraySet;

    invoke-direct {v1}, Landroidx/collection/ArraySet;-><init>()V

    invoke-virtual {v1, p1}, Landroidx/collection/ArraySet;->addAll(Ljava/util/Collection;)Z

    throw v0

    :cond_0
    throw v0
.end method

.method public final b(Lp0/a;I)Z
    .locals 8

    iget-object v0, p0, Lr0/b;->c:Lp0/c;

    iget-object v1, p0, Lr0/b;->b:Landroid/content/Context;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v2, p1, Lp0/a;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    iget-object v5, p1, Lp0/a;->d:Landroid/app/PendingIntent;

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/high16 v6, 0x8000000

    const/4 v7, 0x0

    if-eqz v5, :cond_1

    iget-object v7, p1, Lp0/a;->d:Landroid/app/PendingIntent;

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1, v2, v7}, Lp0/c;->a(Landroid/content/Context;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {v1, v3, v2, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    :goto_1
    if-eqz v7, :cond_3

    iget p1, p1, Lp0/a;->c:I

    sget v2, Lcom/google/android/gms/common/api/GoogleApiActivity;->c:I

    new-instance v2, Landroid/content/Intent;

    const-class v5, Lcom/google/android/gms/common/api/GoogleApiActivity;

    invoke-direct {v2, v1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v5, "pending_intent"

    invoke-virtual {v2, v5, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v5, "failing_client_id"

    invoke-virtual {v2, v5, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "notify_manager"

    invoke-virtual {v2, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-static {v1, v3, v2, v6}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    invoke-virtual {v0, v1, p1, p2}, Lp0/c;->e(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    const/4 v3, 0x1

    :cond_3
    return v3
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 7
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/32 v3, 0x493e0

    const/4 v5, 0x0

    packed-switch v0, :pswitch_data_0

    const-string p1, "GoogleApiManager"

    const/16 v1, 0x1f

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Unknown message id: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return v5

    :pswitch_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lr0/b$b;

    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v2, p1, Lr0/b$b;->a:Lr0/j;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v2, p1, Lr0/b$b;->a:Lr0/j;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr0/b$a;

    iget-object v2, v0, Lr0/b$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v2, v0, Lr0/b$a;->e:Lr0/b;

    iget-object v2, v2, Lr0/b;->h:Lb1/a;

    const/16 v3, 0xf

    invoke-virtual {v2, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object v2, v0, Lr0/b$a;->e:Lr0/b;

    iget-object v2, v2, Lr0/b;->h:Lb1/a;

    const/16 v3, 0x10

    invoke-virtual {v2, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    iget-object p1, p1, Lr0/b$b;->b:Lp0/b;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, v0, Lr0/b$a;->a:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v3, v0, Lr0/b$a;->a:Ljava/util/LinkedList;

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr0/f;

    instance-of v6, v4, Lr0/i;

    if-eqz v6, :cond_0

    check-cast v4, Lr0/i;

    invoke-virtual {v4, v0}, Lr0/i;->c(Lr0/b$a;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    :goto_1
    if-ge v5, v3, :cond_10

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v5, v5, 0x1

    check-cast v4, Lr0/f;

    iget-object v6, v0, Lr0/b$a;->a:Ljava/util/LinkedList;

    invoke-virtual {v6, v4}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    new-instance v6, Lq0/b;

    invoke-direct {v6, p1}, Lq0/b;-><init>(Lp0/b;)V

    invoke-virtual {v4, v6}, Lr0/f;->b(Ljava/lang/RuntimeException;)V

    goto :goto_1

    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lr0/b$b;

    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p1, Lr0/b$b;->a:Lr0/j;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p1, Lr0/b$b;->a:Lr0/j;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr0/b$a;

    iget-object v3, v0, Lr0/b$a;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_4

    :cond_2
    iget-boolean p1, v0, Lr0/b$a;->b:Z

    if-eqz p1, :cond_3

    goto/16 :goto_4

    :cond_3
    throw v2

    :pswitch_2
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lr0/e;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    throw v2

    :cond_4
    iget-object p1, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/b$a;

    iget-object p1, p1, Lr0/b$a;->e:Lr0/b;

    iget-object p1, p1, Lr0/b;->h:Lb1/a;

    invoke-static {p1}, Ls0/e;->b(Landroid/os/Handler;)V

    throw v2

    :pswitch_3
    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto/16 :goto_4

    :cond_5
    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/b$a;

    iget-object p1, p1, Lr0/b$a;->e:Lr0/b;

    iget-object p1, p1, Lr0/b;->h:Lb1/a;

    invoke-static {p1}, Ls0/e;->b(Landroid/os/Handler;)V

    throw v2

    :pswitch_4
    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/b$a;

    iget-object v0, p1, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    invoke-static {v0}, Ls0/e;->b(Landroid/os/Handler;)V

    iget-boolean v0, p1, Lr0/b$a;->b:Z

    if-eqz v0, :cond_10

    invoke-virtual {p1}, Lr0/b$a;->c()V

    iget-object v0, p1, Lr0/b$a;->e:Lr0/b;

    iget-object v1, v0, Lr0/b;->c:Lp0/c;

    iget-object v0, v0, Lr0/b;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lp0/c;->c(Landroid/content/Context;)I

    move-result v0

    const/16 v1, 0x12

    const/16 v3, 0x8

    if-ne v0, v1, :cond_6

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "Connection timed out while waiting for Google Play services update to complete."

    invoke-direct {v0, v3, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    goto :goto_2

    :cond_6
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const-string v1, "API failed to connect while resuming due to an unknown error."

    invoke-direct {v0, v3, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    :goto_2
    invoke-virtual {p1, v0}, Lr0/b$a;->d(Lcom/google/android/gms/common/api/Status;)V

    throw v2

    :pswitch_5
    iget-object p1, p0, Lr0/b;->g:Landroidx/collection/ArraySet;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    iget-object p1, p0, Lr0/b;->g:Landroidx/collection/ArraySet;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    goto/16 :goto_4

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/j;

    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/b$a;

    iget-object v0, p1, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    invoke-static {v0}, Ls0/e;->b(Landroid/os/Handler;)V

    sget-object v0, Lr0/b;->i:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1, v0}, Lr0/b$a;->d(Lcom/google/android/gms/common/api/Status;)V

    throw v2

    :pswitch_6
    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v3, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/b$a;

    iget-object v0, p1, Lr0/b$a;->e:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    invoke-static {v0}, Ls0/e;->b(Landroid/os/Handler;)V

    iget-boolean v0, p1, Lr0/b$a;->b:Z

    if-nez v0, :cond_8

    goto/16 :goto_4

    :cond_8
    invoke-virtual {p1}, Lr0/b$a;->a()V

    throw v2

    :pswitch_7
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lq0/a;

    invoke-virtual {p0, p1}, Lr0/b;->a(Lq0/a;)V

    throw v2

    :pswitch_8
    iget-object p1, p0, Lr0/b;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    instance-of p1, p1, Landroid/app/Application;

    if-eqz p1, :cond_10

    iget-object p1, p0, Lr0/b;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    check-cast p1, Landroid/app/Application;

    sget-object v0, Lr0/a;->f:Lr0/a;

    monitor-enter v0

    :try_start_0
    iget-boolean v2, v0, Lr0/a;->e:Z

    if-nez v2, :cond_9

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    iput-boolean v1, v0, Lr0/a;->e:Z

    :cond_9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    new-instance p1, Lr0/g;

    invoke-direct {p1, p0}, Lr0/g;-><init>(Lr0/b;)V

    monitor-enter v0

    :try_start_1
    iget-object v2, v0, Lr0/a;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, v0, Lr0/a;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_a

    new-instance p1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    invoke-direct {p1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    invoke-static {p1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    iget-object v2, v0, Lr0/a;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v2

    if-nez v2, :cond_a

    iget p1, p1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    const/16 v2, 0x64

    if-le p1, v2, :cond_a

    iget-object p1, v0, Lr0/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_a
    iget-object p1, v0, Lr0/a;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_10

    iput-wide v3, p0, Lr0/b;->a:J

    goto/16 :goto_4

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1

    :pswitch_9
    iget v0, p1, Landroid/os/Message;->arg1:I

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lp0/a;

    iget-object v3, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lr0/b$a;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-nez v0, :cond_b

    move-object v2, v4

    :cond_c
    if-eqz v2, :cond_d

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x11

    iget-object v4, p0, Lr0/b;->c:Lp0/c;

    iget v5, p1, Lp0/a;->c:I

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lp0/f;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {v5}, Lp0/a;->j(I)Ljava/lang/String;

    move-result-object v4

    iget-object p1, p1, Lp0/a;->e:Ljava/lang/String;

    const/16 v5, 0x45

    invoke-static {v4, v5}, Landroidx/activity/d;->b(Ljava/lang/String;I)I

    move-result v5

    invoke-static {p1, v5}, Landroidx/activity/d;->b(Ljava/lang/String;I)I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "Error resolution was canceled by the user, original error message: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ": "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v3, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;)V

    invoke-virtual {v2, v0}, Lr0/b$a;->d(Lcom/google/android/gms/common/api/Status;)V

    goto/16 :goto_4

    :cond_d
    const-string p1, "GoogleApiManager"

    const/16 v2, 0x4c

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Could not find API instance "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " while trying to fail enqueued calls."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    invoke-static {p1, v0, v2}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_4

    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lr0/h;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v2

    :pswitch_b
    iget-object p1, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_4

    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr0/b$a;

    invoke-virtual {p1}, Lr0/b$a;->b()V

    invoke-virtual {p1}, Lr0/b$a;->a()V

    throw v2

    :pswitch_c
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lr0/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v2

    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_f

    const-wide/16 v3, 0x2710

    :cond_f
    iput-wide v3, p0, Lr0/b;->a:J

    iget-object p1, p0, Lr0/b;->h:Lb1/a;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    iget-object p1, p0, Lr0/b;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr0/j;

    iget-object v3, p0, Lr0/b;->h:Lb1/a;

    invoke-virtual {v3, v0, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    iget-wide v4, p0, Lr0/b;->a:J

    invoke-virtual {v3, v2, v4, v5}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_3

    :cond_10
    :goto_4
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_a
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
