.class public final Lf4/x;
.super Lf4/i;


# instance fields
.field public final transient g:[[B

.field public final transient h:[I


# direct methods
.method public constructor <init>([[B[I)V
    .locals 1

    const-string v0, "segments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lf4/i;->e:Lf4/i;

    iget-object v0, v0, Lf4/i;->d:[B

    invoke-direct {p0, v0}, Lf4/i;-><init>([B)V

    iput-object p1, p0, Lf4/x;->g:[[B

    iput-object p2, p0, Lf4/x;->h:[I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf4/x;->m()Lf4/i;

    move-result-object v0

    invoke-virtual {v0}, Lf4/i;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Lf4/i;
    .locals 6

    const-string v0, "algorithm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    iget-object v0, p0, Lf4/x;->g:[[B

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, Lf4/x;->h:[I

    add-int v4, v0, v1

    aget v4, v3, v4

    aget v3, v3, v1

    iget-object v5, p0, Lf4/x;->g:[[B

    aget-object v5, v5, v1

    sub-int v2, v3, v2

    invoke-virtual {p1, v5, v4, v2}, Ljava/security/MessageDigest;->update([BII)V

    add-int/lit8 v1, v1, 0x1

    move v2, v3

    goto :goto_0

    :cond_0
    new-instance v0, Lf4/i;

    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    const-string v1, "digest.digest()"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lf4/i;-><init>([B)V

    return-object v0
.end method

.method public final c()I
    .locals 2

    iget-object v0, p0, Lf4/x;->h:[I

    iget-object v1, p0, Lf4/x;->g:[[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf4/x;->m()Lf4/i;

    move-result-object v0

    invoke-virtual {v0}, Lf4/i;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final e()[B
    .locals 1

    invoke-virtual {p0}, Lf4/x;->j()[B

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lf4/i;

    if-eqz v0, :cond_1

    check-cast p1, Lf4/i;

    invoke-virtual {p1}, Lf4/i;->c()I

    move-result v0

    invoke-virtual {p0}, Lf4/x;->c()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lf4/x;->c()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lf4/x;->h(Lf4/i;I)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method public final f(I)B
    .locals 7

    iget-object v0, p0, Lf4/x;->h:[I

    iget-object v1, p0, Lf4/x;->g:[[B

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    int-to-long v1, v0

    int-to-long v3, p1

    const-wide/16 v5, 0x1

    invoke-static/range {v1 .. v6}, Lf4/b;->b(JJJ)V

    invoke-static {p0, p1}, Li/g;->y(Lf4/x;I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lf4/x;->h:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    :goto_0
    iget-object v2, p0, Lf4/x;->h:[I

    iget-object v3, p0, Lf4/x;->g:[[B

    array-length v4, v3

    add-int/2addr v4, v0

    aget v2, v2, v4

    aget-object v0, v3, v0

    sub-int/2addr p1, v1

    add-int/2addr p1, v2

    aget-byte p1, v0, p1

    return p1
.end method

.method public final g(I[BII)Z
    .locals 6

    const-string v0, "other"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    invoke-virtual {p0}, Lf4/x;->c()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p1, v1, :cond_4

    if-ltz p3, :cond_4

    array-length v1, p2

    sub-int/2addr v1, p4

    if-le p3, v1, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p4, p1

    invoke-static {p0, p1}, Li/g;->y(Lf4/x;I)I

    move-result v1

    :goto_0
    if-ge p1, p4, :cond_3

    if-nez v1, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lf4/x;->h:[I

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    :goto_1
    iget-object v3, p0, Lf4/x;->h:[I

    aget v4, v3, v1

    sub-int/2addr v4, v2

    iget-object v5, p0, Lf4/x;->g:[[B

    array-length v5, v5

    add-int/2addr v5, v1

    aget v3, v3, v5

    add-int/2addr v4, v2

    invoke-static {p4, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int/2addr v4, p1

    sub-int v2, p1, v2

    add-int/2addr v2, v3

    iget-object v3, p0, Lf4/x;->g:[[B

    aget-object v3, v3, v1

    invoke-static {v3, v2, p2, p3, v4}, Lf4/b;->a([BI[BII)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr p3, v4

    add-int/2addr p1, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x1

    :cond_4
    :goto_2
    return v0
.end method

.method public final h(Lf4/i;I)Z
    .locals 8

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lf4/x;->c()I

    move-result v0

    sub-int/2addr v0, p2

    const/4 v1, 0x0

    if-gez v0, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p2, v1

    invoke-static {p0, v1}, Li/g;->y(Lf4/x;I)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, p2, :cond_3

    if-nez v0, :cond_1

    const/4 v4, 0x0

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lf4/x;->h:[I

    add-int/lit8 v5, v0, -0x1

    aget v4, v4, v5

    :goto_1
    iget-object v5, p0, Lf4/x;->h:[I

    aget v6, v5, v0

    sub-int/2addr v6, v4

    iget-object v7, p0, Lf4/x;->g:[[B

    array-length v7, v7

    add-int/2addr v7, v0

    aget v5, v5, v7

    add-int/2addr v6, v4

    invoke-static {p2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v6, v2

    sub-int v4, v2, v4

    add-int/2addr v4, v5

    iget-object v5, p0, Lf4/x;->g:[[B

    aget-object v5, v5, v0

    invoke-virtual {p1, v3, v5, v4, v6}, Lf4/i;->g(I[BII)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v3, v6

    add-int/2addr v2, v6

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    :goto_2
    return v1
.end method

.method public final hashCode()I
    .locals 8

    iget v0, p0, Lf4/i;->b:I

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lf4/x;->g:[[B

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v4, p0, Lf4/x;->h:[I

    add-int v5, v0, v1

    aget v5, v4, v5

    aget v4, v4, v1

    iget-object v6, p0, Lf4/x;->g:[[B

    aget-object v6, v6, v1

    sub-int v3, v4, v3

    add-int/2addr v3, v5

    :goto_1
    if-ge v5, v3, :cond_1

    mul-int/lit8 v2, v2, 0x1f

    aget-byte v7, v6, v5

    add-int/2addr v2, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    move v3, v4

    goto :goto_0

    :cond_2
    iput v2, p0, Lf4/i;->b:I

    move v0, v2

    :goto_2
    return v0
.end method

.method public final i()Lf4/i;
    .locals 1

    invoke-virtual {p0}, Lf4/x;->m()Lf4/i;

    move-result-object v0

    invoke-virtual {v0}, Lf4/i;->i()Lf4/i;

    move-result-object v0

    return-object v0
.end method

.method public final j()[B
    .locals 9

    invoke-virtual {p0}, Lf4/x;->c()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lf4/x;->g:[[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v5, p0, Lf4/x;->h:[I

    add-int v6, v1, v2

    aget v6, v5, v6

    aget v5, v5, v2

    iget-object v7, p0, Lf4/x;->g:[[B

    aget-object v7, v7, v2

    sub-int v3, v5, v3

    add-int v8, v6, v3

    invoke-static {v7, v0, v4, v6, v8}, Lkotlin/collections/ArraysKt;->copyInto([B[BIII)[B

    add-int/2addr v4, v3

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final l(Lf4/f;I)V
    .locals 12

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    add-int/2addr p2, v0

    invoke-static {p0, v0}, Li/g;->y(Lf4/x;I)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_2

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lf4/x;->h:[I

    add-int/lit8 v4, v1, -0x1

    aget v3, v3, v4

    :goto_1
    iget-object v4, p0, Lf4/x;->h:[I

    aget v5, v4, v1

    sub-int/2addr v5, v3

    iget-object v6, p0, Lf4/x;->g:[[B

    array-length v6, v6

    add-int/2addr v6, v1

    aget v4, v4, v6

    add-int/2addr v5, v3

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, v2

    sub-int v3, v2, v3

    add-int v8, v3, v4

    iget-object v3, p0, Lf4/x;->g:[[B

    aget-object v7, v3, v1

    new-instance v3, Lf4/v;

    add-int v9, v8, v5

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object v6, v3

    invoke-direct/range {v6 .. v11}, Lf4/v;-><init>([BIIZZ)V

    iget-object v4, p1, Lf4/f;->b:Lf4/v;

    if-nez v4, :cond_1

    iput-object v3, v3, Lf4/v;->g:Lf4/v;

    iput-object v3, v3, Lf4/v;->f:Lf4/v;

    iput-object v3, p1, Lf4/f;->b:Lf4/v;

    goto :goto_2

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, v4, Lf4/v;->g:Lf4/v;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lf4/v;->b(Lf4/v;)Lf4/v;

    :goto_2
    add-int/2addr v2, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-wide v0, p1, Lf4/f;->c:J

    invoke-virtual {p0}, Lf4/x;->c()I

    move-result p2

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p1, Lf4/f;->c:J

    return-void
.end method

.method public final m()Lf4/i;
    .locals 2

    new-instance v0, Lf4/i;

    invoke-virtual {p0}, Lf4/x;->j()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lf4/i;-><init>([B)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lf4/x;->m()Lf4/i;

    move-result-object v0

    invoke-virtual {v0}, Lf4/i;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
