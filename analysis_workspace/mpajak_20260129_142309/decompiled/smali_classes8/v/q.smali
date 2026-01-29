.class public final Lv/q;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv/q$a;
    }
.end annotation


# instance fields
.field public final a:Lv/s;

.field public final b:Lv/q$a;


# direct methods
.method public constructor <init>(Landroidx/core/util/Pools$Pool;)V
    .locals 1
    .param p1    # Landroidx/core/util/Pools$Pool;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/core/util/Pools$Pool<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)V"
        }
    .end annotation

    new-instance v0, Lv/s;

    invoke-direct {v0, p1}, Lv/s;-><init>(Landroidx/core/util/Pools$Pool;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lv/q$a;

    invoke-direct {p1}, Lv/q$a;-><init>()V

    iput-object p1, p0, Lv/q;->b:Lv/q$a;

    iput-object v0, p0, Lv/q;->a:Lv/s;

    return-void
.end method
