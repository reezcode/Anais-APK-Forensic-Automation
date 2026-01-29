.class public final Lk3/f$h;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/f;->s(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/superbock/bean/KInfo;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/superbock/bean/KInfo;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lk3/f$h;->a:Lcom/superbock/bean/KInfo;

    iput-object p2, p0, Lk3/f$h;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 1
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

    sget-object v0, Lk3/i;->a:[B

    invoke-static {p2, v0}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p2

    if-eqz p2, :cond_0

    const-string v0, "code"

    invoke-virtual {p2, v0}, Lf/e;->z(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    iget-object p2, p0, Lk3/f$h;->a:Lcom/superbock/bean/KInfo;

    invoke-virtual {p2, v0}, Lcom/superbock/bean/KInfo;->setUp(I)V

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object p2

    iget-object v0, p0, Lk3/f$h;->a:Lcom/superbock/bean/KInfo;

    iget-object p2, p2, Lg3/l;->a:Lt2/g;

    invoke-interface {p2, v0}, Lt2/g;->d(Ljava/lang/Object;)I

    sput-boolean p1, Lk3/f;->k:Z

    iget-object p2, p0, Lk3/f$h;->b:Landroid/content/Context;

    invoke-static {p2}, Lk3/f;->s(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    sput-boolean p1, Lk3/f;->k:Z

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

    sput-boolean p1, Lk3/f;->k:Z

    return-void
.end method
