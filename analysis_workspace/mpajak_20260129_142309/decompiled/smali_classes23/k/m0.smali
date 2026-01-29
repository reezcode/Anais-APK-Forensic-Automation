.class public final Lk/m0;
.super Lk/z0;

# interfaces
.implements Lk/q0;


# static fields
.field public static i:Lk/m0;

.field public static final j:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk/m0;

    invoke-direct {v0}, Lk/m0;-><init>()V

    sput-object v0, Lk/m0;->i:Lk/m0;

    const/4 v0, 0x3

    new-array v0, v0, [Lk/b1;

    sget-object v1, Lk/b1;->s:Lk/b1;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lk/b1;->w:Lk/b1;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lk/b1;->y:Lk/b1;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lk/b1;->b([Lk/b1;)I

    move-result v0

    sput v0, Lk/m0;->j:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk/z0;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lk/m0;->i(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    return-void
.end method

.method public final i(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V
    .locals 22

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v0, p2

    move-object/from16 v9, p4

    move/from16 v10, p5

    iget-object v11, v8, Lk/g0;->j:Lk/a1;

    if-nez v0, :cond_0

    invoke-virtual {v11}, Lk/a1;->E()V

    return-void

    :cond_0
    move-object v1, v0

    check-cast v1, Ljava/util/Map;

    sget-object v2, Lk/b1;->D:Lk/b1;

    iget v2, v2, Lk/b1;->b:I

    iget v3, v11, Lk/a1;->d:I

    and-int/2addr v3, v2

    if-nez v3, :cond_1

    and-int/2addr v2, v10

    if-eqz v2, :cond_3

    :cond_1
    instance-of v2, v1, Lf/e;

    if-eqz v2, :cond_2

    check-cast v1, Lf/e;

    iget-object v1, v1, Lf/e;->i:Ljava/util/Map;

    :cond_2
    instance-of v2, v1, Ljava/util/SortedMap;

    if-nez v2, :cond_3

    instance-of v2, v1, Ljava/util/LinkedHashMap;

    if-nez v2, :cond_3

    :try_start_0
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v12, v2

    goto :goto_0

    :catch_0
    :cond_3
    move-object v12, v1

    :goto_0
    invoke-virtual/range {p1 .. p2}, Lk/g0;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual/range {p1 .. p2}, Lk/g0;->t(Ljava/lang/Object;)V

    return-void

    :cond_4
    iget-object v13, v8, Lk/g0;->o:Lk/v0;

    move-object/from16 v1, p3

    invoke-virtual {v8, v13, v0, v1}, Lk/g0;->o(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;)V

    if-nez p6, :cond_5

    const/16 v1, 0x7b

    :try_start_1
    invoke-virtual {v11, v1}, Lk/a1;->write(I)V

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lk/g0;->l()V

    sget-object v1, Lk/b1;->p:Lk/b1;

    invoke-virtual {v11, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, v8, Lk/g0;->i:Lk/x0;

    iget-object v1, v1, Lk/x0;->c:Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lf/e;

    if-eq v2, v3, :cond_6

    const-class v3, Ljava/util/HashMap;

    if-eq v2, v3, :cond_6

    const-class v3, Ljava/util/LinkedHashMap;

    if-ne v2, v3, :cond_7

    :cond_6
    invoke-interface {v12, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x1

    goto :goto_1

    :cond_7
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_8

    invoke-virtual {v11, v1}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v1}, Lk/a1;->J(Ljava/lang/String;)V

    const/4 v1, 0x0

    goto :goto_2

    :cond_8
    const/4 v1, 0x1

    :goto_2
    invoke-interface {v12}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/16 v17, 0x0

    move/from16 v18, v1

    move-object/from16 v6, v17

    move-object/from16 v19, v6

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, v8, Lk/z0;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_c

    if-eqz v1, :cond_b

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_a

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_c

    :cond_a
    invoke-static {v1}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v8, v0, v2}, Lk/z0;->f(Lk/g0;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_8

    :cond_b
    :goto_4
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v7, v8, v0, v2}, Lk/z0;->f(Lk/g0;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_c

    goto/16 :goto_8

    :cond_c
    iget-object v2, v7, Lk/z0;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_10

    if-eqz v1, :cond_f

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_e

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_10

    :cond_e
    invoke-static {v1}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v8, v0, v2}, Lk/z0;->f(Lk/g0;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_8

    :cond_f
    :goto_5
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v7, v8, v0, v2}, Lk/z0;->f(Lk/g0;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_10

    goto/16 :goto_8

    :cond_10
    iget-object v2, v8, Lk/z0;->c:Ljava/util/ArrayList;

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_14

    if-eqz v1, :cond_13

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_11

    goto :goto_6

    :cond_11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_12

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_14

    :cond_12
    invoke-static {v1}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v8, v0, v2, v5}, Lk/z0;->e(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_8

    :cond_13
    :goto_6
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v7, v8, v0, v2, v5}, Lk/z0;->e(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_8

    :cond_14
    iget-object v2, v7, Lk/z0;->c:Ljava/util/ArrayList;

    if-eqz v2, :cond_18

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_18

    if-eqz v1, :cond_17

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_15

    goto :goto_7

    :cond_15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_16

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_18

    :cond_16
    invoke-static {v1}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v8, v0, v2, v5}, Lk/z0;->e(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_8

    :cond_17
    :goto_7
    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v7, v8, v0, v2, v5}, Lk/z0;->e(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    :goto_8
    move-object v15, v6

    goto/16 :goto_12

    :cond_18
    iget-object v2, v8, Lk/z0;->e:Ljava/util/ArrayList;

    if-eqz v2, :cond_1c

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1c

    if-eqz v1, :cond_1b

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_19

    goto :goto_9

    :cond_19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_1a

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_1c

    :cond_1a
    invoke-static {v1}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_a

    :cond_1b
    :goto_9
    check-cast v1, Ljava/lang/String;

    :goto_a
    invoke-virtual {v7, v8, v0, v1, v5}, Lk/z0;->g(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_1c
    iget-object v2, v7, Lk/z0;->e:Ljava/util/ArrayList;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_20

    if-eqz v1, :cond_1f

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_1d

    goto :goto_b

    :cond_1d
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_1e

    instance-of v2, v1, Ljava/lang/Number;

    if-eqz v2, :cond_20

    :cond_1e
    invoke-static {v1}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    goto :goto_c

    :cond_1f
    :goto_b
    check-cast v1, Ljava/lang/String;

    :goto_c
    invoke-virtual {v7, v8, v0, v1, v5}, Lk/z0;->g(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_20
    move-object v4, v1

    if-eqz v4, :cond_25

    instance-of v1, v4, Ljava/lang/String;

    if-eqz v1, :cond_21

    goto :goto_f

    :cond_21
    instance-of v1, v4, Ljava/util/Map;

    if-nez v1, :cond_23

    instance-of v1, v4, Ljava/util/Collection;

    if-eqz v1, :cond_22

    goto :goto_d

    :cond_22
    const/4 v1, 0x0

    goto :goto_e

    :cond_23
    :goto_d
    const/4 v1, 0x1

    :goto_e
    if-nez v1, :cond_24

    invoke-static {v4}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v20

    const/4 v3, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v14, v4

    move-object/from16 v4, p2

    move-object/from16 v21, v5

    move-object/from16 v5, v20

    move-object v15, v6

    move-object/from16 v6, v21

    invoke-virtual/range {v1 .. v6}, Lk/z0;->h(Lk/g0;Lk/j;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_10

    :cond_24
    move-object v14, v4

    move-object/from16 v21, v5

    move-object v15, v6

    move-object/from16 v3, v21

    goto :goto_11

    :cond_25
    :goto_f
    move-object v14, v4

    move-object/from16 v21, v5

    move-object v15, v6

    const/4 v3, 0x0

    move-object v5, v14

    check-cast v5, Ljava/lang/String;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object/from16 v6, v21

    invoke-virtual/range {v1 .. v6}, Lk/z0;->h(Lk/g0;Lk/j;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_10
    move-object v3, v1

    :goto_11
    if-nez v3, :cond_26

    sget v1, Lk/b1;->F:I

    invoke-virtual {v11, v1}, Lk/a1;->f(I)Z

    move-result v1

    if-nez v1, :cond_26

    :goto_12
    move-object v6, v15

    goto/16 :goto_3

    :cond_26
    instance-of v1, v14, Ljava/lang/String;

    const/16 v2, 0x2c

    if-eqz v1, :cond_29

    move-object v4, v14

    check-cast v4, Ljava/lang/String;

    if-nez v18, :cond_27

    invoke-virtual {v11, v2}, Lk/a1;->write(I)V

    :cond_27
    sget-object v1, Lk/b1;->o:Lk/b1;

    invoke-virtual {v11, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-virtual/range {p1 .. p1}, Lk/g0;->n()V

    :cond_28
    invoke-virtual {v11, v4}, Lk/a1;->q(Ljava/lang/String;)V

    goto :goto_14

    :cond_29
    if-nez v18, :cond_2a

    invoke-virtual {v11, v2}, Lk/a1;->write(I)V

    :cond_2a
    sget v1, Lk/m0;->j:I

    invoke-virtual {v11, v1}, Lk/a1;->f(I)Z

    move-result v1

    if-eqz v1, :cond_2b

    instance-of v1, v14, Ljava/lang/Enum;

    if-nez v1, :cond_2b

    invoke-static {v14}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Lk/g0;->r(Ljava/lang/String;)V

    goto :goto_13

    :cond_2b
    invoke-virtual {v8, v14}, Lk/g0;->q(Ljava/lang/Object;)V

    :goto_13
    const/16 v1, 0x3a

    invoke-virtual {v11, v1}, Lk/a1;->write(I)V

    :goto_14
    if-nez v3, :cond_2c

    invoke-virtual {v11}, Lk/a1;->E()V

    move-object v6, v15

    const/16 v18, 0x1

    goto :goto_17

    :cond_2c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    if-eq v6, v15, :cond_2d

    invoke-virtual {v8, v6}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v19

    move-object v15, v6

    :cond_2d
    move-object/from16 v6, v19

    sget-object v1, Lk/b1;->p:Lk/b1;

    invoke-static {v10, v1}, Lk/b1;->a(ILk/b1;)Z

    move-result v1

    if-eqz v1, :cond_2f

    instance-of v1, v6, Lk/h0;

    if-eqz v1, :cond_2f

    instance-of v1, v9, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_2e

    move-object v1, v9

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    array-length v2, v1

    const/4 v4, 0x2

    if-ne v2, v4, :cond_2e

    const/16 v18, 0x1

    aget-object v1, v1, v18

    move-object v5, v1

    goto :goto_15

    :cond_2e
    const/16 v18, 0x1

    move-object/from16 v5, v17

    :goto_15
    move-object v1, v6

    check-cast v1, Lk/h0;

    move-object/from16 v2, p1

    move-object v4, v14

    move-object/from16 v19, v6

    move/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Lk/h0;->q(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    goto :goto_16

    :cond_2f
    move-object/from16 v19, v6

    const/16 v18, 0x1

    const/4 v5, 0x0

    move-object/from16 v1, v19

    move-object/from16 v2, p1

    move-object v4, v14

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_16
    move-object v6, v15

    :goto_17
    const/16 v18, 0x0

    goto/16 :goto_3

    :cond_30
    iput-object v13, v8, Lk/g0;->o:Lk/v0;

    invoke-virtual/range {p1 .. p1}, Lk/g0;->j()V

    sget-object v0, Lk/b1;->o:Lk/b1;

    invoke-virtual {v11, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface {v12}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_31

    invoke-virtual/range {p1 .. p1}, Lk/g0;->n()V

    :cond_31
    if-nez p6, :cond_32

    const/16 v0, 0x7d

    invoke-virtual {v11, v0}, Lk/a1;->write(I)V

    :cond_32
    return-void

    :catchall_0
    move-exception v0

    iput-object v13, v8, Lk/g0;->o:Lk/v0;

    throw v0
.end method
