.class public final Li3/w;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/StartupActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/StartupActivity;)V
    .locals 0

    iput-object p1, p0, Li3/w;->b:Lcom/superbock/ui/StartupActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Li3/w;->b:Lcom/superbock/ui/StartupActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method
