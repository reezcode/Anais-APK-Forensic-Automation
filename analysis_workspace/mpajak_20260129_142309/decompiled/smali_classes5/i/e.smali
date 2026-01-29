.class public final Li/e;
.super Li/d;


# static fields
.field public static final s:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "[C>;"
        }
    .end annotation
.end field


# instance fields
.field public r:[C


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Li/e;->s:Ljava/lang/ThreadLocal;

    return-void
.end method


# virtual methods
.method public final N0(II)Ljava/lang/String;
    .locals 2

    if-ltz p2, :cond_0

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Li/e;->r:[C

    invoke-direct {v0, v1, p1, p2}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(I)V

    throw p1
.end method

.method public final O0(II)[C
    .locals 3

    if-ltz p2, :cond_1

    if-nez p1, :cond_0

    iget-object p1, p0, Li/e;->r:[C

    return-object p1

    :cond_0
    new-array v0, p2, [C

    iget-object v1, p0, Li/e;->r:[C

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_1
    new-instance p1, Ljava/lang/StringIndexOutOfBoundsException;

    invoke-direct {p1, p2}, Ljava/lang/StringIndexOutOfBoundsException;-><init>(I)V

    throw p1
.end method

.method public final U()Ljava/math/BigDecimal;
    .locals 4

    iget v0, p0, Li/d;->i:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iget v1, p0, Li/d;->h:I

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Li/e;->p0(I)C

    move-result v1

    iget v2, p0, Li/d;->h:I

    const/16 v3, 0x4c

    if-eq v1, v3, :cond_1

    const/16 v3, 0x53

    if-eq v1, v3, :cond_1

    const/16 v3, 0x42

    if-eq v1, v3, :cond_1

    const/16 v3, 0x46

    if-eq v1, v3, :cond_1

    const/16 v3, 0x44

    if-ne v1, v3, :cond_2

    :cond_1
    add-int/lit8 v2, v2, -0x1

    :cond_2
    new-instance v1, Ljava/math/BigDecimal;

    iget-object v3, p0, Li/e;->r:[C

    invoke-direct {v1, v3, v0, v2}, Ljava/math/BigDecimal;-><init>([CII)V

    return-object v1
.end method

.method public final a0()[B
    .locals 15

    iget v0, p0, Li/d;->b:I

    const/16 v1, 0x1a

    if-eq v0, v1, :cond_b

    iget-object v0, p0, Li/e;->r:[C

    iget v1, p0, Li/d;->i:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iget v3, p0, Li/d;->h:I

    sget-object v4, Lm/e;->a:Ljava/util/Properties;

    const/4 v4, 0x0

    if-nez v3, :cond_0

    new-array v0, v4, [B

    goto/16 :goto_9

    :cond_0
    add-int v5, v1, v3

    sub-int/2addr v5, v2

    :goto_0
    if-ge v1, v5, :cond_1

    sget-object v6, Lm/e;->p:[I

    aget-char v7, v0, v1

    aget v6, v6, v7

    if-gez v6, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-lez v5, :cond_2

    sget-object v6, Lm/e;->p:[I

    aget-char v7, v0, v5

    aget v6, v6, v7

    if-gez v6, :cond_2

    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    :cond_2
    aget-char v6, v0, v5

    const/16 v7, 0x3d

    if-ne v6, v7, :cond_4

    add-int/lit8 v6, v5, -0x1

    aget-char v6, v0, v6

    if-ne v6, v7, :cond_3

    const/4 v6, 0x2

    goto :goto_2

    :cond_3
    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    sub-int v7, v5, v1

    add-int/2addr v7, v2

    const/16 v8, 0x4c

    if-le v3, v8, :cond_6

    aget-char v3, v0, v8

    const/16 v8, 0xd

    if-ne v3, v8, :cond_5

    div-int/lit8 v3, v7, 0x4e

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    shl-int/2addr v3, v2

    goto :goto_4

    :cond_6
    const/4 v3, 0x0

    :goto_4
    sub-int/2addr v7, v3

    mul-int/lit8 v7, v7, 0x6

    shr-int/lit8 v7, v7, 0x3

    sub-int/2addr v7, v6

    new-array v8, v7, [B

    div-int/lit8 v9, v7, 0x3

    mul-int/lit8 v9, v9, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_5
    if-ge v10, v9, :cond_8

    sget-object v12, Lm/e;->p:[I

    add-int/lit8 v13, v1, 0x1

    aget-char v1, v0, v1

    aget v1, v12, v1

    shl-int/lit8 v1, v1, 0x12

    add-int/lit8 v14, v13, 0x1

    aget-char v13, v0, v13

    aget v13, v12, v13

    shl-int/lit8 v13, v13, 0xc

    or-int/2addr v1, v13

    add-int/lit8 v13, v14, 0x1

    aget-char v14, v0, v14

    aget v14, v12, v14

    shl-int/lit8 v14, v14, 0x6

    or-int/2addr v1, v14

    add-int/lit8 v14, v13, 0x1

    aget-char v13, v0, v13

    aget v12, v12, v13

    or-int/2addr v1, v12

    add-int/lit8 v12, v10, 0x1

    shr-int/lit8 v13, v1, 0x10

    int-to-byte v13, v13

    aput-byte v13, v8, v10

    add-int/lit8 v10, v12, 0x1

    shr-int/lit8 v13, v1, 0x8

    int-to-byte v13, v13

    aput-byte v13, v8, v12

    add-int/lit8 v12, v10, 0x1

    int-to-byte v1, v1

    aput-byte v1, v8, v10

    if-lez v3, :cond_7

    add-int/lit8 v11, v11, 0x1

    const/16 v1, 0x13

    if-ne v11, v1, :cond_7

    add-int/lit8 v14, v14, 0x2

    move v1, v14

    const/4 v11, 0x0

    goto :goto_6

    :cond_7
    move v1, v14

    :goto_6
    move v10, v12

    goto :goto_5

    :cond_8
    if-ge v10, v7, :cond_a

    const/4 v3, 0x0

    :goto_7
    sub-int v9, v5, v6

    if-gt v1, v9, :cond_9

    sget-object v9, Lm/e;->p:[I

    add-int/lit8 v11, v1, 0x1

    aget-char v1, v0, v1

    aget v1, v9, v1

    mul-int/lit8 v9, v4, 0x6

    rsub-int/lit8 v9, v9, 0x12

    shl-int/2addr v1, v9

    or-int/2addr v3, v1

    add-int/2addr v4, v2

    move v1, v11

    goto :goto_7

    :cond_9
    const/16 v0, 0x10

    :goto_8
    if-ge v10, v7, :cond_a

    add-int/lit8 v1, v10, 0x1

    shr-int v2, v3, v0

    int-to-byte v2, v2

    aput-byte v2, v8, v10

    add-int/lit8 v0, v0, -0x8

    move v10, v1

    goto :goto_8

    :cond_a
    move-object v0, v8

    :goto_9
    return-object v0

    :cond_b
    new-instance v0, Lf/d;

    const-string v1, "TODO"

    invoke-direct {v0, v1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 3

    invoke-super {p0}, Li/d;->close()V

    iget-object v0, p0, Li/e;->r:[C

    array-length v1, v0

    const/high16 v2, 0x10000

    if-gt v1, v2, :cond_0

    sget-object v1, Li/e;->s:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Li/e;->r:[C

    sget-object v0, Lm/e;->a:Ljava/util/Properties;

    return-void
.end method

.method public final i0()Ljava/lang/String;
    .locals 4

    iget v0, p0, Li/d;->i:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    iget v1, p0, Li/d;->h:I

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, Li/e;->p0(I)C

    move-result v1

    iget v2, p0, Li/d;->h:I

    const/16 v3, 0x4c

    if-eq v1, v3, :cond_1

    const/16 v3, 0x53

    if-eq v1, v3, :cond_1

    const/16 v3, 0x42

    if-eq v1, v3, :cond_1

    const/16 v3, 0x46

    if-eq v1, v3, :cond_1

    const/16 v3, 0x44

    if-ne v1, v3, :cond_2

    :cond_1
    add-int/lit8 v2, v2, -0x1

    :cond_2
    new-instance v1, Ljava/lang/String;

    iget-object v3, p0, Li/e;->r:[C

    invoke-direct {v1, v3, v0, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v1
.end method

.method public final k0()Ljava/lang/String;
    .locals 4

    iget-boolean v0, p0, Li/d;->j:Z

    if-nez v0, :cond_2

    iget v0, p0, Li/d;->i:I

    add-int/lit8 v0, v0, 0x1

    if-ltz v0, :cond_1

    iget-object v1, p0, Li/e;->r:[C

    array-length v2, v1

    iget v3, p0, Li/d;->h:I

    sub-int/2addr v2, v3

    if-gt v0, v2, :cond_0

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1, v0, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Li/d;->g:[C

    const/4 v2, 0x0

    iget v3, p0, Li/d;->h:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final m0(IIILi/j;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li/e;->r:[C

    invoke-virtual {p4, v0, p1, p2, p3}, Li/j;->b([CIII)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final n()Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Li/e;->r:[C

    aget-char v2, v2, v1

    const/16 v3, 0x1a

    if-ne v2, v3, :cond_0

    const/16 v0, 0x14

    iput v0, p0, Li/d;->b:I

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-static {v2}, Li/d;->t0(C)Z

    move-result v2

    if-nez v2, :cond_1

    return v0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public final n0(I[CI)V
    .locals 2

    iget-object v0, p0, Li/e;->r:[C

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final next()C
    .locals 5

    iget v0, p0, Li/d;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Li/d;->f:I

    if-ltz v0, :cond_3

    iget v0, p0, Li/d;->h:I

    const/4 v1, 0x0

    if-lez v0, :cond_1

    rsub-int/lit8 v2, v0, 0x0

    iget-char v3, p0, Li/d;->e:C

    const/16 v4, 0x22

    if-ne v3, v4, :cond_0

    if-lez v2, :cond_0

    add-int/lit8 v2, v2, -0x1

    :cond_0
    iget-object v3, p0, Li/e;->r:[C

    invoke-static {v3, v2, v3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    const/4 v0, -0x1

    iput v0, p0, Li/d;->i:I

    iget v0, p0, Li/d;->h:I

    iput v0, p0, Li/d;->f:I

    :try_start_0
    iget-object v2, p0, Li/e;->r:[C

    array-length v3, v2

    sub-int/2addr v3, v0

    if-nez v3, :cond_2

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    array-length v3, v2

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Li/e;->r:[C
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    const/4 v0, 0x0

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Lf/d;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_3
    iget-object v1, p0, Li/e;->r:[C

    aget-char v0, v1, v0

    iput-char v0, p0, Li/d;->e:C

    return v0
.end method

.method public final o0([C)Z
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    iget v2, p0, Li/d;->f:I

    add-int/2addr v2, v1

    invoke-virtual {p0, v2}, Li/e;->p0(I)C

    move-result v2

    aget-char v3, p1, v1

    if-eq v2, v3, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final p0(I)C
    .locals 4

    if-ltz p1, :cond_2

    iget p1, p0, Li/d;->f:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    rsub-int/lit8 v2, p1, 0x0

    if-lez v2, :cond_0

    iget-object v3, p0, Li/e;->r:[C

    invoke-static {v3, p1, v3, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    :try_start_0
    iget-object p1, p0, Li/e;->r:[C

    array-length p1, p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    throw v0

    :catch_0
    move-exception p1

    new-instance v0, Lf/d;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    iget-object v2, p0, Li/e;->r:[C

    array-length v3, v2

    mul-int/lit8 v3, v3, 0x3

    div-int/lit8 v3, v3, 0x2

    new-array v3, v3, [C

    invoke-static {v2, p1, v3, v1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    throw v0

    :cond_2
    iget-object v0, p0, Li/e;->r:[C

    aget-char p1, v0, p1

    return p1
.end method

.method public final q0(II[C)V
    .locals 2

    iget-object v0, p0, Li/e;->r:[C

    const/4 v1, 0x0

    invoke-static {v0, p1, p3, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public final r0(I)I
    .locals 2

    iget v0, p0, Li/d;->f:I

    sub-int/2addr p1, v0

    :goto_0
    iget v0, p0, Li/d;->f:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Li/e;->p0(I)C

    move-result v0

    const/16 v1, 0x22

    if-ne v1, v0, :cond_0

    iget v0, p0, Li/d;->f:I

    add-int/2addr p1, v0

    return p1

    :cond_0
    const/16 v1, 0x1a

    if-ne v0, v1, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0
.end method

.method public final s0()Z
    .locals 5

    iget v0, p0, Li/d;->f:I

    iget-object v1, p0, Li/e;->r:[C

    array-length v2, v1

    const/4 v3, 0x1

    if-eq v0, v2, :cond_1

    iget-char v2, p0, Li/d;->e:C

    const/16 v4, 0x1a

    if-ne v2, v4, :cond_0

    add-int/2addr v0, v3

    array-length v1, v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    return v3
.end method
