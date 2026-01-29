.class public final Lk3/f$c;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/f;->n(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lk3/f$c;->a:Ljava/util/List;

    iput-object p2, p0, Lk3/f$c;->b:Landroid/content/Context;

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

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p2}, Ls3/b0;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p2, p2, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {p2}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lk3/i;->a:[B

    invoke-static {p2, v0}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p2

    if-eqz p2, :cond_2

    const-string v0, "code"

    invoke-virtual {p2, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const-string v0, "needIcon"

    invoke-virtual {p2, v0}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-class v0, Ljava/lang/String;

    invoke-static {p2, v0}, Lf/a;->t(Ljava/lang/String;Ljava/lang/Class;)Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lk3/f$c;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/superbock/bean/AInfo;

    if-eqz p2, :cond_0

    invoke-virtual {v2}, Lcom/superbock/bean/AInfo;->getPk()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2, v1}, Lcom/superbock/bean/AInfo;->setNi(I)V

    :cond_0
    invoke-virtual {v2, v1}, Lcom/superbock/bean/AInfo;->setUp(I)V

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lg3/a;->d(Lcom/superbock/bean/AInfo;)V

    iget-object v3, p0, Lk3/f$c;->b:Landroid/content/Context;

    invoke-static {v2, v3}, Lk3/f;->u(Lcom/superbock/bean/AInfo;Landroid/content/Context;)V

    goto :goto_0

    :cond_1
    sput-boolean p1, Lk3/f;->f:Z

    iget-object p2, p0, Lk3/f$c;->b:Landroid/content/Context;

    invoke-static {p2}, Lk3/f;->n(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_2
    sput-boolean p1, Lk3/f;->f:Z

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

    sput-boolean p1, Lk3/f;->f:Z

    return-void
.end method
