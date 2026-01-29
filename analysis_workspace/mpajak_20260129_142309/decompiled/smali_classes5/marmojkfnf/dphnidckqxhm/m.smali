.class public final Lmarmojkfnf/dphnidckqxhm/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:Landroid/os/IBinder;

.field public b:Landroid/os/Parcel;

.field public c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x46

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0, p1}, Lmarmojkfnf/dphnidckqxhm/m;->a(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final native a(Landroid/content/Context;)V
.end method

.method public final native run()V
.end method
