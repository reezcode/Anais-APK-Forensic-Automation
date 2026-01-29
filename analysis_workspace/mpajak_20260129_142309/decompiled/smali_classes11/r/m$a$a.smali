.class public final Lr/m$a$a;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/m$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm0/a$b<",
        "Lr/j<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lr/m$a;


# direct methods
.method public constructor <init>(Lr/m$a;)V
    .locals 0

    iput-object p1, p0, Lr/m$a$a;->a:Lr/m$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    new-instance v0, Lr/j;

    iget-object v1, p0, Lr/m$a$a;->a:Lr/m$a;

    iget-object v2, v1, Lr/m$a;->a:Lr/j$d;

    iget-object v1, v1, Lr/m$a;->b:Lm0/a$c;

    invoke-direct {v0, v2, v1}, Lr/j;-><init>(Lr/j$d;Landroidx/core/util/Pools$Pool;)V

    return-object v0
.end method
