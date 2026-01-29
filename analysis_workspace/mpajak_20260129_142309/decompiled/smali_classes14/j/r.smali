.class public final Lj/r;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# static fields
.field public static final a:Lj/r;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/r;

    invoke-direct {v0}, Lj/r;-><init>()V

    sput-object v0, Lj/r;->a:Lj/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
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

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    const-class v3, Ljava/lang/Byte;

    const-class v4, Ljava/lang/Short;

    const-class v5, Ljava/lang/Double;

    iget-object v6, v0, Li/a;->g:Li/c;

    invoke-interface {v6}, Li/c;->q()I

    move-result v7

    const-wide/16 v8, -0x8000

    const-wide/16 v10, 0x7fff

    const-string v12, "short overflow : "

    const/16 v13, 0x10

    const/4 v14, 0x2

    if-ne v7, v14, :cond_9

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v1, v0, :cond_8

    if-ne v1, v5, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v6}, Li/c;->e()J

    move-result-wide v14

    invoke-interface {v6, v13}, Li/c;->Q(I)V

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v1, v0, :cond_6

    if-ne v1, v4, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v1, v0, :cond_4

    if-ne v1, v3, :cond_2

    goto :goto_0

    :cond_2
    const-wide/32 v0, -0x80000000

    cmp-long v2, v14, v0

    if-ltz v2, :cond_3

    const-wide/32 v0, 0x7fffffff

    cmp-long v2, v14, v0

    if-gtz v2, :cond_3

    long-to-int v0, v14

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_3
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0

    :cond_4
    :goto_0
    const-wide/16 v0, 0x7f

    cmp-long v2, v14, v0

    if-gtz v2, :cond_5

    const-wide/16 v0, -0x80

    cmp-long v2, v14, v0

    if-ltz v2, :cond_5

    long-to-int v0, v14

    int-to-byte v0, v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :cond_5
    new-instance v0, Lf/d;

    invoke-static {v12, v14, v15}, Landroidx/activity/result/a;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_1
    cmp-long v0, v14, v10

    if-gtz v0, :cond_7

    cmp-long v0, v14, v8

    if-ltz v0, :cond_7

    long-to-int v0, v14

    int-to-short v0, v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    return-object v0

    :cond_7
    new-instance v0, Lf/d;

    invoke-static {v12, v14, v15}, Landroidx/activity/result/a;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_2
    invoke-interface {v6}, Li/c;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v13}, Li/c;->Q(I)V

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-interface {v6}, Li/c;->q()I

    move-result v7

    const/4 v14, 0x3

    if-ne v7, v14, :cond_11

    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v1, v0, :cond_10

    if-ne v1, v5, :cond_a

    goto :goto_5

    :cond_a
    invoke-interface {v6}, Li/c;->U()Ljava/math/BigDecimal;

    move-result-object v0

    invoke-interface {v6, v13}, Li/c;->Q(I)V

    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v1, v2, :cond_e

    if-ne v1, v4, :cond_b

    goto :goto_4

    :cond_b
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v1, v2, :cond_d

    if-ne v1, v3, :cond_c

    goto :goto_3

    :cond_c
    return-object v0

    :cond_d
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Number;->byteValue()B

    move-result v0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    return-object v0

    :cond_e
    :goto_4
    invoke-static {v10, v11}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-gtz v1, :cond_f

    invoke-static {v8, v9}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    move-result v1

    if-ltz v1, :cond_f

    invoke-virtual {v0}, Ljava/lang/Number;->shortValue()S

    move-result v0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v0

    return-object v0

    :cond_f
    new-instance v1, Lf/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    :goto_5
    invoke-interface {v6}, Li/c;->i0()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v6, v13}, Li/c;->Q(I)V

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :cond_11
    invoke-interface {v6}, Li/c;->q()I

    move-result v7

    const/16 v8, 0x12

    const/4 v9, 0x0

    if-ne v7, v8, :cond_14

    invoke-interface {v6}, Li/c;->k0()Ljava/lang/String;

    move-result-object v7

    const-string v8, "NaN"

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v6}, Li/c;->y()V

    if-ne v1, v5, :cond_12

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v9

    goto :goto_6

    :cond_12
    const-class v0, Ljava/lang/Float;

    if-ne v1, v0, :cond_13

    const/high16 v0, 0x7fc00000    # Float.NaN

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    :cond_13
    :goto_6
    return-object v9

    :cond_14
    invoke-virtual {v0, v9}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_15

    return-object v9

    :cond_15
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v1, v6, :cond_1b

    if-ne v1, v5, :cond_16

    goto :goto_9

    :cond_16
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v1, v5, :cond_1a

    if-ne v1, v4, :cond_17

    goto :goto_8

    :cond_17
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v1, v4, :cond_19

    if-ne v1, v3, :cond_18

    goto :goto_7

    :cond_18
    invoke-static {v0}, Lm/j;->d(Ljava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object v0

    return-object v0

    :cond_19
    :goto_7
    :try_start_0
    invoke-static {v0}, Lm/j;->g(Ljava/lang/Object;)Ljava/lang/Byte;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v1, v0

    new-instance v0, Lf/d;

    const-string v3, "parseByte error, field : "

    invoke-static {v3, v2}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1a
    :goto_8
    :try_start_1
    invoke-static {v0}, Lm/j;->o(Ljava/lang/Object;)Ljava/lang/Short;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    move-object v1, v0

    new-instance v0, Lf/d;

    const-string v3, "parseShort error, field : "

    invoke-static {v3, v2}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1b
    :goto_9
    :try_start_2
    invoke-static {v0}, Lm/j;->j(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_2
    move-exception v0

    move-object v1, v0

    new-instance v0, Lf/d;

    const-string v3, "parseDouble error, field : "

    invoke-static {v3, v2}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
