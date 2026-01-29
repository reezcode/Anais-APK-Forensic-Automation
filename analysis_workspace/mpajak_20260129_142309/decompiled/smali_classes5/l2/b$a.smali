.class public final Ll2/b$a;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Li2/z<",
        "Ljava/util/Collection<",
        "TE;>;>;"
    }
.end annotation


# instance fields
.field public final a:Ll2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final b:Lk2/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk2/q<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li2/i;Ljava/lang/reflect/Type;Li2/z;Lk2/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/i;",
            "Ljava/lang/reflect/Type;",
            "Li2/z<",
            "TE;>;",
            "Lk2/q<",
            "+",
            "Ljava/util/Collection<",
            "TE;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Li2/z;-><init>()V

    new-instance v0, Ll2/p;

    invoke-direct {v0, p1, p3, p2}, Ll2/p;-><init>(Li2/i;Li2/z;Ljava/lang/reflect/Type;)V

    iput-object v0, p0, Ll2/b$a;->a:Ll2/p;

    iput-object p4, p0, Ll2/b$a;->b:Lk2/q;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp2/a;->I()V

    const/4 p1, 0x0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ll2/b$a;->b:Lk2/q;

    invoke-interface {v0}, Lk2/q;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p1}, Lp2/a;->a()V

    :goto_0
    invoke-virtual {p1}, Lp2/a;->r()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll2/b$a;->a:Ll2/p;

    invoke-virtual {v1, p1}, Ll2/p;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lp2/a;->f()V

    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 2

    check-cast p2, Ljava/util/Collection;

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lp2/b;->b()Lp2/b;

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Ll2/b$a;->a:Ll2/p;

    invoke-virtual {v1, p1, v0}, Ll2/p;->b(Lp2/b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lp2/b;->f()Lp2/b;

    :goto_1
    return-void
.end method
