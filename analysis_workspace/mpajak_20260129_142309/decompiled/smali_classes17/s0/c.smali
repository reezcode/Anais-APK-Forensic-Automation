.class public final Ls0/c;
.super Ljava/lang/Object;


# instance fields
.field public final a:Landroid/util/SparseIntArray;


# direct methods
.method public constructor <init>()V
    .locals 1

    sget-object v0, Lp0/c;->c:Lp0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Ls0/c;->a:Landroid/util/SparseIntArray;

    return-void
.end method
