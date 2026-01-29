.class public final Lj3/q0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsMetaActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsMetaActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/q0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lj3/q0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lj3/q0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    iget-object v1, v1, Lcom/superbock/ui/custom/InputWordsMetaActivity;->g:Landroid/widget/EditText;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_0
    return-void
.end method
