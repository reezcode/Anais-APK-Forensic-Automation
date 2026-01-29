.class public final Lcom/bumptech/glide/b;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/b$a;
    }
.end annotation


# static fields
.field public static volatile j:Lcom/bumptech/glide/b;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "Glide.class"
    .end annotation
.end field

.field public static volatile k:Z


# instance fields
.field public final b:Ls/d;

.field public final c:Lt/i;

.field public final d:Lcom/bumptech/glide/d;

.field public final e:Lcom/bumptech/glide/g;

.field public final f:Ls/b;

.field public final g:Le0/n;

.field public final h:Le0/d;

.field public final i:Ljava/util/ArrayList;
    .annotation build Landroidx/annotation/GuardedBy;
        value = "managers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lr/m;Lt/i;Ls/d;Ls/b;Le0/n;Le0/d;ILcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;Lcom/bumptech/glide/e;)V
    .locals 26
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lr/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lt/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ls/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ls/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Le0/n;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Le0/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p9    # Lcom/bumptech/glide/b$a;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p10    # Ljava/util/Map;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p11    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lr/m;",
            "Lt/i;",
            "Ls/d;",
            "Ls/b;",
            "Le0/n;",
            "Le0/d;",
            "I",
            "Lcom/bumptech/glide/b$a;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/j<",
            "**>;>;",
            "Ljava/util/List<",
            "Lh0/e<",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/bumptech/glide/e;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    move-object/from16 v4, p5

    const-class v3, Lo/a;

    const-class v5, Ljava/lang/String;

    const-class v6, Ljava/lang/Integer;

    const-class v7, [B

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    iput-object v8, v1, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    iput-object v2, v1, Lcom/bumptech/glide/b;->b:Ls/d;

    iput-object v4, v1, Lcom/bumptech/glide/b;->f:Ls/b;

    move-object/from16 v8, p3

    iput-object v8, v1, Lcom/bumptech/glide/b;->c:Lt/i;

    move-object/from16 v8, p6

    iput-object v8, v1, Lcom/bumptech/glide/b;->g:Le0/n;

    move-object/from16 v8, p7

    iput-object v8, v1, Lcom/bumptech/glide/b;->h:Le0/d;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    new-instance v9, Lcom/bumptech/glide/g;

    invoke-direct {v9}, Lcom/bumptech/glide/g;-><init>()V

    iput-object v9, v1, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/g;

    new-instance v10, Ly/k;

    invoke-direct {v10}, Ly/k;-><init>()V

    iget-object v11, v9, Lcom/bumptech/glide/g;->g:Lg0/b;

    monitor-enter v11

    :try_start_0
    iget-object v12, v11, Lg0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    monitor-exit v11

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1b

    if-lt v10, v11, :cond_0

    new-instance v11, Ly/p;

    invoke-direct {v11}, Ly/p;-><init>()V

    iget-object v12, v9, Lcom/bumptech/glide/g;->g:Lg0/b;

    monitor-enter v12

    :try_start_1
    iget-object v13, v12, Lg0/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v12

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v12

    throw v0

    :cond_0
    :goto_0
    invoke-virtual {v9}, Lcom/bumptech/glide/g;->e()Ljava/util/List;

    move-result-object v11

    new-instance v12, Lc0/a;

    invoke-direct {v12, v0, v11, v2, v4}, Lc0/a;-><init>(Landroid/content/Context;Ljava/util/List;Ls/d;Ls/b;)V

    new-instance v13, Ly/c0;

    new-instance v14, Ly/c0$g;

    invoke-direct {v14}, Ly/c0$g;-><init>()V

    invoke-direct {v13, v2, v14}, Ly/c0;-><init>(Ls/d;Ly/c0$f;)V

    new-instance v14, Ly/m;

    invoke-virtual {v9}, Lcom/bumptech/glide/g;->e()Ljava/util/List;

    move-result-object v15

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-direct {v14, v15, v1, v2, v4}, Ly/m;-><init>(Ljava/util/List;Landroid/util/DisplayMetrics;Ls/d;Ls/b;)V

    const-class v1, Lcom/bumptech/glide/c$b;

    move-object/from16 v15, p12

    invoke-virtual {v15, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x1c

    if-lt v10, v1, :cond_1

    new-instance v1, Ly/t;

    invoke-direct {v1}, Ly/t;-><init>()V

    new-instance v16, Ly/h;

    invoke-direct/range {v16 .. v16}, Ly/h;-><init>()V

    move-object/from16 v15, v16

    goto :goto_1

    :cond_1
    new-instance v1, Ly/g;

    invoke-direct {v1, v14}, Ly/g;-><init>(Ly/m;)V

    move-object/from16 p3, v1

    new-instance v1, Ly/z;

    invoke-direct {v1, v14, v4}, Ly/z;-><init>(Ly/m;Ls/b;)V

    move-object/from16 v15, p3

    :goto_1
    move-object/from16 v16, v7

    new-instance v7, La0/d;

    invoke-direct {v7, v0}, La0/d;-><init>(Landroid/content/Context;)V

    move/from16 p3, v10

    new-instance v10, Lv/t$c;

    invoke-direct {v10, v8}, Lv/t$c;-><init>(Landroid/content/res/Resources;)V

    new-instance v0, Lv/t$d;

    invoke-direct {v0, v8}, Lv/t$d;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 v17, v5

    new-instance v5, Lv/t$b;

    invoke-direct {v5, v8}, Lv/t$b;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 p6, v0

    new-instance v0, Lv/t$a;

    invoke-direct {v0, v8}, Lv/t$a;-><init>(Landroid/content/res/Resources;)V

    move-object/from16 p7, v0

    new-instance v0, Ly/c;

    invoke-direct {v0, v4}, Ly/c;-><init>(Ls/b;)V

    move-object/from16 v18, v6

    new-instance v6, Ld0/a;

    invoke-direct {v6}, Ld0/a;-><init>()V

    move-object/from16 v19, v6

    new-instance v6, Ld0/d;

    invoke-direct {v6}, Ld0/d;-><init>()V

    move-object/from16 v20, v6

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    move-object/from16 v21, v6

    const-class v6, Ljava/nio/ByteBuffer;

    move-object/from16 v22, v5

    new-instance v5, Lv/c;

    invoke-direct {v5}, Lv/c;-><init>()V

    move-object/from16 v23, v10

    iget-object v10, v9, Lcom/bumptech/glide/g;->b:Lg0/a;

    monitor-enter v10

    move-object/from16 v24, v7

    :try_start_2
    iget-object v7, v10, Lg0/a;->a:Ljava/util/ArrayList;

    move-object/from16 v25, v3

    new-instance v3, Lg0/a$a;

    invoke-direct {v3, v6, v5}, Lg0/a$a;-><init>(Ljava/lang/Class;Lp/d;)V

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    monitor-exit v10

    const-class v3, Ljava/io/InputStream;

    new-instance v5, Lv/u;

    invoke-direct {v5, v4}, Lv/u;-><init>(Ls/b;)V

    iget-object v6, v9, Lcom/bumptech/glide/g;->b:Lg0/a;

    monitor-enter v6

    :try_start_3
    iget-object v7, v6, Lg0/a;->a:Ljava/util/ArrayList;

    new-instance v10, Lg0/a$a;

    invoke-direct {v10, v3, v5}, Lg0/a$a;-><init>(Ljava/lang/Class;Lp/d;)V

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v6

    const-string v3, "Bitmap"

    const-class v5, Ljava/nio/ByteBuffer;

    const-class v6, Landroid/graphics/Bitmap;

    invoke-virtual {v9, v3, v5, v6, v15}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-string v3, "Bitmap"

    const-class v5, Ljava/io/InputStream;

    const-class v6, Landroid/graphics/Bitmap;

    invoke-virtual {v9, v3, v5, v6, v1}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-string v3, "Bitmap"

    const-class v5, Landroid/os/ParcelFileDescriptor;

    const-class v6, Landroid/graphics/Bitmap;

    new-instance v7, Ly/v;

    invoke-direct {v7, v14}, Ly/v;-><init>(Ly/m;)V

    invoke-virtual {v9, v3, v5, v6, v7}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-string v3, "Bitmap"

    const-class v5, Landroid/os/ParcelFileDescriptor;

    const-class v6, Landroid/graphics/Bitmap;

    invoke-virtual {v9, v3, v5, v6, v13}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-string v3, "Bitmap"

    const-class v5, Landroid/content/res/AssetFileDescriptor;

    const-class v6, Landroid/graphics/Bitmap;

    new-instance v7, Ly/c0;

    new-instance v10, Ly/c0$c;

    invoke-direct {v10}, Ly/c0$c;-><init>()V

    invoke-direct {v7, v2, v10}, Ly/c0;-><init>(Ls/d;Ly/c0$f;)V

    invoke-virtual {v9, v3, v5, v6, v7}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v3, Landroid/graphics/Bitmap;

    const-class v5, Landroid/graphics/Bitmap;

    sget-object v6, Lv/w$a;->a:Lv/w$a;

    invoke-virtual {v9, v3, v5, v6}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-string v3, "Bitmap"

    const-class v5, Landroid/graphics/Bitmap;

    const-class v7, Landroid/graphics/Bitmap;

    new-instance v10, Ly/b0;

    invoke-direct {v10}, Ly/b0;-><init>()V

    invoke-virtual {v9, v3, v5, v7, v10}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v3, Landroid/graphics/Bitmap;

    invoke-virtual {v9, v3, v0}, Lcom/bumptech/glide/g;->c(Ljava/lang/Class;Lp/k;)Lcom/bumptech/glide/g;

    const-string v3, "BitmapDrawable"

    const-class v5, Ljava/nio/ByteBuffer;

    const-class v7, Landroid/graphics/drawable/BitmapDrawable;

    new-instance v10, Ly/a;

    invoke-direct {v10, v8, v15}, Ly/a;-><init>(Landroid/content/res/Resources;Lp/j;)V

    invoke-virtual {v9, v3, v5, v7, v10}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-string v3, "BitmapDrawable"

    const-class v5, Ljava/io/InputStream;

    const-class v7, Landroid/graphics/drawable/BitmapDrawable;

    new-instance v10, Ly/a;

    invoke-direct {v10, v8, v1}, Ly/a;-><init>(Landroid/content/res/Resources;Lp/j;)V

    invoke-virtual {v9, v3, v5, v7, v10}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-string v1, "BitmapDrawable"

    const-class v3, Landroid/os/ParcelFileDescriptor;

    const-class v5, Landroid/graphics/drawable/BitmapDrawable;

    new-instance v7, Ly/a;

    invoke-direct {v7, v8, v13}, Ly/a;-><init>(Landroid/content/res/Resources;Lp/j;)V

    invoke-virtual {v9, v1, v3, v5, v7}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    new-instance v3, Ly/b;

    invoke-direct {v3, v2, v0}, Ly/b;-><init>(Ls/d;Lp/k;)V

    invoke-virtual {v9, v1, v3}, Lcom/bumptech/glide/g;->c(Ljava/lang/Class;Lp/k;)Lcom/bumptech/glide/g;

    const-string v0, "Gif"

    const-class v1, Ljava/io/InputStream;

    const-class v3, Lc0/c;

    new-instance v5, Lc0/j;

    invoke-direct {v5, v11, v12, v4}, Lc0/j;-><init>(Ljava/util/List;Lp/j;Ls/b;)V

    invoke-virtual {v9, v0, v1, v3, v5}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-string v0, "Gif"

    const-class v1, Ljava/nio/ByteBuffer;

    const-class v3, Lc0/c;

    invoke-virtual {v9, v0, v1, v3, v12}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v0, Lc0/c;

    new-instance v1, Lc0/d;

    invoke-direct {v1}, Lc0/d;-><init>()V

    invoke-virtual {v9, v0, v1}, Lcom/bumptech/glide/g;->c(Ljava/lang/Class;Lp/k;)Lcom/bumptech/glide/g;

    move-object/from16 v0, v25

    invoke-virtual {v9, v0, v0, v6}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-string v1, "Bitmap"

    const-class v3, Landroid/graphics/Bitmap;

    new-instance v5, Lc0/h;

    invoke-direct {v5, v2}, Lc0/h;-><init>(Ls/d;)V

    invoke-virtual {v9, v1, v0, v3, v5}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v1, Landroid/graphics/drawable/Drawable;

    const-string v3, "legacy_append"

    move-object/from16 v5, v24

    invoke-virtual {v9, v3, v0, v1, v5}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v1, Landroid/graphics/Bitmap;

    new-instance v3, Ly/x;

    invoke-direct {v3, v5, v2}, Ly/x;-><init>(La0/d;Ls/d;)V

    const-string v5, "legacy_append"

    invoke-virtual {v9, v5, v0, v1, v3}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    new-instance v0, Lz/a$a;

    invoke-direct {v0}, Lz/a$a;-><init>()V

    invoke-virtual {v9, v0}, Lcom/bumptech/glide/g;->g(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/File;

    const-class v1, Ljava/nio/ByteBuffer;

    new-instance v3, Lv/d$b;

    invoke-direct {v3}, Lv/d$b;-><init>()V

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/File;

    const-class v1, Ljava/io/InputStream;

    new-instance v3, Lv/f$e;

    invoke-direct {v3}, Lv/f$e;-><init>()V

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/File;

    const-class v1, Ljava/io/File;

    new-instance v3, Lb0/a;

    invoke-direct {v3}, Lb0/a;-><init>()V

    const-string v5, "legacy_append"

    invoke-virtual {v9, v5, v0, v1, v3}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/File;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    new-instance v3, Lv/f$b;

    invoke-direct {v3}, Lv/f$b;-><init>()V

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/File;

    const-class v1, Ljava/io/File;

    invoke-virtual {v9, v0, v1, v6}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    new-instance v0, Lcom/bumptech/glide/load/data/k$a;

    invoke-direct {v0, v4}, Lcom/bumptech/glide/load/data/k$a;-><init>(Ls/b;)V

    invoke-virtual {v9, v0}, Lcom/bumptech/glide/g;->g(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/g;

    new-instance v0, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;

    invoke-direct {v0}, Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder$a;-><init>()V

    invoke-virtual {v9, v0}, Lcom/bumptech/glide/g;->g(Lcom/bumptech/glide/load/data/e$a;)Lcom/bumptech/glide/g;

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v1, Ljava/io/InputStream;

    move-object/from16 v3, v23

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    move-object/from16 v5, v22

    invoke-virtual {v9, v0, v1, v5}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v1, Ljava/io/InputStream;

    move-object/from16 v7, v18

    invoke-virtual {v9, v7, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    invoke-virtual {v9, v7, v1, v5}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v1, Landroid/net/Uri;

    move-object/from16 v3, p6

    invoke-virtual {v9, v7, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v1, Landroid/content/res/AssetFileDescriptor;

    move-object/from16 v5, p7

    invoke-virtual {v9, v0, v1, v5}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v1, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v9, v7, v1, v5}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v1, Landroid/net/Uri;

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/InputStream;

    new-instance v1, Lv/e$c;

    invoke-direct {v1}, Lv/e$c;-><init>()V

    move-object/from16 v3, v17

    invoke-virtual {v9, v3, v0, v1}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v1, Ljava/io/InputStream;

    new-instance v5, Lv/e$c;

    invoke-direct {v5}, Lv/e$c;-><init>()V

    invoke-virtual {v9, v0, v1, v5}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/InputStream;

    new-instance v1, Lv/v$c;

    invoke-direct {v1}, Lv/v$c;-><init>()V

    invoke-virtual {v9, v3, v0, v1}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/os/ParcelFileDescriptor;

    new-instance v1, Lv/v$b;

    invoke-direct {v1}, Lv/v$b;-><init>()V

    invoke-virtual {v9, v3, v0, v1}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/content/res/AssetFileDescriptor;

    new-instance v1, Lv/v$a;

    invoke-direct {v1}, Lv/v$a;-><init>()V

    invoke-virtual {v9, v3, v0, v1}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v1, Ljava/io/InputStream;

    new-instance v3, Lv/a$c;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    invoke-direct {v3, v5}, Lv/a$c;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v1, Landroid/os/ParcelFileDescriptor;

    new-instance v3, Lv/a$b;

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v5

    invoke-direct {v3, v5}, Lv/a$b;-><init>(Landroid/content/res/AssetManager;)V

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v1, Ljava/io/InputStream;

    new-instance v3, Lw/b$a;

    move-object/from16 v5, p1

    invoke-direct {v3, v5}, Lw/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v1, Ljava/io/InputStream;

    new-instance v3, Lw/c$a;

    invoke-direct {v3, v5}, Lw/c$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v0, v1, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const/16 v0, 0x1d

    move/from16 v1, p3

    if-lt v1, v0, :cond_2

    const-class v0, Landroid/net/Uri;

    const-class v3, Ljava/io/InputStream;

    new-instance v7, Lw/d$c;

    invoke-direct {v7, v5}, Lw/d$c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v3, Landroid/os/ParcelFileDescriptor;

    new-instance v7, Lw/d$b;

    invoke-direct {v7, v5}, Lw/d$b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    :cond_2
    const-class v0, Landroid/net/Uri;

    const-class v3, Ljava/io/InputStream;

    new-instance v7, Lv/x$d;

    move-object/from16 v10, v21

    invoke-direct {v7, v10}, Lv/x$d;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v3, Landroid/os/ParcelFileDescriptor;

    new-instance v7, Lv/x$b;

    invoke-direct {v7, v10}, Lv/x$b;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v3, Landroid/content/res/AssetFileDescriptor;

    new-instance v7, Lv/x$a;

    invoke-direct {v7, v10}, Lv/x$a;-><init>(Landroid/content/ContentResolver;)V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v3, Ljava/io/InputStream;

    new-instance v7, Lv/y$a;

    invoke-direct {v7}, Lv/y$a;-><init>()V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/net/URL;

    const-class v3, Ljava/io/InputStream;

    new-instance v7, Lw/e$a;

    invoke-direct {v7}, Lw/e$a;-><init>()V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v3, Ljava/io/File;

    new-instance v7, Lv/k$a;

    invoke-direct {v7, v5}, Lv/k$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Lv/g;

    const-class v3, Ljava/io/InputStream;

    new-instance v7, Lw/a$a;

    invoke-direct {v7}, Lw/a$a;-><init>()V

    invoke-virtual {v9, v0, v3, v7}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/nio/ByteBuffer;

    new-instance v3, Lv/b$a;

    invoke-direct {v3}, Lv/b$a;-><init>()V

    move-object/from16 v7, v16

    invoke-virtual {v9, v7, v0, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Ljava/io/InputStream;

    new-instance v3, Lv/b$d;

    invoke-direct {v3}, Lv/b$d;-><init>()V

    invoke-virtual {v9, v7, v0, v3}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/net/Uri;

    const-class v3, Landroid/net/Uri;

    invoke-virtual {v9, v0, v3, v6}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/graphics/drawable/Drawable;

    const-class v3, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v9, v0, v3, v6}, Lcom/bumptech/glide/g;->b(Ljava/lang/Class;Ljava/lang/Class;Lv/p;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/graphics/drawable/Drawable;

    const-class v3, Landroid/graphics/drawable/Drawable;

    new-instance v6, La0/e;

    invoke-direct {v6}, La0/e;-><init>()V

    const-string v10, "legacy_append"

    invoke-virtual {v9, v10, v0, v3, v6}, Lcom/bumptech/glide/g;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/graphics/Bitmap;

    const-class v3, Landroid/graphics/drawable/BitmapDrawable;

    new-instance v6, Ld0/b;

    invoke-direct {v6, v8}, Ld0/b;-><init>(Landroid/content/res/Resources;)V

    invoke-virtual {v9, v0, v3, v6}, Lcom/bumptech/glide/g;->h(Ljava/lang/Class;Ljava/lang/Class;Ld0/e;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/graphics/Bitmap;

    move-object/from16 v3, v19

    invoke-virtual {v9, v0, v7, v3}, Lcom/bumptech/glide/g;->h(Ljava/lang/Class;Ljava/lang/Class;Ld0/e;)Lcom/bumptech/glide/g;

    const-class v0, Landroid/graphics/drawable/Drawable;

    new-instance v6, Ld0/c;

    move-object/from16 v10, v20

    invoke-direct {v6, v2, v3, v10}, Ld0/c;-><init>(Ls/d;Ld0/e;Ld0/e;)V

    invoke-virtual {v9, v0, v7, v6}, Lcom/bumptech/glide/g;->h(Ljava/lang/Class;Ljava/lang/Class;Ld0/e;)Lcom/bumptech/glide/g;

    const-class v0, Lc0/c;

    invoke-virtual {v9, v0, v7, v10}, Lcom/bumptech/glide/g;->h(Ljava/lang/Class;Ljava/lang/Class;Ld0/e;)Lcom/bumptech/glide/g;

    const/16 v0, 0x17

    if-lt v1, v0, :cond_3

    new-instance v0, Ly/c0;

    new-instance v1, Ly/c0$d;

    invoke-direct {v1}, Ly/c0$d;-><init>()V

    invoke-direct {v0, v2, v1}, Ly/c0;-><init>(Ls/d;Ly/c0$f;)V

    const-class v1, Ljava/nio/ByteBuffer;

    const-class v2, Landroid/graphics/Bitmap;

    invoke-virtual {v9, v1, v2, v0}, Lcom/bumptech/glide/g;->a(Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    const-class v1, Ljava/nio/ByteBuffer;

    const-class v2, Landroid/graphics/drawable/BitmapDrawable;

    new-instance v3, Ly/a;

    invoke-direct {v3, v8, v0}, Ly/a;-><init>(Landroid/content/res/Resources;Lp/j;)V

    invoke-virtual {v9, v1, v2, v3}, Lcom/bumptech/glide/g;->a(Ljava/lang/Class;Ljava/lang/Class;Lp/j;)Lcom/bumptech/glide/g;

    :cond_3
    new-instance v6, Li/g;

    invoke-direct {v6}, Li/g;-><init>()V

    new-instance v0, Lcom/bumptech/glide/d;

    move-object v2, v0

    move-object/from16 v3, p1

    move-object/from16 v4, p5

    move-object v5, v9

    move-object/from16 v7, p9

    move-object/from16 v8, p10

    move-object/from16 v9, p11

    move-object/from16 v10, p2

    move-object/from16 v11, p12

    move/from16 v12, p8

    invoke-direct/range {v2 .. v12}, Lcom/bumptech/glide/d;-><init>(Landroid/content/Context;Ls/b;Lcom/bumptech/glide/g;Li/g;Lcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;Lr/m;Lcom/bumptech/glide/e;I)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/bumptech/glide/b;->d:Lcom/bumptech/glide/d;

    return-void

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    monitor-exit v6

    throw v0

    :catchall_2
    move-exception v0

    move-object/from16 v1, p0

    monitor-exit v10

    throw v0

    :catchall_3
    move-exception v0

    monitor-exit v11

    throw v0
.end method

.method public static a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V
    .locals 24
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Lcom/bumptech/glide/GeneratedAppGlideModule;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/GuardedBy;
        value = "Glide.class"
    .end annotation

    sget-boolean v0, Lcom/bumptech/glide/b;->k:Z

    if-nez v0, :cond_1c

    const/4 v0, 0x1

    sput-boolean v0, Lcom/bumptech/glide/b;->k:Z

    new-instance v1, Lcom/bumptech/glide/c;

    invoke-direct {v1}, Lcom/bumptech/glide/c;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    const-string v2, "ManifestParser"

    const/4 v3, 0x3

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Loading Glide modules"

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    invoke-virtual {v15}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/16 v6, 0x80

    invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v4

    iget-object v5, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const/4 v6, 0x2

    if-nez v5, :cond_1

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, "Got null app info metadata"

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_1
    invoke-static {v2, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Got app info metadata: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v5, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v5}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_3
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "GlideModule"

    iget-object v8, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    invoke-virtual {v8, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-static {v6}, Lf0/e;->a(Ljava/lang/String;)Lf0/c;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Loaded Glide module: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :cond_4
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v4, "Finished loading Glide modules"

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_1
    const-string v2, "Glide"

    if-eqz p1, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->c()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/bumptech/glide/GeneratedAppGlideModule;->c()Ljava/util/Set;

    move-result-object v4

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf0/c;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_2

    :cond_6
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "AppGlideModule excludes manifest GlideModule: "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_2

    :cond_8
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf0/c;

    const-string v5, "Discovered GlideModule from manifest: "

    invoke-static {v5}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    iput-object v2, v1, Lcom/bumptech/glide/c;->n:Le0/n$b;

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf0/c;

    invoke-interface {v3, v15, v1}, Lf0/b;->a(Landroid/content/Context;Lcom/bumptech/glide/c;)V

    goto :goto_4

    :cond_a
    iget-object v2, v1, Lcom/bumptech/glide/c;->g:Lu/a;

    const/4 v3, 0x0

    if-nez v2, :cond_c

    invoke-static {}, Lu/a;->a()I

    move-result v6

    const-string v2, "source"

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_b

    new-instance v12, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v7, 0x0

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v10, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v10}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v11, Lu/a$a;

    invoke-direct {v11, v2, v3}, Lu/a$a;-><init>(Ljava/lang/String;Z)V

    move-object v4, v12

    move v5, v6

    invoke-direct/range {v4 .. v11}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v2, Lu/a;

    invoke-direct {v2, v12}, Lu/a;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v2, v1, Lcom/bumptech/glide/c;->g:Lu/a;

    goto :goto_5

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: source"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_5
    iget-object v2, v1, Lcom/bumptech/glide/c;->h:Lu/a;

    if-nez v2, :cond_e

    sget v2, Lu/a;->d:I

    const-string v2, "disk-cache"

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_d

    new-instance v4, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v8, 0x0

    sget-object v10, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v11, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v11}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v12, Lu/a$a;

    invoke-direct {v12, v2, v0}, Lu/a$a;-><init>(Ljava/lang/String;Z)V

    const/4 v7, 0x1

    move-object v5, v4

    move v6, v7

    invoke-direct/range {v5 .. v12}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v2, Lu/a;

    invoke-direct {v2, v4}, Lu/a;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v2, v1, Lcom/bumptech/glide/c;->h:Lu/a;

    goto :goto_6

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: disk-cache"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_6
    iget-object v2, v1, Lcom/bumptech/glide/c;->o:Lu/a;

    if-nez v2, :cond_11

    invoke-static {}, Lu/a;->a()I

    move-result v2

    const/4 v4, 0x4

    if-lt v2, v4, :cond_f

    const/4 v2, 0x2

    const/4 v6, 0x2

    goto :goto_7

    :cond_f
    const/4 v2, 0x1

    const/4 v6, 0x1

    :goto_7
    const-string v2, "animation"

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_10

    new-instance v12, Ljava/util/concurrent/ThreadPoolExecutor;

    const-wide/16 v7, 0x0

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v10, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v10}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    new-instance v11, Lu/a$a;

    invoke-direct {v11, v2, v0}, Lu/a$a;-><init>(Ljava/lang/String;Z)V

    move-object v4, v12

    move v5, v6

    invoke-direct/range {v4 .. v11}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    new-instance v0, Lu/a;

    invoke-direct {v0, v12}, Lu/a;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iput-object v0, v1, Lcom/bumptech/glide/c;->o:Lu/a;

    goto :goto_8

    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Name must be non-null and non-empty, but given: animation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    :goto_8
    iget-object v0, v1, Lcom/bumptech/glide/c;->j:Lt/j;

    if-nez v0, :cond_12

    new-instance v0, Lt/j$a;

    invoke-direct {v0, v15}, Lt/j$a;-><init>(Landroid/content/Context;)V

    new-instance v2, Lt/j;

    invoke-direct {v2, v0}, Lt/j;-><init>(Lt/j$a;)V

    iput-object v2, v1, Lcom/bumptech/glide/c;->j:Lt/j;

    :cond_12
    iget-object v0, v1, Lcom/bumptech/glide/c;->k:Le0/f;

    if-nez v0, :cond_13

    new-instance v0, Le0/f;

    invoke-direct {v0}, Le0/f;-><init>()V

    iput-object v0, v1, Lcom/bumptech/glide/c;->k:Le0/f;

    :cond_13
    iget-object v0, v1, Lcom/bumptech/glide/c;->d:Ls/d;

    if-nez v0, :cond_15

    iget-object v0, v1, Lcom/bumptech/glide/c;->j:Lt/j;

    iget v0, v0, Lt/j;->a:I

    if-lez v0, :cond_14

    new-instance v2, Ls/j;

    int-to-long v4, v0

    invoke-direct {v2, v4, v5}, Ls/j;-><init>(J)V

    iput-object v2, v1, Lcom/bumptech/glide/c;->d:Ls/d;

    goto :goto_9

    :cond_14
    new-instance v0, Ls/e;

    invoke-direct {v0}, Ls/e;-><init>()V

    iput-object v0, v1, Lcom/bumptech/glide/c;->d:Ls/d;

    :cond_15
    :goto_9
    iget-object v0, v1, Lcom/bumptech/glide/c;->e:Ls/i;

    if-nez v0, :cond_16

    new-instance v0, Ls/i;

    iget-object v2, v1, Lcom/bumptech/glide/c;->j:Lt/j;

    iget v2, v2, Lt/j;->d:I

    invoke-direct {v0, v2}, Ls/i;-><init>(I)V

    iput-object v0, v1, Lcom/bumptech/glide/c;->e:Ls/i;

    :cond_16
    iget-object v0, v1, Lcom/bumptech/glide/c;->f:Lt/h;

    if-nez v0, :cond_17

    new-instance v0, Lt/h;

    iget-object v2, v1, Lcom/bumptech/glide/c;->j:Lt/j;

    iget v2, v2, Lt/j;->b:I

    int-to-long v4, v2

    invoke-direct {v0, v4, v5}, Lt/h;-><init>(J)V

    iput-object v0, v1, Lcom/bumptech/glide/c;->f:Lt/h;

    :cond_17
    iget-object v0, v1, Lcom/bumptech/glide/c;->i:Lt/g;

    if-nez v0, :cond_18

    new-instance v0, Lt/g;

    invoke-direct {v0, v15}, Lt/g;-><init>(Landroid/content/Context;)V

    iput-object v0, v1, Lcom/bumptech/glide/c;->i:Lt/g;

    :cond_18
    iget-object v0, v1, Lcom/bumptech/glide/c;->c:Lr/m;

    if-nez v0, :cond_19

    new-instance v0, Lr/m;

    iget-object v5, v1, Lcom/bumptech/glide/c;->f:Lt/h;

    iget-object v6, v1, Lcom/bumptech/glide/c;->i:Lt/g;

    iget-object v7, v1, Lcom/bumptech/glide/c;->h:Lu/a;

    iget-object v8, v1, Lcom/bumptech/glide/c;->g:Lu/a;

    new-instance v9, Lu/a;

    new-instance v2, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-wide v19, Lu/a;->c:J

    sget-object v21, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v22, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct/range {v22 .. v22}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    new-instance v4, Lu/a$a;

    const-string v10, "source-unlimited"

    invoke-direct {v4, v10, v3}, Lu/a$a;-><init>(Ljava/lang/String;Z)V

    const/16 v17, 0x0

    const v18, 0x7fffffff

    move-object/from16 v16, v2

    move-object/from16 v23, v4

    invoke-direct/range {v16 .. v23}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {v9, v2}, Lu/a;-><init>(Ljava/util/concurrent/ExecutorService;)V

    iget-object v10, v1, Lcom/bumptech/glide/c;->o:Lu/a;

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lr/m;-><init>(Lt/i;Lt/a$a;Lu/a;Lu/a;Lu/a;Lu/a;)V

    iput-object v0, v1, Lcom/bumptech/glide/c;->c:Lr/m;

    :cond_19
    iget-object v0, v1, Lcom/bumptech/glide/c;->p:Ljava/util/List;

    if-nez v0, :cond_1a

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_a

    :cond_1a
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    :goto_a
    iput-object v0, v1, Lcom/bumptech/glide/c;->p:Ljava/util/List;

    iget-object v0, v1, Lcom/bumptech/glide/c;->b:Lcom/bumptech/glide/e$a;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v13, Lcom/bumptech/glide/e;

    invoke-direct {v13, v0}, Lcom/bumptech/glide/e;-><init>(Lcom/bumptech/glide/e$a;)V

    new-instance v8, Le0/n;

    iget-object v0, v1, Lcom/bumptech/glide/c;->n:Le0/n$b;

    invoke-direct {v8, v0, v13}, Le0/n;-><init>(Le0/n$b;Lcom/bumptech/glide/e;)V

    new-instance v0, Lcom/bumptech/glide/b;

    iget-object v4, v1, Lcom/bumptech/glide/c;->c:Lr/m;

    iget-object v5, v1, Lcom/bumptech/glide/c;->f:Lt/h;

    iget-object v6, v1, Lcom/bumptech/glide/c;->d:Ls/d;

    iget-object v7, v1, Lcom/bumptech/glide/c;->e:Ls/i;

    iget-object v9, v1, Lcom/bumptech/glide/c;->k:Le0/f;

    iget v10, v1, Lcom/bumptech/glide/c;->l:I

    iget-object v11, v1, Lcom/bumptech/glide/c;->m:Lcom/bumptech/glide/c$a;

    iget-object v12, v1, Lcom/bumptech/glide/c;->a:Landroidx/collection/ArrayMap;

    iget-object v1, v1, Lcom/bumptech/glide/c;->p:Ljava/util/List;

    const/16 v16, 0x0

    move-object v2, v0

    move-object v3, v15

    move-object/from16 v17, v13

    move-object v13, v1

    move-object v1, v14

    move-object/from16 v14, v17

    invoke-direct/range {v2 .. v14}, Lcom/bumptech/glide/b;-><init>(Landroid/content/Context;Lr/m;Lt/i;Ls/d;Ls/b;Le0/n;Le0/d;ILcom/bumptech/glide/b$a;Ljava/util/Map;Ljava/util/List;Lcom/bumptech/glide/e;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf0/c;

    :try_start_1
    iget-object v3, v0, Lcom/bumptech/glide/b;->e:Lcom/bumptech/glide/g;

    invoke-interface {v2, v15, v0, v3}, Lf0/f;->b(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/g;)V
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_b

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v3, "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you\'re using Glide v4. You\'ll need to find and remove (or update) the offending dependency. The v3 module name is: "

    invoke-static {v3}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1b
    invoke-virtual {v15, v0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    sput-object v0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    sput-boolean v16, Lcom/bumptech/glide/b;->k:Z

    return-void

    :catch_1
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to find metadata to parse GlideModules"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Landroid/content/Context;)Lcom/bumptech/glide/b;
    .locals 7
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "com.bumptech.glide.GeneratedAppGlideModuleImpl"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Class;

    const-class v5, Landroid/content/Context;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    aput-object v0, v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/GeneratedAppGlideModule;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Ljava/lang/Exception;)V

    throw v1

    :catch_1
    move-exception p0

    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Ljava/lang/Exception;)V

    throw v1

    :catch_2
    move-exception p0

    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Ljava/lang/Exception;)V

    throw v1

    :catch_3
    move-exception p0

    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Ljava/lang/Exception;)V

    throw v1

    :catch_4
    nop

    const/4 v0, 0x5

    const-string v2, "Glide"

    invoke-static {v2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"

    invoke-static {v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    const-class v0, Lcom/bumptech/glide/b;

    monitor-enter v0

    :try_start_1
    sget-object v2, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    if-nez v2, :cond_1

    invoke-static {p0, v1}, Lcom/bumptech/glide/b;->a(Landroid/content/Context;Lcom/bumptech/glide/GeneratedAppGlideModule;)V

    :cond_1
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_2
    :goto_1
    sget-object p0, Lcom/bumptech/glide/b;->j:Lcom/bumptech/glide/b;

    return-object p0
.end method

.method public static c(Landroid/content/Context;)Le0/n;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0}, Lcom/bumptech/glide/b;->b(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object p0

    iget-object p0, p0, Lcom/bumptech/glide/b;->g:Le0/n;

    return-object p0
.end method

.method public static d(Ljava/lang/Exception;)V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "GeneratedAppGlideModuleImpl is implemented incorrectly. If you\'ve manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static f(Landroid/content/Context;)Lcom/bumptech/glide/i;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v0

    invoke-virtual {v0, p0}, Le0/n;->f(Landroid/content/Context;)Lcom/bumptech/glide/i;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/view/View;)Lcom/bumptech/glide/i;
    .locals 6
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Le0/n;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ll0/k;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "Unable to obtain a request manager for a view without a Context"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Le0/n;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    if-nez v1, :cond_1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Le0/n;->f(Landroid/content/Context;)Lcom/bumptech/glide/i;

    move-result-object p0

    goto/16 :goto_5

    :cond_1
    instance-of v2, v1, Landroidx/fragment/app/FragmentActivity;

    const/4 v3, 0x0

    const v4, 0x1020002

    if-eqz v2, :cond_7

    check-cast v1, Landroidx/fragment/app/FragmentActivity;

    iget-object v2, v0, Le0/n;->f:Landroidx/collection/ArrayMap;

    invoke-virtual {v2}, Landroidx/collection/SimpleArrayMap;->clear()V

    invoke-virtual {v1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object v2

    iget-object v5, v0, Le0/n;->f:Landroidx/collection/ArrayMap;

    invoke-static {v2, v5}, Le0/n;->c(Ljava/util/Collection;Ljava/util/Map;)V

    invoke-virtual {v1, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    :goto_1
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    iget-object v3, v0, Le0/n;->f:Landroidx/collection/ArrayMap;

    invoke-virtual {v3, p0}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/fragment/app/Fragment;

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v4, v4, Landroid/view/View;

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_1

    :cond_3
    :goto_2
    iget-object p0, v0, Le0/n;->f:Landroidx/collection/ArrayMap;

    invoke-virtual {p0}, Landroidx/collection/SimpleArrayMap;->clear()V

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v1, "You cannot start a load on a fragment before it is attached or after it is destroyed"

    invoke-static {p0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {}, Ll0/k;->h()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Le0/n;->f(Landroid/content/Context;)Lcom/bumptech/glide/i;

    move-result-object p0

    goto/16 :goto_5

    :cond_4
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    if-eqz p0, :cond_5

    iget-object p0, v0, Le0/n;->i:Le0/j;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    invoke-interface {p0}, Le0/j;->a()V

    :cond_5
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isVisible()Z

    move-result v2

    invoke-virtual {v0, v1, p0, v3, v2}, Le0/n;->j(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroidx/fragment/app/Fragment;Z)Lcom/bumptech/glide/i;

    move-result-object p0

    goto/16 :goto_5

    :cond_6
    invoke-virtual {v0, v1}, Le0/n;->g(Landroidx/fragment/app/FragmentActivity;)Lcom/bumptech/glide/i;

    move-result-object p0

    goto/16 :goto_5

    :cond_7
    iget-object v2, v0, Le0/n;->g:Landroidx/collection/ArrayMap;

    invoke-virtual {v2}, Landroidx/collection/SimpleArrayMap;->clear()V

    invoke-virtual {v1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v2

    iget-object v5, v0, Le0/n;->g:Landroidx/collection/ArrayMap;

    invoke-virtual {v0, v2, v5}, Le0/n;->b(Landroid/app/FragmentManager;Landroidx/collection/ArrayMap;)V

    invoke-virtual {v1, v4}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    :goto_3
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    iget-object v3, v0, Le0/n;->g:Landroidx/collection/ArrayMap;

    invoke-virtual {v3, p0}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Fragment;

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v4, v4, Landroid/view/View;

    if-eqz v4, :cond_9

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    check-cast p0, Landroid/view/View;

    goto :goto_3

    :cond_9
    :goto_4
    iget-object p0, v0, Le0/n;->g:Landroidx/collection/ArrayMap;

    invoke-virtual {p0}, Landroidx/collection/SimpleArrayMap;->clear()V

    if-nez v3, :cond_a

    invoke-virtual {v0, v1}, Le0/n;->e(Landroid/app/Activity;)Lcom/bumptech/glide/i;

    move-result-object p0

    goto :goto_5

    :cond_a
    invoke-virtual {v3}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_d

    invoke-static {}, Ll0/k;->h()Z

    move-result p0

    if-nez p0, :cond_c

    invoke-virtual {v3}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_b

    iget-object p0, v0, Le0/n;->i:Le0/j;

    invoke-virtual {v3}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    invoke-interface {p0}, Le0/j;->a()V

    :cond_b
    invoke-virtual {v3}, Landroid/app/Fragment;->getChildFragmentManager()Landroid/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v3}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v3}, Landroid/app/Fragment;->isVisible()Z

    move-result v2

    invoke-virtual {v0, v1, p0, v3, v2}, Le0/n;->d(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/i;

    move-result-object p0

    goto :goto_5

    :cond_c
    invoke-virtual {v3}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {v0, p0}, Le0/n;->f(Landroid/content/Context;)Lcom/bumptech/glide/i;

    move-result-object p0

    :goto_5
    return-object p0

    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a fragment before it is attached"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final e(Lcom/bumptech/glide/i;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot unregister not yet registered manager"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 3

    invoke-static {}, Ll0/k;->a()V

    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Lt/i;

    check-cast v0, Ll0/g;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ll0/g;->e(J)V

    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Ls/d;

    invoke-interface {v0}, Ls/d;->a()V

    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Ls/b;

    invoke-interface {v0}, Ls/b;->a()V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 5

    invoke-static {}, Ll0/k;->a()V

    iget-object v0, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/b;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bumptech/glide/i;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget-object v0, p0, Lcom/bumptech/glide/b;->c:Lt/i;

    check-cast v0, Lt/h;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x28

    if-lt p1, v1, :cond_1

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ll0/g;->e(J)V

    goto :goto_1

    :cond_1
    const/16 v1, 0x14

    if-ge p1, v1, :cond_2

    const/16 v1, 0xf

    if-ne p1, v1, :cond_3

    :cond_2
    monitor-enter v0

    :try_start_1
    iget-wide v1, v0, Ll0/g;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const-wide/16 v3, 0x2

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ll0/g;->e(J)V

    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/bumptech/glide/b;->b:Ls/d;

    invoke-interface {v0, p1}, Ls/d;->trimMemory(I)V

    iget-object v0, p0, Lcom/bumptech/glide/b;->f:Ls/b;

    invoke-interface {v0, p1}, Ls/b;->trimMemory(I)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method
