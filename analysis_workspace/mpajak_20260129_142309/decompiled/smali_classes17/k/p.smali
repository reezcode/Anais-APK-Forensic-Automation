.class public final Lk/p;
.super Ljava/lang/Object;

# interfaces
.implements Lj/s;


# direct methods
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

    iget-object p2, p1, Li/a;->g:Li/c;

    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    const/4 v0, 0x0

    const/16 v1, 0x10

    const/4 v2, 0x4

    if-ne p3, v2, :cond_0

    invoke-interface {p2}, Li/c;->k0()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v1}, Li/c;->Q(I)V

    goto/16 :goto_1

    :cond_0
    invoke-interface {p2}, Li/c;->q()I

    move-result p3

    const/4 v2, 0x2

    if-ne p3, v2, :cond_1

    invoke-interface {p2}, Li/c;->f()Ljava/lang/Number;

    move-result-object p1

    invoke-interface {p2, v1}, Li/c;->Q(I)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_2

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_2
    instance-of p2, p1, Ljava/util/Collection;

    if-eqz p2, :cond_6

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p3, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    instance-of v2, p3, Ljava/lang/String;

    if-eqz v2, :cond_3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p3

    if-eq p3, v0, :cond_3

    const/4 v0, 0x0

    :cond_4
    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p2

    new-array v0, p2, [C

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 v2, p2, 0x1

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p3, v1}, Ljava/lang/String;->charAt(I)C

    move-result p3

    aput-char p3, v0, p2

    move p2, v2

    goto :goto_0

    :cond_5
    new-instance p1, Lf/d;

    const-string p2, "can not cast to char[]"

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {p1}, Lf/a;->x(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    :cond_8
    :goto_2
    return-object v0
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method
