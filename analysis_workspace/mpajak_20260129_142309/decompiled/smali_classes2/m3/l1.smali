.class public final Lm3/l1;
.super Lkotlin/coroutines/AbstractCoroutineContextElement;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm3/l1$a;
    }
.end annotation

.annotation build Lkotlin/PublishedApi;
.end annotation


# static fields
.field public static final b:Lm3/l1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm3/l1$a;

    invoke-direct {v0}, Lm3/l1$a;-><init>()V

    sput-object v0, Lm3/l1;->b:Lm3/l1$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lm3/l1;->b:Lm3/l1$a;

    invoke-direct {p0, v0}, Lkotlin/coroutines/AbstractCoroutineContextElement;-><init>(Lkotlin/coroutines/CoroutineContext$Key;)V

    return-void
.end method
