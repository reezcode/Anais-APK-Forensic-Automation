.class public final Lr/l$d;
.super Lr/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lr/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c(Lp/a;)Z
    .locals 1

    sget-object v0, Lp/a;->c:Lp/a;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d(ZLp/a;Lp/c;)Z
    .locals 0

    if-eqz p1, :cond_0

    sget-object p1, Lp/a;->d:Lp/a;

    if-eq p2, p1, :cond_1

    :cond_0
    sget-object p1, Lp/a;->b:Lp/a;

    if-ne p2, p1, :cond_2

    :cond_1
    sget-object p1, Lp/c;->c:Lp/c;

    if-ne p3, p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
