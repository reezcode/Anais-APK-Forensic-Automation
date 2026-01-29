.class public Lorg/apache/commons/io/output/ClosedWriter;
.super Ljava/io/Writer;


# static fields
.field public static final CLOSED_WRITER:Lorg/apache/commons/io/output/ClosedWriter;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/commons/io/output/ClosedWriter;

    invoke-direct {v0}, Lorg/apache/commons/io/output/ClosedWriter;-><init>()V

    sput-object v0, Lorg/apache/commons/io/output/ClosedWriter;->CLOSED_WRITER:Lorg/apache/commons/io/output/ClosedWriter;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public flush()V
    .locals 2

    new-instance v0, Ljava/io/IOException;

    const-string v1, "flush() failed: stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public write([CII)V
    .locals 3

    new-instance v0, Ljava/io/IOException;

    const-string v1, "write("

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, p1}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ") failed: stream is closed"

    invoke-static {v1, p3, p1}, Landroidx/appcompat/view/a;->h(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
