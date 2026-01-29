.class public abstract Lk/z0;
.super Ljava/lang/Object;


# instance fields
.field public a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/k;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/c;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/s0;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/e1;",
            ">;"
        }
    .end annotation
.end field

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/o0;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/t0;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/i0;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lk/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lk/z0;->a:Ljava/util/ArrayList;

    iput-object v0, p0, Lk/z0;->b:Ljava/util/ArrayList;

    iput-object v0, p0, Lk/z0;->c:Ljava/util/ArrayList;

    iput-object v0, p0, Lk/z0;->d:Ljava/util/ArrayList;

    iput-object v0, p0, Lk/z0;->e:Ljava/util/ArrayList;

    iput-object v0, p0, Lk/z0;->f:Ljava/util/ArrayList;

    iput-object v0, p0, Lk/z0;->g:Ljava/util/ArrayList;

    iput-object v0, p0, Lk/z0;->h:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final c(Lk/y0;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lk/t0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lk/z0;->f:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->f:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Lk/z0;->f:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lk/t0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    instance-of v0, p1, Lk/o0;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lk/z0;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->e:Ljava/util/ArrayList;

    :cond_3
    iget-object v0, p0, Lk/z0;->e:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lk/o0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    instance-of v0, p1, Lk/e1;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lk/z0;->d:Ljava/util/ArrayList;

    if-nez v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->d:Ljava/util/ArrayList;

    :cond_5
    iget-object v0, p0, Lk/z0;->d:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lk/e1;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    instance-of v0, p1, Lk/u;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lk/z0;->h:Ljava/util/ArrayList;

    if-nez v0, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->h:Ljava/util/ArrayList;

    :cond_7
    iget-object v0, p0, Lk/z0;->h:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lk/u;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    instance-of v0, p1, Lk/s0;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lk/z0;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_9

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->c:Ljava/util/ArrayList;

    :cond_9
    iget-object v0, p0, Lk/z0;->c:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lk/s0;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    instance-of v0, p1, Lk/k;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lk/z0;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_b

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->a:Ljava/util/ArrayList;

    :cond_b
    iget-object v0, p0, Lk/z0;->a:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lk/k;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    instance-of v0, p1, Lk/c;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lk/z0;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_d

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->b:Ljava/util/ArrayList;

    :cond_d
    iget-object v0, p0, Lk/z0;->b:Ljava/util/ArrayList;

    move-object v1, p1

    check-cast v1, Lk/c;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    instance-of v0, p1, Lk/i0;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lk/z0;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_f

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk/z0;->g:Ljava/util/ArrayList;

    :cond_f
    iget-object v0, p0, Lk/z0;->g:Ljava/util/ArrayList;

    check-cast p1, Lk/i0;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    return-void
.end method

.method public final e(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z
    .locals 0

    iget-object p1, p1, Lk/z0;->c:Ljava/util/ArrayList;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk/s0;

    invoke-interface {p3}, Lk/s0;->b()Z

    move-result p3

    if-nez p3, :cond_0

    return p2

    :cond_1
    iget-object p1, p0, Lk/z0;->c:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk/s0;

    invoke-interface {p3}, Lk/s0;->b()Z

    move-result p3

    if-nez p3, :cond_2

    return p2

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final f(Lk/g0;Ljava/lang/Object;Ljava/lang/String;)Z
    .locals 0

    iget-object p1, p1, Lk/z0;->f:Ljava/util/ArrayList;

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk/t0;

    invoke-interface {p3}, Lk/t0;->d()Z

    move-result p3

    if-nez p3, :cond_0

    return p2

    :cond_1
    iget-object p1, p0, Lk/z0;->f:Ljava/util/ArrayList;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk/t0;

    invoke-interface {p3}, Lk/t0;->d()Z

    move-result p3

    if-nez p3, :cond_2

    return p2

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final g(Lk/g0;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    iget-object p1, p1, Lk/z0;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk/o0;

    invoke-interface {p2}, Lk/o0;->a()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lk/z0;->e:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk/o0;

    invoke-interface {p2}, Lk/o0;->a()Ljava/lang/String;

    move-result-object p3

    goto :goto_1

    :cond_1
    return-object p3
.end method

.method public final h(Lk/g0;Lk/j;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p5, :cond_5

    iget-object p3, p1, Lk/g0;->j:Lk/a1;

    iget-boolean p3, p3, Lk/a1;->k:Z

    if-nez p3, :cond_0

    if-eqz p2, :cond_1

    iget-object p3, p2, Lk/j;->a:Lm/c;

    iget p3, p3, Lm/c;->j:I

    sget-object p4, Lk/b1;->A:Lk/b1;

    iget p4, p4, Lk/b1;->b:I

    and-int/2addr p3, p4

    if-eqz p3, :cond_1

    :cond_0
    instance-of p3, p5, Ljava/lang/Number;

    if-nez p3, :cond_2

    instance-of p4, p5, Ljava/lang/Boolean;

    if-eqz p4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_5

    iget-object p2, p2, Lk/j;->a:Lm/c;

    iget-boolean p2, p2, Lm/c;->r:Z

    if-eqz p2, :cond_5

    check-cast p5, Ljava/lang/String;

    invoke-static {p5}, Lf/a;->s(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p5

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p4, 0x0

    if-eqz p3, :cond_3

    if-eqz p2, :cond_3

    iget-object p4, p2, Lk/j;->b:Ljava/lang/String;

    :cond_3
    if-eqz p4, :cond_4

    new-instance p2, Ljava/text/DecimalFormat;

    invoke-direct {p2, p4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    goto :goto_1

    :cond_4
    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p5

    :cond_5
    :goto_1
    iget-object p2, p1, Lk/z0;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk/e1;

    invoke-interface {p3}, Lk/e1;->c()Ljava/lang/Object;

    move-result-object p5

    goto :goto_2

    :cond_6
    iget-object p2, p0, Lk/z0;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_7

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lk/e1;

    invoke-interface {p3}, Lk/e1;->c()Ljava/lang/Object;

    move-result-object p5

    goto :goto_3

    :cond_7
    iget-object p1, p1, Lk/z0;->h:Ljava/util/ArrayList;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk/u;

    invoke-interface {p2}, Lk/u;->a()Ljava/lang/Object;

    move-result-object p5

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lk/z0;->h:Ljava/util/ArrayList;

    if-eqz p1, :cond_9

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk/u;

    invoke-interface {p2}, Lk/u;->a()Ljava/lang/Object;

    move-result-object p5

    goto :goto_5

    :cond_9
    return-object p5
.end method
