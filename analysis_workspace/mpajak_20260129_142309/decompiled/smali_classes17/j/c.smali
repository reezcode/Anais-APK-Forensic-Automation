.class public final Lj/c;
.super Lj/k;


# instance fields
.field public final c:Ljava/lang/reflect/Type;

.field public d:I

.field public e:Lj/s;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lm/c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i;",
            "Ljava/lang/Class<",
            "*>;",
            "Lm/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lj/k;-><init>(Ljava/lang/Class;Lm/c;)V

    iget-object p1, p2, Lm/c;->g:Ljava/lang/reflect/Type;

    instance-of p2, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p1

    const/4 p2, 0x0

    aget-object p1, p1, p2

    instance-of v0, p1, Ljava/lang/reflect/WildcardType;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ljava/lang/reflect/WildcardType;

    invoke-interface {v0}, Ljava/lang/reflect/WildcardType;->getUpperBounds()[Ljava/lang/reflect/Type;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    aget-object p1, v0, p2

    goto :goto_0

    :cond_0
    const-class p1, Ljava/lang/Object;

    :cond_1
    :goto_0
    iput-object p1, p0, Lj/c;->c:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0xe

    return v0
.end method

.method public final b(Li/a;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/a;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v1, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->q()I

    move-result v5

    const/4 v6, 0x0

    const/16 v7, 0x8

    if-eq v5, v7, :cond_10

    const/4 v7, 0x4

    if-ne v5, v7, :cond_0

    invoke-interface {v4}, Li/c;->k0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-nez v4, :cond_0

    goto/16 :goto_9

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v1, Li/a;->h:Li/h;

    iget-object v7, v0, Lj/k;->a:Lm/c;

    iget-object v7, v7, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v1, v5, v2, v7}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    iget-object v7, v0, Lj/c;->c:Ljava/lang/reflect/Type;

    iget-object v8, v0, Lj/c;->e:Lj/s;

    instance-of v9, v3, Ljava/lang/reflect/ParameterizedType;

    const/4 v10, 0x0

    if-eqz v9, :cond_8

    instance-of v9, v7, Ljava/lang/reflect/TypeVariable;

    const/4 v11, -0x1

    if-eqz v9, :cond_4

    move-object v9, v7

    check-cast v9, Ljava/lang/reflect/TypeVariable;

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v12

    instance-of v12, v12, Ljava/lang/Class;

    if-eqz v12, :cond_1

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    :cond_1
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v12

    array-length v12, v12

    const/4 v13, 0x0

    :goto_0
    if-ge v13, v12, :cond_3

    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v14

    aget-object v14, v14, v13

    invoke-interface {v14}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v9}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_3
    const/4 v13, -0x1

    :goto_1
    if-eq v13, v11, :cond_8

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object v7, v3, v13

    iget-object v3, v0, Lj/c;->c:Ljava/lang/reflect/Type;

    invoke-virtual {v7, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, v1, Li/a;->d:Li/i;

    invoke-virtual {v3, v7}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v8

    goto :goto_4

    :cond_4
    instance-of v9, v7, Ljava/lang/reflect/ParameterizedType;

    if-eqz v9, :cond_8

    move-object v9, v7

    check-cast v9, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v9}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v12

    array-length v13, v12

    const/4 v14, 0x1

    if-ne v13, v14, :cond_8

    aget-object v13, v12, v10

    instance-of v13, v13, Ljava/lang/reflect/TypeVariable;

    if-eqz v13, :cond_8

    aget-object v13, v12, v10

    check-cast v13, Ljava/lang/reflect/TypeVariable;

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v14

    instance-of v14, v14, Ljava/lang/Class;

    if-eqz v14, :cond_5

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    :cond_5
    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v14

    array-length v14, v14

    const/4 v15, 0x0

    :goto_2
    if-ge v15, v14, :cond_7

    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v16

    aget-object v16, v16, v15

    invoke-interface/range {v16 .. v16}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-interface {v13}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/4 v6, -0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v15, v15, 0x1

    const/4 v10, 0x0

    const/4 v11, -0x1

    goto :goto_2

    :cond_7
    const/4 v6, -0x1

    const/4 v15, -0x1

    :goto_3
    if-eq v15, v6, :cond_8

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object v3, v3, v15

    const/4 v6, 0x0

    aput-object v3, v12, v6

    new-instance v7, Lm/h;

    invoke-interface {v9}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-interface {v9}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-direct {v7, v12, v3, v6}, Lm/h;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    :cond_8
    :goto_4
    iget-object v3, v1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->q()I

    move-result v6

    const/16 v9, 0xe

    if-ne v6, v9, :cond_d

    if-nez v8, :cond_9

    iget-object v6, v1, Li/a;->d:Li/i;

    invoke-virtual {v6, v7}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v8

    iput-object v8, v0, Lj/c;->e:Lj/s;

    invoke-interface {v8}, Lj/s;->e()I

    move-result v6

    iput v6, v0, Lj/c;->d:I

    :cond_9
    move-object v6, v8

    iget v8, v0, Lj/c;->d:I

    invoke-interface {v3, v8}, Li/c;->Q(I)V

    const/4 v10, 0x0

    :goto_5
    sget-object v8, Li/b;->h:Li/b;

    invoke-interface {v3, v8}, Li/c;->A(Li/b;)Z

    move-result v8

    const/16 v9, 0x10

    if-eqz v8, :cond_a

    :goto_6
    invoke-interface {v3}, Li/c;->q()I

    move-result v8

    if-ne v8, v9, :cond_a

    invoke-interface {v3}, Li/c;->y()V

    goto :goto_6

    :cond_a
    invoke-interface {v3}, Li/c;->q()I

    move-result v8

    const/16 v11, 0xf

    if-ne v8, v11, :cond_b

    invoke-interface {v3, v9}, Li/c;->Q(I)V

    goto :goto_7

    :cond_b
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v6, v1, v7, v8}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4}, Li/a;->c(Ljava/util/Collection;)V

    invoke-interface {v3}, Li/c;->q()I

    move-result v8

    if-ne v8, v9, :cond_c

    iget v8, v0, Lj/c;->d:I

    invoke-interface {v3, v8}, Li/c;->Q(I)V

    :cond_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_d
    if-nez v8, :cond_e

    iget-object v3, v1, Li/a;->d:Li/i;

    invoke-virtual {v3, v7}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v8

    iput-object v8, v0, Lj/c;->e:Lj/s;

    :cond_e
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v8, v1, v7, v3}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v4}, Li/a;->c(Ljava/util/Collection;)V

    :goto_7
    invoke-virtual {v1, v5}, Li/a;->P(Li/h;)V

    if-nez v2, :cond_f

    iget-object v1, v0, Lj/k;->a:Lm/c;

    iget-object v1, v1, Lm/c;->b:Ljava/lang/String;

    move-object/from16 v2, p4

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_f
    invoke-virtual {v0, v2, v4}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_8
    return-void

    :cond_10
    :goto_9
    invoke-virtual {v0, v2, v6}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
