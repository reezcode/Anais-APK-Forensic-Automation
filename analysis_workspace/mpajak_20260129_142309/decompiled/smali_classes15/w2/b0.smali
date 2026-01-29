.class public final Lw2/b0;
.super Lw2/z;


# static fields
.field public static final e:Lw2/b0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/b0;

    invoke-direct {v0}, Lw2/b0;-><init>()V

    sput-object v0, Lw2/b0;->e:Lw2/b0;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lw2/z;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
