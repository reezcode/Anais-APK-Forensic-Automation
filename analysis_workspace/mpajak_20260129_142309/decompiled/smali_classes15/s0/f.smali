.class public final Ls0/f;
.super Ls0/b;


# instance fields
.field public final synthetic b:Landroid/content/Intent;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:I


# direct methods
.method public constructor <init>(Landroid/content/Intent;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Ls0/f;->b:Landroid/content/Intent;

    iput-object p2, p0, Ls0/f;->c:Landroid/app/Activity;

    const/4 p1, 0x2

    iput p1, p0, Ls0/f;->d:I

    invoke-direct {p0}, Ls0/b;-><init>()V

    return-void
.end method
