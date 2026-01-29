.class public final enum Li2/w$b;
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

    const-string v0, "LAZILY_PARSED_NUMBER"

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Li2/w;-><init>(Ljava/lang/String;ILi2/w$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lk2/o;

    invoke-virtual {p1}, Lp2/a;->K()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lk2/o;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
