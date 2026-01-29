.class public final Lw2/f0;
.super Lw2/q;


# static fields
.field public static final f:Lw2/f0;

.field public static final g:Lw2/b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw2/f0;

    invoke-direct {v0}, Lw2/f0;-><init>()V

    sput-object v0, Lw2/f0;->f:Lw2/f0;

    new-instance v0, Lw2/b$a;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Lw2/b$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw2/f0;->g:Lw2/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/sql/Date;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lw2/q;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final J(Lv2/g;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/sql/Timestamp;

    new-instance p1, Ljava/sql/Date;

    invoke-virtual {p2}, Ljava/sql/Timestamp;->getTime()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ljava/sql/Date;-><init>(J)V

    return-object p1
.end method

.method public final N()Lw2/b$a;
    .locals 1

    sget-object v0, Lw2/f0;->g:Lw2/b$a;

    return-object v0
.end method

.method public final e(Lv2/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p2, Ljava/sql/Date;

    new-instance p1, Ljava/sql/Timestamp;

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Ljava/sql/Timestamp;-><init>(J)V

    return-object p1
.end method

.method public final m(Ljava/lang/reflect/Field;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ljava/sql/Date;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
