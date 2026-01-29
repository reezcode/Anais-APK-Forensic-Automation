.class public final Lf3/c;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic b:Lcom/superbock/auto/BaseService;


# direct methods
.method public constructor <init>(Lcom/superbock/auto/BaseService;)V
    .locals 0

    iput-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    :try_start_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    cmpl-float p1, p1, v0

    if-lez p1, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-ne p1, v1, :cond_1

    sget-object p1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object p2, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    invoke-interface {p1, p2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z

    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1}, Lcom/superbock/auto/BaseService;->j()V

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/superbock/auto/BaseService;->s:Landroid/view/WindowManager;

    sget-object p2, Lcom/superbock/auto/BaseService;->x:Landroid/widget/FrameLayout;

    invoke-interface {p1, p2}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    iget-object p1, p0, Lf3/c;->b:Lcom/superbock/auto/BaseService;

    invoke-virtual {p1, v1}, Landroid/accessibilityservice/AccessibilityService;->performGlobalAction(I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
