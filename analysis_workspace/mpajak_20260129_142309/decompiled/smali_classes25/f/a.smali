.class public abstract Lf/a;
.super Ljava/lang/Object;

# interfaces
.implements Lf/k;
.implements Lf/c;


# static fields
.field public static b:Ljava/util/TimeZone;

.field public static c:Ljava/util/Locale;

.field public static d:Ljava/lang/String;

.field public static final e:[Lk/y0;

.field public static f:Ljava/lang/String;

.field public static g:I

.field public static h:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, Lf/a;->b:Ljava/util/TimeZone;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    sput-object v0, Lf/a;->c:Ljava/util/Locale;

    const-string v0, "@type"

    sput-object v0, Lf/a;->d:Ljava/lang/String;

    const/4 v0, 0x0

    new-array v1, v0, [Lk/y0;

    sput-object v1, Lf/a;->e:[Lk/y0;

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    sput-object v1, Lf/a;->f:Ljava/lang/String;

    sget-object v1, Li/b;->c:Li/b;

    iget v1, v1, Li/b;->b:I

    or-int/2addr v1, v0

    sget-object v2, Li/b;->f:Li/b;

    iget v2, v2, Li/b;->b:I

    or-int/2addr v1, v2

    sget-object v2, Li/b;->i:Li/b;

    iget v2, v2, Li/b;->b:I

    or-int/2addr v1, v2

    sget-object v2, Li/b;->d:Li/b;

    iget v2, v2, Li/b;->b:I

    or-int/2addr v1, v2

    sget-object v2, Li/b;->e:Li/b;

    iget v2, v2, Li/b;->b:I

    or-int/2addr v1, v2

    sget-object v2, Li/b;->h:Li/b;

    iget v2, v2, Li/b;->b:I

    or-int/2addr v1, v2

    sget-object v2, Li/b;->k:Li/b;

    iget v2, v2, Li/b;->b:I

    or-int/2addr v1, v2

    sget-object v2, Li/b;->j:Li/b;

    iget v2, v2, Li/b;->b:I

    or-int/2addr v1, v2

    sput v1, Lf/a;->g:I

    sget-object v1, Lk/b1;->c:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->m:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->g:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->n:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    const-string v1, "fastjson.serializerFeatures.MapSortField"

    invoke-static {v1}, Lm/e;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lk/b1;->D:Lk/b1;

    iget v2, v2, Lk/b1;->b:I

    const-string v3, "true"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    or-int/2addr v0, v2

    goto :goto_0

    :cond_0
    const-string v3, "false"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    not-int v1, v2

    and-int/2addr v0, v1

    :cond_1
    :goto_0
    sput v0, Lf/a;->h:I

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static s(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    sget v0, Lf/a;->g:I

    sget-object v1, Li/i;->n:Li/i;

    const/4 v2, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Li/a;

    new-instance v4, Li/f;

    invoke-direct {v4, p0, v0}, Li/f;-><init>(Ljava/lang/String;I)V

    invoke-direct {v3, p0, v4, v1}, Li/a;-><init>(Ljava/lang/Object;Li/c;Li/i;)V

    invoke-virtual {v3, v2}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Li/a;->q(Ljava/lang/Object;)V

    invoke-virtual {v3}, Li/a;->close()V

    :goto_0
    return-object v2
.end method

.method public static t(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Li/a;

    sget-object v2, Li/i;->n:Li/i;

    new-instance v3, Li/f;

    sget v4, Lf/a;->g:I

    invoke-direct {v3, p0, v4}, Li/f;-><init>(Ljava/lang/String;I)V

    invoke-direct {v1, p0, v3, v2}, Li/a;-><init>(Ljava/lang/Object;Li/c;Li/i;)V

    iget-object p0, v1, Li/a;->g:Li/c;

    invoke-interface {p0}, Li/c;->q()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_1

    invoke-interface {p0}, Li/c;->y()V

    goto :goto_0

    :cond_1
    const/16 v3, 0x14

    if-ne v2, v3, :cond_2

    invoke-interface {p0}, Li/c;->n()Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1, p1, p0, v0}, Li/a;->x(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, Li/a;->q(Ljava/lang/Object;)V

    move-object v0, p0

    :goto_0
    invoke-virtual {v1}, Li/a;->close()V

    return-object v0
.end method

.method public static u(Ljava/lang/String;)Lf/e;
    .locals 2

    invoke-static {p0}, Lf/a;->s(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lf/e;

    if-eqz v0, :cond_0

    check-cast p0, Lf/e;

    return-object p0

    :cond_0
    :try_start_0
    invoke-static {p0}, Lf/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf/e;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Lf/d;

    const-string v1, "can not cast to JSONObject."

    invoke-direct {v0, v1, p0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static v(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Li/i;->n:Li/i;

    sget v1, Lf/a;->g:I

    const/4 v2, 0x0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v3, Li/a;

    new-instance v4, Li/f;

    invoke-direct {v4, p0, v1}, Li/f;-><init>(Ljava/lang/String;I)V

    invoke-direct {v3, p0, v4, v0}, Li/a;-><init>(Ljava/lang/Object;Li/c;Li/i;)V

    invoke-virtual {v3, p1, v2}, Li/a;->A(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v2}, Li/a;->q(Ljava/lang/Object;)V

    invoke-virtual {v3}, Li/a;->close()V

    :goto_0
    return-object v2
.end method

.method public static w(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lk/x0;->f:Lk/x0;

    const/4 v1, 0x0

    if-nez p0, :cond_1

    :cond_0
    move-object p0, v1

    goto/16 :goto_7

    :cond_1
    instance-of v2, p0, Lf/a;

    if-eqz v2, :cond_2

    goto/16 :goto_7

    :cond_2
    instance-of v2, p0, Ljava/util/Map;

    if-eqz v2, :cond_6

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v0

    instance-of v2, p0, Ljava/util/LinkedHashMap;

    if-eqz v2, :cond_3

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    goto :goto_0

    :cond_3
    instance-of v2, p0, Ljava/util/TreeMap;

    if-eqz v2, :cond_4

    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2}, Ljava/util/TreeMap;-><init>()V

    goto :goto_0

    :cond_4
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2, v0}, Ljava/util/HashMap;-><init>(I)V

    :goto_0
    new-instance v0, Lf/e;

    invoke-direct {v0, v2}, Lf/e;-><init>(Ljava/util/Map;)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    sget-boolean v4, Lm/j;->a:Z

    if-nez v3, :cond_5

    move-object v3, v1

    goto :goto_2

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lf/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    instance-of v1, p0, Ljava/util/Collection;

    if-eqz v1, :cond_8

    check-cast p0, Ljava/util/Collection;

    new-instance v0, Lf/b;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Lf/b;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lf/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lf/b;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    move-object p0, v0

    goto/16 :goto_7

    :cond_8
    instance-of v1, p0, Lk/e0;

    if-eqz v1, :cond_a

    :cond_9
    invoke-static {p0}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lf/a;->s(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    goto/16 :goto_7

    :cond_a
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_b

    check-cast p0, Ljava/lang/Enum;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_7

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_c

    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    new-instance v1, Lf/b;

    invoke-direct {v1, v0}, Lf/b;-><init>(I)V

    :goto_4
    if-ge v3, v0, :cond_0

    invoke-static {p0, v3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lf/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lf/b;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_c
    invoke-static {v1}, Li/i;->e(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_7

    :cond_d
    invoke-virtual {v0, v1}, Lk/x0;->c(Ljava/lang/Class;)Lk/q0;

    move-result-object v0

    instance-of v1, v0, Lk/h0;

    if-eqz v1, :cond_9

    check-cast v0, Lk/h0;

    new-instance v1, Lf/e;

    invoke-direct {v1}, Lf/e;-><init>()V

    :try_start_0
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/LinkedHashMap;

    iget-object v4, v0, Lk/h0;->j:[Lk/z;

    array-length v4, v4

    invoke-direct {v2, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    iget-object v0, v0, Lk/h0;->j:[Lk/z;

    array-length v4, v0

    :goto_5
    if-ge v3, v4, :cond_e

    aget-object v5, v0, v3

    iget-object v6, v5, Lk/z;->b:Lm/c;

    iget-object v6, v6, Lm/c;->b:Ljava/lang/String;

    invoke-virtual {v5, p0}, Lk/z;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_e
    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lf/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception p0

    new-instance v0, Lf/d;

    const-string v1, "toJSON error"

    invoke-direct {v0, v1, p0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :goto_7
    return-object p0
.end method

.method public static x(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    sget-object v0, Lf/a;->e:[Lk/y0;

    const/4 v1, 0x0

    new-array v2, v1, [Lk/b1;

    sget-object v3, Lk/x0;->f:Lk/x0;

    sget v4, Lf/a;->h:I

    new-instance v5, Lk/a1;

    invoke-direct {v5, v4, v2}, Lk/a1;-><init>(I[Lk/b1;)V

    :try_start_0
    new-instance v2, Lk/g0;

    invoke-direct {v2, v5, v3}, Lk/g0;-><init>(Lk/a1;Lk/x0;)V

    if-eqz v0, :cond_0

    array-length v3, v0

    :goto_0
    if-ge v1, v3, :cond_0

    aget-object v4, v0, v1

    invoke-virtual {v2, v4}, Lk/z0;->c(Lk/y0;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, p0}, Lk/g0;->q(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lk/a1;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v5}, Lk/a1;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v5}, Lk/a1;->close()V

    throw p0
.end method


# virtual methods
.method public final l()Ljava/lang/String;
    .locals 3

    new-instance v0, Lk/a1;

    invoke-direct {v0}, Lk/a1;-><init>()V

    :try_start_0
    new-instance v1, Lk/g0;

    sget-object v2, Lk/x0;->f:Lk/x0;

    invoke-direct {v1, v0, v2}, Lk/g0;-><init>(Lk/a1;Lk/x0;)V

    invoke-virtual {v1, p0}, Lk/g0;->q(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lk/a1;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lk/a1;->close()V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lk/a1;->close()V

    throw v1
.end method

.method public final r(Ljava/lang/Appendable;)V
    .locals 3

    new-instance v0, Lk/a1;

    invoke-direct {v0}, Lk/a1;-><init>()V

    :try_start_0
    new-instance v1, Lk/g0;

    sget-object v2, Lk/x0;->f:Lk/x0;

    invoke-direct {v1, v0, v2}, Lk/g0;-><init>(Lk/a1;Lk/x0;)V

    invoke-virtual {v1, p0}, Lk/g0;->q(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lk/a1;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lk/a1;->close()V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_1
    new-instance v1, Lf/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {v0}, Lk/a1;->close()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
