.class public final Lj3/d4$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj3/d4;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lj3/d4;


# direct methods
.method public constructor <init>(Lj3/d4;)V
    .locals 0

    iput-object p1, p0, Lj3/d4$a;->b:Lj3/d4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj3/d4$a;->b:Lj3/d4;

    iget-object v0, v0, Lj3/d4;->b:Lcom/superbock/ui/custom/InputWordsTrustActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finishAndRemoveTask()V

    iget-object v0, p0, Lj3/d4$a;->b:Lj3/d4;

    iget-object v0, v0, Lj3/d4;->b:Lcom/superbock/ui/custom/InputWordsTrustActivity;

    iget-object v0, v0, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b:Lcom/superbock/bean/AdInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    return-void
.end method
