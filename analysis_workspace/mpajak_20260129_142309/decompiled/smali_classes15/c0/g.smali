.class public final Lc0/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc0/g$a;,
        Lc0/g$c;,
        Lc0/g$b;
    }
.end annotation


# instance fields
.field public final a:Lo/a;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc0/g$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/bumptech/glide/i;

.field public final e:Ls/d;

.field public f:Z

.field public g:Z

.field public h:Lcom/bumptech/glide/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/h<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lc0/g$a;

.field public j:Z

.field public k:Lc0/g$a;

.field public l:Landroid/graphics/Bitmap;

.field public m:Lp/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/l<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lc0/g$a;

.field public o:I

.field public p:I

.field public q:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/b;Lo/a;IILp/l;Landroid/graphics/Bitmap;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/b;",
            "Lo/a;",
            "II",
            "Lp/l<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    iget-object v0, p1, Lcom/bumptech/glide/b;->b:Ls/d;

    iget-object v1, p1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->f(Landroid/content/Context;)Lcom/bumptech/glide/i;

    move-result-object v1

    iget-object p1, p1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/bumptech/glide/b;->f(Landroid/content/Context;)Lcom/bumptech/glide/i;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v2, Landroid/graphics/Bitmap;

    new-instance v3, Lcom/bumptech/glide/h;

    iget-object v4, p1, Lcom/bumptech/glide/i;->b:Lcom/bumptech/glide/b;

    iget-object v5, p1, Lcom/bumptech/glide/i;->c:Landroid/content/Context;

    invoke-direct {v3, v4, p1, v2, v5}, Lcom/bumptech/glide/h;-><init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/i;Ljava/lang/Class;Landroid/content/Context;)V

    sget-object p1, Lcom/bumptech/glide/i;->l:Lh0/f;

    invoke-virtual {v3, p1}, Lcom/bumptech/glide/h;->q(Lh0/a;)Lcom/bumptech/glide/h;

    move-result-object p1

    sget-object v2, Lr/l;->a:Lr/l$a;

    new-instance v3, Lh0/f;

    invoke-direct {v3}, Lh0/f;-><init>()V

    invoke-virtual {v3, v2}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v2

    check-cast v2, Lh0/f;

    invoke-virtual {v2}, Lh0/a;->o()Lh0/a;

    move-result-object v2

    check-cast v2, Lh0/f;

    invoke-virtual {v2}, Lh0/a;->l()Lh0/a;

    move-result-object v2

    check-cast v2, Lh0/f;

    invoke-virtual {v2, p3, p4}, Lh0/a;->g(II)Lh0/a;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/bumptech/glide/h;->q(Lh0/a;)Lcom/bumptech/glide/h;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Lc0/g;->c:Ljava/util/ArrayList;

    iput-object v1, p0, Lc0/g;->d:Lcom/bumptech/glide/i;

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    new-instance v1, Lc0/g$c;

    invoke-direct {v1, p0}, Lc0/g$c;-><init>(Lc0/g;)V

    invoke-direct {p3, p4, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, Lc0/g;->e:Ls/d;

    iput-object p3, p0, Lc0/g;->b:Landroid/os/Handler;

    iput-object p1, p0, Lc0/g;->h:Lcom/bumptech/glide/h;

    iput-object p2, p0, Lc0/g;->a:Lo/a;

    invoke-virtual {p0, p5, p6}, Lc0/g;->c(Lp/l;Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-boolean v0, p0, Lc0/g;->f:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lc0/g;->g:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    iget-object v1, p0, Lc0/g;->n:Lc0/g$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iput-object v2, p0, Lc0/g;->n:Lc0/g$a;

    invoke-virtual {p0, v1}, Lc0/g;->b(Lc0/g$a;)V

    return-void

    :cond_1
    iput-boolean v0, p0, Lc0/g;->g:Z

    iget-object v0, p0, Lc0/g;->a:Lo/a;

    invoke-interface {v0}, Lo/a;->e()I

    move-result v0

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    iget-object v0, p0, Lc0/g;->a:Lo/a;

    invoke-interface {v0}, Lo/a;->c()V

    new-instance v0, Lc0/g$a;

    iget-object v3, p0, Lc0/g;->b:Landroid/os/Handler;

    iget-object v4, p0, Lc0/g;->a:Lo/a;

    invoke-interface {v4}, Lo/a;->a()I

    move-result v4

    invoke-direct {v0, v3, v4, v1, v2}, Lc0/g$a;-><init>(Landroid/os/Handler;IJ)V

    iput-object v0, p0, Lc0/g;->k:Lc0/g$a;

    iget-object v0, p0, Lc0/g;->h:Lcom/bumptech/glide/h;

    new-instance v1, Lk0/d;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-direct {v1, v2}, Lk0/d;-><init>(Ljava/lang/Object;)V

    new-instance v2, Lh0/f;

    invoke-direct {v2}, Lh0/f;-><init>()V

    invoke-virtual {v2, v1}, Lh0/a;->k(Lp/f;)Lh0/a;

    move-result-object v1

    check-cast v1, Lh0/f;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->q(Lh0/a;)Lcom/bumptech/glide/h;

    move-result-object v0

    iget-object v1, p0, Lc0/g;->a:Lo/a;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/h;->w(Ljava/lang/Object;)Lcom/bumptech/glide/h;

    move-result-object v0

    iget-object v1, p0, Lc0/g;->k:Lc0/g$a;

    invoke-virtual {v0, v1, v0}, Lcom/bumptech/glide/h;->u(Li0/h;Lh0/a;)Li0/h;

    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Lc0/g$a;)V
    .locals 3
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc0/g;->g:Z

    iget-boolean v0, p0, Lc0/g;->j:Z

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc0/g;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-boolean v0, p0, Lc0/g;->f:Z

    if-nez v0, :cond_1

    iput-object p1, p0, Lc0/g;->n:Lc0/g$a;

    return-void

    :cond_1
    iget-object v0, p1, Lc0/g$a;->h:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lc0/g;->l:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v2, p0, Lc0/g;->e:Ls/d;

    invoke-interface {v2, v0}, Ls/d;->d(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lc0/g;->l:Landroid/graphics/Bitmap;

    :cond_2
    iget-object v0, p0, Lc0/g;->i:Lc0/g$a;

    iput-object p1, p0, Lc0/g;->i:Lc0/g$a;

    iget-object p1, p0, Lc0/g;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    :goto_0
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_3

    iget-object v2, p0, Lc0/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc0/g$b;

    invoke-interface {v2}, Lc0/g$b;->a()V

    goto :goto_0

    :cond_3
    if-eqz v0, :cond_4

    iget-object p1, p0, Lc0/g;->b:Landroid/os/Handler;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_4
    invoke-virtual {p0}, Lc0/g;->a()V

    return-void
.end method

.method public final c(Lp/l;Landroid/graphics/Bitmap;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/l<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lc0/g;->m:Lp/l;

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Lc0/g;->l:Landroid/graphics/Bitmap;

    iget-object v0, p0, Lc0/g;->h:Lcom/bumptech/glide/h;

    new-instance v1, Lh0/f;

    invoke-direct {v1}, Lh0/f;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, Lh0/a;->n(Lp/l;Z)Lh0/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->q(Lh0/a;)Lcom/bumptech/glide/h;

    move-result-object p1

    iput-object p1, p0, Lc0/g;->h:Lcom/bumptech/glide/h;

    invoke-static {p2}, Ll0/k;->d(Landroid/graphics/Bitmap;)I

    move-result p1

    iput p1, p0, Lc0/g;->o:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, Lc0/g;->p:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, Lc0/g;->q:I

    return-void
.end method
