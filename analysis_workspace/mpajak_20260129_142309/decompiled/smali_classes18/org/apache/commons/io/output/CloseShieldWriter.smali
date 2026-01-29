.class public Lorg/apache/commons/io/output/CloseShieldWriter;
.super Lorg/apache/commons/io/output/ProxyWriter;


# direct methods
.method public constructor <init>(Ljava/io/Writer;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0, p1}, Lorg/apache/commons/io/output/ProxyWriter;-><init>(Ljava/io/Writer;)V

    return-void
.end method

.method public static wrap(Ljava/io/Writer;)Lorg/apache/commons/io/output/CloseShieldWriter;
    .locals 1

    new-instance v0, Lorg/apache/commons/io/output/CloseShieldWriter;

    invoke-direct {v0, p0}, Lorg/apache/commons/io/output/CloseShieldWriter;-><init>(Ljava/io/Writer;)V

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 1

    sget-object v0, Lorg/apache/commons/io/output/ClosedWriter;->CLOSED_WRITER:Lorg/apache/commons/io/output/ClosedWriter;

    iput-object v0, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    return-void
.end method
