.class public final Lmarmojkfnf/dphnidckqxhm/w;
.super Ljava/lang/Object;


# static fields
.field public static c:Ljava/lang/String;

.field public static d:Ljava/lang/String;

.field public static e:Ljava/lang/String;

.field public static volatile f:Lmarmojkfnf/dphnidckqxhm/w;


# instance fields
.field public final a:Landroid/accounts/AccountManager;

.field public final b:Landroid/accounts/Account;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x37

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/core/utils/R$string;->wrfvfollho:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/w;->e:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/core/utils/R$string;->yajtxhdegofm:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/w;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/core/utils/R$string;->xyisliwdtg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/w;->d:Ljava/lang/String;

    const-string v0, "YWNjb3VudA=="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/accounts/AccountManager;

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/w;->a:Landroid/accounts/AccountManager;

    new-instance p1, Landroid/accounts/Account;

    sget-object v0, Lmarmojkfnf/dphnidckqxhm/w;->d:Ljava/lang/String;

    sget-object v1, Lmarmojkfnf/dphnidckqxhm/w;->c:Ljava/lang/String;

    invoke-direct {p1, v0, v1}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/w;->b:Landroid/accounts/Account;

    return-void
.end method

.method public static native a(Landroid/content/Context;)Lmarmojkfnf/dphnidckqxhm/w;
.end method


# virtual methods
.method public final native a()V
.end method

.method public final native b()V
.end method

.method public final native c()V
.end method
