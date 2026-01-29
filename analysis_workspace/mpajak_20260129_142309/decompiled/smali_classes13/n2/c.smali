.class public final Ln2/c;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Ln2/c$a;


# instance fields
.field public final a:Li2/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln2/c$a;

    invoke-direct {v0}, Ln2/c$a;-><init>()V

    sput-object v0, Ln2/c;->b:Ln2/c$a;

    return-void
.end method

.method public constructor <init>(Li2/z;Ln2/c$a;)V
    .locals 0

    invoke-direct {p0}, Li2/z;-><init>()V

    iput-object p1, p0, Ln2/c;->a:Li2/z;

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ln2/c;->a:Li2/z;

    invoke-virtual {v0, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 1

    check-cast p2, Ljava/sql/Timestamp;

    iget-object v0, p0, Ln2/c;->a:Li2/z;

    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void
.end method
