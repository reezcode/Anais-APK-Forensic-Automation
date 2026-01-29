.class public Lcom/superbock/ui/AdAlertBottomActivity;
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
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const-string v0, ""

    const-string v1, "android.intent.action.VIEW"

    const-string v2, "openapp:"

    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lk3/a;->l(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getOtherLink()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiOtherLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiOtherLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getAiOtherLinkDelayMillis()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lk3/e;->f(Landroid/content/Context;Lcom/superbock/bean/AdInfo;J)V

    :cond_2
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x4

    goto :goto_2

    :sswitch_1
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    :try_start_1
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lk3/a;->l(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setUrl(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getAiLinkDelayMillis()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lk3/e;->f(Landroid/content/Context;Lcom/superbock/bean/AdInfo;J)V

    :cond_5
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x2

    goto :goto_2

    :sswitch_2
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x3

    :goto_2
    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    invoke-virtual {p0}, Lcom/superbock/ui/AdAlertBottomActivity;->finish()V

    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f080046 -> :sswitch_2
        0x7f080047 -> :sswitch_1
        0x7f08004c -> :sswitch_0
    .end sparse-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 11

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b0020

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "adInfo"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/AdInfo;

    iput-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/superbock/ui/AdAlertBottomActivity;->finish()V

    return-void

    :cond_0
    const p1, 0x7f080049

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    const v0, 0x7f08004a

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v1, 0x7f08004b

    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getAlign()I

    move-result v2

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_1

    const/4 v2, 0x3

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v5, 0x13

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getAlign()I

    move-result v2

    if-ne v2, v3, :cond_2

    const/4 v2, 0x5

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v5, 0x15

    :goto_0
    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V

    :cond_2
    const/4 v0, 0x0

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v5, ","

    const-string v6, "\\d{1,3},\\d{1,3},\\d{1,3}"

    const/4 v7, 0x0

    if-nez v2, :cond_3

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getBgColor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v2, v0, v7

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    aget-object v8, v0, v4

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v0, v3

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-static {v2, v8, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_3
    const p1, 0x7f08004d

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTitleColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTitleColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getTitleColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v8, v2, v7

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v2, v4

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    aget-object v2, v2, v3

    invoke-static {v2, v8, v9, p1}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_4
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsgColor()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsgColor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getMsgColor()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object v2, p1, v7

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    aget-object v8, p1, v4

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object p1, p1, v3

    invoke-static {p1, v2, v8, v1}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_5
    const p1, 0x7f080046

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancelColor()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancelColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancelColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v2, v1, v7

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    aget-object v8, v1, v4

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v1, v1, v3

    invoke-static {v1, v2, v8, p1}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_6
    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancelBgColor()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancelBgColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getCancelBgColor()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v2, v1, v7

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    aget-object v8, v1, v4

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v1, v1, v3

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v2, v8, v1}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    goto :goto_1

    :cond_7
    if-eqz v0, :cond_8

    aget-object v1, v0, v7

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    aget-object v2, v0, v4

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    aget-object v8, v0, v3

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    invoke-static {v1, v2, v8}, Landroid/graphics/Color;->rgb(III)I

    move-result v1

    :goto_1
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_8
    const v1, 0x7f080047

    invoke-virtual {p0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_b

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirmColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirmColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirmColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v8, v2, v7

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v2, v4

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    aget-object v2, v2, v3

    invoke-static {v2, v8, v9, v1}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_9
    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirmBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_a

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirmBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getConfirmBgColor()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v8, v2, v7

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v2, v4

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v8, v9, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    goto :goto_2

    :cond_a
    if-eqz v0, :cond_b

    aget-object v2, v0, v7

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    aget-object v8, v0, v4

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    aget-object v9, v0, v3

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    invoke-static {v2, v8, v9}, Landroid/graphics/Color;->rgb(III)I

    move-result v2

    :goto_2
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_b
    const v2, 0x7f08004c

    invoke-virtual {p0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v8, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/AdInfo;->getOther()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_e

    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v8, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/AdInfo;->getOther()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v8, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/AdInfo;->getOtherColor()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_c

    iget-object v8, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/AdInfo;->getOtherColor()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_c

    iget-object v8, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/AdInfo;->getOtherColor()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8

    aget-object v9, v8, v7

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    aget-object v10, v8, v4

    invoke-static {v10}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10

    aget-object v8, v8, v3

    invoke-static {v8, v9, v10, v2}, Landroidx/appcompat/widget/a;->m(Ljava/lang/String;IILandroid/widget/TextView;)V

    :cond_c
    iget-object v8, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/AdInfo;->getOtherBgColor()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_d

    iget-object v8, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v8}, Lcom/superbock/bean/AdInfo;->getOtherBgColor()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_d

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getOtherBgColor()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v5, v0, v7

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    aget-object v6, v0, v4

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    aget-object v0, v0, v3

    goto :goto_3

    :cond_d
    if-eqz v0, :cond_e

    aget-object v5, v0, v7

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    aget-object v6, v0, v4

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    aget-object v0, v0, v3

    :goto_3
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v5, v6, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    :cond_e
    const v0, 0x7f080048

    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v3}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v5}, Lcom/superbock/bean/AdInfo;->getTopBar()I

    move-result v5

    const-string v6, "\\d+"

    const-string v7, "/"

    if-ne v5, v4, :cond_11

    invoke-virtual {v3, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    const/16 v7, 0xa

    if-eqz v5, :cond_f

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v5

    invoke-virtual {v5, p0}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object v5

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/i;->l(Ljava/io/File;)Lcom/bumptech/glide/h;

    move-result-object v3

    sget-object v5, Lr/l;->c:Lr/l$c;

    invoke-virtual {v3, v5}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/h;

    new-instance v5, Ly/y;

    invoke-direct {v5, v7}, Ly/y;-><init>(I)V

    goto :goto_4

    :cond_f
    invoke-virtual {v3, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v5

    invoke-virtual {v5, p0}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/bumptech/glide/i;->m(Ljava/lang/Integer;)Lcom/bumptech/glide/h;

    move-result-object v3

    sget-object v5, Lr/l;->c:Lr/l$c;

    invoke-virtual {v3, v5}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/h;

    new-instance v5, Ly/y;

    invoke-direct {v5, v7}, Ly/y;-><init>(I)V

    goto :goto_4

    :cond_10
    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v5

    invoke-virtual {v5, p0}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/bumptech/glide/i;->n(Ljava/lang/String;)Lcom/bumptech/glide/h;

    move-result-object v3

    sget-object v5, Lr/l;->c:Lr/l$c;

    invoke-virtual {v3, v5}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/h;

    new-instance v5, Ly/y;

    invoke-direct {v5, v7}, Ly/y;-><init>(I)V

    :goto_4
    invoke-virtual {v3, v5, v4}, Lh0/a;->n(Lp/l;Z)Lh0/a;

    move-result-object v3

    goto :goto_6

    :cond_11
    invoke-virtual {v3, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v5

    invoke-virtual {v5, p0}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object v5

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v6}, Lcom/bumptech/glide/i;->l(Ljava/io/File;)Lcom/bumptech/glide/h;

    move-result-object v3

    goto :goto_5

    :cond_12
    invoke-virtual {v3, v6}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v5

    invoke-virtual {v5, p0}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v5, v3}, Lcom/bumptech/glide/i;->m(Ljava/lang/Integer;)Lcom/bumptech/glide/h;

    move-result-object v3

    goto :goto_5

    :cond_13
    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v5

    invoke-virtual {v5, p0}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/bumptech/glide/i;->n(Ljava/lang/String;)Lcom/bumptech/glide/h;

    move-result-object v3

    :goto_5
    sget-object v5, Lr/l;->c:Lr/l$c;

    invoke-virtual {v3, v5}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v3

    :goto_6
    check-cast v3, Lcom/bumptech/glide/h;

    invoke-virtual {v3, v0}, Lcom/bumptech/glide/h;->v(Landroid/widget/ImageView;)Li0/i;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result p1

    if-lez p1, :cond_14

    new-instance p1, Lcom/superbock/ui/AdAlertBottomActivity$a;

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x3e8

    mul-long v0, v0, v2

    invoke-direct {p1, p0, v0, v1}, Lcom/superbock/ui/AdAlertBottomActivity$a;-><init>(Lcom/superbock/ui/AdAlertBottomActivity;J)V

    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->b:Landroid/os/CountDownTimer;

    :cond_14
    iget-object p1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getBack()I

    move-result p1

    if-ne p1, v4, :cond_15

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v0, Lcom/superbock/ui/AdAlertBottomActivity$b;

    invoke-direct {v0, p0}, Lcom/superbock/ui/AdAlertBottomActivity$b;-><init>(Lcom/superbock/ui/AdAlertBottomActivity;)V

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_15
    return-void
.end method

.method public final onDestroy()V
    .locals 4

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->b:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

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

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v3, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

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

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/superbock/App;->c:Z

    iget-wide v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->d:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->d:J

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2, v0, v1}, Lcom/superbock/bean/AdInfo;->setStartTime(J)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

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

    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

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

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v2

    if-ne v2, v1, :cond_1

    const/4 v1, 0x0

    const-string v2, "40"

    invoke-static {v0, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v2, p0, Lcom/superbock/ui/AdAlertBottomActivity;->c:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v2, v1, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :cond_3
    :goto_0
    return-void
.end method
