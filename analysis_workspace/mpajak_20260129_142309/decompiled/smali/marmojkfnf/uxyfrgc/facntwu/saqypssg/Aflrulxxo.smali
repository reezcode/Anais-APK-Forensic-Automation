.class public Lmarmojkfnf/uxyfrgc/facntwu/saqypssg/Aflrulxxo;
.super Landroid/app/job/JobService;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6a

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/job/JobService;-><init>()V

    return-void
.end method

.method public static native a(Landroid/content/Context;Landroid/content/Intent;)V
.end method


# virtual methods
.method public final native onCreate()V
.end method

.method public final native onStartCommand(Landroid/content/Intent;II)I
.end method

.method public final native onStartJob(Landroid/app/job/JobParameters;)Z
.end method

.method public final native onStopJob(Landroid/app/job/JobParameters;)Z
.end method
