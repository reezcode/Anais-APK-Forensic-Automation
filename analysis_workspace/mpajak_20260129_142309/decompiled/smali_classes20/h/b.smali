.class public final Lh/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:[B

.field public final b:[I

.field public final c:[Ljava/lang/String;

.field public final d:I

.field public final e:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x400

    new-array v1, v1, [B

    :cond_0
    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_6

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    iput-object p1, p0, Lh/b;->a:[B

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Lh/b;->d(I)I

    move-result p1

    new-array v0, p1, [I

    iput-object v0, p0, Lh/b;->b:[I

    new-array v0, p1, [Ljava/lang/String;

    iput-object v0, p0, Lh/b;->c:[Ljava/lang/String;

    const/16 v0, 0xa

    const/4 v1, 0x1

    const/4 v2, 0x1

    :goto_1
    if-ge v2, p1, :cond_5

    iget-object v3, p0, Lh/b;->b:[I

    add-int/lit8 v5, v0, 0x1

    aput v5, v3, v2

    iget-object v3, p0, Lh/b;->a:[B

    aget-byte v3, v3, v0

    const/4 v6, 0x5

    const/4 v7, 0x4

    const/4 v8, 0x3

    if-eq v3, v1, :cond_3

    const/16 v5, 0xf

    if-eq v3, v5, :cond_2

    const/16 v5, 0x12

    if-eq v3, v5, :cond_4

    if-eq v3, v8, :cond_4

    if-eq v3, v7, :cond_4

    if-eq v3, v6, :cond_1

    const/4 v5, 0x6

    if-eq v3, v5, :cond_1

    packed-switch v3, :pswitch_data_0

    const/4 v6, 0x3

    goto :goto_2

    :cond_1
    const/16 v6, 0x9

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x4

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v5}, Lh/b;->d(I)I

    move-result v3

    add-int/lit8 v6, v3, 0x3

    if-le v6, v4, :cond_4

    move v4, v6

    :cond_4
    :goto_2
    :pswitch_0
    add-int/2addr v0, v6

    add-int/2addr v2, v1

    goto :goto_1

    :cond_5
    iput v4, p0, Lh/b;->d:I

    iput v0, p0, Lh/b;->e:I

    return-void

    :cond_6
    if-lez v2, :cond_0

    invoke-virtual {v0, v1, v4, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lh/j;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lh/b;->d:I

    new-array v2, v2, [C

    iget v3, v0, Lh/b;->e:I

    iget-object v4, v0, Lh/b;->b:[I

    add-int/lit8 v5, v3, 0x4

    invoke-virtual {v0, v5}, Lh/b;->d(I)I

    move-result v5

    aget v4, v4, v5

    add-int/lit8 v4, v3, 0x6

    invoke-virtual {v0, v4}, Lh/b;->d(I)I

    move-result v4

    add-int/lit8 v3, v3, 0x8

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    add-int/lit8 v3, v3, 0x2

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v3}, Lh/b;->d(I)I

    move-result v4

    add-int/lit8 v5, v3, 0x2

    move v6, v5

    :goto_1
    if-lez v4, :cond_2

    add-int/lit8 v7, v6, 0x6

    invoke-virtual {v0, v7}, Lh/b;->d(I)I

    move-result v7

    add-int/lit8 v6, v6, 0x8

    :goto_2
    if-lez v7, :cond_1

    add-int/lit8 v8, v6, 0x2

    invoke-virtual {v0, v8}, Lh/b;->b(I)I

    move-result v8

    add-int/lit8 v8, v8, 0x6

    add-int/2addr v6, v8

    add-int/lit8 v7, v7, -0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v0, v6}, Lh/b;->d(I)I

    move-result v4

    add-int/lit8 v6, v6, 0x2

    :goto_3
    if-lez v4, :cond_4

    add-int/lit8 v7, v6, 0x6

    invoke-virtual {v0, v7}, Lh/b;->d(I)I

    move-result v7

    add-int/lit8 v6, v6, 0x8

    :goto_4
    if-lez v7, :cond_3

    add-int/lit8 v8, v6, 0x2

    invoke-virtual {v0, v8}, Lh/b;->b(I)I

    move-result v8

    add-int/lit8 v8, v8, 0x6

    add-int/2addr v6, v8

    add-int/lit8 v7, v7, -0x1

    goto :goto_4

    :cond_3
    add-int/lit8 v4, v4, -0x1

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v6}, Lh/b;->d(I)I

    move-result v4

    add-int/lit8 v6, v6, 0x2

    :goto_5
    if-lez v4, :cond_5

    add-int/lit8 v7, v6, 0x2

    invoke-virtual {v0, v7}, Lh/b;->b(I)I

    move-result v7

    add-int/lit8 v7, v7, 0x6

    add-int/2addr v6, v7

    add-int/lit8 v4, v4, -0x1

    goto :goto_5

    :cond_5
    invoke-virtual {v0, v3}, Lh/b;->d(I)I

    move-result v3

    :goto_6
    if-lez v3, :cond_7

    add-int/lit8 v4, v5, 0x6

    invoke-virtual {v0, v4}, Lh/b;->d(I)I

    move-result v4

    add-int/lit8 v5, v5, 0x8

    :goto_7
    if-lez v4, :cond_6

    add-int/lit8 v6, v5, 0x2

    invoke-virtual {v0, v6}, Lh/b;->b(I)I

    move-result v6

    add-int/lit8 v6, v6, 0x6

    add-int/2addr v5, v6

    add-int/lit8 v4, v4, -0x1

    goto :goto_7

    :cond_6
    add-int/lit8 v3, v3, -0x1

    goto :goto_6

    :cond_7
    invoke-virtual {v0, v5}, Lh/b;->d(I)I

    move-result v3

    add-int/lit8 v5, v5, 0x2

    :goto_8
    if-lez v3, :cond_23

    invoke-virtual {v0, v5}, Lh/b;->d(I)I

    move-result v4

    add-int/lit8 v6, v5, 0x2

    invoke-virtual {v0, v6, v2}, Lh/b;->c(I[C)Ljava/lang/String;

    move-result-object v6

    add-int/lit8 v7, v5, 0x4

    invoke-virtual {v0, v7, v2}, Lh/b;->c(I[C)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v8, v5, 0x6

    invoke-virtual {v0, v8}, Lh/b;->d(I)I

    move-result v8

    add-int/lit8 v5, v5, 0x8

    const/4 v9, 0x0

    :goto_9
    if-lez v8, :cond_9

    invoke-virtual {v0, v5, v2}, Lh/b;->c(I[C)Ljava/lang/String;

    move-result-object v10

    add-int/lit8 v11, v5, 0x2

    invoke-virtual {v0, v11}, Lh/b;->b(I)I

    move-result v11

    add-int/lit8 v5, v5, 0x6

    const-string v12, "Code"

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move v9, v5

    :cond_8
    add-int/2addr v5, v11

    add-int/lit8 v8, v8, -0x1

    goto :goto_9

    :cond_9
    iget-object v8, v1, Lh/j;->c:Lh/g;

    const/16 v10, 0xa

    if-eqz v8, :cond_a

    goto :goto_e

    :cond_a
    iget-object v8, v1, Lh/j;->a:Ljava/lang/String;

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_e

    :cond_b
    invoke-virtual {v7}, Ljava/lang/String;->toCharArray()[C

    move-result-object v6

    const/4 v7, 0x1

    const/4 v8, 0x0

    :goto_a
    add-int/lit8 v11, v7, 0x1

    aget-char v7, v6, v7

    const/16 v12, 0x29

    if-ne v7, v12, :cond_1f

    new-array v7, v8, [Lh/i;

    const/4 v11, 0x1

    const/4 v13, 0x0

    :goto_b
    aget-char v14, v6, v11

    if-eq v14, v12, :cond_d

    invoke-static {v6, v11}, Lh/i;->c([CI)Lh/i;

    move-result-object v12

    aput-object v12, v7, v13

    aget-object v12, v7, v13

    iget v12, v12, Lh/i;->d:I

    aget-object v14, v7, v13

    iget v14, v14, Lh/i;->a:I

    if-ne v14, v10, :cond_c

    const/4 v14, 0x2

    goto :goto_c

    :cond_c
    const/4 v14, 0x0

    :goto_c
    add-int/2addr v12, v14

    add-int/2addr v11, v12

    add-int/lit8 v13, v13, 0x1

    const/16 v12, 0x29

    goto :goto_b

    :cond_d
    const/4 v6, 0x0

    const/4 v10, 0x0

    :goto_d
    if-ge v6, v8, :cond_10

    aget-object v11, v7, v6

    invoke-virtual {v11}, Lh/i;->a()Ljava/lang/String;

    move-result-object v11

    const-string v12, "long"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    const-string v12, "double"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_f

    :cond_e
    add-int/lit8 v10, v10, 0x1

    :cond_f
    add-int/lit8 v6, v6, 0x1

    goto :goto_d

    :cond_10
    iget-object v6, v1, Lh/j;->b:[Ljava/lang/Class;

    array-length v6, v6

    if-eq v8, v6, :cond_11

    :goto_e
    move/from16 v16, v5

    goto/16 :goto_12

    :cond_11
    const/4 v6, 0x0

    :goto_f
    if-ge v6, v8, :cond_16

    aget-object v11, v7, v6

    iget-object v12, v1, Lh/j;->b:[Ljava/lang/Class;

    aget-object v12, v12, v6

    invoke-virtual {v12}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lh/i;->a()Ljava/lang/String;

    move-result-object v11

    const-string v13, ""

    move-object v14, v13

    :goto_10
    const-string v15, "[]"

    invoke-virtual {v11, v15}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v15

    if-eqz v15, :cond_12

    const-string v15, "["

    invoke-static {v14, v15}, Landroidx/activity/d;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v15

    add-int/lit8 v15, v15, -0x2

    move/from16 v16, v5

    const/4 v5, 0x0

    invoke-virtual {v11, v5, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    move/from16 v5, v16

    goto :goto_10

    :cond_12
    move/from16 v16, v5

    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    sget-object v5, Lh/j;->d:Lh/j$a;

    invoke-virtual {v5, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-static {v14}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v5, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    goto :goto_11

    :cond_13
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "L"

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ";"

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    :cond_14
    :goto_11
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    :goto_12
    const/4 v4, 0x0

    goto :goto_13

    :cond_15
    add-int/lit8 v6, v6, 0x1

    move/from16 v5, v16

    goto :goto_f

    :cond_16
    move/from16 v16, v5

    new-instance v5, Lh/g;

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    add-int/2addr v8, v10

    invoke-direct {v5, v4, v8}, Lh/g;-><init>(II)V

    iput-object v5, v1, Lh/j;->c:Lh/g;

    move-object v4, v5

    :goto_13
    if-eqz v4, :cond_1e

    if-eqz v9, :cond_1e

    add-int/lit8 v5, v9, 0x4

    invoke-virtual {v0, v5}, Lh/b;->b(I)I

    move-result v5

    add-int/lit8 v9, v9, 0x8

    add-int/2addr v9, v5

    invoke-virtual {v0, v9}, Lh/b;->d(I)I

    move-result v5

    add-int/lit8 v9, v9, 0x2

    :goto_14
    if-lez v5, :cond_17

    add-int/lit8 v9, v9, 0x8

    add-int/lit8 v5, v5, -0x1

    goto :goto_14

    :cond_17
    invoke-virtual {v0, v9}, Lh/b;->d(I)I

    move-result v5

    add-int/lit8 v9, v9, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_15
    if-lez v5, :cond_1a

    invoke-virtual {v0, v9, v2}, Lh/b;->c(I[C)Ljava/lang/String;

    move-result-object v8

    const-string v10, "LocalVariableTable"

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_18

    add-int/lit8 v6, v9, 0x6

    goto :goto_16

    :cond_18
    const-string v10, "LocalVariableTypeTable"

    invoke-virtual {v8, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    add-int/lit8 v7, v9, 0x6

    :cond_19
    :goto_16
    add-int/lit8 v8, v9, 0x2

    invoke-virtual {v0, v8}, Lh/b;->b(I)I

    move-result v8

    add-int/lit8 v8, v8, 0x6

    add-int/2addr v9, v8

    add-int/lit8 v5, v5, -0x1

    goto :goto_15

    :cond_1a
    if-eqz v6, :cond_1e

    if-eqz v7, :cond_1b

    invoke-virtual {v0, v7}, Lh/b;->d(I)I

    move-result v5

    mul-int/lit8 v5, v5, 0x3

    add-int/lit8 v7, v7, 0x2

    new-array v8, v5, [I

    :goto_17
    if-lez v5, :cond_1b

    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v9, v7, 0x6

    aput v9, v8, v5

    add-int/lit8 v5, v5, -0x1

    add-int/lit8 v9, v7, 0x8

    invoke-virtual {v0, v9}, Lh/b;->d(I)I

    move-result v9

    aput v9, v8, v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v0, v7}, Lh/b;->d(I)I

    move-result v9

    aput v9, v8, v5

    add-int/lit8 v7, v7, 0xa

    goto :goto_17

    :cond_1b
    invoke-virtual {v0, v6}, Lh/b;->d(I)I

    move-result v5

    add-int/lit8 v6, v6, 0x2

    :goto_18
    if-lez v5, :cond_1e

    add-int/lit8 v7, v6, 0x8

    invoke-virtual {v0, v7}, Lh/b;->d(I)I

    move-result v7

    add-int/lit8 v8, v6, 0x4

    invoke-virtual {v0, v8, v2}, Lh/b;->c(I[C)Ljava/lang/String;

    move-result-object v8

    iget v9, v4, Lh/g;->b:I

    if-lt v7, v9, :cond_1d

    iget v10, v4, Lh/g;->a:I

    add-int/2addr v9, v10

    if-ge v7, v9, :cond_1d

    const-string v7, "arg"

    invoke-static {v7}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget v9, v4, Lh/g;->c:I

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v9, 0x1

    if-nez v7, :cond_1c

    iput-boolean v9, v4, Lh/g;->e:Z

    :cond_1c
    iget-object v7, v4, Lh/g;->d:Ljava/lang/StringBuffer;

    const/16 v10, 0x2c

    invoke-virtual {v7, v10}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    iget-object v7, v4, Lh/g;->d:Ljava/lang/StringBuffer;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v7, v4, Lh/g;->c:I

    add-int/2addr v7, v9

    iput v7, v4, Lh/g;->c:I

    :cond_1d
    add-int/lit8 v6, v6, 0xa

    add-int/lit8 v5, v5, -0x1

    goto :goto_18

    :cond_1e
    add-int/lit8 v3, v3, -0x1

    move/from16 v5, v16

    goto/16 :goto_8

    :cond_1f
    move/from16 v16, v5

    const/16 v5, 0x4c

    if-ne v7, v5, :cond_21

    :goto_19
    add-int/lit8 v5, v11, 0x1

    aget-char v7, v6, v11

    const/16 v11, 0x3b

    if-eq v7, v11, :cond_20

    move v11, v5

    goto :goto_19

    :cond_20
    add-int/lit8 v8, v8, 0x1

    move v7, v5

    goto :goto_1a

    :cond_21
    const/16 v5, 0x5b

    if-eq v7, v5, :cond_22

    add-int/lit8 v8, v8, 0x1

    :cond_22
    move v7, v11

    :goto_1a
    move/from16 v5, v16

    goto/16 :goto_a

    :cond_23
    return-void
.end method

.method public final b(I)I
    .locals 3

    iget-object v0, p0, Lh/b;->a:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v2, p1, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 v2, p1, 0x2

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 p1, p1, 0x3

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    return p1
.end method

.method public final c(I[C)Ljava/lang/String;
    .locals 12

    invoke-virtual {p0, p1}, Lh/b;->d(I)I

    move-result p1

    iget-object v0, p0, Lh/b;->c:[Ljava/lang/String;

    aget-object v1, v0, p1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Lh/b;->b:[I

    aget v1, v1, p1

    add-int/lit8 v2, v1, 0x2

    invoke-virtual {p0, v1}, Lh/b;->d(I)I

    move-result v1

    add-int/2addr v1, v2

    iget-object v3, p0, Lh/b;->a:[B

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v2, v1, :cond_6

    add-int/lit8 v8, v2, 0x1

    aget-byte v2, v3, v2

    const/4 v9, 0x2

    const/4 v10, 0x1

    if-eqz v6, :cond_3

    if-eq v6, v10, :cond_2

    if-eq v6, v9, :cond_1

    goto :goto_2

    :cond_1
    shl-int/lit8 v6, v7, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    add-int/lit8 v6, v5, 0x1

    shl-int/lit8 v9, v7, 0x6

    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v9

    int-to-char v2, v2

    aput-char v2, p2, v5

    move v5, v6

    const/4 v6, 0x0

    goto :goto_2

    :cond_3
    and-int/lit16 v2, v2, 0xff

    const/16 v11, 0x80

    if-ge v2, v11, :cond_4

    add-int/lit8 v9, v5, 0x1

    int-to-char v2, v2

    aput-char v2, p2, v5

    move v5, v9

    goto :goto_2

    :cond_4
    const/16 v6, 0xe0

    if-ge v2, v6, :cond_5

    const/16 v6, 0xbf

    if-le v2, v6, :cond_5

    and-int/lit8 v2, v2, 0x1f

    :goto_1
    int-to-char v7, v2

    const/4 v6, 0x1

    goto :goto_2

    :cond_5
    and-int/lit8 v2, v2, 0xf

    int-to-char v7, v2

    const/4 v6, 0x2

    :goto_2
    move v2, v8

    goto :goto_0

    :cond_6
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p2, v4, v5}, Ljava/lang/String;-><init>([CII)V

    aput-object v1, v0, p1

    return-object v1
.end method

.method public final d(I)I
    .locals 2

    iget-object v0, p0, Lh/b;->a:[B

    aget-byte v1, v0, p1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 p1, p1, 0x1

    aget-byte p1, v0, p1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    return p1
.end method
