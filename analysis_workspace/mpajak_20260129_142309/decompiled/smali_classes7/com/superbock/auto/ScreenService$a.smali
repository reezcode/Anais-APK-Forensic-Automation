.class public final Lcom/superbock/auto/ScreenService$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/auto/ScreenService;->onStartCommand(Landroid/content/Intent;II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Landroid/content/Intent;

.field public final synthetic d:Lcom/superbock/auto/ScreenService;


# direct methods
.method public constructor <init>(Lcom/superbock/auto/ScreenService;ILandroid/content/Intent;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/superbock/auto/ScreenService$a;->d:Lcom/superbock/auto/ScreenService;

    iput p2, p0, Lcom/superbock/auto/ScreenService$a;->b:I

    iput-object p3, p0, Lcom/superbock/auto/ScreenService$a;->c:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/superbock/auto/ScreenService$a;->d:Lcom/superbock/auto/ScreenService;

    iget-object v0, v0, Lcom/superbock/auto/ScreenService;->f:Landroid/media/projection/MediaProjectionManager;

    iget v1, p0, Lcom/superbock/auto/ScreenService$a;->b:I

    iget-object v2, p0, Lcom/superbock/auto/ScreenService$a;->c:Landroid/content/Intent;

    invoke-virtual {v0, v1, v2}, Landroid/media/projection/MediaProjectionManager;->getMediaProjection(ILandroid/content/Intent;)Landroid/media/projection/MediaProjection;

    move-result-object v0

    sput-object v0, Lcom/superbock/auto/ScreenService;->i:Landroid/media/projection/MediaProjection;

    iget-object v0, p0, Lcom/superbock/auto/ScreenService$a;->d:Lcom/superbock/auto/ScreenService;

    iget v1, v0, Lcom/superbock/auto/ScreenService;->b:I

    iget v2, v0, Lcom/superbock/auto/ScreenService;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x3

    invoke-static {v1, v2, v3, v4}, Landroid/media/ImageReader;->newInstance(IIII)Landroid/media/ImageReader;

    move-result-object v1

    iput-object v1, v0, Lcom/superbock/auto/ScreenService;->h:Landroid/media/ImageReader;

    iget-object v0, p0, Lcom/superbock/auto/ScreenService$a;->d:Lcom/superbock/auto/ScreenService;

    iget-object v1, v0, Lcom/superbock/auto/ScreenService;->h:Landroid/media/ImageReader;

    new-instance v2, Lcom/superbock/auto/ScreenService$a$a;

    invoke-direct {v2}, Lcom/superbock/auto/ScreenService$a$a;-><init>()V

    iget-object v0, v0, Lcom/superbock/auto/ScreenService;->d:Landroid/os/Handler;

    invoke-virtual {v1, v2, v0}, Landroid/media/ImageReader;->setOnImageAvailableListener(Landroid/media/ImageReader$OnImageAvailableListener;Landroid/os/Handler;)V

    sget-object v3, Lcom/superbock/auto/ScreenService;->i:Landroid/media/projection/MediaProjection;

    const-string v4, "SCANNER"

    iget-object v0, p0, Lcom/superbock/auto/ScreenService$a;->d:Lcom/superbock/auto/ScreenService;

    iget v5, v0, Lcom/superbock/auto/ScreenService;->b:I

    iget v6, v0, Lcom/superbock/auto/ScreenService;->c:I

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v7, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    const/16 v8, 0x9

    iget-object v0, p0, Lcom/superbock/auto/ScreenService$a;->d:Lcom/superbock/auto/ScreenService;

    iget-object v0, v0, Lcom/superbock/auto/ScreenService;->h:Landroid/media/ImageReader;

    invoke-virtual {v0}, Landroid/media/ImageReader;->getSurface()Landroid/view/Surface;

    move-result-object v9

    const/4 v10, 0x0

    iget-object v0, p0, Lcom/superbock/auto/ScreenService$a;->d:Lcom/superbock/auto/ScreenService;

    iget-object v11, v0, Lcom/superbock/auto/ScreenService;->d:Landroid/os/Handler;

    invoke-virtual/range {v3 .. v11}, Landroid/media/projection/MediaProjection;->createVirtualDisplay(Ljava/lang/String;IIIILandroid/view/Surface;Landroid/hardware/display/VirtualDisplay$Callback;Landroid/os/Handler;)Landroid/hardware/display/VirtualDisplay;

    move-result-object v0

    sput-object v0, Lcom/superbock/auto/ScreenService;->j:Landroid/hardware/display/VirtualDisplay;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method
