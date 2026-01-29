.class public interface abstract Lv1/h;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/Checkable;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv1/h$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lv1/h<",
        "TT;>;>",
        "Ljava/lang/Object;",
        "Landroid/widget/Checkable;"
    }
.end annotation


# virtual methods
.method public abstract getId()I
    .annotation build Landroidx/annotation/IdRes;
    .end annotation
.end method

.method public abstract setInternalOnCheckedChangeListener(Lv1/h$a;)V
    .param p1    # Lv1/h$a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv1/h$a<",
            "TT;>;)V"
        }
    .end annotation
.end method
