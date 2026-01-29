.class public interface abstract Lkotlin/reflect/KParameter;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/reflect/KAnnotatedElement;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/reflect/KParameter$Kind;,
        Lkotlin/reflect/KParameter$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract getIndex()I
.end method

.method public abstract getKind()Lkotlin/reflect/KParameter$Kind;
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getType()Lkotlin/reflect/KType;
.end method

.method public abstract isOptional()Z
.end method

.method public abstract isVararg()Z
.end method
