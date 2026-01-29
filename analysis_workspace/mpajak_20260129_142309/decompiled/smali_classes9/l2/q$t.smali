.class public final Ll2/q$t;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "Li2/n;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li2/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lp2/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Ll2/q$t;->c(Lp2/a;)Li2/n;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic b(Lp2/b;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Li2/n;

    invoke-virtual {p0, p1, p2}, Ll2/q$t;->d(Lp2/b;Li2/n;)V

    return-void
.end method

.method public final c(Lp2/a;)Li2/n;
    .locals 4

    instance-of v0, p1, Ll2/f;

    const/4 v1, 0x2

    const/4 v2, 0x5

    if-eqz v0, :cond_1

    check-cast p1, Ll2/f;

    invoke-virtual {p1}, Ll2/f;->N()I

    move-result v0

    if-eq v0, v2, :cond_0

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    invoke-virtual {p1}, Ll2/f;->Y()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/n;

    invoke-virtual {p1}, Ll2/f;->U()V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Unexpected "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v0}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " when reading a JsonElement."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    invoke-static {v0}, Lf/h;->a(I)I

    move-result v0

    if-eqz v0, :cond_9

    if-eq v0, v1, :cond_6

    if-eq v0, v2, :cond_5

    const/4 v1, 0x6

    if-eq v0, v1, :cond_4

    const/4 v1, 0x7

    if-eq v0, v1, :cond_3

    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lp2/a;->I()V

    sget-object p1, Li2/p;->a:Li2/p;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_3
    new-instance v0, Li2/s;

    invoke-virtual {p1}, Lp2/a;->x()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Li2/s;-><init>(Ljava/lang/Boolean;)V

    return-object v0

    :cond_4
    invoke-virtual {p1}, Lp2/a;->K()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Li2/s;

    new-instance v1, Lk2/o;

    invoke-direct {v1, p1}, Lk2/o;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Li2/s;-><init>(Ljava/lang/Number;)V

    return-object v0

    :cond_5
    new-instance v0, Li2/s;

    invoke-virtual {p1}, Lp2/a;->K()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Li2/s;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
    new-instance v0, Li2/q;

    invoke-direct {v0}, Li2/q;-><init>()V

    invoke-virtual {p1}, Lp2/a;->b()V

    :goto_0
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {p1}, Lp2/a;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Ll2/q$t;->c(Lp2/a;)Li2/n;

    move-result-object v2

    iget-object v3, v0, Li2/q;->a:Lk2/p;

    if-nez v2, :cond_7

    sget-object v2, Li2/p;->a:Li2/p;

    :cond_7
    invoke-virtual {v3, v1, v2}, Lk2/p;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lp2/a;->l()V

    return-object v0

    :cond_9
    new-instance v0, Li2/l;

    invoke-direct {v0}, Li2/l;-><init>()V

    invoke-virtual {p1}, Lp2/a;->a()V

    :goto_1
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {p0, p1}, Ll2/q$t;->c(Lp2/a;)Li2/n;

    move-result-object v1

    if-nez v1, :cond_a

    sget-object v1, Li2/p;->a:Li2/p;

    :cond_a
    iget-object v2, v0, Li2/l;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_b
    invoke-virtual {p1}, Lp2/a;->f()V

    return-object v0
.end method

.method public final d(Lp2/b;Li2/n;)V
    .locals 4

    if-eqz p2, :cond_d

    instance-of v0, p2, Li2/p;

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v0, p2, Li2/s;

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Li2/n;->l()Li2/s;

    move-result-object p2

    iget-object v0, p2, Li2/s;->a:Ljava/io/Serializable;

    instance-of v1, v0, Ljava/lang/Number;

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Li2/s;->s()Ljava/lang/Number;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp2/b;->A(Ljava/lang/Number;)Lp2/b;

    goto/16 :goto_4

    :cond_1
    instance-of v0, v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Li2/s;->r()Z

    move-result p2

    invoke-virtual {p1, p2}, Lp2/b;->H(Z)Lp2/b;

    goto/16 :goto_4

    :cond_2
    invoke-virtual {p2}, Li2/s;->t()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp2/b;->E(Ljava/lang/String;)Lp2/b;

    goto/16 :goto_4

    :cond_3
    instance-of v0, p2, Li2/l;

    if-eqz v0, :cond_6

    invoke-virtual {p1}, Lp2/b;->b()Lp2/b;

    if-eqz v0, :cond_5

    check-cast p2, Li2/l;

    invoke-virtual {p2}, Li2/l;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/n;

    invoke-virtual {p0, p1, v0}, Ll2/q$t;->d(Lp2/b;Li2/n;)V

    goto :goto_0

    :cond_4
    invoke-virtual {p1}, Lp2/b;->f()Lp2/b;

    goto/16 :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not a JSON Array: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    instance-of v0, p2, Li2/q;

    if-eqz v0, :cond_c

    invoke-virtual {p1}, Lp2/b;->c()Lp2/b;

    if-eqz v0, :cond_b

    check-cast p2, Li2/q;

    iget-object p2, p2, Li2/q;->a:Lk2/p;

    invoke-virtual {p2}, Lk2/p;->entrySet()Ljava/util/Set;

    move-result-object p2

    check-cast p2, Lk2/p$b;

    iget-object p2, p2, Lk2/p$b;->b:Lk2/p;

    iget-object v0, p2, Lk2/p;->f:Lk2/p$e;

    iget-object v0, v0, Lk2/p$e;->e:Lk2/p$e;

    iget v1, p2, Lk2/p;->e:I

    :goto_1
    iget-object v2, p2, Lk2/p;->f:Lk2/p$e;

    if-eq v0, v2, :cond_7

    const/4 v3, 0x1

    goto :goto_2

    :cond_7
    const/4 v3, 0x0

    :goto_2
    if-eqz v3, :cond_a

    if-eq v0, v2, :cond_9

    iget v2, p2, Lk2/p;->e:I

    if-ne v2, v1, :cond_8

    iget-object v2, v0, Lk2/p$e;->e:Lk2/p$e;

    iget-object v3, v0, Lk2/p$e;->g:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Lp2/b;->n(Ljava/lang/String;)Lp2/b;

    iget-object v0, v0, Lk2/p$e;->h:Ljava/lang/Object;

    check-cast v0, Li2/n;

    invoke-virtual {p0, p1, v0}, Ll2/q$t;->d(Lp2/b;Li2/n;)V

    move-object v0, v2

    goto :goto_1

    :cond_8
    new-instance p1, Ljava/util/ConcurrentModificationException;

    invoke-direct {p1}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw p1

    :cond_9
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1

    :cond_a
    invoke-virtual {p1}, Lp2/b;->l()Lp2/b;

    goto :goto_4

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Not a JSON Object: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Couldn\'t write "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    :goto_3
    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    :goto_4
    return-void
.end method
