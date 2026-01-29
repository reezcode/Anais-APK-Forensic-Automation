.class public final Lm3/l0$b;
.super Lq3/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm3/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq3/u<",
        "Lm3/l0$a;",
        ">;"
    }
.end annotation


# instance fields
.field public b:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>(J)V
    .locals 0

    invoke-direct {p0}, Lq3/u;-><init>()V

    iput-wide p1, p0, Lm3/l0$b;->b:J

    return-void
.end method
