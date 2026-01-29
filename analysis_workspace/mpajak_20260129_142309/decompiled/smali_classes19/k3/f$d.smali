.class public final Lk3/f$d;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk3/f;->u(Lcom/superbock/bean/AInfo;Landroid/content/Context;)V
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

    iput-object p1, p0, Lk3/f$d;->a:Lcom/superbock/bean/AInfo;

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

    :try_start_0
    invoke-virtual {p2}, Ls3/b0;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p2, Ls3/b0;->h:Ls3/d0;

    invoke-virtual {p1}, Ls3/d0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lf/a;->u(Ljava/lang/String;)Lf/e;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, "status"

    invoke-virtual {p1, p2}, Lf/e;->z(Ljava/lang/String;)I

    move-result p2

    const/16 v0, 0xc8

    if-ne p2, v0, :cond_0

    const-string p2, "data"

    invoke-virtual {p1, p2}, Lf/e;->A(Ljava/lang/String;)Lf/e;

    move-result-object p1

    iget-object p2, p0, Lk3/f$d;->a:Lcom/superbock/bean/AInfo;

    const-string v0, "thumb"

    invoke-virtual {p1, v0}, Lf/e;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/superbock/bean/AInfo;->setTh(Ljava/lang/String;)V

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object p1

    iget-object p2, p0, Lk3/f$d;->a:Lcom/superbock/bean/AInfo;

    invoke-virtual {p1, p2}, Lg3/a;->d(Lcom/superbock/bean/AInfo;)V

    iget-object p1, p0, Lk3/f$d;->a:Lcom/superbock/bean/AInfo;

    invoke-static {p1}, Lk3/f;->o(Lcom/superbock/bean/AInfo;)V
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
