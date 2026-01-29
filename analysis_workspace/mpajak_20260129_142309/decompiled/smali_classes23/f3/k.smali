.class public final Lf3/k;
.super Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;


# instance fields
.field public final synthetic a:Landroid/accessibilityservice/GestureDescription$StrokeDescription;


# direct methods
.method public constructor <init>(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)V
    .locals 0

    iput-object p1, p0, Lf3/k;->a:Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    invoke-direct {p0}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCancelled(Landroid/accessibilityservice/GestureDescription;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;->onCancelled(Landroid/accessibilityservice/GestureDescription;)V

    return-void
.end method

.method public final onCompleted(Landroid/accessibilityservice/GestureDescription;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;->onCompleted(Landroid/accessibilityservice/GestureDescription;)V

    :try_start_0
    invoke-static {}, Lcom/superbock/auto/BaseService;->g()Lcom/superbock/auto/BaseService;

    move-result-object p1

    new-instance v0, Landroid/accessibilityservice/GestureDescription$Builder;

    invoke-direct {v0}, Landroid/accessibilityservice/GestureDescription$Builder;-><init>()V

    iget-object v1, p0, Lf3/k;->a:Landroid/accessibilityservice/GestureDescription$StrokeDescription;

    invoke-virtual {v0, v1}, Landroid/accessibilityservice/GestureDescription$Builder;->addStroke(Landroid/accessibilityservice/GestureDescription$StrokeDescription;)Landroid/accessibilityservice/GestureDescription$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/accessibilityservice/GestureDescription$Builder;->build()Landroid/accessibilityservice/GestureDescription;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, Landroid/accessibilityservice/AccessibilityService;->dispatchGesture(Landroid/accessibilityservice/GestureDescription;Landroid/accessibilityservice/AccessibilityService$GestureResultCallback;Landroid/os/Handler;)Z
    :try_end_0
    .catch Lf3/f; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
