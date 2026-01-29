.class public final Ll2/g;
.super Lp2/b;


# static fields
.field public static final q:Ll2/g$a;

.field public static final r:Li2/s;


# instance fields
.field public final n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li2/n;",
            ">;"
        }
    .end annotation
.end field

.field public o:Ljava/lang/String;

.field public p:Li2/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll2/g$a;

    invoke-direct {v0}, Ll2/g$a;-><init>()V

    sput-object v0, Ll2/g;->q:Ll2/g$a;

    new-instance v0, Li2/s;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Li2/s;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll2/g;->r:Li2/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ll2/g;->q:Ll2/g$a;

    invoke-direct {p0, v0}, Lp2/b;-><init>(Ljava/io/Writer;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    sget-object v0, Li2/p;->a:Li2/p;

    iput-object v0, p0, Ll2/g;->p:Li2/n;

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Number;)Lp2/b;
    .locals 3

    if-nez p1, :cond_0

    sget-object p1, Li2/p;->a:Li2/p;

    invoke-virtual {p0, p1}, Ll2/g;->K(Li2/n;)V

    return-object p0

    :cond_0
    iget-boolean v0, p0, Lp2/b;->g:Z

    if-nez v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "JSON forbids NaN and infinities: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    new-instance v0, Li2/s;

    invoke-direct {v0, p1}, Li2/s;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    return-object p0
.end method

.method public final E(Ljava/lang/String;)Lp2/b;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Li2/p;->a:Li2/p;

    invoke-virtual {p0, p1}, Ll2/g;->K(Li2/n;)V

    return-object p0

    :cond_0
    new-instance v0, Li2/s;

    invoke-direct {v0, p1}, Li2/s;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    return-object p0
.end method

.method public final H(Z)Lp2/b;
    .locals 1

    new-instance v0, Li2/s;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-direct {v0, p1}, Li2/s;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    return-object p0
.end method

.method public final J()Li2/n;
    .locals 2

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/n;

    return-object v0
.end method

.method public final K(Li2/n;)V
    .locals 2

    iget-object v0, p0, Ll2/g;->o:Ljava/lang/String;

    if-eqz v0, :cond_2

    instance-of v0, p1, Li2/p;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lp2/b;->j:Z

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Ll2/g;->J()Li2/n;

    move-result-object v0

    check-cast v0, Li2/q;

    iget-object v1, p0, Ll2/g;->o:Ljava/lang/String;

    iget-object v0, v0, Li2/q;->a:Lk2/p;

    invoke-virtual {v0, v1, p1}, Lk2/p;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Ll2/g;->o:Ljava/lang/String;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iput-object p1, p0, Ll2/g;->p:Li2/n;

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Ll2/g;->J()Li2/n;

    move-result-object v0

    instance-of v1, v0, Li2/l;

    if-eqz v1, :cond_4

    check-cast v0, Li2/l;

    iget-object v0, v0, Li2/l;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final b()Lp2/b;
    .locals 2

    new-instance v0, Li2/l;

    invoke-direct {v0}, Li2/l;-><init>()V

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    iget-object v1, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final c()Lp2/b;
    .locals 2

    new-instance v0, Li2/q;

    invoke-direct {v0}, Li2/q;-><init>()V

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    iget-object v1, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    sget-object v1, Ll2/g;->r:Li2/s;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Incomplete document"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()Lp2/b;
    .locals 2

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll2/g;->o:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll2/g;->J()Li2/n;

    move-result-object v0

    instance-of v0, v0, Li2/l;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final l()Lp2/b;
    .locals 2

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll2/g;->o:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll2/g;->J()Li2/n;

    move-result-object v0

    instance-of v0, v0, Li2/q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final n(Ljava/lang/String;)Lp2/b;
    .locals 1

    const-string v0, "name == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-object v0, p0, Ll2/g;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll2/g;->o:Ljava/lang/String;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll2/g;->J()Li2/n;

    move-result-object v0

    instance-of v0, v0, Li2/q;

    if-eqz v0, :cond_0

    iput-object p1, p0, Ll2/g;->o:Ljava/lang/String;

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final q()Lp2/b;
    .locals 1

    sget-object v0, Li2/p;->a:Li2/p;

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    return-object p0
.end method

.method public final y(J)Lp2/b;
    .locals 1

    new-instance v0, Li2/s;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-direct {v0, p1}, Li2/s;-><init>(Ljava/lang/Number;)V

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    return-object p0
.end method

.method public final z(Ljava/lang/Boolean;)Lp2/b;
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Li2/p;->a:Li2/p;

    invoke-virtual {p0, p1}, Ll2/g;->K(Li2/n;)V

    return-object p0

    :cond_0
    new-instance v0, Li2/s;

    invoke-direct {v0, p1}, Li2/s;-><init>(Ljava/lang/Boolean;)V

    invoke-virtual {p0, v0}, Ll2/g;->K(Li2/n;)V

    return-object p0
.end method
