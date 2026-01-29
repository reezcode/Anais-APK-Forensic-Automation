.class public final Li3/d0;
.super Landroid/animation/AnimatorListenerAdapter;


# instance fields
.field public final synthetic a:Lcom/superbock/ui/WebActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/WebActivity;)V
    .locals 0

    iput-object p1, p0, Li3/d0;->a:Lcom/superbock/ui/WebActivity;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, Li3/d0;->a:Lcom/superbock/ui/WebActivity;

    iget-object p1, p1, Lcom/superbock/ui/WebActivity;->c:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object p1, p0, Li3/d0;->a:Lcom/superbock/ui/WebActivity;

    iget-object p1, p1, Lcom/superbock/ui/WebActivity;->c:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Li3/d0;->a:Lcom/superbock/ui/WebActivity;

    iput-boolean v0, p1, Lcom/superbock/ui/WebActivity;->e:Z

    return-void
.end method
