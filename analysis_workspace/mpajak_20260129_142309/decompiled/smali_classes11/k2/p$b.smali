.class public final Lk2/p$b;
.super Ljava/util/AbstractSet;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lk2/p;


# direct methods
.method public constructor <init>(Lk2/p;)V
    .locals 0

    iput-object p1, p0, Lk2/p$b;->b:Lk2/p;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    iget-object v0, p0, Lk2/p$b;->b:Lk2/p;

    invoke-virtual {v0}, Lk2/p;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lk2/p$b;->b:Lk2/p;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lk2/p;->b(Ljava/util/Map$Entry;)Lk2/p$e;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lk2/p$b$a;

    invoke-direct {v0, p0}, Lk2/p$b$a;-><init>(Lk2/p$b;)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lk2/p$b;->b:Lk2/p;

    check-cast p1, Ljava/util/Map$Entry;

    invoke-virtual {v0, p1}, Lk2/p;->b(Ljava/util/Map$Entry;)Lk2/p$e;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lk2/p$b;->b:Lk2/p;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lk2/p;->e(Lk2/p$e;Z)V

    return v1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lk2/p$b;->b:Lk2/p;

    iget v0, v0, Lk2/p;->d:I

    return v0
.end method
