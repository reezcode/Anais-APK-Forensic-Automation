.class public final Lv3/d$d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv3/d;-><init>(Lv3/d$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lv3/d;


# direct methods
.method public constructor <init>(Lv3/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lv3/d$d;->b:Lv3/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    :cond_0
    :goto_0
    iget-object v0, p0, Lv3/d$d;->b:Lv3/d;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lv3/d$d;->b:Lv3/d;

    invoke-virtual {v1}, Lv3/d;->c()Lv3/a;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-exit v0

    if-eqz v1, :cond_3

    iget-object v0, v1, Lv3/a;->a:Lv3/c;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-wide/16 v2, -0x1

    sget-object v4, Lv3/d;->j:Lv3/d$b;

    sget-object v4, Lv3/d;->i:Ljava/util/logging/Logger;

    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v4, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v2, v0, Lv3/c;->e:Lv3/d;

    iget-object v2, v2, Lv3/d;->g:Lv3/d$a;

    invoke-interface {v2}, Lv3/d$a;->c()J

    move-result-wide v2

    const-string v5, "starting"

    invoke-static {v1, v0, v5}, Lk/j0;->b(Lv3/a;Lv3/c;Ljava/lang/String;)V

    :cond_1
    :try_start_1
    iget-object v5, p0, Lv3/d$d;->b:Lv3/d;

    invoke-static {v5, v1}, Lv3/d;->a(Lv3/d;Lv3/a;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_0

    iget-object v4, v0, Lv3/c;->e:Lv3/d;

    iget-object v4, v4, Lv3/d;->g:Lv3/d$a;

    invoke-interface {v4}, Lv3/d$a;->c()J

    move-result-wide v4

    sub-long/2addr v4, v2

    const-string v2, "finished run in "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4, v5}, Lk/j0;->e(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lk/j0;->b(Lv3/a;Lv3/c;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v5

    goto :goto_1

    :catchall_1
    move-exception v5

    :try_start_3
    iget-object v6, p0, Lv3/d$d;->b:Lv3/d;

    iget-object v6, v6, Lv3/d;->g:Lv3/d$a;

    invoke-interface {v6, p0}, Lv3/d$a;->execute(Ljava/lang/Runnable;)V

    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_1
    if-eqz v4, :cond_2

    iget-object v4, v0, Lv3/c;->e:Lv3/d;

    iget-object v4, v4, Lv3/d;->g:Lv3/d$a;

    invoke-interface {v4}, Lv3/d$a;->c()J

    move-result-wide v6

    sub-long/2addr v6, v2

    const-string v2, "failed a run in "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v6, v7}, Lk/j0;->e(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lk/j0;->b(Lv3/a;Lv3/c;Ljava/lang/String;)V

    :cond_2
    throw v5

    :cond_3
    return-void

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1
.end method
