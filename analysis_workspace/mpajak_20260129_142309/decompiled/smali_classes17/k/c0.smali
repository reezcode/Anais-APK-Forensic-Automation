.class public final Lk/c0;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;
.implements Lj/s;


# static fields
.field public static a:Lk/c0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/c0;

    invoke-direct {v0}, Lk/c0;-><init>()V

    sput-object v0, Lk/c0;->a:Lk/c0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
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

    const/4 v2, 0x0

    const/16 v3, 0x10

    const/16 v4, 0x8

    if-ne v1, v4, :cond_0

    invoke-interface {v0, v3}, Li/c;->Q(I)V

    return-object v2

    :cond_0
    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    :try_start_0
    invoke-interface {v0}, Li/c;->I()I

    move-result p1

    invoke-interface {v0, v3}, Li/c;->Q(I)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    const/4 v4, 0x3

    if-ne v1, v4, :cond_2

    invoke-interface {v0}, Li/c;->U()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-interface {v0, v3}, Li/c;->Q(I)V

    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValue()I

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/16 v0, 0xc

    if-ne v1, v0, :cond_3

    new-instance v0, Lf/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf/e;-><init>(Z)V

    invoke-virtual {p1, v0}, Li/a;->E(Ljava/util/Map;)Ljava/lang/Object;

    invoke-static {v0}, Lm/j;->l(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v2}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lm/j;->l(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    const-class p3, Ljava/util/concurrent/atomic/AtomicInteger;

    if-ne p2, p3, :cond_4

    new-instance p2, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    return-object p2

    :cond_4
    return-object p1

    :goto_2
    new-instance p2, Lf/d;

    const-string v0, "parseInt error, field : "

    invoke-static {v0, p3}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 0

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    move-object p3, p2

    check-cast p3, Ljava/lang/Number;

    if-nez p3, :cond_0

    sget-object p2, Lk/b1;->k:Lk/b1;

    invoke-virtual {p1, p2}, Lk/a1;->I(Lk/b1;)V

    return-void

    :cond_0
    instance-of p2, p2, Ljava/lang/Long;

    if-eqz p2, :cond_1

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide p4

    invoke-virtual {p1, p4, p5}, Lk/a1;->A(J)V

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lk/a1;->z(I)V

    :goto_0
    sget-object p2, Lk/b1;->p:Lk/b1;

    invoke-virtual {p1, p2}, Lk/a1;->l(Lk/b1;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    const-class p3, Ljava/lang/Byte;

    if-ne p2, p3, :cond_2

    const/16 p2, 0x42

    goto :goto_1

    :cond_2
    const-class p3, Ljava/lang/Short;

    if-ne p2, p3, :cond_3

    const/16 p2, 0x53

    :goto_1
    invoke-virtual {p1, p2}, Lk/a1;->write(I)V

    :cond_3
    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
