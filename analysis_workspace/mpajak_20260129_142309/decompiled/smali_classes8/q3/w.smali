.class public final Lq3/w;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lkotlin/coroutines/CoroutineContext;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public final b:[Ljava/lang/Object;

.field public final c:[Lm3/g1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lm3/g1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public d:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/w;->a:Lkotlin/coroutines/CoroutineContext;

    new-array p1, p2, [Ljava/lang/Object;

    iput-object p1, p0, Lq3/w;->b:[Ljava/lang/Object;

    new-array p1, p2, [Lm3/g1;

    iput-object p1, p0, Lq3/w;->c:[Lm3/g1;

    return-void
.end method
