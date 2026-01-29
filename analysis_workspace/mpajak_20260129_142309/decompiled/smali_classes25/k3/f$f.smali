.class public final Lk3/f$f;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/f;->q(Landroid/content/Context;)V
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

    iput-object p1, p0, Lk3/f$f;->a:Ljava/util/List;

    iput-object p2, p0, Lk3/f$f;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 3
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

    if-eqz v0, :cond_1

    iget-object p2, p2, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {p2}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lk3/i;->a:[B

    invoke-static {p2, v0}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v0, "code"

    invoke-virtual {p2, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    iget-object p2, p0, Lk3/f$f;->a:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/superbock/bean/BInfo;

    invoke-virtual {v1, v0}, Lcom/superbock/bean/BInfo;->setUp(I)V

    invoke-static {}, Lg3/c;->a()Lg3/c;

    move-result-object v2

    iget-object v2, v2, Lg3/c;->a:Lt2/g;

    invoke-interface {v2, v1}, Lt2/g;->d(Ljava/lang/Object;)I

    goto :goto_0

    :cond_0
    sput-boolean p1, Lk3/f;->g:Z

    iget-object p2, p0, Lk3/f$f;->b:Landroid/content/Context;

    invoke-static {p2}, Lk3/f;->q(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    sput-boolean p1, Lk3/f;->g:Z

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

    sput-boolean p1, Lk3/f;->g:Z

    return-void
.end method
