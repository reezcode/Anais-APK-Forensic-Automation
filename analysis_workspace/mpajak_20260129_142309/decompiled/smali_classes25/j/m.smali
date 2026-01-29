.class public final Lj/m;
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

    check-cast p2, Li/d;

    iget-object p3, p1, Li/a;->c:Li/j;

    invoke-virtual {p2, p3}, Li/d;->W(Li/j;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Li/d;->y()V

    iget v0, p2, Li/d;->b:I

    const/16 v1, 0x19

    if-ne v0, v1, :cond_0

    iget-object v0, p1, Li/a;->c:Li/j;

    invoke-virtual {p2, v0}, Li/d;->W(Li/j;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "."

    invoke-static {p3, v1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Li/d;->y()V

    iget v0, p2, Li/d;->b:I

    :cond_0
    new-instance v1, Lf/f;

    invoke-direct {v1, p3}, Lf/f;-><init>(Ljava/lang/String;)V

    const/16 p3, 0xa

    const-string v2, "illegal jsonp : "

    if-ne v0, p3, :cond_4

    :goto_0
    invoke-virtual {p2}, Li/d;->y()V

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Li/a;->w(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    iget-object v0, v1, Lf/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p3, p2, Li/d;->b:I

    const/16 v0, 0x10

    if-ne p3, v0, :cond_1

    goto :goto_0

    :cond_1
    const/16 p1, 0xb

    if-ne p3, p1, :cond_3

    invoke-virtual {p2}, Li/d;->y()V

    iget p1, p2, Li/d;->b:I

    const/16 p3, 0x18

    if-ne p1, p3, :cond_2

    invoke-virtual {p2}, Li/d;->y()V

    :cond_2
    return-object v1

    :cond_3
    new-instance p1, Lf/d;

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p2}, Li/d;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lf/d;

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p2}, Li/d;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lf/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
