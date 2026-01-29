.class public Lcom/tencent/smtt/utils/Timer;
.super Ljava/lang/Object;


# instance fields
.field public final timeOut:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p1, :cond_0

    iput p1, p0, Lcom/tencent/smtt/utils/Timer;->timeOut:I

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "time out can not < 0, current is "

    invoke-static {v1, p1}, Landroidx/appcompat/widget/a;->g(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public onTimeOut()V
    .locals 0

    return-void
.end method
