.class public final Lv1/p;
.super Ljava/lang/Object;

# interfaces
.implements Landroidx/core/view/OnApplyWindowInsetsListener;


# instance fields
.field public final synthetic a:Lv1/r$a;

.field public final synthetic b:Lv1/r$b;


# direct methods
.method public constructor <init>(Lv1/r$a;Lv1/r$b;)V
    .locals 0

    iput-object p1, p0, Lv1/p;->a:Lv1/r$a;

    iput-object p2, p0, Lv1/p;->b:Lv1/r$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;
    .locals 12

    iget-object v0, p0, Lv1/p;->a:Lv1/r$a;

    iget-object v1, p0, Lv1/p;->b:Lv1/r$b;

    iget v2, v1, Lv1/r$b;->a:I

    iget v3, v1, Lv1/r$b;->b:I

    iget v1, v1, Lv1/r$b;->c:I

    check-cast v0, Li1/b;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->systemBars()I

    move-result v4

    invoke-virtual {p2, v4}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v4

    invoke-static {}, Landroidx/core/view/WindowInsetsCompat$Type;->mandatorySystemGestures()I

    move-result v5

    invoke-virtual {p2, v5}, Landroidx/core/view/WindowInsetsCompat;->getInsets(I)Landroidx/core/graphics/Insets;

    move-result-object v5

    iget-object v6, v0, Li1/b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v7, v4, Landroidx/core/graphics/Insets;->top:I

    iput v7, v6, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    invoke-static {p1}, Lv1/r;->a(Landroid/view/View;)Z

    move-result v6

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v7

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v8

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    iget-object v10, v0, Li1/b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v11, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z

    if-eqz v11, :cond_0

    invoke-virtual {p2}, Landroidx/core/view/WindowInsetsCompat;->getSystemWindowInsetBottom()I

    move-result v7

    iput v7, v10, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:I

    iget-object v7, v0, Li1/b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v7, v7, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:I

    add-int/2addr v7, v1

    :cond_0
    iget-object v1, v0, Li1/b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v10, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-eqz v10, :cond_2

    if-eqz v6, :cond_1

    move v8, v3

    goto :goto_0

    :cond_1
    move v8, v2

    :goto_0
    iget v10, v4, Landroidx/core/graphics/Insets;->left:I

    add-int/2addr v8, v10

    :cond_2
    iget-boolean v1, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    if-eqz v1, :cond_4

    if-eqz v6, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    iget v1, v4, Landroidx/core/graphics/Insets;->right:I

    add-int v9, v2, v1

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v2, v0, Li1/b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->r:Z

    const/4 v6, 0x1

    if-eqz v3, :cond_5

    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v10, v4, Landroidx/core/graphics/Insets;->left:I

    if-eq v3, v10, :cond_5

    iput v10, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    :goto_2
    iget-boolean v10, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    if-eqz v10, :cond_6

    iget v10, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v11, v4, Landroidx/core/graphics/Insets;->right:I

    if-eq v10, v11, :cond_6

    iput v11, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v3, 0x1

    :cond_6
    iget-boolean v2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    if-eqz v2, :cond_7

    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v4, Landroidx/core/graphics/Insets;->top:I

    if-eq v2, v4, :cond_7

    iput v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_3

    :cond_7
    move v6, v3

    :goto_3
    if-eqz v6, :cond_8

    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p1, v8, v1, v9, v7}, Landroid/view/View;->setPadding(IIII)V

    iget-boolean p1, v0, Li1/b;->a:Z

    if-eqz p1, :cond_9

    iget-object v1, v0, Li1/b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v2, v5, Landroidx/core/graphics/Insets;->bottom:I

    iput v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->l:I

    :cond_9
    iget-object v0, v0, Li1/b;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->n:Z

    if-nez v1, :cond_a

    if-eqz p1, :cond_b

    :cond_a
    invoke-virtual {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q()V

    :cond_b
    return-object p2
.end method
