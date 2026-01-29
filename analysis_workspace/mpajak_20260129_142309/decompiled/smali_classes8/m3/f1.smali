.class public Lm3/f1;
.super Lm3/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lm3/a<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lm3/a;-><init>(Lkotlin/coroutines/CoroutineContext;Z)V

    return-void
.end method


# virtual methods
.method public final y(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, Lm3/a;->c:Lkotlin/coroutines/CoroutineContext;

    invoke-static {v0, p1}, Ld1/d;->g(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Throwable;)V

    const/4 p1, 0x1

    return p1
.end method
