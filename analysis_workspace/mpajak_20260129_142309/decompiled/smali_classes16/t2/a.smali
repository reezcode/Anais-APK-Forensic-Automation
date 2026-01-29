.class public abstract Lt2/a;
.super Ljava/lang/Object;

# interfaces
.implements Lt2/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "ID:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt2/g<",
        "TT;TID;>;"
    }
.end annotation


# static fields
.field public static final j:Lt2/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/util/List<",
            "Lt2/a<",
            "**>;>;>;"
        }
    .end annotation
.end field


# instance fields
.field public b:Z

.field public c:Lz2/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/l<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public d:Lu2/d;

.field public final e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field public f:Ld3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/b<",
            "TT;>;"
        }
    .end annotation
.end field

.field public g:Ld3/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld3/c<",
            "TT;TID;>;"
        }
    .end annotation
.end field

.field public h:Lc3/c;

.field public i:Lz2/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/f<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt2/a$a;

    invoke-direct {v0}, Lt2/a$a;-><init>()V

    sput-object v0, Lt2/a;->j:Lt2/a$a;

    return-void
.end method

.method public constructor <init>(Lc3/c;Ljava/lang/Class;Ld3/b;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc3/c;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ld3/b<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lt2/a;->e:Ljava/lang/Class;

    iput-object p3, p0, Lt2/a;->f:Ld3/b;

    if-eqz p1, :cond_6

    iput-object p1, p0, Lt2/a;->h:Lc3/c;

    iget-boolean v0, p0, Lt2/a;->b:Z

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    move-object v0, p1

    check-cast v0, Lq2/b;

    iget-object v0, v0, Lq2/b;->d:Lu2/d;

    iput-object v0, p0, Lt2/a;->d:Lu2/d;

    if-eqz v0, :cond_5

    if-nez p3, :cond_1

    new-instance p3, Ld3/c;

    invoke-direct {p3, p1, p0, p2}, Ld3/c;-><init>(Lc3/c;Lt2/a;Ljava/lang/Class;)V

    iput-object p3, p0, Lt2/a;->g:Ld3/c;

    goto :goto_0

    :cond_1
    invoke-virtual {p3, p1}, Ld3/b;->a(Lc3/c;)V

    new-instance p1, Ld3/c;

    iget-object p2, p0, Lt2/a;->f:Ld3/b;

    invoke-direct {p1, p0, p2}, Ld3/c;-><init>(Lt2/a;Ld3/b;)V

    iput-object p1, p0, Lt2/a;->g:Ld3/c;

    :goto_0
    new-instance p1, Lz2/l;

    iget-object p2, p0, Lt2/a;->d:Lu2/d;

    iget-object p3, p0, Lt2/a;->g:Ld3/c;

    invoke-direct {p1, p2, p3, p0}, Lz2/l;-><init>(Lu2/c;Ld3/c;Lt2/g;)V

    iput-object p1, p0, Lt2/a;->c:Lz2/l;

    sget-object p1, Lt2/a;->j:Lt2/a$a;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x1

    if-le p2, p3, :cond_2

    goto :goto_3

    :cond_2
    const/4 p2, 0x0

    :goto_1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_4

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt2/a;

    iget-object v1, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v1, v0}, Lt2/h;->d(Lc3/c;Lt2/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, v0, Lt2/a;->g:Ld3/c;

    iget-object v1, v1, Ld3/c;->d:[Lv2/g;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    iget-object v5, p0, Lt2/a;->h:Lc3/c;

    iget-object v6, v0, Lt2/a;->e:Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Lv2/g;->c(Lc3/c;Ljava/lang/Class;)V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    :try_start_2
    iput-boolean p3, v0, Lt2/a;->b:Z

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :catch_0
    move-exception p2

    iget-object p3, p0, Lt2/a;->h:Lc3/c;

    invoke-static {p3, v0}, Lt2/h;->e(Lc3/c;Lt2/g;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_4
    invoke-interface {p1}, Ljava/util/List;->clear()V

    sget-object p1, Lt2/a;->j:Lt2/a$a;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    goto :goto_3

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Ljava/util/List;->clear()V

    sget-object p1, Lt2/a;->j:Lt2/a$a;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->remove()V

    throw p2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "connectionSource is getting a null DatabaseType in "

    invoke-static {p2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_3
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lt2/a;->e:Ljava/lang/Class;

    return-object v0
.end method

.method public final c()Lz2/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz2/h<",
            "TT;TID;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    new-instance v0, Lz2/h;

    iget-object v1, p0, Lt2/a;->d:Lu2/d;

    iget-object v2, p0, Lt2/a;->g:Ld3/c;

    invoke-direct {v0, v1, v2, p0}, Lz2/h;-><init>(Lu2/c;Ld3/c;Lt2/g;)V

    return-object v0
.end method

.method public final d(Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p1, v2}, Lz2/l;->i(Lc3/d;Ljava/lang/Object;Lt2/m;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TID;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    iget-object v2, v1, Lz2/l;->d:La3/f;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v2, v1, Lz2/l;->a:Lu2/c;

    iget-object v4, v1, Lz2/l;->b:Ld3/c;

    invoke-static {v2, v4, v3}, La3/f;->f(Lu2/c;Ld3/c;Lv2/g;)La3/f;

    move-result-object v2

    iput-object v2, v1, Lz2/l;->d:La3/f;

    :cond_0
    iget-object v1, v1, Lz2/l;->d:La3/f;

    invoke-virtual {v1, v0, p1, v3}, La3/f;->g(Lc3/d;Ljava/lang/Object;Lt2/m;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final f()J
    .locals 3

    invoke-virtual {p0}, Lt2/a;->l()V

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    invoke-virtual {v1, v0}, Lz2/l;->f(Lc3/d;)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-wide v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method public final g(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TID;)Z"
        }
    .end annotation

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    invoke-virtual {v1, v0, p1}, Lz2/l;->e(Lc3/d;Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final h()Lz2/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lz2/c<",
            "TT;TID;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    new-instance v0, Lz2/c;

    iget-object v1, p0, Lt2/a;->d:Lu2/d;

    iget-object v2, p0, Lt2/a;->g:Ld3/c;

    invoke-direct {v0, v1, v2, p0}, Lz2/c;-><init>(Lu2/c;Ld3/c;Lt2/g;)V

    return-object v0
.end method

.method public final i(Lz2/f;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/f<",
            "TT;>;)J"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    move-object v0, p1

    check-cast v0, La3/e;

    iget v0, v0, La3/e;->m:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    invoke-virtual {v1, v0, p1}, Lz2/l;->h(Lc3/d;Lz2/g;)J

    move-result-wide v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lt2/a;->h:Lc3/c;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-wide v0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Prepared query is not of type "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v1}, Landroidx/appcompat/widget/a;->o(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", did you call QueryBuilder.setCountOf(true)?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lt2/a;->r()Lt2/f;

    move-result-object v0

    return-object v0
.end method

.method public final j(Lz2/f;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/f<",
            "TT;>;)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    invoke-virtual {v1, v0, p1}, Lz2/l;->g(Lc3/d;Lz2/g;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final k(Lz2/f;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/f<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    iget-object v0, p0, Lt2/a;->c:Lz2/l;

    iget-object v1, p0, Lt2/a;->h:Lc3/c;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, p1}, Lz2/l;->b(Lt2/a;Lc3/c;Lz2/g;)Lz2/j;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-virtual {v0}, Lz2/j;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lz2/j;->b()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v2, Lz2/l;->k:Lx2/c;

    const-string v3, "query of \'{}\' returned {} results"

    check-cast p1, La3/e;

    iget-object p1, p1, La3/b;->d:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, p1, v4}, Lx2/c;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lz2/j;->close()V

    return-object v1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Lz2/j;->close()V

    throw p1
.end method

.method public final l()V
    .locals 2

    iget-boolean v0, p0, Lt2/a;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "you must call initialize() before you can use the dao"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final m(Lz2/e;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/e<",
            "TT;>;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x5

    check-cast p1, La3/e;

    invoke-virtual {p1, v0, v1}, La3/e;->f(Lc3/d;I)Lc3/b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    move-object v0, p1

    check-cast v0, Lq2/a;

    invoke-virtual {v0}, Lq2/a;->f()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Lq2/a;->a()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return p1

    :catchall_0
    move-exception v0

    :try_start_3
    check-cast p1, Lq2/a;

    invoke-virtual {p1}, Lq2/a;->a()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final n(Ljava/lang/Object;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    instance-of v0, p1, Ly2/a;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Ly2/a;

    :cond_1
    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    invoke-virtual {v1, v0, p1}, Lz2/l;->c(Lc3/d;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final o(Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    check-cast v0, Lq2/b;

    invoke-virtual {v0}, Lq2/b;->c()Lc3/d;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lt2/a;->c:Lz2/l;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, p1, v2}, Lz2/l;->d(Lc3/d;Ljava/lang/Object;Lt2/m;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lt2/a;->h:Lc3/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    throw p1
.end method

.method public final p(Ljava/lang/Object;)Lt2/g$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lt2/g$a;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance p1, Lt2/g$a;

    invoke-direct {p1}, Lt2/g$a;-><init>()V

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lt2/a;->l()V

    iget-object v0, p0, Lt2/a;->g:Ld3/c;

    iget-object v0, v0, Ld3/c;->f:Lv2/g;

    if-eqz v0, :cond_3

    invoke-virtual {v0, p1}, Lv2/g;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lt2/a;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, Lt2/a;->d(Ljava/lang/Object;)I

    new-instance p1, Lt2/g$a;

    invoke-direct {p1}, Lt2/g$a;-><init>()V

    return-object p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lt2/a;->n(Ljava/lang/Object;)I

    new-instance p1, Lt2/g$a;

    invoke-direct {p1}, Lt2/g$a;-><init>()V

    return-object p1

    :cond_3
    new-instance p1, Ljava/sql/SQLException;

    const-string v0, "Class "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lt2/a;->e:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " does not have an id field"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lz2/f;)Lt2/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz2/f<",
            "TT;>;I)",
            "Lt2/f<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    :try_start_0
    iget-object v0, p0, Lt2/a;->c:Lz2/l;

    iget-object v1, p0, Lt2/a;->h:Lc3/c;

    invoke-virtual {v0, p0, v1, p1}, Lz2/l;->b(Lt2/a;Lc3/c;Lz2/g;)Lz2/j;

    move-result-object p1
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    iput-object p1, p0, Lt2/a;->i:Lz2/j;

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "Could not build prepared-query iterator for "

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lt2/a;->e:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ld1/c;->e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;

    move-result-object p1

    throw p1
.end method

.method public final r()Lt2/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt2/f<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lt2/a;->l()V

    :try_start_0
    iget-object v0, p0, Lt2/a;->c:Lz2/l;

    iget-object v1, p0, Lt2/a;->h:Lc3/c;

    iget-object v2, v0, Lz2/l;->e:La3/e;

    if-nez v2, :cond_0

    new-instance v2, Lz2/h;

    iget-object v3, v0, Lz2/l;->a:Lu2/c;

    iget-object v4, v0, Lz2/l;->b:Ld3/c;

    iget-object v5, v0, Lz2/l;->c:Lt2/g;

    invoke-direct {v2, v3, v4, v5}, Lz2/h;-><init>(Lu2/c;Ld3/c;Lt2/g;)V

    invoke-virtual {v2}, Lz2/k;->f()La3/e;

    move-result-object v2

    iput-object v2, v0, Lz2/l;->e:La3/e;

    :cond_0
    iget-object v2, v0, Lz2/l;->e:La3/e;

    invoke-virtual {v0, p0, v1, v2}, Lz2/l;->b(Lt2/a;Lc3/c;Lz2/g;)Lz2/j;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iput-object v0, p0, Lt2/a;->i:Lz2/j;

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Could not build iterator for "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lt2/a;->e:Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
