.class public final Ls3/z;
.super Ld1/f;


# instance fields
.field public final synthetic b:Ljava/io/File;

.field public final synthetic c:Ls3/u;


# direct methods
.method public constructor <init>(Ljava/io/File;Ls3/u;)V
    .locals 0

    iput-object p1, p0, Ls3/z;->b:Ljava/io/File;

    iput-object p2, p0, Ls3/z;->c:Ls3/u;

    invoke-direct {p0}, Ld1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()J
    .locals 2

    iget-object v0, p0, Ls3/z;->b:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0
.end method

.method public final B()Ls3/u;
    .locals 1

    iget-object v0, p0, Ls3/z;->c:Ls3/u;

    return-object v0
.end method

.method public final K(Lf4/g;)V
    .locals 3

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls3/z;->b:Ljava/io/File;

    sget-object v1, Lf4/q;->a:Ljava/util/logging/Logger;

    const-string v1, "$this$source"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lf4/p;

    new-instance v1, Lf4/b0;

    invoke-direct {v1}, Lf4/b0;-><init>()V

    invoke-direct {v0, v2, v1}, Lf4/p;-><init>(Ljava/io/InputStream;Lf4/b0;)V

    :try_start_0
    invoke-interface {p1, v0}, Lf4/g;->b0(Lf4/a0;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    invoke-static {v0, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v1

    invoke-static {v0, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
.end method
