.class public final Ly1/d$a;
.super Landroidx/core/content/res/ResourcesCompat$FontCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly1/d;->c(Landroid/content/Context;Ly1/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ly1/f;

.field public final synthetic b:Ly1/d;


# direct methods
.method public constructor <init>(Ly1/d;Ly1/f;)V
    .locals 0

    iput-object p1, p0, Ly1/d$a;->b:Ly1/d;

    iput-object p2, p0, Ly1/d$a;->a:Ly1/f;

    invoke-direct {p0}, Landroidx/core/content/res/ResourcesCompat$FontCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFontRetrievalFailed(I)V
    .locals 2

    iget-object v0, p0, Ly1/d$a;->b:Ly1/d;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ly1/d;->m:Z

    iget-object v0, p0, Ly1/d$a;->a:Ly1/f;

    invoke-virtual {v0, p1}, Ly1/f;->a(I)V

    return-void
.end method

.method public final onFontRetrieved(Landroid/graphics/Typeface;)V
    .locals 2
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ly1/d$a;->b:Ly1/d;

    iget v1, v0, Ly1/d;->c:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, v0, Ly1/d;->n:Landroid/graphics/Typeface;

    iget-object p1, p0, Ly1/d$a;->b:Ly1/d;

    const/4 v0, 0x1

    iput-boolean v0, p1, Ly1/d;->m:Z

    iget-object v0, p0, Ly1/d$a;->a:Ly1/f;

    iget-object p1, p1, Ly1/d;->n:Landroid/graphics/Typeface;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ly1/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
