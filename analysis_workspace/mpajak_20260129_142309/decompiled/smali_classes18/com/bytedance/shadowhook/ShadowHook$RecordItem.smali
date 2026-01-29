.class public final enum Lcom/bytedance/shadowhook/ShadowHook$RecordItem;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bytedance/shadowhook/ShadowHook;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RecordItem"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/bytedance/shadowhook/ShadowHook$RecordItem;",
        ">;"
    }
.end annotation


# static fields
.field private static final $VALUES:[Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum BACKUP_LEN:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum CALLER_LIB_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum ERRNO:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum LIB_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum NEW_ADDR:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum OP:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum STUB:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum SYM_ADDR:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum SYM_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

.field public static final enum TIMESTAMP:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;


# direct methods
.method private static synthetic $values()[Lcom/bytedance/shadowhook/ShadowHook$RecordItem;
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->TIMESTAMP:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->CALLER_LIB_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->OP:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->LIB_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->SYM_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->SYM_ADDR:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->NEW_ADDR:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->BACKUP_LEN:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->ERRNO:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->STUB:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "TIMESTAMP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->TIMESTAMP:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "CALLER_LIB_NAME"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->CALLER_LIB_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "OP"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->OP:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "LIB_NAME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->LIB_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "SYM_NAME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->SYM_NAME:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "SYM_ADDR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->SYM_ADDR:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "NEW_ADDR"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->NEW_ADDR:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "BACKUP_LEN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->BACKUP_LEN:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "ERRNO"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->ERRNO:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    new-instance v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    const-string v1, "STUB"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->STUB:Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    invoke-static {}, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->$values()[Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    move-result-object v0

    sput-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->$VALUES:[Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bytedance/shadowhook/ShadowHook$RecordItem;
    .locals 1

    const-class v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    return-object p0
.end method

.method public static values()[Lcom/bytedance/shadowhook/ShadowHook$RecordItem;
    .locals 1

    sget-object v0, Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->$VALUES:[Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    invoke-virtual {v0}, [Lcom/bytedance/shadowhook/ShadowHook$RecordItem;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/bytedance/shadowhook/ShadowHook$RecordItem;

    return-object v0
.end method
