.class public final Li2/g;
.super Li2/z;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Li2/z<",
        "Ljava/util/concurrent/atomic/AtomicLong;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Li2/z;


# direct methods
.method public constructor <init>(Li2/z;)V
    .locals 0

    iput-object p1, p0, Li2/g;->a:Li2/z;

    invoke-direct {p0}, Li2/z;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp2/a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Li2/g;->a:Li2/z;

    invoke-virtual {v0, p1}, Li2/z;->a(Lp2/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    return-object v0
.end method

.method public final b(Lp2/b;Ljava/lang/Object;)V
    .locals 3

    check-cast p2, Ljava/util/concurrent/atomic/AtomicLong;

    iget-object v0, p0, Li2/g;->a:Li2/z;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Li2/z;->b(Lp2/b;Ljava/lang/Object;)V

    return-void
.end method
