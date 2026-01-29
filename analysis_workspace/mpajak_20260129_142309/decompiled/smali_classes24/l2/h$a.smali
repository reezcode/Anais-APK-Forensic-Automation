.class public final Ll2/h$a;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Li2/z<",
        "Ljava/util/Map<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final a:Ll2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "TK;>;"
        }
    .end annotation
.end field

.field public final b:Ll2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final c:Lk2/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk2/q<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Ll2/h;


# direct methods
.method public constructor <init>(Ll2/h;Li2/i;Ljava/lang/reflect/Type;Li2/z;Ljava/lang/reflect/Type;Li2/z;Lk2/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/i;",
            "Ljava/lang/reflect/Type;",
            "Li2/z<",
            "TK;>;",
            "Ljava/lang/reflect/Type;",
            "Li2/z<",
            "TV;>;",
            "Lk2/q<",
            "+",
            "Ljava/util/Map<",
            "TK;TV;>;>;)V"
        }
    .end annotation

    iput-object p1, p0, Ll2/h$a;->d:Ll2/h;

    invoke-direct {p0}, Li2/z;-><init>()V

    new-instance p1, Ll2/p;

    invoke-direct {p1, p2, p4, p3}, Ll2/p;-><init>(Li2/i;Li2/z;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Ll2/h$a;->a:Ll2/p;

    new-instance p1, Ll2/p;

    invoke-direct {p1, p2, p6, p5}, Ll2/p;-><init>(Li2/i;Li2/z;Ljava/lang/reflect/Type;)V

    iput-object p1, p0, Ll2/h$a;->b:Ll2/p;

    iput-object p7, p0, Ll2/h$a;->c:Lk2/q;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 6

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp2/a;->I()V

    const/4 p1, 0x0

    goto/16 :goto_5

    :cond_0
    iget-object v2, p0, Ll2/h$a;->c:Lk2/q;

    invoke-interface {v2}, Lk2/q;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    const/4 v3, 0x1

    const-string v4, "duplicate key: "

    if-ne v0, v3, :cond_3

    invoke-virtual {p1}, Lp2/a;->a()V

    :goto_0
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lp2/a;->a()V

    iget-object v0, p0, Ll2/h$a;->a:Ll2/p;

    invoke-virtual {v0, p1}, Ll2/p;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll2/h$a;->b:Ll2/p;

    invoke-virtual {v1, p1}, Ll2/p;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lp2/a;->f()V

    goto :goto_0

    :cond_1
    new-instance p1, Li2/u;

    invoke-static {v4, v0}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Li2/u;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {p1}, Lp2/a;->f()V

    goto/16 :goto_4

    :cond_3
    invoke-virtual {p1}, Lp2/a;->b()V

    :goto_1
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object v0, Ld1/f;->a:Lp2/a$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p1, Ll2/f;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ll2/f;

    const/4 v3, 0x5

    invoke-virtual {v0, v3}, Ll2/f;->W(I)V

    invoke-virtual {v0}, Ll2/f;->Y()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Iterator;

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v5}, Ll2/f;->a0(Ljava/lang/Object;)V

    new-instance v5, Li2/s;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v5, v3}, Li2/s;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ll2/f;->a0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget v0, p1, Lp2/a;->i:I

    if-nez v0, :cond_5

    invoke-virtual {p1}, Lp2/a;->e()I

    move-result v0

    :cond_5
    const/16 v3, 0xd

    if-ne v0, v3, :cond_6

    iput v1, p1, Lp2/a;->i:I

    goto :goto_3

    :cond_6
    const/16 v3, 0xc

    if-ne v0, v3, :cond_7

    const/16 v0, 0x8

    goto :goto_2

    :cond_7
    const/16 v3, 0xe

    if-ne v0, v3, :cond_9

    const/16 v0, 0xa

    :goto_2
    iput v0, p1, Lp2/a;->i:I

    :goto_3
    iget-object v0, p0, Ll2/h$a;->a:Ll2/p;

    invoke-virtual {v0, p1}, Ll2/p;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, Ll2/h$a;->b:Ll2/p;

    invoke-virtual {v3, p1}, Ll2/p;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_8

    goto :goto_1

    :cond_8
    new-instance p1, Li2/u;

    invoke-static {v4, v0}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Li2/u;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected a name but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lp2/a;->w()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    invoke-virtual {p1}, Lp2/a;->l()V

    :goto_4
    move-object p1, v2

    :goto_5
    return-object p1
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 8

    check-cast p2, Ljava/util/Map;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    goto/16 :goto_7

    :cond_0
    iget-object v0, p0, Ll2/h$a;->d:Ll2/h;

    iget-boolean v0, v0, Ll2/h;->c:Z

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lp2/b;->c()Lp2/b;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lp2/b;->n(Ljava/lang/String;)Lp2/b;

    iget-object v1, p0, Ll2/h$a;->b:Ll2/p;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Ll2/p;->b(Lp2/b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    iget-object v5, p0, Ll2/h$a;->a:Ll2/p;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v7, Ll2/g;

    invoke-direct {v7}, Ll2/g;-><init>()V

    invoke-virtual {v5, v7, v6}, Ll2/p;->b(Lp2/b;Ljava/lang/Object;)V

    iget-object v5, v7, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v5, v7, Ll2/g;->p:Li2/n;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v4, v5, Li2/l;

    if-nez v4, :cond_3

    instance-of v4, v5, Li2/q;

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 v4, 0x1

    :goto_3
    or-int/2addr v3, v4

    goto :goto_1

    :cond_4
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected one JSON element but was "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v7, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    new-instance p2, Li2/o;

    invoke-direct {p2, p1}, Li2/o;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_5
    if-eqz v3, :cond_7

    invoke-virtual {p1}, Lp2/b;->b()Lp2/b;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_4
    if-ge v2, p2, :cond_6

    invoke-virtual {p1}, Lp2/b;->b()Lp2/b;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/n;

    invoke-static {v3, p1}, Lk/j0;->E(Li2/n;Lp2/b;)V

    iget-object v3, p0, Ll2/h$a;->b:Ll2/p;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Ll2/p;->b(Lp2/b;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lp2/b;->f()Lp2/b;

    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lp2/b;->f()Lp2/b;

    goto :goto_7

    :cond_7
    invoke-virtual {p1}, Lp2/b;->c()Lp2/b;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    :goto_5
    if-ge v2, p2, :cond_d

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li2/n;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v4, v3, Li2/s;

    if-eqz v4, :cond_b

    invoke-virtual {v3}, Li2/n;->l()Li2/s;

    move-result-object v3

    iget-object v4, v3, Li2/s;->a:Ljava/io/Serializable;

    instance-of v5, v4, Ljava/lang/Number;

    if-eqz v5, :cond_8

    invoke-virtual {v3}, Li2/s;->s()Ljava/lang/Number;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_8
    instance-of v5, v4, Ljava/lang/Boolean;

    if-eqz v5, :cond_9

    invoke-virtual {v3}, Li2/s;->r()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_9
    instance-of v4, v4, Ljava/lang/String;

    if-eqz v4, :cond_a

    invoke-virtual {v3}, Li2/s;->t()Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_a
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_b
    instance-of v3, v3, Li2/p;

    if-eqz v3, :cond_c

    const-string v3, "null"

    :goto_6
    invoke-virtual {p1, v3}, Lp2/b;->n(Ljava/lang/String;)Lp2/b;

    iget-object v3, p0, Ll2/h$a;->b:Ll2/p;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Ll2/p;->b(Lp2/b;Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_d
    invoke-virtual {p1}, Lp2/b;->l()Lp2/b;

    :goto_7
    return-void
.end method
