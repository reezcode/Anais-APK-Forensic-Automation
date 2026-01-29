.class public final Lpl/droidsonroids/gif/e;
.super Lpl/droidsonroids/gif/f;


# direct methods
.method public constructor <init>(Lpl/droidsonroids/gif/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lpl/droidsonroids/gif/f;-><init>(Lpl/droidsonroids/gif/b;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v1, v0, Lpl/droidsonroids/gif/b;->h:Lpl/droidsonroids/gif/GifInfoHandle;

    iget-object v0, v0, Lpl/droidsonroids/gif/b;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v1, v0}, Lpl/droidsonroids/gif/GifInfoHandle;->l(Landroid/graphics/Bitmap;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_3

    iget-object v4, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v5

    add-long/2addr v5, v0

    iput-wide v5, v4, Lpl/droidsonroids/gif/b;->d:J

    iget-object v4, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-boolean v4, v4, Lpl/droidsonroids/gif/b;->c:Z

    if-eqz v4, :cond_0

    iget-object v4, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-boolean v5, v4, Lpl/droidsonroids/gif/b;->m:Z

    if-nez v5, :cond_0

    iget-object v4, v4, Lpl/droidsonroids/gif/b;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    invoke-virtual {v4, p0}, Ljava/util/concurrent/ThreadPoolExecutor;->remove(Ljava/lang/Runnable;)Z

    iget-object v4, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v5, v4, Lpl/droidsonroids/gif/b;->b:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, p0, v0, v1, v6}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, v4, Lpl/droidsonroids/gif/b;->q:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v0, v0, Lpl/droidsonroids/gif/b;->i:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v0, v0, Lpl/droidsonroids/gif/b;->h:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->a()I

    move-result v0

    iget-object v1, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v1, v1, Lpl/droidsonroids/gif/b;->h:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v1}, Lpl/droidsonroids/gif/GifInfoHandle;->h()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v1, v0, Lpl/droidsonroids/gif/b;->n:Lk4/d;

    iget-object v4, v0, Lpl/droidsonroids/gif/b;->h:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v4}, Lpl/droidsonroids/gif/GifInfoHandle;->b()I

    move-result v4

    if-eqz v4, :cond_2

    iget-object v0, v0, Lpl/droidsonroids/gif/b;->h:Lpl/droidsonroids/gif/GifInfoHandle;

    invoke-virtual {v0}, Lpl/droidsonroids/gif/GifInfoHandle;->f()I

    move-result v0

    if-ge v4, v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 v4, v4, -0x1

    :cond_2
    :goto_0
    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-wide v5, v0, Lpl/droidsonroids/gif/b;->d:J

    invoke-virtual {v1, v4, v5, v6}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    const-wide/high16 v4, -0x8000000000000000L

    iput-wide v4, v0, Lpl/droidsonroids/gif/b;->d:J

    const/4 v1, 0x0

    iput-boolean v1, v0, Lpl/droidsonroids/gif/b;->c:Z

    :cond_4
    :goto_1
    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v0, v0, Lpl/droidsonroids/gif/b;->n:Lk4/d;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lpl/droidsonroids/gif/f;->b:Lpl/droidsonroids/gif/b;

    iget-object v0, v0, Lpl/droidsonroids/gif/b;->n:Lk4/d;

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    :cond_5
    return-void
.end method
