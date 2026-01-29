.class public final Lb3/e;
.super Ljava/lang/Object;

# interfaces
.implements Lb3/b;


# instance fields
.field public final a:Lb3/b;

.field public b:Lb3/b;


# direct methods
.method public constructor <init>(Lb3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/e;->a:Lb3/b;

    const/4 p1, 0x0

    iput-object p1, p0, Lb3/e;->b:Lb3/b;

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

    const-string v0, "("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lb3/e;->a:Lb3/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lb3/b;->a(Lu2/c;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    iget-object v0, p0, Lb3/e;->b:Lb3/b;

    if-eqz v0, :cond_0

    const-string v0, "AND"

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lb3/e;->b:Lb3/b;

    invoke-interface {v0, p1, p2, p3, p4}, Lb3/b;->a(Lu2/c;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    :cond_0
    const-string p1, ") "

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
