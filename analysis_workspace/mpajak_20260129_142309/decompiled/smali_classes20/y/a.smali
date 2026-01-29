.class public final Ly/a;
.super Ljava/lang/Object;

# interfaces
.implements Lp/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lp/j<",
        "TDataType;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lp/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp/j<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lp/j;)V
    .locals 0
    .param p1    # Landroid/content/res/Resources;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lp/j<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/a;->b:Landroid/content/res/Resources;

    iput-object p2, p0, Ly/a;->a:Lp/j;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lp/h;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;",
            "Lp/h;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Ly/a;->a:Lp/j;

    invoke-interface {v0, p1, p2}, Lp/j;->a(Ljava/lang/Object;Lp/h;)Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/lang/Object;IILp/h;)Lr/w;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;II",
            "Lp/h;",
            ")",
            "Lr/w<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ly/a;->a:Lp/j;

    invoke-interface {v0, p1, p2, p3, p4}, Lp/j;->b(Ljava/lang/Object;IILp/h;)Lr/w;

    move-result-object p1

    iget-object p2, p0, Ly/a;->b:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Ly/u;->c(Landroid/content/res/Resources;Lr/w;)Lr/w;

    move-result-object p1

    return-object p1
.end method
