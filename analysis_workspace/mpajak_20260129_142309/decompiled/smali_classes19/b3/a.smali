.class public abstract Lb3/a;
.super Ljava/lang/Object;

# interfaces
.implements Lb3/b;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lv2/g;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_3

    iget-object v0, p2, Lv2/g;->e:Lv2/e;

    iget-boolean v0, v0, Lv2/e;->F:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p2, Lv2/g;->l:Lv2/a;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lv2/a;->u()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p3, Ljava/sql/SQLException;

    const-string v0, "Field \'"

    const-string v1, "\' is of data type "

    invoke-static {v0, p1, v1}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget-object p2, p2, Lv2/g;->l:Lv2/a;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " which can not be compared"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_2
    new-instance p1, Ljava/sql/SQLException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Internal error.  Data-persister is not configured for field.  Please post _full_ exception with associated data objects to mailing list: "

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iput-object p1, p0, Lb3/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lb3/a;->b:Lv2/g;

    iput-object p3, p0, Lb3/a;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lu2/c;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ljava/lang/String;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    move-object v0, p1

    check-cast v0, Lu2/a;

    invoke-virtual {v0, p3, p2}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 p2, 0x2e

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget-object p2, p0, Lb3/a;->a:Ljava/lang/String;

    check-cast p1, Lu2/a;

    invoke-virtual {p1, p3, p2}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 p2, 0x20

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3}, Lb3/a;->c(Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, p1, p3, p4}, Lb3/a;->d(Lu2/c;Ljava/lang/StringBuilder;Ljava/util/List;)V

    return-void
.end method

.method public final b(Lu2/c;Lv2/g;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Lv2/g;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-eqz p5, :cond_9

    instance-of v0, p5, Lz2/a;

    const/4 v1, 0x0

    const/16 v2, 0x3f

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    check-cast p5, Lz2/a;

    iget-object p1, p0, Lb3/a;->a:Ljava/lang/String;

    invoke-interface {p5, p1, p2}, Lz2/a;->d(Ljava/lang/String;Lv2/g;)V

    invoke-interface {p4, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_0
    instance-of v0, p5, Lz2/b;

    if-eqz v0, :cond_1

    check-cast p5, Lz2/b;

    const/4 p2, 0x0

    check-cast p1, Lu2/a;

    invoke-virtual {p1, p3, p2}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_1
    iget-object v0, p2, Lv2/g;->l:Lv2/a;

    invoke-interface {v0}, Lv2/a;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    new-instance p1, Lz2/i;

    invoke-direct {p1}, Lz2/i;-><init>()V

    iget-object v0, p0, Lb3/a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, p2}, Lz2/i;->d(Ljava/lang/String;Lv2/g;)V

    iput-boolean v3, p1, Lz2/i;->c:Z

    iput-object p5, p1, Lz2/i;->d:Ljava/lang/Object;

    invoke-interface {p4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_2
    iget-object v0, p2, Lv2/g;->e:Lv2/e;

    iget-boolean v0, v0, Lv2/e;->k:Z

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lv2/g;->j()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v4, p2, Lv2/g;->p:Lv2/g;

    invoke-virtual {v4, p5}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v2, p0

    move-object v3, p1

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lb3/a;->b(Lu2/c;Lv2/g;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget-object p4, p2, Lv2/g;->l:Lv2/a;

    invoke-interface {p4}, Lv2/a;->j()Z

    move-result p4

    if-eqz p4, :cond_4

    invoke-virtual {p2, p5}, Lv2/g;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lu2/a;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 p1, 0x27

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    iget-object p1, p2, Lv2/g;->e:Lv2/e;

    iget-boolean p1, p1, Lv2/e;->k:Z

    if-eqz p1, :cond_7

    invoke-virtual {p2, p5}, Lv2/g;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p4

    if-lez p4, :cond_6

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p4

    const-string p5, "0123456789.-+"

    invoke-virtual {p5, p4}, Ljava/lang/String;->indexOf(I)I

    move-result p4

    if-ltz p4, :cond_5

    goto :goto_0

    :cond_5
    new-instance p3, Ljava/sql/SQLException;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Foreign field "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " does not seem to be producing a numerical value \'"

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'. Maybe you are passing the wrong object to comparison: "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p3

    :cond_6
    :goto_0
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_7
    invoke-virtual {p2, p5}, Lv2/g;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    const/4 v1, 0x1

    :goto_2
    if-eqz v1, :cond_8

    const/16 p1, 0x20

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_8
    return-void

    :cond_9
    new-instance p1, Ljava/sql/SQLException;

    const-string p3, "argument for \'"

    invoke-static {p3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p2}, Lv2/g;->g()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' is null"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract c(Ljava/lang/StringBuilder;)V
.end method

.method public d(Lu2/c;Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    iget-object v2, p0, Lb3/a;->b:Lv2/g;

    iget-object v5, p0, Lb3/a;->c:Ljava/lang/Object;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lb3/a;->b(Lu2/c;Lv2/g;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/Object;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lb3/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Lb3/a;->c(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb3/a;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
