.class public final Lq3/t$b;
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
        "Lm3/g1<",
        "*>;",
        "Lkotlin/coroutines/CoroutineContext$Element;",
        "Lm3/g1<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final b:Lq3/t$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq3/t$b;

    invoke-direct {v0}, Lq3/t$b;-><init>()V

    sput-object v0, Lq3/t$b;->b:Lq3/t$b;

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
    .locals 0

    check-cast p1, Lm3/g1;

    check-cast p2, Lkotlin/coroutines/CoroutineContext$Element;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lm3/g1;

    if-eqz p1, :cond_1

    check-cast p2, Lm3/g1;

    move-object p1, p2

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
