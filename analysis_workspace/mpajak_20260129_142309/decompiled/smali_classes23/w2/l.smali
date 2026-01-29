.class public final Lw2/l;
.super Lw2/m;


# static fields
.field public static final e:Lw2/l;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/l;

    invoke-direct {v0}, Lw2/l;-><init>()V

    sput-object v0, Lw2/l;->e:Lw2/l;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Lw2/m;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final e(Lv2/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/Character;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p2

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final t()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
