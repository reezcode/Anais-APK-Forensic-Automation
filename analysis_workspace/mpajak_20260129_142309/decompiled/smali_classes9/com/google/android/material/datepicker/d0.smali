.class public final Lcom/google/android/material/datepicker/d0;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lcom/google/android/material/datepicker/e0;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/e0;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/d0;->c:Lcom/google/android/material/datepicker/e0;

    iput p2, p0, Lcom/google/android/material/datepicker/d0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget p1, p0, Lcom/google/android/material/datepicker/d0;->b:I

    iget-object v0, p0, Lcom/google/android/material/datepicker/d0;->c:Lcom/google/android/material/datepicker/e0;

    iget-object v0, v0, Lcom/google/android/material/datepicker/e0;->a:Lcom/google/android/material/datepicker/h;

    iget-object v0, v0, Lcom/google/android/material/datepicker/h;->f:Lcom/google/android/material/datepicker/u;

    iget v0, v0, Lcom/google/android/material/datepicker/u;->c:I

    invoke-static {p1, v0}, Lcom/google/android/material/datepicker/u;->k(II)Lcom/google/android/material/datepicker/u;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/d0;->c:Lcom/google/android/material/datepicker/e0;

    iget-object v0, v0, Lcom/google/android/material/datepicker/e0;->a:Lcom/google/android/material/datepicker/h;

    iget-object v0, v0, Lcom/google/android/material/datepicker/h;->e:Lcom/google/android/material/datepicker/a;

    iget-object v1, v0, Lcom/google/android/material/datepicker/a;->b:Lcom/google/android/material/datepicker/u;

    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/u;->j(Lcom/google/android/material/datepicker/u;)I

    move-result v1

    if-gez v1, :cond_0

    iget-object p1, v0, Lcom/google/android/material/datepicker/a;->b:Lcom/google/android/material/datepicker/u;

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/google/android/material/datepicker/a;->c:Lcom/google/android/material/datepicker/u;

    invoke-virtual {p1, v1}, Lcom/google/android/material/datepicker/u;->j(Lcom/google/android/material/datepicker/u;)I

    move-result v1

    if-lez v1, :cond_1

    iget-object p1, v0, Lcom/google/android/material/datepicker/a;->c:Lcom/google/android/material/datepicker/u;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/d0;->c:Lcom/google/android/material/datepicker/e0;

    iget-object v0, v0, Lcom/google/android/material/datepicker/e0;->a:Lcom/google/android/material/datepicker/h;

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/h;->d(Lcom/google/android/material/datepicker/u;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/d0;->c:Lcom/google/android/material/datepicker/e0;

    iget-object p1, p1, Lcom/google/android/material/datepicker/e0;->a:Lcom/google/android/material/datepicker/h;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/h;->e(I)V

    return-void
.end method
