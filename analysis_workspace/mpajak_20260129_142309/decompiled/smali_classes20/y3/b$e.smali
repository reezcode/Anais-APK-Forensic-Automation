.class public final Ly3/b$e;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field public final b:Lf4/m;

.field public c:Z

.field public final synthetic d:Ly3/b;


# direct methods
.method public constructor <init>(Ly3/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly3/b$e;->d:Ly3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf4/m;

    iget-object p1, p1, Ly3/b;->g:Lf4/g;

    invoke-interface {p1}, Lf4/y;->i()Lf4/b0;

    move-result-object p1

    invoke-direct {v0, p1}, Lf4/m;-><init>(Lf4/b0;)V

    iput-object v0, p0, Ly3/b$e;->b:Lf4/m;

    return-void
.end method


# virtual methods
.method public final T(Lf4/f;J)V
    .locals 7

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Ly3/b$e;->c:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-wide v1, p1, Lf4/f;->c:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lt3/c;->c(JJJ)V

    iget-object v0, p0, Ly3/b$e;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0, p1, p2, p3}, Lf4/y;->T(Lf4/f;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 2

    iget-boolean v0, p0, Ly3/b$e;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ly3/b$e;->c:Z

    iget-object v0, p0, Ly3/b$e;->d:Ly3/b;

    iget-object v1, p0, Ly3/b$e;->b:Lf4/m;

    invoke-static {v0, v1}, Ly3/b;->i(Ly3/b;Lf4/m;)V

    iget-object v0, p0, Ly3/b$e;->d:Ly3/b;

    const/4 v1, 0x3

    iput v1, v0, Ly3/b;->a:I

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, Ly3/b$e;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ly3/b$e;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->g:Lf4/g;

    invoke-interface {v0}, Lf4/g;->flush()V

    return-void
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Ly3/b$e;->b:Lf4/m;

    return-object v0
.end method
