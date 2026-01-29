.class public final Lm/g;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/reflect/Method;

.field public final f:Ljava/lang/reflect/Method;

.field public final g:I

.field public final h:[Lm/c;

.field public final i:[Lm/c;

.field public final j:I

.field public final k:Lg/d;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public n:[Ljava/lang/String;

.field public o:[Ljava/lang/reflect/Type;

.field public p:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lg/d;Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Method;",
            "Lg/d;",
            "Ljava/util/List<",
            "Lm/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/g;->a:Ljava/lang/Class;

    iput-object p2, p0, Lm/g;->b:Ljava/lang/Class;

    iput-object p3, p0, Lm/g;->c:Ljava/lang/reflect/Constructor;

    iput-object p4, p0, Lm/g;->d:Ljava/lang/reflect/Constructor;

    iput-object p5, p0, Lm/g;->e:Ljava/lang/reflect/Method;

    sget-boolean p2, Lm/j;->a:Z

    const-class p2, Lg/d;

    invoke-static {p1, p2}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object p2

    check-cast p2, Lg/d;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Lg/d;->parseFeatures()[Li/b;

    move-result-object p2

    invoke-static {p2}, Li/b;->a([Li/b;)I

    move-result p2

    :goto_0
    iput p2, p0, Lm/g;->j:I

    iput-object p6, p0, Lm/g;->f:Ljava/lang/reflect/Method;

    iput-object p7, p0, Lm/g;->k:Lg/d;

    const/4 p2, 0x0

    if-eqz p7, :cond_4

    invoke-interface {p7}, Lg/d;->typeName()Ljava/lang/String;

    move-result-object p6

    invoke-interface {p7}, Lg/d;->typeKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, p2

    :goto_1
    iput-object v1, p0, Lm/g;->m:Ljava/lang/String;

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p6

    :goto_2
    iput-object p6, p0, Lm/g;->l:Ljava/lang/String;

    invoke-interface {p7}, Lg/d;->orders()[Ljava/lang/String;

    move-result-object p6

    array-length p7, p6

    if-nez p7, :cond_3

    move-object p6, p2

    :cond_3
    iput-object p6, p0, Lm/g;->n:[Ljava/lang/String;

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p6

    iput-object p6, p0, Lm/g;->l:Ljava/lang/String;

    iput-object p2, p0, Lm/g;->m:Ljava/lang/String;

    iput-object p2, p0, Lm/g;->n:[Ljava/lang/String;

    :goto_3
    invoke-interface {p8}, Ljava/util/List;->size()I

    move-result p6

    new-array p7, p6, [Lm/c;

    iput-object p7, p0, Lm/g;->h:[Lm/c;

    invoke-interface {p8, p7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    new-array v1, p6, [Lm/c;

    iget-object v2, p0, Lm/g;->n:[Ljava/lang/String;

    if-eqz v2, :cond_8

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {p8}, Ljava/util/List;->size()I

    move-result p8

    invoke-direct {v2, p8}, Ljava/util/LinkedHashMap;-><init>(I)V

    const/4 p8, 0x0

    :goto_4
    if-ge p8, p6, :cond_5

    aget-object v3, p7, p8

    iget-object v4, v3, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v2, v4, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 p8, p8, 0x1

    goto :goto_4

    :cond_5
    iget-object p6, p0, Lm/g;->n:[Ljava/lang/String;

    array-length p7, p6

    const/4 p8, 0x0

    const/4 v3, 0x0

    :goto_5
    if-ge p8, p7, :cond_7

    aget-object v4, p6, p8

    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm/c;

    if-eqz v5, :cond_6

    add-int/lit8 v6, v3, 0x1

    aput-object v5, v1, v3

    invoke-virtual {v2, v4}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move v3, v6

    :cond_6
    add-int/lit8 p8, p8, 0x1

    goto :goto_5

    :cond_7
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p6

    invoke-interface {p6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p6

    :goto_6
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    move-result p7

    if-eqz p7, :cond_9

    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lm/c;

    add-int/lit8 p8, v3, 0x1

    aput-object p7, v1, v3

    move v3, p8

    goto :goto_6

    :cond_8
    invoke-static {p7, v0, v1, v0, p6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    :cond_9
    iget-object p6, p0, Lm/g;->h:[Lm/c;

    invoke-static {p6, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_a

    iget-object v1, p0, Lm/g;->h:[Lm/c;

    :cond_a
    iput-object v1, p0, Lm/g;->i:[Lm/c;

    if-eqz p3, :cond_b

    invoke-virtual {p3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    array-length p3, p3

    goto :goto_7

    :cond_b
    if-eqz p5, :cond_c

    invoke-virtual {p5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    array-length p3, p3

    :goto_7
    iput p3, p0, Lm/g;->g:I

    goto :goto_8

    :cond_c
    iput v0, p0, Lm/g;->g:I

    :goto_8
    if-eqz p4, :cond_14

    invoke-virtual {p4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p3

    iput-object p3, p0, Lm/g;->o:[Ljava/lang/reflect/Type;

    array-length p3, p3

    iget-object p5, p0, Lm/g;->h:[Lm/c;

    array-length p5, p5

    if-eq p3, p5, :cond_d

    goto :goto_a

    :cond_d
    const/4 p3, 0x0

    :goto_9
    iget-object p5, p0, Lm/g;->o:[Ljava/lang/reflect/Type;

    array-length p6, p5

    if-ge p3, p6, :cond_f

    aget-object p5, p5, p3

    iget-object p6, p0, Lm/g;->h:[Lm/c;

    aget-object p6, p6, p3

    iget-object p6, p6, Lm/c;->f:Ljava/lang/Class;

    if-eq p5, p6, :cond_e

    :goto_a
    const/4 p3, 0x0

    goto :goto_b

    :cond_e
    add-int/lit8 p3, p3, 0x1

    goto :goto_9

    :cond_f
    const/4 p3, 0x1

    :goto_b
    if-nez p3, :cond_14

    invoke-static {p1}, Lm/j;->L(Ljava/lang/Class;)Z

    move-result p3

    if-eqz p3, :cond_13

    invoke-static {p1}, Lm/j;->D(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/g;->p:[Ljava/lang/String;

    invoke-virtual {p4}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object p1

    const/4 p3, 0x0

    :goto_c
    iget-object p4, p0, Lm/g;->p:[Ljava/lang/String;

    array-length p4, p4

    if-ge p3, p4, :cond_14

    array-length p4, p1

    if-ge p3, p4, :cond_14

    aget-object p4, p1, p3

    array-length p5, p4

    const/4 p6, 0x0

    :goto_d
    if-ge p6, p5, :cond_11

    aget-object p7, p4, p6

    instance-of p8, p7, Lg/b;

    if-eqz p8, :cond_10

    check-cast p7, Lg/b;

    goto :goto_e

    :cond_10
    add-int/lit8 p6, p6, 0x1

    goto :goto_d

    :cond_11
    move-object p7, p2

    :goto_e
    if-eqz p7, :cond_12

    invoke-interface {p7}, Lg/b;->name()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p5

    if-lez p5, :cond_12

    iget-object p5, p0, Lm/g;->p:[Ljava/lang/String;

    aput-object p4, p5, p3

    :cond_12
    add-int/lit8 p3, p3, 0x1

    goto :goto_c

    :cond_13
    invoke-static {p4}, Lm/b;->e(Ljava/lang/reflect/AccessibleObject;)[Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm/g;->p:[Ljava/lang/String;

    :cond_14
    return-void
.end method

.method public static a(Ljava/util/List;Lm/c;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm/c;",
            ">;",
            "Lm/c;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_4

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm/c;

    iget-object v3, v2, Lm/c;->b:Ljava/lang/String;

    iget-object v4, p1, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-boolean v3, v2, Lm/c;->i:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p1, Lm/c;->i:Z

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, v2, Lm/c;->f:Ljava/lang/Class;

    iget-object v4, p1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2, p1}, Lm/c;->a(Lm/c;)I

    move-result v2

    if-gez v2, :cond_2

    :goto_1
    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_2
    const/4 p0, 0x0

    return p0

    :cond_3
    :goto_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_4
    :goto_3
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return v1
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lm/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Lf/m;",
            ")",
            "Lm/g;"
        }
    .end annotation

    sget-boolean v0, Lm/j;->a:Z

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lm/g;->c(Ljava/lang/Class;Ljava/lang/reflect/Type;Z)Lm/g;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/reflect/Type;Z)Lm/g;
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Lf/m;",
            "ZZ)",
            "Lm/g;"
        }
    .end annotation

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    const-class v14, Ljava/lang/String;

    const-class v15, Ljava/lang/Object;

    const-class v0, Lg/d;

    invoke-static {v12, v0}, Lm/j;->v(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lg/d;

    const/16 v16, 0x0

    if-eqz v11, :cond_0

    invoke-interface {v11}, Lg/d;->naming()Lf/m;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lf/m;->b:Lf/m;

    if-eq v0, v1, :cond_0

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object/from16 v10, v16

    :goto_0
    invoke-static {v12, v11}, Lm/g;->e(Ljava/lang/Class;Lg/d;)Ljava/lang/Class;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static/range {p0 .. p0}, Lm/j;->L(Ljava/lang/Class;)Z

    move-result v17

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v17, :cond_2

    array-length v2, v0

    if-ne v2, v1, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v18, v16

    goto :goto_3

    :cond_2
    :goto_1
    if-nez v9, :cond_3

    invoke-static {v12, v0}, Lm/g;->f(Ljava/lang/Class;[Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    goto :goto_2

    :cond_3
    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v1

    invoke-static {v9, v1}, Lm/g;->f(Ljava/lang/Class;[Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    :goto_2
    move-object/from16 v18, v1

    :goto_3
    const/16 v19, 0x0

    const/16 v20, 0x0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    if-eqz p2, :cond_5

    move-object v0, v12

    :goto_4
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    invoke-static {v12, v13, v10, v6, v1}, Lm/g;->d(Ljava/lang/Class;Ljava/lang/reflect/Type;Lf/m;Ljava/util/List;[Ljava/lang/reflect/Field;)V

    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_4

    :cond_4
    new-instance v10, Lm/g;

    const/4 v4, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v9

    move-object/from16 v3, v18

    move-object/from16 v5, v20

    move-object v8, v6

    move-object/from16 v6, v19

    move-object v7, v11

    invoke-direct/range {v0 .. v8}, Lm/g;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lg/d;Ljava/util/List;)V

    return-object v10

    :cond_5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    goto :goto_6

    :cond_7
    :goto_5
    const/4 v1, 0x1

    :goto_6
    if-nez v18, :cond_8

    if-eqz v9, :cond_9

    :cond_8
    if-eqz v1, :cond_3f

    :cond_9
    array-length v2, v0

    const/4 v3, 0x0

    move-object/from16 v4, v16

    :goto_7
    const-string v5, "multi-JSONCreator"

    if-ge v3, v2, :cond_c

    move/from16 p2, v2

    aget-object v2, v0, v3

    move-object/from16 v21, v6

    const-class v6, Lg/a;

    invoke-virtual {v2, v6}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Lg/a;

    if-eqz v6, :cond_b

    if-nez v4, :cond_a

    move-object v4, v2

    goto :goto_8

    :cond_a
    new-instance v0, Lf/d;

    invoke-direct {v0, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_8
    add-int/lit8 v3, v3, 0x1

    move/from16 v2, p2

    move-object/from16 v6, v21

    goto :goto_7

    :cond_c
    move-object/from16 v21, v6

    if-eqz v4, :cond_e

    :cond_d
    move-object/from16 v24, v7

    move-object/from16 v27, v10

    move-object v10, v4

    goto/16 :goto_f

    :cond_e
    array-length v2, v0

    const/4 v3, 0x0

    :goto_9
    if-ge v3, v2, :cond_d

    aget-object v6, v0, v3

    move/from16 p2, v2

    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v2

    move-object/from16 v22, v6

    array-length v6, v2

    if-nez v6, :cond_f

    move-object/from16 v24, v7

    move-object/from16 v27, v10

    goto :goto_e

    :cond_f
    array-length v6, v2

    const/16 v23, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    :goto_a
    if-ge v7, v6, :cond_13

    move/from16 v23, v6

    aget-object v6, v2, v7

    move-object/from16 v25, v2

    array-length v2, v6

    const/16 v26, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    :goto_b
    if-ge v10, v2, :cond_11

    move/from16 v26, v2

    aget-object v2, v6, v10

    instance-of v2, v2, Lg/b;

    if-eqz v2, :cond_10

    const/4 v2, 0x1

    goto :goto_c

    :cond_10
    add-int/lit8 v10, v10, 0x1

    move/from16 v2, v26

    goto :goto_b

    :cond_11
    const/4 v2, 0x0

    :goto_c
    if-nez v2, :cond_12

    const/4 v2, 0x0

    goto :goto_d

    :cond_12
    add-int/lit8 v7, v7, 0x1

    move/from16 v6, v23

    move-object/from16 v2, v25

    move-object/from16 v10, v27

    goto :goto_a

    :cond_13
    move-object/from16 v27, v10

    const/4 v2, 0x1

    :goto_d
    if-eqz v2, :cond_15

    if-nez v4, :cond_14

    move-object/from16 v4, v22

    goto :goto_e

    :cond_14
    new-instance v0, Lf/d;

    invoke-direct {v0, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_e
    add-int/lit8 v3, v3, 0x1

    move/from16 v2, p2

    move-object/from16 v7, v24

    move-object/from16 v10, v27

    goto :goto_9

    :goto_f
    const-string v7, "illegal json creator"

    if-nez v1, :cond_1a

    invoke-static {v10}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    invoke-virtual {v10}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    array-length v0, v6

    if-lez v0, :cond_19

    invoke-virtual {v10}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v17

    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_10
    array-length v0, v6

    if-ge v5, v0, :cond_19

    aget-object v0, v17, v5

    array-length v1, v0

    const/4 v2, 0x0

    :goto_11
    if-ge v2, v1, :cond_17

    aget-object v3, v0, v2

    instance-of v4, v3, Lg/b;

    if-eqz v4, :cond_16

    check-cast v3, Lg/b;

    goto :goto_12

    :cond_16
    add-int/lit8 v2, v2, 0x1

    goto :goto_11

    :cond_17
    move-object/from16 v3, v16

    :goto_12
    if-eqz v3, :cond_18

    aget-object v4, v6, v5

    invoke-virtual {v10}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v22, v0, v5

    invoke-interface {v3}, Lg/b;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0, v8}, Lm/j;->z(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    move-result-object v23

    invoke-interface {v3}, Lg/b;->ordinal()I

    move-result v25

    invoke-interface {v3}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v0

    invoke-static {v0}, Lk/b1;->b([Lk/b1;)I

    move-result v26

    invoke-interface {v3}, Lg/b;->parseFeatures()[Li/b;

    move-result-object v0

    invoke-static {v0}, Li/b;->a([Li/b;)I

    move-result v28

    new-instance v2, Lm/c;

    invoke-interface {v3}, Lg/b;->name()Ljava/lang/String;

    move-result-object v1

    move-object v0, v2

    move-object v3, v2

    move-object/from16 v2, p0

    move-object/from16 p2, v10

    move-object v10, v3

    move-object v3, v4

    move-object/from16 v4, v22

    move/from16 v22, v5

    move-object/from16 v5, v23

    move-object/from16 v13, v21

    move-object/from16 v21, v6

    move/from16 v6, v25

    move-object/from16 v23, v15

    move-object/from16 v15, v24

    move-object/from16 v24, v14

    move-object v14, v7

    move/from16 v7, v26

    move-object/from16 v25, v11

    move-object v11, v8

    move/from16 v8, v28

    invoke-direct/range {v0 .. v8}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;III)V

    invoke-static {v13, v10}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    add-int/lit8 v5, v22, 0x1

    move-object/from16 v10, p2

    move-object v8, v11

    move-object v7, v14

    move-object/from16 v6, v21

    move-object/from16 v14, v24

    move-object/from16 v11, v25

    move-object/from16 v21, v13

    move-object/from16 v24, v15

    move-object/from16 v15, v23

    move-object/from16 v13, p1

    goto :goto_10

    :cond_18
    move-object v14, v7

    new-instance v0, Lf/d;

    invoke-direct {v0, v14}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    move-object/from16 p2, v10

    move-object/from16 v25, v11

    move-object/from16 v23, v15

    move-object/from16 v13, v21

    move-object/from16 v15, v24

    move-object v11, v8

    move-object/from16 v24, v14

    move-object/from16 v14, p2

    move-object/from16 v31, v23

    move-object/from16 v32, v24

    goto/16 :goto_27

    :cond_1a
    move-object/from16 p2, v10

    move-object/from16 v25, v11

    move-object/from16 v23, v15

    move-object/from16 v13, v21

    move-object/from16 v15, v24

    move-object v11, v8

    move-object/from16 v24, v14

    move-object v14, v7

    array-length v2, v15

    const/4 v3, 0x0

    move-object/from16 v10, v16

    :goto_13
    if-ge v3, v2, :cond_1f

    aget-object v4, v15, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v6

    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v6

    if-nez v6, :cond_1b

    goto :goto_14

    :cond_1b
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v12, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v6

    if-nez v6, :cond_1c

    goto :goto_14

    :cond_1c
    const-class v6, Lg/a;

    invoke-virtual {v4, v6}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    check-cast v6, Lg/a;

    if-eqz v6, :cond_1e

    if-nez v10, :cond_1d

    move-object v10, v4

    goto :goto_14

    :cond_1d
    new-instance v0, Lf/d;

    invoke-direct {v0, v5}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    :goto_14
    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_1f
    if-eqz v10, :cond_24

    invoke-static {v10}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v0, v8

    if-lez v0, :cond_3e

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v15

    const/4 v0, 0x0

    const/4 v7, 0x0

    :goto_15
    array-length v0, v8

    if-ge v7, v0, :cond_23

    aget-object v0, v15, v7

    array-length v1, v0

    const/4 v2, 0x0

    :goto_16
    if-ge v2, v1, :cond_21

    aget-object v3, v0, v2

    instance-of v4, v3, Lg/b;

    if-eqz v4, :cond_20

    check-cast v3, Lg/b;

    goto :goto_17

    :cond_20
    add-int/lit8 v2, v2, 0x1

    goto :goto_16

    :cond_21
    move-object/from16 v3, v16

    :goto_17
    if-eqz v3, :cond_22

    aget-object v4, v8, v7

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v5, v0, v7

    invoke-interface {v3}, Lg/b;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12, v0, v11}, Lm/j;->z(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-interface {v3}, Lg/b;->ordinal()I

    move-result v17

    invoke-interface {v3}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v0

    invoke-static {v0}, Lk/b1;->b([Lk/b1;)I

    move-result v18

    invoke-interface {v3}, Lg/b;->parseFeatures()[Li/b;

    move-result-object v0

    invoke-static {v0}, Li/b;->a([Li/b;)I

    move-result v19

    new-instance v2, Lm/c;

    invoke-interface {v3}, Lg/b;->name()Ljava/lang/String;

    move-result-object v1

    move-object v0, v2

    move-object v3, v2

    move-object/from16 v2, p0

    move-object/from16 p1, v15

    move-object v15, v3

    move-object v3, v4

    move-object v4, v5

    move-object v5, v6

    move/from16 v6, v17

    move/from16 v17, v7

    move/from16 v7, v18

    move-object/from16 v18, v8

    move/from16 v8, v19

    invoke-direct/range {v0 .. v8}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;III)V

    invoke-static {v13, v15}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    add-int/lit8 v7, v17, 0x1

    move-object/from16 v15, p1

    move-object/from16 v8, v18

    goto :goto_15

    :cond_22
    new-instance v0, Lf/d;

    invoke-direct {v0, v14}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v11, Lm/g;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v0, v11

    move-object/from16 v1, p0

    move-object v2, v9

    move-object v5, v10

    move-object/from16 v7, v25

    move-object v8, v13

    invoke-direct/range {v0 .. v8}, Lm/g;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lg/d;Ljava/util/List;)V

    return-object v11

    :cond_24
    if-nez v1, :cond_3e

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v14

    if-eqz v17, :cond_25

    array-length v1, v0

    if-lez v1, :cond_25

    invoke-static/range {p0 .. p0}, Lm/j;->D(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Lm/j;->C([Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-static {v0}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    move-object/from16 v7, v23

    move-object/from16 v8, v24

    goto/16 :goto_1b

    :cond_25
    array-length v1, v0

    const/4 v2, 0x0

    move-object/from16 v3, p2

    move-object/from16 v4, v16

    :goto_18
    if-ge v2, v1, :cond_33

    aget-object v5, v0, v2

    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v6

    const-string v7, "org.springframework.security.web.authentication.WebAuthenticationDetails"

    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_27

    array-length v7, v6

    const/4 v8, 0x2

    if-ne v7, v8, :cond_27

    const/4 v7, 0x0

    aget-object v7, v6, v7

    move-object/from16 v8, v24

    if-ne v7, v8, :cond_26

    const/4 v7, 0x1

    move-object/from16 v21, v0

    aget-object v0, v6, v7

    if-ne v0, v8, :cond_28

    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-static {v5}, Lm/b;->e(Ljava/lang/reflect/AccessibleObject;)[Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    move-object/from16 v7, v23

    goto :goto_1a

    :cond_26
    move-object/from16 v21, v0

    goto :goto_19

    :cond_27
    move-object/from16 v21, v0

    move-object/from16 v8, v24

    :cond_28
    :goto_19
    const-string v0, "org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    array-length v0, v6

    const/4 v7, 0x3

    if-ne v0, v7, :cond_2a

    const/4 v0, 0x0

    aget-object v0, v6, v0

    move-object/from16 v7, v23

    if-ne v0, v7, :cond_29

    const/4 v0, 0x1

    aget-object v0, v6, v0

    if-ne v0, v7, :cond_29

    const/4 v0, 0x2

    aget-object v0, v6, v0

    move/from16 v20, v1

    const-class v1, Ljava/util/Collection;

    if-ne v0, v1, :cond_2b

    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    const-string v0, "principal"

    const-string v1, "credentials"

    const-string v2, "authorities"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_1a
    move-object v0, v5

    :goto_1b
    move-object/from16 v20, v0

    move-object v6, v1

    goto/16 :goto_1f

    :cond_29
    move/from16 v20, v1

    goto :goto_1c

    :cond_2a
    move/from16 v20, v1

    move-object/from16 v7, v23

    :cond_2b
    :goto_1c
    const-string v0, "org.springframework.security.core.authority.SimpleGrantedAuthority"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2c

    array-length v0, v6

    const/4 v1, 0x1

    const/16 v22, 0x0

    if-ne v0, v1, :cond_2d

    aget-object v0, v6, v22

    if-ne v0, v8, :cond_2d

    const-string v0, "authority"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    move-object v6, v4

    move-object/from16 v20, v5

    goto :goto_1f

    :cond_2c
    const/4 v1, 0x1

    :cond_2d
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getModifiers()I

    move-result v0

    and-int/2addr v0, v1

    if-eqz v0, :cond_2e

    const/4 v0, 0x1

    goto :goto_1d

    :cond_2e
    const/4 v0, 0x0

    :goto_1d
    if-nez v0, :cond_2f

    goto :goto_1e

    :cond_2f
    invoke-static {v5}, Lm/b;->e(Ljava/lang/reflect/AccessibleObject;)[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_32

    array-length v1, v0

    if-nez v1, :cond_30

    goto :goto_1e

    :cond_30
    if-eqz v3, :cond_31

    if-eqz v4, :cond_31

    array-length v1, v0

    array-length v6, v4

    if-gt v1, v6, :cond_31

    goto :goto_1e

    :cond_31
    move-object v4, v0

    move-object v3, v5

    :cond_32
    :goto_1e
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v23, v7

    move-object/from16 v24, v8

    move/from16 v1, v20

    move-object/from16 v0, v21

    goto/16 :goto_18

    :cond_33
    move-object/from16 v7, v23

    move-object/from16 v8, v24

    move-object/from16 v20, v3

    move-object v6, v4

    :goto_1f
    if-eqz v6, :cond_34

    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    goto :goto_20

    :cond_34
    move-object/from16 v5, v16

    :goto_20
    if-eqz v6, :cond_3d

    array-length v0, v5

    array-length v1, v6

    if-ne v0, v1, :cond_3d

    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v21

    const/4 v0, 0x0

    const/4 v4, 0x0

    :goto_21
    array-length v0, v5

    if-ge v4, v0, :cond_3b

    aget-object v0, v21, v4

    aget-object v1, v6, v4

    array-length v2, v0

    const/4 v3, 0x0

    :goto_22
    if-ge v3, v2, :cond_36

    move/from16 v22, v2

    aget-object v2, v0, v3

    move-object/from16 p2, v0

    instance-of v0, v2, Lg/b;

    if-eqz v0, :cond_35

    check-cast v2, Lg/b;

    goto :goto_23

    :cond_35
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p2

    move/from16 v2, v22

    goto :goto_22

    :cond_36
    move-object/from16 v2, v16

    :goto_23
    aget-object v3, v5, v4

    invoke-virtual/range {v20 .. v20}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v22, v0, v4

    invoke-static {v12, v1, v11}, Lm/j;->z(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_37

    if-nez v2, :cond_37

    const-class v2, Lg/b;

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lg/b;

    :cond_37
    if-nez v2, :cond_39

    const-string v2, "org.springframework.security.core.userdetails.User"

    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_38

    const-string v2, "password"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_38

    sget-object v2, Li/b;->m:Li/b;

    iget v2, v2, Li/b;->b:I

    const/16 v23, 0x0

    const/16 v24, 0x0

    goto :goto_24

    :cond_38
    const/4 v2, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    goto :goto_25

    :cond_39
    invoke-interface {v2}, Lg/b;->name()Ljava/lang/String;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    move-result v24

    if-eqz v24, :cond_3a

    move-object/from16 v1, v23

    :cond_3a
    invoke-interface {v2}, Lg/b;->ordinal()I

    move-result v23

    invoke-interface {v2}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v24

    invoke-static/range {v24 .. v24}, Lk/b1;->b([Lk/b1;)I

    move-result v24

    invoke-interface {v2}, Lg/b;->parseFeatures()[Li/b;

    move-result-object v2

    invoke-static {v2}, Li/b;->a([Li/b;)I

    move-result v2

    :goto_24
    move/from16 v26, v2

    :goto_25
    new-instance v2, Lm/c;

    move-object/from16 v28, v0

    move-object v0, v2

    move-object/from16 v29, v10

    move-object v10, v2

    move-object/from16 v2, p0

    move/from16 v30, v4

    move-object/from16 v4, v22

    move-object/from16 v22, v5

    move-object/from16 v5, v28

    move-object/from16 v28, v6

    move/from16 v6, v23

    move-object/from16 v31, v7

    move/from16 v7, v24

    move-object/from16 v32, v8

    move/from16 v8, v26

    invoke-direct/range {v0 .. v8}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;III)V

    invoke-static {v13, v10}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    add-int/lit8 v4, v30, 0x1

    move-object/from16 v5, v22

    move-object/from16 v6, v28

    move-object/from16 v10, v29

    move-object/from16 v7, v31

    move-object/from16 v8, v32

    goto/16 :goto_21

    :cond_3b
    move-object/from16 v31, v7

    move-object/from16 v32, v8

    move-object/from16 v29, v10

    if-nez v17, :cond_3c

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "javax.servlet.http.Cookie"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3c

    new-instance v10, Lm/g;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move-object v2, v9

    move-object/from16 v4, v20

    move-object/from16 v7, v25

    move-object v8, v13

    invoke-direct/range {v0 .. v8}, Lm/g;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lg/d;Ljava/util/List;)V

    return-object v10

    :cond_3c
    move-object/from16 v10, v20

    goto :goto_26

    :cond_3d
    new-instance v0, Lf/d;

    const-string v1, "default constructor not found. "

    invoke-static {v1, v12}, Landroidx/activity/d;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3e
    move-object/from16 v29, v10

    move-object/from16 v31, v23

    move-object/from16 v32, v24

    move-object/from16 v10, p2

    :goto_26
    move-object v14, v10

    move-object/from16 v20, v29

    goto :goto_27

    :cond_3f
    move-object v13, v6

    move-object/from16 v27, v10

    move-object/from16 v25, v11

    move-object/from16 v32, v14

    move-object/from16 v31, v15

    move-object v15, v7

    move-object v11, v8

    move-object/from16 v14, v16

    :goto_27
    if-eqz v18, :cond_40

    invoke-static/range {v18 .. v18}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    :cond_40
    const-string v10, "set"

    if-eqz v9, :cond_54

    const-class v0, Lg/c;

    invoke-virtual {v9, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lg/c;

    if-eqz v0, :cond_41

    invoke-interface {v0}, Lg/c;->withPrefix()Ljava/lang/String;

    move-result-object v0

    goto :goto_28

    :cond_41
    move-object/from16 v0, v16

    :goto_28
    if-eqz v0, :cond_42

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_43

    :cond_42
    const-string v0, "with"

    :cond_43
    move-object v8, v0

    invoke-virtual {v9}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v7

    array-length v6, v7

    const/4 v0, 0x0

    const/4 v5, 0x0

    :goto_29
    if-ge v5, v6, :cond_4e

    aget-object v2, v7, v5

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-eqz v0, :cond_44

    goto :goto_2a

    :cond_44
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_45

    goto :goto_2a

    :cond_45
    const-class v0, Lg/b;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lg/b;

    if-nez v0, :cond_46

    invoke-static {v12, v2}, Lm/j;->G(Ljava/lang/Class;Ljava/lang/reflect/Method;)Lg/b;

    move-result-object v0

    :cond_46
    move-object/from16 v17, v0

    if-eqz v17, :cond_49

    invoke-interface/range {v17 .. v17}, Lg/b;->deserialize()Z

    move-result v0

    if-nez v0, :cond_47

    :goto_2a
    move/from16 v28, v5

    move/from16 v29, v6

    move-object/from16 v30, v7

    move-object/from16 v17, v8

    move-object/from16 v35, v9

    move-object/from16 v21, v11

    move-object/from16 p2, v14

    move-object/from16 v24, v25

    move-object/from16 v36, v27

    move-object v14, v10

    goto/16 :goto_2e

    :cond_47
    invoke-interface/range {v17 .. v17}, Lg/b;->ordinal()I

    move-result v21

    invoke-interface/range {v17 .. v17}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v0

    invoke-static {v0}, Lk/b1;->b([Lk/b1;)I

    move-result v22

    invoke-interface/range {v17 .. v17}, Lg/b;->parseFeatures()[Li/b;

    move-result-object v0

    invoke-static {v0}, Li/b;->a([Li/b;)I

    move-result v23

    invoke-interface/range {v17 .. v17}, Lg/b;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_48

    invoke-interface/range {v17 .. v17}, Lg/b;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lm/c;

    const/4 v3, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object v0, v4

    move-object/from16 v33, v4

    move-object/from16 v4, p0

    move/from16 v28, v5

    move-object/from16 v5, p1

    move/from16 v29, v6

    move/from16 v6, v21

    move-object/from16 v30, v7

    move/from16 v7, v22

    move-object/from16 v34, v8

    move/from16 v8, v23

    move-object/from16 v35, v9

    move-object/from16 v9, v17

    move-object/from16 v37, v10

    move-object/from16 v36, v27

    move-object/from16 v10, v24

    move-object/from16 p2, v14

    move-object/from16 v24, v25

    move-object v14, v11

    move-object/from16 v11, v26

    invoke-direct/range {v0 .. v11}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    move-object/from16 v0, v33

    invoke-static {v13, v0}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    move-object/from16 v21, v14

    move-object/from16 v17, v34

    move-object/from16 v14, v37

    goto/16 :goto_2e

    :cond_48
    move/from16 v28, v5

    move/from16 v29, v6

    move-object/from16 v30, v7

    move-object/from16 v34, v8

    move-object/from16 v35, v9

    move-object/from16 v37, v10

    move-object/from16 p2, v14

    move-object/from16 v24, v25

    move-object/from16 v36, v27

    move-object v14, v11

    move/from16 v6, v21

    move/from16 v7, v22

    move/from16 v8, v23

    goto :goto_2b

    :cond_49
    move/from16 v28, v5

    move/from16 v29, v6

    move-object/from16 v30, v7

    move-object/from16 v34, v8

    move-object/from16 v35, v9

    move-object/from16 v37, v10

    move-object/from16 p2, v14

    move-object/from16 v24, v25

    move-object/from16 v36, v27

    move-object v14, v11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2b
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v11, v37

    invoke-virtual {v0, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4a

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x3

    if-le v1, v3, :cond_4a

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v10, v34

    goto :goto_2c

    :cond_4a
    move-object/from16 v10, v34

    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4b

    goto :goto_2d

    :cond_4b
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v3

    if-gt v1, v3, :cond_4c

    goto :goto_2d

    :cond_4c
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_2c
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v4

    if-nez v4, :cond_4d

    :goto_2d
    move-object/from16 v17, v10

    move-object/from16 v21, v14

    move-object v14, v11

    goto :goto_2e

    :cond_4d
    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    invoke-virtual {v1, v0, v3}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v9, Lm/c;

    const/4 v3, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v0, v9

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v38, v9

    move-object/from16 v9, v17

    move-object/from16 v17, v10

    move-object/from16 v10, v21

    move-object/from16 v21, v14

    move-object v14, v11

    move-object/from16 v11, v22

    invoke-direct/range {v0 .. v11}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    move-object/from16 v0, v38

    invoke-static {v13, v0}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    :goto_2e
    add-int/lit8 v5, v28, 0x1

    move-object v10, v14

    move-object/from16 v8, v17

    move-object/from16 v11, v21

    move-object/from16 v25, v24

    move/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v9, v35

    move-object/from16 v27, v36

    move-object/from16 v14, p2

    goto/16 :goto_29

    :cond_4e
    move-object/from16 v35, v9

    move-object/from16 v21, v11

    move-object/from16 p2, v14

    move-object/from16 v24, v25

    move-object/from16 v36, v27

    move-object v14, v10

    const-class v0, Lg/c;

    move-object/from16 v11, v35

    invoke-virtual {v11, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lg/c;

    if-eqz v0, :cond_4f

    invoke-interface {v0}, Lg/c;->buildMethod()Ljava/lang/String;

    move-result-object v0

    goto :goto_2f

    :cond_4f
    move-object/from16 v0, v16

    :goto_2f
    if-eqz v0, :cond_50

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_51

    :cond_50
    const-string v0, "build"

    :cond_51
    const/4 v1, 0x0

    :try_start_0
    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v11, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v19
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_30

    :catch_0
    nop

    :goto_30
    if-nez v19, :cond_52

    :try_start_1
    const-string v0, "create"

    new-array v2, v1, [Ljava/lang/Class;

    invoke-virtual {v11, v0, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v19
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_31

    :catch_1
    nop

    :cond_52
    :goto_31
    if-eqz v19, :cond_53

    invoke-static/range {v19 .. v19}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    goto :goto_32

    :cond_53
    new-instance v0, Lf/d;

    const-string v1, "buildMethod not found."

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_54
    move-object/from16 v21, v11

    move-object/from16 p2, v14

    move-object/from16 v24, v25

    move-object/from16 v36, v27

    move-object v11, v9

    move-object v14, v10

    const/4 v1, 0x0

    :goto_32
    array-length v10, v15

    const/4 v0, 0x0

    const/4 v9, 0x0

    :goto_33
    if-ge v9, v10, :cond_6d

    aget-object v2, v15, v9

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    if-eqz v4, :cond_55

    goto :goto_34

    :cond_55
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_56

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_56

    :goto_34
    move/from16 v27, v9

    move/from16 v28, v10

    move-object/from16 v29, v11

    move-object/from16 v37, v14

    move-object/from16 v23, v15

    move-object/from16 v26, v31

    :goto_35
    move-object/from16 v22, v32

    :goto_36
    move-object/from16 v14, v36

    goto/16 :goto_43

    :cond_56
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v5, v31

    if-ne v4, v5, :cond_57

    goto/16 :goto_42

    :cond_57
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v0, v4

    if-eqz v0, :cond_6c

    array-length v0, v4

    const/4 v8, 0x2

    if-le v0, v8, :cond_58

    goto/16 :goto_42

    :cond_58
    const-class v0, Lg/b;

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lg/b;

    if-eqz v23, :cond_5a

    array-length v0, v4

    if-ne v0, v8, :cond_5a

    aget-object v0, v4, v1

    move-object/from16 v8, v32

    if-ne v0, v8, :cond_59

    const/4 v0, 0x1

    aget-object v0, v4, v0

    if-ne v0, v5, :cond_59

    new-instance v4, Lm/c;

    const/4 v3, 0x0

    const/16 v17, 0x0

    const/16 v25, 0x0

    const-string v1, ""

    move-object v0, v4

    move-object/from16 v39, v4

    move-object/from16 v4, p0

    move-object/from16 v26, v5

    move-object/from16 v5, p1

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move/from16 v27, v9

    move-object/from16 v9, v23

    move/from16 v28, v10

    move-object/from16 v10, v17

    move-object/from16 v29, v11

    move-object/from16 v11, v25

    invoke-direct/range {v0 .. v11}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    move-object/from16 v0, v39

    invoke-static {v13, v0}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    goto :goto_3a

    :cond_59
    move-object/from16 v26, v5

    move-object/from16 v22, v8

    move/from16 v27, v9

    move/from16 v28, v10

    move-object/from16 v29, v11

    :goto_37
    const/4 v8, 0x0

    goto :goto_38

    :cond_5a
    move-object/from16 v26, v5

    move/from16 v27, v9

    move/from16 v28, v10

    move-object/from16 v29, v11

    move-object/from16 v22, v32

    goto :goto_37

    :goto_38
    array-length v0, v4

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5b

    goto :goto_3a

    :cond_5b
    if-nez v23, :cond_5c

    invoke-static {v12, v2}, Lm/j;->G(Ljava/lang/Class;Ljava/lang/reflect/Method;)Lg/b;

    move-result-object v0

    move-object v9, v0

    goto :goto_39

    :cond_5c
    move-object/from16 v9, v23

    :goto_39
    if-nez v9, :cond_5d

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_5d

    goto :goto_3a

    :cond_5d
    if-eqz v9, :cond_5f

    invoke-interface {v9}, Lg/b;->deserialize()Z

    move-result v0

    if-nez v0, :cond_5e

    :goto_3a
    move-object/from16 v23, v15

    goto :goto_3b

    :cond_5e
    invoke-interface {v9}, Lg/b;->ordinal()I

    move-result v6

    invoke-interface {v9}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v0

    invoke-static {v0}, Lk/b1;->b([Lk/b1;)I

    move-result v7

    invoke-interface {v9}, Lg/b;->parseFeatures()[Li/b;

    move-result-object v0

    invoke-static {v0}, Li/b;->a([Li/b;)I

    move-result v8

    invoke-interface {v9}, Lg/b;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_5f

    invoke-interface {v9}, Lg/b;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v11, Lm/c;

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/16 v17, 0x0

    move-object v0, v11

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v23, v15

    move-object v15, v11

    move-object/from16 v11, v17

    invoke-direct/range {v0 .. v11}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    invoke-static {v13, v15}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    goto :goto_3b

    :cond_5f
    move-object/from16 v23, v15

    if-nez v9, :cond_61

    invoke-virtual {v3, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_61

    :cond_60
    :goto_3b
    move-object/from16 v15, v21

    goto/16 :goto_3f

    :cond_61
    const/4 v0, 0x3

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v5

    if-nez v5, :cond_65

    const/16 v5, 0x200

    if-le v1, v5, :cond_62

    goto :goto_3c

    :cond_62
    const/16 v5, 0x5f

    if-ne v1, v5, :cond_63

    const/4 v5, 0x4

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3e

    :cond_63
    const/4 v5, 0x4

    const/16 v10, 0x66

    if-ne v1, v10, :cond_64

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_3e

    :cond_64
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v10, 0x5

    if-lt v1, v10, :cond_60

    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v1

    if-eqz v1, :cond_60

    goto :goto_3d

    :cond_65
    :goto_3c
    sget-boolean v1, Lm/j;->a:Z

    if-eqz v1, :cond_66

    :goto_3d
    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lm/j;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_3e

    :cond_66
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3e
    move-object/from16 v15, v21

    invoke-static {v12, v0, v15}, Lm/j;->z(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-nez v1, :cond_67

    const/4 v3, 0x0

    aget-object v4, v4, v3

    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v4, v5, :cond_67

    const-string v1, "is"

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v12, v1, v15}, Lm/j;->z(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    move-result-object v1

    :cond_67
    move-object v3, v1

    if-eqz v3, :cond_6a

    const-class v1, Lg/b;

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lg/b;

    if-eqz v10, :cond_69

    invoke-interface {v10}, Lg/b;->deserialize()Z

    move-result v1

    if-nez v1, :cond_68

    :goto_3f
    move-object/from16 v37, v14

    goto :goto_40

    :cond_68
    invoke-interface {v10}, Lg/b;->ordinal()I

    move-result v6

    invoke-interface {v10}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v1

    invoke-static {v1}, Lk/b1;->b([Lk/b1;)I

    move-result v7

    invoke-interface {v10}, Lg/b;->parseFeatures()[Li/b;

    move-result-object v1

    invoke-static {v1}, Li/b;->a([Li/b;)I

    move-result v8

    invoke-interface {v10}, Lg/b;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_69

    invoke-interface {v10}, Lg/b;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v11, Lm/c;

    const/16 v17, 0x0

    move-object v0, v11

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v37, v14

    move-object v14, v11

    move-object/from16 v11, v17

    invoke-direct/range {v0 .. v11}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    invoke-static {v13, v14}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    :goto_40
    move-object/from16 v21, v15

    goto/16 :goto_36

    :cond_69
    move-object/from16 v37, v14

    goto :goto_41

    :cond_6a
    move-object/from16 v37, v14

    move-object/from16 v10, v16

    :goto_41
    move-object/from16 v14, v36

    if-eqz v14, :cond_6b

    invoke-virtual {v14, v0}, Lf/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_6b
    move-object v1, v0

    new-instance v11, Lm/c;

    const/16 v17, 0x0

    move-object v0, v11

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v21, v15

    move-object v15, v11

    move-object/from16 v11, v17

    invoke-direct/range {v0 .. v11}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    invoke-static {v13, v15}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    goto :goto_43

    :cond_6c
    :goto_42
    move-object/from16 v26, v5

    move/from16 v27, v9

    move/from16 v28, v10

    move-object/from16 v29, v11

    move-object/from16 v37, v14

    move-object/from16 v23, v15

    goto/16 :goto_35

    :goto_43
    add-int/lit8 v9, v27, 0x1

    const/4 v1, 0x0

    move-object/from16 v36, v14

    move-object/from16 v32, v22

    move-object/from16 v15, v23

    move-object/from16 v31, v26

    move/from16 v10, v28

    move-object/from16 v11, v29

    move-object/from16 v14, v37

    goto/16 :goto_33

    :cond_6d
    move-object/from16 v29, v11

    move-object/from16 v14, v36

    const/4 v0, 0x4

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v1

    move-object v15, v13

    move-object/from16 v13, p1

    invoke-static {v12, v13, v14, v15, v1}, Lm/g;->d(Ljava/lang/Class;Ljava/lang/reflect/Type;Lf/m;Ljava/util/List;[Ljava/lang/reflect/Field;)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    move-result-object v11

    array-length v10, v11

    const/4 v1, 0x0

    const/4 v9, 0x0

    :goto_44
    if-ge v9, v10, :cond_7b

    aget-object v2, v11, v9

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v3, v0, :cond_6f

    :cond_6e
    :goto_45
    move/from16 v22, v9

    move/from16 v17, v10

    move-object/from16 v23, v11

    goto/16 :goto_49

    :cond_6f
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v3

    if-eqz v3, :cond_70

    goto :goto_45

    :cond_70
    if-nez v29, :cond_6e

    const-string v3, "get"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6e

    const/4 v3, 0x3

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_6e

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v3, v3

    if-eqz v3, :cond_71

    goto :goto_45

    :cond_71
    const-class v3, Ljava/util/Collection;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_72

    const-class v3, Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-nez v3, :cond_72

    const-class v3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_72

    const-class v3, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_72

    const-class v3, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v4

    if-ne v3, v4, :cond_6e

    :cond_72
    const-class v3, Lg/b;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Lg/b;

    if-eqz v17, :cond_73

    invoke-interface/range {v17 .. v17}, Lg/b;->deserialize()Z

    move-result v3

    if-eqz v3, :cond_73

    goto :goto_45

    :cond_73
    if-eqz v17, :cond_74

    invoke-interface/range {v17 .. v17}, Lg/b;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_74

    invoke-interface/range {v17 .. v17}, Lg/b;->name()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v8, v21

    goto :goto_46

    :cond_74
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x3

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v8, v21

    invoke-static {v12, v0, v8}, Lm/j;->z(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_75

    const-class v3, Lg/b;

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lg/b;

    if-eqz v1, :cond_75

    invoke-interface {v1}, Lg/b;->deserialize()Z

    move-result v1

    if-nez v1, :cond_75

    goto :goto_48

    :cond_75
    :goto_46
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_76
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_78

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm/c;

    iget-object v4, v3, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_77

    goto :goto_47

    :cond_77
    iget-object v4, v3, Lm/c;->d:Ljava/lang/reflect/Field;

    if-eqz v4, :cond_76

    invoke-virtual {v3}, Lm/c;->c()Lg/b;

    move-result-object v5

    if-eqz v5, :cond_76

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_76

    goto :goto_47

    :cond_78
    move-object/from16 v3, v16

    :goto_47
    if-eqz v3, :cond_79

    :goto_48
    move-object/from16 v21, v8

    goto/16 :goto_45

    :cond_79
    if-eqz v14, :cond_7a

    invoke-virtual {v14, v0}, Lf/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_7a
    move-object v1, v0

    new-instance v7, Lm/c;

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object v0, v7

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move-object/from16 v40, v7

    move/from16 v7, v21

    move-object/from16 v21, v8

    move/from16 v8, v22

    move/from16 v22, v9

    move-object/from16 v9, v17

    move/from16 v17, v10

    move-object/from16 v10, v23

    move-object/from16 v23, v11

    move-object/from16 v11, v25

    invoke-direct/range {v0 .. v11}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    move-object/from16 v0, v40

    invoke-static {v15, v0}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    :goto_49
    add-int/lit8 v9, v22, 0x1

    const/4 v0, 0x4

    move/from16 v10, v17

    move-object/from16 v11, v23

    goto/16 :goto_44

    :cond_7b
    new-instance v9, Lm/g;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, v29

    move-object/from16 v3, v18

    move-object/from16 v4, p2

    move-object/from16 v5, v20

    move-object/from16 v6, v19

    move-object/from16 v7, v24

    move-object v8, v15

    invoke-direct/range {v0 .. v8}, Lm/g;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Lg/d;Ljava/util/List;)V

    return-object v9
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/reflect/Type;Lf/m;Ljava/util/List;[Ljava/lang/reflect/Field;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Lf/m;",
            "Ljava/util/List<",
            "Lm/c;",
            ">;[",
            "Ljava/lang/reflect/Field;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    array-length v2, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_b

    aget-object v8, v1, v4

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v5

    and-int/lit8 v6, v5, 0x8

    if-eqz v6, :cond_0

    goto/16 :goto_4

    :cond_0
    and-int/lit8 v5, v5, 0x10

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    const-class v7, Ljava/util/Map;

    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-nez v7, :cond_2

    const-class v7, Ljava/util/Collection;

    invoke-virtual {v7, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-nez v7, :cond_2

    const-class v7, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    const-class v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    const-class v7, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v5, 0x1

    :goto_2
    if-nez v5, :cond_3

    goto :goto_4

    :cond_3
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm/c;

    iget-object v7, v7, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v5

    const-class v6, Lg/b;

    invoke-virtual {v8, v6}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v6

    move-object v15, v6

    check-cast v15, Lg/b;

    if-eqz v15, :cond_9

    invoke-interface {v15}, Lg/b;->deserialize()Z

    move-result v6

    if-nez v6, :cond_7

    :goto_4
    move-object/from16 v5, p3

    goto :goto_6

    :cond_7
    invoke-interface {v15}, Lg/b;->ordinal()I

    move-result v6

    invoke-interface {v15}, Lg/b;->serialzeFeatures()[Lk/b1;

    move-result-object v7

    invoke-static {v7}, Lk/b1;->b([Lk/b1;)I

    move-result v7

    invoke-interface {v15}, Lg/b;->parseFeatures()[Li/b;

    move-result-object v9

    invoke-static {v9}, Li/b;->a([Li/b;)I

    move-result v9

    invoke-interface {v15}, Lg/b;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v15}, Lg/b;->name()Ljava/lang/String;

    move-result-object v5

    :cond_8
    move v11, v6

    move v12, v7

    move v13, v9

    goto :goto_5

    :cond_9
    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_5
    if-eqz v0, :cond_a

    invoke-virtual {v0, v5}, Lf/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_a
    move-object v6, v5

    new-instance v14, Lm/c;

    const/4 v7, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v5, v14

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object v3, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v17

    invoke-direct/range {v5 .. v16}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V

    move-object/from16 v5, p3

    invoke-static {v5, v3}, Lm/g;->a(Ljava/util/List;Lm/c;)Z

    :goto_6
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public static e(Ljava/lang/Class;Lg/d;)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lg/d;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v0, "org.springframework.security.web.savedrequest.DefaultSavedRequest"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "org.springframework.security.web.savedrequest.DefaultSavedRequest$Builder"

    invoke-static {p0}, Lm/j;->O(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    invoke-interface {p1}, Lg/d;->builder()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ljava/lang/Void;

    if-ne p1, v0, :cond_2

    return-object p0

    :cond_2
    return-object p1
.end method

.method public static f(Ljava/lang/Class;[Ljava/lang/reflect/Constructor;)Ljava/lang/reflect/Constructor;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/reflect/Constructor<",
            "*>;)",
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    array-length v0, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v5, v5

    if-nez v5, :cond_1

    move-object v1, v4

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-nez v1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Class;->isMemberClass()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    move-result v0

    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v0

    if-nez v0, :cond_4

    array-length v0, p1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v0, :cond_4

    aget-object v4, p1, v3

    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x1

    if-ne v6, v7, :cond_3

    aget-object v5, v5, v2

    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v1, v4

    goto :goto_3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    return-object v1
.end method
