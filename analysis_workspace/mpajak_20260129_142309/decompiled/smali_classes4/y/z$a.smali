.class public final Ly/z$a;
.super Ljava/lang/Object;

# interfaces
.implements Ly/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Ly/w;

.field public final b:Ll0/d;


# direct methods
.method public constructor <init>(Ly/w;Ll0/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/z$a;->a:Ly/w;

    iput-object p2, p0, Ly/z$a;->b:Ll0/d;

    return-void
.end method


# virtual methods
.method public final a(Ls/d;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Ly/z$a;->b:Ll0/d;

    iget-object v0, v0, Ll0/d;->c:Ljava/io/IOException;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Ls/d;->d(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Ly/z$a;->a:Ly/w;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Ly/w;->b:[B

    array-length v1, v1

    iput v1, v0, Ly/w;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
