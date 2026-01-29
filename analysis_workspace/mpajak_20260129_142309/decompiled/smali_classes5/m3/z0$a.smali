.class public final Lm3/z0$a;
.super Lm3/y0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm3/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final f:Lm3/z0;

.field public final g:Lm3/z0$b;

.field public final h:Lm3/j;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lm3/z0;Lm3/z0$b;Lm3/j;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lm3/y0;-><init>()V

    iput-object p1, p0, Lm3/z0$a;->f:Lm3/z0;

    iput-object p2, p0, Lm3/z0$a;->g:Lm3/z0$b;

    iput-object p3, p0, Lm3/z0$a;->h:Lm3/j;

    iput-object p4, p0, Lm3/z0$a;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm3/z0$a;->k(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 4

    iget-object p1, p0, Lm3/z0$a;->f:Lm3/z0;

    iget-object v0, p0, Lm3/z0$a;->g:Lm3/z0$b;

    iget-object v1, p0, Lm3/z0$a;->h:Lm3/j;

    iget-object v2, p0, Lm3/z0$a;->i:Ljava/lang/Object;

    sget-object v3, Lm3/z0;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {p1, v1}, Lm3/z0;->D(Lq3/i;)Lm3/j;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0, v1, v2}, Lm3/z0;->L(Lm3/z0$b;Lm3/j;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0, v2}, Lm3/z0;->o(Lm3/z0$b;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lm3/z0;->g(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
