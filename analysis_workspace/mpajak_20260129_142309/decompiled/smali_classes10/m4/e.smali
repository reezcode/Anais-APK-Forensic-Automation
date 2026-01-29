.class public final Lm4/e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Lm4/d;

.field public final synthetic d:Lm4/g;


# direct methods
.method public constructor <init>(Lm4/g;Landroid/content/Context;Lm4/d;)V
    .locals 0

    iput-object p1, p0, Lm4/e;->d:Lm4/g;

    iput-object p2, p0, Lm4/e;->b:Landroid/content/Context;

    iput-object p3, p0, Lm4/e;->c:Lm4/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lm4/e;->d:Lm4/g;

    iget-object v0, v0, Lm4/g;->f:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iget-object v0, p0, Lm4/e;->d:Lm4/g;

    iget-object v1, p0, Lm4/e;->b:Landroid/content/Context;

    iget-object v2, p0, Lm4/e;->c:Lm4/d;

    invoke-static {v0, v1, v2}, Lm4/g;->a(Lm4/g;Landroid/content/Context;Lm4/d;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lm4/e;->d:Lm4/g;

    iget-object v1, v1, Lm4/g;->f:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lm4/e;->d:Lm4/g;

    iget-object v1, v1, Lm4/g;->f:Landroid/os/Handler;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :goto_0
    return-void
.end method
