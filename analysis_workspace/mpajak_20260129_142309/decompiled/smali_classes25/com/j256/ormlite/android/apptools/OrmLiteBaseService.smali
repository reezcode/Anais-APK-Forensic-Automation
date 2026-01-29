.class public abstract Lcom/j256/ormlite/android/apptools/OrmLiteBaseService;
.super Landroid/app/Service;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<H:",
        "Lr2/b;",
        ">",
        "Landroid/app/Service;"
    }
.end annotation


# instance fields
.field public volatile b:Lr2/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TH;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate()V
    .locals 1

    iget-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseService;->b:Lr2/b;

    if-nez v0, :cond_0

    invoke-static {p0}, Lr2/a;->a(Landroid/content/Context;)Lr2/b;

    move-result-object v0

    iput-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseService;->b:Lr2/b;

    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-static {}, Lr2/a;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/j256/ormlite/android/apptools/OrmLiteBaseService;->b:Lr2/b;

    return-void
.end method
