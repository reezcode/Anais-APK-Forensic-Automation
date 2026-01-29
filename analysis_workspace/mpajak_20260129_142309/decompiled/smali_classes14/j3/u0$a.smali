.class public final Lj3/u0$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj3/u0;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lj3/u0;


# direct methods
.method public constructor <init>(Lj3/u0;)V
    .locals 0

    iput-object p1, p0, Lj3/u0$a;->b:Lj3/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj3/u0$a;->b:Lj3/u0;

    iget-object v0, v0, Lj3/u0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finishAndRemoveTask()V

    iget-object v0, p0, Lj3/u0$a;->b:Lj3/u0;

    iget-object v0, v0, Lj3/u0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    iget-object v0, v0, Lcom/superbock/ui/custom/InputWordsMetaActivity;->b:Lcom/superbock/bean/AdInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    return-void
.end method
