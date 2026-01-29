.class public final enum Ls3/x;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls3/x$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls3/x;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum c:Ls3/x;

.field public static final enum d:Ls3/x;

.field public static final enum e:Ls3/x;
    .annotation runtime Lkotlin/Deprecated;
        message = "OkHttp has dropped support for SPDY. Prefer {@link #HTTP_2}."
    .end annotation
.end field

.field public static final enum f:Ls3/x;

.field public static final enum g:Ls3/x;

.field public static final enum h:Ls3/x;

.field public static final synthetic i:[Ls3/x;

.field public static final j:Ls3/x$a;


# instance fields
.field public final b:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x6

    new-array v0, v0, [Ls3/x;

    new-instance v1, Ls3/x;

    const-string v2, "HTTP_1_0"

    const/4 v3, 0x0

    const-string v4, "http/1.0"

    invoke-direct {v1, v2, v3, v4}, Ls3/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ls3/x;->c:Ls3/x;

    aput-object v1, v0, v3

    new-instance v1, Ls3/x;

    const-string v2, "HTTP_1_1"

    const/4 v3, 0x1

    const-string v4, "http/1.1"

    invoke-direct {v1, v2, v3, v4}, Ls3/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ls3/x;->d:Ls3/x;

    aput-object v1, v0, v3

    new-instance v1, Ls3/x;

    const-string v2, "SPDY_3"

    const/4 v3, 0x2

    const-string v4, "spdy/3.1"

    invoke-direct {v1, v2, v3, v4}, Ls3/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ls3/x;->e:Ls3/x;

    aput-object v1, v0, v3

    new-instance v1, Ls3/x;

    const-string v2, "HTTP_2"

    const/4 v3, 0x3

    const-string v4, "h2"

    invoke-direct {v1, v2, v3, v4}, Ls3/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ls3/x;->f:Ls3/x;

    aput-object v1, v0, v3

    new-instance v1, Ls3/x;

    const-string v2, "H2_PRIOR_KNOWLEDGE"

    const/4 v3, 0x4

    const-string v4, "h2_prior_knowledge"

    invoke-direct {v1, v2, v3, v4}, Ls3/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ls3/x;->g:Ls3/x;

    aput-object v1, v0, v3

    new-instance v1, Ls3/x;

    const-string v2, "QUIC"

    const/4 v3, 0x5

    const-string v4, "quic"

    invoke-direct {v1, v2, v3, v4}, Ls3/x;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Ls3/x;->h:Ls3/x;

    aput-object v1, v0, v3

    sput-object v0, Ls3/x;->i:[Ls3/x;

    new-instance v0, Ls3/x$a;

    invoke-direct {v0}, Ls3/x$a;-><init>()V

    sput-object v0, Ls3/x;->j:Ls3/x$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ls3/x;->b:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ls3/x;
    .locals 1

    const-class v0, Ls3/x;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls3/x;

    return-object p0
.end method

.method public static values()[Ls3/x;
    .locals 1

    sget-object v0, Ls3/x;->i:[Ls3/x;

    invoke-virtual {v0}, [Ls3/x;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls3/x;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls3/x;->b:Ljava/lang/String;

    return-object v0
.end method
