.class public final Lk/b;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static final a:Lk/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/b;

    invoke-direct {v0}, Lk/b;-><init>()V

    sput-object v0, Lk/b;->a:Lk/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lk/g0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 0

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    instance-of p3, p2, Ljava/util/concurrent/atomic/LongAdder;

    const-string p4, "value"

    const/16 p5, 0x7b

    if-eqz p3, :cond_0

    check-cast p2, Ljava/util/concurrent/atomic/LongAdder;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/LongAdder;->longValue()J

    move-result-wide p2

    invoke-virtual {p1, p5, p4, p2, p3}, Lk/a1;->s(CLjava/lang/String;J)V

    goto :goto_0

    :cond_0
    instance-of p3, p2, Ljava/util/concurrent/atomic/DoubleAdder;

    if-eqz p3, :cond_1

    check-cast p2, Ljava/util/concurrent/atomic/DoubleAdder;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/DoubleAdder;->doubleValue()D

    move-result-wide p2

    invoke-virtual {p1, p5}, Lk/a1;->write(I)V

    const/4 p5, 0x0

    invoke-virtual {p1, p4}, Lk/a1;->q(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3, p5}, Lk/a1;->p(DZ)V

    :goto_0
    const/16 p2, 0x7d

    invoke-virtual {p1, p2}, Lk/a1;->write(I)V

    :cond_1
    return-void
.end method
