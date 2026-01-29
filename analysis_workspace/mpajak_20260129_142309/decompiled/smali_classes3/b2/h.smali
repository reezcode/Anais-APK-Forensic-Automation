.class public final Lb2/h;
.super Ljava/lang/Object;


# direct methods
.method public static a(I)Lb2/d;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p0, :cond_1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    new-instance p0, Lb2/j;

    invoke-direct {p0}, Lb2/j;-><init>()V

    return-object p0

    :cond_0
    new-instance p0, Lb2/e;

    invoke-direct {p0}, Lb2/e;-><init>()V

    return-object p0

    :cond_1
    new-instance p0, Lb2/j;

    invoke-direct {p0}, Lb2/j;-><init>()V

    return-object p0
.end method

.method public static b(Landroid/view/View;Lb2/g;)V
    .locals 2
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lb2/g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p1, Lb2/g;->b:Lb2/g$b;

    iget-object v0, v0, Lb2/g$b;->b:Ls1/a;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Ls1/a;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    const/4 v0, 0x0

    :goto_1
    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_1

    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, Landroidx/core/view/ViewCompat;->getElevation(Landroid/view/View;)F

    move-result v1

    add-float/2addr v0, v1

    invoke-interface {p0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    goto :goto_1

    :cond_1
    iget-object p0, p1, Lb2/g;->b:Lb2/g$b;

    iget v1, p0, Lb2/g$b;->m:F

    cmpl-float v1, v1, v0

    if-eqz v1, :cond_2

    iput v0, p0, Lb2/g$b;->m:F

    invoke-virtual {p1}, Lb2/g;->w()V

    :cond_2
    return-void
.end method
