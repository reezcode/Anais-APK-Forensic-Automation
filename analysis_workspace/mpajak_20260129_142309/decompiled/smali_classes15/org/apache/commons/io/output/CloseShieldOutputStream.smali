.class public Lorg/apache/commons/io/output/CloseShieldOutputStream;
.super Lorg/apache/commons/io/output/ProxyOutputStream;


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/ProxyOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method

.method public static wrap(Ljava/io/OutputStream;)Lorg/apache/commons/io/output/CloseShieldOutputStream;
    .locals 1

    new-instance v0, Lorg/apache/commons/io/output/CloseShieldOutputStream;

    invoke-direct {v0, p0}, Lorg/apache/commons/io/output/CloseShieldOutputStream;-><init>(Ljava/io/OutputStream;)V

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    sget-object v0, Lorg/apache/commons/io/output/ClosedOutputStream;->CLOSED_OUTPUT_STREAM:Lorg/apache/commons/io/output/ClosedOutputStream;

    iput-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    return-void
.end method
