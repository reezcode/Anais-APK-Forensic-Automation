.class public final enum Lx2/b$a;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx2/b$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Lx2/b$a;

.field public static final enum d:Lx2/b$a;

.field public static final enum e:Lx2/b$a;

.field public static final enum f:Lx2/b$a;

.field public static final enum g:Lx2/b$a;

.field public static final synthetic h:[Lx2/b$a;


# instance fields
.field public b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 14

    new-instance v0, Lx2/b$a;

    const-string v1, "TRACE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lx2/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lx2/b$a;->c:Lx2/b$a;

    new-instance v1, Lx2/b$a;

    const-string v4, "DEBUG"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lx2/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lx2/b$a;->d:Lx2/b$a;

    new-instance v4, Lx2/b$a;

    const-string v6, "INFO"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lx2/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lx2/b$a;->e:Lx2/b$a;

    new-instance v6, Lx2/b$a;

    const-string v8, "WARNING"

    const/4 v9, 0x4

    invoke-direct {v6, v8, v7, v9}, Lx2/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lx2/b$a;->f:Lx2/b$a;

    new-instance v8, Lx2/b$a;

    const-string v10, "ERROR"

    const/4 v11, 0x5

    invoke-direct {v8, v10, v9, v11}, Lx2/b$a;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lx2/b$a;->g:Lx2/b$a;

    new-instance v10, Lx2/b$a;

    const-string v12, "FATAL"

    const/4 v13, 0x6

    invoke-direct {v10, v12, v11, v13}, Lx2/b$a;-><init>(Ljava/lang/String;II)V

    new-array v12, v13, [Lx2/b$a;

    aput-object v0, v12, v2

    aput-object v1, v12, v3

    aput-object v4, v12, v5

    aput-object v6, v12, v7

    aput-object v8, v12, v9

    aput-object v10, v12, v11

    sput-object v12, Lx2/b$a;->h:[Lx2/b$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lx2/b$a;->b:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lx2/b$a;
    .locals 1

    const-class v0, Lx2/b$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx2/b$a;

    return-object p0
.end method

.method public static values()[Lx2/b$a;
    .locals 1

    sget-object v0, Lx2/b$a;->h:[Lx2/b$a;

    invoke-virtual {v0}, [Lx2/b$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx2/b$a;

    return-object v0
.end method
