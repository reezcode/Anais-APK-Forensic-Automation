.class public final Lu2/d;
.super Lu2/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lu2/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lc3/c;Ljava/lang/Class;)Ld3/b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc3/c;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ld3/b<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lq2/e;->a:Ljava/lang/Class;

    check-cast p1, Lq2/b;

    iget-object p1, p1, Lq2/b;->d:Lu2/d;

    invoke-static {p2}, Ld3/b;->c(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    move-object v2, p2

    :goto_0
    const/4 v3, 0x0

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_4

    aget-object v7, v4, v6

    sget-object v8, Lq2/e;->f:[I

    if-nez v8, :cond_0

    goto :goto_3

    :cond_0
    const-class v8, Lv2/d;

    invoke-virtual {v7, v8}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v8

    check-cast v8, Lv2/d;

    if-eqz v8, :cond_1

    :try_start_0
    invoke-static {v8, v7}, Lq2/e;->a(Lv2/d;Ljava/lang/reflect/Field;)Lv2/e;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    :cond_1
    move-object v8, v3

    :goto_2
    if-nez v8, :cond_2

    :goto_3
    invoke-static {p1, v7}, Lv2/e;->e(Lu2/c;Ljava/lang/reflect/Field;)Lv2/e;

    move-result-object v8

    goto :goto_4

    :cond_2
    sget-object v7, Lq2/e;->a:Ljava/lang/Class;

    :goto_4
    if-eqz v8, :cond_3

    iget-boolean v7, v8, Lv2/e;->o:Z

    if-eqz v7, :cond_3

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v2

    goto :goto_0

    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    new-instance v3, Ld3/b;

    invoke-direct {v3, p2, v0, v1}, Ld3/b;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/util/List;)V

    :goto_5
    return-object v3
.end method
