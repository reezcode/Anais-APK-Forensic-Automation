.class public final Lr3/b;
.super Lm3/n0;

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final c:Lr3/b;

.field public static final d:Lq3/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lr3/b;

    invoke-direct {v0}, Lr3/b;-><init>()V

    sput-object v0, Lr3/b;->c:Lr3/b;

    sget-object v0, Lr3/l;->c:Lr3/l;

    sget v1, Lq3/s;->a:I

    const/16 v2, 0x40

    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v1

    const-string v2, "kotlinx.coroutines.io.parallelism"

    const/4 v3, 0x0

    const/16 v4, 0xc

    invoke-static {v2, v1, v3, v3, v4}, Li/g;->C(Ljava/lang/String;IIII)I

    move-result v1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    if-lt v1, v2, :cond_0

    const/4 v3, 0x1

    :cond_0
    if-eqz v3, :cond_1

    new-instance v2, Lq3/g;

    invoke-direct {v2, v0, v1}, Lq3/g;-><init>(Lm3/v;I)V

    sput-object v2, Lr3/b;->d:Lq3/g;

    return-void

    :cond_1
    const-string v0, "Expected positive parallelism level, but got "

    invoke-static {v0, v1}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lm3/n0;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lr3/b;->d:Lq3/g;

    invoke-virtual {v0, p1, p2}, Lq3/g;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-virtual {p0, v0, p1}, Lr3/b;->c(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
