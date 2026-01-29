.class public Lcom/superbock/ui/WebActivity;
.super Landroidx/appcompat/app/AppCompatActivity;


# instance fields
.field public b:Landroid/widget/TextView;

.field public c:Landroid/widget/ProgressBar;

.field public d:Lcom/tencent/smtt/sdk/WebView;

.field public e:Z

.field public f:I

.field public g:Ljava/lang/String;

.field public h:I

.field public i:Ljava/lang/String;

.field public j:Lcom/tencent/smtt/sdk/ValueCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/tencent/smtt/sdk/ValueCallback<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public k:Lcom/tencent/smtt/sdk/ValueCallback;
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

    iput-boolean v0, p0, Lcom/superbock/ui/WebActivity;->e:Z

    return-void
.end method

.method public static c(Lcom/superbock/ui/WebActivity;)V
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

    iget-object v2, p0, Lcom/superbock/ui/WebActivity;->j:Lcom/tencent/smtt/sdk/ValueCallback;

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/superbock/ui/WebActivity;->k:Lcom/tencent/smtt/sdk/ValueCallback;

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
    iget-object v4, p0, Lcom/superbock/ui/WebActivity;->k:Lcom/tencent/smtt/sdk/ValueCallback;

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
    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->k:Lcom/tencent/smtt/sdk/ValueCallback;

    invoke-interface {p1, v0}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/superbock/ui/WebActivity;->k:Lcom/tencent/smtt/sdk/ValueCallback;

    goto :goto_5

    :cond_8
    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->j:Lcom/tencent/smtt/sdk/ValueCallback;

    if-eqz p1, :cond_b

    invoke-interface {p1, v3}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    goto :goto_4

    :cond_9
    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->j:Lcom/tencent/smtt/sdk/ValueCallback;

    if-eqz p1, :cond_a

    invoke-interface {p1, v1}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    :goto_4
    iput-object v1, p0, Lcom/superbock/ui/WebActivity;->j:Lcom/tencent/smtt/sdk/ValueCallback;

    goto :goto_5

    :cond_a
    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->k:Lcom/tencent/smtt/sdk/ValueCallback;

    if-eqz p1, :cond_b

    invoke-interface {p1, v1}, Lcom/tencent/smtt/sdk/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/superbock/ui/WebActivity;->k:Lcom/tencent/smtt/sdk/ValueCallback;

    :cond_b
    :goto_5
    return-void
.end method

.method public final onBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/WebView;->canGoBack()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {v0}, Lcom/tencent/smtt/sdk/WebView;->goBack()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    const p1, 0x7f0b001e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "webSite"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/WebActivity;->g:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "topbar"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/superbock/ui/WebActivity;->h:I

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "WebCtrl/"

    invoke-static {v0, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/superbock/ui/WebActivity;->i:Ljava/lang/String;

    iget-object v0, p0, Lcom/superbock/ui/WebActivity;->g:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/superbock/ui/WebActivity;->g:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/superbock/ui/WebActivity;->g:Ljava/lang/String;

    const-string v3, "?"

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "&deviceId="

    goto :goto_0

    :cond_1
    const-string v2, "?deviceId="

    :goto_0
    invoke-static {v0, v2, p1}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/superbock/ui/WebActivity;->g:Ljava/lang/String;

    const p1, 0x7f08024a

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/superbock/ui/WebActivity;->c:Landroid/widget/ProgressBar;

    const p1, 0x7f08024b

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/tencent/smtt/sdk/WebView;

    iput-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setLoadsImagesAutomatically(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setJavaScriptEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    const/4 v2, -0x1

    invoke-virtual {p1, v2}, Lcom/tencent/smtt/sdk/WebSettings;->setCacheMode(I)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setDomStorageEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setUseWideViewPort(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setLoadWithOverviewMode(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebSettings;->setBuiltInZoomControls(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    sget-object v1, Lcom/tencent/smtt/sdk/WebSettings$RenderPriority;->HIGH:Lcom/tencent/smtt/sdk/WebSettings$RenderPriority;

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebSettings;->setRenderPriority(Lcom/tencent/smtt/sdk/WebSettings$RenderPriority;)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setGeolocationEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setAllowFileAccess(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    const-wide v1, 0x7fffffffffffffffL

    invoke-virtual {p1, v1, v2}, Lcom/tencent/smtt/sdk/WebSettings;->setAppCacheMaxSize(J)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    sget-object v1, Lcom/tencent/smtt/sdk/WebSettings$PluginState;->ON_DEMAND:Lcom/tencent/smtt/sdk/WebSettings$PluginState;

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebSettings;->setPluginState(Lcom/tencent/smtt/sdk/WebSettings$PluginState;)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-virtual {p1, v2, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    sget-object v1, Lcom/tencent/smtt/sdk/WebSettings$LayoutAlgorithm;->NARROW_COLUMNS:Lcom/tencent/smtt/sdk/WebSettings$LayoutAlgorithm;

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebSettings;->setLayoutAlgorithm(Lcom/tencent/smtt/sdk/WebSettings$LayoutAlgorithm;)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setSupportZoom(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setDatabaseEnabled(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setSupportMultipleWindows(Z)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    invoke-virtual {p1}, Lcom/tencent/smtt/sdk/WebView;->getSettings()Lcom/tencent/smtt/sdk/WebSettings;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/smtt/sdk/WebSettings;->setAppCacheEnabled(Z)V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/superbock/ui/WebActivity;->i:Ljava/lang/String;

    const-string v3, "User-Agent"

    invoke-virtual {p1, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    iget-object v3, p0, Lcom/superbock/ui/WebActivity;->g:Ljava/lang/String;

    invoke-virtual {v1, v3, p1}, Lcom/tencent/smtt/sdk/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    new-instance v1, Li3/z;

    invoke-direct {v1, p0}, Li3/z;-><init>(Lcom/superbock/ui/WebActivity;)V

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebView;->setWebViewClient(Lcom/tencent/smtt/sdk/WebViewClient;)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    new-instance v1, Li3/a0;

    invoke-direct {v1, p0}, Li3/a0;-><init>(Lcom/superbock/ui/WebActivity;)V

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebView;->setWebChromeClient(Lcom/tencent/smtt/sdk/WebChromeClient;)V

    iget-object p1, p0, Lcom/superbock/ui/WebActivity;->d:Lcom/tencent/smtt/sdk/WebView;

    new-instance v1, Li3/b0;

    invoke-direct {v1, p0}, Li3/b0;-><init>(Lcom/superbock/ui/WebActivity;)V

    invoke-virtual {p1, v1}, Lcom/tencent/smtt/sdk/WebView;->setDownloadListener(Lcom/tencent/smtt/sdk/DownloadListener;)V

    const p1, 0x7f080246

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/superbock/ui/WebActivity;->b:Landroid/widget/TextView;

    const p1, 0x7f080247

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    new-instance v1, Li3/x;

    invoke-direct {v1, p0}, Li3/x;-><init>(Lcom/superbock/ui/WebActivity;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f080248

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    new-instance v1, Li3/y;

    invoke-direct {v1, p0}, Li3/y;-><init>(Lcom/superbock/ui/WebActivity;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget p1, p0, Lcom/superbock/ui/WebActivity;->h:I

    const v1, 0x7f050014

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v3, 0x8

    const v4, 0x7f080249

    if-ne p1, v0, :cond_3

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    goto :goto_2

    :cond_3
    if-ne p1, v2, :cond_4

    invoke-virtual {p0, v4}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    const/16 v0, 0x200

    invoke-virtual {p1, v0, v0}, Landroid/view/Window;->setFlags(II)V

    :cond_4
    :goto_2
    return-void
.end method

.method public final onDestroy()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method public final onStop()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    return-void
.end method
