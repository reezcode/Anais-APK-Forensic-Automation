.class public final Lg3/k;
.super Ljava/lang/Object;


# static fields
.field public static b:Lg3/k;


# instance fields
.field public a:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "Lcom/superbock/bean/JInfo;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    new-instance v0, Lg3/o;

    sget-object v1, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-direct {v0, v1}, Lg3/o;-><init>(Landroid/content/Context;)V

    const-class v1, Lcom/superbock/bean/JInfo;

    invoke-virtual {v0, v1}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    iput-object v0, p0, Lg3/k;->a:Lt2/g;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static b()Lg3/k;
    .locals 2

    sget-object v0, Lg3/k;->b:Lg3/k;

    if-nez v0, :cond_1

    const-class v0, Lg3/k;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/k;->b:Lg3/k;

    if-nez v1, :cond_0

    new-instance v1, Lg3/k;

    invoke-direct {v1}, Lg3/k;-><init>()V

    sput-object v1, Lg3/k;->b:Lg3/k;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_0
    sget-object v0, Lg3/k;->b:Lg3/k;

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/superbock/bean/JInfo;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lg3/k;->a:Lt2/g;

    invoke-interface {v0, p1}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final c(I)Lcom/superbock/bean/JInfo;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lg3/k;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    const-string v1, "ti"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v1
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "ty"

    if-lez p1, :cond_0

    :try_start_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Lz2/m;->e(Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->b()Lz2/m;

    const/4 p1, 0x3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lz2/m;->g(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    :goto_0
    iput-object v1, v0, Lz2/k;->g:Lz2/m;

    iget-object p1, p0, Lg3/k;->a:Lt2/g;

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/JInfo;
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final finalize()V
    .locals 0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-static {}, Lr2/a;->e()V

    return-void
.end method
