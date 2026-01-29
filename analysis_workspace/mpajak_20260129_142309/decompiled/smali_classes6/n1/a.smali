.class public final Ln1/a;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic a:Ln1/d;


# direct methods
.method public constructor <init>(Ln1/d;)V
    .locals 0

    iput-object p1, p0, Ln1/a;->a:Ln1/d;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Ln1/a;->a:Ln1/d;

    invoke-interface {p1}, Ln1/d;->a()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Ln1/a;->a:Ln1/d;

    invoke-interface {p1}, Ln1/d;->b()V

    return-void
.end method
