.class public final Lcom/google/android/material/transformation/c;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic a:Ln1/d;


# direct methods
.method public constructor <init>(Ln1/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/transformation/c;->a:Ln1/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object p1, p0, Lcom/google/android/material/transformation/c;->a:Ln1/d;

    invoke-interface {p1}, Ln1/d;->getRevealInfo()Ln1/d$d;

    move-result-object p1

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    iput v0, p1, Ln1/d$d;->c:F

    iget-object v0, p0, Lcom/google/android/material/transformation/c;->a:Ln1/d;

    invoke-interface {v0, p1}, Ln1/d;->setRevealInfo(Ln1/d$d;)V

    return-void
.end method
