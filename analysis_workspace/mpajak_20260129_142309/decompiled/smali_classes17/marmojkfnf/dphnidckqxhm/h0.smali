.class public final Lmarmojkfnf/dphnidckqxhm/h0;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmarmojkfnf/dphnidckqxhm/h0$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Landroid/graphics/Bitmap;

.field public d:Landroid/graphics/Bitmap;

.field public e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x75

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lmarmojkfnf/dphnidckqxhm/h0;->a:I

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lmarmojkfnf/dphnidckqxhm/h0;->b:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmarmojkfnf/dphnidckqxhm/h0;->e:Z

    return-void
.end method


# virtual methods
.method public final native a(Landroid/content/Context;)V
.end method

.method public final native a(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V
.end method

.method public final native b(Landroid/content/Context;)Z
.end method
