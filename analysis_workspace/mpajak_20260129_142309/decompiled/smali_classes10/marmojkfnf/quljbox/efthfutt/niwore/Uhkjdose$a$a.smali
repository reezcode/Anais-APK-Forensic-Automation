.class public final Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/accounts/Account;

.field public final b:Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x80

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a;Landroid/accounts/Account;)V
    .locals 0

    iput-object p1, p0, Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a$a;->b:Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lmarmojkfnf/quljbox/efthfutt/niwore/Uhkjdose$a$a;->a:Landroid/accounts/Account;

    return-void
.end method


# virtual methods
.method public final native run()V
.end method
