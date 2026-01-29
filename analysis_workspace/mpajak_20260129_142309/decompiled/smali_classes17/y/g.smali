.class public final Ly/g;
.super Ljava/lang/Object;

# interfaces
.implements Lp/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp/j<",
        "Ljava/nio/ByteBuffer;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Ly/m;


# direct methods
.method public constructor <init>(Ly/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/g;->a:Ly/m;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lp/h;)Z
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/nio/ByteBuffer;

    iget-object p1, p0, Ly/g;->a:Ly/m;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljava/lang/Object;IILp/h;)Lr/w;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/nio/ByteBuffer;

    sget-object v0, Ll0/a;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ll0/a$a;

    invoke-direct {v0, p1}, Ll0/a$a;-><init>(Ljava/nio/ByteBuffer;)V

    iget-object v1, p0, Ly/g;->a:Ly/m;

    sget-object v6, Ly/m;->k:Ly/m$a;

    new-instance v2, Ly/s$a;

    iget-object p1, v1, Ly/m;->d:Ljava/util/List;

    iget-object v3, v1, Ly/m;->c:Ls/b;

    invoke-direct {v2, v0, p1, v3}, Ly/s$a;-><init>(Ljava/io/InputStream;Ljava/util/List;Ls/b;)V

    move v3, p2

    move v4, p3

    move-object v5, p4

    invoke-virtual/range {v1 .. v6}, Ly/m;->a(Ly/s;IILp/h;Ly/m$b;)Lr/w;

    move-result-object p1

    return-object p1
.end method
