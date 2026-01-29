.class public final Lj/v;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# instance fields
.field public final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "Lj/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "Lj/u;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj/v;->a:Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
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

    :try_start_0
    iget-object p2, p0, Lj/v;->a:Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lj/u;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->q()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0xc

    if-eq v0, v2, :cond_2

    const-string p2, "syntax error, expect {, actual "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    instance-of v0, p3, Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, ", fieldName "

    invoke-static {p2, v0}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p3}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    const-string v0, ", "

    invoke-static {p2, v0}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object v0, p1, Li/a;->g:Li/c;

    invoke-interface {v0}, Li/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lf/b;

    invoke-direct {v0}, Lf/b;-><init>()V

    invoke-virtual {p1, v0, p3}, Li/a;->y(Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lf/b;->size()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_1

    invoke-virtual {v0, v1}, Lf/b;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p3, p1, Lf/e;

    if-eqz p3, :cond_1

    check-cast p1, Lf/e;

    goto/16 :goto_6

    :cond_1
    new-instance p1, Lf/d;

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, p1, Li/a;->h:Li/h;

    :goto_0
    :try_start_1
    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->J()V

    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->z()C

    move-result v2

    iget-object v3, p1, Li/a;->g:Li/c;

    sget-object v4, Li/b;->h:Li/b;

    invoke-interface {v3, v4}, Li/c;->A(Li/b;)Z

    move-result v3

    if-eqz v3, :cond_3

    :goto_1
    const/16 v3, 0x2c

    if-ne v2, v3, :cond_3

    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->next()C

    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->J()V

    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->z()C

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    const-string v3, "expect \':\' at "

    const/16 v4, 0x3a

    const/16 v5, 0x22

    const/16 v6, 0x10

    if-ne v2, v5, :cond_5

    :try_start_2
    iget-object v2, p1, Li/a;->g:Li/c;

    iget-object v7, p1, Li/a;->c:Li/j;

    invoke-interface {v2, v7, v5}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v2

    iget-object v7, p1, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->J()V

    iget-object v7, p1, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->z()C

    move-result v7

    if-ne v7, v4, :cond_4

    goto/16 :goto_2

    :cond_4
    new-instance p2, Lf/d;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->a()I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    const/16 v7, 0x7d

    if-ne v2, v7, :cond_6

    iget-object p3, p1, Li/a;->g:Li/c;

    invoke-interface {p3}, Li/c;->next()C

    iget-object p3, p1, Li/a;->g:Li/c;

    invoke-interface {p3}, Li/c;->K()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_3

    :cond_6
    const-string v7, "syntax error"

    const/16 v8, 0x27

    if-ne v2, v8, :cond_9

    :try_start_3
    iget-object v2, p1, Li/a;->g:Li/c;

    sget-object v9, Li/b;->e:Li/b;

    invoke-interface {v2, v9}, Li/c;->A(Li/b;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p1, Li/a;->g:Li/c;

    iget-object v7, p1, Li/a;->c:Li/j;

    invoke-interface {v2, v7, v8}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v2

    iget-object v7, p1, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->J()V

    iget-object v7, p1, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->z()C

    move-result v7

    if-ne v7, v4, :cond_7

    goto :goto_2

    :cond_7
    new-instance p2, Lf/d;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->a()I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    new-instance p2, Lf/d;

    invoke-direct {p2, v7}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    iget-object v2, p1, Li/a;->g:Li/c;

    sget-object v8, Li/b;->d:Li/b;

    invoke-interface {v2, v8}, Li/c;->A(Li/b;)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, p1, Li/a;->g:Li/c;

    iget-object v7, p1, Li/a;->c:Li/j;

    invoke-interface {v2, v7}, Li/c;->W(Li/j;)Ljava/lang/String;

    move-result-object v2

    iget-object v7, p1, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->J()V

    iget-object v7, p1, Li/a;->g:Li/c;

    invoke-interface {v7}, Li/c;->z()C

    move-result v7

    if-ne v7, v4, :cond_12

    :goto_2
    iget-object v3, p1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->next()C

    iget-object v3, p1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->J()V

    iget-object v3, p1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->z()C

    iget-object v3, p1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->K()V

    sget-object v3, Lf/a;->d:Ljava/lang/String;

    const/16 v4, 0xd

    const/4 v7, 0x0

    if-ne v2, v3, :cond_c

    iget-object v3, p1, Li/a;->g:Li/c;

    sget-object v8, Li/b;->p:Li/b;

    invoke-interface {v3, v8}, Li/c;->A(Li/b;)Z

    move-result v3

    if-nez v3, :cond_c

    iget-object v2, p1, Li/a;->g:Li/c;

    iget-object v3, p1, Li/a;->c:Li/j;

    invoke-interface {v2, v3, v5}, Li/c;->b(Li/j;C)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p1, Li/a;->d:Li/i;

    invoke-virtual {v3, v2, v7}, Li/i;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/util/Map;

    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2, v6}, Li/c;->Q(I)V

    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    if-ne v2, v4, :cond_10

    :goto_3
    iget-object p3, p1, Li/a;->g:Li/c;

    invoke-interface {p3, v6}, Li/c;->Q(I)V

    goto :goto_5

    :cond_a
    iget-object p2, p1, Li/a;->d:Li/i;

    invoke-virtual {p2, v2}, Li/i;->c(Ljava/lang/reflect/Type;)Lj/s;

    move-result-object p2

    iget-object v1, p1, Li/a;->g:Li/c;

    invoke-interface {v1, v6}, Li/c;->Q(I)V

    const/4 v1, 0x2

    iput v1, p1, Li/a;->l:I

    if-eqz v0, :cond_b

    instance-of v1, p3, Ljava/lang/Integer;

    if-nez v1, :cond_b

    invoke-virtual {p1}, Li/a;->J()V

    :cond_b
    invoke-interface {p2, p1, v2, p3}, Lj/s;->c(Li/a;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map;

    goto :goto_5

    :cond_c
    iget-object v3, p1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->y()V

    if-eqz v1, :cond_d

    invoke-virtual {p1, v0}, Li/a;->P(Li/h;)V

    :cond_d
    invoke-interface {p2}, Lj/u;->getType()Ljava/lang/reflect/Type;

    move-result-object v3

    iget-object v5, p1, Li/a;->g:Li/c;

    invoke-interface {v5}, Li/c;->q()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_e

    iget-object v3, p1, Li/a;->g:Li/c;

    invoke-interface {v3}, Li/c;->y()V

    goto :goto_4

    :cond_e
    invoke-virtual {p1, v3, v2}, Li/a;->A(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    :goto_4
    invoke-interface {p2}, Lj/u;->apply()V

    invoke-virtual {p1, v0, v7, v2}, Li/a;->M(Li/h;Ljava/lang/Object;Ljava/lang/Object;)Li/h;

    invoke-virtual {p1, v0}, Li/a;->P(Li/h;)V

    iget-object v2, p1, Li/a;->g:Li/c;

    invoke-interface {v2}, Li/c;->q()I

    move-result v2

    const/16 v3, 0x14

    if-eq v2, v3, :cond_11

    const/16 v3, 0xf

    if-ne v2, v3, :cond_f

    goto :goto_5

    :cond_f
    if-ne v2, v4, :cond_10

    iget-object p3, p1, Li/a;->g:Li/c;

    invoke-interface {p3}, Li/c;->y()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    :cond_10
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_11
    :goto_5
    invoke-virtual {p1, v0}, Li/a;->P(Li/h;)V

    move-object p1, p2

    :goto_6
    return-object p1

    :cond_12
    :try_start_4
    new-instance p2, Lf/d;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Li/a;->g:Li/c;

    invoke-interface {v1}, Li/c;->a()I

    move-result v1

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", actual "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_13
    new-instance p2, Lf/d;

    invoke-direct {p2, v7}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception p2

    invoke-virtual {p1, v0}, Li/a;->P(Li/h;)V

    throw p2

    :catch_0
    new-instance p1, Lf/d;

    const-string p2, "craete instance error"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
