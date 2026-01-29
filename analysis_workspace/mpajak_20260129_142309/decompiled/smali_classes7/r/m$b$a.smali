.class public final Lr/m$b$a;
.super Ljava/lang/Object;

# interfaces
.implements Lm0/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/m$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm0/a$b<",
        "Lr/n<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lr/m$b;


# direct methods
.method public constructor <init>(Lr/m$b;)V
    .locals 0

    iput-object p1, p0, Lr/m$b$a;->a:Lr/m$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 9

    new-instance v8, Lr/n;

    iget-object v0, p0, Lr/m$b$a;->a:Lr/m$b;

    iget-object v1, v0, Lr/m$b;->a:Lu/a;

    iget-object v2, v0, Lr/m$b;->b:Lu/a;

    iget-object v3, v0, Lr/m$b;->c:Lu/a;

    iget-object v4, v0, Lr/m$b;->d:Lu/a;

    iget-object v5, v0, Lr/m$b;->e:Lr/o;

    iget-object v6, v0, Lr/m$b;->f:Lr/q$a;

    iget-object v7, v0, Lr/m$b;->g:Lm0/a$c;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lr/n;-><init>(Lu/a;Lu/a;Lu/a;Lu/a;Lr/o;Lr/q$a;Landroidx/core/util/Pools$Pool;)V

    return-object v8
.end method
