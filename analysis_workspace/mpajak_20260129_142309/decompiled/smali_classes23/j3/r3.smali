.class public final Lj3/r3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsTrustActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsTrustActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/r3;->b:Lcom/superbock/ui/custom/InputWordsTrustActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lj3/r3;->b:Lcom/superbock/ui/custom/InputWordsTrustActivity;

    iget-object v0, p1, Lcom/superbock/ui/custom/InputWordsTrustActivity;->o:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/superbock/ui/custom/InputWordsTrustActivity;->b(Lcom/superbock/ui/custom/InputWordsTrustActivity;Ljava/lang/String;)V

    return-void
.end method
