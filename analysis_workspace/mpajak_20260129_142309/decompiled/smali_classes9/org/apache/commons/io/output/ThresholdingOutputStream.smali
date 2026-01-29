.class public Lorg/apache/commons/io/output/ThresholdingOutputStream;
.super Ljava/io/OutputStream;


# static fields
.field private static final NOOP_OS_GETTER:Lorg/apache/commons/io/function/IOFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/apache/commons/io/function/IOFunction<",
            "Lorg/apache/commons/io/output/ThresholdingOutputStream;",
            "Ljava/io/OutputStream;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final outputStreamGetter:Lorg/apache/commons/io/function/IOFunction;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/apache/commons/io/function/IOFunction<",
            "Lorg/apache/commons/io/output/ThresholdingOutputStream;",
            "Ljava/io/OutputStream;",
            ">;"
        }
    .end annotation
.end field

.field private final threshold:I

.field private final thresholdConsumer:Lorg/apache/commons/io/function/IOConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/apache/commons/io/function/IOConsumer<",
            "Lorg/apache/commons/io/output/ThresholdingOutputStream;",
            ">;"
        }
    .end annotation
.end field

.field private thresholdExceeded:Z

.field private written:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/work/impl/model/a;->c:Landroidx/work/impl/model/a;

    sput-object v0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->NOOP_OS_GETTER:Lorg/apache/commons/io/function/IOFunction;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-static {}, Li4/b;->d()Lorg/apache/commons/io/function/IOConsumer;

    move-result-object v0

    sget-object v1, Lorg/apache/commons/io/output/ThresholdingOutputStream;->NOOP_OS_GETTER:Lorg/apache/commons/io/function/IOFunction;

    invoke-direct {p0, p1, v0, v1}, Lorg/apache/commons/io/output/ThresholdingOutputStream;-><init>(ILorg/apache/commons/io/function/IOConsumer;Lorg/apache/commons/io/function/IOFunction;)V

    return-void
.end method

.method public constructor <init>(ILorg/apache/commons/io/function/IOConsumer;Lorg/apache/commons/io/function/IOFunction;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lorg/apache/commons/io/function/IOConsumer<",
            "Lorg/apache/commons/io/output/ThresholdingOutputStream;",
            ">;",
            "Lorg/apache/commons/io/function/IOFunction<",
            "Lorg/apache/commons/io/output/ThresholdingOutputStream;",
            "Ljava/io/OutputStream;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    iput p1, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->threshold:I

    if-nez p2, :cond_0

    invoke-static {}, Li4/b;->d()Lorg/apache/commons/io/function/IOConsumer;

    move-result-object p2

    :cond_0
    iput-object p2, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->thresholdConsumer:Lorg/apache/commons/io/function/IOConsumer;

    if-nez p3, :cond_1

    sget-object p3, Lorg/apache/commons/io/output/ThresholdingOutputStream;->NOOP_OS_GETTER:Lorg/apache/commons/io/function/IOFunction;

    :cond_1
    iput-object p3, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->outputStreamGetter:Lorg/apache/commons/io/function/IOFunction;

    return-void
.end method

.method public static synthetic a(Lorg/apache/commons/io/output/ThresholdingOutputStream;)Ljava/io/OutputStream;
    .locals 0

    invoke-static {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->lambda$static$0(Lorg/apache/commons/io/output/ThresholdingOutputStream;)Ljava/io/OutputStream;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic lambda$static$0(Lorg/apache/commons/io/output/ThresholdingOutputStream;)Ljava/io/OutputStream;
    .locals 0

    sget-object p0, Lorg/apache/commons/io/output/NullOutputStream;->NULL_OUTPUT_STREAM:Lorg/apache/commons/io/output/NullOutputStream;

    return-object p0
.end method


# virtual methods
.method public checkThreshold(I)V
    .locals 4

    iget-boolean v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->thresholdExceeded:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iget p1, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->threshold:I

    int-to-long v2, p1

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->thresholdExceeded:Z

    invoke-virtual {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->thresholdReached()V

    :cond_0
    return-void
.end method

.method public close()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->getStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    invoke-virtual {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->getStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public getByteCount()J
    .locals 2

    iget-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    return-wide v0
.end method

.method public getStream()Ljava/io/OutputStream;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->outputStreamGetter:Lorg/apache/commons/io/function/IOFunction;

    invoke-interface {v0, p0}, Lorg/apache/commons/io/function/IOFunction;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/OutputStream;

    return-object v0
.end method

.method public getThreshold()I
    .locals 1

    iget v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->threshold:I

    return v0
.end method

.method public isThresholdExceeded()Z
    .locals 5

    iget-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    iget v2, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->threshold:I

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public resetByteCount()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->thresholdExceeded:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    return-void
.end method

.method public setByteCount(J)V
    .locals 0

    iput-wide p1, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    return-void
.end method

.method public thresholdReached()V
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->thresholdConsumer:Lorg/apache/commons/io/function/IOConsumer;

    invoke-interface {v0, p0}, Lorg/apache/commons/io/function/IOConsumer;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public write(I)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->checkThreshold(I)V

    invoke-virtual {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->getStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    iget-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    return-void
.end method

.method public write([B)V
    .locals 4

    array-length v0, p1

    invoke-virtual {p0, v0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->checkThreshold(I)V

    invoke-virtual {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->getStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    iget-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    array-length p1, p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    return-void
.end method

.method public write([BII)V
    .locals 2

    invoke-virtual {p0, p3}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->checkThreshold(I)V

    invoke-virtual {p0}, Lorg/apache/commons/io/output/ThresholdingOutputStream;->getStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    iget-wide p1, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    int-to-long v0, p3

    add-long/2addr p1, v0

    iput-wide p1, p0, Lorg/apache/commons/io/output/ThresholdingOutputStream;->written:J

    return-void
.end method
