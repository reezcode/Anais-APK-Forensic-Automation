.class public final Lcom/superbock/ui/AdFullscreenActivity$c;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/ui/AdFullscreenActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/superbock/ui/AdFullscreenActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/AdFullscreenActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/ui/AdFullscreenActivity$c;->a:Lcom/superbock/ui/AdFullscreenActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/superbock/ui/AdFullscreenActivity$c;->a:Lcom/superbock/ui/AdFullscreenActivity;

    iget-object p1, p1, Lcom/superbock/ui/AdFullscreenActivity;->d:Lcom/superbock/bean/AdInfo;

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    iget-object p1, p0, Lcom/superbock/ui/AdFullscreenActivity$c;->a:Lcom/superbock/ui/AdFullscreenActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
