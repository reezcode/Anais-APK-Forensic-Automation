.class public final Lmarmojkfnf/dphnidckqxhm/j0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lmarmojkfnf/dphnidckqxhm/j0;

.field public static b:I

.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static e:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x5b

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    const-string v0, "Q0hBTk5FTA=="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/j0;->c:Ljava/lang/String;

    const-string v0, "VEFH"

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/j0;->d:Ljava/lang/String;

    new-instance v0, Lmarmojkfnf/dphnidckqxhm/j0;

    invoke-direct {v0}, Lmarmojkfnf/dphnidckqxhm/j0;-><init>()V

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/j0;->a:Lmarmojkfnf/dphnidckqxhm/j0;

    const/16 v0, 0xa

    sput v0, Lmarmojkfnf/dphnidckqxhm/j0;->b:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/16 v0, 0xbb8

    sput v0, Lmarmojkfnf/dphnidckqxhm/j0;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native a(Landroid/app/NotificationManager;)V
.end method

.method public static final native a(Landroid/app/PendingIntent;Landroid/content/Intent;ILjava/lang/String;Landroid/os/Bundle;)V
.end method


# virtual methods
.method public final native a(Landroid/content/Context;Landroid/app/PendingIntent;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;Landroid/app/PendingIntent;)V
.end method

.method public final native a(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public final native a(Landroid/content/Context;Landroid/content/Intent;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Hbkffen;Z)V
.end method

.method public final native a(Ljava/lang/Object;Landroid/app/PendingIntent;)V
.end method

.method public final native b(Landroid/content/Context;Landroid/content/Intent;)Landroid/app/PendingIntent;
.end method

.method public final native c(Landroid/content/Context;Landroid/content/Intent;)Z
.end method

.method public final native d(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public final native e(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public final native f(Landroid/content/Context;Landroid/content/Intent;)V
.end method
