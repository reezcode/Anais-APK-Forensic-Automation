.class public final Lj/p;
.super Lj/e;

# interfaces
.implements Lk/q0;
.implements Lk/t;


# static fields
.field public static final a:Lj/p;

.field public static final b:Ljava/time/format/DateTimeFormatter;

.field public static final c:Ljava/time/format/DateTimeFormatter;

.field public static final d:Ljava/time/format/DateTimeFormatter;

.field public static final e:Ljava/time/format/DateTimeFormatter;

.field public static final f:Ljava/time/format/DateTimeFormatter;

.field public static final g:Ljava/time/format/DateTimeFormatter;

.field public static final h:Ljava/time/format/DateTimeFormatter;

.field public static final i:Ljava/time/format/DateTimeFormatter;

.field public static final j:Ljava/time/format/DateTimeFormatter;

.field public static final k:Ljava/time/format/DateTimeFormatter;

.field public static final l:Ljava/time/format/DateTimeFormatter;

.field public static final m:Ljava/time/format/DateTimeFormatter;

.field public static final n:Ljava/time/format/DateTimeFormatter;

.field public static final o:Ljava/time/format/DateTimeFormatter;

.field public static final p:Ljava/time/format/DateTimeFormatter;

.field public static final q:Ljava/time/format/DateTimeFormatter;

.field public static final r:Ljava/time/format/DateTimeFormatter;

.field public static final s:Ljava/time/format/DateTimeFormatter;

.field public static final t:Ljava/time/format/DateTimeFormatter;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj/p;

    invoke-direct {v0}, Lj/p;-><init>()V

    sput-object v0, Lj/p;->a:Lj/p;

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->b:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyy/MM/dd HH:mm:ss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->c:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyy\u5e74M\u6708d\u65e5 HH:mm:ss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->d:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyy\u5e74M\u6708d\u65e5 H\u65f6m\u5206s\u79d2"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->e:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyy\ub144M\uc6d4d\uc77c HH:mm:ss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->f:Ljava/time/format/DateTimeFormatter;

    const-string v1, "MM/dd/yyyy HH:mm:ss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->g:Ljava/time/format/DateTimeFormatter;

    const-string v1, "dd/MM/yyyy HH:mm:ss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->h:Ljava/time/format/DateTimeFormatter;

    const-string v1, "dd.MM.yyyy HH:mm:ss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->i:Ljava/time/format/DateTimeFormatter;

    const-string v1, "dd-MM-yyyy HH:mm:ss"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->j:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyyMMdd"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->k:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyy/MM/dd"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->l:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyy\u5e74M\u6708d\u65e5"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->m:Ljava/time/format/DateTimeFormatter;

    const-string v1, "yyyy\ub144M\uc6d4d\uc77c"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->n:Ljava/time/format/DateTimeFormatter;

    const-string v1, "MM/dd/yyyy"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->o:Ljava/time/format/DateTimeFormatter;

    const-string v1, "dd/MM/yyyy"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->p:Ljava/time/format/DateTimeFormatter;

    const-string v1, "dd.MM.yyyy"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->q:Ljava/time/format/DateTimeFormatter;

    const-string v1, "dd-MM-yyyy"

    invoke-static {v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v1

    sput-object v1, Lj/p;->r:Ljava/time/format/DateTimeFormatter;

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-static {}, Ljava/time/ZoneId;->systemDefault()Ljava/time/ZoneId;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/time/format/DateTimeFormatter;->withZone(Ljava/time/ZoneId;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lj/p;->s:Ljava/time/format/DateTimeFormatter;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss"

    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    sput-object v0, Lj/p;->t:Ljava/time/format/DateTimeFormatter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lj/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lk/g0;Ljava/lang/Object;Lk/j;)V
    .locals 1

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    iget-object p3, p3, Lk/j;->b:Ljava/lang/String;

    check-cast p2, Ljava/time/temporal/TemporalAccessor;

    const-string v0, "yyyy-MM-dd\'T\'HH:mm:ss"

    if-ne p3, v0, :cond_0

    sget-object p3, Lj/p;->t:Ljava/time/format/DateTimeFormatter;

    goto :goto_0

    :cond_0
    invoke-static {p3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p3

    :goto_0
    invoke-virtual {p3, p2}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/a1;->J(Ljava/lang/String;)V

    return-void
.end method

.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 4

    iget-object p3, p1, Lk/g0;->j:Lk/a1;

    if-nez p2, :cond_0

    invoke-virtual {p3}, Lk/a1;->E()V

    goto :goto_2

    :cond_0
    if-nez p4, :cond_1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    :cond_1
    const-class v0, Ljava/time/LocalDateTime;

    if-ne p4, v0, :cond_9

    sget-object p4, Lk/b1;->h:Lk/b1;

    iget v0, p4, Lk/b1;->b:I

    move-object v1, p2

    check-cast v1, Ljava/time/LocalDateTime;

    iget-object v2, p1, Lk/g0;->m:Ljava/text/SimpleDateFormat;

    instance-of v3, v2, Ljava/text/SimpleDateFormat;

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss"

    if-nez v2, :cond_3

    and-int/2addr p5, v0

    if-nez p5, :cond_4

    :cond_3
    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    invoke-virtual {p1, p4}, Lk/a1;->l(Lk/b1;)Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    move-object v2, v3

    :cond_5
    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getNano()I

    move-result p1

    if-eqz p1, :cond_6

    if-eqz v2, :cond_9

    :cond_6
    if-nez v2, :cond_7

    sget-object v2, Lf/a;->f:Ljava/lang/String;

    :cond_7
    if-ne v2, v3, :cond_8

    sget-object p1, Lj/p;->t:Ljava/time/format/DateTimeFormatter;

    goto :goto_1

    :cond_8
    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object p1

    :goto_1
    invoke-virtual {p1, v1}, Ljava/time/format/DateTimeFormatter;->format(Ljava/time/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lk/a1;->J(Ljava/lang/String;)V

    goto :goto_2

    :cond_9
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Lk/a1;->J(Ljava/lang/String;)V

    :goto_2
    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 16
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

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p1

    move-object/from16 v3, p4

    iget-object v2, v2, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v4

    const/4 v5, 0x0

    const/16 v6, 0x8

    if-ne v4, v6, :cond_0

    invoke-interface {v2}, Li/c;->y()V

    return-object v5

    :cond_0
    invoke-interface {v2}, Li/c;->q()I

    move-result v4

    const/4 v7, 0x4

    if-ne v4, v7, :cond_32

    invoke-interface {v2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Li/c;->y()V

    if-eqz v3, :cond_2

    const-string v2, "yyyy-MM-dd HH:mm:ss"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lj/p;->b:Ljava/time/format/DateTimeFormatter;

    goto :goto_0

    :cond_1
    invoke-static/range {p4 .. p4}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    goto :goto_0

    :cond_2
    move-object v2, v5

    :goto_0
    const-string v3, ""

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    return-object v5

    :cond_3
    const-class v3, Ljava/time/LocalDateTime;

    const/16 v10, 0x3a

    const/16 v11, 0x10

    const/16 v12, 0xd

    const/4 v13, 0x7

    const/16 v14, 0x13

    const-string v15, "AU"

    const-string v5, "BR"

    const-string v8, "US"

    const/16 v9, 0xa

    if-ne v1, v3, :cond_15

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-eq v1, v9, :cond_14

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v6, :cond_4

    goto/16 :goto_6

    :cond_4
    if-nez v2, :cond_12

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v14, :cond_f

    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-virtual {v4, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v12, v10, :cond_f

    if-ne v11, v10, :cond_f

    const/16 v10, 0x2d

    if-ne v1, v10, :cond_6

    if-ne v3, v10, :cond_6

    const/16 v11, 0x54

    if-ne v6, v11, :cond_5

    sget-object v2, Ljava/time/format/DateTimeFormatter;->ISO_LOCAL_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    goto/16 :goto_4

    :cond_5
    const/16 v1, 0x20

    if-ne v6, v1, :cond_f

    goto :goto_1

    :cond_6
    if-ne v1, v10, :cond_7

    if-ne v3, v10, :cond_7

    :goto_1
    sget-object v2, Lj/p;->b:Ljava/time/format/DateTimeFormatter;

    goto/16 :goto_4

    :cond_7
    const/16 v6, 0x2f

    if-ne v1, v6, :cond_8

    if-ne v3, v6, :cond_8

    sget-object v2, Lj/p;->c:Ljava/time/format/DateTimeFormatter;

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/4 v10, 0x1

    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/4 v10, 0x2

    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/4 v12, 0x3

    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/4 v13, 0x5

    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v10, v6, :cond_d

    if-ne v13, v6, :cond_d

    add-int/lit8 v3, v3, -0x30

    mul-int/lit8 v3, v3, 0xa

    add-int/lit8 v11, v11, -0x30

    add-int/2addr v11, v3

    add-int/lit8 v12, v12, -0x30

    mul-int/lit8 v12, v12, 0xa

    add-int/lit8 v1, v1, -0x30

    add-int/2addr v1, v12

    const/16 v3, 0xc

    if-le v11, v3, :cond_9

    goto :goto_3

    :cond_9
    if-le v1, v3, :cond_a

    goto :goto_2

    :cond_a
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_2
    sget-object v2, Lj/p;->g:Ljava/time/format/DateTimeFormatter;

    goto :goto_4

    :cond_b
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_f

    :cond_c
    :goto_3
    sget-object v2, Lj/p;->h:Ljava/time/format/DateTimeFormatter;

    goto :goto_4

    :cond_d
    const/16 v1, 0x2e

    if-ne v10, v1, :cond_e

    if-ne v13, v1, :cond_e

    sget-object v2, Lj/p;->i:Ljava/time/format/DateTimeFormatter;

    goto :goto_4

    :cond_e
    const/16 v1, 0x2d

    if-ne v10, v1, :cond_f

    if-ne v13, v1, :cond_f

    sget-object v2, Lj/p;->j:Ljava/time/format/DateTimeFormatter;

    :cond_f
    :goto_4
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v3, 0x11

    if-lt v1, v3, :cond_12

    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x5e74

    if-ne v1, v3, :cond_11

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x79d2

    if-ne v1, v2, :cond_10

    sget-object v2, Lj/p;->e:Ljava/time/format/DateTimeFormatter;

    goto :goto_5

    :cond_10
    sget-object v2, Lj/p;->d:Ljava/time/format/DateTimeFormatter;

    goto :goto_5

    :cond_11
    const v3, 0xb144

    if-ne v1, v3, :cond_12

    sget-object v2, Lj/p;->f:Ljava/time/format/DateTimeFormatter;

    :cond_12
    :goto_5
    if-nez v2, :cond_13

    invoke-static {v4}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDateTime;

    move-result-object v1

    goto :goto_7

    :cond_13
    invoke-static {v4, v2}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    move-result-object v1

    goto :goto_7

    :cond_14
    :goto_6
    invoke-virtual {v0, v4, v2}, Lj/p;->g(Ljava/lang/String;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    move-result-object v1

    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    invoke-static {v1, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    move-result-object v1

    :goto_7
    return-object v1

    :cond_15
    const-class v3, Ljava/time/LocalDate;

    const/16 v6, 0x17

    if-ne v1, v3, :cond_17

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v6, :cond_16

    invoke-static {v4}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDateTime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getYear()I

    move-result v2

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getMonthValue()I

    move-result v3

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getDayOfMonth()I

    move-result v1

    invoke-static {v2, v3, v1}, Ljava/time/LocalDate;->of(III)Ljava/time/LocalDate;

    move-result-object v1

    goto :goto_8

    :cond_16
    invoke-virtual {v0, v4, v2}, Lj/p;->g(Ljava/lang/String;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    move-result-object v1

    :goto_8
    return-object v1

    :cond_17
    const-class v3, Ljava/time/LocalTime;

    if-ne v1, v3, :cond_19

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v1, v6, :cond_18

    invoke-static {v4}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDateTime;

    move-result-object v1

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getHour()I

    move-result v2

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getMinute()I

    move-result v3

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getSecond()I

    move-result v4

    invoke-virtual {v1}, Ljava/time/LocalDateTime;->getNano()I

    move-result v1

    invoke-static {v2, v3, v4, v1}, Ljava/time/LocalTime;->of(IIII)Ljava/time/LocalTime;

    move-result-object v1

    goto :goto_9

    :cond_18
    invoke-static {v4}, Ljava/time/LocalTime;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalTime;

    move-result-object v1

    :goto_9
    return-object v1

    :cond_19
    const-class v3, Ljava/time/ZonedDateTime;

    if-ne v1, v3, :cond_2b

    sget-object v1, Lj/p;->b:Ljava/time/format/DateTimeFormatter;

    if-ne v2, v1, :cond_1a

    sget-object v2, Lj/p;->s:Ljava/time/format/DateTimeFormatter;

    :cond_1a
    if-nez v2, :cond_29

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v14, :cond_25

    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-virtual {v4, v9}, Ljava/lang/String;->charAt(I)C

    move-result v13

    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-virtual {v4, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-ne v12, v10, :cond_25

    if-ne v11, v10, :cond_25

    const/16 v10, 0x2d

    if-ne v3, v10, :cond_1c

    if-ne v6, v10, :cond_1c

    const/16 v11, 0x54

    if-ne v13, v11, :cond_1b

    sget-object v1, Ljava/time/format/DateTimeFormatter;->ISO_LOCAL_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    goto/16 :goto_c

    :cond_1b
    const/16 v3, 0x20

    if-ne v13, v3, :cond_25

    goto/16 :goto_c

    :cond_1c
    if-ne v3, v10, :cond_1d

    if-ne v6, v10, :cond_1d

    goto/16 :goto_c

    :cond_1d
    const/16 v1, 0x2f

    if-ne v3, v1, :cond_1e

    if-ne v6, v1, :cond_1e

    sget-object v1, Lj/p;->c:Ljava/time/format/DateTimeFormatter;

    goto/16 :goto_c

    :cond_1e
    const/4 v6, 0x0

    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/4 v10, 0x1

    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/4 v10, 0x2

    invoke-virtual {v4, v10}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/4 v12, 0x3

    invoke-virtual {v4, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/4 v13, 0x5

    invoke-virtual {v4, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-ne v10, v1, :cond_23

    if-ne v13, v1, :cond_23

    add-int/lit8 v6, v6, -0x30

    mul-int/lit8 v6, v6, 0xa

    add-int/lit8 v11, v11, -0x30

    add-int/2addr v11, v6

    add-int/lit8 v12, v12, -0x30

    mul-int/lit8 v12, v12, 0xa

    add-int/lit8 v3, v3, -0x30

    add-int/2addr v3, v12

    const/16 v1, 0xc

    if-le v11, v1, :cond_1f

    goto :goto_b

    :cond_1f
    if-le v3, v1, :cond_20

    goto :goto_a

    :cond_20
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_21

    :goto_a
    sget-object v1, Lj/p;->g:Ljava/time/format/DateTimeFormatter;

    goto :goto_c

    :cond_21
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_25

    :cond_22
    :goto_b
    sget-object v1, Lj/p;->h:Ljava/time/format/DateTimeFormatter;

    goto :goto_c

    :cond_23
    const/16 v1, 0x2e

    if-ne v10, v1, :cond_24

    if-ne v13, v1, :cond_24

    sget-object v1, Lj/p;->i:Ljava/time/format/DateTimeFormatter;

    goto :goto_c

    :cond_24
    const/16 v1, 0x2d

    if-ne v10, v1, :cond_25

    if-ne v13, v1, :cond_25

    sget-object v1, Lj/p;->j:Ljava/time/format/DateTimeFormatter;

    goto :goto_c

    :cond_25
    move-object v1, v2

    :goto_c
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x11

    if-lt v2, v3, :cond_28

    invoke-virtual {v4, v7}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x5e74

    if-ne v2, v3, :cond_27

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v4, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x79d2

    if-ne v1, v2, :cond_26

    sget-object v2, Lj/p;->e:Ljava/time/format/DateTimeFormatter;

    goto :goto_d

    :cond_26
    sget-object v2, Lj/p;->d:Ljava/time/format/DateTimeFormatter;

    goto :goto_d

    :cond_27
    const v3, 0xb144

    if-ne v2, v3, :cond_28

    sget-object v2, Lj/p;->f:Ljava/time/format/DateTimeFormatter;

    goto :goto_d

    :cond_28
    move-object v2, v1

    :cond_29
    :goto_d
    if-nez v2, :cond_2a

    invoke-static {v4}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/ZonedDateTime;

    move-result-object v1

    goto :goto_e

    :cond_2a
    invoke-static {v4, v2}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v1

    :goto_e
    return-object v1

    :cond_2b
    const-class v2, Ljava/time/OffsetDateTime;

    if-ne v1, v2, :cond_2c

    invoke-static {v4}, Ljava/time/OffsetDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/OffsetDateTime;

    move-result-object v1

    return-object v1

    :cond_2c
    const-class v2, Ljava/time/OffsetTime;

    if-ne v1, v2, :cond_2d

    invoke-static {v4}, Ljava/time/OffsetTime;->parse(Ljava/lang/CharSequence;)Ljava/time/OffsetTime;

    move-result-object v1

    return-object v1

    :cond_2d
    const-class v2, Ljava/time/ZoneId;

    if-ne v1, v2, :cond_2e

    invoke-static {v4}, Ljava/time/ZoneId;->of(Ljava/lang/String;)Ljava/time/ZoneId;

    move-result-object v1

    return-object v1

    :cond_2e
    const-class v2, Ljava/time/Period;

    if-ne v1, v2, :cond_2f

    invoke-static {v4}, Ljava/time/Period;->parse(Ljava/lang/CharSequence;)Ljava/time/Period;

    move-result-object v1

    return-object v1

    :cond_2f
    const-class v2, Ljava/time/Duration;

    if-ne v1, v2, :cond_30

    invoke-static {v4}, Ljava/time/Duration;->parse(Ljava/lang/CharSequence;)Ljava/time/Duration;

    move-result-object v1

    return-object v1

    :cond_30
    const-class v2, Ljava/time/Instant;

    if-ne v1, v2, :cond_31

    invoke-static {v4}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    move-result-object v1

    return-object v1

    :cond_31
    const/4 v1, 0x0

    return-object v1

    :cond_32
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v1
.end method

.method public final g(Ljava/lang/String;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;
    .locals 9

    if-nez p2, :cond_a

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    sget-object p2, Lj/p;->k:Ljava/time/format/DateTimeFormatter;

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    const/16 v2, 0xa

    if-ne v0, v2, :cond_8

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v3, 0x7

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2f

    if-ne v0, v4, :cond_1

    if-ne v3, v4, :cond_1

    sget-object p2, Lj/p;->l:Ljava/time/format/DateTimeFormatter;

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/4 v5, 0x1

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/4 v6, 0x2

    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/4 v7, 0x3

    invoke-virtual {p1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/4 v8, 0x5

    invoke-virtual {p1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-ne v6, v4, :cond_6

    if-ne v8, v4, :cond_6

    add-int/lit8 v3, v3, -0x30

    mul-int/lit8 v3, v3, 0xa

    add-int/lit8 v5, v5, -0x30

    add-int/2addr v5, v3

    add-int/lit8 v7, v7, -0x30

    mul-int/lit8 v7, v7, 0xa

    add-int/lit8 v0, v0, -0x30

    add-int/2addr v0, v7

    const/16 v2, 0xc

    if-le v5, v2, :cond_2

    goto :goto_1

    :cond_2
    if-le v0, v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    const-string v2, "US"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :goto_0
    sget-object p2, Lj/p;->o:Ljava/time/format/DateTimeFormatter;

    goto :goto_2

    :cond_4
    const-string v2, "BR"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "AU"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    :cond_5
    :goto_1
    sget-object p2, Lj/p;->p:Ljava/time/format/DateTimeFormatter;

    goto :goto_2

    :cond_6
    const/16 v0, 0x2e

    if-ne v6, v0, :cond_7

    if-ne v8, v0, :cond_7

    sget-object p2, Lj/p;->q:Ljava/time/format/DateTimeFormatter;

    goto :goto_2

    :cond_7
    const/16 v0, 0x2d

    if-ne v6, v0, :cond_8

    if-ne v8, v0, :cond_8

    sget-object p2, Lj/p;->r:Ljava/time/format/DateTimeFormatter;

    :cond_8
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v2, 0x9

    if-lt v0, v2, :cond_a

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x5e74

    if-ne v0, v1, :cond_9

    sget-object p2, Lj/p;->m:Ljava/time/format/DateTimeFormatter;

    goto :goto_3

    :cond_9
    const v1, 0xb144

    if-ne v0, v1, :cond_a

    sget-object p2, Lj/p;->n:Ljava/time/format/DateTimeFormatter;

    :cond_a
    :goto_3
    if-nez p2, :cond_b

    invoke-static {p1}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object p1

    goto :goto_4

    :cond_b
    invoke-static {p1, p2}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    move-result-object p1

    :goto_4
    return-object p1
.end method
