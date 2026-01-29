.class public final Lm3/c0;
.super Ljava/lang/Object;


# static fields
.field public static final a:Lm3/d0;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "kotlinx.coroutines.main.delay"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Li/g;->B(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lm3/h0;->a:Lr3/c;

    sget-object v0, Lq3/m;->a:Lm3/a1;

    invoke-virtual {v0}, Lm3/a1;->y()Lm3/a1;

    instance-of v1, v0, Lm3/d0;

    if-nez v1, :cond_1

    :goto_0
    sget-object v0, Lm3/b0;->h:Lm3/b0;

    goto :goto_1

    :cond_1
    check-cast v0, Lm3/d0;

    :goto_1
    sput-object v0, Lm3/c0;->a:Lm3/d0;

    return-void
.end method
