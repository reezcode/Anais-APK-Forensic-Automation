.class public final Lc0/a;
.super Ljava/lang/Object;

# interfaces
.implements Lp/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc0/a$b;,
        Lc0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp/j<",
        "Ljava/nio/ByteBuffer;",
        "Lc0/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:Lc0/a$a;

.field public static final g:Lc0/a$b;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lc0/a$b;

.field public final d:Lc0/a$a;

.field public final e:Lc0/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc0/a$a;

    invoke-direct {v0}, Lc0/a$a;-><init>()V

    sput-object v0, Lc0/a;->f:Lc0/a$a;

    new-instance v0, Lc0/a$b;

    invoke-direct {v0}, Lc0/a$b;-><init>()V

    sput-object v0, Lc0/a;->g:Lc0/a$b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Ls/d;Ls/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/ImageHeaderParser;",
            ">;",
            "Ls/d;",
            "Ls/b;",
            ")V"
        }
    .end annotation

    sget-object v0, Lc0/a;->g:Lc0/a$b;

    sget-object v1, Lc0/a;->f:Lc0/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lc0/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lc0/a;->b:Ljava/util/List;

    iput-object v1, p0, Lc0/a;->d:Lc0/a$a;

    new-instance p1, Lc0/b;

    invoke-direct {p1, p3, p4}, Lc0/b;-><init>(Ls/d;Ls/b;)V

    iput-object p1, p0, Lc0/a;->e:Lc0/b;

    iput-object v0, p0, Lc0/a;->c:Lc0/a$b;

    return-void
.end method

.method public static d(Lo/c;II)I
    .locals 4

    iget v0, p0, Lo/c;->g:I

    div-int/2addr v0, p2

    iget v1, p0, Lo/c;->f:I

    div-int/2addr v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v2, 0x2

    const-string v3, "BufferGifDecoder"

    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    if-le v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Downsampling GIF, sampleSize: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", target dimens: ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "x"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "], actual dimens: ["

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lo/c;->f:I

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lo/c;->g:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lp/h;)Z
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    check-cast p1, Ljava/nio/ByteBuffer;

    sget-object v0, Lc0/i;->b:Lp/g;

    invoke-virtual {p2, v0}, Lp/h;->c(Lp/g;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_3

    iget-object p2, p0, Lc0/a;->b:Ljava/util/List;

    if-nez p1, :cond_0

    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    goto :goto_1

    :cond_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/bumptech/glide/load/ImageHeaderParser;

    invoke-interface {v3, p1}, Lcom/bumptech/glide/load/ImageHeaderParser;->a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v3

    sget-object v4, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v3, v4, :cond_1

    move-object p1, v3

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    :goto_1
    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, p2, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public final b(Ljava/lang/Object;IILp/h;)Lr/w;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lp/h;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object v1, p1

    check-cast v1, Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lc0/a;->c:Lc0/a$b;

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lc0/a$b;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/d;

    if-nez v0, :cond_0

    new-instance v0, Lo/d;

    invoke-direct {v0}, Lo/d;-><init>()V

    :cond_0
    move-object v6, v0

    const/4 v7, 0x0

    iput-object v7, v6, Lo/d;->b:Ljava/nio/ByteBuffer;

    iget-object v0, v6, Lo/d;->a:[B

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V

    new-instance v0, Lo/c;

    invoke-direct {v0}, Lo/c;-><init>()V

    iput-object v0, v6, Lo/d;->c:Lo/c;

    iput v2, v6, Lo/d;->d:I

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v6, Lo/d;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v6, Lo/d;->b:Ljava/nio/ByteBuffer;

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    monitor-exit p1

    move-object v0, p0

    move v2, p2

    move v3, p3

    move-object v4, v6

    move-object v5, p4

    :try_start_1
    invoke-virtual/range {v0 .. v5}, Lc0/a;->c(Ljava/nio/ByteBuffer;IILo/d;Lp/h;)Lc0/e;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p2, p0, Lc0/a;->c:Lc0/a$b;

    monitor-enter p2

    :try_start_2
    iput-object v7, v6, Lo/d;->b:Ljava/nio/ByteBuffer;

    iput-object v7, v6, Lo/d;->c:Lo/c;

    iget-object p3, p2, Lc0/a$b;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p3, v6}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p2

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :catchall_1
    move-exception p1

    iget-object p2, p0, Lc0/a;->c:Lc0/a$b;

    monitor-enter p2

    :try_start_3
    iput-object v7, v6, Lo/d;->b:Ljava/nio/ByteBuffer;

    iput-object v7, v6, Lo/d;->c:Lo/c;

    iget-object p3, p2, Lc0/a$b;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p3, v6}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    monitor-exit p2

    throw p1

    :catchall_2
    move-exception p1

    monitor-exit p2

    throw p1

    :catchall_3
    move-exception p2

    monitor-exit p1

    throw p2
.end method

.method public final c(Ljava/nio/ByteBuffer;IILo/d;Lp/h;)Lc0/e;
    .locals 16
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    move-object/from16 v1, p0

    const-string v2, "Decoded GIF from stream in "

    const-string v3, "BufferGifDecoder"

    sget v0, Ll0/f;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v4

    const/4 v6, 0x2

    :try_start_0
    invoke-virtual/range {p4 .. p4}, Lo/d;->b()Lo/c;

    move-result-object v0

    iget v7, v0, Lo/c;->c:I

    const/4 v8, 0x0

    if-lez v7, :cond_5

    iget v7, v0, Lo/c;->b:I

    if-eqz v7, :cond_0

    goto/16 :goto_1

    :cond_0
    sget-object v7, Lc0/i;->a:Lp/g;

    move-object/from16 v9, p5

    invoke-virtual {v9, v7}, Lp/h;->c(Lp/g;)Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp/b;->c:Lp/b;

    if-ne v7, v9, :cond_1

    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_1
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    :goto_0
    move/from16 v13, p2

    move/from16 v14, p3

    invoke-static {v0, v13, v14}, Lc0/a;->d(Lo/c;II)I

    move-result v9

    iget-object v10, v1, Lc0/a;->d:Lc0/a$a;

    iget-object v11, v1, Lc0/a;->e:Lc0/b;

    invoke-static {v10}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v12, Lo/e;

    move-object/from16 v10, p1

    invoke-direct {v12, v11, v0, v10, v9}, Lo/e;-><init>(Lo/a$a;Lo/c;Ljava/nio/ByteBuffer;I)V

    invoke-virtual {v12, v7}, Lo/e;->i(Landroid/graphics/Bitmap$Config;)V

    iget v0, v12, Lo/e;->k:I

    add-int/lit8 v0, v0, 0x1

    iget-object v7, v12, Lo/e;->l:Lo/c;

    iget v7, v7, Lo/c;->c:I

    rem-int/2addr v0, v7

    iput v0, v12, Lo/e;->k:I

    invoke-virtual {v12}, Lo/e;->b()Landroid/graphics/Bitmap;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v15, :cond_3

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4, v5}, Ll0/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-object v8

    :cond_3
    :try_start_1
    sget-object v0, Lx/b;->b:Lx/b;

    new-instance v7, Lc0/c;

    iget-object v10, v1, Lc0/a;->a:Landroid/content/Context;

    move-object v9, v7

    move-object v11, v12

    move-object v12, v0

    move/from16 v13, p2

    move/from16 v14, p3

    invoke-direct/range {v9 .. v15}, Lc0/c;-><init>(Landroid/content/Context;Lo/a;Lp/l;IILandroid/graphics/Bitmap;)V

    new-instance v0, Lc0/e;

    invoke-direct {v0, v7}, Lc0/e;-><init>(Lc0/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4, v5}, Ll0/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-object v0

    :cond_5
    :goto_1
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v4, v5}, Ll0/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    return-object v8

    :catchall_0
    move-exception v0

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-static {v2}, Landroidx/activity/d;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v4, v5}, Ll0/f;->a(J)D

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    throw v0
.end method
