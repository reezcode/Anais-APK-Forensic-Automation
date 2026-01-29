.class public abstract Ls3/d0;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()Ls3/u;
.end method

.method public abstract c()Lf4/h;
.end method

.method public final close()V
    .locals 1

    invoke-virtual {p0}, Ls3/d0;->c()Lf4/h;

    move-result-object v0

    invoke-static {v0}, Lt3/c;->d(Ljava/io/Closeable;)V

    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Ls3/d0;->c()Lf4/h;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, Ls3/d0;->b()Ls3/u;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ls3/u;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    :goto_0
    invoke-static {v0, v1}, Lt3/c;->t(Lf4/h;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-interface {v0, v1}, Lf4/h;->j0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method
