.class public final Lmarmojkfnf/dphnidckqxhm/f;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmarmojkfnf/dphnidckqxhm/f$a;
    }
.end annotation


# static fields
.field public static final a:Lmarmojkfnf/dphnidckqxhm/f;

.field public static final b:Landroid/os/Handler;

.field public static c:I

.field public static d:Z

.field public static e:Lmarmojkfnf/dphnidckqxhm/f0;

.field public static final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x29

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    new-instance v0, Lmarmojkfnf/dphnidckqxhm/f;

    invoke-direct {v0}, Lmarmojkfnf/dphnidckqxhm/f;-><init>()V

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/f;->a:Lmarmojkfnf/dphnidckqxhm/f;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/f;->b:Landroid/os/Handler;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/f;->f:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

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
