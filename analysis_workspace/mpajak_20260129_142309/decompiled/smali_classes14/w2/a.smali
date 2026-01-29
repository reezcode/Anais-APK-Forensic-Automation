.class public abstract Lw2/a;
.super Ld1/f;

# interfaces
.implements Lv2/a;


# instance fields
.field public final b:I

.field public final c:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(I[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld1/f;-><init>()V

    iput p1, p0, Lw2/a;->b:I

    iput-object p2, p0, Lw2/a;->c:[Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Number;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b()[Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f(Lv2/g;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final g()[Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lw2/a;->c:[Ljava/lang/Class;

    return-object v0
.end method

.method public h()Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lw2/a;->c:[Ljava/lang/Class;

    array-length v1, v0

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final i()Z
    .locals 1

    invoke-virtual {p0}, Lw2/a;->j()Z

    move-result v0

    return v0
.end method

.method public j()Z
    .locals 0

    instance-of p0, p0, Lw2/d;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public k()Z
    .locals 0

    instance-of p0, p0, Lw2/j0;

    return p0
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m(Ljava/lang/reflect/Field;)Z
    .locals 7

    iget-object v0, p0, Lw2/a;->c:[Ljava/lang/Class;

    array-length v1, v0

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    :cond_0
    array-length v1, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_2

    aget-object v5, v0, v4

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_1

    return v2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    return v3
.end method

.method public n()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public p()Z
    .locals 0

    instance-of p0, p0, Lw2/i;

    return p0
.end method

.method public q()Ljava/lang/Object;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Should not have tried to generate this type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public r()Z
    .locals 0

    instance-of p0, p0, Lw2/d;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public final s()I
    .locals 1

    iget v0, p0, Lw2/a;->b:I

    return v0
.end method

.method public t()Z
    .locals 0

    instance-of p0, p0, Lw2/h;

    return p0
.end method

.method public u()Z
    .locals 0

    instance-of p0, p0, Lw2/c0;

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public w()Z
    .locals 0

    instance-of p0, p0, Lw2/j0;

    return p0
.end method
