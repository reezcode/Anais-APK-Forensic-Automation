.class public Lcom/blankj/utilcode/util/RomUtils$RomInfo;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/RomUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RomInfo"
.end annotation


# instance fields
.field private name:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Lcom/blankj/utilcode/util/RomUtils$RomInfo;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->name:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$002(Lcom/blankj/utilcode/util/RomUtils$RomInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->name:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic access$102(Lcom/blankj/utilcode/util/RomUtils$RomInfo;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->version:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-string v0, "RomInfo{name="

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/blankj/utilcode/util/RomUtils$RomInfo;->version:Ljava/lang/String;

    const-string v2, "}"

    invoke-static {v0, v1, v2}, Landroidx/appcompat/graphics/drawable/a;->c(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
