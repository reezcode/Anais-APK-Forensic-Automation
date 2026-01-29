.class public Lj/n;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# instance fields
.field public final a:[Lj/k;

.field public final b:[Lj/k;

.field public final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lm/g;

.field public e:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lj/k;",
            ">;"
        }
    .end annotation
.end field

.field public transient g:[J

.field public transient h:[S


# direct methods
.method public constructor <init>(Li/i;Ljava/lang/Class;Ljava/lang/reflect/Type;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/i;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p1, Li/i;->i:Z

    invoke-static {p2, p3, v0}, Lm/g;->c(Ljava/lang/Class;Ljava/lang/reflect/Type;Z)Lm/g;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lj/n;-><init>(Li/i;Lm/g;)V

    return-void
.end method

.method public constructor <init>(Li/i;Lm/g;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p2, Lm/g;->a:Ljava/lang/Class;

    iput-object v0, p0, Lj/n;->c:Ljava/lang/Class;

    iput-object p2, p0, Lj/n;->d:Lm/g;

    iget-object v0, p2, Lm/g;->i:[Lm/c;

    array-length v1, v0

    new-array v1, v1, [Lj/k;

    iput-object v1, p0, Lj/n;->b:[Lj/k;

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v4, v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_6

    iget-object v5, p2, Lm/g;->i:[Lm/c;

    aget-object v5, v5, v3

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, p2, Lm/g;->a:Ljava/lang/Class;

    iget-object v7, v5, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v5}, Lm/c;->c()Lg/b;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-interface {v8}, Lg/b;->deserializeUsing()Ljava/lang/Class;

    move-result-object v8

    const-class v9, Ljava/lang/Void;

    if-ne v8, v9, :cond_1

    :cond_0
    move-object v8, v2

    :cond_1
    if-nez v8, :cond_3

    const-class v8, Ljava/util/List;

    if-eq v7, v8, :cond_2

    const-class v8, Ljava/util/ArrayList;

    if-ne v7, v8, :cond_3

    :cond_2
    new-instance v7, Lj/c;

    invoke-direct {v7, v6, v5}, Lj/c;-><init>(Ljava/lang/Class;Lm/c;)V

    goto :goto_1

    :cond_3
    new-instance v7, Lj/f;

    invoke-direct {v7, v6, v5}, Lj/f;-><init>(Ljava/lang/Class;Lm/c;)V

    :goto_1
    iget-object v6, p0, Lj/n;->b:[Lj/k;

    aput-object v7, v6, v3

    iget-object v5, v5, Lm/c;->u:[Ljava/lang/String;

    array-length v6, v5

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v6, :cond_5

    aget-object v9, v5, v8

    if-nez v4, :cond_4

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    :cond_4
    invoke-interface {v4, v9, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    iput-object v4, p0, Lj/n;->f:Ljava/util/HashMap;

    iget-object p1, p2, Lm/g;->h:[Lm/c;

    array-length v0, p1

    new-array v0, v0, [Lj/k;

    iput-object v0, p0, Lj/n;->a:[Lj/k;

    array-length p1, p1

    :goto_3
    if-ge v1, p1, :cond_7

    iget-object v0, p2, Lm/g;->h:[Lm/c;

    aget-object v0, v0, v1

    iget-object v0, v0, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {p0, v0, v2}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object v0

    iget-object v3, p0, Lj/n;->a:[Lj/k;

    aput-object v0, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_7
    return-void
.end method

.method public static k(I[I)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    div-int/lit8 v1, p0, 0x20

    rem-int/lit8 p0, p0, 0x20

    array-length v2, p1

    if-ge v1, v2, :cond_1

    aget p1, p1, v1

    const/4 v1, 0x1

    shl-int p0, v1, p0

    and-int/2addr p0, p1

    if-eqz p0, :cond_1

    return v1

    :cond_1
    return v0
.end method


# virtual methods
.method public final b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 10

    const-string v0, "create instance error, class "

    instance-of v1, p2, Ljava/lang/Class;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lj/n;->c:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isInterface()Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast p2, Ljava/lang/Class;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    new-array v1, v2, [Ljava/lang/Class;

    aput-object p2, v1, v3

    invoke-static {p1, v1, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, Lj/n;->d:Lm/g;

    iget-object v4, v1, Lm/g;->c:Ljava/lang/reflect/Constructor;

    const/4 v5, 0x0

    if-nez v4, :cond_1

    iget-object v6, v1, Lm/g;->e:Ljava/lang/reflect/Method;

    if-nez v6, :cond_1

    return-object v5

    :cond_1
    iget-object v6, v1, Lm/g;->e:Ljava/lang/reflect/Method;

    if-eqz v6, :cond_2

    iget v7, v1, Lm/g;->g:I

    if-lez v7, :cond_2

    return-object v5

    :cond_2
    :try_start_0
    iget v1, v1, Lm/g;->g:I

    if-nez v1, :cond_4

    if-eqz v4, :cond_3

    new-array p2, v3, [Ljava/lang/Object;

    invoke-virtual {v4, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_0

    :cond_3
    new-array p2, v3, [Ljava/lang/Object;

    invoke-virtual {v6, v5, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto/16 :goto_0

    :cond_4
    iget-object v1, p1, Li/a;->h:Li/h;
    :try_end_0
    .catch Lf/d; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const-string v6, "can\'t create non-static inner class instance."

    if-eqz v1, :cond_d

    :try_start_1
    iget-object v7, v1, Li/h;->a:Ljava/lang/Object;

    if-eqz v7, :cond_d

    instance-of v7, p2, Ljava/lang/Class;

    if-eqz v7, :cond_c

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    const/16 v7, 0x24

    invoke-virtual {p2, v7}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v7

    invoke-virtual {p2, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    iget-object v7, v1, Li/h;->a:Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    iget-object v1, v1, Li/h;->b:Li/h;

    if-eqz v1, :cond_6

    iget-object v7, v1, Li/h;->a:Ljava/lang/Object;

    if-eqz v7, :cond_6

    const-string v7, "java.util.ArrayList"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    const-string v7, "java.util.List"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    const-string v7, "java.util.Collection"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    const-string v7, "java.util.Map"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    const-string v7, "java.util.HashMap"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_5
    iget-object v7, v1, Li/h;->a:Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object v5, v1, Li/h;->a:Ljava/lang/Object;

    :cond_6
    move-object v7, v5

    :cond_7
    if-eqz v7, :cond_b

    new-array p2, v2, [Ljava/lang/Object;

    aput-object v7, p2, v3

    invoke-virtual {v4, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2
    :try_end_1
    .catch Lf/d; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    if-eqz p1, :cond_a

    iget-object p1, p1, Li/a;->g:Li/c;

    sget-object v1, Li/b;->m:Li/b;

    invoke-interface {p1, v1}, Li/c;->A(Li/b;)Z

    move-result p1

    if-eqz p1, :cond_a

    iget-object p1, p0, Lj/n;->d:Lm/g;

    iget-object p1, p1, Lm/g;->h:[Lm/c;

    array-length v1, p1

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v1, :cond_a

    aget-object v5, p1, v4

    iget-object v6, v5, Lm/c;->f:Ljava/lang/Class;

    const-class v7, Ljava/lang/String;

    if-ne v6, v7, :cond_9

    :try_start_2
    const-string v6, ""

    iget-object v7, v5, Lm/c;->c:Ljava/lang/reflect/Method;

    if-eqz v7, :cond_8

    new-array v5, v2, [Ljava/lang/Object;

    aput-object v6, v5, v3

    invoke-virtual {v7, p2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_8
    iget-object v5, v5, Lm/c;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v5, p2, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    new-instance p2, Lf/d;

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lj/n;->c:Ljava/lang/Class;

    invoke-static {v1, v0}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_9
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_a
    return-object p2

    :cond_b
    :try_start_3
    new-instance p1, Lf/d;

    invoke-direct {p1, v6}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Lf/d;

    invoke-direct {p1, v6}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    new-instance p1, Lf/d;

    invoke-direct {p1, v6}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catch Lf/d; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception p1

    new-instance p2, Lf/d;

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lj/n;->c:Ljava/lang/Class;

    invoke-static {v1, v0}, Landroidx/appcompat/view/a;->g(Ljava/lang/Class;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    throw p1
.end method

.method public c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lj/n;->f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/Map;Li/i;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Li/i;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lj/n;->d:Lm/g;

    iget-object v1, v0, Lm/g;->d:Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_3

    iget-object v1, v0, Lm/g;->e:Ljava/lang/reflect/Method;

    if-nez v1, :cond_3

    iget-object v0, p0, Lj/n;->c:Ljava/lang/Class;

    invoke-virtual {p0, v3, v0}, Lj/n;->b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v4, v3}, Lj/n;->n(Ljava/lang/String;[I)Lj/k;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v5, v4, Lj/k;->a:Lm/c;

    iget-object v5, v5, Lm/c;->g:Ljava/lang/reflect/Type;

    invoke-static {v1, v5, p2}, Lm/j;->c(Ljava/lang/Object;Ljava/lang/reflect/Type;Li/i;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lj/n;->d:Lm/g;

    iget-object p1, p1, Lm/g;->f:Ljava/lang/reflect/Method;

    if-eqz p1, :cond_2

    :try_start_0
    new-array p2, v2, [Ljava/lang/Object;

    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Lf/d;

    const-string v0, "build object error"

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_2
    return-object v0

    :cond_3
    iget-object p2, v0, Lm/g;->h:[Lm/c;

    array-length v0, p2

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v0, :cond_c

    aget-object v5, p2, v4

    iget-object v6, v5, Lm/c;->b:Ljava/lang/String;

    invoke-interface {p1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_b

    iget-object v5, v5, Lm/c;->f:Ljava/lang/Class;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_2

    :cond_4
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_5

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_2

    :cond_5
    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_6

    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v6

    goto :goto_2

    :cond_6
    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_7

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v6

    goto :goto_2

    :cond_7
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_8

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    goto :goto_2

    :cond_8
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_9

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    goto :goto_2

    :cond_9
    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_a

    const/16 v5, 0x30

    invoke-static {v5}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v6

    goto :goto_2

    :cond_a
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_b

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_b
    :goto_2
    aput-object v6, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_c
    iget-object p1, p0, Lj/n;->d:Lm/g;

    iget-object p2, p1, Lm/g;->d:Ljava/lang/reflect/Constructor;

    if-eqz p2, :cond_d

    :try_start_1
    invoke-virtual {p2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    new-instance p2, Lf/d;

    const-string v0, "create instance error, "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lj/n;->d:Lm/g;

    iget-object v1, v1, Lm/g;->d:Ljava/lang/reflect/Constructor;

    invoke-virtual {v1}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_d
    iget-object p1, p1, Lm/g;->e:Ljava/lang/reflect/Method;

    if-eqz p1, :cond_e

    :try_start_2
    invoke-virtual {p1, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_3

    :catch_2
    move-exception p1

    new-instance p2, Lf/d;

    const-string v0, "create factory method error, "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lj/n;->d:Lm/g;

    iget-object v1, v1, Lm/g;->e:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_e
    :goto_3
    return-object v3
.end method

.method public e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method

.method public final f(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "I[I)TT;"
        }
    .end annotation

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v0, p2

    move-object/from16 v10, p3

    const-class v11, Ljava/lang/String;

    const-class v1, Lf/a;

    if-eq v0, v1, :cond_7c

    const-class v1, Lf/e;

    if-ne v0, v1, :cond_0

    goto/16 :goto_3a

    :cond_0
    iget-object v1, v9, Li/a;->g:Li/c;

    move-object v12, v1

    check-cast v12, Li/d;

    invoke-virtual/range {p1 .. p1}, Li/a;->f()Li/i;

    move-result-object v13

    invoke-virtual {v12}, Li/d;->q()I

    move-result v1

    const/16 v2, 0x8

    const/16 v14, 0x10

    const/4 v15, 0x0

    if-ne v1, v2, :cond_1

    invoke-virtual {v12, v14}, Li/d;->Q(I)V

    return-object v15

    :cond_1
    invoke-virtual/range {p1 .. p1}, Li/a;->l()Li/h;

    move-result-object v7

    const/16 v6, 0xd

    if-ne v1, v6, :cond_2

    :try_start_0
    invoke-virtual {v12, v14}, Li/d;->Q(I)V

    invoke-virtual/range {p0 .. p2}, Lj/n;->b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto/16 :goto_3

    :cond_2
    const/16 v2, 0xe

    const/4 v5, 0x0

    if-ne v1, v2, :cond_5

    :try_start_1
    sget-object v3, Li/b;->n:Li/b;

    iget v4, v3, Li/b;->b:I

    iget-object v6, v8, Lj/n;->d:Lm/g;

    iget v6, v6, Lm/g;->j:I

    and-int/2addr v6, v4

    if-nez v6, :cond_4

    invoke-virtual {v12, v3}, Li/d;->A(Li/b;)Z

    move-result v3

    if-nez v3, :cond_4

    and-int v3, p4, v4

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_5

    invoke-virtual/range {p0 .. p2}, Lj/n;->g(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v0

    :cond_5
    const/16 v3, 0xc

    const/4 v6, 0x4

    if-eq v1, v3, :cond_c

    if-eq v1, v14, :cond_c

    :try_start_2
    invoke-virtual {v12}, Li/d;->n()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_6

    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v15

    :cond_6
    if-ne v1, v6, :cond_9

    :try_start_3
    invoke-virtual {v12}, Li/d;->k0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {v12}, Li/d;->y()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v15

    :cond_7
    :try_start_4
    iget-object v3, v8, Lj/n;->d:Lm/g;

    iget-object v3, v3, Lm/g;->k:Lg/d;

    if-eqz v3, :cond_9

    invoke-interface {v3}, Lg/d;->seeAlso()[Ljava/lang/Class;

    move-result-object v3

    array-length v4, v3

    :goto_2
    if-ge v5, v4, :cond_9

    aget-object v6, v3, v5

    const-class v11, Ljava/lang/Enum;

    invoke-virtual {v11, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v11
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v11, :cond_8

    :try_start_5
    invoke-static {v6, v0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/IllegalArgumentException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v0

    :catch_0
    :cond_8
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    if-ne v1, v2, :cond_a

    :try_start_6
    invoke-virtual {v12}, Li/d;->z()C

    move-result v0

    const/16 v1, 0x5d

    if-ne v0, v1, :cond_a

    invoke-virtual {v12}, Li/d;->next()C

    invoke-virtual {v12}, Li/d;->y()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v15

    :cond_a
    :try_start_7
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "syntax error, expect {, actual "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v12}, Li/d;->Y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, ", pos "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v12}, Li/d;->a()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    instance-of v1, v10, Ljava/lang/String;

    if-eqz v1, :cond_b

    const-string v1, ", fieldName "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    :cond_b
    const-string v1, ", fastjson-version "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "1.2.40"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    new-instance v1, Lf/d;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :cond_c
    :try_start_8
    iget v1, v9, Li/a;->l:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    const/4 v2, 0x2

    if-ne v1, v2, :cond_d

    :try_start_9
    iput v5, v9, Li/a;->l:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_4

    :goto_3
    move-object v1, v15

    goto/16 :goto_1e

    :cond_d
    :goto_4
    :try_start_a
    iget-object v1, v8, Lj/n;->d:Lm/g;

    iget-object v4, v1, Lm/g;->m:Ljava/lang/String;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    move-object v1, v15

    move-object v2, v1

    move-object v5, v2

    move-object/from16 v19, v5

    const/4 v3, 0x0

    :goto_5
    :try_start_b
    iget-object v15, v8, Lj/n;->b:[Lj/k;

    array-length v6, v15
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    if-ge v3, v6, :cond_e

    :try_start_c
    aget-object v6, v15, v3

    iget-object v15, v6, Lj/k;->a:Lm/c;

    iget-object v14, v15, Lm/c;->f:Ljava/lang/Class;

    invoke-virtual {v15}, Lm/c;->c()Lg/b;

    move-result-object v21

    goto :goto_6

    :catchall_1
    move-exception v0

    move-object v15, v5

    goto/16 :goto_1d

    :cond_e
    const/4 v6, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v21, 0x0

    :goto_6
    if-eqz v6, :cond_30

    move/from16 v22, v3

    iget-object v3, v15, Lm/c;->p:[C

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v23, v1

    const/4 v1, -0x2

    if-eq v14, v0, :cond_2d

    const-class v0, Ljava/lang/Integer;

    if-ne v14, v0, :cond_f

    goto/16 :goto_b

    :cond_f
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v14, v0, :cond_2b

    const-class v0, Ljava/lang/Long;

    if-ne v14, v0, :cond_10

    goto/16 :goto_a

    :cond_10
    if-ne v14, v11, :cond_12

    invoke-virtual {v12, v3}, Li/d;->J0([C)Ljava/lang/String;

    move-result-object v0

    iget v3, v12, Li/d;->n:I

    if-lez v3, :cond_11

    goto/16 :goto_c

    :cond_11
    if-ne v3, v1, :cond_32

    goto/16 :goto_d

    :cond_12
    const-class v0, Ljava/util/Date;

    if-ne v14, v0, :cond_14

    iget-object v0, v15, Lm/c;->t:Ljava/lang/String;

    if-nez v0, :cond_14

    invoke-virtual {v12, v3}, Li/d;->A0([C)Ljava/util/Date;

    move-result-object v0

    iget v3, v12, Li/d;->n:I

    if-lez v3, :cond_13

    goto/16 :goto_c

    :cond_13
    if-ne v3, v1, :cond_32

    goto/16 :goto_d

    :cond_14
    const-class v0, Ljava/math/BigDecimal;

    if-ne v14, v0, :cond_16

    invoke-virtual {v12, v3}, Li/d;->B0([C)Ljava/math/BigDecimal;

    move-result-object v0

    iget v3, v12, Li/d;->n:I

    if-lez v3, :cond_15

    goto/16 :goto_c

    :cond_15
    if-ne v3, v1, :cond_32

    goto/16 :goto_d

    :cond_16
    const-class v0, Ljava/math/BigInteger;

    if-ne v14, v0, :cond_18

    invoke-virtual {v12, v3}, Li/d;->y0([C)Ljava/math/BigInteger;

    move-result-object v0

    iget v3, v12, Li/d;->n:I

    if-lez v3, :cond_17

    goto/16 :goto_c

    :cond_17
    if-ne v3, v1, :cond_32

    goto/16 :goto_d

    :cond_18
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v14, v0, :cond_29

    const-class v0, Ljava/lang/Boolean;

    if-ne v14, v0, :cond_19

    goto/16 :goto_9

    :cond_19
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v14, v0, :cond_27

    const-class v0, Ljava/lang/Float;

    if-ne v14, v0, :cond_1a

    goto/16 :goto_8

    :cond_1a
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v14, v0, :cond_25

    const-class v0, Ljava/lang/Double;

    if-ne v14, v0, :cond_1b

    goto/16 :goto_7

    :cond_1b
    invoke-virtual {v14}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_1e

    invoke-virtual/range {p1 .. p1}, Li/a;->f()Li/i;

    move-result-object v0

    invoke-virtual {v0, v14}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v0

    instance-of v0, v0, Lj/g;

    if-eqz v0, :cond_1e

    if-eqz v21, :cond_1c

    invoke-interface/range {v21 .. v21}, Lg/b;->deserializeUsing()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Ljava/lang/Void;

    if-ne v0, v1, :cond_1e

    :cond_1c
    instance-of v0, v6, Lj/f;

    if-eqz v0, :cond_31

    move-object v0, v6

    check-cast v0, Lj/f;

    iget-object v0, v0, Lj/f;->c:Lj/s;

    invoke-virtual {v8, v12, v3, v0}, Lj/n;->m(Li/d;[CLj/s;)Ljava/lang/Enum;

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_1d

    goto/16 :goto_c

    :cond_1d
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto/16 :goto_d

    :cond_1e
    const-class v0, [I

    if-ne v14, v0, :cond_20

    invoke-virtual {v12, v3}, Li/d;->H0([C)[I

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_1f

    goto/16 :goto_c

    :cond_1f
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto/16 :goto_d

    :cond_20
    const-class v0, [F

    if-ne v14, v0, :cond_22

    invoke-virtual {v12, v3}, Li/d;->E0([C)[F

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_21

    goto/16 :goto_c

    :cond_21
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto/16 :goto_d

    :cond_22
    const-class v0, [[F

    if-ne v14, v0, :cond_24

    invoke-virtual {v12, v3}, Li/d;->F0([C)[[F

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_23

    goto :goto_c

    :cond_23
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto/16 :goto_d

    :cond_24
    invoke-virtual {v12, v3}, Li/d;->u0([C)Z

    move-result v0

    if-eqz v0, :cond_2f

    const/4 v0, 0x0

    const/4 v1, 0x1

    goto/16 :goto_e

    :cond_25
    :goto_7
    invoke-virtual {v12, v3}, Li/d;->C0([C)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_26

    goto :goto_c

    :cond_26
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto :goto_d

    :cond_27
    :goto_8
    invoke-virtual {v12, v3}, Li/d;->D0([C)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_28

    goto :goto_c

    :cond_28
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto :goto_d

    :cond_29
    :goto_9
    invoke-virtual {v12, v3}, Li/d;->z0([C)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_2a

    goto :goto_c

    :cond_2a
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto :goto_d

    :cond_2b
    :goto_a
    invoke-virtual {v12, v3}, Li/d;->I0([C)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_2c

    goto :goto_c

    :cond_2c
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    goto :goto_d

    :cond_2d
    :goto_b
    invoke-virtual {v12, v3}, Li/d;->G0([C)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget v1, v12, Li/d;->n:I

    if-lez v1, :cond_2e

    :goto_c
    const/4 v1, 0x1

    const/4 v3, 0x1

    goto :goto_f

    :cond_2e
    const/4 v3, -0x2

    if-ne v1, v3, :cond_32

    :cond_2f
    :goto_d
    move-object/from16 v21, v11

    goto :goto_10

    :cond_30
    move-object/from16 v23, v1

    move/from16 v22, v3

    :cond_31
    const/4 v0, 0x0

    :cond_32
    const/4 v1, 0x0

    :goto_e
    const/4 v3, 0x0

    :goto_f
    if-nez v1, :cond_4b

    move-object/from16 v21, v11

    iget-object v11, v9, Li/a;->c:Li/j;

    invoke-virtual {v12, v11}, Li/d;->N(Li/j;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_34

    move-object/from16 v24, v14

    invoke-virtual {v12}, Li/d;->q()I

    move-result v14

    move-object/from16 v25, v0

    const/16 v0, 0xd

    if-ne v14, v0, :cond_33

    const/16 v0, 0x10

    invoke-virtual {v12, v0}, Li/d;->Q(I)V

    goto/16 :goto_1a

    :cond_33
    const/16 v0, 0x10

    if-ne v14, v0, :cond_35

    sget-object v0, Li/b;->h:Li/b;

    invoke-virtual {v12, v0}, Li/d;->A(Li/b;)Z

    move-result v0

    if-eqz v0, :cond_35

    :goto_10
    const/16 v14, 0xd

    goto/16 :goto_1b

    :cond_34
    move-object/from16 v25, v0

    move-object/from16 v24, v14

    :cond_35
    const-string v0, "$ref"

    if-ne v0, v11, :cond_40

    if-eqz v7, :cond_40

    invoke-virtual {v12}, Li/d;->H()V

    invoke-virtual {v12}, Li/d;->q()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3f

    invoke-virtual {v12}, Li/d;->k0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_36

    iget-object v2, v7, Li/h;->a:Ljava/lang/Object;

    :goto_11
    const/16 v0, 0xd

    goto :goto_17

    :cond_36
    const-string v1, ".."

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_38

    iget-object v1, v7, Li/h;->b:Li/h;

    iget-object v3, v1, Li/h;->a:Ljava/lang/Object;

    if-eqz v3, :cond_37

    :goto_12
    move-object v2, v3

    goto :goto_11

    :cond_37
    new-instance v3, Li/a$a;

    invoke-direct {v3, v1, v0}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    :goto_13
    invoke-virtual {v9, v3}, Li/a;->b(Li/a$a;)V

    :goto_14
    const/4 v0, 0x1

    goto :goto_16

    :cond_38
    const-string v1, "$"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3b

    move-object v1, v7

    :goto_15
    iget-object v3, v1, Li/h;->b:Li/h;

    if-eqz v3, :cond_39

    move-object v1, v3

    goto :goto_15

    :cond_39
    iget-object v3, v1, Li/h;->a:Ljava/lang/Object;

    if-eqz v3, :cond_3a

    goto :goto_12

    :cond_3a
    new-instance v3, Li/a$a;

    invoke-direct {v3, v1, v0}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    goto :goto_13

    :cond_3b
    invoke-virtual {v9, v0}, Li/a;->K(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_3c

    move-object v2, v1

    goto :goto_11

    :cond_3c
    new-instance v1, Li/a$a;

    invoke-direct {v1, v7, v0}, Li/a$a;-><init>(Li/h;Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Li/a;->b(Li/a$a;)V

    goto :goto_14

    :goto_16
    iput v0, v9, Li/a;->l:I

    goto :goto_11

    :goto_17
    invoke-virtual {v12, v0}, Li/d;->Q(I)V

    invoke-virtual {v12}, Li/d;->q()I

    move-result v1

    if-ne v1, v0, :cond_3e

    const/16 v0, 0x10

    invoke-virtual {v12, v0}, Li/d;->Q(I)V

    invoke-virtual {v9, v7, v2, v10}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    if-eqz v5, :cond_3d

    iput-object v2, v5, Li/h;->a:Ljava/lang/Object;

    :cond_3d
    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v2

    :cond_3e
    :try_start_d
    new-instance v0, Lf/d;

    const-string v1, "illegal ref"

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3f
    new-instance v1, Lf/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "illegal ref, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Li/g;->w(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_40
    if-eqz v4, :cond_41

    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_42

    :cond_41
    sget-object v0, Lf/a;->d:Ljava/lang/String;

    if-ne v0, v11, :cond_4a

    :cond_42
    invoke-virtual {v12}, Li/d;->H()V

    invoke-virtual {v12}, Li/d;->q()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_49

    invoke-virtual {v12}, Li/d;->k0()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {v12, v1}, Li/d;->Q(I)V

    iget-object v1, v8, Lj/n;->d:Lm/g;

    iget-object v1, v1, Lm/g;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_47

    sget-object v1, Li/b;->s:Li/b;

    invoke-virtual {v9, v1}, Li/a;->r(Li/b;)Z

    move-result v1

    if-eqz v1, :cond_43

    goto :goto_19

    :cond_43
    iget-object v1, v8, Lj/n;->d:Lm/g;

    invoke-virtual {v8, v13, v1, v0}, Lj/n;->j(Li/i;Lm/g;Ljava/lang/String;)Lj/n;

    move-result-object v1

    if-nez v1, :cond_44

    invoke-static/range {p2 .. p2}, Lm/j;->w(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Li/i;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Li/a;->f()Li/i;

    move-result-object v1

    invoke-virtual {v1, v15}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v1

    goto :goto_18

    :cond_44
    const/4 v15, 0x0

    :goto_18
    invoke-interface {v1, v9, v15, v10}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v6, v1, Lj/n;

    if-eqz v6, :cond_45

    check-cast v1, Lj/n;

    if-eqz v4, :cond_45

    invoke-virtual {v1, v4}, Lj/n;->h(Ljava/lang/String;)Lj/k;

    move-result-object v1

    invoke-virtual {v1, v3, v0}, Lj/k;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :cond_45
    if-eqz v5, :cond_46

    iput-object v2, v5, Li/h;->a:Ljava/lang/Object;

    :cond_46
    invoke-virtual {v9, v7}, Li/a;->P(Li/h;)V

    return-object v3

    :cond_47
    :goto_19
    :try_start_e
    invoke-virtual {v12}, Li/d;->q()I

    move-result v0

    const/16 v14, 0xd

    if-ne v0, v14, :cond_48

    invoke-virtual {v12}, Li/d;->y()V

    :goto_1a
    move-object/from16 v26, v7

    move-object/from16 v0, v19

    const/16 p4, 0x0

    goto/16 :goto_27

    :cond_48
    :goto_1b
    move-object v14, v2

    move-object v11, v4

    move-object v3, v7

    move-object/from16 v7, v21

    move/from16 v16, v22

    move-object/from16 v0, v23

    const/4 v1, 0x0

    const/16 v2, 0x10

    const/4 v4, 0x0

    const/4 v6, 0x1

    const/16 v15, 0xd

    const/16 v17, 0x4

    goto/16 :goto_36

    :cond_49
    new-instance v0, Lf/d;

    const-string v1, "syntax error"

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4a
    const/16 v14, 0xd

    goto :goto_1c

    :cond_4b
    move-object/from16 v25, v0

    move-object/from16 v21, v11

    move-object/from16 v24, v14

    const/16 v14, 0xd

    const/4 v11, 0x0

    :goto_1c
    if-nez v2, :cond_4d

    if-nez v19, :cond_4d

    invoke-virtual/range {p0 .. p2}, Lj/n;->b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4c

    new-instance v0, Ljava/util/HashMap;

    iget-object v14, v8, Lj/n;->a:[Lj/k;

    array-length v14, v14

    invoke-direct {v0, v14}, Ljava/util/HashMap;-><init>(I)V

    move-object/from16 v19, v0

    :cond_4c
    invoke-virtual {v9, v7, v2, v10}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    move-result-object v5

    if-nez v23, :cond_4d

    iget-object v0, v8, Lj/n;->a:[Lj/k;

    array-length v0, v0

    div-int/lit8 v0, v0, 0x20

    const/4 v14, 0x1

    add-int/2addr v0, v14

    new-array v0, v0, [I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_1

    move-object v14, v2

    goto :goto_1f

    :goto_1d
    move-object v1, v15

    move-object v15, v2

    :goto_1e
    move-object v3, v7

    move-object v14, v15

    move-object v15, v1

    goto/16 :goto_39

    :cond_4d
    move-object v14, v2

    move-object/from16 v0, v23

    :goto_1f
    move-object/from16 v27, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v27

    if-eqz v1, :cond_54

    if-nez v3, :cond_4e

    move-object/from16 v3, p2

    :try_start_f
    invoke-virtual {v6, v9, v14, v3, v5}, Lj/k;->b(Li/a;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V

    const/4 v6, 0x4

    const/4 v15, 0x1

    goto :goto_22

    :cond_4e
    move-object/from16 v3, p2

    if-nez v14, :cond_4f

    iget-object v1, v15, Lm/c;->b:Ljava/lang/String;

    move-object/from16 v2, v25

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_20

    :catchall_2
    move-exception v0

    goto :goto_23

    :cond_4f
    move-object/from16 v2, v25

    if-nez v2, :cond_50

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move-object/from16 v11, v24

    if-eq v11, v1, :cond_51

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v11, v1, :cond_51

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v11, v1, :cond_51

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v11, v1, :cond_51

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v11, v1, :cond_51

    :cond_50
    invoke-virtual {v6, v14, v2}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_51
    :goto_20
    if-eqz v0, :cond_52

    div-int/lit8 v1, v22, 0x20

    rem-int/lit8 v2, v22, 0x20

    aget v6, v0, v1

    const/4 v15, 0x1

    shr-int v2, v15, v2

    or-int/2addr v2, v6

    aput v2, v0, v1

    goto :goto_21

    :cond_52
    const/4 v15, 0x1

    :goto_21
    iget v1, v12, Li/d;->n:I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    const/4 v6, 0x4

    if-ne v1, v6, :cond_53

    move-object/from16 v18, v5

    move-object/from16 v26, v7

    const/16 p4, 0x0

    goto/16 :goto_26

    :cond_53
    :goto_22
    move-object v11, v4

    move-object/from16 v18, v5

    move-object/from16 v26, v7

    move/from16 v16, v22

    const/16 p4, 0x0

    const/16 v15, 0xd

    const/16 v17, 0x4

    goto :goto_24

    :goto_23
    move-object v3, v7

    goto/16 :goto_37

    :cond_54
    move-object/from16 v3, p2

    const/4 v6, 0x4

    const/4 v15, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v16, v22

    move-object v3, v11

    move-object v11, v4

    move-object v4, v14

    move-object/from16 v18, v5

    const/16 p4, 0x0

    move-object/from16 v5, p2

    const/16 v15, 0xd

    const/16 v17, 0x4

    move-object/from16 v6, v18

    move-object/from16 v26, v7

    move-object v7, v0

    :try_start_10
    invoke-virtual/range {v1 .. v7}, Lj/n;->l(Li/a;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;[I)Z

    move-result v1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    if-nez v1, :cond_56

    :try_start_11
    invoke-virtual {v12}, Li/d;->q()I

    move-result v1

    if-ne v1, v15, :cond_55

    invoke-virtual {v12}, Li/d;->y()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    goto :goto_26

    :cond_55
    const/16 v2, 0x10

    goto :goto_25

    :catchall_3
    move-exception v0

    move-object/from16 v15, v19

    move-object/from16 v3, v26

    goto/16 :goto_39

    :cond_56
    :try_start_12
    invoke-virtual {v12}, Li/d;->q()I

    move-result v1

    const/16 v2, 0x11

    if-eq v1, v2, :cond_7a

    :goto_24
    invoke-virtual {v12}, Li/d;->q()I

    move-result v1

    const/16 v2, 0x10

    if-ne v1, v2, :cond_57

    :goto_25
    move-object/from16 v7, v21

    move-object/from16 v3, v26

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    goto/16 :goto_35

    :cond_57
    invoke-virtual {v12}, Li/d;->q()I

    move-result v1

    if-ne v1, v15, :cond_78

    invoke-virtual {v12, v2}, Li/d;->Q(I)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_8

    :goto_26
    move-object v2, v14

    move-object/from16 v0, v18

    move-object/from16 v5, v19

    :goto_27
    if-nez v2, :cond_74

    if-nez v0, :cond_5a

    :try_start_13
    invoke-virtual/range {p0 .. p2}, Lj/n;->b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    move-object/from16 v3, v26

    if-nez v5, :cond_58

    :try_start_14
    invoke-virtual {v9, v3, v1, v10}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    move-result-object v5
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    goto :goto_28

    :catchall_4
    move-exception v0

    goto/16 :goto_38

    :cond_58
    :goto_28
    if-eqz v5, :cond_59

    iput-object v1, v5, Li/h;->a:Ljava/lang/Object;

    :cond_59
    invoke-virtual {v9, v3}, Li/a;->P(Li/h;)V

    return-object v1

    :catchall_5
    move-exception v0

    move-object/from16 v3, v26

    goto/16 :goto_34

    :cond_5a
    move-object/from16 v3, v26

    :try_start_15
    iget-object v1, v8, Lj/n;->d:Lm/g;

    iget-object v4, v1, Lm/g;->p:[Ljava/lang/String;
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    const-string v6, ""

    const-wide/16 v12, 0x0

    if-eqz v4, :cond_64

    :try_start_16
    array-length v1, v4

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v14, 0x0

    :goto_29
    array-length v15, v4

    if-ge v14, v15, :cond_6f

    aget-object v15, v4, v14

    invoke-interface {v0, v15}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    if-nez v15, :cond_62

    iget-object v10, v8, Lj/n;->d:Lm/g;

    iget-object v11, v10, Lm/g;->o:[Ljava/lang/reflect/Type;

    aget-object v11, v11, v14

    iget-object v10, v10, Lm/g;->h:[Lm/c;

    aget-object v10, v10, v14

    sget-object v7, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v11, v7, :cond_5b

    invoke-static/range {p4 .. p4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v7

    :goto_2a
    move-object v15, v7

    goto :goto_2b

    :cond_5b
    sget-object v7, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v11, v7, :cond_5c

    invoke-static/range {p4 .. p4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v7

    goto :goto_2a

    :cond_5c
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v11, v7, :cond_5d

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_2a

    :cond_5d
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v11, v7, :cond_5e

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    goto :goto_2a

    :cond_5e
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v11, v7, :cond_5f

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    move-object v15, v10

    goto :goto_2b

    :cond_5f
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v11, v7, :cond_60

    const-wide/16 v17, 0x0

    invoke-static/range {v17 .. v18}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    goto :goto_2a

    :cond_60
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v11, v7, :cond_61

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_2a

    :cond_61
    move-object/from16 v7, v21

    if-ne v11, v7, :cond_63

    iget v10, v10, Lm/c;->k:I

    sget-object v11, Li/b;->m:Li/b;

    iget v11, v11, Li/b;->b:I

    and-int/2addr v10, v11

    if-eqz v10, :cond_63

    move-object v15, v6

    goto :goto_2c

    :cond_62
    :goto_2b
    move-object/from16 v7, v21

    :cond_63
    :goto_2c
    aput-object v15, v1, v14

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v21, v7

    goto :goto_29

    :cond_64
    move-object/from16 v7, v21

    iget-object v1, v1, Lm/g;->h:[Lm/c;

    array-length v10, v1

    new-array v11, v10, [Ljava/lang/Object;

    const/4 v14, 0x0

    :goto_2d
    if-ge v14, v10, :cond_6e

    aget-object v15, v1, v14

    iget-object v12, v15, Lm/c;->b:Ljava/lang/String;

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_6c

    iget-object v13, v15, Lm/c;->g:Ljava/lang/reflect/Type;

    move-object/from16 v19, v1

    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v13, v1, :cond_65

    invoke-static/range {p4 .. p4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v12

    goto :goto_2e

    :cond_65
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v13, v1, :cond_66

    invoke-static/range {p4 .. p4}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v12

    goto :goto_2e

    :cond_66
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v13, v1, :cond_67

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    goto :goto_2e

    :cond_67
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-wide/16 v17, 0x0

    if-ne v13, v1, :cond_68

    invoke-static/range {v17 .. v18}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object v12, v1

    goto :goto_2f

    :cond_68
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v13, v1, :cond_69

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    goto :goto_2f

    :cond_69
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-wide/16 v20, 0x0

    if-ne v13, v1, :cond_6a

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    goto :goto_30

    :cond_6a
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v13, v1, :cond_6b

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_30

    :cond_6b
    if-ne v13, v7, :cond_6d

    iget v1, v15, Lm/c;->k:I

    sget-object v13, Li/b;->m:Li/b;

    iget v13, v13, Li/b;->b:I

    and-int/2addr v1, v13

    if-eqz v1, :cond_6d

    move-object v12, v6

    goto :goto_30

    :cond_6c
    move-object/from16 v19, v1

    :goto_2e
    const-wide/16 v17, 0x0

    :goto_2f
    const-wide/16 v20, 0x0

    :cond_6d
    :goto_30
    aput-object v12, v11, v14

    add-int/lit8 v14, v14, 0x1

    move-wide/from16 v12, v17

    move-object/from16 v1, v19

    goto :goto_2d

    :cond_6e
    move-object v1, v11

    :cond_6f
    iget-object v6, v8, Lj/n;->d:Lm/g;

    iget-object v7, v6, Lm/g;->d:Ljava/lang/reflect/Constructor;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_6

    if-eqz v7, :cond_72

    :try_start_17
    invoke-virtual {v7, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_1
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    if-eqz v4, :cond_71

    :try_start_18
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_70
    :goto_31
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_71

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v8, v4}, Lj/n;->h(Ljava/lang/String;)Lj/k;

    move-result-object v4

    if-eqz v4, :cond_70

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v4, v1, v2}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_4

    goto :goto_31

    :cond_71
    move-object v2, v1

    goto :goto_32

    :catch_1
    move-exception v0

    move-object v1, v0

    :try_start_19
    new-instance v0, Lf/d;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "create instance error, "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v8, Lj/n;->d:Lm/g;

    iget-object v4, v4, Lm/g;->d:Ljava/lang/reflect/Constructor;

    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4, v1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_72
    iget-object v0, v6, Lm/g;->e:Ljava/lang/reflect/Method;
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_6

    if-eqz v0, :cond_73

    const/4 v4, 0x0

    :try_start_1a
    invoke-virtual {v0, v4, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_2
    .catchall {:try_start_1a .. :try_end_1a} :catchall_6

    move-object v2, v0

    goto :goto_32

    :catch_2
    move-exception v0

    move-object v1, v0

    :try_start_1b
    new-instance v0, Lf/d;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "create factory method error, "

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v8, Lj/n;->d:Lm/g;

    iget-object v6, v6, Lm/g;->e:Ljava/lang/reflect/Method;

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4, v1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_73
    :goto_32
    iput-object v2, v5, Li/h;->a:Ljava/lang/Object;

    goto :goto_33

    :cond_74
    move-object/from16 v3, v26

    :goto_33
    iget-object v0, v8, Lj/n;->d:Lm/g;

    iget-object v0, v0, Lm/g;->f:Ljava/lang/reflect/Method;
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_6

    if-nez v0, :cond_76

    if-eqz v5, :cond_75

    iput-object v2, v5, Li/h;->a:Ljava/lang/Object;

    :cond_75
    invoke-virtual {v9, v3}, Li/a;->P(Li/h;)V

    return-object v2

    :cond_76
    const/4 v1, 0x0

    :try_start_1c
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_3
    .catchall {:try_start_1c .. :try_end_1c} :catchall_6

    if-eqz v5, :cond_77

    iput-object v2, v5, Li/h;->a:Ljava/lang/Object;

    :cond_77
    invoke-virtual {v9, v3}, Li/a;->P(Li/h;)V

    return-object v0

    :catch_3
    move-exception v0

    :try_start_1d
    new-instance v1, Lf/d;

    const-string v4, "build object error"

    invoke-direct {v1, v4, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_6

    :catchall_6
    move-exception v0

    :goto_34
    move-object v15, v2

    move-object v14, v15

    move-object v15, v5

    goto/16 :goto_39

    :cond_78
    move-object/from16 v7, v21

    move-object/from16 v3, v26

    const/4 v1, 0x0

    const/4 v4, 0x0

    :try_start_1e
    invoke-virtual {v12}, Li/d;->q()I

    move-result v5

    const/16 v6, 0x12

    if-eq v5, v6, :cond_79

    invoke-virtual {v12}, Li/d;->q()I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_79

    :goto_35
    move-object/from16 v5, v19

    move-object/from16 v19, v18

    :goto_36
    add-int/lit8 v16, v16, 0x1

    move-object v1, v0

    move-object v4, v11

    move-object v2, v14

    const/4 v6, 0x4

    const/16 v14, 0x10

    move-object/from16 v0, p2

    move-object v11, v7

    move-object v7, v3

    move/from16 v3, v16

    goto/16 :goto_5

    :cond_79
    new-instance v0, Lf/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syntax error, unexpect token "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Li/d;->q()I

    move-result v2

    invoke-static {v2}, Li/g;->w(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7a
    move-object/from16 v3, v26

    new-instance v0, Lf/d;

    const-string v1, "syntax error, unexpect token \':\'"

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_7

    :catchall_7
    move-exception v0

    goto :goto_37

    :catchall_8
    move-exception v0

    move-object/from16 v3, v26

    :goto_37
    move-object/from16 v15, v19

    goto :goto_39

    :catchall_9
    move-exception v0

    move-object v3, v7

    move-object v1, v2

    :goto_38
    move-object v15, v5

    move-object v14, v1

    goto :goto_39

    :catchall_a
    move-exception v0

    move-object v3, v7

    move-object v4, v15

    move-object v14, v4

    move-object v15, v14

    :goto_39
    if-eqz v15, :cond_7b

    iput-object v14, v15, Li/h;->a:Ljava/lang/Object;

    :cond_7b
    invoke-virtual {v9, v3}, Li/a;->P(Li/h;)V

    throw v0

    :cond_7c
    :goto_3a
    invoke-virtual/range {p1 .. p1}, Li/a;->s()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final g(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Li/a;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v1

    const/16 v2, 0xe

    if-ne v1, v2, :cond_11

    invoke-virtual {p0, p1, p2}, Lj/n;->b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x0

    iget-object v3, p0, Lj/n;->b:[Lj/k;

    array-length v3, v3

    :goto_0
    const/16 v4, 0x10

    if-ge v1, v3, :cond_10

    add-int/lit8 v5, v3, -0x1

    const/16 v6, 0x5d

    if-ne v1, v5, :cond_0

    const/16 v5, 0x5d

    goto :goto_1

    :cond_0
    const/16 v5, 0x2c

    :goto_1
    iget-object v7, p0, Lj/n;->b:[Lj/k;

    aget-object v7, v7, v1

    iget-object v8, v7, Lj/k;->a:Lm/c;

    iget-object v8, v8, Lm/c;->f:Ljava/lang/Class;

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_1

    invoke-interface {v0, v5}, Li/c;->V(C)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v7, p2, v4}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    const-class v9, Ljava/lang/String;

    if-ne v8, v9, :cond_2

    invoke-interface {v0, v5}, Li/c;->r(C)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7, p2, v4}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_3

    invoke-interface {v0, v5}, Li/c;->P(C)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v7, p2, v4}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v8}, Ljava/lang/Class;->isEnum()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v0}, Li/c;->z()C

    move-result v4

    const/16 v6, 0x22

    if-eq v4, v6, :cond_6

    const/16 v6, 0x6e

    if-ne v4, v6, :cond_4

    goto :goto_2

    :cond_4
    const/16 v6, 0x30

    if-lt v4, v6, :cond_5

    const/16 v6, 0x39

    if-gt v4, v6, :cond_5

    invoke-interface {v0, v5}, Li/c;->V(C)I

    move-result v4

    move-object v5, v7

    check-cast v5, Lj/f;

    iget-object v6, p1, Li/a;->d:Li/i;

    invoke-virtual {v5, v6}, Lj/f;->e(Li/i;)Lj/s;

    move-result-object v5

    check-cast v5, Lj/g;

    iget-object v5, v5, Lj/g;->c:[Ljava/lang/Enum;

    aget-object v4, v5, v4

    goto :goto_3

    :cond_5
    new-instance p1, Lf/d;

    const-string p2, "illegal enum. "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-interface {v0}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    iget-object v4, p1, Li/a;->c:Li/j;

    invoke-interface {v0, v8, v4, v5}, Li/c;->R(Ljava/lang/Class;Li/j;C)Ljava/lang/Enum;

    move-result-object v4

    goto :goto_3

    :cond_7
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_8

    invoke-interface {v0, v5}, Li/c;->s(C)Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v7, p2, v4}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_8
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_9

    invoke-interface {v0, v5}, Li/c;->x(C)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    goto :goto_3

    :cond_9
    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_a

    invoke-interface {v0, v5}, Li/c;->w(C)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    goto :goto_3

    :cond_a
    const-class v9, Ljava/util/Date;

    if-ne v8, v9, :cond_b

    invoke-interface {v0}, Li/c;->z()C

    move-result v9

    const/16 v10, 0x31

    if-ne v9, v10, :cond_b

    invoke-interface {v0, v5}, Li/c;->P(C)J

    move-result-wide v4

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v4, v5}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v7, p2, v6}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_b
    const-class v9, Ljava/math/BigDecimal;

    if-ne v8, v9, :cond_c

    invoke-interface {v0}, Li/c;->p()Ljava/math/BigDecimal;

    move-result-object v4

    :goto_3
    invoke-virtual {v7, p2, v4}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_c
    invoke-interface {v0, v2}, Li/c;->Q(I)V

    iget-object v8, v7, Lj/k;->a:Lm/c;

    iget-object v9, v8, Lm/c;->g:Ljava/lang/reflect/Type;

    iget-object v8, v8, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {p1, v9, v8}, Li/a;->A(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, p2, v8}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0}, Li/c;->q()I

    move-result v7

    const/16 v8, 0xf

    if-ne v7, v8, :cond_d

    goto :goto_5

    :cond_d
    if-ne v5, v6, :cond_e

    const/16 v4, 0xf

    :cond_e
    invoke-interface {v0}, Li/c;->q()I

    move-result v5

    if-ne v5, v4, :cond_f

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_f
    new-instance p1, Lf/d;

    const-string p2, "syntax error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_10
    :goto_5
    invoke-interface {v0, v4}, Li/c;->Q(I)V

    return-object p2

    :cond_11
    new-instance p1, Lf/d;

    const-string p2, "error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h(Ljava/lang/String;)Lj/k;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljava/lang/String;[I)Lj/k;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    iget-object v2, p0, Lj/n;->b:[Lj/k;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-gt v1, v2, :cond_4

    add-int v3, v1, v2

    ushr-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lj/n;->b:[Lj/k;

    aget-object v4, v4, v3

    iget-object v4, v4, Lj/k;->a:Lm/c;

    iget-object v4, v4, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_1

    add-int/lit8 v1, v3, 0x1

    goto :goto_0

    :cond_1
    if-lez v4, :cond_2

    add-int/lit8 v2, v3, -0x1

    goto :goto_0

    :cond_2
    invoke-static {v3, p2}, Lj/n;->k(I[I)Z

    move-result p1

    if-eqz p1, :cond_3

    return-object v0

    :cond_3
    iget-object p1, p0, Lj/n;->b:[Lj/k;

    aget-object p1, p1, v3

    return-object p1

    :cond_4
    iget-object p2, p0, Lj/n;->f:Ljava/util/HashMap;

    if-eqz p2, :cond_5

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj/k;

    return-object p1

    :cond_5
    return-object v0
.end method

.method public final j(Li/i;Lm/g;Ljava/lang/String;)Lj/n;
    .locals 6

    iget-object p2, p2, Lm/g;->k:Lg/d;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p2}, Lg/d;->seeAlso()[Ljava/lang/Class;

    move-result-object p2

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p2, v2

    invoke-virtual {p1, v3}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object v3

    instance-of v4, v3, Lj/n;

    if-eqz v4, :cond_2

    check-cast v3, Lj/n;

    iget-object v4, v3, Lj/n;->d:Lm/g;

    iget-object v5, v4, Lm/g;->l:Ljava/lang/String;

    invoke-virtual {v5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return-object v3

    :cond_1
    invoke-virtual {p0, p1, v4, p3}, Lj/n;->j(Li/i;Lm/g;Ljava/lang/String;)Lj/n;

    move-result-object v3

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final l(Li/a;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;[I)Z
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li/a;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;[I)Z"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v11, p2

    move-object/from16 v12, p3

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    iget-object v10, v0, Li/a;->g:Li/c;

    sget-object v2, Li/b;->t:Li/b;

    iget v2, v2, Li/b;->b:I

    invoke-interface {v10, v2}, Li/c;->isEnabled(I)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    iget-object v3, v1, Lj/n;->d:Lm/g;

    iget v3, v3, Lm/g;->j:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v11, v15}, Lj/n;->n(Ljava/lang/String;[I)Lj/k;

    move-result-object v2

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v1, v11, v4}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object v2

    :goto_1
    sget-object v3, Li/b;->r:Li/b;

    iget v3, v3, Li/b;->b:I

    const/16 v16, 0x0

    const/4 v5, 0x1

    if-nez v2, :cond_b

    invoke-interface {v10, v3}, Li/c;->isEnabled(I)Z

    move-result v6

    if-nez v6, :cond_2

    iget-object v6, v1, Lj/n;->d:Lm/g;

    iget v6, v6, Lm/g;->j:I

    and-int/2addr v3, v6

    if-eqz v3, :cond_b

    :cond_2
    iget-object v3, v1, Lj/n;->e:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez v3, :cond_8

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 v6, 0x3f400000    # 0.75f

    invoke-direct {v3, v5, v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iget-object v5, v1, Lj/n;->c:Ljava/lang/Class;

    :goto_2
    if-eqz v5, :cond_7

    const-class v6, Ljava/lang/Object;

    if-eq v5, v6, :cond_7

    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_6

    aget-object v9, v6, v8

    move-object/from16 v17, v2

    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v4}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object v18

    if-eqz v18, :cond_3

    goto :goto_4

    :cond_3
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v18

    and-int/lit8 v19, v18, 0x10

    if-nez v19, :cond_5

    and-int/lit8 v18, v18, 0x8

    if-eqz v18, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v3, v2, v9}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    :goto_4
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v2, v17

    goto :goto_3

    :cond_6
    move-object/from16 v17, v2

    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    goto :goto_2

    :cond_7
    move-object/from16 v17, v2

    iput-object v3, v1, Lj/n;->e:Ljava/util/concurrent/ConcurrentHashMap;

    goto :goto_5

    :cond_8
    move-object/from16 v17, v2

    :goto_5
    iget-object v2, v1, Lj/n;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v11}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_a

    instance-of v3, v2, Lj/k;

    if-eqz v3, :cond_9

    check-cast v2, Lj/k;

    const/4 v3, 0x1

    move-object v15, v10

    goto :goto_8

    :cond_9
    move-object v7, v2

    check-cast v7, Ljava/lang/reflect/Field;

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    new-instance v9, Lm/c;

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v8, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v2, v9

    move-object/from16 v3, p2

    move-object/from16 v20, v9

    move/from16 v9, v17

    move-object v15, v10

    move/from16 v10, v18

    invoke-direct/range {v2 .. v10}, Lm/c;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;III)V

    new-instance v2, Lj/f;

    iget-object v3, v1, Lj/n;->c:Ljava/lang/Class;

    move-object/from16 v4, v20

    invoke-direct {v2, v3, v4}, Lj/f;-><init>(Ljava/lang/Class;Lm/c;)V

    iget-object v3, v1, Lj/n;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v3, v11, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x1

    goto :goto_8

    :cond_a
    :goto_6
    move-object v15, v10

    goto :goto_7

    :cond_b
    move-object/from16 v17, v2

    goto :goto_6

    :goto_7
    const/4 v3, 0x1

    move-object/from16 v2, v17

    :goto_8
    if-nez v2, :cond_15

    sget-object v2, Li/b;->j:Li/b;

    invoke-interface {v15, v2}, Li/c;->A(Li/b;)Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v2, v1, Lj/n;->b:[Lj/k;

    array-length v4, v2

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v4, :cond_13

    aget-object v6, v2, v5

    iget-object v7, v6, Lj/k;->a:Lm/c;

    iget-boolean v8, v7, Lm/c;->s:Z

    if-eqz v8, :cond_11

    instance-of v8, v6, Lj/f;

    if-eqz v8, :cond_11

    iget-object v8, v7, Lm/c;->d:Ljava/lang/reflect/Field;

    const-string v9, "parse unwrapped field error."

    if-eqz v8, :cond_10

    move-object v8, v6

    check-cast v8, Lj/f;

    iget-object v10, v0, Li/a;->d:Li/i;

    invoke-virtual {v8, v10}, Lj/f;->e(Li/i;)Lj/s;

    move-result-object v10

    move-object/from16 v17, v2

    instance-of v2, v10, Lj/n;

    if-eqz v2, :cond_e

    move-object v2, v10

    check-cast v2, Lj/n;

    move/from16 v18, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v11, v4}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object v2

    if-eqz v2, :cond_12

    :try_start_0
    iget-object v4, v7, Lm/c;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v4, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_c

    check-cast v10, Lj/n;

    iget-object v4, v7, Lm/c;->g:Ljava/lang/reflect/Type;

    invoke-virtual {v10, v0, v4}, Lj/n;->b(Li/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v6, v12, v4}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_c
    iget-object v5, v8, Lj/f;->c:Lj/s;

    if-eqz v5, :cond_d

    invoke-interface {v5}, Lj/s;->e()I

    :cond_d
    invoke-interface {v15}, Li/c;->H()V

    invoke-virtual {v2, v0, v4, v13, v14}, Lj/k;->b(Li/a;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v3

    :catch_0
    move-exception v0

    new-instance v2, Lf/d;

    invoke-direct {v2, v9, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_e
    move/from16 v18, v4

    instance-of v2, v10, Lj/q;

    if-eqz v2, :cond_12

    check-cast v10, Lj/q;

    :try_start_1
    iget-object v2, v7, Lm/c;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v2, v12}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-nez v2, :cond_f

    iget-object v2, v7, Lm/c;->g:Ljava/lang/reflect/Type;

    invoke-virtual {v10, v2}, Lj/q;->b(Ljava/lang/reflect/Type;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v6, v12, v2}, Lj/k;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_f
    invoke-interface {v15}, Li/c;->S()V

    invoke-virtual/range {p1 .. p2}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v11, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return v3

    :catch_1
    move-exception v0

    new-instance v2, Lf/d;

    invoke-direct {v2, v9, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_10
    move-object/from16 v17, v2

    move/from16 v18, v4

    iget-object v2, v7, Lm/c;->c:Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    array-length v2, v2

    const/4 v4, 0x2

    if-ne v2, v4, :cond_12

    invoke-interface {v15}, Li/c;->S()V

    invoke-virtual/range {p1 .. p2}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :try_start_2
    iget-object v2, v7, Lm/c;->c:Ljava/lang/reflect/Method;

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v11, v4, v16

    aput-object v0, v4, v3

    invoke-virtual {v2, v12, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return v3

    :catch_2
    move-exception v0

    new-instance v2, Lf/d;

    invoke-direct {v2, v9, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_11
    move-object/from16 v17, v2

    move/from16 v18, v4

    :cond_12
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v2, v17

    move/from16 v4, v18

    goto/16 :goto_9

    :cond_13
    invoke-virtual {v0, v12, v11}, Li/a;->z(Ljava/lang/Object;Ljava/lang/String;)V

    return v16

    :cond_14
    new-instance v0, Lf/d;

    const-string v2, "setter not found, class "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v1, Lj/n;->c:Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", property "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    const/4 v4, 0x0

    :goto_a
    iget-object v5, v1, Lj/n;->b:[Lj/k;

    array-length v6, v5

    const/4 v7, -0x1

    if-ge v4, v6, :cond_17

    aget-object v5, v5, v4

    if-ne v5, v2, :cond_16

    goto :goto_b

    :cond_16
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_17
    const/4 v4, -0x1

    :goto_b
    if-eq v4, v7, :cond_18

    move-object/from16 v5, p6

    move-object v6, v15

    if-eqz v5, :cond_19

    const-string v7, "_"

    invoke-virtual {v11, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-static {v4, v5}, Lj/n;->k(I[I)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v0, v12, v11}, Li/a;->z(Ljava/lang/Object;Ljava/lang/String;)V

    return v16

    :cond_18
    move-object v6, v15

    :cond_19
    invoke-virtual {v2}, Lj/k;->a()I

    invoke-interface {v6}, Li/c;->H()V

    invoke-virtual {v2, v0, v12, v13, v14}, Lj/k;->b(Li/a;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V

    return v3
.end method

.method public final m(Li/d;[CLj/s;)Ljava/lang/Enum;
    .locals 4

    instance-of v0, p3, Lj/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p3, Lj/g;

    goto :goto_0

    :cond_0
    move-object p3, v1

    :goto_0
    if-nez p3, :cond_1

    const/4 p2, -0x1

    iput p2, p1, Li/d;->n:I

    return-object v1

    :cond_1
    invoke-virtual {p1, p2}, Li/d;->K0([C)J

    move-result-wide v2

    iget p1, p1, Li/d;->n:I

    if-lez p1, :cond_4

    iget-object p1, p3, Lj/g;->b:[Ljava/lang/Enum;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p3, Lj/g;->d:[J

    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result p1

    if-gez p1, :cond_3

    goto :goto_1

    :cond_3
    iget-object p2, p3, Lj/g;->b:[Ljava/lang/Enum;

    aget-object v1, p2, p1

    :cond_4
    :goto_1
    return-object v1
.end method

.method public final n(Ljava/lang/String;[I)Lj/k;
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lj/n;->i(Ljava/lang/String;[I)Lj/k;

    move-result-object v1

    if-nez v1, :cond_a

    invoke-static {p1}, Lm/j;->u(Ljava/lang/String;)J

    move-result-wide v2

    iget-object v4, p0, Lj/n;->g:[J

    const/4 v5, 0x0

    if-nez v4, :cond_2

    iget-object v4, p0, Lj/n;->b:[Lj/k;

    array-length v4, v4

    new-array v4, v4, [J

    const/4 v6, 0x0

    :goto_0
    iget-object v7, p0, Lj/n;->b:[Lj/k;

    array-length v8, v7

    if-ge v6, v8, :cond_1

    aget-object v7, v7, v6

    iget-object v7, v7, Lj/k;->a:Lm/c;

    iget-object v7, v7, Lm/c;->b:Ljava/lang/String;

    invoke-static {v7}, Lm/j;->u(Ljava/lang/String;)J

    move-result-wide v7

    aput-wide v7, v4, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v4}, Ljava/util/Arrays;->sort([J)V

    iput-object v4, p0, Lj/n;->g:[J

    :cond_2
    iget-object v4, p0, Lj/n;->g:[J

    invoke-static {v4, v2, v3}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v2

    if-gez v2, :cond_3

    const-string v3, "is"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm/j;->u(Ljava/lang/String;)J

    move-result-wide v6

    iget-object p1, p0, Lj/n;->g:[J

    invoke-static {p1, v6, v7}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v2

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_1
    if-ltz v2, :cond_8

    iget-object p1, p0, Lj/n;->h:[S

    const/4 v4, -0x1

    if-nez p1, :cond_7

    iget-object p1, p0, Lj/n;->g:[J

    array-length p1, p1

    new-array p1, p1, [S

    invoke-static {p1, v4}, Ljava/util/Arrays;->fill([SS)V

    :goto_2
    iget-object v6, p0, Lj/n;->b:[Lj/k;

    array-length v7, v6

    if-ge v5, v7, :cond_6

    iget-object v7, p0, Lj/n;->g:[J

    aget-object v6, v6, v5

    iget-object v6, v6, Lj/k;->a:Lm/c;

    iget-object v6, v6, Lm/c;->b:Ljava/lang/String;

    invoke-static {v6}, Lm/j;->u(Ljava/lang/String;)J

    move-result-wide v8

    invoke-static {v7, v8, v9}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v6

    if-ltz v6, :cond_5

    int-to-short v7, v5

    aput-short v7, p1, v6

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_6
    iput-object p1, p0, Lj/n;->h:[S

    :cond_7
    iget-object p1, p0, Lj/n;->h:[S

    aget-short p1, p1, v2

    if-eq p1, v4, :cond_8

    invoke-static {p1, p2}, Lj/n;->k(I[I)Z

    move-result p2

    if-nez p2, :cond_8

    iget-object p2, p0, Lj/n;->b:[Lj/k;

    aget-object v1, p2, p1

    :cond_8
    if-eqz v1, :cond_a

    iget-object p1, v1, Lj/k;->a:Lm/c;

    iget p2, p1, Lm/c;->k:I

    sget-object v2, Li/b;->t:Li/b;

    iget v2, v2, Li/b;->b:I

    and-int/2addr p2, v2

    if-eqz p2, :cond_9

    return-object v0

    :cond_9
    iget-object p1, p1, Lm/c;->f:Ljava/lang/Class;

    if-eqz v3, :cond_a

    sget-object p2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq p1, p2, :cond_a

    const-class p2, Ljava/lang/Boolean;

    if-eq p1, p2, :cond_a

    goto :goto_3

    :cond_a
    move-object v0, v1

    :goto_3
    return-object v0
.end method
