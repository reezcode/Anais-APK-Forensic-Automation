.class public final Lmarmojkfnf/dphnidckqxhm/v0;
.super Ljava/lang/Object;


# static fields
.field public static volatile d:Lmarmojkfnf/dphnidckqxhm/v0;

.field public static final e:J

.field public static f:J


# instance fields
.field public a:Landroid/os/Handler;

.field public b:Landroid/content/Context;

.field public c:Ljava/io/FileOutputStream;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x4d

    invoke-static {v0}, Lfmfjq/twyvy/xjhbp;->classescxclcy(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lmarmojkfnf/dphnidckqxhm/v0;->e:J

    const-wide/16 v0, 0x0

    sput-wide v0, Lmarmojkfnf/dphnidckqxhm/v0;->f:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "Xw=="

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    new-instance v1, Landroid/os/HandlerThread;

    const-string v2, "cmVjX2xvZw=="

    invoke-static {v2}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    new-instance v2, Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v2, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v2, p0, Lmarmojkfnf/dphnidckqxhm/v0;->a:Landroid/os/Handler;

    iput-object p1, p0, Lmarmojkfnf/dphnidckqxhm/v0;->b:Landroid/content/Context;

    sget-object v1, Lmarmojkfnf/dphnidckqxhm/p;->a:Lmarmojkfnf/dphnidckqxhm/p;

    invoke-virtual {v1}, Lmarmojkfnf/dphnidckqxhm/p;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Lg=="

    invoke-static {v2}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Og=="

    invoke-static {v2}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "L0ZHTE9HLw=="

    invoke-static {p1}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    const-string v3, "eXl5eS1NTS1kZA=="

    invoke-static {v3}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p1, v3}, Lcom/blankj/utilcode/util/TimeUtils;->date2String(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "LmxvZw=="

    invoke-static {v0}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    invoke-static {v1, p1}, Lorg/apache/commons/io/FileUtils;->openOutputStream(Ljava/io/File;Z)Ljava/io/FileOutputStream;

    move-result-object v0

    iput-object v0, p0, Lmarmojkfnf/dphnidckqxhm/v0;->c:Ljava/io/FileOutputStream;

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "LS0tLS0tLS0tLS0tLS0tLS0t5paw5ZCv5YqoLS0tLS0tLS0tLS0tLS0tLS0="

    invoke-static {v1}, Lmarmojkfnf/dphnidckqxhm/i0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    invoke-virtual {p0, p1}, Lmarmojkfnf/dphnidckqxhm/v0;->a([Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public static native a(Landroid/content/Context;)Lmarmojkfnf/dphnidckqxhm/v0;
.end method


# virtual methods
.method public final varargs native a([Ljava/lang/Object;)V
.end method
