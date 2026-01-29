.class public final Lj3/e2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsTpActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsTpActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/e2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lj3/e2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-virtual {p1}, Lcom/superbock/ui/custom/InputWordsTpActivity;->onBackPressed()V

    return-void
.end method
