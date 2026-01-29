.class public Lw2/d0;
.super Lw2/a;


# static fields
.field public static final d:Lw2/d0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw2/d0;

    invoke-direct {v0}, Lw2/d0;-><init>()V

    sput-object v0, Lw2/d0;->d:Lw2/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/lang/Short;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    invoke-direct {p0, v1, v0}, Lw2/a;-><init>(I[Ljava/lang/Class;)V

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

    const/16 v0, 0x8

    invoke-direct {p0, v0, p1}, Lw2/a;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final d(Lc3/e;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq2/d;

    iget-object p1, p1, Lq2/d;->a:Landroid/database/Cursor;

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getShort(I)S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1
.end method

.method public final j()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1

    :cond_0
    check-cast p1, Ljava/lang/Short;

    invoke-virtual {p1}, Ljava/lang/Short;->shortValue()S

    move-result p1

    add-int/2addr p1, v0

    int-to-short p1, p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1
.end method

.method public final x(Lv2/g;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-static {p2}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    move-result p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    return-object p1
.end method
