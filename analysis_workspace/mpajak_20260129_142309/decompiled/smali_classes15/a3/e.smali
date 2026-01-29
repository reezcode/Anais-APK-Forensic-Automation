.class public final La3/e;
.super La3/a;

# interfaces
.implements Lz2/f;
.implements Lz2/e;
.implements Lz2/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "La3/a<",
        "TT;TID;>;",
        "Lz2/f<",
        "TT;>;",
        "Lz2/e<",
        "TT;>;",
        "Lz2/g;"
    }
.end annotation


# instance fields
.field public final k:[Lz2/a;

.field public final l:Ljava/lang/Long;

.field public final m:I


# direct methods
.method public constructor <init>(Ld3/c;Ljava/lang/String;[Lv2/g;[Lv2/g;[Lz2/a;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/c<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lv2/g;",
            "[",
            "Lv2/g;",
            "[",
            "Lz2/a;",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, La3/a;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;[Lv2/g;)V

    iput-object p5, p0, La3/e;->k:[Lz2/a;

    const/4 p1, 0x0

    iput-object p1, p0, La3/e;->l:Ljava/lang/Long;

    iput p6, p0, La3/e;->m:I

    return-void
.end method


# virtual methods
.method public final f(Lc3/d;I)Lc3/b;
    .locals 4

    iget v0, p0, La3/e;->m:I

    if-ne v0, p2, :cond_7

    iget-object v0, p0, La3/b;->d:Ljava/lang/String;

    check-cast p1, Lq2/c;

    invoke-virtual {p1, v0, p2}, Lq2/c;->b(Ljava/lang/String;I)Lc3/b;

    move-result-object p1

    :try_start_0
    iget-object p2, p0, La3/e;->l:Ljava/lang/Long;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Long;->intValue()I

    move-result p2

    move-object v0, p1

    check-cast v0, Lq2/a;

    iget-object v1, v0, Lq2/a;->e:Landroid/database/Cursor;

    if-nez v1, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iput-object p2, v0, Lq2/a;->g:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/sql/SQLException;

    const-string v0, "Query already run. Cannot add argument values."

    invoke-direct {p2, v0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    const/4 p2, 0x0

    sget-object v0, La3/b;->f:Lx2/c;

    sget-object v1, Lx2/b$a;->c:Lx2/b$a;

    iget-object v0, v0, Lx2/c;->a:Lx2/b;

    invoke-interface {v0, v1}, Lx2/b;->b(Lx2/b$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La3/e;->k:[Lz2/a;

    array-length v1, v0

    if-lez v1, :cond_2

    array-length p2, v0

    new-array p2, p2, [Ljava/lang/Object;

    :cond_2
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, La3/e;->k:[Lz2/a;

    array-length v2, v1

    if-ge v0, v2, :cond_5

    aget-object v1, v1, v0

    invoke-interface {v1}, Lz2/a;->a()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, La3/b;->e:[Lv2/g;

    aget-object v2, v2, v0

    if-nez v2, :cond_3

    iget-object v2, p0, La3/e;->k:[Lz2/a;

    aget-object v2, v2, v0

    invoke-interface {v2}, Lz2/a;->c()V

    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Lv2/g;->i()I

    move-result v2

    :goto_2
    move-object v3, p1

    check-cast v3, Lq2/a;

    invoke-virtual {v3, v0, v1, v2}, Lq2/a;->g(ILjava/lang/Object;I)V

    if-eqz p2, :cond_4

    aput-object v1, p2, v0

    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    sget-object v0, La3/b;->f:Lx2/c;

    const-string v2, "prepared statement \'{}\' with {} args"

    iget-object v3, p0, La3/b;->d:Ljava/lang/String;

    array-length v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v2, v3, v1}, Lx2/c;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    if-eqz p2, :cond_6

    sget-object v0, La3/b;->f:Lx2/c;

    const-string v1, "prepared statement arguments: {}"

    invoke-virtual {v0, v1, p2}, Lx2/c;->g(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    return-object p1

    :catchall_0
    move-exception p2

    check-cast p1, Lq2/a;

    invoke-virtual {p1}, Lq2/a;->a()V

    throw p2

    :cond_7
    new-instance p1, Ljava/sql/SQLException;

    const-string v0, "Could not compile this "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, La3/e;->m:I

    invoke-static {v1}, Landroidx/appcompat/widget/a;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " statement since the caller is expecting a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroidx/appcompat/widget/a;->o(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " statement.  Check your QueryBuilder methods."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
