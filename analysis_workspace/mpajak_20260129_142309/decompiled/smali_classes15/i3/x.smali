.class public final Li3/x;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/WebActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/WebActivity;)V
    .locals 0

    iput-object p1, p0, Li3/x;->b:Lcom/superbock/ui/WebActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Li3/x;->b:Lcom/superbock/ui/WebActivity;

    iget-object p1, p1, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->canGoBack()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Li3/x;->b:Lcom/superbock/ui/WebActivity;

    iget-object p1, p1, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->goBack()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li3/x;->b:Lcom/superbock/ui/WebActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method
