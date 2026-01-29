.class public final Lj3/d2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsTpActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsTpActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    iget-object v0, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    iget-object v0, v0, Lcom/superbock/ui/custom/InputWordsTpActivity;->g:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const-string v2, "dark"

    const/16 v3, 0x11

    const v4, 0x7f0c0015

    const/16 v5, 0x17

    const/4 v6, 0x0

    if-eqz v1, :cond_2

    invoke-static {v0}, Lk3/j;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "\\s+"

    const-string v7, " "

    invoke-virtual {v0, v1, v7}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    const v7, 0x7f0f00fd

    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v7, "vip.mytokenpocket"

    invoke-static {v0, v7, v1, p1}, Lk3/j;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    iget-object p1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object p1, p1, Lcom/superbock/ui/custom/InputWordsTpActivity;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p1

    invoke-virtual {v0, p1, v6}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    iget-object p1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    iget-object p1, p1, Lcom/superbock/ui/custom/InputWordsTpActivity;->g:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const v0, 0x7f0f0002

    if-lt p1, v5, :cond_1

    invoke-static {}, Lcom/blankj/utilcode/util/ToastUtils;->make()Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/blankj/utilcode/util/ToastUtils;->setLeftIcon(I)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    invoke-virtual {p1, v3, v6, v6}, Lcom/blankj/utilcode/util/ToastUtils;->setGravity(III)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->setMode(Ljava/lang/String;)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    iget-object v1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->show(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/CharSequence;)V

    :goto_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, Lj3/d2$a;

    invoke-direct {v0, p0}, Lj3/d2$a;-><init>(Lj3/d2;)V

    const-wide/16 v1, 0x3e8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_2
    :goto_1
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const v0, 0x7f0f0119

    if-lt p1, v5, :cond_3

    invoke-static {}, Lcom/blankj/utilcode/util/ToastUtils;->make()Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/blankj/utilcode/util/ToastUtils;->setLeftIcon(I)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    invoke-virtual {p1, v3, v6, v6}, Lcom/blankj/utilcode/util/ToastUtils;->setGravity(III)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->setMode(Ljava/lang/String;)Lcom/blankj/utilcode/util/ToastUtils;

    move-result-object p1

    iget-object v1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->show(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_3
    iget-object p1, p0, Lj3/d2;->b:Lcom/superbock/ui/custom/InputWordsTpActivity;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method
