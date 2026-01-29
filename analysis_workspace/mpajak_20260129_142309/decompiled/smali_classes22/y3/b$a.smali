.class public abstract Ly3/b$a;
.super Ljava/lang/Object;

# interfaces
.implements Lf4/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "a"
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

    iput-object p1, p0, Ly3/b$a;->d:Ly3/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lf4/m;

    iget-object p1, p1, Ly3/b;->f:Lf4/h;

    invoke-interface {p1}, Lf4/a0;->i()Lf4/b0;

    move-result-object p1

    invoke-direct {v0, p1}, Lf4/m;-><init>(Lf4/b0;)V

    iput-object v0, p0, Ly3/b$a;->b:Lf4/m;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Ly3/b$a;->d:Ly3/b;

    iget v1, v0, Ly3/b;->a:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x5

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Ly3/b$a;->b:Lf4/m;

    invoke-static {v0, v1}, Ly3/b;->i(Ly3/b;Lf4/m;)V

    iget-object v0, p0, Ly3/b$a;->d:Ly3/b;

    iput v2, v0, Ly3/b;->a:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "state: "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Ly3/b$a;->d:Ly3/b;

    iget v2, v2, Ly3/b;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final i()Lf4/b0;
    .locals 1

    iget-object v0, p0, Ly3/b$a;->b:Lf4/m;

    return-object v0
.end method

.method public u(Lf4/f;J)J
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Ly3/b$a;->d:Ly3/b;

    iget-object v0, v0, Ly3/b;->f:Lf4/h;

    invoke-interface {v0, p1, p2, p3}, Lf4/a0;->u(Lf4/f;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, p0, Ly3/b$a;->d:Ly3/b;

    iget-object p2, p2, Ly3/b;->e:Lw3/j;

    invoke-virtual {p2}, Lw3/j;->l()V

    invoke-virtual {p0}, Ly3/b$a;->a()V

    throw p1
.end method
