.class public final Lh/c;
.super Ljava/lang/Object;


# instance fields
.field public a:I

.field public b:I

.field public final c:Lh/a;

.field public d:[Lh/e;

.field public e:I

.field public final f:Lh/e;

.field public final g:Lh/e;

.field public final h:Lh/e;

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:[I

.field public n:Lh/d;

.field public o:Lh/d;

.field public p:Lh/h;

.field public q:Lh/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lh/c;->b:I

    new-instance v0, Lh/a;

    invoke-direct {v0}, Lh/a;-><init>()V

    iput-object v0, p0, Lh/c;->c:Lh/a;

    const/16 v0, 0x100

    new-array v1, v0, [Lh/e;

    iput-object v1, p0, Lh/c;->d:[Lh/e;

    int-to-double v0, v0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lh/c;->e:I

    new-instance v0, Lh/e;

    invoke-direct {v0}, Lh/e;-><init>()V

    iput-object v0, p0, Lh/c;->f:Lh/e;

    new-instance v0, Lh/e;

    invoke-direct {v0}, Lh/e;-><init>()V

    iput-object v0, p0, Lh/c;->g:Lh/e;

    new-instance v0, Lh/e;

    invoke-direct {v0}, Lh/e;-><init>()V

    iput-object v0, p0, Lh/c;->h:Lh/e;

    return-void
.end method


# virtual methods
.method public final a(Lh/e;)Lh/e;
    .locals 8

    iget-object v0, p0, Lh/c;->d:[Lh/e;

    iget v1, p1, Lh/e;->h:I

    array-length v2, v0

    rem-int/2addr v1, v2

    aget-object v0, v0, v1

    :goto_0
    if-eqz v0, :cond_5

    iget v1, v0, Lh/e;->b:I

    iget v2, p1, Lh/e;->b:I

    if-ne v1, v2, :cond_4

    const/4 v1, 0x1

    if-eq v2, v1, :cond_3

    const/16 v3, 0xf

    const/4 v4, 0x0

    if-eq v2, v3, :cond_2

    const/16 v3, 0xc

    if-eq v2, v3, :cond_1

    const/16 v3, 0xd

    if-eq v2, v3, :cond_3

    packed-switch v2, :pswitch_data_0

    iget-object v2, v0, Lh/e;->e:Ljava/lang/String;

    iget-object v3, p1, Lh/e;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lh/e;->f:Ljava/lang/String;

    iget-object v3, p1, Lh/e;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lh/e;->g:Ljava/lang/String;

    iget-object v3, p1, Lh/e;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :pswitch_0
    iget v2, v0, Lh/e;->c:I

    iget v3, p1, Lh/e;->c:I

    if-ne v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, v0, Lh/e;->e:Ljava/lang/String;

    iget-object v3, p1, Lh/e;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lh/e;->f:Ljava/lang/String;

    iget-object v3, p1, Lh/e;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_2
    :pswitch_1
    iget-wide v2, v0, Lh/e;->d:J

    iget-wide v5, p1, Lh/e;->d:J

    cmp-long v7, v2, v5

    if-nez v7, :cond_0

    goto :goto_1

    :cond_3
    :pswitch_2
    iget-object v1, v0, Lh/e;->e:Ljava/lang/String;

    iget-object v2, p1, Lh/e;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_1
    if-nez v1, :cond_5

    :cond_4
    iget-object v0, v0, Lh/e;->i:Lh/e;

    goto :goto_0

    :cond_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public final b(Ljava/lang/String;)Lh/e;
    .locals 3

    iget-object v0, p0, Lh/c;->g:Lh/e;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v2}, Lh/e;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lh/c;->g:Lh/e;

    invoke-virtual {p0, v0}, Lh/c;->a(Lh/e;)Lh/e;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh/c;->c:Lh/a;

    invoke-virtual {p0, p1}, Lh/c;->d(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lh/a;->c(II)Lh/a;

    new-instance v0, Lh/e;

    iget p1, p0, Lh/c;->b:I

    add-int/lit8 v1, p1, 0x1

    iput v1, p0, Lh/c;->b:I

    iget-object v1, p0, Lh/c;->g:Lh/e;

    invoke-direct {v0, p1, v1}, Lh/e;-><init>(ILh/e;)V

    invoke-virtual {p0, v0}, Lh/c;->e(Lh/e;)V

    :cond_0
    return-object v0
.end method

.method public final c(Ljava/lang/String;Ljava/lang/String;)Lh/e;
    .locals 3

    iget-object v0, p0, Lh/c;->g:Lh/e;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, p2, v2}, Lh/e;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lh/c;->g:Lh/e;

    invoke-virtual {p0, v0}, Lh/c;->a(Lh/e;)Lh/e;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Lh/c;->d(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p2}, Lh/c;->d(Ljava/lang/String;)I

    move-result p2

    iget-object v0, p0, Lh/c;->c:Lh/a;

    invoke-virtual {v0, v1, p1}, Lh/a;->c(II)Lh/a;

    invoke-virtual {v0, p2}, Lh/a;->g(I)Lh/a;

    new-instance v0, Lh/e;

    iget p1, p0, Lh/c;->b:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lh/c;->b:I

    iget-object p2, p0, Lh/c;->g:Lh/e;

    invoke-direct {v0, p1, p2}, Lh/e;-><init>(ILh/e;)V

    invoke-virtual {p0, v0}, Lh/c;->e(Lh/e;)V

    :cond_0
    return-object v0
.end method

.method public final d(Ljava/lang/String;)I
    .locals 8

    iget-object v0, p0, Lh/c;->f:Lh/e;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v2}, Lh/e;->a(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lh/c;->f:Lh/e;

    invoke-virtual {p0, v0}, Lh/c;->a(Lh/e;)Lh/e;

    move-result-object v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lh/c;->c:Lh/a;

    invoke-virtual {v0, v1}, Lh/a;->d(I)Lh/a;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    iget v3, v0, Lh/a;->b:I

    add-int/lit8 v4, v3, 0x2

    add-int/2addr v4, v2

    iget-object v5, v0, Lh/a;->a:[B

    array-length v5, v5

    if-le v4, v5, :cond_0

    add-int/lit8 v4, v2, 0x2

    invoke-virtual {v0, v4}, Lh/a;->a(I)V

    :cond_0
    iget-object v4, v0, Lh/a;->a:[B

    add-int/lit8 v5, v3, 0x1

    ushr-int/lit8 v6, v2, 0x8

    int-to-byte v6, v6

    aput-byte v6, v4, v3

    add-int/lit8 v3, v5, 0x1

    int-to-byte v6, v2

    aput-byte v6, v4, v5

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_2

    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-lt v6, v1, :cond_1

    const/16 v7, 0x7f

    if-gt v6, v7, :cond_1

    add-int/lit8 v7, v3, 0x1

    int-to-byte v6, v6

    aput-byte v6, v4, v3

    add-int/lit8 v5, v5, 0x1

    move v3, v7

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :cond_2
    iput v3, v0, Lh/a;->b:I

    new-instance v0, Lh/e;

    iget p1, p0, Lh/c;->b:I

    add-int/lit8 v1, p1, 0x1

    iput v1, p0, Lh/c;->b:I

    iget-object v1, p0, Lh/c;->f:Lh/e;

    invoke-direct {v0, p1, v1}, Lh/e;-><init>(ILh/e;)V

    invoke-virtual {p0, v0}, Lh/c;->e(Lh/e;)V

    :cond_3
    iget p1, v0, Lh/e;->a:I

    return p1
.end method

.method public final e(Lh/e;)V
    .locals 7

    iget v0, p0, Lh/c;->b:I

    iget v1, p0, Lh/c;->e:I

    if-le v0, v1, :cond_2

    iget-object v0, p0, Lh/c;->d:[Lh/e;

    array-length v0, v0

    mul-int/lit8 v1, v0, 0x2

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [Lh/e;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_1

    iget-object v3, p0, Lh/c;->d:[Lh/e;

    aget-object v3, v3, v0

    :goto_0
    if-eqz v3, :cond_0

    iget v4, v3, Lh/e;->h:I

    rem-int/2addr v4, v1

    iget-object v5, v3, Lh/e;->i:Lh/e;

    aget-object v6, v2, v4

    iput-object v6, v3, Lh/e;->i:Lh/e;

    aput-object v3, v2, v4

    move-object v3, v5

    goto :goto_0

    :cond_1
    iput-object v2, p0, Lh/c;->d:[Lh/e;

    int-to-double v0, v1

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double v0, v0, v2

    double-to-int v0, v0

    iput v0, p0, Lh/c;->e:I

    :cond_2
    iget v0, p1, Lh/e;->h:I

    iget-object v1, p0, Lh/c;->d:[Lh/e;

    array-length v2, v1

    rem-int/2addr v0, v2

    aget-object v2, v1, v0

    iput-object v2, p1, Lh/e;->i:Lh/e;

    aput-object p1, v1, v0

    return-void
.end method

.method public final f()[B
    .locals 9

    iget v0, p0, Lh/c;->l:I

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x18

    iget-object v1, p0, Lh/c;->n:Lh/d;

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-eqz v1, :cond_0

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v0, v0, 0x8

    iget-object v1, v1, Lh/d;->a:Lh/d;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lh/c;->p:Lh/h;

    const/4 v4, 0x0

    :goto_1
    const-string v5, "Exceptions"

    const-string v6, "Code"

    if-eqz v1, :cond_3

    add-int/lit8 v4, v4, 0x1

    iget-object v7, v1, Lh/h;->g:Lh/a;

    iget v7, v7, Lh/a;->b:I

    const/16 v8, 0x8

    if-lez v7, :cond_1

    iget-object v7, v1, Lh/h;->b:Lh/c;

    invoke-virtual {v7, v6}, Lh/c;->d(Ljava/lang/String;)I

    iget-object v6, v1, Lh/h;->g:Lh/a;

    iget v6, v6, Lh/a;->b:I

    add-int/lit8 v6, v6, 0x12

    add-int/2addr v6, v2

    add-int/2addr v6, v8

    goto :goto_2

    :cond_1
    const/16 v6, 0x8

    :goto_2
    iget v7, v1, Lh/h;->e:I

    if-lez v7, :cond_2

    iget-object v7, v1, Lh/h;->b:Lh/c;

    invoke-virtual {v7, v5}, Lh/c;->d(Ljava/lang/String;)I

    iget v5, v1, Lh/h;->e:I

    mul-int/lit8 v5, v5, 0x2

    add-int/2addr v5, v8

    add-int/2addr v6, v5

    :cond_2
    add-int/2addr v0, v6

    iget-object v1, v1, Lh/h;->a:Lh/h;

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lh/c;->c:Lh/a;

    iget v1, v1, Lh/a;->b:I

    add-int/2addr v0, v1

    new-instance v1, Lh/a;

    invoke-direct {v1, v0}, Lh/a;-><init>(I)V

    const v0, -0x35014542    # -8346975.0f

    invoke-virtual {v1, v0}, Lh/a;->f(I)Lh/a;

    iget v0, p0, Lh/c;->a:I

    invoke-virtual {v1, v0}, Lh/a;->f(I)Lh/a;

    iget v0, p0, Lh/c;->b:I

    invoke-virtual {v1, v0}, Lh/a;->g(I)Lh/a;

    iget-object v0, p0, Lh/c;->c:Lh/a;

    iget-object v7, v0, Lh/a;->a:[B

    iget v0, v0, Lh/a;->b:I

    invoke-virtual {v1, v7, v0}, Lh/a;->e([BI)Lh/a;

    iget v0, p0, Lh/c;->i:I

    const v7, -0x60001

    and-int/2addr v0, v7

    invoke-virtual {v1, v0}, Lh/a;->g(I)Lh/a;

    iget v0, p0, Lh/c;->j:I

    invoke-virtual {v1, v0}, Lh/a;->g(I)Lh/a;

    iget v0, p0, Lh/c;->k:I

    invoke-virtual {v1, v0}, Lh/a;->g(I)Lh/a;

    iget v0, p0, Lh/c;->l:I

    invoke-virtual {v1, v0}, Lh/a;->g(I)Lh/a;

    const/4 v0, 0x0

    :goto_3
    iget v7, p0, Lh/c;->l:I

    if-ge v0, v7, :cond_4

    iget-object v7, p0, Lh/c;->m:[I

    aget v7, v7, v0

    invoke-virtual {v1, v7}, Lh/a;->g(I)Lh/a;

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v1, v3}, Lh/a;->g(I)Lh/a;

    iget-object v0, p0, Lh/c;->n:Lh/d;

    :goto_4
    const/4 v3, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {v1, v3}, Lh/a;->g(I)Lh/a;

    iget v3, v0, Lh/d;->b:I

    invoke-virtual {v1, v3}, Lh/a;->g(I)Lh/a;

    iget v3, v0, Lh/d;->c:I

    invoke-virtual {v1, v3}, Lh/a;->g(I)Lh/a;

    invoke-virtual {v1, v2}, Lh/a;->g(I)Lh/a;

    iget-object v0, v0, Lh/d;->a:Lh/d;

    goto :goto_4

    :cond_5
    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    iget-object v0, p0, Lh/c;->p:Lh/h;

    :goto_5
    if-eqz v0, :cond_a

    invoke-virtual {v1, v3}, Lh/a;->g(I)Lh/a;

    iget v4, v0, Lh/h;->c:I

    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    iget v4, v0, Lh/h;->d:I

    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    iget-object v4, v0, Lh/h;->g:Lh/a;

    iget v4, v4, Lh/a;->b:I

    if-lez v4, :cond_6

    const/4 v4, 0x1

    goto :goto_6

    :cond_6
    const/4 v4, 0x0

    :goto_6
    iget v7, v0, Lh/h;->e:I

    if-lez v7, :cond_7

    add-int/lit8 v4, v4, 0x1

    :cond_7
    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    iget-object v4, v0, Lh/h;->g:Lh/a;

    iget v4, v4, Lh/a;->b:I

    if-lez v4, :cond_8

    add-int/lit8 v4, v4, 0xc

    add-int/2addr v4, v2

    iget-object v7, v0, Lh/h;->b:Lh/c;

    invoke-virtual {v7, v6}, Lh/c;->d(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {v1, v7}, Lh/a;->g(I)Lh/a;

    invoke-virtual {v1, v4}, Lh/a;->f(I)Lh/a;

    iget v4, v0, Lh/h;->h:I

    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    iget v4, v0, Lh/h;->i:I

    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    iget-object v4, v0, Lh/h;->g:Lh/a;

    iget v4, v4, Lh/a;->b:I

    invoke-virtual {v1, v4}, Lh/a;->f(I)Lh/a;

    iget-object v4, v0, Lh/h;->g:Lh/a;

    iget-object v7, v4, Lh/a;->a:[B

    iget v4, v4, Lh/a;->b:I

    invoke-virtual {v1, v7, v4}, Lh/a;->e([BI)Lh/a;

    invoke-virtual {v1, v2}, Lh/a;->g(I)Lh/a;

    invoke-virtual {v1, v2}, Lh/a;->g(I)Lh/a;

    :cond_8
    iget v4, v0, Lh/h;->e:I

    if-lez v4, :cond_9

    iget-object v4, v0, Lh/h;->b:Lh/c;

    invoke-virtual {v4, v5}, Lh/c;->d(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    iget v4, v0, Lh/h;->e:I

    mul-int/lit8 v4, v4, 0x2

    add-int/lit8 v4, v4, 0x2

    invoke-virtual {v1, v4}, Lh/a;->f(I)Lh/a;

    iget v4, v0, Lh/h;->e:I

    invoke-virtual {v1, v4}, Lh/a;->g(I)Lh/a;

    const/4 v4, 0x0

    :goto_7
    iget v7, v0, Lh/h;->e:I

    if-ge v4, v7, :cond_9

    iget-object v7, v0, Lh/h;->f:[I

    aget v7, v7, v4

    invoke-virtual {v1, v7}, Lh/a;->g(I)Lh/a;

    add-int/lit8 v4, v4, 0x1

    goto :goto_7

    :cond_9
    iget-object v0, v0, Lh/h;->a:Lh/h;

    goto/16 :goto_5

    :cond_a
    invoke-virtual {v1, v2}, Lh/a;->g(I)Lh/a;

    iget-object v0, v1, Lh/a;->a:[B

    return-object v0
.end method

.method public final g(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x31

    iput v0, p0, Lh/c;->a:I

    const/16 v0, 0x21

    iput v0, p0, Lh/c;->i:I

    invoke-virtual {p0, p1}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object p1

    iget p1, p1, Lh/e;->a:I

    iput p1, p0, Lh/c;->j:I

    const/4 p1, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object p2

    iget p2, p2, Lh/e;->a:I

    :goto_0
    iput p2, p0, Lh/c;->k:I

    if-eqz p3, :cond_1

    array-length p2, p3

    if-lez p2, :cond_1

    array-length p2, p3

    iput p2, p0, Lh/c;->l:I

    new-array p2, p2, [I

    iput-object p2, p0, Lh/c;->m:[I

    :goto_1
    iget p2, p0, Lh/c;->l:I

    if-ge p1, p2, :cond_1

    iget-object p2, p0, Lh/c;->m:[I

    aget-object v0, p3, p1

    invoke-virtual {p0, v0}, Lh/c;->b(Ljava/lang/String;)Lh/e;

    move-result-object v0

    iget v0, v0, Lh/e;->a:I

    aput v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method
