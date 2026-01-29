.class public final Lr/j$b;
.super Ljava/lang/Object;

# interfaces
.implements Lr/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Z:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lr/k$a<",
        "TZ;>;"
    }
.end annotation


# instance fields
.field public final a:Lp/a;

.field public final synthetic b:Lr/j;


# direct methods
.method public constructor <init>(Lr/j;Lp/a;)V
    .locals 0

    iput-object p1, p0, Lr/j$b;->b:Lr/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr/j$b;->a:Lp/a;

    return-void
.end method
