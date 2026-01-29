.class public final enum Lorg/apache/commons/io/FileSystem;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/io/FileSystem;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/io/FileSystem;

.field public static final enum GENERIC:Lorg/apache/commons/io/FileSystem;

.field private static final IS_OS_LINUX:Z

.field private static final IS_OS_MAC:Z

.field private static final IS_OS_WINDOWS:Z

.field public static final enum LINUX:Lorg/apache/commons/io/FileSystem;

.field public static final enum MAC_OSX:Lorg/apache/commons/io/FileSystem;

.field private static final OS_NAME_WINDOWS_PREFIX:Ljava/lang/String; = "Windows"

.field public static final enum WINDOWS:Lorg/apache/commons/io/FileSystem;


# instance fields
.field private final casePreserving:Z

.field private final caseSensitive:Z

.field private final illegalFileNameChars:[C

.field private final maxFileNameLength:I

.field private final maxPathLength:I

.field private final reservedFileNames:[Ljava/lang/String;

.field private final supportsDriveLetter:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 35

    new-instance v10, Lorg/apache/commons/io/FileSystem;

    const/4 v11, 0x1

    new-array v7, v11, [C

    const/4 v12, 0x0

    aput-char v12, v7, v12

    new-array v8, v12, [Ljava/lang/String;

    const-string v1, "GENERIC"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v5, 0x7fffffff

    const v6, 0x7fffffff

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IZZII[C[Ljava/lang/String;Z)V

    sput-object v10, Lorg/apache/commons/io/FileSystem;->GENERIC:Lorg/apache/commons/io/FileSystem;

    new-instance v0, Lorg/apache/commons/io/FileSystem;

    const/4 v1, 0x2

    new-array v2, v1, [C

    fill-array-data v2, :array_0

    new-array v3, v12, [Ljava/lang/String;

    const-string v14, "LINUX"

    const/4 v15, 0x1

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0xff

    const/16 v19, 0x1000

    const/16 v22, 0x0

    move-object v13, v0

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    invoke-direct/range {v13 .. v22}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IZZII[C[Ljava/lang/String;Z)V

    sput-object v0, Lorg/apache/commons/io/FileSystem;->LINUX:Lorg/apache/commons/io/FileSystem;

    new-instance v2, Lorg/apache/commons/io/FileSystem;

    const/4 v3, 0x3

    new-array v4, v3, [C

    fill-array-data v4, :array_1

    new-array v5, v12, [Ljava/lang/String;

    const-string v24, "MAC_OSX"

    const/16 v25, 0x2

    const/16 v26, 0x1

    const/16 v27, 0x1

    const/16 v28, 0xff

    const/16 v29, 0x400

    const/16 v32, 0x0

    move-object/from16 v23, v2

    move-object/from16 v30, v4

    move-object/from16 v31, v5

    invoke-direct/range {v23 .. v32}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IZZII[C[Ljava/lang/String;Z)V

    sput-object v2, Lorg/apache/commons/io/FileSystem;->MAC_OSX:Lorg/apache/commons/io/FileSystem;

    new-instance v4, Lorg/apache/commons/io/FileSystem;

    const/16 v5, 0x29

    new-array v5, v5, [C

    fill-array-data v5, :array_2

    const-string v13, "AUX"

    const-string v14, "COM1"

    const-string v15, "COM2"

    const-string v16, "COM3"

    const-string v17, "COM4"

    const-string v18, "COM5"

    const-string v19, "COM6"

    const-string v20, "COM7"

    const-string v21, "COM8"

    const-string v22, "COM9"

    const-string v23, "CON"

    const-string v24, "LPT1"

    const-string v25, "LPT2"

    const-string v26, "LPT3"

    const-string v27, "LPT4"

    const-string v28, "LPT5"

    const-string v29, "LPT6"

    const-string v30, "LPT7"

    const-string v31, "LPT8"

    const-string v32, "LPT9"

    const-string v33, "NUL"

    const-string v34, "PRN"

    filled-new-array/range {v13 .. v34}, [Ljava/lang/String;

    move-result-object v21

    const-string v14, "WINDOWS"

    const/4 v15, 0x3

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0xff

    const/16 v19, 0x7d00

    const/16 v22, 0x1

    move-object v13, v4

    move-object/from16 v20, v5

    invoke-direct/range {v13 .. v22}, Lorg/apache/commons/io/FileSystem;-><init>(Ljava/lang/String;IZZII[C[Ljava/lang/String;Z)V

    sput-object v4, Lorg/apache/commons/io/FileSystem;->WINDOWS:Lorg/apache/commons/io/FileSystem;

    const/4 v5, 0x4

    new-array v5, v5, [Lorg/apache/commons/io/FileSystem;

    aput-object v10, v5, v12

    aput-object v0, v5, v11

    aput-object v2, v5, v1

    aput-object v4, v5, v3

    sput-object v5, Lorg/apache/commons/io/FileSystem;->$VALUES:[Lorg/apache/commons/io/FileSystem;

    const-string v0, "Linux"

    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getOsMatchesName(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_LINUX:Z

    const-string v0, "Mac"

    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getOsMatchesName(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_MAC:Z

    const-string v0, "Windows"

    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getOsMatchesName(Ljava/lang/String;)Z

    move-result v0

    sput-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_WINDOWS:Z

    return-void

    :array_0
    .array-data 2
        0x0s
        0x2fs
    .end array-data

    :array_1
    .array-data 2
        0x0s
        0x2fs
        0x3as
    .end array-data

    nop

    :array_2
    .array-data 2
        0x0s
        0x1s
        0x2s
        0x3s
        0x4s
        0x5s
        0x6s
        0x7s
        0x8s
        0x9s
        0xas
        0xbs
        0xcs
        0xds
        0xes
        0xfs
        0x10s
        0x11s
        0x12s
        0x13s
        0x14s
        0x15s
        0x16s
        0x17s
        0x18s
        0x19s
        0x1as
        0x1bs
        0x1cs
        0x1ds
        0x1es
        0x1fs
        0x22s
        0x2as
        0x2fs
        0x3as
        0x3cs
        0x3es
        0x3fs
        0x5cs
        0x7cs
    .end array-data
.end method

.method private constructor <init>(Ljava/lang/String;IZZII[C[Ljava/lang/String;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII[C[",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p5, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    iput p6, p0, Lorg/apache/commons/io/FileSystem;->maxPathLength:I

    const-string p1, "illegalFileNameChars"

    invoke-static {p7, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p7, [C

    iput-object p7, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[C

    const-string p1, "reservedFileNames"

    invoke-static {p8, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast p8, [Ljava/lang/String;

    iput-object p8, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNames:[Ljava/lang/String;

    iput-boolean p3, p0, Lorg/apache/commons/io/FileSystem;->caseSensitive:Z

    iput-boolean p4, p0, Lorg/apache/commons/io/FileSystem;->casePreserving:Z

    iput-boolean p9, p0, Lorg/apache/commons/io/FileSystem;->supportsDriveLetter:Z

    return-void
.end method

.method public static getCurrent()Lorg/apache/commons/io/FileSystem;
    .locals 1

    sget-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_LINUX:Z

    if-eqz v0, :cond_0

    sget-object v0, Lorg/apache/commons/io/FileSystem;->LINUX:Lorg/apache/commons/io/FileSystem;

    return-object v0

    :cond_0
    sget-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_MAC:Z

    if-eqz v0, :cond_1

    sget-object v0, Lorg/apache/commons/io/FileSystem;->MAC_OSX:Lorg/apache/commons/io/FileSystem;

    return-object v0

    :cond_1
    sget-boolean v0, Lorg/apache/commons/io/FileSystem;->IS_OS_WINDOWS:Z

    if-eqz v0, :cond_2

    sget-object v0, Lorg/apache/commons/io/FileSystem;->WINDOWS:Lorg/apache/commons/io/FileSystem;

    return-object v0

    :cond_2
    sget-object v0, Lorg/apache/commons/io/FileSystem;->GENERIC:Lorg/apache/commons/io/FileSystem;

    return-object v0
.end method

.method private static getOsMatchesName(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "os.name"

    invoke-static {v0}, Lorg/apache/commons/io/FileSystem;->getSystemProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lorg/apache/commons/io/FileSystem;->isOsNameMatch(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static getSystemProperty(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    :try_start_0
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Caught a SecurityException reading the system property \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'; the SystemUtils property value will default to null."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private isIllegalFileNameChar(C)Z
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[C

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static isOsNameMatch(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/io/FileSystem;
    .locals 1

    const-class v0, Lorg/apache/commons/io/FileSystem;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/io/FileSystem;

    return-object p0
.end method

.method public static values()[Lorg/apache/commons/io/FileSystem;
    .locals 1

    sget-object v0, Lorg/apache/commons/io/FileSystem;->$VALUES:[Lorg/apache/commons/io/FileSystem;

    invoke-virtual {v0}, [Lorg/apache/commons/io/FileSystem;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/apache/commons/io/FileSystem;

    return-object v0
.end method


# virtual methods
.method public getIllegalFileNameChars()[C
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[C

    invoke-virtual {v0}, [C->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [C

    return-object v0
.end method

.method public getMaxFileNameLength()I
    .locals 1

    iget v0, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    return v0
.end method

.method public getMaxPathLength()I
    .locals 1

    iget v0, p0, Lorg/apache/commons/io/FileSystem;->maxPathLength:I

    return v0
.end method

.method public getReservedFileNames()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNames:[Ljava/lang/String;

    invoke-virtual {v0}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0
.end method

.method public isCasePreserving()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/io/FileSystem;->casePreserving:Z

    return v0
.end method

.method public isCaseSensitive()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/io/FileSystem;->caseSensitive:Z

    return v0
.end method

.method public isLegalFileName(Ljava/lang/CharSequence;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    iget v2, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    if-le v1, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/FileSystem;->isReservedFileName(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    invoke-direct {p0, v2}, Lorg/apache/commons/io/FileSystem;->isIllegalFileNameChar(C)Z

    move-result v2

    if-eqz v2, :cond_2

    return v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v0
.end method

.method public isReservedFileName(Ljava/lang/CharSequence;)Z
    .locals 1

    iget-object v0, p0, Lorg/apache/commons/io/FileSystem;->reservedFileNames:[Ljava/lang/String;

    invoke-static {v0, p1}, Ljava/util/Arrays;->binarySearch([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public supportsDriveLetter()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/commons/io/FileSystem;->supportsDriveLetter:Z

    return v0
.end method

.method public toLegalFileName(Ljava/lang/String;C)Ljava/lang/String;
    .locals 5

    invoke-direct {p0, p2}, Lorg/apache/commons/io/FileSystem;->isIllegalFileNameChar(C)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    if-nez p2, :cond_0

    const-string p2, "\\0"

    goto :goto_0

    :cond_0
    invoke-static {p2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    :goto_0
    aput-object p2, v0, v2

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v0, v1

    const/4 p2, 0x2

    iget-object v1, p0, Lorg/apache/commons/io/FileSystem;->illegalFileNameChars:[C

    invoke-static {v1}, Ljava/util/Arrays;->toString([C)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, p2

    const-string p2, "The replacement character \'%s\' cannot be one of the %s illegal characters: %s"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iget v3, p0, Lorg/apache/commons/io/FileSystem;->maxFileNameLength:I

    if-le v0, v3, :cond_2

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    const/4 v3, 0x0

    :goto_1
    array-length v4, v0

    if-ge v2, v4, :cond_4

    aget-char v4, v0, v2

    invoke-direct {p0, v4}, Lorg/apache/commons/io/FileSystem;->isIllegalFileNameChar(C)Z

    move-result v4

    if-eqz v4, :cond_3

    aput-char p2, v0, v2

    const/4 v3, 0x1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    if-eqz v3, :cond_5

    invoke-static {v0}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object p1

    :cond_5
    return-object p1
.end method
