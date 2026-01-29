.class public final enum Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/smtt/sdk/TbsVersionController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IntervalChoice"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum HALF_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

.field public static final enum ONE_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

.field public static final enum SIX_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

.field public static final enum TEN_MINUTE:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

.field public static final enum TWELVE_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

.field private static final synthetic a:[Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;


# instance fields
.field public final value:I


# direct methods
.method public static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    const-string v1, "TEN_MINUTE"

    const/4 v2, 0x0

    const v3, 0x927c0

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->TEN_MINUTE:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    new-instance v1, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    const-string v3, "HALF_HOUR"

    const/4 v4, 0x1

    const v5, 0x1b7740

    invoke-direct {v1, v3, v4, v5}, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->HALF_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    new-instance v3, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    const-string v5, "ONE_HOUR"

    const/4 v6, 0x2

    const v7, 0x36ee80

    invoke-direct {v3, v5, v6, v7}, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->ONE_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    new-instance v5, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    const-string v7, "SIX_HOUR"

    const/4 v8, 0x3

    const v9, 0x1499700

    invoke-direct {v5, v7, v8, v9}, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->SIX_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    new-instance v7, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    const-string v9, "TWELVE_HOUR"

    const/4 v10, 0x4

    const v11, 0x2932e00

    invoke-direct {v7, v9, v10, v11}, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->TWELVE_HOUR:Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->a:[Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

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

    iput p3, p0, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;
    .locals 1

    const-class v0, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    return-object p0
.end method

.method public static values()[Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;
    .locals 1

    sget-object v0, Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->a:[Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    invoke-virtual {v0}, [Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tencent/smtt/sdk/TbsVersionController$IntervalChoice;

    return-object v0
.end method
