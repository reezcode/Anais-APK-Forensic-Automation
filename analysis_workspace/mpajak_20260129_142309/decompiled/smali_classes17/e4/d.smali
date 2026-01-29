.class public final Le4/d;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/g0;
.implements Le4/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le4/d$b;,
        Le4/d$a;,
        Le4/d$c;,
        Le4/d$d;
    }
.end annotation


# static fields
.field public static final x:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/x;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lw3/e;

.field public c:Le4/d$d;

.field public d:Le4/g;

.field public e:Le4/h;

.field public f:Lv3/c;

.field public g:Ljava/lang/String;

.field public h:Le4/d$c;

.field public final i:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Lf4/i;",
            ">;"
        }
    .end annotation
.end field

.field public final j:Ljava/util/ArrayDeque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayDeque<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public k:J

.field public l:Z

.field public m:I

.field public n:Ljava/lang/String;

.field public o:Z

.field public p:I

.field public q:Z

.field public final r:Ls3/y;

.field public final s:Ld1/f;

.field public final t:Ljava/util/Random;

.field public final u:J

.field public v:Le4/f;

.field public w:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Ls3/x;->d:Ls3/x;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Le4/d;->x:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lv3/d;Ls3/y;Ld1/f;Ljava/util/Random;JJ)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Le4/d;->r:Ls3/y;

    iput-object p3, p0, Le4/d;->s:Ld1/f;

    iput-object p4, p0, Le4/d;->t:Ljava/util/Random;

    iput-wide p5, p0, Le4/d;->u:J

    const/4 p3, 0x0

    iput-object p3, p0, Le4/d;->v:Le4/f;

    iput-wide p7, p0, Le4/d;->w:J

    invoke-virtual {p1}, Lv3/d;->f()Lv3/c;

    move-result-object p1

    iput-object p1, p0, Le4/d;->f:Lv3/c;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Le4/d;->i:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Le4/d;->j:Ljava/util/ArrayDeque;

    const/4 p1, -0x1

    iput p1, p0, Le4/d;->m:I

    iget-object p1, p2, Ls3/y;->c:Ljava/lang/String;

    const-string p3, "GET"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lf4/i;->f:Lf4/i$a;

    const/16 p1, 0x10

    new-array p1, p1, [B

    invoke-virtual {p4, p1}, Ljava/util/Random;->nextBytes([B)V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lf4/i$a;->c([B)Lf4/i;

    move-result-object p1

    invoke-virtual {p1}, Lf4/i;->a()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le4/d;->a:Ljava/lang/String;

    return-void

    :cond_0
    const-string p1, "Request must be GET: "

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p2, Ls3/y;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Z
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Li/g;->J(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p2, :cond_2

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    invoke-virtual {v0, p2}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v0

    iget-object v3, v0, Lf4/i;->d:[B

    array-length v3, v3

    int-to-long v3, v3

    const-wide/16 v5, 0x7b

    cmp-long v7, v3, v5

    if-gtz v7, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "reason.size() > 123: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    :goto_1
    iget-boolean p2, p0, Le4/d;->o:Z

    if-nez p2, :cond_4

    iget-boolean p2, p0, Le4/d;->l:Z

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    iput-boolean v2, p0, Le4/d;->l:Z

    iget-object p2, p0, Le4/d;->j:Ljava/util/ArrayDeque;

    new-instance v1, Le4/d$a;

    invoke-direct {v1, p1, v0}, Le4/d$a;-><init>(ILf4/i;)V

    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Le4/d;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    :goto_2
    monitor-exit p0

    :goto_3
    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 9

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    invoke-virtual {v0, p1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object p1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Le4/d;->o:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Le4/d;->l:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Le4/d;->k:J

    iget-object v0, p1, Lf4/i;->d:[B

    array-length v4, v0

    int-to-long v4, v4

    add-long/2addr v4, v2

    const-wide/32 v6, 0x1000000

    cmp-long v8, v4, v6

    if-lez v8, :cond_1

    const/16 p1, 0x3e9

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Le4/d;->a(ILjava/lang/String;)Z

    goto :goto_0

    :cond_1
    array-length v0, v0

    int-to-long v0, v0

    add-long/2addr v2, v0

    iput-wide v2, p0, Le4/d;->k:J

    iget-object v0, p0, Le4/d;->j:Ljava/util/ArrayDeque;

    new-instance v1, Le4/d$b;

    invoke-direct {v1, p1}, Le4/d$b;-><init>(Lf4/i;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Le4/d;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    const/4 v1, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    monitor-exit p0

    :goto_1
    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized c(Lf4/i;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Le4/d;->o:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Le4/d;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Le4/d;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Le4/d;->i:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Le4/d;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final d(Ljava/lang/String;)V
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le4/d;->s:Ld1/f;

    invoke-virtual {v0, p0, p1}, Ld1/f;->H(Ls3/g0;Ljava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized e(Lf4/i;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Le4/d;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final f(ILjava/lang/String;)V
    .locals 4

    const-string v0, "reason"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_b

    monitor-enter p0

    :try_start_0
    iget v3, p0, Le4/d;->m:I

    if-ne v3, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    if-eqz v0, :cond_a

    iput p1, p0, Le4/d;->m:I

    iput-object p2, p0, Le4/d;->n:Ljava/lang/String;

    iget-boolean p2, p0, Le4/d;->l:Z

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    iget-object p2, p0, Le4/d;->j:Ljava/util/ArrayDeque;

    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Le4/d;->h:Le4/d$c;

    iput-object v0, p0, Le4/d;->h:Le4/d$c;

    iget-object v1, p0, Le4/d;->d:Le4/g;

    iput-object v0, p0, Le4/d;->d:Le4/g;

    iget-object v2, p0, Le4/d;->e:Le4/h;

    iput-object v0, p0, Le4/d;->e:Le4/h;

    iget-object v0, p0, Le4/d;->f:Lv3/c;

    invoke-virtual {v0}, Lv3/c;->f()V

    move-object v0, p2

    goto :goto_1

    :cond_2
    move-object v1, v0

    move-object v2, v1

    :goto_1
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p0

    :try_start_1
    iget-object p2, p0, Le4/d;->s:Ld1/f;

    invoke-virtual {p2}, Ld1/f;->E()V

    if-eqz v0, :cond_3

    iget-object p2, p0, Le4/d;->s:Ld1/f;

    invoke-virtual {p2, p1}, Ld1/f;->D(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    if-eqz v0, :cond_4

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_4
    if-eqz v1, :cond_5

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_5
    if-eqz v2, :cond_6

    invoke-static {v2}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_6
    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_7

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_7
    if-eqz v1, :cond_8

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_8
    if-eqz v2, :cond_9

    invoke-static {v2}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_9
    throw p1

    :cond_a
    :try_start_2
    const-string p1, "already closed"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_b
    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final g(Lf4/i;)V
    .locals 1

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Le4/d;->s:Ld1/f;

    invoke-virtual {p1}, Ld1/f;->G()V

    return-void
.end method

.method public final h(Ls3/b0;Lw3/c;)V
    .locals 4

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Ls3/b0;->e:I

    const/16 v1, 0x65

    const/16 v2, 0x27

    if-ne v0, v1, :cond_4

    const-string v0, "Connection"

    invoke-static {p1, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Upgrade"

    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {p1, v1}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "websocket"

    invoke-static {v1, v0}, Lkotlin/text/StringsKt;->g(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v0, "Sec-WebSocket-Accept"

    invoke-static {p1, v0}, Ls3/b0;->a(Ls3/b0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lf4/i;->f:Lf4/i$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Le4/d;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf4/i$a;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v0

    const-string v1, "SHA-1"

    invoke-virtual {v0, v1}, Lf4/i;->b(Ljava/lang/String;)Lf4/i;

    move-result-object v0

    invoke-virtual {v0}, Lf4/i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-nez v1, :cond_1

    if-eqz p2, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Web Socket exchange missing: bad interceptor?"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p2, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected \'Sec-WebSocket-Accept\' header value \'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' but was \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p2, Ljava/net/ProtocolException;

    const-string v0, "Expected HTTP 101 response but was \'"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Ls3/b0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ls3/b0;->d:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final i(Ljava/lang/Exception;Ls3/b0;)V
    .locals 2

    const-string p2, "e"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-boolean p1, p0, Le4/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 p1, 0x1

    :try_start_1
    iput-boolean p1, p0, Le4/d;->o:Z

    iget-object p1, p0, Le4/d;->h:Le4/d$c;

    const/4 p2, 0x0

    iput-object p2, p0, Le4/d;->h:Le4/d$c;

    iget-object v0, p0, Le4/d;->d:Le4/g;

    iput-object p2, p0, Le4/d;->d:Le4/g;

    iget-object v1, p0, Le4/d;->e:Le4/h;

    iput-object p2, p0, Le4/d;->e:Le4/h;

    iget-object p2, p0, Le4/d;->f:Lv3/c;

    invoke-virtual {p2}, Lv3/c;->f()V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    :try_start_2
    iget-object p2, p0, Le4/d;->s:Ld1/f;

    invoke-virtual {p2}, Ld1/f;->F()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_1

    invoke-static {p1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_1
    if-eqz v0, :cond_2

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_2
    if-eqz v1, :cond_3

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p2

    if-eqz p1, :cond_4

    invoke-static {p1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_4
    if-eqz v0, :cond_5

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_5
    if-eqz v1, :cond_6

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_6
    throw p2

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final j(Ljava/lang/String;Le4/d$c;)V
    .locals 10

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Le4/d;->v:Le4/f;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iput-object p1, p0, Le4/d;->g:Ljava/lang/String;

    iput-object p2, p0, Le4/d;->h:Le4/d$c;

    new-instance v9, Le4/h;

    iget-boolean v2, p2, Le4/d$c;->b:Z

    iget-object v3, p2, Le4/d$c;->d:Lf4/g;

    iget-object v4, p0, Le4/d;->t:Ljava/util/Random;

    iget-boolean v5, v0, Le4/f;->a:Z

    if-eqz v2, :cond_0

    iget-boolean v1, v0, Le4/f;->c:Z

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, Le4/f;->e:Z

    :goto_0
    move v6, v1

    iget-wide v7, p0, Le4/d;->w:J

    move-object v1, v9

    invoke-direct/range {v1 .. v8}, Le4/h;-><init>(ZLf4/g;Ljava/util/Random;ZZJ)V

    iput-object v9, p0, Le4/d;->e:Le4/h;

    new-instance v1, Le4/d$d;

    invoke-direct {v1, p0}, Le4/d$d;-><init>(Le4/d;)V

    iput-object v1, p0, Le4/d;->c:Le4/d$d;

    iget-wide v1, p0, Le4/d;->u:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    iget-object v3, p0, Le4/d;->f:Lv3/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ping"

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v4, Le4/d$e;

    invoke-direct {v4, p1, v1, v2, p0}, Le4/d$e;-><init>(Ljava/lang/String;JLe4/d;)V

    invoke-virtual {v3, v4, v1, v2}, Lv3/c;->c(Lv3/a;J)V

    :cond_1
    iget-object p1, p0, Le4/d;->j:Ljava/util/ArrayDeque;

    invoke-virtual {p1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Le4/d;->l()V

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    new-instance p1, Le4/g;

    iget-boolean v2, p2, Le4/d$c;->b:Z

    iget-object v3, p2, Le4/d$c;->c:Lf4/h;

    iget-boolean v5, v0, Le4/f;->a:Z

    xor-int/lit8 p2, v2, 0x1

    if-eqz p2, :cond_3

    iget-boolean p2, v0, Le4/f;->c:Z

    goto :goto_1

    :cond_3
    iget-boolean p2, v0, Le4/f;->e:Z

    :goto_1
    move v6, p2

    move-object v1, p1

    move-object v4, p0

    invoke-direct/range {v1 .. v6}, Le4/g;-><init>(ZLf4/h;Le4/g$a;ZZ)V

    iput-object p1, p0, Le4/d;->d:Le4/g;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final k()V
    .locals 11

    :goto_0
    iget v0, p0, Le4/d;->m:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_10

    iget-object v0, p0, Le4/d;->d:Le4/g;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0}, Le4/g;->b()V

    iget-boolean v1, v0, Le4/g;->f:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Le4/g;->a()V

    goto :goto_0

    :cond_0
    iget v1, v0, Le4/g;->c:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/net/ProtocolException;

    const-string v2, "Unknown opcode: "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v1}, Lt3/c;->x(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_1
    iget-boolean v3, v0, Le4/g;->b:Z

    if-nez v3, :cond_f

    iget-wide v3, v0, Le4/g;->d:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_3

    iget-object v7, v0, Le4/g;->n:Lf4/h;

    iget-object v8, v0, Le4/g;->i:Lf4/f;

    invoke-interface {v7, v8, v3, v4}, Lf4/h;->F(Lf4/f;J)V

    iget-boolean v3, v0, Le4/g;->m:Z

    if-nez v3, :cond_3

    iget-object v3, v0, Le4/g;->i:Lf4/f;

    iget-object v4, v0, Le4/g;->l:Lf4/f$a;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3, v4}, Lf4/f;->f(Lf4/f$a;)Lf4/f$a;

    iget-object v3, v0, Le4/g;->l:Lf4/f$a;

    iget-object v4, v0, Le4/g;->i:Lf4/f;

    iget-wide v7, v4, Lf4/f;->c:J

    iget-wide v9, v0, Le4/g;->d:J

    sub-long/2addr v7, v9

    invoke-virtual {v3, v7, v8}, Lf4/f$a;->b(J)I

    iget-object v3, v0, Le4/g;->l:Lf4/f$a;

    iget-object v4, v0, Le4/g;->k:[B

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v3, v4}, Li/g;->I(Lf4/f$a;[B)V

    iget-object v3, v0, Le4/g;->l:Lf4/f$a;

    invoke-virtual {v3}, Lf4/f$a;->close()V

    :cond_3
    iget-boolean v3, v0, Le4/g;->e:Z

    if-eqz v3, :cond_b

    iget-boolean v3, v0, Le4/g;->g:Z

    if-eqz v3, :cond_9

    iget-object v3, v0, Le4/g;->j:Le4/c;

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    new-instance v3, Le4/c;

    iget-boolean v4, v0, Le4/g;->q:Z

    invoke-direct {v3, v4}, Le4/c;-><init>(Z)V

    iput-object v3, v0, Le4/g;->j:Le4/c;

    :goto_2
    iget-object v4, v0, Le4/g;->i:Lf4/f;

    const-string v7, "buffer"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v3, Le4/c;->b:Lf4/f;

    iget-wide v7, v7, Lf4/f;->c:J

    cmp-long v9, v7, v5

    if-nez v9, :cond_5

    const/4 v5, 0x1

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :goto_3
    if-eqz v5, :cond_8

    iget-boolean v5, v3, Le4/c;->e:Z

    if-eqz v5, :cond_6

    iget-object v5, v3, Le4/c;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v5}, Ljava/util/zip/Inflater;->reset()V

    :cond_6
    iget-object v5, v3, Le4/c;->b:Lf4/f;

    invoke-virtual {v5, v4}, Lf4/f;->b0(Lf4/a0;)J

    iget-object v5, v3, Le4/c;->b:Lf4/f;

    const v6, 0xffff

    invoke-virtual {v5, v6}, Lf4/f;->I(I)Lf4/f;

    iget-object v5, v3, Le4/c;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v5}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v5

    iget-object v7, v3, Le4/c;->b:Lf4/f;

    iget-wide v7, v7, Lf4/f;->c:J

    add-long/2addr v5, v7

    :cond_7
    iget-object v7, v3, Le4/c;->d:Lf4/o;

    const-wide v8, 0x7fffffffffffffffL

    invoke-virtual {v7, v4, v8, v9}, Lf4/o;->a(Lf4/f;J)J

    iget-object v7, v3, Le4/c;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v7}, Ljava/util/zip/Inflater;->getBytesRead()J

    move-result-wide v7

    cmp-long v9, v7, v5

    if-ltz v9, :cond_7

    goto :goto_4

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_4
    if-ne v1, v2, :cond_a

    iget-object v1, v0, Le4/g;->o:Le4/g$a;

    iget-object v0, v0, Le4/g;->i:Lf4/f;

    invoke-virtual {v0}, Lf4/f;->q()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Le4/g$a;->d(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_a
    iget-object v1, v0, Le4/g;->o:Le4/g$a;

    iget-object v0, v0, Le4/g;->i:Lf4/f;

    invoke-virtual {v0}, Lf4/f;->l()Lf4/i;

    move-result-object v0

    invoke-interface {v1, v0}, Le4/g$a;->g(Lf4/i;)V

    goto/16 :goto_0

    :cond_b
    :goto_5
    iget-boolean v3, v0, Le4/g;->b:Z

    if-nez v3, :cond_d

    invoke-virtual {v0}, Le4/g;->b()V

    iget-boolean v3, v0, Le4/g;->f:Z

    if-nez v3, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {v0}, Le4/g;->a()V

    goto :goto_5

    :cond_d
    :goto_6
    iget v3, v0, Le4/g;->c:I

    if-nez v3, :cond_e

    goto/16 :goto_1

    :cond_e
    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Expected continuation opcode. Got: "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v0, v0, Le4/g;->c:I

    invoke-static {v0}, Lt3/c;->x(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    return-void
.end method

.method public final l()V
    .locals 4

    sget-object v0, Lt3/c;->a:[B

    iget-object v0, p0, Le4/d;->c:Le4/d$d;

    if-eqz v0, :cond_0

    iget-object v1, p0, Le4/d;->f:Lv3/c;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lv3/c;->c(Lv3/a;J)V

    :cond_0
    return-void
.end method

.method public final m()Z
    .locals 13

    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    const/4 v1, 0x0

    iput-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v2, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    const/4 v3, -0x1

    iput v3, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v1, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v6, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    iput-object v1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget-boolean v8, p0, Le4/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    monitor-exit p0

    return v9

    :cond_0
    :try_start_1
    iget-object v8, p0, Le4/d;->e:Le4/h;

    iget-object v10, p0, Le4/d;->i:Ljava/util/ArrayDeque;

    invoke-virtual {v10}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lf4/i;

    if-nez v10, :cond_4

    iget-object v11, p0, Le4/d;->j:Ljava/util/ArrayDeque;

    invoke-virtual {v11}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v12, v11, Le4/d$a;

    if-eqz v12, :cond_3

    iget v9, p0, Le4/d;->m:I

    iput v9, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v11, p0, Le4/d;->n:Ljava/lang/String;

    iput-object v11, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eq v9, v3, :cond_1

    iget-object v3, p0, Le4/d;->h:Le4/d$c;

    iput-object v3, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iput-object v1, p0, Le4/d;->h:Le4/d$c;

    iget-object v3, p0, Le4/d;->d:Le4/g;

    iput-object v3, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iput-object v1, p0, Le4/d;->d:Le4/g;

    iget-object v3, p0, Le4/d;->e:Le4/h;

    iput-object v3, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    iput-object v1, p0, Le4/d;->e:Le4/h;

    iget-object v1, p0, Le4/d;->f:Lv3/c;

    invoke-virtual {v1}, Lv3/c;->f()V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-eqz v1, :cond_2

    check-cast v1, Le4/d$a;

    iget-wide v11, v1, Le4/d$a;->c:J

    iget-object v1, p0, Le4/d;->f:Lv3/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v9, p0, Le4/d;->g:Ljava/lang/String;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " cancel"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v11

    new-instance v9, Le4/d$f;

    invoke-direct {v9, v3, p0}, Le4/d$f;-><init>(Ljava/lang/String;Le4/d;)V

    invoke-virtual {v1, v9, v11, v12}, Lv3/c;->c(Lv3/a;J)V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    :cond_3
    if-nez v11, :cond_4

    monitor-exit p0

    return v9

    :cond_4
    :goto_0
    :try_start_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    monitor-exit p0

    const/4 v1, 0x1

    if-eqz v10, :cond_5

    :try_start_3
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "payload"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    invoke-virtual {v8, v0, v10}, Le4/h;->a(ILf4/i;)V

    goto/16 :goto_1

    :cond_5
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    instance-of v3, v0, Le4/d$b;

    if-eqz v3, :cond_7

    if-eqz v0, :cond_6

    check-cast v0, Le4/d$b;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v2, v0, Le4/d$b;->a:I

    iget-object v3, v0, Le4/d$b;->b:Lf4/i;

    invoke-virtual {v8, v2, v3}, Le4/h;->b(ILf4/i;)V

    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    iget-wide v2, p0, Le4/d;->k:J

    iget-object v0, v0, Le4/d$b;->b:Lf4/i;

    invoke-virtual {v0}, Lf4/i;->c()I

    move-result v0

    int-to-long v8, v0

    sub-long/2addr v2, v8

    iput-wide v2, p0, Le4/d;->k:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    monitor-exit p0

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    instance-of v3, v0, Le4/d$a;

    if-eqz v3, :cond_11

    if-eqz v0, :cond_10

    check-cast v0, Le4/d$a;

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v3, v0, Le4/d$a;->a:I

    iget-object v0, v0, Le4/d$a;->b:Lf4/i;

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lf4/i;->e:Lf4/i;

    if-nez v3, :cond_8

    if-eqz v0, :cond_b

    :cond_8
    if-eqz v3, :cond_9

    invoke-static {v3}, Li/g;->J(I)V

    :cond_9
    new-instance v9, Lf4/f;

    invoke-direct {v9}, Lf4/f;-><init>()V

    invoke-virtual {v9, v3}, Lf4/f;->J(I)Lf4/f;

    if-eqz v0, :cond_a

    invoke-virtual {v9, v0}, Lf4/f;->x(Lf4/i;)Lf4/f;

    :cond_a
    invoke-virtual {v9}, Lf4/f;->l()Lf4/i;

    move-result-object v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_b
    const/16 v0, 0x8

    :try_start_6
    invoke-virtual {v8, v0, v9}, Le4/h;->a(ILf4/i;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :try_start_7
    iput-boolean v1, v8, Le4/h;->d:Z

    iget-object v0, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Le4/d$c;

    if-eqz v0, :cond_c

    iget-object v0, p0, Le4/d;->s:Ld1/f;

    iget v2, v2, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    iget-object v3, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ld1/f;->D(I)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :cond_c
    :goto_1
    iget-object v0, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Le4/d$c;

    if-eqz v0, :cond_d

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_d
    iget-object v0, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Le4/g;

    if-eqz v0, :cond_e

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_e
    iget-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v0, Le4/h;

    if-eqz v0, :cond_f

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_f
    return v1

    :catchall_1
    move-exception v0

    :try_start_8
    iput-boolean v1, v8, Le4/h;->d:Z

    throw v0

    :cond_10
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v0

    iget-object v1, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Le4/d$c;

    if-eqz v1, :cond_12

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_12
    iget-object v1, v6, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Le4/g;

    if-eqz v1, :cond_13

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_13
    iget-object v1, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    check-cast v1, Le4/h;

    if-eqz v1, :cond_14

    invoke-static {v1}, Lt3/c;->d(Ljava/io/Closeable;)V

    :cond_14
    throw v0

    :catchall_3
    move-exception v0

    monitor-exit p0

    throw v0
.end method
