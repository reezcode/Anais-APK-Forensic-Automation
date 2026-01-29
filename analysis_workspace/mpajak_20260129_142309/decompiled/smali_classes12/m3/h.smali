.class public final Lm3/h;
.super Lm3/w0;


# instance fields
.field public final f:Lm3/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm3/f<",
            "*>;"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lm3/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm3/f<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lm3/w0;-><init>()V

    iput-object p1, p0, Lm3/h;->f:Lm3/f;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lm3/h;->k(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final k(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lm3/h;->f:Lm3/f;

    invoke-virtual {p0}, Lm3/y0;->l()Lm3/z0;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lm3/z0;->q()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    invoke-virtual {p1}, Lm3/f;->r()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p1, Lm3/f;->e:Lkotlin/coroutines/Continuation;

    check-cast v1, Lq3/e;

    invoke-virtual {v1, v0}, Lq3/e;->i(Ljava/lang/Throwable;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Lm3/f;->c(Ljava/lang/Throwable;)Z

    invoke-virtual {p1}, Lm3/f;->l()V

    :goto_1
    return-void
.end method
