.class public final Lk/s;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;
.implements Lj/s;


# static fields
.field public static final a:Lk/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/s;

    invoke-direct {v0}, Lk/s;-><init>()V

    sput-object v0, Lk/s;->a:Lk/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
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

    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    iget-object p1, p1, Li/a;->g:Li/c;

    const/16 p2, 0x10

    invoke-interface {p1, p2}, Li/c;->Q(I)V

    return-object v1

    :cond_0
    const-class v0, Lf/b;

    if-ne p2, v0, :cond_1

    new-instance p2, Lf/b;

    invoke-direct {p2}, Lf/b;-><init>()V

    invoke-virtual {p1, p2, v1}, Li/a;->y(Ljava/util/Collection;Ljava/lang/Object;)V

    return-object p2

    :cond_1
    invoke-static {p2}, Lm/j;->F(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/util/AbstractCollection;

    if-eq v0, v1, :cond_9

    const-class v1, Ljava/util/Collection;

    if-ne v0, v1, :cond_2

    goto/16 :goto_1

    :cond_2
    const-class v1, Ljava/util/HashSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    goto :goto_2

    :cond_3
    const-class v1, Ljava/util/LinkedHashSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    goto :goto_2

    :cond_4
    const-class v1, Ljava/util/TreeSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    goto :goto_2

    :cond_5
    const-class v1, Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_2

    :cond_6
    const-class v1, Ljava/util/EnumSet;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_8

    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_7

    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    goto :goto_0

    :cond_7
    const-class v0, Ljava/lang/Object;

    :goto_0
    check-cast v0, Ljava/lang/Class;

    invoke-static {v0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    goto :goto_2

    :cond_8
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_2

    :catch_0
    new-instance p1, Lf/d;

    const-string p2, "create instance error, class "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {v0, p2}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_2
    invoke-static {p2}, Lm/j;->y(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-virtual {p1, p2, v0, p3}, Li/a;->x(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    return-object v0
.end method

.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 13

    move-object v7, p1

    move-object v0, p2

    move/from16 v8, p5

    iget-object v9, v7, Lk/g0;->j:Lk/a1;

    if-nez v0, :cond_0

    sget-object v0, Lk/b1;->i:Lk/b1;

    invoke-virtual {v9, v0}, Lk/a1;->I(Lk/b1;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    sget-object v2, Lk/b1;->p:Lk/b1;

    invoke-virtual {v9, v2}, Lk/a1;->l(Lk/b1;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    iget v3, v2, Lk/b1;->b:I

    and-int/2addr v3, v8

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    :cond_2
    invoke-static/range {p4 .. p4}, Lm/j;->y(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v1

    :cond_3
    move-object v10, v1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    iget-object v11, v7, Lk/g0;->o:Lk/v0;

    move-object/from16 v3, p3

    invoke-virtual {p1, v11, p2, v3}, Lk/g0;->o(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v2}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_5

    const-class v0, Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v0, v2, :cond_4

    const-string v0, "Set"

    goto :goto_1

    :cond_4
    const-class v0, Ljava/util/TreeSet;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v0, v2, :cond_5

    const-string v0, "TreeSet"

    :goto_1
    invoke-virtual {v9, v0}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    :cond_5
    const/16 v0, 0x5b

    :try_start_0
    invoke-virtual {v9, v0}, Lk/a1;->write(I)V

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v12, v4, 0x1

    if-eqz v4, :cond_6

    const/16 v1, 0x2c

    invoke-virtual {v9, v1}, Lk/a1;->write(I)V

    :cond_6
    if-nez v3, :cond_7

    invoke-virtual {v9}, Lk/a1;->E()V

    goto :goto_3

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/lang/Integer;

    if-ne v1, v2, :cond_8

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v9, v1}, Lk/a1;->z(I)V

    goto :goto_3

    :cond_8
    const-class v2, Ljava/lang/Long;

    if-ne v1, v2, :cond_9

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v9, v1, v2}, Lk/a1;->A(J)V

    sget-object v1, Lk/b1;->p:Lk/b1;

    invoke-virtual {v9, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v1

    if-eqz v1, :cond_b

    const/16 v1, 0x4c

    invoke-virtual {v9, v1}, Lk/a1;->write(I)V

    goto :goto_3

    :cond_9
    invoke-virtual {p1, v1}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v1

    sget-object v2, Lk/b1;->p:Lk/b1;

    invoke-static {v8, v2}, Lk/b1;->a(ILk/b1;)Z

    move-result v2

    if-eqz v2, :cond_a

    instance-of v2, v1, Lk/h0;

    if-eqz v2, :cond_a

    check-cast v1, Lk/h0;

    add-int/lit8 v2, v12, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v2, p1

    move-object v5, v10

    move/from16 v6, p5

    invoke-virtual/range {v1 .. v6}, Lk/h0;->q(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    goto :goto_3

    :cond_a
    add-int/lit8 v2, v12, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object v2, p1

    move-object v5, v10

    move/from16 v6, p5

    invoke-interface/range {v1 .. v6}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    :cond_b
    :goto_3
    move v4, v12

    goto :goto_2

    :cond_c
    const/16 v0, 0x5d

    invoke-virtual {v9, v0}, Lk/a1;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v11, v7, Lk/g0;->o:Lk/v0;

    return-void

    :catchall_0
    move-exception v0

    iput-object v11, v7, Lk/g0;->o:Lk/v0;

    throw v0
.end method

.method public final e()I
    .locals 1

    const/16 v0, 0xe

    return v0
.end method
