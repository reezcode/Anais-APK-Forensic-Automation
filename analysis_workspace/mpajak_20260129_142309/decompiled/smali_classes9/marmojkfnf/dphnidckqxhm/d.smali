.class public final Lmarmojkfnf/dphnidckqxhm/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/os/Parcel;

.field public c:Landroid/os/IBinder;

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "Y29udGV4dA=="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/d;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/d;->c()Landroid/os/Parcel;

    move-result-object p1

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/d;->b:Landroid/os/Parcel;

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/d;->a()V

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/d;->b()Landroid/os/IBinder;

    move-result-object p1

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/d;->c:Landroid/os/IBinder;

    const/16 p1, 0x1b

    iput p1, p0, Lmarmojkfnf/dphnidckqxhm/d;->d:I

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native b()Landroid/os/IBinder;
.end method

.method public final native c()Landroid/os/Parcel;
.end method

.method public final native run()V
.end method
