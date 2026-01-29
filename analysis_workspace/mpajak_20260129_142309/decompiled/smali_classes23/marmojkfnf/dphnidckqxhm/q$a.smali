.class public final Lmarmojkfnf/dphnidckqxhm/q$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmarmojkfnf/dphnidckqxhm/q;->a(Landroid/content/Context;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qoghcdrl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = null
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qoghcdrl;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x88

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qoghcdrl;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/q$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lmarmojkfnf/dphnidckqxhm/q$a;->b:Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Qoghcdrl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end method

.method public final native onServiceDisconnected(Landroid/content/ComponentName;)V
.end method
