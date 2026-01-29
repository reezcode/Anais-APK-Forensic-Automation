.class public Lq3/q;
.super Lm3/a;

# interfaces
.implements Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lm3/a<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;"
    }
.end annotation


# virtual methods
.method public final B()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public M(Ljava/lang/Object;)V
    .locals 0

    invoke-static {p1}, Li/g;->x(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1
.end method

.method public g(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v1

    invoke-static {p1}, Li/g;->x(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1, v0}, Lq3/f;->a(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
