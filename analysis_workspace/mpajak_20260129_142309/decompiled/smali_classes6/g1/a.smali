.class public final Lg1/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:Lb2/g;

.field public final synthetic b:Lcom/google/android/material/appbar/AppBarLayout;


# direct methods
.method public constructor <init>(Lcom/google/android/material/appbar/AppBarLayout;Lb2/g;)V
    .locals 0

    iput-object p1, p0, Lg1/a;->b:Lcom/google/android/material/appbar/AppBarLayout;

    iput-object p2, p0, Lg1/a;->a:Lb2/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2
    .param p1    # Landroid/animation/ValueAnimator;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lg1/a;->a:Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->n(F)V

    iget-object v0, p0, Lg1/a;->b:Lcom/google/android/material/appbar/AppBarLayout;

    iget-object v0, v0, Lcom/google/android/material/appbar/AppBarLayout;->p:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Lb2/g;

    if-eqz v1, :cond_0

    check-cast v0, Lb2/g;

    invoke-virtual {v0, p1}, Lb2/g;->n(F)V

    :cond_0
    iget-object p1, p0, Lg1/a;->b:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    throw p1
.end method
