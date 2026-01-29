.class public Lcom/jx/shell/ProxyApplication;
.super Landroid/app/Application;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Landroid/app/Application;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/jx/shell/ProxyApplication;->b:Landroid/app/Application;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-boolean v0, La/a;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/jx/shell/JniBridge;->ra(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    iput-object v0, p0, Lcom/jx/shell/ProxyApplication;->b:Landroid/app/Application;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/jx/shell/JniBridge;->craa(Landroid/content/Context;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/jx/shell/JniBridge;->craoc(Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 6
    sput-boolean v0, La/a;->b:Z

    :cond_0
    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/app/Application;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 3
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    const-string v3, "app_name"

    invoke-virtual {v2, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v1

    const/16 v2, 0x400

    .line 5
    new-array v2, v2, [B

    .line 6
    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    const/4 v4, 0x0

    .line 7
    invoke-virtual {v0, v2, v4, v3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_5

    :catch_0
    move-exception v2

    goto :goto_2

    .line 8
    :cond_0
    :goto_1
    invoke-static {v0}, La/a;->a(Ljava/io/Closeable;)V

    .line 9
    invoke-static {v1}, La/a;->a(Ljava/io/Closeable;)V

    goto :goto_3

    .line 10
    :goto_2
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 11
    :goto_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    .line 13
    sget-boolean v0, La/a;->a:Z

    if-nez v0, :cond_2

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 15
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    iget-object v2, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-static {v1, v2}, La/a;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    iget-object v1, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {v1, v0}, Lcom/jx/shell/JniBridge;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/jx/shell/JniBridge;->ia()V

    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    .line 19
    invoke-static {p1}, Lcom/jx/shell/JniBridge;->cbde(Ljava/lang/ClassLoader;)V

    const/4 p1, 0x1

    .line 20
    sput-boolean p1, La/a;->a:Z

    goto :goto_4

    .line 21
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "application info is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_4
    return-void

    .line 22
    :goto_5
    invoke-static {v0}, La/a;->a(Ljava/io/Closeable;)V

    .line 23
    invoke-static {v1}, La/a;->a(Ljava/io/Closeable;)V

    .line 24
    throw p1
.end method

.method public final createPackageContext(Ljava/lang/String;I)Landroid/content/Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/jx/shell/ProxyApplication;->a()V

    .line 4
    iget-object p1, p0, Lcom/jx/shell/ProxyApplication;->b:Landroid/app/Application;

    return-object p1

    .line 5
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Application;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method public final getPackageName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jx/shell/ProxyApplication;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-super {p0}, Landroid/app/Application;->getPackageName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/jx/shell/ProxyApplication;->a()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
