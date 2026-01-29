.class public final Lk/o;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;
.implements Lj/s;


# static fields
.field public static final b:Lk/o;


# instance fields
.field public a:Ljavax/xml/datatype/DatatypeFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/o;

    invoke-direct {v0}, Lk/o;-><init>()V

    sput-object v0, Lk/o;->b:Lk/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
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

    sget-object v0, Lk/v;->a:Lk/v;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, p3, v1}, Lj/b;->f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    instance-of v0, p3, Ljava/util/Calendar;

    if-eqz v0, :cond_0

    return-object p3

    :cond_0
    check-cast p3, Ljava/util/Date;

    if-nez p3, :cond_1

    return-object v1

    :cond_1
    iget-object p1, p1, Li/a;->g:Li/c;

    invoke-interface {p1}, Li/c;->l0()Ljava/util/TimeZone;

    move-result-object v0

    invoke-interface {p1}, Li/c;->f0()Ljava/util/Locale;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const-class p3, Ljavax/xml/datatype/XMLGregorianCalendar;

    if-ne p2, p3, :cond_2

    check-cast p1, Ljava/util/GregorianCalendar;

    invoke-virtual {p0, p1}, Lk/o;->f(Ljava/util/Calendar;)Ljavax/xml/datatype/XMLGregorianCalendar;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget-object v2, v0, Lk/g0;->j:Lk/a1;

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lk/a1;->E()V

    return-void

    :cond_0
    instance-of v3, v1, Ljavax/xml/datatype/XMLGregorianCalendar;

    if-eqz v3, :cond_1

    check-cast v1, Ljavax/xml/datatype/XMLGregorianCalendar;

    invoke-virtual {v1}, Ljavax/xml/datatype/XMLGregorianCalendar;->toGregorianCalendar()Ljava/util/GregorianCalendar;

    move-result-object v1

    goto :goto_0

    :cond_1
    check-cast v1, Ljava/util/Calendar;

    :goto_0
    sget-object v3, Lk/b1;->h:Lk/b1;

    invoke-virtual {v2, v3}, Lk/a1;->l(Lk/b1;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v0, Lk/b1;->d:Lk/b1;

    invoke-virtual {v2, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x27

    goto :goto_1

    :cond_2
    const/16 v0, 0x22

    :goto_1
    invoke-virtual {v2, v0}, Lk/a1;->write(I)V

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v4

    const/4 v5, 0x2

    invoke-virtual {v1, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    add-int/2addr v5, v3

    const/4 v6, 0x5

    invoke-virtual {v1, v6}, Ljava/util/Calendar;->get(I)I

    move-result v6

    const/16 v7, 0xb

    invoke-virtual {v1, v7}, Ljava/util/Calendar;->get(I)I

    move-result v7

    const/16 v8, 0xc

    invoke-virtual {v1, v8}, Ljava/util/Calendar;->get(I)I

    move-result v8

    const/16 v9, 0xd

    invoke-virtual {v1, v9}, Ljava/util/Calendar;->get(I)I

    move-result v10

    const/16 v11, 0xe

    invoke-virtual {v1, v11}, Ljava/util/Calendar;->get(I)I

    move-result v11

    const/16 v12, 0x10

    const/16 v13, 0x13

    const/16 v14, 0xa

    if-eqz v11, :cond_3

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

    goto :goto_2

    :cond_3
    const/4 v3, 0x7

    const/4 v11, 0x4

    if-nez v10, :cond_4

    if-nez v8, :cond_4

    if-nez v7, :cond_4

    const-string v7, "0000-00-00"

    invoke-virtual {v7}, Ljava/lang/String;->toCharArray()[C

    move-result-object v15

    invoke-static {v6, v14, v15}, Lm/e;->b(II[C)V

    invoke-static {v5, v3, v15}, Lm/e;->b(II[C)V

    invoke-static {v4, v11, v15}, Lm/e;->b(II[C)V

    goto :goto_2

    :cond_4
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

    :goto_2
    invoke-virtual {v2, v15}, Ljava/io/Writer;->write([C)V

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/TimeZone;->getRawOffset()I

    move-result v1

    const v3, 0x36ee80

    div-int/2addr v1, v3

    if-nez v1, :cond_5

    const-string v1, "Z"

    :goto_3
    invoke-virtual {v2, v1}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    goto :goto_5

    :cond_5
    const/4 v3, 0x0

    const-string v4, "%02d"

    if-lez v1, :cond_6

    const-string v5, "+"

    invoke-virtual {v2, v5}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v3

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_6
    const/4 v5, 0x1

    const-string v6, "-"

    invoke-virtual {v2, v6}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    new-array v5, v5, [Ljava/lang/Object;

    neg-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v5, v3

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    invoke-virtual {v2, v1}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    const-string v1, ":00"

    goto :goto_3

    :goto_5
    invoke-virtual {v2, v0}, Lk/a1;->write(I)V

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk/g0;->q(Ljava/lang/Object;)V

    :goto_6
    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final f(Ljava/util/Calendar;)Ljavax/xml/datatype/XMLGregorianCalendar;
    .locals 2

    iget-object v0, p0, Lk/o;->a:Ljavax/xml/datatype/DatatypeFactory;

    if-nez v0, :cond_0

    :try_start_0
    invoke-static {}, Ljavax/xml/datatype/DatatypeFactory;->newInstance()Ljavax/xml/datatype/DatatypeFactory;

    move-result-object v0

    iput-object v0, p0, Lk/o;->a:Ljavax/xml/datatype/DatatypeFactory;
    :try_end_0
    .catch Ljavax/xml/datatype/DatatypeConfigurationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Could not obtain an instance of DatatypeFactory."

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    iget-object v0, p0, Lk/o;->a:Ljavax/xml/datatype/DatatypeFactory;

    check-cast p1, Ljava/util/GregorianCalendar;

    invoke-virtual {v0, p1}, Ljavax/xml/datatype/DatatypeFactory;->newXMLGregorianCalendar(Ljava/util/GregorianCalendar;)Ljavax/xml/datatype/XMLGregorianCalendar;

    move-result-object p1

    return-object p1
.end method
