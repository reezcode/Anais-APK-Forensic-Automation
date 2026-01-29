.class public final Lm3/n0$a;
.super Lkotlin/coroutines/AbstractCoroutineContextKey;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm3/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/AbstractCoroutineContextKey<",
        "Lm3/v;",
        "Lm3/n0;",
        ">;"
    }
.end annotation

.annotation build Lkotlin/ExperimentalStdlibApi;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, Lm3/v;->b:Lm3/v$a;

    sget-object v1, Lm3/n0$a$a;->b:Lm3/n0$a$a;

    invoke-direct {p0, v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextKey;-><init>(Lkotlin/coroutines/CoroutineContext$Key;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
