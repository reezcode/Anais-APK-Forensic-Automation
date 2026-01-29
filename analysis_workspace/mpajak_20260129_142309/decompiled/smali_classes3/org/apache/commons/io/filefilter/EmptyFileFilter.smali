.class public Lorg/apache/commons/io/filefilter/EmptyFileFilter;
.super Lorg/apache/commons/io/filefilter/AbstractFileFilter;

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final EMPTY:Lorg/apache/commons/io/filefilter/IOFileFilter;

.field public static final NOT_EMPTY:Lorg/apache/commons/io/filefilter/IOFileFilter;

.field private static final serialVersionUID:J = 0x3265672603b5b8d3L


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/commons/io/filefilter/EmptyFileFilter;

    invoke-direct {v0}, Lorg/apache/commons/io/filefilter/EmptyFileFilter;-><init>()V

    sput-object v0, Lorg/apache/commons/io/filefilter/EmptyFileFilter;->EMPTY:Lorg/apache/commons/io/filefilter/IOFileFilter;

    invoke-interface {v0}, Lorg/apache/commons/io/filefilter/IOFileFilter;->negate()Lorg/apache/commons/io/filefilter/IOFileFilter;

    move-result-object v0

    sput-object v0, Lorg/apache/commons/io/filefilter/EmptyFileFilter;->NOT_EMPTY:Lorg/apache/commons/io/filefilter/IOFileFilter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;-><init>()V

    return-void
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;
    .locals 6

    const/4 p2, 0x0

    :try_start_0
    new-array v0, p2, [Ljava/nio/file/LinkOption;

    invoke-static {p1, v0}, Ljava/nio/file/Files;->isDirectory(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-static {p1}, Ljava/nio/file/Files;->list(Ljava/nio/file/Path;)Ljava/util/stream/Stream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-interface {v0}, Ljava/util/stream/Stream;->findFirst()Ljava/util/Optional;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Optional;->isPresent()Z

    move-result v2

    if-nez v2, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-static {p2, p1}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;->toFileVisitResult(ZLjava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v0}, Ljava/util/stream/Stream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p2

    if-eqz v0, :cond_1

    :try_start_4
    invoke-interface {v0}, Ljava/util/stream/Stream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p2

    :cond_2
    invoke-static {p1}, Ljava/nio/file/Files;->size(Ljava/nio/file/Path;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_3

    const/4 p2, 0x1

    :cond_3
    invoke-static {p2, p1}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;->toFileVisitResult(ZLjava/nio/file/Path;)Ljava/nio/file/FileVisitResult;

    move-result-object p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lorg/apache/commons/io/filefilter/AbstractFileFilter;->handle(Ljava/lang/Throwable;)Ljava/nio/file/FileVisitResult;

    move-result-object p1

    return-object p1
.end method

.method public accept(Ljava/io/File;)Z
    .locals 7

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lorg/apache/commons/io/IOUtils;->length([Ljava/lang/Object;)I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method
