.class public final Lr/v;
.super Ljava/lang/Object;

# interfaces
.implements Lr/w;
.implements Lm0/a$d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lr/w<",
        "TZ;>;",
        "Lm0/a$d;"
    }
.end annotation


# static fields
.field public static final f:Lm0/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Lr/v<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Lm0/d$a;

.field public c:Lr/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/w<",
            "TZ;>;"
        }
    .end annotation
.end field

.field public d:Z

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr/v$a;

    invoke-direct {v0}, Lr/v$a;-><init>()V

    const/16 v1, 0x14

    invoke-static {v1, v0}, Lm0/a;->a(ILm0/a$b;)Landroidx/core/util/Pools$Pool;

    move-result-object v0

    check-cast v0, Lm0/a$c;

    sput-object v0, Lr/v;->f:Lm0/a$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm0/d$a;

    invoke-direct {v0}, Lm0/d$a;-><init>()V

    iput-object v0, p0, Lr/v;->b:Lm0/d$a;

    return-void
.end method

.method public static a(Lr/w;)Lr/v;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Lr/w<",
            "TZ;>;)",
            "Lr/v<",
            "TZ;>;"
        }
    .end annotation

    sget-object v0, Lr/v;->f:Lm0/a$c;

    invoke-virtual {v0}, Lm0/a$c;->acquire()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr/v;

    const-string v1, "Argument must not be null"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lr/v;->e:Z

    const/4 v1, 0x1

    iput-boolean v1, v0, Lr/v;->d:Z

    iput-object p0, v0, Lr/v;->c:Lr/w;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/Class;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TZ;>;"
        }
    .end annotation

    iget-object v0, p0, Lr/v;->c:Lr/w;

    invoke-interface {v0}, Lr/w;->b()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lm0/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lr/v;->b:Lm0/d$a;

    return-object v0
.end method

.method public final declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr/v;->b:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    iget-boolean v0, p0, Lr/v;->d:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr/v;->d:Z

    iget-boolean v0, p0, Lr/v;->e:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr/v;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TZ;"
        }
    .end annotation

    iget-object v0, p0, Lr/v;->c:Lr/w;

    invoke-interface {v0}, Lr/w;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getSize()I
    .locals 1

    iget-object v0, p0, Lr/v;->c:Lr/w;

    invoke-interface {v0}, Lr/w;->getSize()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized recycle()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lr/v;->b:Lm0/d$a;

    invoke-virtual {v0}, Lm0/d$a;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr/v;->e:Z

    iget-boolean v0, p0, Lr/v;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lr/v;->c:Lr/w;

    invoke-interface {v0}, Lr/w;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lr/v;->c:Lr/w;

    sget-object v0, Lr/v;->f:Lm0/a$c;

    invoke-virtual {v0, p0}, Lm0/a$c;->release(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
