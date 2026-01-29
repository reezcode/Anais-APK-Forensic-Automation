.class public Lr3/f;
.super Lm3/n0;


# instance fields
.field public c:Lr3/a;


# direct methods
.method public constructor <init>(IIJ)V
    .locals 7

    invoke-direct {p0}, Lm3/n0;-><init>()V

    new-instance v6, Lr3/a;

    const-string v5, "DefaultDispatcher"

    move-object v0, v6

    move v1, p1

    move v2, p2

    move-wide v3, p3

    invoke-direct/range {v0 .. v5}, Lr3/a;-><init>(IIJLjava/lang/String;)V

    iput-object v6, p0, Lr3/f;->c:Lr3/a;

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 2

    iget-object p1, p0, Lr3/f;->c:Lr3/a;

    sget-object v0, Lr3/a;->i:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    sget-object v0, Lr3/k;->f:Lr3/i;

    const/4 v1, 0x0

    invoke-virtual {p1, p2, v0, v1}, Lr3/a;->c(Ljava/lang/Runnable;Lr3/h;Z)V

    return-void
.end method
