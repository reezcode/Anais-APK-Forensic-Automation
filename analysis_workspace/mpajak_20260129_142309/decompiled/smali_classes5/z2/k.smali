.class public abstract Lz2/k;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static h:Lx2/c;


# instance fields
.field public final a:Ld3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/c<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/String;

.field public final c:Lu2/c;

.field public final d:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public e:I

.field public f:Z

.field public g:Lz2/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lz2/k;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, Lz2/k;->h:Lx2/c;

    return-void
.end method

.method public constructor <init>(Lu2/c;Ld3/c;Lt2/g;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ld3/c<",
            "TT;TID;>;",
            "Lt2/g<",
            "TT;TID;>;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz2/k;->g:Lz2/m;

    iput-object p1, p0, Lz2/k;->c:Lu2/c;

    iput-object p2, p0, Lz2/k;->a:Ld3/c;

    iget-object p1, p2, Ld3/c;->c:Ljava/lang/String;

    iput-object p1, p0, Lz2/k;->b:Ljava/lang/String;

    iput-object p3, p0, Lz2/k;->d:Lt2/g;

    iput p4, p0, Lz2/k;->e:I

    invoke-static {p4}, Landroidx/appcompat/widget/a;->c(I)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Building a statement from a "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-static {p4}, Landroidx/appcompat/widget/a;->o(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " statement is not allowed"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public abstract a(Ljava/lang/StringBuilder;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/StringBuilder;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)V"
        }
    .end annotation
.end method

.method public c(Ljava/lang/StringBuilder;Ljava/util/List;)Z
    .locals 4
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

    iget-object v0, p0, Lz2/k;->g:Lz2/m;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const-string v0, "WHERE "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lz2/k;->g:Lz2/m;

    iget-boolean v2, p0, Lz2/k;->f:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lz2/k;->b:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    iget v3, v0, Lz2/m;->e:I

    if-eqz v3, :cond_4

    if-ne v3, v1, :cond_3

    iget-object v1, v0, Lz2/m;->f:Lb3/e;

    if-nez v1, :cond_2

    iget-object v1, v0, Lz2/m;->d:[Lb3/b;

    add-int/lit8 v3, v3, -0x1

    aget-object v1, v1, v3

    iget-object v0, v0, Lz2/m;->c:Lu2/c;

    invoke-interface {v1, v0, v2, p1, p2}, Lb3/b;->a(Lu2/c;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const/4 p1, 0x0

    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "The SQL statement has not been finished since there are previous operations still waiting for clauses."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Both the \"left-hand\" and \"right-hand\" clauses have been defined.  Did you miss an AND or OR?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No where clauses defined.  Did you miss a where operation?"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final d(Ljava/util/List;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lz2/a;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0, v0}, Lz2/k;->b(Ljava/lang/StringBuilder;)V

    invoke-virtual {p0, v0, p1}, Lz2/k;->c(Ljava/lang/StringBuilder;Ljava/util/List;)Z

    invoke-virtual {p0, v0, p1}, Lz2/k;->a(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lz2/k;->h:Lx2/c;

    const-string v1, "built statement {}"

    invoke-virtual {v0, v1, p1}, Lx2/c;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p1
.end method

.method public e()[Lv2/g;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()La3/e;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Long;",
            ")",
            "La3/e<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0, v0}, Lz2/k;->d(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Lz2/a;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, [Lz2/a;

    invoke-virtual {p0}, Lz2/k;->e()[Lv2/g;

    move-result-object v5

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v4, v0, [Lv2/g;

    const/4 v0, 0x0

    :goto_0
    array-length v1, v6

    if-ge v0, v1, :cond_0

    aget-object v1, v6, v0

    invoke-interface {v1}, Lz2/a;->b()Lv2/g;

    move-result-object v1

    aput-object v1, v4, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget v0, p0, Lz2/k;->e:I

    invoke-static {v0}, Landroidx/appcompat/widget/a;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, La3/e;

    iget-object v2, p0, Lz2/k;->a:Ld3/c;

    iget-object v1, p0, Lz2/k;->c:Lu2/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget v7, p0, Lz2/k;->e:I

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, La3/e;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;[Lv2/g;[Lz2/a;I)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Building a statement from a "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lz2/k;->e:I

    invoke-static {v2}, Landroidx/appcompat/widget/a;->o(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " statement is not allowed"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g()Lz2/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lz2/m;

    iget-object v1, p0, Lz2/k;->a:Ld3/c;

    iget-object v2, p0, Lz2/k;->c:Lu2/c;

    invoke-direct {v0, v1, p0, v2}, Lz2/m;-><init>(Ld3/c;Lz2/k;Lu2/c;)V

    iput-object v0, p0, Lz2/k;->g:Lz2/m;

    return-object v0
.end method
