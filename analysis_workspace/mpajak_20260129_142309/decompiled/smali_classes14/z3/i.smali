.class public final Lz3/i;
.super Lv3/a;


# instance fields
.field public final synthetic e:Lz3/f$e;

.field public final synthetic f:Z

.field public final synthetic g:Lz3/u;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f$e;Lz3/u;)V
    .locals 0

    iput-object p2, p0, Lz3/i;->e:Lz3/f$e;

    const/4 p2, 0x0

    iput-boolean p2, p0, Lz3/i;->f:Z

    iput-object p3, p0, Lz3/i;->g:Lz3/u;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 12

    iget-object v0, p0, Lz3/i;->e:Lz3/f$e;

    iget-boolean v1, p0, Lz3/i;->f:Z

    iget-object v2, p0, Lz3/i;->g:Lz3/u;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "settings"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v3}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iget-object v6, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v6, v6, Lz3/f;->z:Lz3/r;

    monitor-enter v6

    :try_start_0
    iget-object v7, v0, Lz3/f$e;->c:Lz3/f;

    monitor-enter v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget-object v8, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v8, v8, Lz3/f;->t:Lz3/u;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lz3/u;

    invoke-direct {v1}, Lz3/u;-><init>()V

    invoke-virtual {v1, v8}, Lz3/u;->b(Lz3/u;)V

    invoke-virtual {v1, v2}, Lz3/u;->b(Lz3/u;)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object v2, v1

    :goto_0
    iput-object v2, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-virtual {v2}, Lz3/u;->a()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v8}, Lz3/u;->a()I

    move-result v8

    int-to-long v8, v8

    sub-long/2addr v1, v8

    iput-wide v1, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    cmp-long v11, v1, v9

    if-eqz v11, :cond_3

    iget-object v1, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v1, v1, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v1, v1, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    new-array v2, v8, [Lz3/q;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_2

    check-cast v1, [Lz3/q;

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    const/4 v1, 0x0

    :goto_2
    iput-object v1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iget-object v1, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v2, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lz3/u;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v11, "<set-?>"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, v1, Lz3/f;->t:Lz3/u;

    iget-object v1, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v1, v1, Lz3/f;->l:Lv3/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v11, v11, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, " onSettings"

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v11, Lz3/g;

    invoke-direct {v11, v2, v0, v5}, Lz3/g;-><init>(Ljava/lang/String;Lz3/f$e;Lkotlin/jvm/internal/Ref$ObjectRef;)V

    invoke-virtual {v1, v11, v9, v10}, Lv3/c;->c(Lv3/a;J)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v1, v0, Lz3/f$e;->c:Lz3/f;

    iget-object v1, v1, Lz3/f;->z:Lz3/r;

    iget-object v2, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v2, Lz3/u;

    invoke-virtual {v1, v2}, Lz3/r;->a(Lz3/u;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catch_0
    move-exception v1

    :try_start_4
    iget-object v0, v0, Lz3/f$e;->c:Lz3/f;

    invoke-static {v0, v1}, Lz3/f;->a(Lz3/f;Ljava/io/IOException;)V

    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v6

    iget-object v0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, [Lz3/q;

    if-eqz v0, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v1, v0

    :goto_4
    if-ge v8, v1, :cond_5

    aget-object v2, v0, v8

    monitor-enter v2

    :try_start_5
    iget-wide v4, v3, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    iget-wide v6, v2, Lz3/q;->d:J

    add-long/2addr v6, v4

    iput-wide v6, v2, Lz3/q;->d:J

    cmp-long v6, v4, v9

    if-lez v6, :cond_4

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    :cond_4
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v2

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_5
    const-wide/16 v0, -0x1

    return-wide v0

    :catchall_1
    move-exception v0

    :try_start_6
    monitor-exit v7

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    monitor-exit v6

    throw v0
.end method
