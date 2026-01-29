.class public final Ly1/a;
.super Ly1/f;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/a$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/Typeface;

.field public final b:Ly1/a$a;

.field public c:Z


# direct methods
.method public constructor <init>(Ly1/a$a;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ly1/f;-><init>()V

    iput-object p2, p0, Ly1/a;->a:Landroid/graphics/Typeface;

    iput-object p1, p0, Ly1/a;->b:Ly1/a$a;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    iget-object p1, p0, Ly1/a;->a:Landroid/graphics/Typeface;

    invoke-virtual {p0, p1}, Ly1/a;->c(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public final b(Landroid/graphics/Typeface;Z)V
    .locals 0

    invoke-virtual {p0, p1}, Ly1/a;->c(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public final c(Landroid/graphics/Typeface;)V
    .locals 1

    iget-boolean v0, p0, Ly1/a;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ly1/a;->b:Ly1/a$a;

    check-cast v0, Lv1/c;

    iget-object v0, v0, Lv1/c;->a:Lv1/d;

    invoke-virtual {v0, p1}, Lv1/d;->n(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Lv1/d;->k(Z)V

    :cond_0
    return-void
.end method
