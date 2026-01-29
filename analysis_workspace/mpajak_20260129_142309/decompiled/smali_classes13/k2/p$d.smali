.class public abstract Lk2/p$d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public b:Lk2/p$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk2/p$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public c:Lk2/p$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk2/p$e<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public d:I

.field public final synthetic e:Lk2/p;


# direct methods
.method public constructor <init>(Lk2/p;)V
    .locals 1

    iput-object p1, p0, Lk2/p$d;->e:Lk2/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lk2/p;->f:Lk2/p$e;

    iget-object v0, v0, Lk2/p$e;->e:Lk2/p$e;

    iput-object v0, p0, Lk2/p$d;->b:Lk2/p$e;

    const/4 v0, 0x0

    iput-object v0, p0, Lk2/p$d;->c:Lk2/p$e;

    iget p1, p1, Lk2/p;->e:I

    iput p1, p0, Lk2/p$d;->d:I

    return-void
.end method


# virtual methods
.method public final a()Lk2/p$e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lk2/p$e<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lk2/p$d;->b:Lk2/p$e;

    iget-object v1, p0, Lk2/p$d;->e:Lk2/p;

    iget-object v2, v1, Lk2/p;->f:Lk2/p$e;

    if-eq v0, v2, :cond_1

    iget v1, v1, Lk2/p;->e:I

    iget v2, p0, Lk2/p$d;->d:I

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Lk2/p$e;->e:Lk2/p$e;

    iput-object v1, p0, Lk2/p$d;->b:Lk2/p$e;

    iput-object v0, p0, Lk2/p$d;->c:Lk2/p$e;

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final hasNext()Z
    .locals 2

    iget-object v0, p0, Lk2/p$d;->b:Lk2/p$e;

    iget-object v1, p0, Lk2/p$d;->e:Lk2/p;

    iget-object v1, v1, Lk2/p;->f:Lk2/p$e;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final remove()V
    .locals 3

    iget-object v0, p0, Lk2/p$d;->c:Lk2/p$e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lk2/p$d;->e:Lk2/p;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lk2/p;->e(Lk2/p$e;Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lk2/p$d;->c:Lk2/p$e;

    iget-object v0, p0, Lk2/p$d;->e:Lk2/p;

    iget v0, v0, Lk2/p;->e:I

    iput v0, p0, Lk2/p$d;->d:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
