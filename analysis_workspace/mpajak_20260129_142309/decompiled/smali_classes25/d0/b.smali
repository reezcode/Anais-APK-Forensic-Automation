.class public final Ld0/b;
.super Ljava/lang/Object;

# interfaces
.implements Ld0/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld0/e<",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0
    .param p1    # Landroid/content/res/Resources;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/b;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public final a(Lr/w;Lp/h;)Lr/w;
    .locals 0
    .param p1    # Lr/w;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr/w<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lp/h;",
            ")",
            "Lr/w<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Ld0/b;->a:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Ly/u;->c(Landroid/content/res/Resources;Lr/w;)Lr/w;

    move-result-object p1

    return-object p1
.end method
