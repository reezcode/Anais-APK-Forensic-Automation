.class public final Lcom/google/android/material/datepicker/p$c;
.super Lcom/google/android/material/datepicker/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/p;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/material/datepicker/y<",
        "TS;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/p;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/p;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/p$c;->a:Lcom/google/android/material/datepicker/p;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/google/android/material/datepicker/p$c;->a:Lcom/google/android/material/datepicker/p;

    sget v0, Lcom/google/android/material/datepicker/p;->x:I

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/p;->f()V

    iget-object p1, p0, Lcom/google/android/material/datepicker/p$c;->a:Lcom/google/android/material/datepicker/p;

    iget-object v0, p1, Lcom/google/android/material/datepicker/p;->v:Landroid/widget/Button;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/p;->a()Lcom/google/android/material/datepicker/d;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/material/datepicker/d;->f()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
