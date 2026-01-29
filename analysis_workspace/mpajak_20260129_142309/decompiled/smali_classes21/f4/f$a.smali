.class public final Lf4/f$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public b:Lf4/f;
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public c:Z
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public d:Lf4/v;

.field public e:J
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public f:[B
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public g:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field

.field public h:I
    .annotation build Lkotlin/jvm/JvmField;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lf4/f$a;->e:J

    const/4 v0, -0x1

    iput v0, p0, Lf4/f$a;->g:I

    iput v0, p0, Lf4/f$a;->h:I

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 13

    iget-object v0, p0, Lf4/f$a;->b:Lf4/f;

    if-eqz v0, :cond_8

    iget-boolean v1, p0, Lf4/f$a;->c:Z

    if-eqz v1, :cond_7

    iget-wide v1, v0, Lf4/f;->c:J

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    cmp-long v6, p1, v1

    if-gtz v6, :cond_4

    cmp-long v3, p1, v4

    if-ltz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_3

    sub-long v6, v1, p1

    :goto_1
    cmp-long v3, v6, v4

    if-lez v3, :cond_2

    iget-object v3, v0, Lf4/f;->b:Lf4/v;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, v3, Lf4/v;->g:Lf4/v;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v8, v3, Lf4/v;->c:I

    iget v9, v3, Lf4/v;->b:I

    sub-int v9, v8, v9

    int-to-long v9, v9

    cmp-long v11, v9, v6

    if-gtz v11, :cond_1

    invoke-virtual {v3}, Lf4/v;->a()Lf4/v;

    move-result-object v8

    iput-object v8, v0, Lf4/f;->b:Lf4/v;

    invoke-static {v3}, Lf4/w;->b(Lf4/v;)V

    sub-long/2addr v6, v9

    goto :goto_1

    :cond_1
    long-to-int v4, v6

    sub-int/2addr v8, v4

    iput v8, v3, Lf4/v;->c:I

    :cond_2
    const/4 v3, 0x0

    iput-object v3, p0, Lf4/f$a;->d:Lf4/v;

    iput-wide p1, p0, Lf4/f$a;->e:J

    iput-object v3, p0, Lf4/f$a;->f:[B

    const/4 v3, -0x1

    iput v3, p0, Lf4/f$a;->g:I

    iput v3, p0, Lf4/f$a;->h:I

    goto :goto_3

    :cond_3
    const-string v0, "newSize < 0: "

    invoke-static {v0, p1, p2}, Landroidx/activity/result/a;->d(Ljava/lang/String;J)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    if-lez v6, :cond_6

    sub-long v6, p1, v1

    const/4 v8, 0x1

    :goto_2
    cmp-long v9, v6, v4

    if-lez v9, :cond_6

    invoke-virtual {v0, v3}, Lf4/f;->w(I)Lf4/v;

    move-result-object v3

    iget v9, v3, Lf4/v;->c:I

    rsub-int v9, v9, 0x2000

    int-to-long v9, v9

    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    long-to-int v10, v9

    iget v9, v3, Lf4/v;->c:I

    add-int/2addr v9, v10

    iput v9, v3, Lf4/v;->c:I

    int-to-long v11, v10

    sub-long/2addr v6, v11

    if-eqz v8, :cond_5

    iput-object v3, p0, Lf4/f$a;->d:Lf4/v;

    iput-wide v1, p0, Lf4/f$a;->e:J

    iget-object v3, v3, Lf4/v;->a:[B

    iput-object v3, p0, Lf4/f$a;->f:[B

    sub-int v3, v9, v10

    iput v3, p0, Lf4/f$a;->g:I

    iput v9, p0, Lf4/f$a;->h:I

    const/4 v3, 0x0

    const/4 v8, 0x0

    :cond_5
    const/4 v3, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    iput-wide p1, v0, Lf4/f;->c:J

    return-wide v1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "resizeBuffer() only permitted for read/write buffers"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "not attached to a buffer"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(J)I
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget-object v3, v0, Lf4/f$a;->b:Lf4/f;

    if-eqz v3, :cond_a

    const/4 v4, -0x1

    int-to-long v5, v4

    cmp-long v7, v1, v5

    if-ltz v7, :cond_9

    iget-wide v5, v3, Lf4/f;->c:J

    cmp-long v7, v1, v5

    if-gtz v7, :cond_9

    const-wide/16 v7, -0x1

    cmp-long v9, v1, v7

    if-eqz v9, :cond_8

    cmp-long v7, v1, v5

    if-nez v7, :cond_0

    goto/16 :goto_3

    :cond_0
    const-wide/16 v7, 0x0

    iget-object v4, v3, Lf4/f;->b:Lf4/v;

    iget-object v9, v0, Lf4/f$a;->d:Lf4/v;

    if-eqz v9, :cond_2

    iget-wide v10, v0, Lf4/f$a;->e:J

    iget v12, v0, Lf4/f$a;->g:I

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v9, v9, Lf4/v;->b:I

    sub-int/2addr v12, v9

    int-to-long v12, v12

    sub-long/2addr v10, v12

    cmp-long v9, v10, v1

    if-lez v9, :cond_1

    iget-object v5, v0, Lf4/f$a;->d:Lf4/v;

    move-wide/from16 v18, v7

    move-object v7, v4

    move-object v4, v5

    move-wide v5, v10

    move-wide/from16 v10, v18

    goto :goto_0

    :cond_1
    iget-object v7, v0, Lf4/f$a;->d:Lf4/v;

    goto :goto_0

    :cond_2
    move-wide v10, v7

    move-object v7, v4

    :goto_0
    sub-long v8, v5, v1

    sub-long v12, v1, v10

    cmp-long v14, v8, v12

    if-lez v14, :cond_3

    :goto_1
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v4, v7, Lf4/v;->c:I

    iget v5, v7, Lf4/v;->b:I

    sub-int v6, v4, v5

    int-to-long v8, v6

    add-long/2addr v8, v10

    cmp-long v6, v1, v8

    if-ltz v6, :cond_5

    sub-int/2addr v4, v5

    int-to-long v4, v4

    add-long/2addr v10, v4

    iget-object v7, v7, Lf4/v;->f:Lf4/v;

    goto :goto_1

    :cond_3
    :goto_2
    cmp-long v7, v5, v1

    if-lez v7, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, v4, Lf4/v;->g:Lf4/v;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget v7, v4, Lf4/v;->c:I

    iget v8, v4, Lf4/v;->b:I

    sub-int/2addr v7, v8

    int-to-long v7, v7

    sub-long/2addr v5, v7

    goto :goto_2

    :cond_4
    move-object v7, v4

    move-wide v10, v5

    :cond_5
    iget-boolean v4, v0, Lf4/f$a;->c:Z

    if-eqz v4, :cond_7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-boolean v4, v7, Lf4/v;->d:Z

    if-eqz v4, :cond_7

    new-instance v4, Lf4/v;

    iget-object v5, v7, Lf4/v;->a:[B

    array-length v6, v5

    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v13

    const-string v5, "java.util.Arrays.copyOf(this, size)"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget v14, v7, Lf4/v;->b:I

    iget v15, v7, Lf4/v;->c:I

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object v12, v4

    invoke-direct/range {v12 .. v17}, Lf4/v;-><init>([BIIZZ)V

    iget-object v5, v3, Lf4/f;->b:Lf4/v;

    if-ne v5, v7, :cond_6

    iput-object v4, v3, Lf4/f;->b:Lf4/v;

    :cond_6
    invoke-virtual {v7, v4}, Lf4/v;->b(Lf4/v;)Lf4/v;

    iget-object v3, v4, Lf4/v;->g:Lf4/v;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lf4/v;->a()Lf4/v;

    move-object v7, v4

    :cond_7
    iput-object v7, v0, Lf4/f$a;->d:Lf4/v;

    iput-wide v1, v0, Lf4/f$a;->e:J

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, v7, Lf4/v;->a:[B

    iput-object v3, v0, Lf4/f$a;->f:[B

    iget v3, v7, Lf4/v;->b:I

    sub-long/2addr v1, v10

    long-to-int v2, v1

    add-int/2addr v3, v2

    iput v3, v0, Lf4/f$a;->g:I

    iget v1, v7, Lf4/v;->c:I

    iput v1, v0, Lf4/f$a;->h:I

    sub-int/2addr v1, v3

    return v1

    :cond_8
    :goto_3
    const/4 v3, 0x0

    iput-object v3, v0, Lf4/f$a;->d:Lf4/v;

    iput-wide v1, v0, Lf4/f$a;->e:J

    iput-object v3, v0, Lf4/f$a;->f:[B

    iput v4, v0, Lf4/f$a;->g:I

    iput v4, v0, Lf4/f$a;->h:I

    return v4

    :cond_9
    new-instance v4, Ljava/lang/ArrayIndexOutOfBoundsException;

    sget-object v5, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v6, v7

    const/4 v1, 0x1

    iget-wide v2, v3, Lf4/f;->c:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v6, v1

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    const-string v2, "offset=%s > size=%s"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "java.lang.String.format(format, *args)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v4

    :cond_a
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "not attached to a buffer"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lf4/f$a;->b:Lf4/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-object v0, p0, Lf4/f$a;->b:Lf4/f;

    iput-object v0, p0, Lf4/f$a;->d:Lf4/v;

    const-wide/16 v1, -0x1

    iput-wide v1, p0, Lf4/f$a;->e:J

    iput-object v0, p0, Lf4/f$a;->f:[B

    const/4 v0, -0x1

    iput v0, p0, Lf4/f$a;->g:I

    iput v0, p0, Lf4/f$a;->h:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "not attached to a buffer"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
