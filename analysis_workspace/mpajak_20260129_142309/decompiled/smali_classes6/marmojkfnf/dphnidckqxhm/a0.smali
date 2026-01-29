.class public final Lmarmojkfnf/dphnidckqxhm/a0;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmarmojkfnf/dphnidckqxhm/a0$b;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/LocalSocket;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x87

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/a0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method

.method public static native a(Ljava/lang/String;)V
.end method
