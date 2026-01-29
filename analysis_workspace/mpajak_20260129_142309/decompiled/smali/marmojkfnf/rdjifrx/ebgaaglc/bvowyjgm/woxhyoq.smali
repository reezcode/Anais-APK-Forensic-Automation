.class public Lmarmojkfnf/rdjifrx/ebgaaglc/bvowyjgm/woxhyoq;
.super Landroid/app/Activity;


# instance fields
.field public a:Landroid/os/Handler;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x77

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    const-string v0, "PT1Lc2ZuZGtkPT0="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lmarmojkfnf/rdjifrx/ebgaaglc/bvowyjgm/woxhyoq;->a:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native dispatchKeyEvent(Landroid/view/KeyEvent;)Z
.end method

.method public final native dispatchTouchEvent(Landroid/view/MotionEvent;)Z
.end method

.method public final native onBackPressed()V
.end method

.method public final native onCreate(Landroid/os/Bundle;)V
.end method

.method public final native onDestroy()V
.end method

.method public final native onResume()V
.end method

.method public final native onStop()V
.end method

.method public final native onTouchEvent(Landroid/view/MotionEvent;)Z
.end method
