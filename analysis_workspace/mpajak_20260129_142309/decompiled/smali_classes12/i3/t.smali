.class public final Li3/t;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/StartupActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/StartupActivity;)V
    .locals 0

    iput-object p1, p0, Li3/t;->b:Lcom/superbock/ui/StartupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    sget p1, Le3/d;->a:I

    const-string p2, "android.settings.ACCESSIBILITY_SETTINGS"

    const/4 v0, 0x6

    if-ne p1, v0, :cond_0

    :try_start_0
    iget-object p1, p0, Li3/t;->b:Lcom/superbock/ui/StartupActivity;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.samsung.accessibility.installed_service"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    iget-object p1, p0, Li3/t;->b:Lcom/superbock/ui/StartupActivity;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li3/t;->b:Lcom/superbock/ui/StartupActivity;

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_1
    return-void
.end method
