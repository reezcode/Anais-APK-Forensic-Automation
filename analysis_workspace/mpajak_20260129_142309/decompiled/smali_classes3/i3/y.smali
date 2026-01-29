.class public final Li3/y;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/WebActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/WebActivity;)V
    .locals 0

    iput-object p1, p0, Li3/y;->b:Lcom/superbock/ui/WebActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Li3/y;->b:Lcom/superbock/ui/WebActivity;

    iget-object v0, v0, Lcom/superbock/ui/WebActivity;->i:Ljava/lang/String;

    const-string v1, "User-Agent"

    invoke-virtual {p1, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li3/y;->b:Lcom/superbock/ui/WebActivity;

    iget-object v1, v0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    iget-object v0, v0, Lcom/superbock/ui/WebActivity;->g:Ljava/lang/String;

    invoke-virtual {v1, v0, p1}, Lcom/tencent/smtt/sdk/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method
