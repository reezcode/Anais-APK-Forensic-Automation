.class public final enum Lcom/tencent/smtt/sdk/WebSettings$TextSize;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/smtt/sdk/WebSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TextSize"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/smtt/sdk/WebSettings$TextSize;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/tencent/smtt/sdk/WebSettings$TextSize;

.field public static final enum LARGER:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

.field public static final enum LARGEST:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

.field public static final enum NORMAL:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

.field public static final enum SMALLER:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

.field public static final enum SMALLEST:Lcom/tencent/smtt/sdk/WebSettings$TextSize;


# instance fields
.field public value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    const-string v1, "SMALLEST"

    const/4 v2, 0x0

    const/16 v3, 0x32

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/smtt/sdk/WebSettings$TextSize;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->SMALLEST:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    new-instance v1, Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    const-string v3, "SMALLER"

    const/4 v4, 0x1

    const/16 v5, 0x4b

    invoke-direct {v1, v3, v4, v5}, Lcom/tencent/smtt/sdk/WebSettings$TextSize;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->SMALLER:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    new-instance v3, Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    const-string v5, "NORMAL"

    const/4 v6, 0x2

    const/16 v7, 0x64

    invoke-direct {v3, v5, v6, v7}, Lcom/tencent/smtt/sdk/WebSettings$TextSize;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->NORMAL:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    new-instance v5, Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    const-string v7, "LARGER"

    const/4 v8, 0x3

    const/16 v9, 0x7d

    invoke-direct {v5, v7, v8, v9}, Lcom/tencent/smtt/sdk/WebSettings$TextSize;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->LARGER:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    new-instance v7, Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    const-string v9, "LARGEST"

    const/4 v10, 0x4

    const/16 v11, 0x96

    invoke-direct {v7, v9, v10, v11}, Lcom/tencent/smtt/sdk/WebSettings$TextSize;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->LARGEST:Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->$VALUES:[Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/smtt/sdk/WebSettings$TextSize;
    .locals 1

    const-class v0, Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    return-object p0
.end method

.method public static values()[Lcom/tencent/smtt/sdk/WebSettings$TextSize;
    .locals 1

    sget-object v0, Lcom/tencent/smtt/sdk/WebSettings$TextSize;->$VALUES:[Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    invoke-virtual {v0}, [Lcom/tencent/smtt/sdk/WebSettings$TextSize;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tencent/smtt/sdk/WebSettings$TextSize;

    return-object v0
.end method
