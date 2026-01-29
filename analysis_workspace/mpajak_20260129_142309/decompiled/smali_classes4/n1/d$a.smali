.class public final Ln1/d$a;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Ln1/d$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Ln1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/animation/TypeEvaluator<",
            "Ln1/d$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ln1/d$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln1/d$a;

    invoke-direct {v0}, Ln1/d$a;-><init>()V

    sput-object v0, Ln1/d$a;->b:Ln1/d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln1/d$d;

    invoke-direct {v0}, Ln1/d$d;-><init>()V

    iput-object v0, p0, Ln1/d$a;->a:Ln1/d$d;

    return-void
.end method


# virtual methods
.method public final evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    check-cast p2, Ln1/d$d;

    check-cast p3, Ln1/d$d;

    iget-object v0, p0, Ln1/d$a;->a:Ln1/d$d;

    iget v1, p2, Ln1/d$d;->a:F

    iget v2, p3, Ln1/d$d;->a:F

    invoke-static {v1, v2, p1}, Lk/j0;->n(FFF)F

    move-result v1

    iget v2, p2, Ln1/d$d;->b:F

    iget v3, p3, Ln1/d$d;->b:F

    invoke-static {v2, v3, p1}, Lk/j0;->n(FFF)F

    move-result v2

    iget p2, p2, Ln1/d$d;->c:F

    iget p3, p3, Ln1/d$d;->c:F

    invoke-static {p2, p3, p1}, Lk/j0;->n(FFF)F

    move-result p1

    iput v1, v0, Ln1/d$d;->a:F

    iput v2, v0, Ln1/d$d;->b:F

    iput p1, v0, Ln1/d$d;->c:F

    iget-object p1, p0, Ln1/d$a;->a:Ln1/d$d;

    return-object p1
.end method
