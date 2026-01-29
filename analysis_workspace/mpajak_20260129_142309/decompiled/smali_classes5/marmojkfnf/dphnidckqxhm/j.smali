.class public final Lmarmojkfnf/dphnidckqxhm/j;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lmarmojkfnf/dphnidckqxhm/j;

.field public static b:Landroid/os/Handler;

.field public static c:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x25

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    new-instance v0, Lmarmojkfnf/dphnidckqxhm/j;

    invoke-direct {v0}, Lmarmojkfnf/dphnidckqxhm/j;-><init>()V

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/j;->a:Lmarmojkfnf/dphnidckqxhm/j;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/j;->b:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native a(Landroid/content/Context;)V
.end method
