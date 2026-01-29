.class public final Lmarmojkfnf/dphnidckqxhm/u;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/os/Parcel;

.field public c:Landroid/os/IBinder;

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3a

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cGFja2FnZU5hbWU="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/u;->a:Ljava/lang/String;

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/u;->c()Landroid/os/Parcel;

    move-result-object p1

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/u;->b:Landroid/os/Parcel;

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/u;->a()V

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/u;->b()Landroid/os/IBinder;

    move-result-object p1

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/u;->c:Landroid/os/IBinder;

    const/16 p1, 0xf

    iput p1, p0, Lmarmojkfnf/dphnidckqxhm/u;->d:I

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
