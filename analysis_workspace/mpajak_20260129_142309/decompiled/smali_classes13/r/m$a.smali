.class public final Lr/m$a;
.super Ljava/lang/Object;


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lr/j$d;

.field public final b:Lm0/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Lr/j<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:I


# direct methods
.method public constructor <init>(Lr/j$d;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/m$a$a;

    invoke-direct {v0, p0}, Lr/m$a$a;-><init>(Lr/m$a;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, Lm0/a;->a(ILm0/a$b;)Landroidx/core/util/Pools$Pool;

    move-result-object v0

    check-cast v0, Lm0/a$c;

    iput-object v0, p0, Lr/m$a;->b:Lm0/a$c;

    iput-object p1, p0, Lr/m$a;->a:Lr/j$d;

    return-void
.end method
