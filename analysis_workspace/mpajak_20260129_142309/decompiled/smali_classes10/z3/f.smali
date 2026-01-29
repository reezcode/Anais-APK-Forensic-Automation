.class public final Lz3/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz3/f$b;,
        Lz3/f$e;,
        Lz3/f$d;,
        Lz3/f$c;
    }
.end annotation


# static fields
.field public static final C:Lz3/u;

.field public static final D:Lz3/f$c;


# instance fields
.field public final A:Lz3/f$e;

.field public final B:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Z

.field public final c:Lz3/f$d;

.field public final d:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lz3/q;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/String;

.field public f:I

.field public g:I

.field public h:Z

.field public final i:Lv3/d;

.field public final j:Lv3/c;

.field public final k:Lv3/c;

.field public final l:Lv3/c;

.field public final m:Li/g;

.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public final s:Lz3/u;

.field public t:Lz3/u;

.field public u:J

.field public v:J

.field public w:J

.field public x:J

.field public final y:Ljava/net/Socket;

.field public final z:Lz3/r;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz3/f$c;

    invoke-direct {v0}, Lz3/f$c;-><init>()V

    sput-object v0, Lz3/f;->D:Lz3/f$c;

    new-instance v0, Lz3/u;

    invoke-direct {v0}, Lz3/u;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Lz3/u;->c(II)Lz3/u;

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Lz3/u;->c(II)Lz3/u;

    sput-object v0, Lz3/f;->C:Lz3/u;

    return-void
.end method

.method public constructor <init>(Lz3/f$b;)V
    .locals 7

    const-string v0, "builder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-boolean v0, p1, Lz3/f$b;->h:Z

    iput-boolean v0, p0, Lz3/f;->b:Z

    iget-object v1, p1, Lz3/f$b;->e:Lz3/f$d;

    iput-object v1, p0, Lz3/f;->c:Lz3/f$d;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, Lz3/f;->d:Ljava/util/LinkedHashMap;

    iget-object v1, p1, Lz3/f$b;->b:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v2, "connectionName"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    iput-object v1, p0, Lz3/f;->e:Ljava/lang/String;

    iget-boolean v2, p1, Lz3/f$b;->h:Z

    if-eqz v2, :cond_1

    const/4 v2, 0x3

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    iput v2, p0, Lz3/f;->g:I

    iget-object v2, p1, Lz3/f$b;->i:Lv3/d;

    iput-object v2, p0, Lz3/f;->i:Lv3/d;

    invoke-virtual {v2}, Lv3/d;->f()Lv3/c;

    move-result-object v3

    iput-object v3, p0, Lz3/f;->j:Lv3/c;

    invoke-virtual {v2}, Lv3/d;->f()Lv3/c;

    move-result-object v4

    iput-object v4, p0, Lz3/f;->k:Lv3/c;

    invoke-virtual {v2}, Lv3/d;->f()Lv3/c;

    move-result-object v2

    iput-object v2, p0, Lz3/f;->l:Lv3/c;

    iget-object v2, p1, Lz3/f$b;->f:Li/g;

    iput-object v2, p0, Lz3/f;->m:Li/g;

    new-instance v2, Lz3/u;

    invoke-direct {v2}, Lz3/u;-><init>()V

    iget-boolean v4, p1, Lz3/f$b;->h:Z

    if-eqz v4, :cond_2

    const/4 v4, 0x7

    const/high16 v5, 0x1000000

    invoke-virtual {v2, v4, v5}, Lz3/u;->c(II)Lz3/u;

    :cond_2
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    iput-object v2, p0, Lz3/f;->s:Lz3/u;

    sget-object v2, Lz3/f;->C:Lz3/u;

    iput-object v2, p0, Lz3/f;->t:Lz3/u;

    invoke-virtual {v2}, Lz3/u;->a()I

    move-result v2

    int-to-long v4, v2

    iput-wide v4, p0, Lz3/f;->x:J

    iget-object v2, p1, Lz3/f$b;->a:Ljava/net/Socket;

    if-nez v2, :cond_3

    const-string v4, "socket"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    iput-object v2, p0, Lz3/f;->y:Ljava/net/Socket;

    new-instance v2, Lz3/r;

    iget-object v4, p1, Lz3/f$b;->d:Lf4/g;

    if-nez v4, :cond_4

    const-string v5, "sink"

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    invoke-direct {v2, v4, v0}, Lz3/r;-><init>(Lf4/g;Z)V

    iput-object v2, p0, Lz3/f;->z:Lz3/r;

    new-instance v2, Lz3/f$e;

    new-instance v4, Lz3/p;

    iget-object v5, p1, Lz3/f$b;->c:Lf4/h;

    if-nez v5, :cond_5

    const-string v6, "source"

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_5
    invoke-direct {v4, v5, v0}, Lz3/p;-><init>(Lf4/h;Z)V

    invoke-direct {v2, p0, v4}, Lz3/f$e;-><init>(Lz3/f;Lz3/p;)V

    iput-object v2, p0, Lz3/f;->A:Lz3/f$e;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Lz3/f;->B:Ljava/util/LinkedHashSet;

    iget p1, p1, Lz3/f$b;->g:I

    if-eqz p1, :cond_6

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v4, p1

    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v4

    const-string p1, " ping"

    invoke-static {v1, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lz3/f$a;

    invoke-direct {v0, p1, p0, v4, v5}, Lz3/f$a;-><init>(Ljava/lang/String;Lz3/f;J)V

    invoke-virtual {v3, v0, v4, v5}, Lv3/c;->c(Lv3/a;J)V

    :cond_6
    return-void
.end method

.method public static final a(Lz3/f;Ljava/io/IOException;)V
    .locals 1

    sget-object v0, Lz3/b;->d:Lz3/b;

    invoke-virtual {p0, v0, v0, p1}, Lz3/f;->b(Lz3/b;Lz3/b;Ljava/io/IOException;)V

    return-void
.end method


# virtual methods
.method public final b(Lz3/b;Lz3/b;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "connectionCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt3/c;->a:[B

    :try_start_0
    invoke-virtual {p0, p1}, Lz3/f;->l(Lz3/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x0

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v0, v1, [Lz3/q;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, [Lz3/q;

    iget-object v0, p0, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    if-eqz p1, :cond_2

    array-length v0, p1

    :goto_1
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    :try_start_2
    invoke-virtual {v2, p2, p3}, Lz3/q;->c(Lz3/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    :try_start_3
    iget-object p1, p0, Lz3/f;->z:Lz3/r;

    invoke-virtual {p1}, Lz3/r;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, Lz3/f;->y:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, Lz3/f;->j:Lv3/c;

    invoke-virtual {p1}, Lv3/c;->f()V

    iget-object p1, p0, Lz3/f;->k:Lv3/c;

    invoke-virtual {p1}, Lv3/c;->f()V

    iget-object p1, p0, Lz3/f;->l:Lv3/c;

    invoke-virtual {p1}, Lv3/c;->f()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c(I)Lz3/q;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz3/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final close()V
    .locals 3

    sget-object v0, Lz3/b;->c:Lz3/b;

    sget-object v1, Lz3/b;->h:Lz3/b;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lz3/f;->b(Lz3/b;Lz3/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final e(I)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final declared-synchronized f(I)Lz3/q;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lz3/q;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, Lz3/f;->z:Lz3/r;

    invoke-virtual {v0}, Lz3/r;->flush()V

    return-void
.end method

.method public final l(Lz3/b;)V
    .locals 4

    const-string v0, "statusCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/f;->z:Lz3/r;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-boolean v1, p0, Lz3/f;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, Lz3/f;->h:Z

    iget v1, p0, Lz3/f;->f:I

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit p0

    iget-object v2, p0, Lz3/f;->z:Lz3/r;

    sget-object v3, Lt3/c;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lz3/r;->e(ILz3/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final declared-synchronized n(J)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, Lz3/f;->u:J

    add-long/2addr v0, p1

    iput-wide v0, p0, Lz3/f;->u:J

    iget-wide p1, p0, Lz3/f;->v:J

    sub-long/2addr v0, p1

    iget-object p1, p0, Lz3/f;->s:Lz3/u;

    invoke-virtual {p1}, Lz3/u;->a()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long v2, v0, p1

    if-ltz v2, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lz3/f;->s(IJ)V

    iget-wide p1, p0, Lz3/f;->v:J

    add-long/2addr p1, v0

    iput-wide p1, p0, Lz3/f;->v:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final p(IZLf4/f;J)V
    .locals 8

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p4, v1

    if-nez v3, :cond_0

    iget-object p4, p0, Lz3/f;->z:Lz3/r;

    invoke-virtual {p4, p2, p1, p3, v0}, Lz3/r;->b(ZILf4/f;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v3, p4, v1

    if-lez v3, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v3, p0, Lz3/f;->w:J

    iget-wide v5, p0, Lz3/f;->x:J

    cmp-long v7, v3, v5

    if-ltz v7, :cond_2

    iget-object v3, p0, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    sub-long/2addr v5, v3

    :try_start_1
    invoke-static {p4, p5, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    iget-object v3, p0, Lz3/f;->z:Lz3/r;

    iget v3, v3, Lz3/r;->c:I

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-wide v4, p0, Lz3/f;->w:J

    int-to-long v6, v3

    add-long/2addr v4, v6

    iput-wide v4, p0, Lz3/f;->w:J

    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, Lz3/f;->z:Lz3/r;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v1

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v3}, Lz3/r;->b(ZILf4/f;I)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final q(ZII)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lz3/f;->z:Lz3/r;

    invoke-virtual {v0, p1, p2, p3}, Lz3/r;->l(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p2, Lz3/b;->d:Lz3/b;

    invoke-virtual {p0, p2, p2, p1}, Lz3/f;->b(Lz3/b;Lz3/b;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method

.method public final r(ILz3/b;)V
    .locals 3

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/f;->j:Lv3/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] writeSynReset"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lz3/f$f;

    invoke-direct {v2, v1, p0, p1, p2}, Lz3/f$f;-><init>(Ljava/lang/String;Lz3/f;ILz3/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v2, p1, p2}, Lv3/c;->c(Lv3/a;J)V

    return-void
.end method

.method public final s(IJ)V
    .locals 9

    iget-object v0, p0, Lz3/f;->j:Lv3/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] windowUpdate"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-instance v1, Lz3/f$g;

    move-object v3, v1

    move-object v5, p0

    move v6, p1

    move-wide v7, p2

    invoke-direct/range {v3 .. v8}, Lz3/f$g;-><init>(Ljava/lang/String;Lz3/f;IJ)V

    const-wide/16 p1, 0x0

    invoke-virtual {v0, v1, p1, p2}, Lv3/c;->c(Lv3/a;J)V

    return-void
.end method
