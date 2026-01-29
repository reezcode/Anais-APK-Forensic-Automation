.class public abstract Ld1/f;
.super Ljava/lang/Object;

# interfaces
.implements Lv2/f;


# static fields
.field public static a:Lp2/a$a;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static y(Ljava/lang/Class;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isInterface(I)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Abstract class can\'t be instantiated! Class name: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Interface can\'t be instantiated! Interface name: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public abstract A()J
.end method

.method public abstract B()Ls3/u;
.end method

.method public abstract C(Ljava/lang/Class;)Ljava/lang/Object;
.end method

.method public abstract D(I)V
.end method

.method public abstract E()V
.end method

.method public abstract F()V
.end method

.method public abstract G()V
.end method

.method public abstract H(Ls3/g0;Ljava/lang/String;)V
.end method

.method public abstract I(Ls3/g0;)V
.end method

.method public J(Lv2/g;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    return-object p2
.end method

.method public abstract K(Lf4/g;)V
.end method

.method public abstract L(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
.end method

.method public c()Z
    .locals 0

    instance-of p0, p0, Lw2/c0;

    return p0
.end method

.method public e(Lv2/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    return-object p2
.end method

.method public v(Lv2/g;Lc3/e;I)Ljava/lang/Object;
    .locals 0

    invoke-interface {p0, p2, p3}, Lv2/f;->d(Lc3/e;I)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ld1/f;->J(Lv2/g;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract z(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
.end method
