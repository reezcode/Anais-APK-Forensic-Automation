.class public final Lk/d0;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static a:Lk/d0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/d0;

    invoke-direct {v0}, Lk/d0;-><init>()V

    sput-object v0, Lk/d0;->a:Lk/d0;

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

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lk/a1;->E()V

    return-void

    :cond_0
    check-cast p2, Lf/c;

    invoke-interface {p2}, Lf/c;->l()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/a1;->write(Ljava/lang/String;)V

    return-void
.end method
