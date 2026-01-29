.class public final Lq3/t$c;
.super Lkotlin/jvm/internal/Lambda;

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq3/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lq3/w;",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "Lq3/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lq3/t$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq3/t$c;

    invoke-direct {v0}, Lq3/t$c;-><init>()V

    sput-object v0, Lq3/t$c;->b:Lq3/t$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Lq3/w;

    check-cast p2, Lkotlin/coroutines/CoroutineContext$Element;

    instance-of v0, p2, Lm3/g1;

    if-eqz v0, :cond_0

    check-cast p2, Lm3/g1;

    iget-object v0, p1, Lq3/w;->a:Lkotlin/coroutines/CoroutineContext;

    invoke-interface {p2, v0}, Lm3/g1;->w(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p1, Lq3/w;->b:[Ljava/lang/Object;

    iget v2, p1, Lq3/w;->d:I

    aput-object v0, v1, v2

    iget-object v0, p1, Lq3/w;->c:[Lm3/g1;

    add-int/lit8 v1, v2, 0x1

    iput v1, p1, Lq3/w;->d:I

    aput-object p2, v0, v2

    :cond_0
    return-object p1
.end method
