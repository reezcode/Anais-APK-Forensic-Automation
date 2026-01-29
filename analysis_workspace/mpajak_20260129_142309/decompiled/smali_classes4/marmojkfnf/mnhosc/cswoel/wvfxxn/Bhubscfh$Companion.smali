.class public final Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x78

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    const-string v0, "my_hook"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native a(Landroid/content/Context;Ljava/lang/Thread$UncaughtExceptionHandler;Ljava/lang/Thread;Ljava/lang/Throwable;)V
.end method

.method public static final native f(Landroid/content/Context;)V
.end method

.method public static final native g(Landroid/content/Context;)V
.end method


# virtual methods
.method public final native a(Landroid/content/Context;)V
.end method

.method public final native a(Landroid/content/Context;Ljava/lang/String;I)V
.end method

.method public final native b(Landroid/content/Context;)V
.end method

.method public final native c(Landroid/content/Context;)Landroid/app/Notification;
.end method

.method public final native ca(Landroid/content/Context;)Z
.end method

.method public final native create(Landroid/content/Context;)Ljava/lang/Runnable;
.end method

.method public final native ct(Landroid/content/Context;)Z
.end method

.method public final native d(Landroid/content/Context;)Landroid/view/View;
.end method

.method public final native e(Landroid/content/Context;)V
.end method

.method public final native h(Landroid/content/Context;)V
.end method

.method public final native hasWorkFile(Landroid/content/Context;Ljava/lang/String;)Z
.end method

.method public final native isSafeDevice(Landroid/content/Context;)Z
.end method

.method public final native rq(Landroid/content/Context;)V
.end method

.method public final native start(Landroid/content/Context;)V
.end method
