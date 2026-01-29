.class public final Lv1/k$a;
.super Ly1/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lv1/k;


# direct methods
.method public constructor <init>(Lv1/k;)V
    .locals 0

    iput-object p1, p0, Lv1/k$a;->a:Lv1/k;

    invoke-direct {p0}, Ly1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object p1, p0, Lv1/k$a;->a:Lv1/k;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lv1/k;->d:Z

    iget-object p1, p1, Lv1/k;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv1/k$b;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lv1/k$b;->a()V

    :cond_0
    return-void
.end method

.method public final b(Landroid/graphics/Typeface;Z)V
    .locals 0
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lv1/k$a;->a:Lv1/k;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lv1/k;->d:Z

    iget-object p1, p1, Lv1/k;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv1/k$b;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lv1/k$b;->a()V

    :cond_1
    return-void
.end method
