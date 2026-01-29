.class public final enum Lp/c;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lp/c;

.field public static final enum c:Lp/c;

.field public static final enum d:Lp/c;

.field public static final synthetic e:[Lp/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lp/c;

    const-string v1, "SOURCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lp/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lp/c;->b:Lp/c;

    new-instance v1, Lp/c;

    const-string v3, "TRANSFORMED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lp/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lp/c;->c:Lp/c;

    new-instance v3, Lp/c;

    const-string v5, "NONE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lp/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lp/c;->d:Lp/c;

    const/4 v5, 0x3

    new-array v5, v5, [Lp/c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lp/c;->e:[Lp/c;

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

.method public static valueOf(Ljava/lang/String;)Lp/c;
    .locals 1

    const-class v0, Lp/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp/c;

    return-object p0
.end method

.method public static values()[Lp/c;
    .locals 1

    sget-object v0, Lp/c;->e:[Lp/c;

    invoke-virtual {v0}, [Lp/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp/c;

    return-object v0
.end method
