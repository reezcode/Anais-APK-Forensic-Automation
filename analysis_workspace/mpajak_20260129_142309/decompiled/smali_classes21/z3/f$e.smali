.class public final Lz3/f$e;
.super Ljava/lang/Object;

# interfaces
.implements Lz3/p$c;
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz3/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lz3/p$c;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lz3/p;

.field public final synthetic c:Lz3/f;


# direct methods
.method public constructor <init>(Lz3/f;Lz3/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz3/p;",
            ")V"
        }
    .end annotation

    const-string v0, "reader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lz3/f$e;->c:Lz3/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lz3/f$e;->b:Lz3/p;

    return-void
.end method


# virtual methods
.method public final a(ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lz3/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "requestHeaders"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "requestHeaders"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Lz3/f;->B:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object p2, Lz3/b;->d:Lz3/b;

    invoke-virtual {v0, p1, p2}, Lz3/f;->r(ILz3/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v1, v0, Lz3/f;->B:Ljava/util/LinkedHashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    iget-object v1, v0, Lz3/f;->k:Lv3/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onRequest"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-wide/16 v3, 0x0

    new-instance v5, Lz3/l;

    invoke-direct {v5, v2, v0, p1, p2}, Lz3/l;-><init>(Ljava/lang/String;Lz3/f;ILjava/util/List;)V

    invoke-virtual {v1, v5, v3, v4}, Lv3/c;->c(Lv3/a;J)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c(ZILjava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZII",
            "Ljava/util/List<",
            "Lz3/c;",
            ">;)V"
        }
    .end annotation

    const-string v0, "headerBlock"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v0, p2}, Lz3/f;->e(I)Z

    move-result v0

    const-wide/16 v1, 0x0

    const/16 v3, 0x5b

    if-eqz v0, :cond_0

    iget-object v6, p0, Lz3/f$e;->c:Lz3/f;

    invoke-static {v6}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "requestHeaders"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v6, Lz3/f;->k:Lv3/c;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v6, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onHeaders"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v3, Lz3/k;

    move-object v4, v3

    move v7, p2

    move-object v8, p3

    move v9, p1

    invoke-direct/range {v4 .. v9}, Lz3/k;-><init>(Ljava/lang/String;Lz3/f;ILjava/util/List;Z)V

    invoke-virtual {v0, v3, v1, v2}, Lv3/c;->c(Lv3/a;J)V

    return-void

    :cond_0
    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    monitor-enter v0

    :try_start_0
    iget-object v4, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v4, p2}, Lz3/f;->c(I)Lz3/q;

    move-result-object v4

    if-nez v4, :cond_4

    iget-object v4, p0, Lz3/f$e;->c:Lz3/f;

    iget-boolean v5, v4, Lz3/f;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_1

    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    iget v5, v4, Lz3/f;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-gt p2, v5, :cond_2

    monitor-exit v0

    return-void

    :cond_2
    :try_start_2
    rem-int/lit8 v5, p2, 0x2

    iget v4, v4, Lz3/f;->g:I

    rem-int/lit8 v4, v4, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne v5, v4, :cond_3

    monitor-exit v0

    return-void

    :cond_3
    :try_start_3
    invoke-static {p3}, Lt3/c;->w(Ljava/util/List;)Ls3/r;

    move-result-object v11

    new-instance p3, Lz3/q;

    iget-object v8, p0, Lz3/f$e;->c:Lz3/f;

    const/4 v9, 0x0

    move-object v6, p3

    move v7, p2

    move v10, p1

    invoke-direct/range {v6 .. v11}, Lz3/q;-><init>(ILz3/f;ZZLs3/r;)V

    iget-object p1, p0, Lz3/f$e;->c:Lz3/f;

    iput p2, p1, Lz3/f;->f:I

    iget-object p1, p1, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p1, v4, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lz3/f$e;->c:Lz3/f;

    iget-object p1, p1, Lz3/f;->i:Lv3/d;

    invoke-virtual {p1}, Lv3/d;->f()Lv3/c;

    move-result-object p1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lz3/f$e;->c:Lz3/f;

    iget-object v5, v5, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "] onStream"

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v3, Lz3/h;

    invoke-direct {v3, p2, p3, p0}, Lz3/h;-><init>(Ljava/lang/String;Lz3/q;Lz3/f$e;)V

    invoke-virtual {p1, v3, v1, v2}, Lv3/c;->c(Lv3/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    :cond_4
    :try_start_4
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    invoke-static {p3}, Lt3/c;->w(Ljava/util/List;)Ls3/r;

    move-result-object p2

    invoke-virtual {v4, p2, p1}, Lz3/q;->j(Ls3/r;Z)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final d(ZII)V
    .locals 4

    if-eqz p1, :cond_3

    iget-object p1, p0, Lz3/f$e;->c:Lz3/f;

    monitor-enter p1

    const/4 p3, 0x1

    const-wide/16 v0, 0x1

    if-eq p2, p3, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    const/4 p3, 0x3

    if-eq p2, p3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p2, p0, Lz3/f$e;->c:Lz3/f;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    :goto_0
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lz3/f$e;->c:Lz3/f;

    iget-wide v2, p2, Lz3/f;->q:J

    add-long/2addr v2, v0

    iput-wide v2, p2, Lz3/f;->q:J

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lz3/f$e;->c:Lz3/f;

    iget-wide v2, p2, Lz3/f;->o:J

    add-long/2addr v2, v0

    iput-wide v2, p2, Lz3/f;->o:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p1

    goto :goto_2

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_3
    iget-object p1, p0, Lz3/f$e;->c:Lz3/f;

    iget-object p1, p1, Lz3/f;->j:Lv3/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lz3/f$e;->c:Lz3/f;

    iget-object v1, v1, Lz3/f;->e:Ljava/lang/String;

    const-string v2, " ping"

    invoke-static {v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    new-instance v3, Lz3/f$e$a;

    invoke-direct {v3, v0, p0, p2, p3}, Lz3/f$e$a;-><init>(Ljava/lang/String;Lz3/f$e;II)V

    invoke-virtual {p1, v3, v1, v2}, Lv3/c;->c(Lv3/a;J)V

    :goto_2
    return-void
.end method

.method public final e(Lz3/u;)V
    .locals 5

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    iget-object v0, v0, Lz3/f;->j:Lv3/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lz3/f$e;->c:Lz3/f;

    iget-object v2, v2, Lz3/f;->e:Ljava/lang/String;

    const-string v3, " applyAndAckSettings"

    invoke-static {v1, v2, v3}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lz3/i;

    invoke-direct {v2, v1, p0, p1}, Lz3/i;-><init>(Ljava/lang/String;Lz3/f$e;Lz3/u;)V

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v2, v3, v4}, Lv3/c;->c(Lv3/a;J)V

    return-void
.end method

.method public final f(ILz3/b;)V
    .locals 4

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v0, p1}, Lz3/f;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "errorCode"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lz3/f;->k:Lv3/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onReset"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lz3/m;

    invoke-direct {v3, v2, v0, p1, p2}, Lz3/m;-><init>(Ljava/lang/String;Lz3/f;ILz3/b;)V

    const-wide/16 p1, 0x0

    invoke-virtual {v1, v3, p1, p2}, Lv3/c;->c(Lv3/a;J)V

    return-void

    :cond_0
    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v0, p1}, Lz3/f;->f(I)Lz3/q;

    move-result-object p1

    if-eqz p1, :cond_2

    monitor-enter p1

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lz3/q;->k:Lz3/b;

    if-nez v0, :cond_1

    iput-object p2, p1, Lz3/q;->k:Lz3/b;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_2
    :goto_0
    return-void
.end method

.method public final g(IJ)V
    .locals 3

    if-nez p1, :cond_1

    iget-object p1, p0, Lz3/f$e;->c:Lz3/f;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    iget-wide v1, v0, Lz3/f;->x:J

    add-long/2addr v1, p2

    iput-wide v1, v0, Lz3/f;->x:J

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/NullPointerException;

    const-string p3, "null cannot be cast to non-null type java.lang.Object"

    invoke-direct {p2, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_1
    iget-object v0, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v0, p1}, Lz3/f;->c(I)Lz3/q;

    move-result-object p1

    if-eqz p1, :cond_3

    monitor-enter p1

    :try_start_1
    iget-wide v0, p1, Lz3/q;->d:J

    add-long/2addr v0, p2

    iput-wide v0, p1, Lz3/q;->d:J

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    :cond_2
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    monitor-exit p1

    goto :goto_1

    :catchall_1
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_3
    :goto_1
    return-void
.end method

.method public final h(ZILf4/h;I)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v0, p2

    move-object/from16 v2, p3

    move/from16 v7, p4

    const-string v3, "source"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v3, v0}, Lz3/f;->e(I)Z

    move-result v3

    const-wide/16 v9, 0x0

    if-eqz v3, :cond_0

    iget-object v4, v1, Lz3/f$e;->c:Lz3/f;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "source"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lf4/f;

    invoke-direct {v6}, Lf4/f;-><init>()V

    int-to-long v11, v7

    invoke-interface {v2, v11, v12}, Lf4/h;->c0(J)V

    invoke-interface {v2, v6, v11, v12}, Lf4/a0;->u(Lf4/f;J)J

    iget-object v11, v4, Lz3/f;->k:Lv3/c;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v4, Lz3/f;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x5b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "] onData"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v12, Lz3/j;

    move-object v2, v12

    move/from16 v5, p2

    move/from16 v7, p4

    move/from16 v8, p1

    invoke-direct/range {v2 .. v8}, Lz3/j;-><init>(Ljava/lang/String;Lz3/f;ILf4/f;IZ)V

    invoke-virtual {v11, v12, v9, v10}, Lv3/c;->c(Lv3/a;J)V

    return-void

    :cond_0
    iget-object v3, v1, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v3, v0}, Lz3/f;->c(I)Lz3/q;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v3, v1, Lz3/f$e;->c:Lz3/f;

    sget-object v4, Lz3/b;->d:Lz3/b;

    invoke-virtual {v3, v0, v4}, Lz3/f;->r(ILz3/b;)V

    iget-object v0, v1, Lz3/f$e;->c:Lz3/f;

    int-to-long v3, v7

    invoke-virtual {v0, v3, v4}, Lz3/f;->n(J)V

    invoke-interface {v2, v3, v4}, Lf4/h;->skip(J)V

    return-void

    :cond_1
    const-string v0, "source"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lt3/c;->a:[B

    iget-object v0, v3, Lz3/q;->g:Lz3/q$b;

    int-to-long v4, v7

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v6, "source"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    :goto_0
    const/4 v6, 0x1

    cmp-long v7, v4, v9

    if-lez v7, :cond_b

    iget-object v7, v0, Lz3/q$b;->g:Lz3/q;

    monitor-enter v7

    :try_start_0
    iget-boolean v8, v0, Lz3/q$b;->f:Z

    iget-object v11, v0, Lz3/q$b;->c:Lf4/f;

    iget-wide v11, v11, Lf4/f;->c:J

    add-long/2addr v11, v4

    iget-wide v13, v0, Lz3/q$b;->e:J

    const/4 v15, 0x0

    cmp-long v16, v11, v13

    if-lez v16, :cond_3

    const/4 v11, 0x1

    goto :goto_1

    :cond_3
    const/4 v11, 0x0

    :goto_1
    sget-object v12, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v7

    if-eqz v11, :cond_4

    invoke-interface {v2, v4, v5}, Lf4/h;->skip(J)V

    iget-object v0, v0, Lz3/q$b;->g:Lz3/q;

    sget-object v2, Lz3/b;->f:Lz3/b;

    invoke-virtual {v0, v2}, Lz3/q;->e(Lz3/b;)V

    goto :goto_5

    :cond_4
    if-eqz v8, :cond_5

    invoke-interface {v2, v4, v5}, Lf4/h;->skip(J)V

    goto :goto_5

    :cond_5
    iget-object v7, v0, Lz3/q$b;->b:Lf4/f;

    invoke-interface {v2, v7, v4, v5}, Lf4/a0;->u(Lf4/f;J)J

    move-result-wide v7

    const-wide/16 v11, -0x1

    cmp-long v13, v7, v11

    if-eqz v13, :cond_a

    sub-long/2addr v4, v7

    iget-object v7, v0, Lz3/q$b;->g:Lz3/q;

    monitor-enter v7

    :try_start_1
    iget-boolean v8, v0, Lz3/q$b;->d:Z

    if-eqz v8, :cond_6

    iget-object v6, v0, Lz3/q$b;->b:Lf4/f;

    iget-wide v11, v6, Lf4/f;->c:J

    invoke-virtual {v6}, Lf4/f;->a()V

    goto :goto_4

    :cond_6
    iget-object v8, v0, Lz3/q$b;->c:Lf4/f;

    iget-wide v11, v8, Lf4/f;->c:J

    cmp-long v13, v11, v9

    if-nez v13, :cond_7

    goto :goto_2

    :cond_7
    const/4 v6, 0x0

    :goto_2
    iget-object v11, v0, Lz3/q$b;->b:Lf4/f;

    invoke-virtual {v8, v11}, Lf4/f;->b0(Lf4/a0;)J

    if-eqz v6, :cond_9

    iget-object v6, v0, Lz3/q$b;->g:Lz3/q;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ljava/lang/Object;->notifyAll()V

    goto :goto_3

    :cond_8
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type java.lang.Object"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_9
    :goto_3
    move-wide v11, v9

    :goto_4
    monitor-exit v7

    cmp-long v6, v11, v9

    if-lez v6, :cond_2

    invoke-virtual {v0, v11, v12}, Lz3/q$b;->a(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v7

    throw v0

    :cond_a
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v7

    throw v0

    :cond_b
    :goto_5
    if-eqz p1, :cond_c

    sget-object v0, Lt3/c;->b:Ls3/r;

    invoke-virtual {v3, v0, v6}, Lz3/q;->j(Ls3/r;Z)V

    :cond_c
    return-void
.end method

.method public final i(ILz3/b;Lf4/i;)V
    .locals 4

    const-string v0, "errorCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "debugData"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lf4/i;->c()I

    iget-object p2, p0, Lz3/f$e;->c:Lz3/f;

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Lz3/f$e;->c:Lz3/f;

    iget-object p3, p3, Lz3/f;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {p3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p3

    const/4 v0, 0x0

    new-array v1, v0, [Lz3/q;

    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    if-eqz p3, :cond_3

    check-cast p3, [Lz3/q;

    iget-object v1, p0, Lz3/f$e;->c:Lz3/f;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lz3/f;->h:Z

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p2

    array-length p2, p3

    :goto_0
    if-ge v0, p2, :cond_2

    aget-object v1, p3, v0

    iget v2, v1, Lz3/q;->m:I

    if-le v2, p1, :cond_1

    invoke-virtual {v1}, Lz3/q;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v2, Lz3/b;->g:Lz3/b;

    monitor-enter v1

    :try_start_1
    const-string v3, "errorCode"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lz3/q;->k:Lz3/b;

    if-nez v3, :cond_0

    iput-object v2, v1, Lz3/q;->k:Lz3/b;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    monitor-exit v1

    iget-object v2, p0, Lz3/f$e;->c:Lz3/f;

    iget v1, v1, Lz3/q;->m:I

    invoke-virtual {v2, v1}, Lz3/f;->f(I)Lz3/q;

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p3, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p1, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p2

    throw p1
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 5

    sget-object v0, Lz3/b;->e:Lz3/b;

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lz3/f$e;->b:Lz3/p;

    invoke-virtual {v2, p0}, Lz3/p;->b(Lz3/p$c;)V

    :goto_0
    iget-object v2, p0, Lz3/f$e;->b:Lz3/p;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, p0}, Lz3/p;->a(ZLz3/p$c;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v2, Lz3/b;->c:Lz3/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    sget-object v0, Lz3/b;->h:Lz3/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v3, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v3, v2, v0, v1}, Lz3/f;->b(Lz3/b;Lz3/b;Ljava/io/IOException;)V

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_0
    move-exception v2

    move-object v3, v2

    move-object v2, v0

    goto :goto_3

    :catch_1
    move-exception v1

    move-object v2, v0

    :goto_1
    :try_start_2
    sget-object v0, Lz3/b;->d:Lz3/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v2, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v2, v0, v0, v1}, Lz3/f;->b(Lz3/b;Lz3/b;Ljava/io/IOException;)V

    :goto_2
    iget-object v0, p0, Lz3/f$e;->b:Lz3/p;

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :catchall_1
    move-exception v3

    :goto_3
    iget-object v4, p0, Lz3/f$e;->c:Lz3/f;

    invoke-virtual {v4, v2, v0, v1}, Lz3/f;->b(Lz3/b;Lz3/b;Ljava/io/IOException;)V

    iget-object v0, p0, Lz3/f$e;->b:Lz3/p;

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    throw v3
.end method

.method public final priority()V
    .locals 0

    return-void
.end method
