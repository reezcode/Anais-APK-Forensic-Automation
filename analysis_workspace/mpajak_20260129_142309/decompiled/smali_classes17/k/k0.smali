.class public final Lk/k0;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static final a:Lk/k0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/k0;

    invoke-direct {v0}, Lk/k0;-><init>()V

    sput-object v0, Lk/k0;->a:Lk/k0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 19

    move-object/from16 v7, p1

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    iget-object v1, v7, Lk/g0;->j:Lk/a1;

    sget-object v2, Lk/b1;->p:Lk/b1;

    invoke-virtual {v1, v2}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    const/4 v3, 0x1

    const/4 v9, 0x0

    if-nez v1, :cond_2

    iget v1, v2, Lk/b1;->b:I

    and-int v1, p5, v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v10, 0x1

    :goto_2
    iget-object v11, v7, Lk/g0;->j:Lk/a1;

    const/4 v1, 0x0

    if-eqz v10, :cond_3

    invoke-static/range {p4 .. p4}, Lm/j;->y(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    :cond_3
    move-object v12, v1

    if-nez v0, :cond_4

    sget-object v0, Lk/b1;->i:Lk/b1;

    invoke-virtual {v11, v0}, Lk/a1;->I(Lk/b1;)V

    return-void

    :cond_4
    move-object v13, v0

    check-cast v13, Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_5

    const-string v0, "[]"

    invoke-virtual {v11, v0}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    return-void

    :cond_5
    iget-object v14, v7, Lk/g0;->o:Lk/v0;

    invoke-virtual {v7, v14, v0, v8}, Lk/g0;->o(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;)V

    :try_start_0
    sget-object v1, Lk/b1;->o:Lk/b1;

    invoke-virtual {v11, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    const/16 v2, 0x5b

    const/16 v15, 0x2c

    const/16 v6, 0x5d

    if-eqz v1, :cond_a

    invoke-virtual {v11, v2}, Lk/a1;->write(I)V

    invoke-virtual/range {p1 .. p1}, Lk/g0;->l()V

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v13, 0x0

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    if-eqz v13, :cond_6

    invoke-virtual {v11, v15}, Lk/a1;->write(I)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lk/g0;->n()V

    if-eqz v3, :cond_8

    invoke-virtual {v7, v3}, Lk/g0;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v7, v3}, Lk/g0;->t(Ljava/lang/Object;)V

    const/16 v9, 0x5d

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v7, v1}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v1

    new-instance v2, Lk/v0;

    invoke-direct {v2, v14, v0, v8, v9}, Lk/v0;-><init>(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v2, v7, Lk/g0;->o:Lk/v0;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v2, p1

    move-object v5, v12

    const/16 v9, 0x5d

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    goto :goto_4

    :cond_8
    const/16 v9, 0x5d

    iget-object v1, v7, Lk/g0;->j:Lk/a1;

    invoke-virtual {v1}, Lk/a1;->E()V

    :goto_4
    add-int/lit8 v13, v13, 0x1

    const/16 v6, 0x5d

    const/4 v9, 0x0

    goto :goto_3

    :cond_9
    const/16 v9, 0x5d

    invoke-virtual/range {p1 .. p1}, Lk/g0;->j()V

    invoke-virtual/range {p1 .. p1}, Lk/g0;->n()V

    invoke-virtual {v11, v9}, Lk/a1;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v14, v7, Lk/g0;->o:Lk/v0;

    return-void

    :cond_a
    const/16 v9, 0x5d

    :try_start_1
    invoke-virtual {v11, v2}, Lk/a1;->write(I)V

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v6

    const/4 v5, 0x0

    :goto_5
    if-ge v5, v6, :cond_14

    invoke-interface {v13, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v5, :cond_b

    invoke-virtual {v11, v15}, Lk/a1;->write(I)V

    :cond_b
    if-nez v3, :cond_c

    const-string v1, "null"

    invoke-virtual {v11, v1}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    goto :goto_6

    :cond_c
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Integer;

    if-ne v1, v2, :cond_d

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v11, v1}, Lk/a1;->z(I)V

    goto :goto_6

    :cond_d
    const-class v2, Ljava/lang/Long;

    if-ne v1, v2, :cond_f

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    if-eqz v10, :cond_e

    invoke-virtual {v11, v1, v2}, Lk/a1;->A(J)V

    const/16 v1, 0x4c

    invoke-virtual {v11, v1}, Lk/a1;->write(I)V

    goto :goto_6

    :cond_e
    invoke-virtual {v11, v1, v2}, Lk/a1;->A(J)V

    :goto_6
    move/from16 v17, v5

    move/from16 v18, v6

    :goto_7
    const/16 v16, 0x0

    goto/16 :goto_9

    :cond_f
    sget-object v1, Lk/b1;->q:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    and-int v1, v1, p5

    if-eqz v1, :cond_10

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v7, v1}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v2, p1

    move/from16 v17, v5

    move-object v5, v12

    move/from16 v18, v6

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    goto :goto_7

    :cond_10
    move/from16 v17, v5

    move/from16 v18, v6

    iget-boolean v1, v11, Lk/a1;->i:Z

    if-nez v1, :cond_11

    new-instance v1, Lk/v0;

    const/4 v6, 0x0

    invoke-direct {v1, v14, v0, v8, v6}, Lk/v0;-><init>(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v1, v7, Lk/g0;->o:Lk/v0;

    goto :goto_8

    :cond_11
    const/4 v6, 0x0

    :goto_8
    invoke-virtual {v7, v3}, Lk/g0;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v7, v3}, Lk/g0;->t(Ljava/lang/Object;)V

    goto :goto_7

    :cond_12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v7, v1}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v1

    sget-object v2, Lk/b1;->p:Lk/b1;

    iget v2, v2, Lk/b1;->b:I

    and-int v2, v2, p5

    if-eqz v2, :cond_13

    instance-of v2, v1, Lk/h0;

    if-eqz v2, :cond_13

    check-cast v1, Lk/h0;

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v2, p1

    move-object v5, v12

    const/16 v16, 0x0

    move/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Lk/h0;->q(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    goto :goto_9

    :cond_13
    const/16 v16, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v2, p1

    move-object v5, v12

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    :goto_9
    add-int/lit8 v5, v17, 0x1

    move/from16 v6, v18

    goto/16 :goto_5

    :cond_14
    invoke-virtual {v11, v9}, Lk/a1;->write(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v14, v7, Lk/g0;->o:Lk/v0;

    return-void

    :catchall_0
    move-exception v0

    iput-object v14, v7, Lk/g0;->o:Lk/v0;

    throw v0
.end method
