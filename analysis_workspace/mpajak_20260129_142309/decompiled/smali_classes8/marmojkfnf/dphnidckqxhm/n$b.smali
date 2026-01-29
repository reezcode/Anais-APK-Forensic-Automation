.class public final Lmarmojkfnf/dphnidckqxhm/n$b;
.super Ljava/lang/Object;

# interfaces
.implements Lmarmojkfnf/dphnidckqxhm/a0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmarmojkfnf/dphnidckqxhm/n;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = null
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/ScheduledFuture;

.field public final b:Lmarmojkfnf/dphnidckqxhm/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x24

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Lmarmojkfnf/dphnidckqxhm/n;Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/n$b;->b:Lmarmojkfnf/dphnidckqxhm/n;

    iput-object p2, p0, Lmarmojkfnf/dphnidckqxhm/n$b;->a:Ljava/util/concurrent/ScheduledFuture;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native a(Ljava/lang/String;)V
.end method
