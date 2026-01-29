.class public final Lcom/superbock/ui/AdConfirmBottomActivity$a;
.super Landroid/os/CountDownTimer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/ui/AdConfirmBottomActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/superbock/ui/AdConfirmBottomActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdConfirmBottomActivity;J)V
    .locals 2

    iput-object p1, p0, Lcom/superbock/ui/AdConfirmBottomActivity$a;->a:Lcom/superbock/ui/AdConfirmBottomActivity;

    const-wide/16 v0, 0x3e8

    invoke-direct {p0, p2, p3, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmBottomActivity$a;->a:Lcom/superbock/ui/AdConfirmBottomActivity;

    iget-object v0, v0, Lcom/superbock/ui/AdConfirmBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmBottomActivity$a;->a:Lcom/superbock/ui/AdConfirmBottomActivity;

    invoke-virtual {v0}, Lcom/superbock/ui/AdConfirmBottomActivity;->finish()V

    return-void
.end method

.method public final onTick(J)V
    .locals 0

    return-void
.end method
