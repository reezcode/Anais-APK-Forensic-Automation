.class public final Lf4/r$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JLf4/f;ILjava/util/List;IILjava/util/List;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lf4/f;",
            "I",
            "Ljava/util/List<",
            "+",
            "Lf4/i;",
            ">;II",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p3

    move/from16 v1, p4

    move-object/from16 v11, p5

    move/from16 v2, p6

    move/from16 v12, p7

    move-object/from16 v13, p8

    if-ge v2, v12, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-string v6, "Failed requirement."

    if-eqz v5, :cond_14

    move v5, v2

    :goto_1
    if-ge v5, v12, :cond_3

    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf4/i;

    invoke-virtual {v7}, Lf4/i;->c()I

    move-result v7

    if-lt v7, v1, :cond_1

    const/4 v7, 0x1

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-eqz v7, :cond_2

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-interface/range {p5 .. p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/i;

    add-int/lit8 v6, v12, -0x1

    invoke-interface {v11, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf4/i;

    invoke-virtual {v5}, Lf4/i;->c()I

    move-result v7

    if-ne v1, v7, :cond_4

    invoke-interface {v13, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    add-int/lit8 v2, v2, 0x1

    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf4/i;

    move-object/from16 v20, v7

    move v7, v2

    move v2, v5

    move-object/from16 v5, v20

    goto :goto_3

    :cond_4
    move v7, v2

    const/4 v2, -0x1

    :goto_3
    invoke-virtual {v5, v1}, Lf4/i;->f(I)B

    move-result v8

    invoke-virtual {v6, v1}, Lf4/i;->f(I)B

    move-result v9

    const/4 v10, 0x4

    const/4 v15, 0x2

    if-eq v8, v9, :cond_e

    add-int/lit8 v3, v7, 0x1

    const/4 v4, 0x1

    :goto_4
    if-ge v3, v12, :cond_6

    add-int/lit8 v5, v3, -0x1

    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/i;

    invoke-virtual {v5, v1}, Lf4/i;->f(I)B

    move-result v5

    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf4/i;

    invoke-virtual {v6, v1}, Lf4/i;->f(I)B

    move-result v6

    if-eq v5, v6, :cond_5

    add-int/lit8 v4, v4, 0x1

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_6
    iget-wide v5, v0, Lf4/f;->c:J

    int-to-long v9, v10

    div-long/2addr v5, v9

    add-long v5, v5, p1

    int-to-long v14, v15

    add-long/2addr v5, v14

    mul-int/lit8 v3, v4, 0x2

    int-to-long v14, v3

    add-long/2addr v14, v5

    invoke-virtual {v0, v4}, Lf4/f;->I(I)Lf4/f;

    invoke-virtual {v0, v2}, Lf4/f;->I(I)Lf4/f;

    move v2, v7

    :goto_5
    if-ge v2, v12, :cond_9

    invoke-interface {v11, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/i;

    invoke-virtual {v3, v1}, Lf4/i;->f(I)B

    move-result v3

    if-eq v2, v7, :cond_7

    add-int/lit8 v4, v2, -0x1

    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf4/i;

    invoke-virtual {v4, v1}, Lf4/i;->f(I)B

    move-result v4

    if-eq v3, v4, :cond_8

    :cond_7
    and-int/lit16 v3, v3, 0xff

    invoke-virtual {v0, v3}, Lf4/f;->I(I)Lf4/f;

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_9
    new-instance v8, Lf4/f;

    invoke-direct {v8}, Lf4/f;-><init>()V

    :goto_6
    if-ge v7, v12, :cond_d

    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf4/i;

    invoke-virtual {v2, v1}, Lf4/i;->f(I)B

    move-result v2

    add-int/lit8 v3, v7, 0x1

    move v4, v3

    :goto_7
    if-ge v4, v12, :cond_b

    invoke-interface {v11, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf4/i;

    invoke-virtual {v5, v1}, Lf4/i;->f(I)B

    move-result v5

    if-eq v2, v5, :cond_a

    move v6, v4

    goto :goto_8

    :cond_a
    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_b
    move v6, v12

    :goto_8
    if-ne v3, v6, :cond_c

    add-int/lit8 v2, v1, 0x1

    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf4/i;

    invoke-virtual {v3}, Lf4/i;->c()I

    move-result v3

    if-ne v2, v3, :cond_c

    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0, v2}, Lf4/f;->I(I)Lf4/f;

    move/from16 v17, v6

    move-wide/from16 v18, v9

    move-wide/from16 p1, v14

    move-object v14, v8

    goto :goto_9

    :cond_c
    iget-wide v2, v8, Lf4/f;->c:J

    div-long/2addr v2, v9

    add-long/2addr v2, v14

    long-to-int v3, v2

    const/4 v2, -0x1

    mul-int/lit8 v3, v3, -0x1

    invoke-virtual {v0, v3}, Lf4/f;->I(I)Lf4/f;

    add-int/lit8 v16, v1, 0x1

    move-object/from16 v2, p0

    move-wide v3, v14

    move-object v5, v8

    move/from16 v17, v6

    move/from16 v6, v16

    move/from16 v16, v7

    move-object/from16 v7, p5

    move-wide/from16 p1, v14

    move-object v14, v8

    move/from16 v8, v16

    move-wide/from16 v18, v9

    move/from16 v9, v17

    move-object/from16 v10, p8

    invoke-virtual/range {v2 .. v10}, Lf4/r$a;->a(JLf4/f;ILjava/util/List;IILjava/util/List;)V

    :goto_9
    move-object v8, v14

    move/from16 v7, v17

    move-wide/from16 v9, v18

    move-wide/from16 v14, p1

    goto :goto_6

    :cond_d
    move-object v14, v8

    invoke-virtual {v0, v14}, Lf4/f;->b0(Lf4/a0;)J

    goto/16 :goto_d

    :cond_e
    invoke-virtual {v5}, Lf4/i;->c()I

    move-result v8

    invoke-virtual {v6}, Lf4/i;->c()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    move v9, v1

    const/4 v14, 0x0

    :goto_a
    if-ge v9, v8, :cond_f

    invoke-virtual {v5, v9}, Lf4/i;->f(I)B

    move-result v3

    invoke-virtual {v6, v9}, Lf4/i;->f(I)B

    move-result v4

    if-ne v3, v4, :cond_f

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_f
    iget-wide v3, v0, Lf4/f;->c:J

    int-to-long v8, v10

    div-long/2addr v3, v8

    add-long v3, v3, p1

    move-wide/from16 v18, v8

    int-to-long v8, v15

    add-long/2addr v3, v8

    int-to-long v8, v14

    add-long/2addr v3, v8

    const-wide/16 v8, 0x1

    add-long/2addr v3, v8

    neg-int v6, v14

    invoke-virtual {v0, v6}, Lf4/f;->I(I)Lf4/f;

    invoke-virtual {v0, v2}, Lf4/f;->I(I)Lf4/f;

    add-int v6, v1, v14

    :goto_b
    if-ge v1, v6, :cond_10

    invoke-virtual {v5, v1}, Lf4/i;->f(I)B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    invoke-virtual {v0, v2}, Lf4/f;->I(I)Lf4/f;

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_10
    add-int/lit8 v1, v7, 0x1

    if-ne v1, v12, :cond_13

    invoke-interface {v11, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf4/i;

    invoke-virtual {v1}, Lf4/i;->c()I

    move-result v1

    if-ne v6, v1, :cond_11

    const/4 v3, 0x1

    goto :goto_c

    :cond_11
    const/4 v3, 0x0

    :goto_c
    if-eqz v3, :cond_12

    invoke-interface {v13, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lf4/f;->I(I)Lf4/f;

    goto :goto_d

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v10, Lf4/f;

    invoke-direct {v10}, Lf4/f;-><init>()V

    iget-wide v1, v10, Lf4/f;->c:J

    div-long v1, v1, v18

    add-long/2addr v1, v3

    long-to-int v2, v1

    const/4 v1, -0x1

    mul-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Lf4/f;->I(I)Lf4/f;

    move-object/from16 v1, p0

    move-wide v2, v3

    move-object v4, v10

    move v5, v6

    move-object/from16 v6, p5

    move/from16 v8, p7

    move-object/from16 v9, p8

    invoke-virtual/range {v1 .. v9}, Lf4/r$a;->a(JLf4/f;ILjava/util/List;IILjava/util/List;)V

    invoke-virtual {v0, v10}, Lf4/f;->b0(Lf4/a0;)J

    :goto_d
    return-void

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
