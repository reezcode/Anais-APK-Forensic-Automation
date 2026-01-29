.class public final Li3/q;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 4
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ls3/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string p1, "installHide"

    const-string v0, "topbar"

    const-string v1, "webSite"

    :try_start_0
    invoke-virtual {p2}, Ls3/b0;->b()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p2, p2, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {p2}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object p2

    sget-object v2, Lk3/i;->a:[B

    invoke-static {p2, v2}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v2, "code"

    invoke-virtual {p2, v2}, Lf/e;->z(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_1

    const-string v2, "data"

    invoke-virtual {p2, v2}, Lf/e;->A(Ljava/lang/String;)Lf/e;

    move-result-object p2

    invoke-virtual {p2, v1}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2, v1}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lk/j0;->C(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lk/j0;->B(I)V

    :cond_0
    invoke-virtual {p2, p1}, Lf/e;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Lf/e;->z(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lk/j0;->z(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public final b(Ls3/d;Ljava/io/IOException;)V
    .locals 0
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method
