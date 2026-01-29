.class public final Lcom/superbock/App$a;
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

    iput-object p1, p0, Lcom/superbock/App$a;->b:Lcom/superbock/App;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/superbock/App$a;->b:Lcom/superbock/App;

    invoke-static {v0}, Lcom/superbock/App;->a(Lcom/superbock/App;)V

    return-void
.end method
