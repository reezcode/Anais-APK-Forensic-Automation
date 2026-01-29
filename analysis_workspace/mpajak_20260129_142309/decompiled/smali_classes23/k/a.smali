.class public final Lk/a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk/a$a;
    }
.end annotation


# static fields
.field public static final c:Ljava/lang/String;

.field public static final d:Ljava/lang/String;

.field public static final e:Ljava/lang/String;

.field public static final f:Ljava/lang/String;

.field public static final g:Ljava/lang/String;

.field public static final h:Ljava/lang/String;

.field public static final i:Ljava/lang/String;

.field public static final j:Ljava/lang/String;


# instance fields
.field public final a:Lm/a;

.field public final b:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-class v0, Lk/h0;

    const-class v1, Lk/g0;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lk/a;->c:Ljava/lang/String;

    const-class v1, Lk/q0;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lk/a;->d:Ljava/lang/String;

    const-string v2, "L"

    const-string v3, ";"

    invoke-static {v2, v1, v3}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lk/a;->e:Ljava/lang/String;

    const-class v1, Lk/a1;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lk/a;->f:Ljava/lang/String;

    invoke-static {v2, v1, v3}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lk/a;->g:Ljava/lang/String;

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lk/a;->h:Ljava/lang/String;

    invoke-static {v0}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    const-class v0, Lk/v0;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lk/a;->i:Ljava/lang/String;

    const-class v0, Lk/z0;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lk/a;->j:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lm/a;

    invoke-direct {v0}, Lm/a;-><init>()V

    iput-object v0, p0, Lk/a;->a:Lm/a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lk/a;->b:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method


# virtual methods
.method public final a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V
    .locals 28

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    iget-boolean v4, v1, Lm/c;->o:Z

    const/16 v5, 0xb6

    const/16 v6, 0x19

    if-eqz v4, :cond_0

    const-string v4, "out"

    invoke-virtual {v2, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v6, v4}, Lh/h;->k(II)V

    sget-object v4, Lk/b1;->m:Lk/b1;

    iget v4, v4, Lk/b1;->b:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v6, "isEnabled"

    const-string v7, "(I)Z"

    invoke-virtual {v0, v5, v4, v6, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x9a

    invoke-virtual {v0, v4, v3}, Lh/h;->e(ILh/f;)V

    :cond_0
    iget-boolean v4, v2, Lk/a$a;->d:Z

    const-string v5, "double"

    const-string v6, "float"

    const-string v7, "long"

    const-string v8, "int"

    const-string v9, "short"

    const-string v10, "byte"

    const-string v11, "boolean"

    const/16 v12, 0x99

    const/16 v13, 0x16

    const/16 v14, 0x15

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    const-string v15, "notWriteDefaultValue"

    invoke-virtual {v2, v15}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v0, v14, v15}, Lh/h;->k(II)V

    invoke-virtual {v0, v12, v4}, Lh/h;->e(ILh/f;)V

    iget-object v12, v1, Lm/c;->f:Ljava/lang/Class;

    sget-object v15, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v12, v15, :cond_2

    move-object v12, v11

    goto :goto_0

    :cond_2
    sget-object v15, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v12, v15, :cond_3

    move-object v12, v10

    goto :goto_0

    :cond_3
    sget-object v15, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v12, v15, :cond_4

    move-object v12, v9

    goto :goto_0

    :cond_4
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v12, v15, :cond_5

    move-object v12, v8

    :goto_0
    invoke-virtual {v2, v12}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v0, v14, v12}, Lh/h;->k(II)V

    goto :goto_2

    :cond_5
    sget-object v14, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v12, v14, :cond_6

    invoke-virtual {v2, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v0, v13, v12}, Lh/h;->k(II)V

    const/16 v12, 0x9

    invoke-virtual {v0, v12}, Lh/h;->c(I)V

    const/16 v12, 0x94

    goto :goto_1

    :cond_6
    sget-object v13, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v12, v13, :cond_7

    invoke-virtual {v2, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    const/16 v13, 0x17

    invoke-virtual {v0, v13, v12}, Lh/h;->k(II)V

    const/16 v12, 0xb

    invoke-virtual {v0, v12}, Lh/h;->c(I)V

    const/16 v12, 0x95

    goto :goto_1

    :cond_7
    sget-object v13, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v12, v13, :cond_8

    invoke-virtual {v2, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    const/16 v13, 0x18

    invoke-virtual {v0, v13, v12}, Lh/h;->k(II)V

    const/16 v12, 0xe

    invoke-virtual {v0, v12}, Lh/h;->c(I)V

    const/16 v12, 0x97

    :goto_1
    invoke-virtual {v0, v12}, Lh/h;->c(I)V

    :goto_2
    const/16 v12, 0x99

    invoke-virtual {v0, v12, v3}, Lh/h;->e(ILh/f;)V

    :cond_8
    invoke-virtual {v0, v4}, Lh/h;->f(Lh/f;)V

    :goto_3
    iget-boolean v4, v2, Lk/a$a;->d:Z

    if-eqz v4, :cond_9

    return-void

    :cond_9
    iget-object v4, v1, Lm/c;->f:Ljava/lang/Class;

    const/4 v12, 0x0

    const/16 v13, 0x19

    invoke-virtual {v0, v13, v12}, Lh/h;->k(II)V

    const/4 v12, 0x1

    invoke-virtual {v0, v13, v12}, Lh/h;->k(II)V

    const/4 v12, 0x2

    invoke-virtual {v0, v13, v12}, Lh/h;->k(II)V

    const/4 v12, 0x6

    invoke-virtual {v0, v13, v12}, Lh/h;->k(II)V

    sget-object v12, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    const-string v13, "(B)Ljava/lang/Byte;"

    const-string v14, "java/lang/Byte"

    const-string v15, "valueOf"

    const-string v16, "(C)Ljava/lang/Character;"

    const-string v17, "java/lang/Character"

    move-object/from16 v18, v13

    const-string v13, "char"

    const-string v19, "(I)Ljava/lang/Integer;"

    const-string v20, "java/lang/Integer"

    const-string v21, "(S)Ljava/lang/Short;"

    const-string v22, "java/lang/Short"

    if-ne v4, v12, :cond_a

    invoke-virtual {v2, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x15

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    move-object v4, v14

    move-object/from16 v23, v4

    move-object/from16 v12, v18

    goto/16 :goto_5

    :cond_a
    sget-object v12, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v4, v12, :cond_b

    invoke-virtual {v2, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x15

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    move-object/from16 v23, v14

    move-object/from16 v12, v21

    move-object/from16 v4, v22

    goto/16 :goto_5

    :cond_b
    sget-object v12, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v4, v12, :cond_c

    invoke-virtual {v2, v8}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x15

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    move-object/from16 v23, v14

    move-object/from16 v12, v19

    move-object/from16 v4, v20

    goto :goto_5

    :cond_c
    sget-object v12, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v4, v12, :cond_d

    invoke-virtual {v2, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x15

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    move-object/from16 v23, v14

    move-object/from16 v12, v16

    move-object/from16 v4, v17

    goto :goto_5

    :cond_d
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v4, v12, :cond_e

    invoke-virtual {v2, v7}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x16

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    const-string v4, "java/lang/Long"

    const-string v12, "(J)Ljava/lang/Long;"

    :goto_4
    move-object/from16 v23, v14

    goto :goto_5

    :cond_e
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v4, v12, :cond_f

    invoke-virtual {v2, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x17

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    const-string v4, "java/lang/Float"

    const-string v12, "(F)Ljava/lang/Float;"

    goto :goto_4

    :cond_f
    sget-object v12, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v4, v12, :cond_10

    invoke-virtual {v2, v5}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x18

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    const-string v4, "java/lang/Double"

    const-string v12, "(D)Ljava/lang/Double;"

    goto :goto_4

    :cond_10
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v4, v12, :cond_11

    invoke-virtual {v2, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x15

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    const-string v4, "java/lang/Boolean"

    const-string v12, "(Z)Ljava/lang/Boolean;"

    goto :goto_4

    :goto_5
    const/16 v14, 0xb8

    invoke-virtual {v0, v14, v4, v15, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_7

    :cond_11
    move-object/from16 v23, v14

    const-class v12, Ljava/math/BigDecimal;

    if-ne v4, v12, :cond_12

    const-string v4, "decimal"

    goto :goto_6

    :cond_12
    const-class v12, Ljava/lang/String;

    if-ne v4, v12, :cond_13

    const-string v4, "string"

    goto :goto_6

    :cond_13
    invoke-virtual {v4}, Ljava/lang/Class;->isEnum()Z

    move-result v12

    if-eqz v12, :cond_14

    const-string v4, "enum"

    goto :goto_6

    :cond_14
    const-class v12, Ljava/util/List;

    invoke-virtual {v12, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_15

    const-string v4, "list"

    goto :goto_6

    :cond_15
    const-string v4, "object"

    :goto_6
    invoke-virtual {v2, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v12, 0x19

    invoke-virtual {v0, v12, v4}, Lh/h;->k(II)V

    :goto_7
    sget-object v4, Lk/a;->h:Ljava/lang/String;

    const-string v12, "(L"

    invoke-static {v12}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    move-object/from16 v24, v12

    sget-object v12, Lk/a;->c:Ljava/lang/String;

    move-object/from16 v25, v15

    const-string v15, ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z"

    invoke-static {v14, v12, v15}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v15, "apply"

    move-object/from16 v26, v12

    const/16 v12, 0xb6

    invoke-virtual {v0, v12, v4, v15, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v12, 0x99

    invoke-virtual {v0, v12, v3}, Lh/h;->e(ILh/f;)V

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    const-string v15, "hasNameFilters"

    invoke-virtual {v2, v15}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v15

    const/16 v3, 0x15

    invoke-virtual {v0, v3, v15}, Lh/h;->k(II)V

    invoke-virtual {v0, v12, v14}, Lh/h;->e(ILh/f;)V

    iget-object v3, v1, Lm/c;->f:Ljava/lang/Class;

    const/16 v12, 0x19

    const/4 v15, 0x0

    invoke-virtual {v0, v12, v15}, Lh/h;->k(II)V

    const/4 v15, 0x1

    invoke-virtual {v0, v12, v15}, Lh/h;->k(II)V

    const/4 v15, 0x2

    invoke-virtual {v0, v12, v15}, Lh/h;->k(II)V

    const/4 v15, 0x6

    invoke-virtual {v0, v12, v15}, Lh/h;->k(II)V

    sget-object v12, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v3, v12, :cond_16

    invoke-virtual {v2, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v12, 0x15

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    move-object/from16 v12, v18

    move-object/from16 v3, v23

    goto/16 :goto_8

    :cond_16
    const/16 v12, 0x15

    sget-object v15, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v3, v15, :cond_17

    invoke-virtual {v2, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    move-object/from16 v12, v21

    move-object/from16 v3, v22

    goto :goto_8

    :cond_17
    sget-object v15, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v3, v15, :cond_18

    invoke-virtual {v2, v8}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    move-object/from16 v12, v19

    move-object/from16 v3, v20

    goto :goto_8

    :cond_18
    sget-object v15, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v3, v15, :cond_19

    invoke-virtual {v2, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    move-object/from16 v12, v16

    move-object/from16 v3, v17

    goto :goto_8

    :cond_19
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v3, v12, :cond_1a

    invoke-virtual {v2, v7}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v3

    const/16 v12, 0x16

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    const-string v3, "java/lang/Long"

    const-string v12, "(J)Ljava/lang/Long;"

    goto :goto_8

    :cond_1a
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v3, v12, :cond_1b

    invoke-virtual {v2, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v12, 0x17

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    const-string v3, "java/lang/Float"

    const-string v12, "(F)Ljava/lang/Float;"

    goto :goto_8

    :cond_1b
    sget-object v12, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v3, v12, :cond_1c

    invoke-virtual {v2, v5}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v3

    const/16 v12, 0x18

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    const-string v3, "java/lang/Double"

    const-string v12, "(D)Ljava/lang/Double;"

    goto :goto_8

    :cond_1c
    sget-object v12, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v3, v12, :cond_1d

    invoke-virtual {v2, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v12, 0x15

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    const-string v3, "java/lang/Boolean"

    const-string v12, "(Z)Ljava/lang/Boolean;"

    :goto_8
    const/16 v15, 0xb8

    move-object/from16 v27, v11

    move-object/from16 v11, v25

    invoke-virtual {v0, v15, v3, v11, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    :cond_1d
    move-object/from16 v27, v11

    move-object/from16 v11, v25

    const-class v12, Ljava/math/BigDecimal;

    if-ne v3, v12, :cond_1e

    const-string v3, "decimal"

    goto :goto_9

    :cond_1e
    const-class v12, Ljava/lang/String;

    if-ne v3, v12, :cond_1f

    const-string v3, "string"

    goto :goto_9

    :cond_1f
    invoke-virtual {v3}, Ljava/lang/Class;->isEnum()Z

    move-result v12

    if-eqz v12, :cond_20

    const-string v3, "enum"

    goto :goto_9

    :cond_20
    const-class v12, Ljava/util/List;

    invoke-virtual {v12, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_21

    const-string v3, "list"

    goto :goto_9

    :cond_21
    const-string v3, "object"

    :goto_9
    invoke-virtual {v2, v3}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v12, 0x19

    invoke-virtual {v0, v12, v3}, Lh/h;->k(II)V

    :goto_a
    const-string v3, ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;"

    move-object/from16 v12, v24

    move-object/from16 v15, v26

    invoke-static {v12, v15, v3}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v15, "processKey"

    const/16 v12, 0xb6

    invoke-virtual {v0, v12, v4, v15, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x3a

    const/4 v4, 0x6

    invoke-virtual {v0, v3, v4}, Lh/h;->k(II)V

    invoke-virtual {v0, v14}, Lh/h;->f(Lh/f;)V

    const-class v3, Lk/j;

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    iget-object v12, v1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v12}, Ljava/lang/Class;->isPrimitive()Z

    move-result v14

    if-eqz v14, :cond_22

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    const-string v15, "checkValue"

    invoke-virtual {v2, v15}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v25, v11

    const/16 v11, 0x15

    invoke-virtual {v0, v11, v15}, Lh/h;->k(II)V

    const/16 v11, 0x9a

    invoke-virtual {v0, v11, v14}, Lh/h;->e(ILh/f;)V

    const/4 v11, 0x1

    invoke-virtual {v0, v11}, Lh/h;->c(I)V

    const/16 v11, 0x59

    invoke-virtual {v0, v11}, Lh/h;->c(I)V

    const/4 v11, 0x7

    const/16 v15, 0x3a

    invoke-virtual {v0, v15, v11}, Lh/h;->k(II)V

    const/16 v11, 0x8

    invoke-virtual {v0, v15, v11}, Lh/h;->k(II)V

    const/16 v11, 0xa7

    invoke-virtual {v0, v11, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v14}, Lh/h;->f(Lh/f;)V

    goto :goto_b

    :cond_22
    move-object/from16 v25, v11

    :goto_b
    const/4 v11, 0x0

    const/16 v14, 0x19

    invoke-virtual {v0, v14, v11}, Lh/h;->k(II)V

    const/4 v15, 0x1

    invoke-virtual {v0, v14, v15}, Lh/h;->k(II)V

    invoke-virtual {v0, v14, v11}, Lh/h;->k(II)V

    iget-object v14, v1, Lm/c;->b:Ljava/lang/String;

    iget-object v15, v2, Lk/a$a;->a:[Lm/c;

    array-length v15, v15

    :goto_c
    if-ge v11, v15, :cond_24

    iget-object v1, v2, Lk/a$a;->a:[Lm/c;

    aget-object v1, v1, v11

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    goto :goto_d

    :cond_23
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v1, p2

    goto :goto_c

    :cond_24
    const/4 v11, -0x1

    :goto_d
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v1, Lk/a;->h:Ljava/lang/String;

    const-string v11, "(I)"

    invoke-static {v11}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v14, "getBeanContext"

    const/16 v15, 0xb6

    invoke-virtual {v0, v15, v1, v14, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x2

    const/16 v14, 0x19

    invoke-virtual {v0, v14, v11}, Lh/h;->k(II)V

    const/4 v11, 0x6

    invoke-virtual {v0, v14, v11}, Lh/h;->k(II)V

    sget-object v11, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v12, v11, :cond_25

    invoke-virtual {v2, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x15

    invoke-virtual {v0, v6, v5}, Lh/h;->k(II)V

    move-object/from16 v13, v18

    move-object/from16 v14, v23

    goto/16 :goto_e

    :cond_25
    const/16 v10, 0x15

    sget-object v11, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v12, v11, :cond_26

    invoke-virtual {v2, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v10, v5}, Lh/h;->k(II)V

    move-object/from16 v13, v21

    move-object/from16 v14, v22

    goto/16 :goto_e

    :cond_26
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v12, v9, :cond_27

    invoke-virtual {v2, v8}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v10, v5}, Lh/h;->k(II)V

    move-object/from16 v13, v19

    move-object/from16 v14, v20

    goto :goto_e

    :cond_27
    sget-object v8, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v12, v8, :cond_28

    invoke-virtual {v2, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v10, v5}, Lh/h;->k(II)V

    move-object/from16 v13, v16

    move-object/from16 v14, v17

    goto :goto_e

    :cond_28
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v12, v8, :cond_29

    invoke-virtual {v2, v7}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x16

    invoke-virtual {v0, v6, v5}, Lh/h;->k(II)V

    const-string v14, "java/lang/Long"

    const-string v13, "(J)Ljava/lang/Long;"

    goto :goto_e

    :cond_29
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v12, v7, :cond_2a

    invoke-virtual {v2, v6}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x17

    invoke-virtual {v0, v6, v5}, Lh/h;->k(II)V

    const-string v14, "java/lang/Float"

    const-string v13, "(F)Ljava/lang/Float;"

    goto :goto_e

    :cond_2a
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v12, v6, :cond_2b

    invoke-virtual {v2, v5}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x18

    invoke-virtual {v0, v6, v5}, Lh/h;->k(II)V

    const-string v14, "java/lang/Double"

    const-string v13, "(D)Ljava/lang/Double;"

    goto :goto_e

    :cond_2b
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v12, v5, :cond_2c

    move-object/from16 v5, v27

    invoke-virtual {v2, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x15

    invoke-virtual {v0, v6, v5}, Lh/h;->k(II)V

    const-string v14, "java/lang/Boolean"

    const-string v13, "(Z)Ljava/lang/Boolean;"

    :goto_e
    const/16 v5, 0xb8

    move-object/from16 v6, v25

    invoke-virtual {v0, v5, v14, v6, v13}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v5, 0x59

    invoke-virtual {v0, v5}, Lh/h;->c(I)V

    const/4 v5, 0x7

    const/16 v6, 0x3a

    goto :goto_10

    :cond_2c
    const-class v5, Ljava/math/BigDecimal;

    if-ne v12, v5, :cond_2d

    const-string v5, "decimal"

    goto :goto_f

    :cond_2d
    const-class v5, Ljava/lang/String;

    if-ne v12, v5, :cond_2e

    const-string v5, "string"

    goto :goto_f

    :cond_2e
    invoke-virtual {v12}, Ljava/lang/Class;->isEnum()Z

    move-result v5

    if-eqz v5, :cond_2f

    const-string v5, "enum"

    goto :goto_f

    :cond_2f
    const-class v5, Ljava/util/List;

    invoke-virtual {v5, v12}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_30

    const-string v5, "list"

    goto :goto_f

    :cond_30
    const-string v5, "object"

    :goto_f
    invoke-virtual {v2, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v6, 0x19

    invoke-virtual {v0, v6, v5}, Lh/h;->k(II)V

    const/4 v5, 0x7

    const/16 v7, 0x3a

    invoke-virtual {v0, v7, v5}, Lh/h;->k(II)V

    :goto_10
    invoke-virtual {v0, v6, v5}, Lh/h;->k(II)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v6, v24

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v6, Lk/a;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ";"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Ljava/lang/Object;Ljava/lang/String;"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "Ljava/lang/Object;"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ")Ljava/lang/Object;"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "processValue"

    const/16 v6, 0xb6

    invoke-virtual {v0, v6, v1, v5, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x8

    const/16 v3, 0x3a

    invoke-virtual {v0, v3, v1}, Lh/h;->k(II)V

    const/4 v3, 0x7

    const/16 v5, 0x19

    invoke-virtual {v0, v5, v3}, Lh/h;->k(II)V

    invoke-virtual {v0, v5, v1}, Lh/h;->k(II)V

    const/16 v1, 0xa5

    invoke-virtual {v0, v1, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual/range {p0 .. p4}, Lk/a;->j(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    const/16 v1, 0xa7

    move-object/from16 v2, p4

    invoke-virtual {v0, v1, v2}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v4}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final b(Lh/h;Lk/a$a;Lm/c;)V
    .locals 4

    iget-object v0, p3, Lm/c;->c:Ljava/lang/reflect/Method;

    const-string v1, "entity"

    invoke-virtual {p2, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result p2

    const/16 v1, 0x19

    invoke-virtual {p1, v1, p2}, Lh/h;->k(II)V

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0xb9

    goto :goto_0

    :cond_0
    const/16 v1, 0xb6

    :goto_0
    invoke-static {p2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lm/b;->c(Ljava/lang/reflect/Method;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, p2, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object p2

    iget-object v0, p3, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_1
    iget-object p2, p3, Lm/c;->d:Ljava/lang/reflect/Field;

    const/16 v0, 0xb4

    iget-object v1, p3, Lm/c;->h:Ljava/lang/Class;

    invoke-static {v1}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v1, v2, v3}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p2

    iget-object v0, p3, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_1
    iget-object p2, p3, Lm/c;->f:Ljava/lang/Class;

    invoke-static {p2}, Lm/b;->f(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p2

    const/16 p3, 0xc0

    invoke-virtual {p1, p3, p2}, Lh/h;->j(ILjava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final c(Lk/a$a;Lh/h;Lm/c;)V
    .locals 10

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    iget-object v3, p1, Lk/a$a;->b:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p3, Lm/c;->b:Ljava/lang/String;

    const-string v6, "_asm_ser_"

    invoke-static {v4, v5, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lk/a;->e:Ljava/lang/String;

    const/16 v7, 0xb4

    invoke-virtual {p2, v7, v3, v4, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xc7

    invoke-virtual {p2, v3, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    const/4 v3, 0x1

    invoke-virtual {p2, v1, v3}, Lh/h;->k(II)V

    iget-object v3, p3, Lm/c;->f:Ljava/lang/Class;

    invoke-static {v3}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v3

    invoke-virtual {p2, v3}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v3, Lk/a;->c:Ljava/lang/String;

    const-string v4, "(Ljava/lang/Class;)"

    invoke-static {v4, v5}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xb6

    const-string v9, "getObjectWriter"

    invoke-virtual {p2, v8, v3, v9, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p1, Lk/a$a;->b:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {v4, v8, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v8, 0xb5

    invoke-virtual {p2, v8, v3, v4, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    iget-object p1, p1, Lk/a$a;->b:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {v0, p3, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v7, p1, p3, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final d(Lk/a$a;Lh/h;Lm/c;Ljava/lang/Class;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk/a$a;",
            "Lh/h;",
            "Lm/c;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    const/16 v1, 0x19

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    iget-object v3, p1, Lk/a$a;->b:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p3, Lm/c;->b:Ljava/lang/String;

    const-string v6, "_asm_list_item_ser_"

    invoke-static {v4, v5, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lk/a;->e:Ljava/lang/String;

    const/16 v7, 0xb4

    invoke-virtual {p2, v7, v3, v4, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xc7

    invoke-virtual {p2, v3, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    const/4 v3, 0x1

    invoke-virtual {p2, v1, v3}, Lh/h;->k(II)V

    invoke-static {p4}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object p4

    invoke-virtual {p2, p4}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object p4, Lk/a;->c:Ljava/lang/String;

    const-string v3, "(Ljava/lang/Class;)"

    invoke-static {v3, v5}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb6

    const-string v8, "getObjectWriter"

    invoke-virtual {p2, v4, p4, v8, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p4, p1, Lk/a$a;->b:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {v3, v4, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb5

    invoke-virtual {p2, v4, p4, v3, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {p2, v1, v2}, Lh/h;->k(II)V

    iget-object p1, p1, Lk/a$a;->b:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p3, p3, Lm/c;->b:Ljava/lang/String;

    invoke-static {p4, p3, v6}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, v7, p1, p3, v5}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final e(Lh/h;Lm/c;Lk/a$a;)V
    .locals 10

    iget-object v0, p2, Lm/c;->f:Ljava/lang/Class;

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    iget-object v3, p1, Lh/h;->g:Lh/a;

    iget v3, v3, Lh/a;->b:I

    invoke-virtual {p2}, Lm/c;->c()Lg/b;

    move-result-object p2

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object p2

    invoke-static {p2}, Lk/b1;->b([Lk/b1;)I

    move-result p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    sget v4, Lk/b1;->F:I

    and-int v5, p2, v4

    const/16 v6, 0xb6

    const-string v7, "out"

    const/16 v8, 0x19

    if-nez v5, :cond_1

    invoke-virtual {p3, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p1, v8, v5}, Lh/h;->k(II)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1, v4}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "isEnabled"

    const-string v9, "(I)Z"

    invoke-virtual {p1, v6, v4, v5, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x99

    invoke-virtual {p1, v4, v1}, Lh/h;->e(ILh/f;)V

    :cond_1
    iget-object v4, p1, Lh/h;->g:Lh/a;

    iget v4, v4, Lh/a;->b:I

    invoke-virtual {p3, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {p1, v8, v4}, Lh/h;->k(II)V

    const/16 v4, 0x15

    const-string v5, "seperator"

    invoke-virtual {p3, v5}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p1, v4, v5}, Lh/h;->k(II)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const-string v5, "write"

    const-string v9, "(I)V"

    invoke-virtual {p1, v6, v4, v5, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lk/a;->i(Lh/h;Lk/a$a;)V

    invoke-virtual {p3, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {p1, v8, v5}, Lh/h;->k(II)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lh/h;->g(Ljava/lang/Object;)V

    const-class p2, Ljava/lang/String;

    if-eq v0, p2, :cond_7

    const-class p2, Ljava/lang/Character;

    if-ne v0, p2, :cond_2

    goto :goto_2

    :cond_2
    const-class p2, Ljava/lang/Number;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lk/b1;->k:Lk/b1;

    goto :goto_3

    :cond_3
    const-class p2, Ljava/lang/Boolean;

    if-ne v0, p2, :cond_4

    sget-object p2, Lk/b1;->l:Lk/b1;

    goto :goto_3

    :cond_4
    const-class p2, Ljava/util/Collection;

    invoke-virtual {p2, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_6

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result p2

    if-eqz p2, :cond_5

    goto :goto_1

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_4

    :cond_6
    :goto_1
    sget-object p2, Lk/b1;->i:Lk/b1;

    goto :goto_3

    :cond_7
    :goto_2
    sget-object p2, Lk/b1;->j:Lk/b1;

    :goto_3
    iget p2, p2, Lk/b1;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_4
    invoke-virtual {p1, p2}, Lh/h;->g(Ljava/lang/Object;)V

    const-string p2, "writeNull"

    const-string v0, "(II)V"

    invoke-virtual {p1, v6, v4, p2, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lk/a;->h(Lh/h;Lk/a$a;)V

    const/16 p2, 0xa7

    invoke-virtual {p1, p2, v2}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p1, v1}, Lh/h;->f(Lh/f;)V

    invoke-virtual {p1, v2}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final f(Lh/h;Lm/c;Lk/a$a;IC)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lh/h;",
            "Lm/c;",
            "Lk/a$a;",
            "IC)V"
        }
    .end annotation

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {p0, p1, p2, p3, v0}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {p0, p1, p3, p2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const/16 v1, 0x36

    invoke-virtual {p1, v1, p4}, Lh/h;->k(II)V

    invoke-virtual {p0, p1, p2, p3, v0}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    const-string p2, "out"

    invoke-virtual {p3, p2}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result p2

    const/16 v1, 0x19

    invoke-virtual {p1, v1, p2}, Lh/h;->k(II)V

    const-string p2, "seperator"

    invoke-virtual {p3, p2}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result p2

    const/16 v2, 0x15

    invoke-virtual {p1, v2, p2}, Lh/h;->k(II)V

    const/4 p2, 0x6

    invoke-virtual {p1, v1, p2}, Lh/h;->k(II)V

    invoke-virtual {p1, v2, p4}, Lh/h;->k(II)V

    sget-object p2, Lk/a;->f:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "(CLjava/lang/String;"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p5, ")V"

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/16 p5, 0xb6

    const-string v1, "writeFieldValue"

    invoke-virtual {p1, p5, p2, v1, p4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lk/a;->h(Lh/h;Lk/a$a;)V

    invoke-virtual {p1, v0}, Lh/h;->f(Lh/f;)V

    return-void
.end method

.method public final g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V
    .locals 9

    iget-boolean v0, p3, Lk/a$a;->d:Z

    const/16 v1, 0xb6

    const/16 v2, 0x19

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v2, v0}, Lh/h;->k(II)V

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v3}, Lh/h;->k(II)V

    const/4 v4, 0x2

    invoke-virtual {p1, v2, v4}, Lh/h;->k(II)V

    const/4 v4, 0x6

    invoke-virtual {p1, v2, v4}, Lh/h;->k(II)V

    sget-object v4, Lk/a;->h:Ljava/lang/String;

    const-string v5, "(L"

    invoke-static {v5}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    sget-object v7, Lk/a;->c:Ljava/lang/String;

    const-string v8, ";Ljava/lang/Object;Ljava/lang/String;)Z"

    invoke-static {v6, v7, v8}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "applyName"

    invoke-virtual {p1, v1, v4, v8, v6}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v6, 0x99

    invoke-virtual {p1, v6, p4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {p1, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {p1, v2, v3}, Lh/h;->k(II)V

    iget-object v0, p2, Lm/c;->l:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ";Ljava/lang/String;)Z"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "applyLabel"

    invoke-virtual {p1, v1, v4, v3, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v6, p4}, Lh/h;->e(ILh/f;)V

    :cond_0
    iget-object p2, p2, Lm/c;->d:Ljava/lang/reflect/Field;

    if-nez p2, :cond_1

    const-string p2, "out"

    invoke-virtual {p3, p2}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, v2, p2}, Lh/h;->k(II)V

    sget-object p2, Lk/b1;->z:Lk/b1;

    iget p2, p2, Lk/b1;->b:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object p2, Lk/a;->f:Ljava/lang/String;

    const-string p3, "isEnabled"

    const-string v0, "(I)Z"

    invoke-virtual {p1, v1, p2, p3, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 p2, 0x9a

    invoke-virtual {p1, p2, p4}, Lh/h;->e(ILh/f;)V

    :cond_1
    return-void
.end method

.method public final h(Lh/h;Lk/a$a;)V
    .locals 2

    const/16 v0, 0x10

    const/16 v1, 0x2c

    invoke-virtual {p1, v0, v1}, Lh/h;->k(II)V

    const-string v0, "seperator"

    invoke-virtual {p2, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0x36

    invoke-virtual {p1, v0, p2}, Lh/h;->k(II)V

    return-void
.end method

.method public final i(Lh/h;Lk/a$a;)V
    .locals 3

    iget-boolean v0, p2, Lk/a$a;->d:Z

    const-string v1, "out"

    invoke-virtual {p2, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result p2

    const/16 v1, 0x19

    invoke-virtual {p1, v1, p2}, Lh/h;->k(II)V

    const/4 p2, 0x6

    invoke-virtual {p1, v1, p2}, Lh/h;->k(II)V

    if-eqz v0, :cond_0

    sget-object p2, Lk/a;->f:Ljava/lang/String;

    const-string v0, "writeFieldNameDirect"

    const-string v1, "(Ljava/lang/String;)V"

    goto :goto_0

    :cond_0
    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lh/h;->c(I)V

    sget-object p2, Lk/a;->f:Ljava/lang/String;

    const-string v0, "writeFieldName"

    const-string v1, "(Ljava/lang/String;Z)V"

    :goto_0
    const/16 v2, 0xb6

    invoke-virtual {p1, v2, p2, v0, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final j(Lh/h;Lm/c;Lk/a$a;Lh/f;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-class v4, Ljava/lang/String;

    iget-object v5, v2, Lm/c;->t:Ljava/lang/String;

    iget-object v6, v2, Lm/c;->f:Ljava/lang/Class;

    new-instance v7, Lh/f;

    invoke-direct {v7}, Lh/f;-><init>()V

    iget-boolean v8, v3, Lk/a$a;->d:Z

    const/16 v9, 0x8

    const/16 v10, 0x19

    const-string v11, "object"

    if-eqz v8, :cond_0

    invoke-virtual {v3, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v1, v10, v8}, Lh/h;->k(II)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v10, v9}, Lh/h;->k(II)V

    :goto_0
    const/16 v8, 0x59

    invoke-virtual {v1, v8}, Lh/h;->c(I)V

    invoke-virtual {v3, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v8

    const/16 v9, 0x3a

    invoke-virtual {v1, v9, v8}, Lh/h;->k(II)V

    const/16 v8, 0xc7

    invoke-virtual {v1, v8, v7}, Lh/h;->e(ILh/f;)V

    invoke-virtual/range {p0 .. p3}, Lk/a;->e(Lh/h;Lm/c;Lk/a$a;)V

    const/16 v8, 0xa7

    move-object/from16 v9, p4

    invoke-virtual {v1, v8, v9}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v7}, Lh/h;->f(Lh/f;)V

    const-string v7, "out"

    invoke-virtual {v3, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v1, v10, v7}, Lh/h;->k(II)V

    const/16 v7, 0x15

    const-string v8, "seperator"

    invoke-virtual {v3, v8}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v1, v7, v8}, Lh/h;->k(II)V

    sget-object v7, Lk/a;->f:Ljava/lang/String;

    const-string v8, "write"

    const/16 v9, 0xb6

    const-string v12, "(I)V"

    invoke-virtual {v1, v9, v7, v8, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3}, Lk/a;->i(Lh/h;Lk/a$a;)V

    new-instance v7, Lh/f;

    invoke-direct {v7}, Lh/f;-><init>()V

    new-instance v12, Lh/f;

    invoke-direct {v12}, Lh/f;-><init>()V

    invoke-virtual {v6}, Ljava/lang/Class;->getModifiers()I

    move-result v13

    invoke-static {v13}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v13

    const-string v14, "Ljava/lang/reflect/Type;"

    const-string v15, "_asm_fieldType"

    if-eqz v13, :cond_7

    invoke-static {v6}, Li/i;->e(Ljava/lang/Class;)Z

    move-result v13

    if-nez v13, :cond_7

    invoke-virtual {v3, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v1, v10, v13}, Lh/h;->k(II)V

    const-string v10, "java/lang/Object"

    const-string v13, "getClass"

    move-object/from16 v16, v4

    const-string v4, "()Ljava/lang/Class;"

    invoke-virtual {v1, v9, v10, v13, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v4

    invoke-virtual {v1, v4}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v4, 0xa6

    invoke-virtual {v1, v4, v12}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v0, v3, v1, v2}, Lk/a;->c(Lk/a$a;Lh/h;Lm/c;)V

    const-string v4, "fied_ser"

    invoke-virtual {v3, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v6

    const/16 v9, 0x3a

    invoke-virtual {v1, v9, v6}, Lh/h;->k(II)V

    new-instance v6, Lh/f;

    invoke-direct {v6}, Lh/f;-><init>()V

    new-instance v9, Lh/f;

    invoke-direct {v9}, Lh/f;-><init>()V

    invoke-virtual {v3, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    const/16 v13, 0x19

    invoke-virtual {v1, v13, v10}, Lh/h;->k(II)V

    const/16 v10, 0xc1

    sget-object v13, Lk/a;->h:Ljava/lang/String;

    invoke-virtual {v1, v10, v13}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v10, 0x99

    invoke-virtual {v1, v10, v6}, Lh/h;->e(ILh/f;)V

    iget v10, v2, Lm/c;->j:I

    sget-object v0, Lk/b1;->q:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    and-int/2addr v0, v10

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v17, v5

    sget-object v5, Lk/b1;->v:Lk/b1;

    iget v5, v5, Lk/b1;->b:I

    and-int/2addr v5, v10

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    if-nez v0, :cond_5

    iget-boolean v0, v3, Lk/a$a;->g:Z

    if-eqz v0, :cond_3

    iget-boolean v0, v3, Lk/a$a;->d:Z

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    if-eqz v5, :cond_4

    const-string v0, "writeAsArray"

    goto :goto_4

    :cond_4
    move-object v0, v8

    goto :goto_4

    :cond_5
    :goto_3
    if-eqz v5, :cond_6

    const-string v0, "writeAsArrayNonContext"

    goto :goto_4

    :cond_6
    const-string v0, "writeDirectNonContext"

    :goto_4
    invoke-virtual {v3, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v10, 0x19

    invoke-virtual {v1, v10, v5}, Lh/h;->k(II)V

    const/16 v5, 0xc0

    invoke-virtual {v1, v5, v13}, Lh/h;->j(ILjava/lang/String;)V

    const/4 v5, 0x1

    invoke-virtual {v1, v10, v5}, Lh/h;->k(II)V

    invoke-virtual {v3, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v1, v10, v5}, Lh/h;->k(II)V

    const/4 v5, 0x6

    invoke-virtual {v1, v10, v5}, Lh/h;->k(II)V

    const/4 v5, 0x0

    invoke-virtual {v1, v10, v5}, Lh/h;->k(II)V

    iget-object v5, v3, Lk/a$a;->b:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 p4, v12

    iget-object v12, v2, Lm/c;->b:Ljava/lang/String;

    invoke-static {v10, v12, v15}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0xb4

    invoke-virtual {v1, v12, v5, v10, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v5, v2, Lm/c;->j:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1, v5}, Lh/h;->g(Ljava/lang/Object;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "(L"

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v12, Lk/a;->c:Ljava/lang/String;

    move-object/from16 v18, v7

    const-string v7, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    invoke-static {v5, v12, v7}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v19, v8

    const/16 v8, 0xb6

    invoke-virtual {v1, v8, v13, v0, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xa7

    invoke-virtual {v1, v0, v9}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v1, v6}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v3, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v4, 0x19

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    const/4 v0, 0x1

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    invoke-virtual {v3, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    const/4 v0, 0x6

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v1, v4, v0}, Lh/h;->k(II)V

    iget-object v0, v3, Lk/a$a;->b:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v2, Lm/c;->b:Ljava/lang/String;

    invoke-static {v4, v5, v15}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0xb4

    invoke-virtual {v1, v5, v0, v4, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget v0, v2, Lm/c;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v0, 0xb9

    sget-object v4, Lk/a;->d:Ljava/lang/String;

    invoke-static {v10, v12, v7}, Landroidx/appcompat/widget/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v6, v19

    invoke-virtual {v1, v0, v4, v6, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v9}, Lh/h;->f(Lh/f;)V

    const/16 v0, 0xa7

    move-object/from16 v4, v18

    invoke-virtual {v1, v0, v4}, Lh/h;->e(ILh/f;)V

    goto :goto_5

    :cond_7
    move-object/from16 v16, v4

    move-object/from16 v17, v5

    move-object v4, v7

    move-object/from16 p4, v12

    :goto_5
    move-object/from16 v0, p4

    invoke-virtual {v1, v0}, Lh/h;->f(Lh/f;)V

    const/4 v0, 0x1

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v0}, Lh/h;->k(II)V

    iget-boolean v0, v3, Lk/a$a;->d:Z

    if-eqz v0, :cond_8

    invoke-virtual {v3, v11}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    goto :goto_6

    :cond_8
    const/16 v0, 0x8

    :goto_6
    invoke-virtual {v1, v5, v0}, Lh/h;->k(II)V

    if-eqz v17, :cond_9

    move-object/from16 v0, v17

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v2, "writeWithFormat"

    const-string v5, "(Ljava/lang/Object;Ljava/lang/String;)V"

    const/16 v6, 0xb6

    invoke-virtual {v1, v6, v0, v2, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_9
    const/4 v0, 0x6

    invoke-virtual {v1, v5, v0}, Lh/h;->k(II)V

    iget-object v0, v2, Lm/c;->g:Ljava/lang/reflect/Type;

    instance-of v5, v0, Ljava/lang/Class;

    if-eqz v5, :cond_a

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v2, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    goto :goto_8

    :cond_a
    iget-object v0, v2, Lm/c;->f:Ljava/lang/Class;

    move-object/from16 v5, v16

    if-ne v0, v5, :cond_b

    invoke-static {v5}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    goto :goto_7

    :cond_b
    const/4 v0, 0x0

    const/16 v5, 0x19

    invoke-virtual {v1, v5, v0}, Lh/h;->k(II)V

    iget-object v0, v3, Lk/a$a;->b:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, v2, Lm/c;->b:Ljava/lang/String;

    invoke-static {v5, v6, v15}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0xb4

    invoke-virtual {v1, v6, v0, v5, v14}, Lh/h;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    iget v0, v2, Lm/c;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v2, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    :goto_8
    const-string v5, "writeWithFieldName"

    const/16 v6, 0xb6

    invoke-virtual {v1, v6, v0, v5, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_9
    invoke-virtual {v1, v4}, Lh/h;->f(Lh/f;)V

    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v3}, Lk/a;->h(Lh/h;Lk/a$a;)V

    return-void
.end method

.method public final k(Ljava/lang/Class;Lh/h;[Lm/c;Lk/a$a;)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lh/h;",
            "[",
            "Lm/c;",
            "Lk/a$a;",
            ")V"
        }
    .end annotation

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    array-length v9, v7

    iget-boolean v0, v8, Lk/a$a;->d:Z

    const-string v1, "(I)Z"

    const-string v2, "isEnabled"

    const/16 v3, 0x19

    const/16 v4, 0xb6

    const-string v10, ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    const-string v11, "write"

    const-string v12, "(L"

    const-string v13, "out"

    if-nez v0, :cond_3

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v14

    invoke-virtual {v6, v3, v14}, Lh/h;->k(II)V

    sget-object v14, Lk/b1;->o:Lk/b1;

    iget v14, v14, Lk/b1;->b:I

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v6, v14}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v14, Lk/a;->f:Ljava/lang/String;

    invoke-virtual {v6, v4, v14, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x9a

    invoke-virtual {v6, v4, v5}, Lh/h;->e(ILh/f;)V

    array-length v4, v7

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    if-ge v14, v4, :cond_1

    aget-object v3, v7, v14

    iget-object v3, v3, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v15, 0x1

    :cond_0
    add-int/lit8 v14, v14, 0x1

    const/16 v3, 0x19

    goto :goto_0

    :cond_1
    if-eqz v15, :cond_2

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    sget-object v3, Lk/b1;->B:Lk/b1;

    iget v3, v3, Lk/b1;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v3}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v3, Lk/a;->f:Ljava/lang/String;

    const/16 v4, 0xb6

    invoke-virtual {v6, v4, v3, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x99

    goto :goto_1

    :cond_2
    const/16 v3, 0xa7

    :goto_1
    invoke-virtual {v6, v3, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v5}, Lh/h;->f(Lh/f;)V

    const/4 v3, 0x0

    const/16 v4, 0x19

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x1

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x2

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x3

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x4

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x5

    const/16 v4, 0x15

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/16 v3, 0xb7

    sget-object v4, Lk/a;->h:Ljava/lang/String;

    invoke-static {v12}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    sget-object v14, Lk/a;->c:Ljava/lang/String;

    invoke-static {v5, v14, v10}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v3, v4, v11, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0xb1

    invoke-virtual {v6, v3}, Lh/h;->c(I)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    :cond_3
    iget-boolean v0, v8, Lk/a$a;->g:Z

    if-nez v0, :cond_4

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    const/4 v3, 0x0

    const/16 v4, 0x19

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x1

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x2

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    const/4 v3, 0x5

    const/16 v4, 0x15

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    sget-object v3, Lk/a;->h:Ljava/lang/String;

    invoke-static {v12}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    sget-object v5, Lk/a;->c:Ljava/lang/String;

    const-string v14, ";Ljava/lang/Object;I)Z"

    invoke-static {v4, v5, v14}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "writeReference"

    const/16 v14, 0xb6

    invoke-virtual {v6, v14, v3, v5, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x99

    invoke-virtual {v6, v3, v0}, Lh/h;->e(ILh/f;)V

    const/16 v3, 0xb1

    invoke-virtual {v6, v3}, Lh/h;->c(I)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    :cond_4
    iget-boolean v0, v8, Lk/a$a;->d:Z

    if-eqz v0, :cond_6

    iget-boolean v0, v8, Lk/a$a;->g:Z

    if-eqz v0, :cond_5

    const-string v0, "writeAsArrayNonContext"

    goto :goto_2

    :cond_5
    const-string v0, "writeAsArray"

    goto :goto_2

    :cond_6
    const-string v0, "writeAsArrayNormal"

    :goto_2
    iget-object v3, v8, Lk/a$a;->c:Lk/w0;

    iget v3, v3, Lk/w0;->g:I

    sget-object v4, Lk/b1;->v:Lk/b1;

    iget v5, v4, Lk/b1;->b:I

    and-int/2addr v3, v5

    if-nez v3, :cond_7

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v14, 0x19

    invoke-virtual {v6, v14, v5}, Lh/h;->k(II)V

    iget v4, v4, Lk/b1;->b:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v4, Lk/a;->f:Ljava/lang/String;

    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v4, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x99

    invoke-virtual {v6, v1, v3}, Lh/h;->e(ILh/f;)V

    const/4 v1, 0x0

    invoke-virtual {v6, v14, v1}, Lh/h;->k(II)V

    const/4 v1, 0x1

    invoke-virtual {v6, v14, v1}, Lh/h;->k(II)V

    const/4 v1, 0x2

    invoke-virtual {v6, v14, v1}, Lh/h;->k(II)V

    const/4 v1, 0x3

    invoke-virtual {v6, v14, v1}, Lh/h;->k(II)V

    const/4 v1, 0x4

    invoke-virtual {v6, v14, v1}, Lh/h;->k(II)V

    const/4 v1, 0x5

    const/16 v2, 0x15

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    iget-object v1, v8, Lk/a$a;->b:Ljava/lang/String;

    invoke-static {v12}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v4, Lk/a;->c:Ljava/lang/String;

    invoke-static {v2, v4, v10}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xb6

    invoke-virtual {v6, v4, v1, v0, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xb1

    invoke-virtual {v6, v0}, Lh/h;->c(I)V

    invoke-virtual {v6, v3}, Lh/h;->f(Lh/f;)V

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    const/16 v2, 0x19

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x1

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x2

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x3

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x4

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x5

    const/16 v2, 0x15

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    iget-object v1, v8, Lk/a$a;->b:Ljava/lang/String;

    invoke-static {v12}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lk/a;->c:Ljava/lang/String;

    invoke-static {v2, v3, v10}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v1, v0, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xb1

    invoke-virtual {v6, v0}, Lh/h;->c(I)V

    :goto_3
    iget-boolean v0, v8, Lk/a$a;->g:Z

    const-string v14, "parent"

    const-string v15, "("

    const/16 v1, 0x3a

    if-nez v0, :cond_8

    const/4 v0, 0x1

    const/16 v2, 0x19

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v2, "()"

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lk/a;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "getContext"

    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v0, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v6, v1, v2}, Lh/h;->k(II)V

    const/4 v1, 0x1

    const/16 v2, 0x19

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x2

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/4 v1, 0x3

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    iget-object v1, v8, Lk/a$a;->c:Lk/w0;

    iget v1, v1, Lk/w0;->g:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v6, v1}, Lh/h;->g(Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Ljava/lang/Object;Ljava/lang/Object;I)V"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "setContext"

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    iget-object v0, v8, Lk/a$a;->c:Lk/w0;

    iget v0, v0, Lk/w0;->g:I

    sget-object v1, Lk/b1;->p:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_4

    :cond_9
    const/4 v0, 0x0

    :goto_4
    const-string v5, "(I)V"

    const/16 v1, 0x7b

    const/16 v2, 0x10

    if-nez v0, :cond_b

    iget-boolean v3, v8, Lk/a$a;->d:Z

    if-nez v3, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    move-object/from16 p1, v14

    goto/16 :goto_8

    :cond_b
    :goto_5
    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    if-nez v0, :cond_c

    const/4 v0, 0x1

    const/16 v3, 0x19

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    const/4 v0, 0x4

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    const/4 v0, 0x2

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v3, "isWriteClassName"

    const-string v4, "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z"

    move-object/from16 p1, v14

    const/16 v14, 0xb6

    invoke-virtual {v6, v14, v0, v3, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x99

    invoke-virtual {v6, v0, v2}, Lh/h;->e(ILh/f;)V

    goto :goto_6

    :cond_c
    move-object/from16 p1, v14

    const/16 v14, 0xb6

    :goto_6
    const/4 v0, 0x4

    const/16 v3, 0x19

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    const/4 v0, 0x2

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    const-string v0, "java/lang/Object"

    const-string v3, "getClass"

    const-string v4, "()Ljava/lang/Class;"

    invoke-virtual {v6, v14, v0, v3, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0xa5

    invoke-virtual {v6, v0, v2}, Lh/h;->e(ILh/f;)V

    iget-object v0, v6, Lh/h;->g:Lh/a;

    iget v0, v0, Lh/a;->b:I

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v3, 0x19

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    const/16 v0, 0x7b

    const/16 v4, 0x10

    invoke-virtual {v6, v4, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    invoke-virtual {v6, v14, v0, v11, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    iget-object v4, v8, Lk/a$a;->c:Lk/w0;

    iget-object v4, v4, Lk/w0;->c:Ljava/lang/String;

    if-eqz v4, :cond_d

    invoke-virtual {v6, v4}, Lh/h;->g(Ljava/lang/Object;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v6, v0}, Lh/h;->c(I)V

    :goto_7
    const/4 v0, 0x2

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->h:Ljava/lang/String;

    invoke-static {v12}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Lk/a;->c:Ljava/lang/String;

    const-string v14, ";Ljava/lang/String;Ljava/lang/Object;)V"

    invoke-static {v3, v4, v14}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "writeClassName"

    const/16 v14, 0xb6

    invoke-virtual {v6, v14, v0, v4, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x2c

    const/16 v3, 0x10

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    const/16 v0, 0xa7

    invoke-virtual {v6, v0, v1}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v2}, Lh/h;->f(Lh/f;)V

    const/16 v0, 0x7b

    invoke-virtual {v6, v3, v0}, Lh/h;->k(II)V

    invoke-virtual {v6, v1}, Lh/h;->f(Lh/f;)V

    :goto_8
    const-string v14, "seperator"

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x36

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    iget-boolean v0, v8, Lk/a$a;->d:Z

    if-nez v0, :cond_e

    const/4 v0, 0x0

    const/16 v2, 0x19

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x2

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x15

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->h:Ljava/lang/String;

    invoke-static {v12}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lk/a;->c:Ljava/lang/String;

    const-string v4, ";Ljava/lang/Object;C)C"

    invoke-static {v2, v3, v4}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "writeBefore"

    const/16 v4, 0xb6

    invoke-virtual {v6, v4, v0, v3, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    :cond_e
    iget-boolean v0, v8, Lk/a$a;->d:Z

    if-nez v0, :cond_f

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    const-string v2, "isNotWriteDefaultValue"

    const-string v3, "()Z"

    const/16 v4, 0xb6

    invoke-virtual {v6, v4, v0, v2, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "notWriteDefaultValue"

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x1

    const/16 v1, 0x19

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x0

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    invoke-static {v15}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lk/a;->j:Ljava/lang/String;

    const-string v3, ")Z"

    invoke-static {v1, v2, v3}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "checkValue"

    invoke-virtual {v6, v4, v0, v3, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "checkValue"

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x36

    invoke-virtual {v6, v3, v1}, Lh/h;->k(II)V

    const/4 v1, 0x1

    const/16 v3, 0x19

    invoke-virtual {v6, v3, v1}, Lh/h;->k(II)V

    const/4 v1, 0x0

    invoke-virtual {v6, v3, v1}, Lh/h;->k(II)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")Z"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "hasNameFilters"

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "hasNameFilters"

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x36

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    :cond_f
    const/4 v0, 0x0

    move-object/from16 v3, p0

    const/4 v4, 0x0

    :goto_9
    if-ge v4, v9, :cond_2b

    aget-object v2, v7, v4

    iget-object v0, v2, Lm/c;->f:Ljava/lang/Class;

    iget-object v1, v2, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v6, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const/4 v1, 0x6

    move/from16 v16, v4

    const/16 v4, 0x3a

    invoke-virtual {v6, v4, v1}, Lh/h;->k(II)V

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v0, v1, :cond_2a

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v0, v1, :cond_2a

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_10

    goto/16 :goto_1d

    :cond_10
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-string v4, "writeFieldValue"

    if-ne v0, v1, :cond_11

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {v3, v6, v2, v8, v0}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v3, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v1, "long"

    move-object/from16 v17, v5

    invoke-virtual {v8, v1}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v5

    const/16 v7, 0x37

    invoke-virtual {v6, v7, v5}, Lh/h;->k(II)V

    invoke-virtual {v3, v6, v2, v8, v0}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v5, 0x19

    invoke-virtual {v6, v5, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x15

    invoke-virtual {v6, v7, v2}, Lh/h;->k(II)V

    const/4 v2, 0x6

    invoke-virtual {v6, v5, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v1}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x16

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->f:Ljava/lang/String;

    const-string v2, "(CLjava/lang/String;J)V"

    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v1, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6, v8}, Lk/a;->h(Lh/h;Lk/a$a;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    goto/16 :goto_a

    :cond_11
    move-object/from16 v17, v5

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_12

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {v3, v6, v2, v8, v0}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v3, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v1, "float"

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    const/16 v7, 0x38

    invoke-virtual {v6, v7, v5}, Lh/h;->k(II)V

    invoke-virtual {v3, v6, v2, v8, v0}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v5, 0x19

    invoke-virtual {v6, v5, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x15

    invoke-virtual {v6, v7, v2}, Lh/h;->k(II)V

    const/4 v2, 0x6

    invoke-virtual {v6, v5, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x17

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->f:Ljava/lang/String;

    const-string v2, "(CLjava/lang/String;F)V"

    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v1, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6, v8}, Lk/a;->h(Lh/h;Lk/a$a;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    goto :goto_a

    :cond_12
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_13

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {v3, v6, v2, v8, v0}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v3, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v1, "double"

    invoke-virtual {v8, v1}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v5

    const/16 v7, 0x39

    invoke-virtual {v6, v7, v5}, Lh/h;->k(II)V

    invoke-virtual {v3, v6, v2, v8, v0}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v5, 0x19

    invoke-virtual {v6, v5, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v7, 0x15

    invoke-virtual {v6, v7, v2}, Lh/h;->k(II)V

    const/4 v2, 0x6

    invoke-virtual {v6, v5, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v1}, Lk/a$a;->b(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x18

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->f:Ljava/lang/String;

    const-string v2, "(CLjava/lang/String;D)V"

    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v1, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v6, v8}, Lk/a;->h(Lh/h;Lk/a$a;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    :goto_a
    move-object v7, v3

    move/from16 v18, v9

    move-object/from16 v20, v12

    move-object v9, v13

    move-object/from16 v12, p0

    move-object v13, v10

    move-object v10, v11

    move-object/from16 v11, v17

    move-object/from16 v17, v15

    goto/16 :goto_1e

    :cond_13
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_14

    const-string v0, "boolean"

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x5a

    move v4, v0

    const/16 v5, 0x5a

    goto :goto_b

    :cond_14
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v0, v1, :cond_15

    const-string v0, "char"

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x43

    move v4, v0

    const/16 v5, 0x43

    :goto_b
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object v7, v3

    move-object/from16 v3, p4

    move/from16 v18, v9

    move-object/from16 v9, v17

    invoke-virtual/range {v0 .. v5}, Lk/a;->f(Lh/h;Lm/c;Lk/a$a;IC)V

    move-object/from16 v19, v10

    move-object/from16 v17, v15

    goto/16 :goto_e

    :cond_15
    move-object v7, v3

    move/from16 v18, v9

    move-object/from16 v9, v17

    const/16 v1, 0xb6

    const-class v3, Ljava/lang/String;

    if-ne v0, v3, :cond_19

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    iget-object v3, v2, Lm/c;->b:Ljava/lang/String;

    iget-object v5, v8, Lk/a$a;->c:Lk/w0;

    iget-object v5, v5, Lk/w0;->c:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    const/4 v3, 0x1

    const/16 v5, 0x19

    invoke-virtual {v6, v5, v3}, Lh/h;->k(II)V

    const/4 v3, 0x4

    invoke-virtual {v6, v5, v3}, Lh/h;->k(II)V

    const/4 v3, 0x2

    invoke-virtual {v6, v5, v3}, Lh/h;->k(II)V

    sget-object v3, Lk/a;->c:Ljava/lang/String;

    const-string v5, "isWriteClassName"

    move-object/from16 v17, v15

    const-string v15, "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z"

    invoke-virtual {v6, v1, v3, v5, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x9a

    invoke-virtual {v6, v1, v0}, Lh/h;->e(ILh/f;)V

    goto :goto_c

    :cond_16
    move-object/from16 v17, v15

    :goto_c
    invoke-virtual {v7, v6, v2, v8, v0}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v7, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v1, "string"

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-virtual {v6, v5, v3}, Lh/h;->k(II)V

    invoke-virtual {v7, v6, v2, v8, v0}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v15

    move-object/from16 v19, v10

    const/16 v10, 0x19

    invoke-virtual {v6, v10, v15}, Lh/h;->k(II)V

    const/16 v15, 0xc7

    invoke-virtual {v6, v15, v3}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v7, v6, v2, v8}, Lk/a;->e(Lh/h;Lm/c;Lk/a$a;)V

    const/16 v15, 0xa7

    invoke-virtual {v6, v15, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v3}, Lh/h;->f(Lh/f;)V

    iget-object v2, v2, Lm/c;->t:Ljava/lang/String;

    const-string v3, "trim"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v6, v10, v2}, Lh/h;->k(II)V

    const-string v2, "java/lang/String"

    const-string v10, "()Ljava/lang/String;"

    const/16 v15, 0xb6

    invoke-virtual {v6, v15, v2, v3, v10}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x3a

    invoke-virtual {v6, v3, v2}, Lh/h;->k(II)V

    :cond_17
    iget-boolean v2, v8, Lk/a$a;->d:Z

    if-eqz v2, :cond_18

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x19

    invoke-virtual {v6, v3, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v4, 0x15

    invoke-virtual {v6, v4, v2}, Lh/h;->k(II)V

    const/4 v2, 0x6

    invoke-virtual {v6, v3, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v6, v3, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->f:Ljava/lang/String;

    const-string v4, "writeFieldValueStringWithDoubleQuoteCheck"

    goto :goto_d

    :cond_18
    const/4 v2, 0x6

    const/16 v3, 0x19

    const/16 v10, 0x15

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v6, v3, v15}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v6, v10, v15}, Lh/h;->k(II)V

    invoke-virtual {v6, v3, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v6, v3, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->f:Ljava/lang/String;

    :goto_d
    const-string v2, "(CLjava/lang/String;Ljava/lang/String;)V"

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v1, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v6, v8}, Lk/a;->h(Lh/h;Lk/a$a;)V

    invoke-virtual {v6, v5}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    goto/16 :goto_e

    :cond_19
    move-object/from16 v19, v10

    move-object/from16 v17, v15

    const-class v1, Ljava/math/BigDecimal;

    if-ne v0, v1, :cond_1a

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {v7, v6, v2, v8, v0}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v7, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v1, "decimal"

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0x3a

    invoke-virtual {v6, v5, v3}, Lh/h;->k(II)V

    invoke-virtual {v7, v6, v2, v8, v0}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    iget-object v10, v6, Lh/h;->g:Lh/a;

    iget v10, v10, Lh/a;->b:I

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    const/16 v15, 0x19

    invoke-virtual {v6, v15, v10}, Lh/h;->k(II)V

    const/16 v10, 0xc7

    invoke-virtual {v6, v10, v3}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v7, v6, v2, v8}, Lk/a;->e(Lh/h;Lm/c;Lk/a$a;)V

    const/16 v2, 0xa7

    invoke-virtual {v6, v2, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v3}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v6, v15, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v3, 0x15

    invoke-virtual {v6, v3, v2}, Lh/h;->k(II)V

    const/4 v2, 0x6

    invoke-virtual {v6, v15, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v6, v15, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->f:Ljava/lang/String;

    const-string v2, "(CLjava/lang/String;Ljava/math/BigDecimal;)V"

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v1, v4, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v6, v8}, Lk/a;->h(Lh/h;Lk/a$a;)V

    const/16 v1, 0xa7

    invoke-virtual {v6, v1, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v5}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    :goto_e
    move-object v10, v11

    move-object/from16 v20, v12

    move-object/from16 v12, p0

    move-object v11, v9

    move-object v9, v13

    move-object/from16 v13, v19

    goto/16 :goto_1e

    :cond_1a
    const-class v1, Ljava/util/List;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_27

    iget-object v0, v2, Lm/c;->g:Ljava/lang/reflect/Type;

    invoke-static {v0}, Lm/j;->y(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Class;

    const/4 v3, 0x0

    if-eqz v1, :cond_1b

    move-object v1, v0

    check-cast v1, Ljava/lang/Class;

    goto :goto_f

    :cond_1b
    move-object v1, v3

    :goto_f
    const-class v4, Ljava/lang/Object;

    if-eq v1, v4, :cond_1d

    const-class v4, Ljava/io/Serializable;

    if-ne v1, v4, :cond_1c

    goto :goto_10

    :cond_1c
    move-object v3, v1

    :cond_1d
    :goto_10
    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    invoke-virtual {v7, v6, v2, v8, v1}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v7, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const/16 v10, 0xc0

    const-string v15, "java/util/List"

    invoke-virtual {v6, v10, v15}, Lh/h;->j(ILjava/lang/String;)V

    const-string v10, "list"

    move-object/from16 v20, v12

    invoke-virtual {v8, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v12

    move-object/from16 v21, v3

    const/16 v3, 0x3a

    invoke-virtual {v6, v3, v12}, Lh/h;->k(II)V

    invoke-virtual {v7, v6, v2, v8, v1}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v8, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v12, 0x19

    invoke-virtual {v6, v12, v3}, Lh/h;->k(II)V

    const/16 v3, 0xc7

    invoke-virtual {v6, v3, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v7, v6, v2, v8}, Lk/a;->e(Lh/h;Lm/c;Lk/a$a;)V

    const/16 v3, 0xa7

    invoke-virtual {v6, v3, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v4}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v6, v12, v3}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x15

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    sget-object v3, Lk/a;->f:Ljava/lang/String;

    const/16 v4, 0xb6

    invoke-virtual {v6, v4, v3, v11, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v6, v8}, Lk/a;->i(Lh/h;Lk/a$a;)V

    invoke-virtual {v8, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v6, v12, v4}, Lh/h;->k(II)V

    const/16 v4, 0xb9

    const-string v12, "size"

    move-object/from16 v22, v14

    const-string v14, "()I"

    invoke-virtual {v6, v4, v15, v12, v14}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v12}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v14, 0x36

    invoke-virtual {v6, v14, v4}, Lh/h;->k(II)V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    new-instance v14, Lh/f;

    invoke-direct {v14}, Lh/f;-><init>()V

    move-object/from16 v23, v1

    invoke-virtual {v8, v12}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    move-object/from16 v24, v5

    const/16 v5, 0x15

    invoke-virtual {v6, v5, v1}, Lh/h;->k(II)V

    const/4 v1, 0x3

    invoke-virtual {v6, v1}, Lh/h;->c(I)V

    const/16 v1, 0xa0

    invoke-virtual {v6, v1, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    const/16 v5, 0x19

    invoke-virtual {v6, v5, v1}, Lh/h;->k(II)V

    const-string v1, "[]"

    invoke-virtual {v6, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const-string v1, "(Ljava/lang/String;)V"

    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v3, v11, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0xa7

    invoke-virtual {v6, v1, v14}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v4}, Lh/h;->f(Lh/f;)V

    iget-boolean v1, v8, Lk/a$a;->g:Z

    if-nez v1, :cond_1e

    const/4 v1, 0x1

    const/16 v4, 0x19

    invoke-virtual {v6, v4, v1}, Lh/h;->k(II)V

    invoke-virtual {v8, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v6, v4, v1}, Lh/h;->k(II)V

    const/4 v1, 0x6

    invoke-virtual {v6, v4, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->c:Ljava/lang/String;

    const-string v4, "setContext"

    const-string v5, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    move-object/from16 v25, v14

    const/16 v14, 0xb6

    invoke-virtual {v6, v14, v1, v4, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_11

    :cond_1e
    move-object/from16 v25, v14

    :goto_11
    const-class v1, Ljava/lang/String;

    if-ne v0, v1, :cond_1f

    iget-boolean v1, v8, Lk/a$a;->d:Z

    if-eqz v1, :cond_1f

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    invoke-virtual {v8, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    const-string v0, "(Ljava/util/List;)V"

    const/16 v2, 0xb6

    invoke-virtual {v6, v2, v3, v11, v0}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    move-object v10, v11

    move-object/from16 v5, v19

    move-object v11, v9

    move-object v9, v13

    goto/16 :goto_19

    :cond_1f
    const/16 v1, 0x19

    const/16 v4, 0xb6

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v6, v1, v5}, Lh/h;->k(II)V

    const/16 v1, 0x5b

    const/16 v5, 0x10

    invoke-virtual {v6, v5, v1}, Lh/h;->k(II)V

    invoke-virtual {v6, v4, v3, v11, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    new-instance v5, Lh/f;

    invoke-direct {v5}, Lh/f;-><init>()V

    const/4 v14, 0x3

    invoke-virtual {v6, v14}, Lh/h;->c(I)V

    const-string v14, "i"

    move-object/from16 v26, v0

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    move-object/from16 v27, v2

    const/16 v2, 0x36

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v6, v1}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x15

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v8, v12}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    const/16 v0, 0xa2

    invoke-virtual {v6, v0, v5}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    const/16 v0, 0x99

    invoke-virtual {v6, v0, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x19

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    const/16 v0, 0x2c

    const/16 v12, 0x10

    invoke-virtual {v6, v12, v0}, Lh/h;->k(II)V

    const/16 v0, 0xb6

    invoke-virtual {v6, v0, v3, v11, v9}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v10}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x15

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    const/16 v0, 0xb9

    const-string v2, "get"

    const-string v4, "(I)Ljava/lang/Object;"

    invoke-virtual {v6, v0, v15, v2, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "list_item"

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v4, 0x3a

    invoke-virtual {v6, v4, v2}, Lh/h;->k(II)V

    new-instance v2, Lh/f;

    invoke-direct {v2}, Lh/f;-><init>()V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    const/16 v12, 0x19

    invoke-virtual {v6, v12, v10}, Lh/h;->k(II)V

    const/16 v10, 0xc7

    invoke-virtual {v6, v10, v4}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v8, v13}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    invoke-virtual {v6, v12, v10}, Lh/h;->k(II)V

    const-string v10, "writeNull"

    const-string v12, "()V"

    const/16 v15, 0xb6

    invoke-virtual {v6, v15, v3, v10, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v10, 0xa7

    invoke-virtual {v6, v10, v2}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v4}, Lh/h;->f(Lh/f;)V

    new-instance v4, Lh/f;

    invoke-direct {v4}, Lh/f;-><init>()V

    new-instance v10, Lh/f;

    invoke-direct {v10}, Lh/f;-><init>()V

    const-string v12, "(I)Ljava/lang/Integer;"

    const-string v15, "valueOf"

    move-object/from16 v28, v3

    const-string v3, "java/lang/Integer"

    if-eqz v21, :cond_24

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Class;->getModifiers()I

    move-result v29

    invoke-static/range {v29 .. v29}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v29

    if-eqz v29, :cond_24

    move-object/from16 v29, v9

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v9

    move-object/from16 v30, v13

    const/16 v13, 0x19

    invoke-virtual {v6, v13, v9}, Lh/h;->k(II)V

    const-string v9, "java/lang/Object"

    const-string v13, "getClass"

    move-object/from16 v31, v5

    const-string v5, "()Ljava/lang/Class;"

    move-object/from16 v32, v1

    const/16 v1, 0xb6

    invoke-virtual {v6, v1, v9, v13, v5}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v21 .. v21}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v1

    invoke-virtual {v6, v1}, Lh/h;->g(Ljava/lang/Object;)V

    const/16 v1, 0xa6

    invoke-virtual {v6, v1, v10}, Lh/h;->e(ILh/f;)V

    move-object/from16 v1, v21

    move-object/from16 v5, v27

    invoke-virtual {v7, v8, v6, v5, v1}, Lk/a;->d(Lk/a$a;Lh/h;Lm/c;Ljava/lang/Class;)V

    const-string v7, "list_item_desc"

    invoke-virtual {v8, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v9

    const/16 v13, 0x3a

    invoke-virtual {v6, v13, v9}, Lh/h;->k(II)V

    new-instance v9, Lh/f;

    invoke-direct {v9}, Lh/f;-><init>()V

    new-instance v13, Lh/f;

    invoke-direct {v13}, Lh/f;-><init>()V

    move-object/from16 v21, v2

    iget-boolean v2, v8, Lk/a$a;->d:Z

    if-eqz v2, :cond_22

    move-object/from16 v27, v10

    iget-boolean v10, v8, Lk/a$a;->g:Z

    if-eqz v10, :cond_20

    if-eqz v2, :cond_20

    const-string v2, "writeDirectNonContext"

    goto :goto_12

    :cond_20
    move-object v2, v11

    :goto_12
    invoke-virtual {v8, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v10

    move-object/from16 v33, v4

    const/16 v4, 0x19

    invoke-virtual {v6, v4, v10}, Lh/h;->k(II)V

    const/16 v4, 0xc1

    sget-object v10, Lk/a;->h:Ljava/lang/String;

    invoke-virtual {v6, v4, v10}, Lh/h;->j(ILjava/lang/String;)V

    const/16 v4, 0x99

    invoke-virtual {v6, v4, v9}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v8, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    move-object/from16 v34, v11

    const/16 v11, 0x19

    invoke-virtual {v6, v11, v4}, Lh/h;->k(II)V

    const/16 v4, 0xc0

    invoke-virtual {v6, v4, v10}, Lh/h;->j(ILjava/lang/String;)V

    const/4 v4, 0x1

    invoke-virtual {v6, v11, v4}, Lh/h;->k(II)V

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v6, v11, v4}, Lh/h;->k(II)V

    iget-boolean v4, v8, Lk/a$a;->g:Z

    if-eqz v4, :cond_21

    const/4 v4, 0x1

    invoke-virtual {v6, v4}, Lh/h;->c(I)V

    goto :goto_13

    :cond_21
    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v11, 0x15

    invoke-virtual {v6, v11, v4}, Lh/h;->k(II)V

    const/16 v4, 0xb8

    invoke-virtual {v6, v4, v3, v15, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_13
    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v4

    invoke-virtual {v6, v4}, Lh/h;->g(Ljava/lang/Object;)V

    iget v4, v5, Lm/c;->j:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Lh/h;->g(Ljava/lang/Object;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v11, v20

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v11, Lk/a;->c:Ljava/lang/String;

    move-object/from16 v35, v5

    move-object/from16 v5, v19

    invoke-static {v4, v11, v5}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/16 v11, 0xb6

    invoke-virtual {v6, v11, v10, v2, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0xa7

    invoke-virtual {v6, v2, v13}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v9}, Lh/h;->f(Lh/f;)V

    goto :goto_14

    :cond_22
    move-object/from16 v33, v4

    move-object/from16 v35, v5

    move-object/from16 v27, v10

    move-object/from16 v34, v11

    move-object/from16 v5, v19

    :goto_14
    invoke-virtual {v8, v7}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v4, 0x19

    invoke-virtual {v6, v4, v2}, Lh/h;->k(II)V

    const/4 v2, 0x1

    invoke-virtual {v6, v4, v2}, Lh/h;->k(II)V

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v6, v4, v7}, Lh/h;->k(II)V

    iget-boolean v4, v8, Lk/a$a;->g:Z

    if-eqz v4, :cond_23

    invoke-virtual {v6, v2}, Lh/h;->c(I)V

    goto :goto_15

    :cond_23
    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v2

    const/16 v4, 0x15

    invoke-virtual {v6, v4, v2}, Lh/h;->k(II)V

    const/16 v2, 0xb8

    invoke-virtual {v6, v2, v3, v15, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_15
    invoke-static {v1}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v2

    invoke-virtual {v6, v2}, Lh/h;->g(Ljava/lang/Object;)V

    move-object/from16 v2, v35

    iget v4, v2, Lm/c;->j:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v6, v4}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v4, Lk/a;->d:Ljava/lang/String;

    invoke-static/range {v20 .. v20}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    sget-object v9, Lk/a;->c:Ljava/lang/String;

    invoke-static {v7, v9, v5}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0xb9

    move-object/from16 v10, v34

    invoke-virtual {v6, v9, v4, v10, v7}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v13}, Lh/h;->f(Lh/f;)V

    const/16 v4, 0xa7

    move-object/from16 v7, v33

    invoke-virtual {v6, v4, v7}, Lh/h;->e(ILh/f;)V

    goto :goto_16

    :cond_24
    move-object/from16 v32, v1

    move-object v7, v4

    move-object/from16 v31, v5

    move-object/from16 v29, v9

    move-object/from16 v30, v13

    move-object/from16 v5, v19

    move-object/from16 v1, v21

    move-object/from16 v21, v2

    move-object/from16 v2, v27

    move-object/from16 v27, v10

    move-object v10, v11

    :goto_16
    move-object/from16 v4, v27

    invoke-virtual {v6, v4}, Lh/h;->f(Lh/f;)V

    const/4 v4, 0x1

    const/16 v9, 0x19

    invoke-virtual {v6, v9, v4}, Lh/h;->k(II)V

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v9, v0}, Lh/h;->k(II)V

    iget-boolean v0, v8, Lk/a$a;->g:Z

    if-eqz v0, :cond_25

    invoke-virtual {v6, v4}, Lh/h;->c(I)V

    goto :goto_17

    :cond_25
    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v4, 0x15

    invoke-virtual {v6, v4, v0}, Lh/h;->k(II)V

    const/16 v0, 0xb8

    invoke-virtual {v6, v0, v3, v15, v12}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_17
    if-eqz v1, :cond_26

    invoke-virtual {v1}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    move-result v0

    if-eqz v0, :cond_26

    move-object/from16 v0, v26

    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v0

    invoke-virtual {v6, v0}, Lh/h;->g(Ljava/lang/Object;)V

    iget v0, v2, Lm/c;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v1, "writeWithFieldName"

    const-string v2, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    goto :goto_18

    :cond_26
    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v1, "writeWithFieldName"

    const-string v2, "(Ljava/lang/Object;Ljava/lang/Object;)V"

    :goto_18
    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v0, v1, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Lh/h;->f(Lh/f;)V

    move-object/from16 v0, v21

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lh/h;->b(I)V

    const/16 v0, 0xa7

    move-object/from16 v1, v32

    invoke-virtual {v6, v0, v1}, Lh/h;->e(ILh/f;)V

    move-object/from16 v0, v31

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    move-object/from16 v9, v30

    invoke-virtual {v8, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x19

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    const/16 v0, 0x5d

    const/16 v2, 0x10

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    move-object/from16 v0, v28

    move-object/from16 v11, v29

    invoke-virtual {v6, v3, v0, v10, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/16 v2, 0xb6

    :goto_19
    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v1, "popContext"

    const-string v3, "()V"

    invoke-virtual {v6, v2, v0, v1, v3}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v25

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    move-object/from16 v12, p0

    invoke-virtual {v12, v6, v8}, Lk/a;->h(Lh/h;Lk/a$a;)V

    move-object/from16 v0, v24

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    move-object/from16 v0, v23

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    move-object/from16 v21, v5

    move-object v3, v12

    move-object/from16 v14, v22

    goto/16 :goto_1c

    :cond_27
    move-object v10, v11

    move-object/from16 v20, v12

    move-object/from16 v22, v14

    move-object/from16 v5, v19

    move-object/from16 v12, p0

    move-object v11, v9

    move-object v9, v13

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_29

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    new-instance v1, Lh/f;

    invoke-direct {v1}, Lh/f;-><init>()V

    new-instance v3, Lh/f;

    invoke-direct {v3}, Lh/f;-><init>()V

    invoke-virtual {v7, v6, v2, v8, v3}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v7, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const/16 v4, 0xc0

    const-string v13, "java/lang/Enum"

    invoke-virtual {v6, v4, v13}, Lh/h;->j(ILjava/lang/String;)V

    const-string v4, "enum"

    invoke-virtual {v8, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v14

    const/16 v15, 0x3a

    invoke-virtual {v6, v15, v14}, Lh/h;->k(II)V

    invoke-virtual {v7, v6, v2, v8, v3}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v8, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v14

    const/16 v15, 0x19

    invoke-virtual {v6, v15, v14}, Lh/h;->k(II)V

    const/16 v14, 0xc7

    invoke-virtual {v6, v14, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v7, v6, v2, v8}, Lk/a;->e(Lh/h;Lm/c;Lk/a$a;)V

    const/16 v14, 0xa7

    invoke-virtual {v6, v14, v1}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    iget-boolean v0, v8, Lk/a$a;->d:Z

    if-eqz v0, :cond_28

    invoke-virtual {v8, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v15, v0}, Lh/h;->k(II)V

    move-object/from16 v14, v22

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v2, 0x15

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    const/4 v0, 0x6

    invoke-virtual {v6, v15, v0}, Lh/h;->k(II)V

    invoke-virtual {v8, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v15, v0}, Lh/h;->k(II)V

    const-string v0, "name"

    const-string v2, "()Ljava/lang/String;"

    const/16 v4, 0xb6

    invoke-virtual {v6, v4, v13, v0, v2}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lk/a;->f:Ljava/lang/String;

    const-string v2, "writeFieldValueStringWithDoubleQuote"

    const-string v4, "(CLjava/lang/String;Ljava/lang/String;)V"

    move-object/from16 v21, v5

    goto :goto_1a

    :cond_28
    move-object/from16 v14, v22

    const/16 v0, 0xb6

    invoke-virtual {v8, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v13

    invoke-virtual {v6, v15, v13}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v13

    const/16 v15, 0x15

    invoke-virtual {v6, v15, v13}, Lh/h;->k(II)V

    sget-object v13, Lk/a;->f:Ljava/lang/String;

    invoke-virtual {v6, v0, v13, v10, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v15, 0x19

    invoke-virtual {v6, v15, v0}, Lh/h;->k(II)V

    const/4 v0, 0x6

    invoke-virtual {v6, v15, v0}, Lh/h;->k(II)V

    const/4 v0, 0x3

    invoke-virtual {v6, v0}, Lh/h;->c(I)V

    const-string v0, "writeFieldName"

    const-string v15, "(Ljava/lang/String;Z)V"

    move-object/from16 v21, v5

    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v13, v0, v15}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/16 v5, 0x19

    invoke-virtual {v6, v5, v0}, Lh/h;->k(II)V

    invoke-virtual {v8, v4}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v5, v0}, Lh/h;->k(II)V

    const/4 v0, 0x6

    invoke-virtual {v6, v5, v0}, Lh/h;->k(II)V

    iget-object v0, v2, Lm/c;->f:Ljava/lang/Class;

    invoke-static {v0}, Lm/b;->b(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh/i;->b(Ljava/lang/String;)Lh/i;

    move-result-object v0

    invoke-virtual {v6, v0}, Lh/h;->g(Ljava/lang/Object;)V

    iget v0, v2, Lm/c;->j:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v6, v0}, Lh/h;->g(Ljava/lang/Object;)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    const-string v2, "writeWithFieldName"

    const-string v4, "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V"

    :goto_1a
    const/16 v5, 0xb6

    invoke-virtual {v6, v5, v0, v2, v4}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v6, v8}, Lk/a;->h(Lh/h;Lk/a$a;)V

    invoke-virtual {v6, v1}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v6, v3}, Lh/h;->f(Lh/f;)V

    goto :goto_1b

    :cond_29
    move-object/from16 v21, v5

    move-object/from16 v14, v22

    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {v7, v6, v2, v8, v0}, Lk/a;->g(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v7, v6, v8, v2}, Lk/a;->b(Lh/h;Lk/a$a;Lm/c;)V

    const-string v1, "object"

    invoke-virtual {v8, v1}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    const/16 v3, 0x3a

    invoke-virtual {v6, v3, v1}, Lh/h;->k(II)V

    invoke-virtual {v7, v6, v2, v8, v0}, Lk/a;->a(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v7, v6, v2, v8, v0}, Lk/a;->j(Lh/h;Lm/c;Lk/a$a;Lh/f;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    :goto_1b
    move-object v3, v7

    :goto_1c
    move-object/from16 v13, v21

    goto :goto_1f

    :cond_2a
    :goto_1d
    move-object v7, v3

    move/from16 v18, v9

    move-object/from16 v21, v10

    move-object v10, v11

    move-object/from16 v20, v12

    move-object v9, v13

    move-object/from16 v17, v15

    move-object/from16 v12, p0

    move-object v11, v5

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v4

    const/16 v5, 0x49

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v3, p4

    move-object/from16 v13, v21

    invoke-virtual/range {v0 .. v5}, Lk/a;->f(Lh/h;Lm/c;Lk/a$a;IC)V

    :goto_1e
    move-object v3, v7

    :goto_1f
    add-int/lit8 v4, v16, 0x1

    move-object/from16 v7, p3

    move-object v5, v11

    move-object/from16 v15, v17

    move-object/from16 v12, v20

    move-object v11, v10

    move-object v10, v13

    move-object v13, v9

    move/from16 v9, v18

    goto/16 :goto_9

    :cond_2b
    move-object v10, v11

    move-object/from16 v20, v12

    move-object v9, v13

    move-object/from16 v17, v15

    move-object/from16 v12, p0

    move-object v11, v5

    iget-boolean v0, v8, Lk/a$a;->d:Z

    if-nez v0, :cond_2c

    const/4 v0, 0x0

    const/16 v1, 0x19

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x1

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    const/4 v0, 0x2

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x15

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->h:Ljava/lang/String;

    invoke-static/range {v20 .. v20}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lk/a;->c:Ljava/lang/String;

    const-string v3, ";Ljava/lang/Object;C)C"

    invoke-static {v1, v2, v3}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "writeAfter"

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0x36

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    :cond_2c
    new-instance v0, Lh/f;

    invoke-direct {v0}, Lh/f;-><init>()V

    invoke-virtual {v8, v14}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v1

    const/16 v2, 0x15

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    const/16 v1, 0x7b

    const/16 v2, 0x10

    invoke-virtual {v6, v2, v1}, Lh/h;->d(II)V

    const/16 v3, 0xa0

    invoke-virtual {v6, v3, v0}, Lh/h;->e(ILh/f;)V

    invoke-virtual {v8, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x19

    invoke-virtual {v6, v4, v3}, Lh/h;->k(II)V

    invoke-virtual {v6, v2, v1}, Lh/h;->k(II)V

    sget-object v1, Lk/a;->f:Ljava/lang/String;

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v1, v10, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Lh/h;->f(Lh/f;)V

    invoke-virtual {v8, v9}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v4, v0}, Lh/h;->k(II)V

    const/16 v0, 0x7d

    invoke-virtual {v6, v2, v0}, Lh/h;->k(II)V

    invoke-virtual {v6, v3, v1, v10, v11}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v6, Lh/h;->g:Lh/a;

    iget v0, v0, Lh/a;->b:I

    iget-boolean v0, v8, Lk/a$a;->g:Z

    if-nez v0, :cond_2d

    const/4 v0, 0x1

    const/16 v1, 0x19

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    move-object/from16 v0, p1

    invoke-virtual {v8, v0}, Lk/a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v1, v0}, Lh/h;->k(II)V

    sget-object v0, Lk/a;->c:Ljava/lang/String;

    invoke-static/range {v17 .. v17}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    sget-object v2, Lk/a;->i:Ljava/lang/String;

    const-string v3, ")V"

    invoke-static {v1, v2, v3}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "setContext"

    const/16 v3, 0xb6

    invoke-virtual {v6, v3, v0, v2, v1}, Lh/h;->i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2d
    return-void
.end method
