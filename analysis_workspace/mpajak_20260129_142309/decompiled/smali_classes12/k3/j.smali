.class public final Lk3/j;
.super Ljava/lang/Object;


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 8

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, v0, Lg3/l;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v1

    invoke-virtual {v1}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    const-string v2, "ty"

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->b()Lz2/m;

    const-string v2, "pk"

    invoke-virtual {v1, v2, p1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->b()Lz2/m;

    const-string v2, "js"

    invoke-virtual {v1, v2, p0}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->j()Lz2/f;

    move-result-object v1

    invoke-interface {v0, v1}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/superbock/bean/KInfo;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_0

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v0

    new-instance v7, Lcom/superbock/bean/KInfo;

    invoke-static {}, Le3/d;->a()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    move-object v1, v7

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/superbock/bean/KInfo;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Lg3/l;->a(Lcom/superbock/bean/KInfo;)V

    invoke-static {p3}, Lk3/f;->s(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 18

    const-string v0, "\\s+"

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/16 v2, 0xc

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_1

    const/16 v2, 0xf

    if-eq v1, v2, :cond_1

    const/16 v2, 0x12

    if-eq v1, v2, :cond_1

    const/16 v2, 0x15

    if-eq v1, v2, :cond_1

    const/16 v2, 0x18

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-nez v1, :cond_2

    return v4

    :cond_2
    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    array-length v5, v0

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_4

    aget-object v7, v0, v6

    invoke-static {}, Lg3/n;->c()Lg3/n;

    move-result-object v8

    invoke-virtual {v8, v7}, Lg3/n;->b(Ljava/lang/String;)I

    move-result v7

    const/4 v8, -0x1

    if-ne v7, v8, :cond_3

    return v4

    :cond_3
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/16 v6, 0x30

    const/16 v7, 0x20

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    new-array v8, v3, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v8, v4

    const-string v5, "%11s"

    invoke-static {v5, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v7, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v4, v2}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v2

    div-int/lit8 v2, v2, 0x8

    new-array v8, v2, [B

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v2, :cond_8

    mul-int/lit8 v10, v9, 0x8

    add-int/lit8 v11, v9, 0x1

    mul-int/lit8 v12, v11, 0x8

    invoke-virtual {v5, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    const/4 v12, 0x2

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v13

    if-le v13, v3, :cond_6

    invoke-virtual {v10, v4}, Ljava/lang/String;->charAt(I)C

    move-result v13

    const/16 v14, 0x2b

    if-ne v13, v14, :cond_6

    invoke-virtual {v10, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    :cond_6
    invoke-static {v10, v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v13

    const-wide v15, 0xffffffffL

    and-long/2addr v15, v13

    cmp-long v17, v15, v13

    if-nez v17, :cond_7

    long-to-int v10, v13

    int-to-byte v10, v10

    aput-byte v10, v8, v9

    move v9, v11

    goto :goto_4

    :cond_7
    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Input "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in base "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not in the range of an unsigned integer"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :try_start_0
    const-string v2, "SHA-256"

    invoke-static {v2}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v2
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_a

    array-length v5, v2

    if-nez v5, :cond_9

    goto :goto_5

    :cond_9
    aget-byte v2, v2, v4

    new-array v3, v3, [Ljava/lang/Object;

    and-int/lit16 v2, v2, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v3, v4

    const-string v2, "%8s"

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v7, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_a
    :goto_5
    const-string v1, ""

    :goto_6
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "SHA-256 algorithm not found"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
