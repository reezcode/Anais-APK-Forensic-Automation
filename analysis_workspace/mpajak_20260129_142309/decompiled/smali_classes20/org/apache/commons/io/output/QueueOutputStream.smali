.class public Lorg/apache/commons/io/output/QueueOutputStream;
.super Ljava/io/OutputStream;


# instance fields
.field private final blockingQueue:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    invoke-direct {p0, v0}, Lorg/apache/commons/io/output/QueueOutputStream;-><init>(Ljava/util/concurrent/BlockingQueue;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    const-string v0, "blockingQueue"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/BlockingQueue;

    iput-object p1, p0, Lorg/apache/commons/io/output/QueueOutputStream;->blockingQueue:Ljava/util/concurrent/BlockingQueue;

    return-void
.end method


# virtual methods
.method public newQueueInputStream()Lorg/apache/commons/io/input/QueueInputStream;
    .locals 2

    new-instance v0, Lorg/apache/commons/io/input/QueueInputStream;

    iget-object v1, p0, Lorg/apache/commons/io/output/QueueOutputStream;->blockingQueue:Ljava/util/concurrent/BlockingQueue;

    invoke-direct {v0, v1}, Lorg/apache/commons/io/input/QueueInputStream;-><init>(Ljava/util/concurrent/BlockingQueue;)V

    return-object v0
.end method

.method public write(I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/io/output/QueueOutputStream;->blockingQueue:Ljava/util/concurrent/BlockingQueue;

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0
.end method
