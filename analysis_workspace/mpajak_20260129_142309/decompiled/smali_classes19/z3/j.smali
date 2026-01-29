.class public final Lz3/j;
.super Lv3/a;


# instance fields
.field public final synthetic e:Lz3/f;

.field public final synthetic f:I

.field public final synthetic g:Lf4/f;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f;ILf4/f;IZ)V
    .locals 0

    iput-object p2, p0, Lz3/j;->e:Lz3/f;

    iput p3, p0, Lz3/j;->f:I

    iput-object p4, p0, Lz3/j;->g:Lf4/f;

    iput p5, p0, Lz3/j;->h:I

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    :try_start_0
    iget-object v0, p0, Lz3/j;->e:Lz3/f;

    iget-object v0, v0, Lz3/f;->m:Li/g;

    iget-object v1, p0, Lz3/j;->g:Lf4/f;

    iget v2, p0, Lz3/j;->h:I

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "source"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, Lf4/f;->skip(J)V

    iget-object v0, p0, Lz3/j;->e:Lz3/f;

    iget-object v0, v0, Lz3/f;->z:Lz3/r;

    iget v1, p0, Lz3/j;->f:I

    sget-object v2, Lz3/b;->h:Lz3/b;

    invoke-virtual {v0, v1, v2}, Lz3/r;->n(ILz3/b;)V

    iget-object v0, p0, Lz3/j;->e:Lz3/f;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lz3/j;->e:Lz3/f;

    iget-object v1, v1, Lz3/f;->B:Ljava/util/LinkedHashSet;

    iget v2, p0, Lz3/j;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
