.class public final Lj3/j;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsBinanceActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/j;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget-object p1, p0, Lj3/j;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    iget-object p2, p1, Lcom/superbock/ui/custom/InputWordsBinanceActivity;->g:Landroid/widget/EditText;

    new-instance v0, Lj3/h;

    invoke-direct {v0, p1}, Lj3/h;-><init>(Lcom/superbock/ui/custom/InputWordsBinanceActivity;)V

    const-wide/16 v1, 0x64

    invoke-virtual {p2, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method
