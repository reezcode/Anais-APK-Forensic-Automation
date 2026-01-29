.class public final Li2/i$a;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Li2/z<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Li2/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li2/z<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li2/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Li2/i$a;->a:Li2/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp2/b;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Li2/i$a;->a:Li2/z;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
