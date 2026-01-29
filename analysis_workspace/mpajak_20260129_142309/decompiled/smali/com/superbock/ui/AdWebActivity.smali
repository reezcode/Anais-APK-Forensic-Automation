.class public Lcom/superbock/ui/AdWebActivity;
.super Landroidx/appcompat/app/AppCompatActivity;


# instance fields
.field public b:J

.field public c:Landroid/os/CountDownTimer;

.field public d:Lcom/superbock/bean/AdInfo;

.field public e:J

.field public f:Landroid/widget/TextView;

.field public g:Landroid/widget/ImageView;

.field public h:Landroid/widget/ProgressBar;

.field public i:Lcom/tencent/smtt/sdk/WebView;

.field public j:Z

.field public k:I

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:I

.field public o:Z

.field public p:Lcom/tencent/smtt/sdk/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/smtt/sdk/ValueCallback<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lcom/tencent/smtt/sdk/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/smtt/sdk/ValueCallback<",
            "[",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/superbock/ui/AdWebActivity;->j:Z

    return-void
.end method

.method public static c(Lcom/superbock/ui/AdWebActivity;)V
    .locals 2

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.category.OPENABLE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "Image Chooser"

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x2710

    const/4 v1, 0x0

    if-ne p1, v0, :cond_9

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->p:Lcom/tencent/smtt/sdk/ValueCallback;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->q:Lcom/tencent/smtt/sdk/ValueCallback;

    if-nez v2, :cond_0

    return-void

    :cond_0
    const/4 v2, -0x1

    if-eqz p3, :cond_2

    if-eq p2, v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v3

    goto :goto_1

    :cond_2
    :goto_0
    move-object v3, v1

    :goto_1
    iget-object v4, p0, Lcom/superbock/ui/AdWebActivity;->q:Lcom/tencent/smtt/sdk/ValueCallback;

    if-eqz v4, :cond_8

    if-ne p1, v0, :cond_b

    if-nez v4, :cond_3

    goto :goto_5

    :cond_3
    if-ne p2, v2, :cond_6

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/content/ClipData;->getItemCount()I

    move-result v0

    new-array v0, v0, [Landroid/net/Uri;

    const/4 v2, 0x0

    :goto_2
    invoke-virtual {p2}, Landroid/content/ClipData;->getItemCount()I

    move-result v3

    if-ge v2, v3, :cond_5

    invoke-virtual {p2, v2}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    move-object v0, v1

    :cond_5
    if-eqz p1, :cond_7

    const/4 p2, 0x1

    new-array v0, p2, [Landroid/net/Uri;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    aput-object p1, v0, p3

    goto :goto_3

    :cond_6
    move-object v0, v1

    :cond_7
    :goto_3
    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->q:Lcom/tencent/smtt/sdk/ValueCallback;

    invoke-interface {p1, v0}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/superbock/ui/AdWebActivity;->q:Lcom/tencent/smtt/sdk/ValueCallback;

    goto :goto_5

    :cond_8
    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->p:Lcom/tencent/smtt/sdk/ValueCallback;

    if-eqz p1, :cond_b

    invoke-interface {p1, v3}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->p:Lcom/tencent/smtt/sdk/ValueCallback;

    if-eqz p1, :cond_a

    invoke-interface {p1, v1}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :goto_4
    iput-object v1, p0, Lcom/superbock/ui/AdWebActivity;->p:Lcom/tencent/smtt/sdk/ValueCallback;

    goto :goto_5

    :cond_a
    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->q:Lcom/tencent/smtt/sdk/ValueCallback;

    if-eqz p1, :cond_b

    invoke-interface {p1, v1}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/superbock/ui/AdWebActivity;->q:Lcom/tencent/smtt/sdk/ValueCallback;

    :cond_b
    :goto_5
    return-void
.end method

.method public final onBackPressed()V
    .locals 2

    iget-boolean v0, p0, Lcom/superbock/ui/AdWebActivity;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/WebView;->goBack()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getFeedBack()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/superbock/bean/AdInfo;->setFeedBack(I)V

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 9

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b002b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "adInfo"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/AdInfo;

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getLink()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->l:Ljava/lang/String;

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getTopBar()I

    move-result p1

    iput p1, p0, Lcom/superbock/ui/AdWebActivity;->n:I

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getBack()I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/superbock/ui/AdWebActivity;->o:Z

    const-string p1, "WebCtrl/"

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->m:Ljava/lang/String;

    const p1, 0x7f080089

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->h:Landroid/widget/ProgressBar;

    const p1, 0x7f08008f

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/tencent/smtt/sdk/WebView;

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setLoadsImagesAutomatically(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    const/4 v2, -0x1

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebSettings;->setCacheMode(I)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setDomStorageEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setUseWideViewPort(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setLoadWithOverviewMode(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebSettings;->setBuiltInZoomControls(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    sget-object v2, Lcom/tencent/smtt/sdk/WebSettings$RenderPriority;->HIGH:Lcom/tencent/smtt/sdk/WebSettings$RenderPriority;

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebSettings;->setRenderPriority(Lcom/tencent/smtt/sdk/WebSettings$RenderPriority;)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setGeolocationEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setAllowFileAccess(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    const-wide v2, 0x7fffffffffffffffL

    invoke-virtual {p1, v2, v3}, Lcom/tencent/smtt/sdk/WebSettings;->setAppCacheMaxSize(J)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    sget-object v2, Lcom/tencent/smtt/sdk/WebSettings$PluginState;->ON_DEMAND:Lcom/tencent/smtt/sdk/WebSettings$PluginState;

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebSettings;->setPluginState(Lcom/tencent/smtt/sdk/WebSettings$PluginState;)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    sget-object v2, Lcom/tencent/smtt/sdk/WebSettings$LayoutAlgorithm;->NARROW_COLUMNS:Lcom/tencent/smtt/sdk/WebSettings$LayoutAlgorithm;

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebSettings;->setLayoutAlgorithm(Lcom/tencent/smtt/sdk/WebSettings$LayoutAlgorithm;)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setSupportZoom(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setDatabaseEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setSupportMultipleWindows(Z)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setAppCacheEnabled(Z)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->m:Ljava/lang/String;

    const-string v4, "User-Agent"

    invoke-virtual {p1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    iget-object v4, p0, Lcom/superbock/ui/AdWebActivity;->l:Ljava/lang/String;

    invoke-virtual {v2, v4, p1}, Lcom/tencent/smtt/sdk/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    new-instance v2, Li3/g;

    invoke-direct {v2, p0}, Li3/g;-><init>(Lcom/superbock/ui/AdWebActivity;)V

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebView;->setWebViewClient(Lcom/tencent/smtt/sdk/WebViewClient;)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    new-instance v2, Li3/h;

    invoke-direct {v2, p0}, Li3/h;-><init>(Lcom/superbock/ui/AdWebActivity;)V

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebView;->setWebChromeClient(Lcom/tencent/smtt/sdk/WebChromeClient;)V

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    new-instance v2, Li3/i;

    invoke-direct {v2, p0}, Li3/i;-><init>(Lcom/superbock/ui/AdWebActivity;)V

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebView;->setDownloadListener(Lcom/tencent/smtt/sdk/DownloadListener;)V

    const p1, 0x7f080084

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->f:Landroid/widget/TextView;

    const p1, 0x7f080085

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    new-instance v2, Li3/b;

    invoke-direct {v2, p0}, Li3/b;-><init>(Lcom/superbock/ui/AdWebActivity;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f080086

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->g:Landroid/widget/ImageView;

    new-instance v2, Li3/c;

    invoke-direct {v2, p0}, Li3/c;-><init>(Lcom/superbock/ui/AdWebActivity;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-boolean p1, p0, Lcom/superbock/ui/AdWebActivity;->o:Z

    const/16 v2, 0x8

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->g:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2
    iget p1, p0, Lcom/superbock/ui/AdWebActivity;->n:I

    const v4, 0x7f050014

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    const v5, 0x7f080087

    if-ne p1, v0, :cond_4

    invoke-virtual {p0, v5}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_2

    :cond_4
    if-ne p1, v3, :cond_5

    invoke-virtual {p0, v5}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x200

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    :cond_5
    :goto_2
    const p1, 0x7f080088

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    move-object v8, p1

    check-cast v8, Landroid/widget/ImageView;

    iget p1, p0, Lcom/superbock/ui/AdWebActivity;->n:I

    if-lez p1, :cond_7

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result p1

    if-lez p1, :cond_6

    const/4 v1, 0x4

    :cond_6
    invoke-virtual {v8, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    new-instance p1, Li3/d;

    invoke-direct {p1, p0}, Li3/d;-><init>(Lcom/superbock/ui/AdWebActivity;)V

    invoke-virtual {v8, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result p1

    const-wide/16 v0, 0x3e8

    if-lez p1, :cond_8

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getAutoClose()I

    move-result p1

    int-to-long v2, p1

    mul-long v6, v2, v0

    iput-wide v6, p0, Lcom/superbock/ui/AdWebActivity;->b:J

    new-instance p1, Li3/e;

    move-object v2, p1

    move-object v3, p0

    move-wide v4, v6

    invoke-direct/range {v2 .. v8}, Li3/e;-><init>(Lcom/superbock/ui/AdWebActivity;JJLandroid/widget/ImageView;)V

    goto :goto_3

    :cond_8
    iget p1, p0, Lcom/superbock/ui/AdWebActivity;->n:I

    if-lez p1, :cond_9

    iget-object p1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {p1}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result p1

    if-lez p1, :cond_9

    new-instance p1, Li3/f;

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getShowClose()I

    move-result v2

    int-to-long v2, v2

    mul-long v2, v2, v0

    invoke-direct {p1, v2, v3, v8}, Li3/f;-><init>(JLandroid/widget/ImageView;)V

    :goto_3
    invoke-virtual {p1}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/AdWebActivity;->c:Landroid/os/CountDownTimer;

    :cond_9
    return-void
.end method

.method public final onDestroy()V
    .locals 4

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->i:Lcom/tencent/smtt/sdk/WebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/WebView;->destroy()V

    :cond_0
    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->c:Landroid/os/CountDownTimer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/os/CountDownTimer;->cancel()V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    goto :goto_0

    :cond_2
    sput-boolean v1, Lcom/superbock/App;->c:Z

    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_4

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v3, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v3, v2, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public final onPause()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onPause()V

    return-void
.end method

.method public final onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    return-void
.end method

.method public final onStart()V
    .locals 5

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    sput-boolean v0, Lcom/superbock/App;->c:Z

    iget-wide v0, p0, Lcom/superbock/ui/AdWebActivity;->e:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/superbock/ui/AdWebActivity;->e:J

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2, v0, v1}, Lcom/superbock/bean/AdInfo;->setStartTime(J)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

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

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

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

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v2}, Lcom/superbock/bean/AdInfo;->getType()I

    move-result v2

    if-ne v2, v1, :cond_1

    const/4 v1, 0x0

    const-string v2, "40"

    invoke-static {v0, v2, v1}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0}, Lcom/superbock/bean/AdInfo;->getCustomId()I

    move-result v0

    if-lez v0, :cond_3

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v1, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lcom/superbock/App;->c(Lcom/superbock/bean/AdInfo;)V

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    iget-object v2, p0, Lcom/superbock/ui/AdWebActivity;->d:Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v2, v1, v1}, Lcom/superbock/App;->d(Lcom/superbock/bean/AdInfo;ZZ)V

    :cond_3
    :goto_0
    return-void
.end method
