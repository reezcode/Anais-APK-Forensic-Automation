.class public Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm;
.super Landroid/content/BroadcastReceiver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm$a;,
        Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm$b;
    }
.end annotation


# static fields
.field public static final c:Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm$a;


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lmarmojkfnf/huflnkmt/ncagri/jdtuadkc/Uqjqbxl;",
            ">;"
        }
    .end annotation
.end field

.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x58

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    new-instance v0, Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm$a;

    invoke-direct {v0}, Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm$a;-><init>()V

    sput-object v0, Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm;->c:Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Kufhgacm;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final native a(Landroid/content/Context;)V
.end method

.method public final native onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end method
