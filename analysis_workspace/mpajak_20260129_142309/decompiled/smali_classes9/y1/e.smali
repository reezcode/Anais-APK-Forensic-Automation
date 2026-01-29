.class public final Ly1/e;
.super Ly1/f;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:Ly1/f;

.field public final synthetic d:Ly1/d;


# direct methods
.method public constructor <init>(Ly1/d;Landroid/content/Context;Landroid/text/TextPaint;Ly1/f;)V
    .locals 0

    iput-object p1, p0, Ly1/e;->d:Ly1/d;

    iput-object p2, p0, Ly1/e;->a:Landroid/content/Context;

    iput-object p3, p0, Ly1/e;->b:Landroid/text/TextPaint;

    iput-object p4, p0, Ly1/e;->c:Ly1/f;

    invoke-direct {p0}, Ly1/f;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Ly1/e;->c:Ly1/f;

    invoke-virtual {v0, p1}, Ly1/f;->a(I)V

    return-void
.end method

.method public final b(Landroid/graphics/Typeface;Z)V
    .locals 3
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ly1/e;->d:Ly1/d;

    iget-object v1, p0, Ly1/e;->a:Landroid/content/Context;

    iget-object v2, p0, Ly1/e;->b:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, v2, p1}, Ly1/d;->f(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Ly1/e;->c:Ly1/f;

    invoke-virtual {v0, p1, p2}, Ly1/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
