.class public final Lw3/e$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public volatile b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Ls3/e;

.field public final synthetic d:Lw3/e;


# direct methods
.method public constructor <init>(Lw3/e;Ls3/e;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls3/e;",
            ")V"
        }
    .end annotation

    const-string v0, "responseCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lw3/e$a;->d:Lw3/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lw3/e$a;->c:Ls3/e;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Lw3/e$a;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw3/e$a;->d:Lw3/e;

    iget-object v0, v0, Lw3/e;->r:Ls3/y;

    iget-object v0, v0, Ls3/y;->b:Ls3/s;

    iget-object v0, v0, Ls3/s;->e:Ljava/lang/String;

    return-object v0
.end method

.method public final run()V
    .locals 6

    const-string v0, "OkHttp "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lw3/e$a;->d:Lw3/e;

    iget-object v1, v1, Lw3/e;->r:Ls3/y;

    iget-object v1, v1, Ls3/y;->b:Ls3/s;

    invoke-virtual {v1}, Ls3/s;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const-string v2, "currentThread"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lw3/e$a;->d:Lw3/e;

    iget-object v0, v0, Lw3/e;->d:Lw3/e$c;

    invoke-virtual {v0}, Lf4/c;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    iget-object v0, p0, Lw3/e$a;->d:Lw3/e;

    invoke-virtual {v0}, Lw3/e;->g()Ls3/b0;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x1

    :try_start_2
    iget-object v4, p0, Lw3/e$a;->c:Ls3/e;

    iget-object v5, p0, Lw3/e$a;->d:Lw3/e;

    invoke-interface {v4, v5, v0}, Ls3/e;->a(Ls3/d;Ls3/b0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v0, p0, Lw3/e$a;->d:Lw3/e;

    iget-object v0, v0, Lw3/e;->q:Ls3/w;

    :goto_0
    iget-object v0, v0, Ls3/w;->b:Ls3/m;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    const/4 v3, 0x0

    :goto_1
    :try_start_4
    iget-object v4, p0, Lw3/e$a;->d:Lw3/e;

    invoke-virtual {v4}, Lw3/e;->d()V

    if-nez v3, :cond_0

    new-instance v3, Ljava/io/IOException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "canceled due to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {v3, v0}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iget-object v4, p0, Lw3/e$a;->c:Ls3/e;

    iget-object v5, p0, Lw3/e$a;->d:Lw3/e;

    invoke-interface {v4, v5, v3}, Ls3/e;->b(Ls3/d;Ljava/io/IOException;)V

    :cond_0
    throw v0

    :catchall_2
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_1

    sget-object v3, La4/h;->c:La4/h$a;

    sget-object v3, La4/h;->a:La4/h;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Callback failure for "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lw3/e$a;->d:Lw3/e;

    invoke-static {v5}, Lw3/e;->a(Lw3/e;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    invoke-virtual {v3, v4, v5, v0}, La4/h;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    goto :goto_3

    :cond_1
    iget-object v3, p0, Lw3/e$a;->c:Ls3/e;

    iget-object v4, p0, Lw3/e$a;->d:Lw3/e;

    invoke-interface {v3, v4, v0}, Ls3/e;->b(Ls3/d;Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :goto_3
    :try_start_5
    iget-object v0, p0, Lw3/e$a;->d:Lw3/e;

    iget-object v0, v0, Lw3/e;->q:Ls3/w;

    goto :goto_0

    :goto_4
    invoke-virtual {v0, p0}, Ls3/m;->a(Lw3/e$a;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :goto_5
    :try_start_6
    iget-object v3, p0, Lw3/e$a;->d:Lw3/e;

    iget-object v3, v3, Lw3/e;->q:Ls3/w;

    iget-object v3, v3, Ls3/w;->b:Ls3/m;

    invoke-virtual {v3, p0}, Ls3/m;->a(Lw3/e$a;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception v0

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v0
.end method
