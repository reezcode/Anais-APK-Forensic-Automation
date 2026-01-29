.class public final Lw2/w;
.super Lw2/v;


# static fields
.field public static final e:Lw2/w;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/w;

    invoke-direct {v0}, Lw2/w;-><init>()V

    sput-object v0, Lw2/w;->e:Lw2/w;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lw2/v;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
