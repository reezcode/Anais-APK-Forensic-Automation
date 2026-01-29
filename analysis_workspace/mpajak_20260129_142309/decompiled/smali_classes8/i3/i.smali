.class public final Li3/i;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/smtt/sdk/DownloadListener;


# instance fields
.field public final synthetic a:Lcom/superbock/ui/AdWebActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdWebActivity;)V
    .locals 0

    iput-object p1, p0, Li3/i;->a:Lcom/superbock/ui/AdWebActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    :try_start_0
    new-instance p2, Landroid/content/Intent;

    const-string p3, "android.intent.action.VIEW"

    invoke-direct {p2, p3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object p1, p0, Li3/i;->a:Lcom/superbock/ui/AdWebActivity;

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
