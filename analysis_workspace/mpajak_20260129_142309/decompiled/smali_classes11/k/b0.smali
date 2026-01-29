.class public final Lk/b0;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static a:Lk/b0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/b0;

    invoke-direct {v0}, Lk/b0;-><init>()V

    sput-object v0, Lk/b0;->a:Lk/b0;

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

    iget-object p3, p1, Lk/g0;->j:Lk/a1;

    instance-of p3, p2, Lcom/google/common/collect/Multimap;

    if-eqz p3, :cond_0

    check-cast p2, Lcom/google/common/collect/Multimap;

    invoke-interface {p2}, Lcom/google/common/collect/Multimap;->asMap()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/g0;->q(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
