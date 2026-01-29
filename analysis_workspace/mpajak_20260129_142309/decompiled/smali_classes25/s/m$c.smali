.class public final Ls/m$c;
.super Ls/c;


# annotations
.annotation build Landroidx/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls/c<",
        "Ls/m$b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ls/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ls/l;
    .locals 1

    new-instance v0, Ls/m$b;

    invoke-direct {v0, p0}, Ls/m$b;-><init>(Ls/m$c;)V

    return-object v0
.end method

.method public final d(ILandroid/graphics/Bitmap$Config;)Ls/m$b;
    .locals 1

    invoke-virtual {p0}, Ls/c;->b()Ls/l;

    move-result-object v0

    check-cast v0, Ls/m$b;

    iput p1, v0, Ls/m$b;->b:I

    iput-object p2, v0, Ls/m$b;->c:Landroid/graphics/Bitmap$Config;

    return-object v0
.end method
