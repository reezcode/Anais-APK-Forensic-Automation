.class public final Lm0/a$c;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/core/util/Pools$Pool;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/core/util/Pools$Pool<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lm0/a$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm0/a$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lm0/a$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm0/a$e<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Landroidx/core/util/Pools$Pool;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/core/util/Pools$Pool;Lm0/a$b;Lm0/a$e;)V
    .locals 0
    .param p1    # Landroidx/core/util/Pools$Pool;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lm0/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lm0/a$e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Pools$Pool<",
            "TT;>;",
            "Lm0/a$b<",
            "TT;>;",
            "Lm0/a$e<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/a$c;->c:Landroidx/core/util/Pools$Pool;

    iput-object p2, p0, Lm0/a$c;->a:Lm0/a$b;

    iput-object p3, p0, Lm0/a$c;->b:Lm0/a$e;

    return-void
.end method


# virtual methods
.method public final acquire()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lm0/a$c;->c:Landroidx/core/util/Pools$Pool;

    invoke-interface {v0}, Landroidx/core/util/Pools$Pool;->acquire()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lm0/a$c;->a:Lm0/a$b;

    invoke-interface {v0}, Lm0/a$b;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const-string v2, "FactoryPools"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Created new "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    instance-of v1, v0, Lm0/a$d;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lm0/a$d;

    invoke-interface {v1}, Lm0/a$d;->c()Lm0/d;

    move-result-object v1

    const/4 v2, 0x0

    check-cast v1, Lm0/d$a;

    iput-boolean v2, v1, Lm0/d$a;->a:Z

    :cond_1
    return-object v0
.end method

.method public final release(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    instance-of v0, p1, Lm0/a$d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lm0/a$d;

    invoke-interface {v0}, Lm0/a$d;->c()Lm0/d;

    move-result-object v0

    const/4 v1, 0x1

    check-cast v0, Lm0/d$a;

    iput-boolean v1, v0, Lm0/d$a;->a:Z

    :cond_0
    iget-object v0, p0, Lm0/a$c;->b:Lm0/a$e;

    invoke-interface {v0, p1}, Lm0/a$e;->a(Ljava/lang/Object;)V

    iget-object v0, p0, Lm0/a$c;->c:Landroidx/core/util/Pools$Pool;

    invoke-interface {v0, p1}, Landroidx/core/util/Pools$Pool;->release(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
