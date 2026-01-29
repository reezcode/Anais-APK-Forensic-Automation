.class public final Li3/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/AdWebActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdWebActivity;)V
    .locals 0

    iput-object p1, p0, Li3/b;->b:Lcom/superbock/ui/AdWebActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Li3/b;->b:Lcom/superbock/ui/AdWebActivity;

    iget-boolean v0, p1, Lcom/superbock/ui/AdWebActivity;->o:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Li3/b;->b:Lcom/superbock/ui/AdWebActivity;

    iget-object p1, p1, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->goBack()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li3/b;->b:Lcom/superbock/ui/AdWebActivity;

    iget-object p1, p1, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getFeedBack()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Li3/b;->b:Lcom/superbock/ui/AdWebActivity;

    iget-object p1, p1, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    :cond_1
    iget-object p1, p0, Li3/b;->b:Lcom/superbock/ui/AdWebActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method
