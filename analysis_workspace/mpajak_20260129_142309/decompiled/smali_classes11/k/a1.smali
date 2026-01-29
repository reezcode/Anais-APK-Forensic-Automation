.class public final Lk/a1;
.super Ljava/io/Writer;


# static fields
.field public static final s:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "[C>;"
        }
    .end annotation
.end field

.field public static final t:I


# instance fields
.field public b:[C

.field public c:I

.field public d:I

.field public final e:Ljava/io/Writer;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:C

.field public p:I

.field public q:Z

.field public r:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lk/a1;->s:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sget-object v0, Lk/b1;->d:Lk/b1;

    iget v0, v0, Lk/b1;->b:I

    or-int/lit8 v0, v0, 0x0

    sget-object v1, Lk/b1;->s:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->o:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->f:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->A:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->r:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->B:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->p:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sget-object v1, Lk/b1;->x:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    or-int/2addr v0, v1

    sput v0, Lk/a1;->t:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget v0, Lf/a;->h:I

    sget-object v1, Lk/b1;->E:[Lk/b1;

    invoke-direct {p0, v0, v1}, Lk/a1;-><init>(I[Lk/b1;)V

    return-void
.end method

.method public varargs constructor <init>(I[Lk/b1;)V
    .locals 3

    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lk/a1;->p:I

    const/4 v0, 0x0

    iput-object v0, p0, Lk/a1;->e:Ljava/io/Writer;

    sget-object v1, Lk/a1;->s:Ljava/lang/ThreadLocal;

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [C

    iput-object v2, p0, Lk/a1;->b:[C

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x800

    new-array v0, v0, [C

    iput-object v0, p0, Lk/a1;->b:[C

    :goto_0
    array-length v0, p2

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    iget v2, v2, Lk/b1;->b:I

    or-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    iput p1, p0, Lk/a1;->d:I

    invoke-virtual {p0}, Lk/a1;->c()V

    return-void
.end method


# virtual methods
.method public final A(J)V
    .locals 6

    sget-object v0, Lk/b1;->s:Lk/b1;

    invoke-virtual {p0, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lk/b1;->p:Lk/b1;

    invoke-virtual {p0, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-nez v0, :cond_1

    const-wide v3, 0x1fffffffffffffL

    cmp-long v0, p1, v3

    if-gtz v0, :cond_0

    const-wide v3, -0x1fffffffffffffL

    cmp-long v0, p1, v3

    if-gez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v5, p1, v3

    if-nez v5, :cond_3

    if-eqz v0, :cond_2

    const-string p1, "\"-9223372036854775808\""

    goto :goto_1

    :cond_2
    const-string p1, "-9223372036854775808"

    :goto_1
    invoke-virtual {p0, p1}, Lk/a1;->write(Ljava/lang/String;)V

    return-void

    :cond_3
    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-gez v5, :cond_4

    neg-long v3, p1

    invoke-static {v3, v4}, Lm/e;->f(J)I

    move-result v3

    add-int/2addr v3, v1

    goto :goto_2

    :cond_4
    invoke-static {p1, p2}, Lm/e;->f(J)I

    move-result v3

    :goto_2
    iget v1, p0, Lk/a1;->c:I

    add-int/2addr v1, v3

    if-eqz v0, :cond_5

    add-int/lit8 v1, v1, 0x2

    :cond_5
    iget-object v4, p0, Lk/a1;->b:[C

    array-length v4, v4

    const/16 v5, 0x22

    if-le v1, v4, :cond_8

    iget-object v4, p0, Lk/a1;->e:Ljava/io/Writer;

    if-nez v4, :cond_6

    invoke-virtual {p0, v1}, Lk/a1;->e(I)V

    goto :goto_4

    :cond_6
    new-array v1, v3, [C

    invoke-static {p1, p2, v3, v1}, Lm/e;->c(JI[C)V

    if-eqz v0, :cond_7

    invoke-virtual {p0, v5}, Lk/a1;->write(I)V

    invoke-virtual {p0, v1, v2, v3}, Lk/a1;->write([CII)V

    invoke-virtual {p0, v5}, Lk/a1;->write(I)V

    goto :goto_3

    :cond_7
    invoke-virtual {p0, v1, v2, v3}, Lk/a1;->write([CII)V

    :goto_3
    return-void

    :cond_8
    :goto_4
    if-eqz v0, :cond_9

    iget-object v0, p0, Lk/a1;->b:[C

    iget v2, p0, Lk/a1;->c:I

    aput-char v5, v0, v2

    add-int/lit8 v2, v1, -0x1

    invoke-static {p1, p2, v2, v0}, Lm/e;->c(JI[C)V

    iget-object p1, p0, Lk/a1;->b:[C

    aput-char v5, p1, v2

    goto :goto_5

    :cond_9
    iget-object v0, p0, Lk/a1;->b:[C

    invoke-static {p1, p2, v1, v0}, Lm/e;->c(JI[C)V

    :goto_5
    iput v1, p0, Lk/a1;->c:I

    return-void
.end method

.method public final E()V
    .locals 1

    const-string v0, "null"

    invoke-virtual {p0, v0}, Lk/a1;->write(Ljava/lang/String;)V

    return-void
.end method

.method public final H(II)V
    .locals 0

    and-int/2addr p1, p2

    if-nez p1, :cond_0

    iget p1, p0, Lk/a1;->d:I

    and-int/2addr p1, p2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lk/a1;->E()V

    return-void

    :cond_0
    sget-object p1, Lk/b1;->i:Lk/b1;

    iget p1, p1, Lk/b1;->b:I

    if-ne p2, p1, :cond_1

    const-string p1, "[]"

    :goto_0
    invoke-virtual {p0, p1}, Lk/a1;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    sget-object p1, Lk/b1;->j:Lk/b1;

    iget p1, p1, Lk/b1;->b:I

    if-ne p2, p1, :cond_2

    const-string p1, ""

    invoke-virtual {p0, p1}, Lk/a1;->J(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    sget-object p1, Lk/b1;->l:Lk/b1;

    iget p1, p1, Lk/b1;->b:I

    if-ne p2, p1, :cond_3

    const-string p1, "false"

    goto :goto_0

    :cond_3
    sget-object p1, Lk/b1;->k:Lk/b1;

    iget p1, p1, Lk/b1;->b:I

    if-ne p2, p1, :cond_4

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Lk/a1;->E()V

    :goto_1
    return-void
.end method

.method public final I(Lk/b1;)V
    .locals 1

    iget p1, p1, Lk/b1;->b:I

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lk/a1;->H(II)V

    return-void
.end method

.method public final J(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lk/a1;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lk/a1;->M(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lk/a1;->K(Ljava/lang/String;C)V

    :goto_0
    return-void
.end method

.method public final K(Ljava/lang/String;C)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    if-nez v1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lk/a1;->E()V

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Lk/a1;->write(I)V

    :cond_0
    return-void

    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v3

    iget v4, v0, Lk/a1;->c:I

    add-int/2addr v4, v3

    add-int/lit8 v4, v4, 0x2

    if-eqz v2, :cond_2

    add-int/lit8 v4, v4, 0x1

    :cond_2
    iget-object v5, v0, Lk/a1;->b:[C

    array-length v5, v5

    const/16 v6, 0x3e

    const/16 v7, 0x3c

    const/16 v8, 0x29

    const/16 v9, 0x28

    const/16 v14, 0x22

    const/16 v15, 0xc

    const/16 v12, 0x8

    const/16 v10, 0x75

    const/16 v13, 0x5c

    const/4 v11, 0x1

    if-le v4, v5, :cond_10

    iget-object v5, v0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v5, :cond_f

    invoke-virtual {v0, v14}, Lk/a1;->write(I)V

    const/4 v3, 0x0

    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_d

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    sget-object v5, Lk/b1;->y:Lk/b1;

    invoke-virtual {v0, v5}, Lk/a1;->l(Lk/b1;)Z

    move-result v5

    if-eqz v5, :cond_5

    if-eq v4, v9, :cond_3

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_3

    if-ne v4, v6, :cond_5

    :cond_3
    invoke-virtual {v0, v13}, Lk/a1;->write(I)V

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    sget-object v5, Lm/e;->b:[C

    ushr-int/lit8 v16, v4, 0xc

    and-int/lit8 v16, v16, 0xf

    aget-char v6, v5, v16

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    ushr-int/lit8 v6, v4, 0x8

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    ushr-int/lit8 v6, v4, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v5, v4

    :cond_4
    :goto_1
    invoke-virtual {v0, v4}, Lk/a1;->write(I)V

    goto/16 :goto_3

    :cond_5
    sget-object v5, Lk/b1;->s:Lk/b1;

    invoke-virtual {v0, v5}, Lk/a1;->l(Lk/b1;)Z

    move-result v5

    if-eqz v5, :cond_9

    if-eq v4, v12, :cond_8

    if-eq v4, v15, :cond_8

    const/16 v5, 0xa

    if-eq v4, v5, :cond_8

    const/16 v5, 0xd

    if-eq v4, v5, :cond_8

    const/16 v5, 0x9

    if-eq v4, v5, :cond_8

    if-eq v4, v14, :cond_8

    const/16 v5, 0x2f

    if-eq v4, v5, :cond_8

    if-ne v4, v13, :cond_6

    goto :goto_2

    :cond_6
    const/16 v5, 0x20

    if-ge v4, v5, :cond_7

    invoke-virtual {v0, v13}, Lk/a1;->write(I)V

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    const/16 v5, 0x30

    invoke-virtual {v0, v5}, Lk/a1;->write(I)V

    invoke-virtual {v0, v5}, Lk/a1;->write(I)V

    sget-object v5, Lm/e;->j:[C

    mul-int/lit8 v4, v4, 0x2

    aget-char v6, v5, v4

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    add-int/2addr v4, v11

    aget-char v4, v5, v4

    goto :goto_1

    :cond_7
    const/16 v5, 0x7f

    if-lt v4, v5, :cond_4

    invoke-virtual {v0, v13}, Lk/a1;->write(I)V

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    sget-object v5, Lm/e;->b:[C

    ushr-int/lit8 v6, v4, 0xc

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    ushr-int/lit8 v6, v4, 0x8

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    ushr-int/lit8 v6, v4, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v5, v4

    goto :goto_1

    :cond_8
    :goto_2
    invoke-virtual {v0, v13}, Lk/a1;->write(I)V

    sget-object v5, Lm/e;->i:[C

    aget-char v4, v5, v4

    goto :goto_1

    :cond_9
    sget-object v5, Lm/e;->e:[B

    array-length v6, v5

    if-ge v4, v6, :cond_a

    aget-byte v6, v5, v4

    if-nez v6, :cond_b

    :cond_a
    const/16 v6, 0x2f

    if-ne v4, v6, :cond_4

    sget-object v6, Lk/b1;->r:Lk/b1;

    invoke-virtual {v0, v6}, Lk/a1;->l(Lk/b1;)Z

    move-result v6

    if-eqz v6, :cond_4

    :cond_b
    invoke-virtual {v0, v13}, Lk/a1;->write(I)V

    aget-byte v5, v5, v4

    const/4 v6, 0x4

    if-ne v5, v6, :cond_c

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    sget-object v5, Lm/e;->b:[C

    ushr-int/lit8 v6, v4, 0xc

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    ushr-int/lit8 v6, v4, 0x8

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    ushr-int/lit8 v6, v4, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    invoke-virtual {v0, v6}, Lk/a1;->write(I)V

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v5, v4

    goto/16 :goto_1

    :cond_c
    sget-object v5, Lm/e;->i:[C

    aget-char v4, v5, v4

    goto/16 :goto_1

    :goto_3
    add-int/lit8 v3, v3, 0x1

    const/16 v6, 0x3e

    goto/16 :goto_0

    :cond_d
    invoke-virtual {v0, v14}, Lk/a1;->write(I)V

    if-eqz v2, :cond_e

    invoke-virtual {v0, v2}, Lk/a1;->write(I)V

    :cond_e
    return-void

    :cond_f
    invoke-virtual {v0, v4}, Lk/a1;->e(I)V

    :cond_10
    iget v5, v0, Lk/a1;->c:I

    add-int/lit8 v6, v5, 0x1

    add-int v7, v6, v3

    iget-object v8, v0, Lk/a1;->b:[C

    aput-char v14, v8, v5

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v3, v8, v6}, Ljava/lang/String;->getChars(II[CI)V

    iput v4, v0, Lk/a1;->c:I

    sget-object v3, Lk/b1;->s:Lk/b1;

    invoke-virtual {v0, v3}, Lk/a1;->l(Lk/b1;)Z

    move-result v3

    const/4 v8, -0x1

    if-eqz v3, :cond_20

    move v1, v6

    :goto_4
    if-ge v1, v7, :cond_16

    iget-object v3, v0, Lk/a1;->b:[C

    aget-char v3, v3, v1

    if-eq v3, v14, :cond_14

    const/16 v5, 0x2f

    if-eq v3, v5, :cond_14

    if-ne v3, v13, :cond_11

    goto :goto_6

    :cond_11
    if-eq v3, v12, :cond_14

    if-eq v3, v15, :cond_14

    const/16 v5, 0xa

    if-eq v3, v5, :cond_14

    const/16 v5, 0xd

    if-eq v3, v5, :cond_14

    const/16 v5, 0x9

    if-ne v3, v5, :cond_12

    goto :goto_6

    :cond_12
    const/16 v5, 0x20

    if-ge v3, v5, :cond_13

    :goto_5
    add-int/lit8 v4, v4, 0x5

    goto :goto_7

    :cond_13
    const/16 v5, 0x7f

    if-lt v3, v5, :cond_15

    goto :goto_5

    :cond_14
    :goto_6
    add-int/lit8 v4, v4, 0x1

    :goto_7
    move v8, v1

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_16
    iget-object v1, v0, Lk/a1;->b:[C

    array-length v1, v1

    if-le v4, v1, :cond_17

    invoke-virtual {v0, v4}, Lk/a1;->e(I)V

    :cond_17
    iput v4, v0, Lk/a1;->c:I

    :goto_8
    iget-object v1, v0, Lk/a1;->b:[C

    if-lt v8, v6, :cond_1e

    aget-char v3, v1, v8

    if-eq v3, v12, :cond_1c

    if-eq v3, v15, :cond_1c

    const/16 v4, 0xa

    if-eq v3, v4, :cond_1c

    const/16 v4, 0xd

    if-eq v3, v4, :cond_1c

    const/16 v4, 0x9

    if-ne v3, v4, :cond_18

    goto/16 :goto_b

    :cond_18
    if-eq v3, v14, :cond_1b

    const/16 v4, 0x2f

    if-eq v3, v4, :cond_1b

    if-ne v3, v13, :cond_19

    goto :goto_a

    :cond_19
    const/16 v4, 0x20

    if-ge v3, v4, :cond_1a

    add-int/lit8 v4, v8, 0x1

    add-int/lit8 v5, v8, 0x6

    sub-int v9, v7, v8

    sub-int/2addr v9, v11

    invoke-static {v1, v4, v1, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Lk/a1;->b:[C

    aput-char v13, v1, v8

    aput-char v10, v1, v4

    add-int/lit8 v4, v8, 0x2

    const/16 v5, 0x30

    aput-char v5, v1, v4

    add-int/lit8 v4, v8, 0x3

    aput-char v5, v1, v4

    add-int/lit8 v4, v8, 0x4

    sget-object v5, Lm/e;->j:[C

    mul-int/lit8 v3, v3, 0x2

    aget-char v9, v5, v3

    aput-char v9, v1, v4

    add-int/lit8 v4, v8, 0x5

    add-int/2addr v3, v11

    aget-char v3, v5, v3

    aput-char v3, v1, v4

    :goto_9
    add-int/lit8 v7, v7, 0x5

    goto :goto_d

    :cond_1a
    const/16 v4, 0x7f

    if-lt v3, v4, :cond_1d

    add-int/lit8 v4, v8, 0x1

    add-int/lit8 v5, v8, 0x6

    sub-int v9, v7, v8

    sub-int/2addr v9, v11

    invoke-static {v1, v4, v1, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Lk/a1;->b:[C

    aput-char v13, v1, v8

    aput-char v10, v1, v4

    add-int/lit8 v4, v8, 0x2

    sget-object v5, Lm/e;->b:[C

    ushr-int/lit8 v9, v3, 0xc

    and-int/lit8 v9, v9, 0xf

    aget-char v9, v5, v9

    aput-char v9, v1, v4

    add-int/lit8 v4, v8, 0x3

    ushr-int/lit8 v9, v3, 0x8

    and-int/lit8 v9, v9, 0xf

    aget-char v9, v5, v9

    aput-char v9, v1, v4

    add-int/lit8 v4, v8, 0x4

    ushr-int/lit8 v9, v3, 0x4

    and-int/lit8 v9, v9, 0xf

    aget-char v9, v5, v9

    aput-char v9, v1, v4

    add-int/lit8 v4, v8, 0x5

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v5, v3

    aput-char v3, v1, v4

    goto :goto_9

    :cond_1b
    :goto_a
    add-int/lit8 v4, v8, 0x1

    add-int/lit8 v5, v8, 0x2

    sub-int v9, v7, v8

    sub-int/2addr v9, v11

    invoke-static {v1, v4, v1, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Lk/a1;->b:[C

    aput-char v13, v1, v8

    aput-char v3, v1, v4

    goto :goto_c

    :cond_1c
    :goto_b
    add-int/lit8 v4, v8, 0x1

    add-int/lit8 v5, v8, 0x2

    sub-int v9, v7, v8

    sub-int/2addr v9, v11

    invoke-static {v1, v4, v1, v5, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Lk/a1;->b:[C

    aput-char v13, v1, v8

    sget-object v5, Lm/e;->i:[C

    aget-char v3, v5, v3

    aput-char v3, v1, v4

    :goto_c
    add-int/lit8 v7, v7, 0x1

    :cond_1d
    :goto_d
    add-int/lit8 v8, v8, -0x1

    goto/16 :goto_8

    :cond_1e
    if-eqz v2, :cond_1f

    iget v3, v0, Lk/a1;->c:I

    add-int/lit8 v4, v3, -0x2

    aput-char v14, v1, v4

    sub-int/2addr v3, v11

    aput-char v2, v1, v3

    goto :goto_e

    :cond_1f
    iget v2, v0, Lk/a1;->c:I

    sub-int/2addr v2, v11

    aput-char v14, v1, v2

    :goto_e
    return-void

    :cond_20
    move v3, v6

    const/4 v5, -0x1

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v19, -0x1

    :goto_f
    const/16 v14, 0x2028

    if-ge v3, v7, :cond_2c

    iget-object v10, v0, Lk/a1;->b:[C

    aget-char v10, v10, v3

    const/16 v11, 0x5d

    if-lt v10, v11, :cond_24

    const/16 v11, 0x7f

    if-lt v10, v11, :cond_2b

    if-eq v10, v14, :cond_21

    const/16 v14, 0x2029

    if-eq v10, v14, :cond_21

    const/16 v14, 0xa0

    if-ge v10, v14, :cond_2b

    :cond_21
    if-ne v5, v8, :cond_22

    move v5, v3

    :cond_22
    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v4, v4, 0x4

    :cond_23
    move/from16 v19, v3

    :goto_10
    move v15, v10

    goto :goto_12

    :cond_24
    const/16 v11, 0x7f

    const/16 v14, 0x40

    if-ge v10, v14, :cond_25

    iget-wide v8, v0, Lk/a1;->r:J

    const-wide/16 v20, 0x1

    shl-long v20, v20, v10

    and-long v8, v8, v20

    const-wide/16 v20, 0x0

    cmp-long v14, v8, v20

    if-nez v14, :cond_26

    :cond_25
    if-ne v10, v13, :cond_27

    :cond_26
    const/4 v8, 0x1

    goto :goto_11

    :cond_27
    const/4 v8, 0x0

    :goto_11
    if-eqz v8, :cond_2a

    add-int/lit8 v12, v12, 0x1

    const/16 v8, 0x28

    if-eq v10, v8, :cond_28

    const/16 v8, 0x29

    if-eq v10, v8, :cond_28

    const/16 v8, 0x3c

    if-eq v10, v8, :cond_28

    const/16 v8, 0x3e

    if-eq v10, v8, :cond_28

    sget-object v8, Lm/e;->e:[B

    array-length v9, v8

    if-ge v10, v9, :cond_29

    aget-byte v8, v8, v10

    const/4 v9, 0x4

    if-ne v8, v9, :cond_29

    :cond_28
    add-int/lit8 v4, v4, 0x4

    :cond_29
    const/4 v8, -0x1

    if-ne v5, v8, :cond_23

    move v5, v3

    move/from16 v19, v5

    goto :goto_10

    :cond_2a
    const/4 v8, -0x1

    :cond_2b
    :goto_12
    add-int/lit8 v3, v3, 0x1

    const/16 v9, 0x28

    const/16 v10, 0x75

    const/4 v11, 0x1

    goto :goto_f

    :cond_2c
    if-lez v12, :cond_3e

    add-int/2addr v4, v12

    iget-object v3, v0, Lk/a1;->b:[C

    array-length v3, v3

    if-le v4, v3, :cond_2d

    invoke-virtual {v0, v4}, Lk/a1;->e(I)V

    :cond_2d
    iput v4, v0, Lk/a1;->c:I

    const/4 v3, 0x1

    if-ne v12, v3, :cond_33

    const/16 v1, 0x32

    if-ne v15, v14, :cond_2e

    add-int/lit8 v4, v19, 0x1

    add-int/lit8 v5, v19, 0x6

    sub-int v7, v7, v19

    sub-int/2addr v7, v3

    iget-object v6, v0, Lk/a1;->b:[C

    invoke-static {v6, v4, v6, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v5, v0, Lk/a1;->b:[C

    aput-char v13, v5, v19

    const/16 v6, 0x75

    aput-char v6, v5, v4

    add-int/2addr v4, v3

    aput-char v1, v5, v4

    add-int/2addr v4, v3

    const/16 v6, 0x30

    aput-char v6, v5, v4

    add-int/2addr v4, v3

    aput-char v1, v5, v4

    add-int/2addr v4, v3

    const/16 v1, 0x38

    aput-char v1, v5, v4

    goto/16 :goto_1b

    :cond_2e
    const/16 v4, 0x2029

    if-ne v15, v4, :cond_2f

    add-int/lit8 v4, v19, 0x1

    add-int/lit8 v5, v19, 0x6

    sub-int v7, v7, v19

    sub-int/2addr v7, v3

    iget-object v6, v0, Lk/a1;->b:[C

    invoke-static {v6, v4, v6, v5, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v5, v0, Lk/a1;->b:[C

    aput-char v13, v5, v19

    const/16 v6, 0x75

    aput-char v6, v5, v4

    add-int/2addr v4, v3

    aput-char v1, v5, v4

    add-int/2addr v4, v3

    const/16 v6, 0x30

    aput-char v6, v5, v4

    add-int/2addr v4, v3

    aput-char v1, v5, v4

    add-int/2addr v4, v3

    const/16 v1, 0x39

    aput-char v1, v5, v4

    goto/16 :goto_1b

    :cond_2f
    const/16 v1, 0x28

    if-eq v15, v1, :cond_32

    const/16 v1, 0x29

    if-eq v15, v1, :cond_32

    const/16 v1, 0x3c

    if-eq v15, v1, :cond_32

    const/16 v1, 0x3e

    if-ne v15, v1, :cond_30

    goto :goto_13

    :cond_30
    sget-object v1, Lm/e;->e:[B

    array-length v3, v1

    if-ge v15, v3, :cond_31

    aget-byte v1, v1, v15

    const/4 v3, 0x4

    if-ne v1, v3, :cond_31

    add-int/lit8 v1, v19, 0x1

    add-int/lit8 v3, v19, 0x6

    sub-int v7, v7, v19

    const/4 v4, 0x1

    sub-int/2addr v7, v4

    iget-object v4, v0, Lk/a1;->b:[C

    invoke-static {v4, v1, v4, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Lk/a1;->b:[C

    aput-char v13, v3, v19

    add-int/lit8 v4, v1, 0x1

    const/16 v5, 0x75

    aput-char v5, v3, v1

    add-int/lit8 v1, v4, 0x1

    sget-object v5, Lm/e;->b:[C

    ushr-int/lit8 v6, v15, 0xc

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    aput-char v6, v3, v4

    add-int/lit8 v4, v1, 0x1

    ushr-int/lit8 v6, v15, 0x8

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    aput-char v6, v3, v1

    add-int/lit8 v1, v4, 0x1

    ushr-int/lit8 v6, v15, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    aput-char v6, v3, v4

    and-int/lit8 v4, v15, 0xf

    aget-char v4, v5, v4

    aput-char v4, v3, v1

    goto/16 :goto_1b

    :cond_31
    add-int/lit8 v1, v19, 0x1

    add-int/lit8 v3, v19, 0x2

    sub-int v7, v7, v19

    const/4 v4, 0x1

    sub-int/2addr v7, v4

    iget-object v4, v0, Lk/a1;->b:[C

    invoke-static {v4, v1, v4, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Lk/a1;->b:[C

    aput-char v13, v3, v19

    sget-object v4, Lm/e;->i:[C

    aget-char v4, v4, v15

    aput-char v4, v3, v1

    goto/16 :goto_1b

    :cond_32
    :goto_13
    add-int/lit8 v1, v19, 0x1

    add-int/lit8 v3, v19, 0x6

    sub-int v7, v7, v19

    const/4 v4, 0x1

    sub-int/2addr v7, v4

    iget-object v5, v0, Lk/a1;->b:[C

    invoke-static {v5, v1, v5, v3, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Lk/a1;->b:[C

    aput-char v13, v3, v19

    const/16 v5, 0x75

    aput-char v5, v3, v1

    add-int/2addr v1, v4

    sget-object v5, Lm/e;->b:[C

    ushr-int/lit8 v6, v15, 0xc

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    aput-char v6, v3, v1

    add-int/2addr v1, v4

    ushr-int/lit8 v6, v15, 0x8

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    aput-char v6, v3, v1

    add-int/2addr v1, v4

    ushr-int/lit8 v6, v15, 0x4

    and-int/lit8 v6, v6, 0xf

    aget-char v6, v5, v6

    aput-char v6, v3, v1

    add-int/2addr v1, v4

    and-int/lit8 v6, v15, 0xf

    aget-char v5, v5, v6

    aput-char v5, v3, v1

    goto/16 :goto_1b

    :cond_33
    const/4 v4, 0x1

    if-le v12, v4, :cond_3e

    sub-int v3, v5, v6

    :goto_14
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_3e

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    iget-boolean v6, v0, Lk/a1;->q:Z

    if-eqz v6, :cond_36

    const/16 v6, 0x28

    const/16 v7, 0x29

    const/16 v8, 0x3c

    if-eq v4, v6, :cond_34

    if-eq v4, v7, :cond_34

    const/16 v9, 0x3e

    if-eq v4, v8, :cond_35

    if-ne v4, v9, :cond_37

    goto :goto_15

    :cond_34
    const/16 v9, 0x3e

    :cond_35
    :goto_15
    iget-object v10, v0, Lk/a1;->b:[C

    add-int/lit8 v11, v5, 0x1

    aput-char v13, v10, v5

    add-int/lit8 v5, v11, 0x1

    const/16 v12, 0x75

    aput-char v12, v10, v11

    add-int/lit8 v11, v5, 0x1

    sget-object v12, Lm/e;->b:[C

    ushr-int/lit8 v15, v4, 0xc

    and-int/lit8 v15, v15, 0xf

    aget-char v15, v12, v15

    aput-char v15, v10, v5

    add-int/lit8 v5, v11, 0x1

    ushr-int/lit8 v15, v4, 0x8

    and-int/lit8 v15, v15, 0xf

    aget-char v15, v12, v15

    aput-char v15, v10, v11

    add-int/lit8 v11, v5, 0x1

    ushr-int/lit8 v15, v4, 0x4

    and-int/lit8 v15, v15, 0xf

    aget-char v15, v12, v15

    aput-char v15, v10, v5

    add-int/lit8 v5, v11, 0x1

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v12, v4

    aput-char v4, v10, v11

    const/4 v10, 0x4

    const/16 v11, 0x2f

    :goto_16
    const/16 v16, 0x75

    goto/16 :goto_1a

    :cond_36
    const/16 v6, 0x28

    const/16 v7, 0x29

    const/16 v8, 0x3c

    const/16 v9, 0x3e

    :cond_37
    sget-object v10, Lm/e;->e:[B

    array-length v11, v10

    if-ge v4, v11, :cond_39

    aget-byte v11, v10, v4

    if-nez v11, :cond_38

    goto :goto_17

    :cond_38
    const/16 v11, 0x2f

    goto :goto_18

    :cond_39
    :goto_17
    const/16 v11, 0x2f

    if-ne v4, v11, :cond_3b

    sget-object v12, Lk/b1;->r:Lk/b1;

    invoke-virtual {v0, v12}, Lk/a1;->l(Lk/b1;)Z

    move-result v12

    if-eqz v12, :cond_3b

    :goto_18
    iget-object v12, v0, Lk/a1;->b:[C

    add-int/lit8 v15, v5, 0x1

    aput-char v13, v12, v5

    aget-byte v5, v10, v4

    const/4 v10, 0x4

    if-ne v5, v10, :cond_3a

    add-int/lit8 v5, v15, 0x1

    const/16 v16, 0x75

    aput-char v16, v12, v15

    add-int/lit8 v15, v5, 0x1

    sget-object v16, Lm/e;->b:[C

    ushr-int/lit8 v17, v4, 0xc

    and-int/lit8 v17, v17, 0xf

    aget-char v17, v16, v17

    aput-char v17, v12, v5

    add-int/lit8 v5, v15, 0x1

    ushr-int/lit8 v17, v4, 0x8

    and-int/lit8 v17, v17, 0xf

    aget-char v17, v16, v17

    aput-char v17, v12, v15

    add-int/lit8 v15, v5, 0x1

    ushr-int/lit8 v17, v4, 0x4

    and-int/lit8 v17, v17, 0xf

    aget-char v17, v16, v17

    aput-char v17, v12, v5

    add-int/lit8 v5, v15, 0x1

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v16, v4

    aput-char v4, v12, v15

    goto :goto_16

    :cond_3a
    add-int/lit8 v5, v15, 0x1

    sget-object v16, Lm/e;->i:[C

    aget-char v4, v16, v4

    aput-char v4, v12, v15

    goto :goto_16

    :cond_3b
    const/4 v10, 0x4

    if-eq v4, v14, :cond_3d

    const/16 v12, 0x2029

    if-ne v4, v12, :cond_3c

    goto :goto_19

    :cond_3c
    iget-object v12, v0, Lk/a1;->b:[C

    add-int/lit8 v15, v5, 0x1

    aput-char v4, v12, v5

    move v5, v15

    goto :goto_16

    :cond_3d
    :goto_19
    iget-object v12, v0, Lk/a1;->b:[C

    add-int/lit8 v15, v5, 0x1

    aput-char v13, v12, v5

    add-int/lit8 v5, v15, 0x1

    const/16 v16, 0x75

    aput-char v16, v12, v15

    add-int/lit8 v15, v5, 0x1

    sget-object v17, Lm/e;->b:[C

    ushr-int/lit8 v18, v4, 0xc

    and-int/lit8 v18, v18, 0xf

    aget-char v18, v17, v18

    aput-char v18, v12, v5

    add-int/lit8 v5, v15, 0x1

    ushr-int/lit8 v18, v4, 0x8

    and-int/lit8 v18, v18, 0xf

    aget-char v18, v17, v18

    aput-char v18, v12, v15

    add-int/lit8 v15, v5, 0x1

    ushr-int/lit8 v18, v4, 0x4

    and-int/lit8 v18, v18, 0xf

    aget-char v18, v17, v18

    aput-char v18, v12, v5

    add-int/lit8 v5, v15, 0x1

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v17, v4

    aput-char v4, v12, v15

    :goto_1a
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_14

    :cond_3e
    :goto_1b
    if-eqz v2, :cond_3f

    iget-object v1, v0, Lk/a1;->b:[C

    iget v3, v0, Lk/a1;->c:I

    add-int/lit8 v4, v3, -0x2

    const/16 v5, 0x22

    aput-char v5, v1, v4

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    aput-char v2, v1, v3

    goto :goto_1c

    :cond_3f
    const/4 v4, 0x1

    const/16 v5, 0x22

    iget-object v1, v0, Lk/a1;->b:[C

    iget v2, v0, Lk/a1;->c:I

    sub-int/2addr v2, v4

    aput-char v5, v1, v2

    :goto_1c
    return-void
.end method

.method public final M(Ljava/lang/String;)V
    .locals 12

    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget p1, p0, Lk/a1;->c:I

    const/4 v1, 0x4

    add-int/2addr p1, v1

    iget-object v2, p0, Lk/a1;->b:[C

    array-length v2, v2

    if-le p1, v2, :cond_0

    invoke-virtual {p0, p1}, Lk/a1;->e(I)V

    :cond_0
    iget-object v2, p0, Lk/a1;->b:[C

    iget v3, p0, Lk/a1;->c:I

    const-string v4, "null"

    invoke-virtual {v4, v0, v1, v2, v3}, Ljava/lang/String;->getChars(II[CI)V

    iput p1, p0, Lk/a1;->c:I

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lk/a1;->c:I

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, 0x2

    iget-object v3, p0, Lk/a1;->b:[C

    array-length v3, v3

    const/16 v4, 0x2f

    const/16 v5, 0xd

    const/16 v6, 0x5c

    const/16 v7, 0x27

    if-le v2, v3, :cond_6

    iget-object v3, p0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v3, :cond_5

    invoke-virtual {p0, v7}, Lk/a1;->write(I)V

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_4

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-le v1, v5, :cond_2

    if-eq v1, v6, :cond_2

    if-eq v1, v7, :cond_2

    if-ne v1, v4, :cond_3

    sget-object v2, Lk/b1;->r:Lk/b1;

    invoke-virtual {p0, v2}, Lk/a1;->l(Lk/b1;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    invoke-virtual {p0, v6}, Lk/a1;->write(I)V

    sget-object v2, Lm/e;->i:[C

    aget-char v1, v2, v1

    :cond_3
    invoke-virtual {p0, v1}, Lk/a1;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p0, v7}, Lk/a1;->write(I)V

    return-void

    :cond_5
    invoke-virtual {p0, v2}, Lk/a1;->e(I)V

    :cond_6
    iget v3, p0, Lk/a1;->c:I

    add-int/lit8 v8, v3, 0x1

    add-int v9, v8, v1

    iget-object v10, p0, Lk/a1;->b:[C

    aput-char v7, v10, v3

    invoke-virtual {p1, v0, v1, v10, v8}, Ljava/lang/String;->getChars(II[CI)V

    iput v2, p0, Lk/a1;->c:I

    const/4 p1, -0x1

    move v3, v8

    const/4 v1, 0x0

    :goto_1
    if-ge v3, v9, :cond_9

    iget-object v10, p0, Lk/a1;->b:[C

    aget-char v10, v10, v3

    if-le v10, v5, :cond_7

    if-eq v10, v6, :cond_7

    if-eq v10, v7, :cond_7

    if-ne v10, v4, :cond_8

    sget-object v11, Lk/b1;->r:Lk/b1;

    invoke-virtual {p0, v11}, Lk/a1;->l(Lk/b1;)Z

    move-result v11

    if-eqz v11, :cond_8

    :cond_7
    add-int/lit8 v0, v0, 0x1

    move p1, v3

    move v1, v10

    :cond_8
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_9
    add-int/2addr v2, v0

    iget-object v3, p0, Lk/a1;->b:[C

    array-length v3, v3

    if-le v2, v3, :cond_a

    invoke-virtual {p0, v2}, Lk/a1;->e(I)V

    :cond_a
    iput v2, p0, Lk/a1;->c:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_b

    iget-object v0, p0, Lk/a1;->b:[C

    add-int/lit8 v3, p1, 0x1

    add-int/lit8 v4, p1, 0x2

    sub-int/2addr v9, p1

    sub-int/2addr v9, v2

    invoke-static {v0, v3, v0, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lk/a1;->b:[C

    aput-char v6, v0, p1

    sget-object p1, Lm/e;->i:[C

    aget-char p1, p1, v1

    aput-char p1, v0, v3

    goto :goto_3

    :cond_b
    if-le v0, v2, :cond_e

    iget-object v0, p0, Lk/a1;->b:[C

    add-int/lit8 v3, p1, 0x1

    add-int/lit8 v10, p1, 0x2

    sub-int v11, v9, p1

    sub-int/2addr v11, v2

    invoke-static {v0, v3, v0, v10, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lk/a1;->b:[C

    aput-char v6, v0, p1

    sget-object p1, Lm/e;->i:[C

    aget-char p1, p1, v1

    aput-char p1, v0, v3

    add-int/2addr v9, v2

    add-int/lit8 v3, v3, -0x2

    :goto_2
    if-lt v3, v8, :cond_e

    iget-object p1, p0, Lk/a1;->b:[C

    aget-char p1, p1, v3

    if-le p1, v5, :cond_c

    if-eq p1, v6, :cond_c

    if-eq p1, v7, :cond_c

    if-ne p1, v4, :cond_d

    sget-object v0, Lk/b1;->r:Lk/b1;

    invoke-virtual {p0, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_c
    iget-object v0, p0, Lk/a1;->b:[C

    add-int/lit8 v1, v3, 0x1

    add-int/lit8 v10, v3, 0x2

    sub-int v11, v9, v3

    sub-int/2addr v11, v2

    invoke-static {v0, v1, v0, v10, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lk/a1;->b:[C

    aput-char v6, v0, v3

    sget-object v10, Lm/e;->i:[C

    aget-char p1, v10, p1

    aput-char p1, v0, v1

    add-int/lit8 v9, v9, 0x1

    :cond_d
    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_e
    :goto_3
    iget-object p1, p0, Lk/a1;->b:[C

    iget v0, p0, Lk/a1;->c:I

    sub-int/2addr v0, v2

    aput-char v7, p1, v0

    return-void
.end method

.method public final a(Ljava/lang/CharSequence;)Lk/a1;
    .locals 2

    if-nez p1, :cond_0

    const-string p1, "null"

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lk/a1;->write(Ljava/lang/String;II)V

    return-object p0
.end method

.method public final append(C)Ljava/io/Writer;
    .locals 0

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 0

    invoke-virtual {p0, p1}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lk/a1;->b(Ljava/lang/CharSequence;II)Lk/a1;

    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 0

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    invoke-virtual {p0, p1}, Lk/a1;->a(Ljava/lang/CharSequence;)Lk/a1;

    return-object p0
.end method

.method public final bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lk/a1;->b(Ljava/lang/CharSequence;II)Lk/a1;

    return-object p0
.end method

.method public final b(Ljava/lang/CharSequence;II)Lk/a1;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, "null"

    :cond_0
    invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lk/a1;->write(Ljava/lang/String;II)V

    return-object p0
.end method

.method public final c()V
    .locals 7

    iget v0, p0, Lk/a1;->d:I

    sget-object v1, Lk/b1;->c:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    and-int/2addr v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lk/a1;->g:Z

    sget-object v4, Lk/b1;->d:Lk/b1;

    iget v4, v4, Lk/b1;->b:I

    and-int/2addr v4, v0

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iput-boolean v4, p0, Lk/a1;->f:Z

    sget-object v5, Lk/b1;->n:Lk/b1;

    iget v5, v5, Lk/b1;->b:I

    and-int/2addr v5, v0

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    iput-boolean v5, p0, Lk/a1;->h:Z

    sget-object v5, Lk/b1;->q:Lk/b1;

    iget v5, v5, Lk/b1;->b:I

    and-int/2addr v5, v0

    if-eqz v5, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    iput-boolean v5, p0, Lk/a1;->i:Z

    sget-object v5, Lk/b1;->v:Lk/b1;

    iget v5, v5, Lk/b1;->b:I

    and-int/2addr v5, v0

    if-eqz v5, :cond_4

    const/4 v5, 0x1

    goto :goto_4

    :cond_4
    const/4 v5, 0x0

    :goto_4
    iput-boolean v5, p0, Lk/a1;->j:Z

    sget-object v6, Lk/b1;->A:Lk/b1;

    iget v6, v6, Lk/b1;->b:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    goto :goto_5

    :cond_5
    const/4 v6, 0x0

    :goto_5
    iput-boolean v6, p0, Lk/a1;->k:Z

    sget-object v6, Lk/b1;->x:Lk/b1;

    iget v6, v6, Lk/b1;->b:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_6

    const/4 v6, 0x1

    goto :goto_6

    :cond_6
    const/4 v6, 0x0

    :goto_6
    iput-boolean v6, p0, Lk/a1;->l:Z

    sget-object v6, Lk/b1;->g:Lk/b1;

    iget v6, v6, Lk/b1;->b:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_7

    const/4 v6, 0x1

    goto :goto_7

    :cond_7
    const/4 v6, 0x0

    :goto_7
    iput-boolean v6, p0, Lk/a1;->m:Z

    sget-object v6, Lk/b1;->f:Lk/b1;

    iget v6, v6, Lk/b1;->b:I

    and-int/2addr v6, v0

    if-eqz v6, :cond_8

    const/4 v6, 0x1

    goto :goto_8

    :cond_8
    const/4 v6, 0x0

    :goto_8
    iput-boolean v6, p0, Lk/a1;->n:Z

    if-eqz v1, :cond_9

    sget v1, Lk/a1;->t:I

    and-int/2addr v1, v0

    :cond_9
    if-eqz v4, :cond_a

    const/16 v1, 0x27

    goto :goto_9

    :cond_a
    const/16 v1, 0x22

    :goto_9
    iput-char v1, p0, Lk/a1;->o:C

    sget-object v1, Lk/b1;->y:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    goto :goto_a

    :cond_b
    const/4 v2, 0x0

    :goto_a
    iput-boolean v2, p0, Lk/a1;->q:Z

    if-eqz v2, :cond_c

    const-wide v0, 0x50000304ffffffffL    # 2.3175490007226655E77

    goto :goto_b

    :cond_c
    sget-object v1, Lk/b1;->r:Lk/b1;

    iget v1, v1, Lk/b1;->b:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_d

    const-wide v0, 0x8004ffffffffL

    goto :goto_b

    :cond_d
    const-wide v0, 0x4ffffffffL

    :goto_b
    iput-wide v0, p0, Lk/a1;->r:J

    return-void
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v0, :cond_0

    iget v0, p0, Lk/a1;->c:I

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lk/a1;->flush()V

    :cond_0
    iget-object v0, p0, Lk/a1;->b:[C

    array-length v1, v0

    const/high16 v2, 0x20000

    if-gt v1, v2, :cond_1

    sget-object v1, Lk/a1;->s:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lk/a1;->b:[C

    return-void
.end method

.method public final e(I)V
    .locals 3

    iget v0, p0, Lk/a1;->p:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lf/d;

    const-string v1, "serialize exceeded MAX_OUTPUT_LENGTH="

    invoke-static {v1}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lk/a1;->p:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", minimumCapacity="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lf/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lk/a1;->b:[C

    array-length v1, v0

    array-length v2, v0

    shr-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x1

    if-ge v1, p1, :cond_2

    goto :goto_1

    :cond_2
    move p1, v1

    :goto_1
    new-array p1, p1, [C

    iget v1, p0, Lk/a1;->c:I

    const/4 v2, 0x0

    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p1, p0, Lk/a1;->b:[C

    return-void
.end method

.method public final f(I)Z
    .locals 1

    iget v0, p0, Lk/a1;->d:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final flush()V
    .locals 4

    iget-object v0, p0, Lk/a1;->e:Ljava/io/Writer;

    if-nez v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v1, p0, Lk/a1;->b:[C

    iget v2, p0, Lk/a1;->c:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/Writer;->write([CII)V

    iget-object v0, p0, Lk/a1;->e:Ljava/io/Writer;

    invoke-virtual {v0}, Ljava/io/Writer;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iput v3, p0, Lk/a1;->c:I

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lf/d;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final l(Lk/b1;)Z
    .locals 1

    iget v0, p0, Lk/a1;->d:I

    iget p1, p1, Lk/b1;->b:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final n([B)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Lk/b1;->p:Lk/b1;

    iget v2, v2, Lk/b1;->b:I

    invoke-virtual {v0, v2}, Lk/a1;->f(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p1}, Lk/a1;->y([B)V

    return-void

    :cond_0
    array-length v2, v1

    iget-boolean v3, v0, Lk/a1;->f:Z

    if-eqz v3, :cond_1

    const/16 v4, 0x27

    goto :goto_0

    :cond_1
    const/16 v4, 0x22

    :goto_0
    if-nez v2, :cond_3

    if-eqz v3, :cond_2

    const-string v1, "\'\'"

    goto :goto_1

    :cond_2
    const-string v1, "\"\""

    :goto_1
    invoke-virtual {v0, v1}, Lk/a1;->write(Ljava/lang/String;)V

    return-void

    :cond_3
    sget-object v3, Lm/e;->o:[C

    div-int/lit8 v5, v2, 0x3

    mul-int/lit8 v5, v5, 0x3

    add-int/lit8 v6, v2, -0x1

    div-int/lit8 v7, v6, 0x3

    add-int/lit8 v7, v7, 0x1

    const/4 v8, 0x2

    shl-int/2addr v7, v8

    iget v9, v0, Lk/a1;->c:I

    add-int/2addr v7, v9

    add-int/2addr v7, v8

    iget-object v10, v0, Lk/a1;->b:[C

    array-length v10, v10

    const/4 v11, 0x0

    const/16 v12, 0x3d

    if-le v7, v10, :cond_9

    iget-object v10, v0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v10, :cond_8

    invoke-virtual {v0, v4}, Lk/a1;->write(I)V

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v5, :cond_4

    add-int/lit8 v9, v7, 0x1

    aget-byte v7, v1, v7

    and-int/lit16 v7, v7, 0xff

    shl-int/lit8 v7, v7, 0x10

    add-int/lit8 v10, v9, 0x1

    aget-byte v9, v1, v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v7, v9

    add-int/lit8 v9, v10, 0x1

    aget-byte v10, v1, v10

    and-int/lit16 v10, v10, 0xff

    or-int/2addr v7, v10

    ushr-int/lit8 v10, v7, 0x12

    and-int/lit8 v10, v10, 0x3f

    aget-char v10, v3, v10

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    ushr-int/lit8 v10, v7, 0xc

    and-int/lit8 v10, v10, 0x3f

    aget-char v10, v3, v10

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    ushr-int/lit8 v10, v7, 0x6

    and-int/lit8 v10, v10, 0x3f

    aget-char v10, v3, v10

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    and-int/lit8 v7, v7, 0x3f

    aget-char v7, v3, v7

    invoke-virtual {v0, v7}, Lk/a1;->write(I)V

    move v7, v9

    goto :goto_2

    :cond_4
    sub-int/2addr v2, v5

    if-lez v2, :cond_7

    aget-byte v5, v1, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0xa

    if-ne v2, v8, :cond_5

    aget-byte v1, v1, v6

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v11, v1, 0x2

    :cond_5
    or-int v1, v5, v11

    shr-int/lit8 v5, v1, 0xc

    aget-char v5, v3, v5

    invoke-virtual {v0, v5}, Lk/a1;->write(I)V

    ushr-int/lit8 v5, v1, 0x6

    and-int/lit8 v5, v5, 0x3f

    aget-char v5, v3, v5

    invoke-virtual {v0, v5}, Lk/a1;->write(I)V

    if-ne v2, v8, :cond_6

    and-int/lit8 v1, v1, 0x3f

    aget-char v1, v3, v1

    goto :goto_3

    :cond_6
    const/16 v1, 0x3d

    :goto_3
    invoke-virtual {v0, v1}, Lk/a1;->write(I)V

    invoke-virtual {v0, v12}, Lk/a1;->write(I)V

    :cond_7
    invoke-virtual {v0, v4}, Lk/a1;->write(I)V

    return-void

    :cond_8
    invoke-virtual {v0, v7}, Lk/a1;->e(I)V

    :cond_9
    iput v7, v0, Lk/a1;->c:I

    iget-object v10, v0, Lk/a1;->b:[C

    add-int/lit8 v13, v9, 0x1

    aput-char v4, v10, v9

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v5, :cond_a

    add-int/lit8 v10, v9, 0x1

    aget-byte v9, v1, v9

    and-int/lit16 v9, v9, 0xff

    shl-int/lit8 v9, v9, 0x10

    add-int/lit8 v14, v10, 0x1

    aget-byte v10, v1, v10

    and-int/lit16 v10, v10, 0xff

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v9, v10

    add-int/lit8 v10, v14, 0x1

    aget-byte v14, v1, v14

    and-int/lit16 v14, v14, 0xff

    or-int/2addr v9, v14

    iget-object v14, v0, Lk/a1;->b:[C

    add-int/lit8 v15, v13, 0x1

    ushr-int/lit8 v16, v9, 0x12

    and-int/lit8 v16, v16, 0x3f

    aget-char v16, v3, v16

    aput-char v16, v14, v13

    add-int/lit8 v13, v15, 0x1

    ushr-int/lit8 v16, v9, 0xc

    and-int/lit8 v16, v16, 0x3f

    aget-char v16, v3, v16

    aput-char v16, v14, v15

    add-int/lit8 v15, v13, 0x1

    ushr-int/lit8 v16, v9, 0x6

    and-int/lit8 v16, v16, 0x3f

    aget-char v16, v3, v16

    aput-char v16, v14, v13

    add-int/lit8 v13, v15, 0x1

    and-int/lit8 v9, v9, 0x3f

    aget-char v9, v3, v9

    aput-char v9, v14, v15

    move v9, v10

    goto :goto_4

    :cond_a
    sub-int/2addr v2, v5

    if-lez v2, :cond_d

    aget-byte v5, v1, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0xa

    if-ne v2, v8, :cond_b

    aget-byte v1, v1, v6

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v11, v1, 0x2

    :cond_b
    or-int v1, v5, v11

    iget-object v5, v0, Lk/a1;->b:[C

    add-int/lit8 v6, v7, -0x5

    shr-int/lit8 v9, v1, 0xc

    aget-char v9, v3, v9

    aput-char v9, v5, v6

    add-int/lit8 v6, v7, -0x4

    ushr-int/lit8 v9, v1, 0x6

    and-int/lit8 v9, v9, 0x3f

    aget-char v9, v3, v9

    aput-char v9, v5, v6

    add-int/lit8 v6, v7, -0x3

    if-ne v2, v8, :cond_c

    and-int/lit8 v1, v1, 0x3f

    aget-char v1, v3, v1

    goto :goto_5

    :cond_c
    const/16 v1, 0x3d

    :goto_5
    aput-char v1, v5, v6

    add-int/lit8 v1, v7, -0x2

    aput-char v12, v5, v1

    :cond_d
    iget-object v1, v0, Lk/a1;->b:[C

    add-int/lit8 v7, v7, -0x1

    aput-char v4, v1, v7

    return-void
.end method

.method public final p(DZ)V
    .locals 1

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lk/b1;->k:Lk/b1;

    invoke-virtual {p0, p2}, Lk/a1;->l(Lk/b1;)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, ".0"

    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    const/4 p2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_1
    invoke-virtual {p0, p1}, Lk/a1;->write(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    sget-object p1, Lk/b1;->p:Lk/b1;

    invoke-virtual {p0, p1}, Lk/a1;->l(Lk/b1;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/16 p1, 0x44

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lk/a1;->E()V

    :cond_3
    :goto_1
    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    if-nez v1, :cond_0

    const-string v1, "null:"

    invoke-virtual {v0, v1}, Lk/a1;->write(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-boolean v2, v0, Lk/a1;->f:Z

    const/16 v3, 0x5c

    const/16 v4, 0x3a

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_12

    iget-boolean v2, v0, Lk/a1;->g:Z

    if-eqz v2, :cond_1

    invoke-virtual/range {p0 .. p1}, Lk/a1;->M(Ljava/lang/String;)V

    goto/16 :goto_b

    :cond_1
    sget-object v2, Lm/e;->f:[B

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v7

    iget v8, v0, Lk/a1;->c:I

    add-int/2addr v8, v7

    add-int/2addr v8, v6

    iget-object v9, v0, Lk/a1;->b:[C

    array-length v9, v9

    const/16 v10, 0x27

    if-le v8, v9, :cond_a

    iget-object v9, v0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v9, :cond_9

    if-nez v7, :cond_2

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    goto :goto_3

    :cond_2
    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_4

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    array-length v11, v2

    if-ge v9, v11, :cond_3

    aget-byte v9, v2, v9

    if-eqz v9, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_4
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_5

    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    :cond_5
    :goto_2
    if-ge v5, v7, :cond_7

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    array-length v9, v2

    if-ge v8, v9, :cond_6

    aget-byte v9, v2, v8

    if-eqz v9, :cond_6

    invoke-virtual {v0, v3}, Lk/a1;->write(I)V

    sget-object v9, Lm/e;->i:[C

    aget-char v8, v9, v8

    :cond_6
    invoke-virtual {v0, v8}, Lk/a1;->write(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    if-eqz v6, :cond_8

    :goto_3
    invoke-virtual {v0, v10}, Lk/a1;->write(I)V

    :cond_8
    invoke-virtual {v0, v4}, Lk/a1;->write(I)V

    goto/16 :goto_c

    :cond_9
    invoke-virtual {v0, v8}, Lk/a1;->e(I)V

    :cond_a
    if-nez v7, :cond_c

    iget v1, v0, Lk/a1;->c:I

    add-int/lit8 v1, v1, 0x3

    iget-object v2, v0, Lk/a1;->b:[C

    array-length v2, v2

    if-le v1, v2, :cond_b

    invoke-virtual {v0, v1}, Lk/a1;->e(I)V

    :cond_b
    iget-object v1, v0, Lk/a1;->b:[C

    iget v2, v0, Lk/a1;->c:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lk/a1;->c:I

    aput-char v10, v1, v2

    add-int/lit8 v2, v3, 0x1

    iput v2, v0, Lk/a1;->c:I

    aput-char v10, v1, v3

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lk/a1;->c:I

    aput-char v4, v1, v2

    goto/16 :goto_c

    :cond_c
    iget v9, v0, Lk/a1;->c:I

    add-int v11, v9, v7

    iget-object v12, v0, Lk/a1;->b:[C

    invoke-virtual {v1, v5, v7, v12, v9}, Ljava/lang/String;->getChars(II[CI)V

    iput v8, v0, Lk/a1;->c:I

    move v1, v9

    const/4 v7, 0x0

    :goto_4
    if-ge v1, v11, :cond_11

    iget-object v12, v0, Lk/a1;->b:[C

    aget-char v13, v12, v1

    array-length v14, v2

    if-ge v13, v14, :cond_10

    aget-byte v14, v2, v13

    if-eqz v14, :cond_10

    if-nez v7, :cond_e

    add-int/lit8 v8, v8, 0x3

    array-length v7, v12

    if-le v8, v7, :cond_d

    invoke-virtual {v0, v8}, Lk/a1;->e(I)V

    :cond_d
    iput v8, v0, Lk/a1;->c:I

    iget-object v7, v0, Lk/a1;->b:[C

    add-int/lit8 v12, v1, 0x1

    add-int/lit8 v14, v1, 0x3

    sub-int v15, v11, v1

    sub-int/2addr v15, v6

    invoke-static {v7, v12, v7, v14, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v7, v0, Lk/a1;->b:[C

    invoke-static {v7, v5, v7, v6, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Lk/a1;->b:[C

    aput-char v10, v1, v9

    aput-char v3, v1, v12

    add-int/lit8 v7, v12, 0x1

    sget-object v12, Lm/e;->i:[C

    aget-char v12, v12, v13

    aput-char v12, v1, v7

    add-int/lit8 v11, v11, 0x2

    iget v12, v0, Lk/a1;->c:I

    add-int/lit8 v12, v12, -0x2

    aput-char v10, v1, v12

    move v1, v7

    const/4 v7, 0x1

    goto :goto_5

    :cond_e
    add-int/lit8 v8, v8, 0x1

    array-length v12, v12

    if-le v8, v12, :cond_f

    invoke-virtual {v0, v8}, Lk/a1;->e(I)V

    :cond_f
    iput v8, v0, Lk/a1;->c:I

    iget-object v12, v0, Lk/a1;->b:[C

    add-int/lit8 v14, v1, 0x1

    add-int/lit8 v15, v1, 0x2

    sub-int v5, v11, v1

    invoke-static {v12, v14, v12, v15, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v5, v0, Lk/a1;->b:[C

    aput-char v3, v5, v1

    sget-object v1, Lm/e;->i:[C

    aget-char v1, v1, v13

    aput-char v1, v5, v14

    add-int/lit8 v11, v11, 0x1

    move v1, v14

    :cond_10
    :goto_5
    add-int/2addr v1, v6

    const/4 v5, 0x0

    goto :goto_4

    :cond_11
    iget-object v1, v0, Lk/a1;->b:[C

    sub-int/2addr v8, v6

    aput-char v4, v1, v8

    goto :goto_c

    :cond_12
    iget-boolean v2, v0, Lk/a1;->g:Z

    if-eqz v2, :cond_13

    goto :goto_a

    :cond_13
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_14

    const/4 v2, 0x1

    goto :goto_6

    :cond_14
    const/4 v2, 0x0

    :goto_6
    const/4 v5, 0x0

    :goto_7
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v7

    if-ge v5, v7, :cond_19

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x40

    if-ge v7, v8, :cond_15

    iget-wide v8, v0, Lk/a1;->r:J

    const-wide/16 v10, 0x1

    shl-long/2addr v10, v7

    and-long/2addr v8, v10

    const-wide/16 v10, 0x0

    cmp-long v12, v8, v10

    if-nez v12, :cond_16

    :cond_15
    if-ne v7, v3, :cond_17

    :cond_16
    const/4 v7, 0x1

    goto :goto_8

    :cond_17
    const/4 v7, 0x0

    :goto_8
    if-eqz v7, :cond_18

    goto :goto_9

    :cond_18
    add-int/lit8 v5, v5, 0x1

    goto :goto_7

    :cond_19
    move v6, v2

    :goto_9
    if-eqz v6, :cond_1a

    :goto_a
    invoke-virtual {v0, v1, v4}, Lk/a1;->K(Ljava/lang/String;C)V

    goto :goto_c

    :cond_1a
    invoke-virtual/range {p0 .. p1}, Lk/a1;->write(Ljava/lang/String;)V

    :goto_b
    invoke-virtual {v0, v4}, Lk/a1;->write(I)V

    :goto_c
    return-void
.end method

.method public final r(CLjava/lang/String;I)V
    .locals 5

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_4

    iget-boolean v0, p0, Lk/a1;->g:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    if-gez p3, :cond_1

    neg-int v0, p3

    invoke-static {v0}, Lm/e;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p3}, Lm/e;->e(I)I

    move-result v0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lk/a1;->c:I

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v0

    iget-object v0, p0, Lk/a1;->b:[C

    array-length v0, v0

    if-le v2, v0, :cond_3

    iget-object v0, p0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    invoke-virtual {p0, p2}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lk/a1;->z(I)V

    return-void

    :cond_2
    invoke-virtual {p0, v2}, Lk/a1;->e(I)V

    :cond_3
    iget v0, p0, Lk/a1;->c:I

    iput v2, p0, Lk/a1;->c:I

    iget-object v2, p0, Lk/a1;->b:[C

    aput-char p1, v2, v0

    add-int p1, v0, v1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v3, v0, 0x1

    iget-char v4, p0, Lk/a1;->o:C

    aput-char v4, v2, v3

    add-int/lit8 v0, v0, 0x2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v1, v2, v0}, Ljava/lang/String;->getChars(II[CI)V

    iget-object p2, p0, Lk/a1;->b:[C

    add-int/lit8 v0, p1, 0x1

    iget-char v1, p0, Lk/a1;->o:C

    aput-char v1, p2, v0

    add-int/lit8 p1, p1, 0x2

    const/16 v0, 0x3a

    aput-char v0, p2, p1

    iget p1, p0, Lk/a1;->c:I

    invoke-static {p3, p1, p2}, Lm/e;->b(II[C)V

    return-void

    :cond_4
    :goto_1
    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    invoke-virtual {p0, p2}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lk/a1;->z(I)V

    return-void
.end method

.method public final s(CLjava/lang/String;J)V
    .locals 5

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v2, p3, v0

    if-eqz v2, :cond_4

    iget-boolean v0, p0, Lk/a1;->g:Z

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-gez v2, :cond_1

    neg-long v0, p3

    invoke-static {v0, v1}, Lm/e;->f(J)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p3, p4}, Lm/e;->f(J)I

    move-result v0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    iget v2, p0, Lk/a1;->c:I

    add-int/2addr v2, v1

    add-int/lit8 v2, v2, 0x4

    add-int/2addr v2, v0

    iget-object v0, p0, Lk/a1;->b:[C

    array-length v0, v0

    if-le v2, v0, :cond_3

    iget-object v0, p0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    invoke-virtual {p0, p2}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p3, p4}, Lk/a1;->A(J)V

    return-void

    :cond_2
    invoke-virtual {p0, v2}, Lk/a1;->e(I)V

    :cond_3
    iget v0, p0, Lk/a1;->c:I

    iput v2, p0, Lk/a1;->c:I

    iget-object v2, p0, Lk/a1;->b:[C

    aput-char p1, v2, v0

    add-int p1, v0, v1

    add-int/lit8 p1, p1, 0x1

    add-int/lit8 v3, v0, 0x1

    iget-char v4, p0, Lk/a1;->o:C

    aput-char v4, v2, v3

    add-int/lit8 v0, v0, 0x2

    const/4 v3, 0x0

    invoke-virtual {p2, v3, v1, v2, v0}, Ljava/lang/String;->getChars(II[CI)V

    iget-object p2, p0, Lk/a1;->b:[C

    add-int/lit8 v0, p1, 0x1

    iget-char v1, p0, Lk/a1;->o:C

    aput-char v1, p2, v0

    add-int/lit8 p1, p1, 0x2

    const/16 v0, 0x3a

    aput-char v0, p2, p1

    iget p1, p0, Lk/a1;->c:I

    invoke-static {p3, p4, p1, p2}, Lm/e;->c(JI[C)V

    return-void

    :cond_4
    :goto_1
    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    invoke-virtual {p0, p2}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual {p0, p3, p4}, Lk/a1;->A(J)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lk/a1;->b:[C

    iget v2, p0, Lk/a1;->c:I

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method public final w(CLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lk/a1;->g:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lk/a1;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    invoke-virtual {p0, p2}, Lk/a1;->q(Ljava/lang/String;)V

    if-nez p3, :cond_3

    goto :goto_0

    :cond_0
    sget-object v0, Lk/b1;->s:Lk/b1;

    invoke-virtual {p0, v0}, Lk/a1;->l(Lk/b1;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    const/16 p1, 0x3a

    invoke-virtual {p0, p2, p1}, Lk/a1;->K(Ljava/lang/String;C)V

    const/4 p1, 0x0

    invoke-virtual {p0, p3, p1}, Lk/a1;->K(Ljava/lang/String;C)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lk/a1;->x(CLjava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1}, Lk/a1;->write(I)V

    invoke-virtual {p0, p2}, Lk/a1;->q(Ljava/lang/String;)V

    if-nez p3, :cond_3

    :goto_0
    invoke-virtual {p0}, Lk/a1;->E()V

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p3}, Lk/a1;->J(Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public final write(I)V
    .locals 3

    iget v0, p0, Lk/a1;->c:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, Lk/a1;->b:[C

    array-length v2, v2

    if-le v0, v2, :cond_1

    iget-object v2, p0, Lk/a1;->e:Ljava/io/Writer;

    if-nez v2, :cond_0

    invoke-virtual {p0, v0}, Lk/a1;->e(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lk/a1;->flush()V

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v0

    :goto_1
    iget-object v0, p0, Lk/a1;->b:[C

    iget v2, p0, Lk/a1;->c:I

    int-to-char p1, p1

    aput-char p1, v0, v2

    iput v1, p0, Lk/a1;->c:I

    return-void
.end method

.method public final write(Ljava/lang/String;)V
    .locals 2

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lk/a1;->E()V

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Lk/a1;->write(Ljava/lang/String;II)V

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 4

    iget v0, p0, Lk/a1;->c:I

    add-int/2addr v0, p3

    iget-object v1, p0, Lk/a1;->b:[C

    array-length v1, v1

    if-le v0, v1, :cond_2

    iget-object v1, p0, Lk/a1;->e:Ljava/io/Writer;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lk/a1;->e(I)V

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lk/a1;->b:[C

    array-length v1, v0

    iget v2, p0, Lk/a1;->c:I

    sub-int/2addr v1, v2

    add-int v3, p2, v1

    invoke-virtual {p1, p2, v3, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    iget-object p2, p0, Lk/a1;->b:[C

    array-length p2, p2

    iput p2, p0, Lk/a1;->c:I

    invoke-virtual {p0}, Lk/a1;->flush()V

    sub-int/2addr p3, v1

    iget-object p2, p0, Lk/a1;->b:[C

    array-length p2, p2

    if-gt p3, p2, :cond_1

    move v0, p3

    move p2, v3

    goto :goto_1

    :cond_1
    move p2, v3

    goto :goto_0

    :cond_2
    :goto_1
    add-int/2addr p3, p2

    iget-object v1, p0, Lk/a1;->b:[C

    iget v2, p0, Lk/a1;->c:I

    invoke-virtual {p1, p2, p3, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    iput v0, p0, Lk/a1;->c:I

    return-void
.end method

.method public final write([CII)V
    .locals 3

    if-ltz p2, :cond_3

    array-length v0, p1

    if-gt p2, v0, :cond_3

    if-ltz p3, :cond_3

    add-int v0, p2, p3

    array-length v1, p1

    if-gt v0, v1, :cond_3

    if-ltz v0, :cond_3

    if-nez p3, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lk/a1;->c:I

    add-int/2addr v0, p3

    iget-object v1, p0, Lk/a1;->b:[C

    array-length v1, v1

    if-le v0, v1, :cond_2

    iget-object v1, p0, Lk/a1;->e:Ljava/io/Writer;

    if-nez v1, :cond_1

    invoke-virtual {p0, v0}, Lk/a1;->e(I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lk/a1;->b:[C

    array-length v1, v0

    iget v2, p0, Lk/a1;->c:I

    sub-int/2addr v1, v2

    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lk/a1;->b:[C

    array-length v0, v0

    iput v0, p0, Lk/a1;->c:I

    invoke-virtual {p0}, Lk/a1;->flush()V

    sub-int/2addr p3, v1

    add-int/2addr p2, v1

    iget-object v0, p0, Lk/a1;->b:[C

    array-length v0, v0

    if-gt p3, v0, :cond_1

    move v0, p3

    :cond_2
    :goto_0
    iget-object v1, p0, Lk/a1;->b:[C

    iget v2, p0, Lk/a1;->c:I

    invoke-static {p1, p2, v1, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v0, p0, Lk/a1;->c:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final x(CLjava/lang/String;Ljava/lang/String;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v3

    iget v4, v0, Lk/a1;->c:I

    if-nez v2, :cond_0

    add-int/lit8 v6, v3, 0x8

    add-int/2addr v6, v4

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v6

    add-int v7, v3, v6

    add-int/lit8 v7, v7, 0x6

    add-int/2addr v4, v7

    move/from16 v20, v6

    move v6, v4

    move/from16 v4, v20

    :goto_0
    iget-object v7, v0, Lk/a1;->b:[C

    array-length v7, v7

    const/16 v8, 0x3a

    const/4 v9, 0x0

    if-le v6, v7, :cond_2

    iget-object v7, v0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v7, :cond_1

    invoke-virtual/range {p0 .. p1}, Lk/a1;->write(I)V

    invoke-virtual {v0, v1, v8}, Lk/a1;->K(Ljava/lang/String;C)V

    invoke-virtual {v0, v2, v9}, Lk/a1;->K(Ljava/lang/String;C)V

    return-void

    :cond_1
    invoke-virtual {v0, v6}, Lk/a1;->e(I)V

    :cond_2
    iget-object v7, v0, Lk/a1;->b:[C

    iget v10, v0, Lk/a1;->c:I

    aput-char p1, v7, v10

    add-int/lit8 v11, v10, 0x2

    add-int v12, v11, v3

    const/4 v13, 0x1

    add-int/2addr v10, v13

    const/16 v14, 0x22

    aput-char v14, v7, v10

    invoke-virtual {v1, v9, v3, v7, v11}, Ljava/lang/String;->getChars(II[CI)V

    iput v6, v0, Lk/a1;->c:I

    iget-object v1, v0, Lk/a1;->b:[C

    aput-char v14, v1, v12

    add-int/2addr v12, v13

    add-int/lit8 v3, v12, 0x1

    aput-char v8, v1, v12

    const/16 v7, 0x75

    if-nez v2, :cond_3

    add-int/lit8 v2, v3, 0x1

    const/16 v4, 0x6e

    aput-char v4, v1, v3

    add-int/lit8 v3, v2, 0x1

    aput-char v7, v1, v2

    add-int/lit8 v2, v3, 0x1

    const/16 v4, 0x6c

    aput-char v4, v1, v3

    aput-char v4, v1, v2

    return-void

    :cond_3
    add-int/lit8 v8, v3, 0x1

    aput-char v14, v1, v3

    add-int v3, v8, v4

    invoke-virtual {v2, v9, v4, v1, v8}, Ljava/lang/String;->getChars(II[CI)V

    const/4 v1, -0x1

    move v4, v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, -0x1

    const/4 v15, -0x1

    :goto_1
    const/16 v5, 0x2029

    const/16 v9, 0x2028

    const/16 v14, 0x5c

    if-ge v4, v3, :cond_f

    iget-object v7, v0, Lk/a1;->b:[C

    aget-char v7, v7, v4

    const/16 v13, 0x5d

    if-lt v7, v13, :cond_7

    const/16 v13, 0x7f

    if-lt v7, v13, :cond_e

    if-eq v7, v9, :cond_4

    if-eq v7, v5, :cond_4

    const/16 v5, 0xa0

    if-ge v7, v5, :cond_e

    :cond_4
    if-ne v12, v1, :cond_5

    move v12, v4

    :cond_5
    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v6, v6, 0x4

    :cond_6
    move v15, v4

    :goto_2
    move v11, v7

    goto :goto_4

    :cond_7
    const/16 v5, 0x40

    if-ge v7, v5, :cond_8

    iget-wide v1, v0, Lk/a1;->r:J

    const-wide/16 v18, 0x1

    shl-long v18, v18, v7

    and-long v1, v1, v18

    const-wide/16 v18, 0x0

    cmp-long v5, v1, v18

    if-nez v5, :cond_9

    :cond_8
    if-ne v7, v14, :cond_a

    :cond_9
    const/4 v1, 0x1

    goto :goto_3

    :cond_a
    const/4 v1, 0x0

    :goto_3
    if-eqz v1, :cond_d

    add-int/lit8 v10, v10, 0x1

    const/16 v1, 0x28

    if-eq v7, v1, :cond_b

    const/16 v1, 0x29

    if-eq v7, v1, :cond_b

    const/16 v1, 0x3c

    if-eq v7, v1, :cond_b

    const/16 v1, 0x3e

    if-eq v7, v1, :cond_b

    sget-object v1, Lm/e;->e:[B

    array-length v2, v1

    if-ge v7, v2, :cond_c

    aget-byte v1, v1, v7

    const/4 v2, 0x4

    if-ne v1, v2, :cond_c

    :cond_b
    add-int/lit8 v6, v6, 0x4

    :cond_c
    const/4 v1, -0x1

    if-ne v12, v1, :cond_6

    move v12, v4

    move v15, v12

    goto :goto_2

    :cond_d
    const/4 v1, -0x1

    :cond_e
    :goto_4
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v2, p3

    const/16 v7, 0x75

    const/4 v13, 0x1

    const/16 v14, 0x22

    goto :goto_1

    :cond_f
    if-lez v10, :cond_21

    add-int/2addr v6, v10

    iget-object v1, v0, Lk/a1;->b:[C

    array-length v1, v1

    if-le v6, v1, :cond_10

    invoke-virtual {v0, v6}, Lk/a1;->e(I)V

    :cond_10
    iput v6, v0, Lk/a1;->c:I

    const/4 v1, 0x1

    if-ne v10, v1, :cond_16

    const/16 v2, 0x30

    const/16 v4, 0x32

    if-ne v11, v9, :cond_11

    add-int/lit8 v5, v15, 0x1

    add-int/lit8 v6, v15, 0x6

    sub-int/2addr v3, v15

    sub-int/2addr v3, v1

    iget-object v7, v0, Lk/a1;->b:[C

    invoke-static {v7, v5, v7, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Lk/a1;->b:[C

    aput-char v14, v3, v15

    const/16 v6, 0x75

    aput-char v6, v3, v5

    add-int/2addr v5, v1

    aput-char v4, v3, v5

    add-int/2addr v5, v1

    aput-char v2, v3, v5

    add-int/2addr v5, v1

    aput-char v4, v3, v5

    add-int/2addr v5, v1

    const/16 v2, 0x38

    aput-char v2, v3, v5

    goto/16 :goto_c

    :cond_11
    if-ne v11, v5, :cond_12

    add-int/lit8 v5, v15, 0x1

    add-int/lit8 v6, v15, 0x6

    sub-int/2addr v3, v15

    sub-int/2addr v3, v1

    iget-object v7, v0, Lk/a1;->b:[C

    invoke-static {v7, v5, v7, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v0, Lk/a1;->b:[C

    aput-char v14, v3, v15

    const/16 v6, 0x75

    aput-char v6, v3, v5

    add-int/2addr v5, v1

    aput-char v4, v3, v5

    add-int/2addr v5, v1

    aput-char v2, v3, v5

    add-int/2addr v5, v1

    aput-char v4, v3, v5

    add-int/2addr v5, v1

    const/16 v1, 0x39

    aput-char v1, v3, v5

    goto/16 :goto_c

    :cond_12
    const/16 v1, 0x28

    if-eq v11, v1, :cond_15

    const/16 v1, 0x29

    if-eq v11, v1, :cond_15

    const/16 v1, 0x3c

    if-eq v11, v1, :cond_15

    const/16 v1, 0x3e

    if-ne v11, v1, :cond_13

    goto :goto_5

    :cond_13
    sget-object v1, Lm/e;->e:[B

    array-length v2, v1

    if-ge v11, v2, :cond_14

    aget-byte v1, v1, v11

    const/4 v2, 0x4

    if-ne v1, v2, :cond_14

    add-int/lit8 v1, v15, 0x1

    add-int/lit8 v2, v15, 0x6

    sub-int/2addr v3, v15

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    iget-object v4, v0, Lk/a1;->b:[C

    invoke-static {v4, v1, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, v0, Lk/a1;->b:[C

    aput-char v14, v2, v15

    add-int/lit8 v3, v1, 0x1

    const/16 v4, 0x75

    aput-char v4, v2, v1

    add-int/lit8 v1, v3, 0x1

    sget-object v4, Lm/e;->b:[C

    ushr-int/lit8 v5, v11, 0xc

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    aput-char v5, v2, v3

    add-int/lit8 v3, v1, 0x1

    ushr-int/lit8 v5, v11, 0x8

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    aput-char v5, v2, v1

    add-int/lit8 v1, v3, 0x1

    ushr-int/lit8 v5, v11, 0x4

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    aput-char v5, v2, v3

    and-int/lit8 v3, v11, 0xf

    aget-char v3, v4, v3

    aput-char v3, v2, v1

    goto/16 :goto_c

    :cond_14
    add-int/lit8 v1, v15, 0x1

    add-int/lit8 v2, v15, 0x2

    sub-int/2addr v3, v15

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    iget-object v4, v0, Lk/a1;->b:[C

    invoke-static {v4, v1, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, v0, Lk/a1;->b:[C

    aput-char v14, v2, v15

    sget-object v3, Lm/e;->i:[C

    aget-char v3, v3, v11

    aput-char v3, v2, v1

    goto/16 :goto_c

    :cond_15
    :goto_5
    add-int/lit8 v1, v15, 0x1

    add-int/lit8 v2, v15, 0x6

    sub-int/2addr v3, v15

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    iget-object v4, v0, Lk/a1;->b:[C

    invoke-static {v4, v1, v4, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, v0, Lk/a1;->b:[C

    aput-char v14, v2, v15

    add-int/lit8 v3, v1, 0x1

    const/16 v4, 0x75

    aput-char v4, v2, v1

    add-int/lit8 v1, v3, 0x1

    sget-object v4, Lm/e;->b:[C

    ushr-int/lit8 v5, v11, 0xc

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    aput-char v5, v2, v3

    add-int/lit8 v3, v1, 0x1

    ushr-int/lit8 v5, v11, 0x8

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    aput-char v5, v2, v1

    add-int/lit8 v1, v3, 0x1

    ushr-int/lit8 v5, v11, 0x4

    and-int/lit8 v5, v5, 0xf

    aget-char v5, v4, v5

    aput-char v5, v2, v3

    and-int/lit8 v3, v11, 0xf

    aget-char v3, v4, v3

    aput-char v3, v2, v1

    goto/16 :goto_c

    :cond_16
    if-le v10, v1, :cond_21

    sub-int v1, v12, v8

    :goto_6
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_21

    move-object/from16 v2, p3

    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    iget-boolean v4, v0, Lk/a1;->q:Z

    if-eqz v4, :cond_19

    const/16 v4, 0x28

    const/16 v6, 0x29

    const/16 v7, 0x3c

    if-eq v3, v4, :cond_17

    if-eq v3, v6, :cond_17

    const/16 v8, 0x3e

    if-eq v3, v7, :cond_18

    if-ne v3, v8, :cond_1a

    goto :goto_7

    :cond_17
    const/16 v8, 0x3e

    :cond_18
    :goto_7
    iget-object v10, v0, Lk/a1;->b:[C

    add-int/lit8 v11, v12, 0x1

    aput-char v14, v10, v12

    add-int/lit8 v12, v11, 0x1

    const/16 v13, 0x75

    aput-char v13, v10, v11

    add-int/lit8 v11, v12, 0x1

    sget-object v13, Lm/e;->b:[C

    ushr-int/lit8 v15, v3, 0xc

    and-int/lit8 v15, v15, 0xf

    aget-char v15, v13, v15

    aput-char v15, v10, v12

    add-int/lit8 v12, v11, 0x1

    ushr-int/lit8 v15, v3, 0x8

    and-int/lit8 v15, v15, 0xf

    aget-char v15, v13, v15

    aput-char v15, v10, v11

    add-int/lit8 v11, v12, 0x1

    ushr-int/lit8 v15, v3, 0x4

    and-int/lit8 v15, v15, 0xf

    aget-char v15, v13, v15

    aput-char v15, v10, v12

    add-int/lit8 v12, v11, 0x1

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v13, v3

    aput-char v3, v10, v11

    const/16 v13, 0x75

    const/4 v15, 0x4

    goto/16 :goto_b

    :cond_19
    const/16 v4, 0x28

    const/16 v6, 0x29

    const/16 v7, 0x3c

    const/16 v8, 0x3e

    :cond_1a
    sget-object v10, Lm/e;->e:[B

    array-length v11, v10

    if-ge v3, v11, :cond_1b

    aget-byte v11, v10, v3

    if-nez v11, :cond_1c

    :cond_1b
    const/16 v11, 0x2f

    if-ne v3, v11, :cond_1e

    sget-object v11, Lk/b1;->r:Lk/b1;

    invoke-virtual {v0, v11}, Lk/a1;->l(Lk/b1;)Z

    move-result v11

    if-eqz v11, :cond_1e

    :cond_1c
    iget-object v11, v0, Lk/a1;->b:[C

    add-int/lit8 v13, v12, 0x1

    aput-char v14, v11, v12

    aget-byte v10, v10, v3

    const/4 v15, 0x4

    if-ne v10, v15, :cond_1d

    add-int/lit8 v10, v13, 0x1

    const/16 v12, 0x75

    aput-char v12, v11, v13

    add-int/lit8 v12, v10, 0x1

    sget-object v13, Lm/e;->b:[C

    ushr-int/lit8 v16, v3, 0xc

    and-int/lit8 v16, v16, 0xf

    aget-char v16, v13, v16

    aput-char v16, v11, v10

    add-int/lit8 v10, v12, 0x1

    ushr-int/lit8 v16, v3, 0x8

    and-int/lit8 v16, v16, 0xf

    aget-char v16, v13, v16

    aput-char v16, v11, v12

    add-int/lit8 v12, v10, 0x1

    ushr-int/lit8 v16, v3, 0x4

    and-int/lit8 v16, v16, 0xf

    aget-char v16, v13, v16

    aput-char v16, v11, v10

    add-int/lit8 v10, v12, 0x1

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v13, v3

    aput-char v3, v11, v12

    goto :goto_8

    :cond_1d
    add-int/lit8 v10, v13, 0x1

    sget-object v12, Lm/e;->i:[C

    aget-char v3, v12, v3

    aput-char v3, v11, v13

    :goto_8
    move v12, v10

    :goto_9
    const/16 v13, 0x75

    goto :goto_b

    :cond_1e
    const/4 v15, 0x4

    if-eq v3, v9, :cond_20

    if-ne v3, v5, :cond_1f

    goto :goto_a

    :cond_1f
    iget-object v10, v0, Lk/a1;->b:[C

    add-int/lit8 v11, v12, 0x1

    aput-char v3, v10, v12

    move v12, v11

    goto :goto_9

    :cond_20
    :goto_a
    iget-object v10, v0, Lk/a1;->b:[C

    add-int/lit8 v11, v12, 0x1

    aput-char v14, v10, v12

    add-int/lit8 v12, v11, 0x1

    const/16 v13, 0x75

    aput-char v13, v10, v11

    add-int/lit8 v11, v12, 0x1

    sget-object v16, Lm/e;->b:[C

    ushr-int/lit8 v17, v3, 0xc

    and-int/lit8 v17, v17, 0xf

    aget-char v17, v16, v17

    aput-char v17, v10, v12

    add-int/lit8 v12, v11, 0x1

    ushr-int/lit8 v17, v3, 0x8

    and-int/lit8 v17, v17, 0xf

    aget-char v17, v16, v17

    aput-char v17, v10, v11

    add-int/lit8 v11, v12, 0x1

    ushr-int/lit8 v17, v3, 0x4

    and-int/lit8 v17, v17, 0xf

    aget-char v17, v16, v17

    aput-char v17, v10, v12

    add-int/lit8 v12, v11, 0x1

    and-int/lit8 v3, v3, 0xf

    aget-char v3, v16, v3

    aput-char v3, v10, v11

    :goto_b
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_6

    :cond_21
    :goto_c
    iget-object v1, v0, Lk/a1;->b:[C

    iget v2, v0, Lk/a1;->c:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/16 v3, 0x22

    aput-char v3, v1, v2

    return-void
.end method

.method public final y([B)V
    .locals 11

    iget v0, p0, Lk/a1;->c:I

    array-length v1, p1

    const/4 v2, 0x2

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v0

    add-int/lit8 v1, v1, 0x3

    iget-object v0, p0, Lk/a1;->b:[C

    array-length v0, v0

    const/16 v3, 0x78

    const/4 v4, 0x0

    const/16 v5, 0x30

    const/16 v6, 0x37

    const/16 v7, 0xa

    const/16 v8, 0x27

    if-le v1, v0, :cond_4

    iget-object v0, p0, Lk/a1;->e:Ljava/io/Writer;

    if-eqz v0, :cond_3

    array-length v0, p1

    add-int/lit8 v0, v0, 0x3

    new-array v0, v0, [C

    aput-char v3, v0, v4

    const/4 v1, 0x1

    aput-char v8, v0, v1

    :goto_0
    array-length v1, p1

    if-ge v4, v1, :cond_2

    aget-byte v1, p1, v4

    and-int/lit16 v1, v1, 0xff

    shr-int/lit8 v3, v1, 0x4

    and-int/lit8 v1, v1, 0xf

    add-int/lit8 v9, v2, 0x1

    if-ge v3, v7, :cond_0

    const/16 v10, 0x30

    goto :goto_1

    :cond_0
    const/16 v10, 0x37

    :goto_1
    add-int/2addr v3, v10

    int-to-char v3, v3

    aput-char v3, v0, v2

    add-int/lit8 v2, v9, 0x1

    if-ge v1, v7, :cond_1

    const/16 v3, 0x30

    goto :goto_2

    :cond_1
    const/16 v3, 0x37

    :goto_2
    add-int/2addr v1, v3

    int-to-char v1, v1

    aput-char v1, v0, v9

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    aput-char v8, v0, v2

    :try_start_0
    iget-object p1, p0, Lk/a1;->e:Ljava/io/Writer;

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write([C)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lf/d;

    const-string v1, "writeBytes error."

    invoke-direct {v0, v1, p1}, Lf/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_3
    invoke-virtual {p0, v1}, Lk/a1;->e(I)V

    :cond_4
    iget-object v0, p0, Lk/a1;->b:[C

    iget v1, p0, Lk/a1;->c:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lk/a1;->c:I

    aput-char v3, v0, v1

    add-int/lit8 v1, v2, 0x1

    iput v1, p0, Lk/a1;->c:I

    aput-char v8, v0, v2

    :goto_3
    array-length v0, p1

    if-ge v4, v0, :cond_7

    aget-byte v0, p1, v4

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, v0, 0x4

    and-int/lit8 v0, v0, 0xf

    iget-object v2, p0, Lk/a1;->b:[C

    iget v3, p0, Lk/a1;->c:I

    add-int/lit8 v9, v3, 0x1

    iput v9, p0, Lk/a1;->c:I

    if-ge v1, v7, :cond_5

    const/16 v10, 0x30

    goto :goto_4

    :cond_5
    const/16 v10, 0x37

    :goto_4
    add-int/2addr v1, v10

    int-to-char v1, v1

    aput-char v1, v2, v3

    add-int/lit8 v1, v9, 0x1

    iput v1, p0, Lk/a1;->c:I

    if-ge v0, v7, :cond_6

    const/16 v1, 0x30

    goto :goto_5

    :cond_6
    const/16 v1, 0x37

    :goto_5
    add-int/2addr v0, v1

    int-to-char v0, v0

    aput-char v0, v2, v9

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lk/a1;->b:[C

    iget v0, p0, Lk/a1;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lk/a1;->c:I

    aput-char v8, p1, v0

    return-void
.end method

.method public final z(I)V
    .locals 3

    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_0

    const-string p1, "-2147483648"

    invoke-virtual {p0, p1}, Lk/a1;->write(Ljava/lang/String;)V

    return-void

    :cond_0
    if-gez p1, :cond_1

    neg-int v0, p1

    invoke-static {v0}, Lm/e;->e(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lm/e;->e(I)I

    move-result v0

    :goto_0
    iget v1, p0, Lk/a1;->c:I

    add-int/2addr v1, v0

    iget-object v2, p0, Lk/a1;->b:[C

    array-length v2, v2

    if-le v1, v2, :cond_3

    iget-object v2, p0, Lk/a1;->e:Ljava/io/Writer;

    if-nez v2, :cond_2

    invoke-virtual {p0, v1}, Lk/a1;->e(I)V

    goto :goto_1

    :cond_2
    new-array v1, v0, [C

    invoke-static {p1, v0, v1}, Lm/e;->b(II[C)V

    const/4 p1, 0x0

    invoke-virtual {p0, v1, p1, v0}, Lk/a1;->write([CII)V

    return-void

    :cond_3
    :goto_1
    iget-object v0, p0, Lk/a1;->b:[C

    invoke-static {p1, v1, v0}, Lm/e;->b(II[C)V

    iput v1, p0, Lk/a1;->c:I

    return-void
.end method
