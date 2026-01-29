.class public final Lmarmojkfnf/dphnidckqxhm/y0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:Lmarmojkfnf/dphnidckqxhm/w;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6c

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

    invoke-static {p1}, Lmarmojkfnf/dphnidckqxhm/w;->a(Landroid/content/Context;)Lmarmojkfnf/dphnidckqxhm/w;

    move-result-object v0

    iput-object v0, p0, Lmarmojkfnf/dphnidckqxhm/y0;->a:Lmarmojkfnf/dphnidckqxhm/w;

    invoke-virtual {p0, p1}, Lmarmojkfnf/dphnidckqxhm/y0;->a(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final native a(Landroid/content/Context;)V
.end method

.method public final native run()V
.end method
