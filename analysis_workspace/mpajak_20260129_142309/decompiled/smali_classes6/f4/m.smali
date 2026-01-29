.class public final Lf4/m;
.super Lf4/b0;


# instance fields
.field public e:Lf4/b0;


# direct methods
.method public constructor <init>(Lf4/b0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lf4/b0;-><init>()V

    iput-object p1, p0, Lf4/m;->e:Lf4/b0;

    return-void
.end method


# virtual methods
.method public final a()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0}, Lf4/b0;->a()Lf4/b0;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lf4/b0;
    .locals 1

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0}, Lf4/b0;->b()Lf4/b0;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0}, Lf4/b0;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)Lf4/b0;
    .locals 1

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0, p1, p2}, Lf4/b0;->d(J)Lf4/b0;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0}, Lf4/b0;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0}, Lf4/b0;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;
    .locals 1

    const-string v0, "unit"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0, p1, p2, p3}, Lf4/b0;->g(JLjava/util/concurrent/TimeUnit;)Lf4/b0;

    move-result-object p1

    return-object p1
.end method

.method public final h()J
    .locals 2

    iget-object v0, p0, Lf4/m;->e:Lf4/b0;

    invoke-virtual {v0}, Lf4/b0;->h()J

    move-result-wide v0

    return-wide v0
.end method
