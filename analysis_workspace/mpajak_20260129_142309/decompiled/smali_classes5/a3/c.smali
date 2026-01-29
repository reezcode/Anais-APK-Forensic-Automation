.class public final La3/c;
.super La3/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La3/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "La3/b<",
        "TT;TID;>;"
    }
.end annotation


# static fields
.field public static final synthetic i:I


# instance fields
.field public g:Ljava/lang/String;

.field public h:I


# direct methods
.method public constructor <init>(Ld3/c;Ljava/lang/String;[Lv2/g;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/c<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lv2/g;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, La3/b;-><init>(Ld3/c;Ljava/lang/String;[Lv2/g;)V

    iget-object p1, p1, Ld3/c;->b:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, La3/c;->g:Ljava/lang/String;

    iput p5, p0, La3/c;->h:I

    return-void
.end method

.method public static g(Lu2/c;Lv2/g;)Z
    .locals 3

    iget-object v0, p1, Lv2/g;->e:Lv2/e;

    iget-boolean v1, v0, Lv2/e;->F:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-boolean v0, v0, Lv2/e;->E:Z

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean p0, p1, Lv2/g;->g:Z

    if-eqz p0, :cond_2

    invoke-virtual {p1}, Lv2/g;->n()Z

    move-result p0

    if-nez p0, :cond_2

    iget-object p0, p1, Lv2/g;->e:Lv2/e;

    iget-boolean p0, p0, Lv2/e;->z:Z

    if-nez p0, :cond_2

    return v2

    :cond_2
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Ljava/lang/Number;Ljava/lang/String;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Number;",
            "Ljava/lang/String;",
            "Lt2/m;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, La3/b;->c:Lv2/g;

    iget-object v1, v0, Lv2/g;->l:Lv2/a;

    invoke-interface {v1, p2}, Lv2/a;->a(Ljava/lang/Number;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, p1, v1, v2, v3}, Lv2/g;->b(Ljava/lang/Object;Ljava/lang/Object;ZLt2/m;)V

    sget-object p1, La3/b;->f:Lx2/c;

    sget-object v4, Lx2/b$a;->d:Lx2/b$a;

    iget-object p1, p1, Lx2/c;->a:Lx2/b;

    invoke-interface {p1, v4}, Lx2/b;->b(Lx2/b$a;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v3, La3/b;->f:Lx2/c;

    const/4 p1, 0x4

    new-array v10, p1, [Ljava/lang/Object;

    aput-object p2, v10, v2

    const/4 p1, 0x1

    aput-object p3, v10, p1

    const/4 p1, 0x2

    iget-object p2, p0, La3/b;->c:Lv2/g;

    invoke-virtual {p2}, Lv2/g;->g()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v10, p1

    const/4 p1, 0x3

    iget-object p2, p0, La3/c;->g:Ljava/lang/String;

    aput-object p2, v10, p1

    sget-object v9, Lx2/c;->b:Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "assigned id \'{}\' from {} to \'{}\' in {} object"

    move-object v7, v9

    move-object v8, v9

    invoke-virtual/range {v3 .. v10}, Lx2/c;->f(Lx2/b$a;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "Invalid class "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object p3, v0, Lv2/g;->l:Lv2/a;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " for sequence-id "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
