.class public abstract Lj/b;
.super Lj/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lj/b;->f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "I)TT;"
        }
    .end annotation

    const-string p3, "yyyy-MM-dd\'T\'HH:mm:ss"

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"

    iget-object v1, p1, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->q()I

    move-result v2

    const/16 v3, 0x10

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-ne v2, v4, :cond_0

    invoke-interface {v1}, Li/c;->e()J

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v1, v3}, Li/c;->Q(I)V

    goto/16 :goto_4

    :cond_0
    invoke-interface {v1}, Li/c;->q()I

    move-result v2

    const/4 v6, 0x4

    if-ne v2, v6, :cond_6

    invoke-interface {v1}, Li/c;->k0()Ljava/lang/String;

    move-result-object v2

    if-eqz p4, :cond_3

    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    sget-object v6, Lf/a;->c:Ljava/util/Locale;

    invoke-direct {v4, p4, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    const-string v4, "yyyy-MM-ddTHH:mm:ss.SSS"

    invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object p4, v0

    goto :goto_0

    :cond_1
    const-string v4, "yyyy-MM-ddTHH:mm:ss"

    invoke-virtual {p4, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-direct {v4, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    move-object p4, p3

    goto :goto_0

    :cond_2
    move-object v4, v5

    :goto_0
    :try_start_1
    invoke-virtual {v4, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p3
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    invoke-virtual {p4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result p4

    const/16 v0, 0x13

    if-ne p4, v0, :cond_3

    :try_start_2
    new-instance p4, Ljava/text/SimpleDateFormat;

    invoke-direct {p4, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v2}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p3
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_1
    move-object v5, p3

    goto :goto_2

    :catch_2
    nop

    :cond_3
    :goto_2
    if-nez v5, :cond_10

    invoke-interface {v1, v3}, Li/c;->Q(I)V

    sget-object p3, Li/b;->g:Li/b;

    invoke-interface {v1, p3}, Li/c;->A(Li/b;)Z

    move-result p3

    if-eqz p3, :cond_5

    new-instance p3, Li/f;

    invoke-direct {p3, v2}, Li/f;-><init>(Ljava/lang/String;)V

    const/4 p4, 0x1

    invoke-virtual {p3, p4}, Li/f;->S0(Z)Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p4, p3, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {p4}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v2

    :cond_4
    invoke-virtual {p3}, Li/d;->close()V

    :cond_5
    move-object v5, v2

    goto/16 :goto_4

    :cond_6
    invoke-interface {v1}, Li/c;->q()I

    move-result p3

    const/16 p4, 0x8

    if-ne p3, p4, :cond_7

    invoke-interface {v1}, Li/c;->y()V

    goto/16 :goto_4

    :cond_7
    invoke-interface {v1}, Li/c;->q()I

    move-result p3

    const/16 p4, 0xc

    const/16 v0, 0xd

    const/16 v2, 0x11

    const-string v7, "syntax error"

    if-ne p3, p4, :cond_c

    invoke-interface {v1}, Li/c;->y()V

    invoke-interface {v1}, Li/c;->q()I

    move-result p3

    if-ne p3, v6, :cond_b

    invoke-interface {v1}, Li/c;->k0()Ljava/lang/String;

    move-result-object p3

    sget-object p4, Lf/a;->d:Ljava/lang/String;

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {v1}, Li/c;->y()V

    invoke-virtual {p1, v2}, Li/a;->a(I)V

    invoke-interface {v1}, Li/c;->k0()Ljava/lang/String;

    move-result-object p3

    iget-object p4, p1, Li/a;->d:Li/i;

    invoke-virtual {p4, p3, v5}, Li/i;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p3

    if-eqz p3, :cond_8

    move-object p2, p3

    :cond_8
    invoke-virtual {p1, v6}, Li/a;->a(I)V

    invoke-virtual {p1, v3}, Li/a;->a(I)V

    :cond_9
    invoke-interface {v1}, Li/c;->H()V

    invoke-interface {v1}, Li/c;->q()I

    move-result p3

    if-ne p3, v4, :cond_a

    invoke-interface {v1}, Li/c;->e()J

    move-result-wide p3

    invoke-interface {v1}, Li/c;->y()V

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    goto :goto_3

    :cond_a
    new-instance p1, Lf/d;

    const-string p2, "syntax error : "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-interface {v1}, Li/c;->Y()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Lf/d;

    invoke-direct {p1, v7}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    iget p3, p1, Li/a;->l:I

    if-ne p3, v4, :cond_f

    const/4 p3, 0x0

    iput p3, p1, Li/a;->l:I

    invoke-virtual {p1, v3}, Li/a;->a(I)V

    invoke-interface {v1}, Li/c;->q()I

    move-result p3

    if-ne p3, v6, :cond_e

    invoke-interface {v1}, Li/c;->k0()Ljava/lang/String;

    move-result-object p3

    const-string p4, "val"

    invoke-virtual {p4, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-interface {v1}, Li/c;->y()V

    invoke-virtual {p1, v2}, Li/a;->a(I)V

    invoke-virtual {p1, v5}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :goto_3
    move-object v5, p3

    invoke-virtual {p1, v0}, Li/a;->a(I)V

    goto :goto_4

    :cond_d
    new-instance p1, Lf/d;

    invoke-direct {p1, v7}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_e
    new-instance p1, Lf/d;

    invoke-direct {p1, v7}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    invoke-virtual {p1, v5}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :cond_10
    :goto_4
    invoke-virtual {p0, p1, p2, v5}, Lj/b;->g(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract g(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation
.end method
