.class public final Lr/m$b;
.super Ljava/lang/Object;


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lu/a;

.field public final b:Lu/a;

.field public final c:Lu/a;

.field public final d:Lu/a;

.field public final e:Lr/o;

.field public final f:Lr/q$a;

.field public final g:Lm0/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/Pools$Pool<",
            "Lr/n<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu/a;Lu/a;Lu/a;Lu/a;Lr/o;Lr/q$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr/m$b$a;

    invoke-direct {v0, p0}, Lr/m$b$a;-><init>(Lr/m$b;)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, Lm0/a;->a(ILm0/a$b;)Landroidx/core/util/Pools$Pool;

    move-result-object v0

    check-cast v0, Lm0/a$c;

    iput-object v0, p0, Lr/m$b;->g:Lm0/a$c;

    iput-object p1, p0, Lr/m$b;->a:Lu/a;

    iput-object p2, p0, Lr/m$b;->b:Lu/a;

    iput-object p3, p0, Lr/m$b;->c:Lu/a;

    iput-object p4, p0, Lr/m$b;->d:Lu/a;

    iput-object p5, p0, Lr/m$b;->e:Lr/o;

    iput-object p6, p0, Lr/m$b;->f:Lr/q$a;

    return-void
.end method
