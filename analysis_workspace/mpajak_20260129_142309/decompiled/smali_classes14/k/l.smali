.class public final Lk/l;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;
.implements Lj/s;


# static fields
.field public static final a:Lk/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/l;

    invoke-direct {v0}, Lk/l;-><init>()V

    sput-object v0, Lk/l;->a:Lk/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
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

    :try_start_0
    iget-object p2, p1, Li/a;->g:Li/c;

    invoke-interface {p2}, Li/c;->q()I

    move-result v0

    const/16 v1, 0x10

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Li/c;->q()I

    move-result v0

    const/4 v2, 0x3

    if-ne v0, v2, :cond_1

    :goto_0
    invoke-interface {p2}, Li/c;->U()Ljava/math/BigDecimal;

    move-result-object v3

    invoke-interface {p2, v1}, Li/c;->Q(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v3}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lm/j;->d(Ljava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return-object v3

    :catch_0
    move-exception p1

    new-instance p2, Lf/d;

    const-string v0, "parseDecimal error, field : "

    invoke-static {v0, p3}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 0

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    if-nez p2, :cond_0

    sget-object p2, Lk/b1;->k:Lk/b1;

    invoke-virtual {p1, p2}, Lk/a1;->I(Lk/b1;)V

    goto :goto_1

    :cond_0
    check-cast p2, Ljava/math/BigDecimal;

    sget-object p3, Lk/b1;->C:Lk/b1;

    invoke-virtual {p1, p3}, Lk/a1;->l(Lk/b1;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-virtual {p1, p3}, Lk/a1;->write(Ljava/lang/String;)V

    sget-object p3, Lk/b1;->p:Lk/b1;

    invoke-virtual {p1, p3}, Lk/a1;->l(Lk/b1;)Z

    move-result p3

    if-eqz p3, :cond_2

    const-class p3, Ljava/math/BigDecimal;

    if-eq p4, p3, :cond_2

    invoke-virtual {p2}, Ljava/math/BigDecimal;->scale()I

    move-result p2

    if-nez p2, :cond_2

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Lk/a1;->write(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
