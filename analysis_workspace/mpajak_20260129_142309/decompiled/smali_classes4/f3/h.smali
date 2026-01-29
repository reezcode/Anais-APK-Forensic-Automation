.class public final Lf3/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lf3/i$a;


# direct methods
.method public constructor <init>(Lf3/i$a;)V
    .locals 0

    iput-object p1, p0, Lf3/h;->b:Lf3/i$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf3/h;->b:Lf3/i$a;

    iget-object v0, v0, Lf3/i$a;->h:Landroid/content/Context;

    invoke-static {v0}, Lf3/i;->c(Landroid/content/Context;)V

    return-void
.end method
