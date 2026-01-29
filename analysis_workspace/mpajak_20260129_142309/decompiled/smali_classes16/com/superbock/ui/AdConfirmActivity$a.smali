.class public final Lcom/superbock/ui/AdConfirmActivity$a;
.super Landroid/os/CountDownTimer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/ui/AdConfirmActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/superbock/ui/AdConfirmActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdConfirmActivity;J)V
    .locals 2

    iput-object p1, p0, Lcom/superbock/ui/AdConfirmActivity$a;->a:Lcom/superbock/ui/AdConfirmActivity;

    const-wide/16 v0, 0x3e8

    invoke-direct {p0, p2, p3, v0, v1}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public final onFinish()V
    .locals 2

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity$a;->a:Lcom/superbock/ui/AdConfirmActivity;

    iget-object v0, v0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity$a;->a:Lcom/superbock/ui/AdConfirmActivity;

    invoke-virtual {v0}, Lcom/superbock/ui/AdConfirmActivity;->finish()V

    return-void
.end method

.method public final onTick(J)V
    .locals 0

    return-void
.end method
