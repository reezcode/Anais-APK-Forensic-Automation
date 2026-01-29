.class public final Lk/i;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;
.implements Lj/s;


# static fields
.field public static final a:Lk/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/i;

    invoke-direct {v0}, Lk/i;-><init>()V

    sput-object v0, Lk/i;->a:Lk/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, Ljava/awt/Point;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/awt/Rectangle;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/awt/Font;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/awt/Color;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/16 v2, 0x10

    const/16 v3, 0x8

    if-ne v1, v3, :cond_0

    invoke-interface {v0, v2}, Li/c;->Q(I)V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/16 v3, 0xc

    if-eq v1, v3, :cond_2

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lf/d;

    const-string p2, "syntax error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-interface {v0}, Li/c;->y()V

    const-class v0, Ljava/awt/Point;

    if-ne p2, v0, :cond_3

    invoke-virtual {p0, p1, p3}, Lk/i;->h(Li/a;Ljava/lang/Object;)Ljava/awt/Point;

    move-result-object p2

    goto :goto_1

    :cond_3
    const-class v0, Ljava/awt/Rectangle;

    if-ne p2, v0, :cond_4

    invoke-virtual {p0, p1}, Lk/i;->i(Li/a;)Ljava/awt/Rectangle;

    move-result-object p2

    goto :goto_1

    :cond_4
    const-class v0, Ljava/awt/Color;

    if-ne p2, v0, :cond_5

    invoke-virtual {p0, p1}, Lk/i;->f(Li/a;)Ljava/awt/Color;

    move-result-object p2

    goto :goto_1

    :cond_5
    const-class v0, Ljava/awt/Font;

    if-ne p2, v0, :cond_6

    invoke-virtual {p0, p1}, Lk/i;->g(Li/a;)Ljava/awt/Font;

    move-result-object p2

    :goto_1
    iget-object v0, p1, Li/a;->h:Li/h;

    invoke-virtual {p1, p2, p3}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    invoke-virtual {p1, v0}, Li/a;->P(Li/h;)V

    return-object p2

    :cond_6
    new-instance p1, Lf/d;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "not support awt class : "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 2

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lk/a1;->E()V

    return-void

    :cond_0
    instance-of p3, p2, Ljava/awt/Point;

    const-string p4, "y"

    const-string p5, "x"

    const/16 v0, 0x2c

    if-eqz p3, :cond_1

    check-cast p2, Ljava/awt/Point;

    const-class p3, Ljava/awt/Point;

    invoke-virtual {p0, p1, p3}, Lk/i;->k(Lk/a1;Ljava/lang/Class;)C

    move-result p3

    iget v1, p2, Ljava/awt/Point;->x:I

    invoke-virtual {p1, p3, p5, v1}, Lk/a1;->r(CLjava/lang/String;I)V

    iget p2, p2, Ljava/awt/Point;->y:I

    invoke-virtual {p1, v0, p4, p2}, Lk/a1;->r(CLjava/lang/String;I)V

    goto/16 :goto_1

    :cond_1
    instance-of p3, p2, Ljava/awt/Font;

    if-eqz p3, :cond_2

    check-cast p2, Ljava/awt/Font;

    const-class p3, Ljava/awt/Font;

    invoke-virtual {p0, p1, p3}, Lk/i;->k(Lk/a1;Ljava/lang/Class;)C

    move-result p3

    invoke-virtual {p2}, Ljava/awt/Font;->getName()Ljava/lang/String;

    move-result-object p4

    const-string p5, "name"

    invoke-virtual {p1, p3, p5, p4}, Lk/a1;->w(CLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/awt/Font;->getStyle()I

    move-result p3

    const-string p4, "style"

    invoke-virtual {p1, v0, p4, p3}, Lk/a1;->r(CLjava/lang/String;I)V

    invoke-virtual {p2}, Ljava/awt/Font;->getSize()I

    move-result p2

    const-string p3, "size"

    goto :goto_0

    :cond_2
    instance-of p3, p2, Ljava/awt/Rectangle;

    if-eqz p3, :cond_3

    check-cast p2, Ljava/awt/Rectangle;

    const-class p3, Ljava/awt/Rectangle;

    invoke-virtual {p0, p1, p3}, Lk/i;->k(Lk/a1;Ljava/lang/Class;)C

    move-result p3

    iget v1, p2, Ljava/awt/Rectangle;->x:I

    invoke-virtual {p1, p3, p5, v1}, Lk/a1;->r(CLjava/lang/String;I)V

    iget p3, p2, Ljava/awt/Rectangle;->y:I

    invoke-virtual {p1, v0, p4, p3}, Lk/a1;->r(CLjava/lang/String;I)V

    iget p3, p2, Ljava/awt/Rectangle;->width:I

    const-string p4, "width"

    invoke-virtual {p1, v0, p4, p3}, Lk/a1;->r(CLjava/lang/String;I)V

    iget p2, p2, Ljava/awt/Rectangle;->height:I

    const-string p3, "height"

    goto :goto_0

    :cond_3
    instance-of p3, p2, Ljava/awt/Color;

    if-eqz p3, :cond_5

    check-cast p2, Ljava/awt/Color;

    const-class p3, Ljava/awt/Color;

    invoke-virtual {p0, p1, p3}, Lk/i;->k(Lk/a1;Ljava/lang/Class;)C

    move-result p3

    invoke-virtual {p2}, Ljava/awt/Color;->getRed()I

    move-result p4

    const-string p5, "r"

    invoke-virtual {p1, p3, p5, p4}, Lk/a1;->r(CLjava/lang/String;I)V

    invoke-virtual {p2}, Ljava/awt/Color;->getGreen()I

    move-result p3

    const-string p4, "g"

    invoke-virtual {p1, v0, p4, p3}, Lk/a1;->r(CLjava/lang/String;I)V

    invoke-virtual {p2}, Ljava/awt/Color;->getBlue()I

    move-result p3

    const-string p4, "b"

    invoke-virtual {p1, v0, p4, p3}, Lk/a1;->r(CLjava/lang/String;I)V

    invoke-virtual {p2}, Ljava/awt/Color;->getAlpha()I

    move-result p3

    if-lez p3, :cond_4

    invoke-virtual {p2}, Ljava/awt/Color;->getAlpha()I

    move-result p2

    const-string p3, "alpha"

    :goto_0
    invoke-virtual {p1, v0, p3, p2}, Lk/a1;->r(CLjava/lang/String;I)V

    :cond_4
    :goto_1
    const/16 p2, 0x7d

    invoke-virtual {p1, p2}, Lk/a1;->write(I)V

    return-void

    :cond_5
    new-instance p1, Lf/d;

    const-string p3, "not support awt class : "

    invoke-static {p3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final f(Li/a;)Ljava/awt/Color;
    .locals 9

    iget-object p1, p1, Li/a;->g:Li/c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Li/c;->q()I

    move-result v4

    const/16 v5, 0xd

    if-ne v4, v5, :cond_1

    invoke-interface {p1}, Li/c;->y()V

    new-instance p1, Ljava/awt/Color;

    invoke-direct {p1, v0, v1, v2, v3}, Ljava/awt/Color;-><init>(IIII)V

    return-object p1

    :cond_1
    invoke-interface {p1}, Li/c;->q()I

    move-result v4

    const-string v5, "syntax error"

    const/4 v6, 0x4

    if-ne v4, v6, :cond_7

    invoke-interface {p1}, Li/c;->k0()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x2

    invoke-interface {p1}, Li/c;->H()V

    invoke-interface {p1}, Li/c;->q()I

    move-result v8

    if-ne v8, v7, :cond_6

    invoke-interface {p1}, Li/c;->I()I

    move-result v5

    invoke-interface {p1}, Li/c;->y()V

    const-string v7, "r"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v0, v5

    goto :goto_1

    :cond_2
    const-string v7, "g"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v1, v5

    goto :goto_1

    :cond_3
    const-string v7, "b"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v2, v5

    goto :goto_1

    :cond_4
    const-string v3, "alpha"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    move v3, v5

    :goto_1
    invoke-interface {p1}, Li/c;->q()I

    move-result v4

    const/16 v5, 0x10

    if-ne v4, v5, :cond_0

    invoke-interface {p1, v6}, Li/c;->Q(I)V

    goto :goto_0

    :cond_5
    new-instance p1, Lf/d;

    const-string v0, "syntax error, "

    invoke-static {v0, v4}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Li/a;)Ljava/awt/Font;
    .locals 8

    iget-object p1, p1, Li/a;->g:Li/c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Li/c;->q()I

    move-result v3

    const/16 v4, 0xd

    if-ne v3, v4, :cond_1

    invoke-interface {p1}, Li/c;->y()V

    new-instance p1, Ljava/awt/Font;

    invoke-direct {p1, v1, v0, v2}, Ljava/awt/Font;-><init>(Ljava/lang/String;II)V

    return-object p1

    :cond_1
    invoke-interface {p1}, Li/c;->q()I

    move-result v3

    const/4 v4, 0x4

    const-string v5, "syntax error"

    if-ne v3, v4, :cond_8

    invoke-interface {p1}, Li/c;->k0()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    invoke-interface {p1}, Li/c;->H()V

    const-string v7, "name"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {p1}, Li/c;->q()I

    move-result v1

    if-ne v1, v4, :cond_2

    invoke-interface {p1}, Li/c;->k0()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_2
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string v7, "style"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {p1}, Li/c;->q()I

    move-result v0

    if-ne v0, v6, :cond_4

    invoke-interface {p1}, Li/c;->I()I

    move-result v0

    goto :goto_1

    :cond_4
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    const-string v2, "size"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Li/c;->q()I

    move-result v2

    if-ne v2, v6, :cond_6

    invoke-interface {p1}, Li/c;->I()I

    move-result v2

    :goto_1
    invoke-interface {p1}, Li/c;->y()V

    invoke-interface {p1}, Li/c;->q()I

    move-result v3

    const/16 v5, 0x10

    if-ne v3, v5, :cond_0

    invoke-interface {p1, v4}, Li/c;->Q(I)V

    goto :goto_0

    :cond_6
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lf/d;

    const-string v0, "syntax error, "

    invoke-static {v0, v3}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Li/a;Ljava/lang/Object;)Ljava/awt/Point;
    .locals 8

    iget-object v0, p1, Li/a;->g:Li/c;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Li/c;->q()I

    move-result v3

    const/16 v4, 0xd

    if-ne v3, v4, :cond_1

    invoke-interface {v0}, Li/c;->y()V

    new-instance p1, Ljava/awt/Point;

    invoke-direct {p1, v1, v2}, Ljava/awt/Point;-><init>(II)V

    return-object p1

    :cond_1
    invoke-interface {v0}, Li/c;->q()I

    move-result v3

    const/4 v5, 0x4

    if-ne v3, v5, :cond_a

    invoke-interface {v0}, Li/c;->k0()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lf/a;->d:Ljava/lang/String;

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/16 v7, 0x10

    if-eqz v6, :cond_4

    iget-object v3, p1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->S()V

    invoke-interface {v3}, Li/c;->q()I

    move-result v4

    const-string v6, "type not match error"

    if-ne v4, v5, :cond_3

    invoke-interface {v3}, Li/c;->k0()Ljava/lang/String;

    move-result-object v4

    const-string v5, "java.awt.Point"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Li/c;->y()V

    invoke-interface {v3}, Li/c;->q()I

    move-result v4

    if-ne v4, v7, :cond_0

    invoke-interface {v3}, Li/c;->y()V

    goto :goto_0

    :cond_2
    new-instance p1, Lf/d;

    invoke-direct {p1, v6}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Lf/d;

    invoke-direct {p1, v6}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string v6, "$ref"

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->H()V

    invoke-interface {v0}, Li/c;->k0()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p1, Li/a;->h:Li/h;

    invoke-virtual {p1, v2, p2}, Li/a;->N(Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    new-instance p2, Li/a$a;

    iget-object v2, p1, Li/a;->h:Li/h;

    invoke-direct {p2, v2, v1}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Li/a;->b(Li/a$a;)V

    invoke-virtual {p1}, Li/a;->J()V

    const/4 p2, 0x1

    iput p2, p1, Li/a;->l:I

    invoke-interface {v0, v4}, Li/c;->Q(I)V

    invoke-virtual {p1, v4}, Li/a;->a(I)V

    const/4 p1, 0x0

    move-object p2, p1

    check-cast p2, Ljava/awt/Point;

    return-object p1

    :cond_5
    const/4 v4, 0x2

    invoke-interface {v0}, Li/c;->H()V

    invoke-interface {v0}, Li/c;->q()I

    move-result v6

    if-ne v6, v4, :cond_6

    invoke-interface {v0}, Li/c;->I()I

    move-result v4

    goto :goto_1

    :cond_6
    const/4 v4, 0x3

    if-ne v6, v4, :cond_9

    invoke-interface {v0}, Li/c;->l()F

    move-result v4

    float-to-int v4, v4

    :goto_1
    invoke-interface {v0}, Li/c;->y()V

    const-string v6, "x"

    invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    move v1, v4

    goto :goto_2

    :cond_7
    const-string v2, "y"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    move v2, v4

    :goto_2
    invoke-interface {v0}, Li/c;->q()I

    move-result v3

    if-ne v3, v7, :cond_0

    invoke-interface {v0, v5}, Li/c;->Q(I)V

    goto/16 :goto_0

    :cond_8
    new-instance p1, Lf/d;

    const-string p2, "syntax error, "

    invoke-static {p2, v3}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Lf/d;

    const-string p2, "syntax error : "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-interface {v0}, Li/c;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    new-instance p1, Lf/d;

    const-string p2, "syntax error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final i(Li/a;)Ljava/awt/Rectangle;
    .locals 9

    iget-object p1, p1, Li/a;->g:Li/c;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Li/c;->q()I

    move-result v4

    const/16 v5, 0xd

    if-ne v4, v5, :cond_1

    invoke-interface {p1}, Li/c;->y()V

    new-instance p1, Ljava/awt/Rectangle;

    invoke-direct {p1, v0, v1, v2, v3}, Ljava/awt/Rectangle;-><init>(IIII)V

    return-object p1

    :cond_1
    invoke-interface {p1}, Li/c;->q()I

    move-result v4

    const-string v5, "syntax error"

    const/4 v6, 0x4

    if-ne v4, v6, :cond_8

    invoke-interface {p1}, Li/c;->k0()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x2

    invoke-interface {p1}, Li/c;->H()V

    invoke-interface {p1}, Li/c;->q()I

    move-result v8

    if-ne v8, v7, :cond_2

    invoke-interface {p1}, Li/c;->I()I

    move-result v5

    goto :goto_1

    :cond_2
    const/4 v7, 0x3

    if-ne v8, v7, :cond_7

    invoke-interface {p1}, Li/c;->l()F

    move-result v5

    float-to-int v5, v5

    :goto_1
    invoke-interface {p1}, Li/c;->y()V

    const-string v7, "x"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_3

    move v0, v5

    goto :goto_2

    :cond_3
    const-string v7, "y"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v1, v5

    goto :goto_2

    :cond_4
    const-string v7, "width"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v2, v5

    goto :goto_2

    :cond_5
    const-string v3, "height"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v5

    :goto_2
    invoke-interface {p1}, Li/c;->q()I

    move-result v4

    const/16 v5, 0x10

    if-ne v4, v5, :cond_0

    invoke-interface {p1, v6}, Li/c;->Q(I)V

    goto :goto_0

    :cond_6
    new-instance p1, Lf/d;

    const-string v0, "syntax error, "

    invoke-static {v0, v4}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Lf/d;

    invoke-direct {p1, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final k(Lk/a1;Ljava/lang/Class;)C
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/a1;",
            "Ljava/lang/Class<",
            "*>;C)C"
        }
    .end annotation

    sget-object v0, Lk/b1;->p:Lk/b1;

    invoke-virtual {p1, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    const/16 v1, 0x7b

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Lk/a1;->write(I)V

    sget-object v0, Lf/a;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/a1;->J(Ljava/lang/String;)V

    const/16 v1, 0x2c

    :cond_0
    return v1
.end method
