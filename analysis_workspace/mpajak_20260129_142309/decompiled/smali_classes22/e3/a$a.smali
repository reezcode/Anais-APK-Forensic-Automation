.class public final Le3/a$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le3/a;->b(Ls3/d;Ljava/io/IOException;)V
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
    .locals 1

    sget-boolean v0, Lcom/superbock/ui/StartupActivity;->g:Z

    if-nez v0, :cond_0

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->b(Landroid/content/Context;)V

    invoke-static {}, Lk3/f;->a()V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->f(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->l(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->d(Landroid/content/Context;)V

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {v0}, Lk3/f;->h(Landroid/content/Context;)V

    :cond_0
    return-void
.end method
