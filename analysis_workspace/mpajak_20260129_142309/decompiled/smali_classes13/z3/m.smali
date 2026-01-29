.class public final Lz3/m;
.super Lv3/a;


# instance fields
.field public final synthetic e:Lz3/f;

.field public final synthetic f:I

.field public final synthetic g:Lz3/b;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lz3/f;ILz3/b;)V
    .locals 0

    iput-object p2, p0, Lz3/m;->e:Lz3/f;

    iput p3, p0, Lz3/m;->f:I

    iput-object p4, p0, Lz3/m;->g:Lz3/b;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lv3/a;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    iget-object v0, p0, Lz3/m;->e:Lz3/f;

    iget-object v0, v0, Lz3/f;->m:Li/g;

    iget-object v1, p0, Lz3/m;->g:Lz3/b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "errorCode"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lz3/m;->e:Lz3/f;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz3/m;->e:Lz3/f;

    iget-object v1, v1, Lz3/f;->B:Ljava/util/LinkedHashSet;

    iget v2, p0, Lz3/m;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    const-wide/16 v0, -0x1

    return-wide v0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
