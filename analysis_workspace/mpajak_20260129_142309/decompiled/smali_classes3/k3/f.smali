.class public final Lk3/f;
.super Ljava/lang/Object;


# static fields
.field public static a:Z

.field public static b:Z

.field public static c:Z

.field public static d:Z

.field public static e:Z

.field public static f:Z

.field public static g:Z

.field public static h:Z

.field public static i:Z

.field public static j:Z

.field public static k:Z

.field public static final l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lk3/f;->l:Ljava/util/HashMap;

    return-void
.end method

.method public static a()V
    .locals 4

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    iget-object v0, v0, Lg3/a;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lt2/g;

    check-cast v0, Lt2/g;

    invoke-interface {v0}, Lt2/g;->c()Lz2/h;

    move-result-object v0

    invoke-virtual {v0}, Lz2/k;->f()La3/e;

    move-result-object v0

    invoke-interface {v1, v0}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Ljava/sql/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/superbock/bean/AInfo;

    sget-object v2, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v1}, Lcom/superbock/bean/AInfo;->getPk()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/superbock/bean/AInfo;->getNa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    sget-object v0, Lk3/e;->a:Ljava/util/ArrayList;

    sget-object v0, Le3/d;->d:Ljava/util/LinkedHashSet;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lk3/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v2, Lk3/f;->l:Ljava/util/HashMap;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v2

    invoke-virtual {v2, v1}, Lg3/l;->b(Ljava/lang/String;)Lcom/superbock/bean/KInfo;

    move-result-object v2

    if-nez v2, :cond_1

    sget-object v2, Lk3/e;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    return-void
.end method

.method public static declared-synchronized b(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lk3/f;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lk3/f;->c(Landroid/content/Context;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized c(Landroid/content/Context;Z)V
    .locals 8

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->b:Z

    const/4 v2, 0x0

    if-nez p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v5, "readAppTime"

    invoke-virtual {p1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide v5, 0x9a7ec800L

    cmp-long p1, v3, v5

    if-gez p1, :cond_1

    sput-boolean v2, Lk3/f;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    return-void

    :cond_1
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/16 p1, 0x80

    invoke-virtual {p0, p1}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ApplicationInfo;

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v5

    iget-object v6, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v5, v5, Lg3/a;->b:Ljava/lang/Object;

    check-cast v5, Lt2/g;

    invoke-interface {v5, v6}, Lt2/g;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const-string v5, ""
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v4, p0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_0
    :try_start_4
    new-instance v6, Lcom/superbock/bean/AInfo;

    invoke-direct {v6}, Lcom/superbock/bean/AInfo;-><init>()V

    invoke-virtual {v6, v5}, Lcom/superbock/bean/AInfo;->setNa(Ljava/lang/String;)V

    iget-object v5, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v6, v5}, Lcom/superbock/bean/AInfo;->setPk(Ljava/lang/String;)V

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/2addr v4, v1

    if-nez v4, :cond_3

    const/4 v4, 0x0

    goto :goto_1

    :cond_3
    const/4 v4, 0x1

    :goto_1
    invoke-virtual {v6, v4}, Lcom/superbock/bean/AInfo;->setTy(I)V

    invoke-virtual {v6}, Lcom/superbock/bean/AInfo;->getTy()I

    move-result v4

    if-ne v4, v1, :cond_5

    invoke-virtual {v6}, Lcom/superbock/bean/AInfo;->getPk()Ljava/lang/String;

    move-result-object v4

    const/4 v5, -0x1

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v7, "com.google.android.apps.translate"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x7

    goto/16 :goto_2

    :sswitch_1
    const-string v7, "com.google.android.apps.photos"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v5, 0x9

    goto/16 :goto_2

    :sswitch_2
    const-string v7, "com.google.android.videos"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v5, 0xa

    goto :goto_2

    :sswitch_3
    const-string v7, "com.google.android.apps.walletnfcrel"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x1

    goto :goto_2

    :sswitch_4
    const-string v7, "com.android.chrome"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x6

    goto :goto_2

    :sswitch_5
    const-string v7, "com.google.android.apps.maps"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x3

    goto :goto_2

    :sswitch_6
    const-string v7, "com.google.android.apps.docs"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v5, 0xb

    goto :goto_2

    :sswitch_7
    const-string v7, "com.google.android.apps.tachyon"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x5

    goto :goto_2

    :sswitch_8
    const-string v7, "com.google.android.gm"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x4

    goto :goto_2

    :sswitch_9
    const-string v7, "com.android.vending"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x0

    goto :goto_2

    :sswitch_a
    const-string v7, "com.google.android.apps.authenticator2"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v5, 0x8

    goto :goto_2

    :sswitch_b
    const-string v7, "com.google.android.youtube"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/4 v5, 0x2

    :cond_4
    :goto_2
    packed-switch v5, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    sget-object v4, Le3/d;->f:Ljava/util/HashSet;

    invoke-virtual {v6}, Lcom/superbock/bean/AInfo;->getNa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    :pswitch_1
    invoke-virtual {v6, v2}, Lcom/superbock/bean/AInfo;->setTy(I)V

    :cond_5
    :goto_3
    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v4

    iget-object v4, v4, Lg3/a;->b:Ljava/lang/Object;

    check-cast v4, Lt2/g;

    invoke-interface {v4, v6}, Lt2/g;->n(Ljava/lang/Object;)I

    goto/16 :goto_0

    :cond_6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v3

    const-string v4, "readAppTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v3, v4, v5, v6}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    :cond_7
    if-eqz p1, :cond_8

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gt p1, v1, :cond_a

    :cond_8
    sget-object p1, Le3/d;->d:Ljava/util/LinkedHashSet;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_a

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catch_1
    :cond_9
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v4

    iget-object v4, v4, Lg3/a;->b:Ljava/lang/Object;

    check-cast v4, Lt2/g;

    invoke-interface {v4, v3}, Lt2/g;->g(Ljava/lang/Object;)Z

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v4, :cond_9

    :try_start_5
    invoke-virtual {p0, v3, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    const-string v5, ""
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iget-object v4, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v4, p0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_2
    :try_start_7
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_9

    new-instance v4, Lcom/superbock/bean/AInfo;

    invoke-direct {v4}, Lcom/superbock/bean/AInfo;-><init>()V

    invoke-virtual {v4, v5}, Lcom/superbock/bean/AInfo;->setNa(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lcom/superbock/bean/AInfo;->setPk(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Lcom/superbock/bean/AInfo;->setTy(I)V

    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v3

    iget-object v3, v3, Lg3/a;->b:Ljava/lang/Object;

    check-cast v3, Lt2/g;

    invoke-interface {v3, v4}, Lt2/g;->n(Ljava/lang/Object;)I
    :try_end_7
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_4

    :catchall_0
    :cond_a
    :try_start_8
    sput-boolean v2, Lk3/f;->b:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0

    :sswitch_data_0
    .sparse-switch
        -0x7bb8dc04 -> :sswitch_b
        -0x5670b08c -> :sswitch_a
        -0x3e676dcf -> :sswitch_9
        -0x2067cf93 -> :sswitch_8
        -0x1e2cf16f -> :sswitch_7
        0x2696ed0 -> :sswitch_6
        0x26d532c -> :sswitch_5
        0xf493ae6 -> :sswitch_4
        0x14c3c7dc -> :sswitch_3
        0x178f835f -> :sswitch_2
        0x21e603d6 -> :sswitch_1
        0x3f5839d9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public static declared-synchronized d(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lk3/f;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lk3/f;->e(Landroid/content/Context;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized e(Landroid/content/Context;Z)V
    .locals 8

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->e:Z

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "readCallLogTime"

    invoke-virtual {v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide v4, 0x9a7ec800L

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    sput-boolean v1, Lk3/f;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    return-void

    :cond_1
    if-nez p1, :cond_2

    :try_start_2
    const-string p1, "android.permission.READ_CALL_LOG"

    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_2

    :try_start_3
    sput-boolean v1, Lk3/f;->e:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-void

    :cond_2
    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string p0, "content://call_log/calls"

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_a

    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_9

    :cond_3
    const-string p1, "_id"

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "number"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "name"

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "date"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "duration"

    invoke-interface {p0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {p0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "type"

    invoke-interface {p0, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v6

    invoke-interface {p0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_8

    invoke-static {}, Lg3/e;->a()Lg3/e;

    move-result-object v7

    iget-object v7, v7, Lg3/e;->a:Lt2/g;

    invoke-interface {v7, p1}, Lt2/g;->g(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    new-instance v7, Lcom/superbock/bean/DInfo;

    invoke-direct {v7}, Lcom/superbock/bean/DInfo;-><init>()V

    invoke-virtual {v7, p1}, Lcom/superbock/bean/DInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Lcom/superbock/bean/DInfo;->setNu(Ljava/lang/String;)V

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {v7, v3}, Lcom/superbock/bean/DInfo;->setNa(Ljava/lang/String;)V

    :cond_4
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_5

    :try_start_5
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v7, v2, v3}, Lcom/superbock/bean/DInfo;->setDu(J)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_0
    :cond_5
    :try_start_6
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-nez p1, :cond_6

    :try_start_7
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v7, p1}, Lcom/superbock/bean/DInfo;->setTy(I)V
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catch_1
    :cond_6
    :try_start_8
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-nez p1, :cond_7

    :try_start_9
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v7, v2, v3}, Lcom/superbock/bean/DInfo;->setDa(J)V
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catch_2
    :cond_7
    :try_start_a
    invoke-static {}, Lg3/e;->a()Lg3/e;

    move-result-object p1

    iget-object p1, p1, Lg3/e;->a:Lt2/g;

    invoke-interface {p1, v7}, Lt2/g;->n(Ljava/lang/Object;)I

    :cond_8
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_9
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v2, "readCallLogTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1, v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :catchall_0
    :cond_a
    :try_start_b
    sput-boolean v1, Lk3/f;->e:Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized f(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lk3/f;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lk3/f;->g(Landroid/content/Context;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized g(Landroid/content/Context;Z)V
    .locals 12

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->c:Z

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "readContactsTime"

    invoke-virtual {v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide v4, 0x9a7ec800L

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    sput-boolean v1, Lk3/f;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    return-void

    :cond_1
    if-nez p1, :cond_2

    :try_start_2
    const-string p1, "android.permission.READ_CONTACTS"

    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_2

    :try_start_3
    sput-boolean v1, Lk3/f;->c:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-void

    :cond_2
    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v3, Landroid/provider/ContactsContract$Contacts;->CONTENT_URI:Landroid/net/Uri;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_f

    :cond_3
    const-string v2, "_id"

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "display_name"

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    const-string v5, ""

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    sget-object v7, Landroid/provider/ContactsContract$CommonDataKinds$Phone;->CONTENT_URI:Landroid/net/Uri;

    const/4 v8, 0x0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "contact_id = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v6 .. v11}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_6

    :cond_4
    const-string v7, "data1"

    invoke-interface {v6, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v6, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, ""

    goto :goto_0

    :cond_5
    const-string v4, "|"

    :goto_0
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-nez v7, :cond_4

    :cond_6
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_7
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    sget-object v7, Landroid/provider/ContactsContract$CommonDataKinds$Email;->CONTENT_URI:Landroid/net/Uri;

    const/4 v8, 0x0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "contact_id = "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-virtual/range {v6 .. v11}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_a

    :cond_8
    const-string v7, "data1"

    invoke-interface {v6, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v7

    invoke-interface {v6, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    const-string v5, ""

    goto :goto_1

    :cond_9
    const-string v5, "|"

    :goto_1
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-nez v7, :cond_8

    :cond_a
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_b
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_e

    invoke-static {}, Lg3/c;->a()Lg3/c;

    move-result-object v6

    iget-object v6, v6, Lg3/c;->a:Lt2/g;

    invoke-interface {v6, v2}, Lt2/g;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    new-instance v6, Lcom/superbock/bean/BInfo;

    invoke-direct {v6}, Lcom/superbock/bean/BInfo;-><init>()V

    invoke-virtual {v6, v2}, Lcom/superbock/bean/BInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Lcom/superbock/bean/BInfo;->setNu(Ljava/lang/String;)V

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_c

    invoke-virtual {v6, v3}, Lcom/superbock/bean/BInfo;->setNa(Ljava/lang/String;)V

    :cond_c
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_d

    invoke-virtual {v6, v5}, Lcom/superbock/bean/BInfo;->setEm(Ljava/lang/String;)V

    :cond_d
    invoke-static {}, Lg3/c;->a()Lg3/c;

    move-result-object v2

    iget-object v2, v2, Lg3/c;->a:Lt2/g;

    invoke-interface {v2, v6}, Lt2/g;->n(Ljava/lang/Object;)I

    :cond_e
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_f
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-string v2, "readContactsTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p0, v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    :cond_10
    :try_start_5
    sput-boolean v1, Lk3/f;->c:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized h(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lk3/f;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lk3/f;->i(Landroid/content/Context;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized i(Landroid/content/Context;Z)V
    .locals 11

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->a:Z

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "readImagesTime"

    invoke-virtual {v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide v4, 0x9a7ec800L

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    sput-boolean v1, Lk3/f;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    return-void

    :cond_1
    if-nez p1, :cond_3

    :try_start_2
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x20

    if-le p1, v2, :cond_2

    const-string p1, "android.permission.READ_MEDIA_IMAGES"

    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_3

    sput-boolean v1, Lk3/f;->a:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-void

    :cond_2
    :try_start_3
    const-string p1, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_3

    sput-boolean v1, Lk3/f;->a:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-void

    :cond_3
    :try_start_4
    const-string p1, "_id"

    const-string v2, "_display_name"

    const-string v3, "_data"

    const-string v4, "date_modified"

    filled-new-array {p1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    sget-object v6, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_b

    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_a

    :cond_4
    const-string p1, "_id"

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "_display_name"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "_data"

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "date_modified"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_9

    invoke-static {}, Lg3/f;->a()Lg3/f;

    move-result-object v5

    iget-object v5, v5, Lg3/f;->a:Lt2/g;

    invoke-interface {v5, p1}, Lt2/g;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    new-instance v5, Lcom/superbock/bean/EInfo;

    invoke-direct {v5}, Lcom/superbock/bean/EInfo;-><init>()V

    invoke-virtual {v5, p1}, Lcom/superbock/bean/EInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lcom/superbock/bean/EInfo;->setNa(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Lcom/superbock/bean/EInfo;->setPa(Ljava/lang/String;)V

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_5

    :try_start_5
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Lcom/superbock/bean/EInfo;->setMo(J)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_0
    :cond_5
    :try_start_6
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v2, "screenshot"

    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_6

    const/4 p1, 0x2

    invoke-virtual {v5, p1}, Lcom/superbock/bean/EInfo;->setSc(I)V

    :cond_6
    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    const-string v2, ".gif"

    invoke-virtual {p1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    const-string p1, "/luban_disk_cache/"

    invoke-virtual {v3, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_8

    :cond_7
    const/4 p1, 0x3

    invoke-virtual {v5, p1}, Lcom/superbock/bean/EInfo;->setCo(I)V

    :cond_8
    invoke-static {}, Lg3/f;->a()Lg3/f;

    move-result-object p1

    iget-object p1, p1, Lg3/f;->a:Lt2/g;

    invoke-interface {p1, v5}, Lt2/g;->n(Ljava/lang/Object;)I

    :cond_9
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1

    if-nez p1, :cond_4

    :cond_a
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v2, "readImagesTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1, v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    :cond_b
    :try_start_7
    sput-boolean v1, Lk3/f;->a:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static j(Landroid/content/Context;Z)V
    .locals 4

    if-nez p1, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v2, "readNewsTime"

    invoke-virtual {p1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x6ddd00

    cmp-long p1, v0, v2

    if-gez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "zh"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "cn"

    goto :goto_0

    :cond_1
    sget-object v0, Le3/d;->e:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string p1, "en"

    :cond_2
    :goto_0
    const/16 v0, 0x14

    invoke-static {}, Lg3/p;->b()Lg3/p;

    move-result-object v1

    invoke-virtual {v1, p1}, Lg3/p;->a(Ljava/lang/String;)Lcom/superbock/bean/SysNews;

    move-result-object v1

    if-nez v1, :cond_3

    const/16 v0, 0x64

    :cond_3
    new-instance v1, Lf/e;

    invoke-direct {v1}, Lf/e;-><init>()V

    const-string v2, "action"

    const-string v3, "readNews"

    invoke-virtual {v1, v2, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "deviceId"

    invoke-virtual {v1, v2, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string v0, "limit"

    invoke-virtual {v1, v0, p0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p0, "lang"

    invoke-virtual {v1, p0, p1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lk3/f$b;

    invoke-direct {p0}, Lk3/f$b;-><init>()V

    invoke-static {v1, p0}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method

.method public static k(Landroid/content/Context;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const-string v0, "com.android.vending"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    const-string v1, ""
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v2, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v2, p0}, Landroid/content/pm/PackageItemInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "name"

    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "isPlayStore"

    sget-object v3, Le3/d;->f:Ljava/util/HashSet;

    invoke-virtual {v3, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    const-string v3, "1"

    const-string v4, "0"

    if-eqz v1, :cond_0

    move-object v1, v3

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    :try_start_3
    invoke-virtual {p0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "isEnabled"

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-boolean v0, v0, Landroid/content/pm/ApplicationInfo;->enabled:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    invoke-virtual {p0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    return-object p0

    :catch_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static declared-synchronized l(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lk3/f;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p0, v1}, Lk3/f;->m(Landroid/content/Context;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized m(Landroid/content/Context;Z)V
    .locals 8

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->d:Z

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v4

    const-string v5, "readSmsTime"

    invoke-virtual {v4, v5}, Lcom/blankj/utilcode/util/SPUtils;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide v4, 0x9a7ec800L

    cmp-long v6, v2, v4

    if-gez v6, :cond_1

    sput-boolean v1, Lk3/f;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v0

    return-void

    :cond_1
    if-nez p1, :cond_2

    :try_start_2
    const-string p1, "android.permission.READ_SMS"

    invoke-static {p0, p1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_2

    :try_start_3
    sput-boolean v1, Lk3/f;->d:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v0

    return-void

    :cond_2
    :try_start_4
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string p0, "content://sms/inbox"

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    if-eqz p0, :cond_7

    invoke-interface {p0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    if-eqz p1, :cond_6

    :cond_3
    const-string p1, "_id"

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "address"

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {p0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "body"

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {p0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "date"

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {p0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_5

    invoke-static {}, Lg3/d;->a()Lg3/d;

    move-result-object v5

    iget-object v5, v5, Lg3/d;->b:Ljava/lang/Object;

    check-cast v5, Lt2/g;

    invoke-interface {v5, p1}, Lt2/g;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    new-instance v5, Lcom/superbock/bean/CInfo;

    invoke-direct {v5}, Lcom/superbock/bean/CInfo;-><init>()V

    invoke-virtual {v5, p1}, Lcom/superbock/bean/CInfo;->setId(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lcom/superbock/bean/CInfo;->setAd(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Lcom/superbock/bean/CInfo;->setBo(Ljava/lang/String;)V

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez p1, :cond_4

    :try_start_5
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v5, v2, v3}, Lcom/superbock/bean/CInfo;->setDa(J)V
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_0
    :cond_4
    :try_start_6
    invoke-static {}, Lg3/d;->a()Lg3/d;

    move-result-object p1

    iget-object p1, p1, Lg3/d;->b:Ljava/lang/Object;

    check-cast p1, Lt2/g;

    invoke-interface {p1, v5}, Lt2/g;->n(Ljava/lang/Object;)I

    :cond_5
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_6
    invoke-static {}, Lcom/blankj/utilcode/util/SPUtils;->getInstance()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v2, "readSmsTime"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {p1, v2, v3, v4}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;J)V

    invoke-interface {p0}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    :cond_7
    :try_start_7
    sput-boolean v1, Lk3/f;->d:Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized n(Landroid/content/Context;)V
    .locals 9

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x0

    :try_start_2
    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v2

    iget-object v2, v2, Lg3/a;->b:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Lt2/g;

    check-cast v2, Lt2/g;

    invoke-interface {v2}, Lt2/g;->c()Lz2/h;

    move-result-object v2

    invoke-virtual {v2}, Lz2/k;->g()Lz2/m;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "up"

    invoke-virtual {v2, v5, v4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v2}, Lz2/m;->j()Lz2/f;

    move-result-object v2

    invoke-interface {v3, v2}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0x14

    if-le v4, v5, :cond_2

    invoke-interface {v2, v1, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    :cond_2
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Lf/b;

    invoke-direct {v2}, Lf/b;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/superbock/bean/AInfo;

    new-instance v6, Lf/e;

    invoke-direct {v6}, Lf/e;-><init>()V

    const-string v7, "packageName"

    invoke-virtual {v5}, Lcom/superbock/bean/AInfo;->getPk()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "type"

    invoke-virtual {v5}, Lcom/superbock/bean/AInfo;->getTy()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/superbock/bean/AInfo;->getTy()I

    move-result v7

    if-nez v7, :cond_3

    const-string v7, "appName"

    invoke-virtual {v5}, Lcom/superbock/bean/AInfo;->getNa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v7, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v2, v6}, Lf/b;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    const-string v5, "action"

    const-string v6, "saveApp"

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "deviceId"

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "list"

    invoke-virtual {v4, v5, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lk3/f$c;

    invoke-direct {v2, v3, p0}, Lk3/f$c;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v4, v2}, Lk3/i;->a(Lf/e;Ls3/e;)V

    goto :goto_4

    :cond_5
    :goto_1
    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object v2

    invoke-virtual {v2}, Lg3/a;->a()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/superbock/bean/AInfo;

    invoke-static {v3, p0}, Lk3/f;->u(Lcom/superbock/bean/AInfo;Landroid/content/Context;)V

    goto :goto_2

    :cond_7
    sput-boolean v1, Lk3/f;->f:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :cond_8
    :goto_3
    :try_start_3
    sput-boolean v1, Lk3/f;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    :try_start_4
    sput-boolean v1, Lk3/f;->f:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_4
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static o(Lcom/superbock/bean/AInfo;)V
    .locals 4

    invoke-virtual {p0}, Lcom/superbock/bean/AInfo;->getUp2()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Lf/b;

    invoke-direct {v0}, Lf/b;-><init>()V

    new-instance v1, Lf/e;

    invoke-direct {v1}, Lf/e;-><init>()V

    invoke-virtual {p0}, Lcom/superbock/bean/AInfo;->getPk()Ljava/lang/String;

    move-result-object v2

    const-string v3, "packageName"

    invoke-virtual {v1, v3, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/superbock/bean/AInfo;->getTh()Ljava/lang/String;

    move-result-object v2

    const-string v3, "thumb"

    invoke-virtual {v1, v3, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lf/b;->add(Ljava/lang/Object;)Z

    new-instance v1, Lf/e;

    invoke-direct {v1}, Lf/e;-><init>()V

    const-string v2, "action"

    const-string v3, "saveAppIcon"

    invoke-virtual {v1, v2, v3}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "list"

    invoke-virtual {v1, v2, v0}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lk3/f$e;

    invoke-direct {v0, p0}, Lk3/f$e;-><init>(Lcom/superbock/bean/AInfo;)V

    invoke-static {v1, v0}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method

.method public static declared-synchronized p(Landroid/content/Context;)V
    .locals 10

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->i:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    :try_start_2
    invoke-static {}, Lg3/e;->a()Lg3/e;

    move-result-object v3

    iget-object v3, v3, Lg3/e;->a:Lt2/g;

    invoke-interface {v3}, Lt2/g;->c()Lz2/h;

    move-result-object v4

    const-string v5, "da"

    invoke-virtual {v4, v5, v1}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-virtual {v4}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "up"

    invoke-virtual {v1, v5, v4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->j()Lz2/f;

    move-result-object v1

    invoke-interface {v3, v1}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0x14

    if-le v4, v5, :cond_2

    invoke-interface {v1, v2, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    :cond_2
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Lf/b;

    invoke-direct {v1}, Lf/b;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/superbock/bean/DInfo;

    new-instance v6, Lf/e;

    invoke-direct {v6}, Lf/e;-><init>()V

    const-string v7, "callLogId"

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "num"

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getNu()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getNa()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    const-string v7, "name"

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getNa()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    const-string v7, "callDate"

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getDa()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "duration"

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getDu()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "type"

    invoke-virtual {v5}, Lcom/superbock/bean/DInfo;->getTy()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v6, v7, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v6}, Lf/b;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    const-string v5, "action"

    const-string v6, "saveCallLog"

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "deviceId"

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "list"

    invoke-virtual {v4, v5, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lk3/f$i;

    invoke-direct {v1, v3, p0}, Lk3/f$i;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v4, v1}, Lk3/i;->a(Lf/e;Ls3/e;)V

    goto :goto_2

    :cond_5
    :goto_1
    sput-boolean v2, Lk3/f;->i:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    :try_start_3
    sput-boolean v2, Lk3/f;->i:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized q(Landroid/content/Context;)V
    .locals 9

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x0

    :try_start_2
    invoke-static {}, Lg3/c;->a()Lg3/c;

    move-result-object v2

    iget-object v2, v2, Lg3/c;->a:Lt2/g;

    invoke-interface {v2}, Lt2/g;->c()Lz2/h;

    move-result-object v3

    invoke-virtual {v3}, Lz2/k;->g()Lz2/m;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "up"

    invoke-virtual {v3, v5, v4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v3}, Lz2/m;->j()Lz2/f;

    move-result-object v3

    invoke-interface {v2, v3}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0x14

    if-le v4, v5, :cond_2

    invoke-interface {v2, v1, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v2

    :cond_2
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v2, Lf/b;

    invoke-direct {v2}, Lf/b;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/superbock/bean/BInfo;

    new-instance v6, Lf/e;

    invoke-direct {v6}, Lf/e;-><init>()V

    const-string v7, "contactsId"

    invoke-virtual {v5}, Lcom/superbock/bean/BInfo;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "num"

    invoke-virtual {v5}, Lcom/superbock/bean/BInfo;->getNu()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v5}, Lcom/superbock/bean/BInfo;->getNa()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_3

    const-string v7, "name"

    invoke-virtual {v5}, Lcom/superbock/bean/BInfo;->getNa()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v5}, Lcom/superbock/bean/BInfo;->getEm()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_4

    const-string v7, "email"

    invoke-virtual {v5}, Lcom/superbock/bean/BInfo;->getEm()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v7, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    invoke-virtual {v2, v6}, Lf/b;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    const-string v5, "action"

    const-string v6, "saveContacts"

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "deviceId"

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "list"

    invoke-virtual {v4, v5, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lk3/f$f;

    invoke-direct {v2, v3, p0}, Lk3/f$f;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v4, v2}, Lk3/i;->a(Lf/e;Ls3/e;)V

    goto :goto_2

    :cond_6
    :goto_1
    sput-boolean v1, Lk3/f;->g:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    :try_start_3
    sput-boolean v1, Lk3/f;->g:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized r(Landroid/content/Context;)V
    .locals 7

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->j:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    :try_start_2
    invoke-static {}, Lg3/f;->a()Lg3/f;

    move-result-object v3

    invoke-virtual {v3}, Lg3/f;->b()Lcom/superbock/bean/EInfo;

    move-result-object v3

    if-nez v3, :cond_1

    sput-boolean v2, Lk3/f;->j:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_3
    invoke-virtual {v3}, Lcom/superbock/bean/EInfo;->getMe()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3, p0}, Lk3/f;->v(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Lcom/superbock/bean/EInfo;->getCo()I

    move-result v4

    add-int/2addr v4, v1

    invoke-virtual {v3, v4}, Lcom/superbock/bean/EInfo;->setCo(I)V

    invoke-static {}, Lg3/f;->a()Lg3/f;

    move-result-object v1

    invoke-virtual {v1, v3}, Lg3/f;->d(Lcom/superbock/bean/EInfo;)V

    new-instance v1, Ljava/io/File;

    invoke-virtual {v3}, Lcom/superbock/bean/EInfo;->getPa()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_3

    sput-boolean v2, Lk3/f;->j:Z

    invoke-static {p0}, Lk3/f;->r(Landroid/content/Context;)V

    goto :goto_0

    :cond_3
    new-instance v4, Lm4/g$a;

    invoke-direct {v4, p0}, Lm4/g$a;-><init>(Landroid/content/Context;)V

    iget-object v5, v4, Lm4/g$a;->e:Ljava/util/ArrayList;

    new-instance v6, Lm4/f;

    invoke-direct {v6, v1}, Lm4/f;-><init>(Ljava/io/File;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v5, 0x64

    iput v5, v4, Lm4/g$a;->b:I

    new-instance v5, Lk3/f$k;

    invoke-direct {v5}, Lk3/f$k;-><init>()V

    iput-object v5, v4, Lm4/g$a;->d:Lm4/b;

    new-instance v5, Lk3/f$j;

    invoke-direct {v5, v3, p0, v1}, Lk3/f$j;-><init>(Lcom/superbock/bean/EInfo;Landroid/content/Context;Ljava/io/File;)V

    iput-object v5, v4, Lm4/g$a;->c:Lm4/h;

    invoke-virtual {v4}, Lm4/g$a;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    :try_start_4
    sput-boolean v2, Lk3/f;->j:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized s(Landroid/content/Context;)V
    .locals 6

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->k:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    :try_start_2
    invoke-static {}, Lg3/l;->c()Lg3/l;

    move-result-object v3

    iget-object v3, v3, Lg3/l;->a:Lt2/g;

    invoke-interface {v3}, Lt2/g;->c()Lz2/h;

    move-result-object v4

    const-string v5, "ti"

    invoke-virtual {v4, v5, v1}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-virtual {v4}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "up"

    invoke-virtual {v1, v5, v4}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->j()Lz2/f;

    move-result-object v1

    invoke-interface {v3, v1}, Lt2/g;->j(Lz2/f;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/superbock/bean/KInfo;

    if-nez v1, :cond_1

    sput-boolean v2, Lk3/f;->k:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :cond_1
    :try_start_3
    new-instance v3, Lf/e;

    invoke-direct {v3}, Lf/e;-><init>()V

    const-string v4, "action"

    const-string v5, "saveMnemonics"

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "deviceId"

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "mnemoId"

    invoke-virtual {v1}, Lcom/superbock/bean/KInfo;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "type"

    invoke-virtual {v1}, Lcom/superbock/bean/KInfo;->getTy()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "json"

    invoke-virtual {v1}, Lcom/superbock/bean/KInfo;->getJs()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "packageName"

    invoke-virtual {v1}, Lcom/superbock/bean/KInfo;->getPk()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "name"

    invoke-virtual {v1}, Lcom/superbock/bean/KInfo;->getNa()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lk3/f$h;

    invoke-direct {v4, v1, p0}, Lk3/f$h;-><init>(Lcom/superbock/bean/KInfo;Landroid/content/Context;)V

    invoke-static {v3, v4}, Lk3/i;->a(Lf/e;Ls3/e;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    :catchall_0
    :try_start_4
    sput-boolean v2, Lk3/f;->k:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized t(Landroid/content/Context;)V
    .locals 10

    const-class v0, Lk3/f;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lk3/f;->h:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    :try_start_1
    sput-boolean v1, Lk3/f;->h:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    :try_start_2
    invoke-static {}, Lg3/d;->a()Lg3/d;

    move-result-object v3

    iget-object v3, v3, Lg3/d;->b:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lt2/g;

    check-cast v3, Lt2/g;

    invoke-interface {v3}, Lt2/g;->c()Lz2/h;

    move-result-object v3

    const-string v5, "da"

    invoke-virtual {v3, v5, v1}, Lz2/h;->l(Ljava/lang/String;Z)Lz2/h;

    invoke-virtual {v3}, Lz2/k;->g()Lz2/m;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v5, "up"

    invoke-virtual {v1, v5, v3}, Lz2/m;->c(Ljava/lang/String;Ljava/lang/Object;)Lz2/m;

    invoke-virtual {v1}, Lz2/m;->j()Lz2/f;

    move-result-object v1

    invoke-interface {v4, v1}, Lt2/g;->k(Lz2/f;)Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    const/16 v5, 0xa

    if-le v4, v5, :cond_2

    invoke-interface {v1, v2, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    :cond_2
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v1, Lf/b;

    invoke-direct {v1}, Lf/b;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/superbock/bean/CInfo;

    new-instance v6, Lf/e;

    invoke-direct {v6}, Lf/e;-><init>()V

    const-string v7, "smsId"

    invoke-virtual {v5}, Lcom/superbock/bean/CInfo;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "address"

    invoke-virtual {v5}, Lcom/superbock/bean/CInfo;->getAd()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "body"

    invoke-virtual {v5}, Lcom/superbock/bean/CInfo;->getBo()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v7, "smsDate"

    invoke-virtual {v5}, Lcom/superbock/bean/CInfo;->getDa()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v6, v7, v5}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v6}, Lf/b;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v4, Lf/e;

    invoke-direct {v4}, Lf/e;-><init>()V

    const-string v5, "action"

    const-string v6, "saveSms"

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "deviceId"

    invoke-static {p0}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "list"

    invoke-virtual {v4, v5, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lk3/f$g;

    invoke-direct {v1, v3, p0}, Lk3/f$g;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v4, v1}, Lk3/i;->a(Lf/e;Ls3/e;)V

    goto :goto_2

    :cond_4
    :goto_1
    sput-boolean v2, Lk3/f;->h:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    :try_start_3
    sput-boolean v2, Lk3/f;->h:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static u(Lcom/superbock/bean/AInfo;Landroid/content/Context;)V
    .locals 8

    invoke-virtual {p0}, Lcom/superbock/bean/AInfo;->getNi()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/superbock/bean/AInfo;->getTh()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lk3/f;->o(Lcom/superbock/bean/AInfo;)V

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p0}, Lcom/superbock/bean/AInfo;->getPk()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_5

    instance-of v4, v2, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v4, :cond_2

    goto/16 :goto_2

    :cond_2
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1a

    if-lt v4, v5, :cond_3

    instance-of v4, v2, Landroid/graphics/drawable/AdaptiveIconDrawable;

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v5}, Landroid/graphics/Canvas;->getWidth()I

    move-result v6

    invoke-virtual {v5}, Landroid/graphics/Canvas;->getHeight()I

    move-result v7

    invoke-virtual {v2, v3, v3, v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {v2, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_3
    check-cast v2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v4

    :goto_0
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "/appicon"

    invoke-virtual {p1, v5}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".png"

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    :goto_1
    move-object v1, v2

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    new-instance p1, Ljava/io/FileOutputStream;

    invoke-direct {p1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x1e

    invoke-virtual {v4, v0, v3, p1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {p1}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    :cond_5
    :goto_2
    if-nez v1, :cond_6

    invoke-virtual {p0}, Lcom/superbock/bean/AInfo;->getCo()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Lcom/superbock/bean/AInfo;->setCo(I)V

    :try_start_1
    invoke-static {}, Lg3/a;->b()Lg3/a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lg3/a;->d(Lcom/superbock/bean/AInfo;)V
    :try_end_1
    .catch Ljava/sql/SQLException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void

    :cond_6
    invoke-static {}, Lk/j0;->k()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lk3/f$d;

    invoke-direct {v0, p0}, Lk3/f$d;-><init>(Lcom/superbock/bean/AInfo;)V

    invoke-static {p1, v1, v0}, Lk3/b;->b(Ljava/lang/String;Ljava/io/File;Ls3/e;)V

    :goto_3
    return-void
.end method

.method public static v(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V
    .locals 3

    new-instance v0, Lf/e;

    invoke-direct {v0}, Lf/e;-><init>()V

    const-string v1, "action"

    const-string v2, "saveImages"

    invoke-virtual {v0, v1, v2}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lk3/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "deviceId"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/superbock/bean/EInfo;->getId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "imagesId"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/superbock/bean/EInfo;->getNa()Ljava/lang/String;

    move-result-object v1

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/superbock/bean/EInfo;->getMo()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "modifyDate"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/superbock/bean/EInfo;->getMe()Ljava/lang/String;

    move-result-object v1

    const-string v2, "media"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/superbock/bean/EInfo;->getTh()Ljava/lang/String;

    move-result-object v1

    const-string v2, "thumb"

    invoke-virtual {v0, v2, v1}, Lf/e;->C(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lk3/f$a;

    invoke-direct {v1, p0, p1}, Lk3/f$a;-><init>(Lcom/superbock/bean/EInfo;Landroid/content/Context;)V

    invoke-static {v0, v1}, Lk3/i;->a(Lf/e;Ls3/e;)V

    return-void
.end method
