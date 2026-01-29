.class public abstract enum Li2/v;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li2/v;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Li2/v$a;

.field public static final enum c:Li2/v$b;

.field public static final synthetic d:[Li2/v;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Li2/v$a;

    invoke-direct {v0}, Li2/v$a;-><init>()V

    sput-object v0, Li2/v;->b:Li2/v$a;

    new-instance v1, Li2/v$b;

    const/4 v2, 0x1

    invoke-direct {v1}, Li2/v$b;-><init>()V

    sput-object v1, Li2/v;->c:Li2/v$b;

    const/4 v3, 0x2

    new-array v3, v3, [Li2/v;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    aput-object v1, v3, v2

    sput-object v3, Li2/v;->d:[Li2/v;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILi2/v$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li2/v;
    .locals 1

    const-class v0, Li2/v;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li2/v;

    return-object p0
.end method

.method public static values()[Li2/v;
    .locals 1

    sget-object v0, Li2/v;->d:[Li2/v;

    invoke-virtual {v0}, [Li2/v;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li2/v;

    return-object v0
.end method
