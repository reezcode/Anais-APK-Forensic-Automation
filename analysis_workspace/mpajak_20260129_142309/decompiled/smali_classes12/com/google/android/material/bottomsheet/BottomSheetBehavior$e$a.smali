.class public final Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e$a;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e$a;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;->b:Z

    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;->d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Landroidx/customview/widget/ViewDragHelper;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/customview/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e$a;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;

    iget v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;->a(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e$a;->b:Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;

    iget-object v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;->d:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior$e;->a:I

    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->k(I)V

    :cond_1
    :goto_0
    return-void
.end method
