.class public final Lcom/superbock/ui/AdWebSmallActivity$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/ui/AdWebSmallActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/superbock/ui/AdWebSmallActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdWebSmallActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/ui/AdWebSmallActivity$a;->b:Lcom/superbock/ui/AdWebSmallActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/superbock/ui/AdWebSmallActivity$a;->b:Lcom/superbock/ui/AdWebSmallActivity;

    iget-object p1, p1, Lcom/superbock/ui/AdWebSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getFeedBack()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/superbock/ui/AdWebSmallActivity$a;->b:Lcom/superbock/ui/AdWebSmallActivity;

    iget-object p1, p1, Lcom/superbock/ui/AdWebSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    :cond_0
    iget-object p1, p0, Lcom/superbock/ui/AdWebSmallActivity$a;->b:Lcom/superbock/ui/AdWebSmallActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
