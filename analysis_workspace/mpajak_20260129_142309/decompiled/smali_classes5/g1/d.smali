.class public Lg1/d;
.super Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Landroid/view/View;",
        ">",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public a:Lg1/e;

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lg1/d;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput p1, p0, Lg1/d;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lg1/d;->a:Lg1/e;

    if-eqz v0, :cond_0

    iget v0, v0, Lg1/e;->d:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 0
    .param p1    # Landroidx/coordinatorlayout/widget/CoordinatorLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)V"
        }
    .end annotation

    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->onLayoutChild(Landroid/view/View;I)V

    return-void
.end method

.method public final c(I)Z
    .locals 3

    iget-object v0, p0, Lg1/d;->a:Lg1/e;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget v2, v0, Lg1/e;->d:I

    if-eq v2, p1, :cond_0

    iput p1, v0, Lg1/e;->d:I

    invoke-virtual {v0}, Lg1/e;->a()V

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    iput p1, p0, Lg1/d;->b:I

    return v1
.end method

.method public onLayoutChild(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 1
    .param p1    # Landroidx/coordinatorlayout/widget/CoordinatorLayout;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
            "TV;I)Z"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3}, Lg1/d;->b(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    iget-object p1, p0, Lg1/d;->a:Lg1/e;

    if-nez p1, :cond_0

    new-instance p1, Lg1/e;

    invoke-direct {p1, p2}, Lg1/e;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lg1/d;->a:Lg1/e;

    :cond_0
    iget-object p1, p0, Lg1/d;->a:Lg1/e;

    iget-object p2, p1, Lg1/e;->a:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    iput p2, p1, Lg1/e;->b:I

    iget-object p2, p1, Lg1/e;->a:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result p2

    iput p2, p1, Lg1/e;->c:I

    iget-object p1, p0, Lg1/d;->a:Lg1/e;

    invoke-virtual {p1}, Lg1/e;->a()V

    iget p1, p0, Lg1/d;->b:I

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    iget-object p3, p0, Lg1/d;->a:Lg1/e;

    iget v0, p3, Lg1/e;->d:I

    if-eq v0, p1, :cond_1

    iput p1, p3, Lg1/e;->d:I

    invoke-virtual {p3}, Lg1/e;->a()V

    :cond_1
    iput p2, p0, Lg1/d;->b:I

    :cond_2
    const/4 p1, 0x1

    return p1
.end method
