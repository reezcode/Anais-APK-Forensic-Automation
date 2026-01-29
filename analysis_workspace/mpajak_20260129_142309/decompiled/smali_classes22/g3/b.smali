.class public final Lg3/b;
.super Ljava/lang/Object;


# static fields
.field public static b:Lg3/b;


# instance fields
.field public a:Lt2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt2/g<",
            "Lcom/superbock/bean/AdInfo;",
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

    const-class v1, Lcom/superbock/bean/AdInfo;

    invoke-virtual {v0, v1}, Lr2/b;->b(Ljava/lang/Class;)Lt2/g;

    move-result-object v0

    iput-object v0, p0, Lg3/b;->a:Lt2/g;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static c()Lg3/b;
    .locals 2

    sget-object v0, Lg3/b;->b:Lg3/b;

    if-nez v0, :cond_1

    const-class v0, Lg3/b;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lg3/b;->b:Lg3/b;

    if-nez v1, :cond_0

    new-instance v1, Lg3/b;

    invoke-direct {v1}, Lg3/b;-><init>()V

    sput-object v1, Lg3/b;->b:Lg3/b;

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
    sget-object v0, Lg3/b;->b:Lg3/b;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lg3/b;->a:Lt2/g;

    invoke-interface {v0}, Lt2/g;->h()Lz2/c;

    move-result-object v0

    invoke-virtual {v0}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    const-string v2, "taskId"

    invoke-virtual {v1, v2, p1}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    iget-object p1, p0, Lg3/b;->a:Lt2/g;

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    invoke-interface {p1, v0}, Lt2/g;->m(Lz2/e;)I
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public final b()Lcom/superbock/bean/AdInfo;
    .locals 5

    :try_start_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    iget-object v1, p0, Lg3/b;->a:Lt2/g;

    invoke-interface {v1}, Lt2/g;->c()Lz2/h;

    move-result-object v2

    invoke-virtual {v2}, Lz2/k;->g()Lz2/m;

    move-result-object v2

    const-string v3, "receiptId"

    new-instance v4, Lb3/d;

    invoke-virtual {v2, v3}, Lz2/m;->d(Ljava/lang/String;)Lv2/g;

    move-result-object v3

    invoke-direct {v4, v3}, Lb3/d;-><init>(Lv2/g;)V

    invoke-virtual {v2, v4}, Lz2/m;->a(Lb3/b;)V

    invoke-virtual {v2}, Lz2/m;->b()Lz2/m;

    const-string v3, "startHour"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lz2/m;->g(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v2}, Lz2/m;->b()Lz2/m;

    const-string v3, "endHour"

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Lz2/m;->f(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v2}, Lz2/m;->j()Lz2/f;

    move-result-object v0

    invoke-interface {v1, v0}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/superbock/bean/AdInfo;
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final finalize()V
    .locals 0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    invoke-static {}, Lr2/a;->e()V

    return-void
.end method
