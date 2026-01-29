.class public final Lw3/a;
.super Ljava/lang/Object;

# interfaces
.implements Ls3/t;


# static fields
.field public static final a:Lw3/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/a;

    invoke-direct {v0}, Lw3/a;-><init>()V

    sput-object v0, Lw3/a;->a:Lw3/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ls3/t$a;)Ls3/b0;
    .locals 11

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lx3/g;

    iget-object v0, p1, Lx3/g;->b:Lw3/e;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    :try_start_0
    iget-boolean v1, v0, Lw3/e;->m:Z

    if-eqz v1, :cond_3

    iget-boolean v1, v0, Lw3/e;->l:Z

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_2

    iget-boolean v1, v0, Lw3/e;->k:Z

    xor-int/2addr v1, v2

    if-eqz v1, :cond_1

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    iget-object v1, v0, Lw3/e;->g:Lw3/d;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v10, v0, Lw3/e;->q:Ls3/w;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "client"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "chain"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    iget v4, p1, Lx3/g;->g:I

    iget v5, p1, Lx3/g;->h:I

    iget v6, p1, Lx3/g;->i:I

    iget v7, v10, Ls3/w;->B:I

    iget-boolean v8, v10, Ls3/w;->g:Z

    iget-object v3, p1, Lx3/g;->f:Ls3/y;

    iget-object v3, v3, Ls3/y;->c:Ljava/lang/String;

    const-string v9, "GET"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v9, v3, 0x1

    move-object v3, v1

    invoke-virtual/range {v3 .. v9}, Lw3/d;->a(IIIIZZ)Lw3/j;

    move-result-object v3

    invoke-virtual {v3, v10, p1}, Lw3/j;->k(Ls3/w;Lx3/g;)Lx3/d;

    move-result-object v3
    :try_end_1
    .catch Lw3/n; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    new-instance v4, Lw3/c;

    iget-object v5, v0, Lw3/e;->c:Ls3/o;

    invoke-direct {v4, v0, v5, v1, v3}, Lw3/c;-><init>(Lw3/e;Ls3/o;Lw3/d;Lx3/d;)V

    iput-object v4, v0, Lw3/e;->j:Lw3/c;

    iput-object v4, v0, Lw3/e;->o:Lw3/c;

    monitor-enter v0

    :try_start_2
    iput-boolean v2, v0, Lw3/e;->k:Z

    iput-boolean v2, v0, Lw3/e;->l:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-boolean v0, v0, Lw3/e;->n:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/16 v2, 0x3d

    invoke-static {p1, v0, v4, v1, v2}, Lx3/g;->a(Lx3/g;ILw3/c;Ls3/y;I)Lx3/g;

    move-result-object v0

    iget-object p1, p1, Lx3/g;->f:Ls3/y;

    invoke-virtual {v0, p1}, Lx3/g;->b(Ls3/y;)Ls3/b0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catch_0
    move-exception p1

    invoke-virtual {v1, p1}, Lw3/d;->c(Ljava/io/IOException;)V

    new-instance v0, Lw3/n;

    invoke-direct {v0, p1}, Lw3/n;-><init>(Ljava/io/IOException;)V

    throw v0

    :catch_1
    move-exception p1

    iget-object v0, p1, Lw3/n;->b:Ljava/io/IOException;

    invoke-virtual {v1, v0}, Lw3/d;->c(Ljava/io/IOException;)V

    throw p1

    :cond_1
    :try_start_3
    const-string p1, "Check failed."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    const-string p1, "Check failed."

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    const-string p1, "released"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method
