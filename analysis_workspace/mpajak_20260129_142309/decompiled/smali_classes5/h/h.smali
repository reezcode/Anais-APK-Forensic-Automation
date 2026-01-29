.class public final Lh/h;
.super Ljava/lang/Object;


# instance fields
.field public a:Lh/h;

.field public final b:Lh/c;

.field public final c:I

.field public final d:I

.field public e:I

.field public f:[I

.field public g:Lh/a;

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>(Lh/c;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh/a;

    invoke-direct {v0}, Lh/a;-><init>()V

    iput-object v0, p0, Lh/h;->g:Lh/a;

    iget-object v0, p1, Lh/c;->p:Lh/h;

    if-nez v0, :cond_0

    iput-object p0, p1, Lh/c;->p:Lh/h;

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lh/c;->q:Lh/h;

    iput-object p0, v0, Lh/h;->a:Lh/h;

    :goto_0
    iput-object p0, p1, Lh/c;->q:Lh/h;

    iput-object p1, p0, Lh/h;->b:Lh/c;

    invoke-virtual {p1, p2}, Lh/c;->d(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lh/h;->c:I

    invoke-virtual {p1, p3}, Lh/c;->d(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lh/h;->d:I

    if-eqz p4, :cond_1

    array-length p2, p4

    if-lez p2, :cond_1

    array-length p2, p4

    iput p2, p0, Lh/h;->e:I

    new-array p2, p2, [I

    iput-object p2, p0, Lh/h;->f:[I

    const/4 p2, 0x0

    :goto_1
    iget p3, p0, Lh/h;->e:I

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Lh/h;->f:[I

    aget-object v0, p4, p2

    invoke-virtual {p1, v0}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object v0

    iget v0, v0, Lh/e;->a:I

    aput v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lh/h;->b:Lh/c;

    iget-object v1, v0, Lh/c;->h:Lh/e;

    const/16 v2, 0x9

    invoke-virtual {v1, v2, p2, p3, p4}, Lh/e;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lh/c;->h:Lh/e;

    invoke-virtual {v0, v1}, Lh/c;->a(Lh/e;)Lh/e;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0, p2}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object p2

    iget p2, p2, Lh/e;->a:I

    invoke-virtual {v0, p3, p4}, Lh/c;->c(Ljava/lang/String;Ljava/lang/String;)Lh/e;

    move-result-object p3

    iget p3, p3, Lh/e;->a:I

    iget-object p4, v0, Lh/c;->c:Lh/a;

    invoke-virtual {p4, v2, p2}, Lh/a;->c(II)Lh/a;

    invoke-virtual {p4, p3}, Lh/a;->g(I)Lh/a;

    new-instance v1, Lh/e;

    iget p2, v0, Lh/c;->b:I

    add-int/lit8 p3, p2, 0x1

    iput p3, v0, Lh/c;->b:I

    iget-object p3, v0, Lh/c;->h:Lh/e;

    invoke-direct {v1, p2, p3}, Lh/e;-><init>(ILh/e;)V

    invoke-virtual {v0, v1}, Lh/c;->e(Lh/e;)V

    :cond_0
    iget-object p2, p0, Lh/h;->g:Lh/a;

    iget p3, v1, Lh/e;->a:I

    invoke-virtual {p2, p1, p3}, Lh/a;->c(II)Lh/a;

    return-void
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, Lh/h;->g:Lh/a;

    const/16 v1, 0x84

    invoke-virtual {v0, v1}, Lh/a;->d(I)Lh/a;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lh/a;->b(II)Lh/a;

    return-void
.end method

.method public final c(I)V
    .locals 1

    iget-object v0, p0, Lh/h;->g:Lh/a;

    invoke-virtual {v0, p1}, Lh/a;->d(I)Lh/a;

    return-void
.end method

.method public final d(II)V
    .locals 1

    iget-object v0, p0, Lh/h;->g:Lh/a;

    invoke-virtual {v0, p1, p2}, Lh/a;->b(II)Lh/a;

    return-void
.end method

.method public final e(ILh/f;)V
    .locals 6

    iget v0, p2, Lh/f;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    iget v0, p2, Lh/f;->b:I

    iget-object v1, p0, Lh/h;->g:Lh/a;

    iget v1, v1, Lh/a;->b:I

    sub-int/2addr v0, v1

    const/16 v1, -0x8000

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lh/h;->g:Lh/a;

    invoke-virtual {v0, p1}, Lh/a;->d(I)Lh/a;

    iget-object p1, p0, Lh/h;->g:Lh/a;

    iget v0, p1, Lh/a;->b:I

    add-int/lit8 v1, v0, -0x1

    iget v2, p2, Lh/f;->a:I

    and-int/lit8 v2, v2, 0x2

    if-nez v2, :cond_4

    iget-object v2, p2, Lh/f;->d:[I

    const/4 v3, 0x6

    if-nez v2, :cond_2

    new-array v2, v3, [I

    iput-object v2, p2, Lh/f;->d:[I

    :cond_2
    iget v2, p2, Lh/f;->c:I

    iget-object v4, p2, Lh/f;->d:[I

    array-length v5, v4

    if-lt v2, v5, :cond_3

    array-length v2, v4

    add-int/2addr v2, v3

    new-array v2, v2, [I

    array-length v3, v4

    const/4 v5, 0x0

    invoke-static {v4, v5, v2, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v2, p2, Lh/f;->d:[I

    :cond_3
    iget-object v2, p2, Lh/f;->d:[I

    iget v3, p2, Lh/f;->c:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p2, Lh/f;->c:I

    aput v1, v2, v3

    add-int/lit8 v1, v4, 0x1

    iput v1, p2, Lh/f;->c:I

    aput v0, v2, v4

    const/4 p2, -0x1

    goto :goto_1

    :cond_4
    iget p2, p2, Lh/f;->b:I

    sub-int/2addr p2, v1

    :goto_1
    invoke-virtual {p1, p2}, Lh/a;->g(I)Lh/a;

    return-void
.end method

.method public final f(Lh/f;)V
    .locals 7

    iget-object v0, p0, Lh/h;->g:Lh/a;

    iget v1, v0, Lh/a;->b:I

    iget-object v0, v0, Lh/a;->a:[B

    iget v2, p1, Lh/f;->a:I

    or-int/lit8 v2, v2, 0x2

    iput v2, p1, Lh/f;->a:I

    iput v1, p1, Lh/f;->b:I

    const/4 v2, 0x0

    :goto_0
    iget v3, p1, Lh/f;->c:I

    if-ge v2, v3, :cond_0

    iget-object v3, p1, Lh/f;->d:[I

    add-int/lit8 v4, v2, 0x1

    aget v2, v3, v2

    add-int/lit8 v5, v4, 0x1

    aget v3, v3, v4

    sub-int v2, v1, v2

    add-int/lit8 v4, v3, 0x1

    ushr-int/lit8 v6, v2, 0x8

    int-to-byte v6, v6

    aput-byte v6, v0, v3

    int-to-byte v2, v2

    aput-byte v2, v0, v4

    move v2, v5

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final g(Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p0, Lh/h;->b:Lh/c;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v1, v0, Lh/c;->f:Lh/e;

    const/4 v2, 0x3

    iput v2, v1, Lh/e;->b:I

    iput p1, v1, Lh/e;->c:I

    add-int/lit8 v3, p1, 0x3

    const v4, 0x7fffffff

    and-int/2addr v3, v4

    iput v3, v1, Lh/e;->h:I

    invoke-virtual {v0, v1}, Lh/c;->a(Lh/e;)Lh/e;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lh/c;->c:Lh/a;

    invoke-virtual {v1, v2}, Lh/a;->d(I)Lh/a;

    invoke-virtual {v1, p1}, Lh/a;->f(I)Lh/a;

    new-instance v1, Lh/e;

    iget p1, v0, Lh/c;->b:I

    add-int/lit8 v2, p1, 0x1

    iput v2, v0, Lh/c;->b:I

    iget-object v2, v0, Lh/c;->f:Lh/e;

    invoke-direct {v1, p1, v2}, Lh/e;-><init>(ILh/e;)V

    invoke-virtual {v0, v1}, Lh/c;->e(Lh/e;)V

    goto :goto_1

    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_1

    check-cast p1, Ljava/lang/String;

    iget-object v1, v0, Lh/c;->g:Lh/e;

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v1, v2, p1, v3, v3}, Lh/e;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lh/c;->g:Lh/e;

    invoke-virtual {v0, v1}, Lh/c;->a(Lh/e;)Lh/e;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, v0, Lh/c;->c:Lh/a;

    invoke-virtual {v0, p1}, Lh/c;->d(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v1, v2, p1}, Lh/a;->c(II)Lh/a;

    new-instance v1, Lh/e;

    iget p1, v0, Lh/c;->b:I

    add-int/lit8 v2, p1, 0x1

    iput v2, v0, Lh/c;->b:I

    iget-object v2, v0, Lh/c;->g:Lh/e;

    invoke-direct {v1, p1, v2}, Lh/e;-><init>(ILh/e;)V

    invoke-virtual {v0, v1}, Lh/c;->e(Lh/e;)V

    goto :goto_1

    :cond_1
    instance-of v1, p1, Lh/i;

    if-eqz v1, :cond_7

    check-cast p1, Lh/i;

    iget v1, p1, Lh/i;->a:I

    const/16 v2, 0xa

    if-ne v1, v2, :cond_2

    new-instance v1, Ljava/lang/String;

    iget-object v2, p1, Lh/i;->b:[C

    iget v3, p1, Lh/i;->c:I

    iget p1, p1, Lh/i;->d:I

    invoke-direct {v1, v2, v3, p1}, Ljava/lang/String;-><init>([CII)V

    goto :goto_0

    :cond_2
    new-instance v1, Ljava/lang/String;

    iget-object v2, p1, Lh/i;->b:[C

    iget v3, p1, Lh/i;->c:I

    iget p1, p1, Lh/i;->d:I

    invoke-direct {v1, v2, v3, p1}, Ljava/lang/String;-><init>([CII)V

    :goto_0
    invoke-virtual {v0, v1}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object v1

    :cond_3
    :goto_1
    iget p1, v1, Lh/e;->a:I

    iget v0, v1, Lh/e;->b:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_6

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    goto :goto_2

    :cond_4
    const/16 v0, 0x100

    if-lt p1, v0, :cond_5

    iget-object v0, p0, Lh/h;->g:Lh/a;

    const/16 v1, 0x13

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lh/h;->g:Lh/a;

    const/16 v1, 0x12

    invoke-virtual {v0, v1, p1}, Lh/a;->b(II)Lh/a;

    goto :goto_4

    :cond_6
    :goto_2
    iget-object v0, p0, Lh/h;->g:Lh/a;

    const/16 v1, 0x14

    :goto_3
    invoke-virtual {v0, v1, p1}, Lh/a;->c(II)Lh/a;

    :goto_4
    return-void

    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value "

    invoke-static {v1, p1}, Landroidx/appcompat/widget/a;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(I)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lh/h;->h:I

    iput p1, p0, Lh/h;->i:I

    return-void
.end method

.method public final i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    const/16 v0, 0xb9

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, Lh/h;->b:Lh/c;

    if-eqz v3, :cond_1

    const/16 v5, 0xb

    goto :goto_1

    :cond_1
    const/16 v5, 0xa

    :goto_1
    iget-object v6, v4, Lh/c;->h:Lh/e;

    invoke-virtual {v6, v5, p2, p3, p4}, Lh/e;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v6, v4, Lh/c;->h:Lh/e;

    invoke-virtual {v4, v6}, Lh/c;->a(Lh/e;)Lh/e;

    move-result-object v6

    if-nez v6, :cond_2

    invoke-virtual {v4, p2}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object p2

    iget p2, p2, Lh/e;->a:I

    invoke-virtual {v4, p3, p4}, Lh/c;->c(Ljava/lang/String;Ljava/lang/String;)Lh/e;

    move-result-object p3

    iget p3, p3, Lh/e;->a:I

    iget-object v6, v4, Lh/c;->c:Lh/a;

    invoke-virtual {v6, v5, p2}, Lh/a;->c(II)Lh/a;

    invoke-virtual {v6, p3}, Lh/a;->g(I)Lh/a;

    new-instance v6, Lh/e;

    iget p2, v4, Lh/c;->b:I

    add-int/lit8 p3, p2, 0x1

    iput p3, v4, Lh/c;->b:I

    iget-object p3, v4, Lh/c;->h:Lh/e;

    invoke-direct {v6, p2, p3}, Lh/e;-><init>(ILh/e;)V

    invoke-virtual {v4, v6}, Lh/c;->e(Lh/e;)V

    :cond_2
    iget p2, v6, Lh/e;->c:I

    if-eqz v3, :cond_c

    const/4 p1, 0x2

    if-nez p2, :cond_b

    const/4 p2, 0x1

    const/4 p3, 0x1

    :goto_2
    add-int/lit8 v3, p2, 0x1

    invoke-virtual {p4, p2}, Ljava/lang/String;->charAt(I)C

    move-result p2

    const/16 v4, 0x29

    const/16 v5, 0x4a

    const/16 v7, 0x44

    if-ne p2, v4, :cond_6

    invoke-virtual {p4, v3}, Ljava/lang/String;->charAt(I)C

    move-result p2

    shl-int/2addr p3, p1

    const/16 p4, 0x56

    if-ne p2, p4, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    if-eq p2, v7, :cond_4

    if-ne p2, v5, :cond_5

    :cond_4
    const/4 v2, 0x2

    :cond_5
    :goto_3
    or-int p2, p3, v2

    iput p2, v6, Lh/e;->c:I

    goto :goto_7

    :cond_6
    const/16 v4, 0x4c

    if-ne p2, v4, :cond_8

    :goto_4
    add-int/lit8 p2, v3, 0x1

    invoke-virtual {p4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_7

    move v3, p2

    goto :goto_4

    :cond_7
    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_8
    if-eq p2, v7, :cond_a

    if-ne p2, v5, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    :cond_a
    :goto_5
    add-int/lit8 p3, p3, 0x2

    :goto_6
    move p2, v3

    goto :goto_2

    :cond_b
    :goto_7
    iget-object p3, p0, Lh/h;->g:Lh/a;

    iget p4, v6, Lh/e;->a:I

    invoke-virtual {p3, v0, p4}, Lh/a;->c(II)Lh/a;

    shr-int/lit8 p1, p2, 0x2

    invoke-virtual {p3, p1, v1}, Lh/a;->b(II)Lh/a;

    goto :goto_8

    :cond_c
    iget-object p2, p0, Lh/h;->g:Lh/a;

    iget p3, v6, Lh/e;->a:I

    invoke-virtual {p2, p1, p3}, Lh/a;->c(II)Lh/a;

    :goto_8
    return-void
.end method

.method public final j(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lh/h;->b:Lh/c;

    invoke-virtual {v0, p2}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object p2

    iget-object v0, p0, Lh/h;->g:Lh/a;

    iget p2, p2, Lh/e;->a:I

    invoke-virtual {v0, p1, p2}, Lh/a;->c(II)Lh/a;

    return-void
.end method

.method public final k(II)V
    .locals 2

    const/4 v0, 0x4

    if-ge p2, v0, :cond_1

    const/16 v0, 0xa9

    if-eq p1, v0, :cond_1

    const/16 v0, 0x36

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, -0x15

    shl-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x1a

    goto :goto_0

    :cond_0
    sub-int/2addr p1, v0

    shl-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x3b

    :goto_0
    add-int/2addr p1, p2

    iget-object p2, p0, Lh/h;->g:Lh/a;

    invoke-virtual {p2, p1}, Lh/a;->d(I)Lh/a;

    goto :goto_1

    :cond_1
    const/16 v0, 0x100

    if-lt p2, v0, :cond_2

    iget-object v0, p0, Lh/h;->g:Lh/a;

    const/16 v1, 0xc4

    invoke-virtual {v0, v1}, Lh/a;->d(I)Lh/a;

    invoke-virtual {v0, p1, p2}, Lh/a;->c(II)Lh/a;

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lh/h;->g:Lh/a;

    invoke-virtual {v0, p1, p2}, Lh/a;->b(II)Lh/a;

    :goto_1
    return-void
.end method
