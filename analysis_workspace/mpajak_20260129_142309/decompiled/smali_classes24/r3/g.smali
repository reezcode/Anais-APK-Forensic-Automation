.class public abstract Lr3/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public b:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public c:Lr3/h;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Lr3/k;->f:Lr3/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lr3/g;->b:J

    iput-object v0, p0, Lr3/g;->c:Lr3/h;

    return-void
.end method

.method public constructor <init>(JLr3/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lr3/g;->b:J

    iput-object p3, p0, Lr3/g;->c:Lr3/h;

    return-void
.end method
