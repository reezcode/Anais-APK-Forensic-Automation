.class public Lorg/apache/commons/io/input/BrokenReader;
.super Ljava/io/Reader;


# instance fields
.field private final exception:Ljava/io/IOException;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Broken reader"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/apache/commons/io/input/BrokenReader;-><init>(Ljava/io/IOException;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    iput-object p1, p0, Lorg/apache/commons/io/input/BrokenReader;->exception:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/input/BrokenReader;->exception:Ljava/io/IOException;

    throw v0
.end method

.method public mark(I)V
    .locals 0

    iget-object p1, p0, Lorg/apache/commons/io/input/BrokenReader;->exception:Ljava/io/IOException;

    throw p1
.end method

.method public read([CII)I
    .locals 0

    iget-object p1, p0, Lorg/apache/commons/io/input/BrokenReader;->exception:Ljava/io/IOException;

    throw p1
.end method

.method public ready()Z
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/input/BrokenReader;->exception:Ljava/io/IOException;

    throw v0
.end method

.method public declared-synchronized reset()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lorg/apache/commons/io/input/BrokenReader;->exception:Ljava/io/IOException;

    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public skip(J)J
    .locals 0

    iget-object p1, p0, Lorg/apache/commons/io/input/BrokenReader;->exception:Ljava/io/IOException;

    throw p1
.end method
