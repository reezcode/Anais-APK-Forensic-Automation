.class public final Lcom/google/android/material/textfield/b$f$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/textfield/b$f;->a(Lcom/google/android/material/textfield/TextInputLayout;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/widget/AutoCompleteTextView;

.field public final synthetic c:Lcom/google/android/material/textfield/b$f;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/b$f;Landroid/widget/AutoCompleteTextView;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/textfield/b$f$a;->c:Lcom/google/android/material/textfield/b$f;

    iput-object p2, p0, Lcom/google/android/material/textfield/b$f$a;->b:Landroid/widget/AutoCompleteTextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/textfield/b$f$a;->b:Landroid/widget/AutoCompleteTextView;

    iget-object v1, p0, Lcom/google/android/material/textfield/b$f$a;->c:Lcom/google/android/material/textfield/b$f;

    iget-object v1, v1, Lcom/google/android/material/textfield/b$f;->a:Lcom/google/android/material/textfield/b;

    iget-object v1, v1, Lcom/google/android/material/textfield/b;->e:Lcom/google/android/material/textfield/b$a;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method
