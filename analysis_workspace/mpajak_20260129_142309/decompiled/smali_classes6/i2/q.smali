.class public final Li2/q;
.super Li2/n;


# instance fields
.field public final a:Lk2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk2/p<",
            "Ljava/lang/String;",
            "Li2/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Li2/n;-><init>()V

    new-instance v0, Lk2/p;

    invoke-direct {v0}, Lk2/p;-><init>()V

    iput-object v0, p0, Li2/q;->a:Lk2/p;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p1, p0, :cond_1

    instance-of v0, p1, Li2/q;

    if-eqz v0, :cond_0

    check-cast p1, Li2/q;

    iget-object p1, p1, Li2/q;->a:Lk2/p;

    iget-object v0, p0, Li2/q;->a:Lk2/p;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Li2/q;->a:Lk2/p;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
