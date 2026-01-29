.class public final Lj3/d0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsImActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsImActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/d0;->b:Lcom/superbock/ui/custom/InputWordsImActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lj3/d0;->b:Lcom/superbock/ui/custom/InputWordsImActivity;

    invoke-virtual {p1}, Lcom/superbock/ui/custom/InputWordsImActivity;->onBackPressed()V

    return-void
.end method
