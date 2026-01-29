.class public final enum Li2/w$a;
.super Li2/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4011
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "DOUBLE"

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Li2/w;-><init>(Ljava/lang/String;ILi2/w$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Number;
    .locals 2

    invoke-virtual {p1}, Lp2/a;->y()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
