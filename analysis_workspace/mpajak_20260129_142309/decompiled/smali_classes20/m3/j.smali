.class public final Lm3/j;
.super Lm3/w0;

# interfaces
.implements Lm3/i;


# instance fields
.field public final f:Lm3/k;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm3/k;)V
    .locals 0

    invoke-direct {p0}, Lm3/w0;-><init>()V

    iput-object p1, p0, Lm3/j;->f:Lm3/k;

    return-void
.end method


# virtual methods
.method public final d(Ljava/lang/Throwable;)Z
    .locals 3

    invoke-virtual {p0}, Lm3/y0;->l()Lm3/z0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v1, p1, Ljava/util/concurrent/CancellationException;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lm3/z0;->h(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lm3/z0;->t()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm3/j;->k(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lm3/j;->f:Lm3/k;

    invoke-virtual {p0}, Lm3/y0;->l()Lm3/z0;

    move-result-object v0

    invoke-interface {p1, v0}, Lm3/k;->p(Lm3/e1;)V

    return-void
.end method
