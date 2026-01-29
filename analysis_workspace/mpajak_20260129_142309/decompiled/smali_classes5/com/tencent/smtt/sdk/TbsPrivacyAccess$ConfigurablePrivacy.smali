.class public final enum Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/smtt/sdk/TbsPrivacyAccess;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ConfigurablePrivacy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ACTION:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum ANDROID_ID:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum ANDROID_VERSION:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum APP_LIST:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum DEVICE_MODEL:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum IMSI:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum MAC:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum MODEL:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum OAID:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum QB_INSTALLED:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum QIMEI36:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field public static final enum SERIAL:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

.field private static final synthetic b:[Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;


# instance fields
.field public a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v1, "IMSI"

    const/4 v2, 0x0

    const-string v3, "imsi"

    invoke-direct {v0, v1, v2, v3}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->IMSI:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v1, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v3, "ANDROID_ID"

    const/4 v4, 0x1

    const-string v5, "android_id"

    invoke-direct {v1, v3, v4, v5}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->ANDROID_ID:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v3, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v5, "MAC"

    const/4 v6, 0x2

    const-string v7, "mac"

    invoke-direct {v3, v5, v6, v7}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->MAC:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v5, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v7, "ANDROID_VERSION"

    const/4 v8, 0x3

    const-string v9, "android_version"

    invoke-direct {v5, v7, v8, v9}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->ANDROID_VERSION:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v7, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v9, "DEVICE_MODEL"

    const/4 v10, 0x4

    const-string v11, "device_model"

    invoke-direct {v7, v9, v10, v11}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v7, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->DEVICE_MODEL:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v9, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v11, "APP_LIST"

    const/4 v12, 0x5

    const-string v13, "app_list"

    invoke-direct {v9, v11, v12, v13}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v9, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->APP_LIST:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v11, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v13, "QIMEI36"

    const/4 v14, 0x6

    const-string v15, "q36"

    invoke-direct {v11, v13, v14, v15}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v11, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->QIMEI36:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v13, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v15, "MODEL"

    const/4 v14, 0x7

    const-string v12, "model"

    invoke-direct {v13, v15, v14, v12}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v13, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->MODEL:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v12, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v15, "OAID"

    const/16 v14, 0x8

    const-string v10, "oaid"

    invoke-direct {v12, v15, v14, v10}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v12, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->OAID:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v10, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v15, "SERIAL"

    const/16 v14, 0x9

    const-string v8, "serial"

    invoke-direct {v10, v15, v14, v8}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v10, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->SERIAL:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v8, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v15, "ACTION"

    const/16 v14, 0xa

    const-string v6, "action"

    invoke-direct {v8, v15, v14, v6}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v8, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->ACTION:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    new-instance v6, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const-string v15, "QB_INSTALLED"

    const/16 v14, 0xb

    const-string v4, "qb_installed"

    invoke-direct {v6, v15, v14, v4}, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->QB_INSTALLED:Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    const/16 v4, 0xc

    new-array v4, v4, [Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    aput-object v0, v4, v2

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v3, v4, v0

    const/4 v0, 0x3

    aput-object v5, v4, v0

    const/4 v0, 0x4

    aput-object v7, v4, v0

    const/4 v0, 0x5

    aput-object v9, v4, v0

    const/4 v0, 0x6

    aput-object v11, v4, v0

    const/4 v0, 0x7

    aput-object v13, v4, v0

    const/16 v0, 0x8

    aput-object v12, v4, v0

    const/16 v0, 0x9

    aput-object v10, v4, v0

    const/16 v0, 0xa

    aput-object v8, v4, v0

    aput-object v6, v4, v14

    sput-object v4, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->b:[Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;
    .locals 1

    const-class v0, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    return-object p0
.end method

.method public static values()[Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;
    .locals 1

    sget-object v0, Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->b:[Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    invoke-virtual {v0}, [Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/tencent/smtt/sdk/TbsPrivacyAccess$ConfigurablePrivacy;

    return-object v0
.end method
