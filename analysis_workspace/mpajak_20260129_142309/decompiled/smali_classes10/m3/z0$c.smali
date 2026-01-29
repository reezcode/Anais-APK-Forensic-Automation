.class public final Lm3/z0$c;
.super Lq3/i$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm3/z0;->d(Ljava/lang/Object;Lm3/b1;Lm3/y0;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic d:Lm3/z0;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq3/i;Lm3/z0;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lm3/z0$c;->d:Lm3/z0;

    iput-object p3, p0, Lm3/z0$c;->e:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lq3/i$a;-><init>(Lq3/i;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq3/i;

    iget-object p1, p0, Lm3/z0$c;->d:Lm3/z0;

    invoke-virtual {p1}, Lm3/z0;->x()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lm3/z0$c;->e:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    sget-object p1, Ld1/c;->h:Lq3/r;

    :goto_1
    return-object p1
.end method
