.class public final Lcom/superbock/App$c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/App;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/superbock/App;


# direct methods
.method public constructor <init>(Lcom/superbock/App;)V
    .locals 0

    iput-object p1, p0, Lcom/superbock/App$c;->b:Lcom/superbock/App;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    new-instance v0, Lcom/superbock/App$c$a;

    invoke-direct {v0}, Lcom/superbock/App$c$a;-><init>()V

    iget-object v1, p0, Lcom/superbock/App$c;->b:Lcom/superbock/App;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/tencent/smtt/sdk/QbSdk;->initX5Environment(Landroid/content/Context;Lcom/tencent/smtt/sdk/QbSdk$PreInitCallback;)V

    return-void
.end method
