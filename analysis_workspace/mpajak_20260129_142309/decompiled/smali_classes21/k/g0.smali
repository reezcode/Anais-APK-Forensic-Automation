.class public final Lk/g0;
.super Lk/z0;


# instance fields
.field public final i:Lk/x0;

.field public final j:Lk/a1;

.field public k:I

.field public l:Ljava/lang/String;

.field public m:Ljava/text/SimpleDateFormat;

.field public n:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Lk/v0;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lk/v0;

.field public p:Ljava/util/TimeZone;

.field public q:Ljava/util/Locale;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lk/a1;

    invoke-direct {v0}, Lk/a1;-><init>()V

    sget-object v1, Lk/x0;->f:Lk/x0;

    invoke-direct {p0, v0, v1}, Lk/g0;-><init>(Lk/a1;Lk/x0;)V

    return-void
.end method

.method public constructor <init>(Lk/a1;Lk/x0;)V
    .locals 1

    invoke-direct {p0}, Lk/z0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk/g0;->k:I

    const-string v0, "\t"

    iput-object v0, p0, Lk/g0;->l:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lk/g0;->n:Ljava/util/IdentityHashMap;

    sget-object v0, Lf/a;->b:Ljava/util/TimeZone;

    iput-object v0, p0, Lk/g0;->p:Ljava/util/TimeZone;

    sget-object v0, Lf/a;->c:Ljava/util/Locale;

    iput-object v0, p0, Lk/g0;->q:Ljava/util/Locale;

    iput-object p1, p0, Lk/g0;->j:Lk/a1;

    iput-object p2, p0, Lk/g0;->i:Lk/x0;

    return-void
.end method


# virtual methods
.method public final i(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Lk/g0;->n:Ljava/util/IdentityHashMap;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk/v0;

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object p1, p1, Lk/v0;->c:Ljava/lang/Object;

    if-eqz p1, :cond_2

    instance-of v0, p1, Ljava/lang/Integer;

    if-nez v0, :cond_2

    instance-of p1, p1, Ljava/lang/String;

    if-eqz p1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public final j()V
    .locals 1

    iget v0, p0, Lk/g0;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lk/g0;->k:I

    return-void
.end method

.method public final k(Ljava/lang/Class;)Lk/q0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lk/q0;"
        }
    .end annotation

    iget-object v0, p0, Lk/g0;->i:Lk/x0;

    invoke-virtual {v0, p1}, Lk/x0;->c(Ljava/lang/Class;)Lk/q0;

    move-result-object p1

    return-object p1
.end method

.method public final l()V
    .locals 1

    iget v0, p0, Lk/g0;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lk/g0;->k:I

    return-void
.end method

.method public final m(Ljava/lang/reflect/Type;)Z
    .locals 2

    iget-object v0, p0, Lk/g0;->j:Lk/a1;

    sget-object v1, Lk/b1;->p:Lk/b1;

    invoke-virtual {v0, v1}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    iget-object p1, p0, Lk/g0;->j:Lk/a1;

    sget-object v0, Lk/b1;->u:Lk/b1;

    invoke-virtual {p1, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lk/g0;->o:Lk/v0;

    if-eqz p1, :cond_1

    iget-object p1, p1, Lk/v0;->a:Lk/v0;

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final n()V
    .locals 3

    iget-object v0, p0, Lk/g0;->j:Lk/a1;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lk/a1;->write(I)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lk/g0;->k:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lk/g0;->j:Lk/a1;

    iget-object v2, p0, Lk/g0;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lk/a1;->write(Ljava/lang/String;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final o(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-virtual/range {v0 .. v5}, Lk/g0;->p(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;II)V

    return-void
.end method

.method public final p(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    iget-object p5, p0, Lk/g0;->j:Lk/a1;

    iget-boolean p5, p5, Lk/a1;->i:Z

    if-eqz p5, :cond_0

    return-void

    :cond_0
    new-instance p5, Lk/v0;

    invoke-direct {p5, p1, p2, p3, p4}, Lk/v0;-><init>(Lk/v0;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object p5, p0, Lk/g0;->o:Lk/v0;

    iget-object p1, p0, Lk/g0;->n:Ljava/util/IdentityHashMap;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lk/g0;->n:Ljava/util/IdentityHashMap;

    :cond_1
    iget-object p1, p0, Lk/g0;->n:Ljava/util/IdentityHashMap;

    iget-object p3, p0, Lk/g0;->o:Lk/v0;

    invoke-virtual {p1, p2, p3}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 7

    if-nez p1, :cond_0

    iget-object p1, p0, Lk/g0;->j:Lk/a1;

    invoke-virtual {p1}, Lk/a1;->E()V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk/g0;->k(Ljava/lang/Class;)Lk/q0;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    :try_start_0
    invoke-interface/range {v1 .. v6}, Lk/q0;->d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lf/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final r(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lk/g0;->j:Lk/a1;

    if-nez p1, :cond_0

    sget-object p1, Lk/b1;->j:Lk/b1;

    invoke-virtual {v0, p1}, Lk/a1;->I(Lk/b1;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lk/a1;->J(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public final s()V
    .locals 1

    iget-object v0, p0, Lk/g0;->j:Lk/a1;

    invoke-virtual {v0}, Lk/a1;->E()V

    return-void
.end method

.method public final t(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lk/g0;->o:Lk/v0;

    iget-object v1, v0, Lk/v0;->b:Ljava/lang/Object;

    if-ne p1, v1, :cond_0

    iget-object p1, p0, Lk/g0;->j:Lk/a1;

    const-string v0, "{\"$ref\":\"@\"}"

    :goto_0
    invoke-virtual {p1, v0}, Lk/a1;->write(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, v0, Lk/v0;->a:Lk/v0;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lk/v0;->b:Ljava/lang/Object;

    if-ne p1, v1, :cond_1

    iget-object p1, p0, Lk/g0;->j:Lk/a1;

    const-string v0, "{\"$ref\":\"..\"}"

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v1, v0, Lk/v0;->a:Lk/v0;

    if-nez v1, :cond_3

    iget-object v0, v0, Lk/v0;->b:Ljava/lang/Object;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lk/g0;->j:Lk/a1;

    const-string v0, "{\"$ref\":\"$\"}"

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lk/g0;->j:Lk/a1;

    const-string v1, "{\"$ref\":\""

    invoke-virtual {v0, v1}, Lk/a1;->write(Ljava/lang/String;)V

    iget-object v0, p0, Lk/g0;->j:Lk/a1;

    iget-object v1, p0, Lk/g0;->n:Ljava/util/IdentityHashMap;

    invoke-virtual {v1, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk/v0;

    invoke-virtual {p1}, Lk/v0;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk/a1;->write(Ljava/lang/String;)V

    iget-object p1, p0, Lk/g0;->j:Lk/a1;

    const-string v0, "\"}"

    :goto_2
    invoke-virtual {p1, v0}, Lk/a1;->write(Ljava/lang/String;)V

    return-void

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lk/g0;->j:Lk/a1;

    invoke-virtual {v0}, Lk/a1;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
