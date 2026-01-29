.class public final Lj/q;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# static fields
.field public static a:Lj/q;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj/q;

    invoke-direct {v0}, Lj/q;-><init>()V

    sput-object v0, Lj/q;->a:Lj/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/reflect/Type;)Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/util/Properties;

    if-ne p1, v0, :cond_0

    new-instance p1, Ljava/util/Properties;

    invoke-direct {p1}, Ljava/util/Properties;-><init>()V

    return-object p1

    :cond_0
    const-class v0, Ljava/util/Hashtable;

    if-ne p1, v0, :cond_1

    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    return-object p1

    :cond_1
    const-class v0, Ljava/util/IdentityHashMap;

    if-ne p1, v0, :cond_2

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    return-object p1

    :cond_2
    const-class v0, Ljava/util/SortedMap;

    if-eq p1, v0, :cond_c

    const-class v0, Ljava/util/TreeMap;

    if-ne p1, v0, :cond_3

    goto/16 :goto_2

    :cond_3
    const-class v0, Ljava/util/concurrent/ConcurrentMap;

    if-eq p1, v0, :cond_b

    const-class v0, Ljava/util/concurrent/ConcurrentHashMap;

    if-ne p1, v0, :cond_4

    goto/16 :goto_1

    :cond_4
    const-class v0, Ljava/util/Map;

    if-eq p1, v0, :cond_a

    const-class v0, Ljava/util/HashMap;

    if-ne p1, v0, :cond_5

    goto :goto_0

    :cond_5
    const-class v0, Ljava/util/LinkedHashMap;

    if-ne p1, v0, :cond_6

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    return-object p1

    :cond_6
    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_8

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v0

    const-class v1, Ljava/util/EnumMap;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p1

    new-instance v0, Ljava/util/EnumMap;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    check-cast p1, Ljava/lang/Class;

    invoke-direct {v0, p1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    return-object v0

    :cond_7
    invoke-virtual {p0, v0}, Lj/q;->b(Ljava/lang/reflect/Type;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :cond_8
    move-object v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    const-string v2, "unsupport type "

    if-nez v1, :cond_9

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lf/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_9
    new-instance v0, Lf/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_0
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    return-object p1

    :cond_b
    :goto_1
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object p1

    :cond_c
    :goto_2
    new-instance p1, Ljava/util/TreeMap;

    invoke-direct {p1}, Ljava/util/TreeMap;-><init>()V

    return-object p1
.end method

.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
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

    const-class v0, Lf/e;

    const/4 v1, 0x0

    if-ne p2, v0, :cond_0

    iget-object v0, p1, Li/a;->o:Lj/l;

    if-nez v0, :cond_0

    new-instance p2, Lf/e;

    iget-object p3, p1, Li/a;->g:Li/c;

    sget-object v0, Li/b;->o:Li/b;

    invoke-interface {p3, v0}, Li/c;->A(Li/b;)Z

    move-result p3

    invoke-direct {p2, p3}, Lf/e;-><init>(Z)V

    invoke-virtual {p1, p2, v1}, Li/a;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf/e;

    return-object p1

    :cond_0
    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_1

    const/16 p1, 0x10

    invoke-interface {v0, p1}, Li/c;->Q(I)V

    return-object v1

    :cond_1
    invoke-virtual {p0, p2}, Lj/q;->b(Ljava/lang/reflect/Type;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p1, Li/a;->h:Li/h;

    :try_start_0
    invoke-virtual {p1, v1, v0, p3}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    invoke-virtual {p0, p1, p2, p3, v0}, Lj/q;->d(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v1}, Li/a;->P(Li/h;)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v1}, Li/a;->P(Li/h;)V

    throw p2
.end method

.method public final d(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    instance-of v4, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_23

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "org.springframework.util.LinkedMultiValueMap"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    const-class v0, Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    aget-object v0, v0, v7

    :goto_0
    const-class v6, Ljava/lang/String;

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/16 v10, 0xd

    const-string v11, "syntax error, expect {, actual "

    const/16 v12, 0xc

    const/16 v13, 0x10

    if-ne v6, v4, :cond_15

    iget-object v4, v1, Li/a;->g:Li/c;

    invoke-interface {v4}, Li/c;->q()I

    move-result v6

    if-eq v6, v12, :cond_3

    invoke-static {v11}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4}, Li/c;->Y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_1

    const-string v3, ", fieldName "

    invoke-static {v0, v3}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v2}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    const-string v3, ", "

    invoke-static {v0, v3}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4}, Li/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eq v6, v8, :cond_2

    new-instance v3, Lf/b;

    invoke-direct {v3}, Lf/b;-><init>()V

    invoke-virtual {v1, v3, v2}, Li/a;->y(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lf/b;->size()I

    move-result v1

    if-ne v1, v7, :cond_2

    invoke-virtual {v3, v5}, Lf/b;->get(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lf/e;

    if-eqz v2, :cond_2

    move-object v0, v1

    check-cast v0, Lf/e;

    goto/16 :goto_7

    :cond_2
    new-instance v1, Lf/d;

    invoke-direct {v1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v6, v1, Li/a;->h:Li/h;

    :goto_1
    :try_start_0
    invoke-interface {v4}, Li/c;->J()V

    invoke-interface {v4}, Li/c;->z()C

    move-result v7

    sget-object v8, Li/b;->h:Li/b;

    invoke-interface {v4, v8}, Li/c;->A(Li/b;)Z

    move-result v8

    if-eqz v8, :cond_4

    :goto_2
    const/16 v8, 0x2c

    if-ne v7, v8, :cond_4

    invoke-interface {v4}, Li/c;->next()C

    invoke-interface {v4}, Li/c;->J()V

    invoke-interface {v4}, Li/c;->z()C

    move-result v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_4
    const-string v8, "expect \':\' at "

    const/16 v11, 0x3a

    const/16 v12, 0x22

    if-ne v7, v12, :cond_6

    :try_start_1
    iget-object v7, v1, Li/a;->c:Li/j;

    invoke-interface {v4, v7, v12}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4}, Li/c;->J()V

    invoke-interface {v4}, Li/c;->z()C

    move-result v14

    if-ne v14, v11, :cond_5

    goto/16 :goto_3

    :cond_5
    new-instance v0, Lf/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Li/c;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const/16 v14, 0x7d

    if-ne v7, v14, :cond_7

    invoke-interface {v4}, Li/c;->next()C

    invoke-interface {v4}, Li/c;->K()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_4

    :cond_7
    const-string v14, "syntax error"

    const/16 v15, 0x27

    if-ne v7, v15, :cond_a

    :try_start_2
    sget-object v7, Li/b;->e:Li/b;

    invoke-interface {v4, v7}, Li/c;->A(Li/b;)Z

    move-result v7

    if-eqz v7, :cond_9

    iget-object v7, v1, Li/a;->c:Li/j;

    invoke-interface {v4, v7, v15}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4}, Li/c;->J()V

    invoke-interface {v4}, Li/c;->z()C

    move-result v14

    if-ne v14, v11, :cond_8

    goto :goto_3

    :cond_8
    new-instance v0, Lf/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Li/c;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Lf/d;

    invoke-direct {v0, v14}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    sget-object v7, Li/b;->d:Li/b;

    invoke-interface {v4, v7}, Li/c;->A(Li/b;)Z

    move-result v7

    if-eqz v7, :cond_14

    iget-object v7, v1, Li/a;->c:Li/j;

    invoke-interface {v4, v7}, Li/c;->W(Li/j;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4}, Li/c;->J()V

    invoke-interface {v4}, Li/c;->z()C

    move-result v14

    if-ne v14, v11, :cond_13

    :goto_3
    invoke-interface {v4}, Li/c;->next()C

    invoke-interface {v4}, Li/c;->J()V

    invoke-interface {v4}, Li/c;->z()C

    invoke-interface {v4}, Li/c;->K()V

    sget-object v8, Lf/a;->d:Ljava/lang/String;

    if-ne v7, v8, :cond_d

    sget-object v8, Li/b;->p:Li/b;

    invoke-interface {v4, v8}, Li/c;->A(Li/b;)Z

    move-result v8

    if-nez v8, :cond_d

    iget-object v7, v1, Li/a;->c:Li/j;

    invoke-interface {v4, v7, v12}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v1, Li/a;->d:Li/i;

    invoke-virtual {v8, v7, v9}, Li/i;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v7

    const-class v11, Ljava/util/Map;

    invoke-virtual {v11, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v4, v13}, Li/c;->Q(I)V

    invoke-interface {v4}, Li/c;->q()I

    move-result v7

    if-ne v7, v10, :cond_11

    :goto_4
    invoke-interface {v4, v13}, Li/c;->Q(I)V

    goto :goto_6

    :cond_b
    invoke-virtual {v8, v7}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v0

    invoke-interface {v4, v13}, Li/c;->Q(I)V

    const/4 v3, 0x2

    iput v3, v1, Li/a;->l:I

    if-eqz v6, :cond_c

    instance-of v3, v2, Ljava/lang/Integer;

    if-nez v3, :cond_c

    invoke-virtual/range {p1 .. p1}, Li/a;->J()V

    :cond_c
    invoke-interface {v0, v1, v7, v2}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v1, v6}, Li/a;->P(Li/h;)V

    goto :goto_7

    :cond_d
    :try_start_3
    invoke-interface {v4}, Li/c;->y()V

    if-eqz v5, :cond_e

    invoke-virtual {v1, v6}, Li/a;->P(Li/h;)V

    :cond_e
    invoke-interface {v4}, Li/c;->q()I

    move-result v8

    const/16 v11, 0x8

    if-ne v8, v11, :cond_f

    invoke-interface {v4}, Li/c;->y()V

    move-object v8, v9

    goto :goto_5

    :cond_f
    invoke-virtual {v1, v0, v7}, Li/a;->A(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    :goto_5
    invoke-interface {v3, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v3, v7}, Li/a;->e(Ljava/util/Map;Ljava/lang/Object;)V

    invoke-virtual {v1, v6, v8, v7}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    invoke-virtual {v1, v6}, Li/a;->P(Li/h;)V

    invoke-interface {v4}, Li/c;->q()I

    move-result v7

    const/16 v8, 0x14

    if-eq v7, v8, :cond_12

    const/16 v8, 0xf

    if-ne v7, v8, :cond_10

    goto :goto_6

    :cond_10
    if-ne v7, v10, :cond_11

    invoke-interface {v4}, Li/c;->y()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :cond_11
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_12
    :goto_6
    invoke-virtual {v1, v6}, Li/a;->P(Li/h;)V

    move-object v0, v3

    :goto_7
    return-object v0

    :cond_13
    :try_start_4
    new-instance v0, Lf/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Li/c;->a()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", actual "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    new-instance v0, Lf/d;

    invoke-direct {v0, v14}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    invoke-virtual {v1, v6}, Li/a;->P(Li/h;)V

    throw v0

    :cond_15
    iget-object v2, v1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v5

    if-eq v5, v12, :cond_17

    invoke-interface {v2}, Li/c;->q()I

    move-result v5

    if-ne v5, v13, :cond_16

    goto :goto_8

    :cond_16
    new-instance v0, Lf/d;

    invoke-static {v11}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-interface {v2}, Li/c;->Y()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    :goto_8
    iget-object v5, v1, Li/a;->d:Li/i;

    invoke-virtual {v5, v4}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v5

    iget-object v6, v1, Li/a;->d:Li/i;

    invoke-virtual {v6, v0}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v6

    invoke-interface {v5}, Lj/s;->e()I

    move-result v11

    invoke-interface {v2, v11}, Li/c;->Q(I)V

    iget-object v11, v1, Li/a;->h:Li/h;

    :cond_18
    :goto_9
    :try_start_5
    invoke-interface {v2}, Li/c;->q()I

    move-result v12

    if-ne v12, v10, :cond_19

    invoke-interface {v2, v13}, Li/c;->Q(I)V

    goto/16 :goto_d

    :cond_19
    invoke-interface {v2}, Li/c;->q()I

    move-result v12

    if-ne v12, v8, :cond_1f

    invoke-interface {v2}, Li/c;->g0()Z

    move-result v12

    if-eqz v12, :cond_1f

    sget-object v12, Li/b;->p:Li/b;

    invoke-interface {v2, v12}, Li/c;->A(Li/b;)Z

    move-result v12

    if-nez v12, :cond_1f

    invoke-interface {v2}, Li/c;->H()V

    invoke-interface {v2}, Li/c;->q()I

    move-result v0

    if-ne v0, v8, :cond_1e

    invoke-interface {v2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v0

    const-string v3, ".."

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1a

    iget-object v0, v11, Li/h;->b:Li/h;

    goto :goto_b

    :cond_1a
    const-string v3, "$"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1c

    move-object v0, v11

    :goto_a
    iget-object v3, v0, Li/h;->b:Li/h;

    if-eqz v3, :cond_1b

    move-object v0, v3

    goto :goto_a

    :cond_1b
    :goto_b
    iget-object v0, v0, Li/h;->a:Ljava/lang/Object;

    goto :goto_c

    :cond_1c
    new-instance v3, Li/a$a;

    invoke-direct {v3, v11, v0}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Li/a;->b(Li/a$a;)V

    iput v7, v1, Li/a;->l:I

    move-object v0, v9

    :goto_c
    invoke-interface {v2, v10}, Li/c;->Q(I)V

    invoke-interface {v2}, Li/c;->q()I

    move-result v3

    if-ne v3, v10, :cond_1d

    invoke-interface {v2, v13}, Li/c;->Q(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-virtual {v1, v11}, Li/a;->P(Li/h;)V

    goto :goto_e

    :cond_1d
    :try_start_6
    new-instance v0, Lf/d;

    const-string v2, "illegal ref"

    invoke-direct {v0, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    new-instance v0, Lf/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "illegal ref, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    invoke-static {v2}, Li/g;->w(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    invoke-interface/range {p4 .. p4}, Ljava/util/Map;->size()I

    move-result v12

    if-nez v12, :cond_21

    invoke-interface {v2}, Li/c;->q()I

    move-result v12

    if-ne v12, v8, :cond_21

    sget-object v12, Lf/a;->d:Ljava/lang/String;

    invoke-interface {v2}, Li/c;->k0()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_21

    sget-object v12, Li/b;->p:Li/b;

    invoke-interface {v2, v12}, Li/c;->A(Li/b;)Z

    move-result v12

    if-nez v12, :cond_21

    invoke-interface {v2}, Li/c;->H()V

    invoke-interface {v2, v13}, Li/c;->Q(I)V

    invoke-interface {v2}, Li/c;->q()I

    move-result v12

    if-ne v12, v10, :cond_20

    invoke-interface {v2}, Li/c;->y()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_d
    invoke-virtual {v1, v11}, Li/a;->P(Li/h;)V

    move-object v0, v3

    :goto_e
    return-object v0

    :cond_20
    :try_start_7
    invoke-interface {v5}, Lj/s;->e()I

    move-result v12

    invoke-interface {v2, v12}, Li/c;->Q(I)V

    :cond_21
    invoke-interface {v5, v1, v4, v9}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    invoke-interface {v2}, Li/c;->q()I

    move-result v14

    const/16 v15, 0x11

    if-ne v14, v15, :cond_22

    invoke-interface {v6}, Lj/s;->e()I

    move-result v14

    invoke-interface {v2, v14}, Li/c;->Q(I)V

    invoke-interface {v6, v1, v0, v12}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v1, v3, v12}, Li/a;->e(Ljava/util/Map;Ljava/lang/Object;)V

    invoke-interface {v3, v12, v14}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v2}, Li/c;->q()I

    move-result v12

    if-ne v12, v13, :cond_18

    invoke-interface {v5}, Lj/s;->e()I

    move-result v12

    invoke-interface {v2, v12}, Li/c;->Q(I)V

    goto/16 :goto_9

    :cond_22
    new-instance v0, Lf/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syntax error, expect :, actual "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v11}, Li/a;->P(Li/h;)V

    throw v0

    :cond_23
    invoke-virtual {v1, v3, v2}, Li/a;->H(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
