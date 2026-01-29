.class public final Lz1/a$b;
.super Landroid/graphics/drawable/Drawable$ConstantState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lb2/g;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public b:Z


# direct methods
.method public constructor <init>(Lb2/g;)V
    .locals 0

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    iput-object p1, p0, Lz1/a$b;->a:Lb2/g;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lz1/a$b;->b:Z

    return-void
.end method

.method public constructor <init>(Lz1/a$b;)V
    .locals 1
    .param p1    # Lz1/a$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    iget-object v0, p1, Lz1/a$b;->a:Lb2/g;

    iget-object v0, v0, Lb2/g;->b:Lb2/g$b;

    invoke-virtual {v0}, Lb2/g$b;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Lb2/g;

    iput-object v0, p0, Lz1/a$b;->a:Lb2/g;

    iget-boolean p1, p1, Lz1/a$b;->b:Z

    iput-boolean p1, p0, Lz1/a$b;->b:Z

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Lz1/a;

    new-instance v1, Lz1/a$b;

    invoke-direct {v1, p0}, Lz1/a$b;-><init>(Lz1/a$b;)V

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz1/a;-><init>(Lz1/a$b;Lz1/a$a;)V

    return-object v0
.end method
