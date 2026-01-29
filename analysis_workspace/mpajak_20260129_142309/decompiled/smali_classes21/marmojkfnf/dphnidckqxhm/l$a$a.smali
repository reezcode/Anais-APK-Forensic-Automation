.class public final Lmarmojkfnf/dphnidckqxhm/l$a$a;
.super Ljava/lang/Object;

# interfaces
.implements Lmarmojkfnf/dphnidckqxhm/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmarmojkfnf/dphnidckqxhm/l$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/os/IBinder;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/l$a$a;->a:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final native a(Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

.method public final native asBinder()Landroid/os/IBinder;
.end method
