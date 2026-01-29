.class public Lorg/apache/commons/io/file/Counters;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/apache/commons/io/file/Counters$PathCounters;,
        Lorg/apache/commons/io/file/Counters$NoopPathCounters;,
        Lorg/apache/commons/io/file/Counters$NoopCounter;,
        Lorg/apache/commons/io/file/Counters$LongPathCounters;,
        Lorg/apache/commons/io/file/Counters$LongCounter;,
        Lorg/apache/commons/io/file/Counters$Counter;,
        Lorg/apache/commons/io/file/Counters$BigIntegerPathCounters;,
        Lorg/apache/commons/io/file/Counters$BigIntegerCounter;,
        Lorg/apache/commons/io/file/Counters$AbstractPathCounters;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bigIntegerCounter()Lorg/apache/commons/io/file/Counters$Counter;
    .locals 2

    new-instance v0, Lorg/apache/commons/io/file/Counters$BigIntegerCounter;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/apache/commons/io/file/Counters$BigIntegerCounter;-><init>(Lorg/apache/commons/io/file/Counters$1;)V

    return-object v0
.end method

.method public static bigIntegerPathCounters()Lorg/apache/commons/io/file/Counters$PathCounters;
    .locals 1

    new-instance v0, Lorg/apache/commons/io/file/Counters$BigIntegerPathCounters;

    invoke-direct {v0}, Lorg/apache/commons/io/file/Counters$BigIntegerPathCounters;-><init>()V

    return-object v0
.end method

.method public static longCounter()Lorg/apache/commons/io/file/Counters$Counter;
    .locals 2

    new-instance v0, Lorg/apache/commons/io/file/Counters$LongCounter;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/apache/commons/io/file/Counters$LongCounter;-><init>(Lorg/apache/commons/io/file/Counters$1;)V

    return-object v0
.end method

.method public static longPathCounters()Lorg/apache/commons/io/file/Counters$PathCounters;
    .locals 1

    new-instance v0, Lorg/apache/commons/io/file/Counters$LongPathCounters;

    invoke-direct {v0}, Lorg/apache/commons/io/file/Counters$LongPathCounters;-><init>()V

    return-object v0
.end method

.method public static noopCounter()Lorg/apache/commons/io/file/Counters$Counter;
    .locals 1

    sget-object v0, Lorg/apache/commons/io/file/Counters$NoopCounter;->INSTANCE:Lorg/apache/commons/io/file/Counters$NoopCounter;

    return-object v0
.end method

.method public static noopPathCounters()Lorg/apache/commons/io/file/Counters$PathCounters;
    .locals 1

    sget-object v0, Lorg/apache/commons/io/file/Counters$NoopPathCounters;->INSTANCE:Lorg/apache/commons/io/file/Counters$NoopPathCounters;

    return-object v0
.end method
