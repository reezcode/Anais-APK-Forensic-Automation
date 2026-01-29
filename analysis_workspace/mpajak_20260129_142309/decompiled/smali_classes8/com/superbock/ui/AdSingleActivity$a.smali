.class public final Lcom/superbock/ui/AdSingleActivity$a;
.super Landroid/os/CountDownTimer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/ui/AdSingleActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Landroid/widget/ImageView;

.field public final synthetic c:Lcom/superbock/ui/AdSingleActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdSingleActivity;JJLandroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/ui/AdSingleActivity$a;->c:Lcom/superbock/ui/AdSingleActivity;

    iput-wide p4, p0, Lcom/superbock/ui/AdSingleActivity$a;->a:J

    iput-object p6, p0, Lcom/superbock/ui/AdSingleActivity$a;->b:Landroid/widget/ImageView;

    const-wide/16 p4, 0x3e8

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/superbock/ui/AdSingleActivity$a;->c:Lcom/superbock/ui/AdSingleActivity;

    iget-object v0, v0, Lcom/superbock/ui/AdSingleActivity;->d:Lcom/superbock/bean/AdInfo;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    iget-object v0, p0, Lcom/superbock/ui/AdSingleActivity$a;->c:Lcom/superbock/ui/AdSingleActivity;

    invoke-virtual {v0}, Lcom/superbock/ui/AdSingleActivity;->finish()V

    return-void
.end method

.method public final onTick(J)V
    .locals 6

    iget-object p1, p0, Lcom/superbock/ui/AdSingleActivity$a;->c:Lcom/superbock/ui/AdSingleActivity;

    iget-wide v0, p1, Lcom/superbock/ui/AdSingleActivity;->b:J

    const-wide/16 v2, 0x3e8

    sub-long/2addr v0, v2

    iput-wide v0, p1, Lcom/superbock/ui/AdSingleActivity;->b:J

    iget-object p1, p1, Lcom/superbock/ui/AdSingleActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/superbock/ui/AdSingleActivity$a;->c:Lcom/superbock/ui/AdSingleActivity;

    iget-wide v0, p1, Lcom/superbock/ui/AdSingleActivity;->b:J

    iget-wide v4, p0, Lcom/superbock/ui/AdSingleActivity$a;->a:J

    iget-object p1, p1, Lcom/superbock/ui/AdSingleActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result p1

    int-to-long p1, p1

    mul-long p1, p1, v2

    sub-long/2addr v4, p1

    cmp-long p1, v0, v4

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/superbock/ui/AdSingleActivity$a;->b:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    return-void
.end method
