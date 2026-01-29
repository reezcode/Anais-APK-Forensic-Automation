.class public final Lt/h;
.super Ll0/g;

# interfaces
.implements Lt/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ll0/g<",
        "Lp/f;",
        "Lr/w<",
        "*>;>;",
        "Lt/i;"
    }
.end annotation


# instance fields
.field public d:Lt/i$a;


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ll0/g;-><init>(J)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    check-cast p1, Lr/w;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lr/w;->getSize()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    check-cast p1, Lp/f;

    check-cast p2, Lr/w;

    iget-object p1, p0, Lt/h;->d:Lt/i$a;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    check-cast p1, Lr/m;

    iget-object p1, p1, Lr/m;->e:Lr/z;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lr/z;->a(Lr/w;Z)V

    :cond_0
    return-void
.end method
