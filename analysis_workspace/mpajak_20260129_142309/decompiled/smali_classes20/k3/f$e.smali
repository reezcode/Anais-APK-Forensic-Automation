.class public final Lk3/f$e;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/f;->o(Lcom/superbock/bean/AInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/superbock/bean/AInfo;


# direct methods
.method public constructor <init>(Lcom/superbock/bean/AInfo;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lk3/f$e;->a:Lcom/superbock/bean/AInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/d;Ls3/b0;)V
    .locals 0
    .param p1    # Ls3/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ls3/b0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    :try_start_0
    invoke-virtual {p2}, Ls3/b0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p2, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {p1}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lk3/i;->a:[B

    invoke-static {p1, p2}, Ld1/c;->f(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "code"

    invoke-virtual {p1, p2}, Lf/e;->z(Ljava/lang/String;)I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lk3/f$e;->a:Lcom/superbock/bean/AInfo;

    invoke-virtual {p1, p2}, Lcom/superbock/bean/AInfo;->setUp2(I)V

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object p1

    iget-object p2, p0, Lk3/f$e;->a:Lcom/superbock/bean/AInfo;

    invoke-virtual {p1, p2}, Lg3/a;->d(Lcom/superbock/bean/AInfo;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
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
