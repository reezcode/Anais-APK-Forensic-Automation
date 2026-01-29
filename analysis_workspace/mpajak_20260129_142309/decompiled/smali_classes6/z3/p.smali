.class public final Lz3/p;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz3/p$b;,
        Lz3/p$c;,
        Lz3/p$a;
    }
.end annotation


# static fields
.field public static final f:Ljava/util/logging/Logger;

.field public static final g:Lz3/p$a;


# instance fields
.field public final b:Lz3/p$b;

.field public final c:Lz3/d$a;

.field public final d:Lf4/h;

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz3/p$a;

    invoke-direct {v0}, Lz3/p$a;-><init>()V

    sput-object v0, Lz3/p;->g:Lz3/p$a;

    const-class v0, Lz3/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, "Logger.getLogger(Http2::class.java.name)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lz3/p;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Lf4/h;Z)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/p;->d:Lf4/h;

    iput-boolean p2, p0, Lz3/p;->e:Z

    new-instance p2, Lz3/p$b;

    invoke-direct {p2, p1}, Lz3/p$b;-><init>(Lf4/h;)V

    iput-object p2, p0, Lz3/p;->b:Lz3/p$b;

    new-instance p1, Lz3/d$a;

    invoke-direct {p1, p2}, Lz3/d$a;-><init>(Lf4/a0;)V

    iput-object p1, p0, Lz3/p;->c:Lz3/d$a;

    return-void
.end method


# virtual methods
.method public final a(ZLz3/p$c;)Z
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "handler"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v0, Lz3/p;->d:Lf4/h;

    const-wide/16 v4, 0x9

    invoke-interface {v3, v4, v5}, Lf4/h;->c0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v3, v0, Lz3/p;->d:Lf4/h;

    invoke-static {v3}, Lt3/c;->u(Lf4/h;)I

    move-result v3

    const/16 v10, 0x4000

    if-gt v3, v10, :cond_30

    iget-object v4, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v4}, Lf4/h;->readByte()B

    move-result v4

    and-int/lit16 v11, v4, 0xff

    iget-object v4, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v4}, Lf4/h;->readByte()B

    move-result v4

    and-int/lit16 v12, v4, 0xff

    iget-object v4, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v4}, Lf4/h;->readInt()I

    move-result v4

    const v13, 0x7fffffff

    and-int v14, v4, v13

    sget-object v15, Lz3/p;->f:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v15, v4}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lz3/e;->e:Lz3/e;

    const/4 v5, 0x1

    move v6, v14

    move v7, v3

    move v8, v11

    move v9, v12

    invoke-virtual/range {v4 .. v9}, Lz3/e;->b(ZIIII)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    const/4 v4, 0x4

    if-eqz p1, :cond_2

    if-ne v11, v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Expected a SETTINGS frame but was "

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lz3/e;->e:Lz3/e;

    invoke-virtual {v3, v11}, Lz3/e;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x5

    const/16 v7, 0x8

    const/4 v8, 0x1

    packed-switch v11, :pswitch_data_0

    iget-object v1, v0, Lz3/p;->d:Lf4/h;

    int-to-long v2, v3

    invoke-interface {v1, v2, v3}, Lf4/h;->skip(J)V

    goto/16 :goto_c

    :pswitch_0
    if-ne v3, v4, :cond_4

    iget-object v2, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v2}, Lf4/h;->readInt()I

    move-result v2

    const-wide/32 v3, 0x7fffffff

    sget-object v5, Lt3/c;->a:[B

    int-to-long v5, v2

    and-long v2, v5, v3

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-eqz v6, :cond_3

    invoke-interface {v1, v14, v2, v3}, Lz3/p$c;->g(IJ)V

    goto/16 :goto_c

    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "windowSizeIncrement was 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_WINDOW_UPDATE length !=4: "

    invoke-static {v2, v3}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_1
    if-lt v3, v7, :cond_b

    if-nez v14, :cond_a

    iget-object v2, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v2}, Lf4/h;->readInt()I

    move-result v2

    iget-object v4, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v4}, Lf4/h;->readInt()I

    move-result v4

    sub-int/2addr v3, v7

    invoke-static {}, Lz3/b;->values()[Lz3/b;

    move-result-object v6

    array-length v7, v6

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v7, :cond_7

    aget-object v10, v6, v9

    iget v11, v10, Lz3/b;->b:I

    if-ne v11, v4, :cond_5

    const/4 v11, 0x1

    goto :goto_2

    :cond_5
    const/4 v11, 0x0

    :goto_2
    if-eqz v11, :cond_6

    move-object v5, v10

    goto :goto_3

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_7
    :goto_3
    if-eqz v5, :cond_9

    sget-object v4, Lf4/i;->e:Lf4/i;

    if-lez v3, :cond_8

    iget-object v4, v0, Lz3/p;->d:Lf4/h;

    int-to-long v6, v3

    invoke-interface {v4, v6, v7}, Lf4/h;->d(J)Lf4/i;

    move-result-object v4

    :cond_8
    invoke-interface {v1, v2, v5, v4}, Lz3/p$c;->i(ILz3/b;Lf4/i;)V

    goto/16 :goto_c

    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY unexpected error code: "

    invoke-static {v2, v4}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY streamId != 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_b
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_GOAWAY length < 8: "

    invoke-static {v2, v3}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_2
    if-ne v3, v7, :cond_e

    if-nez v14, :cond_d

    iget-object v3, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v3}, Lf4/h;->readInt()I

    move-result v3

    iget-object v4, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v4}, Lf4/h;->readInt()I

    move-result v4

    and-int/lit8 v5, v12, 0x1

    if-eqz v5, :cond_c

    const/4 v2, 0x1

    :cond_c
    invoke-interface {v1, v2, v3, v4}, Lz3/p$c;->d(ZII)V

    goto/16 :goto_c

    :cond_d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_PING streamId != 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_PING length != 8: "

    invoke-static {v2, v3}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_3
    if-eqz v14, :cond_10

    and-int/lit8 v4, v12, 0x8

    if-eqz v4, :cond_f

    iget-object v2, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v2}, Lf4/h;->readByte()B

    move-result v2

    sget-object v4, Lt3/c;->a:[B

    and-int/lit16 v2, v2, 0xff

    :cond_f
    iget-object v4, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v4}, Lf4/h;->readInt()I

    move-result v4

    and-int/2addr v4, v13

    sget-object v5, Lz3/p;->g:Lz3/p$a;

    add-int/lit8 v3, v3, -0x4

    invoke-virtual {v5, v3, v12, v2}, Lz3/p$a;->a(III)I

    move-result v3

    invoke-virtual {v0, v3, v2, v12, v14}, Lz3/p;->c(IIII)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v4, v2}, Lz3/p$c;->a(ILjava/util/List;)V

    goto/16 :goto_c

    :cond_10
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_4
    if-nez v14, :cond_1e

    and-int/lit8 v5, v12, 0x1

    if-eqz v5, :cond_12

    if-nez v3, :cond_11

    invoke-interface/range {p2 .. p2}, Lz3/p$c;->b()V

    goto/16 :goto_c

    :cond_11
    new-instance v1, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR ack frame should be empty!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    rem-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1d

    new-instance v5, Lz3/u;

    invoke-direct {v5}, Lz3/u;-><init>()V

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->step(Lkotlin/ranges/IntProgression;I)Lkotlin/ranges/IntProgression;

    move-result-object v2

    invoke-virtual {v2}, Lkotlin/ranges/IntProgression;->getFirst()I

    move-result v3

    invoke-virtual {v2}, Lkotlin/ranges/IntProgression;->getLast()I

    move-result v7

    invoke-virtual {v2}, Lkotlin/ranges/IntProgression;->getStep()I

    move-result v2

    if-ltz v2, :cond_13

    if-gt v3, v7, :cond_1c

    goto :goto_4

    :cond_13
    if-lt v3, v7, :cond_1c

    :goto_4
    iget-object v9, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v9}, Lf4/h;->readShort()S

    move-result v9

    const v11, 0xffff

    sget-object v12, Lt3/c;->a:[B

    and-int/2addr v9, v11

    iget-object v11, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v11}, Lf4/h;->readInt()I

    move-result v11

    const/4 v12, 0x2

    if-eq v9, v12, :cond_19

    const/4 v12, 0x3

    if-eq v9, v12, :cond_18

    if-eq v9, v4, :cond_16

    if-eq v9, v6, :cond_14

    goto :goto_5

    :cond_14
    if-lt v11, v10, :cond_15

    const v12, 0xffffff

    if-gt v11, v12, :cond_15

    goto :goto_5

    :cond_15
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "

    invoke-static {v2, v11}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    const/4 v9, 0x7

    if-ltz v11, :cond_17

    goto :goto_5

    :cond_17
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_18
    const/4 v9, 0x4

    goto :goto_5

    :cond_19
    if-eqz v11, :cond_1b

    if-ne v11, v8, :cond_1a

    goto :goto_5

    :cond_1a
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1b
    :goto_5
    invoke-virtual {v5, v9, v11}, Lz3/u;->c(II)Lz3/u;

    if-eq v3, v7, :cond_1c

    add-int/2addr v3, v2

    goto :goto_4

    :cond_1c
    invoke-interface {v1, v5}, Lz3/p$c;->e(Lz3/u;)V

    goto/16 :goto_c

    :cond_1d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS length % 6 != 0: "

    invoke-static {v2, v3}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1e
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_SETTINGS streamId != 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_5
    if-ne v3, v4, :cond_24

    if-eqz v14, :cond_23

    iget-object v2, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v2}, Lf4/h;->readInt()I

    move-result v2

    invoke-static {}, Lz3/b;->values()[Lz3/b;

    move-result-object v3

    array-length v4, v3

    const/4 v6, 0x0

    :goto_6
    if-ge v6, v4, :cond_21

    aget-object v7, v3, v6

    iget v9, v7, Lz3/b;->b:I

    if-ne v9, v2, :cond_1f

    const/4 v9, 0x1

    goto :goto_7

    :cond_1f
    const/4 v9, 0x0

    :goto_7
    if-eqz v9, :cond_20

    move-object v5, v7

    goto :goto_8

    :cond_20
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_21
    :goto_8
    if-eqz v5, :cond_22

    invoke-interface {v1, v14, v5}, Lz3/p$c;->f(ILz3/b;)V

    goto/16 :goto_c

    :cond_22
    new-instance v1, Ljava/io/IOException;

    const-string v3, "TYPE_RST_STREAM unexpected error code: "

    invoke-static {v3, v2}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM streamId == 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_24
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_RST_STREAM length: "

    const-string v4, " != 4"

    invoke-static {v2, v3, v4}, Landroidx/activity/d;->c(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_6
    if-ne v3, v6, :cond_26

    if-eqz v14, :cond_25

    invoke-virtual {v0, v1, v14}, Lz3/p;->e(Lz3/p$c;I)V

    goto/16 :goto_c

    :cond_25
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY streamId == 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_26
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TYPE_PRIORITY length: "

    const-string v4, " != 5"

    invoke-static {v2, v3, v4}, Landroidx/activity/d;->c(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_7
    if-eqz v14, :cond_2a

    and-int/lit8 v4, v12, 0x1

    if-eqz v4, :cond_27

    const/4 v4, 0x1

    goto :goto_9

    :cond_27
    const/4 v4, 0x0

    :goto_9
    and-int/lit8 v5, v12, 0x8

    if-eqz v5, :cond_28

    iget-object v2, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v2}, Lf4/h;->readByte()B

    move-result v2

    sget-object v5, Lt3/c;->a:[B

    and-int/lit16 v2, v2, 0xff

    :cond_28
    and-int/lit8 v5, v12, 0x20

    if-eqz v5, :cond_29

    invoke-virtual {v0, v1, v14}, Lz3/p;->e(Lz3/p$c;I)V

    add-int/lit8 v3, v3, -0x5

    :cond_29
    sget-object v5, Lz3/p;->g:Lz3/p$a;

    invoke-virtual {v5, v3, v12, v2}, Lz3/p$a;->a(III)I

    move-result v3

    invoke-virtual {v0, v3, v2, v12, v14}, Lz3/p;->c(IIII)Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v4, v14, v2}, Lz3/p$c;->c(ZILjava/util/List;)V

    goto :goto_c

    :cond_2a
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_8
    if-eqz v14, :cond_2f

    and-int/lit8 v4, v12, 0x1

    if-eqz v4, :cond_2b

    const/4 v4, 0x1

    goto :goto_a

    :cond_2b
    const/4 v4, 0x0

    :goto_a
    and-int/lit8 v5, v12, 0x20

    if-eqz v5, :cond_2c

    const/4 v5, 0x1

    goto :goto_b

    :cond_2c
    const/4 v5, 0x0

    :goto_b
    if-nez v5, :cond_2e

    and-int/lit8 v5, v12, 0x8

    if-eqz v5, :cond_2d

    iget-object v2, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v2}, Lf4/h;->readByte()B

    move-result v2

    sget-object v5, Lt3/c;->a:[B

    and-int/lit16 v2, v2, 0xff

    :cond_2d
    sget-object v5, Lz3/p;->g:Lz3/p$a;

    invoke-virtual {v5, v3, v12, v2}, Lz3/p$a;->a(III)I

    move-result v3

    iget-object v5, v0, Lz3/p;->d:Lf4/h;

    invoke-interface {v1, v4, v14, v5, v3}, Lz3/p$c;->h(ZILf4/h;I)V

    iget-object v1, v0, Lz3/p;->d:Lf4/h;

    int-to-long v2, v2

    invoke-interface {v1, v2, v3}, Lf4/h;->skip(J)V

    goto :goto_c

    :cond_2e
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2f
    new-instance v1, Ljava/io/IOException;

    const-string v2, "PROTOCOL_ERROR: TYPE_DATA streamId == 0"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_c
    return v8

    :cond_30
    new-instance v1, Ljava/io/IOException;

    const-string v2, "FRAME_SIZE_ERROR: "

    invoke-static {v2, v3}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catch_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Lz3/p$c;)V
    .locals 5

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lz3/p;->e:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1, p1}, Lz3/p;->a(ZLz3/p$c;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Required SETTINGS preface not received"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object p1, p0, Lz3/p;->d:Lf4/h;

    sget-object v0, Lz3/e;->a:Lf4/i;

    iget-object v2, v0, Lf4/i;->d:[B

    array-length v2, v2

    int-to-long v2, v2

    invoke-interface {p1, v2, v3}, Lf4/h;->d(J)Lf4/i;

    move-result-object p1

    sget-object v2, Lz3/p;->f:Ljava/util/logging/Logger;

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "<< CONNECTION "

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lf4/i;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lt3/c;->j(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_2
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v1

    if-nez v0, :cond_3

    :goto_0
    return-void

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Expected a connection header but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lf4/i;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(IIII)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IIII)",
            "Ljava/util/List<",
            "Lz3/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lz3/p;->b:Lz3/p$b;

    iput p1, v0, Lz3/p$b;->e:I

    iput p1, v0, Lz3/p$b;->b:I

    iput p2, v0, Lz3/p$b;->f:I

    iput p3, v0, Lz3/p$b;->c:I

    iput p4, v0, Lz3/p$b;->d:I

    iget-object p1, p0, Lz3/p;->c:Lz3/d$a;

    :cond_0
    :goto_0
    iget-object p2, p1, Lz3/d$a;->b:Lf4/u;

    invoke-virtual {p2}, Lf4/u;->B()Z

    move-result p2

    if-nez p2, :cond_d

    iget-object p2, p1, Lz3/d$a;->b:Lf4/u;

    invoke-virtual {p2}, Lf4/u;->readByte()B

    move-result p2

    sget-object p3, Lt3/c;->a:[B

    and-int/lit16 p2, p2, 0xff

    const/16 p3, 0x80

    if-eq p2, p3, :cond_c

    and-int/lit16 p4, p2, 0x80

    if-ne p4, p3, :cond_4

    const/16 p3, 0x7f

    invoke-virtual {p1, p2, p3}, Lz3/d$a;->f(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    if-ltz p2, :cond_1

    sget-object p3, Lz3/d;->c:Lz3/d;

    sget-object p3, Lz3/d;->a:[Lz3/c;

    array-length p3, p3

    add-int/lit8 p3, p3, -0x1

    if-gt p2, p3, :cond_1

    const/4 p3, 0x1

    goto :goto_1

    :cond_1
    const/4 p3, 0x0

    :goto_1
    if-eqz p3, :cond_2

    sget-object p3, Lz3/d;->c:Lz3/d;

    sget-object p3, Lz3/d;->a:[Lz3/c;

    aget-object p2, p3, p2

    iget-object p3, p1, Lz3/d$a;->a:Ljava/util/ArrayList;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    sget-object p3, Lz3/d;->c:Lz3/d;

    sget-object p3, Lz3/d;->a:[Lz3/c;

    array-length p3, p3

    sub-int p3, p2, p3

    iget p4, p1, Lz3/d$a;->d:I

    add-int/lit8 p4, p4, 0x1

    add-int/2addr p4, p3

    if-ltz p4, :cond_3

    iget-object p3, p1, Lz3/d$a;->c:[Lz3/c;

    array-length v0, p3

    if-ge p4, v0, :cond_3

    iget-object p2, p1, Lz3/d$a;->a:Ljava/util/ArrayList;

    aget-object p3, p3, p4

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p3, "Header index too large "

    invoke-static {p3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const/16 p3, 0x40

    if-ne p2, p3, :cond_5

    sget-object p2, Lz3/d;->c:Lz3/d;

    invoke-virtual {p1}, Lz3/d$a;->e()Lf4/i;

    move-result-object p3

    invoke-virtual {p2, p3}, Lz3/d;->a(Lf4/i;)Lf4/i;

    invoke-virtual {p1}, Lz3/d$a;->e()Lf4/i;

    move-result-object p2

    new-instance p4, Lz3/c;

    invoke-direct {p4, p3, p2}, Lz3/c;-><init>(Lf4/i;Lf4/i;)V

    invoke-virtual {p1, p4}, Lz3/d$a;->d(Lz3/c;)V

    goto/16 :goto_0

    :cond_5
    and-int/lit8 p4, p2, 0x40

    if-ne p4, p3, :cond_6

    const/16 p3, 0x3f

    invoke-virtual {p1, p2, p3}, Lz3/d$a;->f(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lz3/d$a;->c(I)Lf4/i;

    move-result-object p2

    invoke-virtual {p1}, Lz3/d$a;->e()Lf4/i;

    move-result-object p3

    new-instance p4, Lz3/c;

    invoke-direct {p4, p2, p3}, Lz3/c;-><init>(Lf4/i;Lf4/i;)V

    invoke-virtual {p1, p4}, Lz3/d$a;->d(Lz3/c;)V

    goto/16 :goto_0

    :cond_6
    and-int/lit8 p3, p2, 0x20

    const/16 p4, 0x20

    if-ne p3, p4, :cond_9

    const/16 p3, 0x1f

    invoke-virtual {p1, p2, p3}, Lz3/d$a;->f(II)I

    move-result p2

    iput p2, p1, Lz3/d$a;->h:I

    if-ltz p2, :cond_8

    iget p3, p1, Lz3/d$a;->g:I

    if-gt p2, p3, :cond_8

    iget p3, p1, Lz3/d$a;->f:I

    if-ge p2, p3, :cond_0

    if-nez p2, :cond_7

    invoke-virtual {p1}, Lz3/d$a;->a()V

    goto/16 :goto_0

    :cond_7
    sub-int/2addr p3, p2

    invoke-virtual {p1, p3}, Lz3/d$a;->b(I)I

    goto/16 :goto_0

    :cond_8
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Invalid dynamic table size update "

    invoke-static {p3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    iget p1, p1, Lz3/d$a;->h:I

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_9
    const/16 p3, 0x10

    if-eq p2, p3, :cond_b

    if-nez p2, :cond_a

    goto :goto_2

    :cond_a
    const/16 p3, 0xf

    invoke-virtual {p1, p2, p3}, Lz3/d$a;->f(II)I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p2}, Lz3/d$a;->c(I)Lf4/i;

    move-result-object p2

    invoke-virtual {p1}, Lz3/d$a;->e()Lf4/i;

    move-result-object p3

    iget-object p4, p1, Lz3/d$a;->a:Ljava/util/ArrayList;

    new-instance v0, Lz3/c;

    invoke-direct {v0, p2, p3}, Lz3/c;-><init>(Lf4/i;Lf4/i;)V

    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    :goto_2
    sget-object p2, Lz3/d;->c:Lz3/d;

    invoke-virtual {p1}, Lz3/d$a;->e()Lf4/i;

    move-result-object p3

    invoke-virtual {p2, p3}, Lz3/d;->a(Lf4/i;)Lf4/i;

    invoke-virtual {p1}, Lz3/d$a;->e()Lf4/i;

    move-result-object p2

    iget-object p4, p1, Lz3/d$a;->a:Ljava/util/ArrayList;

    new-instance v0, Lz3/c;

    invoke-direct {v0, p3, p2}, Lz3/c;-><init>(Lf4/i;Lf4/i;)V

    invoke-virtual {p4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_c
    new-instance p1, Ljava/io/IOException;

    const-string p2, "index == 0"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_d
    iget-object p1, p0, Lz3/p;->c:Lz3/d$a;

    iget-object p2, p1, Lz3/d$a;->a:Ljava/util/ArrayList;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    iget-object p1, p1, Lz3/d$a;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    return-object p2
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lz3/p;->d:Lf4/h;

    invoke-interface {v0}, Lf4/a0;->close()V

    return-void
.end method

.method public final e(Lz3/p$c;I)V
    .locals 0

    iget-object p2, p0, Lz3/p;->d:Lf4/h;

    invoke-interface {p2}, Lf4/h;->readInt()I

    iget-object p2, p0, Lz3/p;->d:Lf4/h;

    invoke-interface {p2}, Lf4/h;->readByte()B

    sget-object p2, Lt3/c;->a:[B

    invoke-interface {p1}, Lz3/p$c;->priority()V

    return-void
.end method
