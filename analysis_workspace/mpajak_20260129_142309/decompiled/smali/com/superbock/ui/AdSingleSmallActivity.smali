.class public Lcom/superbock/ui/AdSingleSmallActivity;
.super Landroid/app/Activity;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public b:J

.field public c:Landroid/os/CountDownTimer;

.field public d:Lcom/superbock/bean/AdInfo;

.field public e:J


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
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

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

    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

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
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAiLink()Lcom/superbock/bean/AdInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getAiLinkDelayMillis()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lk3/e;->f(Landroid/content/Context;Lcom/superbock/bean/AdInfo;J)V

    :cond_2
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x1

    goto :goto_1

    :pswitch_1
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    const/4 v0, 0x3

    :goto_1
    invoke-virtual {p1, v0}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    invoke-virtual {p0}, Lcom/superbock/ui/AdSingleSmallActivity;->finish()V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f080081
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 7

    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x200

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "adInfo"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/AdInfo;

    iput-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lcom/superbock/ui/AdSingleSmallActivity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTopBar()I

    move-result p1

    if-nez p1, :cond_1

    const p1, 0x7f0b0029

    goto :goto_0

    :cond_1
    const p1, 0x7f0b002a

    :goto_0
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setContentView(I)V

    const p1, 0x7f080083

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RelativeLayout;

    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_2

    const/16 v0, 0x33

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_3

    const/16 v0, 0x31

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_4

    const/16 v0, 0x35

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0x15

    if-ne v0, v1, :cond_5

    const/16 v0, 0x13

    goto :goto_1

    :cond_5
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v2, 0x17

    if-ne v0, v2, :cond_6

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setGravity(I)V

    goto :goto_2

    :cond_6
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0x1f

    if-ne v0, v1, :cond_7

    const/16 v0, 0x53

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_8

    const/16 v0, 0x51

    goto :goto_1

    :cond_8
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getGravity()I

    move-result v0

    const/16 v1, 0x21

    if-ne v0, v1, :cond_9

    const/16 v0, 0x55

    goto :goto_1

    :cond_9
    const/16 v0, 0x11

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setGravity(I)V

    :goto_2
    const p1, 0x7f080082

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    invoke-static {p0}, Lk3/h;->b(Landroid/content/Context;)I

    move-result v0

    iget-object v1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getWidth()I

    move-result v1

    mul-int v1, v1, v0

    div-int/lit8 v1, v1, 0x64

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setMaxWidth(I)V

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object v0

    iget-object v1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v1}, Lcom/superbock/bean/AdInfo;->getImg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/i;->n(Ljava/lang/String;)Lcom/bumptech/glide/h;

    move-result-object v0

    sget-object v1, Lr/l;->c:Lr/l$c;

    invoke-virtual {v0, v1}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/h;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->v(Landroid/widget/ImageView;)Li0/i;

    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f080081

    invoke-virtual {p0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Landroid/widget/ImageView;

    invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result p1

    if-gez p1, :cond_a

    const/16 p1, 0x8

    goto :goto_3

    :cond_a
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result p1

    if-lez p1, :cond_b

    const/4 p1, 0x4

    :goto_3
    invoke-virtual {v6, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_b
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result p1

    const-wide/16 v0, 0x3e8

    if-lez p1, :cond_c

    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result p1

    int-to-long v2, p1

    mul-long v4, v2, v0

    iput-wide v4, p0, Lcom/superbock/ui/AdSingleSmallActivity;->b:J

    new-instance p1, Lcom/superbock/ui/AdSingleSmallActivity$a;

    move-object v0, p1

    move-object v1, p0

    move-wide v2, v4

    invoke-direct/range {v0 .. v6}, Lcom/superbock/ui/AdSingleSmallActivity$a;-><init>(Lcom/superbock/ui/AdSingleSmallActivity;JJLandroid/widget/ImageView;)V

    :goto_4
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    move-result-object p1

    goto :goto_5

    :cond_c
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result p1

    if-lez p1, :cond_d

    new-instance p1, Lcom/superbock/ui/AdSingleSmallActivity$b;

    iget-object v2, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result v2

    int-to-long v2, v2

    mul-long v2, v2, v0

    invoke-direct {p1, v2, v3, v6}, Lcom/superbock/ui/AdSingleSmallActivity$b;-><init>(JLandroid/widget/ImageView;)V

    goto :goto_4

    :goto_5
    iput-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->c:Landroid/os/CountDownTimer;

    :cond_d
    iget-object p1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getBack()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_e

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "android.intent.action.SCREEN_OFF"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    new-instance v0, Lcom/superbock/ui/AdSingleSmallActivity$c;

    invoke-direct {v0, p0}, Lcom/superbock/ui/AdSingleSmallActivity$c;-><init>(Lcom/superbock/ui/AdSingleSmallActivity;)V

    invoke-virtual {p0, v0, p1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_e
    return-void
.end method

.method public final onDestroy()V
    .locals 4

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->c:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_0
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

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

    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v3, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

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

    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/superbock/App;->c:Z

    iget-wide v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->e:J

    iget-object v2, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2, v0, v1}, Lcom/superbock/bean/AdInfo;->setStartTime(J)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

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

    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

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

    iget-object v2, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v2

    if-ne v2, v1, :cond_1

    const/4 v1, 0x0

    const-string v2, "40"

    invoke-static {v0, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v2, p0, Lcom/superbock/ui/AdSingleSmallActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v2, v1, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :cond_3
    :goto_0
    return-void
.end method
