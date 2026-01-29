.class public final Lo/d;
.super Ljava/lang/Object;


# instance fields
.field public final a:[B

.field public b:Ljava/nio/ByteBuffer;

.field public c:Lo/c;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x100

    new-array v0, v0, [B

    iput-object v0, p0, Lo/d;->a:[B

    const/4 v0, 0x0

    iput v0, p0, Lo/d;->d:I

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lo/d;->c:Lo/c;

    iget v0, v0, Lo/c;->b:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b()Lo/c;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    if-eqz v0, :cond_19

    invoke-virtual {p0}, Lo/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/d;->c:Lo/c;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x6

    if-ge v2, v3, :cond_1

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v3

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "GIF"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    const/4 v4, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lo/d;->c:Lo/c;

    iput v4, v0, Lo/c;->b:I

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lo/d;->c:Lo/c;

    invoke-virtual {p0}, Lo/d;->f()I

    move-result v5

    iput v5, v0, Lo/c;->f:I

    iget-object v0, p0, Lo/d;->c:Lo/c;

    invoke-virtual {p0}, Lo/d;->f()I

    move-result v5

    iput v5, v0, Lo/c;->g:I

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v0

    iget-object v5, p0, Lo/d;->c:Lo/c;

    and-int/lit16 v6, v0, 0x80

    if-eqz v6, :cond_3

    const/4 v6, 0x1

    goto :goto_1

    :cond_3
    const/4 v6, 0x0

    :goto_1
    iput-boolean v6, v5, Lo/c;->h:Z

    and-int/lit8 v0, v0, 0x7

    add-int/2addr v0, v4

    int-to-double v6, v0

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-int v0, v6

    iput v0, v5, Lo/c;->i:I

    iget-object v0, p0, Lo/d;->c:Lo/c;

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v5

    iput v5, v0, Lo/c;->j:I

    iget-object v0, p0, Lo/d;->c:Lo/c;

    invoke-virtual {p0}, Lo/d;->c()I

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lo/d;->c:Lo/c;

    iget-boolean v0, v0, Lo/c;->h:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lo/d;->a()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lo/d;->c:Lo/c;

    iget v5, v0, Lo/c;->i:I

    invoke-virtual {p0, v5}, Lo/d;->e(I)[I

    move-result-object v5

    iput-object v5, v0, Lo/c;->a:[I

    iget-object v0, p0, Lo/d;->c:Lo/c;

    iget-object v5, v0, Lo/c;->a:[I

    iget v6, v0, Lo/c;->j:I

    aget v5, v5, v6

    iput v5, v0, Lo/c;->k:I

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lo/d;->a()Z

    move-result v0

    if-nez v0, :cond_18

    const/4 v0, 0x0

    :cond_5
    :goto_3
    if-nez v0, :cond_17

    invoke-virtual {p0}, Lo/d;->a()Z

    move-result v5

    if-nez v5, :cond_17

    iget-object v5, p0, Lo/d;->c:Lo/c;

    iget v5, v5, Lo/c;->c:I

    const v6, 0x7fffffff

    if-gt v5, v6, :cond_17

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v5

    const/16 v6, 0x21

    if-eq v5, v6, :cond_d

    const/16 v6, 0x2c

    if-eq v5, v6, :cond_7

    const/16 v6, 0x3b

    if-eq v5, v6, :cond_6

    iget-object v5, p0, Lo/d;->c:Lo/c;

    iput v4, v5, Lo/c;->b:I

    goto :goto_3

    :cond_6
    const/4 v0, 0x1

    goto :goto_3

    :cond_7
    iget-object v5, p0, Lo/d;->c:Lo/c;

    iget-object v6, v5, Lo/c;->d:Lo/b;

    if-nez v6, :cond_8

    new-instance v6, Lo/b;

    invoke-direct {v6}, Lo/b;-><init>()V

    iput-object v6, v5, Lo/c;->d:Lo/b;

    :cond_8
    iget-object v5, v5, Lo/c;->d:Lo/b;

    invoke-virtual {p0}, Lo/d;->f()I

    move-result v6

    iput v6, v5, Lo/b;->a:I

    iget-object v5, p0, Lo/d;->c:Lo/c;

    iget-object v5, v5, Lo/c;->d:Lo/b;

    invoke-virtual {p0}, Lo/d;->f()I

    move-result v6

    iput v6, v5, Lo/b;->b:I

    iget-object v5, p0, Lo/d;->c:Lo/c;

    iget-object v5, v5, Lo/c;->d:Lo/b;

    invoke-virtual {p0}, Lo/d;->f()I

    move-result v6

    iput v6, v5, Lo/b;->c:I

    iget-object v5, p0, Lo/d;->c:Lo/c;

    iget-object v5, v5, Lo/c;->d:Lo/b;

    invoke-virtual {p0}, Lo/d;->f()I

    move-result v6

    iput v6, v5, Lo/b;->d:I

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v5

    and-int/lit16 v6, v5, 0x80

    if-eqz v6, :cond_9

    const/4 v6, 0x1

    goto :goto_4

    :cond_9
    const/4 v6, 0x0

    :goto_4
    and-int/lit8 v7, v5, 0x7

    add-int/2addr v7, v4

    int-to-double v7, v7

    invoke-static {v2, v3, v7, v8}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v7

    double-to-int v7, v7

    iget-object v8, p0, Lo/d;->c:Lo/c;

    iget-object v8, v8, Lo/c;->d:Lo/b;

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_a

    const/4 v5, 0x1

    goto :goto_5

    :cond_a
    const/4 v5, 0x0

    :goto_5
    iput-boolean v5, v8, Lo/b;->e:Z

    if-eqz v6, :cond_b

    invoke-virtual {p0, v7}, Lo/d;->e(I)[I

    move-result-object v5

    iput-object v5, v8, Lo/b;->k:[I

    goto :goto_6

    :cond_b
    const/4 v5, 0x0

    iput-object v5, v8, Lo/b;->k:[I

    :goto_6
    iget-object v5, p0, Lo/d;->c:Lo/c;

    iget-object v5, v5, Lo/c;->d:Lo/b;

    iget-object v6, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v6

    iput v6, v5, Lo/b;->j:I

    invoke-virtual {p0}, Lo/d;->c()I

    invoke-virtual {p0}, Lo/d;->g()V

    invoke-virtual {p0}, Lo/d;->a()Z

    move-result v5

    if-eqz v5, :cond_c

    goto/16 :goto_3

    :cond_c
    iget-object v5, p0, Lo/d;->c:Lo/c;

    iget v6, v5, Lo/c;->c:I

    add-int/2addr v6, v4

    iput v6, v5, Lo/c;->c:I

    iget-object v6, v5, Lo/c;->e:Ljava/util/ArrayList;

    iget-object v5, v5, Lo/c;->d:Lo/b;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_d
    invoke-virtual {p0}, Lo/d;->c()I

    move-result v5

    if-eq v5, v4, :cond_16

    const/16 v6, 0xf9

    const/4 v7, 0x2

    if-eq v5, v6, :cond_12

    const/16 v6, 0xfe

    if-eq v5, v6, :cond_16

    const/16 v6, 0xff

    if-eq v5, v6, :cond_e

    goto/16 :goto_9

    :cond_e
    invoke-virtual {p0}, Lo/d;->d()V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v6, 0x0

    :goto_7
    const/16 v8, 0xb

    if-ge v6, v8, :cond_f

    iget-object v8, p0, Lo/d;->a:[B

    aget-byte v8, v8, v6

    int-to-char v8, v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_f
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "NETSCAPE2.0"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_16

    :cond_10
    invoke-virtual {p0}, Lo/d;->d()V

    iget-object v5, p0, Lo/d;->a:[B

    aget-byte v6, v5, v1

    if-ne v6, v4, :cond_11

    aget-byte v6, v5, v4

    aget-byte v5, v5, v7

    iget-object v5, p0, Lo/d;->c:Lo/c;

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_11
    iget v5, p0, Lo/d;->d:I

    if-lez v5, :cond_5

    invoke-virtual {p0}, Lo/d;->a()Z

    move-result v5

    if-eqz v5, :cond_10

    goto/16 :goto_3

    :cond_12
    iget-object v5, p0, Lo/d;->c:Lo/c;

    new-instance v6, Lo/b;

    invoke-direct {v6}, Lo/b;-><init>()V

    iput-object v6, v5, Lo/c;->d:Lo/b;

    invoke-virtual {p0}, Lo/d;->c()I

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v5

    iget-object v6, p0, Lo/d;->c:Lo/c;

    iget-object v6, v6, Lo/c;->d:Lo/b;

    and-int/lit8 v8, v5, 0x1c

    shr-int/2addr v8, v7

    iput v8, v6, Lo/b;->g:I

    if-nez v8, :cond_13

    iput v4, v6, Lo/b;->g:I

    :cond_13
    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_14

    const/4 v5, 0x1

    goto :goto_8

    :cond_14
    const/4 v5, 0x0

    :goto_8
    iput-boolean v5, v6, Lo/b;->f:Z

    invoke-virtual {p0}, Lo/d;->f()I

    move-result v5

    const/16 v6, 0xa

    if-ge v5, v7, :cond_15

    const/16 v5, 0xa

    :cond_15
    iget-object v7, p0, Lo/d;->c:Lo/c;

    iget-object v7, v7, Lo/c;->d:Lo/b;

    mul-int/lit8 v5, v5, 0xa

    iput v5, v7, Lo/b;->i:I

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v5

    iput v5, v7, Lo/b;->h:I

    invoke-virtual {p0}, Lo/d;->c()I

    goto/16 :goto_3

    :cond_16
    :goto_9
    invoke-virtual {p0}, Lo/d;->g()V

    goto/16 :goto_3

    :cond_17
    iget-object v0, p0, Lo/d;->c:Lo/c;

    iget v1, v0, Lo/c;->c:I

    if-gez v1, :cond_18

    iput v4, v0, Lo/c;->b:I

    :cond_18
    iget-object v0, p0, Lo/d;->c:Lo/c;

    return-object v0

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You must call setData() before parseHeader()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()I
    .locals 2

    :try_start_0
    iget-object v0, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 v0, v0, 0xff

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lo/d;->c:Lo/c;

    const/4 v1, 0x1

    iput v1, v0, Lo/c;->b:I

    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final d()V
    .locals 6

    invoke-virtual {p0}, Lo/d;->c()I

    move-result v0

    iput v0, p0, Lo/d;->d:I

    if-lez v0, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    :try_start_0
    iget v1, p0, Lo/d;->d:I

    if-ge v0, v1, :cond_1

    sub-int/2addr v1, v0

    iget-object v2, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    iget-object v3, p0, Lo/d;->a:[B

    invoke-virtual {v2, v3, v0, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/2addr v0, v1

    goto :goto_0

    :catch_0
    move-exception v2

    const/4 v3, 0x3

    const-string v4, "GifHeaderParser"

    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Error Reading Block n: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " count: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " blockSize: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Lo/d;->d:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object v0, p0, Lo/d;->c:Lo/c;

    const/4 v1, 0x1

    iput v1, v0, Lo/c;->b:I

    :cond_1
    return-void
.end method

.method public final e(I)[I
    .locals 9
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    mul-int/lit8 v0, p1, 0x3

    new-array v0, v0, [B

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const/16 v2, 0x100

    new-array v1, v2, [I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p1, :cond_1

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    add-int/lit8 v5, v4, 0x1

    aget-byte v4, v0, v4

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v6, v5, 0x1

    aget-byte v5, v0, v5

    and-int/lit16 v5, v5, 0xff

    add-int/lit8 v7, v2, 0x1

    const/high16 v8, -0x1000000

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v3, v8

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v3, v4

    or-int/2addr v3, v5

    aput v3, v1, v2
    :try_end_0
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v6

    move v2, v7

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "GifHeaderParser"

    const/4 v2, 0x3

    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "Format Error Reading Color Table"

    invoke-static {v0, v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object p1, p0, Lo/d;->c:Lo/c;

    const/4 v0, 0x1

    iput v0, p1, Lo/c;->b:I

    :cond_1
    return-object v1
.end method

.method public final f()I
    .locals 1

    iget-object v0, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    return v0
.end method

.method public final g()V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lo/d;->c()I

    move-result v0

    iget-object v1, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v2, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    if-gtz v0, :cond_0

    return-void
.end method
