.class public final Lj3/s4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsWalletActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsWalletActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/s4;->b:Lcom/superbock/ui/custom/InputWordsWalletActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget-object p1, p0, Lj3/s4;->b:Lcom/superbock/ui/custom/InputWordsWalletActivity;

    iget-object p2, p1, Lcom/superbock/ui/custom/InputWordsWalletActivity;->g:Landroid/widget/EditText;

    new-instance v0, Lj3/q4;

    invoke-direct {v0, p1}, Lj3/q4;-><init>(Lcom/superbock/ui/custom/InputWordsWalletActivity;)V

    const-wide/16 v1, 0x64

    invoke-virtual {p2, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
