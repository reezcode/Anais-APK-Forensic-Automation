.class public final Lr/g;
.super Ljava/lang/Object;

# interfaces
.implements Lt/a$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt/a$b;"
    }
.end annotation


# instance fields
.field public final a:Lp/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/d<",
            "TDataType;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TDataType;"
        }
    .end annotation
.end field

.field public final c:Lp/h;


# direct methods
.method public constructor <init>(Lp/d;Ljava/lang/Object;Lp/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp/d<",
            "TDataType;>;TDataType;",
            "Lp/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr/g;->a:Lp/d;

    iput-object p2, p0, Lr/g;->b:Ljava/lang/Object;

    iput-object p3, p0, Lr/g;->c:Lp/h;

    return-void
.end method
