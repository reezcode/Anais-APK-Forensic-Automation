.class public final Lz2/m;
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


# instance fields
.field public final a:Ld3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/c<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final b:Lz2/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/k<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final c:Lu2/c;

.field public d:[Lb3/b;

.field public e:I

.field public f:Lb3/e;


# direct methods
.method public constructor <init>(Ld3/c;Lz2/k;Lu2/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/c<",
            "TT;TID;>;",
            "Lz2/k<",
            "TT;TID;>;",
            "Lu2/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [Lb3/b;

    iput-object v0, p0, Lz2/m;->d:[Lb3/b;

    const/4 v0, 0x0

    iput-object v0, p0, Lz2/m;->f:Lb3/e;

    iput-object p1, p0, Lz2/m;->a:Ld3/c;

    iput-object p2, p0, Lz2/m;->b:Lz2/k;

    iget-object p1, p1, Ld3/c;->f:Lv2/g;

    iput-object p3, p0, Lz2/m;->c:Lu2/c;

    return-void
.end method


# virtual methods
.method public final a(Lb3/b;)V
    .locals 1

    iget-object v0, p0, Lz2/m;->f:Lb3/e;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lz2/m;->k(Lb3/b;)V

    goto :goto_0

    :cond_0
    iput-object p1, v0, Lb3/e;->b:Lb3/b;

    const/4 p1, 0x0

    iput-object p1, p0, Lz2/m;->f:Lb3/e;

    :goto_0
    return-void
.end method

.method public final b()Lz2/m;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lb3/e;

    iget v1, p0, Lz2/m;->e:I

    if-eqz v1, :cond_1

    iget-object v2, p0, Lz2/m;->d:[Lb3/b;

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lz2/m;->e:I

    aget-object v3, v2, v1

    const/4 v4, 0x0

    aput-object v4, v2, v1

    invoke-direct {v0, v3}, Lb3/e;-><init>(Lb3/b;)V

    invoke-virtual {p0, v0}, Lz2/m;->k(Lb3/b;)V

    iget-object v1, p0, Lz2/m;->f:Lb3/e;

    if-nez v1, :cond_0

    iput-object v0, p0, Lz2/m;->f:Lb3/e;

    return-object p0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lz2/m;->f:Lb3/e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " is already waiting for a future clause, can\'t add: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expecting there to be a clause already defined for \'AND\' operation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lb3/g;

    invoke-virtual {p0, p1}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v1

    const-string v2, "="

    invoke-direct {v0, p1, v1, p2, v2}, Lb3/g;-><init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lz2/m;->a(Lb3/b;)V

    return-object p0
.end method

.method public final d(Ljava/lang/String;)Lv2/g;
    .locals 1

    iget-object v0, p0, Lz2/m;->a:Ld3/c;

    invoke-virtual {v0, p1}, Ld3/c;->b(Ljava/lang/String;)Lv2/g;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/lang/Object;)Lz2/m;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lb3/g;

    const-string v1, "ty"

    invoke-virtual {p0, v1}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v2

    const-string v3, ">="

    invoke-direct {v0, v1, v2, p1, v3}, Lb3/g;-><init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lz2/m;->a(Lb3/b;)V

    return-object p0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lb3/g;

    invoke-virtual {p0, p1}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v1

    const-string v2, ">"

    invoke-direct {v0, p1, v1, p2, v2}, Lb3/g;-><init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lz2/m;->a(Lb3/b;)V

    return-object p0
.end method

.method public final g(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lb3/g;

    invoke-virtual {p0, p1}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v1

    const-string v2, "<="

    invoke-direct {v0, p1, v1, p2, v2}, Lb3/g;-><init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lz2/m;->a(Lb3/b;)V

    return-object p0
.end method

.method public final h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lb3/g;

    invoke-virtual {p0, p1}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v1

    const-string v2, "LIKE"

    invoke-direct {v0, p1, v1, p2, v2}, Lb3/g;-><init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lz2/m;->a(Lb3/b;)V

    return-object p0
.end method

.method public final i(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lz2/m<",
            "TT;TID;>;"
        }
    .end annotation

    new-instance v0, Lb3/g;

    invoke-virtual {p0, p1}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v1

    const-string v2, "<"

    invoke-direct {v0, p1, v1, p2, v2}, Lb3/g;-><init>(Ljava/lang/String;Lv2/g;Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lz2/m;->a(Lb3/b;)V

    return-object p0
.end method

.method public final j()Lz2/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz2/f<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lz2/m;->b:Lz2/k;

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    return-object v0
.end method

.method public final k(Lb3/b;)V
    .locals 4

    iget v0, p0, Lz2/m;->e:I

    iget-object v1, p0, Lz2/m;->d:[Lb3/b;

    array-length v1, v1

    if-ne v0, v1, :cond_1

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [Lb3/b;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lz2/m;->e:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lz2/m;->d:[Lb3/b;

    aget-object v3, v2, v1

    aput-object v3, v0, v1

    const/4 v3, 0x0

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, Lz2/m;->d:[Lb3/b;

    :cond_1
    iget-object v0, p0, Lz2/m;->d:[Lb3/b;

    iget v1, p0, Lz2/m;->e:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lz2/m;->e:I

    aput-object p1, v0, v1

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lz2/m;->e:I

    if-nez v0, :cond_0

    const-string v0, "empty where clause"

    return-object v0

    :cond_0
    iget-object v1, p0, Lz2/m;->d:[Lb3/b;

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v1, v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "where clause: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
