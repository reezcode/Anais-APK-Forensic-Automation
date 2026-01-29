.class public final Li3/n;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/superbock/ui/AdWebSmallActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdWebSmallActivity;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Li3/n;->b:Lcom/superbock/ui/AdWebSmallActivity;

    iput p2, p0, Li3/n;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget v0, p0, Li3/n;->a:I

    rsub-int/lit8 v1, v0, 0x64

    iget-object v2, p0, Li3/n;->b:Lcom/superbock/ui/AdWebSmallActivity;

    iget-object v2, v2, Lcom/superbock/ui/AdWebSmallActivity;->f:Landroid/widget/ProgressBar;

    int-to-float v0, v0

    int-to-float v1, v1

    mul-float v1, v1, p1

    add-float/2addr v1, v0

    float-to-int p1, v1

    invoke-virtual {v2, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void
.end method
