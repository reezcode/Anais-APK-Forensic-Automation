.class public abstract Lw2/b;
.super Lw2/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw2/b$a;
    }
.end annotation


# static fields
.field public static final d:Lw2/b$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw2/b$a;

    const-string v1, "yyyy-MM-dd HH:mm:ss.SSSSSS"

    invoke-direct {v0, v1}, Lw2/b$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lw2/b;->d:Lw2/b$a;

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lw2/a;-><init>(I[Ljava/lang/Class;)V

    return-void
.end method

.method public static M(Lv2/g;Lw2/b$a;)Lw2/b$a;
    .locals 0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object p0, p0, Lv2/g;->n:Ljava/lang/Object;

    check-cast p0, Lw2/b$a;

    if-nez p0, :cond_1

    return-object p1

    :cond_1
    return-object p0
.end method


# virtual methods
.method public final l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public m(Ljava/lang/reflect/Field;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Ljava/util/Date;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p1

    :cond_0
    check-cast p1, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/Date;

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p1
.end method
