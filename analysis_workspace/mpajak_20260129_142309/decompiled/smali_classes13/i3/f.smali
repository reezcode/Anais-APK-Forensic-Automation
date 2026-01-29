.class public final Li3/f;
.super Landroid/os/CountDownTimer;


# instance fields
.field public final synthetic a:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(JLandroid/widget/ImageView;)V
    .locals 2

    iput-object p3, p0, Li3/f;->a:Landroid/widget/ImageView;

    const-wide/16 v0, 0x3e8

    invoke-direct {p0, p1, p2, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 2

    iget-object v0, p0, Li3/f;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final onTick(J)V
    .locals 0

    return-void
.end method
