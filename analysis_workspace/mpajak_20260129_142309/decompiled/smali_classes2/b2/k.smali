.class public final Lb2/k;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/k$a;
    }
.end annotation


# instance fields
.field public a:Lb2/d;

.field public b:Lb2/d;

.field public c:Lb2/d;

.field public d:Lb2/d;

.field public e:Lb2/c;

.field public f:Lb2/c;

.field public g:Lb2/c;

.field public h:Lb2/c;

.field public i:Lb2/f;

.field public j:Lb2/f;

.field public k:Lb2/f;

.field public l:Lb2/f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb2/j;

    invoke-direct {v0}, Lb2/j;-><init>()V

    iput-object v0, p0, Lb2/k;->a:Lb2/d;

    new-instance v0, Lb2/j;

    invoke-direct {v0}, Lb2/j;-><init>()V

    iput-object v0, p0, Lb2/k;->b:Lb2/d;

    new-instance v0, Lb2/j;

    invoke-direct {v0}, Lb2/j;-><init>()V

    iput-object v0, p0, Lb2/k;->c:Lb2/d;

    new-instance v0, Lb2/j;

    invoke-direct {v0}, Lb2/j;-><init>()V

    iput-object v0, p0, Lb2/k;->d:Lb2/d;

    new-instance v0, Lb2/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lb2/a;-><init>(F)V

    iput-object v0, p0, Lb2/k;->e:Lb2/c;

    new-instance v0, Lb2/a;

    invoke-direct {v0, v1}, Lb2/a;-><init>(F)V

    iput-object v0, p0, Lb2/k;->f:Lb2/c;

    new-instance v0, Lb2/a;

    invoke-direct {v0, v1}, Lb2/a;-><init>(F)V

    iput-object v0, p0, Lb2/k;->g:Lb2/c;

    new-instance v0, Lb2/a;

    invoke-direct {v0, v1}, Lb2/a;-><init>(F)V

    iput-object v0, p0, Lb2/k;->h:Lb2/c;

    new-instance v0, Lb2/f;

    invoke-direct {v0}, Lb2/f;-><init>()V

    iput-object v0, p0, Lb2/k;->i:Lb2/f;

    new-instance v0, Lb2/f;

    invoke-direct {v0}, Lb2/f;-><init>()V

    iput-object v0, p0, Lb2/k;->j:Lb2/f;

    new-instance v0, Lb2/f;

    invoke-direct {v0}, Lb2/f;-><init>()V

    iput-object v0, p0, Lb2/k;->k:Lb2/f;

    new-instance v0, Lb2/f;

    invoke-direct {v0}, Lb2/f;-><init>()V

    iput-object v0, p0, Lb2/k;->l:Lb2/f;

    return-void
.end method

.method public constructor <init>(Lb2/k$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lb2/k$a;->a:Lb2/d;

    iput-object v0, p0, Lb2/k;->a:Lb2/d;

    iget-object v0, p1, Lb2/k$a;->b:Lb2/d;

    iput-object v0, p0, Lb2/k;->b:Lb2/d;

    iget-object v0, p1, Lb2/k$a;->c:Lb2/d;

    iput-object v0, p0, Lb2/k;->c:Lb2/d;

    iget-object v0, p1, Lb2/k$a;->d:Lb2/d;

    iput-object v0, p0, Lb2/k;->d:Lb2/d;

    iget-object v0, p1, Lb2/k$a;->e:Lb2/c;

    iput-object v0, p0, Lb2/k;->e:Lb2/c;

    iget-object v0, p1, Lb2/k$a;->f:Lb2/c;

    iput-object v0, p0, Lb2/k;->f:Lb2/c;

    iget-object v0, p1, Lb2/k$a;->g:Lb2/c;

    iput-object v0, p0, Lb2/k;->g:Lb2/c;

    iget-object v0, p1, Lb2/k$a;->h:Lb2/c;

    iput-object v0, p0, Lb2/k;->h:Lb2/c;

    iget-object v0, p1, Lb2/k$a;->i:Lb2/f;

    iput-object v0, p0, Lb2/k;->i:Lb2/f;

    iget-object v0, p1, Lb2/k$a;->j:Lb2/f;

    iput-object v0, p0, Lb2/k;->j:Lb2/f;

    iget-object v0, p1, Lb2/k$a;->k:Lb2/f;

    iput-object v0, p0, Lb2/k;->k:Lb2/f;

    iget-object p1, p1, Lb2/k$a;->l:Lb2/f;

    iput-object p1, p0, Lb2/k;->l:Lb2/f;

    return-void
.end method

.method public static a(Landroid/content/Context;IILb2/c;)Lb2/k$a;
    .locals 6
    .param p1    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .param p3    # Lb2/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    if-eqz p2, :cond_0

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, p0, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    move p1, p2

    move-object p0, v0

    :cond_0
    sget-object p2, Li/g;->B:[I

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {p0, p1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    const/4 p2, 0x3

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    const/4 v1, 0x2

    invoke-virtual {p0, v1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    const/4 v2, 0x1

    invoke-virtual {p0, v2, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    const/4 v2, 0x5

    invoke-static {p0, v2, p3}, Lb2/k;->c(Landroid/content/res/TypedArray;ILb2/c;)Lb2/c;

    move-result-object p3

    const/16 v2, 0x8

    invoke-static {p0, v2, p3}, Lb2/k;->c(Landroid/content/res/TypedArray;ILb2/c;)Lb2/c;

    move-result-object v2

    const/16 v3, 0x9

    invoke-static {p0, v3, p3}, Lb2/k;->c(Landroid/content/res/TypedArray;ILb2/c;)Lb2/c;

    move-result-object v3

    const/4 v4, 0x7

    invoke-static {p0, v4, p3}, Lb2/k;->c(Landroid/content/res/TypedArray;ILb2/c;)Lb2/c;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {p0, v5, p3}, Lb2/k;->c(Landroid/content/res/TypedArray;ILb2/c;)Lb2/c;

    move-result-object p3

    new-instance v5, Lb2/k$a;

    invoke-direct {v5}, Lb2/k$a;-><init>()V

    invoke-static {p2}, Lb2/h;->a(I)Lb2/d;

    move-result-object p2

    iput-object p2, v5, Lb2/k$a;->a:Lb2/d;

    invoke-static {p2}, Lb2/k$a;->b(Lb2/d;)V

    iput-object v2, v5, Lb2/k$a;->e:Lb2/c;

    invoke-static {v0}, Lb2/h;->a(I)Lb2/d;

    move-result-object p2

    iput-object p2, v5, Lb2/k$a;->b:Lb2/d;

    invoke-static {p2}, Lb2/k$a;->b(Lb2/d;)V

    iput-object v3, v5, Lb2/k$a;->f:Lb2/c;

    invoke-static {v1}, Lb2/h;->a(I)Lb2/d;

    move-result-object p2

    iput-object p2, v5, Lb2/k$a;->c:Lb2/d;

    invoke-static {p2}, Lb2/k$a;->b(Lb2/d;)V

    iput-object v4, v5, Lb2/k$a;->g:Lb2/c;

    invoke-static {p1}, Lb2/h;->a(I)Lb2/d;

    move-result-object p1

    iput-object p1, v5, Lb2/k$a;->d:Lb2/d;

    invoke-static {p1}, Lb2/k$a;->b(Lb2/d;)V

    iput-object p3, v5, Lb2/k$a;->h:Lb2/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v5

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public static b(Landroid/content/Context;Landroid/util/AttributeSet;II)Lb2/k$a;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/AttrRes;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/StyleRes;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lb2/a;

    const/4 v1, 0x0

    int-to-float v2, v1

    invoke-direct {v0, v2}, Lb2/a;-><init>(F)V

    sget-object v2, Li/g;->v:[I

    invoke-virtual {p0, p1, v2, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    const/4 p3, 0x1

    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-static {p0, p2, p3, v0}, Lb2/k;->a(Landroid/content/Context;IILb2/c;)Lb2/k$a;

    move-result-object p0

    return-object p0
.end method

.method public static c(Landroid/content/res/TypedArray;ILb2/c;)Lb2/c;
    .locals 2
    .param p2    # Lb2/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object p1

    if-nez p1, :cond_0

    return-object p2

    :cond_0
    iget v0, p1, Landroid/util/TypedValue;->type:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    new-instance p2, Lb2/a;

    iget p1, p1, Landroid/util/TypedValue;->data:I

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    invoke-static {p1, p0}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result p0

    int-to-float p0, p0

    invoke-direct {p2, p0}, Lb2/a;-><init>(F)V

    return-object p2

    :cond_1
    const/4 p0, 0x6

    if-ne v0, p0, :cond_2

    new-instance p0, Lb2/i;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p2}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result p1

    invoke-direct {p0, p1}, Lb2/i;-><init>(F)V

    return-object p0

    :cond_2
    return-object p2
.end method


# virtual methods
.method public final d(Landroid/graphics/RectF;)Z
    .locals 5
    .param p1    # Landroid/graphics/RectF;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    const-class v0, Lb2/f;

    iget-object v1, p0, Lb2/k;->l:Lb2/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb2/k;->j:Lb2/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb2/k;->i:Lb2/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb2/k;->k:Lb2/f;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lb2/k;->e:Lb2/c;

    invoke-interface {v1, p1}, Lb2/c;->a(Landroid/graphics/RectF;)F

    move-result v1

    iget-object v4, p0, Lb2/k;->f:Lb2/c;

    invoke-interface {v4, p1}, Lb2/c;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lb2/k;->h:Lb2/c;

    invoke-interface {v4, p1}, Lb2/c;->a(Landroid/graphics/RectF;)F

    move-result v4

    cmpl-float v4, v4, v1

    if-nez v4, :cond_1

    iget-object v4, p0, Lb2/k;->g:Lb2/c;

    invoke-interface {v4, p1}, Lb2/c;->a(Landroid/graphics/RectF;)F

    move-result p1

    cmpl-float p1, p1, v1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object v1, p0, Lb2/k;->b:Lb2/d;

    instance-of v1, v1, Lb2/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lb2/k;->a:Lb2/d;

    instance-of v1, v1, Lb2/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lb2/k;->c:Lb2/d;

    instance-of v1, v1, Lb2/j;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lb2/k;->d:Lb2/d;

    instance-of v1, v1, Lb2/j;

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    return v2
.end method

.method public final e(F)Lb2/k;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lb2/k$a;

    invoke-direct {v0, p0}, Lb2/k$a;-><init>(Lb2/k;)V

    invoke-virtual {v0, p1}, Lb2/k$a;->e(F)Lb2/k$a;

    invoke-virtual {v0, p1}, Lb2/k$a;->f(F)Lb2/k$a;

    invoke-virtual {v0, p1}, Lb2/k$a;->d(F)Lb2/k$a;

    invoke-virtual {v0, p1}, Lb2/k$a;->c(F)Lb2/k$a;

    invoke-virtual {v0}, Lb2/k$a;->a()Lb2/k;

    move-result-object p1

    return-object p1
.end method
