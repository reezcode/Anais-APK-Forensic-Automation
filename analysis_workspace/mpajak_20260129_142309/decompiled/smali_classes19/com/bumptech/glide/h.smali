.class public final Lcom/bumptech/glide/h;
.super Lh0/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TranscodeType:",
        "Ljava/lang/Object;",
        ">",
        "Lh0/a<",
        "Lcom/bumptech/glide/h<",
        "TTranscodeType;>;>;"
    }
.end annotation


# instance fields
.field public final B:Landroid/content/Context;

.field public final C:Lcom/bumptech/glide/i;

.field public final D:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public final E:Lcom/bumptech/glide/d;

.field public F:Lcom/bumptech/glide/j;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/j<",
            "*-TTranscodeType;>;"
        }
    .end annotation
.end field

.field public G:Ljava/lang/Object;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public H:Ljava/util/ArrayList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lh0/e<",
            "TTranscodeType;>;>;"
        }
    .end annotation
.end field

.field public I:Lcom/bumptech/glide/h;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/h<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public J:Lcom/bumptech/glide/h;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/h<",
            "TTranscodeType;>;"
        }
    .end annotation
.end field

.field public K:Z

.field public L:Z

.field public M:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh0/f;

    invoke-direct {v0}, Lh0/f;-><init>()V

    sget-object v1, Lr/l;->b:Lr/l$b;

    invoke-virtual {v0, v1}, Lh0/a;->d(Lr/l;)Lh0/a;

    move-result-object v0

    check-cast v0, Lh0/f;

    invoke-virtual {v0}, Lh0/a;->h()Lh0/a;

    move-result-object v0

    check-cast v0, Lh0/f;

    invoke-virtual {v0}, Lh0/a;->l()Lh0/a;

    move-result-object v0

    check-cast v0, Lh0/f;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/b;Lcom/bumptech/glide/i;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3
    .param p1    # Lcom/bumptech/glide/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/b;",
            "Lcom/bumptech/glide/i;",
            "Ljava/lang/Class<",
            "TTranscodeType;>;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lh0/a;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/h;->K:Z

    iput-object p2, p0, Lcom/bumptech/glide/h;->C:Lcom/bumptech/glide/i;

    iput-object p3, p0, Lcom/bumptech/glide/h;->D:Ljava/lang/Class;

    iput-object p4, p0, Lcom/bumptech/glide/h;->B:Landroid/content/Context;

    iget-object p4, p2, Lcom/bumptech/glide/i;->b:Lcom/bumptech/glide/b;

    iget-object p4, p4, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

    iget-object v0, p4, Lcom/bumptech/glide/d;->f:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    if-nez v0, :cond_1

    iget-object p4, p4, Lcom/bumptech/glide/d;->f:Ljava/util/Map;

    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/j;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lcom/bumptech/glide/d;->k:Lcom/bumptech/glide/a;

    :cond_2
    iput-object v0, p0, Lcom/bumptech/glide/h;->F:Lcom/bumptech/glide/j;

    iget-object p1, p1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

    iput-object p1, p0, Lcom/bumptech/glide/h;->E:Lcom/bumptech/glide/d;

    iget-object p1, p2, Lcom/bumptech/glide/i;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lh0/e;

    invoke-virtual {p0, p3}, Lcom/bumptech/glide/h;->p(Lh0/e;)Lcom/bumptech/glide/h;

    goto :goto_1

    :cond_3
    monitor-enter p2

    :try_start_0
    iget-object p1, p2, Lcom/bumptech/glide/i;->k:Lh0/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/h;->q(Lh0/a;)Lcom/bumptech/glide/h;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1
.end method


# virtual methods
.method public final bridge synthetic a(Lh0/a;)Lh0/a;
    .locals 0
    .param p1    # Lh0/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/h;->q(Lh0/a;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic b()Lh0/a;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    return-object v0
.end method

.method public final p(Lh0/e;)Lcom/bumptech/glide/h;
    .locals 1
    .param p1    # Lh0/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/e<",
            "TTranscodeType;>;)",
            "Lcom/bumptech/glide/h<",
            "TTranscodeType;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->p(Lh0/e;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/bumptech/glide/h;->H:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/h;->H:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/h;->H:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final q(Lh0/a;)Lcom/bumptech/glide/h;
    .locals 1
    .param p1    # Lh0/a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/a<",
            "*>;)",
            "Lcom/bumptech/glide/h<",
            "TTranscodeType;>;"
        }
    .end annotation

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-super {p0, p1}, Lh0/a;->a(Lh0/a;)Lh0/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/h;

    return-object p1
.end method

.method public final r(Ljava/lang/Object;Li0/h;Lh0/d;Lcom/bumptech/glide/j;Lcom/bumptech/glide/f;IILh0/a;)Lh0/c;
    .locals 17
    .param p3    # Lh0/d;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Li0/h<",
            "TTranscodeType;>;",
            "Lh0/e<",
            "TTranscodeType;>;",
            "Lh0/d;",
            "Lcom/bumptech/glide/j<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/f;",
            "II",
            "Lh0/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lh0/c;"
        }
    .end annotation

    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p8

    iget-object v0, v9, Lcom/bumptech/glide/h;->J:Lcom/bumptech/glide/h;

    if-eqz v0, :cond_0

    new-instance v0, Lh0/b;

    move-object/from16 v1, p3

    invoke-direct {v0, v10, v1}, Lh0/b;-><init>(Ljava/lang/Object;Lh0/d;)V

    move-object v4, v0

    move-object v12, v4

    goto :goto_0

    :cond_0
    move-object/from16 v1, p3

    const/4 v0, 0x0

    move-object v12, v0

    move-object v4, v1

    :goto_0
    iget-object v0, v9, Lcom/bumptech/glide/h;->I:Lcom/bumptech/glide/h;

    if-eqz v0, :cond_5

    iget-boolean v1, v9, Lcom/bumptech/glide/h;->M:Z

    if-nez v1, :cond_4

    iget-object v1, v0, Lcom/bumptech/glide/h;->F:Lcom/bumptech/glide/j;

    iget-boolean v2, v0, Lcom/bumptech/glide/h;->K:Z

    if-eqz v2, :cond_1

    move-object/from16 v13, p4

    goto :goto_1

    :cond_1
    move-object v13, v1

    :goto_1
    iget v0, v0, Lh0/a;->b:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v9, Lcom/bumptech/glide/h;->I:Lcom/bumptech/glide/h;

    iget-object v0, v0, Lh0/a;->e:Lcom/bumptech/glide/f;

    move-object/from16 v6, p5

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    invoke-virtual {v9, v6}, Lcom/bumptech/glide/h;->t(Lcom/bumptech/glide/f;)Lcom/bumptech/glide/f;

    move-result-object v0

    :goto_2
    move-object v14, v0

    iget-object v0, v9, Lcom/bumptech/glide/h;->I:Lcom/bumptech/glide/h;

    iget v1, v0, Lh0/a;->l:I

    iget v0, v0, Lh0/a;->k:I

    invoke-static/range {p6 .. p7}, Ll0/k;->j(II)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, v9, Lcom/bumptech/glide/h;->I:Lcom/bumptech/glide/h;

    iget v3, v2, Lh0/a;->l:I

    iget v2, v2, Lh0/a;->k:I

    invoke-static {v3, v2}, Ll0/k;->j(II)Z

    move-result v2

    if-nez v2, :cond_3

    iget v0, v11, Lh0/a;->l:I

    iget v1, v11, Lh0/a;->k:I

    move v15, v0

    move/from16 v16, v1

    goto :goto_3

    :cond_3
    move/from16 v16, v0

    move v15, v1

    :goto_3
    new-instance v8, Lh0/i;

    invoke-direct {v8, v10, v4}, Lh0/i;-><init>(Ljava/lang/Object;Lh0/d;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p8

    move-object v4, v8

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 p3, v8

    move/from16 v8, p7

    invoke-virtual/range {v0 .. v8}, Lcom/bumptech/glide/h;->x(Ljava/lang/Object;Li0/h;Lh0/a;Lh0/d;Lcom/bumptech/glide/j;Lcom/bumptech/glide/f;II)Lh0/c;

    move-result-object v8

    const/4 v0, 0x1

    iput-boolean v0, v9, Lcom/bumptech/glide/h;->M:Z

    iget-object v7, v9, Lcom/bumptech/glide/h;->I:Lcom/bumptech/glide/h;

    move-object v0, v7

    move-object/from16 v3, p3

    move-object v4, v13

    move-object v5, v14

    move v6, v15

    move-object v13, v7

    move/from16 v7, v16

    move-object v14, v8

    move-object v8, v13

    invoke-virtual/range {v0 .. v8}, Lcom/bumptech/glide/h;->r(Ljava/lang/Object;Li0/h;Lh0/d;Lcom/bumptech/glide/j;Lcom/bumptech/glide/f;IILh0/a;)Lh0/c;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v9, Lcom/bumptech/glide/h;->M:Z

    move-object/from16 v1, p3

    iput-object v14, v1, Lh0/i;->c:Lh0/c;

    iput-object v0, v1, Lh0/i;->d:Lh0/c;

    move-object v13, v1

    goto :goto_4

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object/from16 v6, p5

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p8

    move-object/from16 v5, p4

    move/from16 v7, p6

    move/from16 v8, p7

    invoke-virtual/range {v0 .. v8}, Lcom/bumptech/glide/h;->x(Ljava/lang/Object;Li0/h;Lh0/a;Lh0/d;Lcom/bumptech/glide/j;Lcom/bumptech/glide/f;II)Lh0/c;

    move-result-object v8

    move-object v13, v8

    :goto_4
    if-nez v12, :cond_6

    return-object v13

    :cond_6
    iget-object v0, v9, Lcom/bumptech/glide/h;->J:Lcom/bumptech/glide/h;

    iget v1, v0, Lh0/a;->l:I

    iget v0, v0, Lh0/a;->k:I

    invoke-static/range {p6 .. p7}, Ll0/k;->j(II)Z

    move-result v2

    if-eqz v2, :cond_7

    iget-object v2, v9, Lcom/bumptech/glide/h;->J:Lcom/bumptech/glide/h;

    iget v3, v2, Lh0/a;->l:I

    iget v2, v2, Lh0/a;->k:I

    invoke-static {v3, v2}, Ll0/k;->j(II)Z

    move-result v2

    if-nez v2, :cond_7

    iget v0, v11, Lh0/a;->l:I

    iget v1, v11, Lh0/a;->k:I

    move v6, v0

    move v7, v1

    goto :goto_5

    :cond_7
    move v7, v0

    move v6, v1

    :goto_5
    iget-object v8, v9, Lcom/bumptech/glide/h;->J:Lcom/bumptech/glide/h;

    iget-object v4, v8, Lcom/bumptech/glide/h;->F:Lcom/bumptech/glide/j;

    iget-object v5, v8, Lh0/a;->e:Lcom/bumptech/glide/f;

    move-object v0, v8

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object v3, v12

    invoke-virtual/range {v0 .. v8}, Lcom/bumptech/glide/h;->r(Ljava/lang/Object;Li0/h;Lh0/d;Lcom/bumptech/glide/j;Lcom/bumptech/glide/f;IILh0/a;)Lh0/c;

    move-result-object v0

    iput-object v13, v12, Lh0/b;->c:Lh0/c;

    iput-object v0, v12, Lh0/b;->d:Lh0/c;

    return-object v12
.end method

.method public final s()Lcom/bumptech/glide/h;
    .locals 3
    .annotation build Landroidx/annotation/CheckResult;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/h<",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-super {p0}, Lh0/a;->b()Lh0/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/h;

    iget-object v1, v0, Lcom/bumptech/glide/h;->F:Lcom/bumptech/glide/j;

    invoke-virtual {v1}, Lcom/bumptech/glide/j;->a()Lcom/bumptech/glide/j;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/h;->F:Lcom/bumptech/glide/j;

    iget-object v1, v0, Lcom/bumptech/glide/h;->H:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lcom/bumptech/glide/h;->H:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lcom/bumptech/glide/h;->H:Ljava/util/ArrayList;

    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/h;->I:Lcom/bumptech/glide/h;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/h;->I:Lcom/bumptech/glide/h;

    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/h;->J:Lcom/bumptech/glide/h;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/h;->J:Lcom/bumptech/glide/h;

    :cond_2
    return-object v0
.end method

.method public final t(Lcom/bumptech/glide/f;)Lcom/bumptech/glide/f;
    .locals 2
    .param p1    # Lcom/bumptech/glide/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    sget-object p1, Lcom/bumptech/glide/f;->d:Lcom/bumptech/glide/f;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "unknown priority: "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lh0/a;->e:Lcom/bumptech/glide/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget-object p1, Lcom/bumptech/glide/f;->c:Lcom/bumptech/glide/f;

    return-object p1

    :cond_2
    sget-object p1, Lcom/bumptech/glide/f;->b:Lcom/bumptech/glide/f;

    return-object p1
.end method

.method public final u(Li0/h;Lh0/a;)Li0/h;
    .locals 10
    .param p1    # Li0/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Y::",
            "Li0/h<",
            "TTranscodeType;>;>(TY;",
            "Lh0/e<",
            "TTranscodeType;>;",
            "Lh0/a<",
            "*>;",
            "Ljava/util/concurrent/Executor;",
            ")TY;"
        }
    .end annotation

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget-boolean v0, p0, Lcom/bumptech/glide/h;->L:Z

    if-eqz v0, :cond_5

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v5, p0, Lcom/bumptech/glide/h;->F:Lcom/bumptech/glide/j;

    iget-object v6, p2, Lh0/a;->e:Lcom/bumptech/glide/f;

    iget v7, p2, Lh0/a;->l:I

    iget v8, p2, Lh0/a;->k:I

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v9, p2

    invoke-virtual/range {v1 .. v9}, Lcom/bumptech/glide/h;->r(Ljava/lang/Object;Li0/h;Lh0/d;Lcom/bumptech/glide/j;Lcom/bumptech/glide/f;IILh0/a;)Lh0/c;

    move-result-object v0

    invoke-interface {p1}, Li0/h;->g()Lh0/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lh0/c;->c(Lh0/c;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean p2, p2, Lh0/a;->j:Z

    if-nez p2, :cond_0

    invoke-interface {v1}, Lh0/c;->j()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_2

    const-string p2, "Argument must not be null"

    invoke-static {v1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-interface {v1}, Lh0/c;->isRunning()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-interface {v1}, Lh0/c;->i()V

    :cond_1
    return-object p1

    :cond_2
    iget-object p2, p0, Lcom/bumptech/glide/h;->C:Lcom/bumptech/glide/i;

    invoke-virtual {p2, p1}, Lcom/bumptech/glide/i;->k(Li0/h;)V

    invoke-interface {p1, v0}, Li0/h;->e(Lh0/c;)V

    iget-object p2, p0, Lcom/bumptech/glide/h;->C:Lcom/bumptech/glide/i;

    monitor-enter p2

    :try_start_0
    iget-object v1, p2, Lcom/bumptech/glide/i;->g:Le0/r;

    iget-object v1, v1, Le0/r;->b:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p2, Lcom/bumptech/glide/i;->e:Le0/p;

    iget-object v2, v1, Le0/p;->a:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-boolean v2, v1, Le0/p;->c:Z

    if-nez v2, :cond_3

    invoke-interface {v0}, Lh0/c;->i()V

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Lh0/c;->clear()V

    const/4 v2, 0x2

    const-string v3, "RequestTracker"

    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "Paused, delaying request"

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object v1, v1, Le0/p;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must call #load() before calling #into()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final v(Landroid/widget/ImageView;)Li0/i;
    .locals 4
    .param p1    # Landroid/widget/ImageView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/ImageView;",
            ")",
            "Li0/i<",
            "Landroid/widget/ImageView;",
            "TTranscodeType;>;"
        }
    .end annotation

    invoke-static {}, Ll0/k;->a()V

    const-string v0, "Argument must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iget v0, p0, Lh0/a;->b:I

    const/16 v1, 0x800

    invoke-static {v0, v1}, Lh0/a;->e(II)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lh0/a;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/bumptech/glide/h$a;->a:[I

    invoke-virtual {p1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    sget-object v2, Ly/l;->b:Ly/l$a;

    new-instance v3, Ly/j;

    invoke-direct {v3}, Ly/j;-><init>()V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    sget-object v2, Ly/l;->a:Ly/l$c;

    new-instance v3, Ly/q;

    invoke-direct {v3}, Ly/q;-><init>()V

    invoke-virtual {v0, v2, v3}, Lh0/a;->f(Ly/l;Lp/l;)Lh0/a;

    move-result-object v0

    iput-boolean v1, v0, Lh0/a;->z:Z

    goto :goto_2

    :pswitch_2
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    sget-object v2, Ly/l;->b:Ly/l$a;

    new-instance v3, Ly/j;

    invoke-direct {v3}, Ly/j;-><init>()V

    :goto_0
    invoke-virtual {v0, v2, v3}, Lh0/a;->f(Ly/l;Lp/l;)Lh0/a;

    move-result-object v0

    iput-boolean v1, v0, Lh0/a;->z:Z

    goto :goto_2

    :pswitch_3
    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    sget-object v1, Ly/l;->c:Ly/l$b;

    new-instance v2, Ly/i;

    invoke-direct {v2}, Ly/i;-><init>()V

    invoke-virtual {v0, v1, v2}, Lh0/a;->f(Ly/l;Lp/l;)Lh0/a;

    move-result-object v0

    goto :goto_2

    :cond_0
    :goto_1
    move-object v0, p0

    :goto_2
    iget-object v1, p0, Lcom/bumptech/glide/h;->E:Lcom/bumptech/glide/d;

    iget-object v2, p0, Lcom/bumptech/glide/h;->D:Ljava/lang/Class;

    iget-object v1, v1, Lcom/bumptech/glide/d;->c:Li/g;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Li0/b;

    invoke-direct {v1, p1}, Li0/b;-><init>(Landroid/widget/ImageView;)V

    goto :goto_3

    :cond_1
    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Li0/d;

    invoke-direct {v1, p1}, Li0/d;-><init>(Landroid/widget/ImageView;)V

    :goto_3
    invoke-virtual {p0, v1, v0}, Lcom/bumptech/glide/h;->u(Li0/h;Lh0/a;)Li0/h;

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unhandled class: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", try .as*(Class).transcode(ResourceTranscoder)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final w(Ljava/lang/Object;)Lcom/bumptech/glide/h;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Lcom/bumptech/glide/h<",
            "TTranscodeType;>;"
        }
    .end annotation

    iget-boolean v0, p0, Lh0/a;->w:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/h;->s()Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->w(Ljava/lang/Object;)Lcom/bumptech/glide/h;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lcom/bumptech/glide/h;->G:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/bumptech/glide/h;->L:Z

    invoke-virtual {p0}, Lh0/a;->i()Lh0/a;

    return-object p0
.end method

.method public final x(Ljava/lang/Object;Li0/h;Lh0/a;Lh0/d;Lcom/bumptech/glide/j;Lcom/bumptech/glide/f;II)Lh0/c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Li0/h<",
            "TTranscodeType;>;",
            "Lh0/e<",
            "TTranscodeType;>;",
            "Lh0/a<",
            "*>;",
            "Lh0/d;",
            "Lcom/bumptech/glide/j<",
            "*-TTranscodeType;>;",
            "Lcom/bumptech/glide/f;",
            "II",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lh0/c;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/bumptech/glide/h;->B:Landroid/content/Context;

    iget-object v3, v0, Lcom/bumptech/glide/h;->E:Lcom/bumptech/glide/d;

    iget-object v5, v0, Lcom/bumptech/glide/h;->G:Ljava/lang/Object;

    iget-object v6, v0, Lcom/bumptech/glide/h;->D:Ljava/lang/Class;

    iget-object v12, v0, Lcom/bumptech/glide/h;->H:Ljava/util/ArrayList;

    iget-object v14, v3, Lcom/bumptech/glide/d;->g:Lr/m;

    invoke-static/range {p5 .. p5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v15, Lh0/h;

    move-object v1, v15

    move-object/from16 v4, p1

    move-object/from16 v7, p3

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p6

    move-object/from16 v11, p2

    move-object/from16 v13, p4

    invoke-direct/range {v1 .. v14}, Lh0/h;-><init>(Landroid/content/Context;Lcom/bumptech/glide/d;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;Lh0/a;IILcom/bumptech/glide/f;Li0/h;Ljava/util/List;Lh0/d;Lr/m;)V

    return-object v15
.end method
