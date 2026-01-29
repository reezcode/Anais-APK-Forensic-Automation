.class public final Lcom/superbock/ui/StartupActivity$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/ui/StartupActivity;->onDestroy()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->b(Landroid/content/Context;)V

    invoke-static {}, Lk3/f;->a()V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->n(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->f(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->q(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->l(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->t(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->d(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->p(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->h(Landroid/content/Context;)V

    invoke-static {}, Lk/j0;->l()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->r(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
