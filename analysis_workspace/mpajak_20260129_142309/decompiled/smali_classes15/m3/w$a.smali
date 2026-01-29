.class public final Lm3/w$a;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/coroutines/CoroutineContext$Key;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm3/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/coroutines/CoroutineContext$Key<",
        "Lm3/w;",
        ">;"
    }
.end annotation


# static fields
.field public static final synthetic b:Lm3/w$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm3/w$a;

    invoke-direct {v0}, Lm3/w$a;-><init>()V

    sput-object v0, Lm3/w$a;->b:Lm3/w$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
