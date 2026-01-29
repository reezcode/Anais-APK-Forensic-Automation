.class public final Lcom/superbock/ui/custom/InputWordsMetaActivity$b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/ui/custom/InputWordsMetaActivity;->onBackPressed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsMetaActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsMetaActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/ui/custom/InputWordsMetaActivity$b;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsMetaActivity$b;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    iget-object p1, p1, Lcom/superbock/ui/custom/InputWordsMetaActivity;->b:Lcom/superbock/bean/AdInfo;

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    iget-object p1, p0, Lcom/superbock/ui/custom/InputWordsMetaActivity$b;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finishAndRemoveTask()V

    return-void
.end method
