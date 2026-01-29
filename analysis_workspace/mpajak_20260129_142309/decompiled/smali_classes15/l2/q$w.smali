.class public final Ll2/q$w;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li2/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp2/a;->I()V

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lp2/a;->K()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lp2/a;->x()Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lp2/b;->z(Ljava/lang/Boolean;)Lp2/b;

    return-void
.end method
