.class public final Lk/e;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static final a:Lk/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/e;

    invoke-direct {v0}, Lk/e;-><init>()V

    sput-object v0, Lk/e;->a:Lk/e;

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

    if-nez p2, :cond_0

    iget-object p1, p1, Lk/g0;->j:Lk/a1;

    sget-object p2, Lk/b1;->j:Lk/b1;

    invoke-virtual {p1, p2}, Lk/a1;->I(Lk/b1;)V

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lk/g0;->r(Ljava/lang/String;)V

    return-void
.end method
