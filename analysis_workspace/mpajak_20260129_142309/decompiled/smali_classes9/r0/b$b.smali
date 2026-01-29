.class public final Lr0/b$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lr0/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/j<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Lp0/b;


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lr0/b$b;

    if-eqz v1, :cond_0

    check-cast p1, Lr0/b$b;

    iget-object v1, p0, Lr0/b$b;->a:Lr0/j;

    iget-object v2, p1, Lr0/b$b;->a:Lr0/j;

    invoke-static {v1, v2}, Ls0/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lr0/b$b;->b:Lp0/b;

    iget-object p1, p1, Lr0/b$b;->b:Lp0/b;

    invoke-static {v1, p1}, Ls0/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lr0/b$b;->a:Lr0/j;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lr0/b$b;->b:Lp0/b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ls0/d$a;

    invoke-direct {v0, p0}, Ls0/d$a;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lr0/b$b;->a:Lr0/j;

    const-string v2, "key"

    invoke-virtual {v0, v2, v1}, Ls0/d$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ls0/d$a;

    iget-object v1, p0, Lr0/b$b;->b:Lp0/b;

    const-string v2, "feature"

    invoke-virtual {v0, v2, v1}, Ls0/d$a;->a(Ljava/lang/String;Ljava/lang/Object;)Ls0/d$a;

    invoke-virtual {v0}, Ls0/d$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
