.class public Lcom/superbock/ui/AdConfirmActivity;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public b:Landroid/os/CountDownTimer;

.field public c:Lcom/superbock/bean/AdInfo;

.field public d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const v0, 0x7f01000d

    const v1, 0x7f01000e

    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method public final onBackPressed()V
    .locals 0

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    const-string v0, "openapp:"

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    packed-switch p1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lk3/a;->l(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getAiLinkDelayMillis()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lk3/e;->f(Landroid/content/Context;Lcom/superbock/bean/AdInfo;J)V

    :cond_2
    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x2

    goto :goto_1

    :pswitch_1
    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x3

    :goto_1
    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    invoke-virtual {p0}, Lcom/superbock/ui/AdConfirmActivity;->finish()V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f08006e
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x200

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    const p1, 0x7f0b0023

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "adInfo"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/AdInfo;

    iput-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/superbock/ui/AdConfirmActivity;->finish()V

    return-void

    :cond_0
    const p1, 0x7f080070

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    const/16 v0, 0x30

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    const/16 v0, 0x50

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setGravity(I)V

    :cond_2
    const p1, 0x7f080071

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const v0, 0x7f080072

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getAlign()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_3

    const/4 v1, 0x3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getAlign()I

    move-result v1

    if-ne v1, v2, :cond_4

    const/4 v1, 0x5

    :goto_1
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    :cond_4
    const/4 v1, 0x0

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getBgColor()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const-string v5, ","

    const-string v6, "\\d{1,3},\\d{1,3},\\d{1,3}"

    const/4 v7, 0x0

    if-nez v4, :cond_5

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getBgColor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getBgColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v4, v1, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aget-object v8, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v1, v2

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-static {v4, v8, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v4

    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_5
    const p1, 0x7f080078

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getTitleColor()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_6

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getTitleColor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getTitleColor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v8, v4, v7

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v4, v3

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    aget-object v4, v4, v2

    invoke-static {v4, v8, v9, p1}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_6
    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsgColor()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_7

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsgColor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsgColor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object v4, p1, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aget-object v8, p1, v3

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object p1, p1, v2

    invoke-static {p1, v4, v8, v0}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_7
    const p1, 0x7f08006e

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCancelColor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCancelColor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCancelColor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v4, v0, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aget-object v8, v0, v3

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v0, v0, v2

    invoke-static {v0, v4, v8, p1}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_8
    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCancelBgColor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCancelBgColor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCancelBgColor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v4, v0, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aget-object v8, v0, v3

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v4, v8, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    goto :goto_2

    :cond_9
    if-eqz v1, :cond_a

    aget-object v0, v1, v7

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    aget-object v4, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aget-object v8, v1, v2

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-static {v0, v4, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    :goto_2
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_a
    const v0, 0x7f08006f

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getConfirm()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getConfirmColor()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_b

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getConfirmColor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getConfirmColor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    aget-object v8, v4, v7

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v4, v3

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    aget-object v4, v4, v2

    invoke-static {v4, v8, v9, v0}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_b
    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getConfirmBgColor()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_c

    iget-object v4, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v4}, Lcom/superbock/bean/AdInfo;->getConfirmBgColor()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    iget-object v1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getConfirmBgColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v4, v1, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aget-object v5, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    aget-object v1, v1, v2

    goto :goto_3

    :cond_c
    if-eqz v1, :cond_d

    aget-object v4, v1, v7

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aget-object v5, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    aget-object v1, v1, v2

    :goto_3
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v4, v5, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_d
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result p1

    if-lez p1, :cond_e

    new-instance p1, Lcom/superbock/ui/AdConfirmActivity$a;

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v4, 0x3e8

    mul-long v0, v0, v4

    invoke-direct {p1, p0, v0, v1}, Lcom/superbock/ui/AdConfirmActivity$a;-><init>(Lcom/superbock/ui/AdConfirmActivity;J)V

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->b:Landroid/os/CountDownTimer;

    :cond_e
    iget-object p1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getBack()I

    move-result p1

    if-ne p1, v3, :cond_f

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v0, Lcom/superbock/ui/AdConfirmActivity$b;

    invoke-direct {v0, p0}, Lcom/superbock/ui/AdConfirmActivity$b;-><init>(Lcom/superbock/ui/AdConfirmActivity;)V

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_f
    return-void
.end method

.method public final onDestroy()V
    .locals 4

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->b:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    sput-boolean v1, Lcom/superbock/App;->c:Z

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v3, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v3, v2, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public final onPause()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    return-void
.end method

.method public final onStart()V
    .locals 5

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/superbock/App;->c:Z

    iget-wide v0, p0, Lcom/superbock/ui/AdConfirmActivity;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/superbock/ui/AdConfirmActivity;->d:J

    iget-object v2, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2, v0, v1}, Lcom/superbock/bean/AdInfo;->setStartTime(J)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    const-string v2, "39"

    invoke-static {v0, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v2, 0x4

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    sput-boolean v0, Lcom/superbock/App;->c:Z

    iget-object v2, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v2

    if-ne v2, v1, :cond_1

    const/4 v1, 0x0

    const-string v2, "40"

    invoke-static {v0, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v2, p0, Lcom/superbock/ui/AdConfirmActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v2, v1, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :cond_3
    :goto_0
    return-void
.end method
