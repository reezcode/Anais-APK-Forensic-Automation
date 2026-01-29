.class public interface abstract Lkotlin/reflect/KTypeParameter;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/reflect/KClassifier;


# annotations
.annotation build Lkotlin/SinceKotlin;
    version = "1.1"
.end annotation


# virtual methods
.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getUpperBounds()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/reflect/KType;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getVariance()Lkotlin/reflect/KVariance;
.end method

.method public abstract isReified()Z
.end method
