.class public final Lm4/g;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm4/g$a;
    }
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:I

.field public c:Lm4/h;

.field public d:Lm4/b;

.field public e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm4/d;",
            ">;"
        }
    .end annotation
.end field

.field public f:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lm4/g$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p0, Lm4/g;->a:Ljava/lang/String;

    iget-object v0, p1, Lm4/g$a;->e:Ljava/util/ArrayList;

    iput-object v0, p0, Lm4/g;->e:Ljava/util/ArrayList;

    iget-object v0, p1, Lm4/g$a;->c:Lm4/h;

    iput-object v0, p0, Lm4/g;->c:Lm4/h;

    iget v0, p1, Lm4/g$a;->b:I

    iput v0, p0, Lm4/g;->b:I

    iget-object p1, p1, Lm4/g$a;->d:Lm4/b;

    iput-object p1, p0, Lm4/g;->d:Lm4/b;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lm4/g;->f:Landroid/os/Handler;

    return-void
.end method

.method public static a(Lm4/g;Landroid/content/Context;Lm4/d;)Ljava/io/File;
    .locals 7

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, ".jpg"

    sget-object v1, Lm4/a;->c:Lm4/a;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v1, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-interface {p2}, Lm4/d;->open()Ljava/io/InputStream;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget-object v2, v2, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v3, "image/"

    const-string v4, "."

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v2, v0

    :goto_0
    iget-object v3, p0, Lm4/g;->a:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0, p1}, Lm4/g;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lm4/g;->a:Ljava/lang/String;

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lm4/g;->a:Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    const-wide v5, 0x408f400000000000L    # 1000.0

    mul-double v3, v3, v5

    double-to-int v3, v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v2

    :goto_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lm4/g;->d:Lm4/b;

    if-eqz p1, :cond_4

    invoke-interface {p2}, Lm4/d;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v2, ".gif"

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    if-eqz v1, :cond_3

    sget-object p1, Lm4/a;->c:Lm4/a;

    iget p0, p0, Lm4/g;->b:I

    invoke-interface {p2}, Lm4/d;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p0, v1}, Lm4/a;->a(ILjava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    new-instance p0, Lm4/c;

    invoke-direct {p0, p2, v0}, Lm4/c;-><init>(Lm4/d;Ljava/io/File;)V

    goto :goto_3

    :cond_3
    new-instance p0, Ljava/io/File;

    invoke-interface {p2}, Lm4/d;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    sget-object p1, Lm4/a;->c:Lm4/a;

    iget p0, p0, Lm4/g;->b:I

    invoke-interface {p2}, Lm4/d;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, p0, v1}, Lm4/a;->a(ILjava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_5

    new-instance p0, Lm4/c;

    invoke-direct {p0, p2, v0}, Lm4/c;-><init>(Lm4/d;Ljava/io/File;)V

    :goto_3
    invoke-virtual {p0}, Lm4/c;->a()Ljava/io/File;

    move-result-object p0

    goto :goto_4

    :cond_5
    new-instance p0, Ljava/io/File;

    invoke-interface {p2}, Lm4/d;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :goto_4
    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)Ljava/io/File;
    .locals 3

    invoke-virtual {p1}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    new-instance v1, Ljava/io/File;

    const-string v2, "luban_disk_cache"

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    goto :goto_0

    :cond_1
    const/4 p1, 0x6

    const-string v1, "Luban"

    invoke-static {v1, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "default disk cache dir is null"

    invoke-static {v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    :goto_0
    return-object v0
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 5

    iget-object v0, p0, Lm4/g;->c:Lm4/h;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget v2, p1, Landroid/os/Message;->what:I

    if-eqz v2, :cond_3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Throwable;

    check-cast v0, Lk3/f$j;

    iget-object p1, v0, Lk3/f$j;->c:Ljava/io/File;

    iget-object v2, v0, Lk3/f$j;->a:Lcom/superbock/bean/EInfo;

    iget-object v0, v0, Lk3/f$j;->b:Landroid/content/Context;

    invoke-static {}, Lk/j0;->k()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lk3/g;

    invoke-direct {v4, v2, v0}, Lk3/g;-><init>(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V

    invoke-static {v3, p1, v4}, Lk3/b;->b(Ljava/lang/String;Ljava/io/File;Ls3/e;)V

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/io/File;

    check-cast v0, Lk3/f$j;

    iget-object v2, v0, Lk3/f$j;->a:Lcom/superbock/bean/EInfo;

    iget-object v0, v0, Lk3/f$j;->b:Landroid/content/Context;

    invoke-static {}, Lk/j0;->k()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lk3/g;

    invoke-direct {v4, v2, v0}, Lk3/g;-><init>(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V

    invoke-static {v3, p1, v4}, Lk3/b;->b(Ljava/lang/String;Ljava/io/File;Ls3/e;)V

    :goto_0
    return v1
.end method
