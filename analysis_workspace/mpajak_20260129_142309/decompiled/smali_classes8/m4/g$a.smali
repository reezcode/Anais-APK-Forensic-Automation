.class public final Lm4/g$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm4/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:I

.field public c:Lm4/h;

.field public d:Lm4/b;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm4/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    iput v0, p0, Lm4/g$a;->b:I

    iput-object p1, p0, Lm4/g$a;->a:Landroid/content/Context;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm4/g$a;->e:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    new-instance v0, Lm4/g;

    invoke-direct {v0, p0}, Lm4/g;-><init>(Lm4/g$a;)V

    iget-object v1, p0, Lm4/g$a;->a:Landroid/content/Context;

    iget-object v2, v0, Lm4/g;->e:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v0, Lm4/g;->c:Lm4/h;

    if-eqz v2, :cond_1

    :cond_0
    iget-object v2, v0, Lm4/g;->c:Lm4/h;

    check-cast v2, Lk3/f$j;

    iget-object v3, v2, Lk3/f$j;->c:Ljava/io/File;

    iget-object v4, v2, Lk3/f$j;->a:Lcom/superbock/bean/EInfo;

    iget-object v2, v2, Lk3/f$j;->b:Landroid/content/Context;

    invoke-static {}, Lk/j0;->k()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lk3/g;

    invoke-direct {v6, v4, v2}, Lk3/g;-><init>(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V

    invoke-static {v5, v3, v6}, Lk3/b;->b(Ljava/lang/String;Ljava/io/File;Ls3/e;)V

    :cond_1
    iget-object v2, v0, Lm4/g;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm4/d;

    sget-object v4, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-instance v5, Lm4/e;

    invoke-direct {v5, v0, v1, v3}, Lm4/e;-><init>(Lm4/g;Landroid/content/Context;Lm4/d;)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    return-void
.end method
