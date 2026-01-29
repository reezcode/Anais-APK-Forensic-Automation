.class public Lorg/apache/commons/io/output/BrokenWriter;
.super Ljava/io/Writer;


# instance fields
.field private final exception:Ljava/io/IOException;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Broken writer"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lorg/apache/commons/io/output/BrokenWriter;-><init>(Ljava/io/IOException;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    iput-object p1, p0, Lorg/apache/commons/io/output/BrokenWriter;->exception:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/output/BrokenWriter;->exception:Ljava/io/IOException;

    throw v0
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/output/BrokenWriter;->exception:Ljava/io/IOException;

    throw v0
.end method

.method public write([CII)V
    .locals 0

    iget-object p1, p0, Lorg/apache/commons/io/output/BrokenWriter;->exception:Ljava/io/IOException;

    throw p1
.end method
