.class public final Li3/l;
.super Lcom/tencent/smtt/sdk/WebChromeClient;


# instance fields
.field public final synthetic a:Lcom/superbock/ui/AdWebSmallActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdWebSmallActivity;)V
    .locals 0

    iput-object p1, p0, Li3/l;->a:Lcom/superbock/ui/AdWebSmallActivity;

    invoke-direct {p0}, Lcom/tencent/smtt/sdk/WebChromeClient;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Lcom/tencent/smtt/sdk/WebView;I)V
    .locals 4

    iget-object p1, p0, Li3/l;->a:Lcom/superbock/ui/AdWebSmallActivity;

    iget-object v0, p1, Lcom/superbock/ui/AdWebSmallActivity;->f:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    iput v0, p1, Lcom/superbock/ui/AdWebSmallActivity;->i:I

    const/16 p1, 0x64

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-lt p2, p1, :cond_0

    iget-object p1, p0, Li3/l;->a:Lcom/superbock/ui/AdWebSmallActivity;

    iget-boolean v2, p1, Lcom/superbock/ui/AdWebSmallActivity;->h:Z

    if-nez v2, :cond_0

    iput-boolean v0, p1, Lcom/superbock/ui/AdWebSmallActivity;->h:Z

    iget-object p1, p1, Lcom/superbock/ui/AdWebSmallActivity;->f:Landroid/widget/ProgressBar;

    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object p1, p0, Li3/l;->a:Lcom/superbock/ui/AdWebSmallActivity;

    iget-object p2, p1, Lcom/superbock/ui/AdWebSmallActivity;->f:Landroid/widget/ProgressBar;

    invoke-virtual {p2}, Landroid/widget/ProgressBar;->getProgress()I

    move-result p2

    iget-object v0, p1, Lcom/superbock/ui/AdWebSmallActivity;->f:Landroid/widget/ProgressBar;

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const-string v2, "alpha"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x5dc

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, Li3/n;

    invoke-direct {v1, p1, p2}, Li3/n;-><init>(Lcom/superbock/ui/AdWebSmallActivity;I)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    new-instance p2, Li3/o;

    invoke-direct {p2, p1}, Li3/o;-><init>(Lcom/superbock/ui/AdWebSmallActivity;)V

    invoke-virtual {v0, p2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li3/l;->a:Lcom/superbock/ui/AdWebSmallActivity;

    iget-object v2, p1, Lcom/superbock/ui/AdWebSmallActivity;->f:Landroid/widget/ProgressBar;

    new-array v1, v1, [I

    iget p1, p1, Lcom/superbock/ui/AdWebSmallActivity;->i:I

    const/4 v3, 0x0

    aput p1, v1, v3

    aput p2, v1, v0

    const-string p1, "progress"

    invoke-static {v2, p1, v1}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v0, 0x12c

    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    new-instance p2, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {p2}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {p1, p2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    :goto_0
    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final onReceivedIcon(Lcom/tencent/smtt/sdk/WebView;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/tencent/smtt/sdk/WebChromeClient;->onReceivedIcon(Lcom/tencent/smtt/sdk/WebView;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final onReceivedTitle(Lcom/tencent/smtt/sdk/WebView;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/tencent/smtt/sdk/WebChromeClient;->onReceivedTitle(Lcom/tencent/smtt/sdk/WebView;Ljava/lang/String;)V

    return-void
.end method

.method public final onShowFileChooser(Lcom/tencent/smtt/sdk/WebView;Lcom/tencent/smtt/sdk/ValueCallback;Lcom/tencent/smtt/sdk/WebChromeClient$FileChooserParams;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/smtt/sdk/WebView;",
            "Lcom/tencent/smtt/sdk/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;",
            "Lcom/tencent/smtt/sdk/WebChromeClient$FileChooserParams;",
            ")Z"
        }
    .end annotation

    iget-object p1, p0, Li3/l;->a:Lcom/superbock/ui/AdWebSmallActivity;

    iput-object p2, p1, Lcom/superbock/ui/AdWebSmallActivity;->m:Lcom/tencent/smtt/sdk/ValueCallback;

    invoke-static {p1}, Lcom/superbock/ui/AdWebSmallActivity;->a(Lcom/superbock/ui/AdWebSmallActivity;)V

    const/4 p1, 0x1

    return p1
.end method

.method public final openFileChooser(Lcom/tencent/smtt/sdk/ValueCallback;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/smtt/sdk/ValueCallback<",
            "Landroid/net/Uri;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object p2, p0, Li3/l;->a:Lcom/superbock/ui/AdWebSmallActivity;

    iput-object p1, p2, Lcom/superbock/ui/AdWebSmallActivity;->l:Lcom/tencent/smtt/sdk/ValueCallback;

    invoke-static {p2}, Lcom/superbock/ui/AdWebSmallActivity;->a(Lcom/superbock/ui/AdWebSmallActivity;)V

    return-void
.end method
