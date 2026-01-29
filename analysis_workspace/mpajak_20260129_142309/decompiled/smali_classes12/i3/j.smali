.class public final Li3/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/superbock/ui/AdWebActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdWebActivity;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Li3/j;->b:Lcom/superbock/ui/AdWebActivity;

    iput p2, p0, Li3/j;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget v0, p0, Li3/j;->a:I

    rsub-int/lit8 v1, v0, 0x64

    iget-object v2, p0, Li3/j;->b:Lcom/superbock/ui/AdWebActivity;

    iget-object v2, v2, Lcom/superbock/ui/AdWebActivity;->h:Landroid/widget/ProgressBar;

    int-to-float v0, v0

    int-to-float v1, v1

    mul-float v1, v1, p1

    add-float/2addr v1, v0

    float-to-int p1, v1

    invoke-virtual {v2, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void
.end method
