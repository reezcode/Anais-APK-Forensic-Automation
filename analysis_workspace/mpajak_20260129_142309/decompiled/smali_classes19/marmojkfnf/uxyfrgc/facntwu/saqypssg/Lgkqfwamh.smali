.class public Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Lgkqfwamh;
.super Landroidx/work/Worker;


# static fields
.field public static a:J

.field public static final b:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x54

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    return-void
.end method


# virtual methods
.method public final native doWork()Landroidx/work/ListenableWorker$Result;
.end method

.method public final native onStopped()V
.end method
