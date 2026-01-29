.class public final Ll2/n;
.super Ljava/lang/Object;

# interfaces
.implements Li2/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll2/n$a;,
        Ll2/n$b;
    }
.end annotation


# instance fields
.field public final b:Lk2/e;

.field public final c:Li2/c;

.field public final d:Lk2/m;

.field public final e:Ll2/e;


# direct methods
.method public constructor <init>(Lk2/e;Li2/c;Lk2/m;Ll2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll2/n;->b:Lk2/e;

    iput-object p2, p0, Ll2/n;->c:Li2/c;

    iput-object p3, p0, Ll2/n;->d:Lk2/m;

    iput-object p4, p0, Ll2/n;->e:Ll2/e;

    return-void
.end method


# virtual methods
.method public final a(Li2/i;Lo2/a;)Li2/z;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li2/i;",
            "Lo2/a<",
            "TT;>;)",
            "Li2/z<",
            "TT;>;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-class v12, Ljava/lang/Object;

    iget-object v3, v2, Lo2/a;->a:Ljava/lang/Class;

    invoke-virtual {v12, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_0

    return-object v5

    :cond_0
    iget-object v4, v1, Ll2/n;->b:Lk2/e;

    invoke-virtual {v4, v2}, Lk2/e;->a(Lo2/a;)Lk2/q;

    move-result-object v13

    new-instance v14, Ll2/n$a;

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-direct {v15}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    move-result v4

    if-eqz v4, :cond_2

    :cond_1
    move-object/from16 v26, v13

    move-object/from16 v20, v14

    goto/16 :goto_b

    :cond_2
    iget-object v11, v2, Lo2/a;->b:Ljava/lang/reflect/Type;

    move-object v10, v2

    move-object v9, v3

    :goto_0
    if-eq v9, v12, :cond_1

    invoke-virtual {v9}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v8

    array-length v7, v8

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v7, :cond_f

    aget-object v5, v8, v6

    const/4 v3, 0x1

    invoke-virtual {v1, v5, v3}, Ll2/n;->b(Ljava/lang/reflect/Field;Z)Z

    move-result v4

    invoke-virtual {v1, v5, v2}, Ll2/n;->b(Ljava/lang/reflect/Field;Z)Z

    move-result v16

    if-nez v4, :cond_3

    if-nez v16, :cond_3

    move/from16 v17, v6

    move/from16 v18, v7

    move-object/from16 v25, v8

    move-object/from16 p2, v9

    move-object/from16 v21, v12

    move-object/from16 v26, v13

    move-object/from16 v20, v14

    move-object v13, v10

    move-object v14, v11

    goto/16 :goto_a

    :cond_3
    :try_start_0
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v2, v10, Lo2/a;->b:Ljava/lang/reflect/Type;

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-static {v2, v9, v3}, Lk2/a;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v3

    const-class v2, Lj2/b;

    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lj2/b;

    if-nez v2, :cond_4

    iget-object v2, v1, Ll2/n;->c:Li2/c;

    invoke-interface {v2, v5}, Li2/c;->a(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move/from16 p2, v4

    move/from16 v17, v6

    goto :goto_2

    :cond_4
    move/from16 p2, v4

    invoke-interface {v2}, Lj2/b;->value()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Lj2/b;->alternate()[Ljava/lang/String;

    move-result-object v2

    move/from16 v17, v6

    array-length v6, v2

    if-nez v6, :cond_5

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_2
    move/from16 v18, v7

    move-object v7, v2

    goto :goto_4

    :cond_5
    new-instance v6, Ljava/util/ArrayList;

    move/from16 v18, v7

    array-length v7, v2

    add-int/lit8 v7, v7, 0x1

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    array-length v4, v2

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v4, :cond_6

    move/from16 v19, v4

    aget-object v4, v2, v7

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move/from16 v4, v19

    goto :goto_3

    :cond_6
    move-object v7, v6

    :goto_4
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v6

    const/4 v2, 0x0

    const/4 v4, 0x0

    move/from16 v19, p2

    move-object v4, v2

    const/4 v2, 0x0

    :goto_5
    if-ge v2, v6, :cond_d

    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v12

    move-object/from16 v12, v20

    check-cast v12, Ljava/lang/String;

    if-eqz v2, :cond_7

    const/16 v19, 0x0

    :cond_7
    move-object/from16 v20, v10

    new-instance v10, Lo2/a;

    invoke-direct {v10, v3}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    move/from16 p2, v2

    iget-object v2, v10, Lo2/a;->a:Ljava/lang/Class;

    move-object/from16 v22, v3

    instance-of v3, v2, Ljava/lang/Class;

    if-eqz v3, :cond_8

    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    const/16 v23, 0x1

    goto :goto_6

    :cond_8
    const/4 v2, 0x0

    const/16 v23, 0x0

    :goto_6
    const-class v2, Lj2/a;

    invoke-virtual {v5, v2}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lj2/a;

    if-eqz v2, :cond_9

    iget-object v3, v1, Ll2/n;->e:Ll2/e;

    move-object/from16 v24, v4

    iget-object v4, v1, Ll2/n;->b:Lk2/e;

    invoke-virtual {v3, v4, v0, v10, v2}, Ll2/e;->b(Lk2/e;Li2/i;Lo2/a;Lj2/a;)Li2/z;

    move-result-object v2

    goto :goto_7

    :cond_9
    move-object/from16 v24, v4

    const/4 v2, 0x0

    :goto_7
    if-eqz v2, :cond_a

    const/4 v3, 0x1

    const/16 v25, 0x1

    goto :goto_8

    :cond_a
    const/4 v3, 0x0

    const/16 v25, 0x0

    :goto_8
    if-nez v2, :cond_b

    invoke-virtual {v0, v10}, Li2/i;->e(Lo2/a;)Li2/z;

    move-result-object v2

    :cond_b
    move-object/from16 v26, v2

    new-instance v4, Ll2/m;

    move/from16 v27, p2

    move-object v2, v4

    move-object v3, v12

    move-object v1, v4

    move-object/from16 v0, v24

    move/from16 v4, v19

    move-object/from16 v24, v5

    move/from16 v5, v16

    move/from16 v28, v6

    move-object/from16 v6, v24

    move-object/from16 v29, v7

    move/from16 v7, v25

    move-object/from16 v25, v8

    move-object/from16 v8, v26

    move-object/from16 p2, v9

    move-object/from16 v9, p1

    move-object/from16 v26, v13

    move-object/from16 v13, v20

    move-object/from16 v20, v14

    move-object v14, v11

    move/from16 v11, v23

    invoke-direct/range {v2 .. v11}, Ll2/m;-><init>(Ljava/lang/String;ZZLjava/lang/reflect/Field;ZLi2/z;Li2/i;Lo2/a;Z)V

    invoke-interface {v15, v12, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll2/n$b;

    if-nez v0, :cond_c

    move-object v4, v1

    goto :goto_9

    :cond_c
    move-object v4, v0

    :goto_9
    add-int/lit8 v2, v27, 0x1

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    move-object v10, v13

    move-object v11, v14

    move-object/from16 v14, v20

    move-object/from16 v12, v21

    move-object/from16 v3, v22

    move-object/from16 v5, v24

    move-object/from16 v8, v25

    move-object/from16 v13, v26

    move/from16 v6, v28

    move-object/from16 v7, v29

    goto/16 :goto_5

    :cond_d
    move-object v0, v4

    move-object/from16 v25, v8

    move-object/from16 p2, v9

    move-object/from16 v21, v12

    move-object/from16 v26, v13

    move-object/from16 v20, v14

    move-object v13, v10

    move-object v14, v11

    if-nez v0, :cond_e

    :goto_a
    add-int/lit8 v6, v17, 0x1

    const/4 v2, 0x0

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v9, p2

    move-object v10, v13

    move-object v11, v14

    move/from16 v7, v18

    move-object/from16 v14, v20

    move-object/from16 v12, v21

    move-object/from16 v8, v25

    move-object/from16 v13, v26

    goto/16 :goto_1

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " declares multiple JSON fields named "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v0, Ll2/n$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_0
    move-exception v0

    move-object/from16 v24, v5

    move-object v1, v0

    new-instance v0, Li2/o;

    const-string v2, "Failed making field \'"

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "#"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' accessible; either change its visibility or write a custom TypeAdapter for its declaring type"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Li2/o;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_f
    move-object/from16 p2, v9

    move-object/from16 v21, v12

    move-object/from16 v26, v13

    move-object/from16 v20, v14

    move-object v13, v10

    move-object v14, v11

    iget-object v0, v13, Lo2/a;->b:Ljava/lang/reflect/Type;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v1

    move-object/from16 v3, p2

    invoke-static {v0, v3, v1}, Lk2/a;->h(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    new-instance v10, Lo2/a;

    invoke-direct {v10, v0}, Lo2/a;-><init>(Ljava/lang/reflect/Type;)V

    iget-object v9, v10, Lo2/a;->a:Ljava/lang/Class;

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v14, v20

    move-object/from16 v13, v26

    goto/16 :goto_0

    :goto_b
    move-object/from16 v1, v20

    move-object/from16 v0, v26

    invoke-direct {v1, v0, v15}, Ll2/n$a;-><init>(Lk2/q;Ljava/util/Map;)V

    return-object v1
.end method

.method public final b(Ljava/lang/reflect/Field;Z)Z
    .locals 5

    iget-object v0, p0, Ll2/n;->d:Lk2/m;

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/m;->c(Ljava/lang/Class;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    invoke-virtual {v0, v1, p2}, Lk2/m;->b(Ljava/lang/Class;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_8

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v1

    and-int/lit16 v1, v1, 0x88

    if-eqz v1, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/m;->c(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_3

    :cond_4
    if-eqz p2, :cond_5

    iget-object p2, v0, Lk2/m;->b:Ljava/util/List;

    goto :goto_2

    :cond_5
    iget-object p2, v0, Lk2/m;->c:Ljava/util/List;

    :goto_2
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    new-instance v0, Lg3/j;

    invoke-direct {v0, p1}, Lg3/j;-><init>(Ljava/lang/reflect/Field;)V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li2/a;

    invoke-interface {p2}, Li2/a;->b()Z

    move-result p2

    if-eqz p2, :cond_6

    :goto_3
    const/4 p1, 0x1

    goto :goto_4

    :cond_7
    const/4 p1, 0x0

    :goto_4
    if-nez p1, :cond_8

    const/4 v3, 0x1

    :cond_8
    return v3
.end method
