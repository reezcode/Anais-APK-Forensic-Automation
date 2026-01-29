.class public final Lk3/g;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# instance fields
.field public final synthetic a:Lcom/superbock/bean/EInfo;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lk3/g;->a:Lcom/superbock/bean/EInfo;

    iput-object p2, p0, Lk3/g;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 2
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ls3/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p2}, Ls3/b0;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p2, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {p2}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "status"

    invoke-virtual {p2, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    const/16 v1, 0xc8

    if-ne v0, v1, :cond_0

    const-string v0, "data"

    invoke-virtual {p2, v0}, Lf/e;->A(Ljava/lang/String;)Lf/e;

    move-result-object p2

    iget-object v0, p0, Lk3/g;->a:Lcom/superbock/bean/EInfo;

    const-string v1, "media"

    invoke-virtual {p2, v1}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/superbock/bean/EInfo;->setMe(Ljava/lang/String;)V

    iget-object v0, p0, Lk3/g;->a:Lcom/superbock/bean/EInfo;

    const-string v1, "thumb"

    invoke-virtual {p2, v1}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/superbock/bean/EInfo;->setTh(Ljava/lang/String;)V

    invoke-static {}, Lg3/f;->a()Lg3/f;

    move-result-object p2

    iget-object v0, p0, Lk3/g;->a:Lcom/superbock/bean/EInfo;

    invoke-virtual {p2, v0}, Lg3/f;->d(Lcom/superbock/bean/EInfo;)V

    iget-object p2, p0, Lk3/g;->a:Lcom/superbock/bean/EInfo;

    iget-object v0, p0, Lk3/g;->b:Landroid/content/Context;

    invoke-static {p2, v0}, Lk3/f;->v(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    sput-boolean p1, Lk3/f;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    sput-boolean p1, Lk3/f;->j:Z

    :goto_0
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

    const/4 p1, 0x0

    sput-boolean p1, Lk3/f;->j:Z

    return-void
.end method
