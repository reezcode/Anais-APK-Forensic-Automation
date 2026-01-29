.class public final Lg3/n;
.super Ljava/lang/Object;


# static fields
.field public static b:Lg3/n;


# instance fields
.field public a:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "Lcom/superbock/bean/MInfo;",
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

    const-class v1, Lcom/superbock/bean/MInfo;

    invoke-virtual {v0, v1}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    iput-object v0, p0, Lg3/n;->a:Lt2/g;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static c()Lg3/n;
    .locals 2

    sget-object v0, Lg3/n;->b:Lg3/n;

    if-nez v0, :cond_1

    const-class v0, Lg3/n;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/n;->b:Lg3/n;

    if-nez v1, :cond_0

    new-instance v1, Lg3/n;

    invoke-direct {v1}, Lg3/n;-><init>()V

    sput-object v1, Lg3/n;->b:Lg3/n;

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
    sget-object v0, Lg3/n;->b:Lg3/n;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "J)",
            "Ljava/util/List<",
            "Lcom/superbock/bean/MInfo;",
            ">;"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lg3/n;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    const-string v1, "idx"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    const-wide/16 v1, 0xa

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iput-object v1, v0, Lz2/h;->m:Ljava/lang/Long;

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    const-string v2, "id"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "%"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Lz2/m;->h(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    iget-object p1, p0, Lg3/n;->a:Lt2/g;

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Ljava/lang/String;)I
    .locals 3

    :try_start_0
    iget-object v0, p0, Lg3/n;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v1

    invoke-virtual {v1}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v1, v2, p1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->j()Lz2/f;

    move-result-object p1

    invoke-interface {v0, p1}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/superbock/bean/MInfo;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/superbock/bean/MInfo;->getIdx()I

    move-result p1
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public final finalize()V
    .locals 0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-static {}, Lr2/a;->e()V

    return-void
.end method
