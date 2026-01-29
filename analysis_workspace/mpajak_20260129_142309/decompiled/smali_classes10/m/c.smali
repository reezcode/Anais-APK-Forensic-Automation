.class public final Lm/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lm/c;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/reflect/Method;

.field public final d:Ljava/lang/reflect/Field;

.field public e:I

.field public final f:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final g:Ljava/lang/reflect/Type;

.field public final h:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:Ljava/lang/String;

.field public final m:Lg/b;

.field public final n:Lg/b;

.field public final o:Z

.field public final p:[C

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:Ljava/lang/String;

.field public final u:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Field;",
            "III)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm/c;->b:Ljava/lang/String;

    iput-object p2, p0, Lm/c;->h:Ljava/lang/Class;

    iput-object p3, p0, Lm/c;->f:Ljava/lang/Class;

    iput-object p4, p0, Lm/c;->g:Ljava/lang/reflect/Type;

    const/4 p1, 0x0

    iput-object p1, p0, Lm/c;->c:Ljava/lang/reflect/Method;

    iput-object p5, p0, Lm/c;->d:Ljava/lang/reflect/Field;

    iput p6, p0, Lm/c;->e:I

    iput p7, p0, Lm/c;->j:I

    iput p8, p0, Lm/c;->k:I

    invoke-virtual {p3}, Ljava/lang/Class;->isEnum()Z

    move-result p2

    iput-boolean p2, p0, Lm/c;->q:Z

    const/4 p2, 0x0

    if-eqz p5, :cond_0

    invoke-virtual {p5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p3

    and-int/lit8 p4, p3, 0x1

    invoke-static {p3}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result p3

    iput-boolean p3, p0, Lm/c;->o:Z

    goto :goto_0

    :cond_0
    iput-boolean p2, p0, Lm/c;->o:Z

    :goto_0
    invoke-virtual {p0}, Lm/c;->b()[C

    move-result-object p3

    iput-object p3, p0, Lm/c;->p:[C

    if-eqz p5, :cond_1

    invoke-static {p5}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    :cond_1
    const-string p3, ""

    iput-object p3, p0, Lm/c;->l:Ljava/lang/String;

    iput-object p1, p0, Lm/c;->m:Lg/b;

    iput-object p1, p0, Lm/c;->n:Lg/b;

    iput-boolean p2, p0, Lm/c;->i:Z

    iput-boolean p2, p0, Lm/c;->r:Z

    iput-boolean p2, p0, Lm/c;->s:Z

    iput-object p1, p0, Lm/c;->t:Ljava/lang/String;

    new-array p1, p2, [Ljava/lang/String;

    iput-object p1, p0, Lm/c;->u:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IIILg/b;Lg/b;Ljava/lang/String;)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "III",
            "Lg/b;",
            "Lg/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    move-object v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p11

    const-class v6, Ljava/lang/String;

    const-class v7, Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v8, 0x0

    iput v8, v1, Lm/c;->e:I

    if-eqz v2, :cond_0

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    move-object v10, p1

    invoke-virtual {v9, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    goto :goto_0

    :cond_0
    move-object v10, p1

    :cond_1
    move-object v9, v10

    :goto_0
    iput-object v9, v1, Lm/c;->b:Ljava/lang/String;

    iput-object v0, v1, Lm/c;->c:Ljava/lang/reflect/Method;

    iput-object v2, v1, Lm/c;->d:Ljava/lang/reflect/Field;

    move/from16 v9, p6

    iput v9, v1, Lm/c;->e:I

    move/from16 v9, p7

    iput v9, v1, Lm/c;->j:I

    move/from16 v9, p8

    iput v9, v1, Lm/c;->k:I

    move-object/from16 v9, p9

    iput-object v9, v1, Lm/c;->m:Lg/b;

    move-object/from16 v9, p10

    iput-object v9, v1, Lm/c;->n:Lg/b;

    const/4 v9, 0x1

    if-eqz v2, :cond_7

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v10

    and-int/lit8 v11, v10, 0x1

    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result v10

    if-nez v10, :cond_6

    sget-boolean v10, Lm/j;->a:Z

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    sget-boolean v10, Lm/j;->j:Z

    if-nez v10, :cond_3

    :try_start_0
    const-string v10, "java.beans.Transient"

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    sput-object v10, Lm/j;->k:Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    sput-boolean v9, Lm/j;->j:Z

    throw v0

    :catch_0
    :goto_1
    sput-boolean v9, Lm/j;->j:Z

    :cond_3
    sget-object v10, Lm/j;->k:Ljava/lang/Class;

    if-eqz v10, :cond_4

    invoke-virtual {v0, v10}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v10

    if-eqz v10, :cond_4

    const/4 v10, 0x1

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_5

    goto :goto_4

    :cond_5
    const/4 v10, 0x0

    goto :goto_5

    :cond_6
    :goto_4
    const/4 v10, 0x1

    :goto_5
    iput-boolean v10, v1, Lm/c;->o:Z

    goto :goto_6

    :cond_7
    iput-boolean v8, v1, Lm/c;->o:Z

    :goto_6
    if-eqz v5, :cond_8

    invoke-virtual/range {p11 .. p11}, Ljava/lang/String;->length()I

    move-result v10

    if-lez v10, :cond_8

    goto :goto_7

    :cond_8
    const-string v5, ""

    :goto_7
    iput-object v5, v1, Lm/c;->l:Ljava/lang/String;

    invoke-virtual {p0}, Lm/c;->c()Lg/b;

    move-result-object v5

    const/4 v10, 0x0

    if-eqz v5, :cond_a

    invoke-interface {v5}, Lg/b;->format()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    if-nez v12, :cond_9

    move-object v11, v10

    :cond_9
    invoke-interface {v5}, Lg/b;->jsonDirect()Z

    move-result v12

    invoke-interface {v5}, Lg/b;->unwrapped()Z

    move-result v13

    iput-boolean v13, v1, Lm/c;->s:Z

    invoke-interface {v5}, Lg/b;->alternateNames()[Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lm/c;->u:[Ljava/lang/String;

    goto :goto_8

    :cond_a
    iput-boolean v8, v1, Lm/c;->s:Z

    new-array v5, v8, [Ljava/lang/String;

    iput-object v5, v1, Lm/c;->u:[Ljava/lang/String;

    move-object v11, v10

    const/4 v12, 0x0

    :goto_8
    iput-object v11, v1, Lm/c;->t:Ljava/lang/String;

    invoke-virtual {p0}, Lm/c;->b()[C

    move-result-object v5

    iput-object v5, v1, Lm/c;->p:[C

    if-eqz v0, :cond_b

    invoke-static/range {p2 .. p2}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    :cond_b
    if-eqz v2, :cond_c

    invoke-static/range {p3 .. p3}, Lm/j;->P(Ljava/lang/reflect/AccessibleObject;)V

    :cond_c
    if-eqz v0, :cond_f

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v5, v2

    if-ne v5, v9, :cond_d

    aget-object v2, v2, v8

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v5

    aget-object v5, v5, v8

    :goto_9
    const/4 v11, 0x0

    goto :goto_a

    :cond_d
    array-length v5, v2

    const/4 v11, 0x2

    if-ne v5, v11, :cond_e

    aget-object v5, v2, v8

    if-ne v5, v6, :cond_e

    aget-object v5, v2, v9

    if-ne v5, v7, :cond_e

    aget-object v2, v2, v8

    move-object v5, v2

    goto :goto_9

    :cond_e
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v5

    const/4 v11, 0x1

    :goto_a
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    iput-object v0, v1, Lm/c;->h:Ljava/lang/Class;

    goto :goto_b

    :cond_f
    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v5

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v11

    iput-object v11, v1, Lm/c;->h:Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v2

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v11

    move-object v2, v0

    :goto_b
    iput-boolean v11, v1, Lm/c;->i:Z

    if-eqz v12, :cond_10

    if-ne v2, v6, :cond_10

    goto :goto_c

    :cond_10
    const/4 v9, 0x0

    :goto_c
    iput-boolean v9, v1, Lm/c;->r:Z

    if-eqz v3, :cond_19

    if-ne v2, v7, :cond_19

    instance-of v0, v5, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_19

    move-object v0, v5

    check-cast v0, Ljava/lang/reflect/TypeVariable;

    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v6

    instance-of v6, v6, Ljava/lang/Class;

    if-eqz v6, :cond_11

    invoke-interface {v0}, Ljava/lang/reflect/TypeVariable;->getGenericDeclaration()Ljava/lang/reflect/GenericDeclaration;

    move-result-object v6

    check-cast v6, Ljava/lang/Class;

    goto :goto_d

    :cond_11
    move-object v6, v10

    :goto_d
    if-ne v6, v3, :cond_13

    instance-of v7, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v7, :cond_12

    move-object v7, v4

    check-cast v7, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v7}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v7

    goto :goto_f

    :cond_12
    move-object v7, v10

    goto :goto_f

    :cond_13
    move-object v11, v3

    move-object v9, v10

    :goto_e
    if-eqz v11, :cond_15

    if-eq v11, v7, :cond_15

    if-eq v11, v6, :cond_15

    invoke-virtual {v11}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v12

    instance-of v13, v12, Ljava/lang/reflect/ParameterizedType;

    if-eqz v13, :cond_14

    check-cast v12, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v12}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v13

    invoke-static {v12, v13, v9}, Lm/c;->d([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-object v9, v12

    :cond_14
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v11

    goto :goto_e

    :cond_15
    move-object v7, v9

    :goto_f
    if-nez v7, :cond_16

    goto :goto_11

    :cond_16
    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v6

    :goto_10
    array-length v9, v6

    if-ge v8, v9, :cond_18

    aget-object v9, v6, v8

    invoke-virtual {v0, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_17

    aget-object v10, v7, v8

    goto :goto_11

    :cond_17
    add-int/lit8 v8, v8, 0x1

    goto :goto_10

    :cond_18
    :goto_11
    if-eqz v10, :cond_19

    invoke-static {v10}, Lm/j;->w(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    iput-object v0, v1, Lm/c;->f:Ljava/lang/Class;

    iput-object v10, v1, Lm/c;->g:Ljava/lang/reflect/Type;

    :goto_12
    invoke-virtual {v2}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    iput-boolean v0, v1, Lm/c;->q:Z

    return-void

    :cond_19
    instance-of v0, v5, Ljava/lang/Class;

    if-nez v0, :cond_1d

    if-eqz v4, :cond_1a

    goto :goto_13

    :cond_1a
    move-object v4, v3

    :goto_13
    invoke-static {v3, v4, v5}, Lm/c;->e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    if-eq v0, v5, :cond_1c

    instance-of v3, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_1b

    :goto_14
    invoke-static {v0}, Lm/j;->w(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    goto :goto_15

    :cond_1b
    instance-of v3, v0, Ljava/lang/Class;

    if-eqz v3, :cond_1c

    goto :goto_14

    :cond_1c
    :goto_15
    move-object v5, v0

    :cond_1d
    iput-object v5, v1, Lm/c;->g:Ljava/lang/reflect/Type;

    iput-object v2, v1, Lm/c;->f:Ljava/lang/Class;

    goto :goto_12
.end method

.method public static d([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, p0

    if-ge v1, v3, :cond_4

    aget-object v3, p0, v1

    instance-of v4, v3, Ljava/lang/reflect/ParameterizedType;

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4, p1, p2}, Lm/c;->d([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-result v6

    if-eqz v6, :cond_3

    new-instance v2, Lm/h;

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-interface {v3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v3

    invoke-direct {v2, v4, v6, v3}, Lm/h;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    aput-object v2, p0, v1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    instance-of v4, v3, Ljava/lang/reflect/TypeVariable;

    if-eqz v4, :cond_3

    const/4 v4, 0x0

    :goto_1
    array-length v6, p1

    if-ge v4, v6, :cond_3

    aget-object v6, p1, v4

    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    aget-object v2, p2, v4

    aput-object v2, p0, v1

    const/4 v2, 0x1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return v2

    :cond_5
    :goto_3
    return v0
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    if-eqz p0, :cond_a

    if-nez p1, :cond_0

    goto/16 :goto_5

    :cond_0
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lm/c;->e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    if-eq v0, p0, :cond_1

    invoke-static {p0}, Lm/j;->w(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p2

    :cond_2
    invoke-static {p1}, Lm/j;->J(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_3

    return-object p2

    :cond_3
    instance-of v0, p2, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_7

    instance-of v0, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_4
    instance-of v0, p1, Ljava/lang/Class;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {v0}, Lm/j;->B(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    goto :goto_1

    :cond_5
    :goto_0
    move-object v0, p1

    :goto_1
    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0}, Lm/j;->w(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    move-object v3, p2

    check-cast v3, Ljava/lang/reflect/TypeVariable;

    invoke-virtual {v2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v2

    :goto_2
    array-length v4, v2

    if-ge v1, v4, :cond_7

    aget-object v4, v2, v1

    invoke-interface {v4}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    aget-object p0, p0, v1

    return-object p0

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_a

    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v1

    instance-of v2, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_8

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v2

    instance-of v2, v2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_9

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    :goto_3
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    move-object p1, v0

    :goto_4
    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-static {v1, p0, p1}, Lm/c;->d([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-result p0

    if-eqz p0, :cond_a

    new-instance p0, Lm/h;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-direct {p0, v1, p1, p2}, Lm/h;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object p0

    :cond_a
    :goto_5
    return-object p2
.end method


# virtual methods
.method public final a(Lm/c;)I
    .locals 6

    iget v0, p0, Lm/c;->e:I

    iget v1, p1, Lm/c;->e:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v3, 0x1

    if-le v0, v1, :cond_1

    return v3

    :cond_1
    iget-object v0, p0, Lm/c;->b:Ljava/lang/String;

    iget-object v1, p1, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, Lm/c;->c:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lm/c;->d:Ljava/lang/reflect/Field;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_4
    move-object v0, v1

    :goto_0
    iget-object v4, p1, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_1

    :cond_5
    iget-object v4, p1, Lm/c;->d:Ljava/lang/reflect/Field;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    :cond_6
    :goto_1
    if-eqz v0, :cond_8

    if-eqz v1, :cond_8

    if-eq v0, v1, :cond_8

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_7

    return v2

    :cond_7
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_8

    return v3

    :cond_8
    iget-object v0, p0, Lm/c;->d:Ljava/lang/reflect/Field;

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v0

    iget-object v4, p0, Lm/c;->f:Ljava/lang/Class;

    if-ne v0, v4, :cond_9

    const/4 v0, 0x1

    goto :goto_2

    :cond_9
    const/4 v0, 0x0

    :goto_2
    iget-object v4, p1, Lm/c;->d:Ljava/lang/reflect/Field;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    iget-object v5, p1, Lm/c;->f:Ljava/lang/Class;

    if-ne v4, v5, :cond_a

    const/4 v1, 0x1

    :cond_a
    if-eqz v0, :cond_b

    if-nez v1, :cond_b

    return v3

    :cond_b
    if-eqz v1, :cond_c

    if-nez v0, :cond_c

    return v2

    :cond_c
    iget-object v0, p1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_d

    return v3

    :cond_d
    iget-object v0, p0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    move-result v0

    if-nez v0, :cond_e

    return v2

    :cond_e
    iget-object v0, p1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "java."

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_f

    return v3

    :cond_f
    iget-object v0, p0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    return v2

    :cond_10
    iget-object v0, p0, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final b()[C
    .locals 6

    iget-object v0, p0, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x3

    new-array v1, v1, [C

    iget-object v2, p0, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v2, v4, v3, v1, v5}, Ljava/lang/String;->getChars(II[CI)V

    const/16 v2, 0x22

    aput-char v2, v1, v4

    add-int/lit8 v3, v0, 0x1

    aput-char v2, v1, v3

    add-int/lit8 v0, v0, 0x2

    const/16 v2, 0x3a

    aput-char v2, v1, v0

    return-object v1
.end method

.method public final c()Lg/b;
    .locals 1

    iget-object v0, p0, Lm/c;->m:Lg/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lm/c;->n:Lg/b;

    return-object v0
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lm/c;

    invoke-virtual {p0, p1}, Lm/c;->a(Lm/c;)I

    move-result p1

    return p1
.end method

.method public final f()Ljava/lang/reflect/Member;
    .locals 1

    iget-object v0, p0, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lm/c;->d:Ljava/lang/reflect/Field;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm/c;->b:Ljava/lang/String;

    return-object v0
.end method
