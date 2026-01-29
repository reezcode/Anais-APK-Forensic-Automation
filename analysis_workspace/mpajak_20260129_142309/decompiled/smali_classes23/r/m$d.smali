.class public final Lr/m$d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final a:Lr/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr/n<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Lh0/g;

.field public final synthetic c:Lr/m;


# direct methods
.method public constructor <init>(Lr/m;Lh0/g;Lr/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh0/g;",
            "Lr/n<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lr/m$d;->c:Lr/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr/m$d;->b:Lh0/g;

    iput-object p3, p0, Lr/m$d;->a:Lr/n;

    return-void
.end method
