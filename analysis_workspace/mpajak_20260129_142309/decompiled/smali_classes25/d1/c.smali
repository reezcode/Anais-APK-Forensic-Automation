.class public final Ld1/c;
.super Ljava/lang/Object;

# interfaces
.implements Lk2/q;


# static fields
.field public static final e:Ld1/d;

.field public static volatile f:Ld1/c;

.field public static g:[B

.field public static final h:Lq3/r;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ld1/d;

    invoke-direct {v0}, Ld1/d;-><init>()V

    sput-object v0, Ld1/c;->e:Ld1/d;

    new-instance v0, Ld1/c;

    invoke-direct {v0}, Ld1/c;-><init>()V

    sput-object v0, Ld1/c;->f:Ld1/c;

    const/16 v0, 0x10

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Ld1/c;->g:[B

    new-instance v0, Lq3/r;

    const-string v1, "CONDITION_FALSE"

    invoke-direct {v0, v1}, Lq3/r;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld1/c;->h:Lq3/r;

    return-void

    nop

    :array_0
    .array-data 1
        0x1t
        0x2t
        0x3t
        0x4t
        0x5t
        0x6t
        0x7t
        0x8t
        0x9t
        0xat
        0xbt
        0xct
        0xdt
        0xet
        0xft
        0x10t
    .end array-data
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Lkotlin/coroutines/CoroutineContext;)Lm3/y;
    .locals 2

    new-instance v0, Lq3/d;

    sget-object v1, Lm3/u0$b;->b:Lm3/u0$b;

    invoke-interface {p0, v1}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Ld1/c;->b()Lm3/l;

    move-result-object v1

    invoke-interface {p0, v1}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lq3/d;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    return-object v0
.end method

.method public static b()Lm3/l;
    .locals 2

    const/4 v0, 0x0

    new-instance v1, Lm3/x0;

    invoke-direct {v1, v0}, Lm3/x0;-><init>(Lm3/u0;)V

    return-object v1
.end method

.method public static d(Z)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/sql/SQLException;
    .locals 1

    new-instance v0, Ljava/sql/SQLException;

    invoke-direct {v0, p0}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

.method public static f(Ljava/lang/String;[B)Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/lang/String;

    sget-object v3, Lf4/i;->e:Lf4/i;

    const-string v3, "$this$decodeBase64"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lf4/a;->a:[B

    const-string v3, "$this$decodeBase64ToArray"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v3

    :goto_0
    const/16 v4, 0x9

    const/16 v5, 0x20

    const/16 v6, 0xd

    const/16 v7, 0xa

    if-lez v3, :cond_1

    add-int/lit8 v8, v3, -0x1

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x3d

    if-eq v9, v10, :cond_0

    if-eq v9, v7, :cond_0

    if-eq v9, v6, :cond_0

    if-eq v9, v5, :cond_0

    if-eq v9, v4, :cond_0

    goto :goto_1

    :cond_0
    move v3, v8

    goto :goto_0

    :cond_1
    :goto_1
    int-to-long v8, v3

    const-wide/16 v10, 0x6

    mul-long v8, v8, v10

    const-wide/16 v10, 0x8

    div-long/2addr v8, v10

    long-to-int v9, v8

    new-array v8, v9, [B

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_2
    if-ge v11, v3, :cond_e

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v15, 0x5a

    const/16 v4, 0x41

    if-le v4, v10, :cond_2

    goto :goto_4

    :cond_2
    if-lt v15, v10, :cond_3

    add-int/lit8 v10, v10, -0x41

    :goto_3
    const/16 v4, 0x9

    goto :goto_9

    :cond_3
    :goto_4
    const/16 v4, 0x7a

    const/16 v15, 0x61

    if-le v15, v10, :cond_4

    goto :goto_5

    :cond_4
    if-lt v4, v10, :cond_5

    add-int/lit8 v10, v10, -0x47

    goto :goto_3

    :cond_5
    :goto_5
    const/16 v4, 0x39

    const/16 v15, 0x30

    if-le v15, v10, :cond_6

    goto :goto_6

    :cond_6
    if-lt v4, v10, :cond_7

    add-int/lit8 v10, v10, 0x4

    goto :goto_3

    :cond_7
    :goto_6
    const/16 v4, 0x2b

    if-eq v10, v4, :cond_c

    const/16 v4, 0x2d

    if-ne v10, v4, :cond_8

    goto :goto_8

    :cond_8
    const/16 v4, 0x2f

    if-eq v10, v4, :cond_b

    const/16 v4, 0x5f

    if-ne v10, v4, :cond_9

    goto :goto_7

    :cond_9
    if-eq v10, v7, :cond_a

    if-eq v10, v6, :cond_a

    if-eq v10, v5, :cond_a

    const/16 v4, 0x9

    if-ne v10, v4, :cond_12

    goto :goto_a

    :cond_a
    const/16 v4, 0x9

    goto :goto_a

    :cond_b
    :goto_7
    const/16 v4, 0x9

    const/16 v10, 0x3f

    goto :goto_9

    :cond_c
    :goto_8
    const/16 v4, 0x9

    const/16 v10, 0x3e

    :goto_9
    shl-int/lit8 v13, v13, 0x6

    or-int/2addr v13, v10

    add-int/lit8 v12, v12, 0x1

    rem-int/lit8 v10, v12, 0x4

    if-nez v10, :cond_d

    add-int/lit8 v10, v14, 0x1

    shr-int/lit8 v15, v13, 0x10

    int-to-byte v15, v15

    aput-byte v15, v8, v14

    add-int/lit8 v14, v10, 0x1

    shr-int/lit8 v15, v13, 0x8

    int-to-byte v15, v15

    aput-byte v15, v8, v10

    add-int/lit8 v10, v14, 0x1

    int-to-byte v15, v13

    aput-byte v15, v8, v14

    move v14, v10

    :cond_d
    :goto_a
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    :cond_e
    rem-int/lit8 v12, v12, 0x4

    const/4 v0, 0x1

    if-eq v12, v0, :cond_12

    const/4 v0, 0x2

    if-eq v12, v0, :cond_10

    const/4 v0, 0x3

    if-eq v12, v0, :cond_f

    goto :goto_b

    :cond_f
    shl-int/lit8 v0, v13, 0x6

    add-int/lit8 v3, v14, 0x1

    shr-int/lit8 v4, v0, 0x10

    int-to-byte v4, v4

    aput-byte v4, v8, v14

    add-int/lit8 v14, v3, 0x1

    shr-int/lit8 v0, v0, 0x8

    int-to-byte v0, v0

    aput-byte v0, v8, v3

    goto :goto_b

    :cond_10
    shl-int/lit8 v0, v13, 0xc

    add-int/lit8 v3, v14, 0x1

    const/16 v4, 0x10

    shr-int/2addr v0, v4

    int-to-byte v0, v0

    aput-byte v0, v8, v14

    move v14, v3

    :goto_b
    if-ne v14, v9, :cond_11

    goto :goto_c

    :cond_11
    invoke-static {v8, v14}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v8

    const-string v0, "java.util.Arrays.copyOf(this, newSize)"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_c

    :cond_12
    const/4 v8, 0x0

    :goto_c
    if-eqz v8, :cond_13

    new-instance v15, Lf4/i;

    invoke-direct {v15, v8}, Lf4/i;-><init>([B)V

    goto :goto_d

    :cond_13
    const/4 v15, 0x0

    :goto_d
    invoke-virtual {v15}, Lf4/i;->j()[B

    move-result-object v0

    const-string v3, "AES"

    :try_start_0
    array-length v4, v1

    const/16 v5, 0x10

    if-eq v4, v5, :cond_14

    const/4 v4, 0x0

    invoke-static {v1, v4, v5}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    :cond_14
    invoke-static {v3}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v4, v1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string v1, "AES/CBC/PKCS5Padding"

    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    sget-object v5, Ld1/c;->g:[B

    invoke-direct {v3, v5}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v5, 0x2

    invoke-virtual {v1, v5, v4, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([B)V

    return-object v2

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static g(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 1

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_0

    const-class p0, Ljava/lang/Integer;

    return-object p0

    :cond_0
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_1

    const-class p0, Ljava/lang/Float;

    return-object p0

    :cond_1
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_2

    const-class p0, Ljava/lang/Byte;

    return-object p0

    :cond_2
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_3

    const-class p0, Ljava/lang/Double;

    return-object p0

    :cond_3
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_4

    const-class p0, Ljava/lang/Long;

    return-object p0

    :cond_4
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_5

    const-class p0, Ljava/lang/Character;

    return-object p0

    :cond_5
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_6

    const-class p0, Ljava/lang/Boolean;

    return-object p0

    :cond_6
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_7

    const-class p0, Ljava/lang/Short;

    return-object p0

    :cond_7
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-ne p0, v0, :cond_8

    const-class p0, Ljava/lang/Void;

    :cond_8
    return-object p0
.end method


# virtual methods
.method public c()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-object v0
.end method
