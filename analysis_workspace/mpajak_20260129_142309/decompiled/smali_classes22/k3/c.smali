.class public final Lk3/c;
.super Ljava/lang/Object;


# static fields
.field public static a:Z


# direct methods
.method public static a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-boolean v1, Lk3/c;->a:Z

    return-void

    :cond_0
    invoke-interface {p0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Lk3/c$a;

    invoke-direct {v1, v0, p0}, Lk3/c$a;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {}, Lk3/b;->a()Ls3/w;

    move-result-object p0

    new-instance v2, Ls3/y$a;

    invoke-direct {v2}, Ls3/y$a;-><init>()V

    invoke-virtual {v2, v0}, Ls3/y$a;->e(Ljava/lang/String;)Ls3/y$a;

    invoke-virtual {v2}, Ls3/y$a;->a()Ls3/y;

    move-result-object v0

    invoke-virtual {p0, v0}, Ls3/w;->a(Ls3/y;)Ls3/d;

    move-result-object p0

    check-cast p0, Lw3/e;

    invoke-virtual {p0, v1}, Lw3/e;->e(Ls3/e;)V

    return-void
.end method
