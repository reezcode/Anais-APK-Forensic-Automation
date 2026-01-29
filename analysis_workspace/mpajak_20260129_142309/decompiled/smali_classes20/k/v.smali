.class public final Lk/v;
.super Lj/b;

# interfaces
.implements Lk/q0;


# static fields
.field public static final a:Lk/v;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/v;

    invoke-direct {v0}, Lk/v;-><init>()V

    sput-object v0, Lk/v;->a:Lk/v;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget-object v2, v0, Lk/g0;->j:Lk/a1;

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lk/a1;->E()V

    return-void

    :cond_0
    instance-of v3, v1, Ljava/util/Date;

    if-eqz v3, :cond_1

    move-object v3, v1

    check-cast v3, Ljava/util/Date;

    goto :goto_0

    :cond_1
    invoke-static/range {p2 .. p2}, Lm/j;->i(Ljava/lang/Object;)Ljava/util/Date;

    move-result-object v3

    :goto_0
    sget-object v4, Lk/b1;->t:Lk/b1;

    invoke-virtual {v2, v4}, Lk/a1;->l(Lk/b1;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, v0, Lk/g0;->m:Ljava/text/SimpleDateFormat;

    if-nez v1, :cond_2

    new-instance v1, Ljava/text/SimpleDateFormat;

    sget-object v4, Lf/a;->f:Ljava/lang/String;

    iget-object v5, v0, Lk/g0;->q:Ljava/util/Locale;

    invoke-direct {v1, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object v0, v0, Lk/g0;->p:Ljava/util/TimeZone;

    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_2
    invoke-virtual {v1, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lk/a1;->J(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object v4, Lk/b1;->p:Lk/b1;

    invoke-virtual {v2, v4}, Lk/a1;->l(Lk/b1;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v5, p4

    if-eq v4, v5, :cond_5

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/util/Date;

    if-ne v3, v4, :cond_4

    const-string v0, "new Date("

    invoke-virtual {v2, v0}, Lk/a1;->write(Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lk/a1;->A(J)V

    const/16 v0, 0x29

    goto :goto_1

    :cond_4
    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Lk/a1;->write(I)V

    sget-object v3, Lf/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lk/g0;->r(Ljava/lang/String;)V

    const/16 v0, 0x2c

    check-cast v1, Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    const-string v1, "val"

    invoke-virtual {v2, v0, v1, v3, v4}, Lk/a1;->s(CLjava/lang/String;J)V

    const/16 v0, 0x7d

    :goto_1
    invoke-virtual {v2, v0}, Lk/a1;->write(I)V

    return-void

    :cond_5
    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sget-object v1, Lk/b1;->h:Lk/b1;

    invoke-virtual {v2, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lk/b1;->d:Lk/b1;

    invoke-virtual {v2, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x27

    goto :goto_2

    :cond_6
    const/16 v1, 0x22

    :goto_2
    invoke-virtual {v2, v1}, Lk/a1;->write(I)V

    iget-object v5, v0, Lk/g0;->p:Ljava/util/TimeZone;

    iget-object v0, v0, Lk/g0;->q:Ljava/util/Locale;

    invoke-static {v5, v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v5, 0x2

    invoke-virtual {v0, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    add-int/2addr v5, v3

    const/4 v6, 0x5

    invoke-virtual {v0, v6}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/16 v7, 0xb

    invoke-virtual {v0, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v8, 0xc

    invoke-virtual {v0, v8}, Ljava/util/Calendar;->get(I)I

    move-result v8

    const/16 v9, 0xd

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v10

    const/16 v11, 0xe

    invoke-virtual {v0, v11}, Ljava/util/Calendar;->get(I)I

    move-result v11

    const/16 v12, 0x10

    const/16 v13, 0x13

    const/16 v14, 0xa

    if-eqz v11, :cond_7

    const-string v16, "0000-00-00T00:00:00.000"

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->toCharArray()[C

    move-result-object v15

    const/16 v3, 0x17

    invoke-static {v11, v3, v15}, Lm/e;->b(II[C)V

    invoke-static {v10, v13, v15}, Lm/e;->b(II[C)V

    invoke-static {v8, v12, v15}, Lm/e;->b(II[C)V

    invoke-static {v7, v9, v15}, Lm/e;->b(II[C)V

    invoke-static {v6, v14, v15}, Lm/e;->b(II[C)V

    const/4 v3, 0x7

    invoke-static {v5, v3, v15}, Lm/e;->b(II[C)V

    const/4 v11, 0x4

    invoke-static {v4, v11, v15}, Lm/e;->b(II[C)V

    goto :goto_3

    :cond_7
    const/4 v3, 0x7

    const/4 v11, 0x4

    if-nez v10, :cond_8

    if-nez v8, :cond_8

    if-nez v7, :cond_8

    const-string v7, "0000-00-00"

    invoke-virtual {v7}, Ljava/lang/String;->toCharArray()[C

    move-result-object v15

    invoke-static {v6, v14, v15}, Lm/e;->b(II[C)V

    invoke-static {v5, v3, v15}, Lm/e;->b(II[C)V

    invoke-static {v4, v11, v15}, Lm/e;->b(II[C)V

    goto :goto_3

    :cond_8
    const-string v3, "0000-00-00T00:00:00"

    invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C

    move-result-object v15

    invoke-static {v10, v13, v15}, Lm/e;->b(II[C)V

    invoke-static {v8, v12, v15}, Lm/e;->b(II[C)V

    invoke-static {v7, v9, v15}, Lm/e;->b(II[C)V

    invoke-static {v6, v14, v15}, Lm/e;->b(II[C)V

    const/4 v3, 0x7

    invoke-static {v5, v3, v15}, Lm/e;->b(II[C)V

    const/4 v3, 0x4

    invoke-static {v4, v3, v15}, Lm/e;->b(II[C)V

    :goto_3
    invoke-virtual {v2, v15}, Ljava/io/Writer;->write([C)V

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v0

    const v3, 0x36ee80

    div-int/2addr v0, v3

    if-nez v0, :cond_9

    const/16 v0, 0x5a

    invoke-virtual {v2, v0}, Lk/a1;->write(I)V

    goto :goto_5

    :cond_9
    const-string v3, "%02d"

    const/4 v4, 0x0

    if-lez v0, :cond_a

    const/16 v5, 0x2b

    invoke-virtual {v2, v5}, Lk/a1;->write(I)V

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v4

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_a
    const/4 v5, 0x1

    const/16 v6, 0x2d

    invoke-virtual {v2, v6}, Lk/a1;->write(I)V

    new-array v5, v5, [Ljava/lang/Object;

    neg-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v4

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-virtual {v2, v0}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    const-string v0, ":00"

    invoke-virtual {v2, v0}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    :goto_5
    invoke-virtual {v2, v1}, Lk/a1;->write(I)V

    goto :goto_6

    :cond_b
    invoke-virtual {v2, v3, v4}, Lk/a1;->A(J)V

    :goto_6
    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final g(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
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

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p3, Ljava/util/Date;

    if-eqz v1, :cond_1

    return-object p3

    :cond_1
    instance-of v1, p3, Ljava/lang/Number;

    if-eqz v1, :cond_2

    new-instance p1, Ljava/util/Date;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ljava/util/Date;-><init>(J)V

    return-object p1

    :cond_2
    instance-of v1, p3, Ljava/lang/String;

    if-eqz v1, :cond_e

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    new-instance v1, Li/f;

    invoke-direct {v1, p3}, Li/f;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, v2}, Li/f;->S0(Z)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object p1, v1, Li/d;->k:Ljava/util/Calendar;

    const-class p3, Ljava/util/Calendar;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne p2, p3, :cond_4

    invoke-virtual {v1}, Li/d;->close()V

    return-object p1

    :cond_4
    :try_start_1
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v1}, Li/d;->close()V

    return-object p1

    :cond_5
    invoke-virtual {v1}, Li/d;->close()V

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v3, p1, Li/a;->e:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-eq v1, v3, :cond_6

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x16

    if-ne v1, v3, :cond_7

    iget-object v1, p1, Li/a;->e:Ljava/lang/String;

    const-string v3, "yyyyMMddHHmmssSSSZ"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_6
    invoke-virtual {p1}, Li/a;->n()Ljava/text/DateFormat;

    move-result-object p1

    :try_start_2
    invoke-virtual {p1, p3}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catch_0
    nop

    :cond_7
    const-string p1, "/Date("

    invoke-virtual {p3, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, ")/"

    invoke-virtual {p3, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    const/4 p1, 0x6

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {p3, p1, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p3

    :cond_8
    const-string p1, "0000-00-00"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    const-string p1, "0000-00-00T00:00:00"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_d

    const-string p1, "0001-01-01T00:00:00+08:00"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_1

    :cond_9
    const/16 p1, 0x7c

    invoke-virtual {p3, p1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p1

    const/16 v0, 0x14

    if-le p1, v0, :cond_c

    add-int/lit8 v0, p1, 0x1

    invoke-virtual {p3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object v1

    const-string v3, "GMT"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    invoke-virtual {p3, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Li/f;

    invoke-direct {v1, p1}, Li/f;-><init>(Ljava/lang/String;)V

    :try_start_3
    invoke-virtual {v1, v2}, Li/f;->S0(Z)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, v1, Li/d;->k:Ljava/util/Calendar;

    invoke-virtual {p1, v0}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    const-class p3, Ljava/util/Calendar;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p2, p3, :cond_a

    invoke-virtual {v1}, Li/d;->close()V

    return-object p1

    :cond_a
    :try_start_4
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v1}, Li/d;->close()V

    return-object p1

    :cond_b
    invoke-virtual {v1}, Li/d;->close()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Li/d;->close()V

    throw p1

    :cond_c
    :goto_0
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p1

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    :cond_d
    :goto_1
    return-object v0

    :catchall_1
    move-exception p1

    invoke-virtual {v1}, Li/d;->close()V

    throw p1

    :cond_e
    new-instance p1, Lf/d;

    const-string p2, "parse error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method
