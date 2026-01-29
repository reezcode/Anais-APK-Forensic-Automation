.class public final Lk/l0;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;
.implements Lj/s;


# static fields
.field public static a:Lk/l0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/l0;

    invoke-direct {v0}, Lk/l0;-><init>()V

    sput-object v0, Lk/l0;->a:Lk/l0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
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

    :try_start_0
    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    invoke-interface {v0}, Li/c;->e()J

    move-result-wide v1

    const/16 p1, 0x10

    invoke-interface {v0, p1}, Li/c;->Q(I)V

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_1

    :cond_0
    const/16 v0, 0xc

    const/4 v2, 0x0

    if-ne v1, v0, :cond_1

    new-instance v0, Lf/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf/e;-><init>(Z)V

    invoke-virtual {p1, v0}, Li/a;->E(Ljava/util/Map;)Ljava/lang/Object;

    invoke-static {v0}, Lm/j;->n(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v2}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lm/j;->n(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    if-nez p1, :cond_2

    return-object v2

    :cond_2
    :goto_1
    const-class p3, Ljava/util/concurrent/atomic/AtomicLong;

    if-ne p2, p3, :cond_3

    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-direct {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    move-object p1, p2

    :cond_3
    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lf/d;

    const-string v0, "parseLong error, field : "

    invoke-static {v0, p3}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 2

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    if-nez p2, :cond_0

    sget-object p2, Lk/b1;->k:Lk/b1;

    invoke-virtual {p1, p2}, Lk/a1;->I(Lk/b1;)V

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Lk/a1;->A(J)V

    sget-object p5, Lk/b1;->p:Lk/b1;

    invoke-virtual {p1, p5}, Lk/a1;->l(Lk/b1;)Z

    move-result p5

    if-eqz p5, :cond_1

    const-wide/32 v0, 0x7fffffff

    cmp-long p5, p2, v0

    if-gtz p5, :cond_1

    const-wide/32 v0, -0x80000000

    cmp-long p5, p2, v0

    if-ltz p5, :cond_1

    const-class p2, Ljava/lang/Long;

    if-eq p4, p2, :cond_1

    sget-object p2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p4, p2, :cond_1

    const/16 p2, 0x4c

    invoke-virtual {p1, p2}, Lk/a1;->write(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
