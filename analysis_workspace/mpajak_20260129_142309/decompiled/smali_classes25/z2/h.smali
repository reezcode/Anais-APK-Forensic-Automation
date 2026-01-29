.class public final Lz2/h;
.super Lz2/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Lz2/k<",
        "TT;TID;>;"
    }
.end annotation


# instance fields
.field public i:[Lv2/g;

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb3/f;",
            ">;"
        }
    .end annotation
.end field

.field public l:Z

.field public m:Ljava/lang/Long;

.field public n:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Lu2/c;Ld3/c;Lt2/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ld3/c<",
            "TT;TID;>;",
            "Lt2/g<",
            "TT;TID;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lz2/k;-><init>(Lu2/c;Ld3/c;Lt2/g;I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    iget-object p2, p0, Lz2/h;->k:Ljava/util/ArrayList;

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p0, p1}, Lz2/h;->j(Ljava/lang/StringBuilder;)V

    :cond_2
    iget-object p2, p0, Lz2/k;->c:Lu2/c;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lz2/h;->i(Ljava/lang/StringBuilder;)V

    iget-object p2, p0, Lz2/h;->n:Ljava/lang/Long;

    if-nez p2, :cond_3

    goto :goto_2

    :cond_3
    iget-object p2, p0, Lz2/k;->c:Lu2/c;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lz2/k;->c:Lu2/c;

    iget-object v1, p0, Lz2/h;->n:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast p2, Lu2/a;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string p2, "OFFSET "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    iput-boolean v0, p0, Lz2/k;->f:Z

    return-void
.end method

.method public final b(Ljava/lang/StringBuilder;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz2/k;->f:Z

    const-string v1, "SELECT "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lz2/k;->c:Lu2/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lz2/h;->l:Z

    const/16 v2, 0x20

    if-eqz v1, :cond_0

    const/4 v0, 0x2

    iput v0, p0, Lz2/k;->e:I

    const-string v0, "COUNT(*) "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_0
    iget-object v1, p0, Lz2/h;->j:Ljava/util/ArrayList;

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    const/4 v1, 0x3

    iput v1, p0, Lz2/k;->e:I

    iget-object v1, p0, Lz2/h;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    const-string v5, ", "

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    iput v3, p0, Lz2/k;->e:I

    iget-boolean v0, p0, Lz2/k;->f:Z

    if-eqz v0, :cond_4

    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    iget-object v1, p0, Lz2/k;->b:Ljava/lang/String;

    check-cast v0, Lu2/a;

    invoke-virtual {v0, p1, v1}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_4
    const-string v0, "* "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lz2/k;->a:Ld3/c;

    iget-object v0, v0, Ld3/c;->d:[Lv2/g;

    iput-object v0, p0, Lz2/h;->i:[Lv2/g;

    :goto_2
    const-string v0, "FROM "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    iget-object v1, p0, Lz2/k;->b:Ljava/lang/String;

    check-cast v0, Lu2/a;

    invoke-virtual {v0, p1, v1}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final c(Ljava/lang/StringBuilder;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    const/4 v0, 0x1

    iget-object v1, p0, Lz2/k;->g:Lz2/m;

    if-eqz v1, :cond_0

    invoke-super {p0, p1, p2}, Lz2/k;->c(Ljava/lang/StringBuilder;Ljava/util/List;)Z

    move-result v0

    :cond_0
    return v0
.end method

.method public final e()[Lv2/g;
    .locals 1

    iget-object v0, p0, Lz2/h;->i:[Lv2/g;

    return-object v0
.end method

.method public final h(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lz2/k;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    iget-object v1, p0, Lz2/k;->b:Ljava/lang/String;

    check-cast v0, Lu2/a;

    invoke-virtual {v0, p1, v1}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 v0, 0x2e

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    check-cast v0, Lu2/a;

    invoke-virtual {v0, p1, p2}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return-void
.end method

.method public final i(Ljava/lang/StringBuilder;)V
    .locals 3

    iget-object v0, p0, Lz2/h;->m:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    iget-object v1, p0, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    check-cast v0, Lu2/a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "LIMIT "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final j(Ljava/lang/StringBuilder;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Z",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation

    const-string v0, "ORDER BY "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lz2/h;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/f;

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    const/16 v3, 0x2c

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    iget-object v3, v2, Lb3/f;->a:Ljava/lang/String;

    invoke-virtual {p0, p1, v3}, Lz2/h;->h(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    iget-boolean v2, v2, Lb3/f;->b:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, " DESC"

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_2
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final k(Ljava/lang/Long;)Lz2/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "Lz2/h<",
            "TT;TID;>;"
        }
    .end annotation

    iget-object v0, p0, Lz2/k;->c:Lu2/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lz2/h;->n:Ljava/lang/Long;

    return-object p0
.end method

.method public final l(Ljava/lang/String;Z)Lz2/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lz2/h<",
            "TT;TID;>;"
        }
    .end annotation

    iget-object v0, p0, Lz2/k;->a:Ld3/c;

    invoke-virtual {v0, p1}, Ld3/c;->b(Ljava/lang/String;)Lv2/g;

    move-result-object v0

    iget-object v0, v0, Lv2/g;->e:Lv2/e;

    iget-boolean v0, v0, Lv2/e;->F:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lz2/h;->k:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lz2/h;->k:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lz2/h;->k:Ljava/util/ArrayList;

    new-instance v1, Lb3/f;

    invoke-direct {v1, p1, p2}, Lb3/f;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can\'t orderBy foreign colletion field: "

    invoke-static {v0, p1}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final m()Lz2/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz2/f<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lz2/k;->f()La3/e;

    move-result-object v0

    return-object v0
.end method
