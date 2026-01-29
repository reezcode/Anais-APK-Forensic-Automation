.class public final Lo3/d;
.super Ljava/lang/Object;

# interfaces
.implements Lo3/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo3/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private volatile synthetic _state:Ljava/lang/Object;

.field public a:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo3/d;->_state:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final setValue(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lp3/a;->a:Lq3/r;

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lo3/d;->_state:Ljava/lang/Object;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v0, :cond_1

    :goto_0
    monitor-exit p0

    goto :goto_2

    :cond_1
    :try_start_1
    iput-object p1, p0, Lo3/d;->_state:Ljava/lang/Object;

    iget p1, p0, Lo3/d;->a:I

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_3

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lo3/d;->a:I

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    :goto_1
    monitor-enter p0

    :try_start_2
    iget v0, p0, Lo3/d;->a:I

    if-ne v0, p1, :cond_2

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lo3/d;->a:I

    goto :goto_0

    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    move p1, v0

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_3
    add-int/lit8 p1, p1, 0x2

    :try_start_3
    iput p1, p0, Lo3/d;->a:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :goto_2
    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method
