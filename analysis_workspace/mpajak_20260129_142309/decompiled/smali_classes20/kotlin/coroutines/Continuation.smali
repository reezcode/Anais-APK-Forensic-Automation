.class public interface abstract Lkotlin/coroutines/Continuation;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation build Lkotlin/SinceKotlin;
    version = "1.3"
.end annotation


# virtual methods
.method public abstract getContext()Lkotlin/coroutines/CoroutineContext;
.end method

.method public abstract resumeWith(Ljava/lang/Object;)V
.end method
