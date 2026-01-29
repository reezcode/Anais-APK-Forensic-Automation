.class public final Lj3/r0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic b:Lcom/superbock/ui/custom/InputWordsMetaActivity;


# direct methods
.method public constructor <init>(Lcom/superbock/ui/custom/InputWordsMetaActivity;)V
    .locals 0

    iput-object p1, p0, Lj3/r0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 9

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iget-object v1, p0, Lj3/r0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    iget-object v1, v1, Lcom/superbock/ui/custom/InputWordsMetaActivity;->d:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    iget-object v1, p0, Lj3/r0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    iget-object v1, v1, Lcom/superbock/ui/custom/InputWordsMetaActivity;->d:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v0, v1, v0

    iget-object v2, p0, Lj3/r0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    iget v3, v2, Lcom/superbock/ui/custom/InputWordsMetaActivity;->w:I

    if-eq v3, v0, :cond_1

    int-to-double v3, v0

    int-to-double v5, v1

    const-wide v7, 0x3fc3333333333333L    # 0.15

    mul-double v5, v5, v7

    cmpl-double v1, v3, v5

    if-lez v1, :cond_0

    invoke-static {v2}, Lcom/superbock/ui/custom/InputWordsMetaActivity;->a(Lcom/superbock/ui/custom/InputWordsMetaActivity;)V

    goto :goto_0

    :cond_0
    iget-object v1, v2, Lcom/superbock/ui/custom/InputWordsMetaActivity;->l:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    :goto_0
    iget-object v1, p0, Lj3/r0;->b:Lcom/superbock/ui/custom/InputWordsMetaActivity;

    iput v0, v1, Lcom/superbock/ui/custom/InputWordsMetaActivity;->w:I

    return-void
.end method
