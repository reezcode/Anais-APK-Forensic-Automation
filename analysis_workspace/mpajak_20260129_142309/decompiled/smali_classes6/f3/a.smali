.class public final Lf3/a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 p1, 0x0

    :try_start_0
    sget-boolean v0, Lcom/superbock/auto/BaseService;->B:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Landroid/view/MotionEvent;->getToolType(I)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    sget-object p2, Lcom/superbock/auto/BaseService;->v:Landroid/widget/FrameLayout;

    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p2, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object v0, Lcom/superbock/auto/BaseService;->v:Landroid/widget/FrameLayout;

    sget-object v1, Lcom/superbock/auto/BaseService;->w:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {p2, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    return p1
.end method
