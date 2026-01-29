.class Lorg/apache/commons/io/file/Counters$AbstractPathCounters;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/commons/io/file/Counters$PathCounters;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/io/file/Counters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AbstractPathCounters"
.end annotation


# instance fields
.field private final byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

.field private final directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

.field private final fileCounter:Lorg/apache/commons/io/file/Counters$Counter;


# direct methods
.method public constructor <init>(Lorg/apache/commons/io/file/Counters$Counter;Lorg/apache/commons/io/file/Counters$Counter;Lorg/apache/commons/io/file/Counters$Counter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

    iput-object p2, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

    iput-object p3, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->fileCounter:Lorg/apache/commons/io/file/Counters$Counter;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

    iget-object v3, p1, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

    iget-object v3, p1, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->fileCounter:Lorg/apache/commons/io/file/Counters$Counter;

    iget-object p1, p1, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->fileCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-static {v1, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getByteCounter()Lorg/apache/commons/io/file/Counters$Counter;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

    return-object v0
.end method

.method public getDirectoryCounter()Lorg/apache/commons/io/file/Counters$Counter;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

    return-object v0
.end method

.method public getFileCounter()Lorg/apache/commons/io/file/Counters$Counter;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->fileCounter:Lorg/apache/commons/io/file/Counters$Counter;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->fileCounter:Lorg/apache/commons/io/file/Counters$Counter;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-interface {v0}, Lorg/apache/commons/io/file/Counters$Counter;->reset()V

    iget-object v0, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-interface {v0}, Lorg/apache/commons/io/file/Counters$Counter;->reset()V

    iget-object v0, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->fileCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-interface {v0}, Lorg/apache/commons/io/file/Counters$Counter;->reset()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->fileCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-interface {v1}, Lorg/apache/commons/io/file/Counters$Counter;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->directoryCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-interface {v1}, Lorg/apache/commons/io/file/Counters$Counter;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lorg/apache/commons/io/file/Counters$AbstractPathCounters;->byteCounter:Lorg/apache/commons/io/file/Counters$Counter;

    invoke-interface {v1}, Lorg/apache/commons/io/file/Counters$Counter;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "%,d files, %,d directories, %,d bytes"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
