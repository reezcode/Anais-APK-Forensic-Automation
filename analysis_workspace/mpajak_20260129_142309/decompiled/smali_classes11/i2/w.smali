.class public abstract enum Li2/w;
.super Ljava/lang/Enum;

# interfaces
.implements Li2/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li2/w;",
        ">;",
        "Li2/x;"
    }
.end annotation


# static fields
.field public static final enum b:Li2/w$a;

.field public static final enum c:Li2/w$b;

.field public static final enum d:Li2/w$c;

.field public static final enum e:Li2/w$d;

.field public static final synthetic f:[Li2/w;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Li2/w$a;

    invoke-direct {v0}, Li2/w$a;-><init>()V

    sput-object v0, Li2/w;->b:Li2/w$a;

    new-instance v1, Li2/w$b;

    const/4 v2, 0x1

    invoke-direct {v1}, Li2/w$b;-><init>()V

    sput-object v1, Li2/w;->c:Li2/w$b;

    new-instance v3, Li2/w$c;

    const/4 v4, 0x2

    invoke-direct {v3}, Li2/w$c;-><init>()V

    sput-object v3, Li2/w;->d:Li2/w$c;

    new-instance v5, Li2/w$d;

    const/4 v6, 0x3

    invoke-direct {v5}, Li2/w$d;-><init>()V

    sput-object v5, Li2/w;->e:Li2/w$d;

    const/4 v7, 0x4

    new-array v7, v7, [Li2/w;

    const/4 v8, 0x0

    aput-object v0, v7, v8

    aput-object v1, v7, v2

    aput-object v3, v7, v4

    aput-object v5, v7, v6

    sput-object v7, Li2/w;->f:[Li2/w;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILi2/w$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li2/w;
    .locals 1

    const-class v0, Li2/w;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li2/w;

    return-object p0
.end method

.method public static values()[Li2/w;
    .locals 1

    sget-object v0, Li2/w;->f:[Li2/w;

    invoke-virtual {v0}, [Li2/w;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li2/w;

    return-object v0
.end method
