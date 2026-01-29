.class public final enum Lp/i;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp/i;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lp/i;

.field public static final enum c:Lp/i;

.field public static final synthetic d:[Lp/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lp/i;

    const-string v1, "SRGB"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp/i;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp/i;->b:Lp/i;

    new-instance v1, Lp/i;

    const-string v3, "DISPLAY_P3"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lp/i;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lp/i;->c:Lp/i;

    const/4 v3, 0x2

    new-array v3, v3, [Lp/i;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lp/i;->d:[Lp/i;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp/i;
    .locals 1

    const-class v0, Lp/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp/i;

    return-object p0
.end method

.method public static values()[Lp/i;
    .locals 1

    sget-object v0, Lp/i;->d:[Lp/i;

    invoke-virtual {v0}, [Lp/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp/i;

    return-object v0
.end method
