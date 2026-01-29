.class public final Li2/y;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Li2/z;


# direct methods
.method public constructor <init>(Li2/z;)V
    .locals 0

    iput-object p1, p0, Li2/y;->a:Li2/z;

    invoke-direct {p0}, Li2/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/a;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Lp2/a;->N()I

    move-result v0

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lp2/a;->I()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Li2/y;->a:Li2/z;

    invoke-virtual {v0, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/b;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lp2/b;->q()Lp2/b;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li2/y;->a:Li2/z;

    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
