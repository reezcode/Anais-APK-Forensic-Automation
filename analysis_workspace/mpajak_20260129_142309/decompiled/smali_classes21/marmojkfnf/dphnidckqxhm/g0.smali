.class public abstract Lmarmojkfnf/dphnidckqxhm/g0;
.super Landroid/os/Binder;

# interfaces
.implements Landroid/os/IInterface;


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x20

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    const-string v0, "YW5kcm9pZC5tZWRpYS5JTWVkaWFSb3V0ZXIy"

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/g0;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "YW5kcm9pZC5tZWRpYS5JTWVkaWFSb3V0ZXIy"

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final native asBinder()Landroid/os/IBinder;
.end method

.method public final native onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
.end method
