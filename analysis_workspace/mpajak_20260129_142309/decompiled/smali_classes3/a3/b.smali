.class public abstract La3/b;
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
.field public static f:Lx2/c;


# instance fields
.field public final a:Ld3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/c<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Lv2/g;

.field public final d:Ljava/lang/String;

.field public final e:[Lv2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, La3/b;

    invoke-static {v0}, Lx2/d;->a(Ljava/lang/Class;)Lx2/c;

    move-result-object v0

    sput-object v0, La3/b;->f:Lx2/c;

    return-void
.end method

.method public constructor <init>(Ld3/c;Ljava/lang/String;[Lv2/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld3/c<",
            "TT;TID;>;",
            "Ljava/lang/String;",
            "[",
            "Lv2/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/b;->a:Ld3/c;

    iget-object v0, p1, Ld3/c;->b:Ljava/lang/Class;

    iput-object v0, p0, La3/b;->b:Ljava/lang/Class;

    iget-object p1, p1, Ld3/c;->f:Lv2/g;

    iput-object p1, p0, La3/b;->c:Lv2/g;

    iput-object p2, p0, La3/b;->d:Ljava/lang/String;

    iput-object p3, p0, La3/b;->e:[Lv2/g;

    return-void
.end method

.method public static b(Lu2/c;Ljava/lang/StringBuilder;Lv2/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Ljava/lang/StringBuilder;",
            "Lv2/g;",
            "Ljava/util/List<",
            "Lv2/g;",
            ">;)V"
        }
    .end annotation

    iget-object p2, p2, Lv2/g;->d:Ljava/lang/String;

    check-cast p0, Lu2/a;

    invoke-virtual {p0, p1, p2}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 p0, 0x20

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static c(Lu2/c;Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p0, Lu2/a;

    invoke-virtual {p0, p1, p3}, Lu2/a;->a(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    const/16 p0, 0x20

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static d(Lu2/c;Lv2/g;Ljava/lang/StringBuilder;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu2/c;",
            "Lv2/g;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/List<",
            "Lv2/g;",
            ">;)V"
        }
    .end annotation

    const-string v0, "WHERE "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p2, p1}, La3/b;->b(Lu2/c;Ljava/lang/StringBuilder;Lv2/g;)V

    const-string p0, "= ?"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, La3/b;->e:[Lv2/g;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, La3/b;->e:[Lv2/g;

    array-length v3, v2

    if-ge v1, v3, :cond_3

    aget-object v2, v2, v1

    iget-object v3, v2, Lv2/g;->e:Lv2/e;

    iget-boolean v3, v3, Lv2/e;->z:Z

    if-eqz v3, :cond_1

    invoke-virtual {v2, p1}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lv2/g;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v3, 0x0

    :cond_0
    aput-object v3, v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2, p1}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Lv2/g;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    aput-object v3, v0, v1

    :goto_1
    aget-object v3, v0, v1

    if-nez v3, :cond_2

    iget-object v2, v2, Lv2/g;->m:Ljava/lang/Object;

    if-eqz v2, :cond_2

    aput-object v2, v0, v1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "MappedStatement: "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
