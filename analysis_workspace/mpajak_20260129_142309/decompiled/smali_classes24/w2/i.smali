.class public final Lw2/i;
.super Lw2/a;


# static fields
.field public static final d:Lw2/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/i;

    invoke-direct {v0}, Lw2/i;-><init>()V

    sput-object v0, Lw2/i;->d:Lw2/i;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x7

    invoke-direct {p0, v1, v0}, Lw2/a;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final d(Lc3/e;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/d;

    invoke-virtual {p1, p2}, Lq2/d;->c(I)[B

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    const-class v0, [B

    return-object v0
.end method

.method public final r()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final x(Lv2/g;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/sql/SQLException;

    const-string p2, "byte[] type cannot have default values"

    invoke-direct {p1, p2}, Ljava/sql/SQLException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
