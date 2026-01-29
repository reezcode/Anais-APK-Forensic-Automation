.class public final Lv1/i;
.super Ljava/lang/Object;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv1/i$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lv1/i$b;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lv1/i$b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public c:Landroid/animation/ValueAnimator;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public final d:Lv1/i$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv1/i;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lv1/i;->b:Lv1/i$b;

    iput-object v0, p0, Lv1/i;->c:Landroid/animation/ValueAnimator;

    new-instance v0, Lv1/i$a;

    invoke-direct {v0, p0}, Lv1/i$a;-><init>(Lv1/i;)V

    iput-object v0, p0, Lv1/i;->d:Lv1/i$a;

    return-void
.end method


# virtual methods
.method public final a([ILandroid/animation/ValueAnimator;)V
    .locals 1

    new-instance v0, Lv1/i$b;

    invoke-direct {v0, p1, p2}, Lv1/i$b;-><init>([ILandroid/animation/ValueAnimator;)V

    iget-object p1, p0, Lv1/i;->d:Lv1/i$a;

    invoke-virtual {p2, p1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object p1, p0, Lv1/i;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
