.class public final Lm3/x0;
.super Lm3/z0;

# interfaces
.implements Lm3/l;


# annotations
.annotation build Lkotlin/PublishedApi;
.end annotation


# instance fields
.field public final c:Z


# direct methods
.method public constructor <init>(Lm3/u0;)V
    .locals 4

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lm3/z0;-><init>(Z)V

    invoke-virtual {p0, p1}, Lm3/z0;->A(Lm3/u0;)V

    invoke-virtual {p0}, Lm3/z0;->v()Lm3/i;

    move-result-object p1

    instance-of v1, p1, Lm3/j;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lm3/j;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lm3/y0;->l()Lm3/z0;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lm3/z0;->t()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {p1}, Lm3/z0;->v()Lm3/i;

    move-result-object p1

    instance-of v3, p1, Lm3/j;

    if-eqz v3, :cond_3

    check-cast p1, Lm3/j;

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lm3/y0;->l()Lm3/z0;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_4
    :goto_2
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lm3/x0;->c:Z

    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 1

    iget-boolean v0, p0, Lm3/x0;->c:Z

    return v0
.end method
