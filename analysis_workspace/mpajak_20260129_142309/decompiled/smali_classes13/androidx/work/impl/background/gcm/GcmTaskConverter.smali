.class public Landroidx/work/impl/background/gcm/GcmTaskConverter;
.super Ljava/lang/Object;


# static fields
.field public static final EXECUTION_WINDOW_SIZE_IN_SECONDS:J = 0x5L
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public static final EXTRA_WORK_GENERATION:Ljava/lang/String; = "androidx.work.impl.background.gcm.GENERATION"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static applyConstraints(Lcom/google/android/gms/gcm/Task$a;Landroidx/work/impl/model/WorkSpec;)Lcom/google/android/gms/gcm/Task$a;
    .locals 7
    .param p0    # Lcom/google/android/gms/gcm/Task$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroidx/work/impl/model/WorkSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object v0, p0

    check-cast v0, Lcom/google/android/gms/gcm/OneoffTask$a;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/gms/gcm/Task$a;->f:Z

    move-object v0, p0

    check-cast v0, Lcom/google/android/gms/gcm/OneoffTask$a;

    const/4 v2, 0x2

    iput v2, v0, Lcom/google/android/gms/gcm/Task$a;->a:I

    invoke-virtual {p1}, Landroidx/work/impl/model/WorkSpec;->hasConstraints()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object p1, p1, Landroidx/work/impl/model/WorkSpec;->constraints:Landroidx/work/Constraints;

    invoke-virtual {p1}, Landroidx/work/Constraints;->getRequiredNetworkType()Landroidx/work/NetworkType;

    move-result-object v3

    sget-object v4, Landroidx/work/impl/background/gcm/GcmTaskConverter$1;->$SwitchMap$androidx$work$NetworkType:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_2

    if-eq v4, v2, :cond_2

    const/4 v6, 0x3

    if-eq v4, v6, :cond_2

    const/4 v6, 0x4

    if-eq v4, v6, :cond_1

    const/4 v6, 0x5

    if-eq v4, v6, :cond_0

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-lt v4, v6, :cond_3

    sget-object v4, Landroidx/work/NetworkType;->TEMPORARILY_UNMETERED:Landroidx/work/NetworkType;

    if-ne v3, v4, :cond_3

    :cond_0
    iput v2, v0, Lcom/google/android/gms/gcm/Task$a;->a:I

    goto :goto_0

    :cond_1
    iput v5, v0, Lcom/google/android/gms/gcm/Task$a;->a:I

    goto :goto_0

    :cond_2
    iput v1, v0, Lcom/google/android/gms/gcm/Task$a;->a:I

    :cond_3
    :goto_0
    invoke-virtual {p1}, Landroidx/work/Constraints;->requiresCharging()Z

    move-result p1

    if-eqz p1, :cond_4

    iput-boolean v5, v0, Lcom/google/android/gms/gcm/Task$a;->f:Z

    goto :goto_1

    :cond_4
    iput-boolean v1, v0, Lcom/google/android/gms/gcm/Task$a;->f:Z

    :cond_5
    :goto_1
    return-object p0
.end method


# virtual methods
.method public convert(Landroidx/work/impl/model/WorkSpec;)Lcom/google/android/gms/gcm/OneoffTask;
    .locals 9
    .param p1    # Landroidx/work/impl/model/WorkSpec;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1}, Landroidx/work/impl/model/WorkSpec;->getGeneration()I

    move-result v1

    const-string v2, "androidx.work.impl.background.gcm.GENERATION"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v1, Lcom/google/android/gms/gcm/OneoffTask$a;

    invoke-direct {v1}, Lcom/google/android/gms/gcm/OneoffTask$a;-><init>()V

    const-class v2, Landroidx/work/impl/background/gcm/WorkManagerGcmService;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/google/android/gms/gcm/Task$a;->b:Ljava/lang/String;

    iget-object v2, p1, Landroidx/work/impl/model/WorkSpec;->id:Ljava/lang/String;

    iput-object v2, v1, Lcom/google/android/gms/gcm/Task$a;->c:Ljava/lang/String;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/google/android/gms/gcm/Task$a;->d:Z

    iput-object v0, v1, Lcom/google/android/gms/gcm/Task$a;->i:Landroid/os/Bundle;

    const/4 v0, 0x0

    iput-boolean v0, v1, Lcom/google/android/gms/gcm/Task$a;->e:Z

    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0}, Landroidx/work/impl/background/gcm/GcmTaskConverter;->now()J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v4

    invoke-virtual {p1}, Landroidx/work/impl/model/WorkSpec;->calculateNextRunTime()J

    move-result-wide v7

    invoke-virtual {v3, v7, v8, v6}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v6

    sub-long/2addr v6, v4

    const-wide/16 v3, 0x0

    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    const-wide/16 v5, 0x5

    add-long/2addr v5, v3

    iput-wide v3, v1, Lcom/google/android/gms/gcm/OneoffTask$a;->j:J

    iput-wide v5, v1, Lcom/google/android/gms/gcm/OneoffTask$a;->k:J

    invoke-static {v1, p1}, Landroidx/work/impl/background/gcm/GcmTaskConverter;->applyConstraints(Lcom/google/android/gms/gcm/Task$a;Landroidx/work/impl/model/WorkSpec;)Lcom/google/android/gms/gcm/Task$a;

    iget-object p1, v1, Lcom/google/android/gms/gcm/Task$a;->b:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    if-eqz v0, :cond_11

    iget-object p1, v1, Lcom/google/android/gms/gcm/Task$a;->c:Ljava/lang/String;

    invoke-static {p1}, Lcom/google/android/gms/gcm/a;->b(Ljava/lang/String;)V

    iget-object p1, v1, Lcom/google/android/gms/gcm/Task$a;->h:Lz0/i;

    if-eqz p1, :cond_2

    iget p1, p1, Lz0/i;->a:I

    if-eq p1, v2, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/16 v1, 0x2d

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Must provide a valid RetryPolicy: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-boolean p1, v1, Lcom/google/android/gms/gcm/Task$a;->e:Z

    if-eqz p1, :cond_3

    iget-object p1, v1, Lcom/google/android/gms/gcm/Task$a;->i:Landroid/os/Bundle;

    invoke-static {p1}, Lcom/google/android/gms/gcm/Task;->j(Landroid/os/Bundle;)V

    :cond_3
    iget-object p1, v1, Lcom/google/android/gms/gcm/Task$a;->g:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_5

    iget p1, v1, Lcom/google/android/gms/gcm/Task$a;->a:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Required URIs may not be used with NETWORK_STATE_ANY"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_1
    iget-object p1, v1, Lcom/google/android/gms/gcm/Task$a;->g:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_c

    const-string v4, "null"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :try_start_0
    invoke-virtual {v0}, Landroid/net/Uri;->getPort()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "tcp"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    if-lez v3, :cond_6

    const v2, 0xffff

    if-gt v3, v2, :cond_6

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Landroid/net/Uri;->getPort()I

    move-result v0

    const/16 v1, 0x26

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Invalid required URI port: "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    const-string v0, "ping"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v0, -0x1

    if-ne v3, v0, :cond_8

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Ping does not support port numbers"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported required URI scheme: "

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_a
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v0, v1

    :goto_3
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid port number: "

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_b

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_b
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_4
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "URI hostname is required"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Null URI"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    iget-wide v2, v1, Lcom/google/android/gms/gcm/OneoffTask$a;->j:J

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-eqz p1, :cond_10

    iget-wide v6, v1, Lcom/google/android/gms/gcm/OneoffTask$a;->k:J

    cmp-long p1, v6, v4

    if-eqz p1, :cond_10

    cmp-long p1, v2, v6

    if-gez p1, :cond_f

    new-instance p1, Lcom/google/android/gms/gcm/OneoffTask;

    invoke-direct {p1, v1}, Lcom/google/android/gms/gcm/OneoffTask;-><init>(Lcom/google/android/gms/gcm/OneoffTask$a;)V

    return-object p1

    :cond_f
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Window start must be shorter than window end."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must specify an execution window using setExecutionWindow."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Must provide an endpoint for this task by calling setService(ComponentName)."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public now()J
    .locals 2
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
