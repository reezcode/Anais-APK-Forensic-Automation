.class public Lp2/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final b:Ljava/io/Reader;

.field public c:Z

.field public final d:[C

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:J

.field public k:I

.field public l:Ljava/lang/String;

.field public m:[I

.field public n:I

.field public o:[Ljava/lang/String;

.field public p:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp2/a$a;

    invoke-direct {v0}, Lp2/a$a;-><init>()V

    sput-object v0, Ld1/f;->a:Lp2/a$a;

    return-void
.end method

.method public constructor <init>(Ljava/io/Reader;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lp2/a;->c:Z

    const/16 v1, 0x400

    new-array v1, v1, [C

    iput-object v1, p0, Lp2/a;->d:[C

    iput v0, p0, Lp2/a;->e:I

    iput v0, p0, Lp2/a;->f:I

    iput v0, p0, Lp2/a;->g:I

    iput v0, p0, Lp2/a;->h:I

    iput v0, p0, Lp2/a;->i:I

    const/16 v1, 0x20

    new-array v2, v1, [I

    iput-object v2, p0, Lp2/a;->m:[I

    add-int/lit8 v3, v0, 0x1

    iput v3, p0, Lp2/a;->n:I

    const/4 v3, 0x6

    aput v3, v2, v0

    new-array v0, v1, [Ljava/lang/String;

    iput-object v0, p0, Lp2/a;->o:[Ljava/lang/String;

    new-array v0, v1, [I

    iput-object v0, p0, Lp2/a;->p:[I

    const-string v0, "in == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lp2/a;->b:Ljava/io/Reader;

    return-void
.end method


# virtual methods
.method public A()J
    .locals 9

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iput v2, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    iget-wide v0, p0, Lp2/a;->j:J

    return-wide v0

    :cond_1
    const/16 v1, 0x10

    const-string v3, "Expected a long but was "

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lp2/a;->d:[C

    iget v4, p0, Lp2/a;->e:I

    iget v5, p0, Lp2/a;->k:I

    invoke-direct {v0, v1, v4, v5}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    iget v0, p0, Lp2/a;->e:I

    iget v1, p0, Lp2/a;->k:I

    add-int/2addr v0, v1

    iput v0, p0, Lp2/a;->e:I

    goto :goto_3

    :cond_2
    const/16 v1, 0xa

    const/16 v4, 0x8

    if-eq v0, v4, :cond_4

    const/16 v5, 0x9

    if-eq v0, v5, :cond_4

    if-ne v0, v1, :cond_3

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    if-ne v0, v1, :cond_5

    invoke-virtual {p0}, Lp2/a;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_5
    if-ne v0, v4, :cond_6

    const/16 v0, 0x27

    goto :goto_1

    :cond_6
    const/16 v0, 0x22

    :goto_1
    invoke-virtual {p0, v0}, Lp2/a;->J(C)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    iput v2, p0, Lp2/a;->i:I

    iget-object v4, p0, Lp2/a;->p:[I

    iget v5, p0, Lp2/a;->n:I

    add-int/lit8 v5, v5, -0x1

    aget v6, v4, v5

    add-int/lit8 v6, v6, 0x1

    aput v6, v4, v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    nop

    :goto_3
    const/16 v0, 0xb

    iput v0, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-long v4, v0

    long-to-double v6, v4

    cmpl-double v8, v6, v0

    if-nez v8, :cond_7

    const/4 v0, 0x0

    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    iput v2, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-wide v4

    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lp2/a;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public E()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/16 v1, 0xe

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lp2/a;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/16 v1, 0xc

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    goto :goto_0

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    :goto_0
    invoke-virtual {p0, v0}, Lp2/a;->J(C)Ljava/lang/String;

    move-result-object v0

    :goto_1
    const/4 v1, 0x0

    iput v1, p0, Lp2/a;->i:I

    iget-object v1, p0, Lp2/a;->o:[Ljava/lang/String;

    iget v2, p0, Lp2/a;->n:I

    add-int/lit8 v2, v2, -0x1

    aput-object v0, v1, v2

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected a name but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final H(Z)I
    .locals 9

    iget-object v0, p0, Lp2/a;->d:[C

    :goto_0
    iget v1, p0, Lp2/a;->e:I

    :goto_1
    iget v2, p0, Lp2/a;->f:I

    :goto_2
    const/4 v3, 0x1

    if-ne v1, v2, :cond_2

    iput v1, p0, Lp2/a;->e:I

    invoke-virtual {p0, v3}, Lp2/a;->n(I)Z

    move-result v1

    if-nez v1, :cond_1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    const-string v0, "End of input"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lp2/a;->e:I

    iget v2, p0, Lp2/a;->f:I

    :cond_2
    add-int/lit8 v4, v1, 0x1

    aget-char v1, v0, v1

    const/16 v5, 0xa

    if-ne v1, v5, :cond_3

    iget v1, p0, Lp2/a;->g:I

    add-int/2addr v1, v3

    iput v1, p0, Lp2/a;->g:I

    iput v4, p0, Lp2/a;->h:I

    goto/16 :goto_9

    :cond_3
    const/16 v6, 0x20

    if-eq v1, v6, :cond_10

    const/16 v6, 0xd

    if-eq v1, v6, :cond_10

    const/16 v6, 0x9

    if-ne v1, v6, :cond_4

    goto/16 :goto_9

    :cond_4
    const/16 v6, 0x2f

    if-ne v1, v6, :cond_e

    iput v4, p0, Lp2/a;->e:I

    const/4 v7, 0x2

    if-ne v4, v2, :cond_5

    add-int/lit8 v4, v4, -0x1

    iput v4, p0, Lp2/a;->e:I

    invoke-virtual {p0, v7}, Lp2/a;->n(I)Z

    move-result v2

    iget v4, p0, Lp2/a;->e:I

    add-int/2addr v4, v3

    iput v4, p0, Lp2/a;->e:I

    if-nez v2, :cond_5

    return v1

    :cond_5
    invoke-virtual {p0}, Lp2/a;->c()V

    iget v2, p0, Lp2/a;->e:I

    aget-char v4, v0, v2

    const/16 v8, 0x2a

    if-eq v4, v8, :cond_7

    if-eq v4, v6, :cond_6

    return v1

    :cond_6
    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lp2/a;->e:I

    goto :goto_8

    :cond_7
    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lp2/a;->e:I

    :goto_3
    iget v1, p0, Lp2/a;->e:I

    add-int/2addr v1, v7

    iget v2, p0, Lp2/a;->f:I

    const/4 v4, 0x0

    if-le v1, v2, :cond_9

    invoke-virtual {p0, v7}, Lp2/a;->n(I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    goto :goto_7

    :cond_9
    :goto_4
    iget-object v1, p0, Lp2/a;->d:[C

    iget v2, p0, Lp2/a;->e:I

    aget-char v1, v1, v2

    if-ne v1, v5, :cond_a

    iget v1, p0, Lp2/a;->g:I

    add-int/2addr v1, v3

    iput v1, p0, Lp2/a;->g:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lp2/a;->h:I

    goto :goto_6

    :cond_a
    :goto_5
    if-ge v4, v7, :cond_c

    iget-object v1, p0, Lp2/a;->d:[C

    iget v2, p0, Lp2/a;->e:I

    add-int/2addr v2, v4

    aget-char v1, v1, v2

    const-string v2, "*/"

    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-eq v1, v2, :cond_b

    :goto_6
    iget v1, p0, Lp2/a;->e:I

    add-int/2addr v1, v3

    iput v1, p0, Lp2/a;->e:I

    goto :goto_3

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_c
    :goto_7
    if-eqz v3, :cond_d

    iget v1, p0, Lp2/a;->e:I

    add-int/2addr v1, v7

    goto/16 :goto_1

    :cond_d
    const-string p1, "Unterminated comment"

    invoke-virtual {p0, p1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    const/4 p1, 0x0

    throw p1

    :cond_e
    const/16 v2, 0x23

    iput v4, p0, Lp2/a;->e:I

    if-ne v1, v2, :cond_f

    invoke-virtual {p0}, Lp2/a;->c()V

    :goto_8
    invoke-virtual {p0}, Lp2/a;->S()V

    goto/16 :goto_0

    :cond_f
    return v1

    :cond_10
    :goto_9
    move v1, v4

    goto/16 :goto_2
.end method

.method public I()V
    .locals 3

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    iput v0, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected null but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J(C)Ljava/lang/String;
    .locals 10

    iget-object v0, p0, Lp2/a;->d:[C

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    iget v3, p0, Lp2/a;->e:I

    iget v4, p0, Lp2/a;->f:I

    move v5, v4

    move v4, v3

    :goto_1
    const/16 v6, 0x10

    const/4 v7, 0x1

    if-ge v3, v5, :cond_5

    add-int/lit8 v8, v3, 0x1

    aget-char v3, v0, v3

    if-ne v3, p1, :cond_1

    iput v8, p0, Lp2/a;->e:I

    sub-int/2addr v8, v4

    sub-int/2addr v8, v7

    if-nez v2, :cond_0

    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0, v4, v8}, Ljava/lang/String;-><init>([CII)V

    return-object p1

    :cond_0
    invoke-virtual {v2, v0, v4, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    const/16 v9, 0x5c

    if-ne v3, v9, :cond_3

    iput v8, p0, Lp2/a;->e:I

    sub-int/2addr v8, v4

    sub-int/2addr v8, v7

    if-nez v2, :cond_2

    add-int/lit8 v2, v8, 0x1

    mul-int/lit8 v2, v2, 0x2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v2, v3

    :cond_2
    invoke-virtual {v2, v0, v4, v8}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->Q()C

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const/16 v6, 0xa

    if-ne v3, v6, :cond_4

    iget v3, p0, Lp2/a;->g:I

    add-int/2addr v3, v7

    iput v3, p0, Lp2/a;->g:I

    iput v8, p0, Lp2/a;->h:I

    :cond_4
    move v3, v8

    goto :goto_1

    :cond_5
    if-nez v2, :cond_6

    sub-int v2, v3, v4

    mul-int/lit8 v2, v2, 0x2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-static {v2, v6}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    move-object v2, v5

    :cond_6
    sub-int v5, v3, v4

    invoke-virtual {v2, v0, v4, v5}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iput v3, p0, Lp2/a;->e:I

    invoke-virtual {p0, v7}, Lp2/a;->n(I)Z

    move-result v3

    if-eqz v3, :cond_7

    goto :goto_0

    :cond_7
    const-string p1, "Unterminated string"

    invoke-virtual {p0, p1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    throw v1
.end method

.method public K()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lp2/a;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    const/16 v0, 0x27

    goto :goto_0

    :cond_2
    const/16 v1, 0x9

    if-ne v0, v1, :cond_3

    const/16 v0, 0x22

    :goto_0
    invoke-virtual {p0, v0}, Lp2/a;->J(C)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/16 v1, 0xb

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    const/4 v1, 0x0

    iput-object v1, p0, Lp2/a;->l:Ljava/lang/String;

    goto :goto_1

    :cond_4
    const/16 v1, 0xf

    if-ne v0, v1, :cond_5

    iget-wide v0, p0, Lp2/a;->j:J

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_5
    const/16 v1, 0x10

    if-ne v0, v1, :cond_6

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lp2/a;->d:[C

    iget v2, p0, Lp2/a;->e:I

    iget v3, p0, Lp2/a;->k:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    iget v1, p0, Lp2/a;->e:I

    iget v2, p0, Lp2/a;->k:I

    add-int/2addr v1, v2

    iput v1, p0, Lp2/a;->e:I

    :goto_1
    const/4 v1, 0x0

    iput v1, p0, Lp2/a;->i:I

    iget-object v1, p0, Lp2/a;->p:[I

    iget v2, p0, Lp2/a;->n:I

    add-int/lit8 v2, v2, -0x1

    aget v3, v1, v2

    add-int/lit8 v3, v3, 0x1

    aput v3, v1, v2

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected a string but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final M()Ljava/lang/String;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lp2/a;->e:I

    add-int v4, v3, v2

    iget v5, p0, Lp2/a;->f:I

    if-ge v4, v5, :cond_2

    iget-object v4, p0, Lp2/a;->d:[C

    add-int/2addr v3, v2

    aget-char v3, v4, v3

    const/16 v4, 0x9

    if-eq v3, v4, :cond_3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_3

    const/16 v4, 0xc

    if-eq v3, v4, :cond_3

    const/16 v4, 0xd

    if-eq v3, v4, :cond_3

    const/16 v4, 0x20

    if-eq v3, v4, :cond_3

    const/16 v4, 0x23

    if-eq v3, v4, :cond_1

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_3

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1

    const/16 v4, 0x3d

    if-eq v3, v4, :cond_1

    const/16 v4, 0x7b

    if-eq v3, v4, :cond_3

    const/16 v4, 0x7d

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3a

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_1

    packed-switch v3, :pswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :pswitch_0
    invoke-virtual {p0}, Lp2/a;->c()V

    goto :goto_1

    :cond_2
    iget-object v3, p0, Lp2/a;->d:[C

    array-length v3, v3

    if-ge v2, v3, :cond_4

    add-int/lit8 v3, v2, 0x1

    invoke-virtual {p0, v3}, Lp2/a;->n(I)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    :pswitch_1
    move v0, v2

    goto :goto_2

    :cond_4
    if-nez v1, :cond_5

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    :cond_5
    iget-object v3, p0, Lp2/a;->d:[C

    iget v4, p0, Lp2/a;->e:I

    invoke-virtual {v1, v3, v4, v2}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    iget v3, p0, Lp2/a;->e:I

    add-int/2addr v3, v2

    iput v3, p0, Lp2/a;->e:I

    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lp2/a;->n(I)Z

    move-result v2

    if-nez v2, :cond_0

    :goto_2
    if-nez v1, :cond_6

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lp2/a;->d:[C

    iget v3, p0, Lp2/a;->e:I

    invoke-direct {v1, v2, v3, v0}, Ljava/lang/String;-><init>([CII)V

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lp2/a;->d:[C

    iget v3, p0, Lp2/a;->e:I

    invoke-virtual {v1, v2, v3, v0}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_3
    iget v2, p0, Lp2/a;->e:I

    add-int/2addr v2, v0

    iput v2, p0, Lp2/a;->e:I

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public N()I
    .locals 1

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :pswitch_0
    const/16 v0, 0xa

    return v0

    :pswitch_1
    const/4 v0, 0x7

    return v0

    :pswitch_2
    const/4 v0, 0x5

    return v0

    :pswitch_3
    const/4 v0, 0x6

    return v0

    :pswitch_4
    const/16 v0, 0x9

    return v0

    :pswitch_5
    const/16 v0, 0x8

    return v0

    :pswitch_6
    const/4 v0, 0x2

    return v0

    :pswitch_7
    const/4 v0, 0x1

    return v0

    :pswitch_8
    const/4 v0, 0x4

    return v0

    :pswitch_9
    const/4 v0, 0x3

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final P(I)V
    .locals 3

    iget v0, p0, Lp2/a;->n:I

    iget-object v1, p0, Lp2/a;->m:[I

    array-length v2, v1

    if-ne v0, v2, :cond_0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lp2/a;->m:[I

    iget-object v1, p0, Lp2/a;->p:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lp2/a;->p:[I

    iget-object v1, p0, Lp2/a;->o:[Ljava/lang/String;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lp2/a;->o:[Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lp2/a;->m:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lp2/a;->n:I

    aput p1, v0, v1

    return-void
.end method

.method public final Q()C
    .locals 8

    iget v0, p0, Lp2/a;->e:I

    iget v1, p0, Lp2/a;->f:I

    const-string v2, "Unterminated escape sequence"

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, v4}, Lp2/a;->n(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    throw v3

    :cond_1
    :goto_0
    iget-object v0, p0, Lp2/a;->d:[C

    iget v1, p0, Lp2/a;->e:I

    add-int/lit8 v5, v1, 0x1

    iput v5, p0, Lp2/a;->e:I

    aget-char v0, v0, v1

    const/16 v1, 0xa

    if-eq v0, v1, :cond_e

    const/16 v4, 0x22

    if-eq v0, v4, :cond_f

    const/16 v4, 0x27

    if-eq v0, v4, :cond_f

    const/16 v4, 0x2f

    if-eq v0, v4, :cond_f

    const/16 v4, 0x5c

    if-eq v0, v4, :cond_f

    const/16 v4, 0x62

    if-eq v0, v4, :cond_d

    const/16 v4, 0x66

    if-eq v0, v4, :cond_c

    const/16 v6, 0x6e

    if-eq v0, v6, :cond_b

    const/16 v6, 0x72

    if-eq v0, v6, :cond_a

    const/16 v6, 0x74

    if-eq v0, v6, :cond_9

    const/16 v6, 0x75

    if-ne v0, v6, :cond_8

    const/4 v0, 0x4

    add-int/2addr v5, v0

    iget v6, p0, Lp2/a;->f:I

    if-le v5, v6, :cond_3

    invoke-virtual {p0, v0}, Lp2/a;->n(I)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v2}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    throw v3

    :cond_3
    :goto_1
    const/4 v2, 0x0

    iget v3, p0, Lp2/a;->e:I

    add-int/lit8 v5, v3, 0x4

    :goto_2
    if-ge v3, v5, :cond_7

    iget-object v6, p0, Lp2/a;->d:[C

    aget-char v6, v6, v3

    shl-int/lit8 v2, v2, 0x4

    int-to-char v2, v2

    const/16 v7, 0x30

    if-lt v6, v7, :cond_4

    const/16 v7, 0x39

    if-gt v6, v7, :cond_4

    add-int/lit8 v6, v6, -0x30

    goto :goto_4

    :cond_4
    const/16 v7, 0x61

    if-lt v6, v7, :cond_5

    if-gt v6, v4, :cond_5

    add-int/lit8 v6, v6, -0x61

    goto :goto_3

    :cond_5
    const/16 v7, 0x41

    if-lt v6, v7, :cond_6

    const/16 v7, 0x46

    if-gt v6, v7, :cond_6

    add-int/lit8 v6, v6, -0x41

    :goto_3
    add-int/2addr v6, v1

    :goto_4
    add-int/2addr v6, v2

    int-to-char v2, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    new-instance v1, Ljava/lang/NumberFormatException;

    const-string v2, "\\u"

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/lang/String;

    iget-object v4, p0, Lp2/a;->d:[C

    iget v5, p0, Lp2/a;->e:I

    invoke-direct {v3, v4, v5, v0}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    iget v1, p0, Lp2/a;->e:I

    add-int/2addr v1, v0

    iput v1, p0, Lp2/a;->e:I

    return v2

    :cond_8
    const-string v0, "Invalid escape sequence"

    invoke-virtual {p0, v0}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    throw v3

    :cond_9
    const/16 v0, 0x9

    return v0

    :cond_a
    const/16 v0, 0xd

    return v0

    :cond_b
    return v1

    :cond_c
    const/16 v0, 0xc

    return v0

    :cond_d
    const/16 v0, 0x8

    return v0

    :cond_e
    iget v1, p0, Lp2/a;->g:I

    add-int/2addr v1, v4

    iput v1, p0, Lp2/a;->g:I

    iput v5, p0, Lp2/a;->h:I

    :cond_f
    return v0
.end method

.method public final R(C)V
    .locals 6

    iget-object v0, p0, Lp2/a;->d:[C

    :goto_0
    iget v1, p0, Lp2/a;->e:I

    iget v2, p0, Lp2/a;->f:I

    :goto_1
    const/4 v3, 0x1

    if-ge v1, v2, :cond_3

    add-int/lit8 v4, v1, 0x1

    aget-char v1, v0, v1

    if-ne v1, p1, :cond_0

    iput v4, p0, Lp2/a;->e:I

    return-void

    :cond_0
    const/16 v5, 0x5c

    if-ne v1, v5, :cond_1

    iput v4, p0, Lp2/a;->e:I

    invoke-virtual {p0}, Lp2/a;->Q()C

    goto :goto_0

    :cond_1
    const/16 v5, 0xa

    if-ne v1, v5, :cond_2

    iget v1, p0, Lp2/a;->g:I

    add-int/2addr v1, v3

    iput v1, p0, Lp2/a;->g:I

    iput v4, p0, Lp2/a;->h:I

    :cond_2
    move v1, v4

    goto :goto_1

    :cond_3
    iput v1, p0, Lp2/a;->e:I

    invoke-virtual {p0, v3}, Lp2/a;->n(I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    const-string p1, "Unterminated string"

    invoke-virtual {p0, p1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    const/4 p1, 0x0

    throw p1
.end method

.method public final S()V
    .locals 4

    :cond_0
    iget v0, p0, Lp2/a;->e:I

    iget v1, p0, Lp2/a;->f:I

    const/4 v2, 0x1

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, v2}, Lp2/a;->n(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lp2/a;->d:[C

    iget v1, p0, Lp2/a;->e:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, Lp2/a;->e:I

    aget-char v0, v0, v1

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    iget v0, p0, Lp2/a;->g:I

    add-int/2addr v0, v2

    iput v0, p0, Lp2/a;->g:I

    iput v3, p0, Lp2/a;->h:I

    goto :goto_0

    :cond_2
    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    :cond_3
    :goto_0
    return-void
.end method

.method public U()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x0

    :cond_0
    iget v2, p0, Lp2/a;->i:I

    if-nez v2, :cond_1

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v2

    :cond_1
    const/4 v3, 0x3

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v4}, Lp2/a;->P(I)V

    :goto_0
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_7

    :cond_2
    if-ne v2, v4, :cond_3

    invoke-virtual {p0, v3}, Lp2/a;->P(I)V

    goto :goto_0

    :cond_3
    const/4 v3, 0x4

    if-ne v2, v3, :cond_4

    :goto_1
    iget v2, p0, Lp2/a;->n:I

    sub-int/2addr v2, v4

    iput v2, p0, Lp2/a;->n:I

    add-int/lit8 v1, v1, -0x1

    goto/16 :goto_7

    :cond_4
    const/4 v3, 0x2

    if-ne v2, v3, :cond_5

    goto :goto_1

    :cond_5
    const/16 v3, 0xe

    const/16 v5, 0xd

    const/16 v6, 0xc

    const/16 v7, 0xa

    const/16 v8, 0x9

    if-eq v2, v3, :cond_b

    if-ne v2, v7, :cond_6

    goto :goto_5

    :cond_6
    const/16 v3, 0x8

    if-eq v2, v3, :cond_a

    if-ne v2, v6, :cond_7

    goto :goto_3

    :cond_7
    if-eq v2, v8, :cond_9

    if-ne v2, v5, :cond_8

    goto :goto_2

    :cond_8
    const/16 v3, 0x10

    if-ne v2, v3, :cond_f

    iget v2, p0, Lp2/a;->e:I

    iget v3, p0, Lp2/a;->k:I

    add-int/2addr v2, v3

    iput v2, p0, Lp2/a;->e:I

    goto :goto_7

    :cond_9
    :goto_2
    const/16 v2, 0x22

    goto :goto_4

    :cond_a
    :goto_3
    const/16 v2, 0x27

    :goto_4
    invoke-virtual {p0, v2}, Lp2/a;->R(C)V

    goto :goto_7

    :cond_b
    :goto_5
    const/4 v2, 0x0

    :goto_6
    iget v3, p0, Lp2/a;->e:I

    add-int/2addr v3, v2

    iget v9, p0, Lp2/a;->f:I

    if-ge v3, v9, :cond_e

    iget-object v9, p0, Lp2/a;->d:[C

    aget-char v3, v9, v3

    if-eq v3, v8, :cond_d

    if-eq v3, v7, :cond_d

    if-eq v3, v6, :cond_d

    if-eq v3, v5, :cond_d

    const/16 v9, 0x20

    if-eq v3, v9, :cond_d

    const/16 v9, 0x23

    if-eq v3, v9, :cond_c

    const/16 v9, 0x2c

    if-eq v3, v9, :cond_d

    const/16 v9, 0x2f

    if-eq v3, v9, :cond_c

    const/16 v9, 0x3d

    if-eq v3, v9, :cond_c

    const/16 v9, 0x7b

    if-eq v3, v9, :cond_d

    const/16 v9, 0x7d

    if-eq v3, v9, :cond_d

    const/16 v9, 0x3a

    if-eq v3, v9, :cond_d

    const/16 v9, 0x3b

    if-eq v3, v9, :cond_c

    packed-switch v3, :pswitch_data_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_c
    :pswitch_0
    invoke-virtual {p0}, Lp2/a;->c()V

    :cond_d
    :pswitch_1
    iget v3, p0, Lp2/a;->e:I

    add-int/2addr v3, v2

    iput v3, p0, Lp2/a;->e:I

    goto :goto_7

    :cond_e
    iput v3, p0, Lp2/a;->e:I

    invoke-virtual {p0, v4}, Lp2/a;->n(I)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_f
    :goto_7
    iput v0, p0, Lp2/a;->i:I

    if-nez v1, :cond_0

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v2, v1, -0x1

    aget v3, v0, v2

    add-int/2addr v3, v4

    aput v3, v0, v2

    iget-object v0, p0, Lp2/a;->o:[Ljava/lang/String;

    sub-int/2addr v1, v4

    const-string v2, "null"

    aput-object v2, v0, v1

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final V(Ljava/lang/String;)Ljava/io/IOException;
    .locals 2

    new-instance v0, Lp2/c;

    invoke-static {p1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lp2/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a()V
    .locals 3

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp2/a;->P(I)V

    iget-object v1, p0, Lp2/a;->p:[I

    iget v2, p0, Lp2/a;->n:I

    sub-int/2addr v2, v0

    const/4 v0, 0x0

    aput v0, v1, v2

    iput v0, p0, Lp2/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected BEGIN_ARRAY but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()V
    .locals 3

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lp2/a;->P(I)V

    const/4 v0, 0x0

    iput v0, p0, Lp2/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected BEGIN_OBJECT but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c()V
    .locals 1

    iget-boolean v0, p0, Lp2/a;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "Use JsonReader.setLenient(true) to accept malformed JSON"

    invoke-virtual {p0, v0}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v0, 0x0

    throw v0
.end method

.method public close()V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lp2/a;->i:I

    iget-object v1, p0, Lp2/a;->m:[I

    const/16 v2, 0x8

    aput v2, v1, v0

    const/4 v0, 0x1

    iput v0, p0, Lp2/a;->n:I

    iget-object v0, p0, Lp2/a;->b:Ljava/io/Reader;

    invoke-virtual {v0}, Ljava/io/Reader;->close()V

    return-void
.end method

.method public final e()I
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lp2/a;->m:[I

    iget v2, v0, Lp2/a;->n:I

    add-int/lit8 v3, v2, -0x1

    aget v3, v1, v3

    const/16 v4, 0xa

    const/16 v7, 0x27

    const/16 v8, 0x5d

    const/16 v9, 0x3b

    const/16 v10, 0x2c

    const/4 v11, 0x6

    const/4 v12, 0x3

    const/4 v14, 0x0

    const/4 v15, 0x5

    const/4 v6, 0x4

    const/4 v5, 0x2

    const/4 v13, 0x1

    if-ne v3, v13, :cond_1

    sub-int/2addr v2, v13

    aput v5, v1, v2

    :cond_0
    :goto_0
    const/4 v1, 0x0

    goto/16 :goto_3

    :cond_1
    if-ne v3, v5, :cond_4

    invoke-virtual {v0, v13}, Lp2/a;->H(Z)I

    move-result v1

    if-eq v1, v10, :cond_0

    if-eq v1, v9, :cond_3

    if-ne v1, v8, :cond_2

    iput v6, v0, Lp2/a;->i:I

    return v6

    :cond_2
    const-string v1, "Unterminated array"

    invoke-virtual {v0, v1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    throw v14

    :cond_3
    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    goto :goto_0

    :cond_4
    const/16 v5, 0x7d

    if-eq v3, v12, :cond_42

    if-ne v3, v15, :cond_5

    goto/16 :goto_1a

    :cond_5
    if-ne v3, v6, :cond_8

    sub-int/2addr v2, v13

    aput v15, v1, v2

    invoke-virtual {v0, v13}, Lp2/a;->H(Z)I

    move-result v1

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_0

    const/16 v2, 0x3d

    if-ne v1, v2, :cond_7

    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    iget v1, v0, Lp2/a;->e:I

    iget v2, v0, Lp2/a;->f:I

    if-lt v1, v2, :cond_6

    invoke-virtual {v0, v13}, Lp2/a;->n(I)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_6
    iget-object v1, v0, Lp2/a;->d:[C

    iget v2, v0, Lp2/a;->e:I

    aget-char v1, v1, v2

    const/16 v5, 0x3e

    if-ne v1, v5, :cond_0

    add-int/2addr v2, v13

    iput v2, v0, Lp2/a;->e:I

    goto :goto_0

    :cond_7
    const-string v1, "Expected \':\'"

    invoke-virtual {v0, v1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    throw v14

    :cond_8
    if-ne v3, v11, :cond_c

    iget-boolean v1, v0, Lp2/a;->c:Z

    if-eqz v1, :cond_b

    invoke-virtual {v0, v13}, Lp2/a;->H(Z)I

    iget v1, v0, Lp2/a;->e:I

    sub-int/2addr v1, v13

    iput v1, v0, Lp2/a;->e:I

    add-int/2addr v1, v15

    iget v2, v0, Lp2/a;->f:I

    if-le v1, v2, :cond_9

    invoke-virtual {v0, v15}, Lp2/a;->n(I)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_1

    :cond_9
    iget v1, v0, Lp2/a;->e:I

    iget-object v2, v0, Lp2/a;->d:[C

    aget-char v14, v2, v1

    const/16 v6, 0x29

    if-ne v14, v6, :cond_b

    add-int/lit8 v6, v1, 0x1

    aget-char v6, v2, v6

    if-ne v6, v8, :cond_b

    add-int/lit8 v6, v1, 0x2

    aget-char v6, v2, v6

    if-ne v6, v5, :cond_b

    add-int/lit8 v5, v1, 0x3

    aget-char v5, v2, v5

    if-ne v5, v7, :cond_b

    add-int/lit8 v5, v1, 0x4

    aget-char v2, v2, v5

    if-eq v2, v4, :cond_a

    goto :goto_1

    :cond_a
    add-int/2addr v1, v15

    iput v1, v0, Lp2/a;->e:I

    :cond_b
    :goto_1
    iget-object v1, v0, Lp2/a;->m:[I

    iget v2, v0, Lp2/a;->n:I

    sub-int/2addr v2, v13

    const/4 v5, 0x7

    aput v5, v1, v2

    goto/16 :goto_0

    :cond_c
    const/4 v5, 0x7

    const/4 v1, 0x0

    if-ne v3, v5, :cond_e

    invoke-virtual {v0, v1}, Lp2/a;->H(Z)I

    move-result v2

    const/4 v5, -0x1

    if-ne v2, v5, :cond_d

    const/16 v1, 0x11

    :goto_2
    iput v1, v0, Lp2/a;->i:I

    return v1

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    iget v2, v0, Lp2/a;->e:I

    sub-int/2addr v2, v13

    iput v2, v0, Lp2/a;->e:I

    goto :goto_3

    :cond_e
    const/16 v2, 0x8

    if-eq v3, v2, :cond_41

    :goto_3
    invoke-virtual {v0, v13}, Lp2/a;->H(Z)I

    move-result v2

    const/16 v5, 0x22

    if-eq v2, v5, :cond_40

    if-eq v2, v7, :cond_3f

    if-eq v2, v10, :cond_3b

    if-eq v2, v9, :cond_3b

    const/16 v5, 0x5b

    if-eq v2, v5, :cond_3a

    if-eq v2, v8, :cond_39

    const/16 v3, 0x7b

    if-eq v2, v3, :cond_38

    iget v2, v0, Lp2/a;->e:I

    sub-int/2addr v2, v13

    iput v2, v0, Lp2/a;->e:I

    iget-object v3, v0, Lp2/a;->d:[C

    aget-char v2, v3, v2

    const/16 v3, 0x74

    if-eq v2, v3, :cond_13

    const/16 v3, 0x54

    if-ne v2, v3, :cond_f

    goto :goto_5

    :cond_f
    const/16 v3, 0x66

    if-eq v2, v3, :cond_12

    const/16 v3, 0x46

    if-ne v2, v3, :cond_10

    goto :goto_4

    :cond_10
    const/16 v3, 0x6e

    if-eq v2, v3, :cond_11

    const/16 v3, 0x4e

    if-ne v2, v3, :cond_18

    :cond_11
    const-string v2, "null"

    const-string v3, "NULL"

    const/4 v5, 0x7

    goto :goto_6

    :cond_12
    :goto_4
    const-string v2, "false"

    const-string v3, "FALSE"

    const/4 v5, 0x6

    goto :goto_6

    :cond_13
    :goto_5
    const-string v2, "true"

    const-string v3, "TRUE"

    const/4 v5, 0x5

    :goto_6
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x1

    :goto_7
    if-ge v7, v6, :cond_16

    iget v8, v0, Lp2/a;->e:I

    add-int/2addr v8, v7

    iget v9, v0, Lp2/a;->f:I

    if-lt v8, v9, :cond_14

    add-int/lit8 v8, v7, 0x1

    invoke-virtual {v0, v8}, Lp2/a;->n(I)Z

    move-result v8

    if-nez v8, :cond_14

    goto :goto_8

    :cond_14
    iget-object v8, v0, Lp2/a;->d:[C

    iget v9, v0, Lp2/a;->e:I

    add-int/2addr v9, v7

    aget-char v8, v8, v9

    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v8, v9, :cond_15

    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-eq v8, v9, :cond_15

    goto :goto_8

    :cond_15
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_16
    iget v2, v0, Lp2/a;->e:I

    add-int/2addr v2, v6

    iget v3, v0, Lp2/a;->f:I

    if-lt v2, v3, :cond_17

    add-int/lit8 v2, v6, 0x1

    invoke-virtual {v0, v2}, Lp2/a;->n(I)Z

    move-result v2

    if-eqz v2, :cond_19

    :cond_17
    iget-object v2, v0, Lp2/a;->d:[C

    iget v3, v0, Lp2/a;->e:I

    add-int/2addr v3, v6

    aget-char v2, v2, v3

    invoke-virtual {v0, v2}, Lp2/a;->s(C)Z

    move-result v2

    if-eqz v2, :cond_19

    :cond_18
    :goto_8
    const/4 v5, 0x0

    goto :goto_9

    :cond_19
    iget v2, v0, Lp2/a;->e:I

    add-int/2addr v2, v6

    iput v2, v0, Lp2/a;->e:I

    iput v5, v0, Lp2/a;->i:I

    :goto_9
    if-eqz v5, :cond_1a

    return v5

    :cond_1a
    iget-object v2, v0, Lp2/a;->d:[C

    iget v3, v0, Lp2/a;->e:I

    iget v5, v0, Lp2/a;->f:I

    const-wide/16 v6, 0x0

    move-wide v11, v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/16 v16, 0x0

    :goto_a
    add-int v1, v3, v8

    if-ne v1, v5, :cond_1e

    array-length v1, v2

    if-ne v8, v1, :cond_1c

    :cond_1b
    :goto_b
    const/4 v13, 0x0

    goto/16 :goto_17

    :cond_1c
    add-int/lit8 v1, v8, 0x1

    invoke-virtual {v0, v1}, Lp2/a;->n(I)Z

    move-result v1

    if-nez v1, :cond_1d

    :goto_c
    const/4 v1, 0x2

    goto/16 :goto_12

    :cond_1d
    iget v1, v0, Lp2/a;->e:I

    iget v3, v0, Lp2/a;->f:I

    move v5, v3

    move v3, v1

    :cond_1e
    add-int v1, v3, v8

    aget-char v1, v2, v1

    const/16 v14, 0x2b

    if-eq v1, v14, :cond_34

    const/16 v14, 0x45

    if-eq v1, v14, :cond_32

    const/16 v14, 0x65

    if-eq v1, v14, :cond_32

    const/16 v14, 0x2d

    if-eq v1, v14, :cond_30

    const/16 v14, 0x2e

    if-eq v1, v14, :cond_2f

    const/16 v14, 0x30

    if-lt v1, v14, :cond_28

    const/16 v14, 0x39

    if-le v1, v14, :cond_1f

    goto :goto_11

    :cond_1f
    if-eq v9, v13, :cond_27

    if-nez v9, :cond_20

    goto :goto_10

    :cond_20
    const/4 v14, 0x2

    if-ne v9, v14, :cond_24

    cmp-long v14, v11, v6

    if-nez v14, :cond_21

    goto :goto_b

    :cond_21
    const-wide/16 v17, 0xa

    mul-long v17, v17, v11

    add-int/lit8 v1, v1, -0x30

    int-to-long v13, v1

    sub-long v17, v17, v13

    const-wide v13, -0xcccccccccccccccL

    cmp-long v1, v11, v13

    if-gtz v1, :cond_23

    if-nez v1, :cond_22

    cmp-long v1, v17, v11

    if-gez v1, :cond_22

    goto :goto_d

    :cond_22
    const/4 v1, 0x0

    goto :goto_e

    :cond_23
    :goto_d
    const/4 v1, 0x1

    :goto_e
    and-int/2addr v10, v1

    move-wide/from16 v11, v17

    :goto_f
    const/4 v13, 0x6

    goto/16 :goto_16

    :cond_24
    const/4 v1, 0x3

    if-ne v9, v1, :cond_25

    const/4 v9, 0x4

    goto :goto_f

    :cond_25
    const/4 v13, 0x6

    if-eq v9, v15, :cond_26

    if-ne v9, v13, :cond_35

    :cond_26
    const/4 v9, 0x7

    goto/16 :goto_16

    :cond_27
    :goto_10
    const/4 v13, 0x6

    add-int/lit8 v1, v1, -0x30

    neg-int v1, v1

    int-to-long v11, v1

    const/4 v9, 0x2

    goto :goto_16

    :cond_28
    :goto_11
    invoke-virtual {v0, v1}, Lp2/a;->s(C)Z

    move-result v1

    if-nez v1, :cond_1b

    goto :goto_c

    :goto_12
    if-ne v9, v1, :cond_2d

    if-eqz v10, :cond_2c

    const-wide/high16 v1, -0x8000000000000000L

    cmp-long v3, v11, v1

    if-nez v3, :cond_29

    if-eqz v16, :cond_2c

    :cond_29
    cmp-long v1, v11, v6

    if-nez v1, :cond_2a

    if-nez v16, :cond_2c

    :cond_2a
    if-eqz v16, :cond_2b

    goto :goto_13

    :cond_2b
    neg-long v11, v11

    :goto_13
    iput-wide v11, v0, Lp2/a;->j:J

    iget v1, v0, Lp2/a;->e:I

    add-int/2addr v1, v8

    iput v1, v0, Lp2/a;->e:I

    const/16 v1, 0xf

    const/16 v13, 0xf

    goto :goto_14

    :cond_2c
    const/4 v1, 0x2

    :cond_2d
    if-eq v9, v1, :cond_2e

    const/4 v1, 0x4

    if-eq v9, v1, :cond_2e

    const/4 v1, 0x7

    if-ne v9, v1, :cond_1b

    :cond_2e
    iput v8, v0, Lp2/a;->k:I

    const/16 v1, 0x10

    const/16 v13, 0x10

    :goto_14
    iput v13, v0, Lp2/a;->i:I

    goto :goto_17

    :cond_2f
    const/4 v1, 0x2

    const/4 v13, 0x6

    if-ne v9, v1, :cond_1b

    const/4 v9, 0x3

    goto :goto_16

    :cond_30
    const/4 v1, 0x2

    const/4 v13, 0x6

    if-nez v9, :cond_31

    const/4 v9, 0x1

    const/16 v16, 0x1

    goto :goto_16

    :cond_31
    if-ne v9, v15, :cond_1b

    goto :goto_15

    :cond_32
    const/4 v1, 0x2

    const/4 v13, 0x6

    if-eq v9, v1, :cond_33

    const/4 v1, 0x4

    if-ne v9, v1, :cond_1b

    :cond_33
    const/4 v9, 0x5

    goto :goto_16

    :cond_34
    const/4 v13, 0x6

    if-ne v9, v15, :cond_1b

    :goto_15
    const/4 v9, 0x6

    :cond_35
    :goto_16
    add-int/lit8 v8, v8, 0x1

    const/4 v13, 0x1

    goto/16 :goto_a

    :goto_17
    if-eqz v13, :cond_36

    return v13

    :cond_36
    iget-object v1, v0, Lp2/a;->d:[C

    iget v2, v0, Lp2/a;->e:I

    aget-char v1, v1, v2

    invoke-virtual {v0, v1}, Lp2/a;->s(C)Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    iput v4, v0, Lp2/a;->i:I

    return v4

    :cond_37
    const-string v1, "Expected value"

    invoke-virtual {v0, v1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v1, 0x0

    throw v1

    :cond_38
    const/4 v1, 0x1

    goto/16 :goto_2

    :cond_39
    const/4 v1, 0x1

    if-ne v3, v1, :cond_3c

    const/4 v2, 0x4

    :goto_18
    iput v2, v0, Lp2/a;->i:I

    return v2

    :cond_3a
    const/4 v2, 0x3

    goto :goto_18

    :cond_3b
    const/4 v1, 0x1

    :cond_3c
    if-eq v3, v1, :cond_3e

    const/4 v2, 0x2

    if-ne v3, v2, :cond_3d

    goto :goto_19

    :cond_3d
    const-string v1, "Unexpected value"

    invoke-virtual {v0, v1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v1, 0x0

    throw v1

    :cond_3e
    :goto_19
    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    iget v2, v0, Lp2/a;->e:I

    sub-int/2addr v2, v1

    iput v2, v0, Lp2/a;->e:I

    const/4 v1, 0x7

    goto/16 :goto_2

    :cond_3f
    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    const/16 v1, 0x8

    goto/16 :goto_2

    :cond_40
    const/16 v1, 0x9

    goto/16 :goto_2

    :cond_41
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "JsonReader is closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_42
    :goto_1a
    const/4 v4, 0x1

    sub-int/2addr v2, v4

    const/4 v6, 0x4

    aput v6, v1, v2

    if-ne v3, v15, :cond_45

    invoke-virtual {v0, v4}, Lp2/a;->H(Z)I

    move-result v1

    if-eq v1, v10, :cond_45

    if-eq v1, v9, :cond_44

    if-ne v1, v5, :cond_43

    const/4 v1, 0x2

    goto/16 :goto_2

    :cond_43
    const-string v1, "Unterminated object"

    invoke-virtual {v0, v1}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v1, 0x0

    throw v1

    :cond_44
    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    :cond_45
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp2/a;->H(Z)I

    move-result v2

    const/16 v4, 0x22

    if-eq v2, v4, :cond_4a

    if-eq v2, v7, :cond_49

    const-string v4, "Expected name"

    if-eq v2, v5, :cond_47

    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    iget v3, v0, Lp2/a;->e:I

    sub-int/2addr v3, v1

    iput v3, v0, Lp2/a;->e:I

    int-to-char v1, v2

    invoke-virtual {v0, v1}, Lp2/a;->s(C)Z

    move-result v1

    if-eqz v1, :cond_46

    const/16 v1, 0xe

    goto/16 :goto_2

    :cond_46
    invoke-virtual {v0, v4}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    const/4 v1, 0x0

    throw v1

    :cond_47
    const/4 v1, 0x0

    if-eq v3, v15, :cond_48

    const/4 v2, 0x2

    goto :goto_18

    :cond_48
    invoke-virtual {v0, v4}, Lp2/a;->V(Ljava/lang/String;)Ljava/io/IOException;

    throw v1

    :cond_49
    invoke-virtual/range {p0 .. p0}, Lp2/a;->c()V

    const/16 v1, 0xc

    goto/16 :goto_2

    :cond_4a
    const/16 v1, 0xd

    goto/16 :goto_2
.end method

.method public f()V
    .locals 3

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    iget v0, p0, Lp2/a;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lp2/a;->n:I

    iget-object v1, p0, Lp2/a;->p:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    iput v0, p0, Lp2/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected END_ARRAY but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lp2/a;->p(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()V
    .locals 3

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget v0, p0, Lp2/a;->n:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lp2/a;->n:I

    iget-object v1, p0, Lp2/a;->o:[Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    iget-object v1, p0, Lp2/a;->p:[I

    add-int/lit8 v0, v0, -0x1

    aget v2, v1, v0

    add-int/lit8 v2, v2, 0x1

    aput v2, v1, v0

    const/4 v0, 0x0

    iput v0, p0, Lp2/a;->i:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected END_OBJECT but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final n(I)Z
    .locals 7

    iget-object v0, p0, Lp2/a;->d:[C

    iget v1, p0, Lp2/a;->h:I

    iget v2, p0, Lp2/a;->e:I

    sub-int/2addr v1, v2

    iput v1, p0, Lp2/a;->h:I

    iget v1, p0, Lp2/a;->f:I

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    sub-int/2addr v1, v2

    iput v1, p0, Lp2/a;->f:I

    invoke-static {v0, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    iput v3, p0, Lp2/a;->f:I

    :goto_0
    iput v3, p0, Lp2/a;->e:I

    :cond_1
    iget-object v1, p0, Lp2/a;->b:Ljava/io/Reader;

    iget v2, p0, Lp2/a;->f:I

    array-length v4, v0

    sub-int/2addr v4, v2

    invoke-virtual {v1, v0, v2, v4}, Ljava/io/Reader;->read([CII)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_3

    iget v2, p0, Lp2/a;->f:I

    add-int/2addr v2, v1

    iput v2, p0, Lp2/a;->f:I

    iget v1, p0, Lp2/a;->g:I

    const/4 v4, 0x1

    if-nez v1, :cond_2

    iget v1, p0, Lp2/a;->h:I

    if-nez v1, :cond_2

    if-lez v2, :cond_2

    aget-char v5, v0, v3

    const v6, 0xfeff

    if-ne v5, v6, :cond_2

    iget v5, p0, Lp2/a;->e:I

    add-int/2addr v5, v4

    iput v5, p0, Lp2/a;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lp2/a;->h:I

    add-int/lit8 p1, p1, 0x1

    :cond_2
    if-lt v2, p1, :cond_1

    return v4

    :cond_3
    return v3
.end method

.method public final p(Z)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lp2/a;->n:I

    if-ge v1, v2, :cond_4

    iget-object v3, p0, Lp2/a;->m:[I

    aget v3, v3, v1

    const/4 v4, 0x1

    if-eq v3, v4, :cond_1

    const/4 v4, 0x2

    if-eq v3, v4, :cond_1

    const/4 v2, 0x3

    if-eq v3, v2, :cond_0

    const/4 v2, 0x4

    if-eq v3, v2, :cond_0

    const/4 v2, 0x5

    if-eq v3, v2, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lp2/a;->o:[Ljava/lang/String;

    aget-object v3, v2, v1

    if-eqz v3, :cond_3

    aget-object v2, v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lp2/a;->p:[I

    aget v3, v3, v1

    if-eqz p1, :cond_2

    if-lez v3, :cond_2

    add-int/lit8 v2, v2, -0x1

    if-ne v1, v2, :cond_2

    add-int/lit8 v3, v3, -0x1

    :cond_2
    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public q()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lp2/a;->p(Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()Z
    .locals 2

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0x11

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final s(C)Z
    .locals 1

    const/16 v0, 0x9

    if-eq p1, v0, :cond_1

    const/16 v0, 0xa

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_1

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_1

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    const/16 v0, 0x2c

    if-eq p1, v0, :cond_1

    const/16 v0, 0x2f

    if-eq p1, v0, :cond_0

    const/16 v0, 0x3d

    if-eq p1, v0, :cond_0

    const/16 v0, 0x7b

    if-eq p1, v0, :cond_1

    const/16 v0, 0x7d

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x3b

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x1

    return p1

    :cond_0
    :pswitch_0
    invoke-virtual {p0}, Lp2/a;->c()V

    :cond_1
    :pswitch_1
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x5b
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lp2/a;->g:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Lp2/a;->e:I

    iget v2, p0, Lp2/a;->h:I

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " at line "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " column "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public x()Z
    .locals 5

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/4 v1, 0x5

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_1

    iput v2, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    sub-int/2addr v1, v3

    aget v2, v0, v1

    add-int/2addr v2, v3

    aput v2, v0, v1

    return v3

    :cond_1
    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    iput v2, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    sub-int/2addr v1, v3

    aget v4, v0, v1

    add-int/2addr v4, v3

    aput v4, v0, v1

    return v2

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected a boolean but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public y()D
    .locals 6

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iput v2, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    iget-wide v0, p0, Lp2/a;->j:J

    long-to-double v0, v0

    return-wide v0

    :cond_1
    const/16 v1, 0x10

    const/16 v3, 0xb

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lp2/a;->d:[C

    iget v4, p0, Lp2/a;->e:I

    iget v5, p0, Lp2/a;->k:I

    invoke-direct {v0, v1, v4, v5}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    iget v0, p0, Lp2/a;->e:I

    iget v1, p0, Lp2/a;->k:I

    add-int/2addr v0, v1

    iput v0, p0, Lp2/a;->e:I

    goto :goto_3

    :cond_2
    const/16 v1, 0x8

    if-eq v0, v1, :cond_6

    const/16 v4, 0x9

    if-ne v0, v4, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0xa

    if-ne v0, v1, :cond_4

    invoke-virtual {p0}, Lp2/a;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    if-ne v0, v3, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected a double but was "

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_0
    if-ne v0, v1, :cond_7

    const/16 v0, 0x27

    goto :goto_1

    :cond_7
    const/16 v0, 0x22

    :goto_1
    invoke-virtual {p0, v0}, Lp2/a;->J(C)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    :goto_3
    iput v3, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    iget-boolean v3, p0, Lp2/a;->c:Z

    if-nez v3, :cond_9

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v3

    if-nez v3, :cond_8

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_4

    :cond_8
    new-instance v2, Lp2/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "JSON forbids NaN and infinities: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lp2/c;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_9
    :goto_4
    const/4 v3, 0x0

    iput-object v3, p0, Lp2/a;->l:Ljava/lang/String;

    iput v2, p0, Lp2/a;->i:I

    iget-object v2, p0, Lp2/a;->p:[I

    iget v3, p0, Lp2/a;->n:I

    add-int/lit8 v3, v3, -0x1

    aget v4, v2, v3

    add-int/lit8 v4, v4, 0x1

    aput v4, v2, v3

    return-wide v0
.end method

.method public z()I
    .locals 8

    iget v0, p0, Lp2/a;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lp2/a;->e()I

    move-result v0

    :cond_0
    const/16 v1, 0xf

    const-string v2, "Expected an int but was "

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    iget-wide v0, p0, Lp2/a;->j:J

    long-to-int v4, v0

    int-to-long v5, v4

    cmp-long v7, v0, v5

    if-nez v7, :cond_1

    iput v3, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v4

    :cond_1
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lp2/a;->j:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/16 v1, 0x10

    if-ne v0, v1, :cond_3

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lp2/a;->d:[C

    iget v4, p0, Lp2/a;->e:I

    iget v5, p0, Lp2/a;->k:I

    invoke-direct {v0, v1, v4, v5}, Ljava/lang/String;-><init>([CII)V

    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    iget v0, p0, Lp2/a;->e:I

    iget v1, p0, Lp2/a;->k:I

    add-int/2addr v0, v1

    iput v0, p0, Lp2/a;->e:I

    goto :goto_3

    :cond_3
    const/16 v1, 0xa

    const/16 v4, 0x8

    if-eq v0, v4, :cond_5

    const/16 v5, 0x9

    if-eq v0, v5, :cond_5

    if-ne v0, v1, :cond_4

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lp2/a;->N()I

    move-result v2

    invoke-static {v2}, Landroidx/activity/result/a;->j(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_0
    if-ne v0, v1, :cond_6

    invoke-virtual {p0}, Lp2/a;->M()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_6
    if-ne v0, v4, :cond_7

    const/16 v0, 0x27

    goto :goto_1

    :cond_7
    const/16 v0, 0x22

    :goto_1
    invoke-virtual {p0, v0}, Lp2/a;->J(C)Ljava/lang/String;

    move-result-object v0

    :goto_2
    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iput v3, p0, Lp2/a;->i:I

    iget-object v1, p0, Lp2/a;->p:[I

    iget v4, p0, Lp2/a;->n:I

    add-int/lit8 v4, v4, -0x1

    aget v5, v1, v4

    add-int/lit8 v5, v5, 0x1

    aput v5, v1, v4
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    nop

    :goto_3
    const/16 v0, 0xb

    iput v0, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    double-to-int v4, v0

    int-to-double v5, v4

    cmpl-double v7, v5, v0

    if-nez v7, :cond_8

    const/4 v0, 0x0

    iput-object v0, p0, Lp2/a;->l:Ljava/lang/String;

    iput v3, p0, Lp2/a;->i:I

    iget-object v0, p0, Lp2/a;->p:[I

    iget v1, p0, Lp2/a;->n:I

    add-int/lit8 v1, v1, -0x1

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    return v4

    :cond_8
    new-instance v0, Ljava/lang/NumberFormatException;

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lp2/a;->l:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lp2/a;->w()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
