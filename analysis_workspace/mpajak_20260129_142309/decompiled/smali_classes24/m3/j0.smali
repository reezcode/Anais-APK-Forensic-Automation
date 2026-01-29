.class public final Lm3/j0;
.super Ljava/lang/Object;

# interfaces
.implements Lm3/p0;


# instance fields
.field public final b:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lm3/j0;->b:Z

    return-void
.end method


# virtual methods
.method public final a()Lm3/b1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final isActive()Z
    .locals 1

    iget-boolean v0, p0, Lm3/j0;->b:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    const-string v0, "Empty{"

    invoke-static {v0}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lm3/j0;->b:Z

    if-eqz v1, :cond_0

    const-string v1, "Active"

    goto :goto_0

    :cond_0
    const-string v1, "New"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
