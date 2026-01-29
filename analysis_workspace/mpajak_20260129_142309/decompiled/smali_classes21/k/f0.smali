.class public final Lk/f0;
.super Ljava/lang/Object;

# interfaces
.implements Lk/q0;


# static fields
.field public static a:Lk/f0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk/f0;

    invoke-direct {v0}, Lk/f0;-><init>()V

    sput-object v0, Lk/f0;->a:Lk/f0;

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

    check-cast p2, Lk/e0;

    invoke-interface {p2, p1, p5}, Lk/e0;->a(Lk/g0;I)V

    return-void
.end method
