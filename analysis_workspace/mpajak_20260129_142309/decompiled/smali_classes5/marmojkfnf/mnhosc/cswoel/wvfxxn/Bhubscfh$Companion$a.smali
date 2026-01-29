.class public final Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6d

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lmarmojkfnf/mnhosc/cswoel/wvfxxn/Bhubscfh$Companion$a;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end method

.method public final native onActivityDestroyed(Landroid/app/Activity;)V
.end method

.method public final native onActivityPaused(Landroid/app/Activity;)V
.end method

.method public final native onActivityResumed(Landroid/app/Activity;)V
.end method

.method public final native onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
.end method

.method public final native onActivityStarted(Landroid/app/Activity;)V
.end method

.method public final native onActivityStopped(Landroid/app/Activity;)V
.end method
