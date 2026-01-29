.class public Lw2/h0;
.super Lw2/a;


# static fields
.field public static final d:Lw2/h0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/h0;

    invoke-direct {v0}, Lw2/h0;-><init>()V

    sput-object v0, Lw2/h0;->d:Lw2/h0;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Class;

    const/4 v2, 0x0

    const-class v3, Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-direct {p0, v0, v1}, Lw2/a;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method

.method public constructor <init>([Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lw2/a;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final d(Lc3/e;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/d;

    invoke-virtual {p1, p2}, Lq2/d;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public n()I
    .locals 1

    const/16 v0, 0xff

    return v0
.end method

.method public final x(Lv2/g;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    return-object p2
.end method
