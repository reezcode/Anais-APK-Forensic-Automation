.class public final enum Lv2/c;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv2/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lv2/c;

.field public static final enum d:Lv2/c;

.field public static final enum e:Lv2/c;

.field public static final synthetic f:[Lv2/c;


# instance fields
.field public final b:Lv2/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 37

    new-instance v0, Lv2/c;

    sget-object v1, Lw2/h0;->d:Lw2/h0;

    const-string v2, "STRING"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v1, Lv2/c;

    sget-object v2, Lw2/a0;->e:Lw2/a0;

    sget-object v2, Lw2/a0;->e:Lw2/a0;

    const-string v4, "LONG_STRING"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v2, Lv2/c;

    sget-object v4, Lw2/g0;->d:Lw2/g0;

    sget-object v4, Lw2/g0;->d:Lw2/g0;

    const-string v6, "STRING_BYTES"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v4, Lv2/c;

    sget-object v6, Lw2/h;->e:Lw2/h;

    const-string v8, "BOOLEAN"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v6, Lv2/c;

    sget-object v8, Lw2/g;->d:Lw2/g;

    const-string v10, "BOOLEAN_OBJ"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v8, Lv2/c;

    sget-object v10, Lw2/q;->e:Lw2/q;

    const-string v12, "DATE"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v10, Lv2/c;

    sget-object v12, Lw2/n;->e:Lw2/n;

    sget-object v12, Lw2/n;->e:Lw2/n;

    const-string v14, "DATE_LONG"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v12, Lv2/c;

    sget-object v14, Lw2/o;->e:Lw2/o;

    sget-object v14, Lw2/o;->e:Lw2/o;

    const-string v15, "DATE_STRING"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v14, Lv2/c;

    sget-object v15, Lw2/l;->e:Lw2/l;

    const-string v13, "CHAR"

    const/16 v11, 0x8

    invoke-direct {v14, v13, v11, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v13, Lv2/c;

    sget-object v15, Lw2/m;->d:Lw2/m;

    const-string v11, "CHAR_OBJ"

    const/16 v9, 0x9

    invoke-direct {v13, v11, v9, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v11, Lv2/c;

    sget-object v15, Lw2/k;->e:Lw2/k;

    const-string v9, "BYTE"

    const/16 v7, 0xa

    invoke-direct {v11, v9, v7, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v9, Lv2/c;

    sget-object v15, Lw2/i;->d:Lw2/i;

    sget-object v15, Lw2/i;->d:Lw2/i;

    const-string v7, "BYTE_ARRAY"

    const/16 v5, 0xb

    invoke-direct {v9, v7, v5, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v7, Lv2/c;

    sget-object v15, Lw2/j;->d:Lw2/j;

    const-string v5, "BYTE_OBJ"

    const/16 v3, 0xc

    invoke-direct {v7, v5, v3, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v15, Lw2/e0;->e:Lw2/e0;

    const-string v3, "SHORT"

    move-object/from16 v16, v7

    const/16 v7, 0xd

    invoke-direct {v5, v3, v7, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    sget-object v15, Lw2/d0;->d:Lw2/d0;

    const-string v7, "SHORT_OBJ"

    move-object/from16 v17, v5

    const/16 v5, 0xe

    invoke-direct {v3, v7, v5, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v7, Lv2/c;

    sget-object v15, Lw2/x;->e:Lw2/x;

    const-string v5, "INTEGER"

    move-object/from16 v18, v3

    const/16 v3, 0xf

    invoke-direct {v7, v5, v3, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v15, Lw2/y;->d:Lw2/y;

    const-string v3, "INTEGER_OBJ"

    move-object/from16 v19, v7

    const/16 v7, 0x10

    invoke-direct {v5, v3, v7, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    sget-object v15, Lw2/b0;->e:Lw2/b0;

    const-string v7, "LONG"

    move-object/from16 v20, v5

    const/16 v5, 0x11

    invoke-direct {v3, v7, v5, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v7, Lv2/c;

    sget-object v15, Lw2/z;->d:Lw2/z;

    const-string v5, "LONG_OBJ"

    move-object/from16 v21, v3

    const/16 v3, 0x12

    invoke-direct {v7, v5, v3, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v15, Lw2/w;->e:Lw2/w;

    const-string v3, "FLOAT"

    move-object/from16 v22, v7

    const/16 v7, 0x13

    invoke-direct {v5, v3, v7, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    sget-object v15, Lw2/v;->d:Lw2/v;

    const-string v7, "FLOAT_OBJ"

    move-object/from16 v23, v5

    const/16 v5, 0x14

    invoke-direct {v3, v7, v5, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v7, Lv2/c;

    sget-object v15, Lw2/s;->e:Lw2/s;

    const-string v5, "DOUBLE"

    move-object/from16 v24, v3

    const/16 v3, 0x15

    invoke-direct {v7, v5, v3, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v15, Lw2/r;->d:Lw2/r;

    const-string v3, "DOUBLE_OBJ"

    move-object/from16 v25, v7

    const/16 v7, 0x16

    invoke-direct {v5, v3, v7, v15}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    sget-object v7, Lw2/c0;->d:Lw2/c0;

    sget-object v7, Lw2/c0;->d:Lw2/c0;

    const-string v15, "SERIALIZABLE"

    move-object/from16 v26, v5

    const/16 v5, 0x17

    invoke-direct {v3, v15, v5, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v7, Lw2/u;->d:Lw2/u;

    const-string v15, "ENUM_STRING"

    move-object/from16 v27, v3

    const/16 v3, 0x18

    invoke-direct {v5, v15, v3, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    sput-object v5, Lv2/c;->c:Lv2/c;

    new-instance v3, Lv2/c;

    sget-object v7, Lw2/t;->d:Lw2/t;

    sget-object v7, Lw2/t;->d:Lw2/t;

    const-string v15, "ENUM_INTEGER"

    move-object/from16 v28, v5

    const/16 v5, 0x19

    invoke-direct {v3, v15, v5, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    sput-object v3, Lv2/c;->d:Lv2/c;

    new-instance v5, Lv2/c;

    sget-object v7, Lw2/j0;->d:Lw2/j0;

    const-string v15, "UUID"

    move-object/from16 v29, v3

    const/16 v3, 0x1a

    invoke-direct {v5, v15, v3, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    sget-object v7, Lw2/f;->d:Lw2/f;

    const-string v15, "BIG_INTEGER"

    move-object/from16 v30, v5

    const/16 v5, 0x1b

    invoke-direct {v3, v15, v5, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v7, Lw2/e;->d:Lw2/e;

    const-string v15, "BIG_DECIMAL"

    move-object/from16 v31, v3

    const/16 v3, 0x1c

    invoke-direct {v5, v15, v3, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    sget-object v7, Lw2/d;->d:Lw2/d;

    sget-object v7, Lw2/d;->d:Lw2/d;

    const-string v15, "BIG_DECIMAL_NUMERIC"

    move-object/from16 v32, v5

    const/16 v5, 0x1d

    invoke-direct {v3, v15, v5, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v7, Lw2/p;->d:Lw2/p;

    sget-object v7, Lw2/p;->d:Lw2/p;

    const-string v15, "DATE_TIME"

    move-object/from16 v33, v3

    const/16 v3, 0x1e

    invoke-direct {v5, v15, v3, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    sget-object v7, Lw2/f0;->f:Lw2/f0;

    const-string v15, "SQL_DATE"

    move-object/from16 v34, v5

    const/16 v5, 0x1f

    invoke-direct {v3, v15, v5, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v5, Lv2/c;

    sget-object v7, Lw2/i0;->f:Lw2/i0;

    const-string v15, "TIME_STAMP"

    move-object/from16 v35, v3

    const/16 v3, 0x20

    invoke-direct {v5, v15, v3, v7}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    new-instance v3, Lv2/c;

    const-string v7, "UNKNOWN"

    const/16 v15, 0x21

    move-object/from16 v36, v5

    const/4 v5, 0x0

    invoke-direct {v3, v7, v15, v5}, Lv2/c;-><init>(Ljava/lang/String;ILv2/a;)V

    sput-object v3, Lv2/c;->e:Lv2/c;

    const/16 v5, 0x22

    new-array v5, v5, [Lv2/c;

    const/4 v7, 0x0

    aput-object v0, v5, v7

    const/4 v0, 0x1

    aput-object v1, v5, v0

    const/4 v0, 0x2

    aput-object v2, v5, v0

    const/4 v0, 0x3

    aput-object v4, v5, v0

    const/4 v0, 0x4

    aput-object v6, v5, v0

    const/4 v0, 0x5

    aput-object v8, v5, v0

    const/4 v0, 0x6

    aput-object v10, v5, v0

    const/4 v0, 0x7

    aput-object v12, v5, v0

    const/16 v0, 0x8

    aput-object v14, v5, v0

    const/16 v0, 0x9

    aput-object v13, v5, v0

    const/16 v0, 0xa

    aput-object v11, v5, v0

    const/16 v0, 0xb

    aput-object v9, v5, v0

    const/16 v0, 0xc

    aput-object v16, v5, v0

    const/16 v0, 0xd

    aput-object v17, v5, v0

    const/16 v0, 0xe

    aput-object v18, v5, v0

    const/16 v0, 0xf

    aput-object v19, v5, v0

    const/16 v0, 0x10

    aput-object v20, v5, v0

    const/16 v0, 0x11

    aput-object v21, v5, v0

    const/16 v0, 0x12

    aput-object v22, v5, v0

    const/16 v0, 0x13

    aput-object v23, v5, v0

    const/16 v0, 0x14

    aput-object v24, v5, v0

    const/16 v0, 0x15

    aput-object v25, v5, v0

    const/16 v0, 0x16

    aput-object v26, v5, v0

    const/16 v0, 0x17

    aput-object v27, v5, v0

    const/16 v0, 0x18

    aput-object v28, v5, v0

    const/16 v0, 0x19

    aput-object v29, v5, v0

    const/16 v0, 0x1a

    aput-object v30, v5, v0

    const/16 v0, 0x1b

    aput-object v31, v5, v0

    const/16 v0, 0x1c

    aput-object v32, v5, v0

    const/16 v0, 0x1d

    aput-object v33, v5, v0

    const/16 v0, 0x1e

    aput-object v34, v5, v0

    const/16 v0, 0x1f

    aput-object v35, v5, v0

    const/16 v0, 0x20

    aput-object v36, v5, v0

    const/16 v0, 0x21

    aput-object v3, v5, v0

    sput-object v5, Lv2/c;->f:[Lv2/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILv2/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv2/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lv2/c;->b:Lv2/a;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lv2/c;
    .locals 1

    const-class v0, Lv2/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv2/c;

    return-object p0
.end method

.method public static values()[Lv2/c;
    .locals 1

    sget-object v0, Lv2/c;->f:[Lv2/c;

    invoke-virtual {v0}, [Lv2/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv2/c;

    return-object v0
.end method
