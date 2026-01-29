.class public final Lf/g;
.super Ljava/lang/Object;

# interfaces
.implements Lf/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf/g$c;,
        Lf/g$d;,
        Lf/g$u;,
        Lf/g$q;,
        Lf/g$j;,
        Lf/g$b;,
        Lf/g$h;,
        Lf/g$t;,
        Lf/g$g;,
        Lf/g$e;,
        Lf/g$f;,
        Lf/g$v;,
        Lf/g$n;,
        Lf/g$m;,
        Lf/g$p;,
        Lf/g$k;,
        Lf/g$a;,
        Lf/g$w;,
        Lf/g$l;,
        Lf/g$o;,
        Lf/g$s;,
        Lf/g$r;,
        Lf/g$i;
    }
.end annotation


# static fields
.field public static e:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Lf/g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final b:Ljava/lang/String;

.field public c:[Lf/g$r;

.field public d:Lk/x0;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    const/16 v1, 0x80

    const/high16 v2, 0x3f400000    # 0.75f

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    sput-object v0, Lf/g;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lk/x0;->f:Lk/x0;

    sget-object v1, Li/i;->n:Li/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_0

    iput-object p1, p0, Lf/g;->b:Ljava/lang/String;

    iput-object v0, p0, Lf/g;->d:Lk/x0;

    return-void

    :cond_0
    new-instance p1, Lf/i;

    const-string v0, "json-path can not be null or empty"

    invoke-direct {p1, v0}, Lf/i;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 12

    sget-object v0, Lf/g;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf/g;

    if-nez v0, :cond_0

    new-instance v0, Lf/g;

    invoke-direct {v0, p1}, Lf/g;-><init>(Ljava/lang/String;)V

    sget-object v1, Lf/g;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v1

    const/16 v2, 0x400

    if-ge v1, v2, :cond_0

    sget-object v1, Lf/g;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lf/g;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lf/g;

    :cond_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    if-nez p0, :cond_1

    goto/16 :goto_8

    :cond_1
    iget-object v1, v0, Lf/g;->c:[Lf/g$r;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    goto/16 :goto_6

    :cond_2
    iget-object v1, v0, Lf/g;->b:Ljava/lang/String;

    const-string v3, "*"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    new-array p1, v3, [Lf/g$r;

    sget-object v1, Lf/g$w;->a:Lf/g$w;

    aput-object v1, p1, v2

    iput-object p1, v0, Lf/g;->c:[Lf/g$r;

    goto/16 :goto_6

    :cond_3
    new-instance v1, Lf/g$i;

    iget-object v4, v0, Lf/g;->b:Ljava/lang/String;

    invoke-direct {v1, v4}, Lf/g$i;-><init>(Ljava/lang/String;)V

    if-eqz v4, :cond_1b

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_1b

    const/16 v4, 0x8

    new-array v4, v4, [Lf/g$r;

    :goto_0
    iget v5, v1, Lf/g$i;->d:I

    if-nez v5, :cond_7

    iget-object v5, v1, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-ne v5, v3, :cond_7

    iget-char v5, v1, Lf/g$i;->c:C

    invoke-static {v5}, Lf/g$i;->b(C)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-char v5, v1, Lf/g$i;->c:C

    add-int/lit8 v5, v5, -0x30

    new-instance v6, Lf/g$a;

    invoke-direct {v6, v5}, Lf/g$a;-><init>(I)V

    goto/16 :goto_4

    :cond_4
    iget-char v5, v1, Lf/g$i;->c:C

    const/16 v6, 0x61

    if-lt v5, v6, :cond_5

    const/16 v6, 0x7a

    if-le v5, v6, :cond_6

    :cond_5
    const/16 v6, 0x41

    if-lt v5, v6, :cond_7

    const/16 v6, 0x5a

    if-gt v5, v6, :cond_7

    :cond_6
    new-instance v6, Lf/g$o;

    invoke-static {v5}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v5, v2}, Lf/g$o;-><init>(Ljava/lang/String;Z)V

    goto/16 :goto_4

    :cond_7
    :goto_1
    invoke-virtual {v1}, Lf/g$i;->c()Z

    move-result v5

    if-nez v5, :cond_16

    invoke-virtual {v1}, Lf/g$i;->j()V

    iget-char v5, v1, Lf/g$i;->c:C

    const/16 v6, 0x24

    if-ne v5, v6, :cond_8

    invoke-virtual {v1}, Lf/g$i;->d()V

    goto :goto_1

    :cond_8
    const/16 v6, 0x5b

    const-string v7, "not support jsonpath : "

    const/16 v8, 0x2e

    if-eq v5, v8, :cond_c

    const/16 v9, 0x2f

    if-ne v5, v9, :cond_9

    goto :goto_2

    :cond_9
    if-ne v5, v6, :cond_a

    invoke-virtual {v1, v3}, Lf/g$i;->e(Z)Lf/g$r;

    move-result-object v6

    goto/16 :goto_4

    :cond_a
    iget v5, v1, Lf/g$i;->d:I

    if-nez v5, :cond_b

    invoke-virtual {v1}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lf/g$o;

    invoke-direct {v6, v5, v2}, Lf/g$o;-><init>(Ljava/lang/String;Z)V

    goto/16 :goto_4

    :cond_b
    new-instance p0, Lf/i;

    invoke-static {v7}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, v1, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lf/i;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    :goto_2
    invoke-virtual {v1}, Lf/g$i;->d()V

    const/16 v9, 0x2a

    if-ne v5, v8, :cond_e

    iget-char v5, v1, Lf/g$i;->c:C

    if-ne v5, v8, :cond_e

    invoke-virtual {v1}, Lf/g$i;->d()V

    iget-object v5, v1, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    iget v10, v1, Lf/g$i;->b:I

    add-int/lit8 v11, v10, 0x3

    if-le v5, v11, :cond_d

    iget-char v5, v1, Lf/g$i;->c:C

    if-ne v5, v6, :cond_d

    iget-object v5, v1, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {v5, v10}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v9, :cond_d

    iget-object v5, v1, Lf/g$i;->a:Ljava/lang/String;

    iget v6, v1, Lf/g$i;->b:I

    add-int/2addr v6, v3

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x5d

    if-ne v5, v6, :cond_d

    iget-object v5, v1, Lf/g$i;->a:Ljava/lang/String;

    iget v6, v1, Lf/g$i;->b:I

    add-int/lit8 v6, v6, 0x2

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-ne v5, v8, :cond_d

    invoke-virtual {v1}, Lf/g$i;->d()V

    invoke-virtual {v1}, Lf/g$i;->d()V

    invoke-virtual {v1}, Lf/g$i;->d()V

    invoke-virtual {v1}, Lf/g$i;->d()V

    :cond_d
    const/4 v5, 0x1

    goto :goto_3

    :cond_e
    const/4 v5, 0x0

    :goto_3
    iget-char v6, v1, Lf/g$i;->c:C

    if-ne v6, v9, :cond_10

    invoke-virtual {v1}, Lf/g$i;->c()Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v1}, Lf/g$i;->d()V

    :cond_f
    sget-object v6, Lf/g$w;->a:Lf/g$w;

    goto :goto_4

    :cond_10
    invoke-static {v6}, Lf/g$i;->b(C)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v1, v2}, Lf/g$i;->e(Z)Lf/g$r;

    move-result-object v6

    goto :goto_4

    :cond_11
    invoke-virtual {v1}, Lf/g$i;->g()Ljava/lang/String;

    move-result-object v6

    iget-char v8, v1, Lf/g$i;->c:C

    const/16 v9, 0x28

    if-ne v8, v9, :cond_15

    invoke-virtual {v1}, Lf/g$i;->d()V

    iget-char v5, v1, Lf/g$i;->c:C

    const/16 v8, 0x29

    if-ne v5, v8, :cond_14

    invoke-virtual {v1}, Lf/g$i;->c()Z

    move-result v5

    if-nez v5, :cond_12

    invoke-virtual {v1}, Lf/g$i;->d()V

    :cond_12
    const-string v5, "size"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    sget-object v6, Lf/g$s;->a:Lf/g$s;

    goto :goto_4

    :cond_13
    new-instance p0, Lf/i;

    invoke-static {v7}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, v1, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lf/i;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_14
    new-instance p0, Lf/i;

    invoke-static {v7}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object v0, v1, Lf/g$i;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lf/i;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_15
    new-instance v7, Lf/g$o;

    invoke-direct {v7, v6, v5}, Lf/g$o;-><init>(Ljava/lang/String;Z)V

    move-object v6, v7

    goto :goto_4

    :cond_16
    move-object v6, p1

    :goto_4
    iget v5, v1, Lf/g$i;->d:I

    if-nez v6, :cond_19

    array-length p1, v4

    if-ne v5, p1, :cond_17

    goto :goto_5

    :cond_17
    new-array p1, v5, [Lf/g$r;

    invoke-static {v4, v2, p1, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, p1

    :goto_5
    iput-object v4, v0, Lf/g;->c:[Lf/g$r;

    :goto_6
    move-object p1, p0

    :goto_7
    iget-object v1, v0, Lf/g;->c:[Lf/g$r;

    array-length v3, v1

    if-ge v2, v3, :cond_18

    aget-object v1, v1, v2

    invoke-interface {v1, v0, p0, p1}, Lf/g$r;->a(Lf/g;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    :cond_18
    :goto_8
    return-object p1

    :cond_19
    array-length v7, v4

    if-ne v5, v7, :cond_1a

    mul-int/lit8 v7, v5, 0x3

    div-int/lit8 v7, v7, 0x2

    new-array v7, v7, [Lf/g$r;

    invoke-static {v4, v2, v7, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v4, v7

    :cond_1a
    iget v5, v1, Lf/g$i;->d:I

    add-int/lit8 v7, v5, 0x1

    iput v7, v1, Lf/g$i;->d:I

    aput-object v6, v4, v5

    goto/16 :goto_0

    :cond_1b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static f(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    const-class v0, Ljava/lang/Byte;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Short;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Integer;

    if-eq p0, v0, :cond_1

    const-class v0, Ljava/lang/Long;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "getFieldValue error."

    if-nez p1, :cond_0

    return-void

    :cond_0
    instance-of v1, p1, Ljava/util/Map;

    if-eqz v1, :cond_3

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p3}, Lf/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0, v1}, Lf/g;->d(Ljava/lang/Class;)Lk/h0;

    move-result-object v1

    if-eqz v1, :cond_6

    :try_start_0
    invoke-virtual {v1, p2}, Lk/h0;->j(Ljava/lang/String;)Lk/z;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    if-eqz v2, :cond_4

    :try_start_1
    invoke-virtual {v2, p1}, Lk/z;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p3, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    return-void

    :catch_0
    move-exception p1

    :try_start_2
    new-instance p3, Lf/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3

    :catch_1
    move-exception p1

    new-instance p3, Lf/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3

    :cond_4
    invoke-virtual {v1, p1}, Lk/h0;->l(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0, p2, p3}, Lf/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :cond_5
    return-void

    :catch_2
    move-exception p1

    new-instance p3, Lf/i;

    const-string v0, "jsonpath error, path "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lf/g;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", segement "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Lf/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3

    :cond_6
    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_7

    check-cast p1, Ljava/util/List;

    const/4 v0, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_7

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v1, p2, p3}, Lf/g;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_7
    return-void
.end method

.method public final c(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p1, Ljava/util/List;

    if-eqz v1, :cond_4

    check-cast p1, Ljava/util/List;

    if-ltz p2, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p2, v1, :cond_1

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-gt v1, v2, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/2addr v0, p2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v0

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v1

    if-ltz p2, :cond_6

    if-ge p2, v1, :cond_5

    invoke-static {p1, p2}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_5
    return-object v0

    :cond_6
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-gt v2, v1, :cond_7

    add-int/2addr v1, p2

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_7
    return-object v0

    :cond_8
    instance-of v1, p1, Ljava/util/Map;

    if-eqz v1, :cond_a

    check-cast p1, Ljava/util/Map;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :cond_9
    return-object v0

    :cond_a
    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_d

    check-cast p1, Ljava/util/Collection;

    const/4 v1, 0x0

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, p2, :cond_b

    return-object v2

    :cond_b
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_c
    return-object v0

    :cond_d
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final d(Ljava/lang/Class;)Lk/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lk/h0;"
        }
    .end annotation

    iget-object v0, p0, Lf/g;->d:Lk/x0;

    invoke-virtual {v0, p1}, Lk/x0;->c(Ljava/lang/Class;)Lk/q0;

    move-result-object p1

    instance-of v0, p1, Lk/h0;

    if-eqz v0, :cond_0

    check-cast p1, Lk/h0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p1, Ljava/util/Map;

    const-wide v2, 0x4dea9618e618ae3cL    # 2.239892812106928E67

    if-eqz v1, :cond_2

    check-cast p1, Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_1

    cmp-long v0, v2, p3

    if-nez v0, :cond_1

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_1
    return-object p2

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0, v1}, Lf/g;->d(Ljava/lang/Class;)Lk/h0;

    move-result-object v1

    if-eqz v1, :cond_3

    :try_start_0
    invoke-virtual {v1, p1, p2, p3, p4}, Lk/h0;->k(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance p3, Lf/i;

    const-string p4, "jsonpath error, path "

    invoke-static {p4}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    iget-object v0, p0, Lf/g;->b:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", segement "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2, p1}, Lf/i;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p3

    :cond_3
    instance-of v1, p1, Ljava/util/List;

    if-eqz v1, :cond_8

    check-cast p1, Ljava/util/List;

    cmp-long v0, v2, p3

    if-nez v0, :cond_4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    goto/16 :goto_3

    :cond_4
    new-instance v0, Lf/b;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lf/b;-><init>(I)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_7

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2, p2, p3, p4}, Lf/g;->e(Ljava/lang/Object;Ljava/lang/String;J)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_5

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v0, v2}, Lf/b;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v0, v2}, Lf/b;->add(Ljava/lang/Object;)Z

    :cond_6
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    return-object v0

    :cond_8
    instance-of p2, p1, Ljava/lang/Enum;

    if-eqz p2, :cond_a

    move-object p2, p1

    check-cast p2, Ljava/lang/Enum;

    const-wide v1, -0x3b435245719ce47aL    # -1.3543099103600943E23

    cmp-long v3, v1, p3

    if-nez v3, :cond_9

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_9
    const-wide v1, -0xe14383dfcdd03deL    # -5.788733405278088E240

    cmp-long v3, v1, p3

    if-nez v3, :cond_a

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    goto :goto_3

    :cond_a
    instance-of p2, p1, Ljava/util/Calendar;

    if-eqz p2, :cond_10

    check-cast p1, Ljava/util/Calendar;

    const-wide v1, 0x7c64634977425edcL

    cmp-long p2, v1, p3

    if-nez p2, :cond_b

    const/4 p2, 0x1

    goto :goto_2

    :cond_b
    const-wide v1, -0xb423c6c9050a95bL

    cmp-long p2, v1, p3

    if-nez p2, :cond_c

    const/4 p2, 0x2

    goto :goto_2

    :cond_c
    const-wide v1, -0x3572c6e70ba870e3L    # -1.3667045267075351E51

    cmp-long p2, v1, p3

    if-nez p2, :cond_d

    const/4 p2, 0x5

    goto :goto_2

    :cond_d
    const-wide v1, 0x407efecc7eb5764fL    # 495.924925526463

    cmp-long p2, v1, p3

    if-nez p2, :cond_e

    const/16 p2, 0xb

    goto :goto_2

    :cond_e
    const-wide v1, 0x5bb2f9bdf2fad1e9L    # 5.387565597711505E133

    cmp-long p2, v1, p3

    if-nez p2, :cond_f

    const/16 p2, 0xc

    goto :goto_2

    :cond_f
    const-wide v1, -0x5b667a10b311df43L

    cmp-long p2, v1, p3

    if-nez p2, :cond_10

    const/16 p2, 0xd

    :goto_2
    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p1

    :goto_3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_10
    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf/g;->b:Ljava/lang/String;

    invoke-static {v0}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
