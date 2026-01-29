.class public final Lq3/t;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lq3/r;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public static final b:Lq3/t$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lq3/t$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lm3/g1<",
            "*>;",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "Lm3/g1<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final d:Lq3/t$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lq3/w;",
            "Lkotlin/coroutines/CoroutineContext$Element;",
            "Lq3/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq3/r;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lq3/r;-><init>(Ljava/lang/String;)V

    sput-object v0, Lq3/t;->a:Lq3/r;

    sget-object v0, Lq3/t$a;->b:Lq3/t$a;

    sput-object v0, Lq3/t;->b:Lq3/t$a;

    sget-object v0, Lq3/t$b;->b:Lq3/t$b;

    sput-object v0, Lq3/t;->c:Lq3/t$b;

    sget-object v0, Lq3/t$c;->b:Lq3/t$c;

    sput-object v0, Lq3/t;->d:Lq3/t$c;

    return-void
.end method

.method public static final a(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, Lq3/t;->a:Lq3/r;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lq3/w;

    if-eqz v0, :cond_2

    check-cast p1, Lq3/w;

    iget-object p0, p1, Lq3/w;->c:[Lm3/g1;

    array-length p0, p0

    add-int/lit8 p0, p0, -0x1

    if-ltz p0, :cond_3

    :goto_0
    add-int/lit8 v0, p0, -0x1

    iget-object v1, p1, Lq3/w;->c:[Lm3/g1;

    aget-object v1, v1, p0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p1, Lq3/w;->b:[Ljava/lang/Object;

    aget-object p0, v2, p0

    invoke-interface {v1, p0}, Lm3/g1;->f(Ljava/lang/Object;)V

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    move p0, v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    sget-object v1, Lq3/t;->c:Lq3/t$b;

    invoke-interface {p0, v0, v1}, Lkotlin/coroutines/CoroutineContext;->fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p0, Lm3/g1;

    invoke-interface {p0, p1}, Lm3/g1;->f(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static final b(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-nez p1, :cond_0

    sget-object p1, Lq3/t;->b:Lq3/t$a;

    invoke-interface {p0, v0, p1}, Lkotlin/coroutines/CoroutineContext;->fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :cond_0
    if-ne p1, v0, :cond_1

    sget-object p0, Lq3/t;->a:Lq3/r;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lq3/w;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lq3/w;-><init>(Lkotlin/coroutines/CoroutineContext;I)V

    sget-object p1, Lq3/t;->d:Lq3/t$c;

    invoke-interface {p0, v0, p1}, Lkotlin/coroutines/CoroutineContext;->fold(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    check-cast p1, Lm3/g1;

    invoke-interface {p1, p0}, Lm3/g1;->w(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
