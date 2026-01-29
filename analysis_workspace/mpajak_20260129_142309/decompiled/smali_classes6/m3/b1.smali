.class public final Lm3/b1;
.super Lq3/h;

# interfaces
.implements Lm3/p0;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq3/h;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lm3/b1;
    .locals 0

    return-object p0
.end method

.method public final isActive()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lq3/i;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
