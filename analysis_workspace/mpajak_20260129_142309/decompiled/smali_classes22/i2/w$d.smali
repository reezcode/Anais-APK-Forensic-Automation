.class public final enum Li2/w$d;
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

    const-string v0, "BIG_DECIMAL"

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Li2/w;-><init>(Ljava/lang/String;ILi2/w$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Number;
    .locals 5

    invoke-virtual {p1}, Lp2/a;->K()Ljava/lang/String;

    move-result-object v0

    :try_start_0
    new-instance v1, Ljava/math/BigDecimal;

    invoke-direct {v1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v1

    new-instance v2, Li2/r;

    const-string v3, "Cannot parse "

    const-string v4, "; at path "

    invoke-static {v3, v0, v4}, Landroidx/activity/result/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lp2/a;->q()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1, v1}, Li2/r;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
