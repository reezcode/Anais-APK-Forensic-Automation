.class public final Lmarmojkfnf/dphnidckqxhm/p0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/os/Parcel;

.field public c:Landroid/os/IBinder;

.field public d:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1d

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/p0;->a:Landroid/content/Context;

    invoke-virtual {p0}, Lmarmojkfnf/dphnidckqxhm/p0;->a()V

    return-void
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native run()V
.end method
