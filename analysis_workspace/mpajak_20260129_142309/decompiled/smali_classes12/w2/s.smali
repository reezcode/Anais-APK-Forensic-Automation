.class public final Lw2/s;
.super Lw2/r;


# static fields
.field public static final e:Lw2/s;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/s;

    invoke-direct {v0}, Lw2/s;-><init>()V

    sput-object v0, Lw2/s;->e:Lw2/s;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lw2/r;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
