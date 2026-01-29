.class public final Lmarmojkfnf/dphnidckqxhm/b;
.super Lmarmojkfnf/dphnidckqxhm/a;


# static fields
.field public static final a:[I

.field public static final b:[I


# direct methods
.method private static $d2j$hex$71661c95$decode_B(Ljava/lang/String;)[B
    .locals 11

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    div-int/lit8 p0, p0, 0x2

    new-array v1, p0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_6

    mul-int/lit8 v3, v2, 0x2

    aget-char v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    aget-char v3, v0, v3

    const/16 v5, 0x46

    const/16 v6, 0x66

    const/16 v7, 0x39

    const/16 v8, 0x30

    const/16 v9, 0x41

    const/16 v10, 0x61

    if-lt v4, v8, :cond_0

    if-gt v4, v7, :cond_0

    add-int/lit8 v4, v4, -0x30

    goto :goto_2

    :cond_0
    if-lt v4, v10, :cond_1

    if-gt v4, v6, :cond_1

    add-int/lit8 v4, v4, -0x61

    :goto_1
    add-int/lit8 v4, v4, 0xa

    goto :goto_2

    :cond_1
    if-lt v4, v9, :cond_5

    if-gt v4, v5, :cond_5

    add-int/lit8 v4, v4, -0x41

    goto :goto_1

    :goto_2
    if-lt v3, v8, :cond_2

    if-gt v3, v7, :cond_2

    add-int/lit8 v3, v3, -0x30

    goto :goto_4

    :cond_2
    if-lt v3, v10, :cond_3

    if-gt v3, v6, :cond_3

    add-int/lit8 v3, v3, -0x61

    :goto_3
    add-int/lit8 v3, v3, 0xa

    goto :goto_4

    :cond_3
    if-lt v3, v9, :cond_4

    if-gt v3, v5, :cond_4

    add-int/lit8 v3, v3, -0x41

    goto :goto_3

    :goto_4
    shl-int/lit8 v4, v4, 0x4

    or-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_6
    return-object v1
.end method

.method private static $d2j$hex$71661c95$decode_I(Ljava/lang/String;)[I
    .locals 2

    invoke-static {p0}, Lmarmojkfnf/dphnidckqxhm/b;->$d2j$hex$71661c95$decode_B(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;

    move-result-object v0

    array-length p0, p0

    div-int/lit8 p0, p0, 0x4

    new-array p0, p0, [I

    invoke-virtual {v0, p0}, Ljava/nio/IntBuffer;->get([I)Ljava/nio/IntBuffer;

    return-object p0
.end method

.method private static $d2j$hex$71661c95$decode_J(Ljava/lang/String;)[J
    .locals 2

    invoke-static {p0}, Lmarmojkfnf/dphnidckqxhm/b;->$d2j$hex$71661c95$decode_B(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asLongBuffer()Ljava/nio/LongBuffer;

    move-result-object v0

    array-length p0, p0

    div-int/lit8 p0, p0, 0x8

    new-array p0, p0, [J

    invoke-virtual {v0, p0}, Ljava/nio/LongBuffer;->get([J)Ljava/nio/LongBuffer;

    return-object p0
.end method

.method private static $d2j$hex$71661c95$decode_S(Ljava/lang/String;)[S
    .locals 2

    invoke-static {p0}, Lmarmojkfnf/dphnidckqxhm/b;->$d2j$hex$71661c95$decode_B(Ljava/lang/String;)[B

    move-result-object p0

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    array-length p0, p0

    div-int/lit8 p0, p0, 0x2

    new-array p0, p0, [S

    invoke-virtual {v0, p0}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    return-object p0
.end method

.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff3e000000ffffffffffffffffffffffff3f0000003400000035000000360000003700000038000000390000003a0000003b0000003c0000003d000000fffffffffffffffffffffffffeffffffffffffffffffffffffffffff000000000100000002000000030000000400000005000000060000000700000008000000090000000a0000000b0000000c0000000d0000000e0000000f00000010000000110000001200000013000000140000001500000016000000170000001800000019000000ffffffffffffffffffffffffffffffffffffffffffffffff1a0000001b0000001c0000001d0000001e0000001f000000200000002100000022000000230000002400000025000000260000002700000028000000290000002a0000002b0000002c0000002d0000002e0000002f00000030000000310000003200000033000000ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/b;->$d2j$hex$71661c95$decode_I(Ljava/lang/String;)[I

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/b;->a:[I

    const-string v0, "ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff3e000000ffffffffffffffff3400000035000000360000003700000038000000390000003a0000003b0000003c0000003d000000fffffffffffffffffffffffffeffffffffffffffffffffffffffffff000000000100000002000000030000000400000005000000060000000700000008000000090000000a0000000b0000000c0000000d0000000e0000000f00000010000000110000001200000013000000140000001500000016000000170000001800000019000000ffffffffffffffffffffffffffffffff3f000000ffffffff1a0000001b0000001c0000001d0000001e0000001f000000200000002100000022000000230000002400000025000000260000002700000028000000290000002a0000002b0000002c0000002d0000002e0000002f00000030000000310000003200000033000000ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff"

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/b;->$d2j$hex$71661c95$decode_I(Ljava/lang/String;)[I

    move-result-object v0

    sput-object v0, Lmarmojkfnf/dphnidckqxhm/b;->b:[I

    return-void
.end method
