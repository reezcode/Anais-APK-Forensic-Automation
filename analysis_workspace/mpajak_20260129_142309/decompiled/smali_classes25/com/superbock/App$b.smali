.class public final Lcom/superbock/App$b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/superbock/App;->onCreate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    sget-object v0, Lcom/superbock/App;->b:Lcom/superbock/App;

    invoke-static {}, Lg3/n;->c()Lg3/n;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v2, 0x0

    :try_start_0
    iget-object v1, v1, Lg3/n;->a:Lt2/g;

    invoke-interface {v1}, Lt2/g;->f()J

    move-result-wide v4
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    move-wide v4, v2

    :goto_0
    const-wide/16 v6, 0x800

    cmp-long v1, v4, v6

    if-nez v1, :cond_0

    goto :goto_4

    :cond_0
    cmp-long v1, v4, v2

    if-lez v1, :cond_1

    :try_start_1
    invoke-static {}, Lg3/n;->c()Lg3/n;

    move-result-object v1

    iget-object v1, v1, Lg3/n;->a:Lt2/g;

    invoke-interface {v1}, Lt2/g;->h()Lz2/c;

    move-result-object v2

    invoke-virtual {v2}, Lz2/k;->f()La3/e;

    move-result-object v2

    invoke-interface {v1, v2}, Lt2/g;->m(Lz2/e;)I
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_1

    :cond_1
    :try_start_2
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "english.txt"

    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    new-instance v1, Ljava/util/Scanner;

    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v2, 0x0

    :goto_1
    :try_start_4
    invoke-virtual {v1}, Ljava/util/Scanner;->hasNextLine()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Lg3/n;->c()Lg3/n;

    move-result-object v3

    new-instance v4, Lcom/superbock/bean/MInfo;

    invoke-virtual {v1}, Ljava/util/Scanner;->nextLine()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v2}, Lcom/superbock/bean/MInfo;-><init>(Ljava/lang/String;I)V

    iget-object v3, v3, Lg3/n;->a:Lt2/g;

    invoke-interface {v3, v4}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    :try_start_5
    invoke-virtual {v1}, Ljava/util/Scanner;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v0, :cond_4

    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    goto :goto_4

    :catchall_0
    move-exception v2

    :try_start_7
    invoke-virtual {v1}, Ljava/util/Scanner;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v1

    :try_start_8
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :catchall_2
    move-exception v1

    if-eqz v0, :cond_3

    :try_start_9
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    :try_start_a
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    throw v1
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    :catch_1
    :cond_4
    :goto_4
    return-void
.end method
