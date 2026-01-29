.class public Lorg/apache/commons/io/input/SequenceReader;
.super Ljava/io/Reader;


# instance fields
.field private reader:Ljava/io/Reader;

.field private readers:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+",
            "Ljava/io/Reader;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/io/Reader;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    const-string v0, "readers"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/io/input/SequenceReader;->readers:Ljava/util/Iterator;

    invoke-direct {p0}, Lorg/apache/commons/io/input/SequenceReader;->nextReader()Ljava/io/Reader;

    move-result-object p1

    iput-object p1, p0, Lorg/apache/commons/io/input/SequenceReader;->reader:Ljava/io/Reader;

    return-void
.end method

.method public varargs constructor <init>([Ljava/io/Reader;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/apache/commons/io/input/SequenceReader;-><init>(Ljava/lang/Iterable;)V

    return-void
.end method

.method private nextReader()Ljava/io/Reader;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/input/SequenceReader;->readers:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/apache/commons/io/input/SequenceReader;->readers:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/Reader;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/commons/io/input/SequenceReader;->readers:Ljava/util/Iterator;

    iput-object v0, p0, Lorg/apache/commons/io/input/SequenceReader;->reader:Ljava/io/Reader;

    return-void
.end method

.method public read()I
    .locals 3

    const/4 v0, -0x1

    const/4 v1, -0x1

    :goto_0
    iget-object v2, p0, Lorg/apache/commons/io/input/SequenceReader;->reader:Ljava/io/Reader;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/Reader;->read()I

    move-result v1

    if-eq v1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lorg/apache/commons/io/input/SequenceReader;->nextReader()Ljava/io/Reader;

    move-result-object v2

    iput-object v2, p0, Lorg/apache/commons/io/input/SequenceReader;->reader:Ljava/io/Reader;

    goto :goto_0

    :cond_1
    :goto_1
    return v1
.end method

.method public read([CII)I
    .locals 3

    const-string v0, "cbuf"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-ltz p3, :cond_4

    if-ltz p2, :cond_4

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_4

    const/4 v0, 0x0

    :cond_0
    :goto_0
    iget-object v1, p0, Lorg/apache/commons/io/input/SequenceReader;->reader:Ljava/io/Reader;

    const/4 v2, -0x1

    if-eqz v1, :cond_2

    invoke-virtual {v1, p1, p2, p3}, Ljava/io/Reader;->read([CII)I

    move-result v1

    if-ne v1, v2, :cond_1

    invoke-direct {p0}, Lorg/apache/commons/io/input/SequenceReader;->nextReader()Ljava/io/Reader;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/commons/io/input/SequenceReader;->reader:Ljava/io/Reader;

    goto :goto_0

    :cond_1
    add-int/2addr v0, v1

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    if-gtz p3, :cond_0

    :cond_2
    if-lez v0, :cond_3

    return v0

    :cond_3
    return v2

    :cond_4
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Array Size="

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    array-length p1, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", offset="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", length="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
