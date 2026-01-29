.class public final Lm3/o0;
.super Ljava/lang/Object;

# interfaces
.implements Lm3/p0;


# instance fields
.field public final b:Lm3/b1;


# direct methods
.method public constructor <init>(Lm3/b1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/o0;->b:Lm3/b1;

    return-void
.end method


# virtual methods
.method public final a()Lm3/b1;
    .locals 1

    iget-object v0, p0, Lm3/o0;->b:Lm3/b1;

    return-object v0
.end method

.method public final isActive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
