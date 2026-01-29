.class public final Lk/d1;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static final a:Lk/d1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/d1;

    invoke-direct {v0}, Lk/d1;-><init>()V

    sput-object v0, Lk/d1;->a:Lk/d1;

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
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/a1;->J(Ljava/lang/String;)V

    return-void
.end method
