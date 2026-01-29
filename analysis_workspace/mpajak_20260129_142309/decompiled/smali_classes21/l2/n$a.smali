.class public final Ll2/n$a;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Li2/z<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lk2/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk2/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ll2/n$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk2/q;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk2/q<",
            "TT;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ll2/n$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Li2/z;-><init>()V

    iput-object p1, p0, Ll2/n$a;->a:Lk2/q;

    iput-object p2, p0, Ll2/n$a;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/a;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp2/a;->I()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Ll2/n$a;->a:Lk2/q;

    invoke-interface {v0}, Lk2/q;->c()Ljava/lang/Object;

    move-result-object v0

    :try_start_0
    invoke-virtual {p1}, Lp2/a;->b()V

    :goto_0
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1}, Lp2/a;->E()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll2/n$a;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll2/n$b;

    if-eqz v1, :cond_2

    iget-boolean v2, v1, Ll2/n$b;->c:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1, v0}, Ll2/n$b;->a(Lp2/a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p1}, Lp2/a;->U()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lp2/a;->l()V

    return-object v0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Li2/u;

    invoke-direct {v0, p1}, Li2/u;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/b;",
            "TT;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    return-void

    :cond_0
    invoke-virtual {p1}, Lp2/b;->c()Lp2/b;

    :try_start_0
    iget-object v0, p0, Ll2/n$a;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll2/n$b;

    invoke-virtual {v1, p2}, Ll2/n$b;->c(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v1, Ll2/n$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lp2/b;->n(Ljava/lang/String;)Lp2/b;

    invoke-virtual {v1, p1, p2}, Ll2/n$b;->b(Lp2/b;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lp2/b;->l()Lp2/b;

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
