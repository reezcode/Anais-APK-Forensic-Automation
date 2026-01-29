.class public final Lw2/e0;
.super Lw2/d0;


# static fields
.field public static final e:Lw2/e0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/e0;

    invoke-direct {v0}, Lw2/e0;-><init>()V

    sput-object v0, Lw2/e0;->e:Lw2/e0;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lw2/d0;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
