.class public final Lb2/g$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lb2/k;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Ls1/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public c:Landroid/content/res/ColorStateList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public d:Landroid/content/res/ColorStateList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public e:Landroid/content/res/ColorStateList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public f:Landroid/content/res/ColorStateList;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public g:Landroid/graphics/PorterDuff$Mode;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public h:Landroid/graphics/Rect;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public m:F

.field public n:F

.field public o:F

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:Z

.field public u:Landroid/graphics/Paint$Style;


# direct methods
.method public constructor <init>(Lb2/g$b;)V
    .locals 2
    .param p1    # Lb2/g$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb2/g$b;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->f:Landroid/content/res/ColorStateList;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lb2/g$b;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lb2/g$b;->h:Landroid/graphics/Rect;

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lb2/g$b;->i:F

    iput v0, p0, Lb2/g$b;->j:F

    const/16 v0, 0xff

    iput v0, p0, Lb2/g$b;->l:I

    const/4 v0, 0x0

    iput v0, p0, Lb2/g$b;->m:F

    iput v0, p0, Lb2/g$b;->n:F

    iput v0, p0, Lb2/g$b;->o:F

    const/4 v0, 0x0

    iput v0, p0, Lb2/g$b;->p:I

    iput v0, p0, Lb2/g$b;->q:I

    iput v0, p0, Lb2/g$b;->r:I

    iput v0, p0, Lb2/g$b;->s:I

    iput-boolean v0, p0, Lb2/g$b;->t:Z

    sget-object v0, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lb2/g$b;->u:Landroid/graphics/Paint$Style;

    iget-object v0, p1, Lb2/g$b;->a:Lb2/k;

    iput-object v0, p0, Lb2/g$b;->a:Lb2/k;

    iget-object v0, p1, Lb2/g$b;->b:Ls1/a;

    iput-object v0, p0, Lb2/g$b;->b:Ls1/a;

    iget v0, p1, Lb2/g$b;->k:F

    iput v0, p0, Lb2/g$b;->k:F

    iget-object v0, p1, Lb2/g$b;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->c:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lb2/g$b;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->d:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lb2/g$b;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lb2/g$b;->g:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, p1, Lb2/g$b;->f:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->f:Landroid/content/res/ColorStateList;

    iget v0, p1, Lb2/g$b;->l:I

    iput v0, p0, Lb2/g$b;->l:I

    iget v0, p1, Lb2/g$b;->i:F

    iput v0, p0, Lb2/g$b;->i:F

    iget v0, p1, Lb2/g$b;->r:I

    iput v0, p0, Lb2/g$b;->r:I

    iget v0, p1, Lb2/g$b;->p:I

    iput v0, p0, Lb2/g$b;->p:I

    iget-boolean v0, p1, Lb2/g$b;->t:Z

    iput-boolean v0, p0, Lb2/g$b;->t:Z

    iget v0, p1, Lb2/g$b;->j:F

    iput v0, p0, Lb2/g$b;->j:F

    iget v0, p1, Lb2/g$b;->m:F

    iput v0, p0, Lb2/g$b;->m:F

    iget v0, p1, Lb2/g$b;->n:F

    iput v0, p0, Lb2/g$b;->n:F

    iget v0, p1, Lb2/g$b;->o:F

    iput v0, p0, Lb2/g$b;->o:F

    iget v0, p1, Lb2/g$b;->q:I

    iput v0, p0, Lb2/g$b;->q:I

    iget v0, p1, Lb2/g$b;->s:I

    iput v0, p0, Lb2/g$b;->s:I

    iget-object v0, p1, Lb2/g$b;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->e:Landroid/content/res/ColorStateList;

    iget-object v0, p1, Lb2/g$b;->u:Landroid/graphics/Paint$Style;

    iput-object v0, p0, Lb2/g$b;->u:Landroid/graphics/Paint$Style;

    iget-object v0, p1, Lb2/g$b;->h:Landroid/graphics/Rect;

    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Rect;

    iget-object p1, p1, Lb2/g$b;->h:Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object v0, p0, Lb2/g$b;->h:Landroid/graphics/Rect;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lb2/k;)V
    .locals 2

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lb2/g$b;->c:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->d:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->e:Landroid/content/res/ColorStateList;

    iput-object v0, p0, Lb2/g$b;->f:Landroid/content/res/ColorStateList;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    iput-object v1, p0, Lb2/g$b;->g:Landroid/graphics/PorterDuff$Mode;

    iput-object v0, p0, Lb2/g$b;->h:Landroid/graphics/Rect;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lb2/g$b;->i:F

    iput v1, p0, Lb2/g$b;->j:F

    const/16 v1, 0xff

    iput v1, p0, Lb2/g$b;->l:I

    const/4 v1, 0x0

    iput v1, p0, Lb2/g$b;->m:F

    iput v1, p0, Lb2/g$b;->n:F

    iput v1, p0, Lb2/g$b;->o:F

    const/4 v1, 0x0

    iput v1, p0, Lb2/g$b;->p:I

    iput v1, p0, Lb2/g$b;->q:I

    iput v1, p0, Lb2/g$b;->r:I

    iput v1, p0, Lb2/g$b;->s:I

    iput-boolean v1, p0, Lb2/g$b;->t:Z

    sget-object v1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    iput-object v1, p0, Lb2/g$b;->u:Landroid/graphics/Paint$Style;

    iput-object p1, p0, Lb2/g$b;->a:Lb2/k;

    iput-object v0, p0, Lb2/g$b;->b:Ls1/a;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lb2/g;

    invoke-direct {v0, p0}, Lb2/g;-><init>(Lb2/g$b;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lb2/g;->f:Z

    return-object v0
.end method
