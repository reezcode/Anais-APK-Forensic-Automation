.class public final La1/i;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:La1/f;

.field public final synthetic c:La1/h;


# direct methods
.method public constructor <init>(La1/h;La1/f;)V
    .locals 0

    iput-object p1, p0, La1/i;->c:La1/h;

    iput-object p2, p0, La1/i;->b:La1/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const-string v0, "EnhancedIntentService"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "bg processing of the intent starting now"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object v0, p0, La1/i;->c:La1/h;

    iget-object v0, v0, La1/h;->a:Lcom/google/android/gms/iid/zze;

    iget-object v1, p0, La1/i;->b:La1/f;

    iget-object v1, v1, La1/f;->a:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/iid/zze;->handleIntent(Landroid/content/Intent;)V

    iget-object v0, p0, La1/i;->b:La1/f;

    invoke-virtual {v0}, La1/f;->a()V

    return-void
.end method
