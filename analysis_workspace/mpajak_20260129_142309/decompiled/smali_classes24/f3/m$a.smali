.class public final Lf3/m$a;
.super Ljava/util/TimerTask;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf3/m;->a(Landroid/content/Context;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Landroid/media/MediaRecorder;

.field public final synthetic c:Ljava/io/File;


# direct methods
.method public constructor <init>(Landroid/media/MediaRecorder;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lf3/m$a;->b:Landroid/media/MediaRecorder;

    iput-object p2, p0, Lf3/m$a;->c:Ljava/io/File;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lf3/m$a;->b:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->stop()V

    iget-object v0, p0, Lf3/m$a;->b:Landroid/media/MediaRecorder;

    invoke-virtual {v0}, Landroid/media/MediaRecorder;->release()V

    iget-object v0, p0, Lf3/m$a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v1

    long-to-int v2, v1

    new-array v1, v2, [B

    :try_start_0
    new-instance v3, Ljava/io/BufferedInputStream;

    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v3, v4}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    const/4 v0, 0x0

    invoke-virtual {v3, v1, v0, v2}, Ljava/io/BufferedInputStream;->read([BII)I

    sget-object v0, Lf3/i;->a:Ls3/g0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const/16 v2, 0x516

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v4, "code"

    invoke-virtual {v0, v4, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "data"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/i;->a:Ls3/g0;

    invoke-virtual {v0}, Lf/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ls3/g0;->b(Ljava/lang/String;)Z

    :goto_0
    invoke-virtual {v3}, Ljava/io/BufferedInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const/4 v1, 0x2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "11"

    invoke-static {v1, v2, v0}, Lf3/i;->n(ILjava/lang/String;Ljava/lang/String;)V

    :goto_1
    iget-object v0, p0, Lf3/m$a;->c:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    return-void
.end method
