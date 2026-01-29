.class public final Lr0/g;
.super Ljava/lang/Object;

# interfaces
.implements Lr0/a$a;


# instance fields
.field public final synthetic a:Lr0/b;


# direct methods
.method public constructor <init>(Lr0/b;)V
    .locals 0

    iput-object p1, p0, Lr0/g;->a:Lr0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    iget-object v0, p0, Lr0/g;->a:Lr0/b;

    iget-object v0, v0, Lr0/b;->h:Lb1/a;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v1, 0x1

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
