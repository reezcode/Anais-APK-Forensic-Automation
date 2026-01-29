.class public final Lk/h0;
.super Lk/z0;

# interfaces
.implements Lk/q0;


# instance fields
.field public final i:[Lk/z;

.field public final j:[Lk/z;

.field public k:Lk/w0;

.field public volatile transient l:[J

.field public volatile transient m:[S


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lm/j;->a(Ljava/lang/Class;Z)Lk/w0;

    move-result-object p1

    invoke-direct {p0, p1}, Lk/h0;-><init>(Lk/w0;)V

    return-void
.end method

.method public constructor <init>(Lk/w0;)V
    .locals 6

    invoke-direct {p0}, Lk/z0;-><init>()V

    iput-object p1, p0, Lk/h0;->k:Lk/w0;

    iget-object v0, p1, Lk/w0;->f:[Lm/c;

    array-length v0, v0

    new-array v0, v0, [Lk/z;

    iput-object v0, p0, Lk/h0;->j:[Lk/z;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lk/h0;->j:[Lk/z;

    array-length v3, v2

    if-ge v1, v3, :cond_0

    new-instance v3, Lk/z;

    iget-object v4, p1, Lk/w0;->a:Ljava/lang/Class;

    iget-object v5, p1, Lk/w0;->f:[Lm/c;

    aget-object v5, v5, v1

    invoke-direct {v3, v4, v5}, Lk/z;-><init>(Ljava/lang/Class;Lm/c;)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p1, Lk/w0;->e:[Lm/c;

    iget-object v3, p1, Lk/w0;->f:[Lm/c;

    if-ne v1, v3, :cond_1

    iput-object v2, p0, Lk/h0;->i:[Lk/z;

    goto :goto_2

    :cond_1
    array-length v1, v1

    new-array v1, v1, [Lk/z;

    iput-object v1, p0, Lk/h0;->i:[Lk/z;

    :goto_1
    iget-object v1, p0, Lk/h0;->i:[Lk/z;

    array-length v2, v1

    if-ge v0, v2, :cond_2

    iget-object v2, p1, Lk/w0;->e:[Lm/c;

    aget-object v2, v2, v0

    iget-object v2, v2, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lk/h0;->j(Ljava/lang/String;)Lk/z;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    :goto_2
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

    invoke-virtual/range {v0 .. v6}, Lk/h0;->m(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    return-void
.end method

.method public final i(Lk/g0;Ljava/lang/String;)Z
    .locals 1

    iget-object p1, p1, Lk/z0;->g:Ljava/util/ArrayList;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk/i0;

    invoke-interface {v0}, Lk/i0;->apply()Z

    move-result v0

    if-nez v0, :cond_0

    return p2

    :cond_1
    iget-object p1, p0, Lk/z0;->g:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk/i0;

    invoke-interface {v0}, Lk/i0;->apply()Z

    move-result v0

    if-nez v0, :cond_2

    return p2

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final j(Ljava/lang/String;)Lk/z;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    iget-object v2, p0, Lk/h0;->j:[Lk/z;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-gt v1, v2, :cond_3

    add-int v3, v1, v2

    ushr-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lk/h0;->j:[Lk/z;

    aget-object v4, v4, v3

    iget-object v4, v4, Lk/z;->b:Lm/c;

    iget-object v4, v4, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    move v1, v3

    goto :goto_0

    :cond_1
    if-lez v4, :cond_2

    add-int/lit8 v3, v3, -0x1

    move v2, v3

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lk/h0;->j:[Lk/z;

    aget-object p1, p1, v3

    return-object p1

    :cond_3
    return-object v0
.end method

.method public final k(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;
    .locals 15

    move-object v1, p0

    move-object/from16 v2, p2

    const-string v3, "getFieldValue error."

    iget-object v0, v1, Lk/h0;->l:[J

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez v0, :cond_3

    invoke-static {}, Lf/m;->values()[Lf/m;

    move-result-object v0

    iget-object v6, v1, Lk/h0;->j:[Lk/z;

    array-length v6, v6

    array-length v7, v0

    mul-int v6, v6, v7

    new-array v6, v6, [J

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    iget-object v9, v1, Lk/h0;->j:[Lk/z;

    array-length v10, v9

    if-ge v7, v10, :cond_2

    aget-object v9, v9, v7

    iget-object v9, v9, Lk/z;->b:Lm/c;

    iget-object v9, v9, Lm/c;->b:Ljava/lang/String;

    add-int/lit8 v10, v8, 0x1

    invoke-static {v9}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v11

    aput-wide v11, v6, v8

    const/4 v8, 0x0

    :goto_1
    array-length v11, v0

    if-ge v8, v11, :cond_1

    aget-object v11, v0, v8

    invoke-virtual {v11, v9}, Lf/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v12, v10, 0x1

    invoke-static {v11}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v13

    aput-wide v13, v6, v10

    move v10, v12

    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    move v8, v10

    goto :goto_0

    :cond_2
    invoke-static {v6, v4, v8}, Ljava/util/Arrays;->sort([JII)V

    new-array v7, v8, [J

    iput-object v7, v1, Lk/h0;->l:[J

    iget-object v7, v1, Lk/h0;->l:[J

    invoke-static {v6, v4, v7, v4, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_3

    :cond_3
    move-object v0, v5

    :goto_3
    iget-object v4, v1, Lk/h0;->l:[J

    move-wide/from16 v6, p3

    invoke-static {v4, v6, v7}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v4

    if-gez v4, :cond_4

    goto :goto_7

    :cond_4
    iget-object v6, v1, Lk/h0;->m:[S

    const/4 v7, -0x1

    if-nez v6, :cond_b

    if-nez v0, :cond_5

    invoke-static {}, Lf/m;->values()[Lf/m;

    move-result-object v0

    :cond_5
    iget-object v6, v1, Lk/h0;->l:[J

    array-length v6, v6

    new-array v6, v6, [S

    invoke-static {v6, v7}, Ljava/util/Arrays;->fill([SS)V

    const/4 v8, 0x0

    :goto_4
    iget-object v9, v1, Lk/h0;->j:[Lk/z;

    array-length v10, v9

    if-ge v8, v10, :cond_a

    aget-object v9, v9, v8

    iget-object v9, v9, Lk/z;->b:Lm/c;

    iget-object v9, v9, Lm/c;->b:Ljava/lang/String;

    iget-object v10, v1, Lk/h0;->l:[J

    invoke-static {v9}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v11

    invoke-static {v10, v11, v12}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v10

    if-ltz v10, :cond_6

    int-to-short v11, v8

    aput-short v11, v6, v10

    :cond_6
    const/4 v10, 0x0

    :goto_5
    array-length v11, v0

    if-ge v10, v11, :cond_9

    aget-object v11, v0, v10

    invoke-virtual {v11, v9}, Lf/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    goto :goto_6

    :cond_7
    iget-object v12, v1, Lk/h0;->l:[J

    invoke-static {v11}, Lm/j;->t(Ljava/lang/String;)J

    move-result-wide v13

    invoke-static {v12, v13, v14}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v11

    if-ltz v11, :cond_8

    int-to-short v12, v8

    aput-short v12, v6, v11

    :cond_8
    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_a
    iput-object v6, v1, Lk/h0;->m:[S

    :cond_b
    iget-object v0, v1, Lk/h0;->m:[S

    aget-short v0, v0, v4

    if-eq v0, v7, :cond_c

    iget-object v4, v1, Lk/h0;->j:[Lk/z;

    aget-object v0, v4, v0

    goto :goto_8

    :cond_c
    :goto_7
    move-object v0, v5

    :goto_8
    if-nez v0, :cond_d

    return-object v5

    :cond_d
    move-object/from16 v4, p1

    :try_start_0
    invoke-virtual {v0, v4}, Lk/z;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    move-object v4, v0

    new-instance v0, Lf/d;

    invoke-static {v3, v2}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception v0

    move-object v4, v0

    new-instance v0, Lf/d;

    invoke-static {v3, v2}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v4}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final l(Ljava/lang/Object;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lk/h0;->j:[Lk/z;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Lk/h0;->j:[Lk/z;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v4, p1}, Lk/z;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final m(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V
    .locals 27

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    const-class v12, Ljava/lang/String;

    iget-object v13, v8, Lk/g0;->j:Lk/a1;

    if-nez v9, :cond_0

    invoke-virtual {v13}, Lk/a1;->E()V

    return-void

    :cond_0
    iget-object v0, v8, Lk/g0;->o:Lk/v0;

    sget-object v1, Lk/b1;->q:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    if-eqz v0, :cond_2

    iget v0, v0, Lk/v0;->d:I

    and-int/2addr v0, v1

    if-nez v0, :cond_2

    and-int v0, p5, v1

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v8, Lk/g0;->n:Ljava/util/IdentityHashMap;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v9}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p1 .. p2}, Lk/g0;->t(Ljava/lang/Object;)V

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    return-void

    :cond_3
    iget-boolean v0, v13, Lk/a1;->h:Z

    if-eqz v0, :cond_4

    iget-object v0, v7, Lk/h0;->j:[Lk/z;

    goto :goto_2

    :cond_4
    iget-object v0, v7, Lk/h0;->i:[Lk/z;

    :goto_2
    move-object v6, v0

    iget-object v5, v8, Lk/g0;->o:Lk/v0;

    iget-object v0, v7, Lk/h0;->k:Lk/w0;

    iget-object v0, v0, Lk/w0;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v7, Lk/h0;->k:Lk/w0;

    iget v0, v0, Lk/w0;->g:I

    move-object/from16 v1, p1

    move-object v2, v5

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object v14, v5

    move v5, v0

    move-object v15, v6

    move/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Lk/g0;->p(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;II)V

    goto :goto_3

    :cond_5
    move-object v14, v5

    move-object v15, v6

    :goto_3
    sget-object v0, Lk/b1;->v:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    iget-object v1, v7, Lk/h0;->k:Lk/w0;

    iget v1, v1, Lk/w0;->g:I

    and-int/2addr v1, v0

    if-nez v1, :cond_7

    iget-object v1, v8, Lk/g0;->j:Lk/a1;

    iget-boolean v1, v1, Lk/a1;->j:Z

    if-nez v1, :cond_7

    and-int v0, p5, v0

    if-eqz v0, :cond_6

    goto :goto_4

    :cond_6
    const/16 v16, 0x0

    goto :goto_5

    :cond_7
    :goto_4
    const/16 v16, 0x1

    :goto_5
    if-eqz v16, :cond_8

    const/16 v0, 0x5b

    goto :goto_6

    :cond_8
    const/16 v0, 0x7b

    :goto_6
    if-eqz v16, :cond_9

    const/16 v1, 0x5d

    const/16 v6, 0x5d

    goto :goto_7

    :cond_9
    const/16 v1, 0x7d

    const/16 v6, 0x7d

    :goto_7
    if-nez p6, :cond_a

    :try_start_0
    invoke-virtual {v13, v0}, Lk/a1;->write(I)V

    :cond_a
    array-length v0, v15

    if-lez v0, :cond_b

    sget-object v0, Lk/b1;->o:Lk/b1;

    invoke-virtual {v13, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-virtual/range {p1 .. p1}, Lk/g0;->l()V

    invoke-virtual/range {p1 .. p1}, Lk/g0;->n()V

    :cond_b
    iget-object v0, v7, Lk/h0;->k:Lk/w0;

    iget v0, v0, Lk/w0;->g:I

    sget-object v1, Lk/b1;->p:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    and-int/2addr v0, v1

    if-nez v0, :cond_c

    and-int v0, p5, v1

    if-nez v0, :cond_c

    invoke-virtual {v8, v11}, Lk/g0;->m(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-eqz v0, :cond_e

    :cond_c
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-eq v0, v11, :cond_d

    instance-of v1, v11, Ljava/lang/reflect/WildcardType;

    if-eqz v1, :cond_d

    invoke-static/range {p4 .. p4}, Lm/j;->w(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    goto :goto_8

    :cond_d
    move-object v1, v11

    :goto_8
    if-eq v0, v1, :cond_e

    iget-object v0, v7, Lk/h0;->k:Lk/w0;

    iget-object v0, v0, Lk/w0;->c:Ljava/lang/String;

    invoke-virtual {v7, v8, v0, v9}, Lk/h0;->p(Lk/g0;Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    goto :goto_9

    :cond_e
    const/4 v0, 0x0

    :goto_9
    const/16 v5, 0x2c

    if-eqz v0, :cond_f

    const/16 v0, 0x2c

    goto :goto_a

    :cond_f
    const/4 v0, 0x0

    :goto_a
    iget-boolean v1, v13, Lk/a1;->g:Z

    if-eqz v1, :cond_10

    iget-boolean v1, v13, Lk/a1;->f:Z

    if-nez v1, :cond_10

    const/16 v17, 0x1

    goto :goto_b

    :cond_10
    const/16 v17, 0x0

    :goto_b
    invoke-virtual {v7, v8, v9, v0}, Lk/h0;->o(Lk/g0;Ljava/lang/Object;C)C

    move-result v0

    if-ne v0, v5, :cond_11

    const/4 v0, 0x1

    goto :goto_c

    :cond_11
    const/4 v0, 0x0

    :goto_c
    sget-object v1, Lk/b1;->m:Lk/b1;

    invoke-virtual {v13, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v18

    sget-object v1, Lk/b1;->z:Lk/b1;

    invoke-virtual {v13, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v19

    move/from16 v20, v0

    const/4 v4, 0x0

    :goto_d
    array-length v0, v15
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ge v4, v0, :cond_38

    :try_start_1
    aget-object v3, v15, v4

    iget-object v2, v3, Lk/z;->b:Lm/c;

    iget-object v0, v2, Lm/c;->d:Ljava/lang/reflect/Field;

    iget-object v1, v2, Lm/c;->b:Ljava/lang/String;

    iget-object v10, v2, Lm/c;->f:Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v18, :cond_12

    if-eqz v0, :cond_12

    :try_start_2
    iget-boolean v5, v2, Lm/c;->o:Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v5, :cond_12

    goto/16 :goto_19

    :cond_12
    if-eqz v19, :cond_13

    if-nez v0, :cond_13

    goto/16 :goto_19

    :cond_13
    :try_start_3
    invoke-virtual {v7, v8, v9, v1}, Lk/z0;->f(Lk/g0;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_36

    iget-object v0, v2, Lm/c;->l:Ljava/lang/String;

    invoke-virtual {v7, v8, v0}, Lk/h0;->i(Lk/g0;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_19

    :cond_14
    iget-object v0, v7, Lk/h0;->k:Lk/w0;

    iget-object v0, v0, Lk/w0;->c:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_15

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v8, v11}, Lk/g0;->m(Ljava/lang/reflect/Type;)Z

    move-result v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v0, :cond_15

    goto/16 :goto_19

    :cond_15
    :try_start_5
    invoke-virtual {v3, v9}, Lk/z;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_e

    :catch_0
    move-exception v0

    move-object v5, v0

    :try_start_6
    sget-object v0, Lk/b1;->B:Lk/b1;

    invoke-virtual {v13, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_35

    const/4 v0, 0x0

    :goto_e
    invoke-virtual {v7, v8, v9, v1, v0}, Lk/z0;->e(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-nez v5, :cond_16

    goto/16 :goto_19

    :cond_16
    if-ne v10, v12, :cond_17

    :try_start_7
    const-string v5, "trim"

    move/from16 v21, v4

    iget-object v4, v2, Lm/c;->t:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_18

    if-eqz v0, :cond_18

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_f

    :cond_17
    move/from16 v21, v4

    :cond_18
    :goto_f
    :try_start_8
    invoke-virtual {v7, v8, v9, v1, v0}, Lk/z0;->g(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-object v4, v3, Lk/z;->h:Lk/j;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object/from16 v22, v1

    move-object/from16 v1, p0

    move-object v11, v2

    move-object/from16 v2, p1

    move-object/from16 v23, v14

    move-object v14, v3

    move-object v3, v4

    move-object/from16 v4, p2

    move-object/from16 v24, v15

    const/16 v9, 0x2c

    move-object v15, v5

    move-object/from16 v5, v22

    move/from16 v25, v6

    move-object v6, v0

    :try_start_9
    invoke-virtual/range {v1 .. v6}, Lk/z0;->h(Lk/g0;Lk/j;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_19

    if-nez v16, :cond_19

    iget-boolean v2, v14, Lk/z;->c:Z

    if-nez v2, :cond_19

    sget v2, Lk/b1;->F:I

    invoke-virtual {v13, v2}, Lk/a1;->f(I)Z

    move-result v2

    if-nez v2, :cond_19

    goto/16 :goto_10

    :cond_19
    if-eqz v1, :cond_21

    iget-boolean v2, v13, Lk/a1;->l:Z

    if-nez v2, :cond_1a

    iget v2, v11, Lm/c;->j:I

    sget-object v3, Lk/b1;->x:Lk/b1;

    iget v3, v3, Lk/b1;->b:I

    and-int/2addr v2, v3

    if-nez v2, :cond_1a

    iget-object v2, v7, Lk/h0;->k:Lk/w0;

    iget v2, v2, Lk/w0;->g:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_21

    :cond_1a
    iget-object v2, v11, Lm/c;->f:Ljava/lang/Class;

    sget-object v3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_1b

    instance-of v3, v1, Ljava/lang/Byte;

    if-eqz v3, :cond_1b

    move-object v3, v1

    check-cast v3, Ljava/lang/Byte;

    invoke-virtual {v3}, Ljava/lang/Byte;->byteValue()B

    move-result v3

    if-nez v3, :cond_1b

    goto/16 :goto_10

    :cond_1b
    sget-object v3, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_1c

    instance-of v3, v1, Ljava/lang/Short;

    if-eqz v3, :cond_1c

    move-object v3, v1

    check-cast v3, Ljava/lang/Short;

    invoke-virtual {v3}, Ljava/lang/Short;->shortValue()S

    move-result v3

    if-nez v3, :cond_1c

    goto/16 :goto_10

    :cond_1c
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_1d

    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_1d

    move-object v3, v1

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-nez v3, :cond_1d

    goto/16 :goto_10

    :cond_1d
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_1e

    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_1e

    move-object v3, v1

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v26, v3, v5

    if-nez v26, :cond_1e

    goto :goto_10

    :cond_1e
    sget-object v3, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_1f

    instance-of v3, v1, Ljava/lang/Float;

    if-eqz v3, :cond_1f

    move-object v3, v1

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-nez v3, :cond_1f

    goto :goto_10

    :cond_1f
    sget-object v3, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_20

    instance-of v3, v1, Ljava/lang/Double;

    if-eqz v3, :cond_20

    move-object v3, v1

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double v26, v3, v5

    if-nez v26, :cond_20

    goto :goto_10

    :cond_20
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_21

    instance-of v2, v1, Ljava/lang/Boolean;

    if-eqz v2, :cond_21

    move-object v2, v1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-nez v2, :cond_21

    goto :goto_10

    :cond_21
    if-eqz v20, :cond_23

    iget-boolean v2, v11, Lm/c;->s:Z

    if-eqz v2, :cond_22

    instance-of v2, v1, Ljava/util/Map;

    if-eqz v2, :cond_22

    move-object v2, v1

    check-cast v2, Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    if-nez v2, :cond_22

    :goto_10
    const/4 v3, 0x0

    goto/16 :goto_1a

    :cond_22
    invoke-virtual {v13, v9}, Lk/a1;->write(I)V

    sget-object v2, Lk/b1;->o:Lk/b1;

    invoke-virtual {v13, v2}, Lk/a1;->l(Lk/b1;)Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-virtual/range {p1 .. p1}, Lk/g0;->n()V

    :cond_23
    move-object/from16 v2, v22

    if-eq v15, v2, :cond_24

    if-nez v16, :cond_25

    invoke-virtual {v13, v15}, Lk/a1;->q(Ljava/lang/String;)V

    goto :goto_11

    :cond_24
    if-eq v0, v1, :cond_26

    if-nez v16, :cond_25

    invoke-virtual {v14, v8}, Lk/z;->c(Lk/g0;)V

    :cond_25
    :goto_11
    invoke-virtual {v8, v1}, Lk/g0;->q(Ljava/lang/Object;)V

    goto :goto_14

    :cond_26
    if-nez v16, :cond_28

    iget-boolean v0, v11, Lm/c;->s:Z

    if-nez v0, :cond_28

    if-eqz v17, :cond_27

    iget-object v0, v11, Lm/c;->p:[C

    array-length v2, v0

    const/4 v3, 0x0

    invoke-virtual {v13, v0, v3, v2}, Lk/a1;->write([CII)V

    goto :goto_12

    :cond_27
    invoke-virtual {v14, v8}, Lk/z;->c(Lk/g0;)V

    :cond_28
    :goto_12
    if-nez v16, :cond_30

    invoke-virtual {v11}, Lm/c;->c()Lg/b;

    move-result-object v0

    if-ne v10, v12, :cond_2e

    if-eqz v0, :cond_29

    invoke-interface {v0}, Lg/b;->serializeUsing()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ljava/lang/Void;

    if-ne v0, v2, :cond_2e

    :cond_29
    if-nez v1, :cond_2c

    iget v0, v13, Lk/a1;->d:I

    sget-object v2, Lk/b1;->j:Lk/b1;

    iget v2, v2, Lk/b1;->b:I

    and-int/2addr v0, v2

    if-nez v0, :cond_2b

    iget v0, v14, Lk/z;->d:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_2a

    goto :goto_13

    :cond_2a
    invoke-virtual {v13}, Lk/a1;->E()V

    goto :goto_14

    :cond_2b
    :goto_13
    const-string v0, ""

    invoke-virtual {v13, v0}, Lk/a1;->J(Ljava/lang/String;)V

    goto :goto_14

    :cond_2c
    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    iget-boolean v2, v13, Lk/a1;->f:Z

    if-eqz v2, :cond_2d

    invoke-virtual {v13, v0}, Lk/a1;->M(Ljava/lang/String;)V

    :goto_14
    const/4 v3, 0x0

    goto :goto_15

    :cond_2d
    const/4 v3, 0x0

    invoke-virtual {v13, v0, v3}, Lk/a1;->K(Ljava/lang/String;C)V

    goto :goto_15

    :cond_2e
    const/4 v3, 0x0

    iget-boolean v0, v11, Lm/c;->s:Z

    if-eqz v0, :cond_2f

    instance-of v0, v1, Ljava/util/Map;

    if-eqz v0, :cond_2f

    move-object v0, v1

    check-cast v0, Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_2f

    const/16 v20, 0x0

    goto :goto_1a

    :cond_2f
    invoke-virtual {v14, v8, v1}, Lk/z;->d(Lk/g0;Ljava/lang/Object;)V

    goto :goto_15

    :cond_30
    const/4 v3, 0x0

    invoke-virtual {v14, v8, v1}, Lk/z;->d(Lk/g0;Ljava/lang/Object;)V

    :goto_15
    iget-boolean v0, v11, Lm/c;->s:Z

    if-eqz v0, :cond_34

    instance-of v0, v1, Ljava/util/Map;

    if-eqz v0, :cond_34

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    if-nez v0, :cond_31

    goto :goto_17

    :cond_31
    sget-object v0, Lk/b1;->e:Lk/b1;

    iget-object v2, v8, Lk/g0;->j:Lk/a1;

    invoke-virtual {v2, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-nez v0, :cond_34

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_33

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_32

    const/4 v0, 0x1

    goto :goto_16

    :cond_33
    const/4 v0, 0x0

    :goto_16
    if-nez v0, :cond_34

    :goto_17
    const/4 v0, 0x1

    goto :goto_18

    :cond_34
    const/4 v0, 0x0

    :goto_18
    if-nez v0, :cond_37

    const/16 v20, 0x1

    goto :goto_1a

    :cond_35
    move-object/from16 v23, v14

    throw v5
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catch_1
    move-exception v0

    goto :goto_1b

    :cond_36
    :goto_19
    move/from16 v21, v4

    move/from16 v25, v6

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    const/4 v3, 0x0

    const/16 v9, 0x2c

    :cond_37
    :goto_1a
    add-int/lit8 v4, v21, 0x1

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v14, v23

    move-object/from16 v15, v24

    move/from16 v6, v25

    const/16 v5, 0x2c

    goto/16 :goto_d

    :catch_2
    move-exception v0

    move-object/from16 v23, v14

    :goto_1b
    move-object/from16 v1, p2

    goto :goto_1d

    :cond_38
    move/from16 v25, v6

    move-object/from16 v23, v14

    move-object/from16 v24, v15

    const/4 v3, 0x0

    const/16 v9, 0x2c

    move-object/from16 v1, p2

    if-eqz v20, :cond_39

    const/16 v15, 0x2c

    goto :goto_1c

    :cond_39
    const/4 v15, 0x0

    :goto_1c
    :try_start_a
    invoke-virtual {v7, v8, v1, v15}, Lk/h0;->n(Lk/g0;Ljava/lang/Object;C)C

    move-object/from16 v2, v24

    array-length v0, v2

    if-lez v0, :cond_3a

    sget-object v0, Lk/b1;->o:Lk/b1;

    invoke-virtual {v13, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_3a

    invoke-virtual/range {p1 .. p1}, Lk/g0;->j()V

    invoke-virtual/range {p1 .. p1}, Lk/g0;->n()V

    :cond_3a
    if-nez p6, :cond_3b

    move/from16 v2, v25

    invoke-virtual {v13, v2}, Lk/a1;->write(I)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :cond_3b
    move-object/from16 v2, v23

    iput-object v2, v8, Lk/g0;->o:Lk/v0;

    return-void

    :catchall_0
    move-exception v0

    move-object/from16 v2, v23

    goto :goto_1f

    :catch_3
    move-exception v0

    :goto_1d
    move-object/from16 v2, v23

    goto :goto_1e

    :catchall_1
    move-exception v0

    move-object v2, v14

    goto :goto_1f

    :catch_4
    move-exception v0

    move-object v1, v9

    move-object v2, v14

    :goto_1e
    :try_start_b
    const-string v3, "write javaBean error, fastjson version 1.2.40"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", class "

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, p3

    if-eqz v3, :cond_3c

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", fieldName : "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3c
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3d

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3d
    new-instance v3, Lf/d;

    invoke-direct {v3, v1, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception v0

    :goto_1f
    iput-object v2, v8, Lk/g0;->o:Lk/v0;

    throw v0
.end method

.method public final n(Lk/g0;Ljava/lang/Object;C)C
    .locals 2

    iget-object v0, p1, Lk/z0;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/c;

    invoke-virtual {v1, p1, p2, p3}, Lk/c;->e(Lk/g0;Ljava/lang/Object;C)C

    move-result p3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/z0;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/c;

    invoke-virtual {v1, p1, p2, p3}, Lk/c;->e(Lk/g0;Ljava/lang/Object;C)C

    move-result p3

    goto :goto_1

    :cond_1
    return p3
.end method

.method public final o(Lk/g0;Ljava/lang/Object;C)C
    .locals 2

    iget-object v0, p1, Lk/z0;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/k;

    invoke-virtual {v1, p1, p2, p3}, Lk/k;->e(Lk/g0;Ljava/lang/Object;C)C

    move-result p3

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk/z0;->a:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk/k;

    invoke-virtual {v1, p1, p2, p3}, Lk/k;->e(Lk/g0;Ljava/lang/Object;C)C

    move-result p3

    goto :goto_1

    :cond_1
    return p3
.end method

.method public final p(Lk/g0;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p1, Lk/g0;->i:Lk/x0;

    iget-object p2, p2, Lk/x0;->c:Ljava/lang/String;

    :cond_0
    iget-object v0, p1, Lk/g0;->j:Lk/a1;

    invoke-virtual {v0, p2}, Lk/a1;->q(Ljava/lang/String;)V

    iget-object p2, p0, Lk/h0;->k:Lk/w0;

    iget-object p2, p2, Lk/w0;->b:Ljava/lang/String;

    if-nez p2, :cond_2

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lm/j;->N(Ljava/lang/Class;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    :cond_2
    invoke-virtual {p1, p2}, Lk/g0;->r(Ljava/lang/String;)V

    return-void
.end method

.method public final q(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lk/h0;->m(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;IZ)V

    return-void
.end method
